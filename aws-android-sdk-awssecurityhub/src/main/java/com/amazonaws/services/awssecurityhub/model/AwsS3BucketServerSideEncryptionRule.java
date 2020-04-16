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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * An encryption rule to apply to the S3 bucket.
 * </p>
 */
public class AwsS3BucketServerSideEncryptionRule implements Serializable {
    /**
     * <p>
     * Specifies the default server-side encryption to apply to new objects in
     * the bucket. If a <code>PUT</code> Object request doesn't specify any
     * server-side encryption, this default encryption is applied.
     * </p>
     */
    private AwsS3BucketServerSideEncryptionByDefault applyServerSideEncryptionByDefault;

    /**
     * <p>
     * Specifies the default server-side encryption to apply to new objects in
     * the bucket. If a <code>PUT</code> Object request doesn't specify any
     * server-side encryption, this default encryption is applied.
     * </p>
     *
     * @return <p>
     *         Specifies the default server-side encryption to apply to new
     *         objects in the bucket. If a <code>PUT</code> Object request
     *         doesn't specify any server-side encryption, this default
     *         encryption is applied.
     *         </p>
     */
    public AwsS3BucketServerSideEncryptionByDefault getApplyServerSideEncryptionByDefault() {
        return applyServerSideEncryptionByDefault;
    }

    /**
     * <p>
     * Specifies the default server-side encryption to apply to new objects in
     * the bucket. If a <code>PUT</code> Object request doesn't specify any
     * server-side encryption, this default encryption is applied.
     * </p>
     *
     * @param applyServerSideEncryptionByDefault <p>
     *            Specifies the default server-side encryption to apply to new
     *            objects in the bucket. If a <code>PUT</code> Object request
     *            doesn't specify any server-side encryption, this default
     *            encryption is applied.
     *            </p>
     */
    public void setApplyServerSideEncryptionByDefault(
            AwsS3BucketServerSideEncryptionByDefault applyServerSideEncryptionByDefault) {
        this.applyServerSideEncryptionByDefault = applyServerSideEncryptionByDefault;
    }

    /**
     * <p>
     * Specifies the default server-side encryption to apply to new objects in
     * the bucket. If a <code>PUT</code> Object request doesn't specify any
     * server-side encryption, this default encryption is applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applyServerSideEncryptionByDefault <p>
     *            Specifies the default server-side encryption to apply to new
     *            objects in the bucket. If a <code>PUT</code> Object request
     *            doesn't specify any server-side encryption, this default
     *            encryption is applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsS3BucketServerSideEncryptionRule withApplyServerSideEncryptionByDefault(
            AwsS3BucketServerSideEncryptionByDefault applyServerSideEncryptionByDefault) {
        this.applyServerSideEncryptionByDefault = applyServerSideEncryptionByDefault;
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
        if (getApplyServerSideEncryptionByDefault() != null)
            sb.append("ApplyServerSideEncryptionByDefault: "
                    + getApplyServerSideEncryptionByDefault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getApplyServerSideEncryptionByDefault() == null) ? 0
                        : getApplyServerSideEncryptionByDefault().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketServerSideEncryptionRule == false)
            return false;
        AwsS3BucketServerSideEncryptionRule other = (AwsS3BucketServerSideEncryptionRule) obj;

        if (other.getApplyServerSideEncryptionByDefault() == null
                ^ this.getApplyServerSideEncryptionByDefault() == null)
            return false;
        if (other.getApplyServerSideEncryptionByDefault() != null
                && other.getApplyServerSideEncryptionByDefault().equals(
                        this.getApplyServerSideEncryptionByDefault()) == false)
            return false;
        return true;
    }
}
