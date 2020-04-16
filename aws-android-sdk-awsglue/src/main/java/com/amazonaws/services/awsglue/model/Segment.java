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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * Defines a non-overlapping region of a table's partitions, allowing multiple
 * requests to be executed in parallel.
 * </p>
 */
public class Segment implements Serializable {
    /**
     * <p>
     * The zero-based index number of the segment. For example, if the total
     * number of segments is 4, <code>SegmentNumber</code> values range from 0
     * through 3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer segmentNumber;

    /**
     * <p>
     * The total number of segments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     */
    private Integer totalSegments;

    /**
     * <p>
     * The zero-based index number of the segment. For example, if the total
     * number of segments is 4, <code>SegmentNumber</code> values range from 0
     * through 3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The zero-based index number of the segment. For example, if the
     *         total number of segments is 4, <code>SegmentNumber</code> values
     *         range from 0 through 3.
     *         </p>
     */
    public Integer getSegmentNumber() {
        return segmentNumber;
    }

    /**
     * <p>
     * The zero-based index number of the segment. For example, if the total
     * number of segments is 4, <code>SegmentNumber</code> values range from 0
     * through 3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param segmentNumber <p>
     *            The zero-based index number of the segment. For example, if
     *            the total number of segments is 4, <code>SegmentNumber</code>
     *            values range from 0 through 3.
     *            </p>
     */
    public void setSegmentNumber(Integer segmentNumber) {
        this.segmentNumber = segmentNumber;
    }

    /**
     * <p>
     * The zero-based index number of the segment. For example, if the total
     * number of segments is 4, <code>SegmentNumber</code> values range from 0
     * through 3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param segmentNumber <p>
     *            The zero-based index number of the segment. For example, if
     *            the total number of segments is 4, <code>SegmentNumber</code>
     *            values range from 0 through 3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Segment withSegmentNumber(Integer segmentNumber) {
        this.segmentNumber = segmentNumber;
        return this;
    }

    /**
     * <p>
     * The total number of segments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @return <p>
     *         The total number of segments.
     *         </p>
     */
    public Integer getTotalSegments() {
        return totalSegments;
    }

    /**
     * <p>
     * The total number of segments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param totalSegments <p>
     *            The total number of segments.
     *            </p>
     */
    public void setTotalSegments(Integer totalSegments) {
        this.totalSegments = totalSegments;
    }

    /**
     * <p>
     * The total number of segments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param totalSegments <p>
     *            The total number of segments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Segment withTotalSegments(Integer totalSegments) {
        this.totalSegments = totalSegments;
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
        if (getSegmentNumber() != null)
            sb.append("SegmentNumber: " + getSegmentNumber() + ",");
        if (getTotalSegments() != null)
            sb.append("TotalSegments: " + getTotalSegments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSegmentNumber() == null) ? 0 : getSegmentNumber().hashCode());
        hashCode = prime * hashCode
                + ((getTotalSegments() == null) ? 0 : getTotalSegments().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Segment == false)
            return false;
        Segment other = (Segment) obj;

        if (other.getSegmentNumber() == null ^ this.getSegmentNumber() == null)
            return false;
        if (other.getSegmentNumber() != null
                && other.getSegmentNumber().equals(this.getSegmentNumber()) == false)
            return false;
        if (other.getTotalSegments() == null ^ this.getTotalSegments() == null)
            return false;
        if (other.getTotalSegments() != null
                && other.getTotalSegments().equals(this.getTotalSegments()) == false)
            return false;
        return true;
    }
}
