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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;


/**
 * <p>Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and the number of tasks that failed.</p>
 */
public class JobProgressSummary implements Serializable {
    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long totalNumberOfTasks;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long numberOfTasksSucceeded;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long numberOfTasksFailed;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p/>
     */
    public Long getTotalNumberOfTasks() {
        return totalNumberOfTasks;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param totalNumberOfTasks <p/>
     */
    public void setTotalNumberOfTasks(Long totalNumberOfTasks) {
        this.totalNumberOfTasks = totalNumberOfTasks;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param totalNumberOfTasks <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobProgressSummary withTotalNumberOfTasks(Long totalNumberOfTasks) {
        this.totalNumberOfTasks = totalNumberOfTasks;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p/>
     */
    public Long getNumberOfTasksSucceeded() {
        return numberOfTasksSucceeded;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfTasksSucceeded <p/>
     */
    public void setNumberOfTasksSucceeded(Long numberOfTasksSucceeded) {
        this.numberOfTasksSucceeded = numberOfTasksSucceeded;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfTasksSucceeded <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobProgressSummary withNumberOfTasksSucceeded(Long numberOfTasksSucceeded) {
        this.numberOfTasksSucceeded = numberOfTasksSucceeded;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p/>
     */
    public Long getNumberOfTasksFailed() {
        return numberOfTasksFailed;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfTasksFailed <p/>
     */
    public void setNumberOfTasksFailed(Long numberOfTasksFailed) {
        this.numberOfTasksFailed = numberOfTasksFailed;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfTasksFailed <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobProgressSummary withNumberOfTasksFailed(Long numberOfTasksFailed) {
        this.numberOfTasksFailed = numberOfTasksFailed;
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
        if (getTotalNumberOfTasks() != null) sb.append("TotalNumberOfTasks: " + getTotalNumberOfTasks() + ",");
        if (getNumberOfTasksSucceeded() != null) sb.append("NumberOfTasksSucceeded: " + getNumberOfTasksSucceeded() + ",");
        if (getNumberOfTasksFailed() != null) sb.append("NumberOfTasksFailed: " + getNumberOfTasksFailed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalNumberOfTasks() == null) ? 0 : getTotalNumberOfTasks().hashCode());
        hashCode = prime * hashCode + ((getNumberOfTasksSucceeded() == null) ? 0 : getNumberOfTasksSucceeded().hashCode());
        hashCode = prime * hashCode + ((getNumberOfTasksFailed() == null) ? 0 : getNumberOfTasksFailed().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof JobProgressSummary == false) return false;
        JobProgressSummary other = (JobProgressSummary)obj;

        if (other.getTotalNumberOfTasks() == null ^ this.getTotalNumberOfTasks() == null) return false;
        if (other.getTotalNumberOfTasks() != null && other.getTotalNumberOfTasks().equals(this.getTotalNumberOfTasks()) == false) return false;
        if (other.getNumberOfTasksSucceeded() == null ^ this.getNumberOfTasksSucceeded() == null) return false;
        if (other.getNumberOfTasksSucceeded() != null && other.getNumberOfTasksSucceeded().equals(this.getNumberOfTasksSucceeded()) == false) return false;
        if (other.getNumberOfTasksFailed() == null ^ this.getNumberOfTasksFailed() == null) return false;
        if (other.getNumberOfTasksFailed() != null && other.getNumberOfTasksFailed().equals(this.getNumberOfTasksFailed()) == false) return false;
        return true;
    }
}
