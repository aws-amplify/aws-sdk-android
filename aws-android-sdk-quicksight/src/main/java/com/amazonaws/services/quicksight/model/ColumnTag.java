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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * A tag for a column in a <a>TagColumnOperation</a> structure. This is a
 * variant type structure. For this structure to be valid, only one of the
 * attributes can be non-null.
 * </p>
 */
public class ColumnTag implements Serializable {
    /**
     * <p>
     * A geospatial role for a column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COUNTRY, STATE, COUNTY, CITY, POSTCODE, LONGITUDE,
     * LATITUDE
     */
    private String columnGeographicRole;

    /**
     * <p>
     * A geospatial role for a column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COUNTRY, STATE, COUNTY, CITY, POSTCODE, LONGITUDE,
     * LATITUDE
     *
     * @return <p>
     *         A geospatial role for a column.
     *         </p>
     * @see GeoSpatialDataRole
     */
    public String getColumnGeographicRole() {
        return columnGeographicRole;
    }

    /**
     * <p>
     * A geospatial role for a column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COUNTRY, STATE, COUNTY, CITY, POSTCODE, LONGITUDE,
     * LATITUDE
     *
     * @param columnGeographicRole <p>
     *            A geospatial role for a column.
     *            </p>
     * @see GeoSpatialDataRole
     */
    public void setColumnGeographicRole(String columnGeographicRole) {
        this.columnGeographicRole = columnGeographicRole;
    }

    /**
     * <p>
     * A geospatial role for a column.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COUNTRY, STATE, COUNTY, CITY, POSTCODE, LONGITUDE,
     * LATITUDE
     *
     * @param columnGeographicRole <p>
     *            A geospatial role for a column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GeoSpatialDataRole
     */
    public ColumnTag withColumnGeographicRole(String columnGeographicRole) {
        this.columnGeographicRole = columnGeographicRole;
        return this;
    }

    /**
     * <p>
     * A geospatial role for a column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COUNTRY, STATE, COUNTY, CITY, POSTCODE, LONGITUDE,
     * LATITUDE
     *
     * @param columnGeographicRole <p>
     *            A geospatial role for a column.
     *            </p>
     * @see GeoSpatialDataRole
     */
    public void setColumnGeographicRole(GeoSpatialDataRole columnGeographicRole) {
        this.columnGeographicRole = columnGeographicRole.toString();
    }

    /**
     * <p>
     * A geospatial role for a column.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COUNTRY, STATE, COUNTY, CITY, POSTCODE, LONGITUDE,
     * LATITUDE
     *
     * @param columnGeographicRole <p>
     *            A geospatial role for a column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GeoSpatialDataRole
     */
    public ColumnTag withColumnGeographicRole(GeoSpatialDataRole columnGeographicRole) {
        this.columnGeographicRole = columnGeographicRole.toString();
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
        if (getColumnGeographicRole() != null)
            sb.append("ColumnGeographicRole: " + getColumnGeographicRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getColumnGeographicRole() == null) ? 0 : getColumnGeographicRole().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnTag == false)
            return false;
        ColumnTag other = (ColumnTag) obj;

        if (other.getColumnGeographicRole() == null ^ this.getColumnGeographicRole() == null)
            return false;
        if (other.getColumnGeographicRole() != null
                && other.getColumnGeographicRole().equals(this.getColumnGeographicRole()) == false)
            return false;
        return true;
    }
}
