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
 * Deletes the messages in a queue specified by the <code>QueueURL</code>
 * parameter.
 * </p>
 * <important>
 * <p>
 * When you use the <code>PurgeQueue</code> action, you can't retrieve any
 * messages deleted from a queue.
 * </p>
 * <p>
 * The message deletion process takes up to 60 seconds. We recommend waiting for
 * 60 seconds regardless of your queue's size.
 * </p>
 * </important>
 * <p>
 * Messages sent to the queue <i>before</i> you call <code>PurgeQueue</code>
 * might be received but are deleted within the next minute.
 * </p>
 * <p>
 * Messages sent to the queue <i>after</i> you call <code>PurgeQueue</code>
 * might be deleted while the queue is being purged.
 * </p>
 */
public class PurgeQueueRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The URL of the queue from which the <code>PurgeQueue</code> action
     * deletes messages.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     */
    private String queueUrl;

    /**
     * <p>
     * The URL of the queue from which the <code>PurgeQueue</code> action
     * deletes messages.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     *
     * @return <p>
     *         The URL of the queue from which the <code>PurgeQueue</code>
     *         action deletes messages.
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
     * The URL of the queue from which the <code>PurgeQueue</code> action
     * deletes messages.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     *
     * @param queueUrl <p>
     *            The URL of the queue from which the <code>PurgeQueue</code>
     *            action deletes messages.
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
     * The URL of the queue from which the <code>PurgeQueue</code> action
     * deletes messages.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueUrl <p>
     *            The URL of the queue from which the <code>PurgeQueue</code>
     *            action deletes messages.
     *            </p>
     *            <p>
     *            Queue URLs and names are case-sensitive.
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
