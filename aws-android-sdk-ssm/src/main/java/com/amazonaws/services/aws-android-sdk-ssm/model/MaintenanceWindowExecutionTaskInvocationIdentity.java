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
 * <p>Describes the information about a task invocation for a particular target as part of a task execution performed as part of a maintenance window execution.</p>
 */
public class MaintenanceWindowExecutionTaskInvocationIdentity implements Serializable {
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
     * <p>The ID of the task invocation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     */
    private String invocationId;

    /**
     * <p>The ID of the action performed in the service that actually handled the task invocation. If the task type is RUN_COMMAND, this value is the command ID.</p>
     */
    private String executionId;

    /**
     * <p>The task type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     */
    private String taskType;

    /**
     * <p>The parameters that were provided for the invocation when it was run.</p>
     */
    private String parameters;

    /**
     * <p>The status of the task invocation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     */
    private String status;

    /**
     * <p>The details explaining the status of the task invocation. Only available for certain Status values. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 250<br/>
     */
    private String statusDetails;

    /**
     * <p>The time the invocation started.</p>
     */
    private java.util.Date startTime;

    /**
     * <p>The time the invocation finished.</p>
     */
    private java.util.Date endTime;

    /**
     * <p>User-provided value that was specified when the target was registered with the maintenance window. This was also included in any CloudWatch events raised during the task invocation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String ownerInformation;

    /**
     * <p>The ID of the target definition in this maintenance window the invocation was performed for.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 36<br/>
     */
    private String windowTargetId;

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
    public MaintenanceWindowExecutionTaskInvocationIdentity withWindowExecutionId(String windowExecutionId) {
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
    public MaintenanceWindowExecutionTaskInvocationIdentity withTaskExecutionId(String taskExecutionId) {
        this.taskExecutionId = taskExecutionId;
        return this;
    }

    /**
     * <p>The ID of the task invocation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @return <p>The ID of the task invocation.</p>
     */
    public String getInvocationId() {
        return invocationId;
    }

    /**
     * <p>The ID of the task invocation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param invocationId <p>The ID of the task invocation.</p>
     */
    public void setInvocationId(String invocationId) {
        this.invocationId = invocationId;
    }

    /**
     * <p>The ID of the task invocation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param invocationId <p>The ID of the task invocation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MaintenanceWindowExecutionTaskInvocationIdentity withInvocationId(String invocationId) {
        this.invocationId = invocationId;
        return this;
    }

    /**
     * <p>The ID of the action performed in the service that actually handled the task invocation. If the task type is RUN_COMMAND, this value is the command ID.</p>
     *
     * @return <p>The ID of the action performed in the service that actually handled the task invocation. If the task type is RUN_COMMAND, this value is the command ID.</p>
     */
    public String getExecutionId() {
        return executionId;
    }

    /**
     * <p>The ID of the action performed in the service that actually handled the task invocation. If the task type is RUN_COMMAND, this value is the command ID.</p>
     *
     * @param executionId <p>The ID of the action performed in the service that actually handled the task invocation. If the task type is RUN_COMMAND, this value is the command ID.</p>
     */
    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>The ID of the action performed in the service that actually handled the task invocation. If the task type is RUN_COMMAND, this value is the command ID.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executionId <p>The ID of the action performed in the service that actually handled the task invocation. If the task type is RUN_COMMAND, this value is the command ID.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MaintenanceWindowExecutionTaskInvocationIdentity withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * <p>The task type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     *
     * @return <p>The task type.</p>
     *
     * @see MaintenanceWindowTaskType
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * <p>The task type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     *
     * @param taskType <p>The task type.</p>
     *
     * @see MaintenanceWindowTaskType
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * <p>The task type.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     *
     * @param taskType <p>The task type.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MaintenanceWindowTaskType
     */
    public MaintenanceWindowExecutionTaskInvocationIdentity withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * <p>The task type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     *
     * @param taskType <p>The task type.</p>
     *
     * @see MaintenanceWindowTaskType
     */
    public void setTaskType(MaintenanceWindowTaskType taskType) {
        this.taskType = taskType.toString();
    }

    /**
     * <p>The task type.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     *
     * @param taskType <p>The task type.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MaintenanceWindowTaskType
     */
    public MaintenanceWindowExecutionTaskInvocationIdentity withTaskType(MaintenanceWindowTaskType taskType) {
        this.taskType = taskType.toString();
        return this;
    }

    /**
     * <p>The parameters that were provided for the invocation when it was run.</p>
     *
     * @return <p>The parameters that were provided for the invocation when it was run.</p>
     */
    public String getParameters() {
        return parameters;
    }

    /**
     * <p>The parameters that were provided for the invocation when it was run.</p>
     *
     * @param parameters <p>The parameters that were provided for the invocation when it was run.</p>
     */
    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>The parameters that were provided for the invocation when it was run.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters <p>The parameters that were provided for the invocation when it was run.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MaintenanceWindowExecutionTaskInvocationIdentity withParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>The status of the task invocation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     *
     * @return <p>The status of the task invocation.</p>
     *
     * @see MaintenanceWindowExecutionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>The status of the task invocation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     *
     * @param status <p>The status of the task invocation.</p>
     *
     * @see MaintenanceWindowExecutionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>The status of the task invocation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     *
     * @param status <p>The status of the task invocation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MaintenanceWindowExecutionStatus
     */
    public MaintenanceWindowExecutionTaskInvocationIdentity withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>The status of the task invocation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     *
     * @param status <p>The status of the task invocation.</p>
     *
     * @see MaintenanceWindowExecutionStatus
     */
    public void setStatus(MaintenanceWindowExecutionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>The status of the task invocation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     *
     * @param status <p>The status of the task invocation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MaintenanceWindowExecutionStatus
     */
    public MaintenanceWindowExecutionTaskInvocationIdentity withStatus(MaintenanceWindowExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>The details explaining the status of the task invocation. Only available for certain Status values. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 250<br/>
     *
     * @return <p>The details explaining the status of the task invocation. Only available for certain Status values. </p>
     */
    public String getStatusDetails() {
        return statusDetails;
    }

    /**
     * <p>The details explaining the status of the task invocation. Only available for certain Status values. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 250<br/>
     *
     * @param statusDetails <p>The details explaining the status of the task invocation. Only available for certain Status values. </p>
     */
    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>The details explaining the status of the task invocation. Only available for certain Status values. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 250<br/>
     *
     * @param statusDetails <p>The details explaining the status of the task invocation. Only available for certain Status values. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MaintenanceWindowExecutionTaskInvocationIdentity withStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * <p>The time the invocation started.</p>
     *
     * @return <p>The time the invocation started.</p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>The time the invocation started.</p>
     *
     * @param startTime <p>The time the invocation started.</p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>The time the invocation started.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime <p>The time the invocation started.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MaintenanceWindowExecutionTaskInvocationIdentity withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>The time the invocation finished.</p>
     *
     * @return <p>The time the invocation finished.</p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>The time the invocation finished.</p>
     *
     * @param endTime <p>The time the invocation finished.</p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>The time the invocation finished.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime <p>The time the invocation finished.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MaintenanceWindowExecutionTaskInvocationIdentity withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>User-provided value that was specified when the target was registered with the maintenance window. This was also included in any CloudWatch events raised during the task invocation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>User-provided value that was specified when the target was registered with the maintenance window. This was also included in any CloudWatch events raised during the task invocation.</p>
     */
    public String getOwnerInformation() {
        return ownerInformation;
    }

    /**
     * <p>User-provided value that was specified when the target was registered with the maintenance window. This was also included in any CloudWatch events raised during the task invocation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param ownerInformation <p>User-provided value that was specified when the target was registered with the maintenance window. This was also included in any CloudWatch events raised during the task invocation.</p>
     */
    public void setOwnerInformation(String ownerInformation) {
        this.ownerInformation = ownerInformation;
    }

    /**
     * <p>User-provided value that was specified when the target was registered with the maintenance window. This was also included in any CloudWatch events raised during the task invocation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param ownerInformation <p>User-provided value that was specified when the target was registered with the maintenance window. This was also included in any CloudWatch events raised during the task invocation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MaintenanceWindowExecutionTaskInvocationIdentity withOwnerInformation(String ownerInformation) {
        this.ownerInformation = ownerInformation;
        return this;
    }

    /**
     * <p>The ID of the target definition in this maintenance window the invocation was performed for.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 36<br/>
     *
     * @return <p>The ID of the target definition in this maintenance window the invocation was performed for.</p>
     */
    public String getWindowTargetId() {
        return windowTargetId;
    }

    /**
     * <p>The ID of the target definition in this maintenance window the invocation was performed for.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 36<br/>
     *
     * @param windowTargetId <p>The ID of the target definition in this maintenance window the invocation was performed for.</p>
     */
    public void setWindowTargetId(String windowTargetId) {
        this.windowTargetId = windowTargetId;
    }

    /**
     * <p>The ID of the target definition in this maintenance window the invocation was performed for.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 36<br/>
     *
     * @param windowTargetId <p>The ID of the target definition in this maintenance window the invocation was performed for.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MaintenanceWindowExecutionTaskInvocationIdentity withWindowTargetId(String windowTargetId) {
        this.windowTargetId = windowTargetId;
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
        if (getInvocationId() != null) sb.append("InvocationId: " + getInvocationId() + ",");
        if (getExecutionId() != null) sb.append("ExecutionId: " + getExecutionId() + ",");
        if (getTaskType() != null) sb.append("TaskType: " + getTaskType() + ",");
        if (getParameters() != null) sb.append("Parameters: " + getParameters() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getStatusDetails() != null) sb.append("StatusDetails: " + getStatusDetails() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("EndTime: " + getEndTime() + ",");
        if (getOwnerInformation() != null) sb.append("OwnerInformation: " + getOwnerInformation() + ",");
        if (getWindowTargetId() != null) sb.append("WindowTargetId: " + getWindowTargetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowExecutionId() == null) ? 0 : getWindowExecutionId().hashCode());
        hashCode = prime * hashCode + ((getTaskExecutionId() == null) ? 0 : getTaskExecutionId().hashCode());
        hashCode = prime * hashCode + ((getInvocationId() == null) ? 0 : getInvocationId().hashCode());
        hashCode = prime * hashCode + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        hashCode = prime * hashCode + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getOwnerInformation() == null) ? 0 : getOwnerInformation().hashCode());
        hashCode = prime * hashCode + ((getWindowTargetId() == null) ? 0 : getWindowTargetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof MaintenanceWindowExecutionTaskInvocationIdentity == false) return false;
        MaintenanceWindowExecutionTaskInvocationIdentity other = (MaintenanceWindowExecutionTaskInvocationIdentity)obj;

        if (other.getWindowExecutionId() == null ^ this.getWindowExecutionId() == null) return false;
        if (other.getWindowExecutionId() != null && other.getWindowExecutionId().equals(this.getWindowExecutionId()) == false) return false;
        if (other.getTaskExecutionId() == null ^ this.getTaskExecutionId() == null) return false;
        if (other.getTaskExecutionId() != null && other.getTaskExecutionId().equals(this.getTaskExecutionId()) == false) return false;
        if (other.getInvocationId() == null ^ this.getInvocationId() == null) return false;
        if (other.getInvocationId() != null && other.getInvocationId().equals(this.getInvocationId()) == false) return false;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null) return false;
        if (other.getExecutionId() != null && other.getExecutionId().equals(this.getExecutionId()) == false) return false;
        if (other.getTaskType() == null ^ this.getTaskType() == null) return false;
        if (other.getTaskType() != null && other.getTaskType().equals(this.getTaskType()) == false) return false;
        if (other.getParameters() == null ^ this.getParameters() == null) return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false) return false;
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null) return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false) return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false;
        if (other.getOwnerInformation() == null ^ this.getOwnerInformation() == null) return false;
        if (other.getOwnerInformation() != null && other.getOwnerInformation().equals(this.getOwnerInformation()) == false) return false;
        if (other.getWindowTargetId() == null ^ this.getWindowTargetId() == null) return false;
        if (other.getWindowTargetId() != null && other.getWindowTargetId().equals(this.getWindowTargetId()) == false) return false;
        return true;
    }
}
