/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class InitiateAuthResult implements Serializable {
    /**
     * The new value for the challengeName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, PASSWORD_VERIFIER, CUSTOM_CHALLENGE,
     * DEVICE_SRP_AUTH, DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH
     */
    private String challengeName;

    /**
     * The new value for the session property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String session;

    /**
     * The new value for the challengeParameters property for this object.
     */
    private java.util.Map<String, String> challengeParameters;

    /**
     * <p>
     * The result type of the authentication result.
     * </p>
     */
    private AuthenticationResultType authenticationResult;

    /**
     * Returns the value of the challengeName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, PASSWORD_VERIFIER, CUSTOM_CHALLENGE,
     * DEVICE_SRP_AUTH, DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH
     *
     * @return The value of the challengeName property for this object.
     * @see ChallengeNameType
     */
    public String getChallengeName() {
        return challengeName;
    }

    /**
     * Sets the value of challengeName
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, PASSWORD_VERIFIER, CUSTOM_CHALLENGE,
     * DEVICE_SRP_AUTH, DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH
     *
     * @param challengeName The new value for the challengeName property for
     *            this object.
     * @see ChallengeNameType
     */
    public void setChallengeName(String challengeName) {
        this.challengeName = challengeName;
    }

    /**
     * Sets the value of the challengeName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, PASSWORD_VERIFIER, CUSTOM_CHALLENGE,
     * DEVICE_SRP_AUTH, DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH
     *
     * @param challengeName The new value for the challengeName property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChallengeNameType
     */
    public InitiateAuthResult withChallengeName(String challengeName) {
        this.challengeName = challengeName;
        return this;
    }

    /**
     * Sets the value of challengeName
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, PASSWORD_VERIFIER, CUSTOM_CHALLENGE,
     * DEVICE_SRP_AUTH, DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH
     *
     * @param challengeName The new value for the challengeName property for
     *            this object.
     * @see ChallengeNameType
     */
    public void setChallengeName(ChallengeNameType challengeName) {
        this.challengeName = challengeName.toString();
    }

    /**
     * Sets the value of the challengeName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, PASSWORD_VERIFIER, CUSTOM_CHALLENGE,
     * DEVICE_SRP_AUTH, DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH
     *
     * @param challengeName The new value for the challengeName property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChallengeNameType
     */
    public InitiateAuthResult withChallengeName(ChallengeNameType challengeName) {
        this.challengeName = challengeName.toString();
        return this;
    }

    /**
     * Returns the value of the session property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The value of the session property for this object.
     */
    public String getSession() {
        return session;
    }

    /**
     * Sets the value of session
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param session The new value for the session property for this object.
     */
    public void setSession(String session) {
        this.session = session;
    }

    /**
     * Sets the value of the session property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param session The new value for the session property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InitiateAuthResult withSession(String session) {
        this.session = session;
        return this;
    }

    /**
     * Returns the value of the challengeParameters property for this object.
     *
     * @return The value of the challengeParameters property for this object.
     */
    public java.util.Map<String, String> getChallengeParameters() {
        return challengeParameters;
    }

    /**
     * Sets the value of challengeParameters
     *
     * @param challengeParameters The new value for the challengeParameters
     *            property for this object.
     */
    public void setChallengeParameters(java.util.Map<String, String> challengeParameters) {
        this.challengeParameters = challengeParameters;
    }

    /**
     * Sets the value of the challengeParameters property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param challengeParameters The new value for the challengeParameters
     *            property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InitiateAuthResult withChallengeParameters(
            java.util.Map<String, String> challengeParameters) {
        this.challengeParameters = challengeParameters;
        return this;
    }

    /**
     * Sets the value of the challengeParameters property for this object.
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
