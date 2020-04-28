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
 * Contains information on a single schedule action.
 */
public class ScheduleAction implements Serializable {
    /**
     * The name of the action, must be unique within the schedule. This name
     * provides the main reference to an action once it is added to the
     * schedule. A name is unique if it is no longer in the schedule. The
     * schedule is automatically cleaned up to remove actions with a start time
     * of more than 1 hour ago (approximately) so at that point a name can be
     * reused.
     */
    private String actionName;

    /**
     * Settings for this schedule action.
     */
    private ScheduleActionSettings scheduleActionSettings;

    /**
     * The time for the action to start in the channel.
     */
    private ScheduleActionStartSettings scheduleActionStartSettings;

    /**
     * The name of the action, must be unique within the schedule. This name
     * provides the main reference to an action once it is added to the
     * schedule. A name is unique if it is no longer in the schedule. The
     * schedule is automatically cleaned up to remove actions with a start time
     * of more than 1 hour ago (approximately) so at that point a name can be
     * reused.
     *
     * @return The name of the action, must be unique within the schedule. This
     *         name provides the main reference to an action once it is added to
     *         the schedule. A name is unique if it is no longer in the
     *         schedule. The schedule is automatically cleaned up to remove
     *         actions with a start time of more than 1 hour ago (approximately)
     *         so at that point a name can be reused.
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * The name of the action, must be unique within the schedule. This name
     * provides the main reference to an action once it is added to the
     * schedule. A name is unique if it is no longer in the schedule. The
     * schedule is automatically cleaned up to remove actions with a start time
     * of more than 1 hour ago (approximately) so at that point a name can be
     * reused.
     *
     * @param actionName The name of the action, must be unique within the
     *            schedule. This name provides the main reference to an action
     *            once it is added to the schedule. A name is unique if it is no
     *            longer in the schedule. The schedule is automatically cleaned
     *            up to remove actions with a start time of more than 1 hour ago
     *            (approximately) so at that point a name can be reused.
     */
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * The name of the action, must be unique within the schedule. This name
     * provides the main reference to an action once it is added to the
     * schedule. A name is unique if it is no longer in the schedule. The
     * schedule is automatically cleaned up to remove actions with a start time
     * of more than 1 hour ago (approximately) so at that point a name can be
     * reused.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionName The name of the action, must be unique within the
     *            schedule. This name provides the main reference to an action
     *            once it is added to the schedule. A name is unique if it is no
     *            longer in the schedule. The schedule is automatically cleaned
     *            up to remove actions with a start time of more than 1 hour ago
     *            (approximately) so at that point a name can be reused.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduleAction withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * Settings for this schedule action.
     *
     * @return Settings for this schedule action.
     */
    public ScheduleActionSettings getScheduleActionSettings() {
        return scheduleActionSettings;
    }

    /**
     * Settings for this schedule action.
     *
     * @param scheduleActionSettings Settings for this schedule action.
     */
    public void setScheduleActionSettings(ScheduleActionSettings scheduleActionSettings) {
        this.scheduleActionSettings = scheduleActionSettings;
    }

    /**
     * Settings for this schedule action.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleActionSettings Settings for this schedule action.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduleAction withScheduleActionSettings(ScheduleActionSettings scheduleActionSettings) {
        this.scheduleActionSettings = scheduleActionSettings;
        return this;
    }

    /**
     * The time for the action to start in the channel.
     *
     * @return The time for the action to start in the channel.
     */
    public ScheduleActionStartSettings getScheduleActionStartSettings() {
        return scheduleActionStartSettings;
    }

    /**
     * The time for the action to start in the channel.
     *
     * @param scheduleActionStartSettings The time for the action to start in
     *            the channel.
     */
    public void setScheduleActionStartSettings(
            ScheduleActionStartSettings scheduleActionStartSettings) {
        this.scheduleActionStartSettings = scheduleActionStartSettings;
    }

    /**
     * The time for the action to start in the channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleActionStartSettings The time for the action to start in
     *            the channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduleAction withScheduleActionStartSettings(
            ScheduleActionStartSettings scheduleActionStartSettings) {
        this.scheduleActionStartSettings = scheduleActionStartSettings;
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
        if (getActionName() != null)
            sb.append("ActionName: " + getActionName() + ",");
        if (getScheduleActionSettings() != null)
            sb.append("ScheduleActionSettings: " + getScheduleActionSettings() + ",");
        if (getScheduleActionStartSettings() != null)
            sb.append("ScheduleActionStartSettings: " + getScheduleActionStartSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime
                * hashCode
                + ((getScheduleActionSettings() == null) ? 0 : getScheduleActionSettings()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getScheduleActionStartSettings() == null) ? 0
                        : getScheduleActionStartSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleAction == false)
            return false;
        ScheduleAction other = (ScheduleAction) obj;

        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null
                && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getScheduleActionSettings() == null ^ this.getScheduleActionSettings() == null)
            return false;
        if (other.getScheduleActionSettings() != null
                && other.getScheduleActionSettings().equals(this.getScheduleActionSettings()) == false)
            return false;
        if (other.getScheduleActionStartSettings() == null
                ^ this.getScheduleActionStartSettings() == null)
            return false;
        if (other.getScheduleActionStartSettings() != null
                && other.getScheduleActionStartSettings().equals(
                        this.getScheduleActionStartSettings()) == false)
            return false;
        return true;
    }
}
