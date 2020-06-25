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
 * Defines a column statistics.
 * </p>
 */
public class ColumnStatistics implements Serializable {
    /**
     * <p>
     * The name of the column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String columnName;

    /**
     * <p>
     * The type of the column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 20000<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String columnType;

    /**
     * <p>
     * The analyzed time of the column statistics.
     * </p>
     */
    private java.util.Date analyzedTime;

    /**
     * <p>
     * The statistics of the column.
     * </p>
     */
    private ColumnStatisticsData statisticsData;

    /**
     * <p>
     * The name of the column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the column.
     *         </p>
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param columnName <p>
     *            The name of the column.
     *            </p>
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param columnName <p>
     *            The name of the column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnStatistics withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * <p>
     * The type of the column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 20000<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The type of the column.
     *         </p>
     */
    public String getColumnType() {
        return columnType;
    }

    /**
     * <p>
     * The type of the column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 20000<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param columnType <p>
     *            The type of the column.
     *            </p>
     */
    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    /**
     * <p>
     * The type of the column.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 20000<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param columnType <p>
     *            The type of the column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnStatistics withColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }

    /**
     * <p>
     * The analyzed time of the column statistics.
     * </p>
     *
     * @return <p>
     *         The analyzed time of the column statistics.
     *         </p>
     */
    public java.util.Date getAnalyzedTime() {
        return analyzedTime;
    }

    /**
     * <p>
     * The analyzed time of the column statistics.
     * </p>
     *
     * @param analyzedTime <p>
     *            The analyzed time of the column statistics.
     *            </p>
     */
    public void setAnalyzedTime(java.util.Date analyzedTime) {
        this.analyzedTime = analyzedTime;
    }

    /**
     * <p>
     * The analyzed time of the column statistics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyzedTime <p>
     *            The analyzed time of the column statistics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnStatistics withAnalyzedTime(java.util.Date analyzedTime) {
        this.analyzedTime = analyzedTime;
        return this;
    }

    /**
     * <p>
     * The statistics of the column.
     * </p>
     *
     * @return <p>
     *         The statistics of the column.
     *         </p>
     */
    public ColumnStatisticsData getStatisticsData() {
        return statisticsData;
    }

    /**
     * <p>
     * The statistics of the column.
     * </p>
     *
     * @param statisticsData <p>
     *            The statistics of the column.
     *            </p>
     */
    public void setStatisticsData(ColumnStatisticsData statisticsData) {
        this.statisticsData = statisticsData;
    }

    /**
     * <p>
     * The statistics of the column.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statisticsData <p>
     *            The statistics of the column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnStatistics withStatisticsData(ColumnStatisticsData statisticsData) {
        this.statisticsData = statisticsData;
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
        if (getColumnType() != null)
            sb.append("ColumnType: " + getColumnType() + ",");
        if (getAnalyzedTime() != null)
            sb.append("AnalyzedTime: " + getAnalyzedTime() + ",");
        if (getStatisticsData() != null)
            sb.append("StatisticsData: " + getStatisticsData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        hashCode = prime * hashCode + ((getColumnType() == null) ? 0 : getColumnType().hashCode());
        hashCode = prime * hashCode
                + ((getAnalyzedTime() == null) ? 0 : getAnalyzedTime().hashCode());
        hashCode = prime * hashCode
                + ((getStatisticsData() == null) ? 0 : getStatisticsData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnStatistics == false)
            return false;
        ColumnStatistics other = (ColumnStatistics) obj;

        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null
                && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        if (other.getColumnType() == null ^ this.getColumnType() == null)
            return false;
        if (other.getColumnType() != null
                && other.getColumnType().equals(this.getColumnType()) == false)
            return false;
        if (other.getAnalyzedTime() == null ^ this.getAnalyzedTime() == null)
            return false;
        if (other.getAnalyzedTime() != null
                && other.getAnalyzedTime().equals(this.getAnalyzedTime()) == false)
            return false;
        if (other.getStatisticsData() == null ^ this.getStatisticsData() == null)
            return false;
        if (other.getStatisticsData() != null
                && other.getStatisticsData().equals(this.getStatisticsData()) == false)
            return false;
        return true;
    }
}
