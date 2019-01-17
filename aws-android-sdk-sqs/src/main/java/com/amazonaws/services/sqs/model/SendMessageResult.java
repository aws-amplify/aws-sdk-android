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

package com.amazonaws.services.sqs.model;

import java.io.Serializable;

/**
 * <p>
 * The MD5OfMessageBody and MessageId elements.
 * </p>
 */
public class SendMessageResult implements Serializable {
    /**
     * <p>
     * An MD5 digest of the non-URL-encoded message body string. This can be
     * used to verify that Amazon SQS received the message correctly. Amazon SQS
     * first URL decodes the message before creating the MD5 digest. For
     * information about MD5, see <a
     * href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * </p>
     */
    private String mD5OfMessageBody;

    /**
     * <p>
     * An MD5 digest of the non-URL-encoded message attribute string. This can
     * be used to verify that Amazon SQS received the message correctly. Amazon
     * SQS first URL decodes the message before creating the MD5 digest. For
     * information about MD5, see <a
     * href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * </p>
     */
    private String mD5OfMessageAttributes;

    /**
     * <p>
     * An element containing the message ID of the message sent to the queue.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html"
     * >Queue and Message Identifiers</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     */
    private String messageId;

    /**
     * <p>
     * <i>This element applies only to FIFO (first-in-first-out) queues.</i>
     * </p>
     * <p>
     * A large, non-consecutive number that Amazon SQS assigns to each message.
     * </p>
     * <p>
     * The length of <code>SequenceNumber</code> is 128 bits.
     * <code>SequenceNumber</code> continues to increase for a particular
     * <code>MessageGroupId</code>.
     * </p>
     */
    private String sequenceNumber;

    /**
     * <p>
     * An MD5 digest of the non-URL-encoded message body string. This can be
     * used to verify that Amazon SQS received the message correctly. Amazon SQS
     * first URL decodes the message before creating the MD5 digest. For
     * information about MD5, see <a
     * href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * </p>
     *
     * @return <p>
     *         An MD5 digest of the non-URL-encoded message body string. This
     *         can be used to verify that Amazon SQS received the message
     *         correctly. Amazon SQS first URL decodes the message before
     *         creating the MD5 digest. For information about MD5, see <a
     *         href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     *         </p>
     */
    public String getMD5OfMessageBody() {
        return mD5OfMessageBody;
    }

    /**
     * <p>
     * An MD5 digest of the non-URL-encoded message body string. This can be
     * used to verify that Amazon SQS received the message correctly. Amazon SQS
     * first URL decodes the message before creating the MD5 digest. For
     * information about MD5, see <a
     * href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * </p>
     *
     * @param mD5OfMessageBody <p>
     *            An MD5 digest of the non-URL-encoded message body string. This
     *            can be used to verify that Amazon SQS received the message
     *            correctly. Amazon SQS first URL decodes the message before
     *            creating the MD5 digest. For information about MD5, see <a
     *            href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     *            </p>
     */
    public void setMD5OfMessageBody(String mD5OfMessageBody) {
        this.mD5OfMessageBody = mD5OfMessageBody;
    }

    /**
     * <p>
     * An MD5 digest of the non-URL-encoded message body string. This can be
     * used to verify that Amazon SQS received the message correctly. Amazon SQS
     * first URL decodes the message before creating the MD5 digest. For
     * information about MD5, see <a
     * href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mD5OfMessageBody <p>
     *            An MD5 digest of the non-URL-encoded message body string. This
     *            can be used to verify that Amazon SQS received the message
     *            correctly. Amazon SQS first URL decodes the message before
     *            creating the MD5 digest. For information about MD5, see <a
     *            href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageResult withMD5OfMessageBody(String mD5OfMessageBody) {
        this.mD5OfMessageBody = mD5OfMessageBody;
        return this;
    }

    /**
     * <p>
     * An MD5 digest of the non-URL-encoded message attribute string. This can
     * be used to verify that Amazon SQS received the message correctly. Amazon
     * SQS first URL decodes the message before creating the MD5 digest. For
     * information about MD5, see <a
     * href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * </p>
     *
     * @return <p>
     *         An MD5 digest of the non-URL-encoded message attribute string.
     *         This can be used to verify that Amazon SQS received the message
     *         correctly. Amazon SQS first URL decodes the message before
     *         creating the MD5 digest. For information about MD5, see <a
     *         href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     *         </p>
     */
    public String getMD5OfMessageAttributes() {
        return mD5OfMessageAttributes;
    }

    /**
     * <p>
     * An MD5 digest of the non-URL-encoded message attribute string. This can
     * be used to verify that Amazon SQS received the message correctly. Amazon
     * SQS first URL decodes the message before creating the MD5 digest. For
     * information about MD5, see <a
     * href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * </p>
     *
     * @param mD5OfMessageAttributes <p>
     *            An MD5 digest of the non-URL-encoded message attribute string.
     *            This can be used to verify that Amazon SQS received the
     *            message correctly. Amazon SQS first URL decodes the message
     *            before creating the MD5 digest. For information about MD5, see
     *            <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     *            </p>
     */
    public void setMD5OfMessageAttributes(String mD5OfMessageAttributes) {
        this.mD5OfMessageAttributes = mD5OfMessageAttributes;
    }

    /**
     * <p>
     * An MD5 digest of the non-URL-encoded message attribute string. This can
     * be used to verify that Amazon SQS received the message correctly. Amazon
     * SQS first URL decodes the message before creating the MD5 digest. For
     * information about MD5, see <a
     * href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mD5OfMessageAttributes <p>
     *            An MD5 digest of the non-URL-encoded message attribute string.
     *            This can be used to verify that Amazon SQS received the
     *            message correctly. Amazon SQS first URL decodes the message
     *            before creating the MD5 digest. For information about MD5, see
     *            <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageResult withMD5OfMessageAttributes(String mD5OfMessageAttributes) {
        this.mD5OfMessageAttributes = mD5OfMessageAttributes;
        return this;
    }

    /**
     * <p>
     * An element containing the message ID of the message sent to the queue.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html"
     * >Queue and Message Identifiers</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         An element containing the message ID of the message sent to the
     *         queue. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html"
     *         >Queue and Message Identifiers</a> in the <i>Amazon SQS Developer
     *         Guide</i>.
     *         </p>
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * <p>
     * An element containing the message ID of the message sent to the queue.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html"
     * >Queue and Message Identifiers</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     *
     * @param messageId <p>
     *            An element containing the message ID of the message sent to
     *            the queue. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html"
     *            >Queue and Message Identifiers</a> in the <i>Amazon SQS
     *            Developer Guide</i>.
     *            </p>
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * An element containing the message ID of the message sent to the queue.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html"
     * >Queue and Message Identifiers</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageId <p>
     *            An element containing the message ID of the message sent to
     *            the queue. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html"
     *            >Queue and Message Identifiers</a> in the <i>Amazon SQS
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageResult withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * <p>
     * <i>This element applies only to FIFO (first-in-first-out) queues.</i>
     * </p>
     * <p>
     * A large, non-consecutive number that Amazon SQS assigns to each message.
     * </p>
     * <p>
     * The length of <code>SequenceNumber</code> is 128 bits.
     * <code>SequenceNumber</code> continues to increase for a particular
     * <code>MessageGroupId</code>.
     * </p>
     *
     * @return <p>
     *         <i>This element applies only to FIFO (first-in-first-out)
     *         queues.</i>
     *         </p>
     *         <p>
     *         A large, non-consecutive number that Amazon SQS assigns to each
     *         message.
     *         </p>
     *         <p>
     *         The length of <code>SequenceNumber</code> is 128 bits.
     *         <code>SequenceNumber</code> continues to increase for a
     *         particular <code>MessageGroupId</code>.
     *         </p>
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * <p>
     * <i>This element applies only to FIFO (first-in-first-out) queues.</i>
     * </p>
     * <p>
     * A large, non-consecutive number that Amazon SQS assigns to each message.
     * </p>
     * <p>
     * The length of <code>SequenceNumber</code> is 128 bits.
     * <code>SequenceNumber</code> continues to increase for a particular
     * <code>MessageGroupId</code>.
     * </p>
     *
     * @param sequenceNumber <p>
     *            <i>This element applies only to FIFO (first-in-first-out)
     *            queues.</i>
     *            </p>
     *            <p>
     *            A large, non-consecutive number that Amazon SQS assigns to
     *            each message.
     *            </p>
     *            <p>
     *            The length of <code>SequenceNumber</code> is 128 bits.
     *            <code>SequenceNumber</code> continues to increase for a
     *            particular <code>MessageGroupId</code>.
     *            </p>
     */
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * <p>
     * <i>This element applies only to FIFO (first-in-first-out) queues.</i>
     * </p>
     * <p>
     * A large, non-consecutive number that Amazon SQS assigns to each message.
     * </p>
     * <p>
     * The length of <code>SequenceNumber</code> is 128 bits.
     * <code>SequenceNumber</code> continues to increase for a particular
     * <code>MessageGroupId</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sequenceNumber <p>
     *            <i>This element applies only to FIFO (first-in-first-out)
     *            queues.</i>
     *            </p>
     *            <p>
     *            A large, non-consecutive number that Amazon SQS assigns to
     *            each message.
     *            </p>
     *            <p>
     *            The length of <code>SequenceNumber</code> is 128 bits.
     *            <code>SequenceNumber</code> continues to increase for a
     *            particular <code>MessageGroupId</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageResult withSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
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
        if (getMD5OfMessageBody() != null)
            sb.append("MD5OfMessageBody: " + getMD5OfMessageBody() + ",");
        if (getMD5OfMessageAttributes() != null)
            sb.append("MD5OfMessageAttributes: " + getMD5OfMessageAttributes() + ",");
        if (getMessageId() != null)
            sb.append("MessageId: " + getMessageId() + ",");
        if (getSequenceNumber() != null)
            sb.append("SequenceNumber: " + getSequenceNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMD5OfMessageBody() == null) ? 0 : getMD5OfMessageBody().hashCode());
        hashCode = prime
                * hashCode
                + ((getMD5OfMessageAttributes() == null) ? 0 : getMD5OfMessageAttributes()
                        .hashCode());
        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode
                + ((getSequenceNumber() == null) ? 0 : getSequenceNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendMessageResult == false)
            return false;
        SendMessageResult other = (SendMessageResult) obj;

        if (other.getMD5OfMessageBody() == null ^ this.getMD5OfMessageBody() == null)
            return false;
        if (other.getMD5OfMessageBody() != null
                && other.getMD5OfMessageBody().equals(this.getMD5OfMessageBody()) == false)
            return false;
        if (other.getMD5OfMessageAttributes() == null ^ this.getMD5OfMessageAttributes() == null)
            return false;
        if (other.getMD5OfMessageAttributes() != null
                && other.getMD5OfMessageAttributes().equals(this.getMD5OfMessageAttributes()) == false)
            return false;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null
                && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getSequenceNumber() == null ^ this.getSequenceNumber() == null)
            return false;
        if (other.getSequenceNumber() != null
                && other.getSequenceNumber().equals(this.getSequenceNumber()) == false)
            return false;
        return true;
    }
}
