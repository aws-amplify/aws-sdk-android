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
 * No longer used, see the <a>PutBucketNotificationConfiguration</a> operation.
 * </p>
 */
public class PutBucketNotificationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the bucket.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The MD5 hash of the <code>PutPublicAccessBlock</code> request body.
     * </p>
     */
    private String contentMD5;

    /**
     * <p>
     * The container for the configuration.
     * </p>
     */
    private NotificationConfigurationDeprecated notificationConfiguration;

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
    public PutBucketNotificationRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The MD5 hash of the <code>PutPublicAccessBlock</code> request body.
     * </p>
     *
     * @return <p>
     *         The MD5 hash of the <code>PutPublicAccessBlock</code> request
     *         body.
     *         </p>
     */
    public String getContentMD5() {
        return contentMD5;
    }

    /**
     * <p>
     * The MD5 hash of the <code>PutPublicAccessBlock</code> request body.
     * </p>
     *
     * @param contentMD5 <p>
     *            The MD5 hash of the <code>PutPublicAccessBlock</code> request
     *            body.
     *            </p>
     */
    public void setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
    }

    /**
     * <p>
     * The MD5 hash of the <code>PutPublicAccessBlock</code> request body.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentMD5 <p>
     *            The MD5 hash of the <code>PutPublicAccessBlock</code> request
     *            body.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketNotificationRequest withContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * <p>
     * The container for the configuration.
     * </p>
     *
     * @return <p>
     *         The container for the configuration.
     *         </p>
     */
    public NotificationConfigurationDeprecated getNotificationConfiguration() {
        return notificationConfiguration;
    }

    /**
     * <p>
     * The container for the configuration.
     * </p>
     *
     * @param notificationConfiguration <p>
     *            The container for the configuration.
     *            </p>
     */
    public void setNotificationConfiguration(
            NotificationConfigurationDeprecated notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    /**
     * <p>
     * The container for the configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationConfiguration <p>
     *            The container for the configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketNotificationRequest withNotificationConfiguration(
            NotificationConfigurationDeprecated notificationConfiguration) {
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
        if (getContentMD5() != null)
            sb.append("ContentMD5: " + getContentMD5() + ",");
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
        hashCode = prime * hashCode + ((getContentMD5() == null) ? 0 : getContentMD5().hashCode());
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

        if (obj instanceof PutBucketNotificationRequest == false)
            return false;
        PutBucketNotificationRequest other = (PutBucketNotificationRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getContentMD5() == null ^ this.getContentMD5() == null)
            return false;
        if (other.getContentMD5() != null
                && other.getContentMD5().equals(this.getContentMD5()) == false)
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
