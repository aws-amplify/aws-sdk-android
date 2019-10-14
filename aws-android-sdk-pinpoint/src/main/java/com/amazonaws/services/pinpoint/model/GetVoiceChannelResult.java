/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class GetVoiceChannelResult implements Serializable {
    /**
     * <p>
     * Provides information about the status and settings of the voice channel
     * for an application.
     * </p>
     */
    private VoiceChannelResponse voiceChannelResponse;

    /**
     * <p>
     * Provides information about the status and settings of the voice channel
     * for an application.
     * </p>
     *
     * @return <p>
     *         Provides information about the status and settings of the voice
     *         channel for an application.
     *         </p>
     */
    public VoiceChannelResponse getVoiceChannelResponse() {
        return voiceChannelResponse;
    }

    /**
     * <p>
     * Provides information about the status and settings of the voice channel
     * for an application.
     * </p>
     *
     * @param voiceChannelResponse <p>
     *            Provides information about the status and settings of the
     *            voice channel for an application.
     *            </p>
     */
    public void setVoiceChannelResponse(VoiceChannelResponse voiceChannelResponse) {
        this.voiceChannelResponse = voiceChannelResponse;
    }

    /**
     * <p>
     * Provides information about the status and settings of the voice channel
     * for an application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voiceChannelResponse <p>
     *            Provides information about the status and settings of the
     *            voice channel for an application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetVoiceChannelResult withVoiceChannelResponse(VoiceChannelResponse voiceChannelResponse) {
        this.voiceChannelResponse = voiceChannelResponse;
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
        if (getVoiceChannelResponse() != null)
            sb.append("VoiceChannelResponse: " + getVoiceChannelResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVoiceChannelResponse() == null) ? 0 : getVoiceChannelResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVoiceChannelResult == false)
            return false;
        GetVoiceChannelResult other = (GetVoiceChannelResult) obj;

        if (other.getVoiceChannelResponse() == null ^ this.getVoiceChannelResponse() == null)
            return false;
        if (other.getVoiceChannelResponse() != null
                && other.getVoiceChannelResponse().equals(this.getVoiceChannelResponse()) == false)
            return false;
        return true;
    }
}
