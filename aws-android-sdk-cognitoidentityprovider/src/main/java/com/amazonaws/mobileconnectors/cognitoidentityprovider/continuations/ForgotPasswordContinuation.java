/*
 *  Copyright 2013-2016 Amazon.com,
 *  Inc. or its affiliates. All Rights Reserved.
 *
 *  Licensed under the Amazon Software License (the "License").
 *  You may not use this file except in compliance with the
 *  License. A copy of the License is located at
 *
 *      http://aws.amazon.com/asl/
 *
 *  or in the "license" file accompanying this file. This file is
 *  distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *  CONDITIONS OF ANY KIND, express or implied. See the License
 *  for the specific language governing permissions and
 *  limitations under the License.
 */

package com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserCodeDeliveryDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.ForgotPasswordHandler;

/**
 * This is a Continuation to set the password in the forgot password processing.
 */
public class ForgotPasswordContinuation implements CognitoIdentityProviderContinuation<CognitoUserCodeDeliveryDetails> {

    // Boolean constants used to indicate where this continuation will run.
    final public static boolean RUN_IN_BACKGROUND = true;
    final public static boolean RUN_IN_CURRENT = false;

    private final ForgotPasswordHandler callback;
    private final CognitoUser user;
    private final CognitoUserCodeDeliveryDetails parameters;
    private final boolean runInBackground;

    private String password = null;
    private String verificationCode = null;

    /**
     * Constructs a new Continuation for forgot password process.
     *
     * @param user                  REQUIRED: Reference to the {@link CognitoUser} object.
     * @param parameters
     * @param runInBackground       REQUIRED: Represents where this continuation has to run.
     * @param callback              REQUIRED: Callback to interact with the app.
     */
    public ForgotPasswordContinuation(CognitoUser user,
                                      CognitoUserCodeDeliveryDetails parameters,
                                      boolean runInBackground,
                                      ForgotPasswordHandler callback) {
        this.callback = callback;
        this.user = user;
        this.parameters = parameters;
        this.runInBackground = runInBackground;
    }

    /**
     * Returns Continuation parameters.
     * @return
     */
    public CognitoUserCodeDeliveryDetails getParameters(){
        return parameters;
    }

    /**
     * Call this method to continue with the forgot password processing.s
     */
    public void continueTask() {
        if(runInBackground){
            user.confirmPasswordInBackground(verificationCode, password, callback);
        }
        else{
            user.confirmPassword(verificationCode, password, callback);
        }
    }

    /**
     * Set the new password.
     *
     * @param password
     */
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * Set the verification code for this processing.
     *
     * @param verificationCode
     */
    public void setVerificationCode(String verificationCode){
        this.verificationCode = verificationCode;
    }
}