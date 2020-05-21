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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * A container for specifying the notification configuration of the bucket. If
 * this element is empty, notifications are turned off for the bucket.
 * </p>
 */
public class NotificationConfiguration implements Serializable {
    /**
     * <p>
     * The topic to which notifications are sent and the events for which
     * notifications are generated.
     * </p>
     */
    private java.util.List<TopicConfiguration> topicConfigurations;

    /**
     * <p>
     * The Amazon Simple Queue Service queues to publish messages to and the
     * events for which to publish messages.
     * </p>
     */
    private java.util.List<QueueConfiguration> queueConfigurations;

    /**
     * <p>
     * Describes the AWS Lambda functions to invoke and the events for which to
     * invoke them.
     * </p>
     */
    private java.util.List<LambdaFunctionConfiguration> lambdaFunctionConfigurations;

    /**
     * <p>
     * The topic to which notifications are sent and the events for which
     * notifications are generated.
     * </p>
     *
     * @return <p>
     *         The topic to which notifications are sent and the events for
     *         which notifications are generated.
     *         </p>
     */
    public java.util.List<TopicConfiguration> getTopicConfigurations() {
        return topicConfigurations;
    }

    /**
     * <p>
     * The topic to which notifications are sent and the events for which
     * notifications are generated.
     * </p>
     *
     * @param topicConfigurations <p>
     *            The topic to which notifications are sent and the events for
     *            which notifications are generated.
     *            </p>
     */
    public void setTopicConfigurations(java.util.Collection<TopicConfiguration> topicConfigurations) {
        if (topicConfigurations == null) {
            this.topicConfigurations = null;
            return;
        }

        this.topicConfigurations = new java.util.ArrayList<TopicConfiguration>(topicConfigurations);
    }

    /**
     * <p>
     * The topic to which notifications are sent and the events for which
     * notifications are generated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicConfigurations <p>
     *            The topic to which notifications are sent and the events for
     *            which notifications are generated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotificationConfiguration withTopicConfigurations(
            TopicConfiguration... topicConfigurations) {
        if (getTopicConfigurations() == null) {
            this.topicConfigurations = new java.util.ArrayList<TopicConfiguration>(
                    topicConfigurations.length);
        }
        for (TopicConfiguration value : topicConfigurations) {
            this.topicConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The topic to which notifications are sent and the events for which
     * notifications are generated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicConfigurations <p>
     *            The topic to which notifications are sent and the events for
     *            which notifications are generated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotificationConfiguration withTopicConfigurations(
            java.util.Collection<TopicConfiguration> topicConfigurations) {
        setTopicConfigurations(topicConfigurations);
        return this;
    }

    /**
     * <p>
     * The Amazon Simple Queue Service queues to publish messages to and the
     * events for which to publish messages.
     * </p>
     *
     * @return <p>
     *         The Amazon Simple Queue Service queues to publish messages to and
     *         the events for which to publish messages.
     *         </p>
     */
    public java.util.List<QueueConfiguration> getQueueConfigurations() {
        return queueConfigurations;
    }

    /**
     * <p>
     * The Amazon Simple Queue Service queues to publish messages to and the
     * events for which to publish messages.
     * </p>
     *
     * @param queueConfigurations <p>
     *            The Amazon Simple Queue Service queues to publish messages to
     *            and the events for which to publish messages.
     *            </p>
     */
    public void setQueueConfigurations(java.util.Collection<QueueConfiguration> queueConfigurations) {
        if (queueConfigurations == null) {
            this.queueConfigurations = null;
            return;
        }

        this.queueConfigurations = new java.util.ArrayList<QueueConfiguration>(queueConfigurations);
    }

    /**
     * <p>
     * The Amazon Simple Queue Service queues to publish messages to and the
     * events for which to publish messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueConfigurations <p>
     *            The Amazon Simple Queue Service queues to publish messages to
     *            and the events for which to publish messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotificationConfiguration withQueueConfigurations(
            QueueConfiguration... queueConfigurations) {
        if (getQueueConfigurations() == null) {
            this.queueConfigurations = new java.util.ArrayList<QueueConfiguration>(
                    queueConfigurations.length);
        }
        for (QueueConfiguration value : queueConfigurations) {
            this.queueConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Simple Queue Service queues to publish messages to and the
     * events for which to publish messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueConfigurations <p>
     *            The Amazon Simple Queue Service queues to publish messages to
     *            and the events for which to publish messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotificationConfiguration withQueueConfigurations(
            java.util.Collection<QueueConfiguration> queueConfigurations) {
        setQueueConfigurations(queueConfigurations);
        return this;
    }

    /**
     * <p>
     * Describes the AWS Lambda functions to invoke and the events for which to
     * invoke them.
     * </p>
     *
     * @return <p>
     *         Describes the AWS Lambda functions to invoke and the events for
     *         which to invoke them.
     *         </p>
     */
    public java.util.List<LambdaFunctionConfiguration> getLambdaFunctionConfigurations() {
        return lambdaFunctionConfigurations;
    }

    /**
     * <p>
     * Describes the AWS Lambda functions to invoke and the events for which to
     * invoke them.
     * </p>
     *
     * @param lambdaFunctionConfigurations <p>
     *            Describes the AWS Lambda functions to invoke and the events
     *            for which to invoke them.
     *            </p>
     */
    public void setLambdaFunctionConfigurations(
            java.util.Collection<LambdaFunctionConfiguration> lambdaFunctionConfigurations) {
        if (lambdaFunctionConfigurations == null) {
            this.lambdaFunctionConfigurations = null;
            return;
        }

        this.lambdaFunctionConfigurations = new java.util.ArrayList<LambdaFunctionConfiguration>(
                lambdaFunctionConfigurations);
    }

    /**
     * <p>
     * Describes the AWS Lambda functions to invoke and the events for which to
     * invoke them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambdaFunctionConfigurations <p>
     *            Describes the AWS Lambda functions to invoke and the events
     *            for which to invoke them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotificationConfiguration withLambdaFunctionConfigurations(
            LambdaFunctionConfiguration... lambdaFunctionConfigurations) {
        if (getLambdaFunctionConfigurations() == null) {
            this.lambdaFunctionConfigurations = new java.util.ArrayList<LambdaFunctionConfiguration>(
                    lambdaFunctionConfigurations.length);
        }
        for (LambdaFunctionConfiguration value : lambdaFunctionConfigurations) {
            this.lambdaFunctionConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Describes the AWS Lambda functions to invoke and the events for which to
     * invoke them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambdaFunctionConfigurations <p>
     *            Describes the AWS Lambda functions to invoke and the events
     *            for which to invoke them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotificationConfiguration withLambdaFunctionConfigurations(
            java.util.Collection<LambdaFunctionConfiguration> lambdaFunctionConfigurations) {
        setLambdaFunctionConfigurations(lambdaFunctionConfigurations);
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
        if (getTopicConfigurations() != null)
            sb.append("TopicConfigurations: " + getTopicConfigurations() + ",");
        if (getQueueConfigurations() != null)
            sb.append("QueueConfigurations: " + getQueueConfigurations() + ",");
        if (getLambdaFunctionConfigurations() != null)
            sb.append("LambdaFunctionConfigurations: " + getLambdaFunctionConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTopicConfigurations() == null) ? 0 : getTopicConfigurations().hashCode());
        hashCode = prime * hashCode
                + ((getQueueConfigurations() == null) ? 0 : getQueueConfigurations().hashCode());
        hashCode = prime
                * hashCode
                + ((getLambdaFunctionConfigurations() == null) ? 0
                        : getLambdaFunctionConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationConfiguration == false)
            return false;
        NotificationConfiguration other = (NotificationConfiguration) obj;

        if (other.getTopicConfigurations() == null ^ this.getTopicConfigurations() == null)
            return false;
        if (other.getTopicConfigurations() != null
                && other.getTopicConfigurations().equals(this.getTopicConfigurations()) == false)
            return false;
        if (other.getQueueConfigurations() == null ^ this.getQueueConfigurations() == null)
            return false;
        if (other.getQueueConfigurations() != null
                && other.getQueueConfigurations().equals(this.getQueueConfigurations()) == false)
            return false;
        if (other.getLambdaFunctionConfigurations() == null
                ^ this.getLambdaFunctionConfigurations() == null)
            return false;
        if (other.getLambdaFunctionConfigurations() != null
                && other.getLambdaFunctionConfigurations().equals(
                        this.getLambdaFunctionConfigurations()) == false)
            return false;
        return true;
    }
}
