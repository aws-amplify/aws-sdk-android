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
 * Update an ADM channel.
 */
public class UpdateAdmChannelRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * Amazon Device Messaging channel definition.
     */
    private ADMChannelRequest aDMChannelRequest;

    /**
     * The unique ID of your Amazon Pinpoint application.
     */
    private String applicationId;

    /**
     * Amazon Device Messaging channel definition.
     *
     * @return Amazon Device Messaging channel definition.
     */
    public ADMChannelRequest getADMChannelRequest() {
        return aDMChannelRequest;
    }

    /**
     * Amazon Device Messaging channel definition.
     *
     * @param aDMChannelRequest Amazon Device Messaging channel definition.
     */
    public void setADMChannelRequest(ADMChannelRequest aDMChannelRequest) {
        this.aDMChannelRequest = aDMChannelRequest;
    }

    /**
     * Amazon Device Messaging channel definition.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aDMChannelRequest Amazon Device Messaging channel definition.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAdmChannelRequest withADMChannelRequest(ADMChannelRequest aDMChannelRequest) {
        this.aDMChannelRequest = aDMChannelRequest;
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
    public UpdateAdmChannelRequest withApplicationId(String applicationId) {
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
        if (getADMChannelRequest() != null)
            sb.append("ADMChannelRequest: " + getADMChannelRequest() + ",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getADMChannelRequest() == null) ? 0 : getADMChannelRequest().hashCode());
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

        if (obj instanceof UpdateAdmChannelRequest == false)
            return false;
        UpdateAdmChannelRequest other = (UpdateAdmChannelRequest) obj;

        if (other.getADMChannelRequest() == null ^ this.getADMChannelRequest() == null)
            return false;
        if (other.getADMChannelRequest() != null
                && other.getADMChannelRequest().equals(this.getADMChannelRequest()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        return true;
    }
}
