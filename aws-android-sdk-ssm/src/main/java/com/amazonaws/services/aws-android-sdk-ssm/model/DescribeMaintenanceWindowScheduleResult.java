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


public class DescribeMaintenanceWindowScheduleResult implements Serializable {
    /**
     * <p>Information about maintenance window executions scheduled for the specified time range.</p>
     */
    private java.util.List<ScheduledWindowExecution> scheduledWindowExecutions;

    /**
     * <p>The token for the next set of items to return. (You use this token in the next call.)</p>
     */
    private String nextToken;

    /**
     * <p>Information about maintenance window executions scheduled for the specified time range.</p>
     *
     * @return <p>Information about maintenance window executions scheduled for the specified time range.</p>
     */
    public java.util.List<ScheduledWindowExecution> getScheduledWindowExecutions() {
        return scheduledWindowExecutions;
    }

    /**
     * <p>Information about maintenance window executions scheduled for the specified time range.</p>
     *
     * @param scheduledWindowExecutions <p>Information about maintenance window executions scheduled for the specified time range.</p>
     */
    public void setScheduledWindowExecutions(java.util.Collection<ScheduledWindowExecution> scheduledWindowExecutions) {
        if (scheduledWindowExecutions == null) {
            this.scheduledWindowExecutions = null;
            return;
        }

        this.scheduledWindowExecutions = new java.util.ArrayList<ScheduledWindowExecution>(scheduledWindowExecutions);
    }

    /**
     * <p>Information about maintenance window executions scheduled for the specified time range.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduledWindowExecutions <p>Information about maintenance window executions scheduled for the specified time range.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeMaintenanceWindowScheduleResult withScheduledWindowExecutions(ScheduledWindowExecution... scheduledWindowExecutions) {
        if (getScheduledWindowExecutions() == null) {
            this.scheduledWindowExecutions = new java.util.ArrayList<ScheduledWindowExecution>(scheduledWindowExecutions.length);
        }
        for (ScheduledWindowExecution value : scheduledWindowExecutions) {
            this.scheduledWindowExecutions.add(value);
        }
        return this;
    }

    /**
     * <p>Information about maintenance window executions scheduled for the specified time range.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduledWindowExecutions <p>Information about maintenance window executions scheduled for the specified time range.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeMaintenanceWindowScheduleResult withScheduledWindowExecutions(java.util.Collection<ScheduledWindowExecution> scheduledWindowExecutions) {
        setScheduledWindowExecutions(scheduledWindowExecutions);
        return this;
    }

    /**
     * <p>The token for the next set of items to return. (You use this token in the next call.)</p>
     *
     * @return <p>The token for the next set of items to return. (You use this token in the next call.)</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token for the next set of items to return. (You use this token in the next call.)</p>
     *
     * @param nextToken <p>The token for the next set of items to return. (You use this token in the next call.)</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token for the next set of items to return. (You use this token in the next call.)</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token for the next set of items to return. (You use this token in the next call.)</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeMaintenanceWindowScheduleResult withNextToken(String nextToken) {
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
        if (getScheduledWindowExecutions() != null) sb.append("ScheduledWindowExecutions: " + getScheduledWindowExecutions() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduledWindowExecutions() == null) ? 0 : getScheduledWindowExecutions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeMaintenanceWindowScheduleResult == false) return false;
        DescribeMaintenanceWindowScheduleResult other = (DescribeMaintenanceWindowScheduleResult)obj;

        if (other.getScheduledWindowExecutions() == null ^ this.getScheduledWindowExecutions() == null) return false;
        if (other.getScheduledWindowExecutions() != null && other.getScheduledWindowExecutions().equals(this.getScheduledWindowExecutions()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
