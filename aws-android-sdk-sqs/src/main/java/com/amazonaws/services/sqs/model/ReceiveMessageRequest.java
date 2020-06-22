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
 * Retrieves one or more messages (up to 10), from the specified queue. Using
 * the <code>WaitTimeSeconds</code> parameter enables long-poll support. For
 * more information, see <a href=
 * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-long-polling.html"
 * >Amazon SQS Long Polling</a> in the <i>Amazon Simple Queue Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * Short poll is the default behavior where a weighted random set of machines is
 * sampled on a <code>ReceiveMessage</code> call. Thus, only the messages on the
 * sampled machines are returned. If the number of messages in the queue is
 * small (fewer than 1,000), you most likely get fewer messages than you
 * requested per <code>ReceiveMessage</code> call. If the number of messages in
 * the queue is extremely small, you might not receive any messages in a
 * particular <code>ReceiveMessage</code> response. If this happens, repeat the
 * request.
 * </p>
 * <p>
 * For each message returned, the response includes the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The message body.
 * </p>
 * </li>
 * <li>
 * <p>
 * An MD5 digest of the message body. For information about MD5, see <a
 * href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>MessageId</code> you received when you sent the message to the
 * queue.
 * </p>
 * </li>
 * <li>
 * <p>
 * The receipt handle.
 * </p>
 * </li>
 * <li>
 * <p>
 * The message attributes.
 * </p>
 * </li>
 * <li>
 * <p>
 * An MD5 digest of the message attributes.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The receipt handle is the identifier you must provide when deleting the
 * message. For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-message-identifiers.html"
 * >Queue and Message Identifiers</a> in the <i>Amazon Simple Queue Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * You can provide the <code>VisibilityTimeout</code> parameter in your request.
 * The parameter is applied to the messages that Amazon SQS returns in the
 * response. If you don't include the parameter, the overall visibility timeout
 * for the queue is used for the returned messages. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
 * >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * A message that isn't deleted or a message whose visibility isn't extended
 * before the visibility timeout expires counts as a failed receive. Depending
 * on the configuration of the queue, the message might be sent to the
 * dead-letter queue.
 * </p>
 * <note>
 * <p>
 * In the future, new attributes might be added. If you write code that calls
 * this action, we recommend that you structure your code so that it can handle
 * new attributes gracefully.
 * </p>
 * </note>
 */
public class ReceiveMessageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The URL of the Amazon SQS queue from which messages are received.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     */
    private String queueUrl;

    /**
     * <p>
     * A list of attributes that need to be returned along with each message.
     * These attributes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> – Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> – Returns the time the
     * message was first received from the queue (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in
     * milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> – Returns the number of times a
     * message has been received across all queues but not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWSTraceHeader</code> – Returns the AWS X-Ray trace header string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an IAM user, returns the IAM user ID, for example
     * <code>ABCDEFGHI1JKLMNOPQ23R</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an IAM role, returns the IAM role ID, for example
     * <code>ABCDE1F2GH3I4JK5LMNOP:i-a123b456</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> – Returns the time the message was sent to the
     * queue (<a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in
     * milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageDeduplicationId</code> – Returns the value provided by the
     * producer that calls the <code> <a>SendMessage</a> </code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageGroupId</code> – Returns the value provided by the producer
     * that calls the <code> <a>SendMessage</a> </code> action. Messages with
     * the same <code>MessageGroupId</code> are returned in sequence.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SequenceNumber</code> – Returns the value provided by Amazon SQS.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> attributeNames;

    /**
     * <p>
     * The name of the message attribute, where <i>N</i> is the index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name can contain alphanumeric characters and the underscore (
     * <code>_</code>), hyphen (<code>-</code>), and period (<code>.</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name is case-sensitive and must be unique among all attribute names
     * for the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name must not start with AWS-reserved prefixes such as
     * <code>AWS.</code> or <code>Amazon.</code> (or any casing variants).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name must not start or end with a period (<code>.</code>), and it
     * should not have periods in succession (<code>..</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name can be up to 256 characters long.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using <code>ReceiveMessage</code>, you can send a list of attribute
     * names to receive, or you can return all of the attributes by specifying
     * <code>All</code> or <code>.*</code> in your request. You can also use all
     * message attributes starting with a prefix, for example <code>bar.*</code>
     * .
     * </p>
     */
    private java.util.List<String> messageAttributeNames;

    /**
     * <p>
     * The maximum number of messages to return. Amazon SQS never returns more
     * messages than this value (however, fewer messages might be returned).
     * Valid values: 1 to 10. Default: 1.
     * </p>
     */
    private Integer maxNumberOfMessages;

    /**
     * <p>
     * The duration (in seconds) that the received messages are hidden from
     * subsequent retrieve requests after being retrieved by a
     * <code>ReceiveMessage</code> request.
     * </p>
     */
    private Integer visibilityTimeout;

    /**
     * <p>
     * The duration (in seconds) for which the call waits for a message to
     * arrive in the queue before returning. If a message is available, the call
     * returns sooner than <code>WaitTimeSeconds</code>. If no messages are
     * available and the wait time expires, the call returns successfully with
     * an empty list of messages.
     * </p>
     * <important>
     * <p>
     * To avoid HTTP errors, ensure that the HTTP response timeout for
     * <code>ReceiveMessage</code> requests is longer than the
     * <code>WaitTimeSeconds</code> parameter. For example, with the Java SDK,
     * you can set HTTP transport settings using the <a href=
     * "https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/nio/netty/NettyNioAsyncHttpClient.html"
     * > NettyNioAsyncHttpClient</a> for asynchronous clients, or the <a href=
     * "https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.html"
     * > ApacheHttpClient</a> for synchronous clients.
     * </p>
     * </important>
     */
    private Integer waitTimeSeconds;

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The token used for deduplication of <code>ReceiveMessage</code> calls. If
     * a networking issue occurs after a <code>ReceiveMessage</code> action, and
     * instead of a response you receive a generic error, it is possible to
     * retry the same action with an identical
     * <code>ReceiveRequestAttemptId</code> to retrieve the same set of
     * messages, even if their visibility timeout has not yet expired.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can use <code>ReceiveRequestAttemptId</code> only for 5 minutes after
     * a <code>ReceiveMessage</code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you set <code>FifoQueue</code>, a caller of the
     * <code>ReceiveMessage</code> action can provide a
     * <code>ReceiveRequestAttemptId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a caller of the <code>ReceiveMessage</code> action doesn't provide a
     * <code>ReceiveRequestAttemptId</code>, Amazon SQS generates a
     * <code>ReceiveRequestAttemptId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * It is possible to retry the <code>ReceiveMessage</code> action with the
     * same <code>ReceiveRequestAttemptId</code> if none of the messages have
     * been modified (deleted or had their visibility changes).
     * </p>
     * </li>
     * <li>
     * <p>
     * During a visibility timeout, subsequent calls with the same
     * <code>ReceiveRequestAttemptId</code> return the same messages and receipt
     * handles. If a retry occurs within the deduplication interval, it resets
     * the visibility timeout. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * <important>
     * <p>
     * If a caller of the <code>ReceiveMessage</code> action still processes
     * messages when the visibility timeout expires and messages become visible,
     * another worker consuming from the same queue can receive the same
     * messages and therefore process duplicates. Also, if a consumer whose
     * message processing time is longer than the visibility timeout tries to
     * delete the processed messages, the action fails with an error.
     * </p>
     * <p>
     * To mitigate this effect, ensure that your application observes a safe
     * threshold before the visibility timeout expires and extend the visibility
     * timeout as necessary.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * While messages with a particular <code>MessageGroupId</code> are
     * invisible, no more messages belonging to the same
     * <code>MessageGroupId</code> are returned until the visibility timeout
     * expires. You can still receive messages with another
     * <code>MessageGroupId</code> as long as it is also visible.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a caller of <code>ReceiveMessage</code> can't track the
     * <code>ReceiveRequestAttemptId</code>, no retries work until the original
     * visibility timeout expires. As a result, delays might occur but the
     * messages in the queue remain in a strict order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The maximum length of <code>ReceiveRequestAttemptId</code> is 128
     * characters. <code>ReceiveRequestAttemptId</code> can contain alphanumeric
     * characters (<code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and
     * punctuation (<code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     * </p>
     * <p>
     * For best practices of using <code>ReceiveRequestAttemptId</code>, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-receiverequestattemptid-request-parameter.html"
     * >Using the ReceiveRequestAttemptId Request Parameter</a> in the <i>Amazon
     * Simple Queue Service Developer Guide</i>.
     * </p>
     */
    private String receiveRequestAttemptId;

    /**
     * <p>
     * The URL of the Amazon SQS queue from which messages are received.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     *
     * @return <p>
     *         The URL of the Amazon SQS queue from which messages are received.
     *         </p>
     *         <p>
     *         Queue URLs and names are case-sensitive.
     *         </p>
     */
    public String getQueueUrl() {
        return queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue from which messages are received.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     *
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue from which messages are
     *            received.
     *            </p>
     *            <p>
     *            Queue URLs and names are case-sensitive.
     *            </p>
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue from which messages are received.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue from which messages are
     *            received.
     *            </p>
     *            <p>
     *            Queue URLs and names are case-sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReceiveMessageRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * <p>
     * A list of attributes that need to be returned along with each message.
     * These attributes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> – Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> – Returns the time the
     * message was first received from the queue (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in
     * milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> – Returns the number of times a
     * message has been received across all queues but not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWSTraceHeader</code> – Returns the AWS X-Ray trace header string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an IAM user, returns the IAM user ID, for example
     * <code>ABCDEFGHI1JKLMNOPQ23R</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an IAM role, returns the IAM role ID, for example
     * <code>ABCDE1F2GH3I4JK5LMNOP:i-a123b456</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> – Returns the time the message was sent to the
     * queue (<a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in
     * milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageDeduplicationId</code> – Returns the value provided by the
     * producer that calls the <code> <a>SendMessage</a> </code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageGroupId</code> – Returns the value provided by the producer
     * that calls the <code> <a>SendMessage</a> </code> action. Messages with
     * the same <code>MessageGroupId</code> are returned in sequence.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SequenceNumber</code> – Returns the value provided by Amazon SQS.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A list of attributes that need to be returned along with each
     *         message. These attributes include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>All</code> – Returns all values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ApproximateFirstReceiveTimestamp</code> – Returns the time
     *         the message was first received from the queue (<a
     *         href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in
     *         milliseconds).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ApproximateReceiveCount</code> – Returns the number of
     *         times a message has been received across all queues but not
     *         deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWSTraceHeader</code> – Returns the AWS X-Ray trace header
     *         string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SenderId</code>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For an IAM user, returns the IAM user ID, for example
     *         <code>ABCDEFGHI1JKLMNOPQ23R</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For an IAM role, returns the IAM role ID, for example
     *         <code>ABCDE1F2GH3I4JK5LMNOP:i-a123b456</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SentTimestamp</code> – Returns the time the message was
     *         sent to the queue (<a
     *         href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in
     *         milliseconds).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MessageDeduplicationId</code> – Returns the value provided
     *         by the producer that calls the <code> <a>SendMessage</a> </code>
     *         action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MessageGroupId</code> – Returns the value provided by the
     *         producer that calls the <code> <a>SendMessage</a> </code> action.
     *         Messages with the same <code>MessageGroupId</code> are returned
     *         in sequence.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SequenceNumber</code> – Returns the value provided by
     *         Amazon SQS.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getAttributeNames() {
        return attributeNames;
    }

    /**
     * <p>
     * A list of attributes that need to be returned along with each message.
     * These attributes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> – Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> – Returns the time the
     * message was first received from the queue (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in
     * milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> – Returns the number of times a
     * message has been received across all queues but not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWSTraceHeader</code> – Returns the AWS X-Ray trace header string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an IAM user, returns the IAM user ID, for example
     * <code>ABCDEFGHI1JKLMNOPQ23R</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an IAM role, returns the IAM role ID, for example
     * <code>ABCDE1F2GH3I4JK5LMNOP:i-a123b456</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> – Returns the time the message was sent to the
     * queue (<a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in
     * milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageDeduplicationId</code> – Returns the value provided by the
     * producer that calls the <code> <a>SendMessage</a> </code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageGroupId</code> – Returns the value provided by the producer
     * that calls the <code> <a>SendMessage</a> </code> action. Messages with
     * the same <code>MessageGroupId</code> are returned in sequence.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SequenceNumber</code> – Returns the value provided by Amazon SQS.
     * </p>
     * </li>
     * </ul>
     *
     * @param attributeNames <p>
     *            A list of attributes that need to be returned along with each
     *            message. These attributes include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>All</code> – Returns all values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateFirstReceiveTimestamp</code> – Returns the
     *            time the message was first received from the queue (<a
     *            href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>
     *            in milliseconds).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateReceiveCount</code> – Returns the number of
     *            times a message has been received across all queues but not
     *            deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AWSTraceHeader</code> – Returns the AWS X-Ray trace
     *            header string.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SenderId</code>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For an IAM user, returns the IAM user ID, for example
     *            <code>ABCDEFGHI1JKLMNOPQ23R</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For an IAM role, returns the IAM role ID, for example
     *            <code>ABCDE1F2GH3I4JK5LMNOP:i-a123b456</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SentTimestamp</code> – Returns the time the message was
     *            sent to the queue (<a
     *            href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>
     *            in milliseconds).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MessageDeduplicationId</code> – Returns the value
     *            provided by the producer that calls the
     *            <code> <a>SendMessage</a> </code> action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MessageGroupId</code> – Returns the value provided by
     *            the producer that calls the <code> <a>SendMessage</a> </code>
     *            action. Messages with the same <code>MessageGroupId</code> are
     *            returned in sequence.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SequenceNumber</code> – Returns the value provided by
     *            Amazon SQS.
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
     * A list of attributes that need to be returned along with each message.
     * These attributes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> – Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> – Returns the time the
     * message was first received from the queue (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in
     * milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> – Returns the number of times a
     * message has been received across all queues but not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWSTraceHeader</code> – Returns the AWS X-Ray trace header string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an IAM user, returns the IAM user ID, for example
     * <code>ABCDEFGHI1JKLMNOPQ23R</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an IAM role, returns the IAM role ID, for example
     * <code>ABCDE1F2GH3I4JK5LMNOP:i-a123b456</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> – Returns the time the message was sent to the
     * queue (<a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in
     * milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageDeduplicationId</code> – Returns the value provided by the
     * producer that calls the <code> <a>SendMessage</a> </code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageGroupId</code> – Returns the value provided by the producer
     * that calls the <code> <a>SendMessage</a> </code> action. Messages with
     * the same <code>MessageGroupId</code> are returned in sequence.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SequenceNumber</code> – Returns the value provided by Amazon SQS.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeNames <p>
     *            A list of attributes that need to be returned along with each
     *            message. These attributes include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>All</code> – Returns all values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateFirstReceiveTimestamp</code> – Returns the
     *            time the message was first received from the queue (<a
     *            href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>
     *            in milliseconds).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateReceiveCount</code> – Returns the number of
     *            times a message has been received across all queues but not
     *            deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AWSTraceHeader</code> – Returns the AWS X-Ray trace
     *            header string.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SenderId</code>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For an IAM user, returns the IAM user ID, for example
     *            <code>ABCDEFGHI1JKLMNOPQ23R</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For an IAM role, returns the IAM role ID, for example
     *            <code>ABCDE1F2GH3I4JK5LMNOP:i-a123b456</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SentTimestamp</code> – Returns the time the message was
     *            sent to the queue (<a
     *            href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>
     *            in milliseconds).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MessageDeduplicationId</code> – Returns the value
     *            provided by the producer that calls the
     *            <code> <a>SendMessage</a> </code> action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MessageGroupId</code> – Returns the value provided by
     *            the producer that calls the <code> <a>SendMessage</a> </code>
     *            action. Messages with the same <code>MessageGroupId</code> are
     *            returned in sequence.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SequenceNumber</code> – Returns the value provided by
     *            Amazon SQS.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReceiveMessageRequest withAttributeNames(String... attributeNames) {
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
     * A list of attributes that need to be returned along with each message.
     * These attributes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> – Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> – Returns the time the
     * message was first received from the queue (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in
     * milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> – Returns the number of times a
     * message has been received across all queues but not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWSTraceHeader</code> – Returns the AWS X-Ray trace header string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an IAM user, returns the IAM user ID, for example
     * <code>ABCDEFGHI1JKLMNOPQ23R</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an IAM role, returns the IAM role ID, for example
     * <code>ABCDE1F2GH3I4JK5LMNOP:i-a123b456</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> – Returns the time the message was sent to the
     * queue (<a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in
     * milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageDeduplicationId</code> – Returns the value provided by the
     * producer that calls the <code> <a>SendMessage</a> </code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageGroupId</code> – Returns the value provided by the producer
     * that calls the <code> <a>SendMessage</a> </code> action. Messages with
     * the same <code>MessageGroupId</code> are returned in sequence.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SequenceNumber</code> – Returns the value provided by Amazon SQS.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeNames <p>
     *            A list of attributes that need to be returned along with each
     *            message. These attributes include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>All</code> – Returns all values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateFirstReceiveTimestamp</code> – Returns the
     *            time the message was first received from the queue (<a
     *            href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>
     *            in milliseconds).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateReceiveCount</code> – Returns the number of
     *            times a message has been received across all queues but not
     *            deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AWSTraceHeader</code> – Returns the AWS X-Ray trace
     *            header string.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SenderId</code>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For an IAM user, returns the IAM user ID, for example
     *            <code>ABCDEFGHI1JKLMNOPQ23R</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For an IAM role, returns the IAM role ID, for example
     *            <code>ABCDE1F2GH3I4JK5LMNOP:i-a123b456</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SentTimestamp</code> – Returns the time the message was
     *            sent to the queue (<a
     *            href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>
     *            in milliseconds).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MessageDeduplicationId</code> – Returns the value
     *            provided by the producer that calls the
     *            <code> <a>SendMessage</a> </code> action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MessageGroupId</code> – Returns the value provided by
     *            the producer that calls the <code> <a>SendMessage</a> </code>
     *            action. Messages with the same <code>MessageGroupId</code> are
     *            returned in sequence.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SequenceNumber</code> – Returns the value provided by
     *            Amazon SQS.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReceiveMessageRequest withAttributeNames(java.util.Collection<String> attributeNames) {
        setAttributeNames(attributeNames);
        return this;
    }

    /**
     * <p>
     * The name of the message attribute, where <i>N</i> is the index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name can contain alphanumeric characters and the underscore (
     * <code>_</code>), hyphen (<code>-</code>), and period (<code>.</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name is case-sensitive and must be unique among all attribute names
     * for the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name must not start with AWS-reserved prefixes such as
     * <code>AWS.</code> or <code>Amazon.</code> (or any casing variants).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name must not start or end with a period (<code>.</code>), and it
     * should not have periods in succession (<code>..</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name can be up to 256 characters long.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using <code>ReceiveMessage</code>, you can send a list of attribute
     * names to receive, or you can return all of the attributes by specifying
     * <code>All</code> or <code>.*</code> in your request. You can also use all
     * message attributes starting with a prefix, for example <code>bar.*</code>
     * .
     * </p>
     *
     * @return <p>
     *         The name of the message attribute, where <i>N</i> is the index.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The name can contain alphanumeric characters and the underscore (
     *         <code>_</code>), hyphen (<code>-</code>), and period (
     *         <code>.</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The name is case-sensitive and must be unique among all attribute
     *         names for the message.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The name must not start with AWS-reserved prefixes such as
     *         <code>AWS.</code> or <code>Amazon.</code> (or any casing
     *         variants).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The name must not start or end with a period (<code>.</code>),
     *         and it should not have periods in succession (<code>..</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The name can be up to 256 characters long.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When using <code>ReceiveMessage</code>, you can send a list of
     *         attribute names to receive, or you can return all of the
     *         attributes by specifying <code>All</code> or <code>.*</code> in
     *         your request. You can also use all message attributes starting
     *         with a prefix, for example <code>bar.*</code>.
     *         </p>
     */
    public java.util.List<String> getMessageAttributeNames() {
        return messageAttributeNames;
    }

    /**
     * <p>
     * The name of the message attribute, where <i>N</i> is the index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name can contain alphanumeric characters and the underscore (
     * <code>_</code>), hyphen (<code>-</code>), and period (<code>.</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name is case-sensitive and must be unique among all attribute names
     * for the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name must not start with AWS-reserved prefixes such as
     * <code>AWS.</code> or <code>Amazon.</code> (or any casing variants).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name must not start or end with a period (<code>.</code>), and it
     * should not have periods in succession (<code>..</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name can be up to 256 characters long.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using <code>ReceiveMessage</code>, you can send a list of attribute
     * names to receive, or you can return all of the attributes by specifying
     * <code>All</code> or <code>.*</code> in your request. You can also use all
     * message attributes starting with a prefix, for example <code>bar.*</code>
     * .
     * </p>
     *
     * @param messageAttributeNames <p>
     *            The name of the message attribute, where <i>N</i> is the
     *            index.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The name can contain alphanumeric characters and the
     *            underscore (<code>_</code>), hyphen (<code>-</code>), and
     *            period (<code>.</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The name is case-sensitive and must be unique among all
     *            attribute names for the message.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The name must not start with AWS-reserved prefixes such as
     *            <code>AWS.</code> or <code>Amazon.</code> (or any casing
     *            variants).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The name must not start or end with a period (<code>.</code>),
     *            and it should not have periods in succession (<code>..</code>
     *            ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The name can be up to 256 characters long.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When using <code>ReceiveMessage</code>, you can send a list of
     *            attribute names to receive, or you can return all of the
     *            attributes by specifying <code>All</code> or <code>.*</code>
     *            in your request. You can also use all message attributes
     *            starting with a prefix, for example <code>bar.*</code>.
     *            </p>
     */
    public void setMessageAttributeNames(java.util.Collection<String> messageAttributeNames) {
        if (messageAttributeNames == null) {
            this.messageAttributeNames = null;
            return;
        }

        this.messageAttributeNames = new java.util.ArrayList<String>(messageAttributeNames);
    }

    /**
     * <p>
     * The name of the message attribute, where <i>N</i> is the index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name can contain alphanumeric characters and the underscore (
     * <code>_</code>), hyphen (<code>-</code>), and period (<code>.</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name is case-sensitive and must be unique among all attribute names
     * for the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name must not start with AWS-reserved prefixes such as
     * <code>AWS.</code> or <code>Amazon.</code> (or any casing variants).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name must not start or end with a period (<code>.</code>), and it
     * should not have periods in succession (<code>..</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name can be up to 256 characters long.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using <code>ReceiveMessage</code>, you can send a list of attribute
     * names to receive, or you can return all of the attributes by specifying
     * <code>All</code> or <code>.*</code> in your request. You can also use all
     * message attributes starting with a prefix, for example <code>bar.*</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageAttributeNames <p>
     *            The name of the message attribute, where <i>N</i> is the
     *            index.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The name can contain alphanumeric characters and the
     *            underscore (<code>_</code>), hyphen (<code>-</code>), and
     *            period (<code>.</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The name is case-sensitive and must be unique among all
     *            attribute names for the message.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The name must not start with AWS-reserved prefixes such as
     *            <code>AWS.</code> or <code>Amazon.</code> (or any casing
     *            variants).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The name must not start or end with a period (<code>.</code>),
     *            and it should not have periods in succession (<code>..</code>
     *            ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The name can be up to 256 characters long.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When using <code>ReceiveMessage</code>, you can send a list of
     *            attribute names to receive, or you can return all of the
     *            attributes by specifying <code>All</code> or <code>.*</code>
     *            in your request. You can also use all message attributes
     *            starting with a prefix, for example <code>bar.*</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReceiveMessageRequest withMessageAttributeNames(String... messageAttributeNames) {
        if (getMessageAttributeNames() == null) {
            this.messageAttributeNames = new java.util.ArrayList<String>(
                    messageAttributeNames.length);
        }
        for (String value : messageAttributeNames) {
            this.messageAttributeNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The name of the message attribute, where <i>N</i> is the index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name can contain alphanumeric characters and the underscore (
     * <code>_</code>), hyphen (<code>-</code>), and period (<code>.</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name is case-sensitive and must be unique among all attribute names
     * for the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name must not start with AWS-reserved prefixes such as
     * <code>AWS.</code> or <code>Amazon.</code> (or any casing variants).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name must not start or end with a period (<code>.</code>), and it
     * should not have periods in succession (<code>..</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name can be up to 256 characters long.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using <code>ReceiveMessage</code>, you can send a list of attribute
     * names to receive, or you can return all of the attributes by specifying
     * <code>All</code> or <code>.*</code> in your request. You can also use all
     * message attributes starting with a prefix, for example <code>bar.*</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageAttributeNames <p>
     *            The name of the message attribute, where <i>N</i> is the
     *            index.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The name can contain alphanumeric characters and the
     *            underscore (<code>_</code>), hyphen (<code>-</code>), and
     *            period (<code>.</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The name is case-sensitive and must be unique among all
     *            attribute names for the message.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The name must not start with AWS-reserved prefixes such as
     *            <code>AWS.</code> or <code>Amazon.</code> (or any casing
     *            variants).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The name must not start or end with a period (<code>.</code>),
     *            and it should not have periods in succession (<code>..</code>
     *            ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The name can be up to 256 characters long.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When using <code>ReceiveMessage</code>, you can send a list of
     *            attribute names to receive, or you can return all of the
     *            attributes by specifying <code>All</code> or <code>.*</code>
     *            in your request. You can also use all message attributes
     *            starting with a prefix, for example <code>bar.*</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReceiveMessageRequest withMessageAttributeNames(
            java.util.Collection<String> messageAttributeNames) {
        setMessageAttributeNames(messageAttributeNames);
        return this;
    }

    /**
     * <p>
     * The maximum number of messages to return. Amazon SQS never returns more
     * messages than this value (however, fewer messages might be returned).
     * Valid values: 1 to 10. Default: 1.
     * </p>
     *
     * @return <p>
     *         The maximum number of messages to return. Amazon SQS never
     *         returns more messages than this value (however, fewer messages
     *         might be returned). Valid values: 1 to 10. Default: 1.
     *         </p>
     */
    public Integer getMaxNumberOfMessages() {
        return maxNumberOfMessages;
    }

    /**
     * <p>
     * The maximum number of messages to return. Amazon SQS never returns more
     * messages than this value (however, fewer messages might be returned).
     * Valid values: 1 to 10. Default: 1.
     * </p>
     *
     * @param maxNumberOfMessages <p>
     *            The maximum number of messages to return. Amazon SQS never
     *            returns more messages than this value (however, fewer messages
     *            might be returned). Valid values: 1 to 10. Default: 1.
     *            </p>
     */
    public void setMaxNumberOfMessages(Integer maxNumberOfMessages) {
        this.maxNumberOfMessages = maxNumberOfMessages;
    }

    /**
     * <p>
     * The maximum number of messages to return. Amazon SQS never returns more
     * messages than this value (however, fewer messages might be returned).
     * Valid values: 1 to 10. Default: 1.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxNumberOfMessages <p>
     *            The maximum number of messages to return. Amazon SQS never
     *            returns more messages than this value (however, fewer messages
     *            might be returned). Valid values: 1 to 10. Default: 1.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReceiveMessageRequest withMaxNumberOfMessages(Integer maxNumberOfMessages) {
        this.maxNumberOfMessages = maxNumberOfMessages;
        return this;
    }

    /**
     * <p>
     * The duration (in seconds) that the received messages are hidden from
     * subsequent retrieve requests after being retrieved by a
     * <code>ReceiveMessage</code> request.
     * </p>
     *
     * @return <p>
     *         The duration (in seconds) that the received messages are hidden
     *         from subsequent retrieve requests after being retrieved by a
     *         <code>ReceiveMessage</code> request.
     *         </p>
     */
    public Integer getVisibilityTimeout() {
        return visibilityTimeout;
    }

    /**
     * <p>
     * The duration (in seconds) that the received messages are hidden from
     * subsequent retrieve requests after being retrieved by a
     * <code>ReceiveMessage</code> request.
     * </p>
     *
     * @param visibilityTimeout <p>
     *            The duration (in seconds) that the received messages are
     *            hidden from subsequent retrieve requests after being retrieved
     *            by a <code>ReceiveMessage</code> request.
     *            </p>
     */
    public void setVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
    }

    /**
     * <p>
     * The duration (in seconds) that the received messages are hidden from
     * subsequent retrieve requests after being retrieved by a
     * <code>ReceiveMessage</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param visibilityTimeout <p>
     *            The duration (in seconds) that the received messages are
     *            hidden from subsequent retrieve requests after being retrieved
     *            by a <code>ReceiveMessage</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReceiveMessageRequest withVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
        return this;
    }

    /**
     * <p>
     * The duration (in seconds) for which the call waits for a message to
     * arrive in the queue before returning. If a message is available, the call
     * returns sooner than <code>WaitTimeSeconds</code>. If no messages are
     * available and the wait time expires, the call returns successfully with
     * an empty list of messages.
     * </p>
     * <important>
     * <p>
     * To avoid HTTP errors, ensure that the HTTP response timeout for
     * <code>ReceiveMessage</code> requests is longer than the
     * <code>WaitTimeSeconds</code> parameter. For example, with the Java SDK,
     * you can set HTTP transport settings using the <a href=
     * "https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/nio/netty/NettyNioAsyncHttpClient.html"
     * > NettyNioAsyncHttpClient</a> for asynchronous clients, or the <a href=
     * "https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.html"
     * > ApacheHttpClient</a> for synchronous clients.
     * </p>
     * </important>
     *
     * @return <p>
     *         The duration (in seconds) for which the call waits for a message
     *         to arrive in the queue before returning. If a message is
     *         available, the call returns sooner than
     *         <code>WaitTimeSeconds</code>. If no messages are available and
     *         the wait time expires, the call returns successfully with an
     *         empty list of messages.
     *         </p>
     *         <important>
     *         <p>
     *         To avoid HTTP errors, ensure that the HTTP response timeout for
     *         <code>ReceiveMessage</code> requests is longer than the
     *         <code>WaitTimeSeconds</code> parameter. For example, with the
     *         Java SDK, you can set HTTP transport settings using the <a href=
     *         "https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/nio/netty/NettyNioAsyncHttpClient.html"
     *         > NettyNioAsyncHttpClient</a> for asynchronous clients, or the <a
     *         href=
     *         "https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.html"
     *         > ApacheHttpClient</a> for synchronous clients.
     *         </p>
     *         </important>
     */
    public Integer getWaitTimeSeconds() {
        return waitTimeSeconds;
    }

    /**
     * <p>
     * The duration (in seconds) for which the call waits for a message to
     * arrive in the queue before returning. If a message is available, the call
     * returns sooner than <code>WaitTimeSeconds</code>. If no messages are
     * available and the wait time expires, the call returns successfully with
     * an empty list of messages.
     * </p>
     * <important>
     * <p>
     * To avoid HTTP errors, ensure that the HTTP response timeout for
     * <code>ReceiveMessage</code> requests is longer than the
     * <code>WaitTimeSeconds</code> parameter. For example, with the Java SDK,
     * you can set HTTP transport settings using the <a href=
     * "https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/nio/netty/NettyNioAsyncHttpClient.html"
     * > NettyNioAsyncHttpClient</a> for asynchronous clients, or the <a href=
     * "https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.html"
     * > ApacheHttpClient</a> for synchronous clients.
     * </p>
     * </important>
     *
     * @param waitTimeSeconds <p>
     *            The duration (in seconds) for which the call waits for a
     *            message to arrive in the queue before returning. If a message
     *            is available, the call returns sooner than
     *            <code>WaitTimeSeconds</code>. If no messages are available and
     *            the wait time expires, the call returns successfully with an
     *            empty list of messages.
     *            </p>
     *            <important>
     *            <p>
     *            To avoid HTTP errors, ensure that the HTTP response timeout
     *            for <code>ReceiveMessage</code> requests is longer than the
     *            <code>WaitTimeSeconds</code> parameter. For example, with the
     *            Java SDK, you can set HTTP transport settings using the <a
     *            href=
     *            "https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/nio/netty/NettyNioAsyncHttpClient.html"
     *            > NettyNioAsyncHttpClient</a> for asynchronous clients, or the
     *            <a href=
     *            "https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.html"
     *            > ApacheHttpClient</a> for synchronous clients.
     *            </p>
     *            </important>
     */
    public void setWaitTimeSeconds(Integer waitTimeSeconds) {
        this.waitTimeSeconds = waitTimeSeconds;
    }

    /**
     * <p>
     * The duration (in seconds) for which the call waits for a message to
     * arrive in the queue before returning. If a message is available, the call
     * returns sooner than <code>WaitTimeSeconds</code>. If no messages are
     * available and the wait time expires, the call returns successfully with
     * an empty list of messages.
     * </p>
     * <important>
     * <p>
     * To avoid HTTP errors, ensure that the HTTP response timeout for
     * <code>ReceiveMessage</code> requests is longer than the
     * <code>WaitTimeSeconds</code> parameter. For example, with the Java SDK,
     * you can set HTTP transport settings using the <a href=
     * "https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/nio/netty/NettyNioAsyncHttpClient.html"
     * > NettyNioAsyncHttpClient</a> for asynchronous clients, or the <a href=
     * "https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.html"
     * > ApacheHttpClient</a> for synchronous clients.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param waitTimeSeconds <p>
     *            The duration (in seconds) for which the call waits for a
     *            message to arrive in the queue before returning. If a message
     *            is available, the call returns sooner than
     *            <code>WaitTimeSeconds</code>. If no messages are available and
     *            the wait time expires, the call returns successfully with an
     *            empty list of messages.
     *            </p>
     *            <important>
     *            <p>
     *            To avoid HTTP errors, ensure that the HTTP response timeout
     *            for <code>ReceiveMessage</code> requests is longer than the
     *            <code>WaitTimeSeconds</code> parameter. For example, with the
     *            Java SDK, you can set HTTP transport settings using the <a
     *            href=
     *            "https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/nio/netty/NettyNioAsyncHttpClient.html"
     *            > NettyNioAsyncHttpClient</a> for asynchronous clients, or the
     *            <a href=
     *            "https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.html"
     *            > ApacheHttpClient</a> for synchronous clients.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReceiveMessageRequest withWaitTimeSeconds(Integer waitTimeSeconds) {
        this.waitTimeSeconds = waitTimeSeconds;
        return this;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The token used for deduplication of <code>ReceiveMessage</code> calls. If
     * a networking issue occurs after a <code>ReceiveMessage</code> action, and
     * instead of a response you receive a generic error, it is possible to
     * retry the same action with an identical
     * <code>ReceiveRequestAttemptId</code> to retrieve the same set of
     * messages, even if their visibility timeout has not yet expired.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can use <code>ReceiveRequestAttemptId</code> only for 5 minutes after
     * a <code>ReceiveMessage</code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you set <code>FifoQueue</code>, a caller of the
     * <code>ReceiveMessage</code> action can provide a
     * <code>ReceiveRequestAttemptId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a caller of the <code>ReceiveMessage</code> action doesn't provide a
     * <code>ReceiveRequestAttemptId</code>, Amazon SQS generates a
     * <code>ReceiveRequestAttemptId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * It is possible to retry the <code>ReceiveMessage</code> action with the
     * same <code>ReceiveRequestAttemptId</code> if none of the messages have
     * been modified (deleted or had their visibility changes).
     * </p>
     * </li>
     * <li>
     * <p>
     * During a visibility timeout, subsequent calls with the same
     * <code>ReceiveRequestAttemptId</code> return the same messages and receipt
     * handles. If a retry occurs within the deduplication interval, it resets
     * the visibility timeout. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * <important>
     * <p>
     * If a caller of the <code>ReceiveMessage</code> action still processes
     * messages when the visibility timeout expires and messages become visible,
     * another worker consuming from the same queue can receive the same
     * messages and therefore process duplicates. Also, if a consumer whose
     * message processing time is longer than the visibility timeout tries to
     * delete the processed messages, the action fails with an error.
     * </p>
     * <p>
     * To mitigate this effect, ensure that your application observes a safe
     * threshold before the visibility timeout expires and extend the visibility
     * timeout as necessary.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * While messages with a particular <code>MessageGroupId</code> are
     * invisible, no more messages belonging to the same
     * <code>MessageGroupId</code> are returned until the visibility timeout
     * expires. You can still receive messages with another
     * <code>MessageGroupId</code> as long as it is also visible.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a caller of <code>ReceiveMessage</code> can't track the
     * <code>ReceiveRequestAttemptId</code>, no retries work until the original
     * visibility timeout expires. As a result, delays might occur but the
     * messages in the queue remain in a strict order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The maximum length of <code>ReceiveRequestAttemptId</code> is 128
     * characters. <code>ReceiveRequestAttemptId</code> can contain alphanumeric
     * characters (<code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and
     * punctuation (<code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     * </p>
     * <p>
     * For best practices of using <code>ReceiveRequestAttemptId</code>, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-receiverequestattemptid-request-parameter.html"
     * >Using the ReceiveRequestAttemptId Request Parameter</a> in the <i>Amazon
     * Simple Queue Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         This parameter applies only to FIFO (first-in-first-out) queues.
     *         </p>
     *         <p>
     *         The token used for deduplication of <code>ReceiveMessage</code>
     *         calls. If a networking issue occurs after a
     *         <code>ReceiveMessage</code> action, and instead of a response you
     *         receive a generic error, it is possible to retry the same action
     *         with an identical <code>ReceiveRequestAttemptId</code> to
     *         retrieve the same set of messages, even if their visibility
     *         timeout has not yet expired.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You can use <code>ReceiveRequestAttemptId</code> only for 5
     *         minutes after a <code>ReceiveMessage</code> action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When you set <code>FifoQueue</code>, a caller of the
     *         <code>ReceiveMessage</code> action can provide a
     *         <code>ReceiveRequestAttemptId</code> explicitly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a caller of the <code>ReceiveMessage</code> action doesn't
     *         provide a <code>ReceiveRequestAttemptId</code>, Amazon SQS
     *         generates a <code>ReceiveRequestAttemptId</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         It is possible to retry the <code>ReceiveMessage</code> action
     *         with the same <code>ReceiveRequestAttemptId</code> if none of the
     *         messages have been modified (deleted or had their visibility
     *         changes).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         During a visibility timeout, subsequent calls with the same
     *         <code>ReceiveRequestAttemptId</code> return the same messages and
     *         receipt handles. If a retry occurs within the deduplication
     *         interval, it resets the visibility timeout. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *         >Visibility Timeout</a> in the <i>Amazon Simple Queue Service
     *         Developer Guide</i>.
     *         </p>
     *         <important>
     *         <p>
     *         If a caller of the <code>ReceiveMessage</code> action still
     *         processes messages when the visibility timeout expires and
     *         messages become visible, another worker consuming from the same
     *         queue can receive the same messages and therefore process
     *         duplicates. Also, if a consumer whose message processing time is
     *         longer than the visibility timeout tries to delete the processed
     *         messages, the action fails with an error.
     *         </p>
     *         <p>
     *         To mitigate this effect, ensure that your application observes a
     *         safe threshold before the visibility timeout expires and extend
     *         the visibility timeout as necessary.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         While messages with a particular <code>MessageGroupId</code> are
     *         invisible, no more messages belonging to the same
     *         <code>MessageGroupId</code> are returned until the visibility
     *         timeout expires. You can still receive messages with another
     *         <code>MessageGroupId</code> as long as it is also visible.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a caller of <code>ReceiveMessage</code> can't track the
     *         <code>ReceiveRequestAttemptId</code>, no retries work until the
     *         original visibility timeout expires. As a result, delays might
     *         occur but the messages in the queue remain in a strict order.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The maximum length of <code>ReceiveRequestAttemptId</code> is 128
     *         characters. <code>ReceiveRequestAttemptId</code> can contain
     *         alphanumeric characters (<code>a-z</code>, <code>A-Z</code>,
     *         <code>0-9</code>) and punctuation (
     *         <code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     *         </p>
     *         <p>
     *         For best practices of using <code>ReceiveRequestAttemptId</code>,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-receiverequestattemptid-request-parameter.html"
     *         >Using the ReceiveRequestAttemptId Request Parameter</a> in the
     *         <i>Amazon Simple Queue Service Developer Guide</i>.
     *         </p>
     */
    public String getReceiveRequestAttemptId() {
        return receiveRequestAttemptId;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The token used for deduplication of <code>ReceiveMessage</code> calls. If
     * a networking issue occurs after a <code>ReceiveMessage</code> action, and
     * instead of a response you receive a generic error, it is possible to
     * retry the same action with an identical
     * <code>ReceiveRequestAttemptId</code> to retrieve the same set of
     * messages, even if their visibility timeout has not yet expired.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can use <code>ReceiveRequestAttemptId</code> only for 5 minutes after
     * a <code>ReceiveMessage</code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you set <code>FifoQueue</code>, a caller of the
     * <code>ReceiveMessage</code> action can provide a
     * <code>ReceiveRequestAttemptId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a caller of the <code>ReceiveMessage</code> action doesn't provide a
     * <code>ReceiveRequestAttemptId</code>, Amazon SQS generates a
     * <code>ReceiveRequestAttemptId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * It is possible to retry the <code>ReceiveMessage</code> action with the
     * same <code>ReceiveRequestAttemptId</code> if none of the messages have
     * been modified (deleted or had their visibility changes).
     * </p>
     * </li>
     * <li>
     * <p>
     * During a visibility timeout, subsequent calls with the same
     * <code>ReceiveRequestAttemptId</code> return the same messages and receipt
     * handles. If a retry occurs within the deduplication interval, it resets
     * the visibility timeout. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * <important>
     * <p>
     * If a caller of the <code>ReceiveMessage</code> action still processes
     * messages when the visibility timeout expires and messages become visible,
     * another worker consuming from the same queue can receive the same
     * messages and therefore process duplicates. Also, if a consumer whose
     * message processing time is longer than the visibility timeout tries to
     * delete the processed messages, the action fails with an error.
     * </p>
     * <p>
     * To mitigate this effect, ensure that your application observes a safe
     * threshold before the visibility timeout expires and extend the visibility
     * timeout as necessary.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * While messages with a particular <code>MessageGroupId</code> are
     * invisible, no more messages belonging to the same
     * <code>MessageGroupId</code> are returned until the visibility timeout
     * expires. You can still receive messages with another
     * <code>MessageGroupId</code> as long as it is also visible.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a caller of <code>ReceiveMessage</code> can't track the
     * <code>ReceiveRequestAttemptId</code>, no retries work until the original
     * visibility timeout expires. As a result, delays might occur but the
     * messages in the queue remain in a strict order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The maximum length of <code>ReceiveRequestAttemptId</code> is 128
     * characters. <code>ReceiveRequestAttemptId</code> can contain alphanumeric
     * characters (<code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and
     * punctuation (<code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     * </p>
     * <p>
     * For best practices of using <code>ReceiveRequestAttemptId</code>, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-receiverequestattemptid-request-parameter.html"
     * >Using the ReceiveRequestAttemptId Request Parameter</a> in the <i>Amazon
     * Simple Queue Service Developer Guide</i>.
     * </p>
     *
     * @param receiveRequestAttemptId <p>
     *            This parameter applies only to FIFO (first-in-first-out)
     *            queues.
     *            </p>
     *            <p>
     *            The token used for deduplication of
     *            <code>ReceiveMessage</code> calls. If a networking issue
     *            occurs after a <code>ReceiveMessage</code> action, and instead
     *            of a response you receive a generic error, it is possible to
     *            retry the same action with an identical
     *            <code>ReceiveRequestAttemptId</code> to retrieve the same set
     *            of messages, even if their visibility timeout has not yet
     *            expired.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            You can use <code>ReceiveRequestAttemptId</code> only for 5
     *            minutes after a <code>ReceiveMessage</code> action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            When you set <code>FifoQueue</code>, a caller of the
     *            <code>ReceiveMessage</code> action can provide a
     *            <code>ReceiveRequestAttemptId</code> explicitly.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If a caller of the <code>ReceiveMessage</code> action doesn't
     *            provide a <code>ReceiveRequestAttemptId</code>, Amazon SQS
     *            generates a <code>ReceiveRequestAttemptId</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            It is possible to retry the <code>ReceiveMessage</code> action
     *            with the same <code>ReceiveRequestAttemptId</code> if none of
     *            the messages have been modified (deleted or had their
     *            visibility changes).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            During a visibility timeout, subsequent calls with the same
     *            <code>ReceiveRequestAttemptId</code> return the same messages
     *            and receipt handles. If a retry occurs within the
     *            deduplication interval, it resets the visibility timeout. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *            >Visibility Timeout</a> in the <i>Amazon Simple Queue Service
     *            Developer Guide</i>.
     *            </p>
     *            <important>
     *            <p>
     *            If a caller of the <code>ReceiveMessage</code> action still
     *            processes messages when the visibility timeout expires and
     *            messages become visible, another worker consuming from the
     *            same queue can receive the same messages and therefore process
     *            duplicates. Also, if a consumer whose message processing time
     *            is longer than the visibility timeout tries to delete the
     *            processed messages, the action fails with an error.
     *            </p>
     *            <p>
     *            To mitigate this effect, ensure that your application observes
     *            a safe threshold before the visibility timeout expires and
     *            extend the visibility timeout as necessary.
     *            </p>
     *            </important></li>
     *            <li>
     *            <p>
     *            While messages with a particular <code>MessageGroupId</code>
     *            are invisible, no more messages belonging to the same
     *            <code>MessageGroupId</code> are returned until the visibility
     *            timeout expires. You can still receive messages with another
     *            <code>MessageGroupId</code> as long as it is also visible.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If a caller of <code>ReceiveMessage</code> can't track the
     *            <code>ReceiveRequestAttemptId</code>, no retries work until
     *            the original visibility timeout expires. As a result, delays
     *            might occur but the messages in the queue remain in a strict
     *            order.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The maximum length of <code>ReceiveRequestAttemptId</code> is
     *            128 characters. <code>ReceiveRequestAttemptId</code> can
     *            contain alphanumeric characters (<code>a-z</code>,
     *            <code>A-Z</code>, <code>0-9</code>) and punctuation (
     *            <code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     *            </p>
     *            <p>
     *            For best practices of using
     *            <code>ReceiveRequestAttemptId</code>, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-receiverequestattemptid-request-parameter.html"
     *            >Using the ReceiveRequestAttemptId Request Parameter</a> in
     *            the <i>Amazon Simple Queue Service Developer Guide</i>.
     *            </p>
     */
    public void setReceiveRequestAttemptId(String receiveRequestAttemptId) {
        this.receiveRequestAttemptId = receiveRequestAttemptId;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The token used for deduplication of <code>ReceiveMessage</code> calls. If
     * a networking issue occurs after a <code>ReceiveMessage</code> action, and
     * instead of a response you receive a generic error, it is possible to
     * retry the same action with an identical
     * <code>ReceiveRequestAttemptId</code> to retrieve the same set of
     * messages, even if their visibility timeout has not yet expired.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can use <code>ReceiveRequestAttemptId</code> only for 5 minutes after
     * a <code>ReceiveMessage</code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you set <code>FifoQueue</code>, a caller of the
     * <code>ReceiveMessage</code> action can provide a
     * <code>ReceiveRequestAttemptId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a caller of the <code>ReceiveMessage</code> action doesn't provide a
     * <code>ReceiveRequestAttemptId</code>, Amazon SQS generates a
     * <code>ReceiveRequestAttemptId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * It is possible to retry the <code>ReceiveMessage</code> action with the
     * same <code>ReceiveRequestAttemptId</code> if none of the messages have
     * been modified (deleted or had their visibility changes).
     * </p>
     * </li>
     * <li>
     * <p>
     * During a visibility timeout, subsequent calls with the same
     * <code>ReceiveRequestAttemptId</code> return the same messages and receipt
     * handles. If a retry occurs within the deduplication interval, it resets
     * the visibility timeout. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * <important>
     * <p>
     * If a caller of the <code>ReceiveMessage</code> action still processes
     * messages when the visibility timeout expires and messages become visible,
     * another worker consuming from the same queue can receive the same
     * messages and therefore process duplicates. Also, if a consumer whose
     * message processing time is longer than the visibility timeout tries to
     * delete the processed messages, the action fails with an error.
     * </p>
     * <p>
     * To mitigate this effect, ensure that your application observes a safe
     * threshold before the visibility timeout expires and extend the visibility
     * timeout as necessary.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * While messages with a particular <code>MessageGroupId</code> are
     * invisible, no more messages belonging to the same
     * <code>MessageGroupId</code> are returned until the visibility timeout
     * expires. You can still receive messages with another
     * <code>MessageGroupId</code> as long as it is also visible.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a caller of <code>ReceiveMessage</code> can't track the
     * <code>ReceiveRequestAttemptId</code>, no retries work until the original
     * visibility timeout expires. As a result, delays might occur but the
     * messages in the queue remain in a strict order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The maximum length of <code>ReceiveRequestAttemptId</code> is 128
     * characters. <code>ReceiveRequestAttemptId</code> can contain alphanumeric
     * characters (<code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and
     * punctuation (<code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     * </p>
     * <p>
     * For best practices of using <code>ReceiveRequestAttemptId</code>, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-receiverequestattemptid-request-parameter.html"
     * >Using the ReceiveRequestAttemptId Request Parameter</a> in the <i>Amazon
     * Simple Queue Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param receiveRequestAttemptId <p>
     *            This parameter applies only to FIFO (first-in-first-out)
     *            queues.
     *            </p>
     *            <p>
     *            The token used for deduplication of
     *            <code>ReceiveMessage</code> calls. If a networking issue
     *            occurs after a <code>ReceiveMessage</code> action, and instead
     *            of a response you receive a generic error, it is possible to
     *            retry the same action with an identical
     *            <code>ReceiveRequestAttemptId</code> to retrieve the same set
     *            of messages, even if their visibility timeout has not yet
     *            expired.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            You can use <code>ReceiveRequestAttemptId</code> only for 5
     *            minutes after a <code>ReceiveMessage</code> action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            When you set <code>FifoQueue</code>, a caller of the
     *            <code>ReceiveMessage</code> action can provide a
     *            <code>ReceiveRequestAttemptId</code> explicitly.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If a caller of the <code>ReceiveMessage</code> action doesn't
     *            provide a <code>ReceiveRequestAttemptId</code>, Amazon SQS
     *            generates a <code>ReceiveRequestAttemptId</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            It is possible to retry the <code>ReceiveMessage</code> action
     *            with the same <code>ReceiveRequestAttemptId</code> if none of
     *            the messages have been modified (deleted or had their
     *            visibility changes).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            During a visibility timeout, subsequent calls with the same
     *            <code>ReceiveRequestAttemptId</code> return the same messages
     *            and receipt handles. If a retry occurs within the
     *            deduplication interval, it resets the visibility timeout. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *            >Visibility Timeout</a> in the <i>Amazon Simple Queue Service
     *            Developer Guide</i>.
     *            </p>
     *            <important>
     *            <p>
     *            If a caller of the <code>ReceiveMessage</code> action still
     *            processes messages when the visibility timeout expires and
     *            messages become visible, another worker consuming from the
     *            same queue can receive the same messages and therefore process
     *            duplicates. Also, if a consumer whose message processing time
     *            is longer than the visibility timeout tries to delete the
     *            processed messages, the action fails with an error.
     *            </p>
     *            <p>
     *            To mitigate this effect, ensure that your application observes
     *            a safe threshold before the visibility timeout expires and
     *            extend the visibility timeout as necessary.
     *            </p>
     *            </important></li>
     *            <li>
     *            <p>
     *            While messages with a particular <code>MessageGroupId</code>
     *            are invisible, no more messages belonging to the same
     *            <code>MessageGroupId</code> are returned until the visibility
     *            timeout expires. You can still receive messages with another
     *            <code>MessageGroupId</code> as long as it is also visible.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If a caller of <code>ReceiveMessage</code> can't track the
     *            <code>ReceiveRequestAttemptId</code>, no retries work until
     *            the original visibility timeout expires. As a result, delays
     *            might occur but the messages in the queue remain in a strict
     *            order.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The maximum length of <code>ReceiveRequestAttemptId</code> is
     *            128 characters. <code>ReceiveRequestAttemptId</code> can
     *            contain alphanumeric characters (<code>a-z</code>,
     *            <code>A-Z</code>, <code>0-9</code>) and punctuation (
     *            <code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     *            </p>
     *            <p>
     *            For best practices of using
     *            <code>ReceiveRequestAttemptId</code>, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-receiverequestattemptid-request-parameter.html"
     *            >Using the ReceiveRequestAttemptId Request Parameter</a> in
     *            the <i>Amazon Simple Queue Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReceiveMessageRequest withReceiveRequestAttemptId(String receiveRequestAttemptId) {
        this.receiveRequestAttemptId = receiveRequestAttemptId;
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
            sb.append("AttributeNames: " + getAttributeNames() + ",");
        if (getMessageAttributeNames() != null)
            sb.append("MessageAttributeNames: " + getMessageAttributeNames() + ",");
        if (getMaxNumberOfMessages() != null)
            sb.append("MaxNumberOfMessages: " + getMaxNumberOfMessages() + ",");
        if (getVisibilityTimeout() != null)
            sb.append("VisibilityTimeout: " + getVisibilityTimeout() + ",");
        if (getWaitTimeSeconds() != null)
            sb.append("WaitTimeSeconds: " + getWaitTimeSeconds() + ",");
        if (getReceiveRequestAttemptId() != null)
            sb.append("ReceiveRequestAttemptId: " + getReceiveRequestAttemptId());
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
        hashCode = prime
                * hashCode
                + ((getMessageAttributeNames() == null) ? 0 : getMessageAttributeNames().hashCode());
        hashCode = prime * hashCode
                + ((getMaxNumberOfMessages() == null) ? 0 : getMaxNumberOfMessages().hashCode());
        hashCode = prime * hashCode
                + ((getVisibilityTimeout() == null) ? 0 : getVisibilityTimeout().hashCode());
        hashCode = prime * hashCode
                + ((getWaitTimeSeconds() == null) ? 0 : getWaitTimeSeconds().hashCode());
        hashCode = prime
                * hashCode
                + ((getReceiveRequestAttemptId() == null) ? 0 : getReceiveRequestAttemptId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReceiveMessageRequest == false)
            return false;
        ReceiveMessageRequest other = (ReceiveMessageRequest) obj;

        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getAttributeNames() == null ^ this.getAttributeNames() == null)
            return false;
        if (other.getAttributeNames() != null
                && other.getAttributeNames().equals(this.getAttributeNames()) == false)
            return false;
        if (other.getMessageAttributeNames() == null ^ this.getMessageAttributeNames() == null)
            return false;
        if (other.getMessageAttributeNames() != null
                && other.getMessageAttributeNames().equals(this.getMessageAttributeNames()) == false)
            return false;
        if (other.getMaxNumberOfMessages() == null ^ this.getMaxNumberOfMessages() == null)
            return false;
        if (other.getMaxNumberOfMessages() != null
                && other.getMaxNumberOfMessages().equals(this.getMaxNumberOfMessages()) == false)
            return false;
        if (other.getVisibilityTimeout() == null ^ this.getVisibilityTimeout() == null)
            return false;
        if (other.getVisibilityTimeout() != null
                && other.getVisibilityTimeout().equals(this.getVisibilityTimeout()) == false)
            return false;
        if (other.getWaitTimeSeconds() == null ^ this.getWaitTimeSeconds() == null)
            return false;
        if (other.getWaitTimeSeconds() != null
                && other.getWaitTimeSeconds().equals(this.getWaitTimeSeconds()) == false)
            return false;
        if (other.getReceiveRequestAttemptId() == null ^ this.getReceiveRequestAttemptId() == null)
            return false;
        if (other.getReceiveRequestAttemptId() != null
                && other.getReceiveRequestAttemptId().equals(this.getReceiveRequestAttemptId()) == false)
            return false;
        return true;
    }
}
