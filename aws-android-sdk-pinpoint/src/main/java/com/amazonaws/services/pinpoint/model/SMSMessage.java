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
 * Specifies the default settings for a one-time SMS message that's sent
 * directly to an endpoint.
 * </p>
 */
public class SMSMessage implements Serializable {
    /**
     * <p>
     * The body of the SMS message.
     * </p>
     */
    private String body;

    /**
     * <p>
     * The SMS program name that you provided to AWS Support when you requested
     * your dedicated number.
     * </p>
     */
    private String keyword;

    /**
     * <p>
     * The SMS message type. Valid values are: TRANSACTIONAL, the message is
     * critical or time-sensitive, such as a one-time password that supports a
     * customer transaction; and, PROMOTIONAL, the message is not critical or
     * time-sensitive, such as a marketing message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     */
    private String messageType;

    /**
     * <p>
     * The number to send the SMS message from. This value should be one of the
     * dedicated long or short codes that's assigned to your AWS account. If you
     * don't specify a long or short code, Amazon Pinpoint assigns a random long
     * code to the SMS message and sends the message from that code.
     * </p>
     */
    private String originationNumber;

    /**
     * <p>
     * The sender ID to display as the sender of the message on a recipient's
     * device. Support for sender IDs varies by country or region.
     * </p>
     */
    private String senderId;

    /**
     * <p>
     * The message variables to use in the SMS message. You can override the
     * default variables with individual address variables.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> substitutions;

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
    public SMSMessage withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * The SMS program name that you provided to AWS Support when you requested
     * your dedicated number.
     * </p>
     *
     * @return <p>
     *         The SMS program name that you provided to AWS Support when you
     *         requested your dedicated number.
     *         </p>
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * <p>
     * The SMS program name that you provided to AWS Support when you requested
     * your dedicated number.
     * </p>
     *
     * @param keyword <p>
     *            The SMS program name that you provided to AWS Support when you
     *            requested your dedicated number.
     *            </p>
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * <p>
     * The SMS program name that you provided to AWS Support when you requested
     * your dedicated number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyword <p>
     *            The SMS program name that you provided to AWS Support when you
     *            requested your dedicated number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSMessage withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * <p>
     * The SMS message type. Valid values are: TRANSACTIONAL, the message is
     * critical or time-sensitive, such as a one-time password that supports a
     * customer transaction; and, PROMOTIONAL, the message is not critical or
     * time-sensitive, such as a marketing message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @return <p>
     *         The SMS message type. Valid values are: TRANSACTIONAL, the
     *         message is critical or time-sensitive, such as a one-time
     *         password that supports a customer transaction; and, PROMOTIONAL,
     *         the message is not critical or time-sensitive, such as a
     *         marketing message.
     *         </p>
     * @see MessageType
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * <p>
     * The SMS message type. Valid values are: TRANSACTIONAL, the message is
     * critical or time-sensitive, such as a one-time password that supports a
     * customer transaction; and, PROMOTIONAL, the message is not critical or
     * time-sensitive, such as a marketing message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @param messageType <p>
     *            The SMS message type. Valid values are: TRANSACTIONAL, the
     *            message is critical or time-sensitive, such as a one-time
     *            password that supports a customer transaction; and,
     *            PROMOTIONAL, the message is not critical or time-sensitive,
     *            such as a marketing message.
     *            </p>
     * @see MessageType
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * <p>
     * The SMS message type. Valid values are: TRANSACTIONAL, the message is
     * critical or time-sensitive, such as a one-time password that supports a
     * customer transaction; and, PROMOTIONAL, the message is not critical or
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
     *            The SMS message type. Valid values are: TRANSACTIONAL, the
     *            message is critical or time-sensitive, such as a one-time
     *            password that supports a customer transaction; and,
     *            PROMOTIONAL, the message is not critical or time-sensitive,
     *            such as a marketing message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageType
     */
    public SMSMessage withMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }

    /**
     * <p>
     * The SMS message type. Valid values are: TRANSACTIONAL, the message is
     * critical or time-sensitive, such as a one-time password that supports a
     * customer transaction; and, PROMOTIONAL, the message is not critical or
     * time-sensitive, such as a marketing message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @param messageType <p>
     *            The SMS message type. Valid values are: TRANSACTIONAL, the
     *            message is critical or time-sensitive, such as a one-time
     *            password that supports a customer transaction; and,
     *            PROMOTIONAL, the message is not critical or time-sensitive,
     *            such as a marketing message.
     *            </p>
     * @see MessageType
     */
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
    }

    /**
     * <p>
     * The SMS message type. Valid values are: TRANSACTIONAL, the message is
     * critical or time-sensitive, such as a one-time password that supports a
     * customer transaction; and, PROMOTIONAL, the message is not critical or
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
     *            The SMS message type. Valid values are: TRANSACTIONAL, the
     *            message is critical or time-sensitive, such as a one-time
     *            password that supports a customer transaction; and,
     *            PROMOTIONAL, the message is not critical or time-sensitive,
     *            such as a marketing message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageType
     */
    public SMSMessage withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
        return this;
    }

    /**
     * <p>
     * The number to send the SMS message from. This value should be one of the
     * dedicated long or short codes that's assigned to your AWS account. If you
     * don't specify a long or short code, Amazon Pinpoint assigns a random long
     * code to the SMS message and sends the message from that code.
     * </p>
     *
     * @return <p>
     *         The number to send the SMS message from. This value should be one
     *         of the dedicated long or short codes that's assigned to your AWS
     *         account. If you don't specify a long or short code, Amazon
     *         Pinpoint assigns a random long code to the SMS message and sends
     *         the message from that code.
     *         </p>
     */
    public String getOriginationNumber() {
        return originationNumber;
    }

    /**
     * <p>
     * The number to send the SMS message from. This value should be one of the
     * dedicated long or short codes that's assigned to your AWS account. If you
     * don't specify a long or short code, Amazon Pinpoint assigns a random long
     * code to the SMS message and sends the message from that code.
     * </p>
     *
     * @param originationNumber <p>
     *            The number to send the SMS message from. This value should be
     *            one of the dedicated long or short codes that's assigned to
     *            your AWS account. If you don't specify a long or short code,
     *            Amazon Pinpoint assigns a random long code to the SMS message
     *            and sends the message from that code.
     *            </p>
     */
    public void setOriginationNumber(String originationNumber) {
        this.originationNumber = originationNumber;
    }

    /**
     * <p>
     * The number to send the SMS message from. This value should be one of the
     * dedicated long or short codes that's assigned to your AWS account. If you
     * don't specify a long or short code, Amazon Pinpoint assigns a random long
     * code to the SMS message and sends the message from that code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param originationNumber <p>
     *            The number to send the SMS message from. This value should be
     *            one of the dedicated long or short codes that's assigned to
     *            your AWS account. If you don't specify a long or short code,
     *            Amazon Pinpoint assigns a random long code to the SMS message
     *            and sends the message from that code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSMessage withOriginationNumber(String originationNumber) {
        this.originationNumber = originationNumber;
        return this;
    }

    /**
     * <p>
     * The sender ID to display as the sender of the message on a recipient's
     * device. Support for sender IDs varies by country or region.
     * </p>
     *
     * @return <p>
     *         The sender ID to display as the sender of the message on a
     *         recipient's device. Support for sender IDs varies by country or
     *         region.
     *         </p>
     */
    public String getSenderId() {
        return senderId;
    }

    /**
     * <p>
     * The sender ID to display as the sender of the message on a recipient's
     * device. Support for sender IDs varies by country or region.
     * </p>
     *
     * @param senderId <p>
     *            The sender ID to display as the sender of the message on a
     *            recipient's device. Support for sender IDs varies by country
     *            or region.
     *            </p>
     */
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     * <p>
     * The sender ID to display as the sender of the message on a recipient's
     * device. Support for sender IDs varies by country or region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param senderId <p>
     *            The sender ID to display as the sender of the message on a
     *            recipient's device. Support for sender IDs varies by country
     *            or region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSMessage withSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }

    /**
     * <p>
     * The message variables to use in the SMS message. You can override the
     * default variables with individual address variables.
     * </p>
     *
     * @return <p>
     *         The message variables to use in the SMS message. You can override
     *         the default variables with individual address variables.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * <p>
     * The message variables to use in the SMS message. You can override the
     * default variables with individual address variables.
     * </p>
     *
     * @param substitutions <p>
     *            The message variables to use in the SMS message. You can
     *            override the default variables with individual address
     *            variables.
     *            </p>
     */
    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * <p>
     * The message variables to use in the SMS message. You can override the
     * default variables with individual address variables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param substitutions <p>
     *            The message variables to use in the SMS message. You can
     *            override the default variables with individual address
     *            variables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSMessage withSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
        return this;
    }

    /**
     * <p>
     * The message variables to use in the SMS message. You can override the
     * default variables with individual address variables.
     * </p>
     * <p>
     * The method adds a new key-value pair into Substitutions parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Substitutions.
     * @param value The corresponding value of the entry to be added into
     *            Substitutions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSMessage addSubstitutionsEntry(String key, java.util.List<String> value) {
        if (null == this.substitutions) {
            this.substitutions = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.substitutions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.substitutions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Substitutions.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SMSMessage clearSubstitutionsEntries() {
        this.substitutions = null;
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
        if (getKeyword() != null)
            sb.append("Keyword: " + getKeyword() + ",");
        if (getMessageType() != null)
            sb.append("MessageType: " + getMessageType() + ",");
        if (getOriginationNumber() != null)
            sb.append("OriginationNumber: " + getOriginationNumber() + ",");
        if (getSenderId() != null)
            sb.append("SenderId: " + getSenderId() + ",");
        if (getSubstitutions() != null)
            sb.append("Substitutions: " + getSubstitutions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        hashCode = prime * hashCode
                + ((getMessageType() == null) ? 0 : getMessageType().hashCode());
        hashCode = prime * hashCode
                + ((getOriginationNumber() == null) ? 0 : getOriginationNumber().hashCode());
        hashCode = prime * hashCode + ((getSenderId() == null) ? 0 : getSenderId().hashCode());
        hashCode = prime * hashCode
                + ((getSubstitutions() == null) ? 0 : getSubstitutions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SMSMessage == false)
            return false;
        SMSMessage other = (SMSMessage) obj;

        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getKeyword() == null ^ this.getKeyword() == null)
            return false;
        if (other.getKeyword() != null && other.getKeyword().equals(this.getKeyword()) == false)
            return false;
        if (other.getMessageType() == null ^ this.getMessageType() == null)
            return false;
        if (other.getMessageType() != null
                && other.getMessageType().equals(this.getMessageType()) == false)
            return false;
        if (other.getOriginationNumber() == null ^ this.getOriginationNumber() == null)
            return false;
        if (other.getOriginationNumber() != null
                && other.getOriginationNumber().equals(this.getOriginationNumber()) == false)
            return false;
        if (other.getSenderId() == null ^ this.getSenderId() == null)
            return false;
        if (other.getSenderId() != null && other.getSenderId().equals(this.getSenderId()) == false)
            return false;
        if (other.getSubstitutions() == null ^ this.getSubstitutions() == null)
            return false;
        if (other.getSubstitutions() != null
                && other.getSubstitutions().equals(this.getSubstitutions()) == false)
            return false;
        return true;
    }
}
