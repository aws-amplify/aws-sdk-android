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

package com.amazonaws.mobile.auth.userpools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.amazonaws.mobile.auth.userpools.R;

/**
 * Activity to prompt for account sign up information.
 */
public class SignUpActivity extends Activity {
    /** Log tag. */
    private static final String LOG_TAG = SignUpActivity.class.getSimpleName();

    private SignUpView signUpView;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signUpView = (SignUpView) findViewById(R.id.signup_view);

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

        final Intent intent = new Intent();
        intent.putExtra(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, username);
        intent.putExtra(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, password);
        intent.putExtra(CognitoUserPoolsSignInProvider.AttributeKeys.GIVEN_NAME, givenName);
        intent.putExtra(CognitoUserPoolsSignInProvider.AttributeKeys.EMAIL_ADDRESS, email);
        intent.putExtra(CognitoUserPoolsSignInProvider.AttributeKeys.PHONE_NUMBER, phone);

        setResult(RESULT_OK, intent);

        finish();
    }
}
