/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a topic to which notifications can be published. Users can create at
 * most 100,000 standard topics (at most 1,000 FIFO topics). For more
 * information, see <a
 * href="https://docs.aws.amazon.com/sns/latest/dg/sns-create-topic.html"
 * >Creating an Amazon SNS topic</a> in the <i>Amazon SNS Developer Guide</i>.
 * This action is idempotent, so if the requester already owns a topic with the
 * specified name, that topic's ARN is returned without creating a new topic.
 * </p>
 */
public class CreateTopicRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the topic you want to create.
     * </p>
     * <p>
     * Constraints: Topic names must be made up of only uppercase and lowercase
     * ASCII letters, numbers, underscores, and hyphens, and must be between 1
     * and 256 characters long.
     * </p>
     * <p>
     * For a FIFO (first-in-first-out) topic, the name must end with the
     * <code>.fifo</code> suffix.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special
     * request parameters that the <code>CreateTopic</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS
     * retries failed deliveries to HTTP/S endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DisplayName</code> – The display name to use for a topic with SMS
     * subscriptions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FifoTopic</code> – Set to true to create a FIFO topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The policy that defines who can access your topic.
     * By default, only the topic owner can publish or subscribe to the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SignatureVersion</code> – The signature version corresponds to the
     * hashing algorithm used while creating the signature of the notifications,
     * subscription confirmations, or unsubscribe confirmation messages sent by
     * Amazon SNS. By default, <code>SignatureVersion</code> is set to
     * <code>1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TracingConfig</code> – Tracing mode of an Amazon SNS topic. By
     * default <code>TracingConfig</code> is set to <code>PassThrough</code>,
     * and the topic passes through the tracing header it receives from an
     * Amazon SNS publisher to its subscriptions. If set to <code>Active</code>,
     * Amazon SNS will vend X-Ray segment data to topic owner account if the
     * sampled flag in the tracing header is true. This is only supported on
     * standard topics.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html"
     * >server-side encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – The ID of an Amazon Web Services managed
     * customer master key (CMK) for Amazon SNS or a custom CMK. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms"
     * >Key Terms</a>. For more examples, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >KeyId</a> in the <i>Key Management Service API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html"
     * >FIFO topics</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoTopic</code> – When this is set to <code>true</code>, a FIFO
     * topic is created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Enables content-based
     * deduplication for FIFO topics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * By default, <code>ContentBasedDeduplication</code> is set to
     * <code>false</code>. If you create a FIFO topic and this attribute is
     * <code>false</code>, you must specify a value for the
     * <code>MessageDeduplicationId</code> parameter for the <a
     * href="https://docs.aws.amazon.com/sns/latest/api/API_Publish.html"
     * >Publish</a> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you set <code>ContentBasedDeduplication</code> to <code>true</code>,
     * Amazon SNS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but
     * not the attributes of the message).
     * </p>
     * <p>
     * (Optional) To override the generated value, you can specify a value for
     * the <code>MessageDeduplicationId</code> parameter for the
     * <code>Publish</code> action.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> attributes = new java.util.HashMap<String, String>();

    /**
     * <p>
     * The list of tags to add to a new topic.
     * </p>
     * <note>
     * <p>
     * To be able to tag a topic on creation, you must have the
     * <code>sns:CreateTopic</code> and <code>sns:TagResource</code>
     * permissions.
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags = new java.util.ArrayList<Tag>();

    /**
     * <p>
     * The body of the policy document you want to use for this topic.
     * </p>
     * <p>
     * You can only add one policy per topic.
     * </p>
     * <p>
     * The policy must be in JSON string format.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 30,720.
     * </p>
     */
    private String dataProtectionPolicy;

    /**
     * Default constructor for CreateTopicRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     */
    public CreateTopicRequest() {
    }

    /**
     * Constructs a new CreateTopicRequest object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param name <p>
     *            The name of the topic you want to create.
     *            </p>
     *            <p>
     *            Constraints: Topic names must be made up of only uppercase and
     *            lowercase ASCII letters, numbers, underscores, and hyphens,
     *            and must be between 1 and 256 characters long.
     *            </p>
     *            <p>
     *            For a FIFO (first-in-first-out) topic, the name must end with
     *            the <code>.fifo</code> suffix.
     *            </p>
     */
    public CreateTopicRequest(String name) {
        setName(name);
    }

    /**
     * <p>
     * The name of the topic you want to create.
     * </p>
     * <p>
     * Constraints: Topic names must be made up of only uppercase and lowercase
     * ASCII letters, numbers, underscores, and hyphens, and must be between 1
     * and 256 characters long.
     * </p>
     * <p>
     * For a FIFO (first-in-first-out) topic, the name must end with the
     * <code>.fifo</code> suffix.
     * </p>
     *
     * @return <p>
     *         The name of the topic you want to create.
     *         </p>
     *         <p>
     *         Constraints: Topic names must be made up of only uppercase and
     *         lowercase ASCII letters, numbers, underscores, and hyphens, and
     *         must be between 1 and 256 characters long.
     *         </p>
     *         <p>
     *         For a FIFO (first-in-first-out) topic, the name must end with the
     *         <code>.fifo</code> suffix.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the topic you want to create.
     * </p>
     * <p>
     * Constraints: Topic names must be made up of only uppercase and lowercase
     * ASCII letters, numbers, underscores, and hyphens, and must be between 1
     * and 256 characters long.
     * </p>
     * <p>
     * For a FIFO (first-in-first-out) topic, the name must end with the
     * <code>.fifo</code> suffix.
     * </p>
     *
     * @param name <p>
     *            The name of the topic you want to create.
     *            </p>
     *            <p>
     *            Constraints: Topic names must be made up of only uppercase and
     *            lowercase ASCII letters, numbers, underscores, and hyphens,
     *            and must be between 1 and 256 characters long.
     *            </p>
     *            <p>
     *            For a FIFO (first-in-first-out) topic, the name must end with
     *            the <code>.fifo</code> suffix.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the topic you want to create.
     * </p>
     * <p>
     * Constraints: Topic names must be made up of only uppercase and lowercase
     * ASCII letters, numbers, underscores, and hyphens, and must be between 1
     * and 256 characters long.
     * </p>
     * <p>
     * For a FIFO (first-in-first-out) topic, the name must end with the
     * <code>.fifo</code> suffix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the topic you want to create.
     *            </p>
     *            <p>
     *            Constraints: Topic names must be made up of only uppercase and
     *            lowercase ASCII letters, numbers, underscores, and hyphens,
     *            and must be between 1 and 256 characters long.
     *            </p>
     *            <p>
     *            For a FIFO (first-in-first-out) topic, the name must end with
     *            the <code>.fifo</code> suffix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTopicRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special
     * request parameters that the <code>CreateTopic</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS
     * retries failed deliveries to HTTP/S endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DisplayName</code> – The display name to use for a topic with SMS
     * subscriptions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FifoTopic</code> – Set to true to create a FIFO topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The policy that defines who can access your topic.
     * By default, only the topic owner can publish or subscribe to the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SignatureVersion</code> – The signature version corresponds to the
     * hashing algorithm used while creating the signature of the notifications,
     * subscription confirmations, or unsubscribe confirmation messages sent by
     * Amazon SNS. By default, <code>SignatureVersion</code> is set to
     * <code>1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TracingConfig</code> – Tracing mode of an Amazon SNS topic. By
     * default <code>TracingConfig</code> is set to <code>PassThrough</code>,
     * and the topic passes through the tracing header it receives from an
     * Amazon SNS publisher to its subscriptions. If set to <code>Active</code>,
     * Amazon SNS will vend X-Ray segment data to topic owner account if the
     * sampled flag in the tracing header is true. This is only supported on
     * standard topics.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html"
     * >server-side encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – The ID of an Amazon Web Services managed
     * customer master key (CMK) for Amazon SNS or a custom CMK. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms"
     * >Key Terms</a>. For more examples, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >KeyId</a> in the <i>Key Management Service API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html"
     * >FIFO topics</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoTopic</code> – When this is set to <code>true</code>, a FIFO
     * topic is created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Enables content-based
     * deduplication for FIFO topics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * By default, <code>ContentBasedDeduplication</code> is set to
     * <code>false</code>. If you create a FIFO topic and this attribute is
     * <code>false</code>, you must specify a value for the
     * <code>MessageDeduplicationId</code> parameter for the <a
     * href="https://docs.aws.amazon.com/sns/latest/api/API_Publish.html"
     * >Publish</a> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you set <code>ContentBasedDeduplication</code> to <code>true</code>,
     * Amazon SNS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but
     * not the attributes of the message).
     * </p>
     * <p>
     * (Optional) To override the generated value, you can specify a value for
     * the <code>MessageDeduplicationId</code> parameter for the
     * <code>Publish</code> action.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A map of attributes with their corresponding values.
     *         </p>
     *         <p>
     *         The following lists the names, descriptions, and values of the
     *         special request parameters that the <code>CreateTopic</code>
     *         action uses:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DeliveryPolicy</code> – The policy that defines how Amazon
     *         SNS retries failed deliveries to HTTP/S endpoints.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DisplayName</code> – The display name to use for a topic
     *         with SMS subscriptions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FifoTopic</code> – Set to true to create a FIFO topic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Policy</code> – The policy that defines who can access your
     *         topic. By default, only the topic owner can publish or subscribe
     *         to the topic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SignatureVersion</code> – The signature version corresponds
     *         to the hashing algorithm used while creating the signature of the
     *         notifications, subscription confirmations, or unsubscribe
     *         confirmation messages sent by Amazon SNS. By default,
     *         <code>SignatureVersion</code> is set to <code>1</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TracingConfig</code> – Tracing mode of an Amazon SNS topic.
     *         By default <code>TracingConfig</code> is set to
     *         <code>PassThrough</code>, and the topic passes through the
     *         tracing header it receives from an Amazon SNS publisher to its
     *         subscriptions. If set to <code>Active</code>, Amazon SNS will
     *         vend X-Ray segment data to topic owner account if the sampled
     *         flag in the tracing header is true. This is only supported on
     *         standard topics.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attribute applies only to <a href=
     *         "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html"
     *         >server-side encryption</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>KmsMasterKeyId</code> – The ID of an Amazon Web Services
     *         managed customer master key (CMK) for Amazon SNS or a custom CMK.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms"
     *         >Key Terms</a>. For more examples, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     *         >KeyId</a> in the <i>Key Management Service API Reference</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attributes apply only to <a href=
     *         "https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html"
     *         >FIFO topics</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FifoTopic</code> – When this is set to <code>true</code>, a
     *         FIFO topic is created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ContentBasedDeduplication</code> – Enables content-based
     *         deduplication for FIFO topics.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         By default, <code>ContentBasedDeduplication</code> is set to
     *         <code>false</code>. If you create a FIFO topic and this attribute
     *         is <code>false</code>, you must specify a value for the
     *         <code>MessageDeduplicationId</code> parameter for the <a
     *         href="https://docs.aws.amazon.com/sns/latest/api/API_Publish.html"
     *         >Publish</a> action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When you set <code>ContentBasedDeduplication</code> to
     *         <code>true</code>, Amazon SNS uses a SHA-256 hash to generate the
     *         <code>MessageDeduplicationId</code> using the body of the message
     *         (but not the attributes of the message).
     *         </p>
     *         <p>
     *         (Optional) To override the generated value, you can specify a
     *         value for the <code>MessageDeduplicationId</code> parameter for
     *         the <code>Publish</code> action.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special
     * request parameters that the <code>CreateTopic</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS
     * retries failed deliveries to HTTP/S endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DisplayName</code> – The display name to use for a topic with SMS
     * subscriptions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FifoTopic</code> – Set to true to create a FIFO topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The policy that defines who can access your topic.
     * By default, only the topic owner can publish or subscribe to the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SignatureVersion</code> – The signature version corresponds to the
     * hashing algorithm used while creating the signature of the notifications,
     * subscription confirmations, or unsubscribe confirmation messages sent by
     * Amazon SNS. By default, <code>SignatureVersion</code> is set to
     * <code>1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TracingConfig</code> – Tracing mode of an Amazon SNS topic. By
     * default <code>TracingConfig</code> is set to <code>PassThrough</code>,
     * and the topic passes through the tracing header it receives from an
     * Amazon SNS publisher to its subscriptions. If set to <code>Active</code>,
     * Amazon SNS will vend X-Ray segment data to topic owner account if the
     * sampled flag in the tracing header is true. This is only supported on
     * standard topics.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html"
     * >server-side encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – The ID of an Amazon Web Services managed
     * customer master key (CMK) for Amazon SNS or a custom CMK. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms"
     * >Key Terms</a>. For more examples, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >KeyId</a> in the <i>Key Management Service API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html"
     * >FIFO topics</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoTopic</code> – When this is set to <code>true</code>, a FIFO
     * topic is created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Enables content-based
     * deduplication for FIFO topics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * By default, <code>ContentBasedDeduplication</code> is set to
     * <code>false</code>. If you create a FIFO topic and this attribute is
     * <code>false</code>, you must specify a value for the
     * <code>MessageDeduplicationId</code> parameter for the <a
     * href="https://docs.aws.amazon.com/sns/latest/api/API_Publish.html"
     * >Publish</a> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you set <code>ContentBasedDeduplication</code> to <code>true</code>,
     * Amazon SNS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but
     * not the attributes of the message).
     * </p>
     * <p>
     * (Optional) To override the generated value, you can specify a value for
     * the <code>MessageDeduplicationId</code> parameter for the
     * <code>Publish</code> action.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @param attributes <p>
     *            A map of attributes with their corresponding values.
     *            </p>
     *            <p>
     *            The following lists the names, descriptions, and values of the
     *            special request parameters that the <code>CreateTopic</code>
     *            action uses:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DeliveryPolicy</code> – The policy that defines how
     *            Amazon SNS retries failed deliveries to HTTP/S endpoints.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DisplayName</code> – The display name to use for a topic
     *            with SMS subscriptions.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FifoTopic</code> – Set to true to create a FIFO topic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Policy</code> – The policy that defines who can access
     *            your topic. By default, only the topic owner can publish or
     *            subscribe to the topic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SignatureVersion</code> – The signature version
     *            corresponds to the hashing algorithm used while creating the
     *            signature of the notifications, subscription confirmations, or
     *            unsubscribe confirmation messages sent by Amazon SNS. By
     *            default, <code>SignatureVersion</code> is set to
     *            <code>1</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TracingConfig</code> – Tracing mode of an Amazon SNS
     *            topic. By default <code>TracingConfig</code> is set to
     *            <code>PassThrough</code>, and the topic passes through the
     *            tracing header it receives from an Amazon SNS publisher to its
     *            subscriptions. If set to <code>Active</code>, Amazon SNS will
     *            vend X-Ray segment data to topic owner account if the sampled
     *            flag in the tracing header is true. This is only supported on
     *            standard topics.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following attribute applies only to <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html"
     *            >server-side encryption</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KmsMasterKeyId</code> – The ID of an Amazon Web Services
     *            managed customer master key (CMK) for Amazon SNS or a custom
     *            CMK. For more information, see <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms"
     *            >Key Terms</a>. For more examples, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     *            >KeyId</a> in the <i>Key Management Service API Reference</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following attributes apply only to <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html"
     *            >FIFO topics</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FifoTopic</code> – When this is set to <code>true</code>
     *            , a FIFO topic is created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ContentBasedDeduplication</code> – Enables content-based
     *            deduplication for FIFO topics.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            By default, <code>ContentBasedDeduplication</code> is set to
     *            <code>false</code>. If you create a FIFO topic and this
     *            attribute is <code>false</code>, you must specify a value for
     *            the <code>MessageDeduplicationId</code> parameter for the <a
     *            href=
     *            "https://docs.aws.amazon.com/sns/latest/api/API_Publish.html"
     *            >Publish</a> action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            When you set <code>ContentBasedDeduplication</code> to
     *            <code>true</code>, Amazon SNS uses a SHA-256 hash to generate
     *            the <code>MessageDeduplicationId</code> using the body of the
     *            message (but not the attributes of the message).
     *            </p>
     *            <p>
     *            (Optional) To override the generated value, you can specify a
     *            value for the <code>MessageDeduplicationId</code> parameter
     *            for the <code>Publish</code> action.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special
     * request parameters that the <code>CreateTopic</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS
     * retries failed deliveries to HTTP/S endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DisplayName</code> – The display name to use for a topic with SMS
     * subscriptions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FifoTopic</code> – Set to true to create a FIFO topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The policy that defines who can access your topic.
     * By default, only the topic owner can publish or subscribe to the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SignatureVersion</code> – The signature version corresponds to the
     * hashing algorithm used while creating the signature of the notifications,
     * subscription confirmations, or unsubscribe confirmation messages sent by
     * Amazon SNS. By default, <code>SignatureVersion</code> is set to
     * <code>1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TracingConfig</code> – Tracing mode of an Amazon SNS topic. By
     * default <code>TracingConfig</code> is set to <code>PassThrough</code>,
     * and the topic passes through the tracing header it receives from an
     * Amazon SNS publisher to its subscriptions. If set to <code>Active</code>,
     * Amazon SNS will vend X-Ray segment data to topic owner account if the
     * sampled flag in the tracing header is true. This is only supported on
     * standard topics.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html"
     * >server-side encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – The ID of an Amazon Web Services managed
     * customer master key (CMK) for Amazon SNS or a custom CMK. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms"
     * >Key Terms</a>. For more examples, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >KeyId</a> in the <i>Key Management Service API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html"
     * >FIFO topics</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoTopic</code> – When this is set to <code>true</code>, a FIFO
     * topic is created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Enables content-based
     * deduplication for FIFO topics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * By default, <code>ContentBasedDeduplication</code> is set to
     * <code>false</code>. If you create a FIFO topic and this attribute is
     * <code>false</code>, you must specify a value for the
     * <code>MessageDeduplicationId</code> parameter for the <a
     * href="https://docs.aws.amazon.com/sns/latest/api/API_Publish.html"
     * >Publish</a> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you set <code>ContentBasedDeduplication</code> to <code>true</code>,
     * Amazon SNS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but
     * not the attributes of the message).
     * </p>
     * <p>
     * (Optional) To override the generated value, you can specify a value for
     * the <code>MessageDeduplicationId</code> parameter for the
     * <code>Publish</code> action.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A map of attributes with their corresponding values.
     *            </p>
     *            <p>
     *            The following lists the names, descriptions, and values of the
     *            special request parameters that the <code>CreateTopic</code>
     *            action uses:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DeliveryPolicy</code> – The policy that defines how
     *            Amazon SNS retries failed deliveries to HTTP/S endpoints.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DisplayName</code> – The display name to use for a topic
     *            with SMS subscriptions.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FifoTopic</code> – Set to true to create a FIFO topic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Policy</code> – The policy that defines who can access
     *            your topic. By default, only the topic owner can publish or
     *            subscribe to the topic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SignatureVersion</code> – The signature version
     *            corresponds to the hashing algorithm used while creating the
     *            signature of the notifications, subscription confirmations, or
     *            unsubscribe confirmation messages sent by Amazon SNS. By
     *            default, <code>SignatureVersion</code> is set to
     *            <code>1</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TracingConfig</code> – Tracing mode of an Amazon SNS
     *            topic. By default <code>TracingConfig</code> is set to
     *            <code>PassThrough</code>, and the topic passes through the
     *            tracing header it receives from an Amazon SNS publisher to its
     *            subscriptions. If set to <code>Active</code>, Amazon SNS will
     *            vend X-Ray segment data to topic owner account if the sampled
     *            flag in the tracing header is true. This is only supported on
     *            standard topics.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following attribute applies only to <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html"
     *            >server-side encryption</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KmsMasterKeyId</code> – The ID of an Amazon Web Services
     *            managed customer master key (CMK) for Amazon SNS or a custom
     *            CMK. For more information, see <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms"
     *            >Key Terms</a>. For more examples, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     *            >KeyId</a> in the <i>Key Management Service API Reference</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following attributes apply only to <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html"
     *            >FIFO topics</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FifoTopic</code> – When this is set to <code>true</code>
     *            , a FIFO topic is created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ContentBasedDeduplication</code> – Enables content-based
     *            deduplication for FIFO topics.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            By default, <code>ContentBasedDeduplication</code> is set to
     *            <code>false</code>. If you create a FIFO topic and this
     *            attribute is <code>false</code>, you must specify a value for
     *            the <code>MessageDeduplicationId</code> parameter for the <a
     *            href=
     *            "https://docs.aws.amazon.com/sns/latest/api/API_Publish.html"
     *            >Publish</a> action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            When you set <code>ContentBasedDeduplication</code> to
     *            <code>true</code>, Amazon SNS uses a SHA-256 hash to generate
     *            the <code>MessageDeduplicationId</code> using the body of the
     *            message (but not the attributes of the message).
     *            </p>
     *            <p>
     *            (Optional) To override the generated value, you can specify a
     *            value for the <code>MessageDeduplicationId</code> parameter
     *            for the <code>Publish</code> action.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTopicRequest withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special
     * request parameters that the <code>CreateTopic</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS
     * retries failed deliveries to HTTP/S endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DisplayName</code> – The display name to use for a topic with SMS
     * subscriptions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FifoTopic</code> – Set to true to create a FIFO topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The policy that defines who can access your topic.
     * By default, only the topic owner can publish or subscribe to the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SignatureVersion</code> – The signature version corresponds to the
     * hashing algorithm used while creating the signature of the notifications,
     * subscription confirmations, or unsubscribe confirmation messages sent by
     * Amazon SNS. By default, <code>SignatureVersion</code> is set to
     * <code>1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TracingConfig</code> – Tracing mode of an Amazon SNS topic. By
     * default <code>TracingConfig</code> is set to <code>PassThrough</code>,
     * and the topic passes through the tracing header it receives from an
     * Amazon SNS publisher to its subscriptions. If set to <code>Active</code>,
     * Amazon SNS will vend X-Ray segment data to topic owner account if the
     * sampled flag in the tracing header is true. This is only supported on
     * standard topics.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html"
     * >server-side encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – The ID of an Amazon Web Services managed
     * customer master key (CMK) for Amazon SNS or a custom CMK. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms"
     * >Key Terms</a>. For more examples, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >KeyId</a> in the <i>Key Management Service API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html"
     * >FIFO topics</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoTopic</code> – When this is set to <code>true</code>, a FIFO
     * topic is created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Enables content-based
     * deduplication for FIFO topics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * By default, <code>ContentBasedDeduplication</code> is set to
     * <code>false</code>. If you create a FIFO topic and this attribute is
     * <code>false</code>, you must specify a value for the
     * <code>MessageDeduplicationId</code> parameter for the <a
     * href="https://docs.aws.amazon.com/sns/latest/api/API_Publish.html"
     * >Publish</a> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you set <code>ContentBasedDeduplication</code> to <code>true</code>,
     * Amazon SNS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but
     * not the attributes of the message).
     * </p>
     * <p>
     * (Optional) To override the generated value, you can specify a value for
     * the <code>MessageDeduplicationId</code> parameter for the
     * <code>Publish</code> action.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into
     *            Attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTopicRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateTopicRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The list of tags to add to a new topic.
     * </p>
     * <note>
     * <p>
     * To be able to tag a topic on creation, you must have the
     * <code>sns:CreateTopic</code> and <code>sns:TagResource</code>
     * permissions.
     * </p>
     * </note>
     *
     * @return <p>
     *         The list of tags to add to a new topic.
     *         </p>
     *         <note>
     *         <p>
     *         To be able to tag a topic on creation, you must have the
     *         <code>sns:CreateTopic</code> and <code>sns:TagResource</code>
     *         permissions.
     *         </p>
     *         </note>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tags to add to a new topic.
     * </p>
     * <note>
     * <p>
     * To be able to tag a topic on creation, you must have the
     * <code>sns:CreateTopic</code> and <code>sns:TagResource</code>
     * permissions.
     * </p>
     * </note>
     *
     * @param tags <p>
     *            The list of tags to add to a new topic.
     *            </p>
     *            <note>
     *            <p>
     *            To be able to tag a topic on creation, you must have the
     *            <code>sns:CreateTopic</code> and <code>sns:TagResource</code>
     *            permissions.
     *            </p>
     *            </note>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The list of tags to add to a new topic.
     * </p>
     * <note>
     * <p>
     * To be able to tag a topic on creation, you must have the
     * <code>sns:CreateTopic</code> and <code>sns:TagResource</code>
     * permissions.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags to add to a new topic.
     *            </p>
     *            <note>
     *            <p>
     *            To be able to tag a topic on creation, you must have the
     *            <code>sns:CreateTopic</code> and <code>sns:TagResource</code>
     *            permissions.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTopicRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags to add to a new topic.
     * </p>
     * <note>
     * <p>
     * To be able to tag a topic on creation, you must have the
     * <code>sns:CreateTopic</code> and <code>sns:TagResource</code>
     * permissions.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags to add to a new topic.
     *            </p>
     *            <note>
     *            <p>
     *            To be able to tag a topic on creation, you must have the
     *            <code>sns:CreateTopic</code> and <code>sns:TagResource</code>
     *            permissions.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTopicRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The body of the policy document you want to use for this topic.
     * </p>
     * <p>
     * You can only add one policy per topic.
     * </p>
     * <p>
     * The policy must be in JSON string format.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 30,720.
     * </p>
     *
     * @return <p>
     *         The body of the policy document you want to use for this topic.
     *         </p>
     *         <p>
     *         You can only add one policy per topic.
     *         </p>
     *         <p>
     *         The policy must be in JSON string format.
     *         </p>
     *         <p>
     *         Length Constraints: Maximum length of 30,720.
     *         </p>
     */
    public String getDataProtectionPolicy() {
        return dataProtectionPolicy;
    }

    /**
     * <p>
     * The body of the policy document you want to use for this topic.
     * </p>
     * <p>
     * You can only add one policy per topic.
     * </p>
     * <p>
     * The policy must be in JSON string format.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 30,720.
     * </p>
     *
     * @param dataProtectionPolicy <p>
     *            The body of the policy document you want to use for this
     *            topic.
     *            </p>
     *            <p>
     *            You can only add one policy per topic.
     *            </p>
     *            <p>
     *            The policy must be in JSON string format.
     *            </p>
     *            <p>
     *            Length Constraints: Maximum length of 30,720.
     *            </p>
     */
    public void setDataProtectionPolicy(String dataProtectionPolicy) {
        this.dataProtectionPolicy = dataProtectionPolicy;
    }

    /**
     * <p>
     * The body of the policy document you want to use for this topic.
     * </p>
     * <p>
     * You can only add one policy per topic.
     * </p>
     * <p>
     * The policy must be in JSON string format.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 30,720.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataProtectionPolicy <p>
     *            The body of the policy document you want to use for this
     *            topic.
     *            </p>
     *            <p>
     *            You can only add one policy per topic.
     *            </p>
     *            <p>
     *            The policy must be in JSON string format.
     *            </p>
     *            <p>
     *            Length Constraints: Maximum length of 30,720.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTopicRequest withDataProtectionPolicy(String dataProtectionPolicy) {
        this.dataProtectionPolicy = dataProtectionPolicy;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getDataProtectionPolicy() != null)
            sb.append("DataProtectionPolicy: " + getDataProtectionPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getDataProtectionPolicy() == null) ? 0 : getDataProtectionPolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTopicRequest == false)
            return false;
        CreateTopicRequest other = (CreateTopicRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getDataProtectionPolicy() == null ^ this.getDataProtectionPolicy() == null)
            return false;
        if (other.getDataProtectionPolicy() != null
                && other.getDataProtectionPolicy().equals(this.getDataProtectionPolicy()) == false)
            return false;
        return true;
    }
}
