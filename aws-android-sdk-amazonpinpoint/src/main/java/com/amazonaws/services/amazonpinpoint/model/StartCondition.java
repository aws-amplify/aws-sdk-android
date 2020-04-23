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

package com.amazonaws.services.amazonpinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the conditions for the first activity in a journey. This activity
 * and its conditions determine which users are participants in a journey.
 * </p>
 */
public class StartCondition implements Serializable {
    /**
     * <p>
     * The custom description of the condition.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The segment that's associated with the first activity in the journey.
     * This segment determines which users are participants in the journey.
     * </p>
     */
    private SegmentCondition segmentStartCondition;

    /**
     * <p>
     * The custom description of the condition.
     * </p>
     *
     * @return <p>
     *         The custom description of the condition.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The custom description of the condition.
     * </p>
     *
     * @param description <p>
     *            The custom description of the condition.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The custom description of the condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The custom description of the condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartCondition withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The segment that's associated with the first activity in the journey.
     * This segment determines which users are participants in the journey.
     * </p>
     *
     * @return <p>
     *         The segment that's associated with the first activity in the
     *         journey. This segment determines which users are participants in
     *         the journey.
     *         </p>
     */
    public SegmentCondition getSegmentStartCondition() {
        return segmentStartCondition;
    }

    /**
     * <p>
     * The segment that's associated with the first activity in the journey.
     * This segment determines which users are participants in the journey.
     * </p>
     *
     * @param segmentStartCondition <p>
     *            The segment that's associated with the first activity in the
     *            journey. This segment determines which users are participants
     *            in the journey.
     *            </p>
     */
    public void setSegmentStartCondition(SegmentCondition segmentStartCondition) {
        this.segmentStartCondition = segmentStartCondition;
    }

    /**
     * <p>
     * The segment that's associated with the first activity in the journey.
     * This segment determines which users are participants in the journey.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentStartCondition <p>
     *            The segment that's associated with the first activity in the
     *            journey. This segment determines which users are participants
     *            in the journey.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartCondition withSegmentStartCondition(SegmentCondition segmentStartCondition) {
        this.segmentStartCondition = segmentStartCondition;
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSegmentStartCondition() != null)
            sb.append("SegmentStartCondition: " + getSegmentStartCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getSegmentStartCondition() == null) ? 0 : getSegmentStartCondition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartCondition == false)
            return false;
        StartCondition other = (StartCondition) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSegmentStartCondition() == null ^ this.getSegmentStartCondition() == null)
            return false;
        if (other.getSegmentStartCondition() != null
                && other.getSegmentStartCondition().equals(this.getSegmentStartCondition()) == false)
            return false;
        return true;
    }
}
