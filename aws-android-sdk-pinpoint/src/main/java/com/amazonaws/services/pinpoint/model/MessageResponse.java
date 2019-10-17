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
 * Send message response.
 */
public class MessageResponse implements Serializable {
    /**
     * Application id of the message.
     */
    private String applicationId;

    /**
     * A map containing a multi part response for each address, with the
     * endpointId as the key and the result as the value.
     */
    private java.util.Map<String, EndpointMessageResult> endpointResult;

    /**
     * Original request Id for which this message was delivered.
     */
    private String requestId;

    /**
     * A map containing a multi part response for each address, with the address
     * as the key(Email address, phone number or push token) and the result as
     * the value.
     */
    private java.util.Map<String, MessageResult> result;

    /**
     * Application id of the message.
     *
     * @return Application id of the message.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Application id of the message.
     *
     * @param applicationId Application id of the message.
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Application id of the message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId Application id of the message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * A map containing a multi part response for each address, with the
     * endpointId as the key and the result as the value.
     *
     * @return A map containing a multi part response for each address, with the
     *         endpointId as the key and the result as the value.
     */
    public java.util.Map<String, EndpointMessageResult> getEndpointResult() {
        return endpointResult;
    }

    /**
     * A map containing a multi part response for each address, with the
     * endpointId as the key and the result as the value.
     *
     * @param endpointResult A map containing a multi part response for each
     *            address, with the endpointId as the key and the result as the
     *            value.
     */
    public void setEndpointResult(java.util.Map<String, EndpointMessageResult> endpointResult) {
        this.endpointResult = endpointResult;
    }

    /**
     * A map containing a multi part response for each address, with the
     * endpointId as the key and the result as the value.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointResult A map containing a multi part response for each
     *            address, with the endpointId as the key and the result as the
     *            value.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageResponse withEndpointResult(
            java.util.Map<String, EndpointMessageResult> endpointResult) {
        this.endpointResult = endpointResult;
        return this;
    }

    /**
     * A map containing a multi part response for each address, with the
     * endpointId as the key and the result as the value.
     * <p>
     * The method adds a new key-value pair into EndpointResult parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into EndpointResult.
     * @param value The corresponding value of the entry to be added into
     *            EndpointResult.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageResponse addEndpointResultEntry(String key, EndpointMessageResult value) {
        if (null == this.endpointResult) {
            this.endpointResult = new java.util.HashMap<String, EndpointMessageResult>();
        }
        if (this.endpointResult.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.endpointResult.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EndpointResult.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public MessageResponse clearEndpointResultEntries() {
        this.endpointResult = null;
        return this;
    }

    /**
     * Original request Id for which this message was delivered.
     *
     * @return Original request Id for which this message was delivered.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Original request Id for which this message was delivered.
     *
     * @param requestId Original request Id for which this message was
     *            delivered.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Original request Id for which this message was delivered.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestId Original request Id for which this message was
     *            delivered.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * A map containing a multi part response for each address, with the address
     * as the key(Email address, phone number or push token) and the result as
     * the value.
     *
     * @return A map containing a multi part response for each address, with the
     *         address as the key(Email address, phone number or push token) and
     *         the result as the value.
     */
    public java.util.Map<String, MessageResult> getResult() {
        return result;
    }

    /**
     * A map containing a multi part response for each address, with the address
     * as the key(Email address, phone number or push token) and the result as
     * the value.
     *
     * @param result A map containing a multi part response for each address,
     *            with the address as the key(Email address, phone number or
     *            push token) and the result as the value.
     */
    public void setResult(java.util.Map<String, MessageResult> result) {
        this.result = result;
    }

    /**
     * A map containing a multi part response for each address, with the address
     * as the key(Email address, phone number or push token) and the result as
     * the value.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param result A map containing a multi part response for each address,
     *            with the address as the key(Email address, phone number or
     *            push token) and the result as the value.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageResponse withResult(java.util.Map<String, MessageResult> result) {
        this.result = result;
        return this;
    }

    /**
     * A map containing a multi part response for each address, with the address
     * as the key(Email address, phone number or push token) and the result as
     * the value.
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
    public MessageResponse addResultEntry(String key, MessageResult value) {
        if (null == this.result) {
            this.result = new java.util.HashMap<String, MessageResult>();
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
    public MessageResponse clearResultEntries() {
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
        if (getEndpointResult() != null)
            sb.append("EndpointResult: " + getEndpointResult() + ",");
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
        hashCode = prime * hashCode
                + ((getEndpointResult() == null) ? 0 : getEndpointResult().hashCode());
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

        if (obj instanceof MessageResponse == false)
            return false;
        MessageResponse other = (MessageResponse) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getEndpointResult() == null ^ this.getEndpointResult() == null)
            return false;
        if (other.getEndpointResult() != null
                && other.getEndpointResult().equals(this.getEndpointResult()) == false)
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
