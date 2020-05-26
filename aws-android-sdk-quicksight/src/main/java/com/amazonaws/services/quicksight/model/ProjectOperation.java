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
 * A transform operation that projects columns. Operations that come after a
 * projection can only refer to projected columns.
 * </p>
 */
public class ProjectOperation implements Serializable {
    /**
     * <p>
     * Projected columns.
     * </p>
     */
    private java.util.List<String> projectedColumns;

    /**
     * <p>
     * Projected columns.
     * </p>
     *
     * @return <p>
     *         Projected columns.
     *         </p>
     */
    public java.util.List<String> getProjectedColumns() {
        return projectedColumns;
    }

    /**
     * <p>
     * Projected columns.
     * </p>
     *
     * @param projectedColumns <p>
     *            Projected columns.
     *            </p>
     */
    public void setProjectedColumns(java.util.Collection<String> projectedColumns) {
        if (projectedColumns == null) {
            this.projectedColumns = null;
            return;
        }

        this.projectedColumns = new java.util.ArrayList<String>(projectedColumns);
    }

    /**
     * <p>
     * Projected columns.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param projectedColumns <p>
     *            Projected columns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectOperation withProjectedColumns(String... projectedColumns) {
        if (getProjectedColumns() == null) {
            this.projectedColumns = new java.util.ArrayList<String>(projectedColumns.length);
        }
        for (String value : projectedColumns) {
            this.projectedColumns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Projected columns.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param projectedColumns <p>
     *            Projected columns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectOperation withProjectedColumns(java.util.Collection<String> projectedColumns) {
        setProjectedColumns(projectedColumns);
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
        if (getProjectedColumns() != null)
            sb.append("ProjectedColumns: " + getProjectedColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProjectedColumns() == null) ? 0 : getProjectedColumns().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectOperation == false)
            return false;
        ProjectOperation other = (ProjectOperation) obj;

        if (other.getProjectedColumns() == null ^ this.getProjectedColumns() == null)
            return false;
        if (other.getProjectedColumns() != null
                && other.getProjectedColumns().equals(this.getProjectedColumns()) == false)
            return false;
        return true;
    }
}
