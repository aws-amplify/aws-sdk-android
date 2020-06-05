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
 * The record of an upcoming or in-progress managed action.
 * </p>
 */
public class ManagedAction implements Serializable {
    /**
     * <p>
     * A unique identifier for the managed action.
     * </p>
     */
    private String actionId;

    /**
     * <p>
     * A description of the managed action.
     * </p>
     */
    private String actionDescription;

    /**
     * <p>
     * The type of managed action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceRefresh, PlatformUpdate, Unknown
     */
    private String actionType;

    /**
     * <p>
     * The status of the managed action. If the action is <code>Scheduled</code>
     * , you can apply it immediately with <a>ApplyEnvironmentManagedAction</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Pending, Running, Unknown
     */
    private String status;

    /**
     * <p>
     * The start time of the maintenance window in which the managed action will
     * execute.
     * </p>
     */
    private java.util.Date windowStartTime;

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
    public ManagedAction withActionId(String actionId) {
        this.actionId = actionId;
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
    public ManagedAction withActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
        return this;
    }

    /**
     * <p>
     * The type of managed action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceRefresh, PlatformUpdate, Unknown
     *
     * @return <p>
     *         The type of managed action.
     *         </p>
     * @see ActionType
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * <p>
     * The type of managed action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceRefresh, PlatformUpdate, Unknown
     *
     * @param actionType <p>
     *            The type of managed action.
     *            </p>
     * @see ActionType
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of managed action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceRefresh, PlatformUpdate, Unknown
     *
     * @param actionType <p>
     *            The type of managed action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActionType
     */
    public ManagedAction withActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * <p>
     * The type of managed action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceRefresh, PlatformUpdate, Unknown
     *
     * @param actionType <p>
     *            The type of managed action.
     *            </p>
     * @see ActionType
     */
    public void setActionType(ActionType actionType) {
        this.actionType = actionType.toString();
    }

    /**
     * <p>
     * The type of managed action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceRefresh, PlatformUpdate, Unknown
     *
     * @param actionType <p>
     *            The type of managed action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActionType
     */
    public ManagedAction withActionType(ActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the managed action. If the action is <code>Scheduled</code>
     * , you can apply it immediately with <a>ApplyEnvironmentManagedAction</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Pending, Running, Unknown
     *
     * @return <p>
     *         The status of the managed action. If the action is
     *         <code>Scheduled</code>, you can apply it immediately with
     *         <a>ApplyEnvironmentManagedAction</a>.
     *         </p>
     * @see ActionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the managed action. If the action is <code>Scheduled</code>
     * , you can apply it immediately with <a>ApplyEnvironmentManagedAction</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Pending, Running, Unknown
     *
     * @param status <p>
     *            The status of the managed action. If the action is
     *            <code>Scheduled</code>, you can apply it immediately with
     *            <a>ApplyEnvironmentManagedAction</a>.
     *            </p>
     * @see ActionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the managed action. If the action is <code>Scheduled</code>
     * , you can apply it immediately with <a>ApplyEnvironmentManagedAction</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Pending, Running, Unknown
     *
     * @param status <p>
     *            The status of the managed action. If the action is
     *            <code>Scheduled</code>, you can apply it immediately with
     *            <a>ApplyEnvironmentManagedAction</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActionStatus
     */
    public ManagedAction withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the managed action. If the action is <code>Scheduled</code>
     * , you can apply it immediately with <a>ApplyEnvironmentManagedAction</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Pending, Running, Unknown
     *
     * @param status <p>
     *            The status of the managed action. If the action is
     *            <code>Scheduled</code>, you can apply it immediately with
     *            <a>ApplyEnvironmentManagedAction</a>.
     *            </p>
     * @see ActionStatus
     */
    public void setStatus(ActionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the managed action. If the action is <code>Scheduled</code>
     * , you can apply it immediately with <a>ApplyEnvironmentManagedAction</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Pending, Running, Unknown
     *
     * @param status <p>
     *            The status of the managed action. If the action is
     *            <code>Scheduled</code>, you can apply it immediately with
     *            <a>ApplyEnvironmentManagedAction</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActionStatus
     */
    public ManagedAction withStatus(ActionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The start time of the maintenance window in which the managed action will
     * execute.
     * </p>
     *
     * @return <p>
     *         The start time of the maintenance window in which the managed
     *         action will execute.
     *         </p>
     */
    public java.util.Date getWindowStartTime() {
        return windowStartTime;
    }

    /**
     * <p>
     * The start time of the maintenance window in which the managed action will
     * execute.
     * </p>
     *
     * @param windowStartTime <p>
     *            The start time of the maintenance window in which the managed
     *            action will execute.
     *            </p>
     */
    public void setWindowStartTime(java.util.Date windowStartTime) {
        this.windowStartTime = windowStartTime;
    }

    /**
     * <p>
     * The start time of the maintenance window in which the managed action will
     * execute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param windowStartTime <p>
     *            The start time of the maintenance window in which the managed
     *            action will execute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ManagedAction withWindowStartTime(java.util.Date windowStartTime) {
        this.windowStartTime = windowStartTime;
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
        if (getActionDescription() != null)
            sb.append("ActionDescription: " + getActionDescription() + ",");
        if (getActionType() != null)
            sb.append("ActionType: " + getActionType() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getWindowStartTime() != null)
            sb.append("WindowStartTime: " + getWindowStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode
                + ((getActionDescription() == null) ? 0 : getActionDescription().hashCode());
        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getWindowStartTime() == null) ? 0 : getWindowStartTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedAction == false)
            return false;
        ManagedAction other = (ManagedAction) obj;

        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        if (other.getActionDescription() == null ^ this.getActionDescription() == null)
            return false;
        if (other.getActionDescription() != null
                && other.getActionDescription().equals(this.getActionDescription()) == false)
            return false;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null
                && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getWindowStartTime() == null ^ this.getWindowStartTime() == null)
            return false;
        if (other.getWindowStartTime() != null
                && other.getWindowStartTime().equals(this.getWindowStartTime()) == false)
            return false;
        return true;
    }
}
