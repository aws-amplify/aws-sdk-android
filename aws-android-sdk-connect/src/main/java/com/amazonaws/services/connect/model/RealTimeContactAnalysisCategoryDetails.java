/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about the category rule that was matched.
 * </p>
 */
public class RealTimeContactAnalysisCategoryDetails implements Serializable {
    /**
     * <p>
     * List of PointOfInterest - objects describing a single match of a rule.
     * </p>
     */
    private java.util.List<RealTimeContactAnalysisPointOfInterest> pointsOfInterest;

    /**
     * <p>
     * List of PointOfInterest - objects describing a single match of a rule.
     * </p>
     *
     * @return <p>
     *         List of PointOfInterest - objects describing a single match of a
     *         rule.
     *         </p>
     */
    public java.util.List<RealTimeContactAnalysisPointOfInterest> getPointsOfInterest() {
        return pointsOfInterest;
    }

    /**
     * <p>
     * List of PointOfInterest - objects describing a single match of a rule.
     * </p>
     *
     * @param pointsOfInterest <p>
     *            List of PointOfInterest - objects describing a single match of
     *            a rule.
     *            </p>
     */
    public void setPointsOfInterest(
            java.util.Collection<RealTimeContactAnalysisPointOfInterest> pointsOfInterest) {
        if (pointsOfInterest == null) {
            this.pointsOfInterest = null;
            return;
        }

        this.pointsOfInterest = new java.util.ArrayList<RealTimeContactAnalysisPointOfInterest>(
                pointsOfInterest);
    }

    /**
     * <p>
     * List of PointOfInterest - objects describing a single match of a rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pointsOfInterest <p>
     *            List of PointOfInterest - objects describing a single match of
     *            a rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisCategoryDetails withPointsOfInterest(
            RealTimeContactAnalysisPointOfInterest... pointsOfInterest) {
        if (getPointsOfInterest() == null) {
            this.pointsOfInterest = new java.util.ArrayList<RealTimeContactAnalysisPointOfInterest>(
                    pointsOfInterest.length);
        }
        for (RealTimeContactAnalysisPointOfInterest value : pointsOfInterest) {
            this.pointsOfInterest.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of PointOfInterest - objects describing a single match of a rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pointsOfInterest <p>
     *            List of PointOfInterest - objects describing a single match of
     *            a rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisCategoryDetails withPointsOfInterest(
            java.util.Collection<RealTimeContactAnalysisPointOfInterest> pointsOfInterest) {
        setPointsOfInterest(pointsOfInterest);
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
        if (getPointsOfInterest() != null)
            sb.append("PointsOfInterest: " + getPointsOfInterest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPointsOfInterest() == null) ? 0 : getPointsOfInterest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealTimeContactAnalysisCategoryDetails == false)
            return false;
        RealTimeContactAnalysisCategoryDetails other = (RealTimeContactAnalysisCategoryDetails) obj;

        if (other.getPointsOfInterest() == null ^ this.getPointsOfInterest() == null)
            return false;
        if (other.getPointsOfInterest() != null
                && other.getPointsOfInterest().equals(this.getPointsOfInterest()) == false)
            return false;
        return true;
    }
}
