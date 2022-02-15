/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Publishes up to ten messages to the specified topic. This is a batch version
 * of <code>Publish</code>. For FIFO topics, multiple messages within a single
 * batch are published in the order they are sent, and messages are deduplicated
 * within the batch and across batches for 5 minutes.
 * </p>
 * <p>
 * The result of publishing each message is reported individually in the
 * response. Because the batch request can result in a combination of successful
 * and unsuccessful actions, you should check for batch errors even when the
 * call returns an HTTP status code of <code>200</code>.
 * </p>
 * <p>
 * The maximum allowed individual message size and the maximum total payload
 * size (the sum of the individual lengths of all of the batched messages) are
 * both 256 KB (262,144 bytes).
 * </p>
 * <p>
 * Some actions take lists of parameters. These lists are specified using the
 * <code>param.n</code> notation. Values of <code>n</code> are integers starting
 * from 1. For example, a parameter list with two elements looks like this:
 * </p>
 * <p>
 * &amp;AttributeName.1=first
 * </p>
 * <p>
 * &amp;AttributeName.2=second
 * </p>
 * <p>
 * If you send a batch message to a topic, Amazon SNS publishes the batch
 * message to each endpoint that is subscribed to the topic. The format of the
 * batch message depends on the notification protocol for each subscribed
 * endpoint.
 * </p>
 * <p>
 * When a <code>messageId</code> is returned, the batch message is saved and
 * Amazon SNS immediately delivers the message to subscribers.
 * </p>
 */
public class PublishBatchRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon resource name (ARN) of the topic you want to batch publish to.
     * </p>
     */
    private String topicArn;

    /**
     * <p>
     * A list of <code>PublishBatch</code> request entries to be sent to the SNS
     * topic.
     * </p>
     */
    private java.util.List<PublishBatchRequestEntry> publishBatchRequestEntries = new java.util.ArrayList<PublishBatchRequestEntry>();

    /**
     * <p>
     * The Amazon resource name (ARN) of the topic you want to batch publish to.
     * </p>
     *
     * @return <p>
     *         The Amazon resource name (ARN) of the topic you want to batch
     *         publish to.
     *         </p>
     */
    public String getTopicArn() {
        return topicArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the topic you want to batch publish to.
     * </p>
     *
     * @param topicArn <p>
     *            The Amazon resource name (ARN) of the topic you want to batch
     *            publish to.
     *            </p>
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the topic you want to batch publish to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicArn <p>
     *            The Amazon resource name (ARN) of the topic you want to batch
     *            publish to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishBatchRequest withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * <p>
     * A list of <code>PublishBatch</code> request entries to be sent to the SNS
     * topic.
     * </p>
     *
     * @return <p>
     *         A list of <code>PublishBatch</code> request entries to be sent to
     *         the SNS topic.
     *         </p>
     */
    public java.util.List<PublishBatchRequestEntry> getPublishBatchRequestEntries() {
        return publishBatchRequestEntries;
    }

    /**
     * <p>
     * A list of <code>PublishBatch</code> request entries to be sent to the SNS
     * topic.
     * </p>
     *
     * @param publishBatchRequestEntries <p>
     *            A list of <code>PublishBatch</code> request entries to be sent
     *            to the SNS topic.
     *            </p>
     */
    public void setPublishBatchRequestEntries(
            java.util.Collection<PublishBatchRequestEntry> publishBatchRequestEntries) {
        if (publishBatchRequestEntries == null) {
            this.publishBatchRequestEntries = null;
            return;
        }

        this.publishBatchRequestEntries = new java.util.ArrayList<PublishBatchRequestEntry>(
                publishBatchRequestEntries);
    }

    /**
     * <p>
     * A list of <code>PublishBatch</code> request entries to be sent to the SNS
     * topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publishBatchRequestEntries <p>
     *            A list of <code>PublishBatch</code> request entries to be sent
     *            to the SNS topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishBatchRequest withPublishBatchRequestEntries(
            PublishBatchRequestEntry... publishBatchRequestEntries) {
        if (getPublishBatchRequestEntries() == null) {
            this.publishBatchRequestEntries = new java.util.ArrayList<PublishBatchRequestEntry>(
                    publishBatchRequestEntries.length);
        }
        for (PublishBatchRequestEntry value : publishBatchRequestEntries) {
            this.publishBatchRequestEntries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>PublishBatch</code> request entries to be sent to the SNS
     * topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publishBatchRequestEntries <p>
     *            A list of <code>PublishBatch</code> request entries to be sent
     *            to the SNS topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishBatchRequest withPublishBatchRequestEntries(
            java.util.Collection<PublishBatchRequestEntry> publishBatchRequestEntries) {
        setPublishBatchRequestEntries(publishBatchRequestEntries);
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
        if (getTopicArn() != null)
            sb.append("TopicArn: " + getTopicArn() + ",");
        if (getPublishBatchRequestEntries() != null)
            sb.append("PublishBatchRequestEntries: " + getPublishBatchRequestEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getPublishBatchRequestEntries() == null) ? 0 : getPublishBatchRequestEntries()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublishBatchRequest == false)
            return false;
        PublishBatchRequest other = (PublishBatchRequest) obj;

        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getPublishBatchRequestEntries() == null
                ^ this.getPublishBatchRequestEntries() == null)
            return false;
        if (other.getPublishBatchRequestEntries() != null
                && other.getPublishBatchRequestEntries().equals(
                        this.getPublishBatchRequestEntries()) == false)
            return false;
        return true;
    }
}
