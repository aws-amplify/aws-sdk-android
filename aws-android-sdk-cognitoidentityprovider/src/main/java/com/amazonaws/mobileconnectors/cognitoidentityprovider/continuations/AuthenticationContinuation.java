/*
 * Copyright 2013-2016 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler;

/**
 * Defines Continuation for authentication. This Continuation is used when user log-in details
 * are required to continue to authenticate the user and get tokens.
 */
public class AuthenticationContinuation implements CognitoIdentityProviderContinuation<String> {

    /**
     *  Boolean constant to indicate that the continuation will run in background.
     */
    final public static boolean RUN_IN_BACKGROUND = true;
    
    /**
     * Boolean constants used to indicate that the continuation will run in current thread.
     */
    final public static boolean RUN_IN_CURRENT = false;

    /**
     * An instance of {@link CognitoUser} referring to the user, for whom this continuation was created. 
     */
    final private CognitoUser user;
    
    /**
     * Authentication callback handler.
     */
    final private AuthenticationHandler callback;
    
    /**
     * Indicates if this continuation has to run in a background thread.
     */
    final private boolean runInBackground;

    /**
     * Users authentication details details required. 
     */
    private AuthenticationDetails authenticationDetails = null;

    /**
     * Constructs a new continuation in the authentication process.
     *
     * @param user                  REQUIRED: Reference to the {@link CognitoUser} object.
     * @param runInBackground       REQUIRED: Represents where this continuation has to run.
     * @param callback              REQUIRED: Callback to interact with the app
     */
    public AuthenticationContinuation(CognitoUser user, boolean runInBackground, AuthenticationHandler callback) {
        this.user = user;
        this.callback = callback;
        this.runInBackground = runInBackground;
    }

    /**
     * Returns the parameters required for this continuation.
     *
     * @return
     */
    public String getParameters() {
        return "AuthenticationDetails";
    }

    /**
     * Call this to continue with the authentication process.
     */
    public void continueTask() {
        if (runInBackground) {
            user.authenticateUserInBackground(authenticationDetails, callback);
        } else {
            user.authenticateUser(authenticationDetails, callback);
        }
    }

    /**
     * Set details required to continue with this authentication.
     *
     * @param authenticationDetails
     */
    public void setAuthenticationDetails(AuthenticationDetails authenticationDetails) {
        this.authenticationDetails = authenticationDetails;
    }
}
