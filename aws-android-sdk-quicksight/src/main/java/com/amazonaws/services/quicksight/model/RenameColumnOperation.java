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
 * A transform operation that renames a column.
 * </p>
 */
public class RenameColumnOperation implements Serializable {
    /**
     * <p>
     * The name of the column to be renamed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String columnName;

    /**
     * <p>
     * The new name for the column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String newColumnName;

    /**
     * <p>
     * The name of the column to be renamed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The name of the column to be renamed.
     *         </p>
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * <p>
     * The name of the column to be renamed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param columnName <p>
     *            The name of the column to be renamed.
     *            </p>
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * <p>
     * The name of the column to be renamed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param columnName <p>
     *            The name of the column to be renamed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RenameColumnOperation withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * <p>
     * The new name for the column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The new name for the column.
     *         </p>
     */
    public String getNewColumnName() {
        return newColumnName;
    }

    /**
     * <p>
     * The new name for the column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param newColumnName <p>
     *            The new name for the column.
     *            </p>
     */
    public void setNewColumnName(String newColumnName) {
        this.newColumnName = newColumnName;
    }

    /**
     * <p>
     * The new name for the column.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param newColumnName <p>
     *            The new name for the column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RenameColumnOperation withNewColumnName(String newColumnName) {
        this.newColumnName = newColumnName;
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
        if (getNewColumnName() != null)
            sb.append("NewColumnName: " + getNewColumnName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        hashCode = prime * hashCode
                + ((getNewColumnName() == null) ? 0 : getNewColumnName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RenameColumnOperation == false)
            return false;
        RenameColumnOperation other = (RenameColumnOperation) obj;

        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null
                && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        if (other.getNewColumnName() == null ^ this.getNewColumnName() == null)
            return false;
        if (other.getNewColumnName() != null
                && other.getNewColumnName().equals(this.getNewColumnName()) == false)
            return false;
        return true;
    }
}
