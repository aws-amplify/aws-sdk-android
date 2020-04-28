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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Placeholder documentation for DescribeScheduleResponse
 */
public class DescribeScheduleResult implements Serializable {
    /**
     * The next token; for use in pagination.
     */
    private String nextToken;

    /**
     * The list of actions in the schedule.
     */
    private java.util.List<ScheduleAction> scheduleActions;

    /**
     * The next token; for use in pagination.
     *
     * @return The next token; for use in pagination.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * The next token; for use in pagination.
     *
     * @param nextToken The next token; for use in pagination.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The next token; for use in pagination.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken The next token; for use in pagination.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduleResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The list of actions in the schedule.
     *
     * @return The list of actions in the schedule.
     */
    public java.util.List<ScheduleAction> getScheduleActions() {
        return scheduleActions;
    }

    /**
     * The list of actions in the schedule.
     *
     * @param scheduleActions The list of actions in the schedule.
     */
    public void setScheduleActions(java.util.Collection<ScheduleAction> scheduleActions) {
        if (scheduleActions == null) {
            this.scheduleActions = null;
            return;
        }

        this.scheduleActions = new java.util.ArrayList<ScheduleAction>(scheduleActions);
    }

    /**
     * The list of actions in the schedule.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleActions The list of actions in the schedule.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduleResult withScheduleActions(ScheduleAction... scheduleActions) {
        if (getScheduleActions() == null) {
            this.scheduleActions = new java.util.ArrayList<ScheduleAction>(scheduleActions.length);
        }
        for (ScheduleAction value : scheduleActions) {
            this.scheduleActions.add(value);
        }
        return this;
    }

    /**
     * The list of actions in the schedule.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleActions The list of actions in the schedule.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduleResult withScheduleActions(
            java.util.Collection<ScheduleAction> scheduleActions) {
        setScheduleActions(scheduleActions);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getScheduleActions() != null)
            sb.append("ScheduleActions: " + getScheduleActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getScheduleActions() == null) ? 0 : getScheduleActions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScheduleResult == false)
            return false;
        DescribeScheduleResult other = (DescribeScheduleResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getScheduleActions() == null ^ this.getScheduleActions() == null)
            return false;
        if (other.getScheduleActions() != null
                && other.getScheduleActions().equals(this.getScheduleActions()) == false)
            return false;
        return true;
    }
}
