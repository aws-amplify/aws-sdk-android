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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Update an APNS VoIP sandbox channel
 */
public class UpdateApnsVoipSandboxChannelRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * Apple VoIP Developer Push Notification Service channel definition.
     */
    private APNSVoipSandboxChannelRequest aPNSVoipSandboxChannelRequest;

    /**
     * The unique ID of your Amazon Pinpoint application.
     */
    private String applicationId;

    /**
     * Apple VoIP Developer Push Notification Service channel definition.
     *
     * @return Apple VoIP Developer Push Notification Service channel
     *         definition.
     */
    public APNSVoipSandboxChannelRequest getAPNSVoipSandboxChannelRequest() {
        return aPNSVoipSandboxChannelRequest;
    }

    /**
     * Apple VoIP Developer Push Notification Service channel definition.
     *
     * @param aPNSVoipSandboxChannelRequest Apple VoIP Developer Push
     *            Notification Service channel definition.
     */
    public void setAPNSVoipSandboxChannelRequest(
            APNSVoipSandboxChannelRequest aPNSVoipSandboxChannelRequest) {
        this.aPNSVoipSandboxChannelRequest = aPNSVoipSandboxChannelRequest;
    }

    /**
     * Apple VoIP Developer Push Notification Service channel definition.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aPNSVoipSandboxChannelRequest Apple VoIP Developer Push
     *            Notification Service channel definition.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApnsVoipSandboxChannelRequest withAPNSVoipSandboxChannelRequest(
            APNSVoipSandboxChannelRequest aPNSVoipSandboxChannelRequest) {
        this.aPNSVoipSandboxChannelRequest = aPNSVoipSandboxChannelRequest;
        return this;
    }

    /**
     * The unique ID of your Amazon Pinpoint application.
     *
     * @return The unique ID of your Amazon Pinpoint application.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * The unique ID of your Amazon Pinpoint application.
     *
     * @param applicationId The unique ID of your Amazon Pinpoint application.
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The unique ID of your Amazon Pinpoint application.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId The unique ID of your Amazon Pinpoint application.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApnsVoipSandboxChannelRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
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
        if (getAPNSVoipSandboxChannelRequest() != null)
            sb.append("APNSVoipSandboxChannelRequest: " + getAPNSVoipSandboxChannelRequest() + ",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAPNSVoipSandboxChannelRequest() == null) ? 0
                        : getAPNSVoipSandboxChannelRequest().hashCode());
        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApnsVoipSandboxChannelRequest == false)
            return false;
        UpdateApnsVoipSandboxChannelRequest other = (UpdateApnsVoipSandboxChannelRequest) obj;

        if (other.getAPNSVoipSandboxChannelRequest() == null
                ^ this.getAPNSVoipSandboxChannelRequest() == null)
            return false;
        if (other.getAPNSVoipSandboxChannelRequest() != null
                && other.getAPNSVoipSandboxChannelRequest().equals(
                        this.getAPNSVoipSandboxChannelRequest()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        return true;
    }
}
