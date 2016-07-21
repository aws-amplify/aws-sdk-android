/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Delivers a message to the specified queue. With Amazon SQS, you now have the
 * ability to send large payload messages that are up to 256KB (262,144 bytes)
 * in size. To send large payloads, you must use an AWS SDK that supports SigV4
 * signing. To verify whether SigV4 is supported for an AWS SDK, check the SDK
 * release notes.
 * </p>
 * <important>
 * <p>
 * The following list shows the characters (in Unicode) allowed in your message,
 * according to the W3C XML specification. For more information, go to <a
 * href="http://www.w3.org/TR/REC-xml/#charsets"
 * >http://www.w3.org/TR/REC-xml/#charsets</a> If you send any characters not
 * included in the list, your request will be rejected.
 * </p>
 * <p>
 * #x9 | #xA | #xD | [#x20 to #xD7FF] | [#xE000 to #xFFFD] | [#x10000 to
 * #x10FFFF]
 * </p>
 * </important>
 */
public class SendMessageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The URL of the Amazon SQS queue to take action on.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     */
    private String queueUrl;

    /**
     * <p>
     * The message to send. String maximum 256 KB in size. For a list of allowed
     * characters, see the preceding important note.
     * </p>
     */
    private String messageBody;

    /**
     * <p>
     * The number of seconds (0 to 900 - 15 minutes) to delay a specific
     * message. Messages with a positive <code>DelaySeconds</code> value become
     * available for processing after the delay time is finished. If you don't
     * specify a value, the default value for the queue applies.
     * </p>
     */
    private Integer delaySeconds;

    /**
     * <p>
     * Each message attribute consists of a Name, Type, and Value. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     * >Message Attribute Items</a>.
     * </p>
     */
    private java.util.Map<String, MessageAttributeValue> messageAttributes = new java.util.HashMap<String, MessageAttributeValue>();

    /**
     * Default constructor for SendMessageRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     */
    public SendMessageRequest() {
    }

    /**
     * Constructs a new SendMessageRequest object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to take action on.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     * @param messageBody <p>
     *            The message to send. String maximum 256 KB in size. For a list
     *            of allowed characters, see the preceding important note.
     *            </p>
     */
    public SendMessageRequest(String queueUrl, String messageBody) {
        setQueueUrl(queueUrl);
        setMessageBody(messageBody);
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to take action on.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     *
     * @return <p>
     *         The URL of the Amazon SQS queue to take action on.
     *         </p>
     *         <p>
     *         Queue URLs are case-sensitive.
     *         </p>
     */
    public String getQueueUrl() {
        return queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to take action on.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     *
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to take action on.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to take action on.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to take action on.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * <p>
     * The message to send. String maximum 256 KB in size. For a list of allowed
     * characters, see the preceding important note.
     * </p>
     *
     * @return <p>
     *         The message to send. String maximum 256 KB in size. For a list of
     *         allowed characters, see the preceding important note.
     *         </p>
     */
    public String getMessageBody() {
        return messageBody;
    }

    /**
     * <p>
     * The message to send. String maximum 256 KB in size. For a list of allowed
     * characters, see the preceding important note.
     * </p>
     *
     * @param messageBody <p>
     *            The message to send. String maximum 256 KB in size. For a list
     *            of allowed characters, see the preceding important note.
     *            </p>
     */
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    /**
     * <p>
     * The message to send. String maximum 256 KB in size. For a list of allowed
     * characters, see the preceding important note.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageBody <p>
     *            The message to send. String maximum 256 KB in size. For a list
     *            of allowed characters, see the preceding important note.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageRequest withMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }

    /**
     * <p>
     * The number of seconds (0 to 900 - 15 minutes) to delay a specific
     * message. Messages with a positive <code>DelaySeconds</code> value become
     * available for processing after the delay time is finished. If you don't
     * specify a value, the default value for the queue applies.
     * </p>
     *
     * @return <p>
     *         The number of seconds (0 to 900 - 15 minutes) to delay a specific
     *         message. Messages with a positive <code>DelaySeconds</code> value
     *         become available for processing after the delay time is finished.
     *         If you don't specify a value, the default value for the queue
     *         applies.
     *         </p>
     */
    public Integer getDelaySeconds() {
        return delaySeconds;
    }

    /**
     * <p>
     * The number of seconds (0 to 900 - 15 minutes) to delay a specific
     * message. Messages with a positive <code>DelaySeconds</code> value become
     * available for processing after the delay time is finished. If you don't
     * specify a value, the default value for the queue applies.
     * </p>
     *
     * @param delaySeconds <p>
     *            The number of seconds (0 to 900 - 15 minutes) to delay a
     *            specific message. Messages with a positive
     *            <code>DelaySeconds</code> value become available for
     *            processing after the delay time is finished. If you don't
     *            specify a value, the default value for the queue applies.
     *            </p>
     */
    public void setDelaySeconds(Integer delaySeconds) {
        this.delaySeconds = delaySeconds;
    }

    /**
     * <p>
     * The number of seconds (0 to 900 - 15 minutes) to delay a specific
     * message. Messages with a positive <code>DelaySeconds</code> value become
     * available for processing after the delay time is finished. If you don't
     * specify a value, the default value for the queue applies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delaySeconds <p>
     *            The number of seconds (0 to 900 - 15 minutes) to delay a
     *            specific message. Messages with a positive
     *            <code>DelaySeconds</code> value become available for
     *            processing after the delay time is finished. If you don't
     *            specify a value, the default value for the queue applies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageRequest withDelaySeconds(Integer delaySeconds) {
        this.delaySeconds = delaySeconds;
        return this;
    }

    /**
     * <p>
     * Each message attribute consists of a Name, Type, and Value. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     * >Message Attribute Items</a>.
     * </p>
     *
     * @return <p>
     *         Each message attribute consists of a Name, Type, and Value. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     *         >Message Attribute Items</a>.
     *         </p>
     */
    public java.util.Map<String, MessageAttributeValue> getMessageAttributes() {
        return messageAttributes;
    }

    /**
     * <p>
     * Each message attribute consists of a Name, Type, and Value. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     * >Message Attribute Items</a>.
     * </p>
     *
     * @param messageAttributes <p>
     *            Each message attribute consists of a Name, Type, and Value.
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     *            >Message Attribute Items</a>.
     *            </p>
     */
    public void setMessageAttributes(java.util.Map<String, MessageAttributeValue> messageAttributes) {
        this.messageAttributes = messageAttributes;
    }

    /**
     * <p>
     * Each message attribute consists of a Name, Type, and Value. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     * >Message Attribute Items</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageAttributes <p>
     *            Each message attribute consists of a Name, Type, and Value.
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     *            >Message Attribute Items</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageRequest withMessageAttributes(
            java.util.Map<String, MessageAttributeValue> messageAttributes) {
        this.messageAttributes = messageAttributes;
        return this;
    }

    /**
     * <p>
     * Each message attribute consists of a Name, Type, and Value. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     * >Message Attribute Items</a>.
     * </p>
     * <p>
     * The method adds a new key-value pair into MessageAttributes parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into MessageAttributes.
     * @param value The corresponding value of the entry to be added into
     *            MessageAttributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageRequest addMessageAttributesEntry(String key, MessageAttributeValue value) {
        if (null == this.messageAttributes) {
            this.messageAttributes = new java.util.HashMap<String, MessageAttributeValue>();
        }
        if (this.messageAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.messageAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MessageAttributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SendMessageRequest clearMessageAttributesEntries() {
        this.messageAttributes = null;
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
        if (getQueueUrl() != null)
            sb.append("QueueUrl: " + getQueueUrl() + ",");
        if (getMessageBody() != null)
            sb.append("MessageBody: " + getMessageBody() + ",");
        if (getDelaySeconds() != null)
            sb.append("DelaySeconds: " + getDelaySeconds() + ",");
        if (getMessageAttributes() != null)
            sb.append("MessageAttributes: " + getMessageAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        hashCode = prime * hashCode
                + ((getMessageBody() == null) ? 0 : getMessageBody().hashCode());
        hashCode = prime * hashCode
                + ((getDelaySeconds() == null) ? 0 : getDelaySeconds().hashCode());
        hashCode = prime * hashCode
                + ((getMessageAttributes() == null) ? 0 : getMessageAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendMessageRequest == false)
            return false;
        SendMessageRequest other = (SendMessageRequest) obj;

        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getMessageBody() == null ^ this.getMessageBody() == null)
            return false;
        if (other.getMessageBody() != null
                && other.getMessageBody().equals(this.getMessageBody()) == false)
            return false;
        if (other.getDelaySeconds() == null ^ this.getDelaySeconds() == null)
            return false;
        if (other.getDelaySeconds() != null
                && other.getDelaySeconds().equals(this.getDelaySeconds()) == false)
            return false;
        if (other.getMessageAttributes() == null ^ this.getMessageAttributes() == null)
            return false;
        if (other.getMessageAttributes() != null
                && other.getMessageAttributes().equals(this.getMessageAttributes()) == false)
            return false;
        return true;
    }
}
