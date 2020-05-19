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
 * Updates details for the specified Amazon Chime Voice Connector.
 * </p>
 */
public class UpdateVoiceConnectorRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The name of the Amazon Chime Voice Connector.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String name;

    /**
     * <p>
     * When enabled, requires encryption for the Amazon Chime Voice Connector.
     * </p>
     */
    private Boolean requireEncryption;

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
    public UpdateVoiceConnectorRequest withVoiceConnectorId(String voiceConnectorId) {
        this.voiceConnectorId = voiceConnectorId;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The name of the Amazon Chime Voice Connector.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>
     *            The name of the Amazon Chime Voice Connector.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>
     *            The name of the Amazon Chime Voice Connector.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateVoiceConnectorRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * When enabled, requires encryption for the Amazon Chime Voice Connector.
     * </p>
     *
     * @return <p>
     *         When enabled, requires encryption for the Amazon Chime Voice
     *         Connector.
     *         </p>
     */
    public Boolean isRequireEncryption() {
        return requireEncryption;
    }

    /**
     * <p>
     * When enabled, requires encryption for the Amazon Chime Voice Connector.
     * </p>
     *
     * @return <p>
     *         When enabled, requires encryption for the Amazon Chime Voice
     *         Connector.
     *         </p>
     */
    public Boolean getRequireEncryption() {
        return requireEncryption;
    }

    /**
     * <p>
     * When enabled, requires encryption for the Amazon Chime Voice Connector.
     * </p>
     *
     * @param requireEncryption <p>
     *            When enabled, requires encryption for the Amazon Chime Voice
     *            Connector.
     *            </p>
     */
    public void setRequireEncryption(Boolean requireEncryption) {
        this.requireEncryption = requireEncryption;
    }

    /**
     * <p>
     * When enabled, requires encryption for the Amazon Chime Voice Connector.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requireEncryption <p>
     *            When enabled, requires encryption for the Amazon Chime Voice
     *            Connector.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateVoiceConnectorRequest withRequireEncryption(Boolean requireEncryption) {
        this.requireEncryption = requireEncryption;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getRequireEncryption() != null)
            sb.append("RequireEncryption: " + getRequireEncryption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVoiceConnectorId() == null) ? 0 : getVoiceConnectorId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getRequireEncryption() == null) ? 0 : getRequireEncryption().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVoiceConnectorRequest == false)
            return false;
        UpdateVoiceConnectorRequest other = (UpdateVoiceConnectorRequest) obj;

        if (other.getVoiceConnectorId() == null ^ this.getVoiceConnectorId() == null)
            return false;
        if (other.getVoiceConnectorId() != null
                && other.getVoiceConnectorId().equals(this.getVoiceConnectorId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRequireEncryption() == null ^ this.getRequireEncryption() == null)
            return false;
        if (other.getRequireEncryption() != null
                && other.getRequireEncryption().equals(this.getRequireEncryption()) == false)
            return false;
        return true;
    }
}
