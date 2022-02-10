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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Allows a topic owner to set an attribute of the topic to a new value.
 * </p>
 */
public class SetTopicAttributesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the topic to modify.
     * </p>
     */
    private String topicArn;

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special
     * request parameters that the <code>SetTopicAttributes</code> action uses:
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
     * <code>Policy</code> – The policy that defines who can access your topic.
     * By default, only the topic owner can publish or subscribe to the topic.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html"
     * >server-side-encryption</a>:
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
     * The following attribute applies only to <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html"
     * >FIFO topics</a>:
     * </p>
     * <ul>
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
    private String attributeName;

    /**
     * <p>
     * The new value for the attribute.
     * </p>
     */
    private String attributeValue;

    /**
     * Default constructor for SetTopicAttributesRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     */
    public SetTopicAttributesRequest() {
    }

    /**
     * Constructs a new SetTopicAttributesRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param topicArn <p>
     *            The ARN of the topic to modify.
     *            </p>
     * @param attributeName <p>
     *            A map of attributes with their corresponding values.
     *            </p>
     *            <p>
     *            The following lists the names, descriptions, and values of the
     *            special request parameters that the
     *            <code>SetTopicAttributes</code> action uses:
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
     *            <code>Policy</code> – The policy that defines who can access
     *            your topic. By default, only the topic owner can publish or
     *            subscribe to the topic.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following attribute applies only to <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html"
     *            >server-side-encryption</a>:
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
     *            The following attribute applies only to <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html"
     *            >FIFO topics</a>:
     *            </p>
     *            <ul>
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
     * @param attributeValue <p>
     *            The new value for the attribute.
     *            </p>
     */
    public SetTopicAttributesRequest(String topicArn, String attributeName, String attributeValue) {
        setTopicArn(topicArn);
        setAttributeName(attributeName);
        setAttributeValue(attributeValue);
    }

    /**
     * <p>
     * The ARN of the topic to modify.
     * </p>
     *
     * @return <p>
     *         The ARN of the topic to modify.
     *         </p>
     */
    public String getTopicArn() {
        return topicArn;
    }

    /**
     * <p>
     * The ARN of the topic to modify.
     * </p>
     *
     * @param topicArn <p>
     *            The ARN of the topic to modify.
     *            </p>
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The ARN of the topic to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicArn <p>
     *            The ARN of the topic to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetTopicAttributesRequest withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special
     * request parameters that the <code>SetTopicAttributes</code> action uses:
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
     * <code>Policy</code> – The policy that defines who can access your topic.
     * By default, only the topic owner can publish or subscribe to the topic.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html"
     * >server-side-encryption</a>:
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
     * The following attribute applies only to <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html"
     * >FIFO topics</a>:
     * </p>
     * <ul>
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
     *         special request parameters that the
     *         <code>SetTopicAttributes</code> action uses:
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
     *         <code>Policy</code> – The policy that defines who can access your
     *         topic. By default, only the topic owner can publish or subscribe
     *         to the topic.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attribute applies only to <a href=
     *         "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html"
     *         >server-side-encryption</a>:
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
     *         The following attribute applies only to <a href=
     *         "https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html"
     *         >FIFO topics</a>:
     *         </p>
     *         <ul>
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
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special
     * request parameters that the <code>SetTopicAttributes</code> action uses:
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
     * <code>Policy</code> – The policy that defines who can access your topic.
     * By default, only the topic owner can publish or subscribe to the topic.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html"
     * >server-side-encryption</a>:
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
     * The following attribute applies only to <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html"
     * >FIFO topics</a>:
     * </p>
     * <ul>
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
     * @param attributeName <p>
     *            A map of attributes with their corresponding values.
     *            </p>
     *            <p>
     *            The following lists the names, descriptions, and values of the
     *            special request parameters that the
     *            <code>SetTopicAttributes</code> action uses:
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
     *            <code>Policy</code> – The policy that defines who can access
     *            your topic. By default, only the topic owner can publish or
     *            subscribe to the topic.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following attribute applies only to <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html"
     *            >server-side-encryption</a>:
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
     *            The following attribute applies only to <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html"
     *            >FIFO topics</a>:
     *            </p>
     *            <ul>
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
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special
     * request parameters that the <code>SetTopicAttributes</code> action uses:
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
     * <code>Policy</code> – The policy that defines who can access your topic.
     * By default, only the topic owner can publish or subscribe to the topic.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html"
     * >server-side-encryption</a>:
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
     * The following attribute applies only to <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html"
     * >FIFO topics</a>:
     * </p>
     * <ul>
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
     * @param attributeName <p>
     *            A map of attributes with their corresponding values.
     *            </p>
     *            <p>
     *            The following lists the names, descriptions, and values of the
     *            special request parameters that the
     *            <code>SetTopicAttributes</code> action uses:
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
     *            <code>Policy</code> – The policy that defines who can access
     *            your topic. By default, only the topic owner can publish or
     *            subscribe to the topic.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following attribute applies only to <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html"
     *            >server-side-encryption</a>:
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
     *            The following attribute applies only to <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html"
     *            >FIFO topics</a>:
     *            </p>
     *            <ul>
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
    public SetTopicAttributesRequest withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * <p>
     * The new value for the attribute.
     * </p>
     *
     * @return <p>
     *         The new value for the attribute.
     *         </p>
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     * <p>
     * The new value for the attribute.
     * </p>
     *
     * @param attributeValue <p>
     *            The new value for the attribute.
     *            </p>
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * <p>
     * The new value for the attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeValue <p>
     *            The new value for the attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetTopicAttributesRequest withAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
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
        if (getTopicArn() != null)
            sb.append("TopicArn: " + getTopicArn() + ",");
        if (getAttributeName() != null)
            sb.append("AttributeName: " + getAttributeName() + ",");
        if (getAttributeValue() != null)
            sb.append("AttributeValue: " + getAttributeValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetTopicAttributesRequest == false)
            return false;
        SetTopicAttributesRequest other = (SetTopicAttributesRequest) obj;

        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null
                && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeValue() == null ^ this.getAttributeValue() == null)
            return false;
        if (other.getAttributeValue() != null
                && other.getAttributeValue().equals(this.getAttributeValue()) == false)
            return false;
        return true;
    }
}
