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

package com.amazonaws.mobile.auth.ui;

import android.content.Intent;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.amazonaws.mobile.auth.core.IdentityProvider;
import com.amazonaws.mobile.auth.core.SignInResultHandler;
import com.amazonaws.mobile.auth.core.signin.SignInManager;
import com.amazonaws.mobile.auth.core.signin.SignInProviderResultHandler;

/**
 * Activity for handling Sign-in with an Identity Provider.
 */
public class SignInActivity extends AppCompatActivity {

    /** Log Tag. */
    private static final String LOG_TAG = SignInActivity.class.getSimpleName();

    /** Reference to the singleton instance of SignInManager. */
    private SignInManager signInManager;

    /**
     * SignInProviderResultHandlerImpl handles the final result from sign in.
     */
    private class SignInProviderResultHandlerImpl implements SignInProviderResultHandler {
        /**
         * Receives the successful sign-in result and starts the main activity.
         *
         * @param provider the identity provider used for sign-in.
         */
        @Override
        public void onSuccess(final IdentityProvider provider) {
            Log.i(LOG_TAG, String.format(getString(R.string.sign_in_succeeded_message_format),
                                         provider.getDisplayName()));

            // The sign-in manager is no longer needed once signed in.
            SignInManager.dispose();
            final SignInResultHandler signInResultsHandler = signInManager.getResultHandler();

            // Call back the results handler.
            signInResultsHandler.onSuccess(SignInActivity.this, provider);
            finish();
        }

        /**
         * Receives the sign-in result indicating the user canceled and shows a toast.
         *
         * @param provider the identity provider with which the user attempted sign-in.
         */
        @Override
        public void onCancel(final IdentityProvider provider) {
            Log.i(LOG_TAG, String.format(getString(R.string.sign_in_canceled_message_format),
                                         provider.getDisplayName()));
            signInManager.getResultHandler()
                .onIntermediateProviderCancel(SignInActivity.this, provider);
        }

        /**
         * Receives the sign-in result that an error occurred signing in and shows a toast.
         *
         * @param provider the identity provider with which the user attempted sign-in.
         * @param ex       the exception that occurred.
         */
        @Override
        public void onError(final IdentityProvider provider, final Exception ex) {
            Log.e(LOG_TAG, String.format("Sign-in with %s caused an error.", provider.getDisplayName()), ex);
            signInManager.getResultHandler()
                .onIntermediateProviderError(SignInActivity.this, provider, ex);
        }
    }

    /**
     * This method is called when SignInActivity is created.
     * Get the instance of SignInManager and set the callback
     * to be received from SignInManager on signin.
     */
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        signInManager = SignInManager.getInstance();
        if (signInManager == null) {
            Log.e(LOG_TAG, "Invoke SignInActivity.startSignInActivity() method to create the SignInManager.");
            return;
        }
        signInManager.setProviderResultsHandler(this, new SignInProviderResultHandlerImpl());
        setContentView(R.layout.activity_sign_in);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onRequestPermissionsResult(final int requestCode,
                                           final String[] permissions,
                                           final int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        signInManager.handleRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    protected void onActivityResult(final int requestCode,
                                    final int resultCode,
                                    final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        signInManager.handleActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onBackPressed() {
        if (signInManager.getResultHandler().onCancel(this)) {
            super.onBackPressed();
            // Since we are leaving sign-in via back, we can dispose the sign-in manager, since sign-in was cancelled.
            SignInManager.dispose();
            finish();
        }
    }

    /**
     * Start the SignInActivity that kicks off the authentication flow
     * by initializing the SignInManager.
     *
     * @param context The context from which the SignInActivity will be started
     * @param config  Reference to AuthUIConfiguration object
     */
    public static void startSignInActivity(final Context context,
                                           final AuthUIConfiguration config) {
        try {
            Intent intent = new Intent(context, SignInActivity.class);
            intent.putExtra(SignInView.CONFIGURATION_KEY, config);
            intent.putExtra(AuthUIConfiguration.CONFIG_KEY_SIGN_IN_BACKGROUND_COLOR,
                config.getSignInBackgroundColor(SignInView.DEFAULT_BACKGROUND_COLOR));
            intent.putExtra(AuthUIConfiguration.CONFIG_KEY_FONT_FAMILY,
                config.getFontFamily());
            intent.putExtra(AuthUIConfiguration.CONFIG_KEY_FULL_SCREEN_BACKGROUND,
                config.isBackgroundColorFullScreen());
            context.startActivity(intent);
        } catch (Exception exception) {
            Log.e(LOG_TAG, "Cannot start the SignInActivity. "
              + "Check the context and the configuration object passed in.", exception);
        }
    }

    /**
     * Start the SignInActivity that kicks off the authentication flow
     * by initializing the SignInManager.
     *
     * @param context The context from which the SignInActivity will be started
     */
    public static void startSignInActivity(final Context context) {
        try {
            Intent intent = new Intent(context, SignInActivity.class);
            context.startActivity(intent);
        } catch (Exception exception) {
            Log.e(LOG_TAG, "Cannot start the SignInActivity. "
              + "Check the context passed in.", exception);
        }
    }
}
