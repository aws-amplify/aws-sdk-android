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
 * The summary of the mitigation action tasks.
 * </p>
 */
public class DetectMitigationActionsTaskSummary implements Serializable {
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
     * The status of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCESSFUL, FAILED, CANCELED
     */
    private String taskStatus;

    /**
     * <p>
     * The date the task started.
     * </p>
     */
    private java.util.Date taskStartTime;

    /**
     * <p>
     * The date the task ended.
     * </p>
     */
    private java.util.Date taskEndTime;

    /**
     * <p>
     * Specifies the ML Detect findings to which the mitigation actions are
     * applied.
     * </p>
     */
    private DetectMitigationActionsTaskTarget target;

    /**
     * <p>
     * Specifies the time period of which violation events occurred between.
     * </p>
     */
    private ViolationEventOccurrenceRange violationEventOccurrenceRange;

    /**
     * <p>
     * Includes only active violations.
     * </p>
     */
    private Boolean onlyActiveViolationsIncluded;

    /**
     * <p>
     * Includes suppressed alerts.
     * </p>
     */
    private Boolean suppressedAlertsIncluded;

    /**
     * <p>
     * The definition of the actions.
     * </p>
     */
    private java.util.List<MitigationAction> actionsDefinition;

    /**
     * <p>
     * The statistics of a mitigation action task.
     * </p>
     */
    private DetectMitigationActionsTaskStatistics taskStatistics;

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
    public DetectMitigationActionsTaskSummary withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCESSFUL, FAILED, CANCELED
     *
     * @return <p>
     *         The status of the task.
     *         </p>
     * @see DetectMitigationActionsTaskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCESSFUL, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            The status of the task.
     *            </p>
     * @see DetectMitigationActionsTaskStatus
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCESSFUL, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            The status of the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DetectMitigationActionsTaskStatus
     */
    public DetectMitigationActionsTaskSummary withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCESSFUL, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            The status of the task.
     *            </p>
     * @see DetectMitigationActionsTaskStatus
     */
    public void setTaskStatus(DetectMitigationActionsTaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCESSFUL, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            The status of the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DetectMitigationActionsTaskStatus
     */
    public DetectMitigationActionsTaskSummary withTaskStatus(
            DetectMitigationActionsTaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date the task started.
     * </p>
     *
     * @return <p>
     *         The date the task started.
     *         </p>
     */
    public java.util.Date getTaskStartTime() {
        return taskStartTime;
    }

    /**
     * <p>
     * The date the task started.
     * </p>
     *
     * @param taskStartTime <p>
     *            The date the task started.
     *            </p>
     */
    public void setTaskStartTime(java.util.Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    /**
     * <p>
     * The date the task started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskStartTime <p>
     *            The date the task started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionsTaskSummary withTaskStartTime(java.util.Date taskStartTime) {
        this.taskStartTime = taskStartTime;
        return this;
    }

    /**
     * <p>
     * The date the task ended.
     * </p>
     *
     * @return <p>
     *         The date the task ended.
     *         </p>
     */
    public java.util.Date getTaskEndTime() {
        return taskEndTime;
    }

    /**
     * <p>
     * The date the task ended.
     * </p>
     *
     * @param taskEndTime <p>
     *            The date the task ended.
     *            </p>
     */
    public void setTaskEndTime(java.util.Date taskEndTime) {
        this.taskEndTime = taskEndTime;
    }

    /**
     * <p>
     * The date the task ended.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskEndTime <p>
     *            The date the task ended.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionsTaskSummary withTaskEndTime(java.util.Date taskEndTime) {
        this.taskEndTime = taskEndTime;
        return this;
    }

    /**
     * <p>
     * Specifies the ML Detect findings to which the mitigation actions are
     * applied.
     * </p>
     *
     * @return <p>
     *         Specifies the ML Detect findings to which the mitigation actions
     *         are applied.
     *         </p>
     */
    public DetectMitigationActionsTaskTarget getTarget() {
        return target;
    }

    /**
     * <p>
     * Specifies the ML Detect findings to which the mitigation actions are
     * applied.
     * </p>
     *
     * @param target <p>
     *            Specifies the ML Detect findings to which the mitigation
     *            actions are applied.
     *            </p>
     */
    public void setTarget(DetectMitigationActionsTaskTarget target) {
        this.target = target;
    }

    /**
     * <p>
     * Specifies the ML Detect findings to which the mitigation actions are
     * applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param target <p>
     *            Specifies the ML Detect findings to which the mitigation
     *            actions are applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionsTaskSummary withTarget(DetectMitigationActionsTaskTarget target) {
        this.target = target;
        return this;
    }

    /**
     * <p>
     * Specifies the time period of which violation events occurred between.
     * </p>
     *
     * @return <p>
     *         Specifies the time period of which violation events occurred
     *         between.
     *         </p>
     */
    public ViolationEventOccurrenceRange getViolationEventOccurrenceRange() {
        return violationEventOccurrenceRange;
    }

    /**
     * <p>
     * Specifies the time period of which violation events occurred between.
     * </p>
     *
     * @param violationEventOccurrenceRange <p>
     *            Specifies the time period of which violation events occurred
     *            between.
     *            </p>
     */
    public void setViolationEventOccurrenceRange(
            ViolationEventOccurrenceRange violationEventOccurrenceRange) {
        this.violationEventOccurrenceRange = violationEventOccurrenceRange;
    }

    /**
     * <p>
     * Specifies the time period of which violation events occurred between.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param violationEventOccurrenceRange <p>
     *            Specifies the time period of which violation events occurred
     *            between.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionsTaskSummary withViolationEventOccurrenceRange(
            ViolationEventOccurrenceRange violationEventOccurrenceRange) {
        this.violationEventOccurrenceRange = violationEventOccurrenceRange;
        return this;
    }

    /**
     * <p>
     * Includes only active violations.
     * </p>
     *
     * @return <p>
     *         Includes only active violations.
     *         </p>
     */
    public Boolean isOnlyActiveViolationsIncluded() {
        return onlyActiveViolationsIncluded;
    }

    /**
     * <p>
     * Includes only active violations.
     * </p>
     *
     * @return <p>
     *         Includes only active violations.
     *         </p>
     */
    public Boolean getOnlyActiveViolationsIncluded() {
        return onlyActiveViolationsIncluded;
    }

    /**
     * <p>
     * Includes only active violations.
     * </p>
     *
     * @param onlyActiveViolationsIncluded <p>
     *            Includes only active violations.
     *            </p>
     */
    public void setOnlyActiveViolationsIncluded(Boolean onlyActiveViolationsIncluded) {
        this.onlyActiveViolationsIncluded = onlyActiveViolationsIncluded;
    }

    /**
     * <p>
     * Includes only active violations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onlyActiveViolationsIncluded <p>
     *            Includes only active violations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionsTaskSummary withOnlyActiveViolationsIncluded(
            Boolean onlyActiveViolationsIncluded) {
        this.onlyActiveViolationsIncluded = onlyActiveViolationsIncluded;
        return this;
    }

    /**
     * <p>
     * Includes suppressed alerts.
     * </p>
     *
     * @return <p>
     *         Includes suppressed alerts.
     *         </p>
     */
    public Boolean isSuppressedAlertsIncluded() {
        return suppressedAlertsIncluded;
    }

    /**
     * <p>
     * Includes suppressed alerts.
     * </p>
     *
     * @return <p>
     *         Includes suppressed alerts.
     *         </p>
     */
    public Boolean getSuppressedAlertsIncluded() {
        return suppressedAlertsIncluded;
    }

    /**
     * <p>
     * Includes suppressed alerts.
     * </p>
     *
     * @param suppressedAlertsIncluded <p>
     *            Includes suppressed alerts.
     *            </p>
     */
    public void setSuppressedAlertsIncluded(Boolean suppressedAlertsIncluded) {
        this.suppressedAlertsIncluded = suppressedAlertsIncluded;
    }

    /**
     * <p>
     * Includes suppressed alerts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param suppressedAlertsIncluded <p>
     *            Includes suppressed alerts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionsTaskSummary withSuppressedAlertsIncluded(
            Boolean suppressedAlertsIncluded) {
        this.suppressedAlertsIncluded = suppressedAlertsIncluded;
        return this;
    }

    /**
     * <p>
     * The definition of the actions.
     * </p>
     *
     * @return <p>
     *         The definition of the actions.
     *         </p>
     */
    public java.util.List<MitigationAction> getActionsDefinition() {
        return actionsDefinition;
    }

    /**
     * <p>
     * The definition of the actions.
     * </p>
     *
     * @param actionsDefinition <p>
     *            The definition of the actions.
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
     * The definition of the actions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionsDefinition <p>
     *            The definition of the actions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionsTaskSummary withActionsDefinition(
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
     * The definition of the actions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionsDefinition <p>
     *            The definition of the actions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionsTaskSummary withActionsDefinition(
            java.util.Collection<MitigationAction> actionsDefinition) {
        setActionsDefinition(actionsDefinition);
        return this;
    }

    /**
     * <p>
     * The statistics of a mitigation action task.
     * </p>
     *
     * @return <p>
     *         The statistics of a mitigation action task.
     *         </p>
     */
    public DetectMitigationActionsTaskStatistics getTaskStatistics() {
        return taskStatistics;
    }

    /**
     * <p>
     * The statistics of a mitigation action task.
     * </p>
     *
     * @param taskStatistics <p>
     *            The statistics of a mitigation action task.
     *            </p>
     */
    public void setTaskStatistics(DetectMitigationActionsTaskStatistics taskStatistics) {
        this.taskStatistics = taskStatistics;
    }

    /**
     * <p>
     * The statistics of a mitigation action task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskStatistics <p>
     *            The statistics of a mitigation action task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionsTaskSummary withTaskStatistics(
            DetectMitigationActionsTaskStatistics taskStatistics) {
        this.taskStatistics = taskStatistics;
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
        if (getTaskStartTime() != null)
            sb.append("taskStartTime: " + getTaskStartTime() + ",");
        if (getTaskEndTime() != null)
            sb.append("taskEndTime: " + getTaskEndTime() + ",");
        if (getTarget() != null)
            sb.append("target: " + getTarget() + ",");
        if (getViolationEventOccurrenceRange() != null)
            sb.append("violationEventOccurrenceRange: " + getViolationEventOccurrenceRange() + ",");
        if (getOnlyActiveViolationsIncluded() != null)
            sb.append("onlyActiveViolationsIncluded: " + getOnlyActiveViolationsIncluded() + ",");
        if (getSuppressedAlertsIncluded() != null)
            sb.append("suppressedAlertsIncluded: " + getSuppressedAlertsIncluded() + ",");
        if (getActionsDefinition() != null)
            sb.append("actionsDefinition: " + getActionsDefinition() + ",");
        if (getTaskStatistics() != null)
            sb.append("taskStatistics: " + getTaskStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        hashCode = prime * hashCode
                + ((getTaskStartTime() == null) ? 0 : getTaskStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getTaskEndTime() == null) ? 0 : getTaskEndTime().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime
                * hashCode
                + ((getViolationEventOccurrenceRange() == null) ? 0
                        : getViolationEventOccurrenceRange().hashCode());
        hashCode = prime
                * hashCode
                + ((getOnlyActiveViolationsIncluded() == null) ? 0
                        : getOnlyActiveViolationsIncluded().hashCode());
        hashCode = prime
                * hashCode
                + ((getSuppressedAlertsIncluded() == null) ? 0 : getSuppressedAlertsIncluded()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getActionsDefinition() == null) ? 0 : getActionsDefinition().hashCode());
        hashCode = prime * hashCode
                + ((getTaskStatistics() == null) ? 0 : getTaskStatistics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectMitigationActionsTaskSummary == false)
            return false;
        DetectMitigationActionsTaskSummary other = (DetectMitigationActionsTaskSummary) obj;

        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getTaskStatus() == null ^ this.getTaskStatus() == null)
            return false;
        if (other.getTaskStatus() != null
                && other.getTaskStatus().equals(this.getTaskStatus()) == false)
            return false;
        if (other.getTaskStartTime() == null ^ this.getTaskStartTime() == null)
            return false;
        if (other.getTaskStartTime() != null
                && other.getTaskStartTime().equals(this.getTaskStartTime()) == false)
            return false;
        if (other.getTaskEndTime() == null ^ this.getTaskEndTime() == null)
            return false;
        if (other.getTaskEndTime() != null
                && other.getTaskEndTime().equals(this.getTaskEndTime()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getViolationEventOccurrenceRange() == null
                ^ this.getViolationEventOccurrenceRange() == null)
            return false;
        if (other.getViolationEventOccurrenceRange() != null
                && other.getViolationEventOccurrenceRange().equals(
                        this.getViolationEventOccurrenceRange()) == false)
            return false;
        if (other.getOnlyActiveViolationsIncluded() == null
                ^ this.getOnlyActiveViolationsIncluded() == null)
            return false;
        if (other.getOnlyActiveViolationsIncluded() != null
                && other.getOnlyActiveViolationsIncluded().equals(
                        this.getOnlyActiveViolationsIncluded()) == false)
            return false;
        if (other.getSuppressedAlertsIncluded() == null
                ^ this.getSuppressedAlertsIncluded() == null)
            return false;
        if (other.getSuppressedAlertsIncluded() != null
                && other.getSuppressedAlertsIncluded().equals(this.getSuppressedAlertsIncluded()) == false)
            return false;
        if (other.getActionsDefinition() == null ^ this.getActionsDefinition() == null)
            return false;
        if (other.getActionsDefinition() != null
                && other.getActionsDefinition().equals(this.getActionsDefinition()) == false)
            return false;
        if (other.getTaskStatistics() == null ^ this.getTaskStatistics() == null)
            return false;
        if (other.getTaskStatistics() != null
                && other.getTaskStatistics().equals(this.getTaskStatistics()) == false)
            return false;
        return true;
    }
}
