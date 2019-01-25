/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an action to write data to an Amazon S3 bucket.
 * </p>
 */
public class S3Action implements Serializable {
    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The Amazon S3 bucket.
     * </p>
     */
    private String bucketName;

    /**
     * <p>
     * The object key.
     * </p>
     */
    private String key;

    /**
     * <p>
     * The Amazon S3 canned ACL that controls access to the object identified by
     * the object key. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl"
     * >S3 canned ACLs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * aws-exec-read, authenticated-read, bucket-owner-read,
     * bucket-owner-full-control, log-delivery-write
     */
    private String cannedAcl;

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     *
     * @return <p>
     *         The ARN of the IAM role that grants access.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     *
     * @param roleArn <p>
     *            The ARN of the IAM role that grants access.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The ARN of the IAM role that grants access.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Action withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 bucket.
     *         </p>
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * <p>
     * The Amazon S3 bucket.
     * </p>
     *
     * @param bucketName <p>
     *            The Amazon S3 bucket.
     *            </p>
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The Amazon S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketName <p>
     *            The Amazon S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Action withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * <p>
     * The object key.
     * </p>
     *
     * @return <p>
     *         The object key.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The object key.
     * </p>
     *
     * @param key <p>
     *            The object key.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The object key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key <p>
     *            The object key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Action withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 canned ACL that controls access to the object identified by
     * the object key. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl"
     * >S3 canned ACLs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * aws-exec-read, authenticated-read, bucket-owner-read,
     * bucket-owner-full-control, log-delivery-write
     *
     * @return <p>
     *         The Amazon S3 canned ACL that controls access to the object
     *         identified by the object key. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl"
     *         >S3 canned ACLs</a>.
     *         </p>
     * @see CannedAccessControlList
     */
    public String getCannedAcl() {
        return cannedAcl;
    }

    /**
     * <p>
     * The Amazon S3 canned ACL that controls access to the object identified by
     * the object key. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl"
     * >S3 canned ACLs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * aws-exec-read, authenticated-read, bucket-owner-read,
     * bucket-owner-full-control, log-delivery-write
     *
     * @param cannedAcl <p>
     *            The Amazon S3 canned ACL that controls access to the object
     *            identified by the object key. For more information, see <a
     *            href=
     *            "http://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl"
     *            >S3 canned ACLs</a>.
     *            </p>
     * @see CannedAccessControlList
     */
    public void setCannedAcl(String cannedAcl) {
        this.cannedAcl = cannedAcl;
    }

    /**
     * <p>
     * The Amazon S3 canned ACL that controls access to the object identified by
     * the object key. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl"
     * >S3 canned ACLs</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * aws-exec-read, authenticated-read, bucket-owner-read,
     * bucket-owner-full-control, log-delivery-write
     *
     * @param cannedAcl <p>
     *            The Amazon S3 canned ACL that controls access to the object
     *            identified by the object key. For more information, see <a
     *            href=
     *            "http://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl"
     *            >S3 canned ACLs</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CannedAccessControlList
     */
    public S3Action withCannedAcl(String cannedAcl) {
        this.cannedAcl = cannedAcl;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 canned ACL that controls access to the object identified by
     * the object key. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl"
     * >S3 canned ACLs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * aws-exec-read, authenticated-read, bucket-owner-read,
     * bucket-owner-full-control, log-delivery-write
     *
     * @param cannedAcl <p>
     *            The Amazon S3 canned ACL that controls access to the object
     *            identified by the object key. For more information, see <a
     *            href=
     *            "http://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl"
     *            >S3 canned ACLs</a>.
     *            </p>
     * @see CannedAccessControlList
     */
    public void setCannedAcl(CannedAccessControlList cannedAcl) {
        this.cannedAcl = cannedAcl.toString();
    }

    /**
     * <p>
     * The Amazon S3 canned ACL that controls access to the object identified by
     * the object key. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl"
     * >S3 canned ACLs</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * aws-exec-read, authenticated-read, bucket-owner-read,
     * bucket-owner-full-control, log-delivery-write
     *
     * @param cannedAcl <p>
     *            The Amazon S3 canned ACL that controls access to the object
     *            identified by the object key. For more information, see <a
     *            href=
     *            "http://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl"
     *            >S3 canned ACLs</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CannedAccessControlList
     */
    public S3Action withCannedAcl(CannedAccessControlList cannedAcl) {
        this.cannedAcl = cannedAcl.toString();
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
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getBucketName() != null)
            sb.append("bucketName: " + getBucketName() + ",");
        if (getKey() != null)
            sb.append("key: " + getKey() + ",");
        if (getCannedAcl() != null)
            sb.append("cannedAcl: " + getCannedAcl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getCannedAcl() == null) ? 0 : getCannedAcl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Action == false)
            return false;
        S3Action other = (S3Action) obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null
                && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getCannedAcl() == null ^ this.getCannedAcl() == null)
            return false;
        if (other.getCannedAcl() != null
                && other.getCannedAcl().equals(this.getCannedAcl()) == false)
            return false;
        return true;
    }
}
