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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Enables notifications of specified events for a bucket. For more information
 * about event notifications, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
 * >Configuring Event Notifications</a>.
 * </p>
 * <p>
 * Using this API, you can replace an existing notification configuration. The
 * configuration is an XML file that defines the event types that you want
 * Amazon S3 to publish and the destination where you want Amazon S3 to publish
 * an event notification when it detects an event of the specified type.
 * </p>
 * <p>
 * By default, your bucket has no event notifications configured. That is, the
 * notification configuration will be an empty
 * <code>NotificationConfiguration</code>.
 * </p>
 * <p>
 * <code>&lt;NotificationConfiguration&gt;</code>
 * </p>
 * <p>
 * <code>&lt;/NotificationConfiguration&gt;</code>
 * </p>
 * <p>
 * This operation replaces the existing notification configuration with the
 * configuration you include in the request body.
 * </p>
 * <p>
 * After Amazon S3 receives this request, it first verifies that any Amazon
 * Simple Notification Service (Amazon SNS) or Amazon Simple Queue Service
 * (Amazon SQS) destination exists, and that the bucket owner has permission to
 * publish to it by sending a test notification. In the case of AWS Lambda
 * destinations, Amazon S3 verifies that the Lambda function permissions grant
 * Amazon S3 permission to invoke the function from the Amazon S3 bucket. For
 * more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
 * >Configuring Notifications for Amazon S3 Events</a>.
 * </p>
 * <p>
 * You can disable notifications by adding the empty NotificationConfiguration
 * element.
 * </p>
 * <p>
 * By default, only the bucket owner can configure notifications on a bucket.
 * However, bucket owners can use a bucket policy to grant permission to other
 * users to set this configuration with <code>s3:PutBucketNotification</code>
 * permission.
 * </p>
 * <note>
 * <p>
 * The PUT notification is an atomic operation. For example, suppose your
 * notification configuration includes SNS topic, SQS queue, and Lambda function
 * configurations. When you send a PUT request with this configuration, Amazon
 * S3 sends test messages to your SNS topic. If the message fails, the entire
 * PUT operation will fail, and Amazon S3 will not add the configuration to your
 * bucket.
 * </p>
 * </note>
 * <p>
 * <b>Responses</b>
 * </p>
 * <p>
 * If the configuration in the request body includes only one
 * <code>TopicConfiguration</code> specifying only the
 * <code>s3:ReducedRedundancyLostObject</code> event type, the response will
 * also include the <code>x-amz-sns-test-message-id</code> header containing the
 * message ID of the test notification sent to the topic.
 * </p>
 * <p>
 * The following operation is related to
 * <code>PutBucketNotificationConfiguration</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetBucketNotificationConfiguration</a>
 * </p>
 * </li>
 * </ul>
 */
public class PutBucketNotificationConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the bucket.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * A container for specifying the notification configuration of the bucket.
     * If this element is empty, notifications are turned off for the bucket.
     * </p>
     */
    private NotificationConfiguration notificationConfiguration;

    /**
     * <p>
     * The name of the bucket.
     * </p>
     *
     * @return <p>
     *         The name of the bucket.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     *
     * @param bucket <p>
     *            The name of the bucket.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketNotificationConfigurationRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * A container for specifying the notification configuration of the bucket.
     * If this element is empty, notifications are turned off for the bucket.
     * </p>
     *
     * @return <p>
     *         A container for specifying the notification configuration of the
     *         bucket. If this element is empty, notifications are turned off
     *         for the bucket.
     *         </p>
     */
    public NotificationConfiguration getNotificationConfiguration() {
        return notificationConfiguration;
    }

    /**
     * <p>
     * A container for specifying the notification configuration of the bucket.
     * If this element is empty, notifications are turned off for the bucket.
     * </p>
     *
     * @param notificationConfiguration <p>
     *            A container for specifying the notification configuration of
     *            the bucket. If this element is empty, notifications are turned
     *            off for the bucket.
     *            </p>
     */
    public void setNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    /**
     * <p>
     * A container for specifying the notification configuration of the bucket.
     * If this element is empty, notifications are turned off for the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationConfiguration <p>
     *            A container for specifying the notification configuration of
     *            the bucket. If this element is empty, notifications are turned
     *            off for the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketNotificationConfigurationRequest withNotificationConfiguration(
            NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
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
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket() + ",");
        if (getNotificationConfiguration() != null)
            sb.append("NotificationConfiguration: " + getNotificationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime
                * hashCode
                + ((getNotificationConfiguration() == null) ? 0 : getNotificationConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBucketNotificationConfigurationRequest == false)
            return false;
        PutBucketNotificationConfigurationRequest other = (PutBucketNotificationConfigurationRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getNotificationConfiguration() == null
                ^ this.getNotificationConfiguration() == null)
            return false;
        if (other.getNotificationConfiguration() != null
                && other.getNotificationConfiguration().equals(this.getNotificationConfiguration()) == false)
            return false;
        return true;
    }
}
