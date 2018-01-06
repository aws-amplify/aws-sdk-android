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

public class SendMessagesResult implements Serializable {
    /**
     * Send message response.
     */
    private MessageResponse messageResponse;

    /**
     * Send message response.
     *
     * @return Send message response.
     */
    public MessageResponse getMessageResponse() {
        return messageResponse;
    }

    /**
     * Send message response.
     *
     * @param messageResponse Send message response.
     */
    public void setMessageResponse(MessageResponse messageResponse) {
        this.messageResponse = messageResponse;
    }

    /**
     * Send message response.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageResponse Send message response.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessagesResult withMessageResponse(MessageResponse messageResponse) {
        this.messageResponse = messageResponse;
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
        if (getMessageResponse() != null)
            sb.append("MessageResponse: " + getMessageResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMessageResponse() == null) ? 0 : getMessageResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendMessagesResult == false)
            return false;
        SendMessagesResult other = (SendMessagesResult) obj;

        if (other.getMessageResponse() == null ^ this.getMessageResponse() == null)
            return false;
        if (other.getMessageResponse() != null
                && other.getMessageResponse().equals(this.getMessageResponse()) == false)
            return false;
        return true;
    }
}
