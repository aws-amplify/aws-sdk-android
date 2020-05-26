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
 * Groupings of columns that work together in certain Amazon QuickSight
 * features. This is a variant type structure. For this structure to be valid,
 * only one of the attributes can be non-null.
 * </p>
 */
public class ColumnGroup implements Serializable {
    /**
     * <p>
     * Geospatial column group that denotes a hierarchy.
     * </p>
     */
    private GeoSpatialColumnGroup geoSpatialColumnGroup;

    /**
     * <p>
     * Geospatial column group that denotes a hierarchy.
     * </p>
     *
     * @return <p>
     *         Geospatial column group that denotes a hierarchy.
     *         </p>
     */
    public GeoSpatialColumnGroup getGeoSpatialColumnGroup() {
        return geoSpatialColumnGroup;
    }

    /**
     * <p>
     * Geospatial column group that denotes a hierarchy.
     * </p>
     *
     * @param geoSpatialColumnGroup <p>
     *            Geospatial column group that denotes a hierarchy.
     *            </p>
     */
    public void setGeoSpatialColumnGroup(GeoSpatialColumnGroup geoSpatialColumnGroup) {
        this.geoSpatialColumnGroup = geoSpatialColumnGroup;
    }

    /**
     * <p>
     * Geospatial column group that denotes a hierarchy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geoSpatialColumnGroup <p>
     *            Geospatial column group that denotes a hierarchy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnGroup withGeoSpatialColumnGroup(GeoSpatialColumnGroup geoSpatialColumnGroup) {
        this.geoSpatialColumnGroup = geoSpatialColumnGroup;
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
        if (getGeoSpatialColumnGroup() != null)
            sb.append("GeoSpatialColumnGroup: " + getGeoSpatialColumnGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getGeoSpatialColumnGroup() == null) ? 0 : getGeoSpatialColumnGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnGroup == false)
            return false;
        ColumnGroup other = (ColumnGroup) obj;

        if (other.getGeoSpatialColumnGroup() == null ^ this.getGeoSpatialColumnGroup() == null)
            return false;
        if (other.getGeoSpatialColumnGroup() != null
                && other.getGeoSpatialColumnGroup().equals(this.getGeoSpatialColumnGroup()) == false)
            return false;
        return true;
    }
}
