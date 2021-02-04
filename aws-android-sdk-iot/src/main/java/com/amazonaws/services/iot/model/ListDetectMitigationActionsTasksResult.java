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

public class ListDetectMitigationActionsTasksResult implements Serializable {
    /**
     * <p>
     * The collection of ML Detect mitigation tasks that matched the filter
     * criteria.
     * </p>
     */
    private java.util.List<DetectMitigationActionsTaskSummary> tasks;

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The collection of ML Detect mitigation tasks that matched the filter
     * criteria.
     * </p>
     *
     * @return <p>
     *         The collection of ML Detect mitigation tasks that matched the
     *         filter criteria.
     *         </p>
     */
    public java.util.List<DetectMitigationActionsTaskSummary> getTasks() {
        return tasks;
    }

    /**
     * <p>
     * The collection of ML Detect mitigation tasks that matched the filter
     * criteria.
     * </p>
     *
     * @param tasks <p>
     *            The collection of ML Detect mitigation tasks that matched the
     *            filter criteria.
     *            </p>
     */
    public void setTasks(java.util.Collection<DetectMitigationActionsTaskSummary> tasks) {
        if (tasks == null) {
            this.tasks = null;
            return;
        }

        this.tasks = new java.util.ArrayList<DetectMitigationActionsTaskSummary>(tasks);
    }

    /**
     * <p>
     * The collection of ML Detect mitigation tasks that matched the filter
     * criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tasks <p>
     *            The collection of ML Detect mitigation tasks that matched the
     *            filter criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDetectMitigationActionsTasksResult withTasks(
            DetectMitigationActionsTaskSummary... tasks) {
        if (getTasks() == null) {
            this.tasks = new java.util.ArrayList<DetectMitigationActionsTaskSummary>(tasks.length);
        }
        for (DetectMitigationActionsTaskSummary value : tasks) {
            this.tasks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The collection of ML Detect mitigation tasks that matched the filter
     * criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tasks <p>
     *            The collection of ML Detect mitigation tasks that matched the
     *            filter criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDetectMitigationActionsTasksResult withTasks(
            java.util.Collection<DetectMitigationActionsTaskSummary> tasks) {
        setTasks(tasks);
        return this;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     *
     * @return <p>
     *         A token that can be used to retrieve the next set of results, or
     *         <code>null</code> if there are no additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     *
     * @param nextToken <p>
     *            A token that can be used to retrieve the next set of results,
     *            or <code>null</code> if there are no additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token that can be used to retrieve the next set of results,
     *            or <code>null</code> if there are no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDetectMitigationActionsTasksResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTasks() == null) ? 0 : getTasks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDetectMitigationActionsTasksResult == false)
            return false;
        ListDetectMitigationActionsTasksResult other = (ListDetectMitigationActionsTasksResult) obj;

        if (other.getTasks() == null ^ this.getTasks() == null)
            return false;
        if (other.getTasks() != null && other.getTasks().equals(this.getTasks()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
