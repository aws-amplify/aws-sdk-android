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
 * <p>
 * Provides information about which users and endpoints a message was sent to.
 * </p>
 */
public class SendUsersMessageResponse implements Serializable {
    /**
     * <p>
     * The unique identifier for the application that was used to send the
     * message.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * The unique identifier that was assigned to the message request.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * An object that indicates which endpoints the message was sent to, for
     * each user. The object lists user IDs and, for each user ID, provides the
     * endpoint IDs that the message was sent to. For each endpoint ID, it
     * provides an EndpointMessageResult object.
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, EndpointMessageResult>> result;

    /**
     * <p>
     * The unique identifier for the application that was used to send the
     * message.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the application that was used to send
     *         the message.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that was used to send the
     * message.
     * </p>
     *
     * @param applicationId <p>
     *            The unique identifier for the application that was used to
     *            send the message.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that was used to send the
     * message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId <p>
     *            The unique identifier for the application that was used to
     *            send the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendUsersMessageResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The unique identifier that was assigned to the message request.
     * </p>
     *
     * @return <p>
     *         The unique identifier that was assigned to the message request.
     *         </p>
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * <p>
     * The unique identifier that was assigned to the message request.
     * </p>
     *
     * @param requestId <p>
     *            The unique identifier that was assigned to the message
     *            request.
     *            </p>
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The unique identifier that was assigned to the message request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestId <p>
     *            The unique identifier that was assigned to the message
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendUsersMessageResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * <p>
     * An object that indicates which endpoints the message was sent to, for
     * each user. The object lists user IDs and, for each user ID, provides the
     * endpoint IDs that the message was sent to. For each endpoint ID, it
     * provides an EndpointMessageResult object.
     * </p>
     *
     * @return <p>
     *         An object that indicates which endpoints the message was sent to,
     *         for each user. The object lists user IDs and, for each user ID,
     *         provides the endpoint IDs that the message was sent to. For each
     *         endpoint ID, it provides an EndpointMessageResult object.
     *         </p>
     */
    public java.util.Map<String, java.util.Map<String, EndpointMessageResult>> getResult() {
        return result;
    }

    /**
     * <p>
     * An object that indicates which endpoints the message was sent to, for
     * each user. The object lists user IDs and, for each user ID, provides the
     * endpoint IDs that the message was sent to. For each endpoint ID, it
     * provides an EndpointMessageResult object.
     * </p>
     *
     * @param result <p>
     *            An object that indicates which endpoints the message was sent
     *            to, for each user. The object lists user IDs and, for each
     *            user ID, provides the endpoint IDs that the message was sent
     *            to. For each endpoint ID, it provides an EndpointMessageResult
     *            object.
     *            </p>
     */
    public void setResult(java.util.Map<String, java.util.Map<String, EndpointMessageResult>> result) {
        this.result = result;
    }

    /**
     * <p>
     * An object that indicates which endpoints the message was sent to, for
     * each user. The object lists user IDs and, for each user ID, provides the
     * endpoint IDs that the message was sent to. For each endpoint ID, it
     * provides an EndpointMessageResult object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param result <p>
     *            An object that indicates which endpoints the message was sent
     *            to, for each user. The object lists user IDs and, for each
     *            user ID, provides the endpoint IDs that the message was sent
     *            to. For each endpoint ID, it provides an EndpointMessageResult
     *            object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendUsersMessageResponse withResult(
            java.util.Map<String, java.util.Map<String, EndpointMessageResult>> result) {
        this.result = result;
        return this;
    }

    /**
     * <p>
     * An object that indicates which endpoints the message was sent to, for
     * each user. The object lists user IDs and, for each user ID, provides the
     * endpoint IDs that the message was sent to. For each endpoint ID, it
     * provides an EndpointMessageResult object.
     * </p>
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
