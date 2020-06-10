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
 * The total number of buckets that are shared with another AWS account or
 * configured to support cross-origin resource sharing (CORS).
 * </p>
 */
public class BucketCountBySharedAccessType implements Serializable {
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private Long external;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private Long internal;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private Long notShared;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public Long getExternal() {
        return external;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param external <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setExternal(Long external) {
        this.external = external;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param external <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketCountBySharedAccessType withExternal(Long external) {
        this.external = external;
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
    public Long getInternal() {
        return internal;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param internal <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setInternal(Long internal) {
        this.internal = internal;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param internal <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketCountBySharedAccessType withInternal(Long internal) {
        this.internal = internal;
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
    public Long getNotShared() {
        return notShared;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param notShared <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setNotShared(Long notShared) {
        this.notShared = notShared;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notShared <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketCountBySharedAccessType withNotShared(Long notShared) {
        this.notShared = notShared;
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
        if (getExternal() != null)
            sb.append("external: " + getExternal() + ",");
        if (getInternal() != null)
            sb.append("internal: " + getInternal() + ",");
        if (getNotShared() != null)
            sb.append("notShared: " + getNotShared());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExternal() == null) ? 0 : getExternal().hashCode());
        hashCode = prime * hashCode + ((getInternal() == null) ? 0 : getInternal().hashCode());
        hashCode = prime * hashCode + ((getNotShared() == null) ? 0 : getNotShared().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketCountBySharedAccessType == false)
            return false;
        BucketCountBySharedAccessType other = (BucketCountBySharedAccessType) obj;

        if (other.getExternal() == null ^ this.getExternal() == null)
            return false;
        if (other.getExternal() != null && other.getExternal().equals(this.getExternal()) == false)
            return false;
        if (other.getInternal() == null ^ this.getInternal() == null)
            return false;
        if (other.getInternal() != null && other.getInternal().equals(this.getInternal()) == false)
            return false;
        if (other.getNotShared() == null ^ this.getNotShared() == null)
            return false;
        if (other.getNotShared() != null
                && other.getNotShared().equals(this.getNotShared()) == false)
            return false;
        return true;
    }
}
