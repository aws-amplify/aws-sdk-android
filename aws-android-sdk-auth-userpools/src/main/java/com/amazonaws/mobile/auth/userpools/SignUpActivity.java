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
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.amazonaws.mobile.auth.core.internal.util.ViewHelper;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserAttributes;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserCodeDeliveryDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.SignUpHandler;

import static com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.AttributeKeys.*;
import static com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.getErrorMessageFromException;

/**
 * Activity to prompt for account sign up information.
 */
public class SignUpActivity extends Activity {
    /** Log tag. */
    private static final String LOG_TAG = SignUpActivity.class.getSimpleName();

    private SignUpView signUpView;
    private CognitoUserPool mUserPool;

    /**
     * Starts a {@link SignUpActivity}
     * @param callingActivity the activity that the will start this activity
     * @param requestCode the request code provided to {@link Activity#onActivityResult(int, int, Intent)}
     */
    public static void startActivity(final Activity callingActivity,
                                     final int requestCode) {
        Intent intent = new Intent(callingActivity, SignUpActivity.class);
        callingActivity.startActivityForResult(intent, requestCode);
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signUpView = (SignUpView) findViewById(R.id.signup_view);

        Context appContext = getApplicationContext();
        mUserPool = new CognitoUserPool(appContext, new AWSConfiguration(appContext));

        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    /**
     * Retrieve input and return to caller.
     * @param view the Android View
     */
    public void signUp(final View view) {
        final String username = signUpView.getUserName();
        final String password = signUpView.getPassword();
        final String givenName = signUpView.getGivenName();
        final String email = signUpView.getEmail();
        final String phone = signUpView.getPhone();

        Log.d(LOG_TAG, "username = " + username);
        Log.d(LOG_TAG, "given_name = " + givenName);
        Log.d(LOG_TAG, "email = " + email);
        Log.d(LOG_TAG, "phone = " + phone);

        if (username.isEmpty()) {
            showError(getString(R.string.sign_up_username_missing));
            return;
        }

        if (password.length() < 6) {
            showError(getString(R.string.password_length_validation_failed));
            return;
        }

        final CognitoUserAttributes userAttributes = new CognitoUserAttributes();
        userAttributes.addAttribute(GIVEN_NAME, givenName);
        userAttributes.addAttribute(EMAIL_ADDRESS, email);

        if (!phone.isEmpty()) {
            userAttributes.addAttribute(PHONE_NUMBER, phone);
        }

        final AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setTitle(getString(R.string.sign_up_in_progress))
                .setMessage(getString(R.string.please_wait))
                .setNeutralButton(android.R.string.ok, null);
        final AlertDialog alertDialog = builder.show();

        mUserPool.signUpInBackground(username, password, userAttributes, null,
                new SignUpHandler() {
                    @Override
                    public void onSuccess(CognitoUser user, boolean signUpConfirmationState, CognitoUserCodeDeliveryDetails cognitoUserCodeDeliveryDetails) {
                        alertDialog.dismiss();
                        final Intent intent = new Intent();
                        intent.putExtra(USERNAME, username);
                        intent.putExtra(PASSWORD, password);
                        intent.putExtra(IS_SIGN_UP_CONFIRMED, signUpConfirmationState);
                        intent.putExtra(CONFIRMATION_DESTINATION, cognitoUserCodeDeliveryDetails.getDestination());
                        setResult(RESULT_OK, intent);
                        finish();
                    }

                    @Override
                    public void onFailure(Exception exception) {
                        alertDialog.dismiss();
                        showError(exception.getLocalizedMessage() != null ?
                                getErrorMessageFromException(exception) : "");
                    }
                });
    }

    protected void showError(final String msg) {
        ViewHelper.showDialog(this,
                getString(R.string.title_activity_sign_up),
                getString(R.string.sign_up_failed) + " " + msg);
    }
}
