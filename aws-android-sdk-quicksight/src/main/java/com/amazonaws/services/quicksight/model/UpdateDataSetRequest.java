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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a dataset.
 * </p>
 */
public class UpdateDataSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String awsAccountId;

    /**
     * <p>
     * The ID for the dataset that you want to update. This ID is unique per AWS
     * Region for each AWS account.
     * </p>
     */
    private String dataSetId;

    /**
     * <p>
     * The display name for the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String name;

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
     * Indicates whether you want to import the data into SPICE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SPICE, DIRECT_QUERY
     */
    private String importMode;

    /**
     * <p>
     * Groupings of columns that work together in certain QuickSight features.
     * Currently, only geospatial hierarchy is supported.
     * </p>
     */
    private java.util.List<ColumnGroup> columnGroups;

    /**
     * <p>
     * The row-level security configuration for the data you want to create.
     * </p>
     */
    private RowLevelPermissionDataSet rowLevelPermissionDataSet;

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The AWS account ID.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The AWS account ID.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The AWS account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSetRequest withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * The ID for the dataset that you want to update. This ID is unique per AWS
     * Region for each AWS account.
     * </p>
     *
     * @return <p>
     *         The ID for the dataset that you want to update. This ID is unique
     *         per AWS Region for each AWS account.
     *         </p>
     */
    public String getDataSetId() {
        return dataSetId;
    }

    /**
     * <p>
     * The ID for the dataset that you want to update. This ID is unique per AWS
     * Region for each AWS account.
     * </p>
     *
     * @param dataSetId <p>
     *            The ID for the dataset that you want to update. This ID is
     *            unique per AWS Region for each AWS account.
     *            </p>
     */
    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The ID for the dataset that you want to update. This ID is unique per AWS
     * Region for each AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSetId <p>
     *            The ID for the dataset that you want to update. This ID is
     *            unique per AWS Region for each AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSetRequest withDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }

    /**
     * <p>
     * The display name for the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The display name for the dataset.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The display name for the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param name <p>
     *            The display name for the dataset.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The display name for the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param name <p>
     *            The display name for the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSetRequest withName(String name) {
        this.name = name;
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
    public UpdateDataSetRequest withPhysicalTableMap(
            java.util.Map<String, PhysicalTable> physicalTableMap) {
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
    public UpdateDataSetRequest addPhysicalTableMapEntry(String key, PhysicalTable value) {
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
    public UpdateDataSetRequest clearPhysicalTableMapEntries() {
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
    public UpdateDataSetRequest withLogicalTableMap(
            java.util.Map<String, LogicalTable> logicalTableMap) {
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
    public UpdateDataSetRequest addLogicalTableMapEntry(String key, LogicalTable value) {
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
    public UpdateDataSetRequest clearLogicalTableMapEntries() {
        this.logicalTableMap = null;
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
    public UpdateDataSetRequest withImportMode(String importMode) {
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
    public UpdateDataSetRequest withImportMode(DataSetImportMode importMode) {
        this.importMode = importMode.toString();
        return this;
    }

    /**
     * <p>
     * Groupings of columns that work together in certain QuickSight features.
     * Currently, only geospatial hierarchy is supported.
     * </p>
     *
     * @return <p>
     *         Groupings of columns that work together in certain QuickSight
     *         features. Currently, only geospatial hierarchy is supported.
     *         </p>
     */
    public java.util.List<ColumnGroup> getColumnGroups() {
        return columnGroups;
    }

    /**
     * <p>
     * Groupings of columns that work together in certain QuickSight features.
     * Currently, only geospatial hierarchy is supported.
     * </p>
     *
     * @param columnGroups <p>
     *            Groupings of columns that work together in certain QuickSight
     *            features. Currently, only geospatial hierarchy is supported.
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
     * Groupings of columns that work together in certain QuickSight features.
     * Currently, only geospatial hierarchy is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columnGroups <p>
     *            Groupings of columns that work together in certain QuickSight
     *            features. Currently, only geospatial hierarchy is supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSetRequest withColumnGroups(ColumnGroup... columnGroups) {
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
     * Groupings of columns that work together in certain QuickSight features.
     * Currently, only geospatial hierarchy is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columnGroups <p>
     *            Groupings of columns that work together in certain QuickSight
     *            features. Currently, only geospatial hierarchy is supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSetRequest withColumnGroups(java.util.Collection<ColumnGroup> columnGroups) {
        setColumnGroups(columnGroups);
        return this;
    }

    /**
     * <p>
     * The row-level security configuration for the data you want to create.
     * </p>
     *
     * @return <p>
     *         The row-level security configuration for the data you want to
     *         create.
     *         </p>
     */
    public RowLevelPermissionDataSet getRowLevelPermissionDataSet() {
        return rowLevelPermissionDataSet;
    }

    /**
     * <p>
     * The row-level security configuration for the data you want to create.
     * </p>
     *
     * @param rowLevelPermissionDataSet <p>
     *            The row-level security configuration for the data you want to
     *            create.
     *            </p>
     */
    public void setRowLevelPermissionDataSet(RowLevelPermissionDataSet rowLevelPermissionDataSet) {
        this.rowLevelPermissionDataSet = rowLevelPermissionDataSet;
    }

    /**
     * <p>
     * The row-level security configuration for the data you want to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rowLevelPermissionDataSet <p>
     *            The row-level security configuration for the data you want to
     *            create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSetRequest withRowLevelPermissionDataSet(
            RowLevelPermissionDataSet rowLevelPermissionDataSet) {
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: " + getAwsAccountId() + ",");
        if (getDataSetId() != null)
            sb.append("DataSetId: " + getDataSetId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getPhysicalTableMap() != null)
            sb.append("PhysicalTableMap: " + getPhysicalTableMap() + ",");
        if (getLogicalTableMap() != null)
            sb.append("LogicalTableMap: " + getLogicalTableMap() + ",");
        if (getImportMode() != null)
            sb.append("ImportMode: " + getImportMode() + ",");
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

        hashCode = prime * hashCode
                + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getPhysicalTableMap() == null) ? 0 : getPhysicalTableMap().hashCode());
        hashCode = prime * hashCode
                + ((getLogicalTableMap() == null) ? 0 : getLogicalTableMap().hashCode());
        hashCode = prime * hashCode + ((getImportMode() == null) ? 0 : getImportMode().hashCode());
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

        if (obj instanceof UpdateDataSetRequest == false)
            return false;
        UpdateDataSetRequest other = (UpdateDataSetRequest) obj;

        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null
                && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
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
        if (other.getImportMode() == null ^ this.getImportMode() == null)
            return false;
        if (other.getImportMode() != null
                && other.getImportMode().equals(this.getImportMode()) == false)
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
