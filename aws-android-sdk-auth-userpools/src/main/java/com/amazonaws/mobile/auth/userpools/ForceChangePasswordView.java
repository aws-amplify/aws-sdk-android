/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates.
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

package com.amazonaws.mobile.auth.userpools;


import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.text.InputType;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.amazonaws.mobile.auth.core.signin.ui.BackgroundDrawable;
import com.amazonaws.mobile.auth.core.signin.ui.DisplayUtils;
import com.amazonaws.mobile.auth.core.signin.ui.SplitBackgroundDrawable;

import static com.amazonaws.mobile.auth.userpools.UserPoolFormConstants.FORM_BUTTON_COLOR;
import static com.amazonaws.mobile.auth.userpools.UserPoolFormConstants.FORM_BUTTON_CORNER_RADIUS;
import static com.amazonaws.mobile.auth.userpools.UserPoolFormConstants.FORM_SIDE_MARGIN_RATIO;
import static com.amazonaws.mobile.auth.userpools.UserPoolFormConstants.MAX_FORM_WIDTH_IN_PIXELS;

/**
 * This view present the ForgotPassword screen for the user to reset the
 * password.
 */
public class ForceChangePasswordView extends LinearLayout {

    /** Log tag. */
    private static final String LOG_TAG = ForgotPasswordView.class.getSimpleName();

    private FormView forceChangePassForm;
    private EditText passwordEditText;
    private Button confirmButton;

    private SplitBackgroundDrawable splitBackgroundDrawable;
    private BackgroundDrawable backgroundDrawable;
    private String fontFamily;
    private boolean fullScreenBackgroundColor;
    private Typeface typeFace;
    private int backgroundColor;

    /**
     * Constructs the ForgotPassword View.
     * @param context The activity context.
     */
    public ForceChangePasswordView(final Context context) {
        this(context, null);
    }

    /**
     * Constructs the ForgotPassword View.
     * @param context The activity context.
     * @param attrs The Attribute Set for the view from which the resources can be accessed.
     */
    public ForceChangePasswordView(final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, 0);
    }

    /**
     * Constructs the ForgotPassword View.
     * @param context The activity context.
     * @param attrs The Attribute Set for the view from which the resources can be accessed.
     * @param defStyleAttr The resource identifier for the default style attribute.
     */
    public ForceChangePasswordView(final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOrientation(VERTICAL);

        final int backgroundColor;
        if (isInEditMode()) {
            backgroundColor = Color.DKGRAY;
        } else {
            final TypedArray styledAttributes = context.obtainStyledAttributes(attrs, R.styleable.ForgotPasswordView);
            backgroundColor = styledAttributes.getInt(R.styleable.ForgotPasswordView_forgotPasswordViewBackgroundColor,
                    Color.DKGRAY);
            styledAttributes.recycle();
        }

        this.fontFamily = CognitoUserPoolsSignInProvider.getFontFamily();
        this.typeFace = Typeface.create(this.fontFamily, Typeface.NORMAL);
        this.fullScreenBackgroundColor = CognitoUserPoolsSignInProvider.isBackgroundColorFullScreen();
        this.backgroundColor = CognitoUserPoolsSignInProvider.getBackgroundColor();

        if (fullScreenBackgroundColor) {
            this.backgroundDrawable = new BackgroundDrawable(this.backgroundColor);
        } else {
            this.splitBackgroundDrawable = new SplitBackgroundDrawable(0, this.backgroundColor);
        }
    }

    private void setupFontFamily() {
        if (this.typeFace != null) {
            Log.d(LOG_TAG, "Setup font in ForceChangePasswordView: " + this.fontFamily);
            passwordEditText.setTypeface(this.typeFace);
        }
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        forceChangePassForm = (FormView) findViewById(R.id.force_change_password_form);

        passwordEditText = forceChangePassForm.addFormField(getContext(),
                InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD,
                getContext().getString(R.string.sign_in_password));

        setupConfirmButtonColor();
        setupFontFamily();
    }

    private void setupConfirmButtonColor() {
        confirmButton = (Button) findViewById(R.id.force_change_password_button);
        confirmButton.setBackgroundDrawable(DisplayUtils.getRoundedRectangleBackground(
                FORM_BUTTON_CORNER_RADIUS, FORM_BUTTON_COLOR));
        LayoutParams signUpButtonLayoutParams = (LayoutParams) confirmButton.getLayoutParams();
        signUpButtonLayoutParams.setMargins(
                forceChangePassForm.getFormShadowMargin(),
                signUpButtonLayoutParams.topMargin,
                forceChangePassForm.getFormShadowMargin(),
                signUpButtonLayoutParams.bottomMargin);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        final int parentWidth = MeasureSpec.getSize(widthMeasureSpec);
        final int maxWidth = Math.min((int)(parentWidth * FORM_SIDE_MARGIN_RATIO), MAX_FORM_WIDTH_IN_PIXELS);
        super.onMeasure(MeasureSpec.makeMeasureSpec(maxWidth, MeasureSpec.AT_MOST), heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        setupBackground();
    }

    private void setupBackground() {
        if (!this.fullScreenBackgroundColor) {
            splitBackgroundDrawable.setSplitPointDistanceFromTop(forceChangePassForm.getTop()
                    + (forceChangePassForm.getMeasuredHeight()/2));
            ((ViewGroup) getParent()).setBackgroundDrawable(splitBackgroundDrawable);
        } else {
            ((ViewGroup) getParent()).setBackgroundDrawable(backgroundDrawable);
        }
    }

    public String getPassword() {
        return passwordEditText.getText().toString();
    }
}
