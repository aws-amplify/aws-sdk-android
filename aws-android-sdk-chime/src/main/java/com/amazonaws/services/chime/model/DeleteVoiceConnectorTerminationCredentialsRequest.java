/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes the specified SIP credentials used by your equipment to authenticate
 * during call termination.
 * </p>
 */
public class DeleteVoiceConnectorTerminationCredentialsRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String voiceConnectorId;

    /**
     * <p>
     * The RFC2617 compliant username associated with the SIP credentials, in
     * US-ASCII format.
     * </p>
     */
    private java.util.List<String> usernames;

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Chime Voice Connector ID.
     *         </p>
     */
    public String getVoiceConnectorId() {
        return voiceConnectorId;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param voiceConnectorId <p>
     *            The Amazon Chime Voice Connector ID.
     *            </p>
     */
    public void setVoiceConnectorId(String voiceConnectorId) {
        this.voiceConnectorId = voiceConnectorId;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param voiceConnectorId <p>
     *            The Amazon Chime Voice Connector ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteVoiceConnectorTerminationCredentialsRequest withVoiceConnectorId(
            String voiceConnectorId) {
        this.voiceConnectorId = voiceConnectorId;
        return this;
    }

    /**
     * <p>
     * The RFC2617 compliant username associated with the SIP credentials, in
     * US-ASCII format.
     * </p>
     *
     * @return <p>
     *         The RFC2617 compliant username associated with the SIP
     *         credentials, in US-ASCII format.
     *         </p>
     */
    public java.util.List<String> getUsernames() {
        return usernames;
    }

    /**
     * <p>
     * The RFC2617 compliant username associated with the SIP credentials, in
     * US-ASCII format.
     * </p>
     *
     * @param usernames <p>
     *            The RFC2617 compliant username associated with the SIP
     *            credentials, in US-ASCII format.
     *            </p>
     */
    public void setUsernames(java.util.Collection<String> usernames) {
        if (usernames == null) {
            this.usernames = null;
            return;
        }

        this.usernames = new java.util.ArrayList<String>(usernames);
    }

    /**
     * <p>
     * The RFC2617 compliant username associated with the SIP credentials, in
     * US-ASCII format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usernames <p>
     *            The RFC2617 compliant username associated with the SIP
     *            credentials, in US-ASCII format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteVoiceConnectorTerminationCredentialsRequest withUsernames(String... usernames) {
        if (getUsernames() == null) {
            this.usernames = new java.util.ArrayList<String>(usernames.length);
        }
        for (String value : usernames) {
            this.usernames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The RFC2617 compliant username associated with the SIP credentials, in
     * US-ASCII format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usernames <p>
     *            The RFC2617 compliant username associated with the SIP
     *            credentials, in US-ASCII format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteVoiceConnectorTerminationCredentialsRequest withUsernames(
            java.util.Collection<String> usernames) {
        setUsernames(usernames);
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
        if (getVoiceConnectorId() != null)
            sb.append("VoiceConnectorId: " + getVoiceConnectorId() + ",");
        if (getUsernames() != null)
            sb.append("Usernames: " + getUsernames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVoiceConnectorId() == null) ? 0 : getVoiceConnectorId().hashCode());
        hashCode = prime * hashCode + ((getUsernames() == null) ? 0 : getUsernames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVoiceConnectorTerminationCredentialsRequest == false)
            return false;
        DeleteVoiceConnectorTerminationCredentialsRequest other = (DeleteVoiceConnectorTerminationCredentialsRequest) obj;

        if (other.getVoiceConnectorId() == null ^ this.getVoiceConnectorId() == null)
            return false;
        if (other.getVoiceConnectorId() != null
                && other.getVoiceConnectorId().equals(this.getVoiceConnectorId()) == false)
            return false;
        if (other.getUsernames() == null ^ this.getUsernames() == null)
            return false;
        if (other.getUsernames() != null
                && other.getUsernames().equals(this.getUsernames()) == false)
            return false;
        return true;
    }
}
