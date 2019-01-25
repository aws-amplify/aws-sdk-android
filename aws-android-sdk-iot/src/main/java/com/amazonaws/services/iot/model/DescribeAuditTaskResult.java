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

public class DescribeAuditTaskResult implements Serializable {
    /**
     * <p>
     * The status of the audit: one of "IN_PROGRESS", "COMPLETED", "FAILED", or
     * "CANCELED".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     */
    private String taskStatus;

    /**
     * <p>
     * The type of audit: "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK
     */
    private String taskType;

    /**
     * <p>
     * The time the audit started.
     * </p>
     */
    private java.util.Date taskStartTime;

    /**
     * <p>
     * Statistical information about the audit.
     * </p>
     */
    private TaskStatistics taskStatistics;

    /**
     * <p>
     * The name of the scheduled audit (only if the audit was a scheduled
     * audit).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String scheduledAuditName;

    /**
     * <p>
     * Detailed information about each check performed during this audit.
     * </p>
     */
    private java.util.Map<String, AuditCheckDetails> auditDetails;

    /**
     * <p>
     * The status of the audit: one of "IN_PROGRESS", "COMPLETED", "FAILED", or
     * "CANCELED".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @return <p>
     *         The status of the audit: one of "IN_PROGRESS", "COMPLETED",
     *         "FAILED", or "CANCELED".
     *         </p>
     * @see AuditTaskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * <p>
     * The status of the audit: one of "IN_PROGRESS", "COMPLETED", "FAILED", or
     * "CANCELED".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            The status of the audit: one of "IN_PROGRESS", "COMPLETED",
     *            "FAILED", or "CANCELED".
     *            </p>
     * @see AuditTaskStatus
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * <p>
     * The status of the audit: one of "IN_PROGRESS", "COMPLETED", "FAILED", or
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
     *            The status of the audit: one of "IN_PROGRESS", "COMPLETED",
     *            "FAILED", or "CANCELED".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditTaskStatus
     */
    public DescribeAuditTaskResult withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * <p>
     * The status of the audit: one of "IN_PROGRESS", "COMPLETED", "FAILED", or
     * "CANCELED".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            The status of the audit: one of "IN_PROGRESS", "COMPLETED",
     *            "FAILED", or "CANCELED".
     *            </p>
     * @see AuditTaskStatus
     */
    public void setTaskStatus(AuditTaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
    }

    /**
     * <p>
     * The status of the audit: one of "IN_PROGRESS", "COMPLETED", "FAILED", or
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
     *            The status of the audit: one of "IN_PROGRESS", "COMPLETED",
     *            "FAILED", or "CANCELED".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditTaskStatus
     */
    public DescribeAuditTaskResult withTaskStatus(AuditTaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
        return this;
    }

    /**
     * <p>
     * The type of audit: "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK
     *
     * @return <p>
     *         The type of audit: "ON_DEMAND_AUDIT_TASK" or
     *         "SCHEDULED_AUDIT_TASK".
     *         </p>
     * @see AuditTaskType
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * <p>
     * The type of audit: "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK
     *
     * @param taskType <p>
     *            The type of audit: "ON_DEMAND_AUDIT_TASK" or
     *            "SCHEDULED_AUDIT_TASK".
     *            </p>
     * @see AuditTaskType
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * <p>
     * The type of audit: "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK
     *
     * @param taskType <p>
     *            The type of audit: "ON_DEMAND_AUDIT_TASK" or
     *            "SCHEDULED_AUDIT_TASK".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditTaskType
     */
    public DescribeAuditTaskResult withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * <p>
     * The type of audit: "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK
     *
     * @param taskType <p>
     *            The type of audit: "ON_DEMAND_AUDIT_TASK" or
     *            "SCHEDULED_AUDIT_TASK".
     *            </p>
     * @see AuditTaskType
     */
    public void setTaskType(AuditTaskType taskType) {
        this.taskType = taskType.toString();
    }

    /**
     * <p>
     * The type of audit: "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK
     *
     * @param taskType <p>
     *            The type of audit: "ON_DEMAND_AUDIT_TASK" or
     *            "SCHEDULED_AUDIT_TASK".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditTaskType
     */
    public DescribeAuditTaskResult withTaskType(AuditTaskType taskType) {
        this.taskType = taskType.toString();
        return this;
    }

    /**
     * <p>
     * The time the audit started.
     * </p>
     *
     * @return <p>
     *         The time the audit started.
     *         </p>
     */
    public java.util.Date getTaskStartTime() {
        return taskStartTime;
    }

    /**
     * <p>
     * The time the audit started.
     * </p>
     *
     * @param taskStartTime <p>
     *            The time the audit started.
     *            </p>
     */
    public void setTaskStartTime(java.util.Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    /**
     * <p>
     * The time the audit started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskStartTime <p>
     *            The time the audit started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAuditTaskResult withTaskStartTime(java.util.Date taskStartTime) {
        this.taskStartTime = taskStartTime;
        return this;
    }

    /**
     * <p>
     * Statistical information about the audit.
     * </p>
     *
     * @return <p>
     *         Statistical information about the audit.
     *         </p>
     */
    public TaskStatistics getTaskStatistics() {
        return taskStatistics;
    }

    /**
     * <p>
     * Statistical information about the audit.
     * </p>
     *
     * @param taskStatistics <p>
     *            Statistical information about the audit.
     *            </p>
     */
    public void setTaskStatistics(TaskStatistics taskStatistics) {
        this.taskStatistics = taskStatistics;
    }

    /**
     * <p>
     * Statistical information about the audit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskStatistics <p>
     *            Statistical information about the audit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAuditTaskResult withTaskStatistics(TaskStatistics taskStatistics) {
        this.taskStatistics = taskStatistics;
        return this;
    }

    /**
     * <p>
     * The name of the scheduled audit (only if the audit was a scheduled
     * audit).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The name of the scheduled audit (only if the audit was a
     *         scheduled audit).
     *         </p>
     */
    public String getScheduledAuditName() {
        return scheduledAuditName;
    }

    /**
     * <p>
     * The name of the scheduled audit (only if the audit was a scheduled
     * audit).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param scheduledAuditName <p>
     *            The name of the scheduled audit (only if the audit was a
     *            scheduled audit).
     *            </p>
     */
    public void setScheduledAuditName(String scheduledAuditName) {
        this.scheduledAuditName = scheduledAuditName;
    }

    /**
     * <p>
     * The name of the scheduled audit (only if the audit was a scheduled
     * audit).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param scheduledAuditName <p>
     *            The name of the scheduled audit (only if the audit was a
     *            scheduled audit).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAuditTaskResult withScheduledAuditName(String scheduledAuditName) {
        this.scheduledAuditName = scheduledAuditName;
        return this;
    }

    /**
     * <p>
     * Detailed information about each check performed during this audit.
     * </p>
     *
     * @return <p>
     *         Detailed information about each check performed during this
     *         audit.
     *         </p>
     */
    public java.util.Map<String, AuditCheckDetails> getAuditDetails() {
        return auditDetails;
    }

    /**
     * <p>
     * Detailed information about each check performed during this audit.
     * </p>
     *
     * @param auditDetails <p>
     *            Detailed information about each check performed during this
     *            audit.
     *            </p>
     */
    public void setAuditDetails(java.util.Map<String, AuditCheckDetails> auditDetails) {
        this.auditDetails = auditDetails;
    }

    /**
     * <p>
     * Detailed information about each check performed during this audit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param auditDetails <p>
     *            Detailed information about each check performed during this
     *            audit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAuditTaskResult withAuditDetails(
            java.util.Map<String, AuditCheckDetails> auditDetails) {
        this.auditDetails = auditDetails;
        return this;
    }

    /**
     * <p>
     * Detailed information about each check performed during this audit.
     * </p>
     * <p>
     * The method adds a new key-value pair into auditDetails parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into auditDetails.
     * @param value The corresponding value of the entry to be added into
     *            auditDetails.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAuditTaskResult addauditDetailsEntry(String key, AuditCheckDetails value) {
        if (null == this.auditDetails) {
            this.auditDetails = new java.util.HashMap<String, AuditCheckDetails>();
        }
        if (this.auditDetails.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.auditDetails.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into auditDetails.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DescribeAuditTaskResult clearauditDetailsEntries() {
        this.auditDetails = null;
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
        if (getTaskStatus() != null)
            sb.append("taskStatus: " + getTaskStatus() + ",");
        if (getTaskType() != null)
            sb.append("taskType: " + getTaskType() + ",");
        if (getTaskStartTime() != null)
            sb.append("taskStartTime: " + getTaskStartTime() + ",");
        if (getTaskStatistics() != null)
            sb.append("taskStatistics: " + getTaskStatistics() + ",");
        if (getScheduledAuditName() != null)
            sb.append("scheduledAuditName: " + getScheduledAuditName() + ",");
        if (getAuditDetails() != null)
            sb.append("auditDetails: " + getAuditDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        hashCode = prime * hashCode + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        hashCode = prime * hashCode
                + ((getTaskStartTime() == null) ? 0 : getTaskStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getTaskStatistics() == null) ? 0 : getTaskStatistics().hashCode());
        hashCode = prime * hashCode
                + ((getScheduledAuditName() == null) ? 0 : getScheduledAuditName().hashCode());
        hashCode = prime * hashCode
                + ((getAuditDetails() == null) ? 0 : getAuditDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAuditTaskResult == false)
            return false;
        DescribeAuditTaskResult other = (DescribeAuditTaskResult) obj;

        if (other.getTaskStatus() == null ^ this.getTaskStatus() == null)
            return false;
        if (other.getTaskStatus() != null
                && other.getTaskStatus().equals(this.getTaskStatus()) == false)
            return false;
        if (other.getTaskType() == null ^ this.getTaskType() == null)
            return false;
        if (other.getTaskType() != null && other.getTaskType().equals(this.getTaskType()) == false)
            return false;
        if (other.getTaskStartTime() == null ^ this.getTaskStartTime() == null)
            return false;
        if (other.getTaskStartTime() != null
                && other.getTaskStartTime().equals(this.getTaskStartTime()) == false)
            return false;
        if (other.getTaskStatistics() == null ^ this.getTaskStatistics() == null)
            return false;
        if (other.getTaskStatistics() != null
                && other.getTaskStatistics().equals(this.getTaskStatistics()) == false)
            return false;
        if (other.getScheduledAuditName() == null ^ this.getScheduledAuditName() == null)
            return false;
        if (other.getScheduledAuditName() != null
                && other.getScheduledAuditName().equals(this.getScheduledAuditName()) == false)
            return false;
        if (other.getAuditDetails() == null ^ this.getAuditDetails() == null)
            return false;
        if (other.getAuditDetails() != null
                && other.getAuditDetails().equals(this.getAuditDetails()) == false)
            return false;
        return true;
    }
}
