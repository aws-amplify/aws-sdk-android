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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * The <code>ChangeSetSummary</code> structure describes a change set, its
 * status, and the stack with which it's associated.
 * </p>
 */
public class ChangeSetSummary implements Serializable {
    /**
     * <p>
     * The ID of the stack with which the change set is associated.
     * </p>
     */
    private String stackId;

    /**
     * <p>
     * The name of the stack with which the change set is associated.
     * </p>
     */
    private String stackName;

    /**
     * <p>
     * The ID of the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>arn:[-a-zA-Z0-9:/]*<br/>
     */
    private String changeSetId;

    /**
     * <p>
     * The name of the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*<br/>
     */
    private String changeSetName;

    /**
     * <p>
     * If the change set execution status is <code>AVAILABLE</code>, you can
     * execute the change set. If you can’t execute the change set, the status
     * indicates why. For example, a change set might be in an
     * <code>UNAVAILABLE</code> state because AWS CloudFormation is still
     * creating it or in an <code>OBSOLETE</code> state because the stack was
     * already updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNAVAILABLE, AVAILABLE, EXECUTE_IN_PROGRESS,
     * EXECUTE_COMPLETE, EXECUTE_FAILED, OBSOLETE
     */
    private String executionStatus;

    /**
     * <p>
     * The state of the change set, such as <code>CREATE_IN_PROGRESS</code>,
     * <code>CREATE_COMPLETE</code>, or <code>FAILED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, DELETE_COMPLETE, FAILED
     */
    private String status;

    /**
     * <p>
     * A description of the change set's status. For example, if your change set
     * is in the <code>FAILED</code> state, AWS CloudFormation shows the error
     * message.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * The start time when the change set was created, in UTC.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Descriptive information about the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The ID of the stack with which the change set is associated.
     * </p>
     *
     * @return <p>
     *         The ID of the stack with which the change set is associated.
     *         </p>
     */
    public String getStackId() {
        return stackId;
    }

    /**
     * <p>
     * The ID of the stack with which the change set is associated.
     * </p>
     *
     * @param stackId <p>
     *            The ID of the stack with which the change set is associated.
     *            </p>
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The ID of the stack with which the change set is associated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackId <p>
     *            The ID of the stack with which the change set is associated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeSetSummary withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * <p>
     * The name of the stack with which the change set is associated.
     * </p>
     *
     * @return <p>
     *         The name of the stack with which the change set is associated.
     *         </p>
     */
    public String getStackName() {
        return stackName;
    }

    /**
     * <p>
     * The name of the stack with which the change set is associated.
     * </p>
     *
     * @param stackName <p>
     *            The name of the stack with which the change set is associated.
     *            </p>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name of the stack with which the change set is associated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackName <p>
     *            The name of the stack with which the change set is associated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeSetSummary withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * <p>
     * The ID of the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>arn:[-a-zA-Z0-9:/]*<br/>
     *
     * @return <p>
     *         The ID of the change set.
     *         </p>
     */
    public String getChangeSetId() {
        return changeSetId;
    }

    /**
     * <p>
     * The ID of the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>arn:[-a-zA-Z0-9:/]*<br/>
     *
     * @param changeSetId <p>
     *            The ID of the change set.
     *            </p>
     */
    public void setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
    }

    /**
     * <p>
     * The ID of the change set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>arn:[-a-zA-Z0-9:/]*<br/>
     *
     * @param changeSetId <p>
     *            The ID of the change set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeSetSummary withChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }

    /**
     * <p>
     * The name of the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         The name of the change set.
     *         </p>
     */
    public String getChangeSetName() {
        return changeSetName;
    }

    /**
     * <p>
     * The name of the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*<br/>
     *
     * @param changeSetName <p>
     *            The name of the change set.
     *            </p>
     */
    public void setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
    }

    /**
     * <p>
     * The name of the change set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*<br/>
     *
     * @param changeSetName <p>
     *            The name of the change set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeSetSummary withChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
        return this;
    }

    /**
     * <p>
     * If the change set execution status is <code>AVAILABLE</code>, you can
     * execute the change set. If you can’t execute the change set, the status
     * indicates why. For example, a change set might be in an
     * <code>UNAVAILABLE</code> state because AWS CloudFormation is still
     * creating it or in an <code>OBSOLETE</code> state because the stack was
     * already updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNAVAILABLE, AVAILABLE, EXECUTE_IN_PROGRESS,
     * EXECUTE_COMPLETE, EXECUTE_FAILED, OBSOLETE
     *
     * @return <p>
     *         If the change set execution status is <code>AVAILABLE</code>, you
     *         can execute the change set. If you can’t execute the change set,
     *         the status indicates why. For example, a change set might be in
     *         an <code>UNAVAILABLE</code> state because AWS CloudFormation is
     *         still creating it or in an <code>OBSOLETE</code> state because
     *         the stack was already updated.
     *         </p>
     * @see ExecutionStatus
     */
    public String getExecutionStatus() {
        return executionStatus;
    }

    /**
     * <p>
     * If the change set execution status is <code>AVAILABLE</code>, you can
     * execute the change set. If you can’t execute the change set, the status
     * indicates why. For example, a change set might be in an
     * <code>UNAVAILABLE</code> state because AWS CloudFormation is still
     * creating it or in an <code>OBSOLETE</code> state because the stack was
     * already updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNAVAILABLE, AVAILABLE, EXECUTE_IN_PROGRESS,
     * EXECUTE_COMPLETE, EXECUTE_FAILED, OBSOLETE
     *
     * @param executionStatus <p>
     *            If the change set execution status is <code>AVAILABLE</code>,
     *            you can execute the change set. If you can’t execute the
     *            change set, the status indicates why. For example, a change
     *            set might be in an <code>UNAVAILABLE</code> state because AWS
     *            CloudFormation is still creating it or in an
     *            <code>OBSOLETE</code> state because the stack was already
     *            updated.
     *            </p>
     * @see ExecutionStatus
     */
    public void setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
    }

    /**
     * <p>
     * If the change set execution status is <code>AVAILABLE</code>, you can
     * execute the change set. If you can’t execute the change set, the status
     * indicates why. For example, a change set might be in an
     * <code>UNAVAILABLE</code> state because AWS CloudFormation is still
     * creating it or in an <code>OBSOLETE</code> state because the stack was
     * already updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNAVAILABLE, AVAILABLE, EXECUTE_IN_PROGRESS,
     * EXECUTE_COMPLETE, EXECUTE_FAILED, OBSOLETE
     *
     * @param executionStatus <p>
     *            If the change set execution status is <code>AVAILABLE</code>,
     *            you can execute the change set. If you can’t execute the
     *            change set, the status indicates why. For example, a change
     *            set might be in an <code>UNAVAILABLE</code> state because AWS
     *            CloudFormation is still creating it or in an
     *            <code>OBSOLETE</code> state because the stack was already
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExecutionStatus
     */
    public ChangeSetSummary withExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }

    /**
     * <p>
     * If the change set execution status is <code>AVAILABLE</code>, you can
     * execute the change set. If you can’t execute the change set, the status
     * indicates why. For example, a change set might be in an
     * <code>UNAVAILABLE</code> state because AWS CloudFormation is still
     * creating it or in an <code>OBSOLETE</code> state because the stack was
     * already updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNAVAILABLE, AVAILABLE, EXECUTE_IN_PROGRESS,
     * EXECUTE_COMPLETE, EXECUTE_FAILED, OBSOLETE
     *
     * @param executionStatus <p>
     *            If the change set execution status is <code>AVAILABLE</code>,
     *            you can execute the change set. If you can’t execute the
     *            change set, the status indicates why. For example, a change
     *            set might be in an <code>UNAVAILABLE</code> state because AWS
     *            CloudFormation is still creating it or in an
     *            <code>OBSOLETE</code> state because the stack was already
     *            updated.
     *            </p>
     * @see ExecutionStatus
     */
    public void setExecutionStatus(ExecutionStatus executionStatus) {
        this.executionStatus = executionStatus.toString();
    }

    /**
     * <p>
     * If the change set execution status is <code>AVAILABLE</code>, you can
     * execute the change set. If you can’t execute the change set, the status
     * indicates why. For example, a change set might be in an
     * <code>UNAVAILABLE</code> state because AWS CloudFormation is still
     * creating it or in an <code>OBSOLETE</code> state because the stack was
     * already updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNAVAILABLE, AVAILABLE, EXECUTE_IN_PROGRESS,
     * EXECUTE_COMPLETE, EXECUTE_FAILED, OBSOLETE
     *
     * @param executionStatus <p>
     *            If the change set execution status is <code>AVAILABLE</code>,
     *            you can execute the change set. If you can’t execute the
     *            change set, the status indicates why. For example, a change
     *            set might be in an <code>UNAVAILABLE</code> state because AWS
     *            CloudFormation is still creating it or in an
     *            <code>OBSOLETE</code> state because the stack was already
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExecutionStatus
     */
    public ChangeSetSummary withExecutionStatus(ExecutionStatus executionStatus) {
        this.executionStatus = executionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The state of the change set, such as <code>CREATE_IN_PROGRESS</code>,
     * <code>CREATE_COMPLETE</code>, or <code>FAILED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, DELETE_COMPLETE, FAILED
     *
     * @return <p>
     *         The state of the change set, such as
     *         <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     *         <code>FAILED</code>.
     *         </p>
     * @see ChangeSetStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The state of the change set, such as <code>CREATE_IN_PROGRESS</code>,
     * <code>CREATE_COMPLETE</code>, or <code>FAILED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, DELETE_COMPLETE, FAILED
     *
     * @param status <p>
     *            The state of the change set, such as
     *            <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>,
     *            or <code>FAILED</code>.
     *            </p>
     * @see ChangeSetStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The state of the change set, such as <code>CREATE_IN_PROGRESS</code>,
     * <code>CREATE_COMPLETE</code>, or <code>FAILED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, DELETE_COMPLETE, FAILED
     *
     * @param status <p>
     *            The state of the change set, such as
     *            <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>,
     *            or <code>FAILED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeSetStatus
     */
    public ChangeSetSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The state of the change set, such as <code>CREATE_IN_PROGRESS</code>,
     * <code>CREATE_COMPLETE</code>, or <code>FAILED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, DELETE_COMPLETE, FAILED
     *
     * @param status <p>
     *            The state of the change set, such as
     *            <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>,
     *            or <code>FAILED</code>.
     *            </p>
     * @see ChangeSetStatus
     */
    public void setStatus(ChangeSetStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The state of the change set, such as <code>CREATE_IN_PROGRESS</code>,
     * <code>CREATE_COMPLETE</code>, or <code>FAILED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, DELETE_COMPLETE, FAILED
     *
     * @param status <p>
     *            The state of the change set, such as
     *            <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>,
     *            or <code>FAILED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeSetStatus
     */
    public ChangeSetSummary withStatus(ChangeSetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A description of the change set's status. For example, if your change set
     * is in the <code>FAILED</code> state, AWS CloudFormation shows the error
     * message.
     * </p>
     *
     * @return <p>
     *         A description of the change set's status. For example, if your
     *         change set is in the <code>FAILED</code> state, AWS
     *         CloudFormation shows the error message.
     *         </p>
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * <p>
     * A description of the change set's status. For example, if your change set
     * is in the <code>FAILED</code> state, AWS CloudFormation shows the error
     * message.
     * </p>
     *
     * @param statusReason <p>
     *            A description of the change set's status. For example, if your
     *            change set is in the <code>FAILED</code> state, AWS
     *            CloudFormation shows the error message.
     *            </p>
     */
    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * A description of the change set's status. For example, if your change set
     * is in the <code>FAILED</code> state, AWS CloudFormation shows the error
     * message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusReason <p>
     *            A description of the change set's status. For example, if your
     *            change set is in the <code>FAILED</code> state, AWS
     *            CloudFormation shows the error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeSetSummary withStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * <p>
     * The start time when the change set was created, in UTC.
     * </p>
     *
     * @return <p>
     *         The start time when the change set was created, in UTC.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The start time when the change set was created, in UTC.
     * </p>
     *
     * @param creationTime <p>
     *            The start time when the change set was created, in UTC.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The start time when the change set was created, in UTC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The start time when the change set was created, in UTC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeSetSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * Descriptive information about the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         Descriptive information about the change set.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Descriptive information about the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            Descriptive information about the change set.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Descriptive information about the change set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            Descriptive information about the change set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeSetSummary withDescription(String description) {
        this.description = description;
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
        if (getStackId() != null)
            sb.append("StackId: " + getStackId() + ",");
        if (getStackName() != null)
            sb.append("StackName: " + getStackName() + ",");
        if (getChangeSetId() != null)
            sb.append("ChangeSetId: " + getChangeSetId() + ",");
        if (getChangeSetName() != null)
            sb.append("ChangeSetName: " + getChangeSetName() + ",");
        if (getExecutionStatus() != null)
            sb.append("ExecutionStatus: " + getExecutionStatus() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusReason() != null)
            sb.append("StatusReason: " + getStatusReason() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode
                + ((getChangeSetId() == null) ? 0 : getChangeSetId().hashCode());
        hashCode = prime * hashCode
                + ((getChangeSetName() == null) ? 0 : getChangeSetName().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionStatus() == null) ? 0 : getExecutionStatus().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeSetSummary == false)
            return false;
        ChangeSetSummary other = (ChangeSetSummary) obj;

        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null
                && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getChangeSetId() == null ^ this.getChangeSetId() == null)
            return false;
        if (other.getChangeSetId() != null
                && other.getChangeSetId().equals(this.getChangeSetId()) == false)
            return false;
        if (other.getChangeSetName() == null ^ this.getChangeSetName() == null)
            return false;
        if (other.getChangeSetName() != null
                && other.getChangeSetName().equals(this.getChangeSetName()) == false)
            return false;
        if (other.getExecutionStatus() == null ^ this.getExecutionStatus() == null)
            return false;
        if (other.getExecutionStatus() != null
                && other.getExecutionStatus().equals(this.getExecutionStatus()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null
                && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
