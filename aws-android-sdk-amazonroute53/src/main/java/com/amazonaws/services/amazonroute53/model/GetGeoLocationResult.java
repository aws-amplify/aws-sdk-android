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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains the response information for the specified
 * geolocation code.
 * </p>
 */
public class GetGeoLocationResult implements Serializable {
    /**
     * <p>
     * A complex type that contains the codes and full continent, country, and
     * subdivision names for the specified geolocation code.
     * </p>
     */
    private GeoLocationDetails geoLocationDetails;

    /**
     * <p>
     * A complex type that contains the codes and full continent, country, and
     * subdivision names for the specified geolocation code.
     * </p>
     *
     * @return <p>
     *         A complex type that contains the codes and full continent,
     *         country, and subdivision names for the specified geolocation
     *         code.
     *         </p>
     */
    public GeoLocationDetails getGeoLocationDetails() {
        return geoLocationDetails;
    }

    /**
     * <p>
     * A complex type that contains the codes and full continent, country, and
     * subdivision names for the specified geolocation code.
     * </p>
     *
     * @param geoLocationDetails <p>
     *            A complex type that contains the codes and full continent,
     *            country, and subdivision names for the specified geolocation
     *            code.
     *            </p>
     */
    public void setGeoLocationDetails(GeoLocationDetails geoLocationDetails) {
        this.geoLocationDetails = geoLocationDetails;
    }

    /**
     * <p>
     * A complex type that contains the codes and full continent, country, and
     * subdivision names for the specified geolocation code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geoLocationDetails <p>
     *            A complex type that contains the codes and full continent,
     *            country, and subdivision names for the specified geolocation
     *            code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetGeoLocationResult withGeoLocationDetails(GeoLocationDetails geoLocationDetails) {
        this.geoLocationDetails = geoLocationDetails;
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
        if (getGeoLocationDetails() != null)
            sb.append("GeoLocationDetails: " + getGeoLocationDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGeoLocationDetails() == null) ? 0 : getGeoLocationDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGeoLocationResult == false)
            return false;
        GetGeoLocationResult other = (GetGeoLocationResult) obj;

        if (other.getGeoLocationDetails() == null ^ this.getGeoLocationDetails() == null)
            return false;
        if (other.getGeoLocationDetails() != null
                && other.getGeoLocationDetails().equals(this.getGeoLocationDetails()) == false)
            return false;
        return true;
    }
}
