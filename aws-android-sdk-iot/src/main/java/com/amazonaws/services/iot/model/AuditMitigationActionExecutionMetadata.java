/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Returned by ListAuditMitigationActionsTask, this object contains information
 * that describes a mitigation action that has been started.
 * </p>
 */
public class AuditMitigationActionExecutionMetadata implements Serializable {
    /**
     * <p>
     * The unique identifier for the task that applies the mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String taskId;

    /**
     * <p>
     * The unique identifier for the findings to which the task and associated
     * mitigation action are applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String findingId;

    /**
     * <p>
     * The friendly name of the mitigation action being applied by the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String actionName;

    /**
     * <p>
     * The unique identifier for the mitigation action being applied by the
     * task.
     * </p>
     */
    private String actionId;

    /**
     * <p>
     * The current status of the task being executed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED, SKIPPED,
     * PENDING
     */
    private String status;

    /**
     * <p>
     * The date and time when the task was started.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The date and time when the task was completed or canceled. Blank if the
     * task is still running.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * If an error occurred, the code that indicates which type of error
     * occurred.
     * </p>
     */
    private String errorCode;

    /**
     * <p>
     * If an error occurred, a message that describes the error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     */
    private String message;

    /**
     * <p>
     * The unique identifier for the task that applies the mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The unique identifier for the task that applies the mitigation
     *         action.
     *         </p>
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * <p>
     * The unique identifier for the task that applies the mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param taskId <p>
     *            The unique identifier for the task that applies the mitigation
     *            action.
     *            </p>
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The unique identifier for the task that applies the mitigation action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param taskId <p>
     *            The unique identifier for the task that applies the mitigation
     *            action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditMitigationActionExecutionMetadata withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the findings to which the task and associated
     * mitigation action are applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The unique identifier for the findings to which the task and
     *         associated mitigation action are applied.
     *         </p>
     */
    public String getFindingId() {
        return findingId;
    }

    /**
     * <p>
     * The unique identifier for the findings to which the task and associated
     * mitigation action are applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param findingId <p>
     *            The unique identifier for the findings to which the task and
     *            associated mitigation action are applied.
     *            </p>
     */
    public void setFindingId(String findingId) {
        this.findingId = findingId;
    }

    /**
     * <p>
     * The unique identifier for the findings to which the task and associated
     * mitigation action are applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param findingId <p>
     *            The unique identifier for the findings to which the task and
     *            associated mitigation action are applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditMitigationActionExecutionMetadata withFindingId(String findingId) {
        this.findingId = findingId;
        return this;
    }

    /**
     * <p>
     * The friendly name of the mitigation action being applied by the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The friendly name of the mitigation action being applied by the
     *         task.
     *         </p>
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * <p>
     * The friendly name of the mitigation action being applied by the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param actionName <p>
     *            The friendly name of the mitigation action being applied by
     *            the task.
     *            </p>
     */
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The friendly name of the mitigation action being applied by the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param actionName <p>
     *            The friendly name of the mitigation action being applied by
     *            the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditMitigationActionExecutionMetadata withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the mitigation action being applied by the
     * task.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the mitigation action being applied by
     *         the task.
     *         </p>
     */
    public String getActionId() {
        return actionId;
    }

    /**
     * <p>
     * The unique identifier for the mitigation action being applied by the
     * task.
     * </p>
     *
     * @param actionId <p>
     *            The unique identifier for the mitigation action being applied
     *            by the task.
     *            </p>
     */
    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * <p>
     * The unique identifier for the mitigation action being applied by the
     * task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionId <p>
     *            The unique identifier for the mitigation action being applied
     *            by the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditMitigationActionExecutionMetadata withActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * <p>
     * The current status of the task being executed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED, SKIPPED,
     * PENDING
     *
     * @return <p>
     *         The current status of the task being executed.
     *         </p>
     * @see AuditMitigationActionsExecutionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the task being executed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED, SKIPPED,
     * PENDING
     *
     * @param status <p>
     *            The current status of the task being executed.
     *            </p>
     * @see AuditMitigationActionsExecutionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the task being executed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED, SKIPPED,
     * PENDING
     *
     * @param status <p>
     *            The current status of the task being executed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditMitigationActionsExecutionStatus
     */
    public AuditMitigationActionExecutionMetadata withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of the task being executed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED, SKIPPED,
     * PENDING
     *
     * @param status <p>
     *            The current status of the task being executed.
     *            </p>
     * @see AuditMitigationActionsExecutionStatus
     */
    public void setStatus(AuditMitigationActionsExecutionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the task being executed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED, SKIPPED,
     * PENDING
     *
     * @param status <p>
     *            The current status of the task being executed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditMitigationActionsExecutionStatus
     */
    public AuditMitigationActionExecutionMetadata withStatus(
            AuditMitigationActionsExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the task was started.
     * </p>
     *
     * @return <p>
     *         The date and time when the task was started.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The date and time when the task was started.
     * </p>
     *
     * @param startTime <p>
     *            The date and time when the task was started.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time when the task was started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The date and time when the task was started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditMitigationActionExecutionMetadata withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The date and time when the task was completed or canceled. Blank if the
     * task is still running.
     * </p>
     *
     * @return <p>
     *         The date and time when the task was completed or canceled. Blank
     *         if the task is still running.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The date and time when the task was completed or canceled. Blank if the
     * task is still running.
     * </p>
     *
     * @param endTime <p>
     *            The date and time when the task was completed or canceled.
     *            Blank if the task is still running.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time when the task was completed or canceled. Blank if the
     * task is still running.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The date and time when the task was completed or canceled.
     *            Blank if the task is still running.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditMitigationActionExecutionMetadata withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * If an error occurred, the code that indicates which type of error
     * occurred.
     * </p>
     *
     * @return <p>
     *         If an error occurred, the code that indicates which type of error
     *         occurred.
     *         </p>
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * If an error occurred, the code that indicates which type of error
     * occurred.
     * </p>
     *
     * @param errorCode <p>
     *            If an error occurred, the code that indicates which type of
     *            error occurred.
     *            </p>
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * If an error occurred, the code that indicates which type of error
     * occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorCode <p>
     *            If an error occurred, the code that indicates which type of
     *            error occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditMitigationActionExecutionMetadata withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * If an error occurred, a message that describes the error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @return <p>
     *         If an error occurred, a message that describes the error.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * If an error occurred, a message that describes the error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param message <p>
     *            If an error occurred, a message that describes the error.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * If an error occurred, a message that describes the error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param message <p>
     *            If an error occurred, a message that describes the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditMitigationActionExecutionMetadata withMessage(String message) {
        this.message = message;
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
        if (getTaskId() != null)
            sb.append("taskId: " + getTaskId() + ",");
        if (getFindingId() != null)
            sb.append("findingId: " + getFindingId() + ",");
        if (getActionName() != null)
            sb.append("actionName: " + getActionName() + ",");
        if (getActionId() != null)
            sb.append("actionId: " + getActionId() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getStartTime() != null)
            sb.append("startTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("endTime: " + getEndTime() + ",");
        if (getErrorCode() != null)
            sb.append("errorCode: " + getErrorCode() + ",");
        if (getMessage() != null)
            sb.append("message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getFindingId() == null) ? 0 : getFindingId().hashCode());
        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuditMitigationActionExecutionMetadata == false)
            return false;
        AuditMitigationActionExecutionMetadata other = (AuditMitigationActionExecutionMetadata) obj;

        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getFindingId() == null ^ this.getFindingId() == null)
            return false;
        if (other.getFindingId() != null
                && other.getFindingId().equals(this.getFindingId()) == false)
            return false;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null
                && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null
                && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }
}
