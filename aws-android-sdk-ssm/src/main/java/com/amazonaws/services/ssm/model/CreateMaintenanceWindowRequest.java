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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new maintenance window.
 * </p>
 * <note>
 * <p>
 * The value you specify for <code>Duration</code> determines the specific end
 * time for the maintenance window based on the time it begins. No maintenance
 * window tasks are permitted to start after the resulting endtime minus the
 * number of hours you specify for <code>Cutoff</code>. For example, if the
 * maintenance window starts at 3 PM, the duration is three hours, and the value
 * you specify for <code>Cutoff</code> is one hour, no maintenance window tasks
 * can start after 5 PM.
 * </p>
 * </note>
 */
public class CreateMaintenanceWindowRequest extends AmazonWebServiceRequest implements Serializable {
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
     * An optional description for the maintenance window. We recommend
     * specifying a description to help you organize your maintenance windows.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String description;

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when you want the
     * maintenance window to become active. StartDate allows you to delay
     * activation of the maintenance window until the specified future date.
     * </p>
     */
    private String startDate;

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when you want the
     * maintenance window to become inactive. EndDate allows you to set a date
     * and time in the future when the maintenance window will no longer run.
     * </p>
     */
    private String endDate;

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
     * on, in Internet Assigned Numbers Authority (IANA) format. For example:
     * "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information,
     * see the <a href="https://www.iana.org/time-zones">Time Zone Database</a>
     * on the IANA website.
     * </p>
     */
    private String scheduleTimezone;

    /**
     * <p>
     * The number of days to wait after the date and time specified by a CRON
     * expression before running the maintenance window.
     * </p>
     * <p>
     * For example, the following cron expression schedules a maintenance window
     * to run on the third Tuesday of every month at 11:30 PM.
     * </p>
     * <p>
     * <code>cron(0 30 23 ? * TUE#3 *)</code>
     * </p>
     * <p>
     * If the schedule offset is <code>2</code>, the maintenance window won't
     * run until two days later.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 6<br/>
     */
    private Integer scheduleOffset;

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
     * Enables a maintenance window task to run on managed instances, even if
     * you have not registered those instances as targets. If enabled, then you
     * must specify the unregistered instances (by instance ID) when you
     * register a task with the maintenance window.
     * </p>
     * <p>
     * If you don't enable this option, then you must specify
     * previously-registered targets when you register a task with the
     * maintenance window.
     * </p>
     */
    private Boolean allowUnassociatedTargets;

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String clientToken;

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a maintenance window to
     * identify the type of tasks it will run, the types of targets, and the
     * environment it will run in. In this case, you could specify the following
     * key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=TaskType,Value=AgentUpdate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing maintenance window, use the
     * <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags;

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
    public CreateMaintenanceWindowRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * An optional description for the maintenance window. We recommend
     * specifying a description to help you organize your maintenance windows.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         An optional description for the maintenance window. We recommend
     *         specifying a description to help you organize your maintenance
     *         windows.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * An optional description for the maintenance window. We recommend
     * specifying a description to help you organize your maintenance windows.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            An optional description for the maintenance window. We
     *            recommend specifying a description to help you organize your
     *            maintenance windows.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the maintenance window. We recommend
     * specifying a description to help you organize your maintenance windows.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            An optional description for the maintenance window. We
     *            recommend specifying a description to help you organize your
     *            maintenance windows.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMaintenanceWindowRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when you want the
     * maintenance window to become active. StartDate allows you to delay
     * activation of the maintenance window until the specified future date.
     * </p>
     *
     * @return <p>
     *         The date and time, in ISO-8601 Extended format, for when you want
     *         the maintenance window to become active. StartDate allows you to
     *         delay activation of the maintenance window until the specified
     *         future date.
     *         </p>
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when you want the
     * maintenance window to become active. StartDate allows you to delay
     * activation of the maintenance window until the specified future date.
     * </p>
     *
     * @param startDate <p>
     *            The date and time, in ISO-8601 Extended format, for when you
     *            want the maintenance window to become active. StartDate allows
     *            you to delay activation of the maintenance window until the
     *            specified future date.
     *            </p>
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when you want the
     * maintenance window to become active. StartDate allows you to delay
     * activation of the maintenance window until the specified future date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startDate <p>
     *            The date and time, in ISO-8601 Extended format, for when you
     *            want the maintenance window to become active. StartDate allows
     *            you to delay activation of the maintenance window until the
     *            specified future date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMaintenanceWindowRequest withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when you want the
     * maintenance window to become inactive. EndDate allows you to set a date
     * and time in the future when the maintenance window will no longer run.
     * </p>
     *
     * @return <p>
     *         The date and time, in ISO-8601 Extended format, for when you want
     *         the maintenance window to become inactive. EndDate allows you to
     *         set a date and time in the future when the maintenance window
     *         will no longer run.
     *         </p>
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when you want the
     * maintenance window to become inactive. EndDate allows you to set a date
     * and time in the future when the maintenance window will no longer run.
     * </p>
     *
     * @param endDate <p>
     *            The date and time, in ISO-8601 Extended format, for when you
     *            want the maintenance window to become inactive. EndDate allows
     *            you to set a date and time in the future when the maintenance
     *            window will no longer run.
     *            </p>
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when you want the
     * maintenance window to become inactive. EndDate allows you to set a date
     * and time in the future when the maintenance window will no longer run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endDate <p>
     *            The date and time, in ISO-8601 Extended format, for when you
     *            want the maintenance window to become inactive. EndDate allows
     *            you to set a date and time in the future when the maintenance
     *            window will no longer run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMaintenanceWindowRequest withEndDate(String endDate) {
        this.endDate = endDate;
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
    public CreateMaintenanceWindowRequest withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * <p>
     * The time zone that the scheduled maintenance window executions are based
     * on, in Internet Assigned Numbers Authority (IANA) format. For example:
     * "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information,
     * see the <a href="https://www.iana.org/time-zones">Time Zone Database</a>
     * on the IANA website.
     * </p>
     *
     * @return <p>
     *         The time zone that the scheduled maintenance window executions
     *         are based on, in Internet Assigned Numbers Authority (IANA)
     *         format. For example: "America/Los_Angeles", "etc/UTC", or
     *         "Asia/Seoul". For more information, see the <a
     *         href="https://www.iana.org/time-zones">Time Zone Database</a> on
     *         the IANA website.
     *         </p>
     */
    public String getScheduleTimezone() {
        return scheduleTimezone;
    }

    /**
     * <p>
     * The time zone that the scheduled maintenance window executions are based
     * on, in Internet Assigned Numbers Authority (IANA) format. For example:
     * "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information,
     * see the <a href="https://www.iana.org/time-zones">Time Zone Database</a>
     * on the IANA website.
     * </p>
     *
     * @param scheduleTimezone <p>
     *            The time zone that the scheduled maintenance window executions
     *            are based on, in Internet Assigned Numbers Authority (IANA)
     *            format. For example: "America/Los_Angeles", "etc/UTC", or
     *            "Asia/Seoul". For more information, see the <a
     *            href="https://www.iana.org/time-zones">Time Zone Database</a>
     *            on the IANA website.
     *            </p>
     */
    public void setScheduleTimezone(String scheduleTimezone) {
        this.scheduleTimezone = scheduleTimezone;
    }

    /**
     * <p>
     * The time zone that the scheduled maintenance window executions are based
     * on, in Internet Assigned Numbers Authority (IANA) format. For example:
     * "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information,
     * see the <a href="https://www.iana.org/time-zones">Time Zone Database</a>
     * on the IANA website.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleTimezone <p>
     *            The time zone that the scheduled maintenance window executions
     *            are based on, in Internet Assigned Numbers Authority (IANA)
     *            format. For example: "America/Los_Angeles", "etc/UTC", or
     *            "Asia/Seoul". For more information, see the <a
     *            href="https://www.iana.org/time-zones">Time Zone Database</a>
     *            on the IANA website.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMaintenanceWindowRequest withScheduleTimezone(String scheduleTimezone) {
        this.scheduleTimezone = scheduleTimezone;
        return this;
    }

    /**
     * <p>
     * The number of days to wait after the date and time specified by a CRON
     * expression before running the maintenance window.
     * </p>
     * <p>
     * For example, the following cron expression schedules a maintenance window
     * to run on the third Tuesday of every month at 11:30 PM.
     * </p>
     * <p>
     * <code>cron(0 30 23 ? * TUE#3 *)</code>
     * </p>
     * <p>
     * If the schedule offset is <code>2</code>, the maintenance window won't
     * run until two days later.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 6<br/>
     *
     * @return <p>
     *         The number of days to wait after the date and time specified by a
     *         CRON expression before running the maintenance window.
     *         </p>
     *         <p>
     *         For example, the following cron expression schedules a
     *         maintenance window to run on the third Tuesday of every month at
     *         11:30 PM.
     *         </p>
     *         <p>
     *         <code>cron(0 30 23 ? * TUE#3 *)</code>
     *         </p>
     *         <p>
     *         If the schedule offset is <code>2</code>, the maintenance window
     *         won't run until two days later.
     *         </p>
     */
    public Integer getScheduleOffset() {
        return scheduleOffset;
    }

    /**
     * <p>
     * The number of days to wait after the date and time specified by a CRON
     * expression before running the maintenance window.
     * </p>
     * <p>
     * For example, the following cron expression schedules a maintenance window
     * to run on the third Tuesday of every month at 11:30 PM.
     * </p>
     * <p>
     * <code>cron(0 30 23 ? * TUE#3 *)</code>
     * </p>
     * <p>
     * If the schedule offset is <code>2</code>, the maintenance window won't
     * run until two days later.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 6<br/>
     *
     * @param scheduleOffset <p>
     *            The number of days to wait after the date and time specified
     *            by a CRON expression before running the maintenance window.
     *            </p>
     *            <p>
     *            For example, the following cron expression schedules a
     *            maintenance window to run on the third Tuesday of every month
     *            at 11:30 PM.
     *            </p>
     *            <p>
     *            <code>cron(0 30 23 ? * TUE#3 *)</code>
     *            </p>
     *            <p>
     *            If the schedule offset is <code>2</code>, the maintenance
     *            window won't run until two days later.
     *            </p>
     */
    public void setScheduleOffset(Integer scheduleOffset) {
        this.scheduleOffset = scheduleOffset;
    }

    /**
     * <p>
     * The number of days to wait after the date and time specified by a CRON
     * expression before running the maintenance window.
     * </p>
     * <p>
     * For example, the following cron expression schedules a maintenance window
     * to run on the third Tuesday of every month at 11:30 PM.
     * </p>
     * <p>
     * <code>cron(0 30 23 ? * TUE#3 *)</code>
     * </p>
     * <p>
     * If the schedule offset is <code>2</code>, the maintenance window won't
     * run until two days later.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 6<br/>
     *
     * @param scheduleOffset <p>
     *            The number of days to wait after the date and time specified
     *            by a CRON expression before running the maintenance window.
     *            </p>
     *            <p>
     *            For example, the following cron expression schedules a
     *            maintenance window to run on the third Tuesday of every month
     *            at 11:30 PM.
     *            </p>
     *            <p>
     *            <code>cron(0 30 23 ? * TUE#3 *)</code>
     *            </p>
     *            <p>
     *            If the schedule offset is <code>2</code>, the maintenance
     *            window won't run until two days later.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMaintenanceWindowRequest withScheduleOffset(Integer scheduleOffset) {
        this.scheduleOffset = scheduleOffset;
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
    public CreateMaintenanceWindowRequest withDuration(Integer duration) {
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
    public CreateMaintenanceWindowRequest withCutoff(Integer cutoff) {
        this.cutoff = cutoff;
        return this;
    }

    /**
     * <p>
     * Enables a maintenance window task to run on managed instances, even if
     * you have not registered those instances as targets. If enabled, then you
     * must specify the unregistered instances (by instance ID) when you
     * register a task with the maintenance window.
     * </p>
     * <p>
     * If you don't enable this option, then you must specify
     * previously-registered targets when you register a task with the
     * maintenance window.
     * </p>
     *
     * @return <p>
     *         Enables a maintenance window task to run on managed instances,
     *         even if you have not registered those instances as targets. If
     *         enabled, then you must specify the unregistered instances (by
     *         instance ID) when you register a task with the maintenance
     *         window.
     *         </p>
     *         <p>
     *         If you don't enable this option, then you must specify
     *         previously-registered targets when you register a task with the
     *         maintenance window.
     *         </p>
     */
    public Boolean isAllowUnassociatedTargets() {
        return allowUnassociatedTargets;
    }

    /**
     * <p>
     * Enables a maintenance window task to run on managed instances, even if
     * you have not registered those instances as targets. If enabled, then you
     * must specify the unregistered instances (by instance ID) when you
     * register a task with the maintenance window.
     * </p>
     * <p>
     * If you don't enable this option, then you must specify
     * previously-registered targets when you register a task with the
     * maintenance window.
     * </p>
     *
     * @return <p>
     *         Enables a maintenance window task to run on managed instances,
     *         even if you have not registered those instances as targets. If
     *         enabled, then you must specify the unregistered instances (by
     *         instance ID) when you register a task with the maintenance
     *         window.
     *         </p>
     *         <p>
     *         If you don't enable this option, then you must specify
     *         previously-registered targets when you register a task with the
     *         maintenance window.
     *         </p>
     */
    public Boolean getAllowUnassociatedTargets() {
        return allowUnassociatedTargets;
    }

    /**
     * <p>
     * Enables a maintenance window task to run on managed instances, even if
     * you have not registered those instances as targets. If enabled, then you
     * must specify the unregistered instances (by instance ID) when you
     * register a task with the maintenance window.
     * </p>
     * <p>
     * If you don't enable this option, then you must specify
     * previously-registered targets when you register a task with the
     * maintenance window.
     * </p>
     *
     * @param allowUnassociatedTargets <p>
     *            Enables a maintenance window task to run on managed instances,
     *            even if you have not registered those instances as targets. If
     *            enabled, then you must specify the unregistered instances (by
     *            instance ID) when you register a task with the maintenance
     *            window.
     *            </p>
     *            <p>
     *            If you don't enable this option, then you must specify
     *            previously-registered targets when you register a task with
     *            the maintenance window.
     *            </p>
     */
    public void setAllowUnassociatedTargets(Boolean allowUnassociatedTargets) {
        this.allowUnassociatedTargets = allowUnassociatedTargets;
    }

    /**
     * <p>
     * Enables a maintenance window task to run on managed instances, even if
     * you have not registered those instances as targets. If enabled, then you
     * must specify the unregistered instances (by instance ID) when you
     * register a task with the maintenance window.
     * </p>
     * <p>
     * If you don't enable this option, then you must specify
     * previously-registered targets when you register a task with the
     * maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowUnassociatedTargets <p>
     *            Enables a maintenance window task to run on managed instances,
     *            even if you have not registered those instances as targets. If
     *            enabled, then you must specify the unregistered instances (by
     *            instance ID) when you register a task with the maintenance
     *            window.
     *            </p>
     *            <p>
     *            If you don't enable this option, then you must specify
     *            previously-registered targets when you register a task with
     *            the maintenance window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMaintenanceWindowRequest withAllowUnassociatedTargets(
            Boolean allowUnassociatedTargets) {
        this.allowUnassociatedTargets = allowUnassociatedTargets;
        return this;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         User-provided idempotency token.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param clientToken <p>
     *            User-provided idempotency token.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param clientToken <p>
     *            User-provided idempotency token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMaintenanceWindowRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a maintenance window to
     * identify the type of tasks it will run, the types of targets, and the
     * environment it will run in. In this case, you could specify the following
     * key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=TaskType,Value=AgentUpdate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing maintenance window, use the
     * <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     *
     * @return <p>
     *         Optional metadata that you assign to a resource. Tags enable you
     *         to categorize a resource in different ways, such as by purpose,
     *         owner, or environment. For example, you might want to tag a
     *         maintenance window to identify the type of tasks it will run, the
     *         types of targets, and the environment it will run in. In this
     *         case, you could specify the following key name/value pairs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Key=TaskType,Value=AgentUpdate</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Key=OS,Value=Windows</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Key=Environment,Value=Production</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         To add tags to an existing maintenance window, use the
     *         <a>AddTagsToResource</a> action.
     *         </p>
     *         </note>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a maintenance window to
     * identify the type of tasks it will run, the types of targets, and the
     * environment it will run in. In this case, you could specify the following
     * key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=TaskType,Value=AgentUpdate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing maintenance window, use the
     * <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     *
     * @param tags <p>
     *            Optional metadata that you assign to a resource. Tags enable
     *            you to categorize a resource in different ways, such as by
     *            purpose, owner, or environment. For example, you might want to
     *            tag a maintenance window to identify the type of tasks it will
     *            run, the types of targets, and the environment it will run in.
     *            In this case, you could specify the following key name/value
     *            pairs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Key=TaskType,Value=AgentUpdate</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=OS,Value=Windows</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=Environment,Value=Production</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            To add tags to an existing maintenance window, use the
     *            <a>AddTagsToResource</a> action.
     *            </p>
     *            </note>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a maintenance window to
     * identify the type of tasks it will run, the types of targets, and the
     * environment it will run in. In this case, you could specify the following
     * key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=TaskType,Value=AgentUpdate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing maintenance window, use the
     * <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Optional metadata that you assign to a resource. Tags enable
     *            you to categorize a resource in different ways, such as by
     *            purpose, owner, or environment. For example, you might want to
     *            tag a maintenance window to identify the type of tasks it will
     *            run, the types of targets, and the environment it will run in.
     *            In this case, you could specify the following key name/value
     *            pairs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Key=TaskType,Value=AgentUpdate</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=OS,Value=Windows</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=Environment,Value=Production</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            To add tags to an existing maintenance window, use the
     *            <a>AddTagsToResource</a> action.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMaintenanceWindowRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a maintenance window to
     * identify the type of tasks it will run, the types of targets, and the
     * environment it will run in. In this case, you could specify the following
     * key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=TaskType,Value=AgentUpdate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing maintenance window, use the
     * <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Optional metadata that you assign to a resource. Tags enable
     *            you to categorize a resource in different ways, such as by
     *            purpose, owner, or environment. For example, you might want to
     *            tag a maintenance window to identify the type of tasks it will
     *            run, the types of targets, and the environment it will run in.
     *            In this case, you could specify the following key name/value
     *            pairs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Key=TaskType,Value=AgentUpdate</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=OS,Value=Windows</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=Environment,Value=Production</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            To add tags to an existing maintenance window, use the
     *            <a>AddTagsToResource</a> action.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMaintenanceWindowRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getStartDate() != null)
            sb.append("StartDate: " + getStartDate() + ",");
        if (getEndDate() != null)
            sb.append("EndDate: " + getEndDate() + ",");
        if (getSchedule() != null)
            sb.append("Schedule: " + getSchedule() + ",");
        if (getScheduleTimezone() != null)
            sb.append("ScheduleTimezone: " + getScheduleTimezone() + ",");
        if (getScheduleOffset() != null)
            sb.append("ScheduleOffset: " + getScheduleOffset() + ",");
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getCutoff() != null)
            sb.append("Cutoff: " + getCutoff() + ",");
        if (getAllowUnassociatedTargets() != null)
            sb.append("AllowUnassociatedTargets: " + getAllowUnassociatedTargets() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode
                + ((getScheduleTimezone() == null) ? 0 : getScheduleTimezone().hashCode());
        hashCode = prime * hashCode
                + ((getScheduleOffset() == null) ? 0 : getScheduleOffset().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getCutoff() == null) ? 0 : getCutoff().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowUnassociatedTargets() == null) ? 0 : getAllowUnassociatedTargets()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMaintenanceWindowRequest == false)
            return false;
        CreateMaintenanceWindowRequest other = (CreateMaintenanceWindowRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null
                && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
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
        if (other.getScheduleOffset() == null ^ this.getScheduleOffset() == null)
            return false;
        if (other.getScheduleOffset() != null
                && other.getScheduleOffset().equals(this.getScheduleOffset()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getCutoff() == null ^ this.getCutoff() == null)
            return false;
        if (other.getCutoff() != null && other.getCutoff().equals(this.getCutoff()) == false)
            return false;
        if (other.getAllowUnassociatedTargets() == null
                ^ this.getAllowUnassociatedTargets() == null)
            return false;
        if (other.getAllowUnassociatedTargets() != null
                && other.getAllowUnassociatedTargets().equals(this.getAllowUnassociatedTargets()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
