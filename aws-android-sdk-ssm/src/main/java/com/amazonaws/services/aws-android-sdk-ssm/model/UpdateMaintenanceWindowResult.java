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


public class UpdateMaintenanceWindowResult implements Serializable {
    /**
     * <p>The ID of the created maintenance window.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     */
    private String windowId;

    /**
     * <p>The name of the maintenance window.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>An optional description of the update.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String description;

    /**
     * <p>The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become active. The maintenance window will not run before this specified time.</p>
     */
    private String startDate;

    /**
     * <p>The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become inactive. The maintenance window will not run after this specified time.</p>
     */
    private String endDate;

    /**
     * <p>The schedule of the maintenance window in the form of a cron or rate expression.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String schedule;

    /**
     * <p>The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.</p>
     */
    private String scheduleTimezone;

    /**
     * <p>The number of days to wait to run a maintenance window after the scheduled CRON expression date and time.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 6<br/>
     */
    private Integer scheduleOffset;

    /**
     * <p>The duration of the maintenance window in hours.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     */
    private Integer duration;

    /**
     * <p>The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     */
    private Integer cutoff;

    /**
     * <p>Whether targets must be registered with the maintenance window before tasks can be defined for those targets.</p>
     */
    private Boolean allowUnassociatedTargets;

    /**
     * <p>Whether the maintenance window is enabled.</p>
     */
    private Boolean enabled;

    /**
     * <p>The ID of the created maintenance window.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @return <p>The ID of the created maintenance window.</p>
     */
    public String getWindowId() {
        return windowId;
    }

    /**
     * <p>The ID of the created maintenance window.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>The ID of the created maintenance window.</p>
     */
    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>The ID of the created maintenance window.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>The ID of the created maintenance window.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowResult withWindowId(String windowId) {
        this.windowId = windowId;
        return this;
    }

    /**
     * <p>The name of the maintenance window.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>The name of the maintenance window.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name of the maintenance window.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>The name of the maintenance window.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name of the maintenance window.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>The name of the maintenance window.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>An optional description of the update.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>An optional description of the update.</p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>An optional description of the update.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>An optional description of the update.</p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>An optional description of the update.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>An optional description of the update.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become active. The maintenance window will not run before this specified time.</p>
     *
     * @return <p>The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become active. The maintenance window will not run before this specified time.</p>
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * <p>The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become active. The maintenance window will not run before this specified time.</p>
     *
     * @param startDate <p>The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become active. The maintenance window will not run before this specified time.</p>
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become active. The maintenance window will not run before this specified time.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startDate <p>The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become active. The maintenance window will not run before this specified time.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowResult withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * <p>The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become inactive. The maintenance window will not run after this specified time.</p>
     *
     * @return <p>The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become inactive. The maintenance window will not run after this specified time.</p>
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * <p>The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become inactive. The maintenance window will not run after this specified time.</p>
     *
     * @param endDate <p>The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become inactive. The maintenance window will not run after this specified time.</p>
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become inactive. The maintenance window will not run after this specified time.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endDate <p>The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become inactive. The maintenance window will not run after this specified time.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowResult withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * <p>The schedule of the maintenance window in the form of a cron or rate expression.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>The schedule of the maintenance window in the form of a cron or rate expression.</p>
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * <p>The schedule of the maintenance window in the form of a cron or rate expression.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param schedule <p>The schedule of the maintenance window in the form of a cron or rate expression.</p>
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>The schedule of the maintenance window in the form of a cron or rate expression.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param schedule <p>The schedule of the maintenance window in the form of a cron or rate expression.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowResult withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * <p>The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.</p>
     *
     * @return <p>The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.</p>
     */
    public String getScheduleTimezone() {
        return scheduleTimezone;
    }

    /**
     * <p>The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.</p>
     *
     * @param scheduleTimezone <p>The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.</p>
     */
    public void setScheduleTimezone(String scheduleTimezone) {
        this.scheduleTimezone = scheduleTimezone;
    }

    /**
     * <p>The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduleTimezone <p>The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowResult withScheduleTimezone(String scheduleTimezone) {
        this.scheduleTimezone = scheduleTimezone;
        return this;
    }

    /**
     * <p>The number of days to wait to run a maintenance window after the scheduled CRON expression date and time.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 6<br/>
     *
     * @return <p>The number of days to wait to run a maintenance window after the scheduled CRON expression date and time.</p>
     */
    public Integer getScheduleOffset() {
        return scheduleOffset;
    }

    /**
     * <p>The number of days to wait to run a maintenance window after the scheduled CRON expression date and time.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 6<br/>
     *
     * @param scheduleOffset <p>The number of days to wait to run a maintenance window after the scheduled CRON expression date and time.</p>
     */
    public void setScheduleOffset(Integer scheduleOffset) {
        this.scheduleOffset = scheduleOffset;
    }

    /**
     * <p>The number of days to wait to run a maintenance window after the scheduled CRON expression date and time.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 6<br/>
     *
     * @param scheduleOffset <p>The number of days to wait to run a maintenance window after the scheduled CRON expression date and time.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowResult withScheduleOffset(Integer scheduleOffset) {
        this.scheduleOffset = scheduleOffset;
        return this;
    }

    /**
     * <p>The duration of the maintenance window in hours.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @return <p>The duration of the maintenance window in hours.</p>
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * <p>The duration of the maintenance window in hours.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @param duration <p>The duration of the maintenance window in hours.</p>
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>The duration of the maintenance window in hours.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @param duration <p>The duration of the maintenance window in hours.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowResult withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * <p>The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @return <p>The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for execution.</p>
     */
    public Integer getCutoff() {
        return cutoff;
    }

    /**
     * <p>The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param cutoff <p>The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for execution.</p>
     */
    public void setCutoff(Integer cutoff) {
        this.cutoff = cutoff;
    }

    /**
     * <p>The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param cutoff <p>The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowResult withCutoff(Integer cutoff) {
        this.cutoff = cutoff;
        return this;
    }

    /**
     * <p>Whether targets must be registered with the maintenance window before tasks can be defined for those targets.</p>
     *
     * @return <p>Whether targets must be registered with the maintenance window before tasks can be defined for those targets.</p>
     */
    public Boolean isAllowUnassociatedTargets() {
        return allowUnassociatedTargets;
    }

    /**
     * <p>Whether targets must be registered with the maintenance window before tasks can be defined for those targets.</p>
     *
     * @return <p>Whether targets must be registered with the maintenance window before tasks can be defined for those targets.</p>
     */
    public Boolean getAllowUnassociatedTargets() {
        return allowUnassociatedTargets;
    }

    /**
     * <p>Whether targets must be registered with the maintenance window before tasks can be defined for those targets.</p>
     *
     * @param allowUnassociatedTargets <p>Whether targets must be registered with the maintenance window before tasks can be defined for those targets.</p>
     */
    public void setAllowUnassociatedTargets(Boolean allowUnassociatedTargets) {
        this.allowUnassociatedTargets = allowUnassociatedTargets;
    }

    /**
     * <p>Whether targets must be registered with the maintenance window before tasks can be defined for those targets.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowUnassociatedTargets <p>Whether targets must be registered with the maintenance window before tasks can be defined for those targets.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowResult withAllowUnassociatedTargets(Boolean allowUnassociatedTargets) {
        this.allowUnassociatedTargets = allowUnassociatedTargets;
        return this;
    }

    /**
     * <p>Whether the maintenance window is enabled.</p>
     *
     * @return <p>Whether the maintenance window is enabled.</p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>Whether the maintenance window is enabled.</p>
     *
     * @return <p>Whether the maintenance window is enabled.</p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>Whether the maintenance window is enabled.</p>
     *
     * @param enabled <p>Whether the maintenance window is enabled.</p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>Whether the maintenance window is enabled.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled <p>Whether the maintenance window is enabled.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowResult withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        if (getWindowId() != null) sb.append("WindowId: " + getWindowId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getStartDate() != null) sb.append("StartDate: " + getStartDate() + ",");
        if (getEndDate() != null) sb.append("EndDate: " + getEndDate() + ",");
        if (getSchedule() != null) sb.append("Schedule: " + getSchedule() + ",");
        if (getScheduleTimezone() != null) sb.append("ScheduleTimezone: " + getScheduleTimezone() + ",");
        if (getScheduleOffset() != null) sb.append("ScheduleOffset: " + getScheduleOffset() + ",");
        if (getDuration() != null) sb.append("Duration: " + getDuration() + ",");
        if (getCutoff() != null) sb.append("Cutoff: " + getCutoff() + ",");
        if (getAllowUnassociatedTargets() != null) sb.append("AllowUnassociatedTargets: " + getAllowUnassociatedTargets() + ",");
        if (getEnabled() != null) sb.append("Enabled: " + getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getScheduleTimezone() == null) ? 0 : getScheduleTimezone().hashCode());
        hashCode = prime * hashCode + ((getScheduleOffset() == null) ? 0 : getScheduleOffset().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getCutoff() == null) ? 0 : getCutoff().hashCode());
        hashCode = prime * hashCode + ((getAllowUnassociatedTargets() == null) ? 0 : getAllowUnassociatedTargets().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateMaintenanceWindowResult == false) return false;
        UpdateMaintenanceWindowResult other = (UpdateMaintenanceWindowResult)obj;

        if (other.getWindowId() == null ^ this.getWindowId() == null) return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false) return false;
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null) return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false) return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null) return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false) return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null) return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false) return false;
        if (other.getScheduleTimezone() == null ^ this.getScheduleTimezone() == null) return false;
        if (other.getScheduleTimezone() != null && other.getScheduleTimezone().equals(this.getScheduleTimezone()) == false) return false;
        if (other.getScheduleOffset() == null ^ this.getScheduleOffset() == null) return false;
        if (other.getScheduleOffset() != null && other.getScheduleOffset().equals(this.getScheduleOffset()) == false) return false;
        if (other.getDuration() == null ^ this.getDuration() == null) return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false) return false;
        if (other.getCutoff() == null ^ this.getCutoff() == null) return false;
        if (other.getCutoff() != null && other.getCutoff().equals(this.getCutoff()) == false) return false;
        if (other.getAllowUnassociatedTargets() == null ^ this.getAllowUnassociatedTargets() == null) return false;
        if (other.getAllowUnassociatedTargets() != null && other.getAllowUnassociatedTargets().equals(this.getAllowUnassociatedTargets()) == false) return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null) return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false) return false;
        return true;
    }
}
