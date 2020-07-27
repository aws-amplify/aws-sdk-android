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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>Information about a task execution performed as part of a maintenance window execution.</p>
 */
public class MaintenanceWindowExecutionTaskIdentity implements Serializable {
    /**
     * <p>The ID of the maintenance window execution that ran the task.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     */
    private String windowExecutionId;

    /**
     * <p>The ID of the specific task execution in the maintenance window execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     */
    private String taskExecutionId;

    /**
     * <p>The status of the task execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     */
    private String status;

    /**
     * <p>The details explaining the status of the task execution. Only available for certain status values.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 250<br/>
     */
    private String statusDetails;

    /**
     * <p>The time the task execution started.</p>
     */
    private java.util.Date startTime;

    /**
     * <p>The time the task execution finished.</p>
     */
    private java.util.Date endTime;

    /**
     * <p>The ARN of the task that ran.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     */
    private String taskArn;

    /**
     * <p>The type of task that ran.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     */
    private String taskType;

    /**
     * <p>The ID of the maintenance window execution that ran the task.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @return <p>The ID of the maintenance window execution that ran the task.</p>
     */
    public String getWindowExecutionId() {
        return windowExecutionId;
    }

    /**
     * <p>The ID of the maintenance window execution that ran the task.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param windowExecutionId <p>The ID of the maintenance window execution that ran the task.</p>
     */
    public void setWindowExecutionId(String windowExecutionId) {
        this.windowExecutionId = windowExecutionId;
    }

    /**
     * <p>The ID of the maintenance window execution that ran the task.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param windowExecutionId <p>The ID of the maintenance window execution that ran the task.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MaintenanceWindowExecutionTaskIdentity withWindowExecutionId(String windowExecutionId) {
        this.windowExecutionId = windowExecutionId;
        return this;
    }

    /**
     * <p>The ID of the specific task execution in the maintenance window execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @return <p>The ID of the specific task execution in the maintenance window execution.</p>
     */
    public String getTaskExecutionId() {
        return taskExecutionId;
    }

    /**
     * <p>The ID of the specific task execution in the maintenance window execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param taskExecutionId <p>The ID of the specific task execution in the maintenance window execution.</p>
     */
    public void setTaskExecutionId(String taskExecutionId) {
        this.taskExecutionId = taskExecutionId;
    }

    /**
     * <p>The ID of the specific task execution in the maintenance window execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param taskExecutionId <p>The ID of the specific task execution in the maintenance window execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MaintenanceWindowExecutionTaskIdentity withTaskExecutionId(String taskExecutionId) {
        this.taskExecutionId = taskExecutionId;
        return this;
    }

    /**
     * <p>The status of the task execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     *
     * @return <p>The status of the task execution.</p>
     *
     * @see MaintenanceWindowExecutionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>The status of the task execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     *
     * @param status <p>The status of the task execution.</p>
     *
     * @see MaintenanceWindowExecutionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>The status of the task execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     *
     * @param status <p>The status of the task execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MaintenanceWindowExecutionStatus
     */
    public MaintenanceWindowExecutionTaskIdentity withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>The status of the task execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     *
     * @param status <p>The status of the task execution.</p>
     *
     * @see MaintenanceWindowExecutionStatus
     */
    public void setStatus(MaintenanceWindowExecutionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>The status of the task execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     *
     * @param status <p>The status of the task execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MaintenanceWindowExecutionStatus
     */
    public MaintenanceWindowExecutionTaskIdentity withStatus(MaintenanceWindowExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>The details explaining the status of the task execution. Only available for certain status values.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 250<br/>
     *
     * @return <p>The details explaining the status of the task execution. Only available for certain status values.</p>
     */
    public String getStatusDetails() {
        return statusDetails;
    }

    /**
     * <p>The details explaining the status of the task execution. Only available for certain status values.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 250<br/>
     *
     * @param statusDetails <p>The details explaining the status of the task execution. Only available for certain status values.</p>
     */
    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>The details explaining the status of the task execution. Only available for certain status values.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 250<br/>
     *
     * @param statusDetails <p>The details explaining the status of the task execution. Only available for certain status values.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MaintenanceWindowExecutionTaskIdentity withStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * <p>The time the task execution started.</p>
     *
     * @return <p>The time the task execution started.</p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>The time the task execution started.</p>
     *
     * @param startTime <p>The time the task execution started.</p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>The time the task execution started.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime <p>The time the task execution started.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MaintenanceWindowExecutionTaskIdentity withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>The time the task execution finished.</p>
     *
     * @return <p>The time the task execution finished.</p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>The time the task execution finished.</p>
     *
     * @param endTime <p>The time the task execution finished.</p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>The time the task execution finished.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime <p>The time the task execution finished.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MaintenanceWindowExecutionTaskIdentity withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>The ARN of the task that ran.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     *
     * @return <p>The ARN of the task that ran.</p>
     */
    public String getTaskArn() {
        return taskArn;
    }

    /**
     * <p>The ARN of the task that ran.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     *
     * @param taskArn <p>The ARN of the task that ran.</p>
     */
    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>The ARN of the task that ran.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     *
     * @param taskArn <p>The ARN of the task that ran.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MaintenanceWindowExecutionTaskIdentity withTaskArn(String taskArn) {
        this.taskArn = taskArn;
        return this;
    }

    /**
     * <p>The type of task that ran.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     *
     * @return <p>The type of task that ran.</p>
     *
     * @see MaintenanceWindowTaskType
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * <p>The type of task that ran.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     *
     * @param taskType <p>The type of task that ran.</p>
     *
     * @see MaintenanceWindowTaskType
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * <p>The type of task that ran.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     *
     * @param taskType <p>The type of task that ran.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MaintenanceWindowTaskType
     */
    public MaintenanceWindowExecutionTaskIdentity withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * <p>The type of task that ran.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     *
     * @param taskType <p>The type of task that ran.</p>
     *
     * @see MaintenanceWindowTaskType
     */
    public void setTaskType(MaintenanceWindowTaskType taskType) {
        this.taskType = taskType.toString();
    }

    /**
     * <p>The type of task that ran.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     *
     * @param taskType <p>The type of task that ran.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MaintenanceWindowTaskType
     */
    public MaintenanceWindowExecutionTaskIdentity withTaskType(MaintenanceWindowTaskType taskType) {
        this.taskType = taskType.toString();
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
        if (getWindowExecutionId() != null) sb.append("WindowExecutionId: " + getWindowExecutionId() + ",");
        if (getTaskExecutionId() != null) sb.append("TaskExecutionId: " + getTaskExecutionId() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getStatusDetails() != null) sb.append("StatusDetails: " + getStatusDetails() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("EndTime: " + getEndTime() + ",");
        if (getTaskArn() != null) sb.append("TaskArn: " + getTaskArn() + ",");
        if (getTaskType() != null) sb.append("TaskType: " + getTaskType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowExecutionId() == null) ? 0 : getWindowExecutionId().hashCode());
        hashCode = prime * hashCode + ((getTaskExecutionId() == null) ? 0 : getTaskExecutionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof MaintenanceWindowExecutionTaskIdentity == false) return false;
        MaintenanceWindowExecutionTaskIdentity other = (MaintenanceWindowExecutionTaskIdentity)obj;

        if (other.getWindowExecutionId() == null ^ this.getWindowExecutionId() == null) return false;
        if (other.getWindowExecutionId() != null && other.getWindowExecutionId().equals(this.getWindowExecutionId()) == false) return false;
        if (other.getTaskExecutionId() == null ^ this.getTaskExecutionId() == null) return false;
        if (other.getTaskExecutionId() != null && other.getTaskExecutionId().equals(this.getTaskExecutionId()) == false) return false;
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null) return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false) return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null) return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false) return false;
        if (other.getTaskType() == null ^ this.getTaskType() == null) return false;
        if (other.getTaskType() != null && other.getTaskType().equals(this.getTaskType()) == false) return false;
        return true;
    }
}
