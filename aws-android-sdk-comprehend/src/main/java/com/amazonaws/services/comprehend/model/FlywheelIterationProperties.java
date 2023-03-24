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
 * The configuration properties of a flywheel iteration.
 * </p>
 */
public class FlywheelIterationProperties implements Serializable {
    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:flywheel
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String flywheelArn;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[0-9]{8}T[0-9]{6}Z<br/>
     */
    private String flywheelIterationId;

    /**
     * <p>
     * The creation start time of the flywheel iteration.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The completion time of this flywheel iteration.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The status of the flywheel iteration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAINING, EVALUATING, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     */
    private String status;

    /**
     * <p>
     * A description of the status of the flywheel iteration.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The ARN of the evaluated model associated with this flywheel iteration.
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
    private String evaluatedModelArn;

    /**
     * <p>
     * The evaluation metrics associated with the evaluated model.
     * </p>
     */
    private FlywheelModelEvaluationMetrics evaluatedModelMetrics;

    /**
     * <p>
     * The ARN of the trained model associated with this flywheel iteration.
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
    private String trainedModelArn;

    /**
     * <p>
     * The metrics associated with the trained model.
     * </p>
     */
    private FlywheelModelEvaluationMetrics trainedModelMetrics;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     */
    private String evaluationManifestS3Prefix;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:flywheel
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p/>
     */
    public String getFlywheelArn() {
        return flywheelArn;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:flywheel
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param flywheelArn <p/>
     */
    public void setFlywheelArn(String flywheelArn) {
        this.flywheelArn = flywheelArn;
    }

    /**
     * <p/>
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
     * @param flywheelArn <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlywheelIterationProperties withFlywheelArn(String flywheelArn) {
        this.flywheelArn = flywheelArn;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[0-9]{8}T[0-9]{6}Z<br/>
     *
     * @return <p/>
     */
    public String getFlywheelIterationId() {
        return flywheelIterationId;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[0-9]{8}T[0-9]{6}Z<br/>
     *
     * @param flywheelIterationId <p/>
     */
    public void setFlywheelIterationId(String flywheelIterationId) {
        this.flywheelIterationId = flywheelIterationId;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[0-9]{8}T[0-9]{6}Z<br/>
     *
     * @param flywheelIterationId <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlywheelIterationProperties withFlywheelIterationId(String flywheelIterationId) {
        this.flywheelIterationId = flywheelIterationId;
        return this;
    }

    /**
     * <p>
     * The creation start time of the flywheel iteration.
     * </p>
     *
     * @return <p>
     *         The creation start time of the flywheel iteration.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The creation start time of the flywheel iteration.
     * </p>
     *
     * @param creationTime <p>
     *            The creation start time of the flywheel iteration.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation start time of the flywheel iteration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The creation start time of the flywheel iteration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlywheelIterationProperties withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The completion time of this flywheel iteration.
     * </p>
     *
     * @return <p>
     *         The completion time of this flywheel iteration.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The completion time of this flywheel iteration.
     * </p>
     *
     * @param endTime <p>
     *            The completion time of this flywheel iteration.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The completion time of this flywheel iteration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The completion time of this flywheel iteration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlywheelIterationProperties withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The status of the flywheel iteration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAINING, EVALUATING, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @return <p>
     *         The status of the flywheel iteration.
     *         </p>
     * @see FlywheelIterationStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the flywheel iteration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAINING, EVALUATING, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param status <p>
     *            The status of the flywheel iteration.
     *            </p>
     * @see FlywheelIterationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the flywheel iteration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAINING, EVALUATING, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param status <p>
     *            The status of the flywheel iteration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FlywheelIterationStatus
     */
    public FlywheelIterationProperties withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the flywheel iteration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAINING, EVALUATING, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param status <p>
     *            The status of the flywheel iteration.
     *            </p>
     * @see FlywheelIterationStatus
     */
    public void setStatus(FlywheelIterationStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the flywheel iteration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAINING, EVALUATING, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param status <p>
     *            The status of the flywheel iteration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FlywheelIterationStatus
     */
    public FlywheelIterationProperties withStatus(FlywheelIterationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A description of the status of the flywheel iteration.
     * </p>
     *
     * @return <p>
     *         A description of the status of the flywheel iteration.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * A description of the status of the flywheel iteration.
     * </p>
     *
     * @param message <p>
     *            A description of the status of the flywheel iteration.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the status of the flywheel iteration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            A description of the status of the flywheel iteration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlywheelIterationProperties withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The ARN of the evaluated model associated with this flywheel iteration.
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
     *         The ARN of the evaluated model associated with this flywheel
     *         iteration.
     *         </p>
     */
    public String getEvaluatedModelArn() {
        return evaluatedModelArn;
    }

    /**
     * <p>
     * The ARN of the evaluated model associated with this flywheel iteration.
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
     * @param evaluatedModelArn <p>
     *            The ARN of the evaluated model associated with this flywheel
     *            iteration.
     *            </p>
     */
    public void setEvaluatedModelArn(String evaluatedModelArn) {
        this.evaluatedModelArn = evaluatedModelArn;
    }

    /**
     * <p>
     * The ARN of the evaluated model associated with this flywheel iteration.
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
     * @param evaluatedModelArn <p>
     *            The ARN of the evaluated model associated with this flywheel
     *            iteration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlywheelIterationProperties withEvaluatedModelArn(String evaluatedModelArn) {
        this.evaluatedModelArn = evaluatedModelArn;
        return this;
    }

    /**
     * <p>
     * The evaluation metrics associated with the evaluated model.
     * </p>
     *
     * @return <p>
     *         The evaluation metrics associated with the evaluated model.
     *         </p>
     */
    public FlywheelModelEvaluationMetrics getEvaluatedModelMetrics() {
        return evaluatedModelMetrics;
    }

    /**
     * <p>
     * The evaluation metrics associated with the evaluated model.
     * </p>
     *
     * @param evaluatedModelMetrics <p>
     *            The evaluation metrics associated with the evaluated model.
     *            </p>
     */
    public void setEvaluatedModelMetrics(FlywheelModelEvaluationMetrics evaluatedModelMetrics) {
        this.evaluatedModelMetrics = evaluatedModelMetrics;
    }

    /**
     * <p>
     * The evaluation metrics associated with the evaluated model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evaluatedModelMetrics <p>
     *            The evaluation metrics associated with the evaluated model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlywheelIterationProperties withEvaluatedModelMetrics(
            FlywheelModelEvaluationMetrics evaluatedModelMetrics) {
        this.evaluatedModelMetrics = evaluatedModelMetrics;
        return this;
    }

    /**
     * <p>
     * The ARN of the trained model associated with this flywheel iteration.
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
     *         The ARN of the trained model associated with this flywheel
     *         iteration.
     *         </p>
     */
    public String getTrainedModelArn() {
        return trainedModelArn;
    }

    /**
     * <p>
     * The ARN of the trained model associated with this flywheel iteration.
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
     * @param trainedModelArn <p>
     *            The ARN of the trained model associated with this flywheel
     *            iteration.
     *            </p>
     */
    public void setTrainedModelArn(String trainedModelArn) {
        this.trainedModelArn = trainedModelArn;
    }

    /**
     * <p>
     * The ARN of the trained model associated with this flywheel iteration.
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
     * @param trainedModelArn <p>
     *            The ARN of the trained model associated with this flywheel
     *            iteration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlywheelIterationProperties withTrainedModelArn(String trainedModelArn) {
        this.trainedModelArn = trainedModelArn;
        return this;
    }

    /**
     * <p>
     * The metrics associated with the trained model.
     * </p>
     *
     * @return <p>
     *         The metrics associated with the trained model.
     *         </p>
     */
    public FlywheelModelEvaluationMetrics getTrainedModelMetrics() {
        return trainedModelMetrics;
    }

    /**
     * <p>
     * The metrics associated with the trained model.
     * </p>
     *
     * @param trainedModelMetrics <p>
     *            The metrics associated with the trained model.
     *            </p>
     */
    public void setTrainedModelMetrics(FlywheelModelEvaluationMetrics trainedModelMetrics) {
        this.trainedModelMetrics = trainedModelMetrics;
    }

    /**
     * <p>
     * The metrics associated with the trained model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainedModelMetrics <p>
     *            The metrics associated with the trained model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlywheelIterationProperties withTrainedModelMetrics(
            FlywheelModelEvaluationMetrics trainedModelMetrics) {
        this.trainedModelMetrics = trainedModelMetrics;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @return <p/>
     */
    public String getEvaluationManifestS3Prefix() {
        return evaluationManifestS3Prefix;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param evaluationManifestS3Prefix <p/>
     */
    public void setEvaluationManifestS3Prefix(String evaluationManifestS3Prefix) {
        this.evaluationManifestS3Prefix = evaluationManifestS3Prefix;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param evaluationManifestS3Prefix <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlywheelIterationProperties withEvaluationManifestS3Prefix(
            String evaluationManifestS3Prefix) {
        this.evaluationManifestS3Prefix = evaluationManifestS3Prefix;
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
        if (getFlywheelIterationId() != null)
            sb.append("FlywheelIterationId: " + getFlywheelIterationId() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getEvaluatedModelArn() != null)
            sb.append("EvaluatedModelArn: " + getEvaluatedModelArn() + ",");
        if (getEvaluatedModelMetrics() != null)
            sb.append("EvaluatedModelMetrics: " + getEvaluatedModelMetrics() + ",");
        if (getTrainedModelArn() != null)
            sb.append("TrainedModelArn: " + getTrainedModelArn() + ",");
        if (getTrainedModelMetrics() != null)
            sb.append("TrainedModelMetrics: " + getTrainedModelMetrics() + ",");
        if (getEvaluationManifestS3Prefix() != null)
            sb.append("EvaluationManifestS3Prefix: " + getEvaluationManifestS3Prefix());
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
                + ((getFlywheelIterationId() == null) ? 0 : getFlywheelIterationId().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluatedModelArn() == null) ? 0 : getEvaluatedModelArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getEvaluatedModelMetrics() == null) ? 0 : getEvaluatedModelMetrics().hashCode());
        hashCode = prime * hashCode
                + ((getTrainedModelArn() == null) ? 0 : getTrainedModelArn().hashCode());
        hashCode = prime * hashCode
                + ((getTrainedModelMetrics() == null) ? 0 : getTrainedModelMetrics().hashCode());
        hashCode = prime
                * hashCode
                + ((getEvaluationManifestS3Prefix() == null) ? 0 : getEvaluationManifestS3Prefix()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlywheelIterationProperties == false)
            return false;
        FlywheelIterationProperties other = (FlywheelIterationProperties) obj;

        if (other.getFlywheelArn() == null ^ this.getFlywheelArn() == null)
            return false;
        if (other.getFlywheelArn() != null
                && other.getFlywheelArn().equals(this.getFlywheelArn()) == false)
            return false;
        if (other.getFlywheelIterationId() == null ^ this.getFlywheelIterationId() == null)
            return false;
        if (other.getFlywheelIterationId() != null
                && other.getFlywheelIterationId().equals(this.getFlywheelIterationId()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getEvaluatedModelArn() == null ^ this.getEvaluatedModelArn() == null)
            return false;
        if (other.getEvaluatedModelArn() != null
                && other.getEvaluatedModelArn().equals(this.getEvaluatedModelArn()) == false)
            return false;
        if (other.getEvaluatedModelMetrics() == null ^ this.getEvaluatedModelMetrics() == null)
            return false;
        if (other.getEvaluatedModelMetrics() != null
                && other.getEvaluatedModelMetrics().equals(this.getEvaluatedModelMetrics()) == false)
            return false;
        if (other.getTrainedModelArn() == null ^ this.getTrainedModelArn() == null)
            return false;
        if (other.getTrainedModelArn() != null
                && other.getTrainedModelArn().equals(this.getTrainedModelArn()) == false)
            return false;
        if (other.getTrainedModelMetrics() == null ^ this.getTrainedModelMetrics() == null)
            return false;
        if (other.getTrainedModelMetrics() != null
                && other.getTrainedModelMetrics().equals(this.getTrainedModelMetrics()) == false)
            return false;
        if (other.getEvaluationManifestS3Prefix() == null
                ^ this.getEvaluationManifestS3Prefix() == null)
            return false;
        if (other.getEvaluationManifestS3Prefix() != null
                && other.getEvaluationManifestS3Prefix().equals(
                        this.getEvaluationManifestS3Prefix()) == false)
            return false;
        return true;
    }
}
