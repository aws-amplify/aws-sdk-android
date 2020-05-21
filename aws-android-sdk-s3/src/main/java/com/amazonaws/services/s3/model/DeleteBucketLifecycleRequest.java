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
 * Deletes the lifecycle configuration from the specified bucket. Amazon S3
 * removes all the lifecycle configuration rules in the lifecycle subresource
 * associated with the bucket. Your objects never expire, and Amazon S3 no
 * longer automatically deletes any objects on the basis of rules contained in
 * the deleted lifecycle configuration.
 * </p>
 * <p>
 * To use this operation, you must have permission to perform the
 * <code>s3:PutLifecycleConfiguration</code> action. By default, the bucket
 * owner has this permission and the bucket owner can grant this permission to
 * others.
 * </p>
 * <p>
 * There is usually some time lag before lifecycle configuration deletion is
 * fully propagated to all the Amazon S3 systems.
 * </p>
 * <p>
 * For more information about the object expiration, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#intro-lifecycle-rules-actions"
 * >Elements to Describe Lifecycle Actions</a>.
 * </p>
 * <p>
 * Related actions include:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>PutBucketLifecycleConfiguration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetBucketLifecycleConfiguration</a>
 * </p>
 * </li>
 * </ul>
 */
public class DeleteBucketLifecycleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The bucket name of the lifecycle to delete.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The bucket name of the lifecycle to delete.
     * </p>
     *
     * @return <p>
     *         The bucket name of the lifecycle to delete.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The bucket name of the lifecycle to delete.
     * </p>
     *
     * @param bucket <p>
     *            The bucket name of the lifecycle to delete.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The bucket name of the lifecycle to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The bucket name of the lifecycle to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteBucketLifecycleRequest withBucket(String bucket) {
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

        if (obj instanceof DeleteBucketLifecycleRequest == false)
            return false;
        DeleteBucketLifecycleRequest other = (DeleteBucketLifecycleRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        return true;
    }
}
