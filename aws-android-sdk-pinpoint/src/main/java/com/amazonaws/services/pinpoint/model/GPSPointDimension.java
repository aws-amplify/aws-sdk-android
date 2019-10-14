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
 * <p>
 * Specifies GPS-based criteria for including or excluding endpoints from a
 * segment.
 * </p>
 */
public class GPSPointDimension implements Serializable {
    /**
     * <p>
     * The GPS coordinates to measure distance from.
     * </p>
     */
    private GPSCoordinates coordinates;

    /**
     * <p>
     * The range, in kilometers, from the GPS coordinates.
     * </p>
     */
    private Double rangeInKilometers;

    /**
     * <p>
     * The GPS coordinates to measure distance from.
     * </p>
     *
     * @return <p>
     *         The GPS coordinates to measure distance from.
     *         </p>
     */
    public GPSCoordinates getCoordinates() {
        return coordinates;
    }

    /**
     * <p>
     * The GPS coordinates to measure distance from.
     * </p>
     *
     * @param coordinates <p>
     *            The GPS coordinates to measure distance from.
     *            </p>
     */
    public void setCoordinates(GPSCoordinates coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * <p>
     * The GPS coordinates to measure distance from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param coordinates <p>
     *            The GPS coordinates to measure distance from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GPSPointDimension withCoordinates(GPSCoordinates coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    /**
     * <p>
     * The range, in kilometers, from the GPS coordinates.
     * </p>
     *
     * @return <p>
     *         The range, in kilometers, from the GPS coordinates.
     *         </p>
     */
    public Double getRangeInKilometers() {
        return rangeInKilometers;
    }

    /**
     * <p>
     * The range, in kilometers, from the GPS coordinates.
     * </p>
     *
     * @param rangeInKilometers <p>
     *            The range, in kilometers, from the GPS coordinates.
     *            </p>
     */
    public void setRangeInKilometers(Double rangeInKilometers) {
        this.rangeInKilometers = rangeInKilometers;
    }

    /**
     * <p>
     * The range, in kilometers, from the GPS coordinates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rangeInKilometers <p>
     *            The range, in kilometers, from the GPS coordinates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GPSPointDimension withRangeInKilometers(Double rangeInKilometers) {
        this.rangeInKilometers = rangeInKilometers;
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
        if (getCoordinates() != null)
            sb.append("Coordinates: " + getCoordinates() + ",");
        if (getRangeInKilometers() != null)
            sb.append("RangeInKilometers: " + getRangeInKilometers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCoordinates() == null) ? 0 : getCoordinates().hashCode());
        hashCode = prime * hashCode
                + ((getRangeInKilometers() == null) ? 0 : getRangeInKilometers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GPSPointDimension == false)
            return false;
        GPSPointDimension other = (GPSPointDimension) obj;

        if (other.getCoordinates() == null ^ this.getCoordinates() == null)
            return false;
        if (other.getCoordinates() != null
                && other.getCoordinates().equals(this.getCoordinates()) == false)
            return false;
        if (other.getRangeInKilometers() == null ^ this.getRangeInKilometers() == null)
            return false;
        if (other.getRangeInKilometers() != null
                && other.getRangeInKilometers().equals(this.getRangeInKilometers()) == false)
            return false;
        return true;
    }
}
