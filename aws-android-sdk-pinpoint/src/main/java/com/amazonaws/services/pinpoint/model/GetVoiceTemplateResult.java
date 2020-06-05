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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class GetVoiceTemplateResult implements Serializable {
    /**
     * <p>
     * Provides information about the content and settings for a message
     * template that can be used in messages that are sent through the voice
     * channel.
     * </p>
     */
    private VoiceTemplateResponse voiceTemplateResponse;

    /**
     * <p>
     * Provides information about the content and settings for a message
     * template that can be used in messages that are sent through the voice
     * channel.
     * </p>
     *
     * @return <p>
     *         Provides information about the content and settings for a message
     *         template that can be used in messages that are sent through the
     *         voice channel.
     *         </p>
     */
    public VoiceTemplateResponse getVoiceTemplateResponse() {
        return voiceTemplateResponse;
    }

    /**
     * <p>
     * Provides information about the content and settings for a message
     * template that can be used in messages that are sent through the voice
     * channel.
     * </p>
     *
     * @param voiceTemplateResponse <p>
     *            Provides information about the content and settings for a
     *            message template that can be used in messages that are sent
     *            through the voice channel.
     *            </p>
     */
    public void setVoiceTemplateResponse(VoiceTemplateResponse voiceTemplateResponse) {
        this.voiceTemplateResponse = voiceTemplateResponse;
    }

    /**
     * <p>
     * Provides information about the content and settings for a message
     * template that can be used in messages that are sent through the voice
     * channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voiceTemplateResponse <p>
     *            Provides information about the content and settings for a
     *            message template that can be used in messages that are sent
     *            through the voice channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetVoiceTemplateResult withVoiceTemplateResponse(
            VoiceTemplateResponse voiceTemplateResponse) {
        this.voiceTemplateResponse = voiceTemplateResponse;
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
        if (getVoiceTemplateResponse() != null)
            sb.append("VoiceTemplateResponse: " + getVoiceTemplateResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getVoiceTemplateResponse() == null) ? 0 : getVoiceTemplateResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVoiceTemplateResult == false)
            return false;
        GetVoiceTemplateResult other = (GetVoiceTemplateResult) obj;

        if (other.getVoiceTemplateResponse() == null ^ this.getVoiceTemplateResponse() == null)
            return false;
        if (other.getVoiceTemplateResponse() != null
                && other.getVoiceTemplateResponse().equals(this.getVoiceTemplateResponse()) == false)
            return false;
        return true;
    }
}
