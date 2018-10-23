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
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

import com.amazonaws.mobile.auth.userpools.R;

import static com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider.AttributeKeys.*;

/**
 * Activity to prompt for sign-up confirmation information.
 */
public class SignUpConfirmActivity extends Activity {
    /** Log tag. */
    private static final String LOG_TAG = SignUpConfirmActivity.class.getSimpleName();
    private SignUpConfirmView signUpConfirmView;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_confirm);

        final String username = getIntent().getStringExtra(
            USERNAME);
        final String destination = getIntent().getStringExtra(CONFIRMATION_DESTINATION);

        signUpConfirmView = (SignUpConfirmView) findViewById(R.id.signup_confirm_view);
        signUpConfirmView.getUserNameEditText().setText(username);
        signUpConfirmView.getConfirmCodeEditText().requestFocus();

        TextView message = (TextView) findViewById(R.id.confirm_account_message1);
        message.setText(getString(R.string.sign_up_confirm_code_sent) + "\n" + destination);

        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
    }

    /**
     * Retrieve input and return to caller.
     * @param view the Android View
     */
    public void confirmAccount(final View view) {

        final String username =
            signUpConfirmView.getUserNameEditText().getText().toString();
        final String verificationCode =
            signUpConfirmView.getConfirmCodeEditText().getText().toString();

        Log.d(LOG_TAG, "username = " + username);
        Log.d(LOG_TAG, "verificationCode = " + verificationCode);

        final Intent intent = new Intent();
        intent.putExtra(USERNAME, username);
        intent.putExtra(CognitoUserPoolsSignInProvider.AttributeKeys.VERIFICATION_CODE, verificationCode);

        setResult(RESULT_OK, intent);

        finish();
    }
}
