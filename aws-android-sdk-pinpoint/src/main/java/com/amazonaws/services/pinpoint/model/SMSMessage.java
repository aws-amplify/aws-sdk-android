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
 * SMS Message.
 */
public class SMSMessage implements Serializable {
    /**
     * The body of the SMS message.
     */
    private String body;

    /**
     * The SMS program name that you provided to AWS Support when you requested
     * your dedicated number.
     */
    private String keyword;

    /**
     * Is this a transaction priority message or lower priority.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     */
    private String messageType;

    /**
     * The phone number that the SMS message originates from. Specify one of the
     * dedicated long codes or short codes that you requested from AWS Support
     * and that is assigned to your account. If this attribute is not specified,
     * Amazon Pinpoint randomly assigns a long code.
     */
    private String originationNumber;

    /**
     * The sender ID that is shown as the message sender on the recipient's
     * device. Support for sender IDs varies by country or region.
     */
    private String senderId;

    /**
     * Default message substitutions. Can be overridden by individual address
     * substitutions.
     */
    private java.util.Map<String, java.util.List<String>> substitutions;

    /**
     * The body of the SMS message.
     *
     * @return The body of the SMS message.
     */
    public String getBody() {
        return body;
    }

    /**
     * The body of the SMS message.
     *
     * @param body The body of the SMS message.
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * The body of the SMS message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body The body of the SMS message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSMessage withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * The SMS program name that you provided to AWS Support when you requested
     * your dedicated number.
     *
     * @return The SMS program name that you provided to AWS Support when you
     *         requested your dedicated number.
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * The SMS program name that you provided to AWS Support when you requested
     * your dedicated number.
     *
     * @param keyword The SMS program name that you provided to AWS Support when
     *            you requested your dedicated number.
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * The SMS program name that you provided to AWS Support when you requested
     * your dedicated number.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyword The SMS program name that you provided to AWS Support when
     *            you requested your dedicated number.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSMessage withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * Is this a transaction priority message or lower priority.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @return Is this a transaction priority message or lower priority.
     * @see MessageType
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Is this a transaction priority message or lower priority.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @param messageType Is this a transaction priority message or lower
     *            priority.
     * @see MessageType
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * Is this a transaction priority message or lower priority.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @param messageType Is this a transaction priority message or lower
     *            priority.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageType
     */
    public SMSMessage withMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }

    /**
     * Is this a transaction priority message or lower priority.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @param messageType Is this a transaction priority message or lower
     *            priority.
     * @see MessageType
     */
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
    }

    /**
     * Is this a transaction priority message or lower priority.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSACTIONAL, PROMOTIONAL
     *
     * @param messageType Is this a transaction priority message or lower
     *            priority.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageType
     */
    public SMSMessage withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
        return this;
    }

    /**
     * The phone number that the SMS message originates from. Specify one of the
     * dedicated long codes or short codes that you requested from AWS Support
     * and that is assigned to your account. If this attribute is not specified,
     * Amazon Pinpoint randomly assigns a long code.
     *
     * @return The phone number that the SMS message originates from. Specify
     *         one of the dedicated long codes or short codes that you requested
     *         from AWS Support and that is assigned to your account. If this
     *         attribute is not specified, Amazon Pinpoint randomly assigns a
     *         long code.
     */
    public String getOriginationNumber() {
        return originationNumber;
    }

    /**
     * The phone number that the SMS message originates from. Specify one of the
     * dedicated long codes or short codes that you requested from AWS Support
     * and that is assigned to your account. If this attribute is not specified,
     * Amazon Pinpoint randomly assigns a long code.
     *
     * @param originationNumber The phone number that the SMS message originates
     *            from. Specify one of the dedicated long codes or short codes
     *            that you requested from AWS Support and that is assigned to
     *            your account. If this attribute is not specified, Amazon
     *            Pinpoint randomly assigns a long code.
     */
    public void setOriginationNumber(String originationNumber) {
        this.originationNumber = originationNumber;
    }

    /**
     * The phone number that the SMS message originates from. Specify one of the
     * dedicated long codes or short codes that you requested from AWS Support
     * and that is assigned to your account. If this attribute is not specified,
     * Amazon Pinpoint randomly assigns a long code.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param originationNumber The phone number that the SMS message originates
     *            from. Specify one of the dedicated long codes or short codes
     *            that you requested from AWS Support and that is assigned to
     *            your account. If this attribute is not specified, Amazon
     *            Pinpoint randomly assigns a long code.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSMessage withOriginationNumber(String originationNumber) {
        this.originationNumber = originationNumber;
        return this;
    }

    /**
     * The sender ID that is shown as the message sender on the recipient's
     * device. Support for sender IDs varies by country or region.
     *
     * @return The sender ID that is shown as the message sender on the
     *         recipient's device. Support for sender IDs varies by country or
     *         region.
     */
    public String getSenderId() {
        return senderId;
    }

    /**
     * The sender ID that is shown as the message sender on the recipient's
     * device. Support for sender IDs varies by country or region.
     *
     * @param senderId The sender ID that is shown as the message sender on the
     *            recipient's device. Support for sender IDs varies by country
     *            or region.
     */
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     * The sender ID that is shown as the message sender on the recipient's
     * device. Support for sender IDs varies by country or region.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param senderId The sender ID that is shown as the message sender on the
     *            recipient's device. Support for sender IDs varies by country
     *            or region.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSMessage withSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }

    /**
     * Default message substitutions. Can be overridden by individual address
     * substitutions.
     *
     * @return Default message substitutions. Can be overridden by individual
     *         address substitutions.
     */
    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * Default message substitutions. Can be overridden by individual address
     * substitutions.
     *
     * @param substitutions Default message substitutions. Can be overridden by
     *            individual address substitutions.
     */
    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * Default message substitutions. Can be overridden by individual address
     * substitutions.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param substitutions Default message substitutions. Can be overridden by
     *            individual address substitutions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSMessage withSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
        return this;
    }

    /**
     * Default message substitutions. Can be overridden by individual address
     * substitutions.
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
