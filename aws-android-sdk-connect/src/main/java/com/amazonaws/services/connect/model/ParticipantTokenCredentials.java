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

/**
 * <p>
 * The credentials used by the participant.
 * </p>
 */
public class ParticipantTokenCredentials implements Serializable {
    /**
     * <p>
     * The token used by the chat participant to call <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a>. The participant token is valid for the
     * lifetime of a chat participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String participantToken;

    /**
     * <p>
     * The expiration of the token. It's specified in ISO 8601 format:
     * yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     * </p>
     */
    private String expiry;

    /**
     * <p>
     * The token used by the chat participant to call <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a>. The participant token is valid for the
     * lifetime of a chat participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The token used by the chat participant to call <a href=
     *         "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     *         >CreateParticipantConnection</a>. The participant token is valid
     *         for the lifetime of a chat participant.
     *         </p>
     */
    public String getParticipantToken() {
        return participantToken;
    }

    /**
     * <p>
     * The token used by the chat participant to call <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a>. The participant token is valid for the
     * lifetime of a chat participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param participantToken <p>
     *            The token used by the chat participant to call <a href=
     *            "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     *            >CreateParticipantConnection</a>. The participant token is
     *            valid for the lifetime of a chat participant.
     *            </p>
     */
    public void setParticipantToken(String participantToken) {
        this.participantToken = participantToken;
    }

    /**
     * <p>
     * The token used by the chat participant to call <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a>. The participant token is valid for the
     * lifetime of a chat participant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param participantToken <p>
     *            The token used by the chat participant to call <a href=
     *            "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     *            >CreateParticipantConnection</a>. The participant token is
     *            valid for the lifetime of a chat participant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParticipantTokenCredentials withParticipantToken(String participantToken) {
        this.participantToken = participantToken;
        return this;
    }

    /**
     * <p>
     * The expiration of the token. It's specified in ISO 8601 format:
     * yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     * </p>
     *
     * @return <p>
     *         The expiration of the token. It's specified in ISO 8601 format:
     *         yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     *         </p>
     */
    public String getExpiry() {
        return expiry;
    }

    /**
     * <p>
     * The expiration of the token. It's specified in ISO 8601 format:
     * yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     * </p>
     *
     * @param expiry <p>
     *            The expiration of the token. It's specified in ISO 8601
     *            format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     *            2019-11-08T02:41:28.172Z.
     *            </p>
     */
    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    /**
     * <p>
     * The expiration of the token. It's specified in ISO 8601 format:
     * yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiry <p>
     *            The expiration of the token. It's specified in ISO 8601
     *            format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     *            2019-11-08T02:41:28.172Z.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParticipantTokenCredentials withExpiry(String expiry) {
        this.expiry = expiry;
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
        if (getParticipantToken() != null)
            sb.append("ParticipantToken: " + getParticipantToken() + ",");
        if (getExpiry() != null)
            sb.append("Expiry: " + getExpiry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getParticipantToken() == null) ? 0 : getParticipantToken().hashCode());
        hashCode = prime * hashCode + ((getExpiry() == null) ? 0 : getExpiry().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParticipantTokenCredentials == false)
            return false;
        ParticipantTokenCredentials other = (ParticipantTokenCredentials) obj;

        if (other.getParticipantToken() == null ^ this.getParticipantToken() == null)
            return false;
        if (other.getParticipantToken() != null
                && other.getParticipantToken().equals(this.getParticipantToken()) == false)
            return false;
        if (other.getExpiry() == null ^ this.getExpiry() == null)
            return false;
        if (other.getExpiry() != null && other.getExpiry().equals(this.getExpiry()) == false)
            return false;
        return true;
    }
}
