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
 * The column group schema.
 * </p>
 */
public class ColumnGroupSchema implements Serializable {
    /**
     * <p>
     * The name of the column group schema.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A structure containing the list of schemas for column group columns.
     * </p>
     */
    private java.util.List<ColumnGroupColumnSchema> columnGroupColumnSchemaList;

    /**
     * <p>
     * The name of the column group schema.
     * </p>
     *
     * @return <p>
     *         The name of the column group schema.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the column group schema.
     * </p>
     *
     * @param name <p>
     *            The name of the column group schema.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the column group schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the column group schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnGroupSchema withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A structure containing the list of schemas for column group columns.
     * </p>
     *
     * @return <p>
     *         A structure containing the list of schemas for column group
     *         columns.
     *         </p>
     */
    public java.util.List<ColumnGroupColumnSchema> getColumnGroupColumnSchemaList() {
        return columnGroupColumnSchemaList;
    }

    /**
     * <p>
     * A structure containing the list of schemas for column group columns.
     * </p>
     *
     * @param columnGroupColumnSchemaList <p>
     *            A structure containing the list of schemas for column group
     *            columns.
     *            </p>
     */
    public void setColumnGroupColumnSchemaList(
            java.util.Collection<ColumnGroupColumnSchema> columnGroupColumnSchemaList) {
        if (columnGroupColumnSchemaList == null) {
            this.columnGroupColumnSchemaList = null;
            return;
        }

        this.columnGroupColumnSchemaList = new java.util.ArrayList<ColumnGroupColumnSchema>(
                columnGroupColumnSchemaList);
    }

    /**
     * <p>
     * A structure containing the list of schemas for column group columns.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columnGroupColumnSchemaList <p>
     *            A structure containing the list of schemas for column group
     *            columns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnGroupSchema withColumnGroupColumnSchemaList(
            ColumnGroupColumnSchema... columnGroupColumnSchemaList) {
        if (getColumnGroupColumnSchemaList() == null) {
            this.columnGroupColumnSchemaList = new java.util.ArrayList<ColumnGroupColumnSchema>(
                    columnGroupColumnSchemaList.length);
        }
        for (ColumnGroupColumnSchema value : columnGroupColumnSchemaList) {
            this.columnGroupColumnSchemaList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A structure containing the list of schemas for column group columns.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columnGroupColumnSchemaList <p>
     *            A structure containing the list of schemas for column group
     *            columns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnGroupSchema withColumnGroupColumnSchemaList(
            java.util.Collection<ColumnGroupColumnSchema> columnGroupColumnSchemaList) {
        setColumnGroupColumnSchemaList(columnGroupColumnSchemaList);
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
        if (getColumnGroupColumnSchemaList() != null)
            sb.append("ColumnGroupColumnSchemaList: " + getColumnGroupColumnSchemaList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getColumnGroupColumnSchemaList() == null) ? 0
                        : getColumnGroupColumnSchemaList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnGroupSchema == false)
            return false;
        ColumnGroupSchema other = (ColumnGroupSchema) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getColumnGroupColumnSchemaList() == null
                ^ this.getColumnGroupColumnSchemaList() == null)
            return false;
        if (other.getColumnGroupColumnSchemaList() != null
                && other.getColumnGroupColumnSchemaList().equals(
                        this.getColumnGroupColumnSchemaList()) == false)
            return false;
        return true;
    }
}
