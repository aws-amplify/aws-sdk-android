/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the details of a single Amazon SNS message along with an
 * <code>Id</code> that identifies a message within the batch.
 * </p>
 */
public class PublishBatchRequestEntry implements Serializable {
    /**
     * <p>
     * An identifier for the message in this batch.
     * </p>
     * <note>
     * <p>
     * The <code>Ids</code> of a batch request must be unique within a request.
     * </p>
     * <p>
     * This identifier can have up to 80 characters. The following characters
     * are accepted: alphanumeric characters, hyphens(-), and underscores (_).
     * </p>
     * </note>
     */
    private String id;

    /**
     * <p>
     * The body of the message.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The subject of the batch message.
     * </p>
     */
    private String subject;

    /**
     * <p>
     * Set <code>MessageStructure</code> to <code>json</code> if you want to
     * send a different message for each protocol. For example, using one
     * publish action, you can send a short message to your SMS subscribers and
     * a longer message to your email subscribers. If you set
     * <code>MessageStructure</code> to <code>json</code>, the value of the
     * <code>Message</code> parameter must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * be a syntactically valid JSON object; and
     * </p>
     * </li>
     * <li>
     * <p>
     * contain at least a top-level JSON key of "default" with a value that is a
     * string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define other top-level keys that define the message you want to
     * send to a specific transport protocol (e.g. http).
     * </p>
     */
    private String messageStructure;

    /**
     * <p>
     * Each message attribute consists of a <code>Name</code>, <code>Type</code>
     * , and <code>Value</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-message-attributes.html"
     * >Amazon SNS message attributes</a> in the Amazon SNS Developer Guide.
     * </p>
     */
    private java.util.Map<String, MessageAttributeValue> messageAttributes = new java.util.HashMap<String, MessageAttributeValue>();

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) topics.
     * </p>
     * <p>
     * The token used for deduplication of messages within a 5-minute minimum
     * deduplication interval. If a message with a particular
     * <code>MessageDeduplicationId</code> is sent successfully, subsequent
     * messages with the same <code>MessageDeduplicationId</code> are accepted
     * successfully but aren't delivered.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every message must have a unique <code>MessageDeduplicationId</code>.
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
     * you enable <code>ContentBasedDeduplication</code> for your topic, Amazon
     * SNS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but
     * not the attributes of the message).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't provide a <code>MessageDeduplicationId</code> and the topic
     * doesn't have <code>ContentBasedDeduplication</code> set, the action fails
     * with an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the topic has a <code>ContentBasedDeduplication</code> set, your
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
     * If you send one message with <code>ContentBasedDeduplication</code>
     * enabled, and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated
     * for the first <code>MessageDeduplicationId</code>, the two messages are
     * treated as duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>MessageDeduplicationId</code> is available to the consumer of
     * the message (this can be useful for troubleshooting delivery issues).
     * </p>
     * <p>
     * If a message is sent successfully but the acknowledgement is lost and the
     * message is resent with the same <code>MessageDeduplicationId</code> after
     * the deduplication interval, Amazon SNS can't detect duplicate messages.
     * </p>
     * <p>
     * Amazon SNS continues to keep track of the message deduplication ID even
     * after the message is received and deleted.
     * </p>
     * </note>
     * <p>
     * The length of <code>MessageDeduplicationId</code> is 128 characters.
     * </p>
     * <p>
     * <code>MessageDeduplicationId</code> can contain alphanumeric characters
     * <code>(a-z, A-Z, 0-9)</code> and punctuation
     * <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     * </p>
     */
    private String messageDeduplicationId;

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) topics.
     * </p>
     * <p>
     * The tag that specifies that a message belongs to a specific message
     * group. Messages that belong to the same message group are processed in a
     * FIFO manner (however, messages in different message groups might be
     * processed out of order). To interleave multiple ordered streams within a
     * single topic, use <code>MessageGroupId</code> values (for example,
     * session data for multiple users). In this scenario, multiple consumers
     * can process the topic, but the session data of each user is processed in
     * a FIFO fashion.
     * </p>
     * <p>
     * You must associate a non-empty <code>MessageGroupId</code> with a
     * message. If you don't provide a <code>MessageGroupId</code>, the action
     * fails.
     * </p>
     * <p>
     * The length of <code>MessageGroupId</code> is 128 characters.
     * </p>
     * <p>
     * <code>MessageGroupId</code> can contain alphanumeric characters
     * <code>(a-z, A-Z, 0-9)</code> and punctuation
     * <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     * </p>
     * <important>
     * <p>
     * <code>MessageGroupId</code> is required for FIFO topics. You can't use it
     * for standard topics.
     * </p>
     * </important>
     */
    private String messageGroupId;

    /**
     * <p>
     * An identifier for the message in this batch.
     * </p>
     * <note>
     * <p>
     * The <code>Ids</code> of a batch request must be unique within a request.
     * </p>
     * <p>
     * This identifier can have up to 80 characters. The following characters
     * are accepted: alphanumeric characters, hyphens(-), and underscores (_).
     * </p>
     * </note>
     *
     * @return <p>
     *         An identifier for the message in this batch.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>Ids</code> of a batch request must be unique within a
     *         request.
     *         </p>
     *         <p>
     *         This identifier can have up to 80 characters. The following
     *         characters are accepted: alphanumeric characters, hyphens(-), and
     *         underscores (_).
     *         </p>
     *         </note>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * An identifier for the message in this batch.
     * </p>
     * <note>
     * <p>
     * The <code>Ids</code> of a batch request must be unique within a request.
     * </p>
     * <p>
     * This identifier can have up to 80 characters. The following characters
     * are accepted: alphanumeric characters, hyphens(-), and underscores (_).
     * </p>
     * </note>
     *
     * @param id <p>
     *            An identifier for the message in this batch.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>Ids</code> of a batch request must be unique within
     *            a request.
     *            </p>
     *            <p>
     *            This identifier can have up to 80 characters. The following
     *            characters are accepted: alphanumeric characters, hyphens(-),
     *            and underscores (_).
     *            </p>
     *            </note>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * An identifier for the message in this batch.
     * </p>
     * <note>
     * <p>
     * The <code>Ids</code> of a batch request must be unique within a request.
     * </p>
     * <p>
     * This identifier can have up to 80 characters. The following characters
     * are accepted: alphanumeric characters, hyphens(-), and underscores (_).
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            An identifier for the message in this batch.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>Ids</code> of a batch request must be unique within
     *            a request.
     *            </p>
     *            <p>
     *            This identifier can have up to 80 characters. The following
     *            characters are accepted: alphanumeric characters, hyphens(-),
     *            and underscores (_).
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishBatchRequestEntry withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The body of the message.
     * </p>
     *
     * @return <p>
     *         The body of the message.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The body of the message.
     * </p>
     *
     * @param message <p>
     *            The body of the message.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The body of the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            The body of the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishBatchRequestEntry withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The subject of the batch message.
     * </p>
     *
     * @return <p>
     *         The subject of the batch message.
     *         </p>
     */
    public String getSubject() {
        return subject;
    }

    /**
     * <p>
     * The subject of the batch message.
     * </p>
     *
     * @param subject <p>
     *            The subject of the batch message.
     *            </p>
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The subject of the batch message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subject <p>
     *            The subject of the batch message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishBatchRequestEntry withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * <p>
     * Set <code>MessageStructure</code> to <code>json</code> if you want to
     * send a different message for each protocol. For example, using one
     * publish action, you can send a short message to your SMS subscribers and
     * a longer message to your email subscribers. If you set
     * <code>MessageStructure</code> to <code>json</code>, the value of the
     * <code>Message</code> parameter must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * be a syntactically valid JSON object; and
     * </p>
     * </li>
     * <li>
     * <p>
     * contain at least a top-level JSON key of "default" with a value that is a
     * string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define other top-level keys that define the message you want to
     * send to a specific transport protocol (e.g. http).
     * </p>
     *
     * @return <p>
     *         Set <code>MessageStructure</code> to <code>json</code> if you
     *         want to send a different message for each protocol. For example,
     *         using one publish action, you can send a short message to your
     *         SMS subscribers and a longer message to your email subscribers.
     *         If you set <code>MessageStructure</code> to <code>json</code>,
     *         the value of the <code>Message</code> parameter must:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         be a syntactically valid JSON object; and
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         contain at least a top-level JSON key of "default" with a value
     *         that is a string.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can define other top-level keys that define the message you
     *         want to send to a specific transport protocol (e.g. http).
     *         </p>
     */
    public String getMessageStructure() {
        return messageStructure;
    }

    /**
     * <p>
     * Set <code>MessageStructure</code> to <code>json</code> if you want to
     * send a different message for each protocol. For example, using one
     * publish action, you can send a short message to your SMS subscribers and
     * a longer message to your email subscribers. If you set
     * <code>MessageStructure</code> to <code>json</code>, the value of the
     * <code>Message</code> parameter must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * be a syntactically valid JSON object; and
     * </p>
     * </li>
     * <li>
     * <p>
     * contain at least a top-level JSON key of "default" with a value that is a
     * string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define other top-level keys that define the message you want to
     * send to a specific transport protocol (e.g. http).
     * </p>
     *
     * @param messageStructure <p>
     *            Set <code>MessageStructure</code> to <code>json</code> if you
     *            want to send a different message for each protocol. For
     *            example, using one publish action, you can send a short
     *            message to your SMS subscribers and a longer message to your
     *            email subscribers. If you set <code>MessageStructure</code> to
     *            <code>json</code>, the value of the <code>Message</code>
     *            parameter must:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            be a syntactically valid JSON object; and
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            contain at least a top-level JSON key of "default" with a
     *            value that is a string.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can define other top-level keys that define the message
     *            you want to send to a specific transport protocol (e.g. http).
     *            </p>
     */
    public void setMessageStructure(String messageStructure) {
        this.messageStructure = messageStructure;
    }

    /**
     * <p>
     * Set <code>MessageStructure</code> to <code>json</code> if you want to
     * send a different message for each protocol. For example, using one
     * publish action, you can send a short message to your SMS subscribers and
     * a longer message to your email subscribers. If you set
     * <code>MessageStructure</code> to <code>json</code>, the value of the
     * <code>Message</code> parameter must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * be a syntactically valid JSON object; and
     * </p>
     * </li>
     * <li>
     * <p>
     * contain at least a top-level JSON key of "default" with a value that is a
     * string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define other top-level keys that define the message you want to
     * send to a specific transport protocol (e.g. http).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageStructure <p>
     *            Set <code>MessageStructure</code> to <code>json</code> if you
     *            want to send a different message for each protocol. For
     *            example, using one publish action, you can send a short
     *            message to your SMS subscribers and a longer message to your
     *            email subscribers. If you set <code>MessageStructure</code> to
     *            <code>json</code>, the value of the <code>Message</code>
     *            parameter must:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            be a syntactically valid JSON object; and
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            contain at least a top-level JSON key of "default" with a
     *            value that is a string.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can define other top-level keys that define the message
     *            you want to send to a specific transport protocol (e.g. http).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishBatchRequestEntry withMessageStructure(String messageStructure) {
        this.messageStructure = messageStructure;
        return this;
    }

    /**
     * <p>
     * Each message attribute consists of a <code>Name</code>, <code>Type</code>
     * , and <code>Value</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-message-attributes.html"
     * >Amazon SNS message attributes</a> in the Amazon SNS Developer Guide.
     * </p>
     *
     * @return <p>
     *         Each message attribute consists of a <code>Name</code>,
     *         <code>Type</code>, and <code>Value</code>. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/sns/latest/dg/sns-message-attributes.html"
     *         >Amazon SNS message attributes</a> in the Amazon SNS Developer
     *         Guide.
     *         </p>
     */
    public java.util.Map<String, MessageAttributeValue> getMessageAttributes() {
        return messageAttributes;
    }

    /**
     * <p>
     * Each message attribute consists of a <code>Name</code>, <code>Type</code>
     * , and <code>Value</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-message-attributes.html"
     * >Amazon SNS message attributes</a> in the Amazon SNS Developer Guide.
     * </p>
     *
     * @param messageAttributes <p>
     *            Each message attribute consists of a <code>Name</code>,
     *            <code>Type</code>, and <code>Value</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-message-attributes.html"
     *            >Amazon SNS message attributes</a> in the Amazon SNS Developer
     *            Guide.
     *            </p>
     */
    public void setMessageAttributes(java.util.Map<String, MessageAttributeValue> messageAttributes) {
        this.messageAttributes = messageAttributes;
    }

    /**
     * <p>
     * Each message attribute consists of a <code>Name</code>, <code>Type</code>
     * , and <code>Value</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-message-attributes.html"
     * >Amazon SNS message attributes</a> in the Amazon SNS Developer Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageAttributes <p>
     *            Each message attribute consists of a <code>Name</code>,
     *            <code>Type</code>, and <code>Value</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-message-attributes.html"
     *            >Amazon SNS message attributes</a> in the Amazon SNS Developer
     *            Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishBatchRequestEntry withMessageAttributes(
            java.util.Map<String, MessageAttributeValue> messageAttributes) {
        this.messageAttributes = messageAttributes;
        return this;
    }

    /**
     * <p>
     * Each message attribute consists of a <code>Name</code>, <code>Type</code>
     * , and <code>Value</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-message-attributes.html"
     * >Amazon SNS message attributes</a> in the Amazon SNS Developer Guide.
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
    public PublishBatchRequestEntry addMessageAttributesEntry(String key,
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
    public PublishBatchRequestEntry clearMessageAttributesEntries() {
        this.messageAttributes = null;
        return this;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) topics.
     * </p>
     * <p>
     * The token used for deduplication of messages within a 5-minute minimum
     * deduplication interval. If a message with a particular
     * <code>MessageDeduplicationId</code> is sent successfully, subsequent
     * messages with the same <code>MessageDeduplicationId</code> are accepted
     * successfully but aren't delivered.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every message must have a unique <code>MessageDeduplicationId</code>.
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
     * you enable <code>ContentBasedDeduplication</code> for your topic, Amazon
     * SNS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but
     * not the attributes of the message).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't provide a <code>MessageDeduplicationId</code> and the topic
     * doesn't have <code>ContentBasedDeduplication</code> set, the action fails
     * with an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the topic has a <code>ContentBasedDeduplication</code> set, your
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
     * If you send one message with <code>ContentBasedDeduplication</code>
     * enabled, and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated
     * for the first <code>MessageDeduplicationId</code>, the two messages are
     * treated as duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>MessageDeduplicationId</code> is available to the consumer of
     * the message (this can be useful for troubleshooting delivery issues).
     * </p>
     * <p>
     * If a message is sent successfully but the acknowledgement is lost and the
     * message is resent with the same <code>MessageDeduplicationId</code> after
     * the deduplication interval, Amazon SNS can't detect duplicate messages.
     * </p>
     * <p>
     * Amazon SNS continues to keep track of the message deduplication ID even
     * after the message is received and deleted.
     * </p>
     * </note>
     * <p>
     * The length of <code>MessageDeduplicationId</code> is 128 characters.
     * </p>
     * <p>
     * <code>MessageDeduplicationId</code> can contain alphanumeric characters
     * <code>(a-z, A-Z, 0-9)</code> and punctuation
     * <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     * </p>
     *
     * @return <p>
     *         This parameter applies only to FIFO (first-in-first-out) topics.
     *         </p>
     *         <p>
     *         The token used for deduplication of messages within a 5-minute
     *         minimum deduplication interval. If a message with a particular
     *         <code>MessageDeduplicationId</code> is sent successfully,
     *         subsequent messages with the same
     *         <code>MessageDeduplicationId</code> are accepted successfully but
     *         aren't delivered.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Every message must have a unique
     *         <code>MessageDeduplicationId</code>.
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
     *         <code>ContentBasedDeduplication</code> for your topic, Amazon SNS
     *         uses a SHA-256 hash to generate the
     *         <code>MessageDeduplicationId</code> using the body of the message
     *         (but not the attributes of the message).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you don't provide a <code>MessageDeduplicationId</code> and
     *         the topic doesn't have <code>ContentBasedDeduplication</code>
     *         set, the action fails with an error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the topic has a <code>ContentBasedDeduplication</code> set,
     *         your <code>MessageDeduplicationId</code> overrides the generated
     *         one.
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
     *         If you send one message with
     *         <code>ContentBasedDeduplication</code> enabled, and then another
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
     *         consumer of the message (this can be useful for troubleshooting
     *         delivery issues).
     *         </p>
     *         <p>
     *         If a message is sent successfully but the acknowledgement is lost
     *         and the message is resent with the same
     *         <code>MessageDeduplicationId</code> after the deduplication
     *         interval, Amazon SNS can't detect duplicate messages.
     *         </p>
     *         <p>
     *         Amazon SNS continues to keep track of the message deduplication
     *         ID even after the message is received and deleted.
     *         </p>
     *         </note>
     *         <p>
     *         The length of <code>MessageDeduplicationId</code> is 128
     *         characters.
     *         </p>
     *         <p>
     *         <code>MessageDeduplicationId</code> can contain alphanumeric
     *         characters <code>(a-z, A-Z, 0-9)</code> and punctuation
     *         <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     *         </p>
     */
    public String getMessageDeduplicationId() {
        return messageDeduplicationId;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) topics.
     * </p>
     * <p>
     * The token used for deduplication of messages within a 5-minute minimum
     * deduplication interval. If a message with a particular
     * <code>MessageDeduplicationId</code> is sent successfully, subsequent
     * messages with the same <code>MessageDeduplicationId</code> are accepted
     * successfully but aren't delivered.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every message must have a unique <code>MessageDeduplicationId</code>.
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
     * you enable <code>ContentBasedDeduplication</code> for your topic, Amazon
     * SNS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but
     * not the attributes of the message).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't provide a <code>MessageDeduplicationId</code> and the topic
     * doesn't have <code>ContentBasedDeduplication</code> set, the action fails
     * with an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the topic has a <code>ContentBasedDeduplication</code> set, your
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
     * If you send one message with <code>ContentBasedDeduplication</code>
     * enabled, and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated
     * for the first <code>MessageDeduplicationId</code>, the two messages are
     * treated as duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>MessageDeduplicationId</code> is available to the consumer of
     * the message (this can be useful for troubleshooting delivery issues).
     * </p>
     * <p>
     * If a message is sent successfully but the acknowledgement is lost and the
     * message is resent with the same <code>MessageDeduplicationId</code> after
     * the deduplication interval, Amazon SNS can't detect duplicate messages.
     * </p>
     * <p>
     * Amazon SNS continues to keep track of the message deduplication ID even
     * after the message is received and deleted.
     * </p>
     * </note>
     * <p>
     * The length of <code>MessageDeduplicationId</code> is 128 characters.
     * </p>
     * <p>
     * <code>MessageDeduplicationId</code> can contain alphanumeric characters
     * <code>(a-z, A-Z, 0-9)</code> and punctuation
     * <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     * </p>
     *
     * @param messageDeduplicationId <p>
     *            This parameter applies only to FIFO (first-in-first-out)
     *            topics.
     *            </p>
     *            <p>
     *            The token used for deduplication of messages within a 5-minute
     *            minimum deduplication interval. If a message with a particular
     *            <code>MessageDeduplicationId</code> is sent successfully,
     *            subsequent messages with the same
     *            <code>MessageDeduplicationId</code> are accepted successfully
     *            but aren't delivered.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Every message must have a unique
     *            <code>MessageDeduplicationId</code>.
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
     *            <code>ContentBasedDeduplication</code> for your topic, Amazon
     *            SNS uses a SHA-256 hash to generate the
     *            <code>MessageDeduplicationId</code> using the body of the
     *            message (but not the attributes of the message).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you don't provide a <code>MessageDeduplicationId</code> and
     *            the topic doesn't have <code>ContentBasedDeduplication</code>
     *            set, the action fails with an error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the topic has a <code>ContentBasedDeduplication</code> set,
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
     *            If you send one message with
     *            <code>ContentBasedDeduplication</code> enabled, and then
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
     *            consumer of the message (this can be useful for
     *            troubleshooting delivery issues).
     *            </p>
     *            <p>
     *            If a message is sent successfully but the acknowledgement is
     *            lost and the message is resent with the same
     *            <code>MessageDeduplicationId</code> after the deduplication
     *            interval, Amazon SNS can't detect duplicate messages.
     *            </p>
     *            <p>
     *            Amazon SNS continues to keep track of the message
     *            deduplication ID even after the message is received and
     *            deleted.
     *            </p>
     *            </note>
     *            <p>
     *            The length of <code>MessageDeduplicationId</code> is 128
     *            characters.
     *            </p>
     *            <p>
     *            <code>MessageDeduplicationId</code> can contain alphanumeric
     *            characters <code>(a-z, A-Z, 0-9)</code> and punctuation
     *            <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     *            </p>
     */
    public void setMessageDeduplicationId(String messageDeduplicationId) {
        this.messageDeduplicationId = messageDeduplicationId;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) topics.
     * </p>
     * <p>
     * The token used for deduplication of messages within a 5-minute minimum
     * deduplication interval. If a message with a particular
     * <code>MessageDeduplicationId</code> is sent successfully, subsequent
     * messages with the same <code>MessageDeduplicationId</code> are accepted
     * successfully but aren't delivered.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every message must have a unique <code>MessageDeduplicationId</code>.
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
     * you enable <code>ContentBasedDeduplication</code> for your topic, Amazon
     * SNS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but
     * not the attributes of the message).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't provide a <code>MessageDeduplicationId</code> and the topic
     * doesn't have <code>ContentBasedDeduplication</code> set, the action fails
     * with an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the topic has a <code>ContentBasedDeduplication</code> set, your
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
     * If you send one message with <code>ContentBasedDeduplication</code>
     * enabled, and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated
     * for the first <code>MessageDeduplicationId</code>, the two messages are
     * treated as duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>MessageDeduplicationId</code> is available to the consumer of
     * the message (this can be useful for troubleshooting delivery issues).
     * </p>
     * <p>
     * If a message is sent successfully but the acknowledgement is lost and the
     * message is resent with the same <code>MessageDeduplicationId</code> after
     * the deduplication interval, Amazon SNS can't detect duplicate messages.
     * </p>
     * <p>
     * Amazon SNS continues to keep track of the message deduplication ID even
     * after the message is received and deleted.
     * </p>
     * </note>
     * <p>
     * The length of <code>MessageDeduplicationId</code> is 128 characters.
     * </p>
     * <p>
     * <code>MessageDeduplicationId</code> can contain alphanumeric characters
     * <code>(a-z, A-Z, 0-9)</code> and punctuation
     * <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageDeduplicationId <p>
     *            This parameter applies only to FIFO (first-in-first-out)
     *            topics.
     *            </p>
     *            <p>
     *            The token used for deduplication of messages within a 5-minute
     *            minimum deduplication interval. If a message with a particular
     *            <code>MessageDeduplicationId</code> is sent successfully,
     *            subsequent messages with the same
     *            <code>MessageDeduplicationId</code> are accepted successfully
     *            but aren't delivered.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Every message must have a unique
     *            <code>MessageDeduplicationId</code>.
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
     *            <code>ContentBasedDeduplication</code> for your topic, Amazon
     *            SNS uses a SHA-256 hash to generate the
     *            <code>MessageDeduplicationId</code> using the body of the
     *            message (but not the attributes of the message).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you don't provide a <code>MessageDeduplicationId</code> and
     *            the topic doesn't have <code>ContentBasedDeduplication</code>
     *            set, the action fails with an error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the topic has a <code>ContentBasedDeduplication</code> set,
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
     *            If you send one message with
     *            <code>ContentBasedDeduplication</code> enabled, and then
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
     *            consumer of the message (this can be useful for
     *            troubleshooting delivery issues).
     *            </p>
     *            <p>
     *            If a message is sent successfully but the acknowledgement is
     *            lost and the message is resent with the same
     *            <code>MessageDeduplicationId</code> after the deduplication
     *            interval, Amazon SNS can't detect duplicate messages.
     *            </p>
     *            <p>
     *            Amazon SNS continues to keep track of the message
     *            deduplication ID even after the message is received and
     *            deleted.
     *            </p>
     *            </note>
     *            <p>
     *            The length of <code>MessageDeduplicationId</code> is 128
     *            characters.
     *            </p>
     *            <p>
     *            <code>MessageDeduplicationId</code> can contain alphanumeric
     *            characters <code>(a-z, A-Z, 0-9)</code> and punctuation
     *            <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishBatchRequestEntry withMessageDeduplicationId(String messageDeduplicationId) {
        this.messageDeduplicationId = messageDeduplicationId;
        return this;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) topics.
     * </p>
     * <p>
     * The tag that specifies that a message belongs to a specific message
     * group. Messages that belong to the same message group are processed in a
     * FIFO manner (however, messages in different message groups might be
     * processed out of order). To interleave multiple ordered streams within a
     * single topic, use <code>MessageGroupId</code> values (for example,
     * session data for multiple users). In this scenario, multiple consumers
     * can process the topic, but the session data of each user is processed in
     * a FIFO fashion.
     * </p>
     * <p>
     * You must associate a non-empty <code>MessageGroupId</code> with a
     * message. If you don't provide a <code>MessageGroupId</code>, the action
     * fails.
     * </p>
     * <p>
     * The length of <code>MessageGroupId</code> is 128 characters.
     * </p>
     * <p>
     * <code>MessageGroupId</code> can contain alphanumeric characters
     * <code>(a-z, A-Z, 0-9)</code> and punctuation
     * <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     * </p>
     * <important>
     * <p>
     * <code>MessageGroupId</code> is required for FIFO topics. You can't use it
     * for standard topics.
     * </p>
     * </important>
     *
     * @return <p>
     *         This parameter applies only to FIFO (first-in-first-out) topics.
     *         </p>
     *         <p>
     *         The tag that specifies that a message belongs to a specific
     *         message group. Messages that belong to the same message group are
     *         processed in a FIFO manner (however, messages in different
     *         message groups might be processed out of order). To interleave
     *         multiple ordered streams within a single topic, use
     *         <code>MessageGroupId</code> values (for example, session data for
     *         multiple users). In this scenario, multiple consumers can process
     *         the topic, but the session data of each user is processed in a
     *         FIFO fashion.
     *         </p>
     *         <p>
     *         You must associate a non-empty <code>MessageGroupId</code> with a
     *         message. If you don't provide a <code>MessageGroupId</code>, the
     *         action fails.
     *         </p>
     *         <p>
     *         The length of <code>MessageGroupId</code> is 128 characters.
     *         </p>
     *         <p>
     *         <code>MessageGroupId</code> can contain alphanumeric characters
     *         <code>(a-z, A-Z, 0-9)</code> and punctuation
     *         <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     *         </p>
     *         <important>
     *         <p>
     *         <code>MessageGroupId</code> is required for FIFO topics. You
     *         can't use it for standard topics.
     *         </p>
     *         </important>
     */
    public String getMessageGroupId() {
        return messageGroupId;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) topics.
     * </p>
     * <p>
     * The tag that specifies that a message belongs to a specific message
     * group. Messages that belong to the same message group are processed in a
     * FIFO manner (however, messages in different message groups might be
     * processed out of order). To interleave multiple ordered streams within a
     * single topic, use <code>MessageGroupId</code> values (for example,
     * session data for multiple users). In this scenario, multiple consumers
     * can process the topic, but the session data of each user is processed in
     * a FIFO fashion.
     * </p>
     * <p>
     * You must associate a non-empty <code>MessageGroupId</code> with a
     * message. If you don't provide a <code>MessageGroupId</code>, the action
     * fails.
     * </p>
     * <p>
     * The length of <code>MessageGroupId</code> is 128 characters.
     * </p>
     * <p>
     * <code>MessageGroupId</code> can contain alphanumeric characters
     * <code>(a-z, A-Z, 0-9)</code> and punctuation
     * <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     * </p>
     * <important>
     * <p>
     * <code>MessageGroupId</code> is required for FIFO topics. You can't use it
     * for standard topics.
     * </p>
     * </important>
     *
     * @param messageGroupId <p>
     *            This parameter applies only to FIFO (first-in-first-out)
     *            topics.
     *            </p>
     *            <p>
     *            The tag that specifies that a message belongs to a specific
     *            message group. Messages that belong to the same message group
     *            are processed in a FIFO manner (however, messages in different
     *            message groups might be processed out of order). To interleave
     *            multiple ordered streams within a single topic, use
     *            <code>MessageGroupId</code> values (for example, session data
     *            for multiple users). In this scenario, multiple consumers can
     *            process the topic, but the session data of each user is
     *            processed in a FIFO fashion.
     *            </p>
     *            <p>
     *            You must associate a non-empty <code>MessageGroupId</code>
     *            with a message. If you don't provide a
     *            <code>MessageGroupId</code>, the action fails.
     *            </p>
     *            <p>
     *            The length of <code>MessageGroupId</code> is 128 characters.
     *            </p>
     *            <p>
     *            <code>MessageGroupId</code> can contain alphanumeric
     *            characters <code>(a-z, A-Z, 0-9)</code> and punctuation
     *            <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     *            </p>
     *            <important>
     *            <p>
     *            <code>MessageGroupId</code> is required for FIFO topics. You
     *            can't use it for standard topics.
     *            </p>
     *            </important>
     */
    public void setMessageGroupId(String messageGroupId) {
        this.messageGroupId = messageGroupId;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) topics.
     * </p>
     * <p>
     * The tag that specifies that a message belongs to a specific message
     * group. Messages that belong to the same message group are processed in a
     * FIFO manner (however, messages in different message groups might be
     * processed out of order). To interleave multiple ordered streams within a
     * single topic, use <code>MessageGroupId</code> values (for example,
     * session data for multiple users). In this scenario, multiple consumers
     * can process the topic, but the session data of each user is processed in
     * a FIFO fashion.
     * </p>
     * <p>
     * You must associate a non-empty <code>MessageGroupId</code> with a
     * message. If you don't provide a <code>MessageGroupId</code>, the action
     * fails.
     * </p>
     * <p>
     * The length of <code>MessageGroupId</code> is 128 characters.
     * </p>
     * <p>
     * <code>MessageGroupId</code> can contain alphanumeric characters
     * <code>(a-z, A-Z, 0-9)</code> and punctuation
     * <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     * </p>
     * <important>
     * <p>
     * <code>MessageGroupId</code> is required for FIFO topics. You can't use it
     * for standard topics.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageGroupId <p>
     *            This parameter applies only to FIFO (first-in-first-out)
     *            topics.
     *            </p>
     *            <p>
     *            The tag that specifies that a message belongs to a specific
     *            message group. Messages that belong to the same message group
     *            are processed in a FIFO manner (however, messages in different
     *            message groups might be processed out of order). To interleave
     *            multiple ordered streams within a single topic, use
     *            <code>MessageGroupId</code> values (for example, session data
     *            for multiple users). In this scenario, multiple consumers can
     *            process the topic, but the session data of each user is
     *            processed in a FIFO fashion.
     *            </p>
     *            <p>
     *            You must associate a non-empty <code>MessageGroupId</code>
     *            with a message. If you don't provide a
     *            <code>MessageGroupId</code>, the action fails.
     *            </p>
     *            <p>
     *            The length of <code>MessageGroupId</code> is 128 characters.
     *            </p>
     *            <p>
     *            <code>MessageGroupId</code> can contain alphanumeric
     *            characters <code>(a-z, A-Z, 0-9)</code> and punctuation
     *            <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     *            </p>
     *            <important>
     *            <p>
     *            <code>MessageGroupId</code> is required for FIFO topics. You
     *            can't use it for standard topics.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishBatchRequestEntry withMessageGroupId(String messageGroupId) {
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
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getSubject() != null)
            sb.append("Subject: " + getSubject() + ",");
        if (getMessageStructure() != null)
            sb.append("MessageStructure: " + getMessageStructure() + ",");
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
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode
                + ((getMessageStructure() == null) ? 0 : getMessageStructure().hashCode());
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

        if (obj instanceof PublishBatchRequestEntry == false)
            return false;
        PublishBatchRequestEntry other = (PublishBatchRequestEntry) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getMessageStructure() == null ^ this.getMessageStructure() == null)
            return false;
        if (other.getMessageStructure() != null
                && other.getMessageStructure().equals(this.getMessageStructure()) == false)
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
