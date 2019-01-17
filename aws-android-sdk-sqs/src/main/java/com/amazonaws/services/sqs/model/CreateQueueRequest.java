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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new standard or FIFO queue or returns the URL of an existing queue.
 * You can pass one or more attributes in the request.
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
 * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues-moving.html"
 * > Moving From a Standard Queue to a FIFO Queue</a> in the <i>Amazon SQS
 * Developer Guide</i>.
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
 * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/limits-queues.html"
 * >limits related to queues</a> and is unique within the scope of your queues.
 * </p>
 * <p>
 * To get the queue URL, use the <a>GetQueueUrl</a> action. <a>GetQueueUrl</a>
 * requires only the <code>QueueName</code> parameter.
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
 * Some API actions take lists of parameters. Specify these lists using the
 * <code>param.n</code> notation. Values of <code>n</code> are integers starting
 * from 1. The following is an example of a parameter list with two elements:
 * </p>
 * <p>
 * <code>&amp;amp;Attribute.1=this</code>
 * </p>
 * <p>
 * <code>&amp;amp;Attribute.2=that</code>
 * </p>
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
     * The following are accepted: alphanumeric chatacters, hyphens (
     * <code>-</code>), and underscores (<code>_</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * A FIFO queue name must end with the <code>.fifo</code> suffix.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Queue names are case-sensitive.
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
     * <code>DelaySeconds</code> - The number of seconds for which the delivery
     * of all messages in the queue is delayed. An integer from 0 to 900 (15
     * minutes). The default is 0 (zero).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - The limit of how many bytes a message
     * can contain before Amazon SQS rejects it. An integer from 1,024 bytes (1
     * KiB) up to 262,144 bytes (256 KiB). The default is 262,144 (256 KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - The number of seconds for which
     * Amazon SQS retains a message. An integer representing seconds, from 60 (1
     * minute) to 120,9600 (14 days). The default is 345,600 (4 days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> - The queue's policy. A valid AWS policy. For more
     * information about policy structure, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     * >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> - The number of seconds for
     * which a <a>ReceiveMessage</a> action will wait for a message to arrive.
     * An integer from 0 to 20 (seconds). The default is 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - The parameters for the dead letter queue
     * functionality of the source queue. For more information about the redrive
     * policy and dead letter queues, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * The dead letter queue of a FIFO queue must also be a FIFO queue.
     * Similarly, the dead letter queue of a standard queue must also be a
     * standard queue.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - The visibility timeout for the queue. An
     * integer from 0 to 43200 (12 hours). The default is 30. For more
     * information about the visibility timeout, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     * >FIFO (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoQueue</code> - Designates a queue as FIFO. You can provide this
     * attribute only during queue creation; you can't change it for an existing
     * queue. When you set this attribute, you must provide a
     * <code>MessageGroupId</code> explicitly.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     * >FIFO Queue Logic</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> - Enables content-based
     * deduplication. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
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
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters that are specified (such as
     * <code>ApproximateNumberOfMessages</code>,
     * <code>ApproximateNumberOfMessagesDelayed</code>,
     * <code>ApproximateNumberOfMessagesNotVisible</code>,
     * <code>CreatedTimestamp</code>, <code>LastModifiedTimestamp</code>, and
     * <code>QueueArn</code>) will be ignored.
     * </p>
     */
    private java.util.Map<String, String> attributes = new java.util.HashMap<String, String>();

    /**
     * Default constructor for CreateQueueRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     */
    public CreateQueueRequest() {
    }

    /**
     * Constructs a new CreateQueueRequest object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
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
     *            The following are accepted: alphanumeric chatacters, hyphens (
     *            <code>-</code>), and underscores (<code>_</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A FIFO queue name must end with the <code>.fifo</code> suffix.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Queue names are case-sensitive.
     *            </p>
     */
    public CreateQueueRequest(String queueName) {
        setQueueName(queueName);
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
     * The following are accepted: alphanumeric chatacters, hyphens (
     * <code>-</code>), and underscores (<code>_</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * A FIFO queue name must end with the <code>.fifo</code> suffix.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Queue names are case-sensitive.
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
     *         The following are accepted: alphanumeric chatacters, hyphens (
     *         <code>-</code>), and underscores (<code>_</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A FIFO queue name must end with the <code>.fifo</code> suffix.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Queue names are case-sensitive.
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
     * The following are accepted: alphanumeric chatacters, hyphens (
     * <code>-</code>), and underscores (<code>_</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * A FIFO queue name must end with the <code>.fifo</code> suffix.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Queue names are case-sensitive.
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
     *            The following are accepted: alphanumeric chatacters, hyphens (
     *            <code>-</code>), and underscores (<code>_</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A FIFO queue name must end with the <code>.fifo</code> suffix.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Queue names are case-sensitive.
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
     * The following are accepted: alphanumeric chatacters, hyphens (
     * <code>-</code>), and underscores (<code>_</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * A FIFO queue name must end with the <code>.fifo</code> suffix.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Queue names are case-sensitive.
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
     *            The following are accepted: alphanumeric chatacters, hyphens (
     *            <code>-</code>), and underscores (<code>_</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A FIFO queue name must end with the <code>.fifo</code> suffix.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Queue names are case-sensitive.
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
     * <code>DelaySeconds</code> - The number of seconds for which the delivery
     * of all messages in the queue is delayed. An integer from 0 to 900 (15
     * minutes). The default is 0 (zero).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - The limit of how many bytes a message
     * can contain before Amazon SQS rejects it. An integer from 1,024 bytes (1
     * KiB) up to 262,144 bytes (256 KiB). The default is 262,144 (256 KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - The number of seconds for which
     * Amazon SQS retains a message. An integer representing seconds, from 60 (1
     * minute) to 120,9600 (14 days). The default is 345,600 (4 days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> - The queue's policy. A valid AWS policy. For more
     * information about policy structure, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     * >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> - The number of seconds for
     * which a <a>ReceiveMessage</a> action will wait for a message to arrive.
     * An integer from 0 to 20 (seconds). The default is 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - The parameters for the dead letter queue
     * functionality of the source queue. For more information about the redrive
     * policy and dead letter queues, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * The dead letter queue of a FIFO queue must also be a FIFO queue.
     * Similarly, the dead letter queue of a standard queue must also be a
     * standard queue.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - The visibility timeout for the queue. An
     * integer from 0 to 43200 (12 hours). The default is 30. For more
     * information about the visibility timeout, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     * >FIFO (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoQueue</code> - Designates a queue as FIFO. You can provide this
     * attribute only during queue creation; you can't change it for an existing
     * queue. When you set this attribute, you must provide a
     * <code>MessageGroupId</code> explicitly.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     * >FIFO Queue Logic</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> - Enables content-based
     * deduplication. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
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
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters that are specified (such as
     * <code>ApproximateNumberOfMessages</code>,
     * <code>ApproximateNumberOfMessagesDelayed</code>,
     * <code>ApproximateNumberOfMessagesNotVisible</code>,
     * <code>CreatedTimestamp</code>, <code>LastModifiedTimestamp</code>, and
     * <code>QueueArn</code>) will be ignored.
     * </p>
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
     *         <code>DelaySeconds</code> - The number of seconds for which the
     *         delivery of all messages in the queue is delayed. An integer from
     *         0 to 900 (15 minutes). The default is 0 (zero).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MaximumMessageSize</code> - The limit of how many bytes a
     *         message can contain before Amazon SQS rejects it. An integer from
     *         1,024 bytes (1 KiB) up to 262,144 bytes (256 KiB). The default is
     *         262,144 (256 KiB).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MessageRetentionPeriod</code> - The number of seconds for
     *         which Amazon SQS retains a message. An integer representing
     *         seconds, from 60 (1 minute) to 120,9600 (14 days). The default is
     *         345,600 (4 days).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Policy</code> - The queue's policy. A valid AWS policy. For
     *         more information about policy structure, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     *         >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User
     *         Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReceiveMessageWaitTimeSeconds</code> - The number of
     *         seconds for which a <a>ReceiveMessage</a> action will wait for a
     *         message to arrive. An integer from 0 to 20 (seconds). The default
     *         is 0.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RedrivePolicy</code> - The parameters for the dead letter
     *         queue functionality of the source queue. For more information
     *         about the redrive policy and dead letter queues, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     *         >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS
     *         Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         The dead letter queue of a FIFO queue must also be a FIFO queue.
     *         Similarly, the dead letter queue of a standard queue must also be
     *         a standard queue.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <code>VisibilityTimeout</code> - The visibility timeout for the
     *         queue. An integer from 0 to 43200 (12 hours). The default is 30.
     *         For more information about the visibility timeout, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     *         >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attributes apply only to <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     *         >FIFO (first-in-first-out) queues</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FifoQueue</code> - Designates a queue as FIFO. You can
     *         provide this attribute only during queue creation; you can't
     *         change it for an existing queue. When you set this attribute, you
     *         must provide a <code>MessageGroupId</code> explicitly.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     *         >FIFO Queue Logic</a> in the <i>Amazon SQS Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ContentBasedDeduplication</code> - Enables content-based
     *         deduplication. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *         >Exactly-Once Processing</a> in the <i>Amazon SQS Developer
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
     *         </li>
     *         </ul>
     *         <p>
     *         Any other valid special request parameters that are specified
     *         (such as <code>ApproximateNumberOfMessages</code>,
     *         <code>ApproximateNumberOfMessagesDelayed</code>,
     *         <code>ApproximateNumberOfMessagesNotVisible</code>,
     *         <code>CreatedTimestamp</code>, <code>LastModifiedTimestamp</code>
     *         , and <code>QueueArn</code>) will be ignored.
     *         </p>
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
     * <code>DelaySeconds</code> - The number of seconds for which the delivery
     * of all messages in the queue is delayed. An integer from 0 to 900 (15
     * minutes). The default is 0 (zero).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - The limit of how many bytes a message
     * can contain before Amazon SQS rejects it. An integer from 1,024 bytes (1
     * KiB) up to 262,144 bytes (256 KiB). The default is 262,144 (256 KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - The number of seconds for which
     * Amazon SQS retains a message. An integer representing seconds, from 60 (1
     * minute) to 120,9600 (14 days). The default is 345,600 (4 days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> - The queue's policy. A valid AWS policy. For more
     * information about policy structure, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     * >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> - The number of seconds for
     * which a <a>ReceiveMessage</a> action will wait for a message to arrive.
     * An integer from 0 to 20 (seconds). The default is 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - The parameters for the dead letter queue
     * functionality of the source queue. For more information about the redrive
     * policy and dead letter queues, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * The dead letter queue of a FIFO queue must also be a FIFO queue.
     * Similarly, the dead letter queue of a standard queue must also be a
     * standard queue.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - The visibility timeout for the queue. An
     * integer from 0 to 43200 (12 hours). The default is 30. For more
     * information about the visibility timeout, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     * >FIFO (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoQueue</code> - Designates a queue as FIFO. You can provide this
     * attribute only during queue creation; you can't change it for an existing
     * queue. When you set this attribute, you must provide a
     * <code>MessageGroupId</code> explicitly.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     * >FIFO Queue Logic</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> - Enables content-based
     * deduplication. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
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
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters that are specified (such as
     * <code>ApproximateNumberOfMessages</code>,
     * <code>ApproximateNumberOfMessagesDelayed</code>,
     * <code>ApproximateNumberOfMessagesNotVisible</code>,
     * <code>CreatedTimestamp</code>, <code>LastModifiedTimestamp</code>, and
     * <code>QueueArn</code>) will be ignored.
     * </p>
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
     *            <code>DelaySeconds</code> - The number of seconds for which
     *            the delivery of all messages in the queue is delayed. An
     *            integer from 0 to 900 (15 minutes). The default is 0 (zero).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MaximumMessageSize</code> - The limit of how many bytes
     *            a message can contain before Amazon SQS rejects it. An integer
     *            from 1,024 bytes (1 KiB) up to 262,144 bytes (256 KiB). The
     *            default is 262,144 (256 KiB).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MessageRetentionPeriod</code> - The number of seconds
     *            for which Amazon SQS retains a message. An integer
     *            representing seconds, from 60 (1 minute) to 120,9600 (14
     *            days). The default is 345,600 (4 days).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Policy</code> - The queue's policy. A valid AWS policy.
     *            For more information about policy structure, see <a href=
     *            "http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     *            >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User
     *            Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReceiveMessageWaitTimeSeconds</code> - The number of
     *            seconds for which a <a>ReceiveMessage</a> action will wait for
     *            a message to arrive. An integer from 0 to 20 (seconds). The
     *            default is 0.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RedrivePolicy</code> - The parameters for the dead
     *            letter queue functionality of the source queue. For more
     *            information about the redrive policy and dead letter queues,
     *            see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     *            >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS
     *            Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            The dead letter queue of a FIFO queue must also be a FIFO
     *            queue. Similarly, the dead letter queue of a standard queue
     *            must also be a standard queue.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <code>VisibilityTimeout</code> - The visibility timeout for
     *            the queue. An integer from 0 to 43200 (12 hours). The default
     *            is 30. For more information about the visibility timeout, see
     *            <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     *            >Visibility Timeout</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following attributes apply only to <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     *            >FIFO (first-in-first-out) queues</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FifoQueue</code> - Designates a queue as FIFO. You can
     *            provide this attribute only during queue creation; you can't
     *            change it for an existing queue. When you set this attribute,
     *            you must provide a <code>MessageGroupId</code> explicitly.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     *            >FIFO Queue Logic</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ContentBasedDeduplication</code> - Enables content-based
     *            deduplication. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *            >Exactly-Once Processing</a> in the <i>Amazon SQS Developer
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
     *            </li>
     *            </ul>
     *            <p>
     *            Any other valid special request parameters that are specified
     *            (such as <code>ApproximateNumberOfMessages</code>,
     *            <code>ApproximateNumberOfMessagesDelayed</code>,
     *            <code>ApproximateNumberOfMessagesNotVisible</code>,
     *            <code>CreatedTimestamp</code>,
     *            <code>LastModifiedTimestamp</code>, and <code>QueueArn</code>)
     *            will be ignored.
     *            </p>
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
     * <code>DelaySeconds</code> - The number of seconds for which the delivery
     * of all messages in the queue is delayed. An integer from 0 to 900 (15
     * minutes). The default is 0 (zero).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - The limit of how many bytes a message
     * can contain before Amazon SQS rejects it. An integer from 1,024 bytes (1
     * KiB) up to 262,144 bytes (256 KiB). The default is 262,144 (256 KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - The number of seconds for which
     * Amazon SQS retains a message. An integer representing seconds, from 60 (1
     * minute) to 120,9600 (14 days). The default is 345,600 (4 days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> - The queue's policy. A valid AWS policy. For more
     * information about policy structure, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     * >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> - The number of seconds for
     * which a <a>ReceiveMessage</a> action will wait for a message to arrive.
     * An integer from 0 to 20 (seconds). The default is 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - The parameters for the dead letter queue
     * functionality of the source queue. For more information about the redrive
     * policy and dead letter queues, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * The dead letter queue of a FIFO queue must also be a FIFO queue.
     * Similarly, the dead letter queue of a standard queue must also be a
     * standard queue.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - The visibility timeout for the queue. An
     * integer from 0 to 43200 (12 hours). The default is 30. For more
     * information about the visibility timeout, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     * >FIFO (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoQueue</code> - Designates a queue as FIFO. You can provide this
     * attribute only during queue creation; you can't change it for an existing
     * queue. When you set this attribute, you must provide a
     * <code>MessageGroupId</code> explicitly.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     * >FIFO Queue Logic</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> - Enables content-based
     * deduplication. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
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
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters that are specified (such as
     * <code>ApproximateNumberOfMessages</code>,
     * <code>ApproximateNumberOfMessagesDelayed</code>,
     * <code>ApproximateNumberOfMessagesNotVisible</code>,
     * <code>CreatedTimestamp</code>, <code>LastModifiedTimestamp</code>, and
     * <code>QueueArn</code>) will be ignored.
     * </p>
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
     *            <code>DelaySeconds</code> - The number of seconds for which
     *            the delivery of all messages in the queue is delayed. An
     *            integer from 0 to 900 (15 minutes). The default is 0 (zero).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MaximumMessageSize</code> - The limit of how many bytes
     *            a message can contain before Amazon SQS rejects it. An integer
     *            from 1,024 bytes (1 KiB) up to 262,144 bytes (256 KiB). The
     *            default is 262,144 (256 KiB).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MessageRetentionPeriod</code> - The number of seconds
     *            for which Amazon SQS retains a message. An integer
     *            representing seconds, from 60 (1 minute) to 120,9600 (14
     *            days). The default is 345,600 (4 days).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Policy</code> - The queue's policy. A valid AWS policy.
     *            For more information about policy structure, see <a href=
     *            "http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     *            >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User
     *            Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReceiveMessageWaitTimeSeconds</code> - The number of
     *            seconds for which a <a>ReceiveMessage</a> action will wait for
     *            a message to arrive. An integer from 0 to 20 (seconds). The
     *            default is 0.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RedrivePolicy</code> - The parameters for the dead
     *            letter queue functionality of the source queue. For more
     *            information about the redrive policy and dead letter queues,
     *            see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     *            >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS
     *            Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            The dead letter queue of a FIFO queue must also be a FIFO
     *            queue. Similarly, the dead letter queue of a standard queue
     *            must also be a standard queue.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <code>VisibilityTimeout</code> - The visibility timeout for
     *            the queue. An integer from 0 to 43200 (12 hours). The default
     *            is 30. For more information about the visibility timeout, see
     *            <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     *            >Visibility Timeout</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following attributes apply only to <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     *            >FIFO (first-in-first-out) queues</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FifoQueue</code> - Designates a queue as FIFO. You can
     *            provide this attribute only during queue creation; you can't
     *            change it for an existing queue. When you set this attribute,
     *            you must provide a <code>MessageGroupId</code> explicitly.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     *            >FIFO Queue Logic</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ContentBasedDeduplication</code> - Enables content-based
     *            deduplication. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *            >Exactly-Once Processing</a> in the <i>Amazon SQS Developer
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
     *            </li>
     *            </ul>
     *            <p>
     *            Any other valid special request parameters that are specified
     *            (such as <code>ApproximateNumberOfMessages</code>,
     *            <code>ApproximateNumberOfMessagesDelayed</code>,
     *            <code>ApproximateNumberOfMessagesNotVisible</code>,
     *            <code>CreatedTimestamp</code>,
     *            <code>LastModifiedTimestamp</code>, and <code>QueueArn</code>)
     *            will be ignored.
     *            </p>
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
     * <code>DelaySeconds</code> - The number of seconds for which the delivery
     * of all messages in the queue is delayed. An integer from 0 to 900 (15
     * minutes). The default is 0 (zero).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - The limit of how many bytes a message
     * can contain before Amazon SQS rejects it. An integer from 1,024 bytes (1
     * KiB) up to 262,144 bytes (256 KiB). The default is 262,144 (256 KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - The number of seconds for which
     * Amazon SQS retains a message. An integer representing seconds, from 60 (1
     * minute) to 120,9600 (14 days). The default is 345,600 (4 days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> - The queue's policy. A valid AWS policy. For more
     * information about policy structure, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     * >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> - The number of seconds for
     * which a <a>ReceiveMessage</a> action will wait for a message to arrive.
     * An integer from 0 to 20 (seconds). The default is 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - The parameters for the dead letter queue
     * functionality of the source queue. For more information about the redrive
     * policy and dead letter queues, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * The dead letter queue of a FIFO queue must also be a FIFO queue.
     * Similarly, the dead letter queue of a standard queue must also be a
     * standard queue.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - The visibility timeout for the queue. An
     * integer from 0 to 43200 (12 hours). The default is 30. For more
     * information about the visibility timeout, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     * >FIFO (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoQueue</code> - Designates a queue as FIFO. You can provide this
     * attribute only during queue creation; you can't change it for an existing
     * queue. When you set this attribute, you must provide a
     * <code>MessageGroupId</code> explicitly.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     * >FIFO Queue Logic</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> - Enables content-based
     * deduplication. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
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
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters that are specified (such as
     * <code>ApproximateNumberOfMessages</code>,
     * <code>ApproximateNumberOfMessagesDelayed</code>,
     * <code>ApproximateNumberOfMessagesNotVisible</code>,
     * <code>CreatedTimestamp</code>, <code>LastModifiedTimestamp</code>, and
     * <code>QueueArn</code>) will be ignored.
     * </p>
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
            sb.append("Attributes: " + getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueName() == null) ? 0 : getQueueName().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
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
        return true;
    }
}
