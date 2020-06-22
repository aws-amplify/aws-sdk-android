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
 * Changes the visibility timeout of a specified message in a queue to a new
 * value. The default visibility timeout for a message is 30 seconds. The
 * minimum is 0 seconds. The maximum is 12 hours. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
 * >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * For example, you have a message with a visibility timeout of 5 minutes. After
 * 3 minutes, you call <code>ChangeMessageVisibility</code> with a timeout of 10
 * minutes. You can continue to call <code>ChangeMessageVisibility</code> to
 * extend the visibility timeout to the maximum allowed time. If you try to
 * extend the visibility timeout beyond the maximum, your request is rejected.
 * </p>
 * <p>
 * An Amazon SQS message has three basic states:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Sent to a queue by a producer.
 * </p>
 * </li>
 * <li>
 * <p>
 * Received from the queue by a consumer.
 * </p>
 * </li>
 * <li>
 * <p>
 * Deleted from the queue.
 * </p>
 * </li>
 * </ol>
 * <p>
 * A message is considered to be <i>stored</i> after it is sent to a queue by a
 * producer, but not yet received from the queue by a consumer (that is, between
 * states 1 and 2). There is no limit to the number of stored messages. A
 * message is considered to be <i>in flight</i> after it is received from a
 * queue by a consumer, but not yet deleted from the queue (that is, between
 * states 2 and 3). There is a limit to the number of inflight messages.
 * </p>
 * <p>
 * Limits that apply to inflight messages are unrelated to the <i>unlimited</i>
 * number of stored messages.
 * </p>
 * <p>
 * For most standard queues (depending on queue traffic and message backlog),
 * there can be a maximum of approximately 120,000 inflight messages (received
 * from a queue by a consumer, but not yet deleted from the queue). If you reach
 * this limit, Amazon SQS returns the <code>OverLimit</code> error message. To
 * avoid reaching the limit, you should delete messages from the queue after
 * they're processed. You can also increase the number of queues you use to
 * process your messages. To request a limit increase, <a href=
 * "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-sqs"
 * >file a support request</a>.
 * </p>
 * <p>
 * For FIFO queues, there can be a maximum of 20,000 inflight messages (received
 * from a queue by a consumer, but not yet deleted from the queue). If you reach
 * this limit, Amazon SQS returns no error messages.
 * </p>
 * <important>
 * <p>
 * If you attempt to set the <code>VisibilityTimeout</code> to a value greater
 * than the maximum time left, Amazon SQS returns an error. Amazon SQS doesn't
 * automatically recalculate and increase the timeout to the maximum remaining
 * time.
 * </p>
 * <p>
 * Unlike with a queue, when you change the visibility timeout for a specific
 * message the timeout value is applied immediately but isn't saved in memory
 * for that message. If you don't delete a message after it is received, the
 * visibility timeout for the message reverts to the original timeout value (not
 * to the value you set using the <code>ChangeMessageVisibility</code> action)
 * the next time the message is received.
 * </p>
 * </important>
 */
public class ChangeMessageVisibilityRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The URL of the Amazon SQS queue whose message's visibility is changed.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     */
    private String queueUrl;

    /**
     * <p>
     * The receipt handle associated with the message whose visibility timeout
     * is changed. This parameter is returned by the
     * <code> <a>ReceiveMessage</a> </code> action.
     * </p>
     */
    private String receiptHandle;

    /**
     * <p>
     * The new value for the message's visibility timeout (in seconds). Values
     * values: <code>0</code> to <code>43200</code>. Maximum: 12 hours.
     * </p>
     */
    private Integer visibilityTimeout;

    /**
     * <p>
     * The URL of the Amazon SQS queue whose message's visibility is changed.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     *
     * @return <p>
     *         The URL of the Amazon SQS queue whose message's visibility is
     *         changed.
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
     * The URL of the Amazon SQS queue whose message's visibility is changed.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     *
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue whose message's visibility is
     *            changed.
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
     * The URL of the Amazon SQS queue whose message's visibility is changed.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue whose message's visibility is
     *            changed.
     *            </p>
     *            <p>
     *            Queue URLs and names are case-sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeMessageVisibilityRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * <p>
     * The receipt handle associated with the message whose visibility timeout
     * is changed. This parameter is returned by the
     * <code> <a>ReceiveMessage</a> </code> action.
     * </p>
     *
     * @return <p>
     *         The receipt handle associated with the message whose visibility
     *         timeout is changed. This parameter is returned by the
     *         <code> <a>ReceiveMessage</a> </code> action.
     *         </p>
     */
    public String getReceiptHandle() {
        return receiptHandle;
    }

    /**
     * <p>
     * The receipt handle associated with the message whose visibility timeout
     * is changed. This parameter is returned by the
     * <code> <a>ReceiveMessage</a> </code> action.
     * </p>
     *
     * @param receiptHandle <p>
     *            The receipt handle associated with the message whose
     *            visibility timeout is changed. This parameter is returned by
     *            the <code> <a>ReceiveMessage</a> </code> action.
     *            </p>
     */
    public void setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
    }

    /**
     * <p>
     * The receipt handle associated with the message whose visibility timeout
     * is changed. This parameter is returned by the
     * <code> <a>ReceiveMessage</a> </code> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param receiptHandle <p>
     *            The receipt handle associated with the message whose
     *            visibility timeout is changed. This parameter is returned by
     *            the <code> <a>ReceiveMessage</a> </code> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeMessageVisibilityRequest withReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
        return this;
    }

    /**
     * <p>
     * The new value for the message's visibility timeout (in seconds). Values
     * values: <code>0</code> to <code>43200</code>. Maximum: 12 hours.
     * </p>
     *
     * @return <p>
     *         The new value for the message's visibility timeout (in seconds).
     *         Values values: <code>0</code> to <code>43200</code>. Maximum: 12
     *         hours.
     *         </p>
     */
    public Integer getVisibilityTimeout() {
        return visibilityTimeout;
    }

    /**
     * <p>
     * The new value for the message's visibility timeout (in seconds). Values
     * values: <code>0</code> to <code>43200</code>. Maximum: 12 hours.
     * </p>
     *
     * @param visibilityTimeout <p>
     *            The new value for the message's visibility timeout (in
     *            seconds). Values values: <code>0</code> to <code>43200</code>.
     *            Maximum: 12 hours.
     *            </p>
     */
    public void setVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
    }

    /**
     * <p>
     * The new value for the message's visibility timeout (in seconds). Values
     * values: <code>0</code> to <code>43200</code>. Maximum: 12 hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param visibilityTimeout <p>
     *            The new value for the message's visibility timeout (in
     *            seconds). Values values: <code>0</code> to <code>43200</code>.
     *            Maximum: 12 hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeMessageVisibilityRequest withVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
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
        if (getReceiptHandle() != null)
            sb.append("ReceiptHandle: " + getReceiptHandle() + ",");
        if (getVisibilityTimeout() != null)
            sb.append("VisibilityTimeout: " + getVisibilityTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        hashCode = prime * hashCode
                + ((getReceiptHandle() == null) ? 0 : getReceiptHandle().hashCode());
        hashCode = prime * hashCode
                + ((getVisibilityTimeout() == null) ? 0 : getVisibilityTimeout().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeMessageVisibilityRequest == false)
            return false;
        ChangeMessageVisibilityRequest other = (ChangeMessageVisibilityRequest) obj;

        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getReceiptHandle() == null ^ this.getReceiptHandle() == null)
            return false;
        if (other.getReceiptHandle() != null
                && other.getReceiptHandle().equals(this.getReceiptHandle()) == false)
            return false;
        if (other.getVisibilityTimeout() == null ^ this.getVisibilityTimeout() == null)
            return false;
        if (other.getVisibilityTimeout() != null
                && other.getVisibilityTimeout().equals(this.getVisibilityTimeout()) == false)
            return false;
        return true;
    }
}
