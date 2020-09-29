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


public class GetMaintenanceWindowExecutionResult implements Serializable {
    /**
     * <p>The ID of the maintenance window execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     */
    private String windowExecutionId;

    /**
     * <p>The ID of the task executions from the maintenance window execution.</p>
     */
    private java.util.List<String> taskIds;

    /**
     * <p>The status of the maintenance window execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     */
    private String status;

    /**
     * <p>The details explaining the Status. Only available for certain status values.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 250<br/>
     */
    private String statusDetails;

    /**
     * <p>The time the maintenance window started running.</p>
     */
    private java.util.Date startTime;

    /**
     * <p>The time the maintenance window finished running.</p>
     */
    private java.util.Date endTime;

    /**
     * <p>The ID of the maintenance window execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @return <p>The ID of the maintenance window execution.</p>
     */
    public String getWindowExecutionId() {
        return windowExecutionId;
    }

    /**
     * <p>The ID of the maintenance window execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param windowExecutionId <p>The ID of the maintenance window execution.</p>
     */
    public void setWindowExecutionId(String windowExecutionId) {
        this.windowExecutionId = windowExecutionId;
    }

    /**
     * <p>The ID of the maintenance window execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param windowExecutionId <p>The ID of the maintenance window execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetMaintenanceWindowExecutionResult withWindowExecutionId(String windowExecutionId) {
        this.windowExecutionId = windowExecutionId;
        return this;
    }

    /**
     * <p>The ID of the task executions from the maintenance window execution.</p>
     *
     * @return <p>The ID of the task executions from the maintenance window execution.</p>
     */
    public java.util.List<String> getTaskIds() {
        return taskIds;
    }

    /**
     * <p>The ID of the task executions from the maintenance window execution.</p>
     *
     * @param taskIds <p>The ID of the task executions from the maintenance window execution.</p>
     */
    public void setTaskIds(java.util.Collection<String> taskIds) {
        if (taskIds == null) {
            this.taskIds = null;
            return;
        }

        this.taskIds = new java.util.ArrayList<String>(taskIds);
    }

    /**
     * <p>The ID of the task executions from the maintenance window execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskIds <p>The ID of the task executions from the maintenance window execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetMaintenanceWindowExecutionResult withTaskIds(String... taskIds) {
        if (getTaskIds() == null) {
            this.taskIds = new java.util.ArrayList<String>(taskIds.length);
        }
        for (String value : taskIds) {
            this.taskIds.add(value);
        }
        return this;
    }

    /**
     * <p>The ID of the task executions from the maintenance window execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskIds <p>The ID of the task executions from the maintenance window execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetMaintenanceWindowExecutionResult withTaskIds(java.util.Collection<String> taskIds) {
        setTaskIds(taskIds);
        return this;
    }

    /**
     * <p>The status of the maintenance window execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     *
     * @return <p>The status of the maintenance window execution.</p>
     *
     * @see MaintenanceWindowExecutionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>The status of the maintenance window execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     *
     * @param status <p>The status of the maintenance window execution.</p>
     *
     * @see MaintenanceWindowExecutionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>The status of the maintenance window execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     *
     * @param status <p>The status of the maintenance window execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MaintenanceWindowExecutionStatus
     */
    public GetMaintenanceWindowExecutionResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>The status of the maintenance window execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     *
     * @param status <p>The status of the maintenance window execution.</p>
     *
     * @see MaintenanceWindowExecutionStatus
     */
    public void setStatus(MaintenanceWindowExecutionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>The status of the maintenance window execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     *
     * @param status <p>The status of the maintenance window execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MaintenanceWindowExecutionStatus
     */
    public GetMaintenanceWindowExecutionResult withStatus(MaintenanceWindowExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>The details explaining the Status. Only available for certain status values.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 250<br/>
     *
     * @return <p>The details explaining the Status. Only available for certain status values.</p>
     */
    public String getStatusDetails() {
        return statusDetails;
    }

    /**
     * <p>The details explaining the Status. Only available for certain status values.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 250<br/>
     *
     * @param statusDetails <p>The details explaining the Status. Only available for certain status values.</p>
     */
    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>The details explaining the Status. Only available for certain status values.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 250<br/>
     *
     * @param statusDetails <p>The details explaining the Status. Only available for certain status values.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetMaintenanceWindowExecutionResult withStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * <p>The time the maintenance window started running.</p>
     *
     * @return <p>The time the maintenance window started running.</p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>The time the maintenance window started running.</p>
     *
     * @param startTime <p>The time the maintenance window started running.</p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>The time the maintenance window started running.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime <p>The time the maintenance window started running.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetMaintenanceWindowExecutionResult withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>The time the maintenance window finished running.</p>
     *
     * @return <p>The time the maintenance window finished running.</p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>The time the maintenance window finished running.</p>
     *
     * @param endTime <p>The time the maintenance window finished running.</p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>The time the maintenance window finished running.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime <p>The time the maintenance window finished running.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetMaintenanceWindowExecutionResult withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
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
        if (getTaskIds() != null) sb.append("TaskIds: " + getTaskIds() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getStatusDetails() != null) sb.append("StatusDetails: " + getStatusDetails() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("EndTime: " + getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowExecutionId() == null) ? 0 : getWindowExecutionId().hashCode());
        hashCode = prime * hashCode + ((getTaskIds() == null) ? 0 : getTaskIds().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetMaintenanceWindowExecutionResult == false) return false;
        GetMaintenanceWindowExecutionResult other = (GetMaintenanceWindowExecutionResult)obj;

        if (other.getWindowExecutionId() == null ^ this.getWindowExecutionId() == null) return false;
        if (other.getWindowExecutionId() != null && other.getWindowExecutionId().equals(this.getWindowExecutionId()) == false) return false;
        if (other.getTaskIds() == null ^ this.getTaskIds() == null) return false;
        if (other.getTaskIds() != null && other.getTaskIds().equals(this.getTaskIds()) == false) return false;
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null) return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false) return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false;
        return true;
    }
}
