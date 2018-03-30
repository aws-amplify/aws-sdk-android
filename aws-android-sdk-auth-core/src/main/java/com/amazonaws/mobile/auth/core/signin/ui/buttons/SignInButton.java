/*
  * Copyright 2013-2017 Amazon.com, Inc. or its affiliates.
  * All Rights Reserved.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *     http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */

package com.amazonaws.mobile.auth.core.signin.ui.buttons;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.amazonaws.mobile.auth.core.R;

import static com.amazonaws.mobile.auth.core.signin.ui.DisplayUtils.dp;
import static com.amazonaws.mobile.auth.core.signin.ui.DisplayUtils.getRoundedRectangleBackground;

/**
 * Base class for Sign in Buttons
 */
public class SignInButton extends LinearLayout {
    /** Image left margin. */
    private static final int IMAGE_LEFT_MARGIN = dp(8);

    /** Image right margin. */
    private static final int IMAGE_RIGHT_MARGIN = dp(8);

    /** Text left margin. */
    private static final int TEXT_LEFT_MARGIN = dp(2);

    /** Text right margin. */
    private static final int TEXT_RIGHT_MARGIN = dp(8);

    /** Min text size in SP. */
    private static final float MIN_TEXT_SIZE_SP = 8;

    /** Max text size in pixels. */
    private static final float MAX_TEXT_SIZE_PX = dp(50);

    /** Color for the border. */
    private static final int BORDER_COLOR = 0xFF000000;

    /** Button Attributes. */
    private final SignInButtonAttributes attributes;

    /** Image View for displaying the Icon. */
    protected ImageView imageView;

    /** Text View for displaying the text */
    protected TextView textView;

    /** Bitmap for the icon. */
    protected Bitmap bitmap;

    /** Boolean to keep track of whether the button should only display the image and no text. */
    protected boolean isSmallStyle = false;

    public SignInButton(final Context context, final AttributeSet attrs,
                        final int defStyleAttr, final SignInButtonAttributes buttonAttributes) {
        super(context, attrs, defStyleAttr);
        this.attributes = buttonAttributes;
        setFocusable(true);
        setClickable(true);
        this.setOrientation(HORIZONTAL);
        this.setGravity(Gravity.CENTER_VERTICAL);
        this.setBackgroundDrawable(getBackgroundStatesDrawable());

        imageView = new ImageView(context);
        bitmap = BitmapFactory.decodeResource(getResources(), attributes.getImageIconResourceId());
        final BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
        imageView.setImageDrawable(bitmapDrawable);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setAdjustViewBounds(true);

        final LinearLayout.LayoutParams imageLayoutParams
            = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        imageLayoutParams.setMargins(IMAGE_LEFT_MARGIN, 0, IMAGE_RIGHT_MARGIN, 0);

        imageLayoutParams.weight = 0;
        this.addView(imageView, imageLayoutParams);

        textView = new TextView(context);
        textView.setTextColor(attributes.getTextColor());
        textView.setTypeface(null, Typeface.BOLD);
        textView.setSingleLine(true);
        textView.setGravity(Gravity.CENTER_VERTICAL); // Gravity.CENTER_HORIZONTAL
        final String buttonText;
        if (attrs != null) {
            // Get styled attributes for the button style and button text.
            final TypedArray styledAttributes = context.obtainStyledAttributes(attrs, R.styleable.SignInButton);
            if (styledAttributes.getInt(R.styleable.SignInButton_button_style, 0) > 0) {
                isSmallStyle = true;
            }
            buttonText = styledAttributes.getString(R.styleable.SignInButton_text);
            styledAttributes.recycle();
        } else {
            buttonText = null;
        }

        if (buttonText != null) {
            textView.setText(buttonText);
        } else {
            textView.setText(attributes.getDefaultTextResourceId());
        }

        final LinearLayout.LayoutParams textViewLayoutParams
            = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        textViewLayoutParams.setMargins(dp(TEXT_LEFT_MARGIN), 0, dp(TEXT_RIGHT_MARGIN), 0);

        // Use layout weight so the text view will take up the available space in the view.
        textViewLayoutParams.weight = 1;
        this.addView(textView, textViewLayoutParams);

        updateStyle();
        invalidate();
    }

    /**
     * Create the button background.
     * @param buttonFaceColor the color for the button.
     * @return the background drawable.
     */
    private Drawable getButtonBackground(final int buttonFaceColor) {
        final int cornerRadius = attributes.getCornerRadius();
        // Set Button shape and background color.
        final ShapeDrawable insetBackgroundDrawable =
            getRoundedRectangleBackground(cornerRadius, buttonFaceColor);

        // Top Shadow for Button.
        final GradientDrawable outerShadowTopDrawable = new GradientDrawable(
            GradientDrawable.Orientation.LEFT_RIGHT,
            new int[]{attributes.getTopShadowColor(), attributes.getTopShadowColor()});
        outerShadowTopDrawable.setCornerRadius(dp(cornerRadius));

        // Bottom Shadow for Button.
        final GradientDrawable outerShadowBottomDrawable = new GradientDrawable(
            GradientDrawable.Orientation.LEFT_RIGHT, new int[]{
            attributes.getBottomShadowColor(), attributes.getBottomShadowColor()});
        outerShadowBottomDrawable.setCornerRadius(dp(cornerRadius));

        final LayerDrawable layerDrawable = new LayerDrawable(
            new Drawable[] {outerShadowTopDrawable,
                            outerShadowBottomDrawable,
                            insetBackgroundDrawable});

        // Top shadow is the furthest down drawable, so it is ok if this overlaps the bottom shadow.
        layerDrawable.setLayerInset(0, 0, 0, 0, 0);
        
        // Bottom shadow does not overlap the top shadow.
        layerDrawable.setLayerInset(1, attributes.getTopShadowThickness(), attributes.getTopShadowThickness(), 0, 0);
        
        // Background must not overlap either of the shadows.
        layerDrawable.setLayerInset(2, attributes.getTopShadowThickness(), attributes.getTopShadowThickness(),
            attributes.getBottomShadowThickness(), attributes.getBottomShadowThickness());

        return layerDrawable;
    }

    /**
     * @return the button background drawable states for when pressed and not pressed.
     */
    private Drawable getBackgroundStatesDrawable() {
        final StateListDrawable states = new StateListDrawable();
        states.addState(new int[] {android.R.attr.state_pressed},
            getButtonBackground(attributes.getBackgroundColorPressed()));
        states.addState(new int[] {},
            getButtonBackground(attributes.getBackgroundColor()));
        return states;
    }

    private void updateStyle() {
        if (isSmallStyle) {
            textView.setVisibility(GONE);
            this.setGravity(Gravity.CENTER);
        } else {
            textView.setVisibility(VISIBLE);
            this.setGravity(Gravity.CENTER_VERTICAL);
        }
    }

    /**
     * Sets the button style to small, where only the icon will be shown.
     * @param shouldSetStyleSmall true if style should be small, otherwise false.
     */
    public void setSmallStyle(final boolean shouldSetStyleSmall) {
        isSmallStyle = shouldSetStyleSmall;
        updateStyle();
    }

    /**
     * Set the button text.
     * @param text the text string.
     */
    public void setButtonText(final String text) {
        textView.setText(text);
        resizeButtonText();
    }

    /**
     * Set the button text from a resource.
     * @param resId the resource id containing a string.
     */
    public void setButtonText(final int resId) {
        textView.setText(resId);
        resizeButtonText();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int sideSize = (int)(getMeasuredHeight() * 0.72);
        if (sideSize > bitmap.getHeight()) {
            sideSize = bitmap.getHeight();
        }

        // Set image to a square based on the desired height.
        layoutParams.height = sideSize;
        layoutParams.width = sideSize;
    }

    private boolean doesTextViewFit(final float suggestedSize, final RectF availableRect) {
        final TextPaint textPaint = new TextPaint(textView.getPaint());
        textPaint.setTextSize(suggestedSize);
        final TransformationMethod transformMethod = textView.getTransformationMethod();
        final String text = (transformMethod == null) ? textView.getText().toString()
            : transformMethod.getTransformation(textView.getText(), textView).toString();

        final RectF textRect = new RectF(0, 0, textPaint.measureText(text), textPaint.getFontSpacing());

        // Return true if the text view fits, even though it may have extra space.
        return availableRect.contains(textRect);
    }

    private float findBestSize(final float start, final float end, final RectF availableSpace) {
        float low = start;
        float high = end;
        float midpoint;
        float bestFit = low;
        // Binary search to find the best size.
        while (low <= high) {
            midpoint = (low + high) / 2;
            if (doesTextViewFit(midpoint, availableSpace)) {
                bestFit = midpoint;
                low = midpoint + 0.5f;
            } else {
                high = midpoint - 0.5f;
            }
        }
        return bestFit;
    }

    /**
     * Resize the text to the best fit.
     */
    private void resizeButtonText() {
        if (getMeasuredWidth() == 0 || isSmallStyle) {
            return;
        }

        final float minTextSize = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, MIN_TEXT_SIZE_SP,
            getResources().getDisplayMetrics());
        final RectF availableSpaceRect = new RectF();
        availableSpaceRect.right = textView.getMeasuredWidth() - textView.getCompoundPaddingLeft()
            - textView.getCompoundPaddingRight();
        availableSpaceRect.bottom = textView.getMeasuredHeight() - textView.getCompoundPaddingBottom()
            - textView.getCompoundPaddingTop();

        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX,
            findBestSize(minTextSize, MAX_TEXT_SIZE_PX, availableSpaceRect));
    }

    @Override
    protected void onSizeChanged(final int width, final int height, final int oldwidth, final int oldheight) {
        super.onSizeChanged(width, height, oldwidth, oldheight);
        if (width != oldwidth || height != oldheight)
            resizeButtonText();
    }
}
