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

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.text.InputType;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.amazonaws.mobile.auth.core.signin.SignInManager;
import static com.amazonaws.mobile.auth.core.signin.ui.DisplayUtils.dp;
import static com.amazonaws.mobile.auth.core.signin.ui.DisplayUtils.getRoundedRectangleBackground;

import com.amazonaws.mobile.auth.userpools.R;
import static com.amazonaws.mobile.auth.userpools.UserPoolFormConstants.FORM_BUTTON_COLOR;
import static com.amazonaws.mobile.auth.userpools.UserPoolFormConstants.FORM_BUTTON_CORNER_RADIUS;
import static com.amazonaws.mobile.auth.userpools.UserPoolFormConstants.FORM_SIDE_MARGIN_RATIO;
import static com.amazonaws.mobile.auth.userpools.UserPoolFormConstants.MAX_FORM_WIDTH_IN_PIXELS;

/**
 * User Pools Sign-in Control. This view presents a form to handle user sign-in.
 * It also presents choices for creating a new account or retrieving a forgotten password.
 */
public class UserPoolSignInView extends LinearLayout {

    /** Log tag. */
    private static final String LOG_TAG = UserPoolSignInView.class.getSimpleName();

    /** Create Account Text View */
    private TextView signUpTextView;

    /** Forgot Password Text View */
    private TextView forgotPasswordTextView;

    /** The credentials form that styles the username and password fields. */
    private FormView credentialsFormView;

    /** The Username field. */
    private EditText userNameEditText;

    /** The Password field. */
    private EditText passwordEditText;

    /** The sign in button. */
    private Button signInButton;

    /** Flag for whether the control has been intitialized. */
    private boolean isInitialized;

    /** Background Color. */
    private int backgroundColor;

    /** Default Background color used by the views. */
    private static final int DEFAULT_BACKGROUND_COLOR = Color.DKGRAY;

    /** Font family. */
    private String fontFamily;

    /** Typeface for font family. */
    private boolean isBackgroundColorFullScreenEnabled;

    public UserPoolSignInView(final Context context) {
        this(context, null);
    }

    public UserPoolSignInView(final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public UserPoolSignInView(final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setOrientation(VERTICAL);
        this.setGravity(Gravity.CENTER);
        this.setId(R.id.user_pool_sign_in_view_id);

        setupCredentialsForm(context);
        setupSignInButton(context);
        setupLayoutForSignUpAndForgotPassword(context);
        setupFontFamily((Activity) context);
        setupBackgroundColor((Activity) context);
        setupBackgroundColorFullScreen((Activity) context);
    }

    private void initializeIfNecessary() {
        if (isInitialized) {
            return;
        }
        isInitialized = true;

        if (isInEditMode()) {
            return;
        }

        try {
            final SignInManager signInManager = SignInManager.getInstance();
            signInManager.initializeSignInButton(CognitoUserPoolsSignInProvider.class, signInButton);
        } catch (final Exception exception) {
            Log.e(LOG_TAG, "Cannot initialize the SignInButton. Please check if IdentityManager :" +
                              " startUpAuth and setUpToAuthenticate are invoked", exception);
        }
    }

    private void setupCredentialsForm(final Context context) {
        credentialsFormView = new FormView(context);
        final LinearLayout.LayoutParams formViewLayoutParams
            = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);

        userNameEditText = credentialsFormView.addFormField(context,
            InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS,
            // User Pools requires sign in with the username or verified channel.
            // Mobile Hub does not set up email verification because it requires SES verification.
            // Hence, prompt customers to login using the username or phone number.
            context.getString(R.string.sign_in_username));

        passwordEditText = credentialsFormView.addFormField(context,
            InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD,
            context.getString(R.string.sign_in_password));

        this.addView(credentialsFormView, formViewLayoutParams);
    }

    private void setupSignInButton(final Context context) {
        signInButton = new Button(context);
        signInButton.setTextColor(Color.WHITE);
        signInButton.setText(context.getString(R.string.sign_in_button_text));
        signInButton.setAllCaps(false);
        signInButton.setBackgroundDrawable(
            getRoundedRectangleBackground(FORM_BUTTON_CORNER_RADIUS, FORM_BUTTON_COLOR));

        final Resources resources = getResources();
        final LinearLayout.LayoutParams signInButtonLayoutParams = new LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            resources.getDimensionPixelSize(R.dimen.sign_in_button_height));
        final int signInButtonMarginTopBottom
            = resources.getDimensionPixelSize(R.dimen.user_pools_sign_in_button_margin_top_bottom);
        signInButtonLayoutParams.setMargins(
            credentialsFormView.getFormShadowMargin(),
            signInButtonMarginTopBottom + credentialsFormView.getFormShadowMargin(),
            credentialsFormView.getFormShadowMargin(),
            0);
        this.addView(signInButton, signInButtonLayoutParams);
    }

    private void setupLayoutForSignUpAndForgotPassword(final Context context) {
        final LinearLayout layoutForSignUpAndForgotPassword = new LinearLayout(context);
        layoutForSignUpAndForgotPassword.setOrientation(HORIZONTAL);
        final LinearLayout.LayoutParams layoutParamsForSignUpAndForgotPassword
            = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);

        layoutParamsForSignUpAndForgotPassword.setMargins(credentialsFormView.getFormShadowMargin(),
            dp(10), credentialsFormView.getFormShadowMargin(), 0);
        layoutParamsForSignUpAndForgotPassword.gravity = Gravity.CENTER_HORIZONTAL;

        signUpTextView = new TextView(context);
        signUpTextView.setText(R.string.sign_in_new_account);
        signUpTextView.setTextAppearance(context, android.R.style.TextAppearance_Small);
        signUpTextView.setGravity(Gravity.START);
        signUpTextView.setTextColor(FORM_BUTTON_COLOR);
        final LinearLayout.LayoutParams layoutParamsForNewAccountText
            = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        layoutParamsForNewAccountText.weight = 1;
        layoutForSignUpAndForgotPassword.addView(signUpTextView, layoutParamsForNewAccountText);

        forgotPasswordTextView = new TextView(context);
        forgotPasswordTextView.setText(R.string.sign_in_forgot_password);
        forgotPasswordTextView.setTextAppearance(context, android.R.style.TextAppearance_Small);
        forgotPasswordTextView.setGravity(Gravity.END);
        forgotPasswordTextView.setTextColor(FORM_BUTTON_COLOR);
        final LinearLayout.LayoutParams layoutParamsForForgotPassword
            = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        layoutParamsForForgotPassword.weight = 1;
        layoutForSignUpAndForgotPassword.addView(forgotPasswordTextView, layoutParamsForForgotPassword);

        this.addView(layoutForSignUpAndForgotPassword, layoutParamsForSignUpAndForgotPassword);
    }

    private void setupBackgroundColor(final Activity activity) {
        Intent intent = activity.getIntent();
        this.backgroundColor = (int) (intent.getIntExtra(CognitoUserPoolsSignInProvider.AttributeKeys.BACKGROUND_COLOR,
                                                             DEFAULT_BACKGROUND_COLOR));
    }

    int getBackgroundColor() {
        return this.backgroundColor;
    }

    String getFontFamily() {
        return this.fontFamily;
    }

    boolean isBackgroundColorFullScreen() {
        return this.isBackgroundColorFullScreenEnabled;
    }

    private void setupFontFamily(final Activity activity) {
        Intent intent = activity.getIntent();
        this.fontFamily = (String) (intent.getStringExtra(CognitoUserPoolsSignInProvider.AttributeKeys.FONT_FAMILY));
        if (this.fontFamily != null) {
            Typeface typeFace = Typeface.create(this.fontFamily, Typeface.NORMAL);
            Log.d(LOG_TAG, "Setup font in UserPoolSignInView: " + this.fontFamily);
            signUpTextView.setTypeface(typeFace);
            forgotPasswordTextView.setTypeface(typeFace);
            signInButton.setTypeface(typeFace);
            userNameEditText.setTypeface(typeFace);
            passwordEditText.setTypeface(typeFace);
        }
    }

    private void setupBackgroundColorFullScreen(final Activity activity) {
        Intent intent = activity.getIntent();
        this.isBackgroundColorFullScreenEnabled = (boolean) (intent.getBooleanExtra(
            CognitoUserPoolsSignInProvider.AttributeKeys.FULL_SCREEN_BACKGROUND_COLOR, false));
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        final int parentWidth = MeasureSpec.getSize(widthMeasureSpec);
        final int maxWidth = Math.min((int)(parentWidth * FORM_SIDE_MARGIN_RATIO), MAX_FORM_WIDTH_IN_PIXELS);
        super.onMeasure(MeasureSpec.makeMeasureSpec(maxWidth, MeasureSpec.AT_MOST), heightMeasureSpec);
        initializeIfNecessary();
    }

    public TextView getSignUpTextView() {
        return signUpTextView;
    }

    public TextView getForgotPasswordTextView() {
        return forgotPasswordTextView;
    }

    public String getEnteredUserName() {
        return userNameEditText.getText().toString();
    }

    public String getEnteredPassword() {
        return passwordEditText.getText().toString();
    }

    public FormView getCredentialsFormView() {
        return credentialsFormView;
    }
}
