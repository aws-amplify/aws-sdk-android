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

/**
 * <p>
 * The Amazon Chime Voice Connector group configuration, including associated
 * Amazon Chime Voice Connectors. You can include Amazon Chime Voice Connectors
 * from different AWS Regions in your group. This creates a fault tolerant
 * mechanism for fallback in case of availability events.
 * </p>
 */
public class VoiceConnectorGroup implements Serializable {
    /**
     * <p>
     * The Amazon Chime Voice Connector group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String voiceConnectorGroupId;

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Chime Voice Connectors to which to route inbound calls.
     * </p>
     */
    private java.util.List<VoiceConnectorItem> voiceConnectorItems;

    /**
     * <p>
     * The Amazon Chime Voice Connector group creation timestamp, in ISO 8601
     * format.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The updated Amazon Chime Voice Connector group timestamp, in ISO 8601
     * format.
     * </p>
     */
    private java.util.Date updatedTimestamp;

    /**
     * <p>
     * The Amazon Chime Voice Connector group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Chime Voice Connector group ID.
     *         </p>
     */
    public String getVoiceConnectorGroupId() {
        return voiceConnectorGroupId;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param voiceConnectorGroupId <p>
     *            The Amazon Chime Voice Connector group ID.
     *            </p>
     */
    public void setVoiceConnectorGroupId(String voiceConnectorGroupId) {
        this.voiceConnectorGroupId = voiceConnectorGroupId;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector group ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param voiceConnectorGroupId <p>
     *            The Amazon Chime Voice Connector group ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceConnectorGroup withVoiceConnectorGroupId(String voiceConnectorGroupId) {
        this.voiceConnectorGroupId = voiceConnectorGroupId;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The name of the Amazon Chime Voice Connector group.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>
     *            The name of the Amazon Chime Voice Connector group.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>
     *            The name of the Amazon Chime Voice Connector group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceConnectorGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connectors to which to route inbound calls.
     * </p>
     *
     * @return <p>
     *         The Amazon Chime Voice Connectors to which to route inbound
     *         calls.
     *         </p>
     */
    public java.util.List<VoiceConnectorItem> getVoiceConnectorItems() {
        return voiceConnectorItems;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connectors to which to route inbound calls.
     * </p>
     *
     * @param voiceConnectorItems <p>
     *            The Amazon Chime Voice Connectors to which to route inbound
     *            calls.
     *            </p>
     */
    public void setVoiceConnectorItems(java.util.Collection<VoiceConnectorItem> voiceConnectorItems) {
        if (voiceConnectorItems == null) {
            this.voiceConnectorItems = null;
            return;
        }

        this.voiceConnectorItems = new java.util.ArrayList<VoiceConnectorItem>(voiceConnectorItems);
    }

    /**
     * <p>
     * The Amazon Chime Voice Connectors to which to route inbound calls.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voiceConnectorItems <p>
     *            The Amazon Chime Voice Connectors to which to route inbound
     *            calls.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceConnectorGroup withVoiceConnectorItems(VoiceConnectorItem... voiceConnectorItems) {
        if (getVoiceConnectorItems() == null) {
            this.voiceConnectorItems = new java.util.ArrayList<VoiceConnectorItem>(
                    voiceConnectorItems.length);
        }
        for (VoiceConnectorItem value : voiceConnectorItems) {
            this.voiceConnectorItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connectors to which to route inbound calls.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voiceConnectorItems <p>
     *            The Amazon Chime Voice Connectors to which to route inbound
     *            calls.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceConnectorGroup withVoiceConnectorItems(
            java.util.Collection<VoiceConnectorItem> voiceConnectorItems) {
        setVoiceConnectorItems(voiceConnectorItems);
        return this;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector group creation timestamp, in ISO 8601
     * format.
     * </p>
     *
     * @return <p>
     *         The Amazon Chime Voice Connector group creation timestamp, in ISO
     *         8601 format.
     *         </p>
     */
    public java.util.Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector group creation timestamp, in ISO 8601
     * format.
     * </p>
     *
     * @param createdTimestamp <p>
     *            The Amazon Chime Voice Connector group creation timestamp, in
     *            ISO 8601 format.
     *            </p>
     */
    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector group creation timestamp, in ISO 8601
     * format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTimestamp <p>
     *            The Amazon Chime Voice Connector group creation timestamp, in
     *            ISO 8601 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceConnectorGroup withCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    /**
     * <p>
     * The updated Amazon Chime Voice Connector group timestamp, in ISO 8601
     * format.
     * </p>
     *
     * @return <p>
     *         The updated Amazon Chime Voice Connector group timestamp, in ISO
     *         8601 format.
     *         </p>
     */
    public java.util.Date getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    /**
     * <p>
     * The updated Amazon Chime Voice Connector group timestamp, in ISO 8601
     * format.
     * </p>
     *
     * @param updatedTimestamp <p>
     *            The updated Amazon Chime Voice Connector group timestamp, in
     *            ISO 8601 format.
     *            </p>
     */
    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The updated Amazon Chime Voice Connector group timestamp, in ISO 8601
     * format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedTimestamp <p>
     *            The updated Amazon Chime Voice Connector group timestamp, in
     *            ISO 8601 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceConnectorGroup withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
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
        if (getVoiceConnectorGroupId() != null)
            sb.append("VoiceConnectorGroupId: " + getVoiceConnectorGroupId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getVoiceConnectorItems() != null)
            sb.append("VoiceConnectorItems: " + getVoiceConnectorItems() + ",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: " + getCreatedTimestamp() + ",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: " + getUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getVoiceConnectorGroupId() == null) ? 0 : getVoiceConnectorGroupId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getVoiceConnectorItems() == null) ? 0 : getVoiceConnectorItems().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VoiceConnectorGroup == false)
            return false;
        VoiceConnectorGroup other = (VoiceConnectorGroup) obj;

        if (other.getVoiceConnectorGroupId() == null ^ this.getVoiceConnectorGroupId() == null)
            return false;
        if (other.getVoiceConnectorGroupId() != null
                && other.getVoiceConnectorGroupId().equals(this.getVoiceConnectorGroupId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVoiceConnectorItems() == null ^ this.getVoiceConnectorItems() == null)
            return false;
        if (other.getVoiceConnectorItems() != null
                && other.getVoiceConnectorItems().equals(this.getVoiceConnectorItems()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null
                && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null
                && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        return true;
    }
}
