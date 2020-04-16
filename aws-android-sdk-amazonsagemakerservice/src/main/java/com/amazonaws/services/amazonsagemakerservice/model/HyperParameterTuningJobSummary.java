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
 * Provides summary information about a hyperparameter tuning job.
 * </p>
 */
public class HyperParameterTuningJobSummary implements Serializable {
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
     * The status of the tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     */
    private String hyperParameterTuningJobStatus;

    /**
     * <p>
     * Specifies the search strategy hyperparameter tuning uses to choose which
     * hyperparameters to use for each iteration. Currently, the only valid
     * value is Bayesian.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bayesian, Random
     */
    private String strategy;

    /**
     * <p>
     * The date and time that the tuning job was created.
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
     * The date and time that the tuning job was modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The <a>TrainingJobStatusCounters</a> object that specifies the numbers of
     * training jobs, categorized by status, that this tuning job launched.
     * </p>
     */
    private TrainingJobStatusCounters trainingJobStatusCounters;

    /**
     * <p>
     * The <a>ObjectiveStatusCounters</a> object that specifies the numbers of
     * training jobs, categorized by objective metric status, that this tuning
     * job launched.
     * </p>
     */
    private ObjectiveStatusCounters objectiveStatusCounters;

    /**
     * <p>
     * The <a>ResourceLimits</a> object that specifies the maximum number of
     * training jobs and parallel training jobs allowed for this tuning job.
     * </p>
     */
    private ResourceLimits resourceLimits;

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
    public HyperParameterTuningJobSummary withHyperParameterTuningJobName(
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
    public HyperParameterTuningJobSummary withHyperParameterTuningJobArn(
            String hyperParameterTuningJobArn) {
        this.hyperParameterTuningJobArn = hyperParameterTuningJobArn;
        return this;
    }

    /**
     * <p>
     * The status of the tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @return <p>
     *         The status of the tuning job.
     *         </p>
     * @see HyperParameterTuningJobStatus
     */
    public String getHyperParameterTuningJobStatus() {
        return hyperParameterTuningJobStatus;
    }

    /**
     * <p>
     * The status of the tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param hyperParameterTuningJobStatus <p>
     *            The status of the tuning job.
     *            </p>
     * @see HyperParameterTuningJobStatus
     */
    public void setHyperParameterTuningJobStatus(String hyperParameterTuningJobStatus) {
        this.hyperParameterTuningJobStatus = hyperParameterTuningJobStatus;
    }

    /**
     * <p>
     * The status of the tuning job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param hyperParameterTuningJobStatus <p>
     *            The status of the tuning job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HyperParameterTuningJobStatus
     */
    public HyperParameterTuningJobSummary withHyperParameterTuningJobStatus(
            String hyperParameterTuningJobStatus) {
        this.hyperParameterTuningJobStatus = hyperParameterTuningJobStatus;
        return this;
    }

    /**
     * <p>
     * The status of the tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param hyperParameterTuningJobStatus <p>
     *            The status of the tuning job.
     *            </p>
     * @see HyperParameterTuningJobStatus
     */
    public void setHyperParameterTuningJobStatus(
            HyperParameterTuningJobStatus hyperParameterTuningJobStatus) {
        this.hyperParameterTuningJobStatus = hyperParameterTuningJobStatus.toString();
    }

    /**
     * <p>
     * The status of the tuning job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param hyperParameterTuningJobStatus <p>
     *            The status of the tuning job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HyperParameterTuningJobStatus
     */
    public HyperParameterTuningJobSummary withHyperParameterTuningJobStatus(
            HyperParameterTuningJobStatus hyperParameterTuningJobStatus) {
        this.hyperParameterTuningJobStatus = hyperParameterTuningJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the search strategy hyperparameter tuning uses to choose which
     * hyperparameters to use for each iteration. Currently, the only valid
     * value is Bayesian.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bayesian, Random
     *
     * @return <p>
     *         Specifies the search strategy hyperparameter tuning uses to
     *         choose which hyperparameters to use for each iteration.
     *         Currently, the only valid value is Bayesian.
     *         </p>
     * @see HyperParameterTuningJobStrategyType
     */
    public String getStrategy() {
        return strategy;
    }

    /**
     * <p>
     * Specifies the search strategy hyperparameter tuning uses to choose which
     * hyperparameters to use for each iteration. Currently, the only valid
     * value is Bayesian.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bayesian, Random
     *
     * @param strategy <p>
     *            Specifies the search strategy hyperparameter tuning uses to
     *            choose which hyperparameters to use for each iteration.
     *            Currently, the only valid value is Bayesian.
     *            </p>
     * @see HyperParameterTuningJobStrategyType
     */
    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    /**
     * <p>
     * Specifies the search strategy hyperparameter tuning uses to choose which
     * hyperparameters to use for each iteration. Currently, the only valid
     * value is Bayesian.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bayesian, Random
     *
     * @param strategy <p>
     *            Specifies the search strategy hyperparameter tuning uses to
     *            choose which hyperparameters to use for each iteration.
     *            Currently, the only valid value is Bayesian.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HyperParameterTuningJobStrategyType
     */
    public HyperParameterTuningJobSummary withStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * <p>
     * Specifies the search strategy hyperparameter tuning uses to choose which
     * hyperparameters to use for each iteration. Currently, the only valid
     * value is Bayesian.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bayesian, Random
     *
     * @param strategy <p>
     *            Specifies the search strategy hyperparameter tuning uses to
     *            choose which hyperparameters to use for each iteration.
     *            Currently, the only valid value is Bayesian.
     *            </p>
     * @see HyperParameterTuningJobStrategyType
     */
    public void setStrategy(HyperParameterTuningJobStrategyType strategy) {
        this.strategy = strategy.toString();
    }

    /**
     * <p>
     * Specifies the search strategy hyperparameter tuning uses to choose which
     * hyperparameters to use for each iteration. Currently, the only valid
     * value is Bayesian.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bayesian, Random
     *
     * @param strategy <p>
     *            Specifies the search strategy hyperparameter tuning uses to
     *            choose which hyperparameters to use for each iteration.
     *            Currently, the only valid value is Bayesian.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HyperParameterTuningJobStrategyType
     */
    public HyperParameterTuningJobSummary withStrategy(HyperParameterTuningJobStrategyType strategy) {
        this.strategy = strategy.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the tuning job was created.
     * </p>
     *
     * @return <p>
     *         The date and time that the tuning job was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The date and time that the tuning job was created.
     * </p>
     *
     * @param creationTime <p>
     *            The date and time that the tuning job was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the tuning job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The date and time that the tuning job was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTuningJobSummary withCreationTime(java.util.Date creationTime) {
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
    public HyperParameterTuningJobSummary withHyperParameterTuningEndTime(
            java.util.Date hyperParameterTuningEndTime) {
        this.hyperParameterTuningEndTime = hyperParameterTuningEndTime;
        return this;
    }

    /**
     * <p>
     * The date and time that the tuning job was modified.
     * </p>
     *
     * @return <p>
     *         The date and time that the tuning job was modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the tuning job was modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The date and time that the tuning job was modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the tuning job was modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The date and time that the tuning job was modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTuningJobSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The <a>TrainingJobStatusCounters</a> object that specifies the numbers of
     * training jobs, categorized by status, that this tuning job launched.
     * </p>
     *
     * @return <p>
     *         The <a>TrainingJobStatusCounters</a> object that specifies the
     *         numbers of training jobs, categorized by status, that this tuning
     *         job launched.
     *         </p>
     */
    public TrainingJobStatusCounters getTrainingJobStatusCounters() {
        return trainingJobStatusCounters;
    }

    /**
     * <p>
     * The <a>TrainingJobStatusCounters</a> object that specifies the numbers of
     * training jobs, categorized by status, that this tuning job launched.
     * </p>
     *
     * @param trainingJobStatusCounters <p>
     *            The <a>TrainingJobStatusCounters</a> object that specifies the
     *            numbers of training jobs, categorized by status, that this
     *            tuning job launched.
     *            </p>
     */
    public void setTrainingJobStatusCounters(TrainingJobStatusCounters trainingJobStatusCounters) {
        this.trainingJobStatusCounters = trainingJobStatusCounters;
    }

    /**
     * <p>
     * The <a>TrainingJobStatusCounters</a> object that specifies the numbers of
     * training jobs, categorized by status, that this tuning job launched.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingJobStatusCounters <p>
     *            The <a>TrainingJobStatusCounters</a> object that specifies the
     *            numbers of training jobs, categorized by status, that this
     *            tuning job launched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTuningJobSummary withTrainingJobStatusCounters(
            TrainingJobStatusCounters trainingJobStatusCounters) {
        this.trainingJobStatusCounters = trainingJobStatusCounters;
        return this;
    }

    /**
     * <p>
     * The <a>ObjectiveStatusCounters</a> object that specifies the numbers of
     * training jobs, categorized by objective metric status, that this tuning
     * job launched.
     * </p>
     *
     * @return <p>
     *         The <a>ObjectiveStatusCounters</a> object that specifies the
     *         numbers of training jobs, categorized by objective metric status,
     *         that this tuning job launched.
     *         </p>
     */
    public ObjectiveStatusCounters getObjectiveStatusCounters() {
        return objectiveStatusCounters;
    }

    /**
     * <p>
     * The <a>ObjectiveStatusCounters</a> object that specifies the numbers of
     * training jobs, categorized by objective metric status, that this tuning
     * job launched.
     * </p>
     *
     * @param objectiveStatusCounters <p>
     *            The <a>ObjectiveStatusCounters</a> object that specifies the
     *            numbers of training jobs, categorized by objective metric
     *            status, that this tuning job launched.
     *            </p>
     */
    public void setObjectiveStatusCounters(ObjectiveStatusCounters objectiveStatusCounters) {
        this.objectiveStatusCounters = objectiveStatusCounters;
    }

    /**
     * <p>
     * The <a>ObjectiveStatusCounters</a> object that specifies the numbers of
     * training jobs, categorized by objective metric status, that this tuning
     * job launched.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param objectiveStatusCounters <p>
     *            The <a>ObjectiveStatusCounters</a> object that specifies the
     *            numbers of training jobs, categorized by objective metric
     *            status, that this tuning job launched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTuningJobSummary withObjectiveStatusCounters(
            ObjectiveStatusCounters objectiveStatusCounters) {
        this.objectiveStatusCounters = objectiveStatusCounters;
        return this;
    }

    /**
     * <p>
     * The <a>ResourceLimits</a> object that specifies the maximum number of
     * training jobs and parallel training jobs allowed for this tuning job.
     * </p>
     *
     * @return <p>
     *         The <a>ResourceLimits</a> object that specifies the maximum
     *         number of training jobs and parallel training jobs allowed for
     *         this tuning job.
     *         </p>
     */
    public ResourceLimits getResourceLimits() {
        return resourceLimits;
    }

    /**
     * <p>
     * The <a>ResourceLimits</a> object that specifies the maximum number of
     * training jobs and parallel training jobs allowed for this tuning job.
     * </p>
     *
     * @param resourceLimits <p>
     *            The <a>ResourceLimits</a> object that specifies the maximum
     *            number of training jobs and parallel training jobs allowed for
     *            this tuning job.
     *            </p>
     */
    public void setResourceLimits(ResourceLimits resourceLimits) {
        this.resourceLimits = resourceLimits;
    }

    /**
     * <p>
     * The <a>ResourceLimits</a> object that specifies the maximum number of
     * training jobs and parallel training jobs allowed for this tuning job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceLimits <p>
     *            The <a>ResourceLimits</a> object that specifies the maximum
     *            number of training jobs and parallel training jobs allowed for
     *            this tuning job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTuningJobSummary withResourceLimits(ResourceLimits resourceLimits) {
        this.resourceLimits = resourceLimits;
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
        if (getHyperParameterTuningJobStatus() != null)
            sb.append("HyperParameterTuningJobStatus: " + getHyperParameterTuningJobStatus() + ",");
        if (getStrategy() != null)
            sb.append("Strategy: " + getStrategy() + ",");
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
        if (getResourceLimits() != null)
            sb.append("ResourceLimits: " + getResourceLimits());
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
                + ((getHyperParameterTuningJobStatus() == null) ? 0
                        : getHyperParameterTuningJobStatus().hashCode());
        hashCode = prime * hashCode + ((getStrategy() == null) ? 0 : getStrategy().hashCode());
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
                + ((getResourceLimits() == null) ? 0 : getResourceLimits().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HyperParameterTuningJobSummary == false)
            return false;
        HyperParameterTuningJobSummary other = (HyperParameterTuningJobSummary) obj;

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
        if (other.getHyperParameterTuningJobStatus() == null
                ^ this.getHyperParameterTuningJobStatus() == null)
            return false;
        if (other.getHyperParameterTuningJobStatus() != null
                && other.getHyperParameterTuningJobStatus().equals(
                        this.getHyperParameterTuningJobStatus()) == false)
            return false;
        if (other.getStrategy() == null ^ this.getStrategy() == null)
            return false;
        if (other.getStrategy() != null && other.getStrategy().equals(this.getStrategy()) == false)
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
        if (other.getResourceLimits() == null ^ this.getResourceLimits() == null)
            return false;
        if (other.getResourceLimits() != null
                && other.getResourceLimits().equals(this.getResourceLimits()) == false)
            return false;
        return true;
    }
}
