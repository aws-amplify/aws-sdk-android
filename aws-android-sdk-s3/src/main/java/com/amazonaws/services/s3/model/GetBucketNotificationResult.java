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

public class GetBucketNotificationResult implements Serializable {
    /**
     * <p>
     * This data type is deprecated. A container for specifying the
     * configuration for publication of messages to an Amazon Simple
     * Notification Service (Amazon SNS) topic when Amazon S3 detects specified
     * events.
     * </p>
     */
    private TopicConfigurationDeprecated topicConfiguration;

    /**
     * <p>
     * This data type is deprecated. This data type specifies the configuration
     * for publishing messages to an Amazon Simple Queue Service (Amazon SQS)
     * queue when Amazon S3 detects specified events.
     * </p>
     */
    private QueueConfigurationDeprecated queueConfiguration;

    /**
     * <p>
     * Container for specifying the AWS Lambda notification configuration.
     * </p>
     */
    private CloudFunctionConfiguration cloudFunctionConfiguration;

    /**
     * <p>
     * This data type is deprecated. A container for specifying the
     * configuration for publication of messages to an Amazon Simple
     * Notification Service (Amazon SNS) topic when Amazon S3 detects specified
     * events.
     * </p>
     *
     * @return <p>
     *         This data type is deprecated. A container for specifying the
     *         configuration for publication of messages to an Amazon Simple
     *         Notification Service (Amazon SNS) topic when Amazon S3 detects
     *         specified events.
     *         </p>
     */
    public TopicConfigurationDeprecated getTopicConfiguration() {
        return topicConfiguration;
    }

    /**
     * <p>
     * This data type is deprecated. A container for specifying the
     * configuration for publication of messages to an Amazon Simple
     * Notification Service (Amazon SNS) topic when Amazon S3 detects specified
     * events.
     * </p>
     *
     * @param topicConfiguration <p>
     *            This data type is deprecated. A container for specifying the
     *            configuration for publication of messages to an Amazon Simple
     *            Notification Service (Amazon SNS) topic when Amazon S3 detects
     *            specified events.
     *            </p>
     */
    public void setTopicConfiguration(TopicConfigurationDeprecated topicConfiguration) {
        this.topicConfiguration = topicConfiguration;
    }

    /**
     * <p>
     * This data type is deprecated. A container for specifying the
     * configuration for publication of messages to an Amazon Simple
     * Notification Service (Amazon SNS) topic when Amazon S3 detects specified
     * events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicConfiguration <p>
     *            This data type is deprecated. A container for specifying the
     *            configuration for publication of messages to an Amazon Simple
     *            Notification Service (Amazon SNS) topic when Amazon S3 detects
     *            specified events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketNotificationResult withTopicConfiguration(
            TopicConfigurationDeprecated topicConfiguration) {
        this.topicConfiguration = topicConfiguration;
        return this;
    }

    /**
     * <p>
     * This data type is deprecated. This data type specifies the configuration
     * for publishing messages to an Amazon Simple Queue Service (Amazon SQS)
     * queue when Amazon S3 detects specified events.
     * </p>
     *
     * @return <p>
     *         This data type is deprecated. This data type specifies the
     *         configuration for publishing messages to an Amazon Simple Queue
     *         Service (Amazon SQS) queue when Amazon S3 detects specified
     *         events.
     *         </p>
     */
    public QueueConfigurationDeprecated getQueueConfiguration() {
        return queueConfiguration;
    }

    /**
     * <p>
     * This data type is deprecated. This data type specifies the configuration
     * for publishing messages to an Amazon Simple Queue Service (Amazon SQS)
     * queue when Amazon S3 detects specified events.
     * </p>
     *
     * @param queueConfiguration <p>
     *            This data type is deprecated. This data type specifies the
     *            configuration for publishing messages to an Amazon Simple
     *            Queue Service (Amazon SQS) queue when Amazon S3 detects
     *            specified events.
     *            </p>
     */
    public void setQueueConfiguration(QueueConfigurationDeprecated queueConfiguration) {
        this.queueConfiguration = queueConfiguration;
    }

    /**
     * <p>
     * This data type is deprecated. This data type specifies the configuration
     * for publishing messages to an Amazon Simple Queue Service (Amazon SQS)
     * queue when Amazon S3 detects specified events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueConfiguration <p>
     *            This data type is deprecated. This data type specifies the
     *            configuration for publishing messages to an Amazon Simple
     *            Queue Service (Amazon SQS) queue when Amazon S3 detects
     *            specified events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketNotificationResult withQueueConfiguration(
            QueueConfigurationDeprecated queueConfiguration) {
        this.queueConfiguration = queueConfiguration;
        return this;
    }

    /**
     * <p>
     * Container for specifying the AWS Lambda notification configuration.
     * </p>
     *
     * @return <p>
     *         Container for specifying the AWS Lambda notification
     *         configuration.
     *         </p>
     */
    public CloudFunctionConfiguration getCloudFunctionConfiguration() {
        return cloudFunctionConfiguration;
    }

    /**
     * <p>
     * Container for specifying the AWS Lambda notification configuration.
     * </p>
     *
     * @param cloudFunctionConfiguration <p>
     *            Container for specifying the AWS Lambda notification
     *            configuration.
     *            </p>
     */
    public void setCloudFunctionConfiguration(CloudFunctionConfiguration cloudFunctionConfiguration) {
        this.cloudFunctionConfiguration = cloudFunctionConfiguration;
    }

    /**
     * <p>
     * Container for specifying the AWS Lambda notification configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudFunctionConfiguration <p>
     *            Container for specifying the AWS Lambda notification
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketNotificationResult withCloudFunctionConfiguration(
            CloudFunctionConfiguration cloudFunctionConfiguration) {
        this.cloudFunctionConfiguration = cloudFunctionConfiguration;
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
        if (getTopicConfiguration() != null)
            sb.append("TopicConfiguration: " + getTopicConfiguration() + ",");
        if (getQueueConfiguration() != null)
            sb.append("QueueConfiguration: " + getQueueConfiguration() + ",");
        if (getCloudFunctionConfiguration() != null)
            sb.append("CloudFunctionConfiguration: " + getCloudFunctionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTopicConfiguration() == null) ? 0 : getTopicConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getQueueConfiguration() == null) ? 0 : getQueueConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getCloudFunctionConfiguration() == null) ? 0 : getCloudFunctionConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketNotificationResult == false)
            return false;
        GetBucketNotificationResult other = (GetBucketNotificationResult) obj;

        if (other.getTopicConfiguration() == null ^ this.getTopicConfiguration() == null)
            return false;
        if (other.getTopicConfiguration() != null
                && other.getTopicConfiguration().equals(this.getTopicConfiguration()) == false)
            return false;
        if (other.getQueueConfiguration() == null ^ this.getQueueConfiguration() == null)
            return false;
        if (other.getQueueConfiguration() != null
                && other.getQueueConfiguration().equals(this.getQueueConfiguration()) == false)
            return false;
        if (other.getCloudFunctionConfiguration() == null
                ^ this.getCloudFunctionConfiguration() == null)
            return false;
        if (other.getCloudFunctionConfiguration() != null
                && other.getCloudFunctionConfiguration().equals(
                        this.getCloudFunctionConfiguration()) == false)
            return false;
        return true;
    }
}
