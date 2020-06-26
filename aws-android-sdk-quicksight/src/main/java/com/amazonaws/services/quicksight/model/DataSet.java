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
 * Dataset.
 * </p>
 */
public class DataSet implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The ID of the dataset.
     * </p>
     */
    private String dataSetId;

    /**
     * <p>
     * A display name for the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String name;

    /**
     * <p>
     * The time that this dataset was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The last time that this dataset was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * Declares the physical tables that are available in the underlying data
     * sources.
     * </p>
     */
    private java.util.Map<String, PhysicalTable> physicalTableMap;

    /**
     * <p>
     * Configures the combination and transformation of the data from the
     * physical tables.
     * </p>
     */
    private java.util.Map<String, LogicalTable> logicalTableMap;

    /**
     * <p>
     * The list of columns after all transforms. These columns are available in
     * templates, analyses, and dashboards.
     * </p>
     */
    private java.util.List<OutputColumn> outputColumns;

    /**
     * <p>
     * Indicates whether you want to import the data into SPICE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SPICE, DIRECT_QUERY
     */
    private String importMode;

    /**
     * <p>
     * The amount of SPICE capacity used by this dataset. This is 0 if the
     * dataset isn't imported into SPICE.
     * </p>
     */
    private Long consumedSpiceCapacityInBytes;

    /**
     * <p>
     * Groupings of columns that work together in certain Amazon QuickSight
     * features. Currently, only geospatial hierarchy is supported.
     * </p>
     */
    private java.util.List<ColumnGroup> columnGroups;

    /**
     * <p>
     * The row-level security configuration for the dataset.
     * </p>
     */
    private RowLevelPermissionDataSet rowLevelPermissionDataSet;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the resource.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSet withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The ID of the dataset.
     * </p>
     *
     * @return <p>
     *         The ID of the dataset.
     *         </p>
     */
    public String getDataSetId() {
        return dataSetId;
    }

    /**
     * <p>
     * The ID of the dataset.
     * </p>
     *
     * @param dataSetId <p>
     *            The ID of the dataset.
     *            </p>
     */
    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The ID of the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSetId <p>
     *            The ID of the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSet withDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }

    /**
     * <p>
     * A display name for the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         A display name for the dataset.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A display name for the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param name <p>
     *            A display name for the dataset.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A display name for the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param name <p>
     *            A display name for the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The time that this dataset was created.
     * </p>
     *
     * @return <p>
     *         The time that this dataset was created.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The time that this dataset was created.
     * </p>
     *
     * @param createdTime <p>
     *            The time that this dataset was created.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that this dataset was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The time that this dataset was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSet withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The last time that this dataset was updated.
     * </p>
     *
     * @return <p>
     *         The last time that this dataset was updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this dataset was updated.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            The last time that this dataset was updated.
     *            </p>
     */
    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this dataset was updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            The last time that this dataset was updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSet withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * <p>
     * Declares the physical tables that are available in the underlying data
     * sources.
     * </p>
     *
     * @return <p>
     *         Declares the physical tables that are available in the underlying
     *         data sources.
     *         </p>
     */
    public java.util.Map<String, PhysicalTable> getPhysicalTableMap() {
        return physicalTableMap;
    }

    /**
     * <p>
     * Declares the physical tables that are available in the underlying data
     * sources.
     * </p>
     *
     * @param physicalTableMap <p>
     *            Declares the physical tables that are available in the
     *            underlying data sources.
     *            </p>
     */
    public void setPhysicalTableMap(java.util.Map<String, PhysicalTable> physicalTableMap) {
        this.physicalTableMap = physicalTableMap;
    }

    /**
     * <p>
     * Declares the physical tables that are available in the underlying data
     * sources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param physicalTableMap <p>
     *            Declares the physical tables that are available in the
     *            underlying data sources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSet withPhysicalTableMap(java.util.Map<String, PhysicalTable> physicalTableMap) {
        this.physicalTableMap = physicalTableMap;
        return this;
    }

    /**
     * <p>
     * Declares the physical tables that are available in the underlying data
     * sources.
     * </p>
     * <p>
     * The method adds a new key-value pair into PhysicalTableMap parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into PhysicalTableMap.
     * @param value The corresponding value of the entry to be added into
     *            PhysicalTableMap.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSet addPhysicalTableMapEntry(String key, PhysicalTable value) {
        if (null == this.physicalTableMap) {
            this.physicalTableMap = new java.util.HashMap<String, PhysicalTable>();
        }
        if (this.physicalTableMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.physicalTableMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PhysicalTableMap.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DataSet clearPhysicalTableMapEntries() {
        this.physicalTableMap = null;
        return this;
    }

    /**
     * <p>
     * Configures the combination and transformation of the data from the
     * physical tables.
     * </p>
     *
     * @return <p>
     *         Configures the combination and transformation of the data from
     *         the physical tables.
     *         </p>
     */
    public java.util.Map<String, LogicalTable> getLogicalTableMap() {
        return logicalTableMap;
    }

    /**
     * <p>
     * Configures the combination and transformation of the data from the
     * physical tables.
     * </p>
     *
     * @param logicalTableMap <p>
     *            Configures the combination and transformation of the data from
     *            the physical tables.
     *            </p>
     */
    public void setLogicalTableMap(java.util.Map<String, LogicalTable> logicalTableMap) {
        this.logicalTableMap = logicalTableMap;
    }

    /**
     * <p>
     * Configures the combination and transformation of the data from the
     * physical tables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logicalTableMap <p>
     *            Configures the combination and transformation of the data from
     *            the physical tables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSet withLogicalTableMap(java.util.Map<String, LogicalTable> logicalTableMap) {
        this.logicalTableMap = logicalTableMap;
        return this;
    }

    /**
     * <p>
     * Configures the combination and transformation of the data from the
     * physical tables.
     * </p>
     * <p>
     * The method adds a new key-value pair into LogicalTableMap parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into LogicalTableMap.
     * @param value The corresponding value of the entry to be added into
     *            LogicalTableMap.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSet addLogicalTableMapEntry(String key, LogicalTable value) {
        if (null == this.logicalTableMap) {
            this.logicalTableMap = new java.util.HashMap<String, LogicalTable>();
        }
        if (this.logicalTableMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.logicalTableMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LogicalTableMap.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DataSet clearLogicalTableMapEntries() {
        this.logicalTableMap = null;
        return this;
    }

    /**
     * <p>
     * The list of columns after all transforms. These columns are available in
     * templates, analyses, and dashboards.
     * </p>
     *
     * @return <p>
     *         The list of columns after all transforms. These columns are
     *         available in templates, analyses, and dashboards.
     *         </p>
     */
    public java.util.List<OutputColumn> getOutputColumns() {
        return outputColumns;
    }

    /**
     * <p>
     * The list of columns after all transforms. These columns are available in
     * templates, analyses, and dashboards.
     * </p>
     *
     * @param outputColumns <p>
     *            The list of columns after all transforms. These columns are
     *            available in templates, analyses, and dashboards.
     *            </p>
     */
    public void setOutputColumns(java.util.Collection<OutputColumn> outputColumns) {
        if (outputColumns == null) {
            this.outputColumns = null;
            return;
        }

        this.outputColumns = new java.util.ArrayList<OutputColumn>(outputColumns);
    }

    /**
     * <p>
     * The list of columns after all transforms. These columns are available in
     * templates, analyses, and dashboards.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputColumns <p>
     *            The list of columns after all transforms. These columns are
     *            available in templates, analyses, and dashboards.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSet withOutputColumns(OutputColumn... outputColumns) {
        if (getOutputColumns() == null) {
            this.outputColumns = new java.util.ArrayList<OutputColumn>(outputColumns.length);
        }
        for (OutputColumn value : outputColumns) {
            this.outputColumns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of columns after all transforms. These columns are available in
     * templates, analyses, and dashboards.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputColumns <p>
     *            The list of columns after all transforms. These columns are
     *            available in templates, analyses, and dashboards.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSet withOutputColumns(java.util.Collection<OutputColumn> outputColumns) {
        setOutputColumns(outputColumns);
        return this;
    }

    /**
     * <p>
     * Indicates whether you want to import the data into SPICE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SPICE, DIRECT_QUERY
     *
     * @return <p>
     *         Indicates whether you want to import the data into SPICE.
     *         </p>
     * @see DataSetImportMode
     */
    public String getImportMode() {
        return importMode;
    }

    /**
     * <p>
     * Indicates whether you want to import the data into SPICE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SPICE, DIRECT_QUERY
     *
     * @param importMode <p>
     *            Indicates whether you want to import the data into SPICE.
     *            </p>
     * @see DataSetImportMode
     */
    public void setImportMode(String importMode) {
        this.importMode = importMode;
    }

    /**
     * <p>
     * Indicates whether you want to import the data into SPICE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SPICE, DIRECT_QUERY
     *
     * @param importMode <p>
     *            Indicates whether you want to import the data into SPICE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSetImportMode
     */
    public DataSet withImportMode(String importMode) {
        this.importMode = importMode;
        return this;
    }

    /**
     * <p>
     * Indicates whether you want to import the data into SPICE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SPICE, DIRECT_QUERY
     *
     * @param importMode <p>
     *            Indicates whether you want to import the data into SPICE.
     *            </p>
     * @see DataSetImportMode
     */
    public void setImportMode(DataSetImportMode importMode) {
        this.importMode = importMode.toString();
    }

    /**
     * <p>
     * Indicates whether you want to import the data into SPICE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SPICE, DIRECT_QUERY
     *
     * @param importMode <p>
     *            Indicates whether you want to import the data into SPICE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSetImportMode
     */
    public DataSet withImportMode(DataSetImportMode importMode) {
        this.importMode = importMode.toString();
        return this;
    }

    /**
     * <p>
     * The amount of SPICE capacity used by this dataset. This is 0 if the
     * dataset isn't imported into SPICE.
     * </p>
     *
     * @return <p>
     *         The amount of SPICE capacity used by this dataset. This is 0 if
     *         the dataset isn't imported into SPICE.
     *         </p>
     */
    public Long getConsumedSpiceCapacityInBytes() {
        return consumedSpiceCapacityInBytes;
    }

    /**
     * <p>
     * The amount of SPICE capacity used by this dataset. This is 0 if the
     * dataset isn't imported into SPICE.
     * </p>
     *
     * @param consumedSpiceCapacityInBytes <p>
     *            The amount of SPICE capacity used by this dataset. This is 0
     *            if the dataset isn't imported into SPICE.
     *            </p>
     */
    public void setConsumedSpiceCapacityInBytes(Long consumedSpiceCapacityInBytes) {
        this.consumedSpiceCapacityInBytes = consumedSpiceCapacityInBytes;
    }

    /**
     * <p>
     * The amount of SPICE capacity used by this dataset. This is 0 if the
     * dataset isn't imported into SPICE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param consumedSpiceCapacityInBytes <p>
     *            The amount of SPICE capacity used by this dataset. This is 0
     *            if the dataset isn't imported into SPICE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSet withConsumedSpiceCapacityInBytes(Long consumedSpiceCapacityInBytes) {
        this.consumedSpiceCapacityInBytes = consumedSpiceCapacityInBytes;
        return this;
    }

    /**
     * <p>
     * Groupings of columns that work together in certain Amazon QuickSight
     * features. Currently, only geospatial hierarchy is supported.
     * </p>
     *
     * @return <p>
     *         Groupings of columns that work together in certain Amazon
     *         QuickSight features. Currently, only geospatial hierarchy is
     *         supported.
     *         </p>
     */
    public java.util.List<ColumnGroup> getColumnGroups() {
        return columnGroups;
    }

    /**
     * <p>
     * Groupings of columns that work together in certain Amazon QuickSight
     * features. Currently, only geospatial hierarchy is supported.
     * </p>
     *
     * @param columnGroups <p>
     *            Groupings of columns that work together in certain Amazon
     *            QuickSight features. Currently, only geospatial hierarchy is
     *            supported.
     *            </p>
     */
    public void setColumnGroups(java.util.Collection<ColumnGroup> columnGroups) {
        if (columnGroups == null) {
            this.columnGroups = null;
            return;
        }

        this.columnGroups = new java.util.ArrayList<ColumnGroup>(columnGroups);
    }

    /**
     * <p>
     * Groupings of columns that work together in certain Amazon QuickSight
     * features. Currently, only geospatial hierarchy is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columnGroups <p>
     *            Groupings of columns that work together in certain Amazon
     *            QuickSight features. Currently, only geospatial hierarchy is
     *            supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSet withColumnGroups(ColumnGroup... columnGroups) {
        if (getColumnGroups() == null) {
            this.columnGroups = new java.util.ArrayList<ColumnGroup>(columnGroups.length);
        }
        for (ColumnGroup value : columnGroups) {
            this.columnGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Groupings of columns that work together in certain Amazon QuickSight
     * features. Currently, only geospatial hierarchy is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columnGroups <p>
     *            Groupings of columns that work together in certain Amazon
     *            QuickSight features. Currently, only geospatial hierarchy is
     *            supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSet withColumnGroups(java.util.Collection<ColumnGroup> columnGroups) {
        setColumnGroups(columnGroups);
        return this;
    }

    /**
     * <p>
     * The row-level security configuration for the dataset.
     * </p>
     *
     * @return <p>
     *         The row-level security configuration for the dataset.
     *         </p>
     */
    public RowLevelPermissionDataSet getRowLevelPermissionDataSet() {
        return rowLevelPermissionDataSet;
    }

    /**
     * <p>
     * The row-level security configuration for the dataset.
     * </p>
     *
     * @param rowLevelPermissionDataSet <p>
     *            The row-level security configuration for the dataset.
     *            </p>
     */
    public void setRowLevelPermissionDataSet(RowLevelPermissionDataSet rowLevelPermissionDataSet) {
        this.rowLevelPermissionDataSet = rowLevelPermissionDataSet;
    }

    /**
     * <p>
     * The row-level security configuration for the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rowLevelPermissionDataSet <p>
     *            The row-level security configuration for the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSet withRowLevelPermissionDataSet(RowLevelPermissionDataSet rowLevelPermissionDataSet) {
        this.rowLevelPermissionDataSet = rowLevelPermissionDataSet;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getDataSetId() != null)
            sb.append("DataSetId: " + getDataSetId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getPhysicalTableMap() != null)
            sb.append("PhysicalTableMap: " + getPhysicalTableMap() + ",");
        if (getLogicalTableMap() != null)
            sb.append("LogicalTableMap: " + getLogicalTableMap() + ",");
        if (getOutputColumns() != null)
            sb.append("OutputColumns: " + getOutputColumns() + ",");
        if (getImportMode() != null)
            sb.append("ImportMode: " + getImportMode() + ",");
        if (getConsumedSpiceCapacityInBytes() != null)
            sb.append("ConsumedSpiceCapacityInBytes: " + getConsumedSpiceCapacityInBytes() + ",");
        if (getColumnGroups() != null)
            sb.append("ColumnGroups: " + getColumnGroups() + ",");
        if (getRowLevelPermissionDataSet() != null)
            sb.append("RowLevelPermissionDataSet: " + getRowLevelPermissionDataSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getPhysicalTableMap() == null) ? 0 : getPhysicalTableMap().hashCode());
        hashCode = prime * hashCode
                + ((getLogicalTableMap() == null) ? 0 : getLogicalTableMap().hashCode());
        hashCode = prime * hashCode
                + ((getOutputColumns() == null) ? 0 : getOutputColumns().hashCode());
        hashCode = prime * hashCode + ((getImportMode() == null) ? 0 : getImportMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getConsumedSpiceCapacityInBytes() == null) ? 0
                        : getConsumedSpiceCapacityInBytes().hashCode());
        hashCode = prime * hashCode
                + ((getColumnGroups() == null) ? 0 : getColumnGroups().hashCode());
        hashCode = prime
                * hashCode
                + ((getRowLevelPermissionDataSet() == null) ? 0 : getRowLevelPermissionDataSet()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSet == false)
            return false;
        DataSet other = (DataSet) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null
                && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getPhysicalTableMap() == null ^ this.getPhysicalTableMap() == null)
            return false;
        if (other.getPhysicalTableMap() != null
                && other.getPhysicalTableMap().equals(this.getPhysicalTableMap()) == false)
            return false;
        if (other.getLogicalTableMap() == null ^ this.getLogicalTableMap() == null)
            return false;
        if (other.getLogicalTableMap() != null
                && other.getLogicalTableMap().equals(this.getLogicalTableMap()) == false)
            return false;
        if (other.getOutputColumns() == null ^ this.getOutputColumns() == null)
            return false;
        if (other.getOutputColumns() != null
                && other.getOutputColumns().equals(this.getOutputColumns()) == false)
            return false;
        if (other.getImportMode() == null ^ this.getImportMode() == null)
            return false;
        if (other.getImportMode() != null
                && other.getImportMode().equals(this.getImportMode()) == false)
            return false;
        if (other.getConsumedSpiceCapacityInBytes() == null
                ^ this.getConsumedSpiceCapacityInBytes() == null)
            return false;
        if (other.getConsumedSpiceCapacityInBytes() != null
                && other.getConsumedSpiceCapacityInBytes().equals(
                        this.getConsumedSpiceCapacityInBytes()) == false)
            return false;
        if (other.getColumnGroups() == null ^ this.getColumnGroups() == null)
            return false;
        if (other.getColumnGroups() != null
                && other.getColumnGroups().equals(this.getColumnGroups()) == false)
            return false;
        if (other.getRowLevelPermissionDataSet() == null
                ^ this.getRowLevelPermissionDataSet() == null)
            return false;
        if (other.getRowLevelPermissionDataSet() != null
                && other.getRowLevelPermissionDataSet().equals(this.getRowLevelPermissionDataSet()) == false)
            return false;
        return true;
    }
}
