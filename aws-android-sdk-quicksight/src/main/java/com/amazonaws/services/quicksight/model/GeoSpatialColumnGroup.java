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
 * Geospatial column group that denotes a hierarchy.
 * </p>
 */
public class GeoSpatialColumnGroup implements Serializable {
    /**
     * <p>
     * A display name for the hierarchy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String name;

    /**
     * <p>
     * Country code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>US
     */
    private String countryCode;

    /**
     * <p>
     * Columns in this hierarchy.
     * </p>
     */
    private java.util.List<String> columns;

    /**
     * <p>
     * A display name for the hierarchy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         A display name for the hierarchy.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A display name for the hierarchy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            A display name for the hierarchy.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A display name for the hierarchy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            A display name for the hierarchy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeoSpatialColumnGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Country code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>US
     *
     * @return <p>
     *         Country code.
     *         </p>
     * @see GeoSpatialCountryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * <p>
     * Country code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>US
     *
     * @param countryCode <p>
     *            Country code.
     *            </p>
     * @see GeoSpatialCountryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>
     * Country code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>US
     *
     * @param countryCode <p>
     *            Country code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GeoSpatialCountryCode
     */
    public GeoSpatialColumnGroup withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * <p>
     * Country code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>US
     *
     * @param countryCode <p>
     *            Country code.
     *            </p>
     * @see GeoSpatialCountryCode
     */
    public void setCountryCode(GeoSpatialCountryCode countryCode) {
        this.countryCode = countryCode.toString();
    }

    /**
     * <p>
     * Country code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>US
     *
     * @param countryCode <p>
     *            Country code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GeoSpatialCountryCode
     */
    public GeoSpatialColumnGroup withCountryCode(GeoSpatialCountryCode countryCode) {
        this.countryCode = countryCode.toString();
        return this;
    }

    /**
     * <p>
     * Columns in this hierarchy.
     * </p>
     *
     * @return <p>
     *         Columns in this hierarchy.
     *         </p>
     */
    public java.util.List<String> getColumns() {
        return columns;
    }

    /**
     * <p>
     * Columns in this hierarchy.
     * </p>
     *
     * @param columns <p>
     *            Columns in this hierarchy.
     *            </p>
     */
    public void setColumns(java.util.Collection<String> columns) {
        if (columns == null) {
            this.columns = null;
            return;
        }

        this.columns = new java.util.ArrayList<String>(columns);
    }

    /**
     * <p>
     * Columns in this hierarchy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columns <p>
     *            Columns in this hierarchy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeoSpatialColumnGroup withColumns(String... columns) {
        if (getColumns() == null) {
            this.columns = new java.util.ArrayList<String>(columns.length);
        }
        for (String value : columns) {
            this.columns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Columns in this hierarchy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columns <p>
     *            Columns in this hierarchy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeoSpatialColumnGroup withColumns(java.util.Collection<String> columns) {
        setColumns(columns);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getCountryCode() != null)
            sb.append("CountryCode: " + getCountryCode() + ",");
        if (getColumns() != null)
            sb.append("Columns: " + getColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        hashCode = prime * hashCode + ((getColumns() == null) ? 0 : getColumns().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeoSpatialColumnGroup == false)
            return false;
        GeoSpatialColumnGroup other = (GeoSpatialColumnGroup) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCountryCode() == null ^ this.getCountryCode() == null)
            return false;
        if (other.getCountryCode() != null
                && other.getCountryCode().equals(this.getCountryCode()) == false)
            return false;
        if (other.getColumns() == null ^ this.getColumns() == null)
            return false;
        if (other.getColumns() != null && other.getColumns().equals(this.getColumns()) == false)
            return false;
        return true;
    }
}
