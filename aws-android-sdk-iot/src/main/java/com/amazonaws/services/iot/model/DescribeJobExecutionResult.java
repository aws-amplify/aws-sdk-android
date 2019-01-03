/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class DescribeJobExecutionResult implements Serializable {
    /**
     * <p>
     * Information about the job execution.
     * </p>
     */
    private JobExecution execution;

    /**
     * <p>
     * Information about the job execution.
     * </p>
     *
     * @return <p>
     *         Information about the job execution.
     *         </p>
     */
    public JobExecution getExecution() {
        return execution;
    }

    /**
     * <p>
     * Information about the job execution.
     * </p>
     *
     * @param execution <p>
     *            Information about the job execution.
     *            </p>
     */
    public void setExecution(JobExecution execution) {
        this.execution = execution;
    }

    /**
     * <p>
     * Information about the job execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param execution <p>
     *            Information about the job execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobExecutionResult withExecution(JobExecution execution) {
        this.execution = execution;
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
        if (getExecution() != null)
            sb.append("execution: " + getExecution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecution() == null) ? 0 : getExecution().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeJobExecutionResult == false)
            return false;
        DescribeJobExecutionResult other = (DescribeJobExecutionResult) obj;

        if (other.getExecution() == null ^ this.getExecution() == null)
            return false;
        if (other.getExecution() != null
                && other.getExecution().equals(this.getExecution()) == false)
            return false;
        return true;
    }
}
