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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information on how the bucker owner's S3 Block Public Access
 * settings are being applied to the S3 bucket. See <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html"
 * >S3 Block Public Access</a> for more information.
 * </p>
 */
public class BlockPublicAccess implements Serializable {
    /**
     * <p>
     * Indicates if S3 Block Public Access is set to
     * <code>IgnorePublicAcls</code>.
     * </p>
     */
    private Boolean ignorePublicAcls;

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to
     * <code>RestrictPublicBuckets</code>.
     * </p>
     */
    private Boolean restrictPublicBuckets;

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to
     * <code>BlockPublicAcls</code>.
     * </p>
     */
    private Boolean blockPublicAcls;

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to
     * <code>BlockPublicPolicy</code>.
     * </p>
     */
    private Boolean blockPublicPolicy;

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to
     * <code>IgnorePublicAcls</code>.
     * </p>
     *
     * @return <p>
     *         Indicates if S3 Block Public Access is set to
     *         <code>IgnorePublicAcls</code>.
     *         </p>
     */
    public Boolean isIgnorePublicAcls() {
        return ignorePublicAcls;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to
     * <code>IgnorePublicAcls</code>.
     * </p>
     *
     * @return <p>
     *         Indicates if S3 Block Public Access is set to
     *         <code>IgnorePublicAcls</code>.
     *         </p>
     */
    public Boolean getIgnorePublicAcls() {
        return ignorePublicAcls;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to
     * <code>IgnorePublicAcls</code>.
     * </p>
     *
     * @param ignorePublicAcls <p>
     *            Indicates if S3 Block Public Access is set to
     *            <code>IgnorePublicAcls</code>.
     *            </p>
     */
    public void setIgnorePublicAcls(Boolean ignorePublicAcls) {
        this.ignorePublicAcls = ignorePublicAcls;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to
     * <code>IgnorePublicAcls</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ignorePublicAcls <p>
     *            Indicates if S3 Block Public Access is set to
     *            <code>IgnorePublicAcls</code>.
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
     * Indicates if S3 Block Public Access is set to
     * <code>RestrictPublicBuckets</code>.
     * </p>
     *
     * @return <p>
     *         Indicates if S3 Block Public Access is set to
     *         <code>RestrictPublicBuckets</code>.
     *         </p>
     */
    public Boolean isRestrictPublicBuckets() {
        return restrictPublicBuckets;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to
     * <code>RestrictPublicBuckets</code>.
     * </p>
     *
     * @return <p>
     *         Indicates if S3 Block Public Access is set to
     *         <code>RestrictPublicBuckets</code>.
     *         </p>
     */
    public Boolean getRestrictPublicBuckets() {
        return restrictPublicBuckets;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to
     * <code>RestrictPublicBuckets</code>.
     * </p>
     *
     * @param restrictPublicBuckets <p>
     *            Indicates if S3 Block Public Access is set to
     *            <code>RestrictPublicBuckets</code>.
     *            </p>
     */
    public void setRestrictPublicBuckets(Boolean restrictPublicBuckets) {
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to
     * <code>RestrictPublicBuckets</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restrictPublicBuckets <p>
     *            Indicates if S3 Block Public Access is set to
     *            <code>RestrictPublicBuckets</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockPublicAccess withRestrictPublicBuckets(Boolean restrictPublicBuckets) {
        this.restrictPublicBuckets = restrictPublicBuckets;
        return this;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to
     * <code>BlockPublicAcls</code>.
     * </p>
     *
     * @return <p>
     *         Indicates if S3 Block Public Access is set to
     *         <code>BlockPublicAcls</code>.
     *         </p>
     */
    public Boolean isBlockPublicAcls() {
        return blockPublicAcls;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to
     * <code>BlockPublicAcls</code>.
     * </p>
     *
     * @return <p>
     *         Indicates if S3 Block Public Access is set to
     *         <code>BlockPublicAcls</code>.
     *         </p>
     */
    public Boolean getBlockPublicAcls() {
        return blockPublicAcls;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to
     * <code>BlockPublicAcls</code>.
     * </p>
     *
     * @param blockPublicAcls <p>
     *            Indicates if S3 Block Public Access is set to
     *            <code>BlockPublicAcls</code>.
     *            </p>
     */
    public void setBlockPublicAcls(Boolean blockPublicAcls) {
        this.blockPublicAcls = blockPublicAcls;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to
     * <code>BlockPublicAcls</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockPublicAcls <p>
     *            Indicates if S3 Block Public Access is set to
     *            <code>BlockPublicAcls</code>.
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
     * Indicates if S3 Block Public Access is set to
     * <code>BlockPublicPolicy</code>.
     * </p>
     *
     * @return <p>
     *         Indicates if S3 Block Public Access is set to
     *         <code>BlockPublicPolicy</code>.
     *         </p>
     */
    public Boolean isBlockPublicPolicy() {
        return blockPublicPolicy;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to
     * <code>BlockPublicPolicy</code>.
     * </p>
     *
     * @return <p>
     *         Indicates if S3 Block Public Access is set to
     *         <code>BlockPublicPolicy</code>.
     *         </p>
     */
    public Boolean getBlockPublicPolicy() {
        return blockPublicPolicy;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to
     * <code>BlockPublicPolicy</code>.
     * </p>
     *
     * @param blockPublicPolicy <p>
     *            Indicates if S3 Block Public Access is set to
     *            <code>BlockPublicPolicy</code>.
     *            </p>
     */
    public void setBlockPublicPolicy(Boolean blockPublicPolicy) {
        this.blockPublicPolicy = blockPublicPolicy;
    }

    /**
     * <p>
     * Indicates if S3 Block Public Access is set to
     * <code>BlockPublicPolicy</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockPublicPolicy <p>
     *            Indicates if S3 Block Public Access is set to
     *            <code>BlockPublicPolicy</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockPublicAccess withBlockPublicPolicy(Boolean blockPublicPolicy) {
        this.blockPublicPolicy = blockPublicPolicy;
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
        if (getIgnorePublicAcls() != null)
            sb.append("IgnorePublicAcls: " + getIgnorePublicAcls() + ",");
        if (getRestrictPublicBuckets() != null)
            sb.append("RestrictPublicBuckets: " + getRestrictPublicBuckets() + ",");
        if (getBlockPublicAcls() != null)
            sb.append("BlockPublicAcls: " + getBlockPublicAcls() + ",");
        if (getBlockPublicPolicy() != null)
            sb.append("BlockPublicPolicy: " + getBlockPublicPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIgnorePublicAcls() == null) ? 0 : getIgnorePublicAcls().hashCode());
        hashCode = prime
                * hashCode
                + ((getRestrictPublicBuckets() == null) ? 0 : getRestrictPublicBuckets().hashCode());
        hashCode = prime * hashCode
                + ((getBlockPublicAcls() == null) ? 0 : getBlockPublicAcls().hashCode());
        hashCode = prime * hashCode
                + ((getBlockPublicPolicy() == null) ? 0 : getBlockPublicPolicy().hashCode());
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
        return true;
    }
}
