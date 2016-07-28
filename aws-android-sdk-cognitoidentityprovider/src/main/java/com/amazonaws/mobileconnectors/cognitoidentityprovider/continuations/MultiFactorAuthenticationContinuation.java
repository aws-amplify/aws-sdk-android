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

import android.content.Context;
import android.os.Handler;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserCodeDeliveryDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler;
import com.amazonaws.services.cognitoidentityprovider.model.RespondToAuthChallengeRequest;
import com.amazonaws.services.cognitoidentityprovider.model.RespondToAuthChallengeResult;

/**
 * This is a Continuation for multi-factor authentication.
 */
public class MultiFactorAuthenticationContinuation implements CognitoIdentityProviderContinuation<CognitoUserCodeDeliveryDetails> {

    // Boolean constants used to indicate where this continuation will run.
    final public static boolean RUN_IN_BACKGROUND = true;
    final public static boolean RUN_IN_CURRENT = false;

    final private CognitoUser user;
    final private Context context;
    final private RespondToAuthChallengeResult challenge;
    final private boolean runInBackground;
    final private AuthenticationHandler callback;
    private String mfaCode = null;

    /**
     * Constructs a multi-factor authentication continuation.
     *
     * @param user                  REQUIRED: Reference to the {@link CognitoUser} object.
     * @param challenge             REQUIRED: Contains the MFA Challenge.
     * @param runInBackground       REQUIRED: Represents where this continuation has to run.
     * @param callback              REQUIRED: Callback to interact with the app.
     */
    public MultiFactorAuthenticationContinuation(CognitoUser user,
                                                 Context context,
                                                 RespondToAuthChallengeResult challenge,
                                                 boolean runInBackground,
                                                 AuthenticationHandler callback) {
        this.user = user;
        this.context = context;
        this.callback = callback;
        this.runInBackground = runInBackground;
        this.challenge = challenge;
    }

    /**
     * This method returns the medium where this multi-factor authentication code was sent.
     *
     * @return medium where the code was sent (e.g. email, sms).
     */
    public CognitoUserCodeDeliveryDetails getParameters(){
        return new CognitoUserCodeDeliveryDetails(challenge.getChallengeParameters().get("CODE_DELIVERY_DESTINATION"),
                challenge.getChallengeParameters().get("CODE_DELIVERY_DELIVERY_MEDIUM"),
                null);
    }

    /**
     * Call this to continue with the authentication process.
     */
    public void continueTask(){
        if (runInBackground) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Handler handler = new Handler(context.getMainLooper());
                    Runnable nextStep;
                    try {

                        nextStep = user.respondToMfaChallenge(mfaCode, challenge, callback, RUN_IN_BACKGROUND);
                    } catch (final Exception e) {
                        nextStep = new Runnable() {
                            @Override
                            public void run() {
                                callback.onFailure(e);
                            }
                        };
                    }
                    handler.post(nextStep);
                }
            }).start();
        } else {
            Runnable nextStep;
            try {
                nextStep = user.respondToMfaChallenge(mfaCode, challenge, callback, RUN_IN_CURRENT);
            } catch (final Exception e) {
                nextStep = new Runnable() {
                    @Override
                    public void run() {
                        callback.onFailure(e);
                    }
                };
            }
            nextStep.run();
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
