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
 * This implementation of the GET operation uses the <code>accelerate</code>
 * subresource to return the Transfer Acceleration state of a bucket, which is
 * either <code>Enabled</code> or <code>Suspended</code>. Amazon S3 Transfer
 * Acceleration is a bucket-level feature that enables you to perform faster
 * data transfers to and from Amazon S3.
 * </p>
 * <p>
 * To use this operation, you must have permission to perform the
 * <code>s3:GetAccelerateConfiguration</code> action. The bucket owner has this
 * permission by default. The bucket owner can grant this permission to others.
 * For more information about permissions, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
 * >Permissions Related to Bucket Subresource Operations</a> and <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html"
 * >Managing Access Permissions to your Amazon S3 Resources</a> in the <i>Amazon
 * Simple Storage Service Developer Guide</i>.
 * </p>
 * <p>
 * You set the Transfer Acceleration state of an existing bucket to
 * <code>Enabled</code> or <code>Suspended</code> by using the
 * <a>PutBucketAccelerateConfiguration</a> operation.
 * </p>
 * <p>
 * A GET <code>accelerate</code> request does not return a state value for a
 * bucket that has no transfer acceleration state. A bucket has no Transfer
 * Acceleration state if a state has never been set on the bucket.
 * </p>
 * <p>
 * For more information about transfer acceleration, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html"
 * >Transfer Acceleration</a> in the Amazon Simple Storage Service Developer
 * Guide.
 * </p>
 * <p class="title">
 * <b>Related Resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>PutBucketAccelerateConfiguration</a>
 * </p>
 * </li>
 * </ul>
 */
public class GetBucketAccelerateConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Name of the bucket for which the accelerate configuration is retrieved.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * Name of the bucket for which the accelerate configuration is retrieved.
     * </p>
     *
     * @return <p>
     *         Name of the bucket for which the accelerate configuration is
     *         retrieved.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * Name of the bucket for which the accelerate configuration is retrieved.
     * </p>
     *
     * @param bucket <p>
     *            Name of the bucket for which the accelerate configuration is
     *            retrieved.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * Name of the bucket for which the accelerate configuration is retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            Name of the bucket for which the accelerate configuration is
     *            retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketAccelerateConfigurationRequest withBucket(String bucket) {
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

        if (obj instanceof GetBucketAccelerateConfigurationRequest == false)
            return false;
        GetBucketAccelerateConfigurationRequest other = (GetBucketAccelerateConfigurationRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        return true;
    }
}
