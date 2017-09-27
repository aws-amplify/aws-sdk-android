/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Send a batch of messages to users
 */
public class SendUsersMessagesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The new value for the applicationId property for this object.
     */
    private String applicationId;

    /**
     * Send message request.
     */
    private SendUsersMessageRequest sendUsersMessageRequest;

    /**
     * Returns the value of the applicationId property for this object.
     *
     * @return The value of the applicationId property for this object.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of applicationId
     *
     * @param applicationId The new value for the applicationId property for
     *            this object.
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets the value of the applicationId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId The new value for the applicationId property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendUsersMessagesRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Send message request.
     *
     * @return Send message request.
     */
    public SendUsersMessageRequest getSendUsersMessageRequest() {
        return sendUsersMessageRequest;
    }

    /**
     * Send message request.
     *
     * @param sendUsersMessageRequest Send message request.
     */
    public void setSendUsersMessageRequest(SendUsersMessageRequest sendUsersMessageRequest) {
        this.sendUsersMessageRequest = sendUsersMessageRequest;
    }

    /**
     * Send message request.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sendUsersMessageRequest Send message request.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendUsersMessagesRequest withSendUsersMessageRequest(
            SendUsersMessageRequest sendUsersMessageRequest) {
        this.sendUsersMessageRequest = sendUsersMessageRequest;
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
        if (getSendUsersMessageRequest() != null)
            sb.append("SendUsersMessageRequest: " + getSendUsersMessageRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime
                * hashCode
                + ((getSendUsersMessageRequest() == null) ? 0 : getSendUsersMessageRequest()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendUsersMessagesRequest == false)
            return false;
        SendUsersMessagesRequest other = (SendUsersMessagesRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getSendUsersMessageRequest() == null ^ this.getSendUsersMessageRequest() == null)
            return false;
        if (other.getSendUsersMessageRequest() != null
                && other.getSendUsersMessageRequest().equals(this.getSendUsersMessageRequest()) == false)
            return false;
        return true;
    }
}
