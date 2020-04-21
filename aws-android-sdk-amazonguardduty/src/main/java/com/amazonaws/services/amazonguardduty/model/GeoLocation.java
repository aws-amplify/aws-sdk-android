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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the location of the remote IP address.
 * </p>
 */
public class GeoLocation implements Serializable {
    /**
     * <p>
     * The latitude information of the remote IP address.
     * </p>
     */
    private Double lat;

    /**
     * <p>
     * The longitude information of the remote IP address.
     * </p>
     */
    private Double lon;

    /**
     * <p>
     * The latitude information of the remote IP address.
     * </p>
     *
     * @return <p>
     *         The latitude information of the remote IP address.
     *         </p>
     */
    public Double getLat() {
        return lat;
    }

    /**
     * <p>
     * The latitude information of the remote IP address.
     * </p>
     *
     * @param lat <p>
     *            The latitude information of the remote IP address.
     *            </p>
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * <p>
     * The latitude information of the remote IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lat <p>
     *            The latitude information of the remote IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeoLocation withLat(Double lat) {
        this.lat = lat;
        return this;
    }

    /**
     * <p>
     * The longitude information of the remote IP address.
     * </p>
     *
     * @return <p>
     *         The longitude information of the remote IP address.
     *         </p>
     */
    public Double getLon() {
        return lon;
    }

    /**
     * <p>
     * The longitude information of the remote IP address.
     * </p>
     *
     * @param lon <p>
     *            The longitude information of the remote IP address.
     *            </p>
     */
    public void setLon(Double lon) {
        this.lon = lon;
    }

    /**
     * <p>
     * The longitude information of the remote IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lon <p>
     *            The longitude information of the remote IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeoLocation withLon(Double lon) {
        this.lon = lon;
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
        if (getLat() != null)
            sb.append("Lat: " + getLat() + ",");
        if (getLon() != null)
            sb.append("Lon: " + getLon());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLat() == null) ? 0 : getLat().hashCode());
        hashCode = prime * hashCode + ((getLon() == null) ? 0 : getLon().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeoLocation == false)
            return false;
        GeoLocation other = (GeoLocation) obj;

        if (other.getLat() == null ^ this.getLat() == null)
            return false;
        if (other.getLat() != null && other.getLat().equals(this.getLat()) == false)
            return false;
        if (other.getLon() == null ^ this.getLon() == null)
            return false;
        if (other.getLon() != null && other.getLon().equals(this.getLon()) == false)
            return false;
        return true;
    }
}
