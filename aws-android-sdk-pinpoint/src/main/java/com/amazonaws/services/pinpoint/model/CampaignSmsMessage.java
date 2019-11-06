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
 * SMS message configuration.
 */
public class CampaignSmsMessage implements Serializable {
    /**
     * The SMS text body.
     */
    private String body;

    /**
     * Is this is a transactional SMS message, otherwise a promotional message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     */
    private String messageType;

    /**
     * Sender ID of sent message.
     */
    private String senderId;

    /**
     * The SMS text body.
     *
     * @return The SMS text body.
     */
    public String getBody() {
        return body;
    }

    /**
     * The SMS text body.
     *
     * @param body The SMS text body.
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * The SMS text body.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body The SMS text body.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignSmsMessage withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Is this is a transactional SMS message, otherwise a promotional message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @return Is this is a transactional SMS message, otherwise a promotional
     *         message.
     * @see MessageType
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Is this is a transactional SMS message, otherwise a promotional message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @param messageType Is this is a transactional SMS message, otherwise a
     *            promotional message.
     * @see MessageType
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * Is this is a transactional SMS message, otherwise a promotional message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @param messageType Is this is a transactional SMS message, otherwise a
     *            promotional message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageType
     */
    public CampaignSmsMessage withMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }

    /**
     * Is this is a transactional SMS message, otherwise a promotional message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @param messageType Is this is a transactional SMS message, otherwise a
     *            promotional message.
     * @see MessageType
     */
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
    }

    /**
     * Is this is a transactional SMS message, otherwise a promotional message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @param messageType Is this is a transactional SMS message, otherwise a
     *            promotional message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageType
     */
    public CampaignSmsMessage withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
        return this;
    }

    /**
     * Sender ID of sent message.
     *
     * @return Sender ID of sent message.
     */
    public String getSenderId() {
        return senderId;
    }

    /**
     * Sender ID of sent message.
     *
     * @param senderId Sender ID of sent message.
     */
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     * Sender ID of sent message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param senderId Sender ID of sent message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignSmsMessage withSenderId(String senderId) {
        this.senderId = senderId;
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
        if (getBody() != null)
            sb.append("Body: " + getBody() + ",");
        if (getMessageType() != null)
            sb.append("MessageType: " + getMessageType() + ",");
        if (getSenderId() != null)
            sb.append("SenderId: " + getSenderId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode
                + ((getMessageType() == null) ? 0 : getMessageType().hashCode());
        hashCode = prime * hashCode + ((getSenderId() == null) ? 0 : getSenderId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CampaignSmsMessage == false)
            return false;
        CampaignSmsMessage other = (CampaignSmsMessage) obj;

        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getMessageType() == null ^ this.getMessageType() == null)
            return false;
        if (other.getMessageType() != null
                && other.getMessageType().equals(this.getMessageType()) == false)
            return false;
        if (other.getSenderId() == null ^ this.getSenderId() == null)
            return false;
        if (other.getSenderId() != null && other.getSenderId().equals(this.getSenderId()) == false)
            return false;
        return true;
    }
}
