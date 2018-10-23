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

import com.amazonaws.mobile.auth.userpools.R;

/**
 * Activity to prompt for a a verification code.
 */
public class MFAActivity extends Activity {
    /** Log tag. */
    private static final String LOG_TAG = MFAActivity.class.getSimpleName();
    private MFAView mfaView;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mfa);
        mfaView = (MFAView) findViewById(R.id.mfa_view);

        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
    }

    /**
     * Retrieve input and return to caller.
     * @param view the Android View
     */
    public void verify(final View view) {
        final String verificationCode = mfaView.getMFACode();

        Log.d(LOG_TAG, "verificationCode = " + verificationCode);

        final Intent intent = new Intent();
        intent.putExtra(CognitoUserPoolsSignInProvider.AttributeKeys.VERIFICATION_CODE, verificationCode);

        setResult(RESULT_OK, intent);

        finish();
    }
}
