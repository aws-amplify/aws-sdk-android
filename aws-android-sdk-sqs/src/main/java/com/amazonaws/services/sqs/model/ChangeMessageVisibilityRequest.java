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
 * Changes the visibility timeout of a specified message in a queue to a new
 * value. The maximum allowed timeout value you can set the value to is 12
 * hours. This means you can't extend the timeout of a message in an existing
 * queue to more than a total visibility timeout of 12 hours. (For more
 * information visibility timeout, see <a href=
 * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
 * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.)
 * </p>
 * <p>
 * For example, let's say you have a message and its default message visibility
 * timeout is 5 minutes. After 3 minutes, you call
 * <code>ChangeMessageVisiblity</code> with a timeout of 10 minutes. At that
 * time, the timeout for the message would be extended by 10 minutes beyond the
 * time of the ChangeMessageVisibility call. This results in a total visibility
 * timeout of 13 minutes. You can continue to call ChangeMessageVisibility to
 * extend the visibility timeout to a maximum of 12 hours. If you try to extend
 * beyond 12 hours, the request will be rejected.
 * </p>
 * <note>
 * <p>
 * There is a 120,000 limit for the number of inflight messages per queue.
 * Messages are inflight after they have been received from the queue by a
 * consuming component, but have not yet been deleted from the queue. If you
 * reach the 120,000 limit, you will receive an OverLimit error message from
 * Amazon SQS. To help avoid reaching the limit, you should delete the messages
 * from the queue after they have been processed. You can also increase the
 * number of queues you use to process the messages.
 * </p>
 * </note> <important>
 * <p>
 * If you attempt to set the <code>VisibilityTimeout</code> to an amount more
 * than the maximum time left, Amazon SQS returns an error. It will not
 * automatically recalculate and increase the timeout to the maximum time
 * remaining.
 * </p>
 * </important> <important>
 * <p>
 * Unlike with a queue, when you change the visibility timeout for a specific
 * message, that timeout value is applied immediately but is not saved in memory
 * for that message. If you don't delete a message after it is received, the
 * visibility timeout for the message the next time it is received reverts to
 * the original timeout value, not the value you set with the
 * <code>ChangeMessageVisibility</code> action.
 * </p>
 * </important>
 */
public class ChangeMessageVisibilityRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The receipt handle associated with the message whose visibility timeout
     * should be changed. This parameter is returned by the
     * <a>ReceiveMessage</a> action.
     * </p>
     */
    private String receiptHandle;

    /**
     * <p>
     * The new value (in seconds - from 0 to 43200 - maximum 12 hours) for the
     * message's visibility timeout.
     * </p>
     */
    private Integer visibilityTimeout;

    /**
     * Default constructor for ChangeMessageVisibilityRequest object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     */
    public ChangeMessageVisibilityRequest() {
    }

    /**
     * Constructs a new ChangeMessageVisibilityRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to take action on.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     * @param receiptHandle <p>
     *            The receipt handle associated with the message whose
     *            visibility timeout should be changed. This parameter is
     *            returned by the <a>ReceiveMessage</a> action.
     *            </p>
     * @param visibilityTimeout <p>
     *            The new value (in seconds - from 0 to 43200 - maximum 12
     *            hours) for the message's visibility timeout.
     *            </p>
     */
    public ChangeMessageVisibilityRequest(String queueUrl, String receiptHandle,
            Integer visibilityTimeout) {
        setQueueUrl(queueUrl);
        setReceiptHandle(receiptHandle);
        setVisibilityTimeout(visibilityTimeout);
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
    public ChangeMessageVisibilityRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * <p>
     * The receipt handle associated with the message whose visibility timeout
     * should be changed. This parameter is returned by the
     * <a>ReceiveMessage</a> action.
     * </p>
     *
     * @return <p>
     *         The receipt handle associated with the message whose visibility
     *         timeout should be changed. This parameter is returned by the
     *         <a>ReceiveMessage</a> action.
     *         </p>
     */
    public String getReceiptHandle() {
        return receiptHandle;
    }

    /**
     * <p>
     * The receipt handle associated with the message whose visibility timeout
     * should be changed. This parameter is returned by the
     * <a>ReceiveMessage</a> action.
     * </p>
     *
     * @param receiptHandle <p>
     *            The receipt handle associated with the message whose
     *            visibility timeout should be changed. This parameter is
     *            returned by the <a>ReceiveMessage</a> action.
     *            </p>
     */
    public void setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
    }

    /**
     * <p>
     * The receipt handle associated with the message whose visibility timeout
     * should be changed. This parameter is returned by the
     * <a>ReceiveMessage</a> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param receiptHandle <p>
     *            The receipt handle associated with the message whose
     *            visibility timeout should be changed. This parameter is
     *            returned by the <a>ReceiveMessage</a> action.
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
     * The new value (in seconds - from 0 to 43200 - maximum 12 hours) for the
     * message's visibility timeout.
     * </p>
     *
     * @return <p>
     *         The new value (in seconds - from 0 to 43200 - maximum 12 hours)
     *         for the message's visibility timeout.
     *         </p>
     */
    public Integer getVisibilityTimeout() {
        return visibilityTimeout;
    }

    /**
     * <p>
     * The new value (in seconds - from 0 to 43200 - maximum 12 hours) for the
     * message's visibility timeout.
     * </p>
     *
     * @param visibilityTimeout <p>
     *            The new value (in seconds - from 0 to 43200 - maximum 12
     *            hours) for the message's visibility timeout.
     *            </p>
     */
    public void setVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
    }

    /**
     * <p>
     * The new value (in seconds - from 0 to 43200 - maximum 12 hours) for the
     * message's visibility timeout.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param visibilityTimeout <p>
     *            The new value (in seconds - from 0 to 43200 - maximum 12
     *            hours) for the message's visibility timeout.
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
