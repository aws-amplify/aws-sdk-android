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

public class RunTaskResult implements Serializable {
    /**
     * <p>
     * A full description of the tasks that were run. The tasks that were
     * successfully placed on your cluster are described here.
     * </p>
     */
    private java.util.List<Task> tasks;

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     */
    private java.util.List<Failure> failures;

    /**
     * <p>
     * A full description of the tasks that were run. The tasks that were
     * successfully placed on your cluster are described here.
     * </p>
     *
     * @return <p>
     *         A full description of the tasks that were run. The tasks that
     *         were successfully placed on your cluster are described here.
     *         </p>
     */
    public java.util.List<Task> getTasks() {
        return tasks;
    }

    /**
     * <p>
     * A full description of the tasks that were run. The tasks that were
     * successfully placed on your cluster are described here.
     * </p>
     *
     * @param tasks <p>
     *            A full description of the tasks that were run. The tasks that
     *            were successfully placed on your cluster are described here.
     *            </p>
     */
    public void setTasks(java.util.Collection<Task> tasks) {
        if (tasks == null) {
            this.tasks = null;
            return;
        }

        this.tasks = new java.util.ArrayList<Task>(tasks);
    }

    /**
     * <p>
     * A full description of the tasks that were run. The tasks that were
     * successfully placed on your cluster are described here.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tasks <p>
     *            A full description of the tasks that were run. The tasks that
     *            were successfully placed on your cluster are described here.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskResult withTasks(Task... tasks) {
        if (getTasks() == null) {
            this.tasks = new java.util.ArrayList<Task>(tasks.length);
        }
        for (Task value : tasks) {
            this.tasks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A full description of the tasks that were run. The tasks that were
     * successfully placed on your cluster are described here.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tasks <p>
     *            A full description of the tasks that were run. The tasks that
     *            were successfully placed on your cluster are described here.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskResult withTasks(java.util.Collection<Task> tasks) {
        setTasks(tasks);
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     *
     * @return <p>
     *         Any failures associated with the call.
     *         </p>
     */
    public java.util.List<Failure> getFailures() {
        return failures;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     *
     * @param failures <p>
     *            Any failures associated with the call.
     *            </p>
     */
    public void setFailures(java.util.Collection<Failure> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new java.util.ArrayList<Failure>(failures);
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failures <p>
     *            Any failures associated with the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskResult withFailures(Failure... failures) {
        if (getFailures() == null) {
            this.failures = new java.util.ArrayList<Failure>(failures.length);
        }
        for (Failure value : failures) {
            this.failures.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failures <p>
     *            Any failures associated with the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskResult withFailures(java.util.Collection<Failure> failures) {
        setFailures(failures);
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
        if (getTasks() != null)
            sb.append("tasks: " + getTasks() + ",");
        if (getFailures() != null)
            sb.append("failures: " + getFailures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTasks() == null) ? 0 : getTasks().hashCode());
        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunTaskResult == false)
            return false;
        RunTaskResult other = (RunTaskResult) obj;

        if (other.getTasks() == null ^ this.getTasks() == null)
            return false;
        if (other.getTasks() != null && other.getTasks().equals(this.getTasks()) == false)
            return false;
        if (other.getFailures() == null ^ this.getFailures() == null)
            return false;
        if (other.getFailures() != null && other.getFailures().equals(this.getFailures()) == false)
            return false;
        return true;
    }
}
