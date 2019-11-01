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
 * Simple message object.
 */
public class MessageBody implements Serializable {
    /**
     * The error message that's returned from the API.
     */
    private String message;

    /**
     * The unique message body ID.
     */
    private String requestID;

    /**
     * The error message that's returned from the API.
     *
     * @return The error message that's returned from the API.
     */
    public String getMessage() {
        return message;
    }

    /**
     * The error message that's returned from the API.
     *
     * @param message The error message that's returned from the API.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * The error message that's returned from the API.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message The error message that's returned from the API.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageBody withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * The unique message body ID.
     *
     * @return The unique message body ID.
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * The unique message body ID.
     *
     * @param requestID The unique message body ID.
     */
    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    /**
     * The unique message body ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestID The unique message body ID.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageBody withRequestID(String requestID) {
        this.requestID = requestID;
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
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getRequestID() != null)
            sb.append("RequestID: " + getRequestID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getRequestID() == null) ? 0 : getRequestID().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageBody == false)
            return false;
        MessageBody other = (MessageBody) obj;

        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getRequestID() == null ^ this.getRequestID() == null)
            return false;
        if (other.getRequestID() != null
                && other.getRequestID().equals(this.getRequestID()) == false)
            return false;
        return true;
    }
}
