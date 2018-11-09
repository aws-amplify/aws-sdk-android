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

import java.util.Map;

/**
 * The result from signing-in. Check the state to determine the next step.
 */
public class SignInResult {
    private final SignInState signInState;
    private final Map<String, String> parameters;
    private final UserCodeDeliveryDetails codeDetails;

    public static final SignInResult DONE = new SignInResult(SignInState.DONE);

    private SignInResult(SignInState signInState) {
        this.signInState = signInState;
        this.parameters = null;
        this.codeDetails = null;
    }

    public SignInResult(SignInState signInState, Map<String, String> parameters) {
        this.signInState = signInState;
        this.parameters = parameters;
        this.codeDetails = null;
    }

    public SignInResult(SignInState signInState, UserCodeDeliveryDetails codeDetails) {
        this.signInState = signInState;
        this.parameters = null;
        this.codeDetails = codeDetails;
    }

    public SignInState getSignInState() {
        return signInState;
    }

    /**
     * Used to determine the type of challenge that is being present from the service
     *
     * @return map of values used to determine the type of challenge that is being present from the service
     */
    public Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * Description of where the confirmation code was sent
     * @return description of where the confirmation code was sent
     */
    public UserCodeDeliveryDetails getCodeDetails() {
        return codeDetails;
    }
}
