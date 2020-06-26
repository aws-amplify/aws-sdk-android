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
 * A transform operation that casts a column to a different type.
 * </p>
 */
public class CastColumnTypeOperation implements Serializable {
    /**
     * <p>
     * Column name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String columnName;

    /**
     * <p>
     * New column data type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DECIMAL, DATETIME
     */
    private String newColumnType;

    /**
     * <p>
     * When casting a column from string to datetime type, you can supply a
     * string in a format supported by Amazon QuickSight to denote the source
     * data format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String format;

    /**
     * <p>
     * Column name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         Column name.
     *         </p>
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * <p>
     * Column name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param columnName <p>
     *            Column name.
     *            </p>
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * <p>
     * Column name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param columnName <p>
     *            Column name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CastColumnTypeOperation withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * <p>
     * New column data type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DECIMAL, DATETIME
     *
     * @return <p>
     *         New column data type.
     *         </p>
     * @see ColumnDataType
     */
    public String getNewColumnType() {
        return newColumnType;
    }

    /**
     * <p>
     * New column data type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DECIMAL, DATETIME
     *
     * @param newColumnType <p>
     *            New column data type.
     *            </p>
     * @see ColumnDataType
     */
    public void setNewColumnType(String newColumnType) {
        this.newColumnType = newColumnType;
    }

    /**
     * <p>
     * New column data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DECIMAL, DATETIME
     *
     * @param newColumnType <p>
     *            New column data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ColumnDataType
     */
    public CastColumnTypeOperation withNewColumnType(String newColumnType) {
        this.newColumnType = newColumnType;
        return this;
    }

    /**
     * <p>
     * New column data type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DECIMAL, DATETIME
     *
     * @param newColumnType <p>
     *            New column data type.
     *            </p>
     * @see ColumnDataType
     */
    public void setNewColumnType(ColumnDataType newColumnType) {
        this.newColumnType = newColumnType.toString();
    }

    /**
     * <p>
     * New column data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DECIMAL, DATETIME
     *
     * @param newColumnType <p>
     *            New column data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ColumnDataType
     */
    public CastColumnTypeOperation withNewColumnType(ColumnDataType newColumnType) {
        this.newColumnType = newColumnType.toString();
        return this;
    }

    /**
     * <p>
     * When casting a column from string to datetime type, you can supply a
     * string in a format supported by Amazon QuickSight to denote the source
     * data format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         When casting a column from string to datetime type, you can
     *         supply a string in a format supported by Amazon QuickSight to
     *         denote the source data format.
     *         </p>
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * When casting a column from string to datetime type, you can supply a
     * string in a format supported by Amazon QuickSight to denote the source
     * data format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param format <p>
     *            When casting a column from string to datetime type, you can
     *            supply a string in a format supported by Amazon QuickSight to
     *            denote the source data format.
     *            </p>
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * When casting a column from string to datetime type, you can supply a
     * string in a format supported by Amazon QuickSight to denote the source
     * data format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param format <p>
     *            When casting a column from string to datetime type, you can
     *            supply a string in a format supported by Amazon QuickSight to
     *            denote the source data format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CastColumnTypeOperation withFormat(String format) {
        this.format = format;
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
        if (getColumnName() != null)
            sb.append("ColumnName: " + getColumnName() + ",");
        if (getNewColumnType() != null)
            sb.append("NewColumnType: " + getNewColumnType() + ",");
        if (getFormat() != null)
            sb.append("Format: " + getFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        hashCode = prime * hashCode
                + ((getNewColumnType() == null) ? 0 : getNewColumnType().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CastColumnTypeOperation == false)
            return false;
        CastColumnTypeOperation other = (CastColumnTypeOperation) obj;

        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null
                && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        if (other.getNewColumnType() == null ^ this.getNewColumnType() == null)
            return false;
        if (other.getNewColumnType() != null
                && other.getNewColumnType().equals(this.getNewColumnType()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        return true;
    }
}
