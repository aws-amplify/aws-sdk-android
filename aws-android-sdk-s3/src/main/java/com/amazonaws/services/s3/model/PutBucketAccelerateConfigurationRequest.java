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
 * Sets the accelerate configuration of an existing bucket. Amazon S3 Transfer
 * Acceleration is a bucket-level feature that enables you to perform faster
 * data transfers to Amazon S3.
 * </p>
 * <p>
 * To use this operation, you must have permission to perform the
 * s3:PutAccelerateConfiguration action. The bucket owner has this permission by
 * default. The bucket owner can grant this permission to others. For more
 * information about permissions, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
 * >Permissions Related to Bucket Subresource Operations</a> and <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html"
 * >Managing Access Permissions to Your Amazon S3 Resources</a>.
 * </p>
 * <p>
 * The Transfer Acceleration state of a bucket can be set to one of the
 * following two values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Enabled – Enables accelerated data transfers to the bucket.
 * </p>
 * </li>
 * <li>
 * <p>
 * Suspended – Disables accelerated data transfers to the bucket.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The <a>GetBucketAccelerateConfiguration</a> operation returns the transfer
 * acceleration state of a bucket.
 * </p>
 * <p>
 * After setting the Transfer Acceleration state of a bucket to Enabled, it
 * might take up to thirty minutes before the data transfer rates to the bucket
 * increase.
 * </p>
 * <p>
 * The name of the bucket used for Transfer Acceleration must be DNS-compliant
 * and must not contain periods (".").
 * </p>
 * <p>
 * For more information about transfer acceleration, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html"
 * >Transfer Acceleration</a>.
 * </p>
 * <p>
 * The following operations are related to
 * <code>PutBucketAccelerateConfiguration</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetBucketAccelerateConfiguration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateBucket</a>
 * </p>
 * </li>
 * </ul>
 */
public class PutBucketAccelerateConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Name of the bucket for which the accelerate configuration is set.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * Container for setting the transfer acceleration state.
     * </p>
     */
    private AccelerateConfiguration accelerateConfiguration;

    /**
     * <p>
     * Name of the bucket for which the accelerate configuration is set.
     * </p>
     *
     * @return <p>
     *         Name of the bucket for which the accelerate configuration is set.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * Name of the bucket for which the accelerate configuration is set.
     * </p>
     *
     * @param bucket <p>
     *            Name of the bucket for which the accelerate configuration is
     *            set.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * Name of the bucket for which the accelerate configuration is set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            Name of the bucket for which the accelerate configuration is
     *            set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketAccelerateConfigurationRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * Container for setting the transfer acceleration state.
     * </p>
     *
     * @return <p>
     *         Container for setting the transfer acceleration state.
     *         </p>
     */
    public AccelerateConfiguration getAccelerateConfiguration() {
        return accelerateConfiguration;
    }

    /**
     * <p>
     * Container for setting the transfer acceleration state.
     * </p>
     *
     * @param accelerateConfiguration <p>
     *            Container for setting the transfer acceleration state.
     *            </p>
     */
    public void setAccelerateConfiguration(AccelerateConfiguration accelerateConfiguration) {
        this.accelerateConfiguration = accelerateConfiguration;
    }

    /**
     * <p>
     * Container for setting the transfer acceleration state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accelerateConfiguration <p>
     *            Container for setting the transfer acceleration state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketAccelerateConfigurationRequest withAccelerateConfiguration(
            AccelerateConfiguration accelerateConfiguration) {
        this.accelerateConfiguration = accelerateConfiguration;
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
        if (getAccelerateConfiguration() != null)
            sb.append("AccelerateConfiguration: " + getAccelerateConfiguration());
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
                + ((getAccelerateConfiguration() == null) ? 0 : getAccelerateConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBucketAccelerateConfigurationRequest == false)
            return false;
        PutBucketAccelerateConfigurationRequest other = (PutBucketAccelerateConfigurationRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getAccelerateConfiguration() == null ^ this.getAccelerateConfiguration() == null)
            return false;
        if (other.getAccelerateConfiguration() != null
                && other.getAccelerateConfiguration().equals(this.getAccelerateConfiguration()) == false)
            return false;
        return true;
    }
}
