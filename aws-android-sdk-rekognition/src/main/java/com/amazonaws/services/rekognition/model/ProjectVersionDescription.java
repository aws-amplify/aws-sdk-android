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
 * A description of a version of an Amazon Rekognition Custom Labels model.
 * </p>
 */
public class ProjectVersionDescription implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     */
    private String projectVersionArn;

    /**
     * <p>
     * The Unix datetime for the date and time that training started.
     * </p>
     */
    private java.util.Date creationTimestamp;

    /**
     * <p>
     * The minimum number of inference units used by the model. For more
     * information, see <a>StartProjectVersion</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer minInferenceUnits;

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAINING_IN_PROGRESS, TRAINING_COMPLETED,
     * TRAINING_FAILED, STARTING, RUNNING, FAILED, STOPPING, STOPPED, DELETING
     */
    private String status;

    /**
     * <p>
     * A descriptive message for an error or warning that occurred.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The duration, in seconds, that you were billed for a successful training
     * of the model version. This value is only returned if the model version
     * has been successfully trained.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long billableTrainingTimeInSeconds;

    /**
     * <p>
     * The Unix date and time that training of the model ended.
     * </p>
     */
    private java.util.Date trainingEndTimestamp;

    /**
     * <p>
     * The location where training results are saved.
     * </p>
     */
    private OutputConfig outputConfig;

    /**
     * <p>
     * Contains information about the training results.
     * </p>
     */
    private TrainingDataResult trainingDataResult;

    /**
     * <p>
     * Contains information about the testing results.
     * </p>
     */
    private TestingDataResult testingDataResult;

    /**
     * <p>
     * The training results. <code>EvaluationResult</code> is only returned if
     * training is successful.
     * </p>
     */
    private EvaluationResult evaluationResult;

    /**
     * <p>
     * The location of the summary manifest. The summary manifest provides
     * aggregate data validation results for the training and test datasets.
     * </p>
     */
    private GroundTruthManifest manifestSummary;

    /**
     * <p>
     * The identifer for the AWS Key Management Service key (AWS KMS key) that
     * was used to encrypt the model during training.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the model version.
     *         </p>
     */
    public String getProjectVersionArn() {
        return projectVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param projectVersionArn <p>
     *            The Amazon Resource Name (ARN) of the model version.
     *            </p>
     */
    public void setProjectVersionArn(String projectVersionArn) {
        this.projectVersionArn = projectVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param projectVersionArn <p>
     *            The Amazon Resource Name (ARN) of the model version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectVersionDescription withProjectVersionArn(String projectVersionArn) {
        this.projectVersionArn = projectVersionArn;
        return this;
    }

    /**
     * <p>
     * The Unix datetime for the date and time that training started.
     * </p>
     *
     * @return <p>
     *         The Unix datetime for the date and time that training started.
     *         </p>
     */
    public java.util.Date getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * <p>
     * The Unix datetime for the date and time that training started.
     * </p>
     *
     * @param creationTimestamp <p>
     *            The Unix datetime for the date and time that training started.
     *            </p>
     */
    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The Unix datetime for the date and time that training started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimestamp <p>
     *            The Unix datetime for the date and time that training started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectVersionDescription withCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * <p>
     * The minimum number of inference units used by the model. For more
     * information, see <a>StartProjectVersion</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The minimum number of inference units used by the model. For more
     *         information, see <a>StartProjectVersion</a>.
     *         </p>
     */
    public Integer getMinInferenceUnits() {
        return minInferenceUnits;
    }

    /**
     * <p>
     * The minimum number of inference units used by the model. For more
     * information, see <a>StartProjectVersion</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param minInferenceUnits <p>
     *            The minimum number of inference units used by the model. For
     *            more information, see <a>StartProjectVersion</a>.
     *            </p>
     */
    public void setMinInferenceUnits(Integer minInferenceUnits) {
        this.minInferenceUnits = minInferenceUnits;
    }

    /**
     * <p>
     * The minimum number of inference units used by the model. For more
     * information, see <a>StartProjectVersion</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param minInferenceUnits <p>
     *            The minimum number of inference units used by the model. For
     *            more information, see <a>StartProjectVersion</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectVersionDescription withMinInferenceUnits(Integer minInferenceUnits) {
        this.minInferenceUnits = minInferenceUnits;
        return this;
    }

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAINING_IN_PROGRESS, TRAINING_COMPLETED,
     * TRAINING_FAILED, STARTING, RUNNING, FAILED, STOPPING, STOPPED, DELETING
     *
     * @return <p>
     *         The current status of the model version.
     *         </p>
     * @see ProjectVersionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAINING_IN_PROGRESS, TRAINING_COMPLETED,
     * TRAINING_FAILED, STARTING, RUNNING, FAILED, STOPPING, STOPPED, DELETING
     *
     * @param status <p>
     *            The current status of the model version.
     *            </p>
     * @see ProjectVersionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAINING_IN_PROGRESS, TRAINING_COMPLETED,
     * TRAINING_FAILED, STARTING, RUNNING, FAILED, STOPPING, STOPPED, DELETING
     *
     * @param status <p>
     *            The current status of the model version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProjectVersionStatus
     */
    public ProjectVersionDescription withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAINING_IN_PROGRESS, TRAINING_COMPLETED,
     * TRAINING_FAILED, STARTING, RUNNING, FAILED, STOPPING, STOPPED, DELETING
     *
     * @param status <p>
     *            The current status of the model version.
     *            </p>
     * @see ProjectVersionStatus
     */
    public void setStatus(ProjectVersionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAINING_IN_PROGRESS, TRAINING_COMPLETED,
     * TRAINING_FAILED, STARTING, RUNNING, FAILED, STOPPING, STOPPED, DELETING
     *
     * @param status <p>
     *            The current status of the model version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProjectVersionStatus
     */
    public ProjectVersionDescription withStatus(ProjectVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A descriptive message for an error or warning that occurred.
     * </p>
     *
     * @return <p>
     *         A descriptive message for an error or warning that occurred.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * A descriptive message for an error or warning that occurred.
     * </p>
     *
     * @param statusMessage <p>
     *            A descriptive message for an error or warning that occurred.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A descriptive message for an error or warning that occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            A descriptive message for an error or warning that occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectVersionDescription withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * The duration, in seconds, that you were billed for a successful training
     * of the model version. This value is only returned if the model version
     * has been successfully trained.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The duration, in seconds, that you were billed for a successful
     *         training of the model version. This value is only returned if the
     *         model version has been successfully trained.
     *         </p>
     */
    public Long getBillableTrainingTimeInSeconds() {
        return billableTrainingTimeInSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, that you were billed for a successful training
     * of the model version. This value is only returned if the model version
     * has been successfully trained.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param billableTrainingTimeInSeconds <p>
     *            The duration, in seconds, that you were billed for a
     *            successful training of the model version. This value is only
     *            returned if the model version has been successfully trained.
     *            </p>
     */
    public void setBillableTrainingTimeInSeconds(Long billableTrainingTimeInSeconds) {
        this.billableTrainingTimeInSeconds = billableTrainingTimeInSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, that you were billed for a successful training
     * of the model version. This value is only returned if the model version
     * has been successfully trained.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param billableTrainingTimeInSeconds <p>
     *            The duration, in seconds, that you were billed for a
     *            successful training of the model version. This value is only
     *            returned if the model version has been successfully trained.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectVersionDescription withBillableTrainingTimeInSeconds(
            Long billableTrainingTimeInSeconds) {
        this.billableTrainingTimeInSeconds = billableTrainingTimeInSeconds;
        return this;
    }

    /**
     * <p>
     * The Unix date and time that training of the model ended.
     * </p>
     *
     * @return <p>
     *         The Unix date and time that training of the model ended.
     *         </p>
     */
    public java.util.Date getTrainingEndTimestamp() {
        return trainingEndTimestamp;
    }

    /**
     * <p>
     * The Unix date and time that training of the model ended.
     * </p>
     *
     * @param trainingEndTimestamp <p>
     *            The Unix date and time that training of the model ended.
     *            </p>
     */
    public void setTrainingEndTimestamp(java.util.Date trainingEndTimestamp) {
        this.trainingEndTimestamp = trainingEndTimestamp;
    }

    /**
     * <p>
     * The Unix date and time that training of the model ended.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingEndTimestamp <p>
     *            The Unix date and time that training of the model ended.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectVersionDescription withTrainingEndTimestamp(java.util.Date trainingEndTimestamp) {
        this.trainingEndTimestamp = trainingEndTimestamp;
        return this;
    }

    /**
     * <p>
     * The location where training results are saved.
     * </p>
     *
     * @return <p>
     *         The location where training results are saved.
     *         </p>
     */
    public OutputConfig getOutputConfig() {
        return outputConfig;
    }

    /**
     * <p>
     * The location where training results are saved.
     * </p>
     *
     * @param outputConfig <p>
     *            The location where training results are saved.
     *            </p>
     */
    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The location where training results are saved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputConfig <p>
     *            The location where training results are saved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectVersionDescription withOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }

    /**
     * <p>
     * Contains information about the training results.
     * </p>
     *
     * @return <p>
     *         Contains information about the training results.
     *         </p>
     */
    public TrainingDataResult getTrainingDataResult() {
        return trainingDataResult;
    }

    /**
     * <p>
     * Contains information about the training results.
     * </p>
     *
     * @param trainingDataResult <p>
     *            Contains information about the training results.
     *            </p>
     */
    public void setTrainingDataResult(TrainingDataResult trainingDataResult) {
        this.trainingDataResult = trainingDataResult;
    }

    /**
     * <p>
     * Contains information about the training results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingDataResult <p>
     *            Contains information about the training results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectVersionDescription withTrainingDataResult(TrainingDataResult trainingDataResult) {
        this.trainingDataResult = trainingDataResult;
        return this;
    }

    /**
     * <p>
     * Contains information about the testing results.
     * </p>
     *
     * @return <p>
     *         Contains information about the testing results.
     *         </p>
     */
    public TestingDataResult getTestingDataResult() {
        return testingDataResult;
    }

    /**
     * <p>
     * Contains information about the testing results.
     * </p>
     *
     * @param testingDataResult <p>
     *            Contains information about the testing results.
     *            </p>
     */
    public void setTestingDataResult(TestingDataResult testingDataResult) {
        this.testingDataResult = testingDataResult;
    }

    /**
     * <p>
     * Contains information about the testing results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param testingDataResult <p>
     *            Contains information about the testing results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectVersionDescription withTestingDataResult(TestingDataResult testingDataResult) {
        this.testingDataResult = testingDataResult;
        return this;
    }

    /**
     * <p>
     * The training results. <code>EvaluationResult</code> is only returned if
     * training is successful.
     * </p>
     *
     * @return <p>
     *         The training results. <code>EvaluationResult</code> is only
     *         returned if training is successful.
     *         </p>
     */
    public EvaluationResult getEvaluationResult() {
        return evaluationResult;
    }

    /**
     * <p>
     * The training results. <code>EvaluationResult</code> is only returned if
     * training is successful.
     * </p>
     *
     * @param evaluationResult <p>
     *            The training results. <code>EvaluationResult</code> is only
     *            returned if training is successful.
     *            </p>
     */
    public void setEvaluationResult(EvaluationResult evaluationResult) {
        this.evaluationResult = evaluationResult;
    }

    /**
     * <p>
     * The training results. <code>EvaluationResult</code> is only returned if
     * training is successful.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evaluationResult <p>
     *            The training results. <code>EvaluationResult</code> is only
     *            returned if training is successful.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectVersionDescription withEvaluationResult(EvaluationResult evaluationResult) {
        this.evaluationResult = evaluationResult;
        return this;
    }

    /**
     * <p>
     * The location of the summary manifest. The summary manifest provides
     * aggregate data validation results for the training and test datasets.
     * </p>
     *
     * @return <p>
     *         The location of the summary manifest. The summary manifest
     *         provides aggregate data validation results for the training and
     *         test datasets.
     *         </p>
     */
    public GroundTruthManifest getManifestSummary() {
        return manifestSummary;
    }

    /**
     * <p>
     * The location of the summary manifest. The summary manifest provides
     * aggregate data validation results for the training and test datasets.
     * </p>
     *
     * @param manifestSummary <p>
     *            The location of the summary manifest. The summary manifest
     *            provides aggregate data validation results for the training
     *            and test datasets.
     *            </p>
     */
    public void setManifestSummary(GroundTruthManifest manifestSummary) {
        this.manifestSummary = manifestSummary;
    }

    /**
     * <p>
     * The location of the summary manifest. The summary manifest provides
     * aggregate data validation results for the training and test datasets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param manifestSummary <p>
     *            The location of the summary manifest. The summary manifest
     *            provides aggregate data validation results for the training
     *            and test datasets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectVersionDescription withManifestSummary(GroundTruthManifest manifestSummary) {
        this.manifestSummary = manifestSummary;
        return this;
    }

    /**
     * <p>
     * The identifer for the AWS Key Management Service key (AWS KMS key) that
     * was used to encrypt the model during training.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @return <p>
     *         The identifer for the AWS Key Management Service key (AWS KMS
     *         key) that was used to encrypt the model during training.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The identifer for the AWS Key Management Service key (AWS KMS key) that
     * was used to encrypt the model during training.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param kmsKeyId <p>
     *            The identifer for the AWS Key Management Service key (AWS KMS
     *            key) that was used to encrypt the model during training.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifer for the AWS Key Management Service key (AWS KMS key) that
     * was used to encrypt the model during training.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param kmsKeyId <p>
     *            The identifer for the AWS Key Management Service key (AWS KMS
     *            key) that was used to encrypt the model during training.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectVersionDescription withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
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
        if (getProjectVersionArn() != null)
            sb.append("ProjectVersionArn: " + getProjectVersionArn() + ",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: " + getCreationTimestamp() + ",");
        if (getMinInferenceUnits() != null)
            sb.append("MinInferenceUnits: " + getMinInferenceUnits() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getBillableTrainingTimeInSeconds() != null)
            sb.append("BillableTrainingTimeInSeconds: " + getBillableTrainingTimeInSeconds() + ",");
        if (getTrainingEndTimestamp() != null)
            sb.append("TrainingEndTimestamp: " + getTrainingEndTimestamp() + ",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: " + getOutputConfig() + ",");
        if (getTrainingDataResult() != null)
            sb.append("TrainingDataResult: " + getTrainingDataResult() + ",");
        if (getTestingDataResult() != null)
            sb.append("TestingDataResult: " + getTestingDataResult() + ",");
        if (getEvaluationResult() != null)
            sb.append("EvaluationResult: " + getEvaluationResult() + ",");
        if (getManifestSummary() != null)
            sb.append("ManifestSummary: " + getManifestSummary() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProjectVersionArn() == null) ? 0 : getProjectVersionArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getMinInferenceUnits() == null) ? 0 : getMinInferenceUnits().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime
                * hashCode
                + ((getBillableTrainingTimeInSeconds() == null) ? 0
                        : getBillableTrainingTimeInSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingEndTimestamp() == null) ? 0 : getTrainingEndTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingDataResult() == null) ? 0 : getTrainingDataResult().hashCode());
        hashCode = prime * hashCode
                + ((getTestingDataResult() == null) ? 0 : getTestingDataResult().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluationResult() == null) ? 0 : getEvaluationResult().hashCode());
        hashCode = prime * hashCode
                + ((getManifestSummary() == null) ? 0 : getManifestSummary().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectVersionDescription == false)
            return false;
        ProjectVersionDescription other = (ProjectVersionDescription) obj;

        if (other.getProjectVersionArn() == null ^ this.getProjectVersionArn() == null)
            return false;
        if (other.getProjectVersionArn() != null
                && other.getProjectVersionArn().equals(this.getProjectVersionArn()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null
                && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getMinInferenceUnits() == null ^ this.getMinInferenceUnits() == null)
            return false;
        if (other.getMinInferenceUnits() != null
                && other.getMinInferenceUnits().equals(this.getMinInferenceUnits()) == false)
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
        if (other.getBillableTrainingTimeInSeconds() == null
                ^ this.getBillableTrainingTimeInSeconds() == null)
            return false;
        if (other.getBillableTrainingTimeInSeconds() != null
                && other.getBillableTrainingTimeInSeconds().equals(
                        this.getBillableTrainingTimeInSeconds()) == false)
            return false;
        if (other.getTrainingEndTimestamp() == null ^ this.getTrainingEndTimestamp() == null)
            return false;
        if (other.getTrainingEndTimestamp() != null
                && other.getTrainingEndTimestamp().equals(this.getTrainingEndTimestamp()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null
                && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getTrainingDataResult() == null ^ this.getTrainingDataResult() == null)
            return false;
        if (other.getTrainingDataResult() != null
                && other.getTrainingDataResult().equals(this.getTrainingDataResult()) == false)
            return false;
        if (other.getTestingDataResult() == null ^ this.getTestingDataResult() == null)
            return false;
        if (other.getTestingDataResult() != null
                && other.getTestingDataResult().equals(this.getTestingDataResult()) == false)
            return false;
        if (other.getEvaluationResult() == null ^ this.getEvaluationResult() == null)
            return false;
        if (other.getEvaluationResult() != null
                && other.getEvaluationResult().equals(this.getEvaluationResult()) == false)
            return false;
        if (other.getManifestSummary() == null ^ this.getManifestSummary() == null)
            return false;
        if (other.getManifestSummary() != null
                && other.getManifestSummary().equals(this.getManifestSummary()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }
}
