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
 * The metadata and rows that comprise a query result set. The metadata
 * describes the column structure and data types. To return a
 * <code>ResultSet</code> object, use <a>GetQueryResults</a>.
 * </p>
 */
public class ResultSet implements Serializable {
    /**
     * <p>
     * The rows in the table.
     * </p>
     */
    private java.util.List<Row> rows;

    /**
     * <p>
     * The metadata that describes the column structure and data types of a
     * table of query results.
     * </p>
     */
    private ResultSetMetadata resultSetMetadata;

    /**
     * <p>
     * The rows in the table.
     * </p>
     *
     * @return <p>
     *         The rows in the table.
     *         </p>
     */
    public java.util.List<Row> getRows() {
        return rows;
    }

    /**
     * <p>
     * The rows in the table.
     * </p>
     *
     * @param rows <p>
     *            The rows in the table.
     *            </p>
     */
    public void setRows(java.util.Collection<Row> rows) {
        if (rows == null) {
            this.rows = null;
            return;
        }

        this.rows = new java.util.ArrayList<Row>(rows);
    }

    /**
     * <p>
     * The rows in the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rows <p>
     *            The rows in the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultSet withRows(Row... rows) {
        if (getRows() == null) {
            this.rows = new java.util.ArrayList<Row>(rows.length);
        }
        for (Row value : rows) {
            this.rows.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The rows in the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rows <p>
     *            The rows in the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultSet withRows(java.util.Collection<Row> rows) {
        setRows(rows);
        return this;
    }

    /**
     * <p>
     * The metadata that describes the column structure and data types of a
     * table of query results.
     * </p>
     *
     * @return <p>
     *         The metadata that describes the column structure and data types
     *         of a table of query results.
     *         </p>
     */
    public ResultSetMetadata getResultSetMetadata() {
        return resultSetMetadata;
    }

    /**
     * <p>
     * The metadata that describes the column structure and data types of a
     * table of query results.
     * </p>
     *
     * @param resultSetMetadata <p>
     *            The metadata that describes the column structure and data
     *            types of a table of query results.
     *            </p>
     */
    public void setResultSetMetadata(ResultSetMetadata resultSetMetadata) {
        this.resultSetMetadata = resultSetMetadata;
    }

    /**
     * <p>
     * The metadata that describes the column structure and data types of a
     * table of query results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resultSetMetadata <p>
     *            The metadata that describes the column structure and data
     *            types of a table of query results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultSet withResultSetMetadata(ResultSetMetadata resultSetMetadata) {
        this.resultSetMetadata = resultSetMetadata;
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
        if (getRows() != null)
            sb.append("Rows: " + getRows() + ",");
        if (getResultSetMetadata() != null)
            sb.append("ResultSetMetadata: " + getResultSetMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRows() == null) ? 0 : getRows().hashCode());
        hashCode = prime * hashCode
                + ((getResultSetMetadata() == null) ? 0 : getResultSetMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultSet == false)
            return false;
        ResultSet other = (ResultSet) obj;

        if (other.getRows() == null ^ this.getRows() == null)
            return false;
        if (other.getRows() != null && other.getRows().equals(this.getRows()) == false)
            return false;
        if (other.getResultSetMetadata() == null ^ this.getResultSetMetadata() == null)
            return false;
        if (other.getResultSetMetadata() != null
                && other.getResultSetMetadata().equals(this.getResultSetMetadata()) == false)
            return false;
        return true;
    }
}
