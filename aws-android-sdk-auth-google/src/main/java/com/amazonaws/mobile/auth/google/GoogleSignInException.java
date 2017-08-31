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

package com.amazonaws.mobile.auth.google;

import com.google.android.gms.auth.api.signin.GoogleSignInResult;

/**
 * Encapsulate exceptions that occurred due to a Google Sign-in failure.
 */
public class GoogleSignInException extends Exception {

    /** Message to express unavailability of SignIn status. */
    private static final String SIGN_IN_STATUS_UNAVAILBLE_MESSAGE = "";

    /** Reference to the SignIn result. */
    private GoogleSignInResult signInResult;

    /**
     * Constructor.
     * @param signInResult the GoogleSignInResult.
     */
    public GoogleSignInException(final GoogleSignInResult signInResult) {
        super(signInResult.getStatus().getStatusMessage() != null
            ? signInResult.getStatus().getStatusMessage() : signInResult.getStatus().toString());
        this.signInResult = signInResult;
    }

    /**
     * Get the reference to SignIn result.
     * @return GoogleSignInResult containing error status information.
     */
    public GoogleSignInResult getSignInResult() {
        return signInResult;
    }
}

