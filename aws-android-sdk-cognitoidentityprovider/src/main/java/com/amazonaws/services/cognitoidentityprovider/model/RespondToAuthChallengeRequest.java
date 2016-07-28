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

import com.amazonaws.AmazonWebServiceRequest;

public class RespondToAuthChallengeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The new value for the clientId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     */
    private String clientId;

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
     * The new value for the challengeResponses property for this object.
     */
    private java.util.Map<String, String> challengeResponses;

    /**
     * Returns the value of the clientId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @return The value of the clientId property for this object.
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of clientId
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId The new value for the clientId property for this object.
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * Sets the value of the clientId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId The new value for the clientId property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RespondToAuthChallengeRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

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
    public RespondToAuthChallengeRequest withChallengeName(String challengeName) {
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
    public RespondToAuthChallengeRequest withChallengeName(ChallengeNameType challengeName) {
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
    public RespondToAuthChallengeRequest withSession(String session) {
        this.session = session;
        return this;
    }

    /**
     * Returns the value of the challengeResponses property for this object.
     *
     * @return The value of the challengeResponses property for this object.
     */
    public java.util.Map<String, String> getChallengeResponses() {
        return challengeResponses;
    }

    /**
     * Sets the value of challengeResponses
     *
     * @param challengeResponses The new value for the challengeResponses
     *            property for this object.
     */
    public void setChallengeResponses(java.util.Map<String, String> challengeResponses) {
        this.challengeResponses = challengeResponses;
    }

    /**
     * Sets the value of the challengeResponses property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param challengeResponses The new value for the challengeResponses
     *            property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RespondToAuthChallengeRequest withChallengeResponses(
            java.util.Map<String, String> challengeResponses) {
        this.challengeResponses = challengeResponses;
        return this;
    }

    /**
     * Sets the value of the challengeResponses property for this object.
     * <p>
     * The method adds a new key-value pair into ChallengeResponses parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into ChallengeResponses.
     * @param value The corresponding value of the entry to be added into
     *            ChallengeResponses.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RespondToAuthChallengeRequest addChallengeResponsesEntry(String key, String value) {
        if (null == this.challengeResponses) {
            this.challengeResponses = new java.util.HashMap<String, String>();
        }
        if (this.challengeResponses.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.challengeResponses.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ChallengeResponses.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public RespondToAuthChallengeRequest clearChallengeResponsesEntries() {
        this.challengeResponses = null;
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
        if (getClientId() != null)
            sb.append("ClientId: " + getClientId() + ",");
        if (getChallengeName() != null)
            sb.append("ChallengeName: " + getChallengeName() + ",");
        if (getSession() != null)
            sb.append("Session: " + getSession() + ",");
        if (getChallengeResponses() != null)
            sb.append("ChallengeResponses: " + getChallengeResponses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode
                + ((getChallengeName() == null) ? 0 : getChallengeName().hashCode());
        hashCode = prime * hashCode + ((getSession() == null) ? 0 : getSession().hashCode());
        hashCode = prime * hashCode
                + ((getChallengeResponses() == null) ? 0 : getChallengeResponses().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RespondToAuthChallengeRequest == false)
            return false;
        RespondToAuthChallengeRequest other = (RespondToAuthChallengeRequest) obj;

        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getChallengeName() == null ^ this.getChallengeName() == null)
            return false;
        if (other.getChallengeName() != null
                && other.getChallengeName().equals(this.getChallengeName()) == false)
            return false;
        if (other.getSession() == null ^ this.getSession() == null)
            return false;
        if (other.getSession() != null && other.getSession().equals(this.getSession()) == false)
            return false;
        if (other.getChallengeResponses() == null ^ this.getChallengeResponses() == null)
            return false;
        if (other.getChallengeResponses() != null
                && other.getChallengeResponses().equals(this.getChallengeResponses()) == false)
            return false;
        return true;
    }
}
