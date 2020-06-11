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

public class DescribeTaskSetsResult implements Serializable {
    /**
     * <p>
     * The list of task sets described.
     * </p>
     */
    private java.util.List<TaskSet> taskSets;

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     */
    private java.util.List<Failure> failures;

    /**
     * <p>
     * The list of task sets described.
     * </p>
     *
     * @return <p>
     *         The list of task sets described.
     *         </p>
     */
    public java.util.List<TaskSet> getTaskSets() {
        return taskSets;
    }

    /**
     * <p>
     * The list of task sets described.
     * </p>
     *
     * @param taskSets <p>
     *            The list of task sets described.
     *            </p>
     */
    public void setTaskSets(java.util.Collection<TaskSet> taskSets) {
        if (taskSets == null) {
            this.taskSets = null;
            return;
        }

        this.taskSets = new java.util.ArrayList<TaskSet>(taskSets);
    }

    /**
     * <p>
     * The list of task sets described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskSets <p>
     *            The list of task sets described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTaskSetsResult withTaskSets(TaskSet... taskSets) {
        if (getTaskSets() == null) {
            this.taskSets = new java.util.ArrayList<TaskSet>(taskSets.length);
        }
        for (TaskSet value : taskSets) {
            this.taskSets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of task sets described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskSets <p>
     *            The list of task sets described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTaskSetsResult withTaskSets(java.util.Collection<TaskSet> taskSets) {
        setTaskSets(taskSets);
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
    public DescribeTaskSetsResult withFailures(Failure... failures) {
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
    public DescribeTaskSetsResult withFailures(java.util.Collection<Failure> failures) {
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
        if (getTaskSets() != null)
            sb.append("taskSets: " + getTaskSets() + ",");
        if (getFailures() != null)
            sb.append("failures: " + getFailures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskSets() == null) ? 0 : getTaskSets().hashCode());
        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTaskSetsResult == false)
            return false;
        DescribeTaskSetsResult other = (DescribeTaskSetsResult) obj;

        if (other.getTaskSets() == null ^ this.getTaskSets() == null)
            return false;
        if (other.getTaskSets() != null && other.getTaskSets().equals(this.getTaskSets()) == false)
            return false;
        if (other.getFailures() == null ^ this.getFailures() == null)
            return false;
        if (other.getFailures() != null && other.getFailures().equals(this.getFailures()) == false)
            return false;
        return true;
    }
}
