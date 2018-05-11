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

import android.content.Context;

import com.amazonaws.mobile.config.AWSConfiguration;

/**
 * Interface sign-in provider's supported by the IdentityManager must implement.
 */
public interface IdentityProvider {

    /**
     * Method called upon constructing an identity provider for it to handle its initialization.
     *
     * @param context the context.
     * @param configuration the configuration.
     */
    void initialize(Context context, AWSConfiguration configuration);

    /**
     * @return the display name for this provider.
     */
    String getDisplayName();

    /**
     * @return the key used by Cognito in its login map when refreshing credentials.
     */
    String getCognitoLoginKey();

    /**
     * Refreshes the state of whether the user is signed-in and returns the updated state.
     * Note: This call may block, so it must not be called from the main thread.
     * @return true if signed in with this provider, otherwise false.
     */
    boolean refreshUserSignInState();

    /**
     * Call getToken to retrieve the access token from successful sign-in with this provider.
     * Note: This call may block if the access token is not already cached.
     * @return the access token suitable for use with Cognito.
     */
    String getToken();

    /**
     * Refreshes the token if it has expired.
     * Note: this call may block due to network access, and must be called from a background thread.
     * @return the refreshed access token, or null if the token cannot be refreshed.
     */
    String refreshToken();

    /**
     * Call signOut to sign out of this provider.
     */
    void signOut();
}
