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
 * Specifies a condition to evaluate for an activity in a journey.
 * </p>
 */
public class SimpleCondition implements Serializable {
    /**
     * <p>
     * The dimension settings for the event that's associated with the activity.
     * </p>
     */
    private EventCondition eventCondition;

    /**
     * <p>
     * The segment that's associated with the activity.
     * </p>
     */
    private SegmentCondition segmentCondition;

    /**
     * <p>
     * The dimension settings for the segment that's associated with the
     * activity.
     * </p>
     */
    private SegmentDimensions segmentDimensions;

    /**
     * <p>
     * The dimension settings for the event that's associated with the activity.
     * </p>
     *
     * @return <p>
     *         The dimension settings for the event that's associated with the
     *         activity.
     *         </p>
     */
    public EventCondition getEventCondition() {
        return eventCondition;
    }

    /**
     * <p>
     * The dimension settings for the event that's associated with the activity.
     * </p>
     *
     * @param eventCondition <p>
     *            The dimension settings for the event that's associated with
     *            the activity.
     *            </p>
     */
    public void setEventCondition(EventCondition eventCondition) {
        this.eventCondition = eventCondition;
    }

    /**
     * <p>
     * The dimension settings for the event that's associated with the activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventCondition <p>
     *            The dimension settings for the event that's associated with
     *            the activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimpleCondition withEventCondition(EventCondition eventCondition) {
        this.eventCondition = eventCondition;
        return this;
    }

    /**
     * <p>
     * The segment that's associated with the activity.
     * </p>
     *
     * @return <p>
     *         The segment that's associated with the activity.
     *         </p>
     */
    public SegmentCondition getSegmentCondition() {
        return segmentCondition;
    }

    /**
     * <p>
     * The segment that's associated with the activity.
     * </p>
     *
     * @param segmentCondition <p>
     *            The segment that's associated with the activity.
     *            </p>
     */
    public void setSegmentCondition(SegmentCondition segmentCondition) {
        this.segmentCondition = segmentCondition;
    }

    /**
     * <p>
     * The segment that's associated with the activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentCondition <p>
     *            The segment that's associated with the activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimpleCondition withSegmentCondition(SegmentCondition segmentCondition) {
        this.segmentCondition = segmentCondition;
        return this;
    }

    /**
     * <p>
     * The dimension settings for the segment that's associated with the
     * activity.
     * </p>
     *
     * @return <p>
     *         The dimension settings for the segment that's associated with the
     *         activity.
     *         </p>
     */
    public SegmentDimensions getSegmentDimensions() {
        return segmentDimensions;
    }

    /**
     * <p>
     * The dimension settings for the segment that's associated with the
     * activity.
     * </p>
     *
     * @param segmentDimensions <p>
     *            The dimension settings for the segment that's associated with
     *            the activity.
     *            </p>
     */
    public void setSegmentDimensions(SegmentDimensions segmentDimensions) {
        this.segmentDimensions = segmentDimensions;
    }

    /**
     * <p>
     * The dimension settings for the segment that's associated with the
     * activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentDimensions <p>
     *            The dimension settings for the segment that's associated with
     *            the activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimpleCondition withSegmentDimensions(SegmentDimensions segmentDimensions) {
        this.segmentDimensions = segmentDimensions;
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
        if (getEventCondition() != null)
            sb.append("EventCondition: " + getEventCondition() + ",");
        if (getSegmentCondition() != null)
            sb.append("SegmentCondition: " + getSegmentCondition() + ",");
        if (getSegmentDimensions() != null)
            sb.append("SegmentDimensions: " + getSegmentDimensions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEventCondition() == null) ? 0 : getEventCondition().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentCondition() == null) ? 0 : getSegmentCondition().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentDimensions() == null) ? 0 : getSegmentDimensions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimpleCondition == false)
            return false;
        SimpleCondition other = (SimpleCondition) obj;

        if (other.getEventCondition() == null ^ this.getEventCondition() == null)
            return false;
        if (other.getEventCondition() != null
                && other.getEventCondition().equals(this.getEventCondition()) == false)
            return false;
        if (other.getSegmentCondition() == null ^ this.getSegmentCondition() == null)
            return false;
        if (other.getSegmentCondition() != null
                && other.getSegmentCondition().equals(this.getSegmentCondition()) == false)
            return false;
        if (other.getSegmentDimensions() == null ^ this.getSegmentDimensions() == null)
            return false;
        if (other.getSegmentDimensions() != null
                && other.getSegmentDimensions().equals(this.getSegmentDimensions()) == false)
            return false;
        return true;
    }
}
