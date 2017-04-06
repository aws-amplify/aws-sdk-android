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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a unique message ID.
 * </p>
 */
public class SendEmailResult implements Serializable {
    /**
     * <p>
     * The unique message identifier returned from the <code>SendEmail</code>
     * action.
     * </p>
     */
    private String messageId;

    /**
     * <p>
     * The unique message identifier returned from the <code>SendEmail</code>
     * action.
     * </p>
     *
     * @return <p>
     *         The unique message identifier returned from the
     *         <code>SendEmail</code> action.
     *         </p>
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * <p>
     * The unique message identifier returned from the <code>SendEmail</code>
     * action.
     * </p>
     *
     * @param messageId <p>
     *            The unique message identifier returned from the
     *            <code>SendEmail</code> action.
     *            </p>
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The unique message identifier returned from the <code>SendEmail</code>
     * action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageId <p>
     *            The unique message identifier returned from the
     *            <code>SendEmail</code> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendEmailResult withMessageId(String messageId) {
        this.messageId = messageId;
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
        if (getMessageId() != null)
            sb.append("MessageId: " + getMessageId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendEmailResult == false)
            return false;
        SendEmailResult other = (SendEmailResult) obj;

        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null
                && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        return true;
    }
}
