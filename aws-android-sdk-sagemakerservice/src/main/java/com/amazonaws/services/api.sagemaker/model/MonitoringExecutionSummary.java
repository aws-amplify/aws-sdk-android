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

/**
 * <p>
 * Summary of information about the last monitoring job to run.
 * </p>
 */
public class MonitoringExecutionSummary implements Serializable {
    /**
     * <p>
     * The name of the monitoring schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String monitoringScheduleName;

    /**
     * <p>
     * The time the monitoring job was scheduled.
     * </p>
     */
    private java.util.Date scheduledTime;

    /**
     * <p>
     * The time at which the monitoring job was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * A timestamp that indicates the last time the monitoring job was modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The status of the monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Completed, CompletedWithViolations,
     * InProgress, Failed, Stopping, Stopped
     */
    private String monitoringExecutionStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:processing-job/.*
     * <br/>
     */
    private String processingJobArn;

    /**
     * <p>
     * The name of teh endpoint used to run the monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String endpointName;

    /**
     * <p>
     * Contains the reason a monitoring job failed, if it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the monitoring schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the monitoring schedule.
     *         </p>
     */
    public String getMonitoringScheduleName() {
        return monitoringScheduleName;
    }

    /**
     * <p>
     * The name of the monitoring schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param monitoringScheduleName <p>
     *            The name of the monitoring schedule.
     *            </p>
     */
    public void setMonitoringScheduleName(String monitoringScheduleName) {
        this.monitoringScheduleName = monitoringScheduleName;
    }

    /**
     * <p>
     * The name of the monitoring schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param monitoringScheduleName <p>
     *            The name of the monitoring schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringExecutionSummary withMonitoringScheduleName(String monitoringScheduleName) {
        this.monitoringScheduleName = monitoringScheduleName;
        return this;
    }

    /**
     * <p>
     * The time the monitoring job was scheduled.
     * </p>
     *
     * @return <p>
     *         The time the monitoring job was scheduled.
     *         </p>
     */
    public java.util.Date getScheduledTime() {
        return scheduledTime;
    }

    /**
     * <p>
     * The time the monitoring job was scheduled.
     * </p>
     *
     * @param scheduledTime <p>
     *            The time the monitoring job was scheduled.
     *            </p>
     */
    public void setScheduledTime(java.util.Date scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    /**
     * <p>
     * The time the monitoring job was scheduled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledTime <p>
     *            The time the monitoring job was scheduled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringExecutionSummary withScheduledTime(java.util.Date scheduledTime) {
        this.scheduledTime = scheduledTime;
        return this;
    }

    /**
     * <p>
     * The time at which the monitoring job was created.
     * </p>
     *
     * @return <p>
     *         The time at which the monitoring job was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time at which the monitoring job was created.
     * </p>
     *
     * @param creationTime <p>
     *            The time at which the monitoring job was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the monitoring job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time at which the monitoring job was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringExecutionSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates the last time the monitoring job was modified.
     * </p>
     *
     * @return <p>
     *         A timestamp that indicates the last time the monitoring job was
     *         modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that indicates the last time the monitoring job was modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            A timestamp that indicates the last time the monitoring job
     *            was modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that indicates the last time the monitoring job was modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            A timestamp that indicates the last time the monitoring job
     *            was modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringExecutionSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The status of the monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Completed, CompletedWithViolations,
     * InProgress, Failed, Stopping, Stopped
     *
     * @return <p>
     *         The status of the monitoring job.
     *         </p>
     * @see ExecutionStatus
     */
    public String getMonitoringExecutionStatus() {
        return monitoringExecutionStatus;
    }

    /**
     * <p>
     * The status of the monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Completed, CompletedWithViolations,
     * InProgress, Failed, Stopping, Stopped
     *
     * @param monitoringExecutionStatus <p>
     *            The status of the monitoring job.
     *            </p>
     * @see ExecutionStatus
     */
    public void setMonitoringExecutionStatus(String monitoringExecutionStatus) {
        this.monitoringExecutionStatus = monitoringExecutionStatus;
    }

    /**
     * <p>
     * The status of the monitoring job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Completed, CompletedWithViolations,
     * InProgress, Failed, Stopping, Stopped
     *
     * @param monitoringExecutionStatus <p>
     *            The status of the monitoring job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExecutionStatus
     */
    public MonitoringExecutionSummary withMonitoringExecutionStatus(String monitoringExecutionStatus) {
        this.monitoringExecutionStatus = monitoringExecutionStatus;
        return this;
    }

    /**
     * <p>
     * The status of the monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Completed, CompletedWithViolations,
     * InProgress, Failed, Stopping, Stopped
     *
     * @param monitoringExecutionStatus <p>
     *            The status of the monitoring job.
     *            </p>
     * @see ExecutionStatus
     */
    public void setMonitoringExecutionStatus(ExecutionStatus monitoringExecutionStatus) {
        this.monitoringExecutionStatus = monitoringExecutionStatus.toString();
    }

    /**
     * <p>
     * The status of the monitoring job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Completed, CompletedWithViolations,
     * InProgress, Failed, Stopping, Stopped
     *
     * @param monitoringExecutionStatus <p>
     *            The status of the monitoring job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExecutionStatus
     */
    public MonitoringExecutionSummary withMonitoringExecutionStatus(
            ExecutionStatus monitoringExecutionStatus) {
        this.monitoringExecutionStatus = monitoringExecutionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:processing-job/.*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the monitoring job.
     *         </p>
     */
    public String getProcessingJobArn() {
        return processingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:processing-job/.*
     * <br/>
     *
     * @param processingJobArn <p>
     *            The Amazon Resource Name (ARN) of the monitoring job.
     *            </p>
     */
    public void setProcessingJobArn(String processingJobArn) {
        this.processingJobArn = processingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:processing-job/.*
     * <br/>
     *
     * @param processingJobArn <p>
     *            The Amazon Resource Name (ARN) of the monitoring job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringExecutionSummary withProcessingJobArn(String processingJobArn) {
        this.processingJobArn = processingJobArn;
        return this;
    }

    /**
     * <p>
     * The name of teh endpoint used to run the monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of teh endpoint used to run the monitoring job.
     *         </p>
     */
    public String getEndpointName() {
        return endpointName;
    }

    /**
     * <p>
     * The name of teh endpoint used to run the monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointName <p>
     *            The name of teh endpoint used to run the monitoring job.
     *            </p>
     */
    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of teh endpoint used to run the monitoring job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointName <p>
     *            The name of teh endpoint used to run the monitoring job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringExecutionSummary withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * <p>
     * Contains the reason a monitoring job failed, if it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         Contains the reason a monitoring job failed, if it failed.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * Contains the reason a monitoring job failed, if it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            Contains the reason a monitoring job failed, if it failed.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * Contains the reason a monitoring job failed, if it failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            Contains the reason a monitoring job failed, if it failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringExecutionSummary withFailureReason(String failureReason) {
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
        if (getMonitoringScheduleName() != null)
            sb.append("MonitoringScheduleName: " + getMonitoringScheduleName() + ",");
        if (getScheduledTime() != null)
            sb.append("ScheduledTime: " + getScheduledTime() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getMonitoringExecutionStatus() != null)
            sb.append("MonitoringExecutionStatus: " + getMonitoringExecutionStatus() + ",");
        if (getProcessingJobArn() != null)
            sb.append("ProcessingJobArn: " + getProcessingJobArn() + ",");
        if (getEndpointName() != null)
            sb.append("EndpointName: " + getEndpointName() + ",");
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
                + ((getMonitoringScheduleName() == null) ? 0 : getMonitoringScheduleName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getScheduledTime() == null) ? 0 : getScheduledTime().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getMonitoringExecutionStatus() == null) ? 0 : getMonitoringExecutionStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getProcessingJobArn() == null) ? 0 : getProcessingJobArn().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
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

        if (obj instanceof MonitoringExecutionSummary == false)
            return false;
        MonitoringExecutionSummary other = (MonitoringExecutionSummary) obj;

        if (other.getMonitoringScheduleName() == null ^ this.getMonitoringScheduleName() == null)
            return false;
        if (other.getMonitoringScheduleName() != null
                && other.getMonitoringScheduleName().equals(this.getMonitoringScheduleName()) == false)
            return false;
        if (other.getScheduledTime() == null ^ this.getScheduledTime() == null)
            return false;
        if (other.getScheduledTime() != null
                && other.getScheduledTime().equals(this.getScheduledTime()) == false)
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
        if (other.getMonitoringExecutionStatus() == null
                ^ this.getMonitoringExecutionStatus() == null)
            return false;
        if (other.getMonitoringExecutionStatus() != null
                && other.getMonitoringExecutionStatus().equals(this.getMonitoringExecutionStatus()) == false)
            return false;
        if (other.getProcessingJobArn() == null ^ this.getProcessingJobArn() == null)
            return false;
        if (other.getProcessingJobArn() != null
                && other.getProcessingJobArn().equals(this.getProcessingJobArn()) == false)
            return false;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null
                && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }
}
