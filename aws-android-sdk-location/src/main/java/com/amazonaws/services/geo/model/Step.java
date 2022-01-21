/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

/**
 * <p>
 * Represents an element of a leg within a route. A step contains instructions
 * for how to move to the next step in the leg.
 * </p>
 */
public class Step implements Serializable {
    /**
     * <p>
     * The travel distance between the step's <code>StartPosition</code> and
     * <code>EndPosition</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double distance;

    /**
     * <p>
     * The estimated travel time, in seconds, from the step's
     * <code>StartPosition</code> to the <code>EndPosition</code>. . The travel
     * mode and departure time that you specify in the request determines the
     * calculated time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double durationSeconds;

    /**
     * <p>
     * The end position of a step. If the position the last step in the leg,
     * this position is the same as the end position of the leg.
     * </p>
     */
    private java.util.List<Double> endPosition;

    /**
     * <p>
     * Represents the start position, or index, in a sequence of steps within
     * the leg's line string geometry. For example, the index of the first step
     * in a leg geometry is <code>0</code>.
     * </p>
     * <p>
     * Included in the response for queries that set
     * <code>IncludeLegGeometry</code> to <code>True</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer geometryOffset;

    /**
     * <p>
     * The starting position of a step. If the position is the first step in the
     * leg, this position is the same as the start position of the leg.
     * </p>
     */
    private java.util.List<Double> startPosition;

    /**
     * <p>
     * The travel distance between the step's <code>StartPosition</code> and
     * <code>EndPosition</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The travel distance between the step's <code>StartPosition</code>
     *         and <code>EndPosition</code>.
     *         </p>
     */
    public Double getDistance() {
        return distance;
    }

    /**
     * <p>
     * The travel distance between the step's <code>StartPosition</code> and
     * <code>EndPosition</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param distance <p>
     *            The travel distance between the step's
     *            <code>StartPosition</code> and <code>EndPosition</code>.
     *            </p>
     */
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    /**
     * <p>
     * The travel distance between the step's <code>StartPosition</code> and
     * <code>EndPosition</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param distance <p>
     *            The travel distance between the step's
     *            <code>StartPosition</code> and <code>EndPosition</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withDistance(Double distance) {
        this.distance = distance;
        return this;
    }

    /**
     * <p>
     * The estimated travel time, in seconds, from the step's
     * <code>StartPosition</code> to the <code>EndPosition</code>. . The travel
     * mode and departure time that you specify in the request determines the
     * calculated time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The estimated travel time, in seconds, from the step's
     *         <code>StartPosition</code> to the <code>EndPosition</code>. . The
     *         travel mode and departure time that you specify in the request
     *         determines the calculated time.
     *         </p>
     */
    public Double getDurationSeconds() {
        return durationSeconds;
    }

    /**
     * <p>
     * The estimated travel time, in seconds, from the step's
     * <code>StartPosition</code> to the <code>EndPosition</code>. . The travel
     * mode and departure time that you specify in the request determines the
     * calculated time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param durationSeconds <p>
     *            The estimated travel time, in seconds, from the step's
     *            <code>StartPosition</code> to the <code>EndPosition</code>. .
     *            The travel mode and departure time that you specify in the
     *            request determines the calculated time.
     *            </p>
     */
    public void setDurationSeconds(Double durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The estimated travel time, in seconds, from the step's
     * <code>StartPosition</code> to the <code>EndPosition</code>. . The travel
     * mode and departure time that you specify in the request determines the
     * calculated time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param durationSeconds <p>
     *            The estimated travel time, in seconds, from the step's
     *            <code>StartPosition</code> to the <code>EndPosition</code>. .
     *            The travel mode and departure time that you specify in the
     *            request determines the calculated time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withDurationSeconds(Double durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    /**
     * <p>
     * The end position of a step. If the position the last step in the leg,
     * this position is the same as the end position of the leg.
     * </p>
     *
     * @return <p>
     *         The end position of a step. If the position the last step in the
     *         leg, this position is the same as the end position of the leg.
     *         </p>
     */
    public java.util.List<Double> getEndPosition() {
        return endPosition;
    }

    /**
     * <p>
     * The end position of a step. If the position the last step in the leg,
     * this position is the same as the end position of the leg.
     * </p>
     *
     * @param endPosition <p>
     *            The end position of a step. If the position the last step in
     *            the leg, this position is the same as the end position of the
     *            leg.
     *            </p>
     */
    public void setEndPosition(java.util.Collection<Double> endPosition) {
        if (endPosition == null) {
            this.endPosition = null;
            return;
        }

        this.endPosition = new java.util.ArrayList<Double>(endPosition);
    }

    /**
     * <p>
     * The end position of a step. If the position the last step in the leg,
     * this position is the same as the end position of the leg.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endPosition <p>
     *            The end position of a step. If the position the last step in
     *            the leg, this position is the same as the end position of the
     *            leg.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withEndPosition(Double... endPosition) {
        if (getEndPosition() == null) {
            this.endPosition = new java.util.ArrayList<Double>(endPosition.length);
        }
        for (Double value : endPosition) {
            this.endPosition.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The end position of a step. If the position the last step in the leg,
     * this position is the same as the end position of the leg.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endPosition <p>
     *            The end position of a step. If the position the last step in
     *            the leg, this position is the same as the end position of the
     *            leg.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withEndPosition(java.util.Collection<Double> endPosition) {
        setEndPosition(endPosition);
        return this;
    }

    /**
     * <p>
     * Represents the start position, or index, in a sequence of steps within
     * the leg's line string geometry. For example, the index of the first step
     * in a leg geometry is <code>0</code>.
     * </p>
     * <p>
     * Included in the response for queries that set
     * <code>IncludeLegGeometry</code> to <code>True</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         Represents the start position, or index, in a sequence of steps
     *         within the leg's line string geometry. For example, the index of
     *         the first step in a leg geometry is <code>0</code>.
     *         </p>
     *         <p>
     *         Included in the response for queries that set
     *         <code>IncludeLegGeometry</code> to <code>True</code>.
     *         </p>
     */
    public Integer getGeometryOffset() {
        return geometryOffset;
    }

    /**
     * <p>
     * Represents the start position, or index, in a sequence of steps within
     * the leg's line string geometry. For example, the index of the first step
     * in a leg geometry is <code>0</code>.
     * </p>
     * <p>
     * Included in the response for queries that set
     * <code>IncludeLegGeometry</code> to <code>True</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param geometryOffset <p>
     *            Represents the start position, or index, in a sequence of
     *            steps within the leg's line string geometry. For example, the
     *            index of the first step in a leg geometry is <code>0</code>.
     *            </p>
     *            <p>
     *            Included in the response for queries that set
     *            <code>IncludeLegGeometry</code> to <code>True</code>.
     *            </p>
     */
    public void setGeometryOffset(Integer geometryOffset) {
        this.geometryOffset = geometryOffset;
    }

    /**
     * <p>
     * Represents the start position, or index, in a sequence of steps within
     * the leg's line string geometry. For example, the index of the first step
     * in a leg geometry is <code>0</code>.
     * </p>
     * <p>
     * Included in the response for queries that set
     * <code>IncludeLegGeometry</code> to <code>True</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param geometryOffset <p>
     *            Represents the start position, or index, in a sequence of
     *            steps within the leg's line string geometry. For example, the
     *            index of the first step in a leg geometry is <code>0</code>.
     *            </p>
     *            <p>
     *            Included in the response for queries that set
     *            <code>IncludeLegGeometry</code> to <code>True</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withGeometryOffset(Integer geometryOffset) {
        this.geometryOffset = geometryOffset;
        return this;
    }

    /**
     * <p>
     * The starting position of a step. If the position is the first step in the
     * leg, this position is the same as the start position of the leg.
     * </p>
     *
     * @return <p>
     *         The starting position of a step. If the position is the first
     *         step in the leg, this position is the same as the start position
     *         of the leg.
     *         </p>
     */
    public java.util.List<Double> getStartPosition() {
        return startPosition;
    }

    /**
     * <p>
     * The starting position of a step. If the position is the first step in the
     * leg, this position is the same as the start position of the leg.
     * </p>
     *
     * @param startPosition <p>
     *            The starting position of a step. If the position is the first
     *            step in the leg, this position is the same as the start
     *            position of the leg.
     *            </p>
     */
    public void setStartPosition(java.util.Collection<Double> startPosition) {
        if (startPosition == null) {
            this.startPosition = null;
            return;
        }

        this.startPosition = new java.util.ArrayList<Double>(startPosition);
    }

    /**
     * <p>
     * The starting position of a step. If the position is the first step in the
     * leg, this position is the same as the start position of the leg.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startPosition <p>
     *            The starting position of a step. If the position is the first
     *            step in the leg, this position is the same as the start
     *            position of the leg.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withStartPosition(Double... startPosition) {
        if (getStartPosition() == null) {
            this.startPosition = new java.util.ArrayList<Double>(startPosition.length);
        }
        for (Double value : startPosition) {
            this.startPosition.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The starting position of a step. If the position is the first step in the
     * leg, this position is the same as the start position of the leg.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startPosition <p>
     *            The starting position of a step. If the position is the first
     *            step in the leg, this position is the same as the start
     *            position of the leg.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withStartPosition(java.util.Collection<Double> startPosition) {
        setStartPosition(startPosition);
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
        if (getDistance() != null)
            sb.append("Distance: " + getDistance() + ",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: " + getDurationSeconds() + ",");
        if (getEndPosition() != null)
            sb.append("EndPosition: " + getEndPosition() + ",");
        if (getGeometryOffset() != null)
            sb.append("GeometryOffset: " + getGeometryOffset() + ",");
        if (getStartPosition() != null)
            sb.append("StartPosition: " + getStartPosition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistance() == null) ? 0 : getDistance().hashCode());
        hashCode = prime * hashCode
                + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getEndPosition() == null) ? 0 : getEndPosition().hashCode());
        hashCode = prime * hashCode
                + ((getGeometryOffset() == null) ? 0 : getGeometryOffset().hashCode());
        hashCode = prime * hashCode
                + ((getStartPosition() == null) ? 0 : getStartPosition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Step == false)
            return false;
        Step other = (Step) obj;

        if (other.getDistance() == null ^ this.getDistance() == null)
            return false;
        if (other.getDistance() != null && other.getDistance().equals(this.getDistance()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null
                && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getEndPosition() == null ^ this.getEndPosition() == null)
            return false;
        if (other.getEndPosition() != null
                && other.getEndPosition().equals(this.getEndPosition()) == false)
            return false;
        if (other.getGeometryOffset() == null ^ this.getGeometryOffset() == null)
            return false;
        if (other.getGeometryOffset() != null
                && other.getGeometryOffset().equals(this.getGeometryOffset()) == false)
            return false;
        if (other.getStartPosition() == null ^ this.getStartPosition() == null)
            return false;
        if (other.getStartPosition() != null
                && other.getStartPosition().equals(this.getStartPosition()) == false)
            return false;
        return true;
    }
}
