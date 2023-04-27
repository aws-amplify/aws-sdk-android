/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class CreateParticipantResult implements Serializable {
    /**
     * <p>
     * The token used by the chat participant to call
     * <code>CreateParticipantConnection</code>. The participant token is valid
     * for the lifetime of a chat participant.
     * </p>
     */
    private ParticipantTokenCredentials participantCredentials;

    /**
     * <p>
     * The identifier for a chat participant. The participantId for a chat
     * participant is the same throughout the chat lifecycle.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String participantId;

    /**
     * <p>
     * The token used by the chat participant to call
     * <code>CreateParticipantConnection</code>. The participant token is valid
     * for the lifetime of a chat participant.
     * </p>
     *
     * @return <p>
     *         The token used by the chat participant to call
     *         <code>CreateParticipantConnection</code>. The participant token
     *         is valid for the lifetime of a chat participant.
     *         </p>
     */
    public ParticipantTokenCredentials getParticipantCredentials() {
        return participantCredentials;
    }

    /**
     * <p>
     * The token used by the chat participant to call
     * <code>CreateParticipantConnection</code>. The participant token is valid
     * for the lifetime of a chat participant.
     * </p>
     *
     * @param participantCredentials <p>
     *            The token used by the chat participant to call
     *            <code>CreateParticipantConnection</code>. The participant
     *            token is valid for the lifetime of a chat participant.
     *            </p>
     */
    public void setParticipantCredentials(ParticipantTokenCredentials participantCredentials) {
        this.participantCredentials = participantCredentials;
    }

    /**
     * <p>
     * The token used by the chat participant to call
     * <code>CreateParticipantConnection</code>. The participant token is valid
     * for the lifetime of a chat participant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param participantCredentials <p>
     *            The token used by the chat participant to call
     *            <code>CreateParticipantConnection</code>. The participant
     *            token is valid for the lifetime of a chat participant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateParticipantResult withParticipantCredentials(
            ParticipantTokenCredentials participantCredentials) {
        this.participantCredentials = participantCredentials;
        return this;
    }

    /**
     * <p>
     * The identifier for a chat participant. The participantId for a chat
     * participant is the same throughout the chat lifecycle.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier for a chat participant. The participantId for a
     *         chat participant is the same throughout the chat lifecycle.
     *         </p>
     */
    public String getParticipantId() {
        return participantId;
    }

    /**
     * <p>
     * The identifier for a chat participant. The participantId for a chat
     * participant is the same throughout the chat lifecycle.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param participantId <p>
     *            The identifier for a chat participant. The participantId for a
     *            chat participant is the same throughout the chat lifecycle.
     *            </p>
     */
    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    /**
     * <p>
     * The identifier for a chat participant. The participantId for a chat
     * participant is the same throughout the chat lifecycle.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param participantId <p>
     *            The identifier for a chat participant. The participantId for a
     *            chat participant is the same throughout the chat lifecycle.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateParticipantResult withParticipantId(String participantId) {
        this.participantId = participantId;
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
        if (getParticipantCredentials() != null)
            sb.append("ParticipantCredentials: " + getParticipantCredentials() + ",");
        if (getParticipantId() != null)
            sb.append("ParticipantId: " + getParticipantId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getParticipantCredentials() == null) ? 0 : getParticipantCredentials()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getParticipantId() == null) ? 0 : getParticipantId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateParticipantResult == false)
            return false;
        CreateParticipantResult other = (CreateParticipantResult) obj;

        if (other.getParticipantCredentials() == null ^ this.getParticipantCredentials() == null)
            return false;
        if (other.getParticipantCredentials() != null
                && other.getParticipantCredentials().equals(this.getParticipantCredentials()) == false)
            return false;
        if (other.getParticipantId() == null ^ this.getParticipantId() == null)
            return false;
        if (other.getParticipantId() != null
                && other.getParticipantId().equals(this.getParticipantId()) == false)
            return false;
        return true;
    }
}
