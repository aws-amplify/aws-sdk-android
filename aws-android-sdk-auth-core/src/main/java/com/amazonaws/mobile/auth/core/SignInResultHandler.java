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

/**
 * Interface for handling results from calling IdentityManager's signInOrSignUp().
 */
public interface SignInResultHandler {
    /**
     * Called when the user has obtained an identity by signing in with a provider.
     *
     * @param callingActivity the calling activity that should be finished.
     * @param provider the provider or null if succeeded with an unauthenticated identity.
     */
    void onSuccess(Activity callingActivity, IdentityProvider provider);

    /**
     * User cancelled signing in with a provider on the sign-in activity.
     * Note: The user is still on the sign-in activity when this call is made.
     * @param provider the provider the user canceled with.
     */
    void onIntermediateProviderCancel(Activity callingActivity, IdentityProvider provider);

    /**
     * User encountered an error when attempting to sign-in with a provider.
     * Note: The user is still on the sign-in activity when this call is made.
     * @param provider the provider the user attempted to sign-in with that encountered an error.
     * @param ex the exception that occurred.
     */
    void onIntermediateProviderError(Activity callingActivity, IdentityProvider provider, Exception ex);

    /**
     * User pressed back from the sign-in Activity.
     *
     * @return true if the activity should be finished, otherwise false.
     */
    boolean onCancel(Activity callingActivity);
}
