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
 * The result for one <code>SnappedDeparturePosition</code>
 * <code>SnappedDestinationPosition</code> pair.
 * </p>
 */
public class RouteMatrixEntry implements Serializable {
    /**
     * <p>
     * The total distance of travel for the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double distance;

    /**
     * <p>
     * The expected duration of travel for the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double durationSeconds;

    /**
     * <p>
     * An error corresponding to the calculation of a route between the
     * <code>DeparturePosition</code> and <code>DestinationPosition</code>.
     * </p>
     */
    private RouteMatrixEntryError error;

    /**
     * <p>
     * The total distance of travel for the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The total distance of travel for the route.
     *         </p>
     */
    public Double getDistance() {
        return distance;
    }

    /**
     * <p>
     * The total distance of travel for the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param distance <p>
     *            The total distance of travel for the route.
     *            </p>
     */
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    /**
     * <p>
     * The total distance of travel for the route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param distance <p>
     *            The total distance of travel for the route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteMatrixEntry withDistance(Double distance) {
        this.distance = distance;
        return this;
    }

    /**
     * <p>
     * The expected duration of travel for the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The expected duration of travel for the route.
     *         </p>
     */
    public Double getDurationSeconds() {
        return durationSeconds;
    }

    /**
     * <p>
     * The expected duration of travel for the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param durationSeconds <p>
     *            The expected duration of travel for the route.
     *            </p>
     */
    public void setDurationSeconds(Double durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The expected duration of travel for the route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param durationSeconds <p>
     *            The expected duration of travel for the route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteMatrixEntry withDurationSeconds(Double durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    /**
     * <p>
     * An error corresponding to the calculation of a route between the
     * <code>DeparturePosition</code> and <code>DestinationPosition</code>.
     * </p>
     *
     * @return <p>
     *         An error corresponding to the calculation of a route between the
     *         <code>DeparturePosition</code> and
     *         <code>DestinationPosition</code>.
     *         </p>
     */
    public RouteMatrixEntryError getError() {
        return error;
    }

    /**
     * <p>
     * An error corresponding to the calculation of a route between the
     * <code>DeparturePosition</code> and <code>DestinationPosition</code>.
     * </p>
     *
     * @param error <p>
     *            An error corresponding to the calculation of a route between
     *            the <code>DeparturePosition</code> and
     *            <code>DestinationPosition</code>.
     *            </p>
     */
    public void setError(RouteMatrixEntryError error) {
        this.error = error;
    }

    /**
     * <p>
     * An error corresponding to the calculation of a route between the
     * <code>DeparturePosition</code> and <code>DestinationPosition</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param error <p>
     *            An error corresponding to the calculation of a route between
     *            the <code>DeparturePosition</code> and
     *            <code>DestinationPosition</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteMatrixEntry withError(RouteMatrixEntryError error) {
        this.error = error;
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
        if (getError() != null)
            sb.append("Error: " + getError());
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
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteMatrixEntry == false)
            return false;
        RouteMatrixEntry other = (RouteMatrixEntry) obj;

        if (other.getDistance() == null ^ this.getDistance() == null)
            return false;
        if (other.getDistance() != null && other.getDistance().equals(this.getDistance()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null
                && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }
}
