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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * The criteria that are used to filter the task runs for the machine learning
 * transform.
 * </p>
 */
public class TaskRunFilterCriteria implements Serializable {
    /**
     * <p>
     * The type of task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVALUATION, LABELING_SET_GENERATION,
     * IMPORT_LABELS, EXPORT_LABELS, FIND_MATCHES
     */
    private String taskRunType;

    /**
     * <p>
     * The current status of the task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     */
    private String status;

    /**
     * <p>
     * Filter on task runs started before this date.
     * </p>
     */
    private java.util.Date startedBefore;

    /**
     * <p>
     * Filter on task runs started after this date.
     * </p>
     */
    private java.util.Date startedAfter;

    /**
     * <p>
     * The type of task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVALUATION, LABELING_SET_GENERATION,
     * IMPORT_LABELS, EXPORT_LABELS, FIND_MATCHES
     *
     * @return <p>
     *         The type of task run.
     *         </p>
     * @see TaskType
     */
    public String getTaskRunType() {
        return taskRunType;
    }

    /**
     * <p>
     * The type of task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVALUATION, LABELING_SET_GENERATION,
     * IMPORT_LABELS, EXPORT_LABELS, FIND_MATCHES
     *
     * @param taskRunType <p>
     *            The type of task run.
     *            </p>
     * @see TaskType
     */
    public void setTaskRunType(String taskRunType) {
        this.taskRunType = taskRunType;
    }

    /**
     * <p>
     * The type of task run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVALUATION, LABELING_SET_GENERATION,
     * IMPORT_LABELS, EXPORT_LABELS, FIND_MATCHES
     *
     * @param taskRunType <p>
     *            The type of task run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskType
     */
    public TaskRunFilterCriteria withTaskRunType(String taskRunType) {
        this.taskRunType = taskRunType;
        return this;
    }

    /**
     * <p>
     * The type of task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVALUATION, LABELING_SET_GENERATION,
     * IMPORT_LABELS, EXPORT_LABELS, FIND_MATCHES
     *
     * @param taskRunType <p>
     *            The type of task run.
     *            </p>
     * @see TaskType
     */
    public void setTaskRunType(TaskType taskRunType) {
        this.taskRunType = taskRunType.toString();
    }

    /**
     * <p>
     * The type of task run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVALUATION, LABELING_SET_GENERATION,
     * IMPORT_LABELS, EXPORT_LABELS, FIND_MATCHES
     *
     * @param taskRunType <p>
     *            The type of task run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskType
     */
    public TaskRunFilterCriteria withTaskRunType(TaskType taskRunType) {
        this.taskRunType = taskRunType.toString();
        return this;
    }

    /**
     * <p>
     * The current status of the task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     *
     * @return <p>
     *         The current status of the task run.
     *         </p>
     * @see TaskStatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     *
     * @param status <p>
     *            The current status of the task run.
     *            </p>
     * @see TaskStatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the task run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     *
     * @param status <p>
     *            The current status of the task run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskStatusType
     */
    public TaskRunFilterCriteria withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of the task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     *
     * @param status <p>
     *            The current status of the task run.
     *            </p>
     * @see TaskStatusType
     */
    public void setStatus(TaskStatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the task run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     *
     * @param status <p>
     *            The current status of the task run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskStatusType
     */
    public TaskRunFilterCriteria withStatus(TaskStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Filter on task runs started before this date.
     * </p>
     *
     * @return <p>
     *         Filter on task runs started before this date.
     *         </p>
     */
    public java.util.Date getStartedBefore() {
        return startedBefore;
    }

    /**
     * <p>
     * Filter on task runs started before this date.
     * </p>
     *
     * @param startedBefore <p>
     *            Filter on task runs started before this date.
     *            </p>
     */
    public void setStartedBefore(java.util.Date startedBefore) {
        this.startedBefore = startedBefore;
    }

    /**
     * <p>
     * Filter on task runs started before this date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startedBefore <p>
     *            Filter on task runs started before this date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskRunFilterCriteria withStartedBefore(java.util.Date startedBefore) {
        this.startedBefore = startedBefore;
        return this;
    }

    /**
     * <p>
     * Filter on task runs started after this date.
     * </p>
     *
     * @return <p>
     *         Filter on task runs started after this date.
     *         </p>
     */
    public java.util.Date getStartedAfter() {
        return startedAfter;
    }

    /**
     * <p>
     * Filter on task runs started after this date.
     * </p>
     *
     * @param startedAfter <p>
     *            Filter on task runs started after this date.
     *            </p>
     */
    public void setStartedAfter(java.util.Date startedAfter) {
        this.startedAfter = startedAfter;
    }

    /**
     * <p>
     * Filter on task runs started after this date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startedAfter <p>
     *            Filter on task runs started after this date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskRunFilterCriteria withStartedAfter(java.util.Date startedAfter) {
        this.startedAfter = startedAfter;
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
        if (getTaskRunType() != null)
            sb.append("TaskRunType: " + getTaskRunType() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStartedBefore() != null)
            sb.append("StartedBefore: " + getStartedBefore() + ",");
        if (getStartedAfter() != null)
            sb.append("StartedAfter: " + getStartedAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTaskRunType() == null) ? 0 : getTaskRunType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStartedBefore() == null) ? 0 : getStartedBefore().hashCode());
        hashCode = prime * hashCode
                + ((getStartedAfter() == null) ? 0 : getStartedAfter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskRunFilterCriteria == false)
            return false;
        TaskRunFilterCriteria other = (TaskRunFilterCriteria) obj;

        if (other.getTaskRunType() == null ^ this.getTaskRunType() == null)
            return false;
        if (other.getTaskRunType() != null
                && other.getTaskRunType().equals(this.getTaskRunType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartedBefore() == null ^ this.getStartedBefore() == null)
            return false;
        if (other.getStartedBefore() != null
                && other.getStartedBefore().equals(this.getStartedBefore()) == false)
            return false;
        if (other.getStartedAfter() == null ^ this.getStartedAfter() == null)
            return false;
        if (other.getStartedAfter() != null
                && other.getStartedAfter().equals(this.getStartedAfter()) == false)
            return false;
        return true;
    }
}
