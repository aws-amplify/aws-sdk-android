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
 * Returns the policy of a specified bucket. If you are using an identity other
 * than the root user of the AWS account that owns the bucket, the calling
 * identity must have the <code>GetBucketPolicy</code> permissions on the
 * specified bucket and belong to the bucket owner's account in order to use
 * this operation.
 * </p>
 * <p>
 * If you don't have <code>GetBucketPolicy</code> permissions, Amazon S3 returns
 * a <code>403 Access Denied</code> error. If you have the correct permissions,
 * but you're not using an identity that belongs to the bucket owner's account,
 * Amazon S3 returns a <code>405 Method Not Allowed</code> error.
 * </p>
 * <important>
 * <p>
 * As a security precaution, the root user of the AWS account that owns a bucket
 * can always use this operation, even if the policy explicitly denies the root
 * user the ability to perform this action.
 * </p>
 * </important>
 * <p>
 * For more information about bucket policies, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html"
 * >Using Bucket Policies and User Policies</a>.
 * </p>
 * <p>
 * The following operation is related to <code>GetBucketPolicy</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetObject</a>
 * </p>
 * </li>
 * </ul>
 */
public class GetBucketPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The bucket name for which to get the bucket policy.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The bucket name for which to get the bucket policy.
     * </p>
     *
     * @return <p>
     *         The bucket name for which to get the bucket policy.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The bucket name for which to get the bucket policy.
     * </p>
     *
     * @param bucket <p>
     *            The bucket name for which to get the bucket policy.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The bucket name for which to get the bucket policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The bucket name for which to get the bucket policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketPolicyRequest withBucket(String bucket) {
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

        if (obj instanceof GetBucketPolicyRequest == false)
            return false;
        GetBucketPolicyRequest other = (GetBucketPolicyRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        return true;
    }
}
