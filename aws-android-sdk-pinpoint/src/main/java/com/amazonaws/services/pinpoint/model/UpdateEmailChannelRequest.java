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
 * Update an email channel.
 */
public class UpdateEmailChannelRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The unique ID of your Amazon Pinpoint application.
     */
    private String applicationId;

    /**
     * Email Channel Request
     */
    private EmailChannelRequest emailChannelRequest;

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
    public UpdateEmailChannelRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Email Channel Request
     *
     * @return Email Channel Request
     */
    public EmailChannelRequest getEmailChannelRequest() {
        return emailChannelRequest;
    }

    /**
     * Email Channel Request
     *
     * @param emailChannelRequest Email Channel Request
     */
    public void setEmailChannelRequest(EmailChannelRequest emailChannelRequest) {
        this.emailChannelRequest = emailChannelRequest;
    }

    /**
     * Email Channel Request
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emailChannelRequest Email Channel Request
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEmailChannelRequest withEmailChannelRequest(EmailChannelRequest emailChannelRequest) {
        this.emailChannelRequest = emailChannelRequest;
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
        if (getEmailChannelRequest() != null)
            sb.append("EmailChannelRequest: " + getEmailChannelRequest());
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
                + ((getEmailChannelRequest() == null) ? 0 : getEmailChannelRequest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEmailChannelRequest == false)
            return false;
        UpdateEmailChannelRequest other = (UpdateEmailChannelRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getEmailChannelRequest() == null ^ this.getEmailChannelRequest() == null)
            return false;
        if (other.getEmailChannelRequest() != null
                && other.getEmailChannelRequest().equals(this.getEmailChannelRequest()) == false)
            return false;
        return true;
    }
}
