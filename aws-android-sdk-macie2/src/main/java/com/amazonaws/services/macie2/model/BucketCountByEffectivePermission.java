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
 * The total number of buckets that are publicly accessible, based on a
 * combination of permissions settings for each bucket.
 * </p>
 */
public class BucketCountByEffectivePermission implements Serializable {
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private Long publiclyAccessible;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private Long publiclyReadable;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private Long publiclyWritable;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public Long getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param publiclyAccessible <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setPubliclyAccessible(Long publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publiclyAccessible <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketCountByEffectivePermission withPubliclyAccessible(Long publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
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
    public Long getPubliclyReadable() {
        return publiclyReadable;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param publiclyReadable <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setPubliclyReadable(Long publiclyReadable) {
        this.publiclyReadable = publiclyReadable;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publiclyReadable <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketCountByEffectivePermission withPubliclyReadable(Long publiclyReadable) {
        this.publiclyReadable = publiclyReadable;
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
    public Long getPubliclyWritable() {
        return publiclyWritable;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param publiclyWritable <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setPubliclyWritable(Long publiclyWritable) {
        this.publiclyWritable = publiclyWritable;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publiclyWritable <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketCountByEffectivePermission withPubliclyWritable(Long publiclyWritable) {
        this.publiclyWritable = publiclyWritable;
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
        if (getPubliclyAccessible() != null)
            sb.append("publiclyAccessible: " + getPubliclyAccessible() + ",");
        if (getPubliclyReadable() != null)
            sb.append("publiclyReadable: " + getPubliclyReadable() + ",");
        if (getPubliclyWritable() != null)
            sb.append("publiclyWritable: " + getPubliclyWritable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode
                + ((getPubliclyReadable() == null) ? 0 : getPubliclyReadable().hashCode());
        hashCode = prime * hashCode
                + ((getPubliclyWritable() == null) ? 0 : getPubliclyWritable().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketCountByEffectivePermission == false)
            return false;
        BucketCountByEffectivePermission other = (BucketCountByEffectivePermission) obj;

        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null
                && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getPubliclyReadable() == null ^ this.getPubliclyReadable() == null)
            return false;
        if (other.getPubliclyReadable() != null
                && other.getPubliclyReadable().equals(this.getPubliclyReadable()) == false)
            return false;
        if (other.getPubliclyWritable() == null ^ this.getPubliclyWritable() == null)
            return false;
        if (other.getPubliclyWritable() != null
                && other.getPubliclyWritable().equals(this.getPubliclyWritable()) == false)
            return false;
        return true;
    }
}
