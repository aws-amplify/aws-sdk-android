/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * A description for a dataset. For more information, see
 * <a>DescribeDataset</a>.
 * </p>
 * <p>
 * The status fields <code>Status</code>, <code>StatusMessage</code>, and
 * <code>StatusMessageCode</code> reflect the last operation on the dataset.
 * </p>
 */
public class DatasetDescription implements Serializable {
    /**
     * <p>
     * The Unix timestamp for the time and date that the dataset was created.
     * </p>
     */
    private java.util.Date creationTimestamp;

    /**
     * <p>
     * The Unix timestamp for the date and time that the dataset was last
     * updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;

    /**
     * <p>
     * The status of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_COMPLETE,
     * CREATE_FAILED, UPDATE_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_FAILED,
     * DELETE_IN_PROGRESS
     */
    private String status;

    /**
     * <p>
     * The status message for the dataset.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The status message code for the dataset operation. If a service error
     * occurs, try the API call again later. If a client error occurs, check the
     * input parameters to the dataset API call that failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, SERVICE_ERROR, CLIENT_ERROR
     */
    private String statusMessageCode;

    /**
     * <p>
     * The status message code for the dataset.
     * </p>
     */
    private DatasetStats datasetStats;

    /**
     * <p>
     * The Unix timestamp for the time and date that the dataset was created.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for the time and date that the dataset was
     *         created.
     *         </p>
     */
    public java.util.Date getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp for the time and date that the dataset was created.
     * </p>
     *
     * @param creationTimestamp <p>
     *            The Unix timestamp for the time and date that the dataset was
     *            created.
     *            </p>
     */
    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp for the time and date that the dataset was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimestamp <p>
     *            The Unix timestamp for the time and date that the dataset was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetDescription withCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for the date and time that the dataset was last
     * updated.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for the date and time that the dataset was
     *         last updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp for the date and time that the dataset was last
     * updated.
     * </p>
     *
     * @param lastUpdatedTimestamp <p>
     *            The Unix timestamp for the date and time that the dataset was
     *            last updated.
     *            </p>
     */
    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp for the date and time that the dataset was last
     * updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTimestamp <p>
     *            The Unix timestamp for the date and time that the dataset was
     *            last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetDescription withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    /**
     * <p>
     * The status of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_COMPLETE,
     * CREATE_FAILED, UPDATE_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_FAILED,
     * DELETE_IN_PROGRESS
     *
     * @return <p>
     *         The status of the dataset.
     *         </p>
     * @see DatasetStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_COMPLETE,
     * CREATE_FAILED, UPDATE_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_FAILED,
     * DELETE_IN_PROGRESS
     *
     * @param status <p>
     *            The status of the dataset.
     *            </p>
     * @see DatasetStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_COMPLETE,
     * CREATE_FAILED, UPDATE_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_FAILED,
     * DELETE_IN_PROGRESS
     *
     * @param status <p>
     *            The status of the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatasetStatus
     */
    public DatasetDescription withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_COMPLETE,
     * CREATE_FAILED, UPDATE_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_FAILED,
     * DELETE_IN_PROGRESS
     *
     * @param status <p>
     *            The status of the dataset.
     *            </p>
     * @see DatasetStatus
     */
    public void setStatus(DatasetStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_COMPLETE,
     * CREATE_FAILED, UPDATE_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_FAILED,
     * DELETE_IN_PROGRESS
     *
     * @param status <p>
     *            The status of the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatasetStatus
     */
    public DatasetDescription withStatus(DatasetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message for the dataset.
     * </p>
     *
     * @return <p>
     *         The status message for the dataset.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * The status message for the dataset.
     * </p>
     *
     * @param statusMessage <p>
     *            The status message for the dataset.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            The status message for the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetDescription withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * The status message code for the dataset operation. If a service error
     * occurs, try the API call again later. If a client error occurs, check the
     * input parameters to the dataset API call that failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, SERVICE_ERROR, CLIENT_ERROR
     *
     * @return <p>
     *         The status message code for the dataset operation. If a service
     *         error occurs, try the API call again later. If a client error
     *         occurs, check the input parameters to the dataset API call that
     *         failed.
     *         </p>
     * @see DatasetStatusMessageCode
     */
    public String getStatusMessageCode() {
        return statusMessageCode;
    }

    /**
     * <p>
     * The status message code for the dataset operation. If a service error
     * occurs, try the API call again later. If a client error occurs, check the
     * input parameters to the dataset API call that failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, SERVICE_ERROR, CLIENT_ERROR
     *
     * @param statusMessageCode <p>
     *            The status message code for the dataset operation. If a
     *            service error occurs, try the API call again later. If a
     *            client error occurs, check the input parameters to the dataset
     *            API call that failed.
     *            </p>
     * @see DatasetStatusMessageCode
     */
    public void setStatusMessageCode(String statusMessageCode) {
        this.statusMessageCode = statusMessageCode;
    }

    /**
     * <p>
     * The status message code for the dataset operation. If a service error
     * occurs, try the API call again later. If a client error occurs, check the
     * input parameters to the dataset API call that failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, SERVICE_ERROR, CLIENT_ERROR
     *
     * @param statusMessageCode <p>
     *            The status message code for the dataset operation. If a
     *            service error occurs, try the API call again later. If a
     *            client error occurs, check the input parameters to the dataset
     *            API call that failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatasetStatusMessageCode
     */
    public DatasetDescription withStatusMessageCode(String statusMessageCode) {
        this.statusMessageCode = statusMessageCode;
        return this;
    }

    /**
     * <p>
     * The status message code for the dataset operation. If a service error
     * occurs, try the API call again later. If a client error occurs, check the
     * input parameters to the dataset API call that failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, SERVICE_ERROR, CLIENT_ERROR
     *
     * @param statusMessageCode <p>
     *            The status message code for the dataset operation. If a
     *            service error occurs, try the API call again later. If a
     *            client error occurs, check the input parameters to the dataset
     *            API call that failed.
     *            </p>
     * @see DatasetStatusMessageCode
     */
    public void setStatusMessageCode(DatasetStatusMessageCode statusMessageCode) {
        this.statusMessageCode = statusMessageCode.toString();
    }

    /**
     * <p>
     * The status message code for the dataset operation. If a service error
     * occurs, try the API call again later. If a client error occurs, check the
     * input parameters to the dataset API call that failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, SERVICE_ERROR, CLIENT_ERROR
     *
     * @param statusMessageCode <p>
     *            The status message code for the dataset operation. If a
     *            service error occurs, try the API call again later. If a
     *            client error occurs, check the input parameters to the dataset
     *            API call that failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatasetStatusMessageCode
     */
    public DatasetDescription withStatusMessageCode(DatasetStatusMessageCode statusMessageCode) {
        this.statusMessageCode = statusMessageCode.toString();
        return this;
    }

    /**
     * <p>
     * The status message code for the dataset.
     * </p>
     *
     * @return <p>
     *         The status message code for the dataset.
     *         </p>
     */
    public DatasetStats getDatasetStats() {
        return datasetStats;
    }

    /**
     * <p>
     * The status message code for the dataset.
     * </p>
     *
     * @param datasetStats <p>
     *            The status message code for the dataset.
     *            </p>
     */
    public void setDatasetStats(DatasetStats datasetStats) {
        this.datasetStats = datasetStats;
    }

    /**
     * <p>
     * The status message code for the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param datasetStats <p>
     *            The status message code for the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetDescription withDatasetStats(DatasetStats datasetStats) {
        this.datasetStats = datasetStats;
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
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: " + getCreationTimestamp() + ",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: " + getLastUpdatedTimestamp() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getStatusMessageCode() != null)
            sb.append("StatusMessageCode: " + getStatusMessageCode() + ",");
        if (getDatasetStats() != null)
            sb.append("DatasetStats: " + getDatasetStats());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessageCode() == null) ? 0 : getStatusMessageCode().hashCode());
        hashCode = prime * hashCode
                + ((getDatasetStats() == null) ? 0 : getDatasetStats().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetDescription == false)
            return false;
        DatasetDescription other = (DatasetDescription) obj;

        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null
                && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null
                && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getStatusMessageCode() == null ^ this.getStatusMessageCode() == null)
            return false;
        if (other.getStatusMessageCode() != null
                && other.getStatusMessageCode().equals(this.getStatusMessageCode()) == false)
            return false;
        if (other.getDatasetStats() == null ^ this.getDatasetStats() == null)
            return false;
        if (other.getDatasetStats() != null
                && other.getDatasetStats().equals(this.getDatasetStats()) == false)
            return false;
        return true;
    }
}
