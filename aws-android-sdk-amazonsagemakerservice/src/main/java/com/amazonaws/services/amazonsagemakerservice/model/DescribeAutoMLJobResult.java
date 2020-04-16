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

public class DescribeAutoMLJobResult implements Serializable {
    /**
     * <p>
     * Returns the name of a job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String autoMLJobName;

    /**
     * <p>
     * Returns the job's ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:automl-job/.*<br/>
     */
    private String autoMLJobArn;

    /**
     * <p>
     * Returns the job's input data config.
     * </p>
     */
    private java.util.List<AutoMLChannel> inputDataConfig;

    /**
     * <p>
     * Returns the job's output data config.
     * </p>
     */
    private AutoMLOutputDataConfig outputDataConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that has read permission to the input data location and write
     * permission to the output data location in Amazon S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     */
    private String roleArn;

    /**
     * <p>
     * Returns the job's objective.
     * </p>
     */
    private AutoMLJobObjective autoMLJobObjective;

    /**
     * <p>
     * Returns the job's problem type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BinaryClassification, MulticlassClassification,
     * Regression
     */
    private String problemType;

    /**
     * <p>
     * Returns the job's config.
     * </p>
     */
    private AutoMLJobConfig autoMLJobConfig;

    /**
     * <p>
     * Returns the job's creation time.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Returns the job's end time.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * Returns the job's last modified time.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * Returns the job's FailureReason.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String failureReason;

    /**
     * <p>
     * Returns the job's BestCandidate.
     * </p>
     */
    private AutoMLCandidate bestCandidate;

    /**
     * <p>
     * Returns the job's AutoMLJobStatus.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     */
    private String autoMLJobStatus;

    /**
     * <p>
     * Returns the job's AutoMLJobSecondaryStatus.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, AnalyzingData, FeatureEngineering,
     * ModelTuning, MaxCandidatesReached, Failed, Stopped,
     * MaxAutoMLJobRuntimeReached, Stopping, CandidateDefinitionsGenerated
     */
    private String autoMLJobSecondaryStatus;

    /**
     * <p>
     * Returns the job's output from GenerateCandidateDefinitionsOnly.
     * </p>
     */
    private Boolean generateCandidateDefinitionsOnly;

    /**
     * <p>
     * Returns information on the job's artifacts found in AutoMLJobArtifacts.
     * </p>
     */
    private AutoMLJobArtifacts autoMLJobArtifacts;

    /**
     * <p>
     * This contains ProblemType, AutoMLJobObjective and CompletionCriteria.
     * They're auto-inferred values, if not provided by you. If you do provide
     * them, then they'll be the same as provided.
     * </p>
     */
    private ResolvedAttributes resolvedAttributes;

    /**
     * <p>
     * Returns the name of a job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         Returns the name of a job.
     *         </p>
     */
    public String getAutoMLJobName() {
        return autoMLJobName;
    }

    /**
     * <p>
     * Returns the name of a job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param autoMLJobName <p>
     *            Returns the name of a job.
     *            </p>
     */
    public void setAutoMLJobName(String autoMLJobName) {
        this.autoMLJobName = autoMLJobName;
    }

    /**
     * <p>
     * Returns the name of a job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param autoMLJobName <p>
     *            Returns the name of a job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutoMLJobResult withAutoMLJobName(String autoMLJobName) {
        this.autoMLJobName = autoMLJobName;
        return this;
    }

    /**
     * <p>
     * Returns the job's ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:automl-job/.*<br/>
     *
     * @return <p>
     *         Returns the job's ARN.
     *         </p>
     */
    public String getAutoMLJobArn() {
        return autoMLJobArn;
    }

    /**
     * <p>
     * Returns the job's ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:automl-job/.*<br/>
     *
     * @param autoMLJobArn <p>
     *            Returns the job's ARN.
     *            </p>
     */
    public void setAutoMLJobArn(String autoMLJobArn) {
        this.autoMLJobArn = autoMLJobArn;
    }

    /**
     * <p>
     * Returns the job's ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:automl-job/.*<br/>
     *
     * @param autoMLJobArn <p>
     *            Returns the job's ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutoMLJobResult withAutoMLJobArn(String autoMLJobArn) {
        this.autoMLJobArn = autoMLJobArn;
        return this;
    }

    /**
     * <p>
     * Returns the job's input data config.
     * </p>
     *
     * @return <p>
     *         Returns the job's input data config.
     *         </p>
     */
    public java.util.List<AutoMLChannel> getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * Returns the job's input data config.
     * </p>
     *
     * @param inputDataConfig <p>
     *            Returns the job's input data config.
     *            </p>
     */
    public void setInputDataConfig(java.util.Collection<AutoMLChannel> inputDataConfig) {
        if (inputDataConfig == null) {
            this.inputDataConfig = null;
            return;
        }

        this.inputDataConfig = new java.util.ArrayList<AutoMLChannel>(inputDataConfig);
    }

    /**
     * <p>
     * Returns the job's input data config.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            Returns the job's input data config.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutoMLJobResult withInputDataConfig(AutoMLChannel... inputDataConfig) {
        if (getInputDataConfig() == null) {
            this.inputDataConfig = new java.util.ArrayList<AutoMLChannel>(inputDataConfig.length);
        }
        for (AutoMLChannel value : inputDataConfig) {
            this.inputDataConfig.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Returns the job's input data config.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            Returns the job's input data config.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutoMLJobResult withInputDataConfig(
            java.util.Collection<AutoMLChannel> inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * Returns the job's output data config.
     * </p>
     *
     * @return <p>
     *         Returns the job's output data config.
     *         </p>
     */
    public AutoMLOutputDataConfig getOutputDataConfig() {
        return outputDataConfig;
    }

    /**
     * <p>
     * Returns the job's output data config.
     * </p>
     *
     * @param outputDataConfig <p>
     *            Returns the job's output data config.
     *            </p>
     */
    public void setOutputDataConfig(AutoMLOutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Returns the job's output data config.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputDataConfig <p>
     *            Returns the job's output data config.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutoMLJobResult withOutputDataConfig(AutoMLOutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that has read permission to the input data location and write
     * permission to the output data location in Amazon S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS Identity and Access
     *         Management (IAM) role that has read permission to the input data
     *         location and write permission to the output data location in
     *         Amazon S3.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that has read permission to the input data location and write
     * permission to the output data location in Amazon S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Identity and Access
     *            Management (IAM) role that has read permission to the input
     *            data location and write permission to the output data location
     *            in Amazon S3.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that has read permission to the input data location and write
     * permission to the output data location in Amazon S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Identity and Access
     *            Management (IAM) role that has read permission to the input
     *            data location and write permission to the output data location
     *            in Amazon S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutoMLJobResult withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * Returns the job's objective.
     * </p>
     *
     * @return <p>
     *         Returns the job's objective.
     *         </p>
     */
    public AutoMLJobObjective getAutoMLJobObjective() {
        return autoMLJobObjective;
    }

    /**
     * <p>
     * Returns the job's objective.
     * </p>
     *
     * @param autoMLJobObjective <p>
     *            Returns the job's objective.
     *            </p>
     */
    public void setAutoMLJobObjective(AutoMLJobObjective autoMLJobObjective) {
        this.autoMLJobObjective = autoMLJobObjective;
    }

    /**
     * <p>
     * Returns the job's objective.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoMLJobObjective <p>
     *            Returns the job's objective.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutoMLJobResult withAutoMLJobObjective(AutoMLJobObjective autoMLJobObjective) {
        this.autoMLJobObjective = autoMLJobObjective;
        return this;
    }

    /**
     * <p>
     * Returns the job's problem type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BinaryClassification, MulticlassClassification,
     * Regression
     *
     * @return <p>
     *         Returns the job's problem type.
     *         </p>
     * @see ProblemType
     */
    public String getProblemType() {
        return problemType;
    }

    /**
     * <p>
     * Returns the job's problem type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BinaryClassification, MulticlassClassification,
     * Regression
     *
     * @param problemType <p>
     *            Returns the job's problem type.
     *            </p>
     * @see ProblemType
     */
    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    /**
     * <p>
     * Returns the job's problem type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BinaryClassification, MulticlassClassification,
     * Regression
     *
     * @param problemType <p>
     *            Returns the job's problem type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProblemType
     */
    public DescribeAutoMLJobResult withProblemType(String problemType) {
        this.problemType = problemType;
        return this;
    }

    /**
     * <p>
     * Returns the job's problem type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BinaryClassification, MulticlassClassification,
     * Regression
     *
     * @param problemType <p>
     *            Returns the job's problem type.
     *            </p>
     * @see ProblemType
     */
    public void setProblemType(ProblemType problemType) {
        this.problemType = problemType.toString();
    }

    /**
     * <p>
     * Returns the job's problem type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BinaryClassification, MulticlassClassification,
     * Regression
     *
     * @param problemType <p>
     *            Returns the job's problem type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProblemType
     */
    public DescribeAutoMLJobResult withProblemType(ProblemType problemType) {
        this.problemType = problemType.toString();
        return this;
    }

    /**
     * <p>
     * Returns the job's config.
     * </p>
     *
     * @return <p>
     *         Returns the job's config.
     *         </p>
     */
    public AutoMLJobConfig getAutoMLJobConfig() {
        return autoMLJobConfig;
    }

    /**
     * <p>
     * Returns the job's config.
     * </p>
     *
     * @param autoMLJobConfig <p>
     *            Returns the job's config.
     *            </p>
     */
    public void setAutoMLJobConfig(AutoMLJobConfig autoMLJobConfig) {
        this.autoMLJobConfig = autoMLJobConfig;
    }

    /**
     * <p>
     * Returns the job's config.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoMLJobConfig <p>
     *            Returns the job's config.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutoMLJobResult withAutoMLJobConfig(AutoMLJobConfig autoMLJobConfig) {
        this.autoMLJobConfig = autoMLJobConfig;
        return this;
    }

    /**
     * <p>
     * Returns the job's creation time.
     * </p>
     *
     * @return <p>
     *         Returns the job's creation time.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * Returns the job's creation time.
     * </p>
     *
     * @param creationTime <p>
     *            Returns the job's creation time.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Returns the job's creation time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            Returns the job's creation time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutoMLJobResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * Returns the job's end time.
     * </p>
     *
     * @return <p>
     *         Returns the job's end time.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * Returns the job's end time.
     * </p>
     *
     * @param endTime <p>
     *            Returns the job's end time.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Returns the job's end time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            Returns the job's end time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutoMLJobResult withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * Returns the job's last modified time.
     * </p>
     *
     * @return <p>
     *         Returns the job's last modified time.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * Returns the job's last modified time.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            Returns the job's last modified time.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * Returns the job's last modified time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            Returns the job's last modified time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutoMLJobResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * Returns the job's FailureReason.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         Returns the job's FailureReason.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * Returns the job's FailureReason.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            Returns the job's FailureReason.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * Returns the job's FailureReason.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            Returns the job's FailureReason.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutoMLJobResult withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * Returns the job's BestCandidate.
     * </p>
     *
     * @return <p>
     *         Returns the job's BestCandidate.
     *         </p>
     */
    public AutoMLCandidate getBestCandidate() {
        return bestCandidate;
    }

    /**
     * <p>
     * Returns the job's BestCandidate.
     * </p>
     *
     * @param bestCandidate <p>
     *            Returns the job's BestCandidate.
     *            </p>
     */
    public void setBestCandidate(AutoMLCandidate bestCandidate) {
        this.bestCandidate = bestCandidate;
    }

    /**
     * <p>
     * Returns the job's BestCandidate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bestCandidate <p>
     *            Returns the job's BestCandidate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutoMLJobResult withBestCandidate(AutoMLCandidate bestCandidate) {
        this.bestCandidate = bestCandidate;
        return this;
    }

    /**
     * <p>
     * Returns the job's AutoMLJobStatus.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @return <p>
     *         Returns the job's AutoMLJobStatus.
     *         </p>
     * @see AutoMLJobStatus
     */
    public String getAutoMLJobStatus() {
        return autoMLJobStatus;
    }

    /**
     * <p>
     * Returns the job's AutoMLJobStatus.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param autoMLJobStatus <p>
     *            Returns the job's AutoMLJobStatus.
     *            </p>
     * @see AutoMLJobStatus
     */
    public void setAutoMLJobStatus(String autoMLJobStatus) {
        this.autoMLJobStatus = autoMLJobStatus;
    }

    /**
     * <p>
     * Returns the job's AutoMLJobStatus.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param autoMLJobStatus <p>
     *            Returns the job's AutoMLJobStatus.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoMLJobStatus
     */
    public DescribeAutoMLJobResult withAutoMLJobStatus(String autoMLJobStatus) {
        this.autoMLJobStatus = autoMLJobStatus;
        return this;
    }

    /**
     * <p>
     * Returns the job's AutoMLJobStatus.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param autoMLJobStatus <p>
     *            Returns the job's AutoMLJobStatus.
     *            </p>
     * @see AutoMLJobStatus
     */
    public void setAutoMLJobStatus(AutoMLJobStatus autoMLJobStatus) {
        this.autoMLJobStatus = autoMLJobStatus.toString();
    }

    /**
     * <p>
     * Returns the job's AutoMLJobStatus.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param autoMLJobStatus <p>
     *            Returns the job's AutoMLJobStatus.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoMLJobStatus
     */
    public DescribeAutoMLJobResult withAutoMLJobStatus(AutoMLJobStatus autoMLJobStatus) {
        this.autoMLJobStatus = autoMLJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * Returns the job's AutoMLJobSecondaryStatus.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, AnalyzingData, FeatureEngineering,
     * ModelTuning, MaxCandidatesReached, Failed, Stopped,
     * MaxAutoMLJobRuntimeReached, Stopping, CandidateDefinitionsGenerated
     *
     * @return <p>
     *         Returns the job's AutoMLJobSecondaryStatus.
     *         </p>
     * @see AutoMLJobSecondaryStatus
     */
    public String getAutoMLJobSecondaryStatus() {
        return autoMLJobSecondaryStatus;
    }

    /**
     * <p>
     * Returns the job's AutoMLJobSecondaryStatus.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, AnalyzingData, FeatureEngineering,
     * ModelTuning, MaxCandidatesReached, Failed, Stopped,
     * MaxAutoMLJobRuntimeReached, Stopping, CandidateDefinitionsGenerated
     *
     * @param autoMLJobSecondaryStatus <p>
     *            Returns the job's AutoMLJobSecondaryStatus.
     *            </p>
     * @see AutoMLJobSecondaryStatus
     */
    public void setAutoMLJobSecondaryStatus(String autoMLJobSecondaryStatus) {
        this.autoMLJobSecondaryStatus = autoMLJobSecondaryStatus;
    }

    /**
     * <p>
     * Returns the job's AutoMLJobSecondaryStatus.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, AnalyzingData, FeatureEngineering,
     * ModelTuning, MaxCandidatesReached, Failed, Stopped,
     * MaxAutoMLJobRuntimeReached, Stopping, CandidateDefinitionsGenerated
     *
     * @param autoMLJobSecondaryStatus <p>
     *            Returns the job's AutoMLJobSecondaryStatus.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoMLJobSecondaryStatus
     */
    public DescribeAutoMLJobResult withAutoMLJobSecondaryStatus(String autoMLJobSecondaryStatus) {
        this.autoMLJobSecondaryStatus = autoMLJobSecondaryStatus;
        return this;
    }

    /**
     * <p>
     * Returns the job's AutoMLJobSecondaryStatus.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, AnalyzingData, FeatureEngineering,
     * ModelTuning, MaxCandidatesReached, Failed, Stopped,
     * MaxAutoMLJobRuntimeReached, Stopping, CandidateDefinitionsGenerated
     *
     * @param autoMLJobSecondaryStatus <p>
     *            Returns the job's AutoMLJobSecondaryStatus.
     *            </p>
     * @see AutoMLJobSecondaryStatus
     */
    public void setAutoMLJobSecondaryStatus(AutoMLJobSecondaryStatus autoMLJobSecondaryStatus) {
        this.autoMLJobSecondaryStatus = autoMLJobSecondaryStatus.toString();
    }

    /**
     * <p>
     * Returns the job's AutoMLJobSecondaryStatus.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, AnalyzingData, FeatureEngineering,
     * ModelTuning, MaxCandidatesReached, Failed, Stopped,
     * MaxAutoMLJobRuntimeReached, Stopping, CandidateDefinitionsGenerated
     *
     * @param autoMLJobSecondaryStatus <p>
     *            Returns the job's AutoMLJobSecondaryStatus.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoMLJobSecondaryStatus
     */
    public DescribeAutoMLJobResult withAutoMLJobSecondaryStatus(
            AutoMLJobSecondaryStatus autoMLJobSecondaryStatus) {
        this.autoMLJobSecondaryStatus = autoMLJobSecondaryStatus.toString();
        return this;
    }

    /**
     * <p>
     * Returns the job's output from GenerateCandidateDefinitionsOnly.
     * </p>
     *
     * @return <p>
     *         Returns the job's output from GenerateCandidateDefinitionsOnly.
     *         </p>
     */
    public Boolean isGenerateCandidateDefinitionsOnly() {
        return generateCandidateDefinitionsOnly;
    }

    /**
     * <p>
     * Returns the job's output from GenerateCandidateDefinitionsOnly.
     * </p>
     *
     * @return <p>
     *         Returns the job's output from GenerateCandidateDefinitionsOnly.
     *         </p>
     */
    public Boolean getGenerateCandidateDefinitionsOnly() {
        return generateCandidateDefinitionsOnly;
    }

    /**
     * <p>
     * Returns the job's output from GenerateCandidateDefinitionsOnly.
     * </p>
     *
     * @param generateCandidateDefinitionsOnly <p>
     *            Returns the job's output from
     *            GenerateCandidateDefinitionsOnly.
     *            </p>
     */
    public void setGenerateCandidateDefinitionsOnly(Boolean generateCandidateDefinitionsOnly) {
        this.generateCandidateDefinitionsOnly = generateCandidateDefinitionsOnly;
    }

    /**
     * <p>
     * Returns the job's output from GenerateCandidateDefinitionsOnly.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param generateCandidateDefinitionsOnly <p>
     *            Returns the job's output from
     *            GenerateCandidateDefinitionsOnly.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutoMLJobResult withGenerateCandidateDefinitionsOnly(
            Boolean generateCandidateDefinitionsOnly) {
        this.generateCandidateDefinitionsOnly = generateCandidateDefinitionsOnly;
        return this;
    }

    /**
     * <p>
     * Returns information on the job's artifacts found in AutoMLJobArtifacts.
     * </p>
     *
     * @return <p>
     *         Returns information on the job's artifacts found in
     *         AutoMLJobArtifacts.
     *         </p>
     */
    public AutoMLJobArtifacts getAutoMLJobArtifacts() {
        return autoMLJobArtifacts;
    }

    /**
     * <p>
     * Returns information on the job's artifacts found in AutoMLJobArtifacts.
     * </p>
     *
     * @param autoMLJobArtifacts <p>
     *            Returns information on the job's artifacts found in
     *            AutoMLJobArtifacts.
     *            </p>
     */
    public void setAutoMLJobArtifacts(AutoMLJobArtifacts autoMLJobArtifacts) {
        this.autoMLJobArtifacts = autoMLJobArtifacts;
    }

    /**
     * <p>
     * Returns information on the job's artifacts found in AutoMLJobArtifacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoMLJobArtifacts <p>
     *            Returns information on the job's artifacts found in
     *            AutoMLJobArtifacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutoMLJobResult withAutoMLJobArtifacts(AutoMLJobArtifacts autoMLJobArtifacts) {
        this.autoMLJobArtifacts = autoMLJobArtifacts;
        return this;
    }

    /**
     * <p>
     * This contains ProblemType, AutoMLJobObjective and CompletionCriteria.
     * They're auto-inferred values, if not provided by you. If you do provide
     * them, then they'll be the same as provided.
     * </p>
     *
     * @return <p>
     *         This contains ProblemType, AutoMLJobObjective and
     *         CompletionCriteria. They're auto-inferred values, if not provided
     *         by you. If you do provide them, then they'll be the same as
     *         provided.
     *         </p>
     */
    public ResolvedAttributes getResolvedAttributes() {
        return resolvedAttributes;
    }

    /**
     * <p>
     * This contains ProblemType, AutoMLJobObjective and CompletionCriteria.
     * They're auto-inferred values, if not provided by you. If you do provide
     * them, then they'll be the same as provided.
     * </p>
     *
     * @param resolvedAttributes <p>
     *            This contains ProblemType, AutoMLJobObjective and
     *            CompletionCriteria. They're auto-inferred values, if not
     *            provided by you. If you do provide them, then they'll be the
     *            same as provided.
     *            </p>
     */
    public void setResolvedAttributes(ResolvedAttributes resolvedAttributes) {
        this.resolvedAttributes = resolvedAttributes;
    }

    /**
     * <p>
     * This contains ProblemType, AutoMLJobObjective and CompletionCriteria.
     * They're auto-inferred values, if not provided by you. If you do provide
     * them, then they'll be the same as provided.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resolvedAttributes <p>
     *            This contains ProblemType, AutoMLJobObjective and
     *            CompletionCriteria. They're auto-inferred values, if not
     *            provided by you. If you do provide them, then they'll be the
     *            same as provided.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutoMLJobResult withResolvedAttributes(ResolvedAttributes resolvedAttributes) {
        this.resolvedAttributes = resolvedAttributes;
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
        if (getAutoMLJobName() != null)
            sb.append("AutoMLJobName: " + getAutoMLJobName() + ",");
        if (getAutoMLJobArn() != null)
            sb.append("AutoMLJobArn: " + getAutoMLJobArn() + ",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: " + getInputDataConfig() + ",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: " + getOutputDataConfig() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getAutoMLJobObjective() != null)
            sb.append("AutoMLJobObjective: " + getAutoMLJobObjective() + ",");
        if (getProblemType() != null)
            sb.append("ProblemType: " + getProblemType() + ",");
        if (getAutoMLJobConfig() != null)
            sb.append("AutoMLJobConfig: " + getAutoMLJobConfig() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getBestCandidate() != null)
            sb.append("BestCandidate: " + getBestCandidate() + ",");
        if (getAutoMLJobStatus() != null)
            sb.append("AutoMLJobStatus: " + getAutoMLJobStatus() + ",");
        if (getAutoMLJobSecondaryStatus() != null)
            sb.append("AutoMLJobSecondaryStatus: " + getAutoMLJobSecondaryStatus() + ",");
        if (getGenerateCandidateDefinitionsOnly() != null)
            sb.append("GenerateCandidateDefinitionsOnly: " + getGenerateCandidateDefinitionsOnly()
                    + ",");
        if (getAutoMLJobArtifacts() != null)
            sb.append("AutoMLJobArtifacts: " + getAutoMLJobArtifacts() + ",");
        if (getResolvedAttributes() != null)
            sb.append("ResolvedAttributes: " + getResolvedAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoMLJobName() == null) ? 0 : getAutoMLJobName().hashCode());
        hashCode = prime * hashCode
                + ((getAutoMLJobArn() == null) ? 0 : getAutoMLJobArn().hashCode());
        hashCode = prime * hashCode
                + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getAutoMLJobObjective() == null) ? 0 : getAutoMLJobObjective().hashCode());
        hashCode = prime * hashCode
                + ((getProblemType() == null) ? 0 : getProblemType().hashCode());
        hashCode = prime * hashCode
                + ((getAutoMLJobConfig() == null) ? 0 : getAutoMLJobConfig().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode
                + ((getBestCandidate() == null) ? 0 : getBestCandidate().hashCode());
        hashCode = prime * hashCode
                + ((getAutoMLJobStatus() == null) ? 0 : getAutoMLJobStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoMLJobSecondaryStatus() == null) ? 0 : getAutoMLJobSecondaryStatus()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getGenerateCandidateDefinitionsOnly() == null) ? 0
                        : getGenerateCandidateDefinitionsOnly().hashCode());
        hashCode = prime * hashCode
                + ((getAutoMLJobArtifacts() == null) ? 0 : getAutoMLJobArtifacts().hashCode());
        hashCode = prime * hashCode
                + ((getResolvedAttributes() == null) ? 0 : getResolvedAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAutoMLJobResult == false)
            return false;
        DescribeAutoMLJobResult other = (DescribeAutoMLJobResult) obj;

        if (other.getAutoMLJobName() == null ^ this.getAutoMLJobName() == null)
            return false;
        if (other.getAutoMLJobName() != null
                && other.getAutoMLJobName().equals(this.getAutoMLJobName()) == false)
            return false;
        if (other.getAutoMLJobArn() == null ^ this.getAutoMLJobArn() == null)
            return false;
        if (other.getAutoMLJobArn() != null
                && other.getAutoMLJobArn().equals(this.getAutoMLJobArn()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null
                && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null
                && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getAutoMLJobObjective() == null ^ this.getAutoMLJobObjective() == null)
            return false;
        if (other.getAutoMLJobObjective() != null
                && other.getAutoMLJobObjective().equals(this.getAutoMLJobObjective()) == false)
            return false;
        if (other.getProblemType() == null ^ this.getProblemType() == null)
            return false;
        if (other.getProblemType() != null
                && other.getProblemType().equals(this.getProblemType()) == false)
            return false;
        if (other.getAutoMLJobConfig() == null ^ this.getAutoMLJobConfig() == null)
            return false;
        if (other.getAutoMLJobConfig() != null
                && other.getAutoMLJobConfig().equals(this.getAutoMLJobConfig()) == false)
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
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getBestCandidate() == null ^ this.getBestCandidate() == null)
            return false;
        if (other.getBestCandidate() != null
                && other.getBestCandidate().equals(this.getBestCandidate()) == false)
            return false;
        if (other.getAutoMLJobStatus() == null ^ this.getAutoMLJobStatus() == null)
            return false;
        if (other.getAutoMLJobStatus() != null
                && other.getAutoMLJobStatus().equals(this.getAutoMLJobStatus()) == false)
            return false;
        if (other.getAutoMLJobSecondaryStatus() == null
                ^ this.getAutoMLJobSecondaryStatus() == null)
            return false;
        if (other.getAutoMLJobSecondaryStatus() != null
                && other.getAutoMLJobSecondaryStatus().equals(this.getAutoMLJobSecondaryStatus()) == false)
            return false;
        if (other.getGenerateCandidateDefinitionsOnly() == null
                ^ this.getGenerateCandidateDefinitionsOnly() == null)
            return false;
        if (other.getGenerateCandidateDefinitionsOnly() != null
                && other.getGenerateCandidateDefinitionsOnly().equals(
                        this.getGenerateCandidateDefinitionsOnly()) == false)
            return false;
        if (other.getAutoMLJobArtifacts() == null ^ this.getAutoMLJobArtifacts() == null)
            return false;
        if (other.getAutoMLJobArtifacts() != null
                && other.getAutoMLJobArtifacts().equals(this.getAutoMLJobArtifacts()) == false)
            return false;
        if (other.getResolvedAttributes() == null ^ this.getResolvedAttributes() == null)
            return false;
        if (other.getResolvedAttributes() != null
                && other.getResolvedAttributes().equals(this.getResolvedAttributes()) == false)
            return false;
        return true;
    }
}
