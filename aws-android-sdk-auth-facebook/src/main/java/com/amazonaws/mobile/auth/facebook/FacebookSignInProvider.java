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

package com.amazonaws.mobile.auth.facebook;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;

import android.util.Log;
import android.view.View;

import com.amazonaws.mobile.config.AWSConfiguration;

import com.amazonaws.mobile.auth.core.signin.SignInProviderResultHandler;
import com.amazonaws.mobile.auth.core.signin.SignInProvider;
import com.amazonaws.mobile.auth.core.internal.util.ThreadUtils;

import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Sign-in provider for Facebook.
 */
public class FacebookSignInProvider implements SignInProvider {

    /** Log tag. */
    private static final String LOG_TAG = FacebookSignInProvider.class.getSimpleName();

    /** The Cognito login key for Facebook to be used in the Cognito login Map. */
    public static final String COGNITO_LOGIN_KEY_FACEBOOK = "graph.facebook.com";

    /** Timeout for refreshing the Facebook Token. */
    private static final long REFRESH_TOKEN_TIMEOUT_SECONDS = 15;

    /** Facebook's callback manager. */
    private CallbackManager facebookCallbackManager;

    /** Latch to ensure Facebook SDK is initialized before attempting to read the authorization token. */
    private final CountDownLatch initializedLatch = new CountDownLatch(1);

    /** AWS Configuration Object. */
    private AWSConfiguration awsConfiguration = null;

    /** list to store permissions. **/
    private static ArrayList<String> permissions = new ArrayList<String>();

    /**
     * Intitializes the SDK and debug logs the app KeyHash that must be set up with
     * the facebook backend to allow login from the app.
     *
     * @param context the context.
     * @param awsConfig the AWS Configuration.
     */
    @Override
    public void initialize(@NonNull final Context context,
                            final AWSConfiguration awsConfig) {
        this.awsConfiguration = awsConfig;
        if (!FacebookSdk.isInitialized()) {
            Log.d(LOG_TAG, "Initializing Facebook SDK...");
            FacebookSdk.sdkInitialize(context);
        }
        initializedLatch.countDown();
        Log.d(LOG_TAG, "Facebook SDK initialization completed");

        // Read the awsconfiguration.json and apply the permissions.
        try {
            FacebookSignInProvider.setPermissions(
                this.awsConfiguration
                    .optJsonObject("FacebookSignIn")
                    .getString("Permissions")
                    .split(",")
            );
        } catch (final Exception exception) {
                Log.e(LOG_TAG, "Failed to register the permissions with FacebookSignInProvider. "
                    + "Use FacebookSignInProvider.setPermissions() to register the permissions. "
                    + "Check if FacebookSignIn is present in `awsconfiguration.json`.");
        }
    }

    /**
     * Get the SignedIn Access token.
     * @return the Facebook AccessToken when signed-in with a non-expired token.
     */
    private AccessToken getSignedInToken() {
        try {
            initializedLatch.await();
        } catch (final InterruptedException ex) {
            Log.d(LOG_TAG, "Unexpected interrupt.");
        }
        final AccessToken accessToken = AccessToken.getCurrentAccessToken();
        if (accessToken != null && !accessToken.isExpired()) {
            Log.d(LOG_TAG, "Facebook Access Token is OK. Token hashcode = " + accessToken.hashCode());
            return accessToken;
        }

        Log.d(LOG_TAG, "Facebook Access Token is null or expired.");
        return null;
    }

    /**
     * Check if the AWSConfiguration has the specified key.
     * 
     * @param configKey
     */
    private boolean configHasKey(final String configKey) {
        return this.awsConfiguration.optJsonObject(configKey) != null;
    }

    /** {@inheritDoc} */
    @Override
    public boolean isRequestCodeOurs(final int requestCode) {
        return FacebookSdk.isFacebookRequestCode(requestCode);
    }

    /** {@inheritDoc} */
    @Override
    public void handleActivityResult(final int requestCode,
                                     final int resultCode,
                                     final Intent data) {
        facebookCallbackManager.onActivityResult(requestCode, resultCode, data);
    }

    /** {@inheritDoc} */
    @Override
    public View.OnClickListener initializeSignInButton(final Activity signInActivity,
                                                       final View buttonView,
                                                       final SignInProviderResultHandler resultsHandler) {
        if (buttonView == null) {
            throw new IllegalArgumentException("Facebook login button view not passed in.");
        }

        facebookCallbackManager = CallbackManager.Factory.create();

        LoginManager.getInstance().registerCallback(facebookCallbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(final LoginResult loginResult) {
                Log.d(LOG_TAG, "Facebook provider sign-in succeeded.");
                resultsHandler.onSuccess(FacebookSignInProvider.this);
            }

            @Override
            public void onCancel() {
                Log.d(LOG_TAG, "Facebook provider sign-in canceled.");
                resultsHandler.onCancel(FacebookSignInProvider.this);
            }

            @Override
            public void onError(final FacebookException exception) {
                Log.e(LOG_TAG, "Facebook provider sign-in error: " + exception.getMessage());
                resultsHandler.onError(FacebookSignInProvider.this, exception);
            }
        });

        final View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                LoginManager.getInstance().logInWithReadPermissions(signInActivity,
                        FacebookSignInProvider.permissions);
            }
        };

        buttonView.setOnClickListener(listener);
        return listener;
    }

    /**
     * Add the login permisisons needed by the application.
     * The input has to be a string or array of strings, where each
     * string represents a permisison.
     *
     * Eg:
     *  FacebookSignInProvider.setPermissions("public_profile");
     *  FacebookSignInProvider.setPermissions("public_profile", "email");
     *
     * @param userPermissions The list of permissions required
     */
    public static void setPermissions(final String... userPermissions) {
        synchronized (FacebookSignInProvider.permissions) {
            FacebookSignInProvider.permissions.clear();
            for (String permission : userPermissions) {
                FacebookSignInProvider.permissions.add(permission);
            }
        }
    }

    /** {@inheritDoc} */
    @Override
    public String getDisplayName() {
        return "Facebook";
    }

    /** {@inheritDoc} */
    @Override
    public String getCognitoLoginKey() {
        return COGNITO_LOGIN_KEY_FACEBOOK;
    }

    /** {@inheritDoc} */
    @Override
    public boolean refreshUserSignInState() {
        return getSignedInToken() != null;
    }

    /** {@inheritDoc} */
    @Override
    public String getToken() {
        AccessToken accessToken = getSignedInToken();
        if (accessToken != null) {
            return accessToken.getToken();
        }
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public String refreshToken() {

        AccessToken accessToken = getSignedInToken();
        // getSignedInToken() returns null if token is expired.
        if (accessToken != null) {
            return accessToken.getToken();
        }

        Log.i(LOG_TAG, "Facebook provider refreshing token...");
        final CountDownLatch countDownLatch = new CountDownLatch(1);

        // The constructor of the AccessTokenTracker creates a broadcast receiver that keeps this class
        // alive until a broadcast is received as a result of calling refreshCurrentAccessTokenAsync() below.
        final AccessTokenTracker tokenTracker = new AccessTokenTracker() {
            @Override
            protected void onCurrentAccessTokenChanged(final AccessToken oldAccessToken,
                                                       final AccessToken currentAccessToken) {
                this.stopTracking();
                if (currentAccessToken == null) {
                    // We cannot refresh the token.
                    // The user may have revoked permissions by going to his settings and deleting your app.
                    // This will cause the call to fail, and the app will likely want to send the user
                    // back to the sign-in page.
                    Log.d(LOG_TAG, "Facebook token can't be refreshed, perhaps the user revoked permissions.");
                } else {
                    Log.i(LOG_TAG, "Facebook provider token has been updated.");
                }
                countDownLatch.countDown();
            }
        };

        try {
            ThreadUtils.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    // Refreshes access token in the background and wakes up the AccessTokenTracker
                    // to receive the result.
                    AccessToken.refreshCurrentAccessTokenAsync();
                }
            });

            try {
                Log.d(LOG_TAG, "Facebook provider is waiting for token update...");
                if (!countDownLatch.await(REFRESH_TOKEN_TIMEOUT_SECONDS, TimeUnit.SECONDS)) {
                    Log.w(LOG_TAG, "Facebook provider timed out refreshing the token.");
                    return null;
                }
            } catch (final InterruptedException ex) {
                Log.w(LOG_TAG, "Unexpected Interrupt of refreshToken()", ex);
                throw new RuntimeException(ex);
            }

            accessToken = getSignedInToken();
            if (accessToken == null) {
                Log.w(LOG_TAG, "Facebook provider could not refresh the token.");
                return null;
            }
        } finally {
            tokenTracker.stopTracking();
        }

        return accessToken.getToken();
    }

    /** {@inheritDoc} */
    @Override
    public void signOut() {
        Log.d(LOG_TAG, "Facebook provider signing out...");
        LoginManager.getInstance().logOut();
    }
}
