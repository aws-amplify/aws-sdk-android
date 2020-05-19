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
 * Creates an Amazon Chime Voice Connector group under the administrator's AWS
 * account. You can associate Amazon Chime Voice Connectors with the Amazon
 * Chime Voice Connector group by including <code>VoiceConnectorItems</code> in
 * the request.
 * </p>
 * <p>
 * You can include Amazon Chime Voice Connectors from different AWS Regions in
 * your group. This creates a fault tolerant mechanism for fallback in case of
 * availability events.
 * </p>
 */
public class CreateVoiceConnectorGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * The Amazon Chime Voice Connectors to route inbound calls to.
     * </p>
     */
    private java.util.List<VoiceConnectorItem> voiceConnectorItems;

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
    public CreateVoiceConnectorGroupRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connectors to route inbound calls to.
     * </p>
     *
     * @return <p>
     *         The Amazon Chime Voice Connectors to route inbound calls to.
     *         </p>
     */
    public java.util.List<VoiceConnectorItem> getVoiceConnectorItems() {
        return voiceConnectorItems;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connectors to route inbound calls to.
     * </p>
     *
     * @param voiceConnectorItems <p>
     *            The Amazon Chime Voice Connectors to route inbound calls to.
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
     * The Amazon Chime Voice Connectors to route inbound calls to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voiceConnectorItems <p>
     *            The Amazon Chime Voice Connectors to route inbound calls to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVoiceConnectorGroupRequest withVoiceConnectorItems(
            VoiceConnectorItem... voiceConnectorItems) {
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
     * The Amazon Chime Voice Connectors to route inbound calls to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voiceConnectorItems <p>
     *            The Amazon Chime Voice Connectors to route inbound calls to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVoiceConnectorGroupRequest withVoiceConnectorItems(
            java.util.Collection<VoiceConnectorItem> voiceConnectorItems) {
        setVoiceConnectorItems(voiceConnectorItems);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getVoiceConnectorItems() != null)
            sb.append("VoiceConnectorItems: " + getVoiceConnectorItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getVoiceConnectorItems() == null) ? 0 : getVoiceConnectorItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVoiceConnectorGroupRequest == false)
            return false;
        CreateVoiceConnectorGroupRequest other = (CreateVoiceConnectorGroupRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVoiceConnectorItems() == null ^ this.getVoiceConnectorItems() == null)
            return false;
        if (other.getVoiceConnectorItems() != null
                && other.getVoiceConnectorItems().equals(this.getVoiceConnectorItems()) == false)
            return false;
        return true;
    }
}
