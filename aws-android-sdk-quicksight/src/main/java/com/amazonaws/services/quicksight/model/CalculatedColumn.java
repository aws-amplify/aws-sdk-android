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
 * A calculated column for a dataset.
 * </p>
 */
public class CalculatedColumn implements Serializable {
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
     * A unique ID to identify a calculated column. During a dataset update, if
     * the column ID of a calculated column matches that of an existing
     * calculated column, Amazon QuickSight preserves the existing calculated
     * column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String columnId;

    /**
     * <p>
     * An expression that defines the calculated column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private String expression;

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
    public CalculatedColumn withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * <p>
     * A unique ID to identify a calculated column. During a dataset update, if
     * the column ID of a calculated column matches that of an existing
     * calculated column, Amazon QuickSight preserves the existing calculated
     * column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         A unique ID to identify a calculated column. During a dataset
     *         update, if the column ID of a calculated column matches that of
     *         an existing calculated column, Amazon QuickSight preserves the
     *         existing calculated column.
     *         </p>
     */
    public String getColumnId() {
        return columnId;
    }

    /**
     * <p>
     * A unique ID to identify a calculated column. During a dataset update, if
     * the column ID of a calculated column matches that of an existing
     * calculated column, Amazon QuickSight preserves the existing calculated
     * column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param columnId <p>
     *            A unique ID to identify a calculated column. During a dataset
     *            update, if the column ID of a calculated column matches that
     *            of an existing calculated column, Amazon QuickSight preserves
     *            the existing calculated column.
     *            </p>
     */
    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }

    /**
     * <p>
     * A unique ID to identify a calculated column. During a dataset update, if
     * the column ID of a calculated column matches that of an existing
     * calculated column, Amazon QuickSight preserves the existing calculated
     * column.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param columnId <p>
     *            A unique ID to identify a calculated column. During a dataset
     *            update, if the column ID of a calculated column matches that
     *            of an existing calculated column, Amazon QuickSight preserves
     *            the existing calculated column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculatedColumn withColumnId(String columnId) {
        this.columnId = columnId;
        return this;
    }

    /**
     * <p>
     * An expression that defines the calculated column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return <p>
     *         An expression that defines the calculated column.
     *         </p>
     */
    public String getExpression() {
        return expression;
    }

    /**
     * <p>
     * An expression that defines the calculated column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param expression <p>
     *            An expression that defines the calculated column.
     *            </p>
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * An expression that defines the calculated column.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param expression <p>
     *            An expression that defines the calculated column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculatedColumn withExpression(String expression) {
        this.expression = expression;
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
        if (getColumnId() != null)
            sb.append("ColumnId: " + getColumnId() + ",");
        if (getExpression() != null)
            sb.append("Expression: " + getExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        hashCode = prime * hashCode + ((getColumnId() == null) ? 0 : getColumnId().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CalculatedColumn == false)
            return false;
        CalculatedColumn other = (CalculatedColumn) obj;

        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null
                && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        if (other.getColumnId() == null ^ this.getColumnId() == null)
            return false;
        if (other.getColumnId() != null && other.getColumnId().equals(this.getColumnId()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null
                && other.getExpression().equals(this.getExpression()) == false)
            return false;
        return true;
    }
}
