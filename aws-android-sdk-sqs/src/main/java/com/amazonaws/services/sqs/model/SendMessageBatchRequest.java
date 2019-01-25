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
 * Delivers up to ten messages to the specified queue. This is a batch version
 * of <code> <a>SendMessage</a> </code>. For a FIFO queue, multiple messages
 * within a single batch are enqueued in the order they are sent.
 * </p>
 * <p>
 * The result of sending each message is reported individually in the response.
 * Because the batch request can result in a combination of successful and
 * unsuccessful actions, you should check for batch errors even when the call
 * returns an HTTP status code of 200.
 * </p>
 * <p>
 * The maximum allowed individual message size and the maximum total payload
 * size (the sum of the individual lengths of all of the batched messages) are
 * both 256 KB (262,144 bytes).
 * </p>
 * <important>
 * <p>
 * The following list shows the characters (in Unicode) that are allowed in your
 * message, according to the W3C XML specification:
 * </p>
 * <p>
 * <code>#x9</code> | <code>#xA</code> | <code>#xD</code> | [<code>#x20</code>
 * to <code>#xD7FF</code>] | [<code>#xE000</code> to <code>#xFFFD</code>] | [
 * <code>#x10000</code> to <code>#x10FFFF</code>]
 * </p>
 * <p>
 * For more information, see <a
 * href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>. If you send any
 * characters that aren't included in this list, your request will be rejected.
 * </p>
 * </important>
 * <p>
 * If you don't specify the <code>DelaySeconds</code> parameter for an entry,
 * Amazon SQS uses the default for the queue.
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
public class SendMessageBatchRequest extends AmazonWebServiceRequest implements Serializable {
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
     * A list of <a>SendMessageBatchRequestEntry</a> items.
     * </p>
     */
    private java.util.List<SendMessageBatchRequestEntry> entries = new java.util.ArrayList<SendMessageBatchRequestEntry>();

    /**
     * Default constructor for SendMessageBatchRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     */
    public SendMessageBatchRequest() {
    }

    /**
     * Constructs a new SendMessageBatchRequest object. Callers should use the
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
    public SendMessageBatchRequest(String queueUrl) {
        setQueueUrl(queueUrl);
    }

    /**
     * Constructs a new SendMessageBatchRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to take action on.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     * @param entries <p>
     *            A list of <a>SendMessageBatchRequestEntry</a> items.
     *            </p>
     */
    public SendMessageBatchRequest(String queueUrl,
            java.util.List<SendMessageBatchRequestEntry> entries) {
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
    public SendMessageBatchRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * <p>
     * A list of <a>SendMessageBatchRequestEntry</a> items.
     * </p>
     *
     * @return <p>
     *         A list of <a>SendMessageBatchRequestEntry</a> items.
     *         </p>
     */
    public java.util.List<SendMessageBatchRequestEntry> getEntries() {
        return entries;
    }

    /**
     * <p>
     * A list of <a>SendMessageBatchRequestEntry</a> items.
     * </p>
     *
     * @param entries <p>
     *            A list of <a>SendMessageBatchRequestEntry</a> items.
     *            </p>
     */
    public void setEntries(java.util.Collection<SendMessageBatchRequestEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<SendMessageBatchRequestEntry>(entries);
    }

    /**
     * <p>
     * A list of <a>SendMessageBatchRequestEntry</a> items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entries <p>
     *            A list of <a>SendMessageBatchRequestEntry</a> items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageBatchRequest withEntries(SendMessageBatchRequestEntry... entries) {
        if (getEntries() == null) {
            this.entries = new java.util.ArrayList<SendMessageBatchRequestEntry>(entries.length);
        }
        for (SendMessageBatchRequestEntry value : entries) {
            this.entries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>SendMessageBatchRequestEntry</a> items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entries <p>
     *            A list of <a>SendMessageBatchRequestEntry</a> items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageBatchRequest withEntries(
            java.util.Collection<SendMessageBatchRequestEntry> entries) {
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

        if (obj instanceof SendMessageBatchRequest == false)
            return false;
        SendMessageBatchRequest other = (SendMessageBatchRequest) obj;

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
