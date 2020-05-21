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
 * Returns the notification configuration of a bucket.
 * </p>
 * <p>
 * If notifications are not enabled on the bucket, the operation returns an
 * empty <code>NotificationConfiguration</code> element.
 * </p>
 * <p>
 * By default, you must be the bucket owner to read the notification
 * configuration of a bucket. However, the bucket owner can use a bucket policy
 * to grant permission to other users to read this configuration with the
 * <code>s3:GetBucketNotification</code> permission.
 * </p>
 * <p>
 * For more information about setting and reading the notification configuration
 * on a bucket, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
 * >Setting Up Notification of Bucket Events</a>. For more information about
 * bucket policies, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html"
 * >Using Bucket Policies</a>.
 * </p>
 * <p>
 * The following operation is related to <code>GetBucketNotification</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>PutBucketNotification</a>
 * </p>
 * </li>
 * </ul>
 */
public class GetBucketNotificationConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Name of the bucket for which to get the notification configuration.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * Name of the bucket for which to get the notification configuration.
     * </p>
     *
     * @return <p>
     *         Name of the bucket for which to get the notification
     *         configuration.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * Name of the bucket for which to get the notification configuration.
     * </p>
     *
     * @param bucket <p>
     *            Name of the bucket for which to get the notification
     *            configuration.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * Name of the bucket for which to get the notification configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            Name of the bucket for which to get the notification
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketNotificationConfigurationRequest withBucket(String bucket) {
        this.bucket = bucket;
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
            sb.append("Bucket: " + getBucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketNotificationConfigurationRequest == false)
            return false;
        GetBucketNotificationConfigurationRequest other = (GetBucketNotificationConfigurationRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        return true;
    }
}
