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

public class GetColumnStatisticsForPartitionResult implements Serializable {
    /**
     * <p>
     * List of ColumnStatistics that failed to be retrieved.
     * </p>
     */
    private java.util.List<ColumnStatistics> columnStatisticsList;

    /**
     * <p>
     * Error occurred during retrieving column statistics data.
     * </p>
     */
    private java.util.List<ColumnError> errors;

    /**
     * <p>
     * List of ColumnStatistics that failed to be retrieved.
     * </p>
     *
     * @return <p>
     *         List of ColumnStatistics that failed to be retrieved.
     *         </p>
     */
    public java.util.List<ColumnStatistics> getColumnStatisticsList() {
        return columnStatisticsList;
    }

    /**
     * <p>
     * List of ColumnStatistics that failed to be retrieved.
     * </p>
     *
     * @param columnStatisticsList <p>
     *            List of ColumnStatistics that failed to be retrieved.
     *            </p>
     */
    public void setColumnStatisticsList(java.util.Collection<ColumnStatistics> columnStatisticsList) {
        if (columnStatisticsList == null) {
            this.columnStatisticsList = null;
            return;
        }

        this.columnStatisticsList = new java.util.ArrayList<ColumnStatistics>(columnStatisticsList);
    }

    /**
     * <p>
     * List of ColumnStatistics that failed to be retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columnStatisticsList <p>
     *            List of ColumnStatistics that failed to be retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetColumnStatisticsForPartitionResult withColumnStatisticsList(
            ColumnStatistics... columnStatisticsList) {
        if (getColumnStatisticsList() == null) {
            this.columnStatisticsList = new java.util.ArrayList<ColumnStatistics>(
                    columnStatisticsList.length);
        }
        for (ColumnStatistics value : columnStatisticsList) {
            this.columnStatisticsList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of ColumnStatistics that failed to be retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columnStatisticsList <p>
     *            List of ColumnStatistics that failed to be retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetColumnStatisticsForPartitionResult withColumnStatisticsList(
            java.util.Collection<ColumnStatistics> columnStatisticsList) {
        setColumnStatisticsList(columnStatisticsList);
        return this;
    }

    /**
     * <p>
     * Error occurred during retrieving column statistics data.
     * </p>
     *
     * @return <p>
     *         Error occurred during retrieving column statistics data.
     *         </p>
     */
    public java.util.List<ColumnError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Error occurred during retrieving column statistics data.
     * </p>
     *
     * @param errors <p>
     *            Error occurred during retrieving column statistics data.
     *            </p>
     */
    public void setErrors(java.util.Collection<ColumnError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<ColumnError>(errors);
    }

    /**
     * <p>
     * Error occurred during retrieving column statistics data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Error occurred during retrieving column statistics data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetColumnStatisticsForPartitionResult withErrors(ColumnError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<ColumnError>(errors.length);
        }
        for (ColumnError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Error occurred during retrieving column statistics data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Error occurred during retrieving column statistics data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetColumnStatisticsForPartitionResult withErrors(java.util.Collection<ColumnError> errors) {
        setErrors(errors);
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
        if (getColumnStatisticsList() != null)
            sb.append("ColumnStatisticsList: " + getColumnStatisticsList() + ",");
        if (getErrors() != null)
            sb.append("Errors: " + getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getColumnStatisticsList() == null) ? 0 : getColumnStatisticsList().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetColumnStatisticsForPartitionResult == false)
            return false;
        GetColumnStatisticsForPartitionResult other = (GetColumnStatisticsForPartitionResult) obj;

        if (other.getColumnStatisticsList() == null ^ this.getColumnStatisticsList() == null)
            return false;
        if (other.getColumnStatisticsList() != null
                && other.getColumnStatisticsList().equals(this.getColumnStatisticsList()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }
}
