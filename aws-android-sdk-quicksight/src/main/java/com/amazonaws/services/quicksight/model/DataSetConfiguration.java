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
 * Dataset configuration.
 * </p>
 */
public class DataSetConfiguration implements Serializable {
    /**
     * <p>
     * Placeholder.
     * </p>
     */
    private String placeholder;

    /**
     * <p>
     * Dataset schema.
     * </p>
     */
    private DataSetSchema dataSetSchema;

    /**
     * <p>
     * A structure containing the list of column group schemas.
     * </p>
     */
    private java.util.List<ColumnGroupSchema> columnGroupSchemaList;

    /**
     * <p>
     * Placeholder.
     * </p>
     *
     * @return <p>
     *         Placeholder.
     *         </p>
     */
    public String getPlaceholder() {
        return placeholder;
    }

    /**
     * <p>
     * Placeholder.
     * </p>
     *
     * @param placeholder <p>
     *            Placeholder.
     *            </p>
     */
    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    /**
     * <p>
     * Placeholder.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placeholder <p>
     *            Placeholder.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSetConfiguration withPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }

    /**
     * <p>
     * Dataset schema.
     * </p>
     *
     * @return <p>
     *         Dataset schema.
     *         </p>
     */
    public DataSetSchema getDataSetSchema() {
        return dataSetSchema;
    }

    /**
     * <p>
     * Dataset schema.
     * </p>
     *
     * @param dataSetSchema <p>
     *            Dataset schema.
     *            </p>
     */
    public void setDataSetSchema(DataSetSchema dataSetSchema) {
        this.dataSetSchema = dataSetSchema;
    }

    /**
     * <p>
     * Dataset schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSetSchema <p>
     *            Dataset schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSetConfiguration withDataSetSchema(DataSetSchema dataSetSchema) {
        this.dataSetSchema = dataSetSchema;
        return this;
    }

    /**
     * <p>
     * A structure containing the list of column group schemas.
     * </p>
     *
     * @return <p>
     *         A structure containing the list of column group schemas.
     *         </p>
     */
    public java.util.List<ColumnGroupSchema> getColumnGroupSchemaList() {
        return columnGroupSchemaList;
    }

    /**
     * <p>
     * A structure containing the list of column group schemas.
     * </p>
     *
     * @param columnGroupSchemaList <p>
     *            A structure containing the list of column group schemas.
     *            </p>
     */
    public void setColumnGroupSchemaList(
            java.util.Collection<ColumnGroupSchema> columnGroupSchemaList) {
        if (columnGroupSchemaList == null) {
            this.columnGroupSchemaList = null;
            return;
        }

        this.columnGroupSchemaList = new java.util.ArrayList<ColumnGroupSchema>(
                columnGroupSchemaList);
    }

    /**
     * <p>
     * A structure containing the list of column group schemas.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columnGroupSchemaList <p>
     *            A structure containing the list of column group schemas.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSetConfiguration withColumnGroupSchemaList(
            ColumnGroupSchema... columnGroupSchemaList) {
        if (getColumnGroupSchemaList() == null) {
            this.columnGroupSchemaList = new java.util.ArrayList<ColumnGroupSchema>(
                    columnGroupSchemaList.length);
        }
        for (ColumnGroupSchema value : columnGroupSchemaList) {
            this.columnGroupSchemaList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A structure containing the list of column group schemas.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columnGroupSchemaList <p>
     *            A structure containing the list of column group schemas.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSetConfiguration withColumnGroupSchemaList(
            java.util.Collection<ColumnGroupSchema> columnGroupSchemaList) {
        setColumnGroupSchemaList(columnGroupSchemaList);
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
        if (getPlaceholder() != null)
            sb.append("Placeholder: " + getPlaceholder() + ",");
        if (getDataSetSchema() != null)
            sb.append("DataSetSchema: " + getDataSetSchema() + ",");
        if (getColumnGroupSchemaList() != null)
            sb.append("ColumnGroupSchemaList: " + getColumnGroupSchemaList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPlaceholder() == null) ? 0 : getPlaceholder().hashCode());
        hashCode = prime * hashCode
                + ((getDataSetSchema() == null) ? 0 : getDataSetSchema().hashCode());
        hashCode = prime
                * hashCode
                + ((getColumnGroupSchemaList() == null) ? 0 : getColumnGroupSchemaList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSetConfiguration == false)
            return false;
        DataSetConfiguration other = (DataSetConfiguration) obj;

        if (other.getPlaceholder() == null ^ this.getPlaceholder() == null)
            return false;
        if (other.getPlaceholder() != null
                && other.getPlaceholder().equals(this.getPlaceholder()) == false)
            return false;
        if (other.getDataSetSchema() == null ^ this.getDataSetSchema() == null)
            return false;
        if (other.getDataSetSchema() != null
                && other.getDataSetSchema().equals(this.getDataSetSchema()) == false)
            return false;
        if (other.getColumnGroupSchemaList() == null ^ this.getColumnGroupSchemaList() == null)
            return false;
        if (other.getColumnGroupSchemaList() != null
                && other.getColumnGroupSchemaList().equals(this.getColumnGroupSchemaList()) == false)
            return false;
        return true;
    }
}
