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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

public class DescribeHyperParameterTuningJobResult implements Serializable {
    /**
     * <p>
     * The name of the tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String hyperParameterTuningJobName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:hyper-parameter
     * -tuning-job/.*<br/>
     */
    private String hyperParameterTuningJobArn;

    /**
     * <p>
     * The <a>HyperParameterTuningJobConfig</a> object that specifies the
     * configuration of the tuning job.
     * </p>
     */
    private HyperParameterTuningJobConfig hyperParameterTuningJobConfig;

    /**
     * <p>
     * The <a>HyperParameterTrainingJobDefinition</a> object that specifies the
     * definition of the training jobs that this tuning job launches.
     * </p>
     */
    private HyperParameterTrainingJobDefinition trainingJobDefinition;

    /**
     * <p/>
     */
    private java.util.List<HyperParameterTrainingJobDefinition> trainingJobDefinitions;

    /**
     * <p>
     * The status of the tuning job: InProgress, Completed, Failed, Stopping, or
     * Stopped.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     */
    private String hyperParameterTuningJobStatus;

    /**
     * <p>
     * The date and time that the tuning job started.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The date and time that the tuning job ended.
     * </p>
     */
    private java.util.Date hyperParameterTuningEndTime;

    /**
     * <p>
     * The date and time that the status of the tuning job was modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The <a>TrainingJobStatusCounters</a> object that specifies the number of
     * training jobs, categorized by status, that this tuning job launched.
     * </p>
     */
    private TrainingJobStatusCounters trainingJobStatusCounters;

    /**
     * <p>
     * The <a>ObjectiveStatusCounters</a> object that specifies the number of
     * training jobs, categorized by the status of their final objective metric,
     * that this tuning job launched.
     * </p>
     */
    private ObjectiveStatusCounters objectiveStatusCounters;

    /**
     * <p>
     * A <a>TrainingJobSummary</a> object that describes the training job that
     * completed with the best current <a>HyperParameterTuningJobObjective</a>.
     * </p>
     */
    private HyperParameterTrainingJobSummary bestTrainingJob;

    /**
     * <p>
     * If the hyperparameter tuning job is an warm start tuning job with a
     * <code>WarmStartType</code> of <code>IDENTICAL_DATA_AND_ALGORITHM</code>,
     * this is the <a>TrainingJobSummary</a> for the training job with the best
     * objective metric value of all training jobs launched by this tuning job
     * and all parent jobs specified for the warm start tuning job.
     * </p>
     */
    private HyperParameterTrainingJobSummary overallBestTrainingJob;

    /**
     * <p>
     * The configuration for starting the hyperparameter parameter tuning job
     * using one or more previous tuning jobs as a starting point. The results
     * of previous tuning jobs are used to inform which combinations of
     * hyperparameters to search over in the new tuning job.
     * </p>
     */
    private HyperParameterTuningJobWarmStartConfig warmStartConfig;

    /**
     * <p>
     * If the tuning job failed, the reason it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the tuning job.
     *         </p>
     */
    public String getHyperParameterTuningJobName() {
        return hyperParameterTuningJobName;
    }

    /**
     * <p>
     * The name of the tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param hyperParameterTuningJobName <p>
     *            The name of the tuning job.
     *            </p>
     */
    public void setHyperParameterTuningJobName(String hyperParameterTuningJobName) {
        this.hyperParameterTuningJobName = hyperParameterTuningJobName;
    }

    /**
     * <p>
     * The name of the tuning job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param hyperParameterTuningJobName <p>
     *            The name of the tuning job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHyperParameterTuningJobResult withHyperParameterTuningJobName(
            String hyperParameterTuningJobName) {
        this.hyperParameterTuningJobName = hyperParameterTuningJobName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:hyper-parameter
     * -tuning-job/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the tuning job.
     *         </p>
     */
    public String getHyperParameterTuningJobArn() {
        return hyperParameterTuningJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:hyper-parameter
     * -tuning-job/.*<br/>
     *
     * @param hyperParameterTuningJobArn <p>
     *            The Amazon Resource Name (ARN) of the tuning job.
     *            </p>
     */
    public void setHyperParameterTuningJobArn(String hyperParameterTuningJobArn) {
        this.hyperParameterTuningJobArn = hyperParameterTuningJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tuning job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:hyper-parameter
     * -tuning-job/.*<br/>
     *
     * @param hyperParameterTuningJobArn <p>
     *            The Amazon Resource Name (ARN) of the tuning job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHyperParameterTuningJobResult withHyperParameterTuningJobArn(
            String hyperParameterTuningJobArn) {
        this.hyperParameterTuningJobArn = hyperParameterTuningJobArn;
        return this;
    }

    /**
     * <p>
     * The <a>HyperParameterTuningJobConfig</a> object that specifies the
     * configuration of the tuning job.
     * </p>
     *
     * @return <p>
     *         The <a>HyperParameterTuningJobConfig</a> object that specifies
     *         the configuration of the tuning job.
     *         </p>
     */
    public HyperParameterTuningJobConfig getHyperParameterTuningJobConfig() {
        return hyperParameterTuningJobConfig;
    }

    /**
     * <p>
     * The <a>HyperParameterTuningJobConfig</a> object that specifies the
     * configuration of the tuning job.
     * </p>
     *
     * @param hyperParameterTuningJobConfig <p>
     *            The <a>HyperParameterTuningJobConfig</a> object that specifies
     *            the configuration of the tuning job.
     *            </p>
     */
    public void setHyperParameterTuningJobConfig(
            HyperParameterTuningJobConfig hyperParameterTuningJobConfig) {
        this.hyperParameterTuningJobConfig = hyperParameterTuningJobConfig;
    }

    /**
     * <p>
     * The <a>HyperParameterTuningJobConfig</a> object that specifies the
     * configuration of the tuning job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hyperParameterTuningJobConfig <p>
     *            The <a>HyperParameterTuningJobConfig</a> object that specifies
     *            the configuration of the tuning job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHyperParameterTuningJobResult withHyperParameterTuningJobConfig(
            HyperParameterTuningJobConfig hyperParameterTuningJobConfig) {
        this.hyperParameterTuningJobConfig = hyperParameterTuningJobConfig;
        return this;
    }

    /**
     * <p>
     * The <a>HyperParameterTrainingJobDefinition</a> object that specifies the
     * definition of the training jobs that this tuning job launches.
     * </p>
     *
     * @return <p>
     *         The <a>HyperParameterTrainingJobDefinition</a> object that
     *         specifies the definition of the training jobs that this tuning
     *         job launches.
     *         </p>
     */
    public HyperParameterTrainingJobDefinition getTrainingJobDefinition() {
        return trainingJobDefinition;
    }

    /**
     * <p>
     * The <a>HyperParameterTrainingJobDefinition</a> object that specifies the
     * definition of the training jobs that this tuning job launches.
     * </p>
     *
     * @param trainingJobDefinition <p>
     *            The <a>HyperParameterTrainingJobDefinition</a> object that
     *            specifies the definition of the training jobs that this tuning
     *            job launches.
     *            </p>
     */
    public void setTrainingJobDefinition(HyperParameterTrainingJobDefinition trainingJobDefinition) {
        this.trainingJobDefinition = trainingJobDefinition;
    }

    /**
     * <p>
     * The <a>HyperParameterTrainingJobDefinition</a> object that specifies the
     * definition of the training jobs that this tuning job launches.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingJobDefinition <p>
     *            The <a>HyperParameterTrainingJobDefinition</a> object that
     *            specifies the definition of the training jobs that this tuning
     *            job launches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHyperParameterTuningJobResult withTrainingJobDefinition(
            HyperParameterTrainingJobDefinition trainingJobDefinition) {
        this.trainingJobDefinition = trainingJobDefinition;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public java.util.List<HyperParameterTrainingJobDefinition> getTrainingJobDefinitions() {
        return trainingJobDefinitions;
    }

    /**
     * <p/>
     *
     * @param trainingJobDefinitions <p/>
     */
    public void setTrainingJobDefinitions(
            java.util.Collection<HyperParameterTrainingJobDefinition> trainingJobDefinitions) {
        if (trainingJobDefinitions == null) {
            this.trainingJobDefinitions = null;
            return;
        }

        this.trainingJobDefinitions = new java.util.ArrayList<HyperParameterTrainingJobDefinition>(
                trainingJobDefinitions);
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingJobDefinitions <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHyperParameterTuningJobResult withTrainingJobDefinitions(
            HyperParameterTrainingJobDefinition... trainingJobDefinitions) {
        if (getTrainingJobDefinitions() == null) {
            this.trainingJobDefinitions = new java.util.ArrayList<HyperParameterTrainingJobDefinition>(
                    trainingJobDefinitions.length);
        }
        for (HyperParameterTrainingJobDefinition value : trainingJobDefinitions) {
            this.trainingJobDefinitions.add(value);
        }
        return this;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingJobDefinitions <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHyperParameterTuningJobResult withTrainingJobDefinitions(
            java.util.Collection<HyperParameterTrainingJobDefinition> trainingJobDefinitions) {
        setTrainingJobDefinitions(trainingJobDefinitions);
        return this;
    }

    /**
     * <p>
     * The status of the tuning job: InProgress, Completed, Failed, Stopping, or
     * Stopped.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @return <p>
     *         The status of the tuning job: InProgress, Completed, Failed,
     *         Stopping, or Stopped.
     *         </p>
     * @see HyperParameterTuningJobStatus
     */
    public String getHyperParameterTuningJobStatus() {
        return hyperParameterTuningJobStatus;
    }

    /**
     * <p>
     * The status of the tuning job: InProgress, Completed, Failed, Stopping, or
     * Stopped.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param hyperParameterTuningJobStatus <p>
     *            The status of the tuning job: InProgress, Completed, Failed,
     *            Stopping, or Stopped.
     *            </p>
     * @see HyperParameterTuningJobStatus
     */
    public void setHyperParameterTuningJobStatus(String hyperParameterTuningJobStatus) {
        this.hyperParameterTuningJobStatus = hyperParameterTuningJobStatus;
    }

    /**
     * <p>
     * The status of the tuning job: InProgress, Completed, Failed, Stopping, or
     * Stopped.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param hyperParameterTuningJobStatus <p>
     *            The status of the tuning job: InProgress, Completed, Failed,
     *            Stopping, or Stopped.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HyperParameterTuningJobStatus
     */
    public DescribeHyperParameterTuningJobResult withHyperParameterTuningJobStatus(
            String hyperParameterTuningJobStatus) {
        this.hyperParameterTuningJobStatus = hyperParameterTuningJobStatus;
        return this;
    }

    /**
     * <p>
     * The status of the tuning job: InProgress, Completed, Failed, Stopping, or
     * Stopped.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param hyperParameterTuningJobStatus <p>
     *            The status of the tuning job: InProgress, Completed, Failed,
     *            Stopping, or Stopped.
     *            </p>
     * @see HyperParameterTuningJobStatus
     */
    public void setHyperParameterTuningJobStatus(
            HyperParameterTuningJobStatus hyperParameterTuningJobStatus) {
        this.hyperParameterTuningJobStatus = hyperParameterTuningJobStatus.toString();
    }

    /**
     * <p>
     * The status of the tuning job: InProgress, Completed, Failed, Stopping, or
     * Stopped.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param hyperParameterTuningJobStatus <p>
     *            The status of the tuning job: InProgress, Completed, Failed,
     *            Stopping, or Stopped.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HyperParameterTuningJobStatus
     */
    public DescribeHyperParameterTuningJobResult withHyperParameterTuningJobStatus(
            HyperParameterTuningJobStatus hyperParameterTuningJobStatus) {
        this.hyperParameterTuningJobStatus = hyperParameterTuningJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the tuning job started.
     * </p>
     *
     * @return <p>
     *         The date and time that the tuning job started.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The date and time that the tuning job started.
     * </p>
     *
     * @param creationTime <p>
     *            The date and time that the tuning job started.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the tuning job started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The date and time that the tuning job started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHyperParameterTuningJobResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The date and time that the tuning job ended.
     * </p>
     *
     * @return <p>
     *         The date and time that the tuning job ended.
     *         </p>
     */
    public java.util.Date getHyperParameterTuningEndTime() {
        return hyperParameterTuningEndTime;
    }

    /**
     * <p>
     * The date and time that the tuning job ended.
     * </p>
     *
     * @param hyperParameterTuningEndTime <p>
     *            The date and time that the tuning job ended.
     *            </p>
     */
    public void setHyperParameterTuningEndTime(java.util.Date hyperParameterTuningEndTime) {
        this.hyperParameterTuningEndTime = hyperParameterTuningEndTime;
    }

    /**
     * <p>
     * The date and time that the tuning job ended.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hyperParameterTuningEndTime <p>
     *            The date and time that the tuning job ended.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHyperParameterTuningJobResult withHyperParameterTuningEndTime(
            java.util.Date hyperParameterTuningEndTime) {
        this.hyperParameterTuningEndTime = hyperParameterTuningEndTime;
        return this;
    }

    /**
     * <p>
     * The date and time that the status of the tuning job was modified.
     * </p>
     *
     * @return <p>
     *         The date and time that the status of the tuning job was modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the status of the tuning job was modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The date and time that the status of the tuning job was
     *            modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the status of the tuning job was modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The date and time that the status of the tuning job was
     *            modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHyperParameterTuningJobResult withLastModifiedTime(
            java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The <a>TrainingJobStatusCounters</a> object that specifies the number of
     * training jobs, categorized by status, that this tuning job launched.
     * </p>
     *
     * @return <p>
     *         The <a>TrainingJobStatusCounters</a> object that specifies the
     *         number of training jobs, categorized by status, that this tuning
     *         job launched.
     *         </p>
     */
    public TrainingJobStatusCounters getTrainingJobStatusCounters() {
        return trainingJobStatusCounters;
    }

    /**
     * <p>
     * The <a>TrainingJobStatusCounters</a> object that specifies the number of
     * training jobs, categorized by status, that this tuning job launched.
     * </p>
     *
     * @param trainingJobStatusCounters <p>
     *            The <a>TrainingJobStatusCounters</a> object that specifies the
     *            number of training jobs, categorized by status, that this
     *            tuning job launched.
     *            </p>
     */
    public void setTrainingJobStatusCounters(TrainingJobStatusCounters trainingJobStatusCounters) {
        this.trainingJobStatusCounters = trainingJobStatusCounters;
    }

    /**
     * <p>
     * The <a>TrainingJobStatusCounters</a> object that specifies the number of
     * training jobs, categorized by status, that this tuning job launched.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingJobStatusCounters <p>
     *            The <a>TrainingJobStatusCounters</a> object that specifies the
     *            number of training jobs, categorized by status, that this
     *            tuning job launched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHyperParameterTuningJobResult withTrainingJobStatusCounters(
            TrainingJobStatusCounters trainingJobStatusCounters) {
        this.trainingJobStatusCounters = trainingJobStatusCounters;
        return this;
    }

    /**
     * <p>
     * The <a>ObjectiveStatusCounters</a> object that specifies the number of
     * training jobs, categorized by the status of their final objective metric,
     * that this tuning job launched.
     * </p>
     *
     * @return <p>
     *         The <a>ObjectiveStatusCounters</a> object that specifies the
     *         number of training jobs, categorized by the status of their final
     *         objective metric, that this tuning job launched.
     *         </p>
     */
    public ObjectiveStatusCounters getObjectiveStatusCounters() {
        return objectiveStatusCounters;
    }

    /**
     * <p>
     * The <a>ObjectiveStatusCounters</a> object that specifies the number of
     * training jobs, categorized by the status of their final objective metric,
     * that this tuning job launched.
     * </p>
     *
     * @param objectiveStatusCounters <p>
     *            The <a>ObjectiveStatusCounters</a> object that specifies the
     *            number of training jobs, categorized by the status of their
     *            final objective metric, that this tuning job launched.
     *            </p>
     */
    public void setObjectiveStatusCounters(ObjectiveStatusCounters objectiveStatusCounters) {
        this.objectiveStatusCounters = objectiveStatusCounters;
    }

    /**
     * <p>
     * The <a>ObjectiveStatusCounters</a> object that specifies the number of
     * training jobs, categorized by the status of their final objective metric,
     * that this tuning job launched.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param objectiveStatusCounters <p>
     *            The <a>ObjectiveStatusCounters</a> object that specifies the
     *            number of training jobs, categorized by the status of their
     *            final objective metric, that this tuning job launched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHyperParameterTuningJobResult withObjectiveStatusCounters(
            ObjectiveStatusCounters objectiveStatusCounters) {
        this.objectiveStatusCounters = objectiveStatusCounters;
        return this;
    }

    /**
     * <p>
     * A <a>TrainingJobSummary</a> object that describes the training job that
     * completed with the best current <a>HyperParameterTuningJobObjective</a>.
     * </p>
     *
     * @return <p>
     *         A <a>TrainingJobSummary</a> object that describes the training
     *         job that completed with the best current
     *         <a>HyperParameterTuningJobObjective</a>.
     *         </p>
     */
    public HyperParameterTrainingJobSummary getBestTrainingJob() {
        return bestTrainingJob;
    }

    /**
     * <p>
     * A <a>TrainingJobSummary</a> object that describes the training job that
     * completed with the best current <a>HyperParameterTuningJobObjective</a>.
     * </p>
     *
     * @param bestTrainingJob <p>
     *            A <a>TrainingJobSummary</a> object that describes the training
     *            job that completed with the best current
     *            <a>HyperParameterTuningJobObjective</a>.
     *            </p>
     */
    public void setBestTrainingJob(HyperParameterTrainingJobSummary bestTrainingJob) {
        this.bestTrainingJob = bestTrainingJob;
    }

    /**
     * <p>
     * A <a>TrainingJobSummary</a> object that describes the training job that
     * completed with the best current <a>HyperParameterTuningJobObjective</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bestTrainingJob <p>
     *            A <a>TrainingJobSummary</a> object that describes the training
     *            job that completed with the best current
     *            <a>HyperParameterTuningJobObjective</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHyperParameterTuningJobResult withBestTrainingJob(
            HyperParameterTrainingJobSummary bestTrainingJob) {
        this.bestTrainingJob = bestTrainingJob;
        return this;
    }

    /**
     * <p>
     * If the hyperparameter tuning job is an warm start tuning job with a
     * <code>WarmStartType</code> of <code>IDENTICAL_DATA_AND_ALGORITHM</code>,
     * this is the <a>TrainingJobSummary</a> for the training job with the best
     * objective metric value of all training jobs launched by this tuning job
     * and all parent jobs specified for the warm start tuning job.
     * </p>
     *
     * @return <p>
     *         If the hyperparameter tuning job is an warm start tuning job with
     *         a <code>WarmStartType</code> of
     *         <code>IDENTICAL_DATA_AND_ALGORITHM</code>, this is the
     *         <a>TrainingJobSummary</a> for the training job with the best
     *         objective metric value of all training jobs launched by this
     *         tuning job and all parent jobs specified for the warm start
     *         tuning job.
     *         </p>
     */
    public HyperParameterTrainingJobSummary getOverallBestTrainingJob() {
        return overallBestTrainingJob;
    }

    /**
     * <p>
     * If the hyperparameter tuning job is an warm start tuning job with a
     * <code>WarmStartType</code> of <code>IDENTICAL_DATA_AND_ALGORITHM</code>,
     * this is the <a>TrainingJobSummary</a> for the training job with the best
     * objective metric value of all training jobs launched by this tuning job
     * and all parent jobs specified for the warm start tuning job.
     * </p>
     *
     * @param overallBestTrainingJob <p>
     *            If the hyperparameter tuning job is an warm start tuning job
     *            with a <code>WarmStartType</code> of
     *            <code>IDENTICAL_DATA_AND_ALGORITHM</code>, this is the
     *            <a>TrainingJobSummary</a> for the training job with the best
     *            objective metric value of all training jobs launched by this
     *            tuning job and all parent jobs specified for the warm start
     *            tuning job.
     *            </p>
     */
    public void setOverallBestTrainingJob(HyperParameterTrainingJobSummary overallBestTrainingJob) {
        this.overallBestTrainingJob = overallBestTrainingJob;
    }

    /**
     * <p>
     * If the hyperparameter tuning job is an warm start tuning job with a
     * <code>WarmStartType</code> of <code>IDENTICAL_DATA_AND_ALGORITHM</code>,
     * this is the <a>TrainingJobSummary</a> for the training job with the best
     * objective metric value of all training jobs launched by this tuning job
     * and all parent jobs specified for the warm start tuning job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param overallBestTrainingJob <p>
     *            If the hyperparameter tuning job is an warm start tuning job
     *            with a <code>WarmStartType</code> of
     *            <code>IDENTICAL_DATA_AND_ALGORITHM</code>, this is the
     *            <a>TrainingJobSummary</a> for the training job with the best
     *            objective metric value of all training jobs launched by this
     *            tuning job and all parent jobs specified for the warm start
     *            tuning job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHyperParameterTuningJobResult withOverallBestTrainingJob(
            HyperParameterTrainingJobSummary overallBestTrainingJob) {
        this.overallBestTrainingJob = overallBestTrainingJob;
        return this;
    }

    /**
     * <p>
     * The configuration for starting the hyperparameter parameter tuning job
     * using one or more previous tuning jobs as a starting point. The results
     * of previous tuning jobs are used to inform which combinations of
     * hyperparameters to search over in the new tuning job.
     * </p>
     *
     * @return <p>
     *         The configuration for starting the hyperparameter parameter
     *         tuning job using one or more previous tuning jobs as a starting
     *         point. The results of previous tuning jobs are used to inform
     *         which combinations of hyperparameters to search over in the new
     *         tuning job.
     *         </p>
     */
    public HyperParameterTuningJobWarmStartConfig getWarmStartConfig() {
        return warmStartConfig;
    }

    /**
     * <p>
     * The configuration for starting the hyperparameter parameter tuning job
     * using one or more previous tuning jobs as a starting point. The results
     * of previous tuning jobs are used to inform which combinations of
     * hyperparameters to search over in the new tuning job.
     * </p>
     *
     * @param warmStartConfig <p>
     *            The configuration for starting the hyperparameter parameter
     *            tuning job using one or more previous tuning jobs as a
     *            starting point. The results of previous tuning jobs are used
     *            to inform which combinations of hyperparameters to search over
     *            in the new tuning job.
     *            </p>
     */
    public void setWarmStartConfig(HyperParameterTuningJobWarmStartConfig warmStartConfig) {
        this.warmStartConfig = warmStartConfig;
    }

    /**
     * <p>
     * The configuration for starting the hyperparameter parameter tuning job
     * using one or more previous tuning jobs as a starting point. The results
     * of previous tuning jobs are used to inform which combinations of
     * hyperparameters to search over in the new tuning job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param warmStartConfig <p>
     *            The configuration for starting the hyperparameter parameter
     *            tuning job using one or more previous tuning jobs as a
     *            starting point. The results of previous tuning jobs are used
     *            to inform which combinations of hyperparameters to search over
     *            in the new tuning job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHyperParameterTuningJobResult withWarmStartConfig(
            HyperParameterTuningJobWarmStartConfig warmStartConfig) {
        this.warmStartConfig = warmStartConfig;
        return this;
    }

    /**
     * <p>
     * If the tuning job failed, the reason it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         If the tuning job failed, the reason it failed.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If the tuning job failed, the reason it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            If the tuning job failed, the reason it failed.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the tuning job failed, the reason it failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            If the tuning job failed, the reason it failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHyperParameterTuningJobResult withFailureReason(String failureReason) {
        this.failureReason = failureReason;
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
        if (getHyperParameterTuningJobName() != null)
            sb.append("HyperParameterTuningJobName: " + getHyperParameterTuningJobName() + ",");
        if (getHyperParameterTuningJobArn() != null)
            sb.append("HyperParameterTuningJobArn: " + getHyperParameterTuningJobArn() + ",");
        if (getHyperParameterTuningJobConfig() != null)
            sb.append("HyperParameterTuningJobConfig: " + getHyperParameterTuningJobConfig() + ",");
        if (getTrainingJobDefinition() != null)
            sb.append("TrainingJobDefinition: " + getTrainingJobDefinition() + ",");
        if (getTrainingJobDefinitions() != null)
            sb.append("TrainingJobDefinitions: " + getTrainingJobDefinitions() + ",");
        if (getHyperParameterTuningJobStatus() != null)
            sb.append("HyperParameterTuningJobStatus: " + getHyperParameterTuningJobStatus() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getHyperParameterTuningEndTime() != null)
            sb.append("HyperParameterTuningEndTime: " + getHyperParameterTuningEndTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getTrainingJobStatusCounters() != null)
            sb.append("TrainingJobStatusCounters: " + getTrainingJobStatusCounters() + ",");
        if (getObjectiveStatusCounters() != null)
            sb.append("ObjectiveStatusCounters: " + getObjectiveStatusCounters() + ",");
        if (getBestTrainingJob() != null)
            sb.append("BestTrainingJob: " + getBestTrainingJob() + ",");
        if (getOverallBestTrainingJob() != null)
            sb.append("OverallBestTrainingJob: " + getOverallBestTrainingJob() + ",");
        if (getWarmStartConfig() != null)
            sb.append("WarmStartConfig: " + getWarmStartConfig() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHyperParameterTuningJobName() == null) ? 0
                        : getHyperParameterTuningJobName().hashCode());
        hashCode = prime
                * hashCode
                + ((getHyperParameterTuningJobArn() == null) ? 0 : getHyperParameterTuningJobArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getHyperParameterTuningJobConfig() == null) ? 0
                        : getHyperParameterTuningJobConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrainingJobDefinition() == null) ? 0 : getTrainingJobDefinition().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrainingJobDefinitions() == null) ? 0 : getTrainingJobDefinitions()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getHyperParameterTuningJobStatus() == null) ? 0
                        : getHyperParameterTuningJobStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getHyperParameterTuningEndTime() == null) ? 0
                        : getHyperParameterTuningEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrainingJobStatusCounters() == null) ? 0 : getTrainingJobStatusCounters()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getObjectiveStatusCounters() == null) ? 0 : getObjectiveStatusCounters()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getBestTrainingJob() == null) ? 0 : getBestTrainingJob().hashCode());
        hashCode = prime
                * hashCode
                + ((getOverallBestTrainingJob() == null) ? 0 : getOverallBestTrainingJob()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getWarmStartConfig() == null) ? 0 : getWarmStartConfig().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHyperParameterTuningJobResult == false)
            return false;
        DescribeHyperParameterTuningJobResult other = (DescribeHyperParameterTuningJobResult) obj;

        if (other.getHyperParameterTuningJobName() == null
                ^ this.getHyperParameterTuningJobName() == null)
            return false;
        if (other.getHyperParameterTuningJobName() != null
                && other.getHyperParameterTuningJobName().equals(
                        this.getHyperParameterTuningJobName()) == false)
            return false;
        if (other.getHyperParameterTuningJobArn() == null
                ^ this.getHyperParameterTuningJobArn() == null)
            return false;
        if (other.getHyperParameterTuningJobArn() != null
                && other.getHyperParameterTuningJobArn().equals(
                        this.getHyperParameterTuningJobArn()) == false)
            return false;
        if (other.getHyperParameterTuningJobConfig() == null
                ^ this.getHyperParameterTuningJobConfig() == null)
            return false;
        if (other.getHyperParameterTuningJobConfig() != null
                && other.getHyperParameterTuningJobConfig().equals(
                        this.getHyperParameterTuningJobConfig()) == false)
            return false;
        if (other.getTrainingJobDefinition() == null ^ this.getTrainingJobDefinition() == null)
            return false;
        if (other.getTrainingJobDefinition() != null
                && other.getTrainingJobDefinition().equals(this.getTrainingJobDefinition()) == false)
            return false;
        if (other.getTrainingJobDefinitions() == null ^ this.getTrainingJobDefinitions() == null)
            return false;
        if (other.getTrainingJobDefinitions() != null
                && other.getTrainingJobDefinitions().equals(this.getTrainingJobDefinitions()) == false)
            return false;
        if (other.getHyperParameterTuningJobStatus() == null
                ^ this.getHyperParameterTuningJobStatus() == null)
            return false;
        if (other.getHyperParameterTuningJobStatus() != null
                && other.getHyperParameterTuningJobStatus().equals(
                        this.getHyperParameterTuningJobStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getHyperParameterTuningEndTime() == null
                ^ this.getHyperParameterTuningEndTime() == null)
            return false;
        if (other.getHyperParameterTuningEndTime() != null
                && other.getHyperParameterTuningEndTime().equals(
                        this.getHyperParameterTuningEndTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getTrainingJobStatusCounters() == null
                ^ this.getTrainingJobStatusCounters() == null)
            return false;
        if (other.getTrainingJobStatusCounters() != null
                && other.getTrainingJobStatusCounters().equals(this.getTrainingJobStatusCounters()) == false)
            return false;
        if (other.getObjectiveStatusCounters() == null ^ this.getObjectiveStatusCounters() == null)
            return false;
        if (other.getObjectiveStatusCounters() != null
                && other.getObjectiveStatusCounters().equals(this.getObjectiveStatusCounters()) == false)
            return false;
        if (other.getBestTrainingJob() == null ^ this.getBestTrainingJob() == null)
            return false;
        if (other.getBestTrainingJob() != null
                && other.getBestTrainingJob().equals(this.getBestTrainingJob()) == false)
            return false;
        if (other.getOverallBestTrainingJob() == null ^ this.getOverallBestTrainingJob() == null)
            return false;
        if (other.getOverallBestTrainingJob() != null
                && other.getOverallBestTrainingJob().equals(this.getOverallBestTrainingJob()) == false)
            return false;
        if (other.getWarmStartConfig() == null ^ this.getWarmStartConfig() == null)
            return false;
        if (other.getWarmStartConfig() != null
                && other.getWarmStartConfig().equals(this.getWarmStartConfig()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }
}
