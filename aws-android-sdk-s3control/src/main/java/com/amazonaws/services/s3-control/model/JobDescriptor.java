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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;


/**
 * <p>A container element for the job configuration and status information returned by a <code>Describe Job</code> request.</p>
 */
public class JobDescriptor implements Serializable {
    /**
     * <p>The ID for the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-\_]+<br/>
     */
    private String jobId;

    /**
     * <p>Indicates whether confirmation is required before Amazon S3 begins running the specified job. Confirmation is required only for jobs created through the Amazon S3 console.</p>
     */
    private Boolean confirmationRequired;

    /**
     * <p>The description for this job, if one was provided in this job's <code>Create Job</code> request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String description;

    /**
     * <p>The Amazon Resource Name (ARN) for this job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>arn:[^:]+:s3:[a-zA-Z0-9\-]+:\d{12}:job\/.*<br/>
     */
    private String jobArn;

    /**
     * <p>The current status of the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended
     */
    private String status;

    /**
     * <p>The configuration information for the specified job's manifest object.</p>
     */
    private JobManifest manifest;

    /**
     * <p>The operation that the specified job is configured to execute on the objects listed in the manifest.</p>
     */
    private JobOperation operation;

    /**
     * <p>The priority of the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer priority;

    /**
     * <p>Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and the number of tasks that failed.</p>
     */
    private JobProgressSummary progressSummary;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String statusUpdateReason;

    /**
     * <p>If the specified job failed, this field contains information describing the failure.</p>
     */
    private java.util.List<JobFailure> failureReasons;

    /**
     * <p>Contains the configuration information for the job-completion report if you requested one in the <code>Create Job</code> request.</p>
     */
    private JobReport report;

    /**
     * <p>A timestamp indicating when this job was created.</p>
     */
    private java.util.Date creationTime;

    /**
     * <p>A timestamp indicating when this job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.</p>
     */
    private java.util.Date terminationDate;

    /**
     * <p>The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role assigned to execute the tasks for this job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>arn:[^:]+:iam::\d{12}:role/.*<br/>
     */
    private String roleArn;

    /**
     * <p>The timestamp when this job was suspended, if it has been suspended.</p>
     */
    private java.util.Date suspendedDate;

    /**
     * <p>The reason why the specified job was suspended. A job is only suspended if you create it through the Amazon S3 console. When you create the job, it enters the <code>Suspended</code> state to await confirmation before running. After you confirm the job, it automatically exits the <code>Suspended</code> state.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String suspendedCause;

    /**
     * <p>The ID for the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-\_]+<br/>
     *
     * @return <p>The ID for the specified job.</p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>The ID for the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-\_]+<br/>
     *
     * @param jobId <p>The ID for the specified job.</p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>The ID for the specified job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-\_]+<br/>
     *
     * @param jobId <p>The ID for the specified job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobDescriptor withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>Indicates whether confirmation is required before Amazon S3 begins running the specified job. Confirmation is required only for jobs created through the Amazon S3 console.</p>
     *
     * @return <p>Indicates whether confirmation is required before Amazon S3 begins running the specified job. Confirmation is required only for jobs created through the Amazon S3 console.</p>
     */
    public Boolean isConfirmationRequired() {
        return confirmationRequired;
    }

    /**
     * <p>Indicates whether confirmation is required before Amazon S3 begins running the specified job. Confirmation is required only for jobs created through the Amazon S3 console.</p>
     *
     * @return <p>Indicates whether confirmation is required before Amazon S3 begins running the specified job. Confirmation is required only for jobs created through the Amazon S3 console.</p>
     */
    public Boolean getConfirmationRequired() {
        return confirmationRequired;
    }

    /**
     * <p>Indicates whether confirmation is required before Amazon S3 begins running the specified job. Confirmation is required only for jobs created through the Amazon S3 console.</p>
     *
     * @param confirmationRequired <p>Indicates whether confirmation is required before Amazon S3 begins running the specified job. Confirmation is required only for jobs created through the Amazon S3 console.</p>
     */
    public void setConfirmationRequired(Boolean confirmationRequired) {
        this.confirmationRequired = confirmationRequired;
    }

    /**
     * <p>Indicates whether confirmation is required before Amazon S3 begins running the specified job. Confirmation is required only for jobs created through the Amazon S3 console.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param confirmationRequired <p>Indicates whether confirmation is required before Amazon S3 begins running the specified job. Confirmation is required only for jobs created through the Amazon S3 console.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobDescriptor withConfirmationRequired(Boolean confirmationRequired) {
        this.confirmationRequired = confirmationRequired;
        return this;
    }

    /**
     * <p>The description for this job, if one was provided in this job's <code>Create Job</code> request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>The description for this job, if one was provided in this job's <code>Create Job</code> request.</p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>The description for this job, if one was provided in this job's <code>Create Job</code> request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param description <p>The description for this job, if one was provided in this job's <code>Create Job</code> request.</p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>The description for this job, if one was provided in this job's <code>Create Job</code> request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param description <p>The description for this job, if one was provided in this job's <code>Create Job</code> request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobDescriptor withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>The Amazon Resource Name (ARN) for this job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>arn:[^:]+:s3:[a-zA-Z0-9\-]+:\d{12}:job\/.*<br/>
     *
     * @return <p>The Amazon Resource Name (ARN) for this job.</p>
     */
    public String getJobArn() {
        return jobArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) for this job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>arn:[^:]+:s3:[a-zA-Z0-9\-]+:\d{12}:job\/.*<br/>
     *
     * @param jobArn <p>The Amazon Resource Name (ARN) for this job.</p>
     */
    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) for this job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>arn:[^:]+:s3:[a-zA-Z0-9\-]+:\d{12}:job\/.*<br/>
     *
     * @param jobArn <p>The Amazon Resource Name (ARN) for this job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobDescriptor withJobArn(String jobArn) {
        this.jobArn = jobArn;
        return this;
    }

    /**
     * <p>The current status of the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended
     *
     * @return <p>The current status of the specified job.</p>
     *
     * @see JobStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>The current status of the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended
     *
     * @param status <p>The current status of the specified job.</p>
     *
     * @see JobStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>The current status of the specified job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended
     *
     * @param status <p>The current status of the specified job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see JobStatus
     */
    public JobDescriptor withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>The current status of the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended
     *
     * @param status <p>The current status of the specified job.</p>
     *
     * @see JobStatus
     */
    public void setStatus(JobStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>The current status of the specified job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended
     *
     * @param status <p>The current status of the specified job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see JobStatus
     */
    public JobDescriptor withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>The configuration information for the specified job's manifest object.</p>
     *
     * @return <p>The configuration information for the specified job's manifest object.</p>
     */
    public JobManifest getManifest() {
        return manifest;
    }

    /**
     * <p>The configuration information for the specified job's manifest object.</p>
     *
     * @param manifest <p>The configuration information for the specified job's manifest object.</p>
     */
    public void setManifest(JobManifest manifest) {
        this.manifest = manifest;
    }

    /**
     * <p>The configuration information for the specified job's manifest object.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param manifest <p>The configuration information for the specified job's manifest object.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobDescriptor withManifest(JobManifest manifest) {
        this.manifest = manifest;
        return this;
    }

    /**
     * <p>The operation that the specified job is configured to execute on the objects listed in the manifest.</p>
     *
     * @return <p>The operation that the specified job is configured to execute on the objects listed in the manifest.</p>
     */
    public JobOperation getOperation() {
        return operation;
    }

    /**
     * <p>The operation that the specified job is configured to execute on the objects listed in the manifest.</p>
     *
     * @param operation <p>The operation that the specified job is configured to execute on the objects listed in the manifest.</p>
     */
    public void setOperation(JobOperation operation) {
        this.operation = operation;
    }

    /**
     * <p>The operation that the specified job is configured to execute on the objects listed in the manifest.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param operation <p>The operation that the specified job is configured to execute on the objects listed in the manifest.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobDescriptor withOperation(JobOperation operation) {
        this.operation = operation;
        return this;
    }

    /**
     * <p>The priority of the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return <p>The priority of the specified job.</p>
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * <p>The priority of the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param priority <p>The priority of the specified job.</p>
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>The priority of the specified job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param priority <p>The priority of the specified job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobDescriptor withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * <p>Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and the number of tasks that failed.</p>
     *
     * @return <p>Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and the number of tasks that failed.</p>
     */
    public JobProgressSummary getProgressSummary() {
        return progressSummary;
    }

    /**
     * <p>Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and the number of tasks that failed.</p>
     *
     * @param progressSummary <p>Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and the number of tasks that failed.</p>
     */
    public void setProgressSummary(JobProgressSummary progressSummary) {
        this.progressSummary = progressSummary;
    }

    /**
     * <p>Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and the number of tasks that failed.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param progressSummary <p>Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and the number of tasks that failed.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobDescriptor withProgressSummary(JobProgressSummary progressSummary) {
        this.progressSummary = progressSummary;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p/>
     */
    public String getStatusUpdateReason() {
        return statusUpdateReason;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param statusUpdateReason <p/>
     */
    public void setStatusUpdateReason(String statusUpdateReason) {
        this.statusUpdateReason = statusUpdateReason;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param statusUpdateReason <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobDescriptor withStatusUpdateReason(String statusUpdateReason) {
        this.statusUpdateReason = statusUpdateReason;
        return this;
    }

    /**
     * <p>If the specified job failed, this field contains information describing the failure.</p>
     *
     * @return <p>If the specified job failed, this field contains information describing the failure.</p>
     */
    public java.util.List<JobFailure> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>If the specified job failed, this field contains information describing the failure.</p>
     *
     * @param failureReasons <p>If the specified job failed, this field contains information describing the failure.</p>
     */
    public void setFailureReasons(java.util.Collection<JobFailure> failureReasons) {
        if (failureReasons == null) {
            this.failureReasons = null;
            return;
        }

        this.failureReasons = new java.util.ArrayList<JobFailure>(failureReasons);
    }

    /**
     * <p>If the specified job failed, this field contains information describing the failure.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failureReasons <p>If the specified job failed, this field contains information describing the failure.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobDescriptor withFailureReasons(JobFailure... failureReasons) {
        if (getFailureReasons() == null) {
            this.failureReasons = new java.util.ArrayList<JobFailure>(failureReasons.length);
        }
        for (JobFailure value : failureReasons) {
            this.failureReasons.add(value);
        }
        return this;
    }

    /**
     * <p>If the specified job failed, this field contains information describing the failure.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failureReasons <p>If the specified job failed, this field contains information describing the failure.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobDescriptor withFailureReasons(java.util.Collection<JobFailure> failureReasons) {
        setFailureReasons(failureReasons);
        return this;
    }

    /**
     * <p>Contains the configuration information for the job-completion report if you requested one in the <code>Create Job</code> request.</p>
     *
     * @return <p>Contains the configuration information for the job-completion report if you requested one in the <code>Create Job</code> request.</p>
     */
    public JobReport getReport() {
        return report;
    }

    /**
     * <p>Contains the configuration information for the job-completion report if you requested one in the <code>Create Job</code> request.</p>
     *
     * @param report <p>Contains the configuration information for the job-completion report if you requested one in the <code>Create Job</code> request.</p>
     */
    public void setReport(JobReport report) {
        this.report = report;
    }

    /**
     * <p>Contains the configuration information for the job-completion report if you requested one in the <code>Create Job</code> request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param report <p>Contains the configuration information for the job-completion report if you requested one in the <code>Create Job</code> request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobDescriptor withReport(JobReport report) {
        this.report = report;
        return this;
    }

    /**
     * <p>A timestamp indicating when this job was created.</p>
     *
     * @return <p>A timestamp indicating when this job was created.</p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>A timestamp indicating when this job was created.</p>
     *
     * @param creationTime <p>A timestamp indicating when this job was created.</p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>A timestamp indicating when this job was created.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationTime <p>A timestamp indicating when this job was created.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobDescriptor withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>A timestamp indicating when this job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.</p>
     *
     * @return <p>A timestamp indicating when this job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.</p>
     */
    public java.util.Date getTerminationDate() {
        return terminationDate;
    }

    /**
     * <p>A timestamp indicating when this job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.</p>
     *
     * @param terminationDate <p>A timestamp indicating when this job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.</p>
     */
    public void setTerminationDate(java.util.Date terminationDate) {
        this.terminationDate = terminationDate;
    }

    /**
     * <p>A timestamp indicating when this job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminationDate <p>A timestamp indicating when this job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobDescriptor withTerminationDate(java.util.Date terminationDate) {
        this.terminationDate = terminationDate;
        return this;
    }

    /**
     * <p>The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role assigned to execute the tasks for this job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>arn:[^:]+:iam::\d{12}:role/.*<br/>
     *
     * @return <p>The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role assigned to execute the tasks for this job.</p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role assigned to execute the tasks for this job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>arn:[^:]+:iam::\d{12}:role/.*<br/>
     *
     * @param roleArn <p>The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role assigned to execute the tasks for this job.</p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role assigned to execute the tasks for this job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>arn:[^:]+:iam::\d{12}:role/.*<br/>
     *
     * @param roleArn <p>The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role assigned to execute the tasks for this job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobDescriptor withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>The timestamp when this job was suspended, if it has been suspended.</p>
     *
     * @return <p>The timestamp when this job was suspended, if it has been suspended.</p>
     */
    public java.util.Date getSuspendedDate() {
        return suspendedDate;
    }

    /**
     * <p>The timestamp when this job was suspended, if it has been suspended.</p>
     *
     * @param suspendedDate <p>The timestamp when this job was suspended, if it has been suspended.</p>
     */
    public void setSuspendedDate(java.util.Date suspendedDate) {
        this.suspendedDate = suspendedDate;
    }

    /**
     * <p>The timestamp when this job was suspended, if it has been suspended.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param suspendedDate <p>The timestamp when this job was suspended, if it has been suspended.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobDescriptor withSuspendedDate(java.util.Date suspendedDate) {
        this.suspendedDate = suspendedDate;
        return this;
    }

    /**
     * <p>The reason why the specified job was suspended. A job is only suspended if you create it through the Amazon S3 console. When you create the job, it enters the <code>Suspended</code> state to await confirmation before running. After you confirm the job, it automatically exits the <code>Suspended</code> state.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>The reason why the specified job was suspended. A job is only suspended if you create it through the Amazon S3 console. When you create the job, it enters the <code>Suspended</code> state to await confirmation before running. After you confirm the job, it automatically exits the <code>Suspended</code> state.</p>
     */
    public String getSuspendedCause() {
        return suspendedCause;
    }

    /**
     * <p>The reason why the specified job was suspended. A job is only suspended if you create it through the Amazon S3 console. When you create the job, it enters the <code>Suspended</code> state to await confirmation before running. After you confirm the job, it automatically exits the <code>Suspended</code> state.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param suspendedCause <p>The reason why the specified job was suspended. A job is only suspended if you create it through the Amazon S3 console. When you create the job, it enters the <code>Suspended</code> state to await confirmation before running. After you confirm the job, it automatically exits the <code>Suspended</code> state.</p>
     */
    public void setSuspendedCause(String suspendedCause) {
        this.suspendedCause = suspendedCause;
    }

    /**
     * <p>The reason why the specified job was suspended. A job is only suspended if you create it through the Amazon S3 console. When you create the job, it enters the <code>Suspended</code> state to await confirmation before running. After you confirm the job, it automatically exits the <code>Suspended</code> state.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param suspendedCause <p>The reason why the specified job was suspended. A job is only suspended if you create it through the Amazon S3 console. When you create the job, it enters the <code>Suspended</code> state to await confirmation before running. After you confirm the job, it automatically exits the <code>Suspended</code> state.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobDescriptor withSuspendedCause(String suspendedCause) {
        this.suspendedCause = suspendedCause;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getJobId() != null) sb.append("JobId: " + getJobId() + ",");
        if (getConfirmationRequired() != null) sb.append("ConfirmationRequired: " + getConfirmationRequired() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getJobArn() != null) sb.append("JobArn: " + getJobArn() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getManifest() != null) sb.append("Manifest: " + getManifest() + ",");
        if (getOperation() != null) sb.append("Operation: " + getOperation() + ",");
        if (getPriority() != null) sb.append("Priority: " + getPriority() + ",");
        if (getProgressSummary() != null) sb.append("ProgressSummary: " + getProgressSummary() + ",");
        if (getStatusUpdateReason() != null) sb.append("StatusUpdateReason: " + getStatusUpdateReason() + ",");
        if (getFailureReasons() != null) sb.append("FailureReasons: " + getFailureReasons() + ",");
        if (getReport() != null) sb.append("Report: " + getReport() + ",");
        if (getCreationTime() != null) sb.append("CreationTime: " + getCreationTime() + ",");
        if (getTerminationDate() != null) sb.append("TerminationDate: " + getTerminationDate() + ",");
        if (getRoleArn() != null) sb.append("RoleArn: " + getRoleArn() + ",");
        if (getSuspendedDate() != null) sb.append("SuspendedDate: " + getSuspendedDate() + ",");
        if (getSuspendedCause() != null) sb.append("SuspendedCause: " + getSuspendedCause());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getConfirmationRequired() == null) ? 0 : getConfirmationRequired().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getManifest() == null) ? 0 : getManifest().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getProgressSummary() == null) ? 0 : getProgressSummary().hashCode());
        hashCode = prime * hashCode + ((getStatusUpdateReason() == null) ? 0 : getStatusUpdateReason().hashCode());
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        hashCode = prime * hashCode + ((getReport() == null) ? 0 : getReport().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTerminationDate() == null) ? 0 : getTerminationDate().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSuspendedDate() == null) ? 0 : getSuspendedDate().hashCode());
        hashCode = prime * hashCode + ((getSuspendedCause() == null) ? 0 : getSuspendedCause().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof JobDescriptor == false) return false;
        JobDescriptor other = (JobDescriptor)obj;

        if (other.getJobId() == null ^ this.getJobId() == null) return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false) return false;
        if (other.getConfirmationRequired() == null ^ this.getConfirmationRequired() == null) return false;
        if (other.getConfirmationRequired() != null && other.getConfirmationRequired().equals(this.getConfirmationRequired()) == false) return false;
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false;
        if (other.getJobArn() == null ^ this.getJobArn() == null) return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false) return false;
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false;
        if (other.getManifest() == null ^ this.getManifest() == null) return false;
        if (other.getManifest() != null && other.getManifest().equals(this.getManifest()) == false) return false;
        if (other.getOperation() == null ^ this.getOperation() == null) return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false) return false;
        if (other.getPriority() == null ^ this.getPriority() == null) return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false) return false;
        if (other.getProgressSummary() == null ^ this.getProgressSummary() == null) return false;
        if (other.getProgressSummary() != null && other.getProgressSummary().equals(this.getProgressSummary()) == false) return false;
        if (other.getStatusUpdateReason() == null ^ this.getStatusUpdateReason() == null) return false;
        if (other.getStatusUpdateReason() != null && other.getStatusUpdateReason().equals(this.getStatusUpdateReason()) == false) return false;
        if (other.getFailureReasons() == null ^ this.getFailureReasons() == null) return false;
        if (other.getFailureReasons() != null && other.getFailureReasons().equals(this.getFailureReasons()) == false) return false;
        if (other.getReport() == null ^ this.getReport() == null) return false;
        if (other.getReport() != null && other.getReport().equals(this.getReport()) == false) return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null) return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false) return false;
        if (other.getTerminationDate() == null ^ this.getTerminationDate() == null) return false;
        if (other.getTerminationDate() != null && other.getTerminationDate().equals(this.getTerminationDate()) == false) return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false;
        if (other.getSuspendedDate() == null ^ this.getSuspendedDate() == null) return false;
        if (other.getSuspendedDate() != null && other.getSuspendedDate().equals(this.getSuspendedDate()) == false) return false;
        if (other.getSuspendedCause() == null ^ this.getSuspendedCause() == null) return false;
        if (other.getSuspendedCause() != null && other.getSuspendedCause().equals(this.getSuspendedCause()) == false) return false;
        return true;
    }
}
