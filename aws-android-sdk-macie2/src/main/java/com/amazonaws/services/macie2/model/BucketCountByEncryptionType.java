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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * The total number of buckets, grouped by server-side encryption type. This
 * object also reports the total number of buckets that aren't encrypted.
 * </p>
 */
public class BucketCountByEncryptionType implements Serializable {
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private Long kmsManaged;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private Long s3Managed;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private Long unencrypted;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public Long getKmsManaged() {
        return kmsManaged;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param kmsManaged <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setKmsManaged(Long kmsManaged) {
        this.kmsManaged = kmsManaged;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsManaged <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketCountByEncryptionType withKmsManaged(Long kmsManaged) {
        this.kmsManaged = kmsManaged;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public Long getS3Managed() {
        return s3Managed;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param s3Managed <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setS3Managed(Long s3Managed) {
        this.s3Managed = s3Managed;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Managed <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketCountByEncryptionType withS3Managed(Long s3Managed) {
        this.s3Managed = s3Managed;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public Long getUnencrypted() {
        return unencrypted;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param unencrypted <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setUnencrypted(Long unencrypted) {
        this.unencrypted = unencrypted;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unencrypted <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketCountByEncryptionType withUnencrypted(Long unencrypted) {
        this.unencrypted = unencrypted;
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
        if (getKmsManaged() != null)
            sb.append("kmsManaged: " + getKmsManaged() + ",");
        if (getS3Managed() != null)
            sb.append("s3Managed: " + getS3Managed() + ",");
        if (getUnencrypted() != null)
            sb.append("unencrypted: " + getUnencrypted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsManaged() == null) ? 0 : getKmsManaged().hashCode());
        hashCode = prime * hashCode + ((getS3Managed() == null) ? 0 : getS3Managed().hashCode());
        hashCode = prime * hashCode
                + ((getUnencrypted() == null) ? 0 : getUnencrypted().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketCountByEncryptionType == false)
            return false;
        BucketCountByEncryptionType other = (BucketCountByEncryptionType) obj;

        if (other.getKmsManaged() == null ^ this.getKmsManaged() == null)
            return false;
        if (other.getKmsManaged() != null
                && other.getKmsManaged().equals(this.getKmsManaged()) == false)
            return false;
        if (other.getS3Managed() == null ^ this.getS3Managed() == null)
            return false;
        if (other.getS3Managed() != null
                && other.getS3Managed().equals(this.getS3Managed()) == false)
            return false;
        if (other.getUnencrypted() == null ^ this.getUnencrypted() == null)
            return false;
        if (other.getUnencrypted() != null
                && other.getUnencrypted().equals(this.getUnencrypted()) == false)
            return false;
        return true;
    }
}
