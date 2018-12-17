/*
  * Copyright 2017-2017 Amazon.com, Inc. or its affiliates.
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

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.mobile.auth.core.IdentityManager;
import com.amazonaws.mobile.auth.core.IdentityProvider;
import com.amazonaws.mobile.auth.core.DefaultSignInResultHandler;

import com.amazonaws.mobile.auth.core.signin.ui.buttons.SignInButton;
import com.amazonaws.mobile.config.AWSConfigurable;
import com.amazonaws.mobile.config.AWSConfiguration;

import org.json.JSONObject;

public class SignInUI implements AWSConfigurable {

    /** Log Tag. */
    private static final String LOG_TAG = SignInUI.class.getSimpleName();

    /** Calling activity. */
    private Activity loginCallingActivity;

    /** Next activity. */
    private Class<? extends Activity> loginNextActivity;

    /** Configuration information for AuthUI. */
    private AuthUIConfiguration authUIConfiguration;

    /** Activity context. */
    private Context context;

    /** AWSConfiguration object that represents the `awsconfiguration.json` file. */
    private AWSConfiguration awsConfiguration;

    /** ClientConfiguration. */
    private ClientConfiguration clientConfiguration;

    /** Configuration keys for SignInProviders in awsconfiguration.json. */
    private static final String USER_POOLS  = "CognitoUserPool";
    private static final String FACEBOOK    = "FacebookSignIn";
    private static final String GOOGLE      = "GoogleSignIn";
    private static final String FACEBOOK_BUTTON = "com.amazonaws.mobile.auth.facebook.FacebookButton";
    private static final String GOOGLE_BUTTON = "com.amazonaws.mobile.auth.google.GoogleButton";
    private static final String GOOGLE_WEBAPP_CONFIG_KEY = "ClientId-WebApp";

    /**
     * Initiate the login flow and present the AuthUI.
     * Move the nextActivity if sign-in succeeded.
     * 
     * @param callingActivity The activity
     * @param nextActivity    The next activity to go when sign-in succeeded
     */
    public LoginBuilder login(final Activity callingActivity,
                              final Class<? extends Activity> nextActivity) {
        this.loginCallingActivity = callingActivity;
        this.loginNextActivity = nextActivity;
        this.authUIConfiguration = getDefaultAuthUIConfiguration();
        return new LoginBuilder();
    }

    /**
     * Initiate the sign-in flow.
     * Resume any previously signed-in Auth session.
     * Check if the user is not signed in and present the AuthUI screen.
     */
    private void presentAuthUI() {
        Log.d(LOG_TAG, "Presenting the SignIn UI.");
        final IdentityManager identityManager = IdentityManager.getDefaultIdentityManager();
        final boolean canCancel = this.authUIConfiguration.getCanCancel();
        identityManager.login(this.loginCallingActivity, new DefaultSignInResultHandler() {
            @Override
            public void onSuccess(Activity activity, IdentityProvider identityProvider) {
                if (identityProvider != null) {
                    Log.d(LOG_TAG, "Sign-in succeeded. The identity provider name is available here using: " +
                            identityProvider.getDisplayName());
                    startNextActivity(activity, loginNextActivity);
                }
            }

            @Override
            public boolean onCancel(Activity activity) {
                // Return false to prevent the user from dismissing the sign in screen by pressing back button.
                // Return true to allow this.
                return canCancel;
            }
        });

        SignInActivity.startSignInActivity(this.loginCallingActivity, this.authUIConfiguration);
    }

    /**
     * Present SignIn-UI screen if the user is not signed-in
     * On successful sign-in, move to the next activity.
     */
    private void loginWithBuilder(final LoginBuilder loginBuilder) {
         try {
            Log.d(LOG_TAG, "Initiating the SignIn flow.");
            if (loginBuilder.getAuthUIConfiguration() != null) {
                this.authUIConfiguration = loginBuilder.getAuthUIConfiguration();
            }
            final IdentityManager identityManager = IdentityManager.getDefaultIdentityManager();
            if (loginBuilder.shouldFederate && identityManager.isUserSignedIn()) {
                Log.d(LOG_TAG, "User is already signed-in. Moving to the next activity.");
                startNextActivity(this.loginCallingActivity, this.loginNextActivity);
            } else {
                Log.d(LOG_TAG, "User is not signed-in. Presenting the SignInUI.");
                presentAuthUI();
            }
        } catch (final Exception exception) {
            Log.e(LOG_TAG, "Error occurred in sign-in ", exception);
        }
    }

    /**
     * {@code AWSMobileClient.LoginBuilder} accepts and retrieves
     * the optional parameters necessary for presenting the 
     * SignIn UI and initiaiting the AuthUI flow.
     */
    public class LoginBuilder {

        private AuthUIConfiguration authUIConfiguration;
        private boolean shouldFederate = true;

        /**
         * Constructor.
         */
        public LoginBuilder() {
            this.authUIConfiguration = null;
        }

        /**
         * Set the custom authUIConfiguration passed in.
         */
        public LoginBuilder authUIConfiguration(final AuthUIConfiguration authUIConfiguration) {
            this.authUIConfiguration = authUIConfiguration;
            return this;
        }

        /**
         * Retrieve the custom AuthUIConfiguration object.
         * @return authUIConfiguration
         */
        public AuthUIConfiguration getAuthUIConfiguration() {
            return this.authUIConfiguration;
        }

        public LoginBuilder enableFederation(final boolean enabled) {
            shouldFederate = enabled;
            return this;
        }

        public boolean shouldFederate() {
            return shouldFederate;
        }

        /**
         * Invoke loginWithBuilder.
         */
        public void execute() {
            loginWithBuilder(this);
        }
    }

    /**
     * Retrieve the 
     * {@link com.amazonaws.mobile.auth.ui.AuthUIConfiguration} based on the 
     * {@link com.amazonaws.mobile.config.AWSConfiguration}.
     * 
     * @return authUIConfiguration
     */
    private AuthUIConfiguration getDefaultAuthUIConfiguration() {
        AuthUIConfiguration.Builder configBuilder = new AuthUIConfiguration.Builder();

        try {
            if (isConfigurationKeyPresent(USER_POOLS)) {
                configBuilder.userPools(true);
            }

            if (isConfigurationKeyPresent(FACEBOOK)) {
                configBuilder.signInButton((Class<? extends SignInButton>)Class.forName(FACEBOOK_BUTTON));
            }

            if (isConfigurationKeyPresent(GOOGLE)) {
                configBuilder.signInButton((Class<? extends SignInButton>)Class.forName(GOOGLE_BUTTON));
            }

            configBuilder.canCancel(false);
        } catch (Exception exception) {
              Log.e(LOG_TAG, "Cannot configure the SignInUI. "
                + "Check the context and the configuration object passed in.", exception);
        }

        return configBuilder.build(); 
    }

    /**
     * Check if the AWSConfiguration has the specified key.
     * 
     * @param configurationKey The key for SignIn in AWSConfiguration
     */
    private boolean isConfigurationKeyPresent(final String configurationKey) {
        try {
            JSONObject jsonObject = this.awsConfiguration.optJsonObject(configurationKey);
            if (configurationKey.equals(GOOGLE)) {
                return jsonObject != null && jsonObject.getString(GOOGLE_WEBAPP_CONFIG_KEY) != null;
            } else {
                return jsonObject != null;
            }
        } catch (final Exception exception) {
            Log.d(LOG_TAG, configurationKey + " not found in `awsconfiguration.json`");
            return false;
        }
    }

    /**
     * Start the next activity after successful sign-in.
     * 
     * @param currentActivity   The current activity context
     * @param nextActivity      The class of next activity to move to
     */
    private void startNextActivity(final Activity currentActivity,
                                   final Class<? extends Activity> nextActivity) {
        if (currentActivity == null || nextActivity == null) {
            Log.e(LOG_TAG, "Cannot start the next activity. Check the context and the nextActivity passed in.");
            return;
        }

        currentActivity
            .startActivity(new Intent(currentActivity, nextActivity)
                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
        currentActivity.finish();
    }

    /** {@inheritDoc} */
    @Override
    public AWSConfigurable initialize(final Context context) throws Exception {
        return initialize(context, new AWSConfiguration(context.getApplicationContext()));
    }

    /** {@inheritDoc} */
    @Override
    public AWSConfigurable initialize(final Context context,
                                      final AWSConfiguration configuration) throws Exception {
        return initialize(context, configuration, new ClientConfiguration());
    }

    /** {@inheritDoc} */
    @Override
    public AWSConfigurable initialize(final Context context,
                                               final AWSConfiguration configuration,
                                               final ClientConfiguration clientConfiguration) throws Exception {
        Log.d(LOG_TAG, "Initializing SignInUI.");
        this.context = context;
        this.awsConfiguration = configuration;
        this.clientConfiguration = clientConfiguration;
        return this;
    }
}
