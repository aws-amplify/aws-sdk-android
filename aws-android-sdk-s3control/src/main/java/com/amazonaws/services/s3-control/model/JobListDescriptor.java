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
 * <p>Contains the configuration and status information for a single job retrieved as part of a job list.</p>
 */
public class JobListDescriptor implements Serializable {
    /**
     * <p>The ID for the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-\_]+<br/>
     */
    private String jobId;

    /**
     * <p>The user-specified description that was included in the specified job's <code>Create Job</code> request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String description;

    /**
     * <p>The operation that the specified job is configured to run on each object listed in the manifest.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LambdaInvoke, S3PutObjectCopy, S3PutObjectAcl, S3PutObjectTagging, S3InitiateRestoreObject, S3PutObjectLegalHold, S3PutObjectRetention
     */
    private String operation;

    /**
     * <p>The current priority for the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer priority;

    /**
     * <p>The specified job's current status.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended
     */
    private String status;

    /**
     * <p>A timestamp indicating when the specified job was created.</p>
     */
    private java.util.Date creationTime;

    /**
     * <p>A timestamp indicating when the specified job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.</p>
     */
    private java.util.Date terminationDate;

    /**
     * <p>Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and the number of tasks that failed.</p>
     */
    private JobProgressSummary progressSummary;

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
    public JobListDescriptor withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>The user-specified description that was included in the specified job's <code>Create Job</code> request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>The user-specified description that was included in the specified job's <code>Create Job</code> request.</p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>The user-specified description that was included in the specified job's <code>Create Job</code> request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param description <p>The user-specified description that was included in the specified job's <code>Create Job</code> request.</p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>The user-specified description that was included in the specified job's <code>Create Job</code> request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param description <p>The user-specified description that was included in the specified job's <code>Create Job</code> request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobListDescriptor withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>The operation that the specified job is configured to run on each object listed in the manifest.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LambdaInvoke, S3PutObjectCopy, S3PutObjectAcl, S3PutObjectTagging, S3InitiateRestoreObject, S3PutObjectLegalHold, S3PutObjectRetention
     *
     * @return <p>The operation that the specified job is configured to run on each object listed in the manifest.</p>
     *
     * @see OperationName
     */
    public String getOperation() {
        return operation;
    }

    /**
     * <p>The operation that the specified job is configured to run on each object listed in the manifest.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LambdaInvoke, S3PutObjectCopy, S3PutObjectAcl, S3PutObjectTagging, S3InitiateRestoreObject, S3PutObjectLegalHold, S3PutObjectRetention
     *
     * @param operation <p>The operation that the specified job is configured to run on each object listed in the manifest.</p>
     *
     * @see OperationName
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>The operation that the specified job is configured to run on each object listed in the manifest.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LambdaInvoke, S3PutObjectCopy, S3PutObjectAcl, S3PutObjectTagging, S3InitiateRestoreObject, S3PutObjectLegalHold, S3PutObjectRetention
     *
     * @param operation <p>The operation that the specified job is configured to run on each object listed in the manifest.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see OperationName
     */
    public JobListDescriptor withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * <p>The operation that the specified job is configured to run on each object listed in the manifest.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LambdaInvoke, S3PutObjectCopy, S3PutObjectAcl, S3PutObjectTagging, S3InitiateRestoreObject, S3PutObjectLegalHold, S3PutObjectRetention
     *
     * @param operation <p>The operation that the specified job is configured to run on each object listed in the manifest.</p>
     *
     * @see OperationName
     */
    public void setOperation(OperationName operation) {
        this.operation = operation.toString();
    }

    /**
     * <p>The operation that the specified job is configured to run on each object listed in the manifest.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LambdaInvoke, S3PutObjectCopy, S3PutObjectAcl, S3PutObjectTagging, S3InitiateRestoreObject, S3PutObjectLegalHold, S3PutObjectRetention
     *
     * @param operation <p>The operation that the specified job is configured to run on each object listed in the manifest.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see OperationName
     */
    public JobListDescriptor withOperation(OperationName operation) {
        this.operation = operation.toString();
        return this;
    }

    /**
     * <p>The current priority for the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return <p>The current priority for the specified job.</p>
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * <p>The current priority for the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param priority <p>The current priority for the specified job.</p>
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>The current priority for the specified job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param priority <p>The current priority for the specified job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobListDescriptor withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * <p>The specified job's current status.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended
     *
     * @return <p>The specified job's current status.</p>
     *
     * @see JobStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>The specified job's current status.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended
     *
     * @param status <p>The specified job's current status.</p>
     *
     * @see JobStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>The specified job's current status.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended
     *
     * @param status <p>The specified job's current status.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see JobStatus
     */
    public JobListDescriptor withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>The specified job's current status.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended
     *
     * @param status <p>The specified job's current status.</p>
     *
     * @see JobStatus
     */
    public void setStatus(JobStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>The specified job's current status.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended
     *
     * @param status <p>The specified job's current status.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see JobStatus
     */
    public JobListDescriptor withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>A timestamp indicating when the specified job was created.</p>
     *
     * @return <p>A timestamp indicating when the specified job was created.</p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>A timestamp indicating when the specified job was created.</p>
     *
     * @param creationTime <p>A timestamp indicating when the specified job was created.</p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>A timestamp indicating when the specified job was created.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationTime <p>A timestamp indicating when the specified job was created.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobListDescriptor withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>A timestamp indicating when the specified job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.</p>
     *
     * @return <p>A timestamp indicating when the specified job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.</p>
     */
    public java.util.Date getTerminationDate() {
        return terminationDate;
    }

    /**
     * <p>A timestamp indicating when the specified job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.</p>
     *
     * @param terminationDate <p>A timestamp indicating when the specified job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.</p>
     */
    public void setTerminationDate(java.util.Date terminationDate) {
        this.terminationDate = terminationDate;
    }

    /**
     * <p>A timestamp indicating when the specified job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminationDate <p>A timestamp indicating when the specified job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobListDescriptor withTerminationDate(java.util.Date terminationDate) {
        this.terminationDate = terminationDate;
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
    public JobListDescriptor withProgressSummary(JobProgressSummary progressSummary) {
        this.progressSummary = progressSummary;
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
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getOperation() != null) sb.append("Operation: " + getOperation() + ",");
        if (getPriority() != null) sb.append("Priority: " + getPriority() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getCreationTime() != null) sb.append("CreationTime: " + getCreationTime() + ",");
        if (getTerminationDate() != null) sb.append("TerminationDate: " + getTerminationDate() + ",");
        if (getProgressSummary() != null) sb.append("ProgressSummary: " + getProgressSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTerminationDate() == null) ? 0 : getTerminationDate().hashCode());
        hashCode = prime * hashCode + ((getProgressSummary() == null) ? 0 : getProgressSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof JobListDescriptor == false) return false;
        JobListDescriptor other = (JobListDescriptor)obj;

        if (other.getJobId() == null ^ this.getJobId() == null) return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false) return false;
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false;
        if (other.getOperation() == null ^ this.getOperation() == null) return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false) return false;
        if (other.getPriority() == null ^ this.getPriority() == null) return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false) return false;
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null) return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false) return false;
        if (other.getTerminationDate() == null ^ this.getTerminationDate() == null) return false;
        if (other.getTerminationDate() != null && other.getTerminationDate().equals(this.getTerminationDate()) == false) return false;
        if (other.getProgressSummary() == null ^ this.getProgressSummary() == null) return false;
        if (other.getProgressSummary() != null && other.getProgressSummary().equals(this.getProgressSummary()) == false) return false;
        return true;
    }
}
