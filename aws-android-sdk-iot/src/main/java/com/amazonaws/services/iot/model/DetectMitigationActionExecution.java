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
 * Describes which mitigation actions should be executed.
 * </p>
 */
public class DetectMitigationActionExecution implements Serializable {
    /**
     * <p>
     * The unique identifier of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String taskId;

    /**
     * <p>
     * The unique identifier of the violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     */
    private String violationId;

    /**
     * <p>
     * The friendly name that uniquely identifies the mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String actionName;

    /**
     * <p>
     * The name of the thing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String thingName;

    /**
     * <p>
     * The date a mitigation action was started.
     * </p>
     */
    private java.util.Date executionStartDate;

    /**
     * <p>
     * The date a mitigation action ended.
     * </p>
     */
    private java.util.Date executionEndDate;

    /**
     * <p>
     * The status of a mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCESSFUL, FAILED, SKIPPED
     */
    private String status;

    /**
     * <p>
     * The error code of a mitigation action.
     * </p>
     */
    private String errorCode;

    /**
     * <p>
     * The message of a mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     */
    private String message;

    /**
     * <p>
     * The unique identifier of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The unique identifier of the task.
     *         </p>
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * <p>
     * The unique identifier of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param taskId <p>
     *            The unique identifier of the task.
     *            </p>
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The unique identifier of the task.
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
     *            The unique identifier of the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionExecution withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @return <p>
     *         The unique identifier of the violation.
     *         </p>
     */
    public String getViolationId() {
        return violationId;
    }

    /**
     * <p>
     * The unique identifier of the violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param violationId <p>
     *            The unique identifier of the violation.
     *            </p>
     */
    public void setViolationId(String violationId) {
        this.violationId = violationId;
    }

    /**
     * <p>
     * The unique identifier of the violation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param violationId <p>
     *            The unique identifier of the violation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionExecution withViolationId(String violationId) {
        this.violationId = violationId;
        return this;
    }

    /**
     * <p>
     * The friendly name that uniquely identifies the mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The friendly name that uniquely identifies the mitigation action.
     *         </p>
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * <p>
     * The friendly name that uniquely identifies the mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param actionName <p>
     *            The friendly name that uniquely identifies the mitigation
     *            action.
     *            </p>
     */
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The friendly name that uniquely identifies the mitigation action.
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
     *            The friendly name that uniquely identifies the mitigation
     *            action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionExecution withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The name of the thing.
     *         </p>
     */
    public String getThingName() {
        return thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param thingName <p>
     *            The name of the thing.
     *            </p>
     */
    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param thingName <p>
     *            The name of the thing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionExecution withThingName(String thingName) {
        this.thingName = thingName;
        return this;
    }

    /**
     * <p>
     * The date a mitigation action was started.
     * </p>
     *
     * @return <p>
     *         The date a mitigation action was started.
     *         </p>
     */
    public java.util.Date getExecutionStartDate() {
        return executionStartDate;
    }

    /**
     * <p>
     * The date a mitigation action was started.
     * </p>
     *
     * @param executionStartDate <p>
     *            The date a mitigation action was started.
     *            </p>
     */
    public void setExecutionStartDate(java.util.Date executionStartDate) {
        this.executionStartDate = executionStartDate;
    }

    /**
     * <p>
     * The date a mitigation action was started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionStartDate <p>
     *            The date a mitigation action was started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionExecution withExecutionStartDate(java.util.Date executionStartDate) {
        this.executionStartDate = executionStartDate;
        return this;
    }

    /**
     * <p>
     * The date a mitigation action ended.
     * </p>
     *
     * @return <p>
     *         The date a mitigation action ended.
     *         </p>
     */
    public java.util.Date getExecutionEndDate() {
        return executionEndDate;
    }

    /**
     * <p>
     * The date a mitigation action ended.
     * </p>
     *
     * @param executionEndDate <p>
     *            The date a mitigation action ended.
     *            </p>
     */
    public void setExecutionEndDate(java.util.Date executionEndDate) {
        this.executionEndDate = executionEndDate;
    }

    /**
     * <p>
     * The date a mitigation action ended.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionEndDate <p>
     *            The date a mitigation action ended.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionExecution withExecutionEndDate(java.util.Date executionEndDate) {
        this.executionEndDate = executionEndDate;
        return this;
    }

    /**
     * <p>
     * The status of a mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCESSFUL, FAILED, SKIPPED
     *
     * @return <p>
     *         The status of a mitigation action.
     *         </p>
     * @see DetectMitigationActionExecutionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of a mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCESSFUL, FAILED, SKIPPED
     *
     * @param status <p>
     *            The status of a mitigation action.
     *            </p>
     * @see DetectMitigationActionExecutionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a mitigation action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCESSFUL, FAILED, SKIPPED
     *
     * @param status <p>
     *            The status of a mitigation action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DetectMitigationActionExecutionStatus
     */
    public DetectMitigationActionExecution withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of a mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCESSFUL, FAILED, SKIPPED
     *
     * @param status <p>
     *            The status of a mitigation action.
     *            </p>
     * @see DetectMitigationActionExecutionStatus
     */
    public void setStatus(DetectMitigationActionExecutionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of a mitigation action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCESSFUL, FAILED, SKIPPED
     *
     * @param status <p>
     *            The status of a mitigation action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DetectMitigationActionExecutionStatus
     */
    public DetectMitigationActionExecution withStatus(DetectMitigationActionExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The error code of a mitigation action.
     * </p>
     *
     * @return <p>
     *         The error code of a mitigation action.
     *         </p>
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * The error code of a mitigation action.
     * </p>
     *
     * @param errorCode <p>
     *            The error code of a mitigation action.
     *            </p>
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code of a mitigation action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorCode <p>
     *            The error code of a mitigation action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionExecution withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * The message of a mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @return <p>
     *         The message of a mitigation action.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The message of a mitigation action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param message <p>
     *            The message of a mitigation action.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message of a mitigation action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param message <p>
     *            The message of a mitigation action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionExecution withMessage(String message) {
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
        if (getViolationId() != null)
            sb.append("violationId: " + getViolationId() + ",");
        if (getActionName() != null)
            sb.append("actionName: " + getActionName() + ",");
        if (getThingName() != null)
            sb.append("thingName: " + getThingName() + ",");
        if (getExecutionStartDate() != null)
            sb.append("executionStartDate: " + getExecutionStartDate() + ",");
        if (getExecutionEndDate() != null)
            sb.append("executionEndDate: " + getExecutionEndDate() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
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
        hashCode = prime * hashCode
                + ((getViolationId() == null) ? 0 : getViolationId().hashCode());
        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionStartDate() == null) ? 0 : getExecutionStartDate().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionEndDate() == null) ? 0 : getExecutionEndDate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
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

        if (obj instanceof DetectMitigationActionExecution == false)
            return false;
        DetectMitigationActionExecution other = (DetectMitigationActionExecution) obj;

        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getViolationId() == null ^ this.getViolationId() == null)
            return false;
        if (other.getViolationId() != null
                && other.getViolationId().equals(this.getViolationId()) == false)
            return false;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null
                && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null
                && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getExecutionStartDate() == null ^ this.getExecutionStartDate() == null)
            return false;
        if (other.getExecutionStartDate() != null
                && other.getExecutionStartDate().equals(this.getExecutionStartDate()) == false)
            return false;
        if (other.getExecutionEndDate() == null ^ this.getExecutionEndDate() == null)
            return false;
        if (other.getExecutionEndDate() != null
                && other.getExecutionEndDate().equals(this.getExecutionEndDate()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
