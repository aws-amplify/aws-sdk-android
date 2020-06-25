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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * Defines a column containing error.
 * </p>
 */
public class ColumnStatisticsError implements Serializable {
    /**
     * <p>
     * The ColumnStatistics of the column.
     * </p>
     */
    private ColumnStatistics columnStatistics;

    /**
     * <p>
     * The error message occurred during operation.
     * </p>
     */
    private ErrorDetail error;

    /**
     * <p>
     * The ColumnStatistics of the column.
     * </p>
     *
     * @return <p>
     *         The ColumnStatistics of the column.
     *         </p>
     */
    public ColumnStatistics getColumnStatistics() {
        return columnStatistics;
    }

    /**
     * <p>
     * The ColumnStatistics of the column.
     * </p>
     *
     * @param columnStatistics <p>
     *            The ColumnStatistics of the column.
     *            </p>
     */
    public void setColumnStatistics(ColumnStatistics columnStatistics) {
        this.columnStatistics = columnStatistics;
    }

    /**
     * <p>
     * The ColumnStatistics of the column.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columnStatistics <p>
     *            The ColumnStatistics of the column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnStatisticsError withColumnStatistics(ColumnStatistics columnStatistics) {
        this.columnStatistics = columnStatistics;
        return this;
    }

    /**
     * <p>
     * The error message occurred during operation.
     * </p>
     *
     * @return <p>
     *         The error message occurred during operation.
     *         </p>
     */
    public ErrorDetail getError() {
        return error;
    }

    /**
     * <p>
     * The error message occurred during operation.
     * </p>
     *
     * @param error <p>
     *            The error message occurred during operation.
     *            </p>
     */
    public void setError(ErrorDetail error) {
        this.error = error;
    }

    /**
     * <p>
     * The error message occurred during operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param error <p>
     *            The error message occurred during operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnStatisticsError withError(ErrorDetail error) {
        this.error = error;
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
        if (getColumnStatistics() != null)
            sb.append("ColumnStatistics: " + getColumnStatistics() + ",");
        if (getError() != null)
            sb.append("Error: " + getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getColumnStatistics() == null) ? 0 : getColumnStatistics().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnStatisticsError == false)
            return false;
        ColumnStatisticsError other = (ColumnStatisticsError) obj;

        if (other.getColumnStatistics() == null ^ this.getColumnStatistics() == null)
            return false;
        if (other.getColumnStatistics() != null
                && other.getColumnStatistics().equals(this.getColumnStatistics()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }
}
