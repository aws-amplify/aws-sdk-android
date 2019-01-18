/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The audits that were performed.
 * </p>
 */
public class AuditTaskMetadata implements Serializable {
    /**
     * <p>
     * The ID of this audit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     */
    private String taskId;

    /**
     * <p>
     * The status of this audit: one of "IN_PROGRESS", "COMPLETED", "FAILED" or
     * "CANCELED".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     */
    private String taskStatus;

    /**
     * <p>
     * The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or
     * "SCHEDULED_AUDIT_TASK".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK
     */
    private String taskType;

    /**
     * <p>
     * The ID of this audit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @return <p>
     *         The ID of this audit.
     *         </p>
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * <p>
     * The ID of this audit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param taskId <p>
     *            The ID of this audit.
     *            </p>
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The ID of this audit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param taskId <p>
     *            The ID of this audit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditTaskMetadata withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * <p>
     * The status of this audit: one of "IN_PROGRESS", "COMPLETED", "FAILED" or
     * "CANCELED".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @return <p>
     *         The status of this audit: one of "IN_PROGRESS", "COMPLETED",
     *         "FAILED" or "CANCELED".
     *         </p>
     * @see AuditTaskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * <p>
     * The status of this audit: one of "IN_PROGRESS", "COMPLETED", "FAILED" or
     * "CANCELED".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            The status of this audit: one of "IN_PROGRESS", "COMPLETED",
     *            "FAILED" or "CANCELED".
     *            </p>
     * @see AuditTaskStatus
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * <p>
     * The status of this audit: one of "IN_PROGRESS", "COMPLETED", "FAILED" or
     * "CANCELED".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            The status of this audit: one of "IN_PROGRESS", "COMPLETED",
     *            "FAILED" or "CANCELED".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditTaskStatus
     */
    public AuditTaskMetadata withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * <p>
     * The status of this audit: one of "IN_PROGRESS", "COMPLETED", "FAILED" or
     * "CANCELED".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            The status of this audit: one of "IN_PROGRESS", "COMPLETED",
     *            "FAILED" or "CANCELED".
     *            </p>
     * @see AuditTaskStatus
     */
    public void setTaskStatus(AuditTaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
    }

    /**
     * <p>
     * The status of this audit: one of "IN_PROGRESS", "COMPLETED", "FAILED" or
     * "CANCELED".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            The status of this audit: one of "IN_PROGRESS", "COMPLETED",
     *            "FAILED" or "CANCELED".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditTaskStatus
     */
    public AuditTaskMetadata withTaskStatus(AuditTaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
        return this;
    }

    /**
     * <p>
     * The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or
     * "SCHEDULED_AUDIT_TASK".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK
     *
     * @return <p>
     *         The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or
     *         "SCHEDULED_AUDIT_TASK".
     *         </p>
     * @see AuditTaskType
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * <p>
     * The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or
     * "SCHEDULED_AUDIT_TASK".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK
     *
     * @param taskType <p>
     *            The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or
     *            "SCHEDULED_AUDIT_TASK".
     *            </p>
     * @see AuditTaskType
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * <p>
     * The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or
     * "SCHEDULED_AUDIT_TASK".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK
     *
     * @param taskType <p>
     *            The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or
     *            "SCHEDULED_AUDIT_TASK".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditTaskType
     */
    public AuditTaskMetadata withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * <p>
     * The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or
     * "SCHEDULED_AUDIT_TASK".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK
     *
     * @param taskType <p>
     *            The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or
     *            "SCHEDULED_AUDIT_TASK".
     *            </p>
     * @see AuditTaskType
     */
    public void setTaskType(AuditTaskType taskType) {
        this.taskType = taskType.toString();
    }

    /**
     * <p>
     * The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or
     * "SCHEDULED_AUDIT_TASK".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK
     *
     * @param taskType <p>
     *            The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or
     *            "SCHEDULED_AUDIT_TASK".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditTaskType
     */
    public AuditTaskMetadata withTaskType(AuditTaskType taskType) {
        this.taskType = taskType.toString();
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
        if (getTaskStatus() != null)
            sb.append("taskStatus: " + getTaskStatus() + ",");
        if (getTaskType() != null)
            sb.append("taskType: " + getTaskType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        hashCode = prime * hashCode + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuditTaskMetadata == false)
            return false;
        AuditTaskMetadata other = (AuditTaskMetadata) obj;

        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getTaskStatus() == null ^ this.getTaskStatus() == null)
            return false;
        if (other.getTaskStatus() != null
                && other.getTaskStatus().equals(this.getTaskStatus()) == false)
            return false;
        if (other.getTaskType() == null ^ this.getTaskType() == null)
            return false;
        if (other.getTaskType() != null && other.getTaskType().equals(this.getTaskType()) == false)
            return false;
        return true;
    }
}
