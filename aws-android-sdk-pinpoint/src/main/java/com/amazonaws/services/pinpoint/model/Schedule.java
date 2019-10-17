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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the schedule settings for a campaign.
 * </p>
 */
public class Schedule implements Serializable {
    /**
     * <p>
     * The scheduled time, in ISO 8601 format, for the campaign to end.
     * </p>
     */
    private String endTime;

    /**
     * <p>
     * The type of event that causes the campaign to be sent, if the value of
     * the Frequency property is EVENT.
     * </p>
     */
    private CampaignEventFilter eventFilter;

    /**
     * <p>
     * Specifies how often the campaign is sent or whether the campaign is sent
     * in response to a specific event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONCE, HOURLY, DAILY, WEEKLY, MONTHLY, EVENT
     */
    private String frequency;

    /**
     * <p>
     * Specifies whether the start and end times for the campaign schedule use
     * each recipient's local time. To base the schedule on each recipient's
     * local time, set this value to true.
     * </p>
     */
    private Boolean isLocalTime;

    /**
     * <p>
     * The default quiet time for the campaign. Quiet time is a specific time
     * range when a campaign doesn't send messages to endpoints, if all the
     * following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EndpointDemographic.Timezone property of the endpoint is set to a
     * valid value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is later than or equal to
     * the time specified by the QuietTime.Start property for the campaign.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is earlier than or equal to
     * the time specified by the QuietTime.End property for the campaign.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the endpoint will receive
     * messages from the campaign, even if quiet time is enabled.
     * </p>
     */
    private QuietTime quietTime;

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, for the campaign to begin.
     * </p>
     */
    private String startTime;

    /**
     * <p>
     * The starting UTC offset for the campaign schedule, if the value of the
     * IsLocalTime property is true. Valid values are: UTC, UTC+01, UTC+02,
     * UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30, UTC+05:45,
     * UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+09, UTC+09:30, UTC+10, UTC+10:30,
     * UTC+11, UTC+12, UTC+13, UTC-02, UTC-03, UTC-04, UTC-05, UTC-06, UTC-07,
     * UTC-08, UTC-09, UTC-10, and UTC-11.
     * </p>
     */
    private String timezone;

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, for the campaign to end.
     * </p>
     *
     * @return <p>
     *         The scheduled time, in ISO 8601 format, for the campaign to end.
     *         </p>
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, for the campaign to end.
     * </p>
     *
     * @param endTime <p>
     *            The scheduled time, in ISO 8601 format, for the campaign to
     *            end.
     *            </p>
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, for the campaign to end.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The scheduled time, in ISO 8601 format, for the campaign to
     *            end.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Schedule withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The type of event that causes the campaign to be sent, if the value of
     * the Frequency property is EVENT.
     * </p>
     *
     * @return <p>
     *         The type of event that causes the campaign to be sent, if the
     *         value of the Frequency property is EVENT.
     *         </p>
     */
    public CampaignEventFilter getEventFilter() {
        return eventFilter;
    }

    /**
     * <p>
     * The type of event that causes the campaign to be sent, if the value of
     * the Frequency property is EVENT.
     * </p>
     *
     * @param eventFilter <p>
     *            The type of event that causes the campaign to be sent, if the
     *            value of the Frequency property is EVENT.
     *            </p>
     */
    public void setEventFilter(CampaignEventFilter eventFilter) {
        this.eventFilter = eventFilter;
    }

    /**
     * <p>
     * The type of event that causes the campaign to be sent, if the value of
     * the Frequency property is EVENT.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventFilter <p>
     *            The type of event that causes the campaign to be sent, if the
     *            value of the Frequency property is EVENT.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Schedule withEventFilter(CampaignEventFilter eventFilter) {
        this.eventFilter = eventFilter;
        return this;
    }

    /**
     * <p>
     * Specifies how often the campaign is sent or whether the campaign is sent
     * in response to a specific event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONCE, HOURLY, DAILY, WEEKLY, MONTHLY, EVENT
     *
     * @return <p>
     *         Specifies how often the campaign is sent or whether the campaign
     *         is sent in response to a specific event.
     *         </p>
     * @see Frequency
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * <p>
     * Specifies how often the campaign is sent or whether the campaign is sent
     * in response to a specific event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONCE, HOURLY, DAILY, WEEKLY, MONTHLY, EVENT
     *
     * @param frequency <p>
     *            Specifies how often the campaign is sent or whether the
     *            campaign is sent in response to a specific event.
     *            </p>
     * @see Frequency
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * <p>
     * Specifies how often the campaign is sent or whether the campaign is sent
     * in response to a specific event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONCE, HOURLY, DAILY, WEEKLY, MONTHLY, EVENT
     *
     * @param frequency <p>
     *            Specifies how often the campaign is sent or whether the
     *            campaign is sent in response to a specific event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Frequency
     */
    public Schedule withFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * <p>
     * Specifies how often the campaign is sent or whether the campaign is sent
     * in response to a specific event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONCE, HOURLY, DAILY, WEEKLY, MONTHLY, EVENT
     *
     * @param frequency <p>
     *            Specifies how often the campaign is sent or whether the
     *            campaign is sent in response to a specific event.
     *            </p>
     * @see Frequency
     */
    public void setFrequency(Frequency frequency) {
        this.frequency = frequency.toString();
    }

    /**
     * <p>
     * Specifies how often the campaign is sent or whether the campaign is sent
     * in response to a specific event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONCE, HOURLY, DAILY, WEEKLY, MONTHLY, EVENT
     *
     * @param frequency <p>
     *            Specifies how often the campaign is sent or whether the
     *            campaign is sent in response to a specific event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Frequency
     */
    public Schedule withFrequency(Frequency frequency) {
        this.frequency = frequency.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the start and end times for the campaign schedule use
     * each recipient's local time. To base the schedule on each recipient's
     * local time, set this value to true.
     * </p>
     *
     * @return <p>
     *         Specifies whether the start and end times for the campaign
     *         schedule use each recipient's local time. To base the schedule on
     *         each recipient's local time, set this value to true.
     *         </p>
     */
    public Boolean isIsLocalTime() {
        return isLocalTime;
    }

    /**
     * <p>
     * Specifies whether the start and end times for the campaign schedule use
     * each recipient's local time. To base the schedule on each recipient's
     * local time, set this value to true.
     * </p>
     *
     * @return <p>
     *         Specifies whether the start and end times for the campaign
     *         schedule use each recipient's local time. To base the schedule on
     *         each recipient's local time, set this value to true.
     *         </p>
     */
    public Boolean getIsLocalTime() {
        return isLocalTime;
    }

    /**
     * <p>
     * Specifies whether the start and end times for the campaign schedule use
     * each recipient's local time. To base the schedule on each recipient's
     * local time, set this value to true.
     * </p>
     *
     * @param isLocalTime <p>
     *            Specifies whether the start and end times for the campaign
     *            schedule use each recipient's local time. To base the schedule
     *            on each recipient's local time, set this value to true.
     *            </p>
     */
    public void setIsLocalTime(Boolean isLocalTime) {
        this.isLocalTime = isLocalTime;
    }

    /**
     * <p>
     * Specifies whether the start and end times for the campaign schedule use
     * each recipient's local time. To base the schedule on each recipient's
     * local time, set this value to true.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isLocalTime <p>
     *            Specifies whether the start and end times for the campaign
     *            schedule use each recipient's local time. To base the schedule
     *            on each recipient's local time, set this value to true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Schedule withIsLocalTime(Boolean isLocalTime) {
        this.isLocalTime = isLocalTime;
        return this;
    }

    /**
     * <p>
     * The default quiet time for the campaign. Quiet time is a specific time
     * range when a campaign doesn't send messages to endpoints, if all the
     * following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EndpointDemographic.Timezone property of the endpoint is set to a
     * valid value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is later than or equal to
     * the time specified by the QuietTime.Start property for the campaign.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is earlier than or equal to
     * the time specified by the QuietTime.End property for the campaign.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the endpoint will receive
     * messages from the campaign, even if quiet time is enabled.
     * </p>
     *
     * @return <p>
     *         The default quiet time for the campaign. Quiet time is a specific
     *         time range when a campaign doesn't send messages to endpoints, if
     *         all the following conditions are met:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The EndpointDemographic.Timezone property of the endpoint is set
     *         to a valid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The current time in the endpoint's time zone is later than or
     *         equal to the time specified by the QuietTime.Start property for
     *         the campaign.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The current time in the endpoint's time zone is earlier than or
     *         equal to the time specified by the QuietTime.End property for the
     *         campaign.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If any of the preceding conditions isn't met, the endpoint will
     *         receive messages from the campaign, even if quiet time is
     *         enabled.
     *         </p>
     */
    public QuietTime getQuietTime() {
        return quietTime;
    }

    /**
     * <p>
     * The default quiet time for the campaign. Quiet time is a specific time
     * range when a campaign doesn't send messages to endpoints, if all the
     * following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EndpointDemographic.Timezone property of the endpoint is set to a
     * valid value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is later than or equal to
     * the time specified by the QuietTime.Start property for the campaign.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is earlier than or equal to
     * the time specified by the QuietTime.End property for the campaign.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the endpoint will receive
     * messages from the campaign, even if quiet time is enabled.
     * </p>
     *
     * @param quietTime <p>
     *            The default quiet time for the campaign. Quiet time is a
     *            specific time range when a campaign doesn't send messages to
     *            endpoints, if all the following conditions are met:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The EndpointDemographic.Timezone property of the endpoint is
     *            set to a valid value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The current time in the endpoint's time zone is later than or
     *            equal to the time specified by the QuietTime.Start property
     *            for the campaign.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The current time in the endpoint's time zone is earlier than
     *            or equal to the time specified by the QuietTime.End property
     *            for the campaign.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If any of the preceding conditions isn't met, the endpoint
     *            will receive messages from the campaign, even if quiet time is
     *            enabled.
     *            </p>
     */
    public void setQuietTime(QuietTime quietTime) {
        this.quietTime = quietTime;
    }

    /**
     * <p>
     * The default quiet time for the campaign. Quiet time is a specific time
     * range when a campaign doesn't send messages to endpoints, if all the
     * following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EndpointDemographic.Timezone property of the endpoint is set to a
     * valid value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is later than or equal to
     * the time specified by the QuietTime.Start property for the campaign.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is earlier than or equal to
     * the time specified by the QuietTime.End property for the campaign.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the endpoint will receive
     * messages from the campaign, even if quiet time is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quietTime <p>
     *            The default quiet time for the campaign. Quiet time is a
     *            specific time range when a campaign doesn't send messages to
     *            endpoints, if all the following conditions are met:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The EndpointDemographic.Timezone property of the endpoint is
     *            set to a valid value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The current time in the endpoint's time zone is later than or
     *            equal to the time specified by the QuietTime.Start property
     *            for the campaign.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The current time in the endpoint's time zone is earlier than
     *            or equal to the time specified by the QuietTime.End property
     *            for the campaign.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If any of the preceding conditions isn't met, the endpoint
     *            will receive messages from the campaign, even if quiet time is
     *            enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Schedule withQuietTime(QuietTime quietTime) {
        this.quietTime = quietTime;
        return this;
    }

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, for the campaign to begin.
     * </p>
     *
     * @return <p>
     *         The scheduled time, in ISO 8601 format, for the campaign to
     *         begin.
     *         </p>
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, for the campaign to begin.
     * </p>
     *
     * @param startTime <p>
     *            The scheduled time, in ISO 8601 format, for the campaign to
     *            begin.
     *            </p>
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, for the campaign to begin.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The scheduled time, in ISO 8601 format, for the campaign to
     *            begin.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Schedule withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The starting UTC offset for the campaign schedule, if the value of the
     * IsLocalTime property is true. Valid values are: UTC, UTC+01, UTC+02,
     * UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30, UTC+05:45,
     * UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+09, UTC+09:30, UTC+10, UTC+10:30,
     * UTC+11, UTC+12, UTC+13, UTC-02, UTC-03, UTC-04, UTC-05, UTC-06, UTC-07,
     * UTC-08, UTC-09, UTC-10, and UTC-11.
     * </p>
     *
     * @return <p>
     *         The starting UTC offset for the campaign schedule, if the value
     *         of the IsLocalTime property is true. Valid values are: UTC,
     *         UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05,
     *         UTC+05:30, UTC+05:45, UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+09,
     *         UTC+09:30, UTC+10, UTC+10:30, UTC+11, UTC+12, UTC+13, UTC-02,
     *         UTC-03, UTC-04, UTC-05, UTC-06, UTC-07, UTC-08, UTC-09, UTC-10,
     *         and UTC-11.
     *         </p>
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * <p>
     * The starting UTC offset for the campaign schedule, if the value of the
     * IsLocalTime property is true. Valid values are: UTC, UTC+01, UTC+02,
     * UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30, UTC+05:45,
     * UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+09, UTC+09:30, UTC+10, UTC+10:30,
     * UTC+11, UTC+12, UTC+13, UTC-02, UTC-03, UTC-04, UTC-05, UTC-06, UTC-07,
     * UTC-08, UTC-09, UTC-10, and UTC-11.
     * </p>
     *
     * @param timezone <p>
     *            The starting UTC offset for the campaign schedule, if the
     *            value of the IsLocalTime property is true. Valid values are:
     *            UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30,
     *            UTC+05, UTC+05:30, UTC+05:45, UTC+06, UTC+06:30, UTC+07,
     *            UTC+08, UTC+09, UTC+09:30, UTC+10, UTC+10:30, UTC+11, UTC+12,
     *            UTC+13, UTC-02, UTC-03, UTC-04, UTC-05, UTC-06, UTC-07,
     *            UTC-08, UTC-09, UTC-10, and UTC-11.
     *            </p>
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The starting UTC offset for the campaign schedule, if the value of the
     * IsLocalTime property is true. Valid values are: UTC, UTC+01, UTC+02,
     * UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30, UTC+05:45,
     * UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+09, UTC+09:30, UTC+10, UTC+10:30,
     * UTC+11, UTC+12, UTC+13, UTC-02, UTC-03, UTC-04, UTC-05, UTC-06, UTC-07,
     * UTC-08, UTC-09, UTC-10, and UTC-11.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timezone <p>
     *            The starting UTC offset for the campaign schedule, if the
     *            value of the IsLocalTime property is true. Valid values are:
     *            UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30,
     *            UTC+05, UTC+05:30, UTC+05:45, UTC+06, UTC+06:30, UTC+07,
     *            UTC+08, UTC+09, UTC+09:30, UTC+10, UTC+10:30, UTC+11, UTC+12,
     *            UTC+13, UTC-02, UTC-03, UTC-04, UTC-05, UTC-06, UTC-07,
     *            UTC-08, UTC-09, UTC-10, and UTC-11.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Schedule withTimezone(String timezone) {
        this.timezone = timezone;
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
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getEventFilter() != null)
            sb.append("EventFilter: " + getEventFilter() + ",");
        if (getFrequency() != null)
            sb.append("Frequency: " + getFrequency() + ",");
        if (getIsLocalTime() != null)
            sb.append("IsLocalTime: " + getIsLocalTime() + ",");
        if (getQuietTime() != null)
            sb.append("QuietTime: " + getQuietTime() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getTimezone() != null)
            sb.append("Timezone: " + getTimezone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getEventFilter() == null) ? 0 : getEventFilter().hashCode());
        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        hashCode = prime * hashCode
                + ((getIsLocalTime() == null) ? 0 : getIsLocalTime().hashCode());
        hashCode = prime * hashCode + ((getQuietTime() == null) ? 0 : getQuietTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Schedule == false)
            return false;
        Schedule other = (Schedule) obj;

        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getEventFilter() == null ^ this.getEventFilter() == null)
            return false;
        if (other.getEventFilter() != null
                && other.getEventFilter().equals(this.getEventFilter()) == false)
            return false;
        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null
                && other.getFrequency().equals(this.getFrequency()) == false)
            return false;
        if (other.getIsLocalTime() == null ^ this.getIsLocalTime() == null)
            return false;
        if (other.getIsLocalTime() != null
                && other.getIsLocalTime().equals(this.getIsLocalTime()) == false)
            return false;
        if (other.getQuietTime() == null ^ this.getQuietTime() == null)
            return false;
        if (other.getQuietTime() != null
                && other.getQuietTime().equals(this.getQuietTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        return true;
    }
}
