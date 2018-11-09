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

/**
 *
 */
public enum SignInState {
    /**
     * Next challenge is to supply an SMS_MFA_CODE, delivered via SMS.
     */
    SMS_MFA("CONFIRMATION_CODE"),

    /**
     * Next challenge is to supply PASSWORD_CLAIM_SIGNATURE, PASSWORD_CLAIM_SECRET_BLOCK, and TIMESTAMP after the client-side SRP calculations.
     */
    PASSWORD_VERIFIER("PASSWORD_VERIFIER"),

    /**
     * This is returned if your custom authentication flow determines that the user should pass another challenge before tokens are issued.
     */
    CUSTOM_CHALLENGE("CUSTOM_CHALLENGE"),

    /**
     * If device tracking was enabled on your user pool and the previous challenges were passed, this challenge is returned so that Amazon Cognito can start tracking this device.
     */
    DEVICE_SRP_AUTH("DEVICE_SRP_AUTH"),

    /**
     * Similar to PASSWORD_VERIFIER, but for devices only.
     */
    DEVICE_PASSWORD_VERIFIER("DEVICE_PASSWORD_VERIFIER"),

    /**
     * This is returned if you need to authenticate with USERNAME and PASSWORD directly. An app client must be enabled to use this flow.
     */
    ADMIN_NO_SRP_AUTH("ADMIN_NO_SRP_AUTH"),

    /**
     * For users which are required to change their passwords after successful first login. This challenge should be passed with NEW_PASSWORD and any other required attributes.
     */
    NEW_PASSWORD_REQUIRED("NEW_PASSWORD_REQUIRED"),

    /**
     * The flow is completed and no further steps are possible.
     */
    DONE("This means the flow is complete."),

    /**
     * Unknown sign-in state, potentially unsupported state
     */
    UNKNOWN("UNKNOWN");

    private final String serviceText;

    SignInState(final String serviceText) {
        this.serviceText = serviceText;
    }

    public boolean equals(final String serviceText) {
        return this.serviceText.equals(serviceText);
    }
}
