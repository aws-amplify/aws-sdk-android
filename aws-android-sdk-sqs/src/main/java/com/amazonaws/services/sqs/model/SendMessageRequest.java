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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Delivers a message to the specified queue.
 * </p>
 * <important>
 * <p>
 * The following list shows the characters (in Unicode) that are allowed in your
 * message, according to the W3C XML specification:
 * </p>
 * <p>
 * <code>#x9</code> | <code>#xA</code> | <code>#xD</code> | [<code>#x20</code>
 * to <code>#xD7FF</code>] | [<code>#xE000</code> to <code>#xFFFD</code>] | [
 * <code>#x10000</code> to <code>#x10FFFF</code>]
 * </p>
 * <p>
 * For more information, see <a
 * href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>. If you send any
 * characters that aren't included in this list, your request will be rejected.
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
     * characters, see the preceding note.
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
     * The token used for deduplication of sent messages. If a message with a
     * particular <code>MessageDeduplicationId</code> is sent successfully, any
     * messages sent with the same <code>MessageDeduplicationId</code> are
     * accepted successfully but aren't delivered during the 5-minute
     * deduplication interval. For more information, see <a href=
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
     * If a message is sent successfully but the acknowledgdment is lost and the
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
     *            of allowed characters, see the preceding note.
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
     * characters, see the preceding note.
     * </p>
     *
     * @return <p>
     *         The message to send. String maximum 256 KB in size. For a list of
     *         allowed characters, see the preceding note.
     *         </p>
     */
    public String getMessageBody() {
        return messageBody;
    }

    /**
     * <p>
     * The message to send. String maximum 256 KB in size. For a list of allowed
     * characters, see the preceding note.
     * </p>
     *
     * @param messageBody <p>
     *            The message to send. String maximum 256 KB in size. For a list
     *            of allowed characters, see the preceding note.
     *            </p>
     */
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    /**
     * <p>
     * The message to send. String maximum 256 KB in size. For a list of allowed
     * characters, see the preceding note.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageBody <p>
     *            The message to send. String maximum 256 KB in size. For a list
     *            of allowed characters, see the preceding note.
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
    public SendMessageRequest withDelaySeconds(Integer delaySeconds) {
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
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The token used for deduplication of sent messages. If a message with a
     * particular <code>MessageDeduplicationId</code> is sent successfully, any
     * messages sent with the same <code>MessageDeduplicationId</code> are
     * accepted successfully but aren't delivered during the 5-minute
     * deduplication interval. For more information, see <a href=
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
     * If a message is sent successfully but the acknowledgdment is lost and the
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
     *         The token used for deduplication of sent messages. If a message
     *         with a particular <code>MessageDeduplicationId</code> is sent
     *         successfully, any messages sent with the same
     *         <code>MessageDeduplicationId</code> are accepted successfully but
     *         aren't delivered during the 5-minute deduplication interval. For
     *         more information, see <a href=
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
     *         If a message is sent successfully but the acknowledgdment is lost
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
     * The token used for deduplication of sent messages. If a message with a
     * particular <code>MessageDeduplicationId</code> is sent successfully, any
     * messages sent with the same <code>MessageDeduplicationId</code> are
     * accepted successfully but aren't delivered during the 5-minute
     * deduplication interval. For more information, see <a href=
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
     * If a message is sent successfully but the acknowledgdment is lost and the
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
     *            The token used for deduplication of sent messages. If a
     *            message with a particular <code>MessageDeduplicationId</code>
     *            is sent successfully, any messages sent with the same
     *            <code>MessageDeduplicationId</code> are accepted successfully
     *            but aren't delivered during the 5-minute deduplication
     *            interval. For more information, see <a href=
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
     *            If a message is sent successfully but the acknowledgdment is
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
     * The token used for deduplication of sent messages. If a message with a
     * particular <code>MessageDeduplicationId</code> is sent successfully, any
     * messages sent with the same <code>MessageDeduplicationId</code> are
     * accepted successfully but aren't delivered during the 5-minute
     * deduplication interval. For more information, see <a href=
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
     * If a message is sent successfully but the acknowledgdment is lost and the
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
     *            The token used for deduplication of sent messages. If a
     *            message with a particular <code>MessageDeduplicationId</code>
     *            is sent successfully, any messages sent with the same
     *            <code>MessageDeduplicationId</code> are accepted successfully
     *            but aren't delivered during the 5-minute deduplication
     *            interval. For more information, see <a href=
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
     *            If a message is sent successfully but the acknowledgdment is
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
    public SendMessageRequest withMessageDeduplicationId(String messageDeduplicationId) {
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
    public SendMessageRequest withMessageGroupId(String messageGroupId) {
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
        if (getQueueUrl() != null)
            sb.append("QueueUrl: " + getQueueUrl() + ",");
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

        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
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
