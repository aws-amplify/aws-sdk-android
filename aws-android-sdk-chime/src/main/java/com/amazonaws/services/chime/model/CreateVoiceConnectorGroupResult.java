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

public class CreateVoiceConnectorGroupResult implements Serializable {
    /**
     * <p>
     * The Amazon Chime Voice Connector group details.
     * </p>
     */
    private VoiceConnectorGroup voiceConnectorGroup;

    /**
     * <p>
     * The Amazon Chime Voice Connector group details.
     * </p>
     *
     * @return <p>
     *         The Amazon Chime Voice Connector group details.
     *         </p>
     */
    public VoiceConnectorGroup getVoiceConnectorGroup() {
        return voiceConnectorGroup;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector group details.
     * </p>
     *
     * @param voiceConnectorGroup <p>
     *            The Amazon Chime Voice Connector group details.
     *            </p>
     */
    public void setVoiceConnectorGroup(VoiceConnectorGroup voiceConnectorGroup) {
        this.voiceConnectorGroup = voiceConnectorGroup;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector group details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voiceConnectorGroup <p>
     *            The Amazon Chime Voice Connector group details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVoiceConnectorGroupResult withVoiceConnectorGroup(
            VoiceConnectorGroup voiceConnectorGroup) {
        this.voiceConnectorGroup = voiceConnectorGroup;
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
        if (getVoiceConnectorGroup() != null)
            sb.append("VoiceConnectorGroup: " + getVoiceConnectorGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVoiceConnectorGroup() == null) ? 0 : getVoiceConnectorGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVoiceConnectorGroupResult == false)
            return false;
        CreateVoiceConnectorGroupResult other = (CreateVoiceConnectorGroupResult) obj;

        if (other.getVoiceConnectorGroup() == null ^ this.getVoiceConnectorGroup() == null)
            return false;
        if (other.getVoiceConnectorGroup() != null
                && other.getVoiceConnectorGroup().equals(this.getVoiceConnectorGroup()) == false)
            return false;
        return true;
    }
}
