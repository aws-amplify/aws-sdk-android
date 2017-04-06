/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.lex.interactionkit.ui;


import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.LinearInterpolator;

import com.amazonaws.mobileconnectors.lex.interactionkit.Response;
import com.amazonaws.mobileconnectors.lex.interactionkit.exceptions.InvalidParameterException;
import com.amazonaws.services.lex.R;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class InteractiveVoiceView extends View {

    private static final String TAG = "Lex";
    private InteractiveVoiceViewAdapter viewAdapter;
    private InteractiveVoiceListener listener;

    // Widget states.
    private static final int NORMAL = 0;
    private static final int LISTENING = 1;
    private static final int AWAITING_RESPONSE = 2;
    /**
     * Transitioning from TALKING TO LISTENING.
     */
    private static final int TRANSITION_TO_LISTENING = 3;
    /**
     * Transitioning from LISTENING to TALKING.
     */
    private static final int TRANSITION_TO_TALKING = 4;
    /**
     * Lex is talking.
     */
    private static final int TALKING = 5;

    // Default boundary sizes of the.
    private static final int BIB_INT_DP = 32;

    // Wait animation arc angle in degrees.
    private static final float ARC_LEN_ANGLE = 52.51f;

    // Period for the wait spinner arc to complete one revolution.
    private static final int ARC_PERIOD_SEC = 2;

    private static final float GOLDEN_RATIO = 1.809f;

    // Default colors.
    private static final int DEFAULT_COLOR_BUTTON_BACKGROUND = Color.parseColor("#FFFFFF");
    private static final int DEFAULT_COLOR_BUTTON_BOUNDARY = Color.parseColor("#8D9496");
    private static final int DEFAULT_COLOR_TINT_NORMAL = Color.parseColor("#329AD6");
    private static final int DEFAULT_COLOR_TINT_LISTENING = Color.parseColor("#2A5C91");
    private static final int DEFAULT_COLOR_TINT_TALKING = Color.parseColor("#4383c4");
    private static final int DEFAULT_COLOR_TINT_WAITING = Color.parseColor("#8D9496");
    private static final int DEFAULT_COLOR_ANIMATED_CIRCLE = Color.parseColor("#4EA9DC");
    private static final int DEFAULT_COLOR_ANIMATED_RING = Color.parseColor("#2A5C91");

    // Animation colors.
    private int mIconColorNormal;
    private int mIconColorListening;
    private int mIconColorTalking;
    private int mIconColorWaiting;
    private int mButtonBoundaryColor;

    // Application context.
    private final Context context;

    // Bitmaps to store button icons.
    BitmapDrawable bitmapDrawableMicrophoneIcon;
    BitmapDrawable bitmapDrawableLexIcon;

    // Boundary for animated wait arc.
    private RectF oval;
    Drawable mDrawable;
    private int canvasWidth;
    private int canvasHeight;

    // Color and styles for animation.
    private Paint mPaintAnimationListening;
    private Paint mPaintAnimationWaiting;
    private Paint mPaintButtonBackground;
    private Paint mPaintButtonBoundary;


    // Animation sequence.
    private AnimatorSet mAnimatorSet;

    // Animators for wait.
    private ValueAnimator mValueAnimator;

    // Animator for switching image between Lex and Microphone.
    private PushTransitionAnimator pushTransitionAnimator;
    private boolean animateOnImageSwitching;

    // Current widget state.
    private int state = NORMAL;

    // View boundary's.
    private float mAnimationRadiusPix;
    private float mButtonRadiusPix;
    private float mCurrentRadiusPix;
    private float mCurrentStrokePix;
    private float mCurrentArcPosition;
    private int mAnimationGapPix;

    public InteractiveVoiceView(Context context) {
        super(context);
        this.context = context;
        init();
    }

    public InteractiveVoiceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();
    }

    /**
     * Initializes this view. Sets all components.
     */
    private void init() {
        mAnimatorSet = new AnimatorSet();

        mIconColorNormal = DEFAULT_COLOR_TINT_NORMAL;
        mIconColorWaiting = DEFAULT_COLOR_TINT_WAITING;
        mIconColorListening = DEFAULT_COLOR_TINT_LISTENING;
        mIconColorTalking = DEFAULT_COLOR_TINT_TALKING;
        mButtonBoundaryColor = DEFAULT_COLOR_BUTTON_BOUNDARY;

        // Set image bitmaps for normal and listening states.

        // Create microphone
        bitmapDrawableMicrophoneIcon = new BitmapDrawable(
                getResources(),
                BitmapFactory.decodeResource(getResources(), R.drawable.mic)
        );
        bitmapDrawableLexIcon = new BitmapDrawable(
                getResources(),
                BitmapFactory.decodeResource(getResources(), R.drawable.lex_speak)
        );

        // Color and style for animated components.
        mPaintAnimationListening = new Paint();
        mPaintAnimationListening.setAntiAlias(true);
        mPaintAnimationListening.setColor(DEFAULT_COLOR_ANIMATED_CIRCLE);

        mPaintAnimationWaiting = new Paint();
        mPaintAnimationWaiting.setAntiAlias(true);
        mPaintAnimationWaiting.setColor(DEFAULT_COLOR_ANIMATED_RING);
        mCurrentStrokePix = 20.0f;
        mPaintAnimationWaiting.setStrokeWidth(mCurrentStrokePix);

        mPaintButtonBackground = new Paint();
        mPaintButtonBackground.setAntiAlias(true);
        mPaintButtonBackground.setStrokeWidth(5);
        mPaintButtonBackground.setColor(DEFAULT_COLOR_BUTTON_BACKGROUND);

        mPaintButtonBoundary = new Paint();
        mPaintButtonBoundary.setAntiAlias(true);
        mPaintButtonBoundary.setStrokeWidth(3);
        mPaintButtonBoundary.setStyle(Paint.Style.STROKE);
        mPaintButtonBoundary.setColor(mButtonBoundaryColor);

        // Minimum radius in pixels.
        mButtonRadiusPix = dip2pix(BIB_INT_DP) / 2;
        mCurrentRadiusPix = mButtonRadiusPix;

        // Bounds for the wait display ring.
        oval = new RectF();
        mCurrentArcPosition = 0f;

        // Set client adapter.
        viewAdapter = InteractiveVoiceViewAdapter.getInstance(context, this);

        // Set current state as normal and draw this view.
        state = NORMAL;
        invalidate();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mAnimationRadiusPix = Math.min(w, h) / 2;
        mAnimationGapPix = Math.round(mAnimationRadiusPix / GOLDEN_RATIO);
        mButtonRadiusPix = mAnimationRadiusPix - mAnimationGapPix;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvasWidth = canvas.getWidth();
        canvasHeight = canvas.getHeight();
        final Rect bounds = canvas.getClipBounds();
        Rect calculatedBounds = calculateButtonBounds(bounds);

        int buttonColor = mIconColorNormal;
        BitmapDrawable bitmapDrawableIcon = bitmapDrawableMicrophoneIcon;

        switch (state) {
            case TRANSITION_TO_LISTENING:
            case LISTENING:
                if (state != TRANSITION_TO_LISTENING) {
                    if (mCurrentRadiusPix > mButtonRadiusPix) {
                        // Draw circle to animate voice.
                        canvas.drawCircle(canvasWidth / 2, canvasHeight / 2, mCurrentRadiusPix, mPaintAnimationListening);
                    }
                }

                drawButtonShape(calculatedBounds, canvas);
                buttonColor = mIconColorListening;
                break;
            case TALKING:
                buttonColor = mIconColorTalking;
                bitmapDrawableIcon = bitmapDrawableLexIcon;
                drawButtonShape(calculatedBounds, canvas);
                break;
            case TRANSITION_TO_TALKING:
                buttonColor = mIconColorWaiting;
            case NORMAL:
                drawButtonShape(calculatedBounds, canvas);
                break;
            case AWAITING_RESPONSE:
                // Animate circular wait indicator.
                drawButtonShape(calculatedBounds, canvas);
                canvas.drawArc(oval, mCurrentArcPosition, ARC_LEN_ANGLE, false, mPaintAnimationWaiting);
                buttonColor = mIconColorWaiting;
                break;
        }

        // Clip so that the image does not get rendered beyond the boundary.
        canvas.clipRect(calculatedBounds);

        if (pushTransitionAnimator != null) {
            float offsetY = pushTransitionAnimator.animatedFraction * calculatedBounds.height();
            calculatedBounds.top += offsetY;
            calculatedBounds.bottom += offsetY;
        }

        // Draw the button icon.
        bitmapDrawableIcon.setBounds(calculatedBounds);
        mDrawable = bitmapDrawableIcon.mutate();
        mDrawable.setColorFilter(buttonColor, PorterDuff.Mode.SRC_ATOP);
        mDrawable.draw(canvas);
    }

    void animateListening() {
        animateImageSwitch(new ActionHandler() {
            @Override
            public void handle() {
                state = TRANSITION_TO_LISTENING;
            }
        });
    }

    void animateAudioPlayback() {
        state = TRANSITION_TO_TALKING;
        animateImageSwitch(new ActionHandler() {
            @Override
            public void handle() {
                state = TALKING;
            }
        });
    }

    /**
     * Animates sound by modulating radius of a displayed circle. This animation just performs one
     * raise and fall of the circle (radius).
     * @param soundLevel
     */
    public void animateSoundLevel(float soundLevel) {
        // Ignore if push transition animation is running.
        if (pushTransitionAnimator == null || !pushTransitionAnimator.isRunning()) {
            reset();
            state = LISTENING;
            final float radius = soundlevel2radius(soundLevel);
            mAnimatorSet.playSequentially(
                    ObjectAnimator.ofFloat(this, "CurrentRadius", getCurrentRadius(), radius).setDuration(20),
                    ObjectAnimator.ofFloat(this, "CurrentRadius", radius, mButtonRadiusPix).setDuration(400)
            );
            mAnimatorSet.start();
        }
    }

    /**
     * Start wait spinner animation. {@link InteractiveVoiceView#ARC_PERIOD_SEC} represents the
     * period for the spinner arc to complete one revolution. This animation is continued indefinitely,
     * until the animation stopped - {@link InteractiveVoiceView#animateNone()}.
     */
    public void animateWaitSpinner() {
        reset();
        state = AWAITING_RESPONSE;
        mValueAnimator = ValueAnimator.ofFloat(0f, 1f);
        mValueAnimator.setDuration(TimeUnit.SECONDS.toMillis(ARC_PERIOD_SEC));
        mValueAnimator.setRepeatCount(ValueAnimator.INFINITE);
        mValueAnimator.setRepeatMode(ValueAnimator.RESTART);
        mValueAnimator.setInterpolator(new LinearInterpolator());
        mValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                setCurrentAngle((Float) animation.getAnimatedValue());
            }
        });
        mValueAnimator.start();
        invalidate();
    }

    /**
     * Start slide-out-up and in-up animation for image switching between Lex and microphone.
     */
    private void animateImageSwitch(final ActionHandler handler) {
        reset();
        if (animateOnImageSwitching) {
            pushTransitionAnimator = new PushTransitionAnimator(handler);
            pushTransitionAnimator.start();
        } else {
            handler.handle();
            // invalidate() gets called during the animation inside the animator class.
            // Since the animation is disabled, we would need to call to repaint here.
            invalidate();
        }
    }

    /**
     * Stop current, if any, animation and change the button state to normal state.
     */
    public void animateNone() {
        reset();
        state = NORMAL;
        invalidate();
    }

    /**
     * Returns current radius of the voice animation circle.
     * @return current radius for the animated circle.
     */
    public final float getCurrentRadius() {
        return mCurrentRadiusPix;
    }

    /**
     * Sets new radius for voice animation and requests for a new drawing.
     * @param radius the new radius for voice animation.
     */
    public final void setCurrentRadius(float radius) {
        mCurrentRadiusPix = radius;
        invalidate();
    }

    /**
     * Sets new position of the arc, for wait animation.
     * @param currentAngle a fraction between 0 and 1.
     */
    private void setCurrentAngle(float currentAngle) {
        // Move arc to a new position and request a new draw.
        mCurrentArcPosition = 360 * currentAngle;
        invalidate();
    }

    /**
     * Stops current animation and prepares the widget for a new drawing.
     */
    private void reset() {
        if (pushTransitionAnimator != null) {
            pushTransitionAnimator.reset();
        }

        if (mAnimatorSet != null && mAnimatorSet.isRunning()) {
            mAnimatorSet.cancel();
        }

        if (mValueAnimator != null && mValueAnimator.isRunning()) {
            mValueAnimator.cancel();
        }
        mCurrentArcPosition = 0f;
    }

    /**
     * Converts density-independent pixel value to pixels.
     * @param sizeInDp size as density-independent pixel.
     * @return size in pixels.
     */
    private int dip2pix(int sizeInDp){
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, sizeInDp, context.getResources().getDisplayMetrics());
    }

    /**
     * Calculates bounds for the button boundary. {@link InteractiveVoiceView#mAnimationRadiusPix}
     * represents the radius of the largest circle to drawn in the current view. This area should
     * encapsulates the button and the sound animation. The region to draw the button boundary is a
     * concentric inner circle. This method calculates the bounds for this inner circle.
     * @param bounds the complete drawable area.
     * @return bounds for the button boundary.
     */
    private Rect calculateButtonBounds(Rect bounds){
        return new Rect(
                bounds.left + mAnimationGapPix,
                bounds.top + mAnimationGapPix,
                bounds.right - mAnimationGapPix,
                bounds.bottom - mAnimationGapPix);
    }

    /**
     * Draw the button boundary and background.
     * @param bounds the complete drawable area.
     * @param canvas bounds for the button boundary.
     */
    private void drawButtonShape(Rect bounds, Canvas canvas) {
        oval.set(bounds);
        canvas.drawArc(oval, 0, 360, false, mPaintButtonBackground);
        canvas.drawArc(oval, 0, 360, false, mPaintButtonBoundary);
    }

    /**
     * Converts the current rms value of sound to radius. This implementation assumes RMS value in
     * the {@code soundLevel} and performs linear translation.
     * <b>Override this method for custom implementation.</b>
     * @param soundLevel sound level.
     * @return radius.
     */
    protected float soundlevel2radius(float soundLevel) {
        // rms values are between -2 to 2 so we baseline it to 0 return a value
        // between 0 and 1.
        final float calculatedRadius = (soundLevel + 2) * mAnimationRadiusPix / 4;
        if (calculatedRadius <= mButtonRadiusPix) {
            return  mButtonRadiusPix;
        } else if (calculatedRadius >= mAnimationRadiusPix) {
            return mAnimationRadiusPix;
        }
        return calculatedRadius;
    }

    /**
     * Set interaction listener for this view.
     * @param listener
     */
    public void setInteractiveVoiceListener(InteractiveVoiceListener listener) {
        this.listener = listener;
        viewAdapter.setVoiceListener(listener);
    }

    /**
     * Returns view adapter.
     * @return The adapter set for this object.
     */
    public InteractiveVoiceViewAdapter getViewAdapter() {
        return this.viewAdapter;
    }

    /**
     * Sets the color of the animation for audio input from device's microphone.
     * @param color The int value of the color.
     */
    public void setColorVoiceAnimation(String color) {
        mPaintAnimationListening.setColor(getColor(color));
    }

    /**
     * Sets the color of the animation for audio input from device's microphone.
     * @param color The hex-decimal color code as a string, e.g. "#FFFFFF".
     */
    public void setColorWaitSpinner(String color) {
        mPaintAnimationWaiting.setColor(getColor(color));
    }

    /**
     * Sets the color of the circle representing the button boundary.
     * @param color The hex-decimal color code as a string, e.g. "#FFFFFF".
     */
    public void setDefaultColorButtonBoundary(String color) {
        mPaintButtonBoundary.setColor(getColor(color));
    }

    /**
     * Sets the color of the button icon for normal state.
     * @param color The hex-decimal color code as a string, e.g. "#FFFFFF".
     */
    public void setColorIconNormal(String color) {
        mIconColorNormal = getColor(color);
    }

    /**
     * Sets the color of the button icon when listening for speech.
     * @param color The hex-decimal color code as a string, e.g. "#FFFFFF".
     */
    public void setColorIconListening(String color) {
        mIconColorListening = getColor(color);
    }

    /**
     * Sets the color of the button icon when Lex is talking.
     * @param color The hex-decimal color code as a string, e.g. "#FFFFFF".
     */
    public void setColorIconTalking(String color) {
        mIconColorTalking = getColor(color);
    }

    /**
     * Sets the color of the button icon when the client is waiting for response
     * from Amazon Lex bot.
     *
     * @param color The hex-decimal color code as a string, e.g. "#FFFFFF".
     */
    public void setColorIconAwaitingResponse(String color) {
        mIconColorWaiting = getColor(color);
    }

    /**
     * Set the animation flag for switching image between microphone and bot.
     * By default, the flag is false.
     * @param animate true to activate animation otherwise false.
     */
    public void setAnimateOnImageSwitching(boolean animate) {
        animateOnImageSwitching = animate;
    }
    /**
     * Returns the int value of the hex-decimal color.
     * @param color The hex-decimal color code as a string, e.g. "#FFFFFF".
     * @return The int value of the supplied color.
     */
    private int getColor(String color) {
        try {
            return Color.parseColor(color);
        } catch (final Exception e) {
            throw new InvalidParameterException("Error invalid color: " + color, e);
        }
    }

    /**
     * Implement this listener to interact with the Amazon Lex bots.
     */
    public interface InteractiveVoiceListener {
        /**
         * Called when the dialog is complete and is ready for client side
         * fulfillment.
         *
         * @param slots This contains the slots gathered by the Amazon Lex bot
         *            in the dialog.
         * @param intent This is the intent identified by the Amazon Lex bot,
         *            from the dialog.
         */
        void dialogReadyForFulfillment(Map<String, String> slots, String intent);

        /**
         * Called on receiving response from the Amazon Lex bot.
         *
         * @param response The response from the Amazon Lex bot.
         */
        void onResponse(Response response);

        /**
         * Called on encountering errors during a dialog.
         *
         * @param responseText The response from the Amazon Lex bot as text.
         * @param e The exception for the error.
         */
        void onError(String responseText, Exception e);
    }

    /**
     * Animator for image switching between microphone and bot.
     */
    private class PushTransitionAnimator {

        /**
         * Constant for animatedFraction property.
         */
        static final String ANIMATED_FRACTION_PROPERTY_NAME = "animatedFraction";

        /**
         * Constant for initial value that is used by animatedFraction for both slideIn and slideOut push transition.
         */
        static final float ANIMATED_FRACTION_INITIAL_PROPERTY_VALUE = 0.0f;

        /**
         * The duration for whole animation.
         * We want to use approximately 0.25 second to provide a better visual indication
         * so that user does not speak too early.
         */
        static final long ANIMATION_DURATION = 250 / 2;
        ObjectAnimator slideOutAnimator;
        ObjectAnimator slideInAnimator;
        ActionHandler handler;
        /**
         * The elapsed fraction of the push animation,
         * range from 0.0 to 1.0 for slideIn and -1.0 to 0.0 for slideOut animation.
         */
        float animatedFraction;
        boolean isRunning;

        PushTransitionAnimator(ActionHandler handler) {
            this.handler = handler;
        }

        void start() {
            isRunning = true;
            // Move image out toward top.
            slideOutAnimator = ObjectAnimator.
                    ofFloat(this, ANIMATED_FRACTION_PROPERTY_NAME, -1.0f).
                    setDuration(ANIMATION_DURATION);
            slideOutAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    super.onAnimationEnd(animation);
                    handler.handle();
                    // Move image from bottom.
                    slideInAnimator = ObjectAnimator
                            .ofFloat(PushTransitionAnimator.this, ANIMATED_FRACTION_PROPERTY_NAME, 1.0f, 0.0f)
                            .setDuration(ANIMATION_DURATION);
                    slideInAnimator.start();
                    slideInAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animation) {
                            super.onAnimationEnd(animation);
                            isRunning = false;
                        }
                    });
                }
            });
            slideOutAnimator.start();
        }

        void setAnimatedFraction(float y) {
            animatedFraction = y;
            InteractiveVoiceView.this.invalidate();
        }

        void reset() {
            if (slideOutAnimator != null && slideOutAnimator.isRunning()) {
                slideOutAnimator.cancel();
            }
            if (slideInAnimator != null && slideInAnimator.isRunning()) {
                slideInAnimator.cancel();
            }
            animatedFraction = ANIMATED_FRACTION_INITIAL_PROPERTY_VALUE;
            isRunning = false;
        }

        boolean isRunning() {
            return isRunning;
        }

    }

    /**
     * Naive action handler.
     */
    private interface ActionHandler {
        void handle();
    }

}
