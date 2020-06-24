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

package com.amazonaws.services.fsx.model;

import java.io.Serializable;

public class CancelDataRepositoryTaskResult implements Serializable {
    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For
     * example, there may be files the task failed to process. The
     * <a>DataRepositoryTaskFailureDetails</a> property provides more
     * information about task failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not
     * complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, EXECUTING, FAILED, SUCCEEDED, CANCELED,
     * CANCELING
     */
    private String lifecycle;

    /**
     * <p>
     * The ID of the task being canceled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(task-[0-9a-f]{17,})$<br/>
     */
    private String taskId;

    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For
     * example, there may be files the task failed to process. The
     * <a>DataRepositoryTaskFailureDetails</a> property provides more
     * information about task failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not
     * complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, EXECUTING, FAILED, SUCCEEDED, CANCELED,
     * CANCELING
     *
     * @return <p>
     *         The lifecycle status of the data repository task, as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PENDING</code> - Amazon FSx has not started the task.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EXECUTING</code> - Amazon FSx is processing the task.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - Amazon FSx was not able to complete the
     *         task. For example, there may be files the task failed to process.
     *         The <a>DataRepositoryTaskFailureDetails</a> property provides
     *         more information about task failures.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code> - FSx completed the task successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANCELED</code> - Amazon FSx canceled the task and it did
     *         not complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANCELING</code> - FSx is in process of canceling the task.
     *         </p>
     *         </li>
     *         </ul>
     * @see DataRepositoryTaskLifecycle
     */
    public String getLifecycle() {
        return lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For
     * example, there may be files the task failed to process. The
     * <a>DataRepositoryTaskFailureDetails</a> property provides more
     * information about task failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not
     * complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, EXECUTING, FAILED, SUCCEEDED, CANCELED,
     * CANCELING
     *
     * @param lifecycle <p>
     *            The lifecycle status of the data repository task, as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PENDING</code> - Amazon FSx has not started the task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EXECUTING</code> - Amazon FSx is processing the task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - Amazon FSx was not able to complete the
     *            task. For example, there may be files the task failed to
     *            process. The <a>DataRepositoryTaskFailureDetails</a> property
     *            provides more information about task failures.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code> - FSx completed the task successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CANCELED</code> - Amazon FSx canceled the task and it
     *            did not complete.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CANCELING</code> - FSx is in process of canceling the
     *            task.
     *            </p>
     *            </li>
     *            </ul>
     * @see DataRepositoryTaskLifecycle
     */
    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For
     * example, there may be files the task failed to process. The
     * <a>DataRepositoryTaskFailureDetails</a> property provides more
     * information about task failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not
     * complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, EXECUTING, FAILED, SUCCEEDED, CANCELED,
     * CANCELING
     *
     * @param lifecycle <p>
     *            The lifecycle status of the data repository task, as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PENDING</code> - Amazon FSx has not started the task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EXECUTING</code> - Amazon FSx is processing the task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - Amazon FSx was not able to complete the
     *            task. For example, there may be files the task failed to
     *            process. The <a>DataRepositoryTaskFailureDetails</a> property
     *            provides more information about task failures.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code> - FSx completed the task successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CANCELED</code> - Amazon FSx canceled the task and it
     *            did not complete.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CANCELING</code> - FSx is in process of canceling the
     *            task.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataRepositoryTaskLifecycle
     */
    public CancelDataRepositoryTaskResult withLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For
     * example, there may be files the task failed to process. The
     * <a>DataRepositoryTaskFailureDetails</a> property provides more
     * information about task failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not
     * complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, EXECUTING, FAILED, SUCCEEDED, CANCELED,
     * CANCELING
     *
     * @param lifecycle <p>
     *            The lifecycle status of the data repository task, as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PENDING</code> - Amazon FSx has not started the task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EXECUTING</code> - Amazon FSx is processing the task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - Amazon FSx was not able to complete the
     *            task. For example, there may be files the task failed to
     *            process. The <a>DataRepositoryTaskFailureDetails</a> property
     *            provides more information about task failures.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code> - FSx completed the task successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CANCELED</code> - Amazon FSx canceled the task and it
     *            did not complete.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CANCELING</code> - FSx is in process of canceling the
     *            task.
     *            </p>
     *            </li>
     *            </ul>
     * @see DataRepositoryTaskLifecycle
     */
    public void setLifecycle(DataRepositoryTaskLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
    }

    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For
     * example, there may be files the task failed to process. The
     * <a>DataRepositoryTaskFailureDetails</a> property provides more
     * information about task failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not
     * complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, EXECUTING, FAILED, SUCCEEDED, CANCELED,
     * CANCELING
     *
     * @param lifecycle <p>
     *            The lifecycle status of the data repository task, as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PENDING</code> - Amazon FSx has not started the task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EXECUTING</code> - Amazon FSx is processing the task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - Amazon FSx was not able to complete the
     *            task. For example, there may be files the task failed to
     *            process. The <a>DataRepositoryTaskFailureDetails</a> property
     *            provides more information about task failures.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code> - FSx completed the task successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CANCELED</code> - Amazon FSx canceled the task and it
     *            did not complete.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CANCELING</code> - FSx is in process of canceling the
     *            task.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataRepositoryTaskLifecycle
     */
    public CancelDataRepositoryTaskResult withLifecycle(DataRepositoryTaskLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the task being canceled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(task-[0-9a-f]{17,})$<br/>
     *
     * @return <p>
     *         The ID of the task being canceled.
     *         </p>
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * <p>
     * The ID of the task being canceled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(task-[0-9a-f]{17,})$<br/>
     *
     * @param taskId <p>
     *            The ID of the task being canceled.
     *            </p>
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The ID of the task being canceled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(task-[0-9a-f]{17,})$<br/>
     *
     * @param taskId <p>
     *            The ID of the task being canceled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelDataRepositoryTaskResult withTaskId(String taskId) {
        this.taskId = taskId;
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
        if (getLifecycle() != null)
            sb.append("Lifecycle: " + getLifecycle() + ",");
        if (getTaskId() != null)
            sb.append("TaskId: " + getTaskId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelDataRepositoryTaskResult == false)
            return false;
        CancelDataRepositoryTaskResult other = (CancelDataRepositoryTaskResult) obj;

        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null
                && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        return true;
    }
}
