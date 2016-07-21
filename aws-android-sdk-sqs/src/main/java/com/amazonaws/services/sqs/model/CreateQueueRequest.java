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
 * Creates a new queue, or returns the URL of an existing one. When you request
 * <code>CreateQueue</code>, you provide a name for the queue. To successfully
 * create a new queue, you must provide a name that is unique within the scope
 * of your own queues.
 * </p>
 * <note>
 * <p>
 * If you delete a queue, you must wait at least 60 seconds before creating a
 * queue with the same name.
 * </p>
 * </note>
 * <p>
 * You may pass one or more attributes in the request. If you do not provide a
 * value for any attribute, the queue will have the default value for that
 * attribute.
 * </p>
 * <note>
 * <p>
 * Use <a>GetQueueUrl</a> to get a queue's URL. <a>GetQueueUrl</a> requires only
 * the <code>QueueName</code> parameter.
 * </p>
 * </note>
 * <p>
 * If you provide the name of an existing queue, along with the exact names and
 * values of all the queue's attributes, <code>CreateQueue</code> returns the
 * queue URL for the existing queue. If the queue name, attribute names, or
 * attribute values do not match an existing queue, <code>CreateQueue</code>
 * returns an error.
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
 * <code><![CDATA[&amp;Attribute.1=this]]></code>
 * </p>
 * <p>
 * <code><![CDATA[&amp;Attribute.2=that]]></code>
 * </p>
 */
public class CreateQueueRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name for the queue to be created.
     * </p>
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
     * request parameters the <code>CreateQueue</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> - The time in seconds that the delivery of all
     * messages in the queue will be delayed. An integer from 0 to 900 (15
     * minutes). The default for this attribute is 0 (zero).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - The limit of how many bytes a message
     * can contain before Amazon SQS rejects it. An integer from 1024 bytes (1
     * KiB) up to 262144 bytes (256 KiB). The default for this attribute is
     * 262144 (256 KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - The number of seconds Amazon SQS
     * retains a message. Integer representing seconds, from 60 (1 minute) to
     * 1209600 (14 days). The default for this attribute is 345600 (4 days).
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
     * <code>ReceiveMessageWaitTimeSeconds</code> - The time for which a
     * <a>ReceiveMessage</a> call will wait for a message to arrive. An integer
     * from 0 to 20 (seconds). The default for this attribute is 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - The parameters for dead letter queue
     * functionality of the source queue. For more information about
     * RedrivePolicy and dead letter queues, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - The visibility timeout for the queue. An
     * integer from 0 to 43200 (12 hours). The default for this attribute is 30.
     * For more information about visibility timeout, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
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
     *            The name for the queue to be created.
     *            </p>
     *            <p>
     *            Queue names are case-sensitive.
     *            </p>
     */
    public CreateQueueRequest(String queueName) {
        setQueueName(queueName);
    }

    /**
     * <p>
     * The name for the queue to be created.
     * </p>
     * <p>
     * Queue names are case-sensitive.
     * </p>
     *
     * @return <p>
     *         The name for the queue to be created.
     *         </p>
     *         <p>
     *         Queue names are case-sensitive.
     *         </p>
     */
    public String getQueueName() {
        return queueName;
    }

    /**
     * <p>
     * The name for the queue to be created.
     * </p>
     * <p>
     * Queue names are case-sensitive.
     * </p>
     *
     * @param queueName <p>
     *            The name for the queue to be created.
     *            </p>
     *            <p>
     *            Queue names are case-sensitive.
     *            </p>
     */
    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    /**
     * <p>
     * The name for the queue to be created.
     * </p>
     * <p>
     * Queue names are case-sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueName <p>
     *            The name for the queue to be created.
     *            </p>
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
     * request parameters the <code>CreateQueue</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> - The time in seconds that the delivery of all
     * messages in the queue will be delayed. An integer from 0 to 900 (15
     * minutes). The default for this attribute is 0 (zero).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - The limit of how many bytes a message
     * can contain before Amazon SQS rejects it. An integer from 1024 bytes (1
     * KiB) up to 262144 bytes (256 KiB). The default for this attribute is
     * 262144 (256 KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - The number of seconds Amazon SQS
     * retains a message. Integer representing seconds, from 60 (1 minute) to
     * 1209600 (14 days). The default for this attribute is 345600 (4 days).
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
     * <code>ReceiveMessageWaitTimeSeconds</code> - The time for which a
     * <a>ReceiveMessage</a> call will wait for a message to arrive. An integer
     * from 0 to 20 (seconds). The default for this attribute is 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - The parameters for dead letter queue
     * functionality of the source queue. For more information about
     * RedrivePolicy and dead letter queues, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - The visibility timeout for the queue. An
     * integer from 0 to 43200 (12 hours). The default for this attribute is 30.
     * For more information about visibility timeout, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
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
     *         special request parameters the <code>CreateQueue</code> action
     *         uses:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DelaySeconds</code> - The time in seconds that the delivery
     *         of all messages in the queue will be delayed. An integer from 0
     *         to 900 (15 minutes). The default for this attribute is 0 (zero).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MaximumMessageSize</code> - The limit of how many bytes a
     *         message can contain before Amazon SQS rejects it. An integer from
     *         1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The default for
     *         this attribute is 262144 (256 KiB).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MessageRetentionPeriod</code> - The number of seconds
     *         Amazon SQS retains a message. Integer representing seconds, from
     *         60 (1 minute) to 1209600 (14 days). The default for this
     *         attribute is 345600 (4 days).
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
     *         <code>ReceiveMessageWaitTimeSeconds</code> - The time for which a
     *         <a>ReceiveMessage</a> call will wait for a message to arrive. An
     *         integer from 0 to 20 (seconds). The default for this attribute is
     *         0.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RedrivePolicy</code> - The parameters for dead letter queue
     *         functionality of the source queue. For more information about
     *         RedrivePolicy and dead letter queues, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     *         >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS
     *         Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VisibilityTimeout</code> - The visibility timeout for the
     *         queue. An integer from 0 to 43200 (12 hours). The default for
     *         this attribute is 30. For more information about visibility
     *         timeout, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     *         >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     *         </p>
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
     * request parameters the <code>CreateQueue</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> - The time in seconds that the delivery of all
     * messages in the queue will be delayed. An integer from 0 to 900 (15
     * minutes). The default for this attribute is 0 (zero).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - The limit of how many bytes a message
     * can contain before Amazon SQS rejects it. An integer from 1024 bytes (1
     * KiB) up to 262144 bytes (256 KiB). The default for this attribute is
     * 262144 (256 KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - The number of seconds Amazon SQS
     * retains a message. Integer representing seconds, from 60 (1 minute) to
     * 1209600 (14 days). The default for this attribute is 345600 (4 days).
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
     * <code>ReceiveMessageWaitTimeSeconds</code> - The time for which a
     * <a>ReceiveMessage</a> call will wait for a message to arrive. An integer
     * from 0 to 20 (seconds). The default for this attribute is 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - The parameters for dead letter queue
     * functionality of the source queue. For more information about
     * RedrivePolicy and dead letter queues, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - The visibility timeout for the queue. An
     * integer from 0 to 43200 (12 hours). The default for this attribute is 30.
     * For more information about visibility timeout, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
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
     *            special request parameters the <code>CreateQueue</code> action
     *            uses:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DelaySeconds</code> - The time in seconds that the
     *            delivery of all messages in the queue will be delayed. An
     *            integer from 0 to 900 (15 minutes). The default for this
     *            attribute is 0 (zero).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MaximumMessageSize</code> - The limit of how many bytes
     *            a message can contain before Amazon SQS rejects it. An integer
     *            from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The
     *            default for this attribute is 262144 (256 KiB).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MessageRetentionPeriod</code> - The number of seconds
     *            Amazon SQS retains a message. Integer representing seconds,
     *            from 60 (1 minute) to 1209600 (14 days). The default for this
     *            attribute is 345600 (4 days).
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
     *            <code>ReceiveMessageWaitTimeSeconds</code> - The time for
     *            which a <a>ReceiveMessage</a> call will wait for a message to
     *            arrive. An integer from 0 to 20 (seconds). The default for
     *            this attribute is 0.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RedrivePolicy</code> - The parameters for dead letter
     *            queue functionality of the source queue. For more information
     *            about RedrivePolicy and dead letter queues, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     *            >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS
     *            Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VisibilityTimeout</code> - The visibility timeout for
     *            the queue. An integer from 0 to 43200 (12 hours). The default
     *            for this attribute is 30. For more information about
     *            visibility timeout, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     *            >Visibility Timeout</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
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
     * request parameters the <code>CreateQueue</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> - The time in seconds that the delivery of all
     * messages in the queue will be delayed. An integer from 0 to 900 (15
     * minutes). The default for this attribute is 0 (zero).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - The limit of how many bytes a message
     * can contain before Amazon SQS rejects it. An integer from 1024 bytes (1
     * KiB) up to 262144 bytes (256 KiB). The default for this attribute is
     * 262144 (256 KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - The number of seconds Amazon SQS
     * retains a message. Integer representing seconds, from 60 (1 minute) to
     * 1209600 (14 days). The default for this attribute is 345600 (4 days).
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
     * <code>ReceiveMessageWaitTimeSeconds</code> - The time for which a
     * <a>ReceiveMessage</a> call will wait for a message to arrive. An integer
     * from 0 to 20 (seconds). The default for this attribute is 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - The parameters for dead letter queue
     * functionality of the source queue. For more information about
     * RedrivePolicy and dead letter queues, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - The visibility timeout for the queue. An
     * integer from 0 to 43200 (12 hours). The default for this attribute is 30.
     * For more information about visibility timeout, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
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
     *            special request parameters the <code>CreateQueue</code> action
     *            uses:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DelaySeconds</code> - The time in seconds that the
     *            delivery of all messages in the queue will be delayed. An
     *            integer from 0 to 900 (15 minutes). The default for this
     *            attribute is 0 (zero).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MaximumMessageSize</code> - The limit of how many bytes
     *            a message can contain before Amazon SQS rejects it. An integer
     *            from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The
     *            default for this attribute is 262144 (256 KiB).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MessageRetentionPeriod</code> - The number of seconds
     *            Amazon SQS retains a message. Integer representing seconds,
     *            from 60 (1 minute) to 1209600 (14 days). The default for this
     *            attribute is 345600 (4 days).
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
     *            <code>ReceiveMessageWaitTimeSeconds</code> - The time for
     *            which a <a>ReceiveMessage</a> call will wait for a message to
     *            arrive. An integer from 0 to 20 (seconds). The default for
     *            this attribute is 0.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RedrivePolicy</code> - The parameters for dead letter
     *            queue functionality of the source queue. For more information
     *            about RedrivePolicy and dead letter queues, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     *            >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS
     *            Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VisibilityTimeout</code> - The visibility timeout for
     *            the queue. An integer from 0 to 43200 (12 hours). The default
     *            for this attribute is 30. For more information about
     *            visibility timeout, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     *            >Visibility Timeout</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
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
     * request parameters the <code>CreateQueue</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> - The time in seconds that the delivery of all
     * messages in the queue will be delayed. An integer from 0 to 900 (15
     * minutes). The default for this attribute is 0 (zero).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - The limit of how many bytes a message
     * can contain before Amazon SQS rejects it. An integer from 1024 bytes (1
     * KiB) up to 262144 bytes (256 KiB). The default for this attribute is
     * 262144 (256 KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - The number of seconds Amazon SQS
     * retains a message. Integer representing seconds, from 60 (1 minute) to
     * 1209600 (14 days). The default for this attribute is 345600 (4 days).
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
     * <code>ReceiveMessageWaitTimeSeconds</code> - The time for which a
     * <a>ReceiveMessage</a> call will wait for a message to arrive. An integer
     * from 0 to 20 (seconds). The default for this attribute is 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - The parameters for dead letter queue
     * functionality of the source queue. For more information about
     * RedrivePolicy and dead letter queues, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - The visibility timeout for the queue. An
     * integer from 0 to 43200 (12 hours). The default for this attribute is 30.
     * For more information about visibility timeout, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
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
