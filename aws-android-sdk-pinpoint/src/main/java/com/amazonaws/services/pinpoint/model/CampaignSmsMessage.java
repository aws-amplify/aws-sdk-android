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
 * Specifies the content and settings for an SMS message that's sent to
 * recipients of a campaign.
 * </p>
 */
public class CampaignSmsMessage implements Serializable {
    /**
     * <p>
     * The body of the SMS message.
     * </p>
     */
    private String body;

    /**
     * <p>
     * The type of SMS message. Valid values are: TRANSACTIONAL, the message is
     * critical or time-sensitive, such as a one-time password that supports a
     * customer transaction; and, PROMOTIONAL, the message isn't critical or
     * time-sensitive, such as a marketing message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     */
    private String messageType;

    /**
     * <p>
     * The sender ID to display on recipients' devices when they receive the SMS
     * message.
     * </p>
     */
    private String senderId;

    /**
     * <p>
     * The body of the SMS message.
     * </p>
     *
     * @return <p>
     *         The body of the SMS message.
     *         </p>
     */
    public String getBody() {
        return body;
    }

    /**
     * <p>
     * The body of the SMS message.
     * </p>
     *
     * @param body <p>
     *            The body of the SMS message.
     *            </p>
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The body of the SMS message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body <p>
     *            The body of the SMS message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignSmsMessage withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * The type of SMS message. Valid values are: TRANSACTIONAL, the message is
     * critical or time-sensitive, such as a one-time password that supports a
     * customer transaction; and, PROMOTIONAL, the message isn't critical or
     * time-sensitive, such as a marketing message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @return <p>
     *         The type of SMS message. Valid values are: TRANSACTIONAL, the
     *         message is critical or time-sensitive, such as a one-time
     *         password that supports a customer transaction; and, PROMOTIONAL,
     *         the message isn't critical or time-sensitive, such as a marketing
     *         message.
     *         </p>
     * @see MessageType
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * <p>
     * The type of SMS message. Valid values are: TRANSACTIONAL, the message is
     * critical or time-sensitive, such as a one-time password that supports a
     * customer transaction; and, PROMOTIONAL, the message isn't critical or
     * time-sensitive, such as a marketing message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @param messageType <p>
     *            The type of SMS message. Valid values are: TRANSACTIONAL, the
     *            message is critical or time-sensitive, such as a one-time
     *            password that supports a customer transaction; and,
     *            PROMOTIONAL, the message isn't critical or time-sensitive,
     *            such as a marketing message.
     *            </p>
     * @see MessageType
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * <p>
     * The type of SMS message. Valid values are: TRANSACTIONAL, the message is
     * critical or time-sensitive, such as a one-time password that supports a
     * customer transaction; and, PROMOTIONAL, the message isn't critical or
     * time-sensitive, such as a marketing message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @param messageType <p>
     *            The type of SMS message. Valid values are: TRANSACTIONAL, the
     *            message is critical or time-sensitive, such as a one-time
     *            password that supports a customer transaction; and,
     *            PROMOTIONAL, the message isn't critical or time-sensitive,
     *            such as a marketing message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageType
     */
    public CampaignSmsMessage withMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }

    /**
     * <p>
     * The type of SMS message. Valid values are: TRANSACTIONAL, the message is
     * critical or time-sensitive, such as a one-time password that supports a
     * customer transaction; and, PROMOTIONAL, the message isn't critical or
     * time-sensitive, such as a marketing message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @param messageType <p>
     *            The type of SMS message. Valid values are: TRANSACTIONAL, the
     *            message is critical or time-sensitive, such as a one-time
     *            password that supports a customer transaction; and,
     *            PROMOTIONAL, the message isn't critical or time-sensitive,
     *            such as a marketing message.
     *            </p>
     * @see MessageType
     */
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
    }

    /**
     * <p>
     * The type of SMS message. Valid values are: TRANSACTIONAL, the message is
     * critical or time-sensitive, such as a one-time password that supports a
     * customer transaction; and, PROMOTIONAL, the message isn't critical or
     * time-sensitive, such as a marketing message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @param messageType <p>
     *            The type of SMS message. Valid values are: TRANSACTIONAL, the
     *            message is critical or time-sensitive, such as a one-time
     *            password that supports a customer transaction; and,
     *            PROMOTIONAL, the message isn't critical or time-sensitive,
     *            such as a marketing message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageType
     */
    public CampaignSmsMessage withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
        return this;
    }

    /**
     * <p>
     * The sender ID to display on recipients' devices when they receive the SMS
     * message.
     * </p>
     *
     * @return <p>
     *         The sender ID to display on recipients' devices when they receive
     *         the SMS message.
     *         </p>
     */
    public String getSenderId() {
        return senderId;
    }

    /**
     * <p>
     * The sender ID to display on recipients' devices when they receive the SMS
     * message.
     * </p>
     *
     * @param senderId <p>
     *            The sender ID to display on recipients' devices when they
     *            receive the SMS message.
     *            </p>
     */
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     * <p>
     * The sender ID to display on recipients' devices when they receive the SMS
     * message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param senderId <p>
     *            The sender ID to display on recipients' devices when they
     *            receive the SMS message.
     *            </p>
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
