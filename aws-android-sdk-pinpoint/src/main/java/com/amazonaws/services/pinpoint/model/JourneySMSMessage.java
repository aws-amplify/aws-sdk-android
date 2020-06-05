/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies the sender ID and message type for an SMS message that's sent to
 * participants in a journey.
 * </p>
 */
public class JourneySMSMessage implements Serializable {
    /**
     * <p>
     * The SMS message type. Valid values are TRANSACTIONAL (for messages that
     * are critical or time-sensitive, such as a one-time passwords) and
     * PROMOTIONAL (for messsages that aren't critical or time-sensitive, such
     * as marketing messages).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     */
    private String messageType;

    /**
     * <p>
     * The sender ID to display as the sender of the message on a recipient's
     * device. Support for sender IDs varies by country or region. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com.amazon.com/pinpoint/latest/userguide/channels-sms-countries.html"
     * >Supported Countries and Regions</a> in the Amazon Pinpoint User Guide.
     * </p>
     */
    private String senderId;

    /**
     * <p>
     * The SMS message type. Valid values are TRANSACTIONAL (for messages that
     * are critical or time-sensitive, such as a one-time passwords) and
     * PROMOTIONAL (for messsages that aren't critical or time-sensitive, such
     * as marketing messages).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @return <p>
     *         The SMS message type. Valid values are TRANSACTIONAL (for
     *         messages that are critical or time-sensitive, such as a one-time
     *         passwords) and PROMOTIONAL (for messsages that aren't critical or
     *         time-sensitive, such as marketing messages).
     *         </p>
     * @see MessageType
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * <p>
     * The SMS message type. Valid values are TRANSACTIONAL (for messages that
     * are critical or time-sensitive, such as a one-time passwords) and
     * PROMOTIONAL (for messsages that aren't critical or time-sensitive, such
     * as marketing messages).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @param messageType <p>
     *            The SMS message type. Valid values are TRANSACTIONAL (for
     *            messages that are critical or time-sensitive, such as a
     *            one-time passwords) and PROMOTIONAL (for messsages that aren't
     *            critical or time-sensitive, such as marketing messages).
     *            </p>
     * @see MessageType
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * <p>
     * The SMS message type. Valid values are TRANSACTIONAL (for messages that
     * are critical or time-sensitive, such as a one-time passwords) and
     * PROMOTIONAL (for messsages that aren't critical or time-sensitive, such
     * as marketing messages).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @param messageType <p>
     *            The SMS message type. Valid values are TRANSACTIONAL (for
     *            messages that are critical or time-sensitive, such as a
     *            one-time passwords) and PROMOTIONAL (for messsages that aren't
     *            critical or time-sensitive, such as marketing messages).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageType
     */
    public JourneySMSMessage withMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }

    /**
     * <p>
     * The SMS message type. Valid values are TRANSACTIONAL (for messages that
     * are critical or time-sensitive, such as a one-time passwords) and
     * PROMOTIONAL (for messsages that aren't critical or time-sensitive, such
     * as marketing messages).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @param messageType <p>
     *            The SMS message type. Valid values are TRANSACTIONAL (for
     *            messages that are critical or time-sensitive, such as a
     *            one-time passwords) and PROMOTIONAL (for messsages that aren't
     *            critical or time-sensitive, such as marketing messages).
     *            </p>
     * @see MessageType
     */
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
    }

    /**
     * <p>
     * The SMS message type. Valid values are TRANSACTIONAL (for messages that
     * are critical or time-sensitive, such as a one-time passwords) and
     * PROMOTIONAL (for messsages that aren't critical or time-sensitive, such
     * as marketing messages).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @param messageType <p>
     *            The SMS message type. Valid values are TRANSACTIONAL (for
     *            messages that are critical or time-sensitive, such as a
     *            one-time passwords) and PROMOTIONAL (for messsages that aren't
     *            critical or time-sensitive, such as marketing messages).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageType
     */
    public JourneySMSMessage withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
        return this;
    }

    /**
     * <p>
     * The sender ID to display as the sender of the message on a recipient's
     * device. Support for sender IDs varies by country or region. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com.amazon.com/pinpoint/latest/userguide/channels-sms-countries.html"
     * >Supported Countries and Regions</a> in the Amazon Pinpoint User Guide.
     * </p>
     *
     * @return <p>
     *         The sender ID to display as the sender of the message on a
     *         recipient's device. Support for sender IDs varies by country or
     *         region. For more information, see <a href=
     *         "https://docs.aws.amazon.com.amazon.com/pinpoint/latest/userguide/channels-sms-countries.html"
     *         >Supported Countries and Regions</a> in the Amazon Pinpoint User
     *         Guide.
     *         </p>
     */
    public String getSenderId() {
        return senderId;
    }

    /**
     * <p>
     * The sender ID to display as the sender of the message on a recipient's
     * device. Support for sender IDs varies by country or region. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com.amazon.com/pinpoint/latest/userguide/channels-sms-countries.html"
     * >Supported Countries and Regions</a> in the Amazon Pinpoint User Guide.
     * </p>
     *
     * @param senderId <p>
     *            The sender ID to display as the sender of the message on a
     *            recipient's device. Support for sender IDs varies by country
     *            or region. For more information, see <a href=
     *            "https://docs.aws.amazon.com.amazon.com/pinpoint/latest/userguide/channels-sms-countries.html"
     *            >Supported Countries and Regions</a> in the Amazon Pinpoint
     *            User Guide.
     *            </p>
     */
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     * <p>
     * The sender ID to display as the sender of the message on a recipient's
     * device. Support for sender IDs varies by country or region. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com.amazon.com/pinpoint/latest/userguide/channels-sms-countries.html"
     * >Supported Countries and Regions</a> in the Amazon Pinpoint User Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param senderId <p>
     *            The sender ID to display as the sender of the message on a
     *            recipient's device. Support for sender IDs varies by country
     *            or region. For more information, see <a href=
     *            "https://docs.aws.amazon.com.amazon.com/pinpoint/latest/userguide/channels-sms-countries.html"
     *            >Supported Countries and Regions</a> in the Amazon Pinpoint
     *            User Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JourneySMSMessage withSenderId(String senderId) {
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

        if (obj instanceof JourneySMSMessage == false)
            return false;
        JourneySMSMessage other = (JourneySMSMessage) obj;

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
