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
 * Applies an Amazon S3 bucket policy to an Amazon S3 bucket. If you are using
 * an identity other than the root user of the AWS account that owns the bucket,
 * the calling identity must have the <code>PutBucketPolicy</code> permissions
 * on the specified bucket and belong to the bucket owner's account in order to
 * use this operation.
 * </p>
 * <p>
 * If you don't have <code>PutBucketPolicy</code> permissions, Amazon S3 returns
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
 * The following operations are related to <code>PutBucketPolicy</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateBucket</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBucket</a>
 * </p>
 * </li>
 * </ul>
 */
public class PutBucketPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the bucket.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The MD5 hash of the request body.
     * </p>
     */
    private String contentMD5;

    /**
     * <p>
     * Set this parameter to true to confirm that you want to remove your
     * permissions to change this bucket policy in the future.
     * </p>
     */
    private Boolean confirmRemoveSelfBucketAccess;

    /**
     * <p>
     * The bucket policy as a JSON document.
     * </p>
     */
    private String policy;

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
    public PutBucketPolicyRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The MD5 hash of the request body.
     * </p>
     *
     * @return <p>
     *         The MD5 hash of the request body.
     *         </p>
     */
    public String getContentMD5() {
        return contentMD5;
    }

    /**
     * <p>
     * The MD5 hash of the request body.
     * </p>
     *
     * @param contentMD5 <p>
     *            The MD5 hash of the request body.
     *            </p>
     */
    public void setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
    }

    /**
     * <p>
     * The MD5 hash of the request body.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentMD5 <p>
     *            The MD5 hash of the request body.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketPolicyRequest withContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * <p>
     * Set this parameter to true to confirm that you want to remove your
     * permissions to change this bucket policy in the future.
     * </p>
     *
     * @return <p>
     *         Set this parameter to true to confirm that you want to remove
     *         your permissions to change this bucket policy in the future.
     *         </p>
     */
    public Boolean isConfirmRemoveSelfBucketAccess() {
        return confirmRemoveSelfBucketAccess;
    }

    /**
     * <p>
     * Set this parameter to true to confirm that you want to remove your
     * permissions to change this bucket policy in the future.
     * </p>
     *
     * @return <p>
     *         Set this parameter to true to confirm that you want to remove
     *         your permissions to change this bucket policy in the future.
     *         </p>
     */
    public Boolean getConfirmRemoveSelfBucketAccess() {
        return confirmRemoveSelfBucketAccess;
    }

    /**
     * <p>
     * Set this parameter to true to confirm that you want to remove your
     * permissions to change this bucket policy in the future.
     * </p>
     *
     * @param confirmRemoveSelfBucketAccess <p>
     *            Set this parameter to true to confirm that you want to remove
     *            your permissions to change this bucket policy in the future.
     *            </p>
     */
    public void setConfirmRemoveSelfBucketAccess(Boolean confirmRemoveSelfBucketAccess) {
        this.confirmRemoveSelfBucketAccess = confirmRemoveSelfBucketAccess;
    }

    /**
     * <p>
     * Set this parameter to true to confirm that you want to remove your
     * permissions to change this bucket policy in the future.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param confirmRemoveSelfBucketAccess <p>
     *            Set this parameter to true to confirm that you want to remove
     *            your permissions to change this bucket policy in the future.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketPolicyRequest withConfirmRemoveSelfBucketAccess(
            Boolean confirmRemoveSelfBucketAccess) {
        this.confirmRemoveSelfBucketAccess = confirmRemoveSelfBucketAccess;
        return this;
    }

    /**
     * <p>
     * The bucket policy as a JSON document.
     * </p>
     *
     * @return <p>
     *         The bucket policy as a JSON document.
     *         </p>
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * <p>
     * The bucket policy as a JSON document.
     * </p>
     *
     * @param policy <p>
     *            The bucket policy as a JSON document.
     *            </p>
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The bucket policy as a JSON document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policy <p>
     *            The bucket policy as a JSON document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketPolicyRequest withPolicy(String policy) {
        this.policy = policy;
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
        if (getConfirmRemoveSelfBucketAccess() != null)
            sb.append("ConfirmRemoveSelfBucketAccess: " + getConfirmRemoveSelfBucketAccess() + ",");
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy());
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
                + ((getConfirmRemoveSelfBucketAccess() == null) ? 0
                        : getConfirmRemoveSelfBucketAccess().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBucketPolicyRequest == false)
            return false;
        PutBucketPolicyRequest other = (PutBucketPolicyRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getContentMD5() == null ^ this.getContentMD5() == null)
            return false;
        if (other.getContentMD5() != null
                && other.getContentMD5().equals(this.getContentMD5()) == false)
            return false;
        if (other.getConfirmRemoveSelfBucketAccess() == null
                ^ this.getConfirmRemoveSelfBucketAccess() == null)
            return false;
        if (other.getConfirmRemoveSelfBucketAccess() != null
                && other.getConfirmRemoveSelfBucketAccess().equals(
                        this.getConfirmRemoveSelfBucketAccess()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }
}
