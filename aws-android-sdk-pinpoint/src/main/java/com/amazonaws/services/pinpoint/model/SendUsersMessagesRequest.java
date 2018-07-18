/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Use this resource to message a list of users. Amazon Pinpoint sends the
 * message to all of the endpoints that are associated with each user. A user
 * represents an individual who is assigned a unique user ID, and this ID is
 * assigned to one or more endpoints. For example, if an individual uses your
 * app on multiple devices, your app could assign that person's user ID to the
 * endpoint for each device. With the users-messages resource, you specify the
 * message recipients as user IDs. For each user ID, Amazon Pinpoint delivers
 * the message to all of the user's endpoints. Within the body of your request,
 * you can specify a default message, and you can tailor your message for
 * different channels, including those for mobile push and SMS. With this
 * resource, you send a direct message, which is a one time message that you
 * send to a limited audience without creating a campaign. You can send the
 * message to up to 100 users per request. You cannot use the message to engage
 * a segment. When you send the message, Amazon Pinpoint delivers it
 * immediately, and you cannot schedule the delivery. To engage a user segment,
 * and to schedule the message delivery, create a campaign instead of using the
 * users-messages resource.
 */
public class SendUsersMessagesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The unique ID of your Amazon Pinpoint application.
     */
    private String applicationId;

    /**
     * Send message request.
     */
    private SendUsersMessageRequest sendUsersMessageRequest;

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
