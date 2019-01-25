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
 * GPS point location dimension
 */
public class GPSPointDimension implements Serializable {
    /**
     * Coordinate to measure distance from.
     */
    private GPSCoordinates coordinates;

    /**
     * Range in kilometers from the coordinate.
     */
    private Double rangeInKilometers;

    /**
     * Coordinate to measure distance from.
     *
     * @return Coordinate to measure distance from.
     */
    public GPSCoordinates getCoordinates() {
        return coordinates;
    }

    /**
     * Coordinate to measure distance from.
     *
     * @param coordinates Coordinate to measure distance from.
     */
    public void setCoordinates(GPSCoordinates coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * Coordinate to measure distance from.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param coordinates Coordinate to measure distance from.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GPSPointDimension withCoordinates(GPSCoordinates coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    /**
     * Range in kilometers from the coordinate.
     *
     * @return Range in kilometers from the coordinate.
     */
    public Double getRangeInKilometers() {
        return rangeInKilometers;
    }

    /**
     * Range in kilometers from the coordinate.
     *
     * @param rangeInKilometers Range in kilometers from the coordinate.
     */
    public void setRangeInKilometers(Double rangeInKilometers) {
        this.rangeInKilometers = rangeInKilometers;
    }

    /**
     * Range in kilometers from the coordinate.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rangeInKilometers Range in kilometers from the coordinate.
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
