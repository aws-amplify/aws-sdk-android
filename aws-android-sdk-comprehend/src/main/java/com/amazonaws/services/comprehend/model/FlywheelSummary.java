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
 * Flywheel summary information.
 * </p>
 */
public class FlywheelSummary implements Serializable {
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:flywheel
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String flywheelArn;

    /**
     * <p>
     * ARN of the active model version for the flywheel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * |entity-recognizer)/[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-
     * Z0-9](-*[a-zA-Z0-9])*)?<br/>
     */
    private String activeModelArn;

    /**
     * <p>
     * Amazon S3 URI of the data lake location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     */
    private String dataLakeS3Uri;

    /**
     * <p>
     * The status of the flywheel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING, FAILED
     */
    private String status;

    /**
     * <p>
     * Model type of the flywheel's model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT_CLASSIFIER, ENTITY_RECOGNIZER
     */
    private String modelType;

    /**
     * <p>
     * A description of the status of the flywheel.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Creation time of the flywheel.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Last modified time for the flywheel.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The most recent flywheel iteration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[0-9]{8}T[0-9]{6}Z<br/>
     */
    private String latestFlywheelIteration;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:flywheel
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The Amazon Resource Number (ARN) of the flywheel
     *         </p>
     */
    public String getFlywheelArn() {
        return flywheelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:flywheel
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param flywheelArn <p>
     *            The Amazon Resource Number (ARN) of the flywheel
     *            </p>
     */
    public void setFlywheelArn(String flywheelArn) {
        this.flywheelArn = flywheelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:flywheel
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param flywheelArn <p>
     *            The Amazon Resource Number (ARN) of the flywheel
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlywheelSummary withFlywheelArn(String flywheelArn) {
        this.flywheelArn = flywheelArn;
        return this;
    }

    /**
     * <p>
     * ARN of the active model version for the flywheel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * |entity-recognizer)/[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-
     * Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @return <p>
     *         ARN of the active model version for the flywheel.
     *         </p>
     */
    public String getActiveModelArn() {
        return activeModelArn;
    }

    /**
     * <p>
     * ARN of the active model version for the flywheel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * |entity-recognizer)/[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-
     * Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @param activeModelArn <p>
     *            ARN of the active model version for the flywheel.
     *            </p>
     */
    public void setActiveModelArn(String activeModelArn) {
        this.activeModelArn = activeModelArn;
    }

    /**
     * <p>
     * ARN of the active model version for the flywheel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * |entity-recognizer)/[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-
     * Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @param activeModelArn <p>
     *            ARN of the active model version for the flywheel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlywheelSummary withActiveModelArn(String activeModelArn) {
        this.activeModelArn = activeModelArn;
        return this;
    }

    /**
     * <p>
     * Amazon S3 URI of the data lake location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @return <p>
     *         Amazon S3 URI of the data lake location.
     *         </p>
     */
    public String getDataLakeS3Uri() {
        return dataLakeS3Uri;
    }

    /**
     * <p>
     * Amazon S3 URI of the data lake location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param dataLakeS3Uri <p>
     *            Amazon S3 URI of the data lake location.
     *            </p>
     */
    public void setDataLakeS3Uri(String dataLakeS3Uri) {
        this.dataLakeS3Uri = dataLakeS3Uri;
    }

    /**
     * <p>
     * Amazon S3 URI of the data lake location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param dataLakeS3Uri <p>
     *            Amazon S3 URI of the data lake location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlywheelSummary withDataLakeS3Uri(String dataLakeS3Uri) {
        this.dataLakeS3Uri = dataLakeS3Uri;
        return this;
    }

    /**
     * <p>
     * The status of the flywheel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING, FAILED
     *
     * @return <p>
     *         The status of the flywheel.
     *         </p>
     * @see FlywheelStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the flywheel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING, FAILED
     *
     * @param status <p>
     *            The status of the flywheel.
     *            </p>
     * @see FlywheelStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the flywheel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING, FAILED
     *
     * @param status <p>
     *            The status of the flywheel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FlywheelStatus
     */
    public FlywheelSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the flywheel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING, FAILED
     *
     * @param status <p>
     *            The status of the flywheel.
     *            </p>
     * @see FlywheelStatus
     */
    public void setStatus(FlywheelStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the flywheel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING, FAILED
     *
     * @param status <p>
     *            The status of the flywheel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FlywheelStatus
     */
    public FlywheelSummary withStatus(FlywheelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Model type of the flywheel's model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT_CLASSIFIER, ENTITY_RECOGNIZER
     *
     * @return <p>
     *         Model type of the flywheel's model.
     *         </p>
     * @see ModelType
     */
    public String getModelType() {
        return modelType;
    }

    /**
     * <p>
     * Model type of the flywheel's model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT_CLASSIFIER, ENTITY_RECOGNIZER
     *
     * @param modelType <p>
     *            Model type of the flywheel's model.
     *            </p>
     * @see ModelType
     */
    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    /**
     * <p>
     * Model type of the flywheel's model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT_CLASSIFIER, ENTITY_RECOGNIZER
     *
     * @param modelType <p>
     *            Model type of the flywheel's model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelType
     */
    public FlywheelSummary withModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }

    /**
     * <p>
     * Model type of the flywheel's model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT_CLASSIFIER, ENTITY_RECOGNIZER
     *
     * @param modelType <p>
     *            Model type of the flywheel's model.
     *            </p>
     * @see ModelType
     */
    public void setModelType(ModelType modelType) {
        this.modelType = modelType.toString();
    }

    /**
     * <p>
     * Model type of the flywheel's model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT_CLASSIFIER, ENTITY_RECOGNIZER
     *
     * @param modelType <p>
     *            Model type of the flywheel's model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelType
     */
    public FlywheelSummary withModelType(ModelType modelType) {
        this.modelType = modelType.toString();
        return this;
    }

    /**
     * <p>
     * A description of the status of the flywheel.
     * </p>
     *
     * @return <p>
     *         A description of the status of the flywheel.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * A description of the status of the flywheel.
     * </p>
     *
     * @param message <p>
     *            A description of the status of the flywheel.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the status of the flywheel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            A description of the status of the flywheel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlywheelSummary withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * Creation time of the flywheel.
     * </p>
     *
     * @return <p>
     *         Creation time of the flywheel.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * Creation time of the flywheel.
     * </p>
     *
     * @param creationTime <p>
     *            Creation time of the flywheel.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Creation time of the flywheel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            Creation time of the flywheel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlywheelSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * Last modified time for the flywheel.
     * </p>
     *
     * @return <p>
     *         Last modified time for the flywheel.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * Last modified time for the flywheel.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            Last modified time for the flywheel.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * Last modified time for the flywheel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            Last modified time for the flywheel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlywheelSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The most recent flywheel iteration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[0-9]{8}T[0-9]{6}Z<br/>
     *
     * @return <p>
     *         The most recent flywheel iteration.
     *         </p>
     */
    public String getLatestFlywheelIteration() {
        return latestFlywheelIteration;
    }

    /**
     * <p>
     * The most recent flywheel iteration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[0-9]{8}T[0-9]{6}Z<br/>
     *
     * @param latestFlywheelIteration <p>
     *            The most recent flywheel iteration.
     *            </p>
     */
    public void setLatestFlywheelIteration(String latestFlywheelIteration) {
        this.latestFlywheelIteration = latestFlywheelIteration;
    }

    /**
     * <p>
     * The most recent flywheel iteration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[0-9]{8}T[0-9]{6}Z<br/>
     *
     * @param latestFlywheelIteration <p>
     *            The most recent flywheel iteration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlywheelSummary withLatestFlywheelIteration(String latestFlywheelIteration) {
        this.latestFlywheelIteration = latestFlywheelIteration;
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
        if (getFlywheelArn() != null)
            sb.append("FlywheelArn: " + getFlywheelArn() + ",");
        if (getActiveModelArn() != null)
            sb.append("ActiveModelArn: " + getActiveModelArn() + ",");
        if (getDataLakeS3Uri() != null)
            sb.append("DataLakeS3Uri: " + getDataLakeS3Uri() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getModelType() != null)
            sb.append("ModelType: " + getModelType() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getLatestFlywheelIteration() != null)
            sb.append("LatestFlywheelIteration: " + getLatestFlywheelIteration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFlywheelArn() == null) ? 0 : getFlywheelArn().hashCode());
        hashCode = prime * hashCode
                + ((getActiveModelArn() == null) ? 0 : getActiveModelArn().hashCode());
        hashCode = prime * hashCode
                + ((getDataLakeS3Uri() == null) ? 0 : getDataLakeS3Uri().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getModelType() == null) ? 0 : getModelType().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getLatestFlywheelIteration() == null) ? 0 : getLatestFlywheelIteration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlywheelSummary == false)
            return false;
        FlywheelSummary other = (FlywheelSummary) obj;

        if (other.getFlywheelArn() == null ^ this.getFlywheelArn() == null)
            return false;
        if (other.getFlywheelArn() != null
                && other.getFlywheelArn().equals(this.getFlywheelArn()) == false)
            return false;
        if (other.getActiveModelArn() == null ^ this.getActiveModelArn() == null)
            return false;
        if (other.getActiveModelArn() != null
                && other.getActiveModelArn().equals(this.getActiveModelArn()) == false)
            return false;
        if (other.getDataLakeS3Uri() == null ^ this.getDataLakeS3Uri() == null)
            return false;
        if (other.getDataLakeS3Uri() != null
                && other.getDataLakeS3Uri().equals(this.getDataLakeS3Uri()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getModelType() == null ^ this.getModelType() == null)
            return false;
        if (other.getModelType() != null
                && other.getModelType().equals(this.getModelType()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLatestFlywheelIteration() == null ^ this.getLatestFlywheelIteration() == null)
            return false;
        if (other.getLatestFlywheelIteration() != null
                && other.getLatestFlywheelIteration().equals(this.getLatestFlywheelIteration()) == false)
            return false;
        return true;
    }
}
