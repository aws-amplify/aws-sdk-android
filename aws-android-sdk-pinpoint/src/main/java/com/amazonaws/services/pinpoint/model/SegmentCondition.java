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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies a segment to associate with an activity in a journey.
 * </p>
 */
public class SegmentCondition implements Serializable {
    /**
     * <p>
     * The unique identifier for the segment to associate with the activity.
     * </p>
     */
    private String segmentId;

    /**
     * <p>
     * The unique identifier for the segment to associate with the activity.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the segment to associate with the
     *         activity.
     *         </p>
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * <p>
     * The unique identifier for the segment to associate with the activity.
     * </p>
     *
     * @param segmentId <p>
     *            The unique identifier for the segment to associate with the
     *            activity.
     *            </p>
     */
    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * <p>
     * The unique identifier for the segment to associate with the activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentId <p>
     *            The unique identifier for the segment to associate with the
     *            activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentCondition withSegmentId(String segmentId) {
        this.segmentId = segmentId;
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
        if (getSegmentId() != null)
            sb.append("SegmentId: " + getSegmentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSegmentId() == null) ? 0 : getSegmentId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentCondition == false)
            return false;
        SegmentCondition other = (SegmentCondition) obj;

        if (other.getSegmentId() == null ^ this.getSegmentId() == null)
            return false;
        if (other.getSegmentId() != null
                && other.getSegmentId().equals(this.getSegmentId()) == false)
            return false;
        return true;
    }
}
