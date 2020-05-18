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
 * Provides information about the block public access settings for an S3 bucket.
 * These settings can apply to a bucket at the account level or bucket level.
 * For detailed information about each setting, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html"
 * >Using Amazon S3 block public access</a> in the <i>Amazon Simple Storage
 * Service Developer Guide</i>.
 * </p>
 */
public class BlockPublicAccess implements Serializable {
    /**
     * <p>
     * Specifies whether Amazon S3 blocks public access control lists (ACLs) for
     * the bucket and objects in the bucket.
     * </p>
     */
    private Boolean blockPublicAcls;

    /**
     * <p>
     * Specifies whether Amazon S3 blocks public bucket policies for the bucket.
     * </p>
     */
    private Boolean blockPublicPolicy;

    /**
     * <p>
     * Specifies whether Amazon S3 ignores public ACLs for the bucket and
     * objects in the bucket.
     * </p>
     */
    private Boolean ignorePublicAcls;

    /**
     * <p>
     * Specifies whether Amazon S3 restricts public bucket policies for the
     * bucket.
     * </p>
     */
    private Boolean restrictPublicBuckets;

    /**
     * <p>
     * Specifies whether Amazon S3 blocks public access control lists (ACLs) for
     * the bucket and objects in the bucket.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon S3 blocks public access control lists
     *         (ACLs) for the bucket and objects in the bucket.
     *         </p>
     */
    public Boolean isBlockPublicAcls() {
        return blockPublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 blocks public access control lists (ACLs) for
     * the bucket and objects in the bucket.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon S3 blocks public access control lists
     *         (ACLs) for the bucket and objects in the bucket.
     *         </p>
     */
    public Boolean getBlockPublicAcls() {
        return blockPublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 blocks public access control lists (ACLs) for
     * the bucket and objects in the bucket.
     * </p>
     *
     * @param blockPublicAcls <p>
     *            Specifies whether Amazon S3 blocks public access control lists
     *            (ACLs) for the bucket and objects in the bucket.
     *            </p>
     */
    public void setBlockPublicAcls(Boolean blockPublicAcls) {
        this.blockPublicAcls = blockPublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 blocks public access control lists (ACLs) for
     * the bucket and objects in the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockPublicAcls <p>
     *            Specifies whether Amazon S3 blocks public access control lists
     *            (ACLs) for the bucket and objects in the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockPublicAccess withBlockPublicAcls(Boolean blockPublicAcls) {
        this.blockPublicAcls = blockPublicAcls;
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 blocks public bucket policies for the bucket.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon S3 blocks public bucket policies for the
     *         bucket.
     *         </p>
     */
    public Boolean isBlockPublicPolicy() {
        return blockPublicPolicy;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 blocks public bucket policies for the bucket.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon S3 blocks public bucket policies for the
     *         bucket.
     *         </p>
     */
    public Boolean getBlockPublicPolicy() {
        return blockPublicPolicy;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 blocks public bucket policies for the bucket.
     * </p>
     *
     * @param blockPublicPolicy <p>
     *            Specifies whether Amazon S3 blocks public bucket policies for
     *            the bucket.
     *            </p>
     */
    public void setBlockPublicPolicy(Boolean blockPublicPolicy) {
        this.blockPublicPolicy = blockPublicPolicy;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 blocks public bucket policies for the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockPublicPolicy <p>
     *            Specifies whether Amazon S3 blocks public bucket policies for
     *            the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockPublicAccess withBlockPublicPolicy(Boolean blockPublicPolicy) {
        this.blockPublicPolicy = blockPublicPolicy;
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 ignores public ACLs for the bucket and
     * objects in the bucket.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon S3 ignores public ACLs for the bucket
     *         and objects in the bucket.
     *         </p>
     */
    public Boolean isIgnorePublicAcls() {
        return ignorePublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 ignores public ACLs for the bucket and
     * objects in the bucket.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon S3 ignores public ACLs for the bucket
     *         and objects in the bucket.
     *         </p>
     */
    public Boolean getIgnorePublicAcls() {
        return ignorePublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 ignores public ACLs for the bucket and
     * objects in the bucket.
     * </p>
     *
     * @param ignorePublicAcls <p>
     *            Specifies whether Amazon S3 ignores public ACLs for the bucket
     *            and objects in the bucket.
     *            </p>
     */
    public void setIgnorePublicAcls(Boolean ignorePublicAcls) {
        this.ignorePublicAcls = ignorePublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 ignores public ACLs for the bucket and
     * objects in the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ignorePublicAcls <p>
     *            Specifies whether Amazon S3 ignores public ACLs for the bucket
     *            and objects in the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockPublicAccess withIgnorePublicAcls(Boolean ignorePublicAcls) {
        this.ignorePublicAcls = ignorePublicAcls;
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 restricts public bucket policies for the
     * bucket.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon S3 restricts public bucket policies for
     *         the bucket.
     *         </p>
     */
    public Boolean isRestrictPublicBuckets() {
        return restrictPublicBuckets;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 restricts public bucket policies for the
     * bucket.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon S3 restricts public bucket policies for
     *         the bucket.
     *         </p>
     */
    public Boolean getRestrictPublicBuckets() {
        return restrictPublicBuckets;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 restricts public bucket policies for the
     * bucket.
     * </p>
     *
     * @param restrictPublicBuckets <p>
     *            Specifies whether Amazon S3 restricts public bucket policies
     *            for the bucket.
     *            </p>
     */
    public void setRestrictPublicBuckets(Boolean restrictPublicBuckets) {
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 restricts public bucket policies for the
     * bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restrictPublicBuckets <p>
     *            Specifies whether Amazon S3 restricts public bucket policies
     *            for the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockPublicAccess withRestrictPublicBuckets(Boolean restrictPublicBuckets) {
        this.restrictPublicBuckets = restrictPublicBuckets;
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
        if (getBlockPublicAcls() != null)
            sb.append("blockPublicAcls: " + getBlockPublicAcls() + ",");
        if (getBlockPublicPolicy() != null)
            sb.append("blockPublicPolicy: " + getBlockPublicPolicy() + ",");
        if (getIgnorePublicAcls() != null)
            sb.append("ignorePublicAcls: " + getIgnorePublicAcls() + ",");
        if (getRestrictPublicBuckets() != null)
            sb.append("restrictPublicBuckets: " + getRestrictPublicBuckets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBlockPublicAcls() == null) ? 0 : getBlockPublicAcls().hashCode());
        hashCode = prime * hashCode
                + ((getBlockPublicPolicy() == null) ? 0 : getBlockPublicPolicy().hashCode());
        hashCode = prime * hashCode
                + ((getIgnorePublicAcls() == null) ? 0 : getIgnorePublicAcls().hashCode());
        hashCode = prime
                * hashCode
                + ((getRestrictPublicBuckets() == null) ? 0 : getRestrictPublicBuckets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlockPublicAccess == false)
            return false;
        BlockPublicAccess other = (BlockPublicAccess) obj;

        if (other.getBlockPublicAcls() == null ^ this.getBlockPublicAcls() == null)
            return false;
        if (other.getBlockPublicAcls() != null
                && other.getBlockPublicAcls().equals(this.getBlockPublicAcls()) == false)
            return false;
        if (other.getBlockPublicPolicy() == null ^ this.getBlockPublicPolicy() == null)
            return false;
        if (other.getBlockPublicPolicy() != null
                && other.getBlockPublicPolicy().equals(this.getBlockPublicPolicy()) == false)
            return false;
        if (other.getIgnorePublicAcls() == null ^ this.getIgnorePublicAcls() == null)
            return false;
        if (other.getIgnorePublicAcls() != null
                && other.getIgnorePublicAcls().equals(this.getIgnorePublicAcls()) == false)
            return false;
        if (other.getRestrictPublicBuckets() == null ^ this.getRestrictPublicBuckets() == null)
            return false;
        if (other.getRestrictPublicBuckets() != null
                && other.getRestrictPublicBuckets().equals(this.getRestrictPublicBuckets()) == false)
            return false;
        return true;
    }
}
