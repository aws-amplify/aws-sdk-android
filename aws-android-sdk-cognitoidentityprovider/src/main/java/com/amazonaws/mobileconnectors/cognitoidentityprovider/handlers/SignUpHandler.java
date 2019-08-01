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

package com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.services.cognitoidentityprovider.model.SignUpResult;

/**
 * Callback for user Sign-up.
 */
public interface SignUpHandler {
    /**
     * This method is called successfully registering a new user.
     * Confirming the user may be required to activate the users account.
     *
     * @param user {@link CognitoUser}
     * @param signUpResult The result of a sign up action.
     */
    public void onSuccess(CognitoUser user, SignUpResult signUpResult);

    /**
     * This method is called when user registration has failed.
     * Probe {@code exception} for cause of the failure.
     *
     * @param exception REQUIRED: Failure details.
     */
    public void onFailure(Exception exception);
}
