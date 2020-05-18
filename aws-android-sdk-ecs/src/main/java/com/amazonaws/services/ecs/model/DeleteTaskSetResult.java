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

public class DeleteTaskSetResult implements Serializable {
    /**
     * <p>
     * Information about a set of Amazon ECS tasks in either an AWS CodeDeploy
     * or an <code>EXTERNAL</code> deployment. An Amazon ECS task set includes
     * details such as the desired number of tasks, how many tasks are running,
     * and whether the task set serves production traffic.
     * </p>
     */
    private TaskSet taskSet;

    /**
     * <p>
     * Information about a set of Amazon ECS tasks in either an AWS CodeDeploy
     * or an <code>EXTERNAL</code> deployment. An Amazon ECS task set includes
     * details such as the desired number of tasks, how many tasks are running,
     * and whether the task set serves production traffic.
     * </p>
     *
     * @return <p>
     *         Information about a set of Amazon ECS tasks in either an AWS
     *         CodeDeploy or an <code>EXTERNAL</code> deployment. An Amazon ECS
     *         task set includes details such as the desired number of tasks,
     *         how many tasks are running, and whether the task set serves
     *         production traffic.
     *         </p>
     */
    public TaskSet getTaskSet() {
        return taskSet;
    }

    /**
     * <p>
     * Information about a set of Amazon ECS tasks in either an AWS CodeDeploy
     * or an <code>EXTERNAL</code> deployment. An Amazon ECS task set includes
     * details such as the desired number of tasks, how many tasks are running,
     * and whether the task set serves production traffic.
     * </p>
     *
     * @param taskSet <p>
     *            Information about a set of Amazon ECS tasks in either an AWS
     *            CodeDeploy or an <code>EXTERNAL</code> deployment. An Amazon
     *            ECS task set includes details such as the desired number of
     *            tasks, how many tasks are running, and whether the task set
     *            serves production traffic.
     *            </p>
     */
    public void setTaskSet(TaskSet taskSet) {
        this.taskSet = taskSet;
    }

    /**
     * <p>
     * Information about a set of Amazon ECS tasks in either an AWS CodeDeploy
     * or an <code>EXTERNAL</code> deployment. An Amazon ECS task set includes
     * details such as the desired number of tasks, how many tasks are running,
     * and whether the task set serves production traffic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskSet <p>
     *            Information about a set of Amazon ECS tasks in either an AWS
     *            CodeDeploy or an <code>EXTERNAL</code> deployment. An Amazon
     *            ECS task set includes details such as the desired number of
     *            tasks, how many tasks are running, and whether the task set
     *            serves production traffic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTaskSetResult withTaskSet(TaskSet taskSet) {
        this.taskSet = taskSet;
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
        if (getTaskSet() != null)
            sb.append("taskSet: " + getTaskSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskSet() == null) ? 0 : getTaskSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTaskSetResult == false)
            return false;
        DeleteTaskSetResult other = (DeleteTaskSetResult) obj;

        if (other.getTaskSet() == null ^ this.getTaskSet() == null)
            return false;
        if (other.getTaskSet() != null && other.getTaskSet().equals(this.getTaskSet()) == false)
            return false;
        return true;
    }
}
