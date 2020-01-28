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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class DescribeAuditMitigationActionsTaskResult implements Serializable {
    /**
     * <p>
     * The current status of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     */
    private String taskStatus;

    /**
     * <p>
     * The date and time when the task was started.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The date and time when the task was completed or canceled.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * Aggregate counts of the results when the mitigation tasks were applied to
     * the findings for this audit mitigation actions task.
     * </p>
     */
    private java.util.Map<String, TaskStatisticsForAuditCheck> taskStatistics;

    /**
     * <p>
     * Identifies the findings to which the mitigation actions are applied. This
     * can be by audit checks, by audit task, or a set of findings.
     * </p>
     */
    private AuditMitigationActionsTaskTarget target;

    /**
     * <p>
     * Specifies the mitigation actions that should be applied to specific audit
     * checks.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> auditCheckToActionsMapping;

    /**
     * <p>
     * Specifies the mitigation actions and their parameters that are applied as
     * part of this task.
     * </p>
     */
    private java.util.List<MitigationAction> actionsDefinition;

    /**
     * <p>
     * The current status of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @return <p>
     *         The current status of the task.
     *         </p>
     * @see AuditMitigationActionsTaskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * <p>
     * The current status of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            The current status of the task.
     *            </p>
     * @see AuditMitigationActionsTaskStatus
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * <p>
     * The current status of the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            The current status of the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditMitigationActionsTaskStatus
     */
    public DescribeAuditMitigationActionsTaskResult withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            The current status of the task.
     *            </p>
     * @see AuditMitigationActionsTaskStatus
     */
    public void setTaskStatus(AuditMitigationActionsTaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
    }

    /**
     * <p>
     * The current status of the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            The current status of the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditMitigationActionsTaskStatus
     */
    public DescribeAuditMitigationActionsTaskResult withTaskStatus(
            AuditMitigationActionsTaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
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
    public DescribeAuditMitigationActionsTaskResult withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The date and time when the task was completed or canceled.
     * </p>
     *
     * @return <p>
     *         The date and time when the task was completed or canceled.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The date and time when the task was completed or canceled.
     * </p>
     *
     * @param endTime <p>
     *            The date and time when the task was completed or canceled.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time when the task was completed or canceled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The date and time when the task was completed or canceled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAuditMitigationActionsTaskResult withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * Aggregate counts of the results when the mitigation tasks were applied to
     * the findings for this audit mitigation actions task.
     * </p>
     *
     * @return <p>
     *         Aggregate counts of the results when the mitigation tasks were
     *         applied to the findings for this audit mitigation actions task.
     *         </p>
     */
    public java.util.Map<String, TaskStatisticsForAuditCheck> getTaskStatistics() {
        return taskStatistics;
    }

    /**
     * <p>
     * Aggregate counts of the results when the mitigation tasks were applied to
     * the findings for this audit mitigation actions task.
     * </p>
     *
     * @param taskStatistics <p>
     *            Aggregate counts of the results when the mitigation tasks were
     *            applied to the findings for this audit mitigation actions
     *            task.
     *            </p>
     */
    public void setTaskStatistics(java.util.Map<String, TaskStatisticsForAuditCheck> taskStatistics) {
        this.taskStatistics = taskStatistics;
    }

    /**
     * <p>
     * Aggregate counts of the results when the mitigation tasks were applied to
     * the findings for this audit mitigation actions task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskStatistics <p>
     *            Aggregate counts of the results when the mitigation tasks were
     *            applied to the findings for this audit mitigation actions
     *            task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAuditMitigationActionsTaskResult withTaskStatistics(
            java.util.Map<String, TaskStatisticsForAuditCheck> taskStatistics) {
        this.taskStatistics = taskStatistics;
        return this;
    }

    /**
     * <p>
     * Aggregate counts of the results when the mitigation tasks were applied to
     * the findings for this audit mitigation actions task.
     * </p>
     * <p>
     * The method adds a new key-value pair into taskStatistics parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into taskStatistics.
     * @param value The corresponding value of the entry to be added into
     *            taskStatistics.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAuditMitigationActionsTaskResult addtaskStatisticsEntry(String key,
            TaskStatisticsForAuditCheck value) {
        if (null == this.taskStatistics) {
            this.taskStatistics = new java.util.HashMap<String, TaskStatisticsForAuditCheck>();
        }
        if (this.taskStatistics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.taskStatistics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into taskStatistics.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DescribeAuditMitigationActionsTaskResult cleartaskStatisticsEntries() {
        this.taskStatistics = null;
        return this;
    }

    /**
     * <p>
     * Identifies the findings to which the mitigation actions are applied. This
     * can be by audit checks, by audit task, or a set of findings.
     * </p>
     *
     * @return <p>
     *         Identifies the findings to which the mitigation actions are
     *         applied. This can be by audit checks, by audit task, or a set of
     *         findings.
     *         </p>
     */
    public AuditMitigationActionsTaskTarget getTarget() {
        return target;
    }

    /**
     * <p>
     * Identifies the findings to which the mitigation actions are applied. This
     * can be by audit checks, by audit task, or a set of findings.
     * </p>
     *
     * @param target <p>
     *            Identifies the findings to which the mitigation actions are
     *            applied. This can be by audit checks, by audit task, or a set
     *            of findings.
     *            </p>
     */
    public void setTarget(AuditMitigationActionsTaskTarget target) {
        this.target = target;
    }

    /**
     * <p>
     * Identifies the findings to which the mitigation actions are applied. This
     * can be by audit checks, by audit task, or a set of findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param target <p>
     *            Identifies the findings to which the mitigation actions are
     *            applied. This can be by audit checks, by audit task, or a set
     *            of findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAuditMitigationActionsTaskResult withTarget(
            AuditMitigationActionsTaskTarget target) {
        this.target = target;
        return this;
    }

    /**
     * <p>
     * Specifies the mitigation actions that should be applied to specific audit
     * checks.
     * </p>
     *
     * @return <p>
     *         Specifies the mitigation actions that should be applied to
     *         specific audit checks.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getAuditCheckToActionsMapping() {
        return auditCheckToActionsMapping;
    }

    /**
     * <p>
     * Specifies the mitigation actions that should be applied to specific audit
     * checks.
     * </p>
     *
     * @param auditCheckToActionsMapping <p>
     *            Specifies the mitigation actions that should be applied to
     *            specific audit checks.
     *            </p>
     */
    public void setAuditCheckToActionsMapping(
            java.util.Map<String, java.util.List<String>> auditCheckToActionsMapping) {
        this.auditCheckToActionsMapping = auditCheckToActionsMapping;
    }

    /**
     * <p>
     * Specifies the mitigation actions that should be applied to specific audit
     * checks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param auditCheckToActionsMapping <p>
     *            Specifies the mitigation actions that should be applied to
     *            specific audit checks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAuditMitigationActionsTaskResult withAuditCheckToActionsMapping(
            java.util.Map<String, java.util.List<String>> auditCheckToActionsMapping) {
        this.auditCheckToActionsMapping = auditCheckToActionsMapping;
        return this;
    }

    /**
     * <p>
     * Specifies the mitigation actions that should be applied to specific audit
     * checks.
     * </p>
     * <p>
     * The method adds a new key-value pair into auditCheckToActionsMapping
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            auditCheckToActionsMapping.
     * @param value The corresponding value of the entry to be added into
     *            auditCheckToActionsMapping.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAuditMitigationActionsTaskResult addauditCheckToActionsMappingEntry(String key,
            java.util.List<String> value) {
        if (null == this.auditCheckToActionsMapping) {
            this.auditCheckToActionsMapping = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.auditCheckToActionsMapping.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.auditCheckToActionsMapping.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into auditCheckToActionsMapping.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DescribeAuditMitigationActionsTaskResult clearauditCheckToActionsMappingEntries() {
        this.auditCheckToActionsMapping = null;
        return this;
    }

    /**
     * <p>
     * Specifies the mitigation actions and their parameters that are applied as
     * part of this task.
     * </p>
     *
     * @return <p>
     *         Specifies the mitigation actions and their parameters that are
     *         applied as part of this task.
     *         </p>
     */
    public java.util.List<MitigationAction> getActionsDefinition() {
        return actionsDefinition;
    }

    /**
     * <p>
     * Specifies the mitigation actions and their parameters that are applied as
     * part of this task.
     * </p>
     *
     * @param actionsDefinition <p>
     *            Specifies the mitigation actions and their parameters that are
     *            applied as part of this task.
     *            </p>
     */
    public void setActionsDefinition(java.util.Collection<MitigationAction> actionsDefinition) {
        if (actionsDefinition == null) {
            this.actionsDefinition = null;
            return;
        }

        this.actionsDefinition = new java.util.ArrayList<MitigationAction>(actionsDefinition);
    }

    /**
     * <p>
     * Specifies the mitigation actions and their parameters that are applied as
     * part of this task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionsDefinition <p>
     *            Specifies the mitigation actions and their parameters that are
     *            applied as part of this task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAuditMitigationActionsTaskResult withActionsDefinition(
            MitigationAction... actionsDefinition) {
        if (getActionsDefinition() == null) {
            this.actionsDefinition = new java.util.ArrayList<MitigationAction>(
                    actionsDefinition.length);
        }
        for (MitigationAction value : actionsDefinition) {
            this.actionsDefinition.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the mitigation actions and their parameters that are applied as
     * part of this task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionsDefinition <p>
     *            Specifies the mitigation actions and their parameters that are
     *            applied as part of this task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAuditMitigationActionsTaskResult withActionsDefinition(
            java.util.Collection<MitigationAction> actionsDefinition) {
        setActionsDefinition(actionsDefinition);
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
        if (getStartTime() != null)
            sb.append("startTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("endTime: " + getEndTime() + ",");
        if (getTaskStatistics() != null)
            sb.append("taskStatistics: " + getTaskStatistics() + ",");
        if (getTarget() != null)
            sb.append("target: " + getTarget() + ",");
        if (getAuditCheckToActionsMapping() != null)
            sb.append("auditCheckToActionsMapping: " + getAuditCheckToActionsMapping() + ",");
        if (getActionsDefinition() != null)
            sb.append("actionsDefinition: " + getActionsDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getTaskStatistics() == null) ? 0 : getTaskStatistics().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuditCheckToActionsMapping() == null) ? 0 : getAuditCheckToActionsMapping()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getActionsDefinition() == null) ? 0 : getActionsDefinition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAuditMitigationActionsTaskResult == false)
            return false;
        DescribeAuditMitigationActionsTaskResult other = (DescribeAuditMitigationActionsTaskResult) obj;

        if (other.getTaskStatus() == null ^ this.getTaskStatus() == null)
            return false;
        if (other.getTaskStatus() != null
                && other.getTaskStatus().equals(this.getTaskStatus()) == false)
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
        if (other.getTaskStatistics() == null ^ this.getTaskStatistics() == null)
            return false;
        if (other.getTaskStatistics() != null
                && other.getTaskStatistics().equals(this.getTaskStatistics()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getAuditCheckToActionsMapping() == null
                ^ this.getAuditCheckToActionsMapping() == null)
            return false;
        if (other.getAuditCheckToActionsMapping() != null
                && other.getAuditCheckToActionsMapping().equals(
                        this.getAuditCheckToActionsMapping()) == false)
            return false;
        if (other.getActionsDefinition() == null ^ this.getActionsDefinition() == null)
            return false;
        if (other.getActionsDefinition() != null
                && other.getActionsDefinition().equals(this.getActionsDefinition()) == false)
            return false;
        return true;
    }
}
