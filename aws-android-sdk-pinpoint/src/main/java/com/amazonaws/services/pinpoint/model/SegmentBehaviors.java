/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class SegmentBehaviors implements Serializable {
    /**
     * The recency of use.
     */
    private RecencyDimension recency;

    /**
     * The recency of use.
     *
     * @return The recency of use.
     */
    public RecencyDimension getRecency() {
        return recency;
    }

    /**
     * The recency of use.
     *
     * @param recency The recency of use.
     */
    public void setRecency(RecencyDimension recency) {
        this.recency = recency;
    }

    /**
     * The recency of use.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recency The recency of use.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentBehaviors withRecency(RecencyDimension recency) {
        this.recency = recency;
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
        if (getRecency() != null)
            sb.append("Recency: " + getRecency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecency() == null) ? 0 : getRecency().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentBehaviors == false)
            return false;
        SegmentBehaviors other = (SegmentBehaviors) obj;

        if (other.getRecency() == null ^ this.getRecency() == null)
            return false;
        if (other.getRecency() != null && other.getRecency().equals(this.getRecency()) == false)
            return false;
        return true;
    }
}
