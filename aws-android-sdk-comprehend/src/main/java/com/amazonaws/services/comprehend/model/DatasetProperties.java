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
 * Properties associated with the dataset.
 * </p>
 */
public class DatasetProperties implements Serializable {
    /**
     * <p>
     * The ARN of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:flywheel
     * /[a-zA-Z0-9](-*[a-zA-Z0-9]){@literal *}
     * /dataset/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String datasetArn;

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String datasetName;

    /**
     * <p>
     * The dataset type (training data or test data).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     */
    private String datasetType;

    /**
     * <p>
     * The S3 URI where the dataset is stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     */
    private String datasetS3Uri;

    /**
     * <p>
     * Description of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     */
    private String description;

    /**
     * <p>
     * The dataset status. While the system creates the dataset, the status is
     * <code>CREATING</code>. When the dataset is ready to use, the status
     * changes to <code>COMPLETED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, COMPLETED, FAILED
     */
    private String status;

    /**
     * <p>
     * A description of the status of the dataset.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The number of documents in the dataset.
     * </p>
     */
    private Long numberOfDocuments;

    /**
     * <p>
     * Creation time of the dataset.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Time when the data from the dataset becomes available in the data lake.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The ARN of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:flywheel
     * /[a-zA-Z0-9](-*[a-zA-Z0-9]){@literal *}
     * /dataset/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The ARN of the dataset.
     *         </p>
     */
    public String getDatasetArn() {
        return datasetArn;
    }

    /**
     * <p>
     * The ARN of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:flywheel
     * /[a-zA-Z0-9](-*[a-zA-Z0-9]){@literal *}
     * /dataset/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param datasetArn <p>
     *            The ARN of the dataset.
     *            </p>
     */
    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The ARN of the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:flywheel
     * /[a-zA-Z0-9](-*[a-zA-Z0-9]){@literal *}
     * /dataset/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param datasetArn <p>
     *            The ARN of the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetProperties withDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
        return this;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the dataset.
     *         </p>
     */
    public String getDatasetName() {
        return datasetName;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param datasetName <p>
     *            The name of the dataset.
     *            </p>
     */
    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param datasetName <p>
     *            The name of the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetProperties withDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }

    /**
     * <p>
     * The dataset type (training data or test data).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @return <p>
     *         The dataset type (training data or test data).
     *         </p>
     * @see DatasetType
     */
    public String getDatasetType() {
        return datasetType;
    }

    /**
     * <p>
     * The dataset type (training data or test data).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param datasetType <p>
     *            The dataset type (training data or test data).
     *            </p>
     * @see DatasetType
     */
    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * <p>
     * The dataset type (training data or test data).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param datasetType <p>
     *            The dataset type (training data or test data).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatasetType
     */
    public DatasetProperties withDatasetType(String datasetType) {
        this.datasetType = datasetType;
        return this;
    }

    /**
     * <p>
     * The dataset type (training data or test data).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param datasetType <p>
     *            The dataset type (training data or test data).
     *            </p>
     * @see DatasetType
     */
    public void setDatasetType(DatasetType datasetType) {
        this.datasetType = datasetType.toString();
    }

    /**
     * <p>
     * The dataset type (training data or test data).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param datasetType <p>
     *            The dataset type (training data or test data).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatasetType
     */
    public DatasetProperties withDatasetType(DatasetType datasetType) {
        this.datasetType = datasetType.toString();
        return this;
    }

    /**
     * <p>
     * The S3 URI where the dataset is stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @return <p>
     *         The S3 URI where the dataset is stored.
     *         </p>
     */
    public String getDatasetS3Uri() {
        return datasetS3Uri;
    }

    /**
     * <p>
     * The S3 URI where the dataset is stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param datasetS3Uri <p>
     *            The S3 URI where the dataset is stored.
     *            </p>
     */
    public void setDatasetS3Uri(String datasetS3Uri) {
        this.datasetS3Uri = datasetS3Uri;
    }

    /**
     * <p>
     * The S3 URI where the dataset is stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param datasetS3Uri <p>
     *            The S3 URI where the dataset is stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetProperties withDatasetS3Uri(String datasetS3Uri) {
        this.datasetS3Uri = datasetS3Uri;
        return this;
    }

    /**
     * <p>
     * Description of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     *
     * @return <p>
     *         Description of the dataset.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Description of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     *
     * @param description <p>
     *            Description of the dataset.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     *
     * @param description <p>
     *            Description of the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The dataset status. While the system creates the dataset, the status is
     * <code>CREATING</code>. When the dataset is ready to use, the status
     * changes to <code>COMPLETED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, COMPLETED, FAILED
     *
     * @return <p>
     *         The dataset status. While the system creates the dataset, the
     *         status is <code>CREATING</code>. When the dataset is ready to
     *         use, the status changes to <code>COMPLETED</code>.
     *         </p>
     * @see DatasetStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The dataset status. While the system creates the dataset, the status is
     * <code>CREATING</code>. When the dataset is ready to use, the status
     * changes to <code>COMPLETED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, COMPLETED, FAILED
     *
     * @param status <p>
     *            The dataset status. While the system creates the dataset, the
     *            status is <code>CREATING</code>. When the dataset is ready to
     *            use, the status changes to <code>COMPLETED</code>.
     *            </p>
     * @see DatasetStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The dataset status. While the system creates the dataset, the status is
     * <code>CREATING</code>. When the dataset is ready to use, the status
     * changes to <code>COMPLETED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, COMPLETED, FAILED
     *
     * @param status <p>
     *            The dataset status. While the system creates the dataset, the
     *            status is <code>CREATING</code>. When the dataset is ready to
     *            use, the status changes to <code>COMPLETED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatasetStatus
     */
    public DatasetProperties withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The dataset status. While the system creates the dataset, the status is
     * <code>CREATING</code>. When the dataset is ready to use, the status
     * changes to <code>COMPLETED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, COMPLETED, FAILED
     *
     * @param status <p>
     *            The dataset status. While the system creates the dataset, the
     *            status is <code>CREATING</code>. When the dataset is ready to
     *            use, the status changes to <code>COMPLETED</code>.
     *            </p>
     * @see DatasetStatus
     */
    public void setStatus(DatasetStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The dataset status. While the system creates the dataset, the status is
     * <code>CREATING</code>. When the dataset is ready to use, the status
     * changes to <code>COMPLETED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, COMPLETED, FAILED
     *
     * @param status <p>
     *            The dataset status. While the system creates the dataset, the
     *            status is <code>CREATING</code>. When the dataset is ready to
     *            use, the status changes to <code>COMPLETED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatasetStatus
     */
    public DatasetProperties withStatus(DatasetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A description of the status of the dataset.
     * </p>
     *
     * @return <p>
     *         A description of the status of the dataset.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * A description of the status of the dataset.
     * </p>
     *
     * @param message <p>
     *            A description of the status of the dataset.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the status of the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            A description of the status of the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetProperties withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The number of documents in the dataset.
     * </p>
     *
     * @return <p>
     *         The number of documents in the dataset.
     *         </p>
     */
    public Long getNumberOfDocuments() {
        return numberOfDocuments;
    }

    /**
     * <p>
     * The number of documents in the dataset.
     * </p>
     *
     * @param numberOfDocuments <p>
     *            The number of documents in the dataset.
     *            </p>
     */
    public void setNumberOfDocuments(Long numberOfDocuments) {
        this.numberOfDocuments = numberOfDocuments;
    }

    /**
     * <p>
     * The number of documents in the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfDocuments <p>
     *            The number of documents in the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetProperties withNumberOfDocuments(Long numberOfDocuments) {
        this.numberOfDocuments = numberOfDocuments;
        return this;
    }

    /**
     * <p>
     * Creation time of the dataset.
     * </p>
     *
     * @return <p>
     *         Creation time of the dataset.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * Creation time of the dataset.
     * </p>
     *
     * @param creationTime <p>
     *            Creation time of the dataset.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Creation time of the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            Creation time of the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetProperties withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * Time when the data from the dataset becomes available in the data lake.
     * </p>
     *
     * @return <p>
     *         Time when the data from the dataset becomes available in the data
     *         lake.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * Time when the data from the dataset becomes available in the data lake.
     * </p>
     *
     * @param endTime <p>
     *            Time when the data from the dataset becomes available in the
     *            data lake.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Time when the data from the dataset becomes available in the data lake.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            Time when the data from the dataset becomes available in the
     *            data lake.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetProperties withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
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
        if (getDatasetArn() != null)
            sb.append("DatasetArn: " + getDatasetArn() + ",");
        if (getDatasetName() != null)
            sb.append("DatasetName: " + getDatasetName() + ",");
        if (getDatasetType() != null)
            sb.append("DatasetType: " + getDatasetType() + ",");
        if (getDatasetS3Uri() != null)
            sb.append("DatasetS3Uri: " + getDatasetS3Uri() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getNumberOfDocuments() != null)
            sb.append("NumberOfDocuments: " + getNumberOfDocuments() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode
                + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode
                + ((getDatasetType() == null) ? 0 : getDatasetType().hashCode());
        hashCode = prime * hashCode
                + ((getDatasetS3Uri() == null) ? 0 : getDatasetS3Uri().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfDocuments() == null) ? 0 : getNumberOfDocuments().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetProperties == false)
            return false;
        DatasetProperties other = (DatasetProperties) obj;

        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null
                && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null
                && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getDatasetType() == null ^ this.getDatasetType() == null)
            return false;
        if (other.getDatasetType() != null
                && other.getDatasetType().equals(this.getDatasetType()) == false)
            return false;
        if (other.getDatasetS3Uri() == null ^ this.getDatasetS3Uri() == null)
            return false;
        if (other.getDatasetS3Uri() != null
                && other.getDatasetS3Uri().equals(this.getDatasetS3Uri()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getNumberOfDocuments() == null ^ this.getNumberOfDocuments() == null)
            return false;
        if (other.getNumberOfDocuments() != null
                && other.getNumberOfDocuments().equals(this.getNumberOfDocuments()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }
}
