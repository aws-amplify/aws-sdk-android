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
 * Retrieves the policy status for an Amazon S3 bucket, indicating whether the
 * bucket is public. In order to use this operation, you must have the
 * <code>s3:GetBucketPolicyStatus</code> permission. For more information about
 * Amazon S3 permissions, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html"
 * >Specifying Permissions in a Policy</a>.
 * </p>
 * <p>
 * For more information about when Amazon S3 considers a bucket public, see <a
 * href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status"
 * >The Meaning of "Public"</a>.
 * </p>
 * <p>
 * The following operations are related to <code>GetBucketPolicyStatus</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html"
 * >Using Amazon S3 Block Public Access</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPublicAccessBlock</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutPublicAccessBlock</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeletePublicAccessBlock</a>
 * </p>
 * </li>
 * </ul>
 */
public class GetBucketPolicyStatusRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the Amazon S3 bucket whose policy status you want to
     * retrieve.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The name of the Amazon S3 bucket whose policy status you want to
     * retrieve.
     * </p>
     *
     * @return <p>
     *         The name of the Amazon S3 bucket whose policy status you want to
     *         retrieve.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket whose policy status you want to
     * retrieve.
     * </p>
     *
     * @param bucket <p>
     *            The name of the Amazon S3 bucket whose policy status you want
     *            to retrieve.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket whose policy status you want to
     * retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the Amazon S3 bucket whose policy status you want
     *            to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketPolicyStatusRequest withBucket(String bucket) {
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

        if (obj instanceof GetBucketPolicyStatusRequest == false)
            return false;
        GetBucketPolicyStatusRequest other = (GetBucketPolicyStatusRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        return true;
    }
}
