/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Filter the datasets based on creation time or dataset status.
 * </p>
 */
public class DatasetFilter implements Serializable {
    /**
     * <p>
     * Filter the datasets based on the dataset status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, COMPLETED, FAILED
     */
    private String status;

    /**
     * <p>
     * Filter the datasets based on the dataset type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     */
    private String datasetType;

    /**
     * <p>
     * Filter the datasets to include datasets created after the specified time.
     * </p>
     */
    private java.util.Date creationTimeAfter;

    /**
     * <p>
     * Filter the datasets to include datasets created before the specified
     * time.
     * </p>
     */
    private java.util.Date creationTimeBefore;

    /**
     * <p>
     * Filter the datasets based on the dataset status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, COMPLETED, FAILED
     *
     * @return <p>
     *         Filter the datasets based on the dataset status.
     *         </p>
     * @see DatasetStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Filter the datasets based on the dataset status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, COMPLETED, FAILED
     *
     * @param status <p>
     *            Filter the datasets based on the dataset status.
     *            </p>
     * @see DatasetStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Filter the datasets based on the dataset status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, COMPLETED, FAILED
     *
     * @param status <p>
     *            Filter the datasets based on the dataset status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatasetStatus
     */
    public DatasetFilter withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Filter the datasets based on the dataset status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, COMPLETED, FAILED
     *
     * @param status <p>
     *            Filter the datasets based on the dataset status.
     *            </p>
     * @see DatasetStatus
     */
    public void setStatus(DatasetStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Filter the datasets based on the dataset status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, COMPLETED, FAILED
     *
     * @param status <p>
     *            Filter the datasets based on the dataset status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatasetStatus
     */
    public DatasetFilter withStatus(DatasetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Filter the datasets based on the dataset type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @return <p>
     *         Filter the datasets based on the dataset type.
     *         </p>
     * @see DatasetType
     */
    public String getDatasetType() {
        return datasetType;
    }

    /**
     * <p>
     * Filter the datasets based on the dataset type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param datasetType <p>
     *            Filter the datasets based on the dataset type.
     *            </p>
     * @see DatasetType
     */
    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * <p>
     * Filter the datasets based on the dataset type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param datasetType <p>
     *            Filter the datasets based on the dataset type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatasetType
     */
    public DatasetFilter withDatasetType(String datasetType) {
        this.datasetType = datasetType;
        return this;
    }

    /**
     * <p>
     * Filter the datasets based on the dataset type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param datasetType <p>
     *            Filter the datasets based on the dataset type.
     *            </p>
     * @see DatasetType
     */
    public void setDatasetType(DatasetType datasetType) {
        this.datasetType = datasetType.toString();
    }

    /**
     * <p>
     * Filter the datasets based on the dataset type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param datasetType <p>
     *            Filter the datasets based on the dataset type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatasetType
     */
    public DatasetFilter withDatasetType(DatasetType datasetType) {
        this.datasetType = datasetType.toString();
        return this;
    }

    /**
     * <p>
     * Filter the datasets to include datasets created after the specified time.
     * </p>
     *
     * @return <p>
     *         Filter the datasets to include datasets created after the
     *         specified time.
     *         </p>
     */
    public java.util.Date getCreationTimeAfter() {
        return creationTimeAfter;
    }

    /**
     * <p>
     * Filter the datasets to include datasets created after the specified time.
     * </p>
     *
     * @param creationTimeAfter <p>
     *            Filter the datasets to include datasets created after the
     *            specified time.
     *            </p>
     */
    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * Filter the datasets to include datasets created after the specified time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimeAfter <p>
     *            Filter the datasets to include datasets created after the
     *            specified time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetFilter withCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
        return this;
    }

    /**
     * <p>
     * Filter the datasets to include datasets created before the specified
     * time.
     * </p>
     *
     * @return <p>
     *         Filter the datasets to include datasets created before the
     *         specified time.
     *         </p>
     */
    public java.util.Date getCreationTimeBefore() {
        return creationTimeBefore;
    }

    /**
     * <p>
     * Filter the datasets to include datasets created before the specified
     * time.
     * </p>
     *
     * @param creationTimeBefore <p>
     *            Filter the datasets to include datasets created before the
     *            specified time.
     *            </p>
     */
    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * Filter the datasets to include datasets created before the specified
     * time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimeBefore <p>
     *            Filter the datasets to include datasets created before the
     *            specified time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetFilter withCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getDatasetType() != null)
            sb.append("DatasetType: " + getDatasetType() + ",");
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: " + getCreationTimeAfter() + ",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: " + getCreationTimeBefore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDatasetType() == null) ? 0 : getDatasetType().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetFilter == false)
            return false;
        DatasetFilter other = (DatasetFilter) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDatasetType() == null ^ this.getDatasetType() == null)
            return false;
        if (other.getDatasetType() != null
                && other.getDatasetType().equals(this.getDatasetType()) == false)
            return false;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null
                && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null
                && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        return true;
    }
}
