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

package com.amazonaws.services.sqs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new standard or FIFO queue. You can pass one or more attributes in
 * the request. Keep the following in mind:
 * </p>
 * <ul>
 * <li>
 * <p>
 * If you don't specify the <code>FifoQueue</code> attribute, Amazon SQS creates
 * a standard queue.
 * </p>
 * <note>
 * <p>
 * You can't change the queue type after you create it and you can't convert an
 * existing standard queue into a FIFO queue. You must either create a new FIFO
 * queue for your application or delete your existing standard queue and
 * recreate it as a FIFO queue. For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-moving"
 * >Moving From a Standard Queue to a FIFO Queue</a> in the <i>Amazon Simple
 * Queue Service Developer Guide</i>.
 * </p>
 * </note></li>
 * <li>
 * <p>
 * If you don't provide a value for an attribute, the queue is created with the
 * default value for the attribute.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you delete a queue, you must wait at least 60 seconds before creating a
 * queue with the same name.
 * </p>
 * </li>
 * </ul>
 * <p>
 * To successfully create a new queue, you must provide a queue name that
 * adheres to the <a href=
 * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/limits-queues.html"
 * >limits related to queues</a> and is unique within the scope of your queues.
 * </p>
 * <note>
 * <p>
 * After you create a queue, you must wait at least one second after the queue
 * is created to be able to use the queue.
 * </p>
 * </note>
 * <p>
 * To get the queue URL, use the <code> <a>GetQueueUrl</a> </code> action.
 * <code> <a>GetQueueUrl</a> </code> requires only the <code>QueueName</code>
 * parameter. be aware of existing queue names:
 * </p>
 * <ul>
 * <li>
 * <p>
 * If you provide the name of an existing queue along with the exact names and
 * values of all the queue's attributes, <code>CreateQueue</code> returns the
 * queue URL for the existing queue.
 * </p>
 * </li>
 * <li>
 * <p>
 * If the queue name, attribute names, or attribute values don't match an
 * existing queue, <code>CreateQueue</code> returns an error.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Some actions take lists of parameters. These lists are specified using the
 * <code>param.n</code> notation. Values of <code>n</code> are integers starting
 * from 1. For example, a parameter list with two elements looks like this:
 * </p>
 * <p>
 * <code>&amp;AttributeName.1=first</code>
 * </p>
 * <p>
 * <code>&amp;AttributeName.2=second</code>
 * </p>
 * <note>
 * <p>
 * Cross-account permissions don't apply to this action. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
 * >Grant Cross-Account Permissions to a Role and a User Name</a> in the
 * <i>Amazon Simple Queue Service Developer Guide</i>.
 * </p>
 * </note>
 */
public class CreateQueueRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the new queue. The following limits apply to this name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A queue name can have up to 80 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid values: alphanumeric characters, hyphens (<code>-</code>), and
     * underscores (<code>_</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * A FIFO queue name must end with the <code>.fifo</code> suffix.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     */
    private String queueName;

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special
     * request parameters that the <code>CreateQueue</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> – The length of time, in seconds, for which the
     * delivery of all messages in the queue is delayed. Valid values: An
     * integer from 0 to 900 seconds (15 minutes). Default: 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> – The limit of how many bytes a message
     * can contain before Amazon SQS rejects it. Valid values: An integer from
     * 1,024 bytes (1 KiB) to 262,144 bytes (256 KiB). Default: 262,144 (256
     * KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> – The length of time, in seconds, for
     * which Amazon SQS retains a message. Valid values: An integer from 60
     * seconds (1 minute) to 1,209,600 seconds (14 days). Default: 345,600 (4
     * days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The queue's policy. A valid AWS policy. For more
     * information about policy structure, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     * >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> – The length of time, in
     * seconds, for which a <code> <a>ReceiveMessage</a> </code> action waits
     * for a message to arrive. Valid values: An integer from 0 to 20 (seconds).
     * Default: 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> – The string that includes the parameters for
     * the dead-letter queue functionality of the source queue as a JSON object.
     * For more information about the redrive policy and dead-letter queues, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     * >Using Amazon SQS Dead-Letter Queues</a> in the <i>Amazon Simple Queue
     * Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the
     * dead-letter queue to which Amazon SQS moves messages after the value of
     * <code>maxReceiveCount</code> is exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maxReceiveCount</code> – The number of times a message is delivered
     * to the source queue before being moved to the dead-letter queue. When the
     * <code>ReceiveCount</code> for a message exceeds the
     * <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to
     * the dead-letter-queue.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The dead-letter queue of a FIFO queue must also be a FIFO queue.
     * Similarly, the dead-letter queue of a standard queue must also be a
     * standard queue.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> – The visibility timeout for the queue, in
     * seconds. Valid values: An integer from 0 to 43,200 (12 hours). Default:
     * 30. For more information about the visibility timeout, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     * >server-side-encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – The ID of an AWS-managed customer master
     * key (CMK) for Amazon SQS or a custom CMK. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     * >Key Terms</a>. While the alias of the AWS-managed CMK for Amazon SQS is
     * always <code>alias/aws/sqs</code>, the alias of a custom CMK can, for
     * example, be <code>alias/<i>MyAlias</i> </code>. For more examples, see <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >KeyId</a> in the <i>AWS Key Management Service API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsDataKeyReusePeriodSeconds</code> – The length of time, in
     * seconds, for which Amazon SQS can reuse a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-keys"
     * >data key</a> to encrypt or decrypt messages before calling AWS KMS
     * again. An integer representing seconds, between 60 seconds (1 minute) and
     * 86,400 seconds (24 hours). Default: 300 (5 minutes). A shorter time
     * period provides better security but results in more calls to KMS which
     * might incur charges after Free Tier. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     * >How Does the Data Key Reuse Period Work?</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     * >FIFO (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoQueue</code> – Designates a queue as FIFO. Valid values:
     * <code>true</code>, <code>false</code>. If you don't specify the
     * <code>FifoQueue</code> attribute, Amazon SQS creates a standard queue.
     * You can provide this attribute only during queue creation. You can't
     * change it for an existing queue. When you set this attribute, you must
     * also provide the <code>MessageGroupId</code> for your messages
     * explicitly.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     * >FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Enables content-based
     * deduplication. Valid values: <code>true</code>, <code>false</code>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service
     * Developer Guide</i>.
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
     * If you send one message with <code>ContentBasedDeduplication</code>
     * enabled and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated
     * for the first <code>MessageDeduplicationId</code>, the two messages are
     * treated as duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * Add cost allocation tags to the specified Amazon SQS queue. For an
     * overview, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-tags.html"
     * >Tagging Your Amazon SQS Queues</a> in the <i>Amazon Simple Queue Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * When you use queue tags, keep the following guidelines in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Adding more than 50 tags to a queue isn't recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags don't have any semantic meaning. Amazon SQS interprets tags as
     * character strings.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * A new tag with a key identical to that of an existing tag overwrites the
     * existing tag.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a full list of tag restrictions, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-limits.html#limits-queues"
     * >Limits Related to Queues</a> in the <i>Amazon Simple Queue Service
     * Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * To be able to tag a queue on creation, you must have the
     * <code>sqs:CreateQueue</code> and <code>sqs:TagQueue</code> permissions.
     * </p>
     * <p>
     * Cross-account permissions don't apply to this action. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     * >Grant Cross-Account Permissions to a Role and a User Name</a> in the
     * <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * </note>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the new queue. The following limits apply to this name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A queue name can have up to 80 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid values: alphanumeric characters, hyphens (<code>-</code>), and
     * underscores (<code>_</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * A FIFO queue name must end with the <code>.fifo</code> suffix.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     *
     * @return <p>
     *         The name of the new queue. The following limits apply to this
     *         name:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A queue name can have up to 80 characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Valid values: alphanumeric characters, hyphens (<code>-</code>),
     *         and underscores (<code>_</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A FIFO queue name must end with the <code>.fifo</code> suffix.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Queue URLs and names are case-sensitive.
     *         </p>
     */
    public String getQueueName() {
        return queueName;
    }

    /**
     * <p>
     * The name of the new queue. The following limits apply to this name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A queue name can have up to 80 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid values: alphanumeric characters, hyphens (<code>-</code>), and
     * underscores (<code>_</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * A FIFO queue name must end with the <code>.fifo</code> suffix.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     *
     * @param queueName <p>
     *            The name of the new queue. The following limits apply to this
     *            name:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            A queue name can have up to 80 characters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Valid values: alphanumeric characters, hyphens (<code>-</code>
     *            ), and underscores (<code>_</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A FIFO queue name must end with the <code>.fifo</code> suffix.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Queue URLs and names are case-sensitive.
     *            </p>
     */
    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    /**
     * <p>
     * The name of the new queue. The following limits apply to this name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A queue name can have up to 80 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid values: alphanumeric characters, hyphens (<code>-</code>), and
     * underscores (<code>_</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * A FIFO queue name must end with the <code>.fifo</code> suffix.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueName <p>
     *            The name of the new queue. The following limits apply to this
     *            name:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            A queue name can have up to 80 characters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Valid values: alphanumeric characters, hyphens (<code>-</code>
     *            ), and underscores (<code>_</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A FIFO queue name must end with the <code>.fifo</code> suffix.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Queue URLs and names are case-sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueueRequest withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special
     * request parameters that the <code>CreateQueue</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> – The length of time, in seconds, for which the
     * delivery of all messages in the queue is delayed. Valid values: An
     * integer from 0 to 900 seconds (15 minutes). Default: 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> – The limit of how many bytes a message
     * can contain before Amazon SQS rejects it. Valid values: An integer from
     * 1,024 bytes (1 KiB) to 262,144 bytes (256 KiB). Default: 262,144 (256
     * KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> – The length of time, in seconds, for
     * which Amazon SQS retains a message. Valid values: An integer from 60
     * seconds (1 minute) to 1,209,600 seconds (14 days). Default: 345,600 (4
     * days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The queue's policy. A valid AWS policy. For more
     * information about policy structure, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     * >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> – The length of time, in
     * seconds, for which a <code> <a>ReceiveMessage</a> </code> action waits
     * for a message to arrive. Valid values: An integer from 0 to 20 (seconds).
     * Default: 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> – The string that includes the parameters for
     * the dead-letter queue functionality of the source queue as a JSON object.
     * For more information about the redrive policy and dead-letter queues, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     * >Using Amazon SQS Dead-Letter Queues</a> in the <i>Amazon Simple Queue
     * Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the
     * dead-letter queue to which Amazon SQS moves messages after the value of
     * <code>maxReceiveCount</code> is exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maxReceiveCount</code> – The number of times a message is delivered
     * to the source queue before being moved to the dead-letter queue. When the
     * <code>ReceiveCount</code> for a message exceeds the
     * <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to
     * the dead-letter-queue.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The dead-letter queue of a FIFO queue must also be a FIFO queue.
     * Similarly, the dead-letter queue of a standard queue must also be a
     * standard queue.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> – The visibility timeout for the queue, in
     * seconds. Valid values: An integer from 0 to 43,200 (12 hours). Default:
     * 30. For more information about the visibility timeout, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     * >server-side-encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – The ID of an AWS-managed customer master
     * key (CMK) for Amazon SQS or a custom CMK. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     * >Key Terms</a>. While the alias of the AWS-managed CMK for Amazon SQS is
     * always <code>alias/aws/sqs</code>, the alias of a custom CMK can, for
     * example, be <code>alias/<i>MyAlias</i> </code>. For more examples, see <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >KeyId</a> in the <i>AWS Key Management Service API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsDataKeyReusePeriodSeconds</code> – The length of time, in
     * seconds, for which Amazon SQS can reuse a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-keys"
     * >data key</a> to encrypt or decrypt messages before calling AWS KMS
     * again. An integer representing seconds, between 60 seconds (1 minute) and
     * 86,400 seconds (24 hours). Default: 300 (5 minutes). A shorter time
     * period provides better security but results in more calls to KMS which
     * might incur charges after Free Tier. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     * >How Does the Data Key Reuse Period Work?</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     * >FIFO (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoQueue</code> – Designates a queue as FIFO. Valid values:
     * <code>true</code>, <code>false</code>. If you don't specify the
     * <code>FifoQueue</code> attribute, Amazon SQS creates a standard queue.
     * You can provide this attribute only during queue creation. You can't
     * change it for an existing queue. When you set this attribute, you must
     * also provide the <code>MessageGroupId</code> for your messages
     * explicitly.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     * >FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Enables content-based
     * deduplication. Valid values: <code>true</code>, <code>false</code>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service
     * Developer Guide</i>.
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
     * If you send one message with <code>ContentBasedDeduplication</code>
     * enabled and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated
     * for the first <code>MessageDeduplicationId</code>, the two messages are
     * treated as duplicates and only one copy of the message is delivered.
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
     *         special request parameters that the <code>CreateQueue</code>
     *         action uses:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DelaySeconds</code> – The length of time, in seconds, for
     *         which the delivery of all messages in the queue is delayed. Valid
     *         values: An integer from 0 to 900 seconds (15 minutes). Default:
     *         0.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MaximumMessageSize</code> – The limit of how many bytes a
     *         message can contain before Amazon SQS rejects it. Valid values:
     *         An integer from 1,024 bytes (1 KiB) to 262,144 bytes (256 KiB).
     *         Default: 262,144 (256 KiB).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MessageRetentionPeriod</code> – The length of time, in
     *         seconds, for which Amazon SQS retains a message. Valid values: An
     *         integer from 60 seconds (1 minute) to 1,209,600 seconds (14
     *         days). Default: 345,600 (4 days).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Policy</code> – The queue's policy. A valid AWS policy. For
     *         more information about policy structure, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     *         >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User
     *         Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReceiveMessageWaitTimeSeconds</code> – The length of time,
     *         in seconds, for which a <code> <a>ReceiveMessage</a> </code>
     *         action waits for a message to arrive. Valid values: An integer
     *         from 0 to 20 (seconds). Default: 0.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RedrivePolicy</code> – The string that includes the
     *         parameters for the dead-letter queue functionality of the source
     *         queue as a JSON object. For more information about the redrive
     *         policy and dead-letter queues, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     *         >Using Amazon SQS Dead-Letter Queues</a> in the <i>Amazon Simple
     *         Queue Service Developer Guide</i>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN)
     *         of the dead-letter queue to which Amazon SQS moves messages after
     *         the value of <code>maxReceiveCount</code> is exceeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>maxReceiveCount</code> – The number of times a message is
     *         delivered to the source queue before being moved to the
     *         dead-letter queue. When the <code>ReceiveCount</code> for a
     *         message exceeds the <code>maxReceiveCount</code> for a queue,
     *         Amazon SQS moves the message to the dead-letter-queue.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The dead-letter queue of a FIFO queue must also be a FIFO queue.
     *         Similarly, the dead-letter queue of a standard queue must also be
     *         a standard queue.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <code>VisibilityTimeout</code> – The visibility timeout for the
     *         queue, in seconds. Valid values: An integer from 0 to 43,200 (12
     *         hours). Default: 30. For more information about the visibility
     *         timeout, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *         >Visibility Timeout</a> in the <i>Amazon Simple Queue Service
     *         Developer Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attributes apply only to <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     *         >server-side-encryption</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>KmsMasterKeyId</code> – The ID of an AWS-managed customer
     *         master key (CMK) for Amazon SQS or a custom CMK. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     *         >Key Terms</a>. While the alias of the AWS-managed CMK for Amazon
     *         SQS is always <code>alias/aws/sqs</code>, the alias of a custom
     *         CMK can, for example, be <code>alias/<i>MyAlias</i> </code>. For
     *         more examples, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     *         >KeyId</a> in the <i>AWS Key Management Service API
     *         Reference</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KmsDataKeyReusePeriodSeconds</code> – The length of time,
     *         in seconds, for which Amazon SQS can reuse a <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-keys"
     *         >data key</a> to encrypt or decrypt messages before calling AWS
     *         KMS again. An integer representing seconds, between 60 seconds (1
     *         minute) and 86,400 seconds (24 hours). Default: 300 (5 minutes).
     *         A shorter time period provides better security but results in
     *         more calls to KMS which might incur charges after Free Tier. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     *         >How Does the Data Key Reuse Period Work?</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attributes apply only to <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     *         >FIFO (first-in-first-out) queues</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FifoQueue</code> – Designates a queue as FIFO. Valid
     *         values: <code>true</code>, <code>false</code>. If you don't
     *         specify the <code>FifoQueue</code> attribute, Amazon SQS creates
     *         a standard queue. You can provide this attribute only during
     *         queue creation. You can't change it for an existing queue. When
     *         you set this attribute, you must also provide the
     *         <code>MessageGroupId</code> for your messages explicitly.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     *         >FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service
     *         Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ContentBasedDeduplication</code> – Enables content-based
     *         deduplication. Valid values: <code>true</code>,
     *         <code>false</code>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *         >Exactly-Once Processing</a> in the <i>Amazon Simple Queue
     *         Service Developer Guide</i>.
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
     *         If you send one message with
     *         <code>ContentBasedDeduplication</code> enabled and then another
     *         message with a <code>MessageDeduplicationId</code> that is the
     *         same as the one generated for the first
     *         <code>MessageDeduplicationId</code>, the two messages are treated
     *         as duplicates and only one copy of the message is delivered.
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
     * request parameters that the <code>CreateQueue</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> – The length of time, in seconds, for which the
     * delivery of all messages in the queue is delayed. Valid values: An
     * integer from 0 to 900 seconds (15 minutes). Default: 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> – The limit of how many bytes a message
     * can contain before Amazon SQS rejects it. Valid values: An integer from
     * 1,024 bytes (1 KiB) to 262,144 bytes (256 KiB). Default: 262,144 (256
     * KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> – The length of time, in seconds, for
     * which Amazon SQS retains a message. Valid values: An integer from 60
     * seconds (1 minute) to 1,209,600 seconds (14 days). Default: 345,600 (4
     * days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The queue's policy. A valid AWS policy. For more
     * information about policy structure, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     * >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> – The length of time, in
     * seconds, for which a <code> <a>ReceiveMessage</a> </code> action waits
     * for a message to arrive. Valid values: An integer from 0 to 20 (seconds).
     * Default: 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> – The string that includes the parameters for
     * the dead-letter queue functionality of the source queue as a JSON object.
     * For more information about the redrive policy and dead-letter queues, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     * >Using Amazon SQS Dead-Letter Queues</a> in the <i>Amazon Simple Queue
     * Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the
     * dead-letter queue to which Amazon SQS moves messages after the value of
     * <code>maxReceiveCount</code> is exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maxReceiveCount</code> – The number of times a message is delivered
     * to the source queue before being moved to the dead-letter queue. When the
     * <code>ReceiveCount</code> for a message exceeds the
     * <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to
     * the dead-letter-queue.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The dead-letter queue of a FIFO queue must also be a FIFO queue.
     * Similarly, the dead-letter queue of a standard queue must also be a
     * standard queue.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> – The visibility timeout for the queue, in
     * seconds. Valid values: An integer from 0 to 43,200 (12 hours). Default:
     * 30. For more information about the visibility timeout, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     * >server-side-encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – The ID of an AWS-managed customer master
     * key (CMK) for Amazon SQS or a custom CMK. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     * >Key Terms</a>. While the alias of the AWS-managed CMK for Amazon SQS is
     * always <code>alias/aws/sqs</code>, the alias of a custom CMK can, for
     * example, be <code>alias/<i>MyAlias</i> </code>. For more examples, see <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >KeyId</a> in the <i>AWS Key Management Service API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsDataKeyReusePeriodSeconds</code> – The length of time, in
     * seconds, for which Amazon SQS can reuse a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-keys"
     * >data key</a> to encrypt or decrypt messages before calling AWS KMS
     * again. An integer representing seconds, between 60 seconds (1 minute) and
     * 86,400 seconds (24 hours). Default: 300 (5 minutes). A shorter time
     * period provides better security but results in more calls to KMS which
     * might incur charges after Free Tier. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     * >How Does the Data Key Reuse Period Work?</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     * >FIFO (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoQueue</code> – Designates a queue as FIFO. Valid values:
     * <code>true</code>, <code>false</code>. If you don't specify the
     * <code>FifoQueue</code> attribute, Amazon SQS creates a standard queue.
     * You can provide this attribute only during queue creation. You can't
     * change it for an existing queue. When you set this attribute, you must
     * also provide the <code>MessageGroupId</code> for your messages
     * explicitly.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     * >FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Enables content-based
     * deduplication. Valid values: <code>true</code>, <code>false</code>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service
     * Developer Guide</i>.
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
     * If you send one message with <code>ContentBasedDeduplication</code>
     * enabled and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated
     * for the first <code>MessageDeduplicationId</code>, the two messages are
     * treated as duplicates and only one copy of the message is delivered.
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
     *            special request parameters that the <code>CreateQueue</code>
     *            action uses:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DelaySeconds</code> – The length of time, in seconds,
     *            for which the delivery of all messages in the queue is
     *            delayed. Valid values: An integer from 0 to 900 seconds (15
     *            minutes). Default: 0.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MaximumMessageSize</code> – The limit of how many bytes
     *            a message can contain before Amazon SQS rejects it. Valid
     *            values: An integer from 1,024 bytes (1 KiB) to 262,144 bytes
     *            (256 KiB). Default: 262,144 (256 KiB).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MessageRetentionPeriod</code> – The length of time, in
     *            seconds, for which Amazon SQS retains a message. Valid values:
     *            An integer from 60 seconds (1 minute) to 1,209,600 seconds (14
     *            days). Default: 345,600 (4 days).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Policy</code> – The queue's policy. A valid AWS policy.
     *            For more information about policy structure, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     *            >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User
     *            Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReceiveMessageWaitTimeSeconds</code> – The length of
     *            time, in seconds, for which a
     *            <code> <a>ReceiveMessage</a> </code> action waits for a
     *            message to arrive. Valid values: An integer from 0 to 20
     *            (seconds). Default: 0.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RedrivePolicy</code> – The string that includes the
     *            parameters for the dead-letter queue functionality of the
     *            source queue as a JSON object. For more information about the
     *            redrive policy and dead-letter queues, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     *            >Using Amazon SQS Dead-Letter Queues</a> in the <i>Amazon
     *            Simple Queue Service Developer Guide</i>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>deadLetterTargetArn</code> – The Amazon Resource Name
     *            (ARN) of the dead-letter queue to which Amazon SQS moves
     *            messages after the value of <code>maxReceiveCount</code> is
     *            exceeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>maxReceiveCount</code> – The number of times a message
     *            is delivered to the source queue before being moved to the
     *            dead-letter queue. When the <code>ReceiveCount</code> for a
     *            message exceeds the <code>maxReceiveCount</code> for a queue,
     *            Amazon SQS moves the message to the dead-letter-queue.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            The dead-letter queue of a FIFO queue must also be a FIFO
     *            queue. Similarly, the dead-letter queue of a standard queue
     *            must also be a standard queue.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <code>VisibilityTimeout</code> – The visibility timeout for
     *            the queue, in seconds. Valid values: An integer from 0 to
     *            43,200 (12 hours). Default: 30. For more information about the
     *            visibility timeout, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *            >Visibility Timeout</a> in the <i>Amazon Simple Queue Service
     *            Developer Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following attributes apply only to <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     *            >server-side-encryption</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KmsMasterKeyId</code> – The ID of an AWS-managed
     *            customer master key (CMK) for Amazon SQS or a custom CMK. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     *            >Key Terms</a>. While the alias of the AWS-managed CMK for
     *            Amazon SQS is always <code>alias/aws/sqs</code>, the alias of
     *            a custom CMK can, for example, be
     *            <code>alias/<i>MyAlias</i> </code>. For more examples, see <a
     *            href=
     *            "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     *            >KeyId</a> in the <i>AWS Key Management Service API
     *            Reference</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KmsDataKeyReusePeriodSeconds</code> – The length of
     *            time, in seconds, for which Amazon SQS can reuse a <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-keys"
     *            >data key</a> to encrypt or decrypt messages before calling
     *            AWS KMS again. An integer representing seconds, between 60
     *            seconds (1 minute) and 86,400 seconds (24 hours). Default: 300
     *            (5 minutes). A shorter time period provides better security
     *            but results in more calls to KMS which might incur charges
     *            after Free Tier. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     *            >How Does the Data Key Reuse Period Work?</a>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following attributes apply only to <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     *            >FIFO (first-in-first-out) queues</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FifoQueue</code> – Designates a queue as FIFO. Valid
     *            values: <code>true</code>, <code>false</code>. If you don't
     *            specify the <code>FifoQueue</code> attribute, Amazon SQS
     *            creates a standard queue. You can provide this attribute only
     *            during queue creation. You can't change it for an existing
     *            queue. When you set this attribute, you must also provide the
     *            <code>MessageGroupId</code> for your messages explicitly.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     *            >FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service
     *            Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ContentBasedDeduplication</code> – Enables content-based
     *            deduplication. Valid values: <code>true</code>,
     *            <code>false</code>. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *            >Exactly-Once Processing</a> in the <i>Amazon Simple Queue
     *            Service Developer Guide</i>.
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
     * request parameters that the <code>CreateQueue</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> – The length of time, in seconds, for which the
     * delivery of all messages in the queue is delayed. Valid values: An
     * integer from 0 to 900 seconds (15 minutes). Default: 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> – The limit of how many bytes a message
     * can contain before Amazon SQS rejects it. Valid values: An integer from
     * 1,024 bytes (1 KiB) to 262,144 bytes (256 KiB). Default: 262,144 (256
     * KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> – The length of time, in seconds, for
     * which Amazon SQS retains a message. Valid values: An integer from 60
     * seconds (1 minute) to 1,209,600 seconds (14 days). Default: 345,600 (4
     * days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The queue's policy. A valid AWS policy. For more
     * information about policy structure, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     * >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> – The length of time, in
     * seconds, for which a <code> <a>ReceiveMessage</a> </code> action waits
     * for a message to arrive. Valid values: An integer from 0 to 20 (seconds).
     * Default: 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> – The string that includes the parameters for
     * the dead-letter queue functionality of the source queue as a JSON object.
     * For more information about the redrive policy and dead-letter queues, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     * >Using Amazon SQS Dead-Letter Queues</a> in the <i>Amazon Simple Queue
     * Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the
     * dead-letter queue to which Amazon SQS moves messages after the value of
     * <code>maxReceiveCount</code> is exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maxReceiveCount</code> – The number of times a message is delivered
     * to the source queue before being moved to the dead-letter queue. When the
     * <code>ReceiveCount</code> for a message exceeds the
     * <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to
     * the dead-letter-queue.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The dead-letter queue of a FIFO queue must also be a FIFO queue.
     * Similarly, the dead-letter queue of a standard queue must also be a
     * standard queue.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> – The visibility timeout for the queue, in
     * seconds. Valid values: An integer from 0 to 43,200 (12 hours). Default:
     * 30. For more information about the visibility timeout, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     * >server-side-encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – The ID of an AWS-managed customer master
     * key (CMK) for Amazon SQS or a custom CMK. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     * >Key Terms</a>. While the alias of the AWS-managed CMK for Amazon SQS is
     * always <code>alias/aws/sqs</code>, the alias of a custom CMK can, for
     * example, be <code>alias/<i>MyAlias</i> </code>. For more examples, see <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >KeyId</a> in the <i>AWS Key Management Service API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsDataKeyReusePeriodSeconds</code> – The length of time, in
     * seconds, for which Amazon SQS can reuse a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-keys"
     * >data key</a> to encrypt or decrypt messages before calling AWS KMS
     * again. An integer representing seconds, between 60 seconds (1 minute) and
     * 86,400 seconds (24 hours). Default: 300 (5 minutes). A shorter time
     * period provides better security but results in more calls to KMS which
     * might incur charges after Free Tier. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     * >How Does the Data Key Reuse Period Work?</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     * >FIFO (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoQueue</code> – Designates a queue as FIFO. Valid values:
     * <code>true</code>, <code>false</code>. If you don't specify the
     * <code>FifoQueue</code> attribute, Amazon SQS creates a standard queue.
     * You can provide this attribute only during queue creation. You can't
     * change it for an existing queue. When you set this attribute, you must
     * also provide the <code>MessageGroupId</code> for your messages
     * explicitly.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     * >FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Enables content-based
     * deduplication. Valid values: <code>true</code>, <code>false</code>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service
     * Developer Guide</i>.
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
     * If you send one message with <code>ContentBasedDeduplication</code>
     * enabled and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated
     * for the first <code>MessageDeduplicationId</code>, the two messages are
     * treated as duplicates and only one copy of the message is delivered.
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
     *            special request parameters that the <code>CreateQueue</code>
     *            action uses:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DelaySeconds</code> – The length of time, in seconds,
     *            for which the delivery of all messages in the queue is
     *            delayed. Valid values: An integer from 0 to 900 seconds (15
     *            minutes). Default: 0.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MaximumMessageSize</code> – The limit of how many bytes
     *            a message can contain before Amazon SQS rejects it. Valid
     *            values: An integer from 1,024 bytes (1 KiB) to 262,144 bytes
     *            (256 KiB). Default: 262,144 (256 KiB).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MessageRetentionPeriod</code> – The length of time, in
     *            seconds, for which Amazon SQS retains a message. Valid values:
     *            An integer from 60 seconds (1 minute) to 1,209,600 seconds (14
     *            days). Default: 345,600 (4 days).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Policy</code> – The queue's policy. A valid AWS policy.
     *            For more information about policy structure, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     *            >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User
     *            Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReceiveMessageWaitTimeSeconds</code> – The length of
     *            time, in seconds, for which a
     *            <code> <a>ReceiveMessage</a> </code> action waits for a
     *            message to arrive. Valid values: An integer from 0 to 20
     *            (seconds). Default: 0.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RedrivePolicy</code> – The string that includes the
     *            parameters for the dead-letter queue functionality of the
     *            source queue as a JSON object. For more information about the
     *            redrive policy and dead-letter queues, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     *            >Using Amazon SQS Dead-Letter Queues</a> in the <i>Amazon
     *            Simple Queue Service Developer Guide</i>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>deadLetterTargetArn</code> – The Amazon Resource Name
     *            (ARN) of the dead-letter queue to which Amazon SQS moves
     *            messages after the value of <code>maxReceiveCount</code> is
     *            exceeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>maxReceiveCount</code> – The number of times a message
     *            is delivered to the source queue before being moved to the
     *            dead-letter queue. When the <code>ReceiveCount</code> for a
     *            message exceeds the <code>maxReceiveCount</code> for a queue,
     *            Amazon SQS moves the message to the dead-letter-queue.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            The dead-letter queue of a FIFO queue must also be a FIFO
     *            queue. Similarly, the dead-letter queue of a standard queue
     *            must also be a standard queue.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <code>VisibilityTimeout</code> – The visibility timeout for
     *            the queue, in seconds. Valid values: An integer from 0 to
     *            43,200 (12 hours). Default: 30. For more information about the
     *            visibility timeout, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *            >Visibility Timeout</a> in the <i>Amazon Simple Queue Service
     *            Developer Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following attributes apply only to <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     *            >server-side-encryption</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KmsMasterKeyId</code> – The ID of an AWS-managed
     *            customer master key (CMK) for Amazon SQS or a custom CMK. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     *            >Key Terms</a>. While the alias of the AWS-managed CMK for
     *            Amazon SQS is always <code>alias/aws/sqs</code>, the alias of
     *            a custom CMK can, for example, be
     *            <code>alias/<i>MyAlias</i> </code>. For more examples, see <a
     *            href=
     *            "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     *            >KeyId</a> in the <i>AWS Key Management Service API
     *            Reference</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KmsDataKeyReusePeriodSeconds</code> – The length of
     *            time, in seconds, for which Amazon SQS can reuse a <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-keys"
     *            >data key</a> to encrypt or decrypt messages before calling
     *            AWS KMS again. An integer representing seconds, between 60
     *            seconds (1 minute) and 86,400 seconds (24 hours). Default: 300
     *            (5 minutes). A shorter time period provides better security
     *            but results in more calls to KMS which might incur charges
     *            after Free Tier. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     *            >How Does the Data Key Reuse Period Work?</a>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following attributes apply only to <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     *            >FIFO (first-in-first-out) queues</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FifoQueue</code> – Designates a queue as FIFO. Valid
     *            values: <code>true</code>, <code>false</code>. If you don't
     *            specify the <code>FifoQueue</code> attribute, Amazon SQS
     *            creates a standard queue. You can provide this attribute only
     *            during queue creation. You can't change it for an existing
     *            queue. When you set this attribute, you must also provide the
     *            <code>MessageGroupId</code> for your messages explicitly.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     *            >FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service
     *            Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ContentBasedDeduplication</code> – Enables content-based
     *            deduplication. Valid values: <code>true</code>,
     *            <code>false</code>. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *            >Exactly-Once Processing</a> in the <i>Amazon Simple Queue
     *            Service Developer Guide</i>.
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
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueueRequest withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special
     * request parameters that the <code>CreateQueue</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> – The length of time, in seconds, for which the
     * delivery of all messages in the queue is delayed. Valid values: An
     * integer from 0 to 900 seconds (15 minutes). Default: 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> – The limit of how many bytes a message
     * can contain before Amazon SQS rejects it. Valid values: An integer from
     * 1,024 bytes (1 KiB) to 262,144 bytes (256 KiB). Default: 262,144 (256
     * KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> – The length of time, in seconds, for
     * which Amazon SQS retains a message. Valid values: An integer from 60
     * seconds (1 minute) to 1,209,600 seconds (14 days). Default: 345,600 (4
     * days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The queue's policy. A valid AWS policy. For more
     * information about policy structure, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     * >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> – The length of time, in
     * seconds, for which a <code> <a>ReceiveMessage</a> </code> action waits
     * for a message to arrive. Valid values: An integer from 0 to 20 (seconds).
     * Default: 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> – The string that includes the parameters for
     * the dead-letter queue functionality of the source queue as a JSON object.
     * For more information about the redrive policy and dead-letter queues, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     * >Using Amazon SQS Dead-Letter Queues</a> in the <i>Amazon Simple Queue
     * Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the
     * dead-letter queue to which Amazon SQS moves messages after the value of
     * <code>maxReceiveCount</code> is exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maxReceiveCount</code> – The number of times a message is delivered
     * to the source queue before being moved to the dead-letter queue. When the
     * <code>ReceiveCount</code> for a message exceeds the
     * <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to
     * the dead-letter-queue.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The dead-letter queue of a FIFO queue must also be a FIFO queue.
     * Similarly, the dead-letter queue of a standard queue must also be a
     * standard queue.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> – The visibility timeout for the queue, in
     * seconds. Valid values: An integer from 0 to 43,200 (12 hours). Default:
     * 30. For more information about the visibility timeout, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     * >server-side-encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – The ID of an AWS-managed customer master
     * key (CMK) for Amazon SQS or a custom CMK. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     * >Key Terms</a>. While the alias of the AWS-managed CMK for Amazon SQS is
     * always <code>alias/aws/sqs</code>, the alias of a custom CMK can, for
     * example, be <code>alias/<i>MyAlias</i> </code>. For more examples, see <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >KeyId</a> in the <i>AWS Key Management Service API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsDataKeyReusePeriodSeconds</code> – The length of time, in
     * seconds, for which Amazon SQS can reuse a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-keys"
     * >data key</a> to encrypt or decrypt messages before calling AWS KMS
     * again. An integer representing seconds, between 60 seconds (1 minute) and
     * 86,400 seconds (24 hours). Default: 300 (5 minutes). A shorter time
     * period provides better security but results in more calls to KMS which
     * might incur charges after Free Tier. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     * >How Does the Data Key Reuse Period Work?</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     * >FIFO (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoQueue</code> – Designates a queue as FIFO. Valid values:
     * <code>true</code>, <code>false</code>. If you don't specify the
     * <code>FifoQueue</code> attribute, Amazon SQS creates a standard queue.
     * You can provide this attribute only during queue creation. You can't
     * change it for an existing queue. When you set this attribute, you must
     * also provide the <code>MessageGroupId</code> for your messages
     * explicitly.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     * >FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Enables content-based
     * deduplication. Valid values: <code>true</code>, <code>false</code>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service
     * Developer Guide</i>.
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
     * If you send one message with <code>ContentBasedDeduplication</code>
     * enabled and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated
     * for the first <code>MessageDeduplicationId</code>, the two messages are
     * treated as duplicates and only one copy of the message is delivered.
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
    public CreateQueueRequest addAttributesEntry(String key, String value) {
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
    public CreateQueueRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * Add cost allocation tags to the specified Amazon SQS queue. For an
     * overview, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-tags.html"
     * >Tagging Your Amazon SQS Queues</a> in the <i>Amazon Simple Queue Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * When you use queue tags, keep the following guidelines in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Adding more than 50 tags to a queue isn't recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags don't have any semantic meaning. Amazon SQS interprets tags as
     * character strings.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * A new tag with a key identical to that of an existing tag overwrites the
     * existing tag.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a full list of tag restrictions, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-limits.html#limits-queues"
     * >Limits Related to Queues</a> in the <i>Amazon Simple Queue Service
     * Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * To be able to tag a queue on creation, you must have the
     * <code>sqs:CreateQueue</code> and <code>sqs:TagQueue</code> permissions.
     * </p>
     * <p>
     * Cross-account permissions don't apply to this action. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     * >Grant Cross-Account Permissions to a Role and a User Name</a> in the
     * <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * </note>
     *
     * @return <p>
     *         Add cost allocation tags to the specified Amazon SQS queue. For
     *         an overview, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-tags.html"
     *         >Tagging Your Amazon SQS Queues</a> in the <i>Amazon Simple Queue
     *         Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         When you use queue tags, keep the following guidelines in mind:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Adding more than 50 tags to a queue isn't recommended.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Tags don't have any semantic meaning. Amazon SQS interprets tags
     *         as character strings.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Tags are case-sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A new tag with a key identical to that of an existing tag
     *         overwrites the existing tag.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For a full list of tag restrictions, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-limits.html#limits-queues"
     *         >Limits Related to Queues</a> in the <i>Amazon Simple Queue
     *         Service Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         To be able to tag a queue on creation, you must have the
     *         <code>sqs:CreateQueue</code> and <code>sqs:TagQueue</code>
     *         permissions.
     *         </p>
     *         <p>
     *         Cross-account permissions don't apply to this action. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     *         >Grant Cross-Account Permissions to a Role and a User Name</a> in
     *         the <i>Amazon Simple Queue Service Developer Guide</i>.
     *         </p>
     *         </note>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Add cost allocation tags to the specified Amazon SQS queue. For an
     * overview, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-tags.html"
     * >Tagging Your Amazon SQS Queues</a> in the <i>Amazon Simple Queue Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * When you use queue tags, keep the following guidelines in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Adding more than 50 tags to a queue isn't recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags don't have any semantic meaning. Amazon SQS interprets tags as
     * character strings.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * A new tag with a key identical to that of an existing tag overwrites the
     * existing tag.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a full list of tag restrictions, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-limits.html#limits-queues"
     * >Limits Related to Queues</a> in the <i>Amazon Simple Queue Service
     * Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * To be able to tag a queue on creation, you must have the
     * <code>sqs:CreateQueue</code> and <code>sqs:TagQueue</code> permissions.
     * </p>
     * <p>
     * Cross-account permissions don't apply to this action. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     * >Grant Cross-Account Permissions to a Role and a User Name</a> in the
     * <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * </note>
     *
     * @param tags <p>
     *            Add cost allocation tags to the specified Amazon SQS queue.
     *            For an overview, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-tags.html"
     *            >Tagging Your Amazon SQS Queues</a> in the <i>Amazon Simple
     *            Queue Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            When you use queue tags, keep the following guidelines in
     *            mind:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Adding more than 50 tags to a queue isn't recommended.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Tags don't have any semantic meaning. Amazon SQS interprets
     *            tags as character strings.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Tags are case-sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A new tag with a key identical to that of an existing tag
     *            overwrites the existing tag.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For a full list of tag restrictions, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-limits.html#limits-queues"
     *            >Limits Related to Queues</a> in the <i>Amazon Simple Queue
     *            Service Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            To be able to tag a queue on creation, you must have the
     *            <code>sqs:CreateQueue</code> and <code>sqs:TagQueue</code>
     *            permissions.
     *            </p>
     *            <p>
     *            Cross-account permissions don't apply to this action. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     *            >Grant Cross-Account Permissions to a Role and a User Name</a>
     *            in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *            </p>
     *            </note>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Add cost allocation tags to the specified Amazon SQS queue. For an
     * overview, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-tags.html"
     * >Tagging Your Amazon SQS Queues</a> in the <i>Amazon Simple Queue Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * When you use queue tags, keep the following guidelines in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Adding more than 50 tags to a queue isn't recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags don't have any semantic meaning. Amazon SQS interprets tags as
     * character strings.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * A new tag with a key identical to that of an existing tag overwrites the
     * existing tag.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a full list of tag restrictions, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-limits.html#limits-queues"
     * >Limits Related to Queues</a> in the <i>Amazon Simple Queue Service
     * Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * To be able to tag a queue on creation, you must have the
     * <code>sqs:CreateQueue</code> and <code>sqs:TagQueue</code> permissions.
     * </p>
     * <p>
     * Cross-account permissions don't apply to this action. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     * >Grant Cross-Account Permissions to a Role and a User Name</a> in the
     * <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Add cost allocation tags to the specified Amazon SQS queue.
     *            For an overview, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-tags.html"
     *            >Tagging Your Amazon SQS Queues</a> in the <i>Amazon Simple
     *            Queue Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            When you use queue tags, keep the following guidelines in
     *            mind:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Adding more than 50 tags to a queue isn't recommended.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Tags don't have any semantic meaning. Amazon SQS interprets
     *            tags as character strings.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Tags are case-sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A new tag with a key identical to that of an existing tag
     *            overwrites the existing tag.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For a full list of tag restrictions, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-limits.html#limits-queues"
     *            >Limits Related to Queues</a> in the <i>Amazon Simple Queue
     *            Service Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            To be able to tag a queue on creation, you must have the
     *            <code>sqs:CreateQueue</code> and <code>sqs:TagQueue</code>
     *            permissions.
     *            </p>
     *            <p>
     *            Cross-account permissions don't apply to this action. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     *            >Grant Cross-Account Permissions to a Role and a User Name</a>
     *            in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueueRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * Add cost allocation tags to the specified Amazon SQS queue. For an
     * overview, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-tags.html"
     * >Tagging Your Amazon SQS Queues</a> in the <i>Amazon Simple Queue Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * When you use queue tags, keep the following guidelines in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Adding more than 50 tags to a queue isn't recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags don't have any semantic meaning. Amazon SQS interprets tags as
     * character strings.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * A new tag with a key identical to that of an existing tag overwrites the
     * existing tag.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a full list of tag restrictions, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-limits.html#limits-queues"
     * >Limits Related to Queues</a> in the <i>Amazon Simple Queue Service
     * Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * To be able to tag a queue on creation, you must have the
     * <code>sqs:CreateQueue</code> and <code>sqs:TagQueue</code> permissions.
     * </p>
     * <p>
     * Cross-account permissions don't apply to this action. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     * >Grant Cross-Account Permissions to a Role and a User Name</a> in the
     * <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueueRequest addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateQueueRequest cleartagsEntries() {
        this.tags = null;
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
        if (getQueueName() != null)
            sb.append("QueueName: " + getQueueName() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueName() == null) ? 0 : getQueueName().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateQueueRequest == false)
            return false;
        CreateQueueRequest other = (CreateQueueRequest) obj;

        if (other.getQueueName() == null ^ this.getQueueName() == null)
            return false;
        if (other.getQueueName() != null
                && other.getQueueName().equals(this.getQueueName()) == false)
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
        return true;
    }
}
