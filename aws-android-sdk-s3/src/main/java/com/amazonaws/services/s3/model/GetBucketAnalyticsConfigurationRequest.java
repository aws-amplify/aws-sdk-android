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
 * This implementation of the GET operation returns an analytics configuration
 * (identified by the analytics configuration ID) from the bucket.
 * </p>
 * <p>
 * To use this operation, you must have permissions to perform the
 * <code>s3:GetAnalyticsConfiguration</code> action. The bucket owner has this
 * permission by default. The bucket owner can grant this permission to others.
 * For more information about permissions, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
 * > Permissions Related to Bucket Subresource Operations</a> and <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html"
 * >Managing Access Permissions to Your Amazon S3 Resources</a> in the <i>Amazon
 * Simple Storage Service Developer Guide</i>.
 * </p>
 * <p>
 * For information about Amazon S3 analytics feature, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/analytics-storage-class.html"
 * >Amazon S3 Analytics – Storage Class Analysis</a> in the <i>Amazon Simple
 * Storage Service Developer Guide</i>.
 * </p>
 * <p class="title">
 * <b>Related Resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * </p></li>
 * <li>
 * <p>
 * </p></li>
 * <li>
 * <p>
 * </p></li>
 * </ul>
 */
public class GetBucketAnalyticsConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the bucket from which an analytics configuration is
     * retrieved.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The ID that identifies the analytics configuration.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The name of the bucket from which an analytics configuration is
     * retrieved.
     * </p>
     *
     * @return <p>
     *         The name of the bucket from which an analytics configuration is
     *         retrieved.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the bucket from which an analytics configuration is
     * retrieved.
     * </p>
     *
     * @param bucket <p>
     *            The name of the bucket from which an analytics configuration
     *            is retrieved.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket from which an analytics configuration is
     * retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the bucket from which an analytics configuration
     *            is retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketAnalyticsConfigurationRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The ID that identifies the analytics configuration.
     * </p>
     *
     * @return <p>
     *         The ID that identifies the analytics configuration.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID that identifies the analytics configuration.
     * </p>
     *
     * @param id <p>
     *            The ID that identifies the analytics configuration.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID that identifies the analytics configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The ID that identifies the analytics configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketAnalyticsConfigurationRequest withId(String id) {
        this.id = id;
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
        if (getId() != null)
            sb.append("Id: " + getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketAnalyticsConfigurationRequest == false)
            return false;
        GetBucketAnalyticsConfigurationRequest other = (GetBucketAnalyticsConfigurationRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }
}
