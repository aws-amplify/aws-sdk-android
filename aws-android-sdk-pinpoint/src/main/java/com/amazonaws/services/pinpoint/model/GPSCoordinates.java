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
 * GPS coordinates
 */
public class GPSCoordinates implements Serializable {
    /**
     * Latitude
     */
    private Double latitude;

    /**
     * Longitude
     */
    private Double longitude;

    /**
     * Latitude
     *
     * @return Latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Latitude
     *
     * @param latitude Latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * Latitude
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param latitude Latitude
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GPSCoordinates withLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Longitude
     *
     * @return Longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Longitude
     *
     * @param longitude Longitude
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * Longitude
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param longitude Longitude
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GPSCoordinates withLongitude(Double longitude) {
        this.longitude = longitude;
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
        if (getLatitude() != null)
            sb.append("Latitude: " + getLatitude() + ",");
        if (getLongitude() != null)
            sb.append("Longitude: " + getLongitude());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        hashCode = prime * hashCode + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GPSCoordinates == false)
            return false;
        GPSCoordinates other = (GPSCoordinates) obj;

        if (other.getLatitude() == null ^ this.getLatitude() == null)
            return false;
        if (other.getLatitude() != null && other.getLatitude().equals(this.getLatitude()) == false)
            return false;
        if (other.getLongitude() == null ^ this.getLongitude() == null)
            return false;
        if (other.getLongitude() != null
                && other.getLongitude().equals(this.getLongitude()) == false)
            return false;
        return true;
    }
}
