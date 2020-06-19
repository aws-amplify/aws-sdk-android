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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * List of actions that have been deleted from the schedule.
 */
public class BatchScheduleActionDeleteResult implements Serializable {
    /**
     * List of actions that have been deleted from the schedule.
     */
    private java.util.List<ScheduleAction> scheduleActions;

    /**
     * List of actions that have been deleted from the schedule.
     *
     * @return List of actions that have been deleted from the schedule.
     */
    public java.util.List<ScheduleAction> getScheduleActions() {
        return scheduleActions;
    }

    /**
     * List of actions that have been deleted from the schedule.
     *
     * @param scheduleActions List of actions that have been deleted from the
     *            schedule.
     */
    public void setScheduleActions(java.util.Collection<ScheduleAction> scheduleActions) {
        if (scheduleActions == null) {
            this.scheduleActions = null;
            return;
        }

        this.scheduleActions = new java.util.ArrayList<ScheduleAction>(scheduleActions);
    }

    /**
     * List of actions that have been deleted from the schedule.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleActions List of actions that have been deleted from the
     *            schedule.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchScheduleActionDeleteResult withScheduleActions(ScheduleAction... scheduleActions) {
        if (getScheduleActions() == null) {
            this.scheduleActions = new java.util.ArrayList<ScheduleAction>(scheduleActions.length);
        }
        for (ScheduleAction value : scheduleActions) {
            this.scheduleActions.add(value);
        }
        return this;
    }

    /**
     * List of actions that have been deleted from the schedule.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleActions List of actions that have been deleted from the
     *            schedule.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchScheduleActionDeleteResult withScheduleActions(
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
        if (getScheduleActions() != null)
            sb.append("ScheduleActions: " + getScheduleActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

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

        if (obj instanceof BatchScheduleActionDeleteResult == false)
            return false;
        BatchScheduleActionDeleteResult other = (BatchScheduleActionDeleteResult) obj;

        if (other.getScheduleActions() == null ^ this.getScheduleActions() == null)
            return false;
        if (other.getScheduleActions() != null
                && other.getScheduleActions().equals(this.getScheduleActions()) == false)
            return false;
        return true;
    }
}
