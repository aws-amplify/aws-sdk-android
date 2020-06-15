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

public class UpdateVoiceConnectorResult implements Serializable {
    /**
     * <p>
     * The updated Amazon Chime Voice Connector details.
     * </p>
     */
    private VoiceConnector voiceConnector;

    /**
     * <p>
     * The updated Amazon Chime Voice Connector details.
     * </p>
     *
     * @return <p>
     *         The updated Amazon Chime Voice Connector details.
     *         </p>
     */
    public VoiceConnector getVoiceConnector() {
        return voiceConnector;
    }

    /**
     * <p>
     * The updated Amazon Chime Voice Connector details.
     * </p>
     *
     * @param voiceConnector <p>
     *            The updated Amazon Chime Voice Connector details.
     *            </p>
     */
    public void setVoiceConnector(VoiceConnector voiceConnector) {
        this.voiceConnector = voiceConnector;
    }

    /**
     * <p>
     * The updated Amazon Chime Voice Connector details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voiceConnector <p>
     *            The updated Amazon Chime Voice Connector details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateVoiceConnectorResult withVoiceConnector(VoiceConnector voiceConnector) {
        this.voiceConnector = voiceConnector;
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
        if (getVoiceConnector() != null)
            sb.append("VoiceConnector: " + getVoiceConnector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVoiceConnector() == null) ? 0 : getVoiceConnector().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVoiceConnectorResult == false)
            return false;
        UpdateVoiceConnectorResult other = (UpdateVoiceConnectorResult) obj;

        if (other.getVoiceConnector() == null ^ this.getVoiceConnector() == null)
            return false;
        if (other.getVoiceConnector() != null
                && other.getVoiceConnector().equals(this.getVoiceConnector()) == false)
            return false;
        return true;
    }
}
