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
 * <important>
 * <p>
 * For an updated version of this API, see
 * <a>GetBucketLifecycleConfiguration</a>. If you configured a bucket lifecycle
 * using the <code>filter</code> element, you should see the updated version of
 * this topic. This topic is provided for backward compatibility.
 * </p>
 * </important>
 * <p>
 * Returns the lifecycle configuration information set on the bucket. For
 * information about lifecycle configuration, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html"
 * >Object Lifecycle Management</a>.
 * </p>
 * <p>
 * To use this operation, you must have permission to perform the
 * <code>s3:GetLifecycleConfiguration</code> action. The bucket owner has this
 * permission by default. The bucket owner can grant this permission to others.
 * For more information about permissions, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
 * >Permissions Related to Bucket Subresource Operations</a> and <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html"
 * >Managing Access Permissions to Your Amazon S3 Resources</a>.
 * </p>
 * <p>
 * <code>GetBucketLifecycle</code> has the following special error:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Error code: <code>NoSuchLifecycleConfiguration</code>
 * </p>
 * <ul>
 * <li>
 * <p>
 * Description: The lifecycle configuration does not exist.
 * </p>
 * </li>
 * <li>
 * <p>
 * HTTP Status Code: 404 Not Found
 * </p>
 * </li>
 * <li>
 * <p>
 * SOAP Fault Code Prefix: Client
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * The following operations are related to <code>GetBucketLifecycle</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetBucketLifecycleConfiguration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutBucketLifecycle</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBucketLifecycle</a>
 * </p>
 * </li>
 * </ul>
 */
public class GetBucketLifecycleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the bucket for which to get the lifecycle information.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The name of the bucket for which to get the lifecycle information.
     * </p>
     *
     * @return <p>
     *         The name of the bucket for which to get the lifecycle
     *         information.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the bucket for which to get the lifecycle information.
     * </p>
     *
     * @param bucket <p>
     *            The name of the bucket for which to get the lifecycle
     *            information.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket for which to get the lifecycle information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the bucket for which to get the lifecycle
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketLifecycleRequest withBucket(String bucket) {
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

        if (obj instanceof GetBucketLifecycleRequest == false)
            return false;
        GetBucketLifecycleRequest other = (GetBucketLifecycleRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        return true;
    }
}
