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
 * The challenge response type.
 * </p>
 */
public class ChallengeResponseType implements Serializable {
    /**
     * <p>
     * The challenge name
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Password, Mfa
     */
    private String challengeName;

    /**
     * <p>
     * The challenge response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure
     */
    private String challengeResponse;

    /**
     * <p>
     * The challenge name
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Password, Mfa
     *
     * @return <p>
     *         The challenge name
     *         </p>
     * @see ChallengeName
     */
    public String getChallengeName() {
        return challengeName;
    }

    /**
     * <p>
     * The challenge name
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Password, Mfa
     *
     * @param challengeName <p>
     *            The challenge name
     *            </p>
     * @see ChallengeName
     */
    public void setChallengeName(String challengeName) {
        this.challengeName = challengeName;
    }

    /**
     * <p>
     * The challenge name
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Password, Mfa
     *
     * @param challengeName <p>
     *            The challenge name
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChallengeName
     */
    public ChallengeResponseType withChallengeName(String challengeName) {
        this.challengeName = challengeName;
        return this;
    }

    /**
     * <p>
     * The challenge name
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Password, Mfa
     *
     * @param challengeName <p>
     *            The challenge name
     *            </p>
     * @see ChallengeName
     */
    public void setChallengeName(ChallengeName challengeName) {
        this.challengeName = challengeName.toString();
    }

    /**
     * <p>
     * The challenge name
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Password, Mfa
     *
     * @param challengeName <p>
     *            The challenge name
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChallengeName
     */
    public ChallengeResponseType withChallengeName(ChallengeName challengeName) {
        this.challengeName = challengeName.toString();
        return this;
    }

    /**
     * <p>
     * The challenge response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure
     *
     * @return <p>
     *         The challenge response.
     *         </p>
     * @see ChallengeResponse
     */
    public String getChallengeResponse() {
        return challengeResponse;
    }

    /**
     * <p>
     * The challenge response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure
     *
     * @param challengeResponse <p>
     *            The challenge response.
     *            </p>
     * @see ChallengeResponse
     */
    public void setChallengeResponse(String challengeResponse) {
        this.challengeResponse = challengeResponse;
    }

    /**
     * <p>
     * The challenge response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure
     *
     * @param challengeResponse <p>
     *            The challenge response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChallengeResponse
     */
    public ChallengeResponseType withChallengeResponse(String challengeResponse) {
        this.challengeResponse = challengeResponse;
        return this;
    }

    /**
     * <p>
     * The challenge response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure
     *
     * @param challengeResponse <p>
     *            The challenge response.
     *            </p>
     * @see ChallengeResponse
     */
    public void setChallengeResponse(ChallengeResponse challengeResponse) {
        this.challengeResponse = challengeResponse.toString();
    }

    /**
     * <p>
     * The challenge response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure
     *
     * @param challengeResponse <p>
     *            The challenge response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChallengeResponse
     */
    public ChallengeResponseType withChallengeResponse(ChallengeResponse challengeResponse) {
        this.challengeResponse = challengeResponse.toString();
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
        if (getChallengeResponse() != null)
            sb.append("ChallengeResponse: " + getChallengeResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChallengeName() == null) ? 0 : getChallengeName().hashCode());
        hashCode = prime * hashCode
                + ((getChallengeResponse() == null) ? 0 : getChallengeResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChallengeResponseType == false)
            return false;
        ChallengeResponseType other = (ChallengeResponseType) obj;

        if (other.getChallengeName() == null ^ this.getChallengeName() == null)
            return false;
        if (other.getChallengeName() != null
                && other.getChallengeName().equals(this.getChallengeName()) == false)
            return false;
        if (other.getChallengeResponse() == null ^ this.getChallengeResponse() == null)
            return false;
        if (other.getChallengeResponse() != null
                && other.getChallengeResponse().equals(this.getChallengeResponse()) == false)
            return false;
        return true;
    }
}
