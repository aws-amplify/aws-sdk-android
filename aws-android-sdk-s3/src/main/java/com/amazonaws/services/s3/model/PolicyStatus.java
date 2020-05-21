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

/**
 * <p>
 * The container element for a bucket's policy status.
 * </p>
 */
public class PolicyStatus implements Serializable {
    /**
     * <p>
     * The policy status for this bucket. <code>TRUE</code> indicates that this
     * bucket is public. <code>FALSE</code> indicates that the bucket is not
     * public.
     * </p>
     */
    private Boolean isPublic;

    /**
     * <p>
     * The policy status for this bucket. <code>TRUE</code> indicates that this
     * bucket is public. <code>FALSE</code> indicates that the bucket is not
     * public.
     * </p>
     *
     * @return <p>
     *         The policy status for this bucket. <code>TRUE</code> indicates
     *         that this bucket is public. <code>FALSE</code> indicates that the
     *         bucket is not public.
     *         </p>
     */
    public Boolean isIsPublic() {
        return isPublic;
    }

    /**
     * <p>
     * The policy status for this bucket. <code>TRUE</code> indicates that this
     * bucket is public. <code>FALSE</code> indicates that the bucket is not
     * public.
     * </p>
     *
     * @return <p>
     *         The policy status for this bucket. <code>TRUE</code> indicates
     *         that this bucket is public. <code>FALSE</code> indicates that the
     *         bucket is not public.
     *         </p>
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    /**
     * <p>
     * The policy status for this bucket. <code>TRUE</code> indicates that this
     * bucket is public. <code>FALSE</code> indicates that the bucket is not
     * public.
     * </p>
     *
     * @param isPublic <p>
     *            The policy status for this bucket. <code>TRUE</code> indicates
     *            that this bucket is public. <code>FALSE</code> indicates that
     *            the bucket is not public.
     *            </p>
     */
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    /**
     * <p>
     * The policy status for this bucket. <code>TRUE</code> indicates that this
     * bucket is public. <code>FALSE</code> indicates that the bucket is not
     * public.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isPublic <p>
     *            The policy status for this bucket. <code>TRUE</code> indicates
     *            that this bucket is public. <code>FALSE</code> indicates that
     *            the bucket is not public.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyStatus withIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
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
        if (getIsPublic() != null)
            sb.append("IsPublic: " + getIsPublic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsPublic() == null) ? 0 : getIsPublic().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyStatus == false)
            return false;
        PolicyStatus other = (PolicyStatus) obj;

        if (other.getIsPublic() == null ^ this.getIsPublic() == null)
            return false;
        if (other.getIsPublic() != null && other.getIsPublic().equals(this.getIsPublic()) == false)
            return false;
        return true;
    }
}
