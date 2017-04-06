/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The response to respond to the authentication challenge.
 * </p>
 */
public class RespondToAuthChallengeResult implements Serializable {
    /**
     * <p>
     * The challenge name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, PASSWORD_VERIFIER, CUSTOM_CHALLENGE,
     * DEVICE_SRP_AUTH, DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH,
     * NEW_PASSWORD_REQUIRED
     */
    private String challengeName;

    /**
     * <p>
     * The session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String session;

    /**
     * <p>
     * The challenge parameters.
     * </p>
     */
    private java.util.Map<String, String> challengeParameters;

    /**
     * <p>
     * The result type of the authentication result.
     * </p>
     */
    private AuthenticationResultType authenticationResult;

    /**
     * <p>
     * The challenge name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, PASSWORD_VERIFIER, CUSTOM_CHALLENGE,
     * DEVICE_SRP_AUTH, DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH,
     * NEW_PASSWORD_REQUIRED
     *
     * @return <p>
     *         The challenge name.
     *         </p>
     * @see ChallengeNameType
     */
    public String getChallengeName() {
        return challengeName;
    }

    /**
     * <p>
     * The challenge name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, PASSWORD_VERIFIER, CUSTOM_CHALLENGE,
     * DEVICE_SRP_AUTH, DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH,
     * NEW_PASSWORD_REQUIRED
     *
     * @param challengeName <p>
     *            The challenge name.
     *            </p>
     * @see ChallengeNameType
     */
    public void setChallengeName(String challengeName) {
        this.challengeName = challengeName;
    }

    /**
     * <p>
     * The challenge name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, PASSWORD_VERIFIER, CUSTOM_CHALLENGE,
     * DEVICE_SRP_AUTH, DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH,
     * NEW_PASSWORD_REQUIRED
     *
     * @param challengeName <p>
     *            The challenge name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChallengeNameType
     */
    public RespondToAuthChallengeResult withChallengeName(String challengeName) {
        this.challengeName = challengeName;
        return this;
    }

    /**
     * <p>
     * The challenge name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, PASSWORD_VERIFIER, CUSTOM_CHALLENGE,
     * DEVICE_SRP_AUTH, DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH,
     * NEW_PASSWORD_REQUIRED
     *
     * @param challengeName <p>
     *            The challenge name.
     *            </p>
     * @see ChallengeNameType
     */
    public void setChallengeName(ChallengeNameType challengeName) {
        this.challengeName = challengeName.toString();
    }

    /**
     * <p>
     * The challenge name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, PASSWORD_VERIFIER, CUSTOM_CHALLENGE,
     * DEVICE_SRP_AUTH, DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH,
     * NEW_PASSWORD_REQUIRED
     *
     * @param challengeName <p>
     *            The challenge name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChallengeNameType
     */
    public RespondToAuthChallengeResult withChallengeName(ChallengeNameType challengeName) {
        this.challengeName = challengeName.toString();
        return this;
    }

    /**
     * <p>
     * The session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The session.
     *         </p>
     */
    public String getSession() {
        return session;
    }

    /**
     * <p>
     * The session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param session <p>
     *            The session.
     *            </p>
     */
    public void setSession(String session) {
        this.session = session;
    }

    /**
     * <p>
     * The session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param session <p>
     *            The session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RespondToAuthChallengeResult withSession(String session) {
        this.session = session;
        return this;
    }

    /**
     * <p>
     * The challenge parameters.
     * </p>
     *
     * @return <p>
     *         The challenge parameters.
     *         </p>
     */
    public java.util.Map<String, String> getChallengeParameters() {
        return challengeParameters;
    }

    /**
     * <p>
     * The challenge parameters.
     * </p>
     *
     * @param challengeParameters <p>
     *            The challenge parameters.
     *            </p>
     */
    public void setChallengeParameters(java.util.Map<String, String> challengeParameters) {
        this.challengeParameters = challengeParameters;
    }

    /**
     * <p>
     * The challenge parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param challengeParameters <p>
     *            The challenge parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RespondToAuthChallengeResult withChallengeParameters(
            java.util.Map<String, String> challengeParameters) {
        this.challengeParameters = challengeParameters;
        return this;
    }

    /**
     * <p>
     * The challenge parameters.
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
    public RespondToAuthChallengeResult addChallengeParametersEntry(String key, String value) {
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
    public RespondToAuthChallengeResult clearChallengeParametersEntries() {
        this.challengeParameters = null;
        return this;
    }

    /**
     * <p>
     * The result type of the authentication result.
     * </p>
     *
     * @return <p>
     *         The result type of the authentication result.
     *         </p>
     */
    public AuthenticationResultType getAuthenticationResult() {
        return authenticationResult;
    }

    /**
     * <p>
     * The result type of the authentication result.
     * </p>
     *
     * @param authenticationResult <p>
     *            The result type of the authentication result.
     *            </p>
     */
    public void setAuthenticationResult(AuthenticationResultType authenticationResult) {
        this.authenticationResult = authenticationResult;
    }

    /**
     * <p>
     * The result type of the authentication result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authenticationResult <p>
     *            The result type of the authentication result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RespondToAuthChallengeResult withAuthenticationResult(
            AuthenticationResultType authenticationResult) {
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

        if (obj instanceof RespondToAuthChallengeResult == false)
            return false;
        RespondToAuthChallengeResult other = (RespondToAuthChallengeResult) obj;

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
