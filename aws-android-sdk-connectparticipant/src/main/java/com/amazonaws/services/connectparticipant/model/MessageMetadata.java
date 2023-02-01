/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;

/**
 * <p>
 * Contains metadata related to a message.
 * </p>
 */
public class MessageMetadata implements Serializable {
    /**
     * <p>
     * The identifier of the message that contains the metadata information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String messageId;

    /**
     * <p>
     * The list of receipt information for a message for different recipients.
     * </p>
     */
    private java.util.List<Receipt> receipts;

    /**
     * <p>
     * The identifier of the message that contains the metadata information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the message that contains the metadata
     *         information.
     *         </p>
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * <p>
     * The identifier of the message that contains the metadata information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param messageId <p>
     *            The identifier of the message that contains the metadata
     *            information.
     *            </p>
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The identifier of the message that contains the metadata information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param messageId <p>
     *            The identifier of the message that contains the metadata
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageMetadata withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * <p>
     * The list of receipt information for a message for different recipients.
     * </p>
     *
     * @return <p>
     *         The list of receipt information for a message for different
     *         recipients.
     *         </p>
     */
    public java.util.List<Receipt> getReceipts() {
        return receipts;
    }

    /**
     * <p>
     * The list of receipt information for a message for different recipients.
     * </p>
     *
     * @param receipts <p>
     *            The list of receipt information for a message for different
     *            recipients.
     *            </p>
     */
    public void setReceipts(java.util.Collection<Receipt> receipts) {
        if (receipts == null) {
            this.receipts = null;
            return;
        }

        this.receipts = new java.util.ArrayList<Receipt>(receipts);
    }

    /**
     * <p>
     * The list of receipt information for a message for different recipients.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param receipts <p>
     *            The list of receipt information for a message for different
     *            recipients.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageMetadata withReceipts(Receipt... receipts) {
        if (getReceipts() == null) {
            this.receipts = new java.util.ArrayList<Receipt>(receipts.length);
        }
        for (Receipt value : receipts) {
            this.receipts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of receipt information for a message for different recipients.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param receipts <p>
     *            The list of receipt information for a message for different
     *            recipients.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageMetadata withReceipts(java.util.Collection<Receipt> receipts) {
        setReceipts(receipts);
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
            sb.append("MessageId: " + getMessageId() + ",");
        if (getReceipts() != null)
            sb.append("Receipts: " + getReceipts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getReceipts() == null) ? 0 : getReceipts().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageMetadata == false)
            return false;
        MessageMetadata other = (MessageMetadata) obj;

        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null
                && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getReceipts() == null ^ this.getReceipts() == null)
            return false;
        if (other.getReceipts() != null && other.getReceipts().equals(this.getReceipts()) == false)
            return false;
        return true;
    }
}
