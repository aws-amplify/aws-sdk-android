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
 * Updates global settings for the administrator's AWS account, such as Amazon
 * Chime Business Calling and Amazon Chime Voice Connector settings.
 * </p>
 */
public class UpdateGlobalSettingsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Chime Business Calling settings.
     * </p>
     */
    private BusinessCallingSettings businessCalling;

    /**
     * <p>
     * The Amazon Chime Voice Connector settings.
     * </p>
     */
    private VoiceConnectorSettings voiceConnector;

    /**
     * <p>
     * The Amazon Chime Business Calling settings.
     * </p>
     *
     * @return <p>
     *         The Amazon Chime Business Calling settings.
     *         </p>
     */
    public BusinessCallingSettings getBusinessCalling() {
        return businessCalling;
    }

    /**
     * <p>
     * The Amazon Chime Business Calling settings.
     * </p>
     *
     * @param businessCalling <p>
     *            The Amazon Chime Business Calling settings.
     *            </p>
     */
    public void setBusinessCalling(BusinessCallingSettings businessCalling) {
        this.businessCalling = businessCalling;
    }

    /**
     * <p>
     * The Amazon Chime Business Calling settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param businessCalling <p>
     *            The Amazon Chime Business Calling settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGlobalSettingsRequest withBusinessCalling(BusinessCallingSettings businessCalling) {
        this.businessCalling = businessCalling;
        return this;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector settings.
     * </p>
     *
     * @return <p>
     *         The Amazon Chime Voice Connector settings.
     *         </p>
     */
    public VoiceConnectorSettings getVoiceConnector() {
        return voiceConnector;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector settings.
     * </p>
     *
     * @param voiceConnector <p>
     *            The Amazon Chime Voice Connector settings.
     *            </p>
     */
    public void setVoiceConnector(VoiceConnectorSettings voiceConnector) {
        this.voiceConnector = voiceConnector;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voiceConnector <p>
     *            The Amazon Chime Voice Connector settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGlobalSettingsRequest withVoiceConnector(VoiceConnectorSettings voiceConnector) {
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
        if (getBusinessCalling() != null)
            sb.append("BusinessCalling: " + getBusinessCalling() + ",");
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
                + ((getBusinessCalling() == null) ? 0 : getBusinessCalling().hashCode());
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

        if (obj instanceof UpdateGlobalSettingsRequest == false)
            return false;
        UpdateGlobalSettingsRequest other = (UpdateGlobalSettingsRequest) obj;

        if (other.getBusinessCalling() == null ^ this.getBusinessCalling() == null)
            return false;
        if (other.getBusinessCalling() != null
                && other.getBusinessCalling().equals(this.getBusinessCalling()) == false)
            return false;
        if (other.getVoiceConnector() == null ^ this.getVoiceConnector() == null)
            return false;
        if (other.getVoiceConnector() != null
                && other.getVoiceConnector().equals(this.getVoiceConnector()) == false)
            return false;
        return true;
    }
}
