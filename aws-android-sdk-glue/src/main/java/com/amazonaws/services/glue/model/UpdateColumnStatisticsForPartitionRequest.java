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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates or updates partition statistics of columns.
 * </p>
 */
public class UpdateColumnStatisticsForPartitionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the Data Catalog where the partitions in question reside. If
     * none is supplied, the AWS account ID is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String catalogId;

    /**
     * <p>
     * The name of the catalog database where the partitions reside.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String databaseName;

    /**
     * <p>
     * The name of the partitions' table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String tableName;

    /**
     * <p>
     * A list of partition values identifying the partition.
     * </p>
     */
    private java.util.List<String> partitionValues;

    /**
     * <p>
     * A list of the column statistics.
     * </p>
     */
    private java.util.List<ColumnStatistics> columnStatisticsList;

    /**
     * <p>
     * The ID of the Data Catalog where the partitions in question reside. If
     * none is supplied, the AWS account ID is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The ID of the Data Catalog where the partitions in question
     *         reside. If none is supplied, the AWS account ID is used by
     *         default.
     *         </p>
     */
    public String getCatalogId() {
        return catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the partitions in question reside. If
     * none is supplied, the AWS account ID is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param catalogId <p>
     *            The ID of the Data Catalog where the partitions in question
     *            reside. If none is supplied, the AWS account ID is used by
     *            default.
     *            </p>
     */
    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the partitions in question reside. If
     * none is supplied, the AWS account ID is used by default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param catalogId <p>
     *            The ID of the Data Catalog where the partitions in question
     *            reside. If none is supplied, the AWS account ID is used by
     *            default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateColumnStatisticsForPartitionRequest withCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * <p>
     * The name of the catalog database where the partitions reside.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the catalog database where the partitions reside.
     *         </p>
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * <p>
     * The name of the catalog database where the partitions reside.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param databaseName <p>
     *            The name of the catalog database where the partitions reside.
     *            </p>
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the catalog database where the partitions reside.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param databaseName <p>
     *            The name of the catalog database where the partitions reside.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateColumnStatisticsForPartitionRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * <p>
     * The name of the partitions' table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the partitions' table.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the partitions' table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param tableName <p>
     *            The name of the partitions' table.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the partitions' table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param tableName <p>
     *            The name of the partitions' table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateColumnStatisticsForPartitionRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * A list of partition values identifying the partition.
     * </p>
     *
     * @return <p>
     *         A list of partition values identifying the partition.
     *         </p>
     */
    public java.util.List<String> getPartitionValues() {
        return partitionValues;
    }

    /**
     * <p>
     * A list of partition values identifying the partition.
     * </p>
     *
     * @param partitionValues <p>
     *            A list of partition values identifying the partition.
     *            </p>
     */
    public void setPartitionValues(java.util.Collection<String> partitionValues) {
        if (partitionValues == null) {
            this.partitionValues = null;
            return;
        }

        this.partitionValues = new java.util.ArrayList<String>(partitionValues);
    }

    /**
     * <p>
     * A list of partition values identifying the partition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partitionValues <p>
     *            A list of partition values identifying the partition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateColumnStatisticsForPartitionRequest withPartitionValues(String... partitionValues) {
        if (getPartitionValues() == null) {
            this.partitionValues = new java.util.ArrayList<String>(partitionValues.length);
        }
        for (String value : partitionValues) {
            this.partitionValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of partition values identifying the partition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partitionValues <p>
     *            A list of partition values identifying the partition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateColumnStatisticsForPartitionRequest withPartitionValues(
            java.util.Collection<String> partitionValues) {
        setPartitionValues(partitionValues);
        return this;
    }

    /**
     * <p>
     * A list of the column statistics.
     * </p>
     *
     * @return <p>
     *         A list of the column statistics.
     *         </p>
     */
    public java.util.List<ColumnStatistics> getColumnStatisticsList() {
        return columnStatisticsList;
    }

    /**
     * <p>
     * A list of the column statistics.
     * </p>
     *
     * @param columnStatisticsList <p>
     *            A list of the column statistics.
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
     * A list of the column statistics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columnStatisticsList <p>
     *            A list of the column statistics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateColumnStatisticsForPartitionRequest withColumnStatisticsList(
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
     * A list of the column statistics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columnStatisticsList <p>
     *            A list of the column statistics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateColumnStatisticsForPartitionRequest withColumnStatisticsList(
            java.util.Collection<ColumnStatistics> columnStatisticsList) {
        setColumnStatisticsList(columnStatisticsList);
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
        if (getCatalogId() != null)
            sb.append("CatalogId: " + getCatalogId() + ",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: " + getDatabaseName() + ",");
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getPartitionValues() != null)
            sb.append("PartitionValues: " + getPartitionValues() + ",");
        if (getColumnStatisticsList() != null)
            sb.append("ColumnStatisticsList: " + getColumnStatisticsList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode
                + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode
                + ((getPartitionValues() == null) ? 0 : getPartitionValues().hashCode());
        hashCode = prime * hashCode
                + ((getColumnStatisticsList() == null) ? 0 : getColumnStatisticsList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateColumnStatisticsForPartitionRequest == false)
            return false;
        UpdateColumnStatisticsForPartitionRequest other = (UpdateColumnStatisticsForPartitionRequest) obj;

        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null
                && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null
                && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getPartitionValues() == null ^ this.getPartitionValues() == null)
            return false;
        if (other.getPartitionValues() != null
                && other.getPartitionValues().equals(this.getPartitionValues()) == false)
            return false;
        if (other.getColumnStatisticsList() == null ^ this.getColumnStatisticsList() == null)
            return false;
        if (other.getColumnStatisticsList() != null
                && other.getColumnStatisticsList().equals(this.getColumnStatisticsList()) == false)
            return false;
        return true;
    }
}
