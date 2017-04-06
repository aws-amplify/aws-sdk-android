/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Gets attributes for the specified queue.
 * </p>
 * <note>
 * <p>
 * Some API actions take lists of parameters. These lists are specified using
 * the <code>param.n</code> notation. Values of <code>n</code> are integers
 * starting from 1. For example, a parameter list with two elements looks like
 * this:
 * </p>
 * </note>
 * <p>
 * <code>&amp;amp;Attribute.1=this</code>
 * </p>
 * <p>
 * <code>&amp;amp;Attribute.2=that</code>
 * </p>
 */
public class GetQueueAttributesRequest extends AmazonWebServiceRequest implements Serializable {
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
     * A list of attributes for which to retrieve information.
     * </p>
     * <note>
     * <p>
     * Going forward, new attributes might be added. If you are writing code
     * that calls this action, we recommend that you structure your code so that
     * it can handle new attributes gracefully.
     * </p>
     * </note>
     * <p>
     * The following attributes are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> - Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessages</code> - Returns the approximate number
     * of visible messages in a queue. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     * >Resources Required to Process Messages</a> in the <i>Amazon SQS
     * Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesDelayed</code> - Returns the approximate
     * number of messages that are waiting to be added to the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesNotVisible</code> - Returns the
     * approximate number of messages that have not timed-out and are not
     * deleted. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     * >Resources Required to Process Messages</a> in the <i>Amazon SQS
     * Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatedTimestamp</code> - Returns the time when the queue was
     * created in seconds (epoch time).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DelaySeconds</code> - Returns the default delay on the queue in
     * seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModifiedTimestamp</code> - Returns the time when the queue was
     * last changed in seconds (epoch time).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - Returns the limit of how many bytes a
     * message can contain before Amazon SQS rejects it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - Returns the number of seconds for
     * which Amazon SQS retains a message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> - Returns the policy of the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QueueArn</code> - Returns the Amazon resource name (ARN) of the
     * queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> - Returns the number of
     * seconds for which ReceiveMessage call will wait for a message to arrive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - Returns the parameters for dead letter queue
     * functionality of the source queue. For more information about the redrive
     * policy and dead letter queues, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - Returns the visibility timeout for the
     * queue. For more information about the visibility timeout, see <a href=
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
     * <code>FifoQueue</code> - Returns whether the queue is FIFO. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     * >FIFO Queue Logic</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> - Returns whether content-based
     * deduplication is enabled for the queue. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> attributeNames = new java.util.ArrayList<String>();

    /**
     * Default constructor for GetQueueAttributesRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     */
    public GetQueueAttributesRequest() {
    }

    /**
     * Constructs a new GetQueueAttributesRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to take action on.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     */
    public GetQueueAttributesRequest(String queueUrl) {
        setQueueUrl(queueUrl);
    }

    /**
     * Constructs a new GetQueueAttributesRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to take action on.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     * @param attributeNames <p>
     *            A list of attributes for which to retrieve information.
     *            </p>
     *            <note>
     *            <p>
     *            Going forward, new attributes might be added. If you are
     *            writing code that calls this action, we recommend that you
     *            structure your code so that it can handle new attributes
     *            gracefully.
     *            </p>
     *            </note>
     *            <p>
     *            The following attributes are supported:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>All</code> - Returns all values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateNumberOfMessages</code> - Returns the
     *            approximate number of visible messages in a queue. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     *            >Resources Required to Process Messages</a> in the <i>Amazon
     *            SQS Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateNumberOfMessagesDelayed</code> - Returns the
     *            approximate number of messages that are waiting to be added to
     *            the queue.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateNumberOfMessagesNotVisible</code> - Returns
     *            the approximate number of messages that have not timed-out and
     *            are not deleted. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     *            >Resources Required to Process Messages</a> in the <i>Amazon
     *            SQS Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CreatedTimestamp</code> - Returns the time when the
     *            queue was created in seconds (epoch time).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DelaySeconds</code> - Returns the default delay on the
     *            queue in seconds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LastModifiedTimestamp</code> - Returns the time when the
     *            queue was last changed in seconds (epoch time).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MaximumMessageSize</code> - Returns the limit of how
     *            many bytes a message can contain before Amazon SQS rejects it.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MessageRetentionPeriod</code> - Returns the number of
     *            seconds for which Amazon SQS retains a message.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Policy</code> - Returns the policy of the queue.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QueueArn</code> - Returns the Amazon resource name (ARN)
     *            of the queue.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReceiveMessageWaitTimeSeconds</code> - Returns the
     *            number of seconds for which ReceiveMessage call will wait for
     *            a message to arrive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RedrivePolicy</code> - Returns the parameters for dead
     *            letter queue functionality of the source queue. For more
     *            information about the redrive policy and dead letter queues,
     *            see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     *            >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS
     *            Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VisibilityTimeout</code> - Returns the visibility
     *            timeout for the queue. For more information about the
     *            visibility timeout, see <a href=
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
     *            <code>FifoQueue</code> - Returns whether the queue is FIFO.
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     *            >FIFO Queue Logic</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ContentBasedDeduplication</code> - Returns whether
     *            content-based deduplication is enabled for the queue. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *            >Exactly-Once Processing</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public GetQueueAttributesRequest(String queueUrl, java.util.List<String> attributeNames) {
        setQueueUrl(queueUrl);
        setAttributeNames(attributeNames);
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
    public GetQueueAttributesRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * <p>
     * A list of attributes for which to retrieve information.
     * </p>
     * <note>
     * <p>
     * Going forward, new attributes might be added. If you are writing code
     * that calls this action, we recommend that you structure your code so that
     * it can handle new attributes gracefully.
     * </p>
     * </note>
     * <p>
     * The following attributes are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> - Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessages</code> - Returns the approximate number
     * of visible messages in a queue. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     * >Resources Required to Process Messages</a> in the <i>Amazon SQS
     * Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesDelayed</code> - Returns the approximate
     * number of messages that are waiting to be added to the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesNotVisible</code> - Returns the
     * approximate number of messages that have not timed-out and are not
     * deleted. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     * >Resources Required to Process Messages</a> in the <i>Amazon SQS
     * Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatedTimestamp</code> - Returns the time when the queue was
     * created in seconds (epoch time).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DelaySeconds</code> - Returns the default delay on the queue in
     * seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModifiedTimestamp</code> - Returns the time when the queue was
     * last changed in seconds (epoch time).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - Returns the limit of how many bytes a
     * message can contain before Amazon SQS rejects it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - Returns the number of seconds for
     * which Amazon SQS retains a message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> - Returns the policy of the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QueueArn</code> - Returns the Amazon resource name (ARN) of the
     * queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> - Returns the number of
     * seconds for which ReceiveMessage call will wait for a message to arrive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - Returns the parameters for dead letter queue
     * functionality of the source queue. For more information about the redrive
     * policy and dead letter queues, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - Returns the visibility timeout for the
     * queue. For more information about the visibility timeout, see <a href=
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
     * <code>FifoQueue</code> - Returns whether the queue is FIFO. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     * >FIFO Queue Logic</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> - Returns whether content-based
     * deduplication is enabled for the queue. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A list of attributes for which to retrieve information.
     *         </p>
     *         <note>
     *         <p>
     *         Going forward, new attributes might be added. If you are writing
     *         code that calls this action, we recommend that you structure your
     *         code so that it can handle new attributes gracefully.
     *         </p>
     *         </note>
     *         <p>
     *         The following attributes are supported:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>All</code> - Returns all values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ApproximateNumberOfMessages</code> - Returns the
     *         approximate number of visible messages in a queue. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     *         >Resources Required to Process Messages</a> in the <i>Amazon SQS
     *         Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ApproximateNumberOfMessagesDelayed</code> - Returns the
     *         approximate number of messages that are waiting to be added to
     *         the queue.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ApproximateNumberOfMessagesNotVisible</code> - Returns the
     *         approximate number of messages that have not timed-out and are
     *         not deleted. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     *         >Resources Required to Process Messages</a> in the <i>Amazon SQS
     *         Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CreatedTimestamp</code> - Returns the time when the queue
     *         was created in seconds (epoch time).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DelaySeconds</code> - Returns the default delay on the
     *         queue in seconds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LastModifiedTimestamp</code> - Returns the time when the
     *         queue was last changed in seconds (epoch time).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MaximumMessageSize</code> - Returns the limit of how many
     *         bytes a message can contain before Amazon SQS rejects it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MessageRetentionPeriod</code> - Returns the number of
     *         seconds for which Amazon SQS retains a message.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Policy</code> - Returns the policy of the queue.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>QueueArn</code> - Returns the Amazon resource name (ARN) of
     *         the queue.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReceiveMessageWaitTimeSeconds</code> - Returns the number
     *         of seconds for which ReceiveMessage call will wait for a message
     *         to arrive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RedrivePolicy</code> - Returns the parameters for dead
     *         letter queue functionality of the source queue. For more
     *         information about the redrive policy and dead letter queues, see
     *         <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     *         >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS
     *         Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VisibilityTimeout</code> - Returns the visibility timeout
     *         for the queue. For more information about the visibility timeout,
     *         see <a href=
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
     *         <code>FifoQueue</code> - Returns whether the queue is FIFO. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     *         >FIFO Queue Logic</a> in the <i>Amazon SQS Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ContentBasedDeduplication</code> - Returns whether
     *         content-based deduplication is enabled for the queue. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *         >Exactly-Once Processing</a> in the <i>Amazon SQS Developer
     *         Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getAttributeNames() {
        return attributeNames;
    }

    /**
     * <p>
     * A list of attributes for which to retrieve information.
     * </p>
     * <note>
     * <p>
     * Going forward, new attributes might be added. If you are writing code
     * that calls this action, we recommend that you structure your code so that
     * it can handle new attributes gracefully.
     * </p>
     * </note>
     * <p>
     * The following attributes are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> - Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessages</code> - Returns the approximate number
     * of visible messages in a queue. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     * >Resources Required to Process Messages</a> in the <i>Amazon SQS
     * Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesDelayed</code> - Returns the approximate
     * number of messages that are waiting to be added to the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesNotVisible</code> - Returns the
     * approximate number of messages that have not timed-out and are not
     * deleted. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     * >Resources Required to Process Messages</a> in the <i>Amazon SQS
     * Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatedTimestamp</code> - Returns the time when the queue was
     * created in seconds (epoch time).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DelaySeconds</code> - Returns the default delay on the queue in
     * seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModifiedTimestamp</code> - Returns the time when the queue was
     * last changed in seconds (epoch time).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - Returns the limit of how many bytes a
     * message can contain before Amazon SQS rejects it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - Returns the number of seconds for
     * which Amazon SQS retains a message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> - Returns the policy of the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QueueArn</code> - Returns the Amazon resource name (ARN) of the
     * queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> - Returns the number of
     * seconds for which ReceiveMessage call will wait for a message to arrive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - Returns the parameters for dead letter queue
     * functionality of the source queue. For more information about the redrive
     * policy and dead letter queues, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - Returns the visibility timeout for the
     * queue. For more information about the visibility timeout, see <a href=
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
     * <code>FifoQueue</code> - Returns whether the queue is FIFO. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     * >FIFO Queue Logic</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> - Returns whether content-based
     * deduplication is enabled for the queue. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     *
     * @param attributeNames <p>
     *            A list of attributes for which to retrieve information.
     *            </p>
     *            <note>
     *            <p>
     *            Going forward, new attributes might be added. If you are
     *            writing code that calls this action, we recommend that you
     *            structure your code so that it can handle new attributes
     *            gracefully.
     *            </p>
     *            </note>
     *            <p>
     *            The following attributes are supported:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>All</code> - Returns all values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateNumberOfMessages</code> - Returns the
     *            approximate number of visible messages in a queue. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     *            >Resources Required to Process Messages</a> in the <i>Amazon
     *            SQS Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateNumberOfMessagesDelayed</code> - Returns the
     *            approximate number of messages that are waiting to be added to
     *            the queue.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateNumberOfMessagesNotVisible</code> - Returns
     *            the approximate number of messages that have not timed-out and
     *            are not deleted. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     *            >Resources Required to Process Messages</a> in the <i>Amazon
     *            SQS Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CreatedTimestamp</code> - Returns the time when the
     *            queue was created in seconds (epoch time).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DelaySeconds</code> - Returns the default delay on the
     *            queue in seconds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LastModifiedTimestamp</code> - Returns the time when the
     *            queue was last changed in seconds (epoch time).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MaximumMessageSize</code> - Returns the limit of how
     *            many bytes a message can contain before Amazon SQS rejects it.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MessageRetentionPeriod</code> - Returns the number of
     *            seconds for which Amazon SQS retains a message.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Policy</code> - Returns the policy of the queue.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QueueArn</code> - Returns the Amazon resource name (ARN)
     *            of the queue.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReceiveMessageWaitTimeSeconds</code> - Returns the
     *            number of seconds for which ReceiveMessage call will wait for
     *            a message to arrive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RedrivePolicy</code> - Returns the parameters for dead
     *            letter queue functionality of the source queue. For more
     *            information about the redrive policy and dead letter queues,
     *            see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     *            >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS
     *            Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VisibilityTimeout</code> - Returns the visibility
     *            timeout for the queue. For more information about the
     *            visibility timeout, see <a href=
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
     *            <code>FifoQueue</code> - Returns whether the queue is FIFO.
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     *            >FIFO Queue Logic</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ContentBasedDeduplication</code> - Returns whether
     *            content-based deduplication is enabled for the queue. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *            >Exactly-Once Processing</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setAttributeNames(java.util.Collection<String> attributeNames) {
        if (attributeNames == null) {
            this.attributeNames = null;
            return;
        }

        this.attributeNames = new java.util.ArrayList<String>(attributeNames);
    }

    /**
     * <p>
     * A list of attributes for which to retrieve information.
     * </p>
     * <note>
     * <p>
     * Going forward, new attributes might be added. If you are writing code
     * that calls this action, we recommend that you structure your code so that
     * it can handle new attributes gracefully.
     * </p>
     * </note>
     * <p>
     * The following attributes are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> - Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessages</code> - Returns the approximate number
     * of visible messages in a queue. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     * >Resources Required to Process Messages</a> in the <i>Amazon SQS
     * Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesDelayed</code> - Returns the approximate
     * number of messages that are waiting to be added to the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesNotVisible</code> - Returns the
     * approximate number of messages that have not timed-out and are not
     * deleted. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     * >Resources Required to Process Messages</a> in the <i>Amazon SQS
     * Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatedTimestamp</code> - Returns the time when the queue was
     * created in seconds (epoch time).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DelaySeconds</code> - Returns the default delay on the queue in
     * seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModifiedTimestamp</code> - Returns the time when the queue was
     * last changed in seconds (epoch time).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - Returns the limit of how many bytes a
     * message can contain before Amazon SQS rejects it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - Returns the number of seconds for
     * which Amazon SQS retains a message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> - Returns the policy of the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QueueArn</code> - Returns the Amazon resource name (ARN) of the
     * queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> - Returns the number of
     * seconds for which ReceiveMessage call will wait for a message to arrive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - Returns the parameters for dead letter queue
     * functionality of the source queue. For more information about the redrive
     * policy and dead letter queues, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - Returns the visibility timeout for the
     * queue. For more information about the visibility timeout, see <a href=
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
     * <code>FifoQueue</code> - Returns whether the queue is FIFO. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     * >FIFO Queue Logic</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> - Returns whether content-based
     * deduplication is enabled for the queue. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeNames <p>
     *            A list of attributes for which to retrieve information.
     *            </p>
     *            <note>
     *            <p>
     *            Going forward, new attributes might be added. If you are
     *            writing code that calls this action, we recommend that you
     *            structure your code so that it can handle new attributes
     *            gracefully.
     *            </p>
     *            </note>
     *            <p>
     *            The following attributes are supported:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>All</code> - Returns all values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateNumberOfMessages</code> - Returns the
     *            approximate number of visible messages in a queue. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     *            >Resources Required to Process Messages</a> in the <i>Amazon
     *            SQS Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateNumberOfMessagesDelayed</code> - Returns the
     *            approximate number of messages that are waiting to be added to
     *            the queue.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateNumberOfMessagesNotVisible</code> - Returns
     *            the approximate number of messages that have not timed-out and
     *            are not deleted. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     *            >Resources Required to Process Messages</a> in the <i>Amazon
     *            SQS Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CreatedTimestamp</code> - Returns the time when the
     *            queue was created in seconds (epoch time).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DelaySeconds</code> - Returns the default delay on the
     *            queue in seconds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LastModifiedTimestamp</code> - Returns the time when the
     *            queue was last changed in seconds (epoch time).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MaximumMessageSize</code> - Returns the limit of how
     *            many bytes a message can contain before Amazon SQS rejects it.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MessageRetentionPeriod</code> - Returns the number of
     *            seconds for which Amazon SQS retains a message.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Policy</code> - Returns the policy of the queue.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QueueArn</code> - Returns the Amazon resource name (ARN)
     *            of the queue.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReceiveMessageWaitTimeSeconds</code> - Returns the
     *            number of seconds for which ReceiveMessage call will wait for
     *            a message to arrive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RedrivePolicy</code> - Returns the parameters for dead
     *            letter queue functionality of the source queue. For more
     *            information about the redrive policy and dead letter queues,
     *            see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     *            >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS
     *            Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VisibilityTimeout</code> - Returns the visibility
     *            timeout for the queue. For more information about the
     *            visibility timeout, see <a href=
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
     *            <code>FifoQueue</code> - Returns whether the queue is FIFO.
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     *            >FIFO Queue Logic</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ContentBasedDeduplication</code> - Returns whether
     *            content-based deduplication is enabled for the queue. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *            >Exactly-Once Processing</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetQueueAttributesRequest withAttributeNames(String... attributeNames) {
        if (getAttributeNames() == null) {
            this.attributeNames = new java.util.ArrayList<String>(attributeNames.length);
        }
        for (String value : attributeNames) {
            this.attributeNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of attributes for which to retrieve information.
     * </p>
     * <note>
     * <p>
     * Going forward, new attributes might be added. If you are writing code
     * that calls this action, we recommend that you structure your code so that
     * it can handle new attributes gracefully.
     * </p>
     * </note>
     * <p>
     * The following attributes are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> - Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessages</code> - Returns the approximate number
     * of visible messages in a queue. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     * >Resources Required to Process Messages</a> in the <i>Amazon SQS
     * Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesDelayed</code> - Returns the approximate
     * number of messages that are waiting to be added to the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesNotVisible</code> - Returns the
     * approximate number of messages that have not timed-out and are not
     * deleted. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     * >Resources Required to Process Messages</a> in the <i>Amazon SQS
     * Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatedTimestamp</code> - Returns the time when the queue was
     * created in seconds (epoch time).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DelaySeconds</code> - Returns the default delay on the queue in
     * seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModifiedTimestamp</code> - Returns the time when the queue was
     * last changed in seconds (epoch time).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - Returns the limit of how many bytes a
     * message can contain before Amazon SQS rejects it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - Returns the number of seconds for
     * which Amazon SQS retains a message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> - Returns the policy of the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QueueArn</code> - Returns the Amazon resource name (ARN) of the
     * queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> - Returns the number of
     * seconds for which ReceiveMessage call will wait for a message to arrive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - Returns the parameters for dead letter queue
     * functionality of the source queue. For more information about the redrive
     * policy and dead letter queues, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - Returns the visibility timeout for the
     * queue. For more information about the visibility timeout, see <a href=
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
     * <code>FifoQueue</code> - Returns whether the queue is FIFO. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     * >FIFO Queue Logic</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> - Returns whether content-based
     * deduplication is enabled for the queue. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeNames <p>
     *            A list of attributes for which to retrieve information.
     *            </p>
     *            <note>
     *            <p>
     *            Going forward, new attributes might be added. If you are
     *            writing code that calls this action, we recommend that you
     *            structure your code so that it can handle new attributes
     *            gracefully.
     *            </p>
     *            </note>
     *            <p>
     *            The following attributes are supported:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>All</code> - Returns all values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateNumberOfMessages</code> - Returns the
     *            approximate number of visible messages in a queue. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     *            >Resources Required to Process Messages</a> in the <i>Amazon
     *            SQS Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateNumberOfMessagesDelayed</code> - Returns the
     *            approximate number of messages that are waiting to be added to
     *            the queue.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateNumberOfMessagesNotVisible</code> - Returns
     *            the approximate number of messages that have not timed-out and
     *            are not deleted. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     *            >Resources Required to Process Messages</a> in the <i>Amazon
     *            SQS Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CreatedTimestamp</code> - Returns the time when the
     *            queue was created in seconds (epoch time).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DelaySeconds</code> - Returns the default delay on the
     *            queue in seconds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LastModifiedTimestamp</code> - Returns the time when the
     *            queue was last changed in seconds (epoch time).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MaximumMessageSize</code> - Returns the limit of how
     *            many bytes a message can contain before Amazon SQS rejects it.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MessageRetentionPeriod</code> - Returns the number of
     *            seconds for which Amazon SQS retains a message.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Policy</code> - Returns the policy of the queue.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QueueArn</code> - Returns the Amazon resource name (ARN)
     *            of the queue.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReceiveMessageWaitTimeSeconds</code> - Returns the
     *            number of seconds for which ReceiveMessage call will wait for
     *            a message to arrive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RedrivePolicy</code> - Returns the parameters for dead
     *            letter queue functionality of the source queue. For more
     *            information about the redrive policy and dead letter queues,
     *            see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     *            >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS
     *            Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VisibilityTimeout</code> - Returns the visibility
     *            timeout for the queue. For more information about the
     *            visibility timeout, see <a href=
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
     *            <code>FifoQueue</code> - Returns whether the queue is FIFO.
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     *            >FIFO Queue Logic</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ContentBasedDeduplication</code> - Returns whether
     *            content-based deduplication is enabled for the queue. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *            >Exactly-Once Processing</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetQueueAttributesRequest withAttributeNames(java.util.Collection<String> attributeNames) {
        setAttributeNames(attributeNames);
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
        if (getAttributeNames() != null)
            sb.append("AttributeNames: " + getAttributeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeNames() == null) ? 0 : getAttributeNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueueAttributesRequest == false)
            return false;
        GetQueueAttributesRequest other = (GetQueueAttributesRequest) obj;

        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getAttributeNames() == null ^ this.getAttributeNames() == null)
            return false;
        if (other.getAttributeNames() != null
                && other.getAttributeNames().equals(this.getAttributeNames()) == false)
            return false;
        return true;
    }
}
