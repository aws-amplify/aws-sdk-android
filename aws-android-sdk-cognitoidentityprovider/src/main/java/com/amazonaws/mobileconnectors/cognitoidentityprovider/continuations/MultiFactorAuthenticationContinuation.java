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
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserCodeDeliveryDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler;

/**
 * This is a Continuation for multi-factor authentication.
 */
public class MultiFactorAuthenticationContinuation implements CognitoIdentityProviderContinuation<CognitoUserCodeDeliveryDetails> {

    // Boolean constants used to indicate where this continuation will run.
    final public static boolean RUN_IN_BACKGROUND = true;
    final public static boolean RUN_IN_CURRENT = false;

    final private AuthenticationHandler callback;
    final private CognitoUser user;
    final private String authState;
    final private boolean runInBackground;
    private String mfaCode = null;
    private CognitoUserCodeDeliveryDetails parameters = null;

    /**
     * Constructs a multi-factor authentication continuation.
     *
     * @param user                  REQUIRED: Reference to the {@link CognitoUser} object.
     * @param codeDeliveryDetails   REQUIRED: Contains the medium to which the code was delivered.
     * @param runInBackground       REQUIRED: Represents where this continuation has to run.
     * @param callback              REQUIRED: Callback to interact with the app.
     */
    public MultiFactorAuthenticationContinuation(CognitoUser user,
                                                 String authState,
                                                 CognitoUserCodeDeliveryDetails codeDeliveryDetails,
                                                 boolean runInBackground,
                                                 AuthenticationHandler callback) {
        this.user = user;
        this.authState = authState;
        this.callback = callback;
        this.runInBackground = runInBackground;
        parameters = codeDeliveryDetails;
    }

    /**
     * This method returns the medium where this multi-factor authentication code was sent.
     *
     * @return medium where the code was sent (e.g. email, sms).
     */
    public CognitoUserCodeDeliveryDetails getParameters(){
        return this.parameters;
    }

    /**
     * Call this to continue with the authentication process.
     */
    public void continueTask(){
        if(runInBackground){
            user.sendMFACodeInBackground(mfaCode, authState, parameters, callback);
        }
        else{
            user.sendMFACode(mfaCode, authState, parameters, callback);
        }
    }

    /**
     * Add the multi-factor authentication code. This code will be used to complete the authentication.
     *
     * @param mfaCode
     */
    public void setMfaCode(String mfaCode) {
        this.mfaCode = mfaCode;
    }
}
