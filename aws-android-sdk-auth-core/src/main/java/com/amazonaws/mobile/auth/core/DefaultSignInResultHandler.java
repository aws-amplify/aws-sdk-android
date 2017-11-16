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

package com.amazonaws.mobile.auth.core;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.amazonaws.mobile.auth.core.R;

/**
 * A default base class easing the work required for implementing the SignInResultHandler for
 * {@link IdentityManager#login(Context, SignInResultHandler)} by providing default
 * behavior in the case that the user cancels signing in or encounters an error. The default for
 * canceling is to toast that sign-in was canceled. The default for a sign-in error is to show
 * an alert dialog specifying the error message.
 */
public abstract class DefaultSignInResultHandler implements SignInResultHandler {
    private static final String LOG_TAG = DefaultSignInResultHandler.class.getSimpleName();

    /**
     * User cancelled signing in with a provider on the sign-in activity.
     * Note: The user is still on the sign-in activity when this call is made.
     * @param provider the provider the user canceled with.
     */
    public void onIntermediateProviderCancel(Activity callingActivity, IdentityProvider provider) {
        Log.d(LOG_TAG, String.format("%s Sign-In flow is canceled", provider.getDisplayName()));
    }

    /**
     * User encountered an error when attempting to sign-in with a provider.
     * Note: The user is still on the sign-in activity when this call is made.
     * @param provider the provider the user attempted to sign-in with that encountered an error.
     * @param ex the exception that occurred.
     */
    public void onIntermediateProviderError(Activity callingActivity, IdentityProvider provider, Exception ex) {
        final String failureFormatString = callingActivity.getString(R.string.sign_in_failure_message_format);
        Log.e(LOG_TAG, String.format(failureFormatString,
            provider.getDisplayName(), ex.getMessage()), ex);
    }
}
