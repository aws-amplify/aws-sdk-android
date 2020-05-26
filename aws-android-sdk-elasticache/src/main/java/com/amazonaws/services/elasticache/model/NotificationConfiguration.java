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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a notification topic and its status. Notification topics are used
 * for publishing ElastiCache events to subscribers using Amazon Simple
 * Notification Service (SNS).
 * </p>
 */
public class NotificationConfiguration implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the topic.
     * </p>
     */
    private String topicArn;

    /**
     * <p>
     * The current state of the topic.
     * </p>
     */
    private String topicStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the topic.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that identifies the topic.
     *         </p>
     */
    public String getTopicArn() {
        return topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the topic.
     * </p>
     *
     * @param topicArn <p>
     *            The Amazon Resource Name (ARN) that identifies the topic.
     *            </p>
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicArn <p>
     *            The Amazon Resource Name (ARN) that identifies the topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotificationConfiguration withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * <p>
     * The current state of the topic.
     * </p>
     *
     * @return <p>
     *         The current state of the topic.
     *         </p>
     */
    public String getTopicStatus() {
        return topicStatus;
    }

    /**
     * <p>
     * The current state of the topic.
     * </p>
     *
     * @param topicStatus <p>
     *            The current state of the topic.
     *            </p>
     */
    public void setTopicStatus(String topicStatus) {
        this.topicStatus = topicStatus;
    }

    /**
     * <p>
     * The current state of the topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicStatus <p>
     *            The current state of the topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotificationConfiguration withTopicStatus(String topicStatus) {
        this.topicStatus = topicStatus;
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
        if (getTopicStatus() != null)
            sb.append("TopicStatus: " + getTopicStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode
                + ((getTopicStatus() == null) ? 0 : getTopicStatus().hashCode());
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

        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getTopicStatus() == null ^ this.getTopicStatus() == null)
            return false;
        if (other.getTopicStatus() != null
                && other.getTopicStatus().equals(this.getTopicStatus()) == false)
            return false;
        return true;
    }
}
