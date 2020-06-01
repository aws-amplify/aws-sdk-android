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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

/**
 * <p>
 * The metadata that describes the column structure and data types of a table of
 * query results. To return a <code>ResultSetMetadata</code> object, use
 * <a>GetQueryResults</a>.
 * </p>
 */
public class ResultSetMetadata implements Serializable {
    /**
     * <p>
     * Information about the columns returned in a query result metadata.
     * </p>
     */
    private java.util.List<ColumnInfo> columnInfo;

    /**
     * <p>
     * Information about the columns returned in a query result metadata.
     * </p>
     *
     * @return <p>
     *         Information about the columns returned in a query result
     *         metadata.
     *         </p>
     */
    public java.util.List<ColumnInfo> getColumnInfo() {
        return columnInfo;
    }

    /**
     * <p>
     * Information about the columns returned in a query result metadata.
     * </p>
     *
     * @param columnInfo <p>
     *            Information about the columns returned in a query result
     *            metadata.
     *            </p>
     */
    public void setColumnInfo(java.util.Collection<ColumnInfo> columnInfo) {
        if (columnInfo == null) {
            this.columnInfo = null;
            return;
        }

        this.columnInfo = new java.util.ArrayList<ColumnInfo>(columnInfo);
    }

    /**
     * <p>
     * Information about the columns returned in a query result metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columnInfo <p>
     *            Information about the columns returned in a query result
     *            metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultSetMetadata withColumnInfo(ColumnInfo... columnInfo) {
        if (getColumnInfo() == null) {
            this.columnInfo = new java.util.ArrayList<ColumnInfo>(columnInfo.length);
        }
        for (ColumnInfo value : columnInfo) {
            this.columnInfo.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the columns returned in a query result metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columnInfo <p>
     *            Information about the columns returned in a query result
     *            metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultSetMetadata withColumnInfo(java.util.Collection<ColumnInfo> columnInfo) {
        setColumnInfo(columnInfo);
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
        if (getColumnInfo() != null)
            sb.append("ColumnInfo: " + getColumnInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnInfo() == null) ? 0 : getColumnInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultSetMetadata == false)
            return false;
        ResultSetMetadata other = (ResultSetMetadata) obj;

        if (other.getColumnInfo() == null ^ this.getColumnInfo() == null)
            return false;
        if (other.getColumnInfo() != null
                && other.getColumnInfo().equals(this.getColumnInfo()) == false)
            return false;
        return true;
    }
}
