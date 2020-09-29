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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Updates an existing maintenance window. Only specified parameters are modified.</p> <note> <p>The value you specify for <code>Duration</code> determines the specific end time for the maintenance window based on the time it begins. No maintenance window tasks are permitted to start after the resulting endtime minus the number of hours you specify for <code>Cutoff</code>. For example, if the maintenance window starts at 3 PM, the duration is three hours, and the value you specify for <code>Cutoff</code> is one hour, no maintenance window tasks can start after 5 PM.</p> </note>
 */
public class UpdateMaintenanceWindowRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The ID of the maintenance window to update.</p>
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
     * <p>An optional description for the update request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String description;

    /**
     * <p>The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.</p>
     */
    private String startDate;

    /**
     * <p>The date and time, in ISO-8601 Extended format, for when you want the maintenance window to become inactive. EndDate allows you to set a date and time in the future when the maintenance window will no longer run.</p>
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
     * <p>The number of days to wait after the date and time specified by a CRON expression before running the maintenance window.</p> <p>For example, the following cron expression schedules a maintenance window to run the third Tuesday of every month at 11:30 PM.</p> <p> <code>cron(0 30 23 ? * TUE#3 *)</code> </p> <p>If the schedule offset is <code>2</code>, the maintenance window won't run until two days later.</p>
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
     * <p>If True, then all fields that are required by the CreateMaintenanceWindow action are also required for this API request. Optional fields that are not specified are set to null. </p>
     */
    private Boolean replace;

    /**
     * <p>The ID of the maintenance window to update.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @return <p>The ID of the maintenance window to update.</p>
     */
    public String getWindowId() {
        return windowId;
    }

    /**
     * <p>The ID of the maintenance window to update.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>The ID of the maintenance window to update.</p>
     */
    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>The ID of the maintenance window to update.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>The ID of the maintenance window to update.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowRequest withWindowId(String windowId) {
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
    public UpdateMaintenanceWindowRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>An optional description for the update request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>An optional description for the update request.</p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>An optional description for the update request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>An optional description for the update request.</p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>An optional description for the update request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>An optional description for the update request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.</p>
     *
     * @return <p>The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.</p>
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * <p>The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.</p>
     *
     * @param startDate <p>The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.</p>
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startDate <p>The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the <a href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowRequest withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * <p>The date and time, in ISO-8601 Extended format, for when you want the maintenance window to become inactive. EndDate allows you to set a date and time in the future when the maintenance window will no longer run.</p>
     *
     * @return <p>The date and time, in ISO-8601 Extended format, for when you want the maintenance window to become inactive. EndDate allows you to set a date and time in the future when the maintenance window will no longer run.</p>
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * <p>The date and time, in ISO-8601 Extended format, for when you want the maintenance window to become inactive. EndDate allows you to set a date and time in the future when the maintenance window will no longer run.</p>
     *
     * @param endDate <p>The date and time, in ISO-8601 Extended format, for when you want the maintenance window to become inactive. EndDate allows you to set a date and time in the future when the maintenance window will no longer run.</p>
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>The date and time, in ISO-8601 Extended format, for when you want the maintenance window to become inactive. EndDate allows you to set a date and time in the future when the maintenance window will no longer run.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endDate <p>The date and time, in ISO-8601 Extended format, for when you want the maintenance window to become inactive. EndDate allows you to set a date and time in the future when the maintenance window will no longer run.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowRequest withEndDate(String endDate) {
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
    public UpdateMaintenanceWindowRequest withSchedule(String schedule) {
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
    public UpdateMaintenanceWindowRequest withScheduleTimezone(String scheduleTimezone) {
        this.scheduleTimezone = scheduleTimezone;
        return this;
    }

    /**
     * <p>The number of days to wait after the date and time specified by a CRON expression before running the maintenance window.</p> <p>For example, the following cron expression schedules a maintenance window to run the third Tuesday of every month at 11:30 PM.</p> <p> <code>cron(0 30 23 ? * TUE#3 *)</code> </p> <p>If the schedule offset is <code>2</code>, the maintenance window won't run until two days later.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 6<br/>
     *
     * @return <p>The number of days to wait after the date and time specified by a CRON expression before running the maintenance window.</p> <p>For example, the following cron expression schedules a maintenance window to run the third Tuesday of every month at 11:30 PM.</p> <p> <code>cron(0 30 23 ? * TUE#3 *)</code> </p> <p>If the schedule offset is <code>2</code>, the maintenance window won't run until two days later.</p>
     */
    public Integer getScheduleOffset() {
        return scheduleOffset;
    }

    /**
     * <p>The number of days to wait after the date and time specified by a CRON expression before running the maintenance window.</p> <p>For example, the following cron expression schedules a maintenance window to run the third Tuesday of every month at 11:30 PM.</p> <p> <code>cron(0 30 23 ? * TUE#3 *)</code> </p> <p>If the schedule offset is <code>2</code>, the maintenance window won't run until two days later.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 6<br/>
     *
     * @param scheduleOffset <p>The number of days to wait after the date and time specified by a CRON expression before running the maintenance window.</p> <p>For example, the following cron expression schedules a maintenance window to run the third Tuesday of every month at 11:30 PM.</p> <p> <code>cron(0 30 23 ? * TUE#3 *)</code> </p> <p>If the schedule offset is <code>2</code>, the maintenance window won't run until two days later.</p>
     */
    public void setScheduleOffset(Integer scheduleOffset) {
        this.scheduleOffset = scheduleOffset;
    }

    /**
     * <p>The number of days to wait after the date and time specified by a CRON expression before running the maintenance window.</p> <p>For example, the following cron expression schedules a maintenance window to run the third Tuesday of every month at 11:30 PM.</p> <p> <code>cron(0 30 23 ? * TUE#3 *)</code> </p> <p>If the schedule offset is <code>2</code>, the maintenance window won't run until two days later.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 6<br/>
     *
     * @param scheduleOffset <p>The number of days to wait after the date and time specified by a CRON expression before running the maintenance window.</p> <p>For example, the following cron expression schedules a maintenance window to run the third Tuesday of every month at 11:30 PM.</p> <p> <code>cron(0 30 23 ? * TUE#3 *)</code> </p> <p>If the schedule offset is <code>2</code>, the maintenance window won't run until two days later.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowRequest withScheduleOffset(Integer scheduleOffset) {
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
    public UpdateMaintenanceWindowRequest withDuration(Integer duration) {
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
    public UpdateMaintenanceWindowRequest withCutoff(Integer cutoff) {
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
    public UpdateMaintenanceWindowRequest withAllowUnassociatedTargets(Boolean allowUnassociatedTargets) {
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
    public UpdateMaintenanceWindowRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>If True, then all fields that are required by the CreateMaintenanceWindow action are also required for this API request. Optional fields that are not specified are set to null. </p>
     *
     * @return <p>If True, then all fields that are required by the CreateMaintenanceWindow action are also required for this API request. Optional fields that are not specified are set to null. </p>
     */
    public Boolean isReplace() {
        return replace;
    }

    /**
     * <p>If True, then all fields that are required by the CreateMaintenanceWindow action are also required for this API request. Optional fields that are not specified are set to null. </p>
     *
     * @return <p>If True, then all fields that are required by the CreateMaintenanceWindow action are also required for this API request. Optional fields that are not specified are set to null. </p>
     */
    public Boolean getReplace() {
        return replace;
    }

    /**
     * <p>If True, then all fields that are required by the CreateMaintenanceWindow action are also required for this API request. Optional fields that are not specified are set to null. </p>
     *
     * @param replace <p>If True, then all fields that are required by the CreateMaintenanceWindow action are also required for this API request. Optional fields that are not specified are set to null. </p>
     */
    public void setReplace(Boolean replace) {
        this.replace = replace;
    }

    /**
     * <p>If True, then all fields that are required by the CreateMaintenanceWindow action are also required for this API request. Optional fields that are not specified are set to null. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param replace <p>If True, then all fields that are required by the CreateMaintenanceWindow action are also required for this API request. Optional fields that are not specified are set to null. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowRequest withReplace(Boolean replace) {
        this.replace = replace;
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
        if (getEnabled() != null) sb.append("Enabled: " + getEnabled() + ",");
        if (getReplace() != null) sb.append("Replace: " + getReplace());
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
        hashCode = prime * hashCode + ((getReplace() == null) ? 0 : getReplace().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateMaintenanceWindowRequest == false) return false;
        UpdateMaintenanceWindowRequest other = (UpdateMaintenanceWindowRequest)obj;

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
        if (other.getReplace() == null ^ this.getReplace() == null) return false;
        if (other.getReplace() != null && other.getReplace().equals(this.getReplace()) == false) return false;
        return true;
    }
}
