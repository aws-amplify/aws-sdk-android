/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class StartWebRTCContactResult implements Serializable {
    /**
     * <p>
     * Information required for the client application (mobile application or
     * website) to connect to the call.
     * </p>
     */
    private ConnectionData connectionData;

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String contactId;

    /**
     * <p>
     * The identifier for a contact participant. The <code>ParticipantId</code>
     * for a contact participant is the same throughout the contact lifecycle.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String participantId;

    /**
     * <p>
     * The token used by the contact participant to call the <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> API. The participant token is valid for
     * the lifetime of a contact participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String participantToken;

    /**
     * <p>
     * Information required for the client application (mobile application or
     * website) to connect to the call.
     * </p>
     *
     * @return <p>
     *         Information required for the client application (mobile
     *         application or website) to connect to the call.
     *         </p>
     */
    public ConnectionData getConnectionData() {
        return connectionData;
    }

    /**
     * <p>
     * Information required for the client application (mobile application or
     * website) to connect to the call.
     * </p>
     *
     * @param connectionData <p>
     *            Information required for the client application (mobile
     *            application or website) to connect to the call.
     *            </p>
     */
    public void setConnectionData(ConnectionData connectionData) {
        this.connectionData = connectionData;
    }

    /**
     * <p>
     * Information required for the client application (mobile application or
     * website) to connect to the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionData <p>
     *            Information required for the client application (mobile
     *            application or website) to connect to the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartWebRTCContactResult withConnectionData(ConnectionData connectionData) {
        this.connectionData = connectionData;
        return this;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the contact in this instance of Amazon Connect.
     *         </p>
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The identifier of the contact in this instance of Amazon
     *            Connect.
     *            </p>
     */
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The identifier of the contact in this instance of Amazon
     *            Connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartWebRTCContactResult withContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }

    /**
     * <p>
     * The identifier for a contact participant. The <code>ParticipantId</code>
     * for a contact participant is the same throughout the contact lifecycle.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier for a contact participant. The
     *         <code>ParticipantId</code> for a contact participant is the same
     *         throughout the contact lifecycle.
     *         </p>
     */
    public String getParticipantId() {
        return participantId;
    }

    /**
     * <p>
     * The identifier for a contact participant. The <code>ParticipantId</code>
     * for a contact participant is the same throughout the contact lifecycle.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param participantId <p>
     *            The identifier for a contact participant. The
     *            <code>ParticipantId</code> for a contact participant is the
     *            same throughout the contact lifecycle.
     *            </p>
     */
    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    /**
     * <p>
     * The identifier for a contact participant. The <code>ParticipantId</code>
     * for a contact participant is the same throughout the contact lifecycle.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param participantId <p>
     *            The identifier for a contact participant. The
     *            <code>ParticipantId</code> for a contact participant is the
     *            same throughout the contact lifecycle.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartWebRTCContactResult withParticipantId(String participantId) {
        this.participantId = participantId;
        return this;
    }

    /**
     * <p>
     * The token used by the contact participant to call the <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> API. The participant token is valid for
     * the lifetime of a contact participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The token used by the contact participant to call the <a href=
     *         "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     *         >CreateParticipantConnection</a> API. The participant token is
     *         valid for the lifetime of a contact participant.
     *         </p>
     */
    public String getParticipantToken() {
        return participantToken;
    }

    /**
     * <p>
     * The token used by the contact participant to call the <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> API. The participant token is valid for
     * the lifetime of a contact participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param participantToken <p>
     *            The token used by the contact participant to call the <a href=
     *            "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     *            >CreateParticipantConnection</a> API. The participant token is
     *            valid for the lifetime of a contact participant.
     *            </p>
     */
    public void setParticipantToken(String participantToken) {
        this.participantToken = participantToken;
    }

    /**
     * <p>
     * The token used by the contact participant to call the <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> API. The participant token is valid for
     * the lifetime of a contact participant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param participantToken <p>
     *            The token used by the contact participant to call the <a href=
     *            "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     *            >CreateParticipantConnection</a> API. The participant token is
     *            valid for the lifetime of a contact participant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartWebRTCContactResult withParticipantToken(String participantToken) {
        this.participantToken = participantToken;
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
        if (getConnectionData() != null)
            sb.append("ConnectionData: " + getConnectionData() + ",");
        if (getContactId() != null)
            sb.append("ContactId: " + getContactId() + ",");
        if (getParticipantId() != null)
            sb.append("ParticipantId: " + getParticipantId() + ",");
        if (getParticipantToken() != null)
            sb.append("ParticipantToken: " + getParticipantToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConnectionData() == null) ? 0 : getConnectionData().hashCode());
        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode
                + ((getParticipantId() == null) ? 0 : getParticipantId().hashCode());
        hashCode = prime * hashCode
                + ((getParticipantToken() == null) ? 0 : getParticipantToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartWebRTCContactResult == false)
            return false;
        StartWebRTCContactResult other = (StartWebRTCContactResult) obj;

        if (other.getConnectionData() == null ^ this.getConnectionData() == null)
            return false;
        if (other.getConnectionData() != null
                && other.getConnectionData().equals(this.getConnectionData()) == false)
            return false;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null
                && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getParticipantId() == null ^ this.getParticipantId() == null)
            return false;
        if (other.getParticipantId() != null
                && other.getParticipantId().equals(this.getParticipantId()) == false)
            return false;
        if (other.getParticipantToken() == null ^ this.getParticipantToken() == null)
            return false;
        if (other.getParticipantToken() != null
                && other.getParticipantToken().equals(this.getParticipantToken()) == false)
            return false;
        return true;
    }
}
