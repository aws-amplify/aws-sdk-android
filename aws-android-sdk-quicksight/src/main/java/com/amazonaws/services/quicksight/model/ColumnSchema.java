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
 * The column schema.
 * </p>
 */
public class ColumnSchema implements Serializable {
    /**
     * <p>
     * The name of the column schema.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The data type of the column schema.
     * </p>
     */
    private String dataType;

    /**
     * <p>
     * The geographic role of the column schema.
     * </p>
     */
    private String geographicRole;

    /**
     * <p>
     * The name of the column schema.
     * </p>
     *
     * @return <p>
     *         The name of the column schema.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the column schema.
     * </p>
     *
     * @param name <p>
     *            The name of the column schema.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the column schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the column schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnSchema withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The data type of the column schema.
     * </p>
     *
     * @return <p>
     *         The data type of the column schema.
     *         </p>
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * <p>
     * The data type of the column schema.
     * </p>
     *
     * @param dataType <p>
     *            The data type of the column schema.
     *            </p>
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type of the column schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataType <p>
     *            The data type of the column schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnSchema withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * <p>
     * The geographic role of the column schema.
     * </p>
     *
     * @return <p>
     *         The geographic role of the column schema.
     *         </p>
     */
    public String getGeographicRole() {
        return geographicRole;
    }

    /**
     * <p>
     * The geographic role of the column schema.
     * </p>
     *
     * @param geographicRole <p>
     *            The geographic role of the column schema.
     *            </p>
     */
    public void setGeographicRole(String geographicRole) {
        this.geographicRole = geographicRole;
    }

    /**
     * <p>
     * The geographic role of the column schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geographicRole <p>
     *            The geographic role of the column schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnSchema withGeographicRole(String geographicRole) {
        this.geographicRole = geographicRole;
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
        if (getDataType() != null)
            sb.append("DataType: " + getDataType() + ",");
        if (getGeographicRole() != null)
            sb.append("GeographicRole: " + getGeographicRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode
                + ((getGeographicRole() == null) ? 0 : getGeographicRole().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnSchema == false)
            return false;
        ColumnSchema other = (ColumnSchema) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getGeographicRole() == null ^ this.getGeographicRole() == null)
            return false;
        if (other.getGeographicRole() != null
                && other.getGeographicRole().equals(this.getGeographicRole()) == false)
            return false;
        return true;
    }
}
