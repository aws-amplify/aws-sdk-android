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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Cancels an existing Amazon FSx for Lustre data repository task if that task
 * is in either the <code>PENDING</code> or <code>EXECUTING</code> state. When
 * you cancel a task, Amazon FSx does the following.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Any files that FSx has already exported are not reverted.
 * </p>
 * </li>
 * <li>
 * <p>
 * FSx continues to export any files that are "in-flight" when the cancel
 * operation is received.
 * </p>
 * </li>
 * <li>
 * <p>
 * FSx does not export any files that have not yet been exported.
 * </p>
 * </li>
 * </ul>
 */
public class CancelDataRepositoryTaskRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Specifies the data repository task to cancel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(task-[0-9a-f]{17,})$<br/>
     */
    private String taskId;

    /**
     * <p>
     * Specifies the data repository task to cancel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(task-[0-9a-f]{17,})$<br/>
     *
     * @return <p>
     *         Specifies the data repository task to cancel.
     *         </p>
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * <p>
     * Specifies the data repository task to cancel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(task-[0-9a-f]{17,})$<br/>
     *
     * @param taskId <p>
     *            Specifies the data repository task to cancel.
     *            </p>
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * Specifies the data repository task to cancel.
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
     *            Specifies the data repository task to cancel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelDataRepositoryTaskRequest withTaskId(String taskId) {
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
        if (getTaskId() != null)
            sb.append("TaskId: " + getTaskId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelDataRepositoryTaskRequest == false)
            return false;
        CancelDataRepositoryTaskRequest other = (CancelDataRepositoryTaskRequest) obj;

        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        return true;
    }
}
