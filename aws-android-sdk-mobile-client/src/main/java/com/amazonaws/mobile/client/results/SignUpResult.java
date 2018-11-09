/*
 * Copyright 2018-2018 Amazon.com, Inc. or its affiliates.
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

package com.amazonaws.mobile.client.results;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;

/**
 * The result of a sign up action. Check the confirmation state and delivery details to proceed.
 */
public class SignUpResult {

    private final boolean signUpConfirmationState;
    private final UserCodeDeliveryDetails cognitoUserCodeDeliveryDetails;

    public SignUpResult(boolean signUpConfirmationState, UserCodeDeliveryDetails cognitoUserCodeDeliveryDetails) {
        this.signUpConfirmationState = signUpConfirmationState;
        this.cognitoUserCodeDeliveryDetails = cognitoUserCodeDeliveryDetails;
    }

    /**
     * if true, no further action is necessary
     * @return true - user is confirmed, no further action is necessary
     * false - check delivery details and call confirmSignUp
     */
    public boolean getConfirmationState() {
        return this.signUpConfirmationState;
    }

    /**
     * Determine where the confirmation code was sent
     * @return details of confirmation code delivery
     */
    public UserCodeDeliveryDetails getUserCodeDeliveryDetails() {
        return this.cognitoUserCodeDeliveryDetails;
    }
}
