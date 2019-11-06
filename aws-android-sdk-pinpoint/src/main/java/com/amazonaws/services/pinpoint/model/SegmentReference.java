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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * Segment reference.
 */
public class SegmentReference implements Serializable {
    /**
     * A unique identifier for the segment.
     */
    private String id;

    /**
     * If specified contains a specific version of the segment included.
     */
    private Integer version;

    /**
     * A unique identifier for the segment.
     *
     * @return A unique identifier for the segment.
     */
    public String getId() {
        return id;
    }

    /**
     * A unique identifier for the segment.
     *
     * @param id A unique identifier for the segment.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * A unique identifier for the segment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id A unique identifier for the segment.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentReference withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * If specified contains a specific version of the segment included.
     *
     * @return If specified contains a specific version of the segment included.
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * If specified contains a specific version of the segment included.
     *
     * @param version If specified contains a specific version of the segment
     *            included.
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * If specified contains a specific version of the segment included.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version If specified contains a specific version of the segment
     *            included.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentReference withVersion(Integer version) {
        this.version = version;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentReference == false)
            return false;
        SegmentReference other = (SegmentReference) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }
}
