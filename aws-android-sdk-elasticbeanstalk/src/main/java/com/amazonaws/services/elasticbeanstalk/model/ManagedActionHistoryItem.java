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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * The record of a completed or failed managed action.
 * </p>
 */
public class ManagedActionHistoryItem implements Serializable {
    /**
     * <p>
     * A unique identifier for the managed action.
     * </p>
     */
    private String actionId;

    /**
     * <p>
     * The type of the managed action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceRefresh, PlatformUpdate, Unknown
     */
    private String actionType;

    /**
     * <p>
     * A description of the managed action.
     * </p>
     */
    private String actionDescription;

    /**
     * <p>
     * If the action failed, the type of failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UpdateCancelled, CancellationFailed,
     * RollbackFailed, RollbackSuccessful, InternalFailure,
     * InvalidEnvironmentState, PermissionsError
     */
    private String failureType;

    /**
     * <p>
     * The status of the action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, Failed, Unknown
     */
    private String status;

    /**
     * <p>
     * If the action failed, a description of the failure.
     * </p>
     */
    private String failureDescription;

    /**
     * <p>
     * The date and time that the action started executing.
     * </p>
     */
    private java.util.Date executedTime;

    /**
     * <p>
     * The date and time that the action finished executing.
     * </p>
     */
    private java.util.Date finishedTime;

    /**
     * <p>
     * A unique identifier for the managed action.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the managed action.
     *         </p>
     */
    public String getActionId() {
        return actionId;
    }

    /**
     * <p>
     * A unique identifier for the managed action.
     * </p>
     *
     * @param actionId <p>
     *            A unique identifier for the managed action.
     *            </p>
     */
    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * <p>
     * A unique identifier for the managed action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionId <p>
     *            A unique identifier for the managed action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ManagedActionHistoryItem withActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * <p>
     * The type of the managed action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceRefresh, PlatformUpdate, Unknown
     *
     * @return <p>
     *         The type of the managed action.
     *         </p>
     * @see ActionType
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * <p>
     * The type of the managed action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceRefresh, PlatformUpdate, Unknown
     *
     * @param actionType <p>
     *            The type of the managed action.
     *            </p>
     * @see ActionType
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of the managed action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceRefresh, PlatformUpdate, Unknown
     *
     * @param actionType <p>
     *            The type of the managed action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActionType
     */
    public ManagedActionHistoryItem withActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * <p>
     * The type of the managed action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceRefresh, PlatformUpdate, Unknown
     *
     * @param actionType <p>
     *            The type of the managed action.
     *            </p>
     * @see ActionType
     */
    public void setActionType(ActionType actionType) {
        this.actionType = actionType.toString();
    }

    /**
     * <p>
     * The type of the managed action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceRefresh, PlatformUpdate, Unknown
     *
     * @param actionType <p>
     *            The type of the managed action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActionType
     */
    public ManagedActionHistoryItem withActionType(ActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * A description of the managed action.
     * </p>
     *
     * @return <p>
     *         A description of the managed action.
     *         </p>
     */
    public String getActionDescription() {
        return actionDescription;
    }

    /**
     * <p>
     * A description of the managed action.
     * </p>
     *
     * @param actionDescription <p>
     *            A description of the managed action.
     *            </p>
     */
    public void setActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
    }

    /**
     * <p>
     * A description of the managed action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionDescription <p>
     *            A description of the managed action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ManagedActionHistoryItem withActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
        return this;
    }

    /**
     * <p>
     * If the action failed, the type of failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UpdateCancelled, CancellationFailed,
     * RollbackFailed, RollbackSuccessful, InternalFailure,
     * InvalidEnvironmentState, PermissionsError
     *
     * @return <p>
     *         If the action failed, the type of failure.
     *         </p>
     * @see FailureType
     */
    public String getFailureType() {
        return failureType;
    }

    /**
     * <p>
     * If the action failed, the type of failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UpdateCancelled, CancellationFailed,
     * RollbackFailed, RollbackSuccessful, InternalFailure,
     * InvalidEnvironmentState, PermissionsError
     *
     * @param failureType <p>
     *            If the action failed, the type of failure.
     *            </p>
     * @see FailureType
     */
    public void setFailureType(String failureType) {
        this.failureType = failureType;
    }

    /**
     * <p>
     * If the action failed, the type of failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UpdateCancelled, CancellationFailed,
     * RollbackFailed, RollbackSuccessful, InternalFailure,
     * InvalidEnvironmentState, PermissionsError
     *
     * @param failureType <p>
     *            If the action failed, the type of failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FailureType
     */
    public ManagedActionHistoryItem withFailureType(String failureType) {
        this.failureType = failureType;
        return this;
    }

    /**
     * <p>
     * If the action failed, the type of failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UpdateCancelled, CancellationFailed,
     * RollbackFailed, RollbackSuccessful, InternalFailure,
     * InvalidEnvironmentState, PermissionsError
     *
     * @param failureType <p>
     *            If the action failed, the type of failure.
     *            </p>
     * @see FailureType
     */
    public void setFailureType(FailureType failureType) {
        this.failureType = failureType.toString();
    }

    /**
     * <p>
     * If the action failed, the type of failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UpdateCancelled, CancellationFailed,
     * RollbackFailed, RollbackSuccessful, InternalFailure,
     * InvalidEnvironmentState, PermissionsError
     *
     * @param failureType <p>
     *            If the action failed, the type of failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FailureType
     */
    public ManagedActionHistoryItem withFailureType(FailureType failureType) {
        this.failureType = failureType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, Failed, Unknown
     *
     * @return <p>
     *         The status of the action.
     *         </p>
     * @see ActionHistoryStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, Failed, Unknown
     *
     * @param status <p>
     *            The status of the action.
     *            </p>
     * @see ActionHistoryStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, Failed, Unknown
     *
     * @param status <p>
     *            The status of the action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActionHistoryStatus
     */
    public ManagedActionHistoryItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, Failed, Unknown
     *
     * @param status <p>
     *            The status of the action.
     *            </p>
     * @see ActionHistoryStatus
     */
    public void setStatus(ActionHistoryStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, Failed, Unknown
     *
     * @param status <p>
     *            The status of the action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActionHistoryStatus
     */
    public ManagedActionHistoryItem withStatus(ActionHistoryStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If the action failed, a description of the failure.
     * </p>
     *
     * @return <p>
     *         If the action failed, a description of the failure.
     *         </p>
     */
    public String getFailureDescription() {
        return failureDescription;
    }

    /**
     * <p>
     * If the action failed, a description of the failure.
     * </p>
     *
     * @param failureDescription <p>
     *            If the action failed, a description of the failure.
     *            </p>
     */
    public void setFailureDescription(String failureDescription) {
        this.failureDescription = failureDescription;
    }

    /**
     * <p>
     * If the action failed, a description of the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureDescription <p>
     *            If the action failed, a description of the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ManagedActionHistoryItem withFailureDescription(String failureDescription) {
        this.failureDescription = failureDescription;
        return this;
    }

    /**
     * <p>
     * The date and time that the action started executing.
     * </p>
     *
     * @return <p>
     *         The date and time that the action started executing.
     *         </p>
     */
    public java.util.Date getExecutedTime() {
        return executedTime;
    }

    /**
     * <p>
     * The date and time that the action started executing.
     * </p>
     *
     * @param executedTime <p>
     *            The date and time that the action started executing.
     *            </p>
     */
    public void setExecutedTime(java.util.Date executedTime) {
        this.executedTime = executedTime;
    }

    /**
     * <p>
     * The date and time that the action started executing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executedTime <p>
     *            The date and time that the action started executing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ManagedActionHistoryItem withExecutedTime(java.util.Date executedTime) {
        this.executedTime = executedTime;
        return this;
    }

    /**
     * <p>
     * The date and time that the action finished executing.
     * </p>
     *
     * @return <p>
     *         The date and time that the action finished executing.
     *         </p>
     */
    public java.util.Date getFinishedTime() {
        return finishedTime;
    }

    /**
     * <p>
     * The date and time that the action finished executing.
     * </p>
     *
     * @param finishedTime <p>
     *            The date and time that the action finished executing.
     *            </p>
     */
    public void setFinishedTime(java.util.Date finishedTime) {
        this.finishedTime = finishedTime;
    }

    /**
     * <p>
     * The date and time that the action finished executing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param finishedTime <p>
     *            The date and time that the action finished executing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ManagedActionHistoryItem withFinishedTime(java.util.Date finishedTime) {
        this.finishedTime = finishedTime;
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
        if (getActionId() != null)
            sb.append("ActionId: " + getActionId() + ",");
        if (getActionType() != null)
            sb.append("ActionType: " + getActionType() + ",");
        if (getActionDescription() != null)
            sb.append("ActionDescription: " + getActionDescription() + ",");
        if (getFailureType() != null)
            sb.append("FailureType: " + getFailureType() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getFailureDescription() != null)
            sb.append("FailureDescription: " + getFailureDescription() + ",");
        if (getExecutedTime() != null)
            sb.append("ExecutedTime: " + getExecutedTime() + ",");
        if (getFinishedTime() != null)
            sb.append("FinishedTime: " + getFinishedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode
                + ((getActionDescription() == null) ? 0 : getActionDescription().hashCode());
        hashCode = prime * hashCode
                + ((getFailureType() == null) ? 0 : getFailureType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getFailureDescription() == null) ? 0 : getFailureDescription().hashCode());
        hashCode = prime * hashCode
                + ((getExecutedTime() == null) ? 0 : getExecutedTime().hashCode());
        hashCode = prime * hashCode
                + ((getFinishedTime() == null) ? 0 : getFinishedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedActionHistoryItem == false)
            return false;
        ManagedActionHistoryItem other = (ManagedActionHistoryItem) obj;

        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null
                && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getActionDescription() == null ^ this.getActionDescription() == null)
            return false;
        if (other.getActionDescription() != null
                && other.getActionDescription().equals(this.getActionDescription()) == false)
            return false;
        if (other.getFailureType() == null ^ this.getFailureType() == null)
            return false;
        if (other.getFailureType() != null
                && other.getFailureType().equals(this.getFailureType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureDescription() == null ^ this.getFailureDescription() == null)
            return false;
        if (other.getFailureDescription() != null
                && other.getFailureDescription().equals(this.getFailureDescription()) == false)
            return false;
        if (other.getExecutedTime() == null ^ this.getExecutedTime() == null)
            return false;
        if (other.getExecutedTime() != null
                && other.getExecutedTime().equals(this.getExecutedTime()) == false)
            return false;
        if (other.getFinishedTime() == null ^ this.getFinishedTime() == null)
            return false;
        if (other.getFinishedTime() != null
                && other.getFinishedTime().equals(this.getFinishedTime()) == false)
            return false;
        return true;
    }
}
