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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the maintenance window.
 * </p>
 */
public class MaintenanceWindowIdentity implements Serializable {
    /**
     * <p>
     * The ID of the maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     */
    private String windowId;

    /**
     * <p>
     * The name of the maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>
     * A description of the maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String description;

    /**
     * <p>
     * Indicates whether the maintenance window is enabled.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The duration of the maintenance window in hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     */
    private Integer duration;

    /**
     * <p>
     * The number of hours before the end of the maintenance window that Systems
     * Manager stops scheduling new tasks for execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     */
    private Integer cutoff;

    /**
     * <p>
     * The schedule of the maintenance window in the form of a cron or rate
     * expression.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String schedule;

    /**
     * <p>
     * The time zone that the scheduled maintenance window executions are based
     * on, in Internet Assigned Numbers Authority (IANA) format.
     * </p>
     */
    private String scheduleTimezone;

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become inactive.
     * </p>
     */
    private String endDate;

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become active.
     * </p>
     */
    private String startDate;

    /**
     * <p>
     * The next time the maintenance window will actually run, taking into
     * account any specified times for the maintenance window to become active
     * or inactive.
     * </p>
     */
    private String nextExecutionTime;

    /**
     * <p>
     * The ID of the maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @return <p>
     *         The ID of the maintenance window.
     *         </p>
     */
    public String getWindowId() {
        return windowId;
    }

    /**
     * <p>
     * The ID of the maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>
     *            The ID of the maintenance window.
     *            </p>
     */
    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The ID of the maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>
     *            The ID of the maintenance window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowIdentity withWindowId(String windowId) {
        this.windowId = windowId;
        return this;
    }

    /**
     * <p>
     * The name of the maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>
     *         The name of the maintenance window.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the maintenance window.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the maintenance window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowIdentity withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description of the maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         A description of the maintenance window.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            A description of the maintenance window.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            A description of the maintenance window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowIdentity withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Indicates whether the maintenance window is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether the maintenance window is enabled.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates whether the maintenance window is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether the maintenance window is enabled.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates whether the maintenance window is enabled.
     * </p>
     *
     * @param enabled <p>
     *            Indicates whether the maintenance window is enabled.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether the maintenance window is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Indicates whether the maintenance window is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowIdentity withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * The duration of the maintenance window in hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @return <p>
     *         The duration of the maintenance window in hours.
     *         </p>
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * <p>
     * The duration of the maintenance window in hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @param duration <p>
     *            The duration of the maintenance window in hours.
     *            </p>
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the maintenance window in hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @param duration <p>
     *            The duration of the maintenance window in hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowIdentity withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * <p>
     * The number of hours before the end of the maintenance window that Systems
     * Manager stops scheduling new tasks for execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @return <p>
     *         The number of hours before the end of the maintenance window that
     *         Systems Manager stops scheduling new tasks for execution.
     *         </p>
     */
    public Integer getCutoff() {
        return cutoff;
    }

    /**
     * <p>
     * The number of hours before the end of the maintenance window that Systems
     * Manager stops scheduling new tasks for execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param cutoff <p>
     *            The number of hours before the end of the maintenance window
     *            that Systems Manager stops scheduling new tasks for execution.
     *            </p>
     */
    public void setCutoff(Integer cutoff) {
        this.cutoff = cutoff;
    }

    /**
     * <p>
     * The number of hours before the end of the maintenance window that Systems
     * Manager stops scheduling new tasks for execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param cutoff <p>
     *            The number of hours before the end of the maintenance window
     *            that Systems Manager stops scheduling new tasks for execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowIdentity withCutoff(Integer cutoff) {
        this.cutoff = cutoff;
        return this;
    }

    /**
     * <p>
     * The schedule of the maintenance window in the form of a cron or rate
     * expression.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The schedule of the maintenance window in the form of a cron or
     *         rate expression.
     *         </p>
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * <p>
     * The schedule of the maintenance window in the form of a cron or rate
     * expression.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param schedule <p>
     *            The schedule of the maintenance window in the form of a cron
     *            or rate expression.
     *            </p>
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule of the maintenance window in the form of a cron or rate
     * expression.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param schedule <p>
     *            The schedule of the maintenance window in the form of a cron
     *            or rate expression.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowIdentity withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * <p>
     * The time zone that the scheduled maintenance window executions are based
     * on, in Internet Assigned Numbers Authority (IANA) format.
     * </p>
     *
     * @return <p>
     *         The time zone that the scheduled maintenance window executions
     *         are based on, in Internet Assigned Numbers Authority (IANA)
     *         format.
     *         </p>
     */
    public String getScheduleTimezone() {
        return scheduleTimezone;
    }

    /**
     * <p>
     * The time zone that the scheduled maintenance window executions are based
     * on, in Internet Assigned Numbers Authority (IANA) format.
     * </p>
     *
     * @param scheduleTimezone <p>
     *            The time zone that the scheduled maintenance window executions
     *            are based on, in Internet Assigned Numbers Authority (IANA)
     *            format.
     *            </p>
     */
    public void setScheduleTimezone(String scheduleTimezone) {
        this.scheduleTimezone = scheduleTimezone;
    }

    /**
     * <p>
     * The time zone that the scheduled maintenance window executions are based
     * on, in Internet Assigned Numbers Authority (IANA) format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleTimezone <p>
     *            The time zone that the scheduled maintenance window executions
     *            are based on, in Internet Assigned Numbers Authority (IANA)
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowIdentity withScheduleTimezone(String scheduleTimezone) {
        this.scheduleTimezone = scheduleTimezone;
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become inactive.
     * </p>
     *
     * @return <p>
     *         The date and time, in ISO-8601 Extended format, for when the
     *         maintenance window is scheduled to become inactive.
     *         </p>
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become inactive.
     * </p>
     *
     * @param endDate <p>
     *            The date and time, in ISO-8601 Extended format, for when the
     *            maintenance window is scheduled to become inactive.
     *            </p>
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become inactive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endDate <p>
     *            The date and time, in ISO-8601 Extended format, for when the
     *            maintenance window is scheduled to become inactive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowIdentity withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become active.
     * </p>
     *
     * @return <p>
     *         The date and time, in ISO-8601 Extended format, for when the
     *         maintenance window is scheduled to become active.
     *         </p>
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become active.
     * </p>
     *
     * @param startDate <p>
     *            The date and time, in ISO-8601 Extended format, for when the
     *            maintenance window is scheduled to become active.
     *            </p>
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become active.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startDate <p>
     *            The date and time, in ISO-8601 Extended format, for when the
     *            maintenance window is scheduled to become active.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowIdentity withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * <p>
     * The next time the maintenance window will actually run, taking into
     * account any specified times for the maintenance window to become active
     * or inactive.
     * </p>
     *
     * @return <p>
     *         The next time the maintenance window will actually run, taking
     *         into account any specified times for the maintenance window to
     *         become active or inactive.
     *         </p>
     */
    public String getNextExecutionTime() {
        return nextExecutionTime;
    }

    /**
     * <p>
     * The next time the maintenance window will actually run, taking into
     * account any specified times for the maintenance window to become active
     * or inactive.
     * </p>
     *
     * @param nextExecutionTime <p>
     *            The next time the maintenance window will actually run, taking
     *            into account any specified times for the maintenance window to
     *            become active or inactive.
     *            </p>
     */
    public void setNextExecutionTime(String nextExecutionTime) {
        this.nextExecutionTime = nextExecutionTime;
    }

    /**
     * <p>
     * The next time the maintenance window will actually run, taking into
     * account any specified times for the maintenance window to become active
     * or inactive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextExecutionTime <p>
     *            The next time the maintenance window will actually run, taking
     *            into account any specified times for the maintenance window to
     *            become active or inactive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowIdentity withNextExecutionTime(String nextExecutionTime) {
        this.nextExecutionTime = nextExecutionTime;
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
        if (getWindowId() != null)
            sb.append("WindowId: " + getWindowId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getCutoff() != null)
            sb.append("Cutoff: " + getCutoff() + ",");
        if (getSchedule() != null)
            sb.append("Schedule: " + getSchedule() + ",");
        if (getScheduleTimezone() != null)
            sb.append("ScheduleTimezone: " + getScheduleTimezone() + ",");
        if (getEndDate() != null)
            sb.append("EndDate: " + getEndDate() + ",");
        if (getStartDate() != null)
            sb.append("StartDate: " + getStartDate() + ",");
        if (getNextExecutionTime() != null)
            sb.append("NextExecutionTime: " + getNextExecutionTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getCutoff() == null) ? 0 : getCutoff().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode
                + ((getScheduleTimezone() == null) ? 0 : getScheduleTimezone().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode
                + ((getNextExecutionTime() == null) ? 0 : getNextExecutionTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceWindowIdentity == false)
            return false;
        MaintenanceWindowIdentity other = (MaintenanceWindowIdentity) obj;

        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getCutoff() == null ^ this.getCutoff() == null)
            return false;
        if (other.getCutoff() != null && other.getCutoff().equals(this.getCutoff()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getScheduleTimezone() == null ^ this.getScheduleTimezone() == null)
            return false;
        if (other.getScheduleTimezone() != null
                && other.getScheduleTimezone().equals(this.getScheduleTimezone()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null
                && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getNextExecutionTime() == null ^ this.getNextExecutionTime() == null)
            return false;
        if (other.getNextExecutionTime() != null
                && other.getNextExecutionTime().equals(this.getNextExecutionTime()) == false)
            return false;
        return true;
    }
}
