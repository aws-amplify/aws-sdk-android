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
 * Retrieves one or more messages, with a maximum limit of 10 messages, from the
 * specified queue. Long poll support is enabled by using the
 * <code>WaitTimeSeconds</code> parameter. For more information, see <a href=
 * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-long-polling.html"
 * >Amazon SQS Long Poll</a> in the <i>Amazon SQS Developer Guide</i>.
 * </p>
 * <p>
 * Short poll is the default behavior where a weighted random set of machines is
 * sampled on a <code>ReceiveMessage</code> call. This means only the messages
 * on the sampled machines are returned. If the number of messages in the queue
 * is small (less than 1000), it is likely you will get fewer messages than you
 * requested per <code>ReceiveMessage</code> call. If the number of messages in
 * the queue is extremely small, you might not receive any messages in a
 * particular <code>ReceiveMessage</code> response; in which case you should
 * repeat the request.
 * </p>
 * <p>
 * For each message returned, the response includes the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Message body
 * </p>
 * </li>
 * <li>
 * <p>
 * MD5 digest of the message body. For information about MD5, go to <a
 * href="http://www.faqs.org/rfcs/rfc1321.html"
 * >http://www.faqs.org/rfcs/rfc1321.html</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Message ID you received when you sent the message to the queue.
 * </p>
 * </li>
 * <li>
 * <p>
 * Receipt handle.
 * </p>
 * </li>
 * <li>
 * <p>
 * Message attributes.
 * </p>
 * </li>
 * <li>
 * <p>
 * MD5 digest of the message attributes.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The receipt handle is the identifier you must provide when deleting the
 * message. For more information, see <a href=
 * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html"
 * >Queue and Message Identifiers</a> in the <i>Amazon SQS Developer Guide</i>.
 * </p>
 * <p>
 * You can provide the <code>VisibilityTimeout</code> parameter in your request,
 * which will be applied to the messages that Amazon SQS returns in the
 * response. If you do not include the parameter, the overall visibility timeout
 * for the queue is used for the returned messages. For more information, see <a
 * href=
 * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
 * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
 * </p>
 * <note>
 * <p>
 * Going forward, new attributes might be added. If you are writing code that
 * calls this action, we recommend that you structure your code so that it can
 * handle new attributes gracefully.
 * </p>
 * </note>
 */
public class ReceiveMessageRequest extends AmazonWebServiceRequest implements Serializable {
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
     * A list of attributes that need to be returned along with each message.
     * These attributes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> - returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> - returns the time when the
     * message was first received from the queue (epoch time in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> - returns the number of times a
     * message has been received from the queue but not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code> - returns the AWS account number (or the IP
     * address, if anonymous access is allowed) of the sender.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> - returns the time when the message was sent
     * to the queue (epoch time in milliseconds).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters that are specified (such as
     * <code>ApproximateNumberOfMessages</code>,
     * <code>ApproximateNumberOfMessagesDelayed</code>,
     * <code>ApproximateNumberOfMessagesNotVisible</code>,
     * <code>CreatedTimestamp</code>, <code>DelaySeconds</code>,
     * <code>LastModifiedTimestamp</code>, <code>MaximumMessageSize</code>,
     * <code>MessageRetentionPeriod</code>, <code>Policy</code>,
     * <code>QueueArn</code>, <code>ReceiveMessageWaitTimeSeconds</code>,
     * <code>RedrivePolicy</code>, and <code>VisibilityTimeout</code>) will be
     * ignored.
     * </p>
     */
    private java.util.List<String> attributeNames = new java.util.ArrayList<String>();

    /**
     * <p>
     * The name of the message attribute, where <i>N</i> is the index. The
     * message attribute name can contain the following characters: A-Z, a-z,
     * 0-9, underscore (_), hyphen (-), and period (.). The name must not start
     * or end with a period, and it should not have successive periods. The name
     * is case sensitive and must be unique among all attribute names for the
     * message. The name can be up to 256 characters long. The name cannot start
     * with "AWS." or "Amazon." (or any variations in casing), because these
     * prefixes are reserved for use by Amazon Web Services.
     * </p>
     * <p>
     * When using <code>ReceiveMessage</code>, you can send a list of attribute
     * names to receive, or you can return all of the attributes by specifying
     * "All" or ".*" in your request. You can also use "bar.*" to return all
     * message attributes starting with the "bar" prefix.
     * </p>
     */
    private java.util.List<String> messageAttributeNames = new java.util.ArrayList<String>();

    /**
     * <p>
     * The maximum number of messages to return. Amazon SQS never returns more
     * messages than this value but may return fewer. Values can be from 1 to
     * 10. Default is 1.
     * </p>
     * <p>
     * All of the messages are not necessarily returned.
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
     * The duration (in seconds) for which the call will wait for a message to
     * arrive in the queue before returning. If a message is available, the call
     * will return sooner than WaitTimeSeconds.
     * </p>
     */
    private Integer waitTimeSeconds;

    /**
     * Default constructor for ReceiveMessageRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     */
    public ReceiveMessageRequest() {
    }

    /**
     * Constructs a new ReceiveMessageRequest object. Callers should use the
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
    public ReceiveMessageRequest(String queueUrl) {
        setQueueUrl(queueUrl);
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
     * <code>All</code> - returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> - returns the time when the
     * message was first received from the queue (epoch time in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> - returns the number of times a
     * message has been received from the queue but not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code> - returns the AWS account number (or the IP
     * address, if anonymous access is allowed) of the sender.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> - returns the time when the message was sent
     * to the queue (epoch time in milliseconds).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters that are specified (such as
     * <code>ApproximateNumberOfMessages</code>,
     * <code>ApproximateNumberOfMessagesDelayed</code>,
     * <code>ApproximateNumberOfMessagesNotVisible</code>,
     * <code>CreatedTimestamp</code>, <code>DelaySeconds</code>,
     * <code>LastModifiedTimestamp</code>, <code>MaximumMessageSize</code>,
     * <code>MessageRetentionPeriod</code>, <code>Policy</code>,
     * <code>QueueArn</code>, <code>ReceiveMessageWaitTimeSeconds</code>,
     * <code>RedrivePolicy</code>, and <code>VisibilityTimeout</code>) will be
     * ignored.
     * </p>
     *
     * @return <p>
     *         A list of attributes that need to be returned along with each
     *         message. These attributes include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>All</code> - returns all values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ApproximateFirstReceiveTimestamp</code> - returns the time
     *         when the message was first received from the queue (epoch time in
     *         milliseconds).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ApproximateReceiveCount</code> - returns the number of
     *         times a message has been received from the queue but not deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SenderId</code> - returns the AWS account number (or the IP
     *         address, if anonymous access is allowed) of the sender.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SentTimestamp</code> - returns the time when the message
     *         was sent to the queue (epoch time in milliseconds).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Any other valid special request parameters that are specified
     *         (such as <code>ApproximateNumberOfMessages</code>,
     *         <code>ApproximateNumberOfMessagesDelayed</code>,
     *         <code>ApproximateNumberOfMessagesNotVisible</code>,
     *         <code>CreatedTimestamp</code>, <code>DelaySeconds</code>,
     *         <code>LastModifiedTimestamp</code>,
     *         <code>MaximumMessageSize</code>,
     *         <code>MessageRetentionPeriod</code>, <code>Policy</code>,
     *         <code>QueueArn</code>, <code>ReceiveMessageWaitTimeSeconds</code>, <code>RedrivePolicy</code>, and <code>VisibilityTimeout</code>)
     *         will be ignored.
     *         </p>
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
     * <code>All</code> - returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> - returns the time when the
     * message was first received from the queue (epoch time in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> - returns the number of times a
     * message has been received from the queue but not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code> - returns the AWS account number (or the IP
     * address, if anonymous access is allowed) of the sender.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> - returns the time when the message was sent
     * to the queue (epoch time in milliseconds).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters that are specified (such as
     * <code>ApproximateNumberOfMessages</code>,
     * <code>ApproximateNumberOfMessagesDelayed</code>,
     * <code>ApproximateNumberOfMessagesNotVisible</code>,
     * <code>CreatedTimestamp</code>, <code>DelaySeconds</code>,
     * <code>LastModifiedTimestamp</code>, <code>MaximumMessageSize</code>,
     * <code>MessageRetentionPeriod</code>, <code>Policy</code>,
     * <code>QueueArn</code>, <code>ReceiveMessageWaitTimeSeconds</code>,
     * <code>RedrivePolicy</code>, and <code>VisibilityTimeout</code>) will be
     * ignored.
     * </p>
     *
     * @param attributeNames <p>
     *            A list of attributes that need to be returned along with each
     *            message. These attributes include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>All</code> - returns all values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateFirstReceiveTimestamp</code> - returns the
     *            time when the message was first received from the queue (epoch
     *            time in milliseconds).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateReceiveCount</code> - returns the number of
     *            times a message has been received from the queue but not
     *            deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SenderId</code> - returns the AWS account number (or the
     *            IP address, if anonymous access is allowed) of the sender.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SentTimestamp</code> - returns the time when the message
     *            was sent to the queue (epoch time in milliseconds).
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Any other valid special request parameters that are specified
     *            (such as <code>ApproximateNumberOfMessages</code>,
     *            <code>ApproximateNumberOfMessagesDelayed</code>,
     *            <code>ApproximateNumberOfMessagesNotVisible</code>,
     *            <code>CreatedTimestamp</code>, <code>DelaySeconds</code>,
     *            <code>LastModifiedTimestamp</code>,
     *            <code>MaximumMessageSize</code>,
     *            <code>MessageRetentionPeriod</code>, <code>Policy</code>,
     *            <code>QueueArn</code>,
     *            <code>ReceiveMessageWaitTimeSeconds</code>,
     *            <code>RedrivePolicy</code>, and <code>VisibilityTimeout</code>
     *            ) will be ignored.
     *            </p>
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
     * <code>All</code> - returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> - returns the time when the
     * message was first received from the queue (epoch time in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> - returns the number of times a
     * message has been received from the queue but not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code> - returns the AWS account number (or the IP
     * address, if anonymous access is allowed) of the sender.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> - returns the time when the message was sent
     * to the queue (epoch time in milliseconds).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters that are specified (such as
     * <code>ApproximateNumberOfMessages</code>,
     * <code>ApproximateNumberOfMessagesDelayed</code>,
     * <code>ApproximateNumberOfMessagesNotVisible</code>,
     * <code>CreatedTimestamp</code>, <code>DelaySeconds</code>,
     * <code>LastModifiedTimestamp</code>, <code>MaximumMessageSize</code>,
     * <code>MessageRetentionPeriod</code>, <code>Policy</code>,
     * <code>QueueArn</code>, <code>ReceiveMessageWaitTimeSeconds</code>,
     * <code>RedrivePolicy</code>, and <code>VisibilityTimeout</code>) will be
     * ignored.
     * </p>
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
     *            <code>All</code> - returns all values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateFirstReceiveTimestamp</code> - returns the
     *            time when the message was first received from the queue (epoch
     *            time in milliseconds).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateReceiveCount</code> - returns the number of
     *            times a message has been received from the queue but not
     *            deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SenderId</code> - returns the AWS account number (or the
     *            IP address, if anonymous access is allowed) of the sender.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SentTimestamp</code> - returns the time when the message
     *            was sent to the queue (epoch time in milliseconds).
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Any other valid special request parameters that are specified
     *            (such as <code>ApproximateNumberOfMessages</code>,
     *            <code>ApproximateNumberOfMessagesDelayed</code>,
     *            <code>ApproximateNumberOfMessagesNotVisible</code>,
     *            <code>CreatedTimestamp</code>, <code>DelaySeconds</code>,
     *            <code>LastModifiedTimestamp</code>,
     *            <code>MaximumMessageSize</code>,
     *            <code>MessageRetentionPeriod</code>, <code>Policy</code>,
     *            <code>QueueArn</code>,
     *            <code>ReceiveMessageWaitTimeSeconds</code>,
     *            <code>RedrivePolicy</code>, and <code>VisibilityTimeout</code>
     *            ) will be ignored.
     *            </p>
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
     * <code>All</code> - returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> - returns the time when the
     * message was first received from the queue (epoch time in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> - returns the number of times a
     * message has been received from the queue but not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code> - returns the AWS account number (or the IP
     * address, if anonymous access is allowed) of the sender.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> - returns the time when the message was sent
     * to the queue (epoch time in milliseconds).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters that are specified (such as
     * <code>ApproximateNumberOfMessages</code>,
     * <code>ApproximateNumberOfMessagesDelayed</code>,
     * <code>ApproximateNumberOfMessagesNotVisible</code>,
     * <code>CreatedTimestamp</code>, <code>DelaySeconds</code>,
     * <code>LastModifiedTimestamp</code>, <code>MaximumMessageSize</code>,
     * <code>MessageRetentionPeriod</code>, <code>Policy</code>,
     * <code>QueueArn</code>, <code>ReceiveMessageWaitTimeSeconds</code>,
     * <code>RedrivePolicy</code>, and <code>VisibilityTimeout</code>) will be
     * ignored.
     * </p>
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
     *            <code>All</code> - returns all values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateFirstReceiveTimestamp</code> - returns the
     *            time when the message was first received from the queue (epoch
     *            time in milliseconds).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateReceiveCount</code> - returns the number of
     *            times a message has been received from the queue but not
     *            deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SenderId</code> - returns the AWS account number (or the
     *            IP address, if anonymous access is allowed) of the sender.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SentTimestamp</code> - returns the time when the message
     *            was sent to the queue (epoch time in milliseconds).
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Any other valid special request parameters that are specified
     *            (such as <code>ApproximateNumberOfMessages</code>,
     *            <code>ApproximateNumberOfMessagesDelayed</code>,
     *            <code>ApproximateNumberOfMessagesNotVisible</code>,
     *            <code>CreatedTimestamp</code>, <code>DelaySeconds</code>,
     *            <code>LastModifiedTimestamp</code>,
     *            <code>MaximumMessageSize</code>,
     *            <code>MessageRetentionPeriod</code>, <code>Policy</code>,
     *            <code>QueueArn</code>,
     *            <code>ReceiveMessageWaitTimeSeconds</code>,
     *            <code>RedrivePolicy</code>, and <code>VisibilityTimeout</code>
     *            ) will be ignored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReceiveMessageRequest withAttributeNames(java.util.Collection<String> attributeNames) {
        setAttributeNames(attributeNames);
        return this;
    }

    /**
     * <p>
     * The name of the message attribute, where <i>N</i> is the index. The
     * message attribute name can contain the following characters: A-Z, a-z,
     * 0-9, underscore (_), hyphen (-), and period (.). The name must not start
     * or end with a period, and it should not have successive periods. The name
     * is case sensitive and must be unique among all attribute names for the
     * message. The name can be up to 256 characters long. The name cannot start
     * with "AWS." or "Amazon." (or any variations in casing), because these
     * prefixes are reserved for use by Amazon Web Services.
     * </p>
     * <p>
     * When using <code>ReceiveMessage</code>, you can send a list of attribute
     * names to receive, or you can return all of the attributes by specifying
     * "All" or ".*" in your request. You can also use "bar.*" to return all
     * message attributes starting with the "bar" prefix.
     * </p>
     *
     * @return <p>
     *         The name of the message attribute, where <i>N</i> is the index.
     *         The message attribute name can contain the following characters:
     *         A-Z, a-z, 0-9, underscore (_), hyphen (-), and period (.). The
     *         name must not start or end with a period, and it should not have
     *         successive periods. The name is case sensitive and must be unique
     *         among all attribute names for the message. The name can be up to
     *         256 characters long. The name cannot start with "AWS." or
     *         "Amazon." (or any variations in casing), because these prefixes
     *         are reserved for use by Amazon Web Services.
     *         </p>
     *         <p>
     *         When using <code>ReceiveMessage</code>, you can send a list of
     *         attribute names to receive, or you can return all of the
     *         attributes by specifying "All" or ".*" in your request. You can
     *         also use "bar.*" to return all message attributes starting with
     *         the "bar" prefix.
     *         </p>
     */
    public java.util.List<String> getMessageAttributeNames() {
        return messageAttributeNames;
    }

    /**
     * <p>
     * The name of the message attribute, where <i>N</i> is the index. The
     * message attribute name can contain the following characters: A-Z, a-z,
     * 0-9, underscore (_), hyphen (-), and period (.). The name must not start
     * or end with a period, and it should not have successive periods. The name
     * is case sensitive and must be unique among all attribute names for the
     * message. The name can be up to 256 characters long. The name cannot start
     * with "AWS." or "Amazon." (or any variations in casing), because these
     * prefixes are reserved for use by Amazon Web Services.
     * </p>
     * <p>
     * When using <code>ReceiveMessage</code>, you can send a list of attribute
     * names to receive, or you can return all of the attributes by specifying
     * "All" or ".*" in your request. You can also use "bar.*" to return all
     * message attributes starting with the "bar" prefix.
     * </p>
     *
     * @param messageAttributeNames <p>
     *            The name of the message attribute, where <i>N</i> is the
     *            index. The message attribute name can contain the following
     *            characters: A-Z, a-z, 0-9, underscore (_), hyphen (-), and
     *            period (.). The name must not start or end with a period, and
     *            it should not have successive periods. The name is case
     *            sensitive and must be unique among all attribute names for the
     *            message. The name can be up to 256 characters long. The name
     *            cannot start with "AWS." or "Amazon." (or any variations in
     *            casing), because these prefixes are reserved for use by Amazon
     *            Web Services.
     *            </p>
     *            <p>
     *            When using <code>ReceiveMessage</code>, you can send a list of
     *            attribute names to receive, or you can return all of the
     *            attributes by specifying "All" or ".*" in your request. You
     *            can also use "bar.*" to return all message attributes starting
     *            with the "bar" prefix.
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
     * The name of the message attribute, where <i>N</i> is the index. The
     * message attribute name can contain the following characters: A-Z, a-z,
     * 0-9, underscore (_), hyphen (-), and period (.). The name must not start
     * or end with a period, and it should not have successive periods. The name
     * is case sensitive and must be unique among all attribute names for the
     * message. The name can be up to 256 characters long. The name cannot start
     * with "AWS." or "Amazon." (or any variations in casing), because these
     * prefixes are reserved for use by Amazon Web Services.
     * </p>
     * <p>
     * When using <code>ReceiveMessage</code>, you can send a list of attribute
     * names to receive, or you can return all of the attributes by specifying
     * "All" or ".*" in your request. You can also use "bar.*" to return all
     * message attributes starting with the "bar" prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageAttributeNames <p>
     *            The name of the message attribute, where <i>N</i> is the
     *            index. The message attribute name can contain the following
     *            characters: A-Z, a-z, 0-9, underscore (_), hyphen (-), and
     *            period (.). The name must not start or end with a period, and
     *            it should not have successive periods. The name is case
     *            sensitive and must be unique among all attribute names for the
     *            message. The name can be up to 256 characters long. The name
     *            cannot start with "AWS." or "Amazon." (or any variations in
     *            casing), because these prefixes are reserved for use by Amazon
     *            Web Services.
     *            </p>
     *            <p>
     *            When using <code>ReceiveMessage</code>, you can send a list of
     *            attribute names to receive, or you can return all of the
     *            attributes by specifying "All" or ".*" in your request. You
     *            can also use "bar.*" to return all message attributes starting
     *            with the "bar" prefix.
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
     * The name of the message attribute, where <i>N</i> is the index. The
     * message attribute name can contain the following characters: A-Z, a-z,
     * 0-9, underscore (_), hyphen (-), and period (.). The name must not start
     * or end with a period, and it should not have successive periods. The name
     * is case sensitive and must be unique among all attribute names for the
     * message. The name can be up to 256 characters long. The name cannot start
     * with "AWS." or "Amazon." (or any variations in casing), because these
     * prefixes are reserved for use by Amazon Web Services.
     * </p>
     * <p>
     * When using <code>ReceiveMessage</code>, you can send a list of attribute
     * names to receive, or you can return all of the attributes by specifying
     * "All" or ".*" in your request. You can also use "bar.*" to return all
     * message attributes starting with the "bar" prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageAttributeNames <p>
     *            The name of the message attribute, where <i>N</i> is the
     *            index. The message attribute name can contain the following
     *            characters: A-Z, a-z, 0-9, underscore (_), hyphen (-), and
     *            period (.). The name must not start or end with a period, and
     *            it should not have successive periods. The name is case
     *            sensitive and must be unique among all attribute names for the
     *            message. The name can be up to 256 characters long. The name
     *            cannot start with "AWS." or "Amazon." (or any variations in
     *            casing), because these prefixes are reserved for use by Amazon
     *            Web Services.
     *            </p>
     *            <p>
     *            When using <code>ReceiveMessage</code>, you can send a list of
     *            attribute names to receive, or you can return all of the
     *            attributes by specifying "All" or ".*" in your request. You
     *            can also use "bar.*" to return all message attributes starting
     *            with the "bar" prefix.
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
     * messages than this value but may return fewer. Values can be from 1 to
     * 10. Default is 1.
     * </p>
     * <p>
     * All of the messages are not necessarily returned.
     * </p>
     *
     * @return <p>
     *         The maximum number of messages to return. Amazon SQS never
     *         returns more messages than this value but may return fewer.
     *         Values can be from 1 to 10. Default is 1.
     *         </p>
     *         <p>
     *         All of the messages are not necessarily returned.
     *         </p>
     */
    public Integer getMaxNumberOfMessages() {
        return maxNumberOfMessages;
    }

    /**
     * <p>
     * The maximum number of messages to return. Amazon SQS never returns more
     * messages than this value but may return fewer. Values can be from 1 to
     * 10. Default is 1.
     * </p>
     * <p>
     * All of the messages are not necessarily returned.
     * </p>
     *
     * @param maxNumberOfMessages <p>
     *            The maximum number of messages to return. Amazon SQS never
     *            returns more messages than this value but may return fewer.
     *            Values can be from 1 to 10. Default is 1.
     *            </p>
     *            <p>
     *            All of the messages are not necessarily returned.
     *            </p>
     */
    public void setMaxNumberOfMessages(Integer maxNumberOfMessages) {
        this.maxNumberOfMessages = maxNumberOfMessages;
    }

    /**
     * <p>
     * The maximum number of messages to return. Amazon SQS never returns more
     * messages than this value but may return fewer. Values can be from 1 to
     * 10. Default is 1.
     * </p>
     * <p>
     * All of the messages are not necessarily returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxNumberOfMessages <p>
     *            The maximum number of messages to return. Amazon SQS never
     *            returns more messages than this value but may return fewer.
     *            Values can be from 1 to 10. Default is 1.
     *            </p>
     *            <p>
     *            All of the messages are not necessarily returned.
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
     * The duration (in seconds) for which the call will wait for a message to
     * arrive in the queue before returning. If a message is available, the call
     * will return sooner than WaitTimeSeconds.
     * </p>
     *
     * @return <p>
     *         The duration (in seconds) for which the call will wait for a
     *         message to arrive in the queue before returning. If a message is
     *         available, the call will return sooner than WaitTimeSeconds.
     *         </p>
     */
    public Integer getWaitTimeSeconds() {
        return waitTimeSeconds;
    }

    /**
     * <p>
     * The duration (in seconds) for which the call will wait for a message to
     * arrive in the queue before returning. If a message is available, the call
     * will return sooner than WaitTimeSeconds.
     * </p>
     *
     * @param waitTimeSeconds <p>
     *            The duration (in seconds) for which the call will wait for a
     *            message to arrive in the queue before returning. If a message
     *            is available, the call will return sooner than
     *            WaitTimeSeconds.
     *            </p>
     */
    public void setWaitTimeSeconds(Integer waitTimeSeconds) {
        this.waitTimeSeconds = waitTimeSeconds;
    }

    /**
     * <p>
     * The duration (in seconds) for which the call will wait for a message to
     * arrive in the queue before returning. If a message is available, the call
     * will return sooner than WaitTimeSeconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param waitTimeSeconds <p>
     *            The duration (in seconds) for which the call will wait for a
     *            message to arrive in the queue before returning. If a message
     *            is available, the call will return sooner than
     *            WaitTimeSeconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReceiveMessageRequest withWaitTimeSeconds(Integer waitTimeSeconds) {
        this.waitTimeSeconds = waitTimeSeconds;
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
            sb.append("WaitTimeSeconds: " + getWaitTimeSeconds());
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
        return true;
    }
}
