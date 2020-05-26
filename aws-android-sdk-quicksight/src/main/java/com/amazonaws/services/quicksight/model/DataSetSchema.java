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
 * Dataset schema.
 * </p>
 */
public class DataSetSchema implements Serializable {
    /**
     * <p>
     * A structure containing the list of column schemas.
     * </p>
     */
    private java.util.List<ColumnSchema> columnSchemaList;

    /**
     * <p>
     * A structure containing the list of column schemas.
     * </p>
     *
     * @return <p>
     *         A structure containing the list of column schemas.
     *         </p>
     */
    public java.util.List<ColumnSchema> getColumnSchemaList() {
        return columnSchemaList;
    }

    /**
     * <p>
     * A structure containing the list of column schemas.
     * </p>
     *
     * @param columnSchemaList <p>
     *            A structure containing the list of column schemas.
     *            </p>
     */
    public void setColumnSchemaList(java.util.Collection<ColumnSchema> columnSchemaList) {
        if (columnSchemaList == null) {
            this.columnSchemaList = null;
            return;
        }

        this.columnSchemaList = new java.util.ArrayList<ColumnSchema>(columnSchemaList);
    }

    /**
     * <p>
     * A structure containing the list of column schemas.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columnSchemaList <p>
     *            A structure containing the list of column schemas.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSetSchema withColumnSchemaList(ColumnSchema... columnSchemaList) {
        if (getColumnSchemaList() == null) {
            this.columnSchemaList = new java.util.ArrayList<ColumnSchema>(columnSchemaList.length);
        }
        for (ColumnSchema value : columnSchemaList) {
            this.columnSchemaList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A structure containing the list of column schemas.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columnSchemaList <p>
     *            A structure containing the list of column schemas.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSetSchema withColumnSchemaList(java.util.Collection<ColumnSchema> columnSchemaList) {
        setColumnSchemaList(columnSchemaList);
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
        if (getColumnSchemaList() != null)
            sb.append("ColumnSchemaList: " + getColumnSchemaList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getColumnSchemaList() == null) ? 0 : getColumnSchemaList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSetSchema == false)
            return false;
        DataSetSchema other = (DataSetSchema) obj;

        if (other.getColumnSchemaList() == null ^ this.getColumnSchemaList() == null)
            return false;
        if (other.getColumnSchemaList() != null
                && other.getColumnSchemaList().equals(this.getColumnSchemaList()) == false)
            return false;
        return true;
    }
}
