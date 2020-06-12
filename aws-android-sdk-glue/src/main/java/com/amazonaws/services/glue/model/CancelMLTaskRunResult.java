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

public class CancelMLTaskRunResult implements Serializable {
    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String transformId;

    /**
     * <p>
     * The unique identifier for the task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String taskRunId;

    /**
     * <p>
     * The status for this run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     */
    private String status;

    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The unique identifier of the machine learning transform.
     *         </p>
     */
    public String getTransformId() {
        return transformId;
    }

    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param transformId <p>
     *            The unique identifier of the machine learning transform.
     *            </p>
     */
    public void setTransformId(String transformId) {
        this.transformId = transformId;
    }

    /**
     * <p>
     * The unique identifier of the machine learning transform.
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
     *            The unique identifier of the machine learning transform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelMLTaskRunResult withTransformId(String transformId) {
        this.transformId = transformId;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The unique identifier for the task run.
     *         </p>
     */
    public String getTaskRunId() {
        return taskRunId;
    }

    /**
     * <p>
     * The unique identifier for the task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param taskRunId <p>
     *            The unique identifier for the task run.
     *            </p>
     */
    public void setTaskRunId(String taskRunId) {
        this.taskRunId = taskRunId;
    }

    /**
     * <p>
     * The unique identifier for the task run.
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
     *            The unique identifier for the task run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelMLTaskRunResult withTaskRunId(String taskRunId) {
        this.taskRunId = taskRunId;
        return this;
    }

    /**
     * <p>
     * The status for this run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     *
     * @return <p>
     *         The status for this run.
     *         </p>
     * @see TaskStatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status for this run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     *
     * @param status <p>
     *            The status for this run.
     *            </p>
     * @see TaskStatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status for this run.
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
     *            The status for this run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskStatusType
     */
    public CancelMLTaskRunResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status for this run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     *
     * @param status <p>
     *            The status for this run.
     *            </p>
     * @see TaskStatusType
     */
    public void setStatus(TaskStatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status for this run.
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
     *            The status for this run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskStatusType
     */
    public CancelMLTaskRunResult withStatus(TaskStatusType status) {
        this.status = status.toString();
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
            sb.append("Status: " + getStatus());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelMLTaskRunResult == false)
            return false;
        CancelMLTaskRunResult other = (CancelMLTaskRunResult) obj;

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
        return true;
    }
}
