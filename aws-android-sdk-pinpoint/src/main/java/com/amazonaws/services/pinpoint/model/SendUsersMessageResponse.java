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

/**
 * User send message response.
 */
public class SendUsersMessageResponse implements Serializable {
    /**
     * The unique ID of the Amazon Pinpoint project used to send the message.
     */
    private String applicationId;

    /**
     * The unique ID assigned to the users-messages request.
     */
    private String requestId;

    /**
     * An object that shows the endpoints that were messaged for each user. The
     * object provides a list of user IDs. For each user ID, it provides the
     * endpoint IDs that were messaged. For each endpoint ID, it provides an
     * EndpointMessageResult object.
     */
    private java.util.Map<String, java.util.Map<String, EndpointMessageResult>> result;

    /**
     * The unique ID of the Amazon Pinpoint project used to send the message.
     *
     * @return The unique ID of the Amazon Pinpoint project used to send the
     *         message.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * The unique ID of the Amazon Pinpoint project used to send the message.
     *
     * @param applicationId The unique ID of the Amazon Pinpoint project used to
     *            send the message.
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The unique ID of the Amazon Pinpoint project used to send the message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId The unique ID of the Amazon Pinpoint project used to
     *            send the message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendUsersMessageResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * The unique ID assigned to the users-messages request.
     *
     * @return The unique ID assigned to the users-messages request.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * The unique ID assigned to the users-messages request.
     *
     * @param requestId The unique ID assigned to the users-messages request.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * The unique ID assigned to the users-messages request.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestId The unique ID assigned to the users-messages request.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendUsersMessageResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * An object that shows the endpoints that were messaged for each user. The
     * object provides a list of user IDs. For each user ID, it provides the
     * endpoint IDs that were messaged. For each endpoint ID, it provides an
     * EndpointMessageResult object.
     *
     * @return An object that shows the endpoints that were messaged for each
     *         user. The object provides a list of user IDs. For each user ID,
     *         it provides the endpoint IDs that were messaged. For each
     *         endpoint ID, it provides an EndpointMessageResult object.
     */
    public java.util.Map<String, java.util.Map<String, EndpointMessageResult>> getResult() {
        return result;
    }

    /**
     * An object that shows the endpoints that were messaged for each user. The
     * object provides a list of user IDs. For each user ID, it provides the
     * endpoint IDs that were messaged. For each endpoint ID, it provides an
     * EndpointMessageResult object.
     *
     * @param result An object that shows the endpoints that were messaged for
     *            each user. The object provides a list of user IDs. For each
     *            user ID, it provides the endpoint IDs that were messaged. For
     *            each endpoint ID, it provides an EndpointMessageResult object.
     */
    public void setResult(java.util.Map<String, java.util.Map<String, EndpointMessageResult>> result) {
        this.result = result;
    }

    /**
     * An object that shows the endpoints that were messaged for each user. The
     * object provides a list of user IDs. For each user ID, it provides the
     * endpoint IDs that were messaged. For each endpoint ID, it provides an
     * EndpointMessageResult object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param result An object that shows the endpoints that were messaged for
     *            each user. The object provides a list of user IDs. For each
     *            user ID, it provides the endpoint IDs that were messaged. For
     *            each endpoint ID, it provides an EndpointMessageResult object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendUsersMessageResponse withResult(
            java.util.Map<String, java.util.Map<String, EndpointMessageResult>> result) {
        this.result = result;
        return this;
    }

    /**
     * An object that shows the endpoints that were messaged for each user. The
     * object provides a list of user IDs. For each user ID, it provides the
     * endpoint IDs that were messaged. For each endpoint ID, it provides an
     * EndpointMessageResult object.
     * <p>
     * The method adds a new key-value pair into Result parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Result.
     * @param value The corresponding value of the entry to be added into
     *            Result.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendUsersMessageResponse addResultEntry(String key,
            java.util.Map<String, EndpointMessageResult> value) {
        if (null == this.result) {
            this.result = new java.util.HashMap<String, java.util.Map<String, EndpointMessageResult>>();
        }
        if (this.result.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.result.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Result.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SendUsersMessageResponse clearResultEntries() {
        this.result = null;
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
        if (getRequestId() != null)
            sb.append("RequestId: " + getRequestId() + ",");
        if (getResult() != null)
            sb.append("Result: " + getResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendUsersMessageResponse == false)
            return false;
        SendUsersMessageResponse other = (SendUsersMessageResponse) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        return true;
    }
}
