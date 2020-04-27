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

public class DescribeCompilationJobResult implements Serializable {
    /**
     * <p>
     * The name of the model compilation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String compilationJobName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker
     * assumes to perform the model compilation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:compilation-job/.*
     * <br/>
     */
    private String compilationJobArn;

    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPROGRESS, COMPLETED, FAILED, STARTING, STOPPING,
     * STOPPED
     */
    private String compilationJobStatus;

    /**
     * <p>
     * The time when the model compilation job started the
     * <code>CompilationJob</code> instances.
     * </p>
     * <p>
     * You are billed for the time between this timestamp and the timestamp in
     * the <a>DescribeCompilationJobResponse$CompilationEndTime</a> field. In
     * Amazon CloudWatch Logs, the start time might be later than this time.
     * That's because it takes time to download the compilation job, which
     * depends on the size of the compilation job container.
     * </p>
     */
    private java.util.Date compilationStartTime;

    /**
     * <p>
     * The time when the model compilation job on a compilation job instance
     * ended. For a successful or stopped job, this is when the job's model
     * artifacts have finished uploading. For a failed job, this is when Amazon
     * SageMaker detected that the job failed.
     * </p>
     */
    private java.util.Date compilationEndTime;

    /**
     * <p>
     * Specifies a limit to how long a model compilation job can run. When the
     * job reaches the time limit, Amazon SageMaker ends the compilation job.
     * Use this API to cap model training costs.
     * </p>
     */
    private StoppingCondition stoppingCondition;

    /**
     * <p>
     * The time that the model compilation job was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The time that the status of the model compilation job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * If a model compilation job failed, the reason it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String failureReason;

    /**
     * <p>
     * Information about the location in Amazon S3 that has been configured for
     * storing the model artifacts used in the compilation job.
     * </p>
     */
    private ModelArtifacts modelArtifacts;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model compilation job.
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
     * Information about the location in Amazon S3 of the input model artifacts,
     * the name and shape of the expected data inputs, and the framework in
     * which the model was trained.
     * </p>
     */
    private InputConfig inputConfig;

    /**
     * <p>
     * Information about the output location for the compiled model and the
     * target device that the model runs on.
     * </p>
     */
    private OutputConfig outputConfig;

    /**
     * <p>
     * The name of the model compilation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the model compilation job.
     *         </p>
     */
    public String getCompilationJobName() {
        return compilationJobName;
    }

    /**
     * <p>
     * The name of the model compilation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param compilationJobName <p>
     *            The name of the model compilation job.
     *            </p>
     */
    public void setCompilationJobName(String compilationJobName) {
        this.compilationJobName = compilationJobName;
    }

    /**
     * <p>
     * The name of the model compilation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param compilationJobName <p>
     *            The name of the model compilation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCompilationJobResult withCompilationJobName(String compilationJobName) {
        this.compilationJobName = compilationJobName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker
     * assumes to perform the model compilation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:compilation-job/.*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an IAM role that Amazon
     *         SageMaker assumes to perform the model compilation job.
     *         </p>
     */
    public String getCompilationJobArn() {
        return compilationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker
     * assumes to perform the model compilation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:compilation-job/.*
     * <br/>
     *
     * @param compilationJobArn <p>
     *            The Amazon Resource Name (ARN) of an IAM role that Amazon
     *            SageMaker assumes to perform the model compilation job.
     *            </p>
     */
    public void setCompilationJobArn(String compilationJobArn) {
        this.compilationJobArn = compilationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker
     * assumes to perform the model compilation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:compilation-job/.*
     * <br/>
     *
     * @param compilationJobArn <p>
     *            The Amazon Resource Name (ARN) of an IAM role that Amazon
     *            SageMaker assumes to perform the model compilation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCompilationJobResult withCompilationJobArn(String compilationJobArn) {
        this.compilationJobArn = compilationJobArn;
        return this;
    }

    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPROGRESS, COMPLETED, FAILED, STARTING, STOPPING,
     * STOPPED
     *
     * @return <p>
     *         The status of the model compilation job.
     *         </p>
     * @see CompilationJobStatus
     */
    public String getCompilationJobStatus() {
        return compilationJobStatus;
    }

    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPROGRESS, COMPLETED, FAILED, STARTING, STOPPING,
     * STOPPED
     *
     * @param compilationJobStatus <p>
     *            The status of the model compilation job.
     *            </p>
     * @see CompilationJobStatus
     */
    public void setCompilationJobStatus(String compilationJobStatus) {
        this.compilationJobStatus = compilationJobStatus;
    }

    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPROGRESS, COMPLETED, FAILED, STARTING, STOPPING,
     * STOPPED
     *
     * @param compilationJobStatus <p>
     *            The status of the model compilation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CompilationJobStatus
     */
    public DescribeCompilationJobResult withCompilationJobStatus(String compilationJobStatus) {
        this.compilationJobStatus = compilationJobStatus;
        return this;
    }

    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPROGRESS, COMPLETED, FAILED, STARTING, STOPPING,
     * STOPPED
     *
     * @param compilationJobStatus <p>
     *            The status of the model compilation job.
     *            </p>
     * @see CompilationJobStatus
     */
    public void setCompilationJobStatus(CompilationJobStatus compilationJobStatus) {
        this.compilationJobStatus = compilationJobStatus.toString();
    }

    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPROGRESS, COMPLETED, FAILED, STARTING, STOPPING,
     * STOPPED
     *
     * @param compilationJobStatus <p>
     *            The status of the model compilation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CompilationJobStatus
     */
    public DescribeCompilationJobResult withCompilationJobStatus(
            CompilationJobStatus compilationJobStatus) {
        this.compilationJobStatus = compilationJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time when the model compilation job started the
     * <code>CompilationJob</code> instances.
     * </p>
     * <p>
     * You are billed for the time between this timestamp and the timestamp in
     * the <a>DescribeCompilationJobResponse$CompilationEndTime</a> field. In
     * Amazon CloudWatch Logs, the start time might be later than this time.
     * That's because it takes time to download the compilation job, which
     * depends on the size of the compilation job container.
     * </p>
     *
     * @return <p>
     *         The time when the model compilation job started the
     *         <code>CompilationJob</code> instances.
     *         </p>
     *         <p>
     *         You are billed for the time between this timestamp and the
     *         timestamp in the
     *         <a>DescribeCompilationJobResponse$CompilationEndTime</a> field.
     *         In Amazon CloudWatch Logs, the start time might be later than
     *         this time. That's because it takes time to download the
     *         compilation job, which depends on the size of the compilation job
     *         container.
     *         </p>
     */
    public java.util.Date getCompilationStartTime() {
        return compilationStartTime;
    }

    /**
     * <p>
     * The time when the model compilation job started the
     * <code>CompilationJob</code> instances.
     * </p>
     * <p>
     * You are billed for the time between this timestamp and the timestamp in
     * the <a>DescribeCompilationJobResponse$CompilationEndTime</a> field. In
     * Amazon CloudWatch Logs, the start time might be later than this time.
     * That's because it takes time to download the compilation job, which
     * depends on the size of the compilation job container.
     * </p>
     *
     * @param compilationStartTime <p>
     *            The time when the model compilation job started the
     *            <code>CompilationJob</code> instances.
     *            </p>
     *            <p>
     *            You are billed for the time between this timestamp and the
     *            timestamp in the
     *            <a>DescribeCompilationJobResponse$CompilationEndTime</a>
     *            field. In Amazon CloudWatch Logs, the start time might be
     *            later than this time. That's because it takes time to download
     *            the compilation job, which depends on the size of the
     *            compilation job container.
     *            </p>
     */
    public void setCompilationStartTime(java.util.Date compilationStartTime) {
        this.compilationStartTime = compilationStartTime;
    }

    /**
     * <p>
     * The time when the model compilation job started the
     * <code>CompilationJob</code> instances.
     * </p>
     * <p>
     * You are billed for the time between this timestamp and the timestamp in
     * the <a>DescribeCompilationJobResponse$CompilationEndTime</a> field. In
     * Amazon CloudWatch Logs, the start time might be later than this time.
     * That's because it takes time to download the compilation job, which
     * depends on the size of the compilation job container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param compilationStartTime <p>
     *            The time when the model compilation job started the
     *            <code>CompilationJob</code> instances.
     *            </p>
     *            <p>
     *            You are billed for the time between this timestamp and the
     *            timestamp in the
     *            <a>DescribeCompilationJobResponse$CompilationEndTime</a>
     *            field. In Amazon CloudWatch Logs, the start time might be
     *            later than this time. That's because it takes time to download
     *            the compilation job, which depends on the size of the
     *            compilation job container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCompilationJobResult withCompilationStartTime(java.util.Date compilationStartTime) {
        this.compilationStartTime = compilationStartTime;
        return this;
    }

    /**
     * <p>
     * The time when the model compilation job on a compilation job instance
     * ended. For a successful or stopped job, this is when the job's model
     * artifacts have finished uploading. For a failed job, this is when Amazon
     * SageMaker detected that the job failed.
     * </p>
     *
     * @return <p>
     *         The time when the model compilation job on a compilation job
     *         instance ended. For a successful or stopped job, this is when the
     *         job's model artifacts have finished uploading. For a failed job,
     *         this is when Amazon SageMaker detected that the job failed.
     *         </p>
     */
    public java.util.Date getCompilationEndTime() {
        return compilationEndTime;
    }

    /**
     * <p>
     * The time when the model compilation job on a compilation job instance
     * ended. For a successful or stopped job, this is when the job's model
     * artifacts have finished uploading. For a failed job, this is when Amazon
     * SageMaker detected that the job failed.
     * </p>
     *
     * @param compilationEndTime <p>
     *            The time when the model compilation job on a compilation job
     *            instance ended. For a successful or stopped job, this is when
     *            the job's model artifacts have finished uploading. For a
     *            failed job, this is when Amazon SageMaker detected that the
     *            job failed.
     *            </p>
     */
    public void setCompilationEndTime(java.util.Date compilationEndTime) {
        this.compilationEndTime = compilationEndTime;
    }

    /**
     * <p>
     * The time when the model compilation job on a compilation job instance
     * ended. For a successful or stopped job, this is when the job's model
     * artifacts have finished uploading. For a failed job, this is when Amazon
     * SageMaker detected that the job failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param compilationEndTime <p>
     *            The time when the model compilation job on a compilation job
     *            instance ended. For a successful or stopped job, this is when
     *            the job's model artifacts have finished uploading. For a
     *            failed job, this is when Amazon SageMaker detected that the
     *            job failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCompilationJobResult withCompilationEndTime(java.util.Date compilationEndTime) {
        this.compilationEndTime = compilationEndTime;
        return this;
    }

    /**
     * <p>
     * Specifies a limit to how long a model compilation job can run. When the
     * job reaches the time limit, Amazon SageMaker ends the compilation job.
     * Use this API to cap model training costs.
     * </p>
     *
     * @return <p>
     *         Specifies a limit to how long a model compilation job can run.
     *         When the job reaches the time limit, Amazon SageMaker ends the
     *         compilation job. Use this API to cap model training costs.
     *         </p>
     */
    public StoppingCondition getStoppingCondition() {
        return stoppingCondition;
    }

    /**
     * <p>
     * Specifies a limit to how long a model compilation job can run. When the
     * job reaches the time limit, Amazon SageMaker ends the compilation job.
     * Use this API to cap model training costs.
     * </p>
     *
     * @param stoppingCondition <p>
     *            Specifies a limit to how long a model compilation job can run.
     *            When the job reaches the time limit, Amazon SageMaker ends the
     *            compilation job. Use this API to cap model training costs.
     *            </p>
     */
    public void setStoppingCondition(StoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * <p>
     * Specifies a limit to how long a model compilation job can run. When the
     * job reaches the time limit, Amazon SageMaker ends the compilation job.
     * Use this API to cap model training costs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stoppingCondition <p>
     *            Specifies a limit to how long a model compilation job can run.
     *            When the job reaches the time limit, Amazon SageMaker ends the
     *            compilation job. Use this API to cap model training costs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCompilationJobResult withStoppingCondition(StoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
        return this;
    }

    /**
     * <p>
     * The time that the model compilation job was created.
     * </p>
     *
     * @return <p>
     *         The time that the model compilation job was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time that the model compilation job was created.
     * </p>
     *
     * @param creationTime <p>
     *            The time that the model compilation job was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the model compilation job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time that the model compilation job was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCompilationJobResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The time that the status of the model compilation job was last modified.
     * </p>
     *
     * @return <p>
     *         The time that the status of the model compilation job was last
     *         modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The time that the status of the model compilation job was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The time that the status of the model compilation job was last
     *            modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time that the status of the model compilation job was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The time that the status of the model compilation job was last
     *            modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCompilationJobResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * If a model compilation job failed, the reason it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         If a model compilation job failed, the reason it failed.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If a model compilation job failed, the reason it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            If a model compilation job failed, the reason it failed.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If a model compilation job failed, the reason it failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            If a model compilation job failed, the reason it failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCompilationJobResult withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * Information about the location in Amazon S3 that has been configured for
     * storing the model artifacts used in the compilation job.
     * </p>
     *
     * @return <p>
     *         Information about the location in Amazon S3 that has been
     *         configured for storing the model artifacts used in the
     *         compilation job.
     *         </p>
     */
    public ModelArtifacts getModelArtifacts() {
        return modelArtifacts;
    }

    /**
     * <p>
     * Information about the location in Amazon S3 that has been configured for
     * storing the model artifacts used in the compilation job.
     * </p>
     *
     * @param modelArtifacts <p>
     *            Information about the location in Amazon S3 that has been
     *            configured for storing the model artifacts used in the
     *            compilation job.
     *            </p>
     */
    public void setModelArtifacts(ModelArtifacts modelArtifacts) {
        this.modelArtifacts = modelArtifacts;
    }

    /**
     * <p>
     * Information about the location in Amazon S3 that has been configured for
     * storing the model artifacts used in the compilation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelArtifacts <p>
     *            Information about the location in Amazon S3 that has been
     *            configured for storing the model artifacts used in the
     *            compilation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCompilationJobResult withModelArtifacts(ModelArtifacts modelArtifacts) {
        this.modelArtifacts = modelArtifacts;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model compilation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the model compilation job.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model compilation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the model compilation job.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model compilation job.
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
     *            The Amazon Resource Name (ARN) of the model compilation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCompilationJobResult withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * Information about the location in Amazon S3 of the input model artifacts,
     * the name and shape of the expected data inputs, and the framework in
     * which the model was trained.
     * </p>
     *
     * @return <p>
     *         Information about the location in Amazon S3 of the input model
     *         artifacts, the name and shape of the expected data inputs, and
     *         the framework in which the model was trained.
     *         </p>
     */
    public InputConfig getInputConfig() {
        return inputConfig;
    }

    /**
     * <p>
     * Information about the location in Amazon S3 of the input model artifacts,
     * the name and shape of the expected data inputs, and the framework in
     * which the model was trained.
     * </p>
     *
     * @param inputConfig <p>
     *            Information about the location in Amazon S3 of the input model
     *            artifacts, the name and shape of the expected data inputs, and
     *            the framework in which the model was trained.
     *            </p>
     */
    public void setInputConfig(InputConfig inputConfig) {
        this.inputConfig = inputConfig;
    }

    /**
     * <p>
     * Information about the location in Amazon S3 of the input model artifacts,
     * the name and shape of the expected data inputs, and the framework in
     * which the model was trained.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputConfig <p>
     *            Information about the location in Amazon S3 of the input model
     *            artifacts, the name and shape of the expected data inputs, and
     *            the framework in which the model was trained.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCompilationJobResult withInputConfig(InputConfig inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }

    /**
     * <p>
     * Information about the output location for the compiled model and the
     * target device that the model runs on.
     * </p>
     *
     * @return <p>
     *         Information about the output location for the compiled model and
     *         the target device that the model runs on.
     *         </p>
     */
    public OutputConfig getOutputConfig() {
        return outputConfig;
    }

    /**
     * <p>
     * Information about the output location for the compiled model and the
     * target device that the model runs on.
     * </p>
     *
     * @param outputConfig <p>
     *            Information about the output location for the compiled model
     *            and the target device that the model runs on.
     *            </p>
     */
    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * Information about the output location for the compiled model and the
     * target device that the model runs on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputConfig <p>
     *            Information about the output location for the compiled model
     *            and the target device that the model runs on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCompilationJobResult withOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
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
        if (getCompilationJobName() != null)
            sb.append("CompilationJobName: " + getCompilationJobName() + ",");
        if (getCompilationJobArn() != null)
            sb.append("CompilationJobArn: " + getCompilationJobArn() + ",");
        if (getCompilationJobStatus() != null)
            sb.append("CompilationJobStatus: " + getCompilationJobStatus() + ",");
        if (getCompilationStartTime() != null)
            sb.append("CompilationStartTime: " + getCompilationStartTime() + ",");
        if (getCompilationEndTime() != null)
            sb.append("CompilationEndTime: " + getCompilationEndTime() + ",");
        if (getStoppingCondition() != null)
            sb.append("StoppingCondition: " + getStoppingCondition() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getModelArtifacts() != null)
            sb.append("ModelArtifacts: " + getModelArtifacts() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getInputConfig() != null)
            sb.append("InputConfig: " + getInputConfig() + ",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: " + getOutputConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCompilationJobName() == null) ? 0 : getCompilationJobName().hashCode());
        hashCode = prime * hashCode
                + ((getCompilationJobArn() == null) ? 0 : getCompilationJobArn().hashCode());
        hashCode = prime * hashCode
                + ((getCompilationJobStatus() == null) ? 0 : getCompilationJobStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCompilationStartTime() == null) ? 0 : getCompilationStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getCompilationEndTime() == null) ? 0 : getCompilationEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode
                + ((getModelArtifacts() == null) ? 0 : getModelArtifacts().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getInputConfig() == null) ? 0 : getInputConfig().hashCode());
        hashCode = prime * hashCode
                + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCompilationJobResult == false)
            return false;
        DescribeCompilationJobResult other = (DescribeCompilationJobResult) obj;

        if (other.getCompilationJobName() == null ^ this.getCompilationJobName() == null)
            return false;
        if (other.getCompilationJobName() != null
                && other.getCompilationJobName().equals(this.getCompilationJobName()) == false)
            return false;
        if (other.getCompilationJobArn() == null ^ this.getCompilationJobArn() == null)
            return false;
        if (other.getCompilationJobArn() != null
                && other.getCompilationJobArn().equals(this.getCompilationJobArn()) == false)
            return false;
        if (other.getCompilationJobStatus() == null ^ this.getCompilationJobStatus() == null)
            return false;
        if (other.getCompilationJobStatus() != null
                && other.getCompilationJobStatus().equals(this.getCompilationJobStatus()) == false)
            return false;
        if (other.getCompilationStartTime() == null ^ this.getCompilationStartTime() == null)
            return false;
        if (other.getCompilationStartTime() != null
                && other.getCompilationStartTime().equals(this.getCompilationStartTime()) == false)
            return false;
        if (other.getCompilationEndTime() == null ^ this.getCompilationEndTime() == null)
            return false;
        if (other.getCompilationEndTime() != null
                && other.getCompilationEndTime().equals(this.getCompilationEndTime()) == false)
            return false;
        if (other.getStoppingCondition() == null ^ this.getStoppingCondition() == null)
            return false;
        if (other.getStoppingCondition() != null
                && other.getStoppingCondition().equals(this.getStoppingCondition()) == false)
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
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getModelArtifacts() == null ^ this.getModelArtifacts() == null)
            return false;
        if (other.getModelArtifacts() != null
                && other.getModelArtifacts().equals(this.getModelArtifacts()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getInputConfig() == null ^ this.getInputConfig() == null)
            return false;
        if (other.getInputConfig() != null
                && other.getInputConfig().equals(this.getInputConfig()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null
                && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        return true;
    }
}
