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
 * Deletes the messages in a queue specified by the <b>queue URL</b>.
 * </p>
 * <important>
 * <p>
 * When you use the <code>PurgeQueue</code> API, the deleted messages in the
 * queue can't be retrieved.
 * </p>
 * </important>
 * <p>
 * When you purge a queue, the message deletion process takes up to 60 seconds.
 * All messages sent to the queue before calling <code>PurgeQueue</code> will be
 * deleted; messages sent to the queue while it is being purged might be
 * deleted. While the queue is being purged, messages sent to the queue before
 * <code>PurgeQueue</code> was called might be received, but will be deleted
 * within the next minute.
 * </p>
 */
public class PurgeQueueRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The queue URL of the queue to delete the messages from when using the
     * <code>PurgeQueue</code> API.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     */
    private String queueUrl;

    /**
     * Default constructor for PurgeQueueRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     */
    public PurgeQueueRequest() {
    }

    /**
     * Constructs a new PurgeQueueRequest object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param queueUrl <p>
     *            The queue URL of the queue to delete the messages from when
     *            using the <code>PurgeQueue</code> API.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     */
    public PurgeQueueRequest(String queueUrl) {
        setQueueUrl(queueUrl);
    }

    /**
     * <p>
     * The queue URL of the queue to delete the messages from when using the
     * <code>PurgeQueue</code> API.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     *
     * @return <p>
     *         The queue URL of the queue to delete the messages from when using
     *         the <code>PurgeQueue</code> API.
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
     * The queue URL of the queue to delete the messages from when using the
     * <code>PurgeQueue</code> API.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     *
     * @param queueUrl <p>
     *            The queue URL of the queue to delete the messages from when
     *            using the <code>PurgeQueue</code> API.
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
     * The queue URL of the queue to delete the messages from when using the
     * <code>PurgeQueue</code> API.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueUrl <p>
     *            The queue URL of the queue to delete the messages from when
     *            using the <code>PurgeQueue</code> API.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurgeQueueRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
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
            sb.append("QueueUrl: " + getQueueUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurgeQueueRequest == false)
            return false;
        PurgeQueueRequest other = (PurgeQueueRequest) obj;

        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        return true;
    }
}
