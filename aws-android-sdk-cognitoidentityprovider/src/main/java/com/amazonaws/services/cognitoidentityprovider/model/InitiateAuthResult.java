/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * Initiates the authentication response.
 * </p>
 */
public class InitiateAuthResult implements Serializable {
    /**
     * <p>
     * The name of the challenge which you are responding to with this call.
     * This is returned to you in the <code>AdminInitiateAuth</code> response if
     * you need to pass another challenge.
     * </p>
     * <p>
     * Valid values include the following. Note that all of these challenges
     * require <code>USERNAME</code> and <code>SECRET_HASH</code> (if
     * applicable) in the parameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: Next challenge is to supply an
     * <code>SMS_MFA_CODE</code>, delivered via SMS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: Next challenge is to supply
     * <code>PASSWORD_CLAIM_SIGNATURE</code>,
     * <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and <code>TIMESTAMP</code>
     * after the client-side SRP calculations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_CHALLENGE</code>: This is returned if your custom
     * authentication flow determines that the user should pass another
     * challenge before tokens are issued.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled on your user
     * pool and the previous challenges were passed, this challenge is returned
     * so that Amazon Cognito can start tracking this device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to
     * <code>PASSWORD_VERIFIER</code>, but for devices only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: For users which are required to
     * change their passwords after successful first login. This challenge
     * should be passed with <code>NEW_PASSWORD</code> and any other required
     * attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, SOFTWARE_TOKEN_MFA, SELECT_MFA_TYPE,
     * MFA_SETUP, PASSWORD_VERIFIER, CUSTOM_CHALLENGE, DEVICE_SRP_AUTH,
     * DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH, NEW_PASSWORD_REQUIRED
     */
    private String challengeName;

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls
     * to the service. If the or API call determines that the caller needs to go
     * through another challenge, they return a session with other challenge
     * parameters. This session should be passed as it is to the next
     * <code>RespondToAuthChallenge</code> API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String session;

    /**
     * <p>
     * The challenge parameters. These are returned to you in the
     * <code>InitiateAuth</code> response if you need to pass another challenge.
     * The responses in this parameter should be used to compute inputs to the
     * next call (<code>RespondToAuthChallenge</code>).
     * </p>
     * <p>
     * All challenges require <code>USERNAME</code> and <code>SECRET_HASH</code>
     * (if applicable).
     * </p>
     */
    private java.util.Map<String, String> challengeParameters;

    /**
     * <p>
     * The result of the authentication response. This is only returned if the
     * caller does not need to pass another challenge. If the caller does need
     * to pass another challenge before it gets tokens,
     * <code>ChallengeName</code>, <code>ChallengeParameters</code>, and
     * <code>Session</code> are returned.
     * </p>
     */
    private AuthenticationResultType authenticationResult;

    /**
     * <p>
     * The name of the challenge which you are responding to with this call.
     * This is returned to you in the <code>AdminInitiateAuth</code> response if
     * you need to pass another challenge.
     * </p>
     * <p>
     * Valid values include the following. Note that all of these challenges
     * require <code>USERNAME</code> and <code>SECRET_HASH</code> (if
     * applicable) in the parameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: Next challenge is to supply an
     * <code>SMS_MFA_CODE</code>, delivered via SMS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: Next challenge is to supply
     * <code>PASSWORD_CLAIM_SIGNATURE</code>,
     * <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and <code>TIMESTAMP</code>
     * after the client-side SRP calculations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_CHALLENGE</code>: This is returned if your custom
     * authentication flow determines that the user should pass another
     * challenge before tokens are issued.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled on your user
     * pool and the previous challenges were passed, this challenge is returned
     * so that Amazon Cognito can start tracking this device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to
     * <code>PASSWORD_VERIFIER</code>, but for devices only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: For users which are required to
     * change their passwords after successful first login. This challenge
     * should be passed with <code>NEW_PASSWORD</code> and any other required
     * attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, SOFTWARE_TOKEN_MFA, SELECT_MFA_TYPE,
     * MFA_SETUP, PASSWORD_VERIFIER, CUSTOM_CHALLENGE, DEVICE_SRP_AUTH,
     * DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH, NEW_PASSWORD_REQUIRED
     *
     * @return <p>
     *         The name of the challenge which you are responding to with this
     *         call. This is returned to you in the
     *         <code>AdminInitiateAuth</code> response if you need to pass
     *         another challenge.
     *         </p>
     *         <p>
     *         Valid values include the following. Note that all of these
     *         challenges require <code>USERNAME</code> and
     *         <code>SECRET_HASH</code> (if applicable) in the parameters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SMS_MFA</code>: Next challenge is to supply an
     *         <code>SMS_MFA_CODE</code>, delivered via SMS.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PASSWORD_VERIFIER</code>: Next challenge is to supply
     *         <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *         <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and
     *         <code>TIMESTAMP</code> after the client-side SRP calculations.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CUSTOM_CHALLENGE</code>: This is returned if your custom
     *         authentication flow determines that the user should pass another
     *         challenge before tokens are issued.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled on
     *         your user pool and the previous challenges were passed, this
     *         challenge is returned so that Amazon Cognito can start tracking
     *         this device.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to
     *         <code>PASSWORD_VERIFIER</code>, but for devices only.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEW_PASSWORD_REQUIRED</code>: For users which are required
     *         to change their passwords after successful first login. This
     *         challenge should be passed with <code>NEW_PASSWORD</code> and any
     *         other required attributes.
     *         </p>
     *         </li>
     *         </ul>
     * @see ChallengeNameType
     */
    public String getChallengeName() {
        return challengeName;
    }

    /**
     * <p>
     * The name of the challenge which you are responding to with this call.
     * This is returned to you in the <code>AdminInitiateAuth</code> response if
     * you need to pass another challenge.
     * </p>
     * <p>
     * Valid values include the following. Note that all of these challenges
     * require <code>USERNAME</code> and <code>SECRET_HASH</code> (if
     * applicable) in the parameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: Next challenge is to supply an
     * <code>SMS_MFA_CODE</code>, delivered via SMS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: Next challenge is to supply
     * <code>PASSWORD_CLAIM_SIGNATURE</code>,
     * <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and <code>TIMESTAMP</code>
     * after the client-side SRP calculations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_CHALLENGE</code>: This is returned if your custom
     * authentication flow determines that the user should pass another
     * challenge before tokens are issued.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled on your user
     * pool and the previous challenges were passed, this challenge is returned
     * so that Amazon Cognito can start tracking this device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to
     * <code>PASSWORD_VERIFIER</code>, but for devices only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: For users which are required to
     * change their passwords after successful first login. This challenge
     * should be passed with <code>NEW_PASSWORD</code> and any other required
     * attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, SOFTWARE_TOKEN_MFA, SELECT_MFA_TYPE,
     * MFA_SETUP, PASSWORD_VERIFIER, CUSTOM_CHALLENGE, DEVICE_SRP_AUTH,
     * DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH, NEW_PASSWORD_REQUIRED
     *
     * @param challengeName <p>
     *            The name of the challenge which you are responding to with
     *            this call. This is returned to you in the
     *            <code>AdminInitiateAuth</code> response if you need to pass
     *            another challenge.
     *            </p>
     *            <p>
     *            Valid values include the following. Note that all of these
     *            challenges require <code>USERNAME</code> and
     *            <code>SECRET_HASH</code> (if applicable) in the parameters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SMS_MFA</code>: Next challenge is to supply an
     *            <code>SMS_MFA_CODE</code>, delivered via SMS.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PASSWORD_VERIFIER</code>: Next challenge is to supply
     *            <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *            <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and
     *            <code>TIMESTAMP</code> after the client-side SRP calculations.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CUSTOM_CHALLENGE</code>: This is returned if your custom
     *            authentication flow determines that the user should pass
     *            another challenge before tokens are issued.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled
     *            on your user pool and the previous challenges were passed,
     *            this challenge is returned so that Amazon Cognito can start
     *            tracking this device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to
     *            <code>PASSWORD_VERIFIER</code>, but for devices only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NEW_PASSWORD_REQUIRED</code>: For users which are
     *            required to change their passwords after successful first
     *            login. This challenge should be passed with
     *            <code>NEW_PASSWORD</code> and any other required attributes.
     *            </p>
     *            </li>
     *            </ul>
     * @see ChallengeNameType
     */
    public void setChallengeName(String challengeName) {
        this.challengeName = challengeName;
    }

    /**
     * <p>
     * The name of the challenge which you are responding to with this call.
     * This is returned to you in the <code>AdminInitiateAuth</code> response if
     * you need to pass another challenge.
     * </p>
     * <p>
     * Valid values include the following. Note that all of these challenges
     * require <code>USERNAME</code> and <code>SECRET_HASH</code> (if
     * applicable) in the parameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: Next challenge is to supply an
     * <code>SMS_MFA_CODE</code>, delivered via SMS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: Next challenge is to supply
     * <code>PASSWORD_CLAIM_SIGNATURE</code>,
     * <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and <code>TIMESTAMP</code>
     * after the client-side SRP calculations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_CHALLENGE</code>: This is returned if your custom
     * authentication flow determines that the user should pass another
     * challenge before tokens are issued.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled on your user
     * pool and the previous challenges were passed, this challenge is returned
     * so that Amazon Cognito can start tracking this device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to
     * <code>PASSWORD_VERIFIER</code>, but for devices only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: For users which are required to
     * change their passwords after successful first login. This challenge
     * should be passed with <code>NEW_PASSWORD</code> and any other required
     * attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, SOFTWARE_TOKEN_MFA, SELECT_MFA_TYPE,
     * MFA_SETUP, PASSWORD_VERIFIER, CUSTOM_CHALLENGE, DEVICE_SRP_AUTH,
     * DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH, NEW_PASSWORD_REQUIRED
     *
     * @param challengeName <p>
     *            The name of the challenge which you are responding to with
     *            this call. This is returned to you in the
     *            <code>AdminInitiateAuth</code> response if you need to pass
     *            another challenge.
     *            </p>
     *            <p>
     *            Valid values include the following. Note that all of these
     *            challenges require <code>USERNAME</code> and
     *            <code>SECRET_HASH</code> (if applicable) in the parameters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SMS_MFA</code>: Next challenge is to supply an
     *            <code>SMS_MFA_CODE</code>, delivered via SMS.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PASSWORD_VERIFIER</code>: Next challenge is to supply
     *            <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *            <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and
     *            <code>TIMESTAMP</code> after the client-side SRP calculations.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CUSTOM_CHALLENGE</code>: This is returned if your custom
     *            authentication flow determines that the user should pass
     *            another challenge before tokens are issued.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled
     *            on your user pool and the previous challenges were passed,
     *            this challenge is returned so that Amazon Cognito can start
     *            tracking this device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to
     *            <code>PASSWORD_VERIFIER</code>, but for devices only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NEW_PASSWORD_REQUIRED</code>: For users which are
     *            required to change their passwords after successful first
     *            login. This challenge should be passed with
     *            <code>NEW_PASSWORD</code> and any other required attributes.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChallengeNameType
     */
    public InitiateAuthResult withChallengeName(String challengeName) {
        this.challengeName = challengeName;
        return this;
    }

    /**
     * <p>
     * The name of the challenge which you are responding to with this call.
     * This is returned to you in the <code>AdminInitiateAuth</code> response if
     * you need to pass another challenge.
     * </p>
     * <p>
     * Valid values include the following. Note that all of these challenges
     * require <code>USERNAME</code> and <code>SECRET_HASH</code> (if
     * applicable) in the parameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: Next challenge is to supply an
     * <code>SMS_MFA_CODE</code>, delivered via SMS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: Next challenge is to supply
     * <code>PASSWORD_CLAIM_SIGNATURE</code>,
     * <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and <code>TIMESTAMP</code>
     * after the client-side SRP calculations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_CHALLENGE</code>: This is returned if your custom
     * authentication flow determines that the user should pass another
     * challenge before tokens are issued.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled on your user
     * pool and the previous challenges were passed, this challenge is returned
     * so that Amazon Cognito can start tracking this device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to
     * <code>PASSWORD_VERIFIER</code>, but for devices only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: For users which are required to
     * change their passwords after successful first login. This challenge
     * should be passed with <code>NEW_PASSWORD</code> and any other required
     * attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, SOFTWARE_TOKEN_MFA, SELECT_MFA_TYPE,
     * MFA_SETUP, PASSWORD_VERIFIER, CUSTOM_CHALLENGE, DEVICE_SRP_AUTH,
     * DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH, NEW_PASSWORD_REQUIRED
     *
     * @param challengeName <p>
     *            The name of the challenge which you are responding to with
     *            this call. This is returned to you in the
     *            <code>AdminInitiateAuth</code> response if you need to pass
     *            another challenge.
     *            </p>
     *            <p>
     *            Valid values include the following. Note that all of these
     *            challenges require <code>USERNAME</code> and
     *            <code>SECRET_HASH</code> (if applicable) in the parameters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SMS_MFA</code>: Next challenge is to supply an
     *            <code>SMS_MFA_CODE</code>, delivered via SMS.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PASSWORD_VERIFIER</code>: Next challenge is to supply
     *            <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *            <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and
     *            <code>TIMESTAMP</code> after the client-side SRP calculations.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CUSTOM_CHALLENGE</code>: This is returned if your custom
     *            authentication flow determines that the user should pass
     *            another challenge before tokens are issued.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled
     *            on your user pool and the previous challenges were passed,
     *            this challenge is returned so that Amazon Cognito can start
     *            tracking this device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to
     *            <code>PASSWORD_VERIFIER</code>, but for devices only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NEW_PASSWORD_REQUIRED</code>: For users which are
     *            required to change their passwords after successful first
     *            login. This challenge should be passed with
     *            <code>NEW_PASSWORD</code> and any other required attributes.
     *            </p>
     *            </li>
     *            </ul>
     * @see ChallengeNameType
     */
    public void setChallengeName(ChallengeNameType challengeName) {
        this.challengeName = challengeName.toString();
    }

    /**
     * <p>
     * The name of the challenge which you are responding to with this call.
     * This is returned to you in the <code>AdminInitiateAuth</code> response if
     * you need to pass another challenge.
     * </p>
     * <p>
     * Valid values include the following. Note that all of these challenges
     * require <code>USERNAME</code> and <code>SECRET_HASH</code> (if
     * applicable) in the parameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: Next challenge is to supply an
     * <code>SMS_MFA_CODE</code>, delivered via SMS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: Next challenge is to supply
     * <code>PASSWORD_CLAIM_SIGNATURE</code>,
     * <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and <code>TIMESTAMP</code>
     * after the client-side SRP calculations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_CHALLENGE</code>: This is returned if your custom
     * authentication flow determines that the user should pass another
     * challenge before tokens are issued.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled on your user
     * pool and the previous challenges were passed, this challenge is returned
     * so that Amazon Cognito can start tracking this device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to
     * <code>PASSWORD_VERIFIER</code>, but for devices only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: For users which are required to
     * change their passwords after successful first login. This challenge
     * should be passed with <code>NEW_PASSWORD</code> and any other required
     * attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, SOFTWARE_TOKEN_MFA, SELECT_MFA_TYPE,
     * MFA_SETUP, PASSWORD_VERIFIER, CUSTOM_CHALLENGE, DEVICE_SRP_AUTH,
     * DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH, NEW_PASSWORD_REQUIRED
     *
     * @param challengeName <p>
     *            The name of the challenge which you are responding to with
     *            this call. This is returned to you in the
     *            <code>AdminInitiateAuth</code> response if you need to pass
     *            another challenge.
     *            </p>
     *            <p>
     *            Valid values include the following. Note that all of these
     *            challenges require <code>USERNAME</code> and
     *            <code>SECRET_HASH</code> (if applicable) in the parameters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SMS_MFA</code>: Next challenge is to supply an
     *            <code>SMS_MFA_CODE</code>, delivered via SMS.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PASSWORD_VERIFIER</code>: Next challenge is to supply
     *            <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *            <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and
     *            <code>TIMESTAMP</code> after the client-side SRP calculations.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CUSTOM_CHALLENGE</code>: This is returned if your custom
     *            authentication flow determines that the user should pass
     *            another challenge before tokens are issued.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled
     *            on your user pool and the previous challenges were passed,
     *            this challenge is returned so that Amazon Cognito can start
     *            tracking this device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to
     *            <code>PASSWORD_VERIFIER</code>, but for devices only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NEW_PASSWORD_REQUIRED</code>: For users which are
     *            required to change their passwords after successful first
     *            login. This challenge should be passed with
     *            <code>NEW_PASSWORD</code> and any other required attributes.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChallengeNameType
     */
    public InitiateAuthResult withChallengeName(ChallengeNameType challengeName) {
        this.challengeName = challengeName.toString();
        return this;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls
     * to the service. If the or API call determines that the caller needs to go
     * through another challenge, they return a session with other challenge
     * parameters. This session should be passed as it is to the next
     * <code>RespondToAuthChallenge</code> API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The session which should be passed both ways in
     *         challenge-response calls to the service. If the or API call
     *         determines that the caller needs to go through another challenge,
     *         they return a session with other challenge parameters. This
     *         session should be passed as it is to the next
     *         <code>RespondToAuthChallenge</code> API call.
     *         </p>
     */
    public String getSession() {
        return session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls
     * to the service. If the or API call determines that the caller needs to go
     * through another challenge, they return a session with other challenge
     * parameters. This session should be passed as it is to the next
     * <code>RespondToAuthChallenge</code> API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param session <p>
     *            The session which should be passed both ways in
     *            challenge-response calls to the service. If the or API call
     *            determines that the caller needs to go through another
     *            challenge, they return a session with other challenge
     *            parameters. This session should be passed as it is to the next
     *            <code>RespondToAuthChallenge</code> API call.
     *            </p>
     */
    public void setSession(String session) {
        this.session = session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls
     * to the service. If the or API call determines that the caller needs to go
     * through another challenge, they return a session with other challenge
     * parameters. This session should be passed as it is to the next
     * <code>RespondToAuthChallenge</code> API call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param session <p>
     *            The session which should be passed both ways in
     *            challenge-response calls to the service. If the or API call
     *            determines that the caller needs to go through another
     *            challenge, they return a session with other challenge
     *            parameters. This session should be passed as it is to the next
     *            <code>RespondToAuthChallenge</code> API call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InitiateAuthResult withSession(String session) {
        this.session = session;
        return this;
    }

    /**
     * <p>
     * The challenge parameters. These are returned to you in the
     * <code>InitiateAuth</code> response if you need to pass another challenge.
     * The responses in this parameter should be used to compute inputs to the
     * next call (<code>RespondToAuthChallenge</code>).
     * </p>
     * <p>
     * All challenges require <code>USERNAME</code> and <code>SECRET_HASH</code>
     * (if applicable).
     * </p>
     *
     * @return <p>
     *         The challenge parameters. These are returned to you in the
     *         <code>InitiateAuth</code> response if you need to pass another
     *         challenge. The responses in this parameter should be used to
     *         compute inputs to the next call (
     *         <code>RespondToAuthChallenge</code>).
     *         </p>
     *         <p>
     *         All challenges require <code>USERNAME</code> and
     *         <code>SECRET_HASH</code> (if applicable).
     *         </p>
     */
    public java.util.Map<String, String> getChallengeParameters() {
        return challengeParameters;
    }

    /**
     * <p>
     * The challenge parameters. These are returned to you in the
     * <code>InitiateAuth</code> response if you need to pass another challenge.
     * The responses in this parameter should be used to compute inputs to the
     * next call (<code>RespondToAuthChallenge</code>).
     * </p>
     * <p>
     * All challenges require <code>USERNAME</code> and <code>SECRET_HASH</code>
     * (if applicable).
     * </p>
     *
     * @param challengeParameters <p>
     *            The challenge parameters. These are returned to you in the
     *            <code>InitiateAuth</code> response if you need to pass another
     *            challenge. The responses in this parameter should be used to
     *            compute inputs to the next call (
     *            <code>RespondToAuthChallenge</code>).
     *            </p>
     *            <p>
     *            All challenges require <code>USERNAME</code> and
     *            <code>SECRET_HASH</code> (if applicable).
     *            </p>
     */
    public void setChallengeParameters(java.util.Map<String, String> challengeParameters) {
        this.challengeParameters = challengeParameters;
    }

    /**
     * <p>
     * The challenge parameters. These are returned to you in the
     * <code>InitiateAuth</code> response if you need to pass another challenge.
     * The responses in this parameter should be used to compute inputs to the
     * next call (<code>RespondToAuthChallenge</code>).
     * </p>
     * <p>
     * All challenges require <code>USERNAME</code> and <code>SECRET_HASH</code>
     * (if applicable).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param challengeParameters <p>
     *            The challenge parameters. These are returned to you in the
     *            <code>InitiateAuth</code> response if you need to pass another
     *            challenge. The responses in this parameter should be used to
     *            compute inputs to the next call (
     *            <code>RespondToAuthChallenge</code>).
     *            </p>
     *            <p>
     *            All challenges require <code>USERNAME</code> and
     *            <code>SECRET_HASH</code> (if applicable).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InitiateAuthResult withChallengeParameters(
            java.util.Map<String, String> challengeParameters) {
        this.challengeParameters = challengeParameters;
        return this;
    }

    /**
     * <p>
     * The challenge parameters. These are returned to you in the
     * <code>InitiateAuth</code> response if you need to pass another challenge.
     * The responses in this parameter should be used to compute inputs to the
     * next call (<code>RespondToAuthChallenge</code>).
     * </p>
     * <p>
     * All challenges require <code>USERNAME</code> and <code>SECRET_HASH</code>
     * (if applicable).
     * </p>
     * <p>
     * The method adds a new key-value pair into ChallengeParameters parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into ChallengeParameters.
     * @param value The corresponding value of the entry to be added into
     *            ChallengeParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InitiateAuthResult addChallengeParametersEntry(String key, String value) {
        if (null == this.challengeParameters) {
            this.challengeParameters = new java.util.HashMap<String, String>();
        }
        if (this.challengeParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.challengeParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ChallengeParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public InitiateAuthResult clearChallengeParametersEntries() {
        this.challengeParameters = null;
        return this;
    }

    /**
     * <p>
     * The result of the authentication response. This is only returned if the
     * caller does not need to pass another challenge. If the caller does need
     * to pass another challenge before it gets tokens,
     * <code>ChallengeName</code>, <code>ChallengeParameters</code>, and
     * <code>Session</code> are returned.
     * </p>
     *
     * @return <p>
     *         The result of the authentication response. This is only returned
     *         if the caller does not need to pass another challenge. If the
     *         caller does need to pass another challenge before it gets tokens,
     *         <code>ChallengeName</code>, <code>ChallengeParameters</code>, and
     *         <code>Session</code> are returned.
     *         </p>
     */
    public AuthenticationResultType getAuthenticationResult() {
        return authenticationResult;
    }

    /**
     * <p>
     * The result of the authentication response. This is only returned if the
     * caller does not need to pass another challenge. If the caller does need
     * to pass another challenge before it gets tokens,
     * <code>ChallengeName</code>, <code>ChallengeParameters</code>, and
     * <code>Session</code> are returned.
     * </p>
     *
     * @param authenticationResult <p>
     *            The result of the authentication response. This is only
     *            returned if the caller does not need to pass another
     *            challenge. If the caller does need to pass another challenge
     *            before it gets tokens, <code>ChallengeName</code>,
     *            <code>ChallengeParameters</code>, and <code>Session</code> are
     *            returned.
     *            </p>
     */
    public void setAuthenticationResult(AuthenticationResultType authenticationResult) {
        this.authenticationResult = authenticationResult;
    }

    /**
     * <p>
     * The result of the authentication response. This is only returned if the
     * caller does not need to pass another challenge. If the caller does need
     * to pass another challenge before it gets tokens,
     * <code>ChallengeName</code>, <code>ChallengeParameters</code>, and
     * <code>Session</code> are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authenticationResult <p>
     *            The result of the authentication response. This is only
     *            returned if the caller does not need to pass another
     *            challenge. If the caller does need to pass another challenge
     *            before it gets tokens, <code>ChallengeName</code>,
     *            <code>ChallengeParameters</code>, and <code>Session</code> are
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InitiateAuthResult withAuthenticationResult(AuthenticationResultType authenticationResult) {
        this.authenticationResult = authenticationResult;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getChallengeName() != null)
            sb.append("ChallengeName: " + getChallengeName() + ",");
        if (getSession() != null)
            sb.append("Session: " + getSession() + ",");
        if (getChallengeParameters() != null)
            sb.append("ChallengeParameters: " + getChallengeParameters() + ",");
        if (getAuthenticationResult() != null)
            sb.append("AuthenticationResult: " + getAuthenticationResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChallengeName() == null) ? 0 : getChallengeName().hashCode());
        hashCode = prime * hashCode + ((getSession() == null) ? 0 : getSession().hashCode());
        hashCode = prime * hashCode
                + ((getChallengeParameters() == null) ? 0 : getChallengeParameters().hashCode());
        hashCode = prime * hashCode
                + ((getAuthenticationResult() == null) ? 0 : getAuthenticationResult().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InitiateAuthResult == false)
            return false;
        InitiateAuthResult other = (InitiateAuthResult) obj;

        if (other.getChallengeName() == null ^ this.getChallengeName() == null)
            return false;
        if (other.getChallengeName() != null
                && other.getChallengeName().equals(this.getChallengeName()) == false)
            return false;
        if (other.getSession() == null ^ this.getSession() == null)
            return false;
        if (other.getSession() != null && other.getSession().equals(this.getSession()) == false)
            return false;
        if (other.getChallengeParameters() == null ^ this.getChallengeParameters() == null)
            return false;
        if (other.getChallengeParameters() != null
                && other.getChallengeParameters().equals(this.getChallengeParameters()) == false)
            return false;
        if (other.getAuthenticationResult() == null ^ this.getAuthenticationResult() == null)
            return false;
        if (other.getAuthenticationResult() != null
                && other.getAuthenticationResult().equals(this.getAuthenticationResult()) == false)
            return false;
        return true;
    }
}
