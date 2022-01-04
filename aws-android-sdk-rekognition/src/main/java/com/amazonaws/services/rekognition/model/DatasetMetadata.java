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
 * Summary information for an Amazon Rekognition Custom Labels dataset. For more
 * information, see <a>ProjectDescription</a>.
 * </p>
 */
public class DatasetMetadata implements Serializable {
    /**
     * <p>
     * The Unix timestamp for the date and time that the dataset was created.
     * </p>
     */
    private java.util.Date creationTimestamp;

    /**
     * <p>
     * The type of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     */
    private String datasetType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/dataset\/(train|test)\/[0-9]+$)<br/>
     */
    private String datasetArn;

    /**
     * <p>
     * The status for the dataset.
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
     * The Unix timestamp for the date and time that the dataset was created.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for the date and time that the dataset was
     *         created.
     *         </p>
     */
    public java.util.Date getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp for the date and time that the dataset was created.
     * </p>
     *
     * @param creationTimestamp <p>
     *            The Unix timestamp for the date and time that the dataset was
     *            created.
     *            </p>
     */
    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp for the date and time that the dataset was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimestamp <p>
     *            The Unix timestamp for the date and time that the dataset was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetMetadata withCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * <p>
     * The type of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @return <p>
     *         The type of the dataset.
     *         </p>
     * @see DatasetType
     */
    public String getDatasetType() {
        return datasetType;
    }

    /**
     * <p>
     * The type of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param datasetType <p>
     *            The type of the dataset.
     *            </p>
     * @see DatasetType
     */
    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * <p>
     * The type of the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param datasetType <p>
     *            The type of the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatasetType
     */
    public DatasetMetadata withDatasetType(String datasetType) {
        this.datasetType = datasetType;
        return this;
    }

    /**
     * <p>
     * The type of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param datasetType <p>
     *            The type of the dataset.
     *            </p>
     * @see DatasetType
     */
    public void setDatasetType(DatasetType datasetType) {
        this.datasetType = datasetType.toString();
    }

    /**
     * <p>
     * The type of the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param datasetType <p>
     *            The type of the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatasetType
     */
    public DatasetMetadata withDatasetType(DatasetType datasetType) {
        this.datasetType = datasetType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/dataset\/(train|test)\/[0-9]+$)<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the dataset.
     *         </p>
     */
    public String getDatasetArn() {
        return datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/dataset\/(train|test)\/[0-9]+$)<br/>
     *
     * @param datasetArn <p>
     *            The Amazon Resource Name (ARN) for the dataset.
     *            </p>
     */
    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/dataset\/(train|test)\/[0-9]+$)<br/>
     *
     * @param datasetArn <p>
     *            The Amazon Resource Name (ARN) for the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetMetadata withDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
        return this;
    }

    /**
     * <p>
     * The status for the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_COMPLETE,
     * CREATE_FAILED, UPDATE_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_FAILED,
     * DELETE_IN_PROGRESS
     *
     * @return <p>
     *         The status for the dataset.
     *         </p>
     * @see DatasetStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status for the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_COMPLETE,
     * CREATE_FAILED, UPDATE_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_FAILED,
     * DELETE_IN_PROGRESS
     *
     * @param status <p>
     *            The status for the dataset.
     *            </p>
     * @see DatasetStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status for the dataset.
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
     *            The status for the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatasetStatus
     */
    public DatasetMetadata withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status for the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_COMPLETE,
     * CREATE_FAILED, UPDATE_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_FAILED,
     * DELETE_IN_PROGRESS
     *
     * @param status <p>
     *            The status for the dataset.
     *            </p>
     * @see DatasetStatus
     */
    public void setStatus(DatasetStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status for the dataset.
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
     *            The status for the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatasetStatus
     */
    public DatasetMetadata withStatus(DatasetStatus status) {
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
    public DatasetMetadata withStatusMessage(String statusMessage) {
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
    public DatasetMetadata withStatusMessageCode(String statusMessageCode) {
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
    public DatasetMetadata withStatusMessageCode(DatasetStatusMessageCode statusMessageCode) {
        this.statusMessageCode = statusMessageCode.toString();
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
        if (getDatasetType() != null)
            sb.append("DatasetType: " + getDatasetType() + ",");
        if (getDatasetArn() != null)
            sb.append("DatasetArn: " + getDatasetArn() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getStatusMessageCode() != null)
            sb.append("StatusMessageCode: " + getStatusMessageCode());
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
                + ((getDatasetType() == null) ? 0 : getDatasetType().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessageCode() == null) ? 0 : getStatusMessageCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetMetadata == false)
            return false;
        DatasetMetadata other = (DatasetMetadata) obj;

        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null
                && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getDatasetType() == null ^ this.getDatasetType() == null)
            return false;
        if (other.getDatasetType() != null
                && other.getDatasetType().equals(this.getDatasetType()) == false)
            return false;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null
                && other.getDatasetArn().equals(this.getDatasetArn()) == false)
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
        return true;
    }
}
