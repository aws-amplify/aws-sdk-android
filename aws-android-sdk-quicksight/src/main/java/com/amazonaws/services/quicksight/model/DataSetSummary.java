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
 * Dataset summary.
 * </p>
 */
public class DataSetSummary implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
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
     * Indicates whether you want to import the data into SPICE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SPICE, DIRECT_QUERY
     */
    private String importMode;

    /**
     * <p>
     * The row-level security configuration for the dataset.
     * </p>
     */
    private RowLevelPermissionDataSet rowLevelPermissionDataSet;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the dataset.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the dataset.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSetSummary withArn(String arn) {
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
    public DataSetSummary withDataSetId(String dataSetId) {
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
    public DataSetSummary withName(String name) {
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
    public DataSetSummary withCreatedTime(java.util.Date createdTime) {
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
    public DataSetSummary withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
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
    public DataSetSummary withImportMode(String importMode) {
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
    public DataSetSummary withImportMode(DataSetImportMode importMode) {
        this.importMode = importMode.toString();
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
    public DataSetSummary withRowLevelPermissionDataSet(
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
        if (getImportMode() != null)
            sb.append("ImportMode: " + getImportMode() + ",");
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
        hashCode = prime * hashCode + ((getImportMode() == null) ? 0 : getImportMode().hashCode());
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

        if (obj instanceof DataSetSummary == false)
            return false;
        DataSetSummary other = (DataSetSummary) obj;

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
        if (other.getImportMode() == null ^ this.getImportMode() == null)
            return false;
        if (other.getImportMode() != null
                && other.getImportMode().equals(this.getImportMode()) == false)
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
