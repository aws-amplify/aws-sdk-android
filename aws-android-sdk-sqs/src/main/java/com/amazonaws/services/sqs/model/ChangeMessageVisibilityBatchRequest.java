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
 * Changes the visibility timeout of multiple messages. This is a batch version
 * of <a>ChangeMessageVisibility</a>. The result of the action on each message
 * is reported individually in the response. You can send up to 10
 * <a>ChangeMessageVisibility</a> requests with each
 * <code>ChangeMessageVisibilityBatch</code> action.
 * </p>
 * <important>
 * <p>
 * Because the batch request can result in a combination of successful and
 * unsuccessful actions, you should check for batch errors even when the call
 * returns an HTTP status code of 200.
 * </p>
 * </important> <note>
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
public class ChangeMessageVisibilityBatchRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * A list of receipt handles of the messages for which the visibility
     * timeout must be changed.
     * </p>
     */
    private java.util.List<ChangeMessageVisibilityBatchRequestEntry> entries = new java.util.ArrayList<ChangeMessageVisibilityBatchRequestEntry>();

    /**
     * Default constructor for ChangeMessageVisibilityBatchRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     */
    public ChangeMessageVisibilityBatchRequest() {
    }

    /**
     * Constructs a new ChangeMessageVisibilityBatchRequest object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     * 
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to take action on.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     * @param entries <p>
     *            A list of receipt handles of the messages for which the
     *            visibility timeout must be changed.
     *            </p>
     */
    public ChangeMessageVisibilityBatchRequest(String queueUrl,
            java.util.List<ChangeMessageVisibilityBatchRequestEntry> entries) {
        setQueueUrl(queueUrl);
        setEntries(entries);
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
    public ChangeMessageVisibilityBatchRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * <p>
     * A list of receipt handles of the messages for which the visibility
     * timeout must be changed.
     * </p>
     *
     * @return <p>
     *         A list of receipt handles of the messages for which the
     *         visibility timeout must be changed.
     *         </p>
     */
    public java.util.List<ChangeMessageVisibilityBatchRequestEntry> getEntries() {
        return entries;
    }

    /**
     * <p>
     * A list of receipt handles of the messages for which the visibility
     * timeout must be changed.
     * </p>
     *
     * @param entries <p>
     *            A list of receipt handles of the messages for which the
     *            visibility timeout must be changed.
     *            </p>
     */
    public void setEntries(java.util.Collection<ChangeMessageVisibilityBatchRequestEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<ChangeMessageVisibilityBatchRequestEntry>(entries);
    }

    /**
     * <p>
     * A list of receipt handles of the messages for which the visibility
     * timeout must be changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entries <p>
     *            A list of receipt handles of the messages for which the
     *            visibility timeout must be changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeMessageVisibilityBatchRequest withEntries(
            ChangeMessageVisibilityBatchRequestEntry... entries) {
        if (getEntries() == null) {
            this.entries = new java.util.ArrayList<ChangeMessageVisibilityBatchRequestEntry>(
                    entries.length);
        }
        for (ChangeMessageVisibilityBatchRequestEntry value : entries) {
            this.entries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of receipt handles of the messages for which the visibility
     * timeout must be changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entries <p>
     *            A list of receipt handles of the messages for which the
     *            visibility timeout must be changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeMessageVisibilityBatchRequest withEntries(
            java.util.Collection<ChangeMessageVisibilityBatchRequestEntry> entries) {
        setEntries(entries);
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
        if (getEntries() != null)
            sb.append("Entries: " + getEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeMessageVisibilityBatchRequest == false)
            return false;
        ChangeMessageVisibilityBatchRequest other = (ChangeMessageVisibilityBatchRequest) obj;

        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
            return false;
        return true;
    }
}
