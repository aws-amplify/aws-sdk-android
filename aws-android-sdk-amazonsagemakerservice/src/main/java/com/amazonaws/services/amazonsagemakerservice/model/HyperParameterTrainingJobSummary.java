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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies summary information about a training job.
 * </p>
 */
public class HyperParameterTrainingJobSummary implements Serializable {
    /**
     * <p>
     * The training job definition name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String trainingJobDefinitionName;

    /**
     * <p>
     * The name of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String trainingJobName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:training-job/.*<br/>
     */
    private String trainingJobArn;

    /**
     * <p>
     * The HyperParameter tuning job that launched the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String tuningJobName;

    /**
     * <p>
     * The date and time that the training job was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The date and time that the training job started.
     * </p>
     */
    private java.util.Date trainingStartTime;

    /**
     * <p>
     * Specifies the time when the training job ends on training instances. You
     * are billed for the time interval between the value of
     * <code>TrainingStartTime</code> and this time. For successful jobs and
     * stopped jobs, this is the time after model artifacts are uploaded. For
     * failed jobs, this is the time when Amazon SageMaker detects a job
     * failure.
     * </p>
     */
    private java.util.Date trainingEndTime;

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     */
    private String trainingJobStatus;

    /**
     * <p>
     * A list of the hyperparameters for which you specified ranges to search.
     * </p>
     */
    private java.util.Map<String, String> tunedHyperParameters;

    /**
     * <p>
     * The reason that the training job failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String failureReason;

    /**
     * <p>
     * The <a>FinalHyperParameterTuningJobObjectiveMetric</a> object that
     * specifies the value of the objective metric of the tuning job that
     * launched this training job.
     * </p>
     */
    private FinalHyperParameterTuningJobObjectiveMetric finalHyperParameterTuningJobObjectiveMetric;

    /**
     * <p>
     * The status of the objective metric for the training job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Succeeded: The final objective metric for the training job was evaluated
     * by the hyperparameter tuning job and used in the hyperparameter tuning
     * process.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Pending: The training job is in progress and evaluation of its final
     * objective metric is pending.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Failed: The final objective metric for the training job was not
     * evaluated, and was not used in the hyperparameter tuning process. This
     * typically occurs when the training job failed or did not emit an
     * objective metric.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Succeeded, Pending, Failed
     */
    private String objectiveStatus;

    /**
     * <p>
     * The training job definition name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The training job definition name.
     *         </p>
     */
    public String getTrainingJobDefinitionName() {
        return trainingJobDefinitionName;
    }

    /**
     * <p>
     * The training job definition name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trainingJobDefinitionName <p>
     *            The training job definition name.
     *            </p>
     */
    public void setTrainingJobDefinitionName(String trainingJobDefinitionName) {
        this.trainingJobDefinitionName = trainingJobDefinitionName;
    }

    /**
     * <p>
     * The training job definition name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trainingJobDefinitionName <p>
     *            The training job definition name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobSummary withTrainingJobDefinitionName(
            String trainingJobDefinitionName) {
        this.trainingJobDefinitionName = trainingJobDefinitionName;
        return this;
    }

    /**
     * <p>
     * The name of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the training job.
     *         </p>
     */
    public String getTrainingJobName() {
        return trainingJobName;
    }

    /**
     * <p>
     * The name of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trainingJobName <p>
     *            The name of the training job.
     *            </p>
     */
    public void setTrainingJobName(String trainingJobName) {
        this.trainingJobName = trainingJobName;
    }

    /**
     * <p>
     * The name of the training job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trainingJobName <p>
     *            The name of the training job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobSummary withTrainingJobName(String trainingJobName) {
        this.trainingJobName = trainingJobName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:training-job/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the training job.
     *         </p>
     */
    public String getTrainingJobArn() {
        return trainingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:training-job/.*<br/>
     *
     * @param trainingJobArn <p>
     *            The Amazon Resource Name (ARN) of the training job.
     *            </p>
     */
    public void setTrainingJobArn(String trainingJobArn) {
        this.trainingJobArn = trainingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:training-job/.*<br/>
     *
     * @param trainingJobArn <p>
     *            The Amazon Resource Name (ARN) of the training job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobSummary withTrainingJobArn(String trainingJobArn) {
        this.trainingJobArn = trainingJobArn;
        return this;
    }

    /**
     * <p>
     * The HyperParameter tuning job that launched the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The HyperParameter tuning job that launched the training job.
     *         </p>
     */
    public String getTuningJobName() {
        return tuningJobName;
    }

    /**
     * <p>
     * The HyperParameter tuning job that launched the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param tuningJobName <p>
     *            The HyperParameter tuning job that launched the training job.
     *            </p>
     */
    public void setTuningJobName(String tuningJobName) {
        this.tuningJobName = tuningJobName;
    }

    /**
     * <p>
     * The HyperParameter tuning job that launched the training job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param tuningJobName <p>
     *            The HyperParameter tuning job that launched the training job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobSummary withTuningJobName(String tuningJobName) {
        this.tuningJobName = tuningJobName;
        return this;
    }

    /**
     * <p>
     * The date and time that the training job was created.
     * </p>
     *
     * @return <p>
     *         The date and time that the training job was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The date and time that the training job was created.
     * </p>
     *
     * @param creationTime <p>
     *            The date and time that the training job was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the training job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The date and time that the training job was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The date and time that the training job started.
     * </p>
     *
     * @return <p>
     *         The date and time that the training job started.
     *         </p>
     */
    public java.util.Date getTrainingStartTime() {
        return trainingStartTime;
    }

    /**
     * <p>
     * The date and time that the training job started.
     * </p>
     *
     * @param trainingStartTime <p>
     *            The date and time that the training job started.
     *            </p>
     */
    public void setTrainingStartTime(java.util.Date trainingStartTime) {
        this.trainingStartTime = trainingStartTime;
    }

    /**
     * <p>
     * The date and time that the training job started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingStartTime <p>
     *            The date and time that the training job started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobSummary withTrainingStartTime(java.util.Date trainingStartTime) {
        this.trainingStartTime = trainingStartTime;
        return this;
    }

    /**
     * <p>
     * Specifies the time when the training job ends on training instances. You
     * are billed for the time interval between the value of
     * <code>TrainingStartTime</code> and this time. For successful jobs and
     * stopped jobs, this is the time after model artifacts are uploaded. For
     * failed jobs, this is the time when Amazon SageMaker detects a job
     * failure.
     * </p>
     *
     * @return <p>
     *         Specifies the time when the training job ends on training
     *         instances. You are billed for the time interval between the value
     *         of <code>TrainingStartTime</code> and this time. For successful
     *         jobs and stopped jobs, this is the time after model artifacts are
     *         uploaded. For failed jobs, this is the time when Amazon SageMaker
     *         detects a job failure.
     *         </p>
     */
    public java.util.Date getTrainingEndTime() {
        return trainingEndTime;
    }

    /**
     * <p>
     * Specifies the time when the training job ends on training instances. You
     * are billed for the time interval between the value of
     * <code>TrainingStartTime</code> and this time. For successful jobs and
     * stopped jobs, this is the time after model artifacts are uploaded. For
     * failed jobs, this is the time when Amazon SageMaker detects a job
     * failure.
     * </p>
     *
     * @param trainingEndTime <p>
     *            Specifies the time when the training job ends on training
     *            instances. You are billed for the time interval between the
     *            value of <code>TrainingStartTime</code> and this time. For
     *            successful jobs and stopped jobs, this is the time after model
     *            artifacts are uploaded. For failed jobs, this is the time when
     *            Amazon SageMaker detects a job failure.
     *            </p>
     */
    public void setTrainingEndTime(java.util.Date trainingEndTime) {
        this.trainingEndTime = trainingEndTime;
    }

    /**
     * <p>
     * Specifies the time when the training job ends on training instances. You
     * are billed for the time interval between the value of
     * <code>TrainingStartTime</code> and this time. For successful jobs and
     * stopped jobs, this is the time after model artifacts are uploaded. For
     * failed jobs, this is the time when Amazon SageMaker detects a job
     * failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingEndTime <p>
     *            Specifies the time when the training job ends on training
     *            instances. You are billed for the time interval between the
     *            value of <code>TrainingStartTime</code> and this time. For
     *            successful jobs and stopped jobs, this is the time after model
     *            artifacts are uploaded. For failed jobs, this is the time when
     *            Amazon SageMaker detects a job failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobSummary withTrainingEndTime(java.util.Date trainingEndTime) {
        this.trainingEndTime = trainingEndTime;
        return this;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @return <p>
     *         The status of the training job.
     *         </p>
     * @see TrainingJobStatus
     */
    public String getTrainingJobStatus() {
        return trainingJobStatus;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param trainingJobStatus <p>
     *            The status of the training job.
     *            </p>
     * @see TrainingJobStatus
     */
    public void setTrainingJobStatus(String trainingJobStatus) {
        this.trainingJobStatus = trainingJobStatus;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param trainingJobStatus <p>
     *            The status of the training job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingJobStatus
     */
    public HyperParameterTrainingJobSummary withTrainingJobStatus(String trainingJobStatus) {
        this.trainingJobStatus = trainingJobStatus;
        return this;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param trainingJobStatus <p>
     *            The status of the training job.
     *            </p>
     * @see TrainingJobStatus
     */
    public void setTrainingJobStatus(TrainingJobStatus trainingJobStatus) {
        this.trainingJobStatus = trainingJobStatus.toString();
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param trainingJobStatus <p>
     *            The status of the training job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingJobStatus
     */
    public HyperParameterTrainingJobSummary withTrainingJobStatus(
            TrainingJobStatus trainingJobStatus) {
        this.trainingJobStatus = trainingJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * A list of the hyperparameters for which you specified ranges to search.
     * </p>
     *
     * @return <p>
     *         A list of the hyperparameters for which you specified ranges to
     *         search.
     *         </p>
     */
    public java.util.Map<String, String> getTunedHyperParameters() {
        return tunedHyperParameters;
    }

    /**
     * <p>
     * A list of the hyperparameters for which you specified ranges to search.
     * </p>
     *
     * @param tunedHyperParameters <p>
     *            A list of the hyperparameters for which you specified ranges
     *            to search.
     *            </p>
     */
    public void setTunedHyperParameters(java.util.Map<String, String> tunedHyperParameters) {
        this.tunedHyperParameters = tunedHyperParameters;
    }

    /**
     * <p>
     * A list of the hyperparameters for which you specified ranges to search.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tunedHyperParameters <p>
     *            A list of the hyperparameters for which you specified ranges
     *            to search.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobSummary withTunedHyperParameters(
            java.util.Map<String, String> tunedHyperParameters) {
        this.tunedHyperParameters = tunedHyperParameters;
        return this;
    }

    /**
     * <p>
     * A list of the hyperparameters for which you specified ranges to search.
     * </p>
     * <p>
     * The method adds a new key-value pair into TunedHyperParameters parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into TunedHyperParameters.
     * @param value The corresponding value of the entry to be added into
     *            TunedHyperParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobSummary addTunedHyperParametersEntry(String key, String value) {
        if (null == this.tunedHyperParameters) {
            this.tunedHyperParameters = new java.util.HashMap<String, String>();
        }
        if (this.tunedHyperParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tunedHyperParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TunedHyperParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public HyperParameterTrainingJobSummary clearTunedHyperParametersEntries() {
        this.tunedHyperParameters = null;
        return this;
    }

    /**
     * <p>
     * The reason that the training job failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The reason that the training job failed.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * The reason that the training job failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            The reason that the training job failed.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason that the training job failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            The reason that the training job failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobSummary withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * The <a>FinalHyperParameterTuningJobObjectiveMetric</a> object that
     * specifies the value of the objective metric of the tuning job that
     * launched this training job.
     * </p>
     *
     * @return <p>
     *         The <a>FinalHyperParameterTuningJobObjectiveMetric</a> object
     *         that specifies the value of the objective metric of the tuning
     *         job that launched this training job.
     *         </p>
     */
    public FinalHyperParameterTuningJobObjectiveMetric getFinalHyperParameterTuningJobObjectiveMetric() {
        return finalHyperParameterTuningJobObjectiveMetric;
    }

    /**
     * <p>
     * The <a>FinalHyperParameterTuningJobObjectiveMetric</a> object that
     * specifies the value of the objective metric of the tuning job that
     * launched this training job.
     * </p>
     *
     * @param finalHyperParameterTuningJobObjectiveMetric <p>
     *            The <a>FinalHyperParameterTuningJobObjectiveMetric</a> object
     *            that specifies the value of the objective metric of the tuning
     *            job that launched this training job.
     *            </p>
     */
    public void setFinalHyperParameterTuningJobObjectiveMetric(
            FinalHyperParameterTuningJobObjectiveMetric finalHyperParameterTuningJobObjectiveMetric) {
        this.finalHyperParameterTuningJobObjectiveMetric = finalHyperParameterTuningJobObjectiveMetric;
    }

    /**
     * <p>
     * The <a>FinalHyperParameterTuningJobObjectiveMetric</a> object that
     * specifies the value of the objective metric of the tuning job that
     * launched this training job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param finalHyperParameterTuningJobObjectiveMetric <p>
     *            The <a>FinalHyperParameterTuningJobObjectiveMetric</a> object
     *            that specifies the value of the objective metric of the tuning
     *            job that launched this training job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobSummary withFinalHyperParameterTuningJobObjectiveMetric(
            FinalHyperParameterTuningJobObjectiveMetric finalHyperParameterTuningJobObjectiveMetric) {
        this.finalHyperParameterTuningJobObjectiveMetric = finalHyperParameterTuningJobObjectiveMetric;
        return this;
    }

    /**
     * <p>
     * The status of the objective metric for the training job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Succeeded: The final objective metric for the training job was evaluated
     * by the hyperparameter tuning job and used in the hyperparameter tuning
     * process.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Pending: The training job is in progress and evaluation of its final
     * objective metric is pending.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Failed: The final objective metric for the training job was not
     * evaluated, and was not used in the hyperparameter tuning process. This
     * typically occurs when the training job failed or did not emit an
     * objective metric.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Succeeded, Pending, Failed
     *
     * @return <p>
     *         The status of the objective metric for the training job:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Succeeded: The final objective metric for the training job was
     *         evaluated by the hyperparameter tuning job and used in the
     *         hyperparameter tuning process.
     *         </p>
     *         </li>
     *         </ul>
     *         <ul>
     *         <li>
     *         <p>
     *         Pending: The training job is in progress and evaluation of its
     *         final objective metric is pending.
     *         </p>
     *         </li>
     *         </ul>
     *         <ul>
     *         <li>
     *         <p>
     *         Failed: The final objective metric for the training job was not
     *         evaluated, and was not used in the hyperparameter tuning process.
     *         This typically occurs when the training job failed or did not
     *         emit an objective metric.
     *         </p>
     *         </li>
     *         </ul>
     * @see ObjectiveStatus
     */
    public String getObjectiveStatus() {
        return objectiveStatus;
    }

    /**
     * <p>
     * The status of the objective metric for the training job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Succeeded: The final objective metric for the training job was evaluated
     * by the hyperparameter tuning job and used in the hyperparameter tuning
     * process.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Pending: The training job is in progress and evaluation of its final
     * objective metric is pending.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Failed: The final objective metric for the training job was not
     * evaluated, and was not used in the hyperparameter tuning process. This
     * typically occurs when the training job failed or did not emit an
     * objective metric.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Succeeded, Pending, Failed
     *
     * @param objectiveStatus <p>
     *            The status of the objective metric for the training job:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Succeeded: The final objective metric for the training job was
     *            evaluated by the hyperparameter tuning job and used in the
     *            hyperparameter tuning process.
     *            </p>
     *            </li>
     *            </ul>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending: The training job is in progress and evaluation of its
     *            final objective metric is pending.
     *            </p>
     *            </li>
     *            </ul>
     *            <ul>
     *            <li>
     *            <p>
     *            Failed: The final objective metric for the training job was
     *            not evaluated, and was not used in the hyperparameter tuning
     *            process. This typically occurs when the training job failed or
     *            did not emit an objective metric.
     *            </p>
     *            </li>
     *            </ul>
     * @see ObjectiveStatus
     */
    public void setObjectiveStatus(String objectiveStatus) {
        this.objectiveStatus = objectiveStatus;
    }

    /**
     * <p>
     * The status of the objective metric for the training job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Succeeded: The final objective metric for the training job was evaluated
     * by the hyperparameter tuning job and used in the hyperparameter tuning
     * process.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Pending: The training job is in progress and evaluation of its final
     * objective metric is pending.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Failed: The final objective metric for the training job was not
     * evaluated, and was not used in the hyperparameter tuning process. This
     * typically occurs when the training job failed or did not emit an
     * objective metric.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Succeeded, Pending, Failed
     *
     * @param objectiveStatus <p>
     *            The status of the objective metric for the training job:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Succeeded: The final objective metric for the training job was
     *            evaluated by the hyperparameter tuning job and used in the
     *            hyperparameter tuning process.
     *            </p>
     *            </li>
     *            </ul>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending: The training job is in progress and evaluation of its
     *            final objective metric is pending.
     *            </p>
     *            </li>
     *            </ul>
     *            <ul>
     *            <li>
     *            <p>
     *            Failed: The final objective metric for the training job was
     *            not evaluated, and was not used in the hyperparameter tuning
     *            process. This typically occurs when the training job failed or
     *            did not emit an objective metric.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectiveStatus
     */
    public HyperParameterTrainingJobSummary withObjectiveStatus(String objectiveStatus) {
        this.objectiveStatus = objectiveStatus;
        return this;
    }

    /**
     * <p>
     * The status of the objective metric for the training job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Succeeded: The final objective metric for the training job was evaluated
     * by the hyperparameter tuning job and used in the hyperparameter tuning
     * process.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Pending: The training job is in progress and evaluation of its final
     * objective metric is pending.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Failed: The final objective metric for the training job was not
     * evaluated, and was not used in the hyperparameter tuning process. This
     * typically occurs when the training job failed or did not emit an
     * objective metric.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Succeeded, Pending, Failed
     *
     * @param objectiveStatus <p>
     *            The status of the objective metric for the training job:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Succeeded: The final objective metric for the training job was
     *            evaluated by the hyperparameter tuning job and used in the
     *            hyperparameter tuning process.
     *            </p>
     *            </li>
     *            </ul>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending: The training job is in progress and evaluation of its
     *            final objective metric is pending.
     *            </p>
     *            </li>
     *            </ul>
     *            <ul>
     *            <li>
     *            <p>
     *            Failed: The final objective metric for the training job was
     *            not evaluated, and was not used in the hyperparameter tuning
     *            process. This typically occurs when the training job failed or
     *            did not emit an objective metric.
     *            </p>
     *            </li>
     *            </ul>
     * @see ObjectiveStatus
     */
    public void setObjectiveStatus(ObjectiveStatus objectiveStatus) {
        this.objectiveStatus = objectiveStatus.toString();
    }

    /**
     * <p>
     * The status of the objective metric for the training job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Succeeded: The final objective metric for the training job was evaluated
     * by the hyperparameter tuning job and used in the hyperparameter tuning
     * process.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Pending: The training job is in progress and evaluation of its final
     * objective metric is pending.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Failed: The final objective metric for the training job was not
     * evaluated, and was not used in the hyperparameter tuning process. This
     * typically occurs when the training job failed or did not emit an
     * objective metric.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Succeeded, Pending, Failed
     *
     * @param objectiveStatus <p>
     *            The status of the objective metric for the training job:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Succeeded: The final objective metric for the training job was
     *            evaluated by the hyperparameter tuning job and used in the
     *            hyperparameter tuning process.
     *            </p>
     *            </li>
     *            </ul>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending: The training job is in progress and evaluation of its
     *            final objective metric is pending.
     *            </p>
     *            </li>
     *            </ul>
     *            <ul>
     *            <li>
     *            <p>
     *            Failed: The final objective metric for the training job was
     *            not evaluated, and was not used in the hyperparameter tuning
     *            process. This typically occurs when the training job failed or
     *            did not emit an objective metric.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectiveStatus
     */
    public HyperParameterTrainingJobSummary withObjectiveStatus(ObjectiveStatus objectiveStatus) {
        this.objectiveStatus = objectiveStatus.toString();
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
        if (getTrainingJobDefinitionName() != null)
            sb.append("TrainingJobDefinitionName: " + getTrainingJobDefinitionName() + ",");
        if (getTrainingJobName() != null)
            sb.append("TrainingJobName: " + getTrainingJobName() + ",");
        if (getTrainingJobArn() != null)
            sb.append("TrainingJobArn: " + getTrainingJobArn() + ",");
        if (getTuningJobName() != null)
            sb.append("TuningJobName: " + getTuningJobName() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getTrainingStartTime() != null)
            sb.append("TrainingStartTime: " + getTrainingStartTime() + ",");
        if (getTrainingEndTime() != null)
            sb.append("TrainingEndTime: " + getTrainingEndTime() + ",");
        if (getTrainingJobStatus() != null)
            sb.append("TrainingJobStatus: " + getTrainingJobStatus() + ",");
        if (getTunedHyperParameters() != null)
            sb.append("TunedHyperParameters: " + getTunedHyperParameters() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getFinalHyperParameterTuningJobObjectiveMetric() != null)
            sb.append("FinalHyperParameterTuningJobObjectiveMetric: "
                    + getFinalHyperParameterTuningJobObjectiveMetric() + ",");
        if (getObjectiveStatus() != null)
            sb.append("ObjectiveStatus: " + getObjectiveStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTrainingJobDefinitionName() == null) ? 0 : getTrainingJobDefinitionName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTrainingJobName() == null) ? 0 : getTrainingJobName().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingJobArn() == null) ? 0 : getTrainingJobArn().hashCode());
        hashCode = prime * hashCode
                + ((getTuningJobName() == null) ? 0 : getTuningJobName().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingStartTime() == null) ? 0 : getTrainingStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingEndTime() == null) ? 0 : getTrainingEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingJobStatus() == null) ? 0 : getTrainingJobStatus().hashCode());
        hashCode = prime * hashCode
                + ((getTunedHyperParameters() == null) ? 0 : getTunedHyperParameters().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime
                * hashCode
                + ((getFinalHyperParameterTuningJobObjectiveMetric() == null) ? 0
                        : getFinalHyperParameterTuningJobObjectiveMetric().hashCode());
        hashCode = prime * hashCode
                + ((getObjectiveStatus() == null) ? 0 : getObjectiveStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HyperParameterTrainingJobSummary == false)
            return false;
        HyperParameterTrainingJobSummary other = (HyperParameterTrainingJobSummary) obj;

        if (other.getTrainingJobDefinitionName() == null
                ^ this.getTrainingJobDefinitionName() == null)
            return false;
        if (other.getTrainingJobDefinitionName() != null
                && other.getTrainingJobDefinitionName().equals(this.getTrainingJobDefinitionName()) == false)
            return false;
        if (other.getTrainingJobName() == null ^ this.getTrainingJobName() == null)
            return false;
        if (other.getTrainingJobName() != null
                && other.getTrainingJobName().equals(this.getTrainingJobName()) == false)
            return false;
        if (other.getTrainingJobArn() == null ^ this.getTrainingJobArn() == null)
            return false;
        if (other.getTrainingJobArn() != null
                && other.getTrainingJobArn().equals(this.getTrainingJobArn()) == false)
            return false;
        if (other.getTuningJobName() == null ^ this.getTuningJobName() == null)
            return false;
        if (other.getTuningJobName() != null
                && other.getTuningJobName().equals(this.getTuningJobName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTrainingStartTime() == null ^ this.getTrainingStartTime() == null)
            return false;
        if (other.getTrainingStartTime() != null
                && other.getTrainingStartTime().equals(this.getTrainingStartTime()) == false)
            return false;
        if (other.getTrainingEndTime() == null ^ this.getTrainingEndTime() == null)
            return false;
        if (other.getTrainingEndTime() != null
                && other.getTrainingEndTime().equals(this.getTrainingEndTime()) == false)
            return false;
        if (other.getTrainingJobStatus() == null ^ this.getTrainingJobStatus() == null)
            return false;
        if (other.getTrainingJobStatus() != null
                && other.getTrainingJobStatus().equals(this.getTrainingJobStatus()) == false)
            return false;
        if (other.getTunedHyperParameters() == null ^ this.getTunedHyperParameters() == null)
            return false;
        if (other.getTunedHyperParameters() != null
                && other.getTunedHyperParameters().equals(this.getTunedHyperParameters()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getFinalHyperParameterTuningJobObjectiveMetric() == null
                ^ this.getFinalHyperParameterTuningJobObjectiveMetric() == null)
            return false;
        if (other.getFinalHyperParameterTuningJobObjectiveMetric() != null
                && other.getFinalHyperParameterTuningJobObjectiveMetric().equals(
                        this.getFinalHyperParameterTuningJobObjectiveMetric()) == false)
            return false;
        if (other.getObjectiveStatus() == null ^ this.getObjectiveStatus() == null)
            return false;
        if (other.getObjectiveStatus() != null
                && other.getObjectiveStatus().equals(this.getObjectiveStatus()) == false)
            return false;
        return true;
    }
}
