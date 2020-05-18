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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

public class StopTaskResult implements Serializable {
    /**
     * <p>
     * The task that was stopped.
     * </p>
     */
    private Task task;

    /**
     * <p>
     * The task that was stopped.
     * </p>
     *
     * @return <p>
     *         The task that was stopped.
     *         </p>
     */
    public Task getTask() {
        return task;
    }

    /**
     * <p>
     * The task that was stopped.
     * </p>
     *
     * @param task <p>
     *            The task that was stopped.
     *            </p>
     */
    public void setTask(Task task) {
        this.task = task;
    }

    /**
     * <p>
     * The task that was stopped.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param task <p>
     *            The task that was stopped.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopTaskResult withTask(Task task) {
        this.task = task;
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
        if (getTask() != null)
            sb.append("task: " + getTask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTask() == null) ? 0 : getTask().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopTaskResult == false)
            return false;
        StopTaskResult other = (StopTaskResult) obj;

        if (other.getTask() == null ^ this.getTask() == null)
            return false;
        if (other.getTask() != null && other.getTask().equals(this.getTask()) == false)
            return false;
        return true;
    }
}
