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
 * Update an APNS sandbox channel.
 */
public class UpdateApnsSandboxChannelRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * Apple Development Push Notification Service channel definition.
     */
    private APNSSandboxChannelRequest aPNSSandboxChannelRequest;

    /**
     * The unique ID of your Amazon Pinpoint application.
     */
    private String applicationId;

    /**
     * Apple Development Push Notification Service channel definition.
     *
     * @return Apple Development Push Notification Service channel definition.
     */
    public APNSSandboxChannelRequest getAPNSSandboxChannelRequest() {
        return aPNSSandboxChannelRequest;
    }

    /**
     * Apple Development Push Notification Service channel definition.
     *
     * @param aPNSSandboxChannelRequest Apple Development Push Notification
     *            Service channel definition.
     */
    public void setAPNSSandboxChannelRequest(APNSSandboxChannelRequest aPNSSandboxChannelRequest) {
        this.aPNSSandboxChannelRequest = aPNSSandboxChannelRequest;
    }

    /**
     * Apple Development Push Notification Service channel definition.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aPNSSandboxChannelRequest Apple Development Push Notification
     *            Service channel definition.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApnsSandboxChannelRequest withAPNSSandboxChannelRequest(
            APNSSandboxChannelRequest aPNSSandboxChannelRequest) {
        this.aPNSSandboxChannelRequest = aPNSSandboxChannelRequest;
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
    public UpdateApnsSandboxChannelRequest withApplicationId(String applicationId) {
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
        if (getAPNSSandboxChannelRequest() != null)
            sb.append("APNSSandboxChannelRequest: " + getAPNSSandboxChannelRequest() + ",");
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
                + ((getAPNSSandboxChannelRequest() == null) ? 0 : getAPNSSandboxChannelRequest()
                        .hashCode());
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

        if (obj instanceof UpdateApnsSandboxChannelRequest == false)
            return false;
        UpdateApnsSandboxChannelRequest other = (UpdateApnsSandboxChannelRequest) obj;

        if (other.getAPNSSandboxChannelRequest() == null
                ^ this.getAPNSSandboxChannelRequest() == null)
            return false;
        if (other.getAPNSSandboxChannelRequest() != null
                && other.getAPNSSandboxChannelRequest().equals(this.getAPNSSandboxChannelRequest()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        return true;
    }
}
