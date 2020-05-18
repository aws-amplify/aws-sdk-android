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
 * For Amazon Chime Voice Connector groups, the Amazon Chime Voice Connectors to
 * which to route inbound calls. Includes priority configuration settings.
 * Limit: 3 <code>VoiceConnectorItems</code> per Amazon Chime Voice Connector
 * group.
 * </p>
 */
public class VoiceConnectorItem implements Serializable {
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
     * The priority associated with the Amazon Chime Voice Connector, with 1
     * being the highest priority. Higher priority Amazon Chime Voice Connectors
     * are attempted first.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 99<br/>
     */
    private Integer priority;

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
    public VoiceConnectorItem withVoiceConnectorId(String voiceConnectorId) {
        this.voiceConnectorId = voiceConnectorId;
        return this;
    }

    /**
     * <p>
     * The priority associated with the Amazon Chime Voice Connector, with 1
     * being the highest priority. Higher priority Amazon Chime Voice Connectors
     * are attempted first.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 99<br/>
     *
     * @return <p>
     *         The priority associated with the Amazon Chime Voice Connector,
     *         with 1 being the highest priority. Higher priority Amazon Chime
     *         Voice Connectors are attempted first.
     *         </p>
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * <p>
     * The priority associated with the Amazon Chime Voice Connector, with 1
     * being the highest priority. Higher priority Amazon Chime Voice Connectors
     * are attempted first.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 99<br/>
     *
     * @param priority <p>
     *            The priority associated with the Amazon Chime Voice Connector,
     *            with 1 being the highest priority. Higher priority Amazon
     *            Chime Voice Connectors are attempted first.
     *            </p>
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority associated with the Amazon Chime Voice Connector, with 1
     * being the highest priority. Higher priority Amazon Chime Voice Connectors
     * are attempted first.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 99<br/>
     *
     * @param priority <p>
     *            The priority associated with the Amazon Chime Voice Connector,
     *            with 1 being the highest priority. Higher priority Amazon
     *            Chime Voice Connectors are attempted first.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceConnectorItem withPriority(Integer priority) {
        this.priority = priority;
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
        if (getPriority() != null)
            sb.append("Priority: " + getPriority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVoiceConnectorId() == null) ? 0 : getVoiceConnectorId().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VoiceConnectorItem == false)
            return false;
        VoiceConnectorItem other = (VoiceConnectorItem) obj;

        if (other.getVoiceConnectorId() == null ^ this.getVoiceConnectorId() == null)
            return false;
        if (other.getVoiceConnectorId() != null
                && other.getVoiceConnectorId().equals(this.getVoiceConnectorId()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        return true;
    }
}
