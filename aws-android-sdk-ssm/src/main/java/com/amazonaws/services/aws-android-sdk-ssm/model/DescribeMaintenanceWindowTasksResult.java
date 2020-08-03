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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


public class DescribeMaintenanceWindowTasksResult implements Serializable {
    /**
     * <p>Information about the tasks in the maintenance window.</p>
     */
    private java.util.List<MaintenanceWindowTask> tasks;

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    private String nextToken;

    /**
     * <p>Information about the tasks in the maintenance window.</p>
     *
     * @return <p>Information about the tasks in the maintenance window.</p>
     */
    public java.util.List<MaintenanceWindowTask> getTasks() {
        return tasks;
    }

    /**
     * <p>Information about the tasks in the maintenance window.</p>
     *
     * @param tasks <p>Information about the tasks in the maintenance window.</p>
     */
    public void setTasks(java.util.Collection<MaintenanceWindowTask> tasks) {
        if (tasks == null) {
            this.tasks = null;
            return;
        }

        this.tasks = new java.util.ArrayList<MaintenanceWindowTask>(tasks);
    }

    /**
     * <p>Information about the tasks in the maintenance window.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tasks <p>Information about the tasks in the maintenance window.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeMaintenanceWindowTasksResult withTasks(MaintenanceWindowTask... tasks) {
        if (getTasks() == null) {
            this.tasks = new java.util.ArrayList<MaintenanceWindowTask>(tasks.length);
        }
        for (MaintenanceWindowTask value : tasks) {
            this.tasks.add(value);
        }
        return this;
    }

    /**
     * <p>Information about the tasks in the maintenance window.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tasks <p>Information about the tasks in the maintenance window.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeMaintenanceWindowTasksResult withTasks(java.util.Collection<MaintenanceWindowTask> tasks) {
        setTasks(tasks);
        return this;
    }

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     *
     * @return <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     *
     * @param nextToken <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeMaintenanceWindowTasksResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTasks() != null) sb.append("Tasks: " + getTasks() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
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
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeMaintenanceWindowTasksResult == false) return false;
        DescribeMaintenanceWindowTasksResult other = (DescribeMaintenanceWindowTasksResult)obj;

        if (other.getTasks() == null ^ this.getTasks() == null) return false;
        if (other.getTasks() != null && other.getTasks().equals(this.getTasks()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
