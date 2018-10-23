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
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.InputType;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import android.support.v4.content.res.ResourcesCompat;

import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobile.auth.core.IdentityManager;
import com.amazonaws.mobile.auth.core.signin.SignInManager;
import com.amazonaws.mobile.auth.core.signin.ui.DisplayUtils;
import com.amazonaws.mobile.auth.core.signin.ui.BackgroundDrawable;
import com.amazonaws.mobile.auth.core.signin.ui.SplitBackgroundDrawable;

import com.amazonaws.mobile.auth.userpools.R;

import static com.amazonaws.mobile.auth.userpools.UserPoolFormConstants.FORM_BUTTON_COLOR;
import static com.amazonaws.mobile.auth.userpools.UserPoolFormConstants.FORM_BUTTON_CORNER_RADIUS;
import static com.amazonaws.mobile.auth.userpools.UserPoolFormConstants.FORM_SIDE_MARGIN_RATIO;
import static com.amazonaws.mobile.auth.userpools.UserPoolFormConstants.MAX_FORM_WIDTH_IN_PIXELS;

/**
 * The view that handles user sign-up for Cognito User Pools.
 */
public class SignUpView extends LinearLayout {

    /** Log tag. */
    private static final String LOG_TAG = SignUpView.class.getSimpleName();

    private TextView signUpMessage;
    private Button signUpButton;
    private FormView signUpForm;
    private EditText userNameEditText;
    private EditText passwordEditText;
    private EditText givenNameEditText;
    private EditText emailEditText;
    private EditText phoneEditText;

    private SplitBackgroundDrawable splitBackgroundDrawable;
    private BackgroundDrawable backgroundDrawable;
    private String fontFamily;
    private boolean fullScreenBackgroundColor;
    private Typeface typeFace;
    private int backgroundColor;

    /**
     * Constructs the SignUp View.
     * @param context The activity context.
     */
    public SignUpView(final Context context) {
        this(context, null);
    }

   /**
    * Constructs the SignUp View.
    * @param context The activity context.
    * @param attrs The Attribute Set for the view from which the resources can be accessed.
    */
    public SignUpView(final Context context, final AttributeSet attrs) {
        this(context, attrs, 0);
    }

   /**
    * Constructs the SignUp View.
    * @param context The activity context.
    * @param attrs The Attribute Set for the view from which the resources can be accessed.
    * @param defStyleAttr The resource identifier for the default style attribute.
    */
    public SignUpView(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOrientation(VERTICAL);

        final int backgroundColor;
        if (isInEditMode()) {
            backgroundColor = Color.DKGRAY;
        } else {
            final TypedArray styledAttributes = context.obtainStyledAttributes(attrs, R.styleable.SignUpView);
            backgroundColor = styledAttributes.getInt(R.styleable.SignUpView_signUpViewBackgroundColor, Color.DKGRAY);
            styledAttributes.recycle();
        }

        this.fontFamily = CognitoUserPoolsSignInProvider.getFontFamily();
        this.typeFace = Typeface.create(this.fontFamily, Typeface.NORMAL);
        this.fullScreenBackgroundColor = CognitoUserPoolsSignInProvider.isBackgroundColorFullScreen();
        this.backgroundColor = CognitoUserPoolsSignInProvider.getBackgroundColor();

        if (this.fullScreenBackgroundColor) {
            this.backgroundDrawable = new BackgroundDrawable(this.backgroundColor);
        } else {
            this.splitBackgroundDrawable = new SplitBackgroundDrawable(0, this.backgroundColor);
        }
    }

    private void setupFontFamily() {
        if (this.typeFace != null) {
            Log.d(LOG_TAG, "Setup font in SignUpView: " + this.fontFamily);
            userNameEditText.setTypeface(typeFace);
            passwordEditText.setTypeface(typeFace);
            givenNameEditText.setTypeface(typeFace);
            emailEditText.setTypeface(typeFace);
            phoneEditText.setTypeface(typeFace);
            signUpMessage.setTypeface(typeFace);
            signUpButton.setTypeface(typeFace);
        }
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.signUpForm = (FormView) findViewById(R.id.signup_form);
        userNameEditText = signUpForm.addFormField(getContext(),
            InputType.TYPE_CLASS_TEXT| InputType.TYPE_TEXT_VARIATION_PERSON_NAME,
            getContext().getString(R.string.username_text));

        passwordEditText = signUpForm.addFormField(getContext(),
            InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD,
            getContext().getString(R.string.sign_in_password));

        givenNameEditText = signUpForm.addFormField(getContext(),
            InputType.TYPE_CLASS_TEXT| InputType.TYPE_TEXT_VARIATION_PERSON_NAME,
            getContext().getString(R.string.given_name_text));

        emailEditText = signUpForm.addFormField(getContext(),
            InputType.TYPE_CLASS_TEXT| InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS,
            getContext().getString(R.string.email_address_text));

        phoneEditText = signUpForm.addFormField(getContext(),
            InputType.TYPE_CLASS_PHONE,
            getContext().getString(R.string.phone_number_text));

        this.signUpMessage = (TextView) findViewById(R.id.signup_message);
        this.signUpButton = (Button) findViewById(R.id.signup_button);

        setupSignUpButtonBackground();
        setupFontFamily();
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

    private void setupSignUpButtonBackground() {
        signUpButton.setBackgroundDrawable(DisplayUtils.getRoundedRectangleBackground(
            FORM_BUTTON_CORNER_RADIUS, FORM_BUTTON_COLOR));
        LayoutParams signUpButtonLayoutParams = (LayoutParams) signUpButton.getLayoutParams();
        signUpButtonLayoutParams.setMargins(
            signUpForm.getFormShadowMargin(),
            signUpButtonLayoutParams.topMargin,
            signUpForm.getFormShadowMargin(),
            signUpButtonLayoutParams.bottomMargin);
    }

    private void setupBackground() {
        if (!this.fullScreenBackgroundColor) {
            splitBackgroundDrawable.setSplitPointDistanceFromTop(signUpForm.getTop()
                + (signUpForm.getMeasuredHeight()/2));
            ((ViewGroup) getParent()).setBackgroundDrawable(splitBackgroundDrawable);
        } else {
            ((ViewGroup) getParent()).setBackgroundDrawable(backgroundDrawable);
        }
    }

    /**
     * @return the user's user name entered in the form.
     */
    public String getUserName() {
        return userNameEditText.getText().toString();
    }

    /**
     * @return the user's password entered in the form.
     */
    public String getPassword() {
        return passwordEditText.getText().toString();
    }

    /**
     * Sets the password field
     * @param password string to fill in the text view
     */
    public void setPassword(final String password) {
        passwordEditText.setText(password);
    }

    /**
     * @return the user's given name entered in the form.
     */
    public String getGivenName() {
       return givenNameEditText.getText().toString();
    }

    /**
     * @return the user's email entered in the form.
     */
    public String getEmail() {
        return emailEditText.getText().toString();
    }

    /**
     * @return the user's phone number entered in the form.
     */
    public String getPhone() {
        return phoneEditText.getText().toString();
    }
}
