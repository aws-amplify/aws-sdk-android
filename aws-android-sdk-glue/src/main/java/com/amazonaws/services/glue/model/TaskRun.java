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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * The sampling parameters that are associated with the machine learning
 * transform.
 * </p>
 */
public class TaskRun implements Serializable {
    /**
     * <p>
     * The unique identifier for the transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String transformId;

    /**
     * <p>
     * The unique identifier for this task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String taskRunId;

    /**
     * <p>
     * The current status of the requested task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     */
    private String status;

    /**
     * <p>
     * The names of the log group for secure logging, associated with this task
     * run.
     * </p>
     */
    private String logGroupName;

    /**
     * <p>
     * Specifies configuration properties associated with this task run.
     * </p>
     */
    private TaskRunProperties properties;

    /**
     * <p>
     * The list of error strings associated with this task run.
     * </p>
     */
    private String errorString;

    /**
     * <p>
     * The date and time that this task run started.
     * </p>
     */
    private java.util.Date startedOn;

    /**
     * <p>
     * The last point in time that the requested task run was updated.
     * </p>
     */
    private java.util.Date lastModifiedOn;

    /**
     * <p>
     * The last point in time that the requested task run was completed.
     * </p>
     */
    private java.util.Date completedOn;

    /**
     * <p>
     * The amount of time (in seconds) that the task run consumed resources.
     * </p>
     */
    private Integer executionTime;

    /**
     * <p>
     * The unique identifier for the transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The unique identifier for the transform.
     *         </p>
     */
    public String getTransformId() {
        return transformId;
    }

    /**
     * <p>
     * The unique identifier for the transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param transformId <p>
     *            The unique identifier for the transform.
     *            </p>
     */
    public void setTransformId(String transformId) {
        this.transformId = transformId;
    }

    /**
     * <p>
     * The unique identifier for the transform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param transformId <p>
     *            The unique identifier for the transform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskRun withTransformId(String transformId) {
        this.transformId = transformId;
        return this;
    }

    /**
     * <p>
     * The unique identifier for this task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The unique identifier for this task run.
     *         </p>
     */
    public String getTaskRunId() {
        return taskRunId;
    }

    /**
     * <p>
     * The unique identifier for this task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param taskRunId <p>
     *            The unique identifier for this task run.
     *            </p>
     */
    public void setTaskRunId(String taskRunId) {
        this.taskRunId = taskRunId;
    }

    /**
     * <p>
     * The unique identifier for this task run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param taskRunId <p>
     *            The unique identifier for this task run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskRun withTaskRunId(String taskRunId) {
        this.taskRunId = taskRunId;
        return this;
    }

    /**
     * <p>
     * The current status of the requested task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     *
     * @return <p>
     *         The current status of the requested task run.
     *         </p>
     * @see TaskStatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the requested task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     *
     * @param status <p>
     *            The current status of the requested task run.
     *            </p>
     * @see TaskStatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the requested task run.
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
     *            The current status of the requested task run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskStatusType
     */
    public TaskRun withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of the requested task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     *
     * @param status <p>
     *            The current status of the requested task run.
     *            </p>
     * @see TaskStatusType
     */
    public void setStatus(TaskStatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the requested task run.
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
     *            The current status of the requested task run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskStatusType
     */
    public TaskRun withStatus(TaskStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The names of the log group for secure logging, associated with this task
     * run.
     * </p>
     *
     * @return <p>
     *         The names of the log group for secure logging, associated with
     *         this task run.
     *         </p>
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    /**
     * <p>
     * The names of the log group for secure logging, associated with this task
     * run.
     * </p>
     *
     * @param logGroupName <p>
     *            The names of the log group for secure logging, associated with
     *            this task run.
     *            </p>
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The names of the log group for secure logging, associated with this task
     * run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logGroupName <p>
     *            The names of the log group for secure logging, associated with
     *            this task run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskRun withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * <p>
     * Specifies configuration properties associated with this task run.
     * </p>
     *
     * @return <p>
     *         Specifies configuration properties associated with this task run.
     *         </p>
     */
    public TaskRunProperties getProperties() {
        return properties;
    }

    /**
     * <p>
     * Specifies configuration properties associated with this task run.
     * </p>
     *
     * @param properties <p>
     *            Specifies configuration properties associated with this task
     *            run.
     *            </p>
     */
    public void setProperties(TaskRunProperties properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * Specifies configuration properties associated with this task run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param properties <p>
     *            Specifies configuration properties associated with this task
     *            run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskRun withProperties(TaskRunProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * <p>
     * The list of error strings associated with this task run.
     * </p>
     *
     * @return <p>
     *         The list of error strings associated with this task run.
     *         </p>
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * <p>
     * The list of error strings associated with this task run.
     * </p>
     *
     * @param errorString <p>
     *            The list of error strings associated with this task run.
     *            </p>
     */
    public void setErrorString(String errorString) {
        this.errorString = errorString;
    }

    /**
     * <p>
     * The list of error strings associated with this task run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorString <p>
     *            The list of error strings associated with this task run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskRun withErrorString(String errorString) {
        this.errorString = errorString;
        return this;
    }

    /**
     * <p>
     * The date and time that this task run started.
     * </p>
     *
     * @return <p>
     *         The date and time that this task run started.
     *         </p>
     */
    public java.util.Date getStartedOn() {
        return startedOn;
    }

    /**
     * <p>
     * The date and time that this task run started.
     * </p>
     *
     * @param startedOn <p>
     *            The date and time that this task run started.
     *            </p>
     */
    public void setStartedOn(java.util.Date startedOn) {
        this.startedOn = startedOn;
    }

    /**
     * <p>
     * The date and time that this task run started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startedOn <p>
     *            The date and time that this task run started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskRun withStartedOn(java.util.Date startedOn) {
        this.startedOn = startedOn;
        return this;
    }

    /**
     * <p>
     * The last point in time that the requested task run was updated.
     * </p>
     *
     * @return <p>
     *         The last point in time that the requested task run was updated.
     *         </p>
     */
    public java.util.Date getLastModifiedOn() {
        return lastModifiedOn;
    }

    /**
     * <p>
     * The last point in time that the requested task run was updated.
     * </p>
     *
     * @param lastModifiedOn <p>
     *            The last point in time that the requested task run was
     *            updated.
     *            </p>
     */
    public void setLastModifiedOn(java.util.Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    /**
     * <p>
     * The last point in time that the requested task run was updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedOn <p>
     *            The last point in time that the requested task run was
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskRun withLastModifiedOn(java.util.Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
        return this;
    }

    /**
     * <p>
     * The last point in time that the requested task run was completed.
     * </p>
     *
     * @return <p>
     *         The last point in time that the requested task run was completed.
     *         </p>
     */
    public java.util.Date getCompletedOn() {
        return completedOn;
    }

    /**
     * <p>
     * The last point in time that the requested task run was completed.
     * </p>
     *
     * @param completedOn <p>
     *            The last point in time that the requested task run was
     *            completed.
     *            </p>
     */
    public void setCompletedOn(java.util.Date completedOn) {
        this.completedOn = completedOn;
    }

    /**
     * <p>
     * The last point in time that the requested task run was completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completedOn <p>
     *            The last point in time that the requested task run was
     *            completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskRun withCompletedOn(java.util.Date completedOn) {
        this.completedOn = completedOn;
        return this;
    }

    /**
     * <p>
     * The amount of time (in seconds) that the task run consumed resources.
     * </p>
     *
     * @return <p>
     *         The amount of time (in seconds) that the task run consumed
     *         resources.
     *         </p>
     */
    public Integer getExecutionTime() {
        return executionTime;
    }

    /**
     * <p>
     * The amount of time (in seconds) that the task run consumed resources.
     * </p>
     *
     * @param executionTime <p>
     *            The amount of time (in seconds) that the task run consumed
     *            resources.
     *            </p>
     */
    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }

    /**
     * <p>
     * The amount of time (in seconds) that the task run consumed resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionTime <p>
     *            The amount of time (in seconds) that the task run consumed
     *            resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskRun withExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
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
        if (getTransformId() != null)
            sb.append("TransformId: " + getTransformId() + ",");
        if (getTaskRunId() != null)
            sb.append("TaskRunId: " + getTaskRunId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getProperties() != null)
            sb.append("Properties: " + getProperties() + ",");
        if (getErrorString() != null)
            sb.append("ErrorString: " + getErrorString() + ",");
        if (getStartedOn() != null)
            sb.append("StartedOn: " + getStartedOn() + ",");
        if (getLastModifiedOn() != null)
            sb.append("LastModifiedOn: " + getLastModifiedOn() + ",");
        if (getCompletedOn() != null)
            sb.append("CompletedOn: " + getCompletedOn() + ",");
        if (getExecutionTime() != null)
            sb.append("ExecutionTime: " + getExecutionTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTransformId() == null) ? 0 : getTransformId().hashCode());
        hashCode = prime * hashCode + ((getTaskRunId() == null) ? 0 : getTaskRunId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode
                + ((getErrorString() == null) ? 0 : getErrorString().hashCode());
        hashCode = prime * hashCode + ((getStartedOn() == null) ? 0 : getStartedOn().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedOn() == null) ? 0 : getLastModifiedOn().hashCode());
        hashCode = prime * hashCode
                + ((getCompletedOn() == null) ? 0 : getCompletedOn().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionTime() == null) ? 0 : getExecutionTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskRun == false)
            return false;
        TaskRun other = (TaskRun) obj;

        if (other.getTransformId() == null ^ this.getTransformId() == null)
            return false;
        if (other.getTransformId() != null
                && other.getTransformId().equals(this.getTransformId()) == false)
            return false;
        if (other.getTaskRunId() == null ^ this.getTaskRunId() == null)
            return false;
        if (other.getTaskRunId() != null
                && other.getTaskRunId().equals(this.getTaskRunId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null
                && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getErrorString() == null ^ this.getErrorString() == null)
            return false;
        if (other.getErrorString() != null
                && other.getErrorString().equals(this.getErrorString()) == false)
            return false;
        if (other.getStartedOn() == null ^ this.getStartedOn() == null)
            return false;
        if (other.getStartedOn() != null
                && other.getStartedOn().equals(this.getStartedOn()) == false)
            return false;
        if (other.getLastModifiedOn() == null ^ this.getLastModifiedOn() == null)
            return false;
        if (other.getLastModifiedOn() != null
                && other.getLastModifiedOn().equals(this.getLastModifiedOn()) == false)
            return false;
        if (other.getCompletedOn() == null ^ this.getCompletedOn() == null)
            return false;
        if (other.getCompletedOn() != null
                && other.getCompletedOn().equals(this.getCompletedOn()) == false)
            return false;
        if (other.getExecutionTime() == null ^ this.getExecutionTime() == null)
            return false;
        if (other.getExecutionTime() != null
                && other.getExecutionTime().equals(this.getExecutionTime()) == false)
            return false;
        return true;
    }
}
