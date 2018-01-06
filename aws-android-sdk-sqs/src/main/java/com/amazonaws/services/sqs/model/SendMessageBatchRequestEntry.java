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

package com.amazonaws.services.sqs.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the details of a single Amazon SQS message along with a
 * <code>Id</code>.
 * </p>
 */
public class SendMessageBatchRequestEntry implements Serializable {
    /**
     * <p>
     * An identifier for the message in this batch. This is used to communicate
     * the result. Note that the <code>Id</code>s of a batch request need to be
     * unique within the request.
     * </p>
     */
    private String id;

    /**
     * <p>
     * Body of the message.
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
     * <note>
     * <p>
     * When you set <code>FifoQueue</code>, you can't set
     * <code>DelaySeconds</code> per message. You can set this parameter only on
     * a queue level.
     * </p>
     * </note>
     */
    private Integer delaySeconds;

    /**
     * <p>
     * Each message attribute consists of a Name, Type, and Value. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     * >Message Attribute Items</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, MessageAttributeValue> messageAttributes = new java.util.HashMap<String, MessageAttributeValue>();

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The token used for deduplication of messages within a 5-minute minimum
     * deduplication interval. If a message with a particular
     * <code>MessageDeduplicationId</code> is sent successfully, subsequent
     * messages with the same <code>MessageDeduplicationId</code> are accepted
     * successfully but aren't delivered. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * > Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every message must have a unique <code>MessageDeduplicationId</code>,
     * </p>
     * <ul>
     * <li>
     * <p>
     * You may provide a <code>MessageDeduplicationId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you aren't able to provide a <code>MessageDeduplicationId</code> and
     * you enable <code>ContentBasedDeduplication</code> for your queue, Amazon
     * SQS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but
     * not the attributes of the message).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't provide a <code>MessageDeduplicationId</code> and the queue
     * doesn't have <code>ContentBasedDeduplication</code> set, the action fails
     * with an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the queue has <code>ContentBasedDeduplication</code> set, your
     * <code>MessageDeduplicationId</code> overrides the generated one.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * When <code>ContentBasedDeduplication</code> is in effect, messages with
     * identical content sent within the deduplication interval are treated as
     * duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can also use <code>ContentBasedDeduplication</code> for messages with
     * identical content to be treated as duplicates.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send one message with <code>ContentBasedDeduplication</code>
     * enabled and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated
     * for the first <code>MessageDeduplicationId</code>, the two messages are
     * treated as duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>MessageDeduplicationId</code> is available to the recipient of
     * the message (this can be useful for troubleshooting delivery issues).
     * </p>
     * <p>
     * If a message is sent successfully but the acknowledgement is lost and the
     * message is resent with the same <code>MessageDeduplicationId</code> after
     * the deduplication interval, Amazon SQS can't detect duplicate messages.
     * </p>
     * </note>
     * <p>
     * The length of <code>MessageDeduplicationId</code> is 128 characters.
     * <code>MessageDeduplicationId</code> can contain alphanumeric characters (
     * <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and punctuation (
     * <code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     * </p>
     * <p>
     * For best practices of using <code>MessageDeduplicationId</code>, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queue-recommendations.html#using-messagededuplicationid-property"
     * >Using the MessageDeduplicationId Property</a> in the <i>Amazon Simple
     * Queue Service Developer Guide</i>.
     * </p>
     */
    private String messageDeduplicationId;

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The tag that specifies that a message belongs to a specific message
     * group. Messages that belong to the same message group are processed in a
     * FIFO manner (however, messages in different message groups might be
     * processed out of order). To interleave multiple ordered streams within a
     * single queue, use <code>MessageGroupId</code> values (for example,
     * session data for multiple users). In this scenario, multiple readers can
     * process the queue, but the session data of each user is processed in a
     * FIFO fashion.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must associate a non-empty <code>MessageGroupId</code> with a
     * message. If you don't provide a <code>MessageGroupId</code>, the action
     * fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessage</code> might return messages with multiple
     * <code>MessageGroupId</code> values. For each <code>MessageGroupId</code>,
     * the messages are sorted by time sent. The caller can't specify a
     * <code>MessageGroupId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length of <code>MessageGroupId</code> is 128 characters. Valid values
     * are alphanumeric characters and punctuation
     * <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     * </p>
     * <p>
     * For best practices of using <code>MessageGroupId</code>, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queue-recommendations.html#using-messagegroupid-property"
     * >Using the MessageGroupId Property</a> in the <i>Amazon Simple Queue
     * Service Developer Guide</i>.
     * </p>
     */
    private String messageGroupId;

    /**
     * Default constructor for SendMessageBatchRequestEntry object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     */
    public SendMessageBatchRequestEntry() {
    }

    /**
     * Constructs a new SendMessageBatchRequestEntry object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param id <p>
     *            An identifier for the message in this batch. This is used to
     *            communicate the result. Note that the <code>Id</code>s of a
     *            batch request need to be unique within the request.
     *            </p>
     * @param messageBody <p>
     *            Body of the message.
     *            </p>
     */
    public SendMessageBatchRequestEntry(String id, String messageBody) {
        setId(id);
        setMessageBody(messageBody);
    }

    /**
     * <p>
     * An identifier for the message in this batch. This is used to communicate
     * the result. Note that the <code>Id</code>s of a batch request need to be
     * unique within the request.
     * </p>
     *
     * @return <p>
     *         An identifier for the message in this batch. This is used to
     *         communicate the result. Note that the <code>Id</code>s of a batch
     *         request need to be unique within the request.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * An identifier for the message in this batch. This is used to communicate
     * the result. Note that the <code>Id</code>s of a batch request need to be
     * unique within the request.
     * </p>
     *
     * @param id <p>
     *            An identifier for the message in this batch. This is used to
     *            communicate the result. Note that the <code>Id</code>s of a
     *            batch request need to be unique within the request.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * An identifier for the message in this batch. This is used to communicate
     * the result. Note that the <code>Id</code>s of a batch request need to be
     * unique within the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            An identifier for the message in this batch. This is used to
     *            communicate the result. Note that the <code>Id</code>s of a
     *            batch request need to be unique within the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageBatchRequestEntry withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * Body of the message.
     * </p>
     *
     * @return <p>
     *         Body of the message.
     *         </p>
     */
    public String getMessageBody() {
        return messageBody;
    }

    /**
     * <p>
     * Body of the message.
     * </p>
     *
     * @param messageBody <p>
     *            Body of the message.
     *            </p>
     */
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    /**
     * <p>
     * Body of the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageBody <p>
     *            Body of the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageBatchRequestEntry withMessageBody(String messageBody) {
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
     * <note>
     * <p>
     * When you set <code>FifoQueue</code>, you can't set
     * <code>DelaySeconds</code> per message. You can set this parameter only on
     * a queue level.
     * </p>
     * </note>
     *
     * @return <p>
     *         The number of seconds (0 to 900 - 15 minutes) to delay a specific
     *         message. Messages with a positive <code>DelaySeconds</code> value
     *         become available for processing after the delay time is finished.
     *         If you don't specify a value, the default value for the queue
     *         applies.
     *         </p>
     *         <note>
     *         <p>
     *         When you set <code>FifoQueue</code>, you can't set
     *         <code>DelaySeconds</code> per message. You can set this parameter
     *         only on a queue level.
     *         </p>
     *         </note>
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
     * <note>
     * <p>
     * When you set <code>FifoQueue</code>, you can't set
     * <code>DelaySeconds</code> per message. You can set this parameter only on
     * a queue level.
     * </p>
     * </note>
     *
     * @param delaySeconds <p>
     *            The number of seconds (0 to 900 - 15 minutes) to delay a
     *            specific message. Messages with a positive
     *            <code>DelaySeconds</code> value become available for
     *            processing after the delay time is finished. If you don't
     *            specify a value, the default value for the queue applies.
     *            </p>
     *            <note>
     *            <p>
     *            When you set <code>FifoQueue</code>, you can't set
     *            <code>DelaySeconds</code> per message. You can set this
     *            parameter only on a queue level.
     *            </p>
     *            </note>
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
     * <note>
     * <p>
     * When you set <code>FifoQueue</code>, you can't set
     * <code>DelaySeconds</code> per message. You can set this parameter only on
     * a queue level.
     * </p>
     * </note>
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
     *            <note>
     *            <p>
     *            When you set <code>FifoQueue</code>, you can't set
     *            <code>DelaySeconds</code> per message. You can set this
     *            parameter only on a queue level.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageBatchRequestEntry withDelaySeconds(Integer delaySeconds) {
        this.delaySeconds = delaySeconds;
        return this;
    }

    /**
     * <p>
     * Each message attribute consists of a Name, Type, and Value. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     * >Message Attribute Items</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Each message attribute consists of a Name, Type, and Value. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     *         >Message Attribute Items</a> in the <i>Amazon SQS Developer
     *         Guide</i>.
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
     * >Message Attribute Items</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     *
     * @param messageAttributes <p>
     *            Each message attribute consists of a Name, Type, and Value.
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     *            >Message Attribute Items</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
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
     * >Message Attribute Items</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageAttributes <p>
     *            Each message attribute consists of a Name, Type, and Value.
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     *            >Message Attribute Items</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageBatchRequestEntry withMessageAttributes(
            java.util.Map<String, MessageAttributeValue> messageAttributes) {
        this.messageAttributes = messageAttributes;
        return this;
    }

    /**
     * <p>
     * Each message attribute consists of a Name, Type, and Value. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     * >Message Attribute Items</a> in the <i>Amazon SQS Developer Guide</i>.
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
    public SendMessageBatchRequestEntry addMessageAttributesEntry(String key,
            MessageAttributeValue value) {
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
    public SendMessageBatchRequestEntry clearMessageAttributesEntries() {
        this.messageAttributes = null;
        return this;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The token used for deduplication of messages within a 5-minute minimum
     * deduplication interval. If a message with a particular
     * <code>MessageDeduplicationId</code> is sent successfully, subsequent
     * messages with the same <code>MessageDeduplicationId</code> are accepted
     * successfully but aren't delivered. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * > Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every message must have a unique <code>MessageDeduplicationId</code>,
     * </p>
     * <ul>
     * <li>
     * <p>
     * You may provide a <code>MessageDeduplicationId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you aren't able to provide a <code>MessageDeduplicationId</code> and
     * you enable <code>ContentBasedDeduplication</code> for your queue, Amazon
     * SQS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but
     * not the attributes of the message).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't provide a <code>MessageDeduplicationId</code> and the queue
     * doesn't have <code>ContentBasedDeduplication</code> set, the action fails
     * with an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the queue has <code>ContentBasedDeduplication</code> set, your
     * <code>MessageDeduplicationId</code> overrides the generated one.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * When <code>ContentBasedDeduplication</code> is in effect, messages with
     * identical content sent within the deduplication interval are treated as
     * duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can also use <code>ContentBasedDeduplication</code> for messages with
     * identical content to be treated as duplicates.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send one message with <code>ContentBasedDeduplication</code>
     * enabled and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated
     * for the first <code>MessageDeduplicationId</code>, the two messages are
     * treated as duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>MessageDeduplicationId</code> is available to the recipient of
     * the message (this can be useful for troubleshooting delivery issues).
     * </p>
     * <p>
     * If a message is sent successfully but the acknowledgement is lost and the
     * message is resent with the same <code>MessageDeduplicationId</code> after
     * the deduplication interval, Amazon SQS can't detect duplicate messages.
     * </p>
     * </note>
     * <p>
     * The length of <code>MessageDeduplicationId</code> is 128 characters.
     * <code>MessageDeduplicationId</code> can contain alphanumeric characters (
     * <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and punctuation (
     * <code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     * </p>
     * <p>
     * For best practices of using <code>MessageDeduplicationId</code>, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queue-recommendations.html#using-messagededuplicationid-property"
     * >Using the MessageDeduplicationId Property</a> in the <i>Amazon Simple
     * Queue Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         This parameter applies only to FIFO (first-in-first-out) queues.
     *         </p>
     *         <p>
     *         The token used for deduplication of messages within a 5-minute
     *         minimum deduplication interval. If a message with a particular
     *         <code>MessageDeduplicationId</code> is sent successfully,
     *         subsequent messages with the same
     *         <code>MessageDeduplicationId</code> are accepted successfully but
     *         aren't delivered. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *         > Exactly-Once Processing</a> in the <i>Amazon SQS Developer
     *         Guide</i>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Every message must have a unique
     *         <code>MessageDeduplicationId</code>,
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You may provide a <code>MessageDeduplicationId</code> explicitly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you aren't able to provide a
     *         <code>MessageDeduplicationId</code> and you enable
     *         <code>ContentBasedDeduplication</code> for your queue, Amazon SQS
     *         uses a SHA-256 hash to generate the
     *         <code>MessageDeduplicationId</code> using the body of the message
     *         (but not the attributes of the message).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you don't provide a <code>MessageDeduplicationId</code> and
     *         the queue doesn't have <code>ContentBasedDeduplication</code>
     *         set, the action fails with an error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the queue has <code>ContentBasedDeduplication</code> set, your
     *         <code>MessageDeduplicationId</code> overrides the generated one.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         When <code>ContentBasedDeduplication</code> is in effect,
     *         messages with identical content sent within the deduplication
     *         interval are treated as duplicates and only one copy of the
     *         message is delivered.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can also use <code>ContentBasedDeduplication</code> for
     *         messages with identical content to be treated as duplicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you send one message with
     *         <code>ContentBasedDeduplication</code> enabled and then another
     *         message with a <code>MessageDeduplicationId</code> that is the
     *         same as the one generated for the first
     *         <code>MessageDeduplicationId</code>, the two messages are treated
     *         as duplicates and only one copy of the message is delivered.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The <code>MessageDeduplicationId</code> is available to the
     *         recipient of the message (this can be useful for troubleshooting
     *         delivery issues).
     *         </p>
     *         <p>
     *         If a message is sent successfully but the acknowledgement is lost
     *         and the message is resent with the same
     *         <code>MessageDeduplicationId</code> after the deduplication
     *         interval, Amazon SQS can't detect duplicate messages.
     *         </p>
     *         </note>
     *         <p>
     *         The length of <code>MessageDeduplicationId</code> is 128
     *         characters. <code>MessageDeduplicationId</code> can contain
     *         alphanumeric characters (<code>a-z</code>, <code>A-Z</code>,
     *         <code>0-9</code>) and punctuation (
     *         <code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     *         </p>
     *         <p>
     *         For best practices of using <code>MessageDeduplicationId</code>,
     *         see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queue-recommendations.html#using-messagededuplicationid-property"
     *         >Using the MessageDeduplicationId Property</a> in the <i>Amazon
     *         Simple Queue Service Developer Guide</i>.
     *         </p>
     */
    public String getMessageDeduplicationId() {
        return messageDeduplicationId;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The token used for deduplication of messages within a 5-minute minimum
     * deduplication interval. If a message with a particular
     * <code>MessageDeduplicationId</code> is sent successfully, subsequent
     * messages with the same <code>MessageDeduplicationId</code> are accepted
     * successfully but aren't delivered. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * > Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every message must have a unique <code>MessageDeduplicationId</code>,
     * </p>
     * <ul>
     * <li>
     * <p>
     * You may provide a <code>MessageDeduplicationId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you aren't able to provide a <code>MessageDeduplicationId</code> and
     * you enable <code>ContentBasedDeduplication</code> for your queue, Amazon
     * SQS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but
     * not the attributes of the message).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't provide a <code>MessageDeduplicationId</code> and the queue
     * doesn't have <code>ContentBasedDeduplication</code> set, the action fails
     * with an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the queue has <code>ContentBasedDeduplication</code> set, your
     * <code>MessageDeduplicationId</code> overrides the generated one.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * When <code>ContentBasedDeduplication</code> is in effect, messages with
     * identical content sent within the deduplication interval are treated as
     * duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can also use <code>ContentBasedDeduplication</code> for messages with
     * identical content to be treated as duplicates.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send one message with <code>ContentBasedDeduplication</code>
     * enabled and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated
     * for the first <code>MessageDeduplicationId</code>, the two messages are
     * treated as duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>MessageDeduplicationId</code> is available to the recipient of
     * the message (this can be useful for troubleshooting delivery issues).
     * </p>
     * <p>
     * If a message is sent successfully but the acknowledgement is lost and the
     * message is resent with the same <code>MessageDeduplicationId</code> after
     * the deduplication interval, Amazon SQS can't detect duplicate messages.
     * </p>
     * </note>
     * <p>
     * The length of <code>MessageDeduplicationId</code> is 128 characters.
     * <code>MessageDeduplicationId</code> can contain alphanumeric characters (
     * <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and punctuation (
     * <code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     * </p>
     * <p>
     * For best practices of using <code>MessageDeduplicationId</code>, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queue-recommendations.html#using-messagededuplicationid-property"
     * >Using the MessageDeduplicationId Property</a> in the <i>Amazon Simple
     * Queue Service Developer Guide</i>.
     * </p>
     *
     * @param messageDeduplicationId <p>
     *            This parameter applies only to FIFO (first-in-first-out)
     *            queues.
     *            </p>
     *            <p>
     *            The token used for deduplication of messages within a 5-minute
     *            minimum deduplication interval. If a message with a particular
     *            <code>MessageDeduplicationId</code> is sent successfully,
     *            subsequent messages with the same
     *            <code>MessageDeduplicationId</code> are accepted successfully
     *            but aren't delivered. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *            > Exactly-Once Processing</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Every message must have a unique
     *            <code>MessageDeduplicationId</code>,
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            You may provide a <code>MessageDeduplicationId</code>
     *            explicitly.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you aren't able to provide a
     *            <code>MessageDeduplicationId</code> and you enable
     *            <code>ContentBasedDeduplication</code> for your queue, Amazon
     *            SQS uses a SHA-256 hash to generate the
     *            <code>MessageDeduplicationId</code> using the body of the
     *            message (but not the attributes of the message).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you don't provide a <code>MessageDeduplicationId</code> and
     *            the queue doesn't have <code>ContentBasedDeduplication</code>
     *            set, the action fails with an error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the queue has <code>ContentBasedDeduplication</code> set,
     *            your <code>MessageDeduplicationId</code> overrides the
     *            generated one.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            When <code>ContentBasedDeduplication</code> is in effect,
     *            messages with identical content sent within the deduplication
     *            interval are treated as duplicates and only one copy of the
     *            message is delivered.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You can also use <code>ContentBasedDeduplication</code> for
     *            messages with identical content to be treated as duplicates.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you send one message with
     *            <code>ContentBasedDeduplication</code> enabled and then
     *            another message with a <code>MessageDeduplicationId</code>
     *            that is the same as the one generated for the first
     *            <code>MessageDeduplicationId</code>, the two messages are
     *            treated as duplicates and only one copy of the message is
     *            delivered.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            The <code>MessageDeduplicationId</code> is available to the
     *            recipient of the message (this can be useful for
     *            troubleshooting delivery issues).
     *            </p>
     *            <p>
     *            If a message is sent successfully but the acknowledgement is
     *            lost and the message is resent with the same
     *            <code>MessageDeduplicationId</code> after the deduplication
     *            interval, Amazon SQS can't detect duplicate messages.
     *            </p>
     *            </note>
     *            <p>
     *            The length of <code>MessageDeduplicationId</code> is 128
     *            characters. <code>MessageDeduplicationId</code> can contain
     *            alphanumeric characters (<code>a-z</code>, <code>A-Z</code>,
     *            <code>0-9</code>) and punctuation (
     *            <code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     *            </p>
     *            <p>
     *            For best practices of using
     *            <code>MessageDeduplicationId</code>, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queue-recommendations.html#using-messagededuplicationid-property"
     *            >Using the MessageDeduplicationId Property</a> in the
     *            <i>Amazon Simple Queue Service Developer Guide</i>.
     *            </p>
     */
    public void setMessageDeduplicationId(String messageDeduplicationId) {
        this.messageDeduplicationId = messageDeduplicationId;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The token used for deduplication of messages within a 5-minute minimum
     * deduplication interval. If a message with a particular
     * <code>MessageDeduplicationId</code> is sent successfully, subsequent
     * messages with the same <code>MessageDeduplicationId</code> are accepted
     * successfully but aren't delivered. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * > Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every message must have a unique <code>MessageDeduplicationId</code>,
     * </p>
     * <ul>
     * <li>
     * <p>
     * You may provide a <code>MessageDeduplicationId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you aren't able to provide a <code>MessageDeduplicationId</code> and
     * you enable <code>ContentBasedDeduplication</code> for your queue, Amazon
     * SQS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but
     * not the attributes of the message).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't provide a <code>MessageDeduplicationId</code> and the queue
     * doesn't have <code>ContentBasedDeduplication</code> set, the action fails
     * with an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the queue has <code>ContentBasedDeduplication</code> set, your
     * <code>MessageDeduplicationId</code> overrides the generated one.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * When <code>ContentBasedDeduplication</code> is in effect, messages with
     * identical content sent within the deduplication interval are treated as
     * duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can also use <code>ContentBasedDeduplication</code> for messages with
     * identical content to be treated as duplicates.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send one message with <code>ContentBasedDeduplication</code>
     * enabled and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated
     * for the first <code>MessageDeduplicationId</code>, the two messages are
     * treated as duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>MessageDeduplicationId</code> is available to the recipient of
     * the message (this can be useful for troubleshooting delivery issues).
     * </p>
     * <p>
     * If a message is sent successfully but the acknowledgement is lost and the
     * message is resent with the same <code>MessageDeduplicationId</code> after
     * the deduplication interval, Amazon SQS can't detect duplicate messages.
     * </p>
     * </note>
     * <p>
     * The length of <code>MessageDeduplicationId</code> is 128 characters.
     * <code>MessageDeduplicationId</code> can contain alphanumeric characters (
     * <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and punctuation (
     * <code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     * </p>
     * <p>
     * For best practices of using <code>MessageDeduplicationId</code>, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queue-recommendations.html#using-messagededuplicationid-property"
     * >Using the MessageDeduplicationId Property</a> in the <i>Amazon Simple
     * Queue Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageDeduplicationId <p>
     *            This parameter applies only to FIFO (first-in-first-out)
     *            queues.
     *            </p>
     *            <p>
     *            The token used for deduplication of messages within a 5-minute
     *            minimum deduplication interval. If a message with a particular
     *            <code>MessageDeduplicationId</code> is sent successfully,
     *            subsequent messages with the same
     *            <code>MessageDeduplicationId</code> are accepted successfully
     *            but aren't delivered. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *            > Exactly-Once Processing</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Every message must have a unique
     *            <code>MessageDeduplicationId</code>,
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            You may provide a <code>MessageDeduplicationId</code>
     *            explicitly.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you aren't able to provide a
     *            <code>MessageDeduplicationId</code> and you enable
     *            <code>ContentBasedDeduplication</code> for your queue, Amazon
     *            SQS uses a SHA-256 hash to generate the
     *            <code>MessageDeduplicationId</code> using the body of the
     *            message (but not the attributes of the message).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you don't provide a <code>MessageDeduplicationId</code> and
     *            the queue doesn't have <code>ContentBasedDeduplication</code>
     *            set, the action fails with an error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the queue has <code>ContentBasedDeduplication</code> set,
     *            your <code>MessageDeduplicationId</code> overrides the
     *            generated one.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            When <code>ContentBasedDeduplication</code> is in effect,
     *            messages with identical content sent within the deduplication
     *            interval are treated as duplicates and only one copy of the
     *            message is delivered.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You can also use <code>ContentBasedDeduplication</code> for
     *            messages with identical content to be treated as duplicates.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you send one message with
     *            <code>ContentBasedDeduplication</code> enabled and then
     *            another message with a <code>MessageDeduplicationId</code>
     *            that is the same as the one generated for the first
     *            <code>MessageDeduplicationId</code>, the two messages are
     *            treated as duplicates and only one copy of the message is
     *            delivered.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            The <code>MessageDeduplicationId</code> is available to the
     *            recipient of the message (this can be useful for
     *            troubleshooting delivery issues).
     *            </p>
     *            <p>
     *            If a message is sent successfully but the acknowledgement is
     *            lost and the message is resent with the same
     *            <code>MessageDeduplicationId</code> after the deduplication
     *            interval, Amazon SQS can't detect duplicate messages.
     *            </p>
     *            </note>
     *            <p>
     *            The length of <code>MessageDeduplicationId</code> is 128
     *            characters. <code>MessageDeduplicationId</code> can contain
     *            alphanumeric characters (<code>a-z</code>, <code>A-Z</code>,
     *            <code>0-9</code>) and punctuation (
     *            <code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     *            </p>
     *            <p>
     *            For best practices of using
     *            <code>MessageDeduplicationId</code>, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queue-recommendations.html#using-messagededuplicationid-property"
     *            >Using the MessageDeduplicationId Property</a> in the
     *            <i>Amazon Simple Queue Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageBatchRequestEntry withMessageDeduplicationId(String messageDeduplicationId) {
        this.messageDeduplicationId = messageDeduplicationId;
        return this;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The tag that specifies that a message belongs to a specific message
     * group. Messages that belong to the same message group are processed in a
     * FIFO manner (however, messages in different message groups might be
     * processed out of order). To interleave multiple ordered streams within a
     * single queue, use <code>MessageGroupId</code> values (for example,
     * session data for multiple users). In this scenario, multiple readers can
     * process the queue, but the session data of each user is processed in a
     * FIFO fashion.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must associate a non-empty <code>MessageGroupId</code> with a
     * message. If you don't provide a <code>MessageGroupId</code>, the action
     * fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessage</code> might return messages with multiple
     * <code>MessageGroupId</code> values. For each <code>MessageGroupId</code>,
     * the messages are sorted by time sent. The caller can't specify a
     * <code>MessageGroupId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length of <code>MessageGroupId</code> is 128 characters. Valid values
     * are alphanumeric characters and punctuation
     * <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     * </p>
     * <p>
     * For best practices of using <code>MessageGroupId</code>, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queue-recommendations.html#using-messagegroupid-property"
     * >Using the MessageGroupId Property</a> in the <i>Amazon Simple Queue
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         This parameter applies only to FIFO (first-in-first-out) queues.
     *         </p>
     *         <p>
     *         The tag that specifies that a message belongs to a specific
     *         message group. Messages that belong to the same message group are
     *         processed in a FIFO manner (however, messages in different
     *         message groups might be processed out of order). To interleave
     *         multiple ordered streams within a single queue, use
     *         <code>MessageGroupId</code> values (for example, session data for
     *         multiple users). In this scenario, multiple readers can process
     *         the queue, but the session data of each user is processed in a
     *         FIFO fashion.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You must associate a non-empty <code>MessageGroupId</code> with a
     *         message. If you don't provide a <code>MessageGroupId</code>, the
     *         action fails.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReceiveMessage</code> might return messages with multiple
     *         <code>MessageGroupId</code> values. For each
     *         <code>MessageGroupId</code>, the messages are sorted by time
     *         sent. The caller can't specify a <code>MessageGroupId</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The length of <code>MessageGroupId</code> is 128 characters.
     *         Valid values are alphanumeric characters and punctuation
     *         <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     *         </p>
     *         <p>
     *         For best practices of using <code>MessageGroupId</code>, see <a
     *         href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queue-recommendations.html#using-messagegroupid-property"
     *         >Using the MessageGroupId Property</a> in the <i>Amazon Simple
     *         Queue Service Developer Guide</i>.
     *         </p>
     */
    public String getMessageGroupId() {
        return messageGroupId;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The tag that specifies that a message belongs to a specific message
     * group. Messages that belong to the same message group are processed in a
     * FIFO manner (however, messages in different message groups might be
     * processed out of order). To interleave multiple ordered streams within a
     * single queue, use <code>MessageGroupId</code> values (for example,
     * session data for multiple users). In this scenario, multiple readers can
     * process the queue, but the session data of each user is processed in a
     * FIFO fashion.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must associate a non-empty <code>MessageGroupId</code> with a
     * message. If you don't provide a <code>MessageGroupId</code>, the action
     * fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessage</code> might return messages with multiple
     * <code>MessageGroupId</code> values. For each <code>MessageGroupId</code>,
     * the messages are sorted by time sent. The caller can't specify a
     * <code>MessageGroupId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length of <code>MessageGroupId</code> is 128 characters. Valid values
     * are alphanumeric characters and punctuation
     * <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     * </p>
     * <p>
     * For best practices of using <code>MessageGroupId</code>, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queue-recommendations.html#using-messagegroupid-property"
     * >Using the MessageGroupId Property</a> in the <i>Amazon Simple Queue
     * Service Developer Guide</i>.
     * </p>
     *
     * @param messageGroupId <p>
     *            This parameter applies only to FIFO (first-in-first-out)
     *            queues.
     *            </p>
     *            <p>
     *            The tag that specifies that a message belongs to a specific
     *            message group. Messages that belong to the same message group
     *            are processed in a FIFO manner (however, messages in different
     *            message groups might be processed out of order). To interleave
     *            multiple ordered streams within a single queue, use
     *            <code>MessageGroupId</code> values (for example, session data
     *            for multiple users). In this scenario, multiple readers can
     *            process the queue, but the session data of each user is
     *            processed in a FIFO fashion.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            You must associate a non-empty <code>MessageGroupId</code>
     *            with a message. If you don't provide a
     *            <code>MessageGroupId</code>, the action fails.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReceiveMessage</code> might return messages with
     *            multiple <code>MessageGroupId</code> values. For each
     *            <code>MessageGroupId</code>, the messages are sorted by time
     *            sent. The caller can't specify a <code>MessageGroupId</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The length of <code>MessageGroupId</code> is 128 characters.
     *            Valid values are alphanumeric characters and punctuation
     *            <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     *            </p>
     *            <p>
     *            For best practices of using <code>MessageGroupId</code>, see
     *            <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queue-recommendations.html#using-messagegroupid-property"
     *            >Using the MessageGroupId Property</a> in the <i>Amazon Simple
     *            Queue Service Developer Guide</i>.
     *            </p>
     */
    public void setMessageGroupId(String messageGroupId) {
        this.messageGroupId = messageGroupId;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The tag that specifies that a message belongs to a specific message
     * group. Messages that belong to the same message group are processed in a
     * FIFO manner (however, messages in different message groups might be
     * processed out of order). To interleave multiple ordered streams within a
     * single queue, use <code>MessageGroupId</code> values (for example,
     * session data for multiple users). In this scenario, multiple readers can
     * process the queue, but the session data of each user is processed in a
     * FIFO fashion.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must associate a non-empty <code>MessageGroupId</code> with a
     * message. If you don't provide a <code>MessageGroupId</code>, the action
     * fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessage</code> might return messages with multiple
     * <code>MessageGroupId</code> values. For each <code>MessageGroupId</code>,
     * the messages are sorted by time sent. The caller can't specify a
     * <code>MessageGroupId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length of <code>MessageGroupId</code> is 128 characters. Valid values
     * are alphanumeric characters and punctuation
     * <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     * </p>
     * <p>
     * For best practices of using <code>MessageGroupId</code>, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queue-recommendations.html#using-messagegroupid-property"
     * >Using the MessageGroupId Property</a> in the <i>Amazon Simple Queue
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageGroupId <p>
     *            This parameter applies only to FIFO (first-in-first-out)
     *            queues.
     *            </p>
     *            <p>
     *            The tag that specifies that a message belongs to a specific
     *            message group. Messages that belong to the same message group
     *            are processed in a FIFO manner (however, messages in different
     *            message groups might be processed out of order). To interleave
     *            multiple ordered streams within a single queue, use
     *            <code>MessageGroupId</code> values (for example, session data
     *            for multiple users). In this scenario, multiple readers can
     *            process the queue, but the session data of each user is
     *            processed in a FIFO fashion.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            You must associate a non-empty <code>MessageGroupId</code>
     *            with a message. If you don't provide a
     *            <code>MessageGroupId</code>, the action fails.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReceiveMessage</code> might return messages with
     *            multiple <code>MessageGroupId</code> values. For each
     *            <code>MessageGroupId</code>, the messages are sorted by time
     *            sent. The caller can't specify a <code>MessageGroupId</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The length of <code>MessageGroupId</code> is 128 characters.
     *            Valid values are alphanumeric characters and punctuation
     *            <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     *            </p>
     *            <p>
     *            For best practices of using <code>MessageGroupId</code>, see
     *            <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queue-recommendations.html#using-messagegroupid-property"
     *            >Using the MessageGroupId Property</a> in the <i>Amazon Simple
     *            Queue Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageBatchRequestEntry withMessageGroupId(String messageGroupId) {
        this.messageGroupId = messageGroupId;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getMessageBody() != null)
            sb.append("MessageBody: " + getMessageBody() + ",");
        if (getDelaySeconds() != null)
            sb.append("DelaySeconds: " + getDelaySeconds() + ",");
        if (getMessageAttributes() != null)
            sb.append("MessageAttributes: " + getMessageAttributes() + ",");
        if (getMessageDeduplicationId() != null)
            sb.append("MessageDeduplicationId: " + getMessageDeduplicationId() + ",");
        if (getMessageGroupId() != null)
            sb.append("MessageGroupId: " + getMessageGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getMessageBody() == null) ? 0 : getMessageBody().hashCode());
        hashCode = prime * hashCode
                + ((getDelaySeconds() == null) ? 0 : getDelaySeconds().hashCode());
        hashCode = prime * hashCode
                + ((getMessageAttributes() == null) ? 0 : getMessageAttributes().hashCode());
        hashCode = prime
                * hashCode
                + ((getMessageDeduplicationId() == null) ? 0 : getMessageDeduplicationId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMessageGroupId() == null) ? 0 : getMessageGroupId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendMessageBatchRequestEntry == false)
            return false;
        SendMessageBatchRequestEntry other = (SendMessageBatchRequestEntry) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        if (other.getMessageDeduplicationId() == null ^ this.getMessageDeduplicationId() == null)
            return false;
        if (other.getMessageDeduplicationId() != null
                && other.getMessageDeduplicationId().equals(this.getMessageDeduplicationId()) == false)
            return false;
        if (other.getMessageGroupId() == null ^ this.getMessageGroupId() == null)
            return false;
        if (other.getMessageGroupId() != null
                && other.getMessageGroupId().equals(this.getMessageGroupId()) == false)
            return false;
        return true;
    }
}
