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

package com.amazonaws.mobile.auth.core.signin;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import com.amazonaws.mobile.auth.core.IdentityProvider;

/**
 * Each sign-in provider implements this interface, in order to do sign-in button
 * initialization and to handle activity results that have been passed back to the
 * app, after a sign-in provider window has been dismissed.
 */
public interface SignInProvider extends IdentityProvider {
    /**
     * Call isRequestCodeOurs to determine if this provider should handle an activity result.
     * @param requestCode the requestCode from a previous call to onActivityResult.
     * @return true if the request code is from this provider, otherwise false.
     */
    boolean isRequestCodeOurs(int requestCode);

    /**
     * Call handleActivityResult to handle the activity result.
     * @param requestCode the request code.
     * @param resultCode the result code.
     * @param data the result intent.
     */
    void handleActivityResult(int requestCode, int resultCode, Intent data);

    /**
     * Initialize the sign-in button for the sign-in activity.
     * @param signInActivity the activity for sign-in.
     * @param buttonView the view for the sign-in button to initialize.
     * @param resultsHandler the resultsHandler for provider sign-in.
     * @return the onClickListener for the button to be able to override the listener,
     *         and null if the button cannot be initialized.
     */
    View.OnClickListener initializeSignInButton(Activity signInActivity,
                                                View buttonView,
                                                SignInProviderResultHandler resultsHandler);
}
