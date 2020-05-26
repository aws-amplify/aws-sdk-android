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
 * A transform operation that creates calculated columns. Columns created in one
 * such operation form a lexical closure.
 * </p>
 */
public class CreateColumnsOperation implements Serializable {
    /**
     * <p>
     * Calculated columns to create.
     * </p>
     */
    private java.util.List<CalculatedColumn> columns;

    /**
     * <p>
     * Calculated columns to create.
     * </p>
     *
     * @return <p>
     *         Calculated columns to create.
     *         </p>
     */
    public java.util.List<CalculatedColumn> getColumns() {
        return columns;
    }

    /**
     * <p>
     * Calculated columns to create.
     * </p>
     *
     * @param columns <p>
     *            Calculated columns to create.
     *            </p>
     */
    public void setColumns(java.util.Collection<CalculatedColumn> columns) {
        if (columns == null) {
            this.columns = null;
            return;
        }

        this.columns = new java.util.ArrayList<CalculatedColumn>(columns);
    }

    /**
     * <p>
     * Calculated columns to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columns <p>
     *            Calculated columns to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateColumnsOperation withColumns(CalculatedColumn... columns) {
        if (getColumns() == null) {
            this.columns = new java.util.ArrayList<CalculatedColumn>(columns.length);
        }
        for (CalculatedColumn value : columns) {
            this.columns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Calculated columns to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columns <p>
     *            Calculated columns to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateColumnsOperation withColumns(java.util.Collection<CalculatedColumn> columns) {
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
        if (getColumns() != null)
            sb.append("Columns: " + getColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumns() == null) ? 0 : getColumns().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateColumnsOperation == false)
            return false;
        CreateColumnsOperation other = (CreateColumnsOperation) obj;

        if (other.getColumns() == null ^ this.getColumns() == null)
            return false;
        if (other.getColumns() != null && other.getColumns().equals(this.getColumns()) == false)
            return false;
        return true;
    }
}
