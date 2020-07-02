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
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler;

import java.util.Collections;
import java.util.Map;

/**
 * Defines Continuation for authentication. This Continuation is used when user log-in details
 * are required to continue to authenticate the user and get tokens.
 */
public class AuthenticationContinuation implements CognitoIdentityProviderContinuation<String> {

    // Boolean constants used to indicate where this continuation will run.
    /**
     * Run in background.
     */
    public static final boolean RUN_IN_BACKGROUND = true;
    /**
     * Run on current thread.
     */
    public static final boolean RUN_IN_CURRENT = false;

    // Data required to continue with the authentication process.
    private final CognitoUser user;
    private final Context context;
    private final AuthenticationHandler callback;
    private final boolean runInBackground;

    private AuthenticationDetails authenticationDetails = null;
    private Map<String, String> clientMetadata;

    /**
     * Constructs a new continuation in the authentication process.
     *
     * @param user
     * @param runInBackground
     * @param callback
     */
    /**
     * Constructs a new continuation in the authentication process.
     *
     * @param user                  REQUIRED: Reference to the {@link CognitoUser} object.
     * @param context               REQUIRED: Application context to manage threads.
     * @param runInBackground       REQUIRED: Represents where this continuation has to run.
     * @param callback              REQUIRED: Callback to interact with the app.
     */
    public AuthenticationContinuation(CognitoUser user,
                                      Context context,
                                      boolean runInBackground,
                                      AuthenticationHandler callback) {
        this.user = user;
        this.context = context;
        this.runInBackground = runInBackground;
        this.callback = callback;
        this.clientMetadata = Collections.emptyMap();
    }

    /**
     * <p>
     * <code>clientMetadata</code> is a map of custom key-value pairs that you can provide as input for any
     * custom work flows. Accessor method for <code>clientMetadata</code>.
     * </p>
     * @return ClientMetadata
     */
    public Map<String, String> getClientMetaData() {
        return clientMetadata;
    }

    /**
     * Mutator for <code>clientMetadata</code>.
     * @param clientMetadata Metadata to be passed as input to the lambda triggers.
     */
    public void setClientMetaData(Map<String, String> clientMetadata) {
        this.clientMetadata.clear();
        this.clientMetadata.putAll(clientMetadata);
    }

    /**
     * Returns the parameters required for this continuation.
     *
     * @return
     */
    @Override
    public String getParameters() {
        return "AuthenticationDetails";
    }

    /**
     * Continues the authentications process by responding to the "PASSWORD_VERIFIER" challenge with
     * username and password. Depending upon the initial call, the response call is name in the current
     * or the background thread.
     *
     */
    @Override
    public void continueTask() {
        if (runInBackground) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    final Handler handler = new Handler(context.getMainLooper());
                    Runnable nextStep;
                    try {
                        nextStep = user.initiateUserAuthentication(clientMetadata, authenticationDetails, callback, RUN_IN_BACKGROUND);
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
                nextStep = user.initiateUserAuthentication(clientMetadata, authenticationDetails, callback, RUN_IN_CURRENT);
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
     * Set details required to continue with this authentication.
     *
     * @param authenticationDetails @see {@link AuthenticationDetails}
     */
    public void setAuthenticationDetails(AuthenticationDetails authenticationDetails) {
        this.authenticationDetails = authenticationDetails;
    }
}
