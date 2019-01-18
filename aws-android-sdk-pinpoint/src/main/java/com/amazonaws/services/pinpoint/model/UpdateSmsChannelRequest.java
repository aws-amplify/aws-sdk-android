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
 * Update an SMS channel.
 */
public class UpdateSmsChannelRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The unique ID of your Amazon Pinpoint application.
     */
    private String applicationId;

    /**
     * SMS Channel Request
     */
    private SMSChannelRequest sMSChannelRequest;

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
    public UpdateSmsChannelRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * SMS Channel Request
     *
     * @return SMS Channel Request
     */
    public SMSChannelRequest getSMSChannelRequest() {
        return sMSChannelRequest;
    }

    /**
     * SMS Channel Request
     *
     * @param sMSChannelRequest SMS Channel Request
     */
    public void setSMSChannelRequest(SMSChannelRequest sMSChannelRequest) {
        this.sMSChannelRequest = sMSChannelRequest;
    }

    /**
     * SMS Channel Request
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sMSChannelRequest SMS Channel Request
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSmsChannelRequest withSMSChannelRequest(SMSChannelRequest sMSChannelRequest) {
        this.sMSChannelRequest = sMSChannelRequest;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getSMSChannelRequest() != null)
            sb.append("SMSChannelRequest: " + getSMSChannelRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode
                + ((getSMSChannelRequest() == null) ? 0 : getSMSChannelRequest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSmsChannelRequest == false)
            return false;
        UpdateSmsChannelRequest other = (UpdateSmsChannelRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getSMSChannelRequest() == null ^ this.getSMSChannelRequest() == null)
            return false;
        if (other.getSMSChannelRequest() != null
                && other.getSMSChannelRequest().equals(this.getSMSChannelRequest()) == false)
            return false;
        return true;
    }
}
