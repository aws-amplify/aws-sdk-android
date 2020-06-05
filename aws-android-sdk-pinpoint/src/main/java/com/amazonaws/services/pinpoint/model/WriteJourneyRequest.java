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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the configuration and other settings for a journey.
 * </p>
 */
public class WriteJourneyRequest implements Serializable {
    /**
     * <p>
     * A map that contains a set of Activity objects, one object for each
     * activity in the journey. For each Activity object, the key is the unique
     * identifier (string) for an activity and the value is the settings for the
     * activity. An activity identifier can contain a maximum of 100 characters.
     * The characters must be alphanumeric characters.
     * </p>
     */
    private java.util.Map<String, Activity> activities;

    /**
     * <p>
     * The date, in ISO 8601 format, when the journey was created.
     * </p>
     */
    private String creationDate;

    /**
     * <p>
     * The date, in ISO 8601 format, when the journey was last modified.
     * </p>
     */
    private String lastModifiedDate;

    /**
     * <p>
     * The messaging and entry limits for the journey.
     * </p>
     */
    private JourneyLimits limits;

    /**
     * <p>
     * Specifies whether the journey's scheduled start and end times use each
     * participant's local time. To base the schedule on each participant's
     * local time, set this value to true.
     * </p>
     */
    private Boolean localTime;

    /**
     * <p>
     * The name of the journey. A journey name can contain a maximum of 150
     * characters. The characters can be alphanumeric characters or symbols,
     * such as underscores (_) or hyphens (-). A journey name can't contain any
     * spaces.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The quiet time settings for the journey. Quiet time is a specific time
     * range when a journey doesn't send messages to participants, if all the
     * following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EndpointDemographic.Timezone property of the endpoint for the
     * participant is set to a valid value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the participant's time zone is later than or equal to
     * the time specified by the QuietTime.Start property for the journey.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the participant's time zone is earlier than or equal
     * to the time specified by the QuietTime.End property for the journey.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the participant will
     * receive messages from the journey, even if quiet time is enabled.
     * </p>
     */
    private QuietTime quietTime;

    /**
     * <p>
     * The frequency with which Amazon Pinpoint evaluates segment and event data
     * for the journey, as a duration in ISO 8601 format.
     * </p>
     */
    private String refreshFrequency;

    /**
     * <p>
     * The schedule settings for the journey.
     * </p>
     */
    private JourneySchedule schedule;

    /**
     * <p>
     * The unique identifier for the first activity in the journey. The
     * identifier for this activity can contain a maximum of 128 characters. The
     * characters must be alphanumeric characters.
     * </p>
     */
    private String startActivity;

    /**
     * <p>
     * The segment that defines which users are participants in the journey.
     * </p>
     */
    private StartCondition startCondition;

    /**
     * <p>
     * The status of the journey. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DRAFT - Saves the journey and doesn't publish it.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE - Saves and publishes the journey. Depending on the journey's
     * schedule, the journey starts running immediately or at the scheduled
     * start time. If a journey's status is ACTIVE, you can't add, change, or
     * remove activities from it.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The CANCELLED, COMPLETED, and CLOSED values are not supported in requests
     * to create or update a journey. To cancel a journey, use the <link
     * linkend="apps-application-id-journeys-journey-id-state">Journey
     * State</link> resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, COMPLETED, CANCELLED, CLOSED
     */
    private String state;

    /**
     * <p>
     * A map that contains a set of Activity objects, one object for each
     * activity in the journey. For each Activity object, the key is the unique
     * identifier (string) for an activity and the value is the settings for the
     * activity. An activity identifier can contain a maximum of 100 characters.
     * The characters must be alphanumeric characters.
     * </p>
     *
     * @return <p>
     *         A map that contains a set of Activity objects, one object for
     *         each activity in the journey. For each Activity object, the key
     *         is the unique identifier (string) for an activity and the value
     *         is the settings for the activity. An activity identifier can
     *         contain a maximum of 100 characters. The characters must be
     *         alphanumeric characters.
     *         </p>
     */
    public java.util.Map<String, Activity> getActivities() {
        return activities;
    }

    /**
     * <p>
     * A map that contains a set of Activity objects, one object for each
     * activity in the journey. For each Activity object, the key is the unique
     * identifier (string) for an activity and the value is the settings for the
     * activity. An activity identifier can contain a maximum of 100 characters.
     * The characters must be alphanumeric characters.
     * </p>
     *
     * @param activities <p>
     *            A map that contains a set of Activity objects, one object for
     *            each activity in the journey. For each Activity object, the
     *            key is the unique identifier (string) for an activity and the
     *            value is the settings for the activity. An activity identifier
     *            can contain a maximum of 100 characters. The characters must
     *            be alphanumeric characters.
     *            </p>
     */
    public void setActivities(java.util.Map<String, Activity> activities) {
        this.activities = activities;
    }

    /**
     * <p>
     * A map that contains a set of Activity objects, one object for each
     * activity in the journey. For each Activity object, the key is the unique
     * identifier (string) for an activity and the value is the settings for the
     * activity. An activity identifier can contain a maximum of 100 characters.
     * The characters must be alphanumeric characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activities <p>
     *            A map that contains a set of Activity objects, one object for
     *            each activity in the journey. For each Activity object, the
     *            key is the unique identifier (string) for an activity and the
     *            value is the settings for the activity. An activity identifier
     *            can contain a maximum of 100 characters. The characters must
     *            be alphanumeric characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteJourneyRequest withActivities(java.util.Map<String, Activity> activities) {
        this.activities = activities;
        return this;
    }

    /**
     * <p>
     * A map that contains a set of Activity objects, one object for each
     * activity in the journey. For each Activity object, the key is the unique
     * identifier (string) for an activity and the value is the settings for the
     * activity. An activity identifier can contain a maximum of 100 characters.
     * The characters must be alphanumeric characters.
     * </p>
     * <p>
     * The method adds a new key-value pair into Activities parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Activities.
     * @param value The corresponding value of the entry to be added into
     *            Activities.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteJourneyRequest addActivitiesEntry(String key, Activity value) {
        if (null == this.activities) {
            this.activities = new java.util.HashMap<String, Activity>();
        }
        if (this.activities.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.activities.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Activities.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public WriteJourneyRequest clearActivitiesEntries() {
        this.activities = null;
        return this;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the journey was created.
     * </p>
     *
     * @return <p>
     *         The date, in ISO 8601 format, when the journey was created.
     *         </p>
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the journey was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date, in ISO 8601 format, when the journey was created.
     *            </p>
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the journey was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date, in ISO 8601 format, when the journey was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteJourneyRequest withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the journey was last modified.
     * </p>
     *
     * @return <p>
     *         The date, in ISO 8601 format, when the journey was last modified.
     *         </p>
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the journey was last modified.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date, in ISO 8601 format, when the journey was last
     *            modified.
     *            </p>
     */
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the journey was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date, in ISO 8601 format, when the journey was last
     *            modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteJourneyRequest withLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * The messaging and entry limits for the journey.
     * </p>
     *
     * @return <p>
     *         The messaging and entry limits for the journey.
     *         </p>
     */
    public JourneyLimits getLimits() {
        return limits;
    }

    /**
     * <p>
     * The messaging and entry limits for the journey.
     * </p>
     *
     * @param limits <p>
     *            The messaging and entry limits for the journey.
     *            </p>
     */
    public void setLimits(JourneyLimits limits) {
        this.limits = limits;
    }

    /**
     * <p>
     * The messaging and entry limits for the journey.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limits <p>
     *            The messaging and entry limits for the journey.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteJourneyRequest withLimits(JourneyLimits limits) {
        this.limits = limits;
        return this;
    }

    /**
     * <p>
     * Specifies whether the journey's scheduled start and end times use each
     * participant's local time. To base the schedule on each participant's
     * local time, set this value to true.
     * </p>
     *
     * @return <p>
     *         Specifies whether the journey's scheduled start and end times use
     *         each participant's local time. To base the schedule on each
     *         participant's local time, set this value to true.
     *         </p>
     */
    public Boolean isLocalTime() {
        return localTime;
    }

    /**
     * <p>
     * Specifies whether the journey's scheduled start and end times use each
     * participant's local time. To base the schedule on each participant's
     * local time, set this value to true.
     * </p>
     *
     * @return <p>
     *         Specifies whether the journey's scheduled start and end times use
     *         each participant's local time. To base the schedule on each
     *         participant's local time, set this value to true.
     *         </p>
     */
    public Boolean getLocalTime() {
        return localTime;
    }

    /**
     * <p>
     * Specifies whether the journey's scheduled start and end times use each
     * participant's local time. To base the schedule on each participant's
     * local time, set this value to true.
     * </p>
     *
     * @param localTime <p>
     *            Specifies whether the journey's scheduled start and end times
     *            use each participant's local time. To base the schedule on
     *            each participant's local time, set this value to true.
     *            </p>
     */
    public void setLocalTime(Boolean localTime) {
        this.localTime = localTime;
    }

    /**
     * <p>
     * Specifies whether the journey's scheduled start and end times use each
     * participant's local time. To base the schedule on each participant's
     * local time, set this value to true.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localTime <p>
     *            Specifies whether the journey's scheduled start and end times
     *            use each participant's local time. To base the schedule on
     *            each participant's local time, set this value to true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteJourneyRequest withLocalTime(Boolean localTime) {
        this.localTime = localTime;
        return this;
    }

    /**
     * <p>
     * The name of the journey. A journey name can contain a maximum of 150
     * characters. The characters can be alphanumeric characters or symbols,
     * such as underscores (_) or hyphens (-). A journey name can't contain any
     * spaces.
     * </p>
     *
     * @return <p>
     *         The name of the journey. A journey name can contain a maximum of
     *         150 characters. The characters can be alphanumeric characters or
     *         symbols, such as underscores (_) or hyphens (-). A journey name
     *         can't contain any spaces.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the journey. A journey name can contain a maximum of 150
     * characters. The characters can be alphanumeric characters or symbols,
     * such as underscores (_) or hyphens (-). A journey name can't contain any
     * spaces.
     * </p>
     *
     * @param name <p>
     *            The name of the journey. A journey name can contain a maximum
     *            of 150 characters. The characters can be alphanumeric
     *            characters or symbols, such as underscores (_) or hyphens (-).
     *            A journey name can't contain any spaces.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the journey. A journey name can contain a maximum of 150
     * characters. The characters can be alphanumeric characters or symbols,
     * such as underscores (_) or hyphens (-). A journey name can't contain any
     * spaces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the journey. A journey name can contain a maximum
     *            of 150 characters. The characters can be alphanumeric
     *            characters or symbols, such as underscores (_) or hyphens (-).
     *            A journey name can't contain any spaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteJourneyRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The quiet time settings for the journey. Quiet time is a specific time
     * range when a journey doesn't send messages to participants, if all the
     * following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EndpointDemographic.Timezone property of the endpoint for the
     * participant is set to a valid value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the participant's time zone is later than or equal to
     * the time specified by the QuietTime.Start property for the journey.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the participant's time zone is earlier than or equal
     * to the time specified by the QuietTime.End property for the journey.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the participant will
     * receive messages from the journey, even if quiet time is enabled.
     * </p>
     *
     * @return <p>
     *         The quiet time settings for the journey. Quiet time is a specific
     *         time range when a journey doesn't send messages to participants,
     *         if all the following conditions are met:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The EndpointDemographic.Timezone property of the endpoint for the
     *         participant is set to a valid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The current time in the participant's time zone is later than or
     *         equal to the time specified by the QuietTime.Start property for
     *         the journey.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The current time in the participant's time zone is earlier than
     *         or equal to the time specified by the QuietTime.End property for
     *         the journey.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If any of the preceding conditions isn't met, the participant
     *         will receive messages from the journey, even if quiet time is
     *         enabled.
     *         </p>
     */
    public QuietTime getQuietTime() {
        return quietTime;
    }

    /**
     * <p>
     * The quiet time settings for the journey. Quiet time is a specific time
     * range when a journey doesn't send messages to participants, if all the
     * following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EndpointDemographic.Timezone property of the endpoint for the
     * participant is set to a valid value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the participant's time zone is later than or equal to
     * the time specified by the QuietTime.Start property for the journey.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the participant's time zone is earlier than or equal
     * to the time specified by the QuietTime.End property for the journey.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the participant will
     * receive messages from the journey, even if quiet time is enabled.
     * </p>
     *
     * @param quietTime <p>
     *            The quiet time settings for the journey. Quiet time is a
     *            specific time range when a journey doesn't send messages to
     *            participants, if all the following conditions are met:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The EndpointDemographic.Timezone property of the endpoint for
     *            the participant is set to a valid value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The current time in the participant's time zone is later than
     *            or equal to the time specified by the QuietTime.Start property
     *            for the journey.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The current time in the participant's time zone is earlier
     *            than or equal to the time specified by the QuietTime.End
     *            property for the journey.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If any of the preceding conditions isn't met, the participant
     *            will receive messages from the journey, even if quiet time is
     *            enabled.
     *            </p>
     */
    public void setQuietTime(QuietTime quietTime) {
        this.quietTime = quietTime;
    }

    /**
     * <p>
     * The quiet time settings for the journey. Quiet time is a specific time
     * range when a journey doesn't send messages to participants, if all the
     * following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EndpointDemographic.Timezone property of the endpoint for the
     * participant is set to a valid value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the participant's time zone is later than or equal to
     * the time specified by the QuietTime.Start property for the journey.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the participant's time zone is earlier than or equal
     * to the time specified by the QuietTime.End property for the journey.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the participant will
     * receive messages from the journey, even if quiet time is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quietTime <p>
     *            The quiet time settings for the journey. Quiet time is a
     *            specific time range when a journey doesn't send messages to
     *            participants, if all the following conditions are met:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The EndpointDemographic.Timezone property of the endpoint for
     *            the participant is set to a valid value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The current time in the participant's time zone is later than
     *            or equal to the time specified by the QuietTime.Start property
     *            for the journey.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The current time in the participant's time zone is earlier
     *            than or equal to the time specified by the QuietTime.End
     *            property for the journey.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If any of the preceding conditions isn't met, the participant
     *            will receive messages from the journey, even if quiet time is
     *            enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteJourneyRequest withQuietTime(QuietTime quietTime) {
        this.quietTime = quietTime;
        return this;
    }

    /**
     * <p>
     * The frequency with which Amazon Pinpoint evaluates segment and event data
     * for the journey, as a duration in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The frequency with which Amazon Pinpoint evaluates segment and
     *         event data for the journey, as a duration in ISO 8601 format.
     *         </p>
     */
    public String getRefreshFrequency() {
        return refreshFrequency;
    }

    /**
     * <p>
     * The frequency with which Amazon Pinpoint evaluates segment and event data
     * for the journey, as a duration in ISO 8601 format.
     * </p>
     *
     * @param refreshFrequency <p>
     *            The frequency with which Amazon Pinpoint evaluates segment and
     *            event data for the journey, as a duration in ISO 8601 format.
     *            </p>
     */
    public void setRefreshFrequency(String refreshFrequency) {
        this.refreshFrequency = refreshFrequency;
    }

    /**
     * <p>
     * The frequency with which Amazon Pinpoint evaluates segment and event data
     * for the journey, as a duration in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param refreshFrequency <p>
     *            The frequency with which Amazon Pinpoint evaluates segment and
     *            event data for the journey, as a duration in ISO 8601 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteJourneyRequest withRefreshFrequency(String refreshFrequency) {
        this.refreshFrequency = refreshFrequency;
        return this;
    }

    /**
     * <p>
     * The schedule settings for the journey.
     * </p>
     *
     * @return <p>
     *         The schedule settings for the journey.
     *         </p>
     */
    public JourneySchedule getSchedule() {
        return schedule;
    }

    /**
     * <p>
     * The schedule settings for the journey.
     * </p>
     *
     * @param schedule <p>
     *            The schedule settings for the journey.
     *            </p>
     */
    public void setSchedule(JourneySchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule settings for the journey.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schedule <p>
     *            The schedule settings for the journey.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteJourneyRequest withSchedule(JourneySchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the first activity in the journey. The
     * identifier for this activity can contain a maximum of 128 characters. The
     * characters must be alphanumeric characters.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the first activity in the journey. The
     *         identifier for this activity can contain a maximum of 128
     *         characters. The characters must be alphanumeric characters.
     *         </p>
     */
    public String getStartActivity() {
        return startActivity;
    }

    /**
     * <p>
     * The unique identifier for the first activity in the journey. The
     * identifier for this activity can contain a maximum of 128 characters. The
     * characters must be alphanumeric characters.
     * </p>
     *
     * @param startActivity <p>
     *            The unique identifier for the first activity in the journey.
     *            The identifier for this activity can contain a maximum of 128
     *            characters. The characters must be alphanumeric characters.
     *            </p>
     */
    public void setStartActivity(String startActivity) {
        this.startActivity = startActivity;
    }

    /**
     * <p>
     * The unique identifier for the first activity in the journey. The
     * identifier for this activity can contain a maximum of 128 characters. The
     * characters must be alphanumeric characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startActivity <p>
     *            The unique identifier for the first activity in the journey.
     *            The identifier for this activity can contain a maximum of 128
     *            characters. The characters must be alphanumeric characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteJourneyRequest withStartActivity(String startActivity) {
        this.startActivity = startActivity;
        return this;
    }

    /**
     * <p>
     * The segment that defines which users are participants in the journey.
     * </p>
     *
     * @return <p>
     *         The segment that defines which users are participants in the
     *         journey.
     *         </p>
     */
    public StartCondition getStartCondition() {
        return startCondition;
    }

    /**
     * <p>
     * The segment that defines which users are participants in the journey.
     * </p>
     *
     * @param startCondition <p>
     *            The segment that defines which users are participants in the
     *            journey.
     *            </p>
     */
    public void setStartCondition(StartCondition startCondition) {
        this.startCondition = startCondition;
    }

    /**
     * <p>
     * The segment that defines which users are participants in the journey.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startCondition <p>
     *            The segment that defines which users are participants in the
     *            journey.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteJourneyRequest withStartCondition(StartCondition startCondition) {
        this.startCondition = startCondition;
        return this;
    }

    /**
     * <p>
     * The status of the journey. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DRAFT - Saves the journey and doesn't publish it.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE - Saves and publishes the journey. Depending on the journey's
     * schedule, the journey starts running immediately or at the scheduled
     * start time. If a journey's status is ACTIVE, you can't add, change, or
     * remove activities from it.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The CANCELLED, COMPLETED, and CLOSED values are not supported in requests
     * to create or update a journey. To cancel a journey, use the <link
     * linkend="apps-application-id-journeys-journey-id-state">Journey
     * State</link> resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, COMPLETED, CANCELLED, CLOSED
     *
     * @return <p>
     *         The status of the journey. Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         DRAFT - Saves the journey and doesn't publish it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACTIVE - Saves and publishes the journey. Depending on the
     *         journey's schedule, the journey starts running immediately or at
     *         the scheduled start time. If a journey's status is ACTIVE, you
     *         can't add, change, or remove activities from it.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The CANCELLED, COMPLETED, and CLOSED values are not supported in
     *         requests to create or update a journey. To cancel a journey, use
     *         the <link
     *         linkend="apps-application-id-journeys-journey-id-state">Journey
     *         State</link> resource.
     *         </p>
     * @see State
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The status of the journey. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DRAFT - Saves the journey and doesn't publish it.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE - Saves and publishes the journey. Depending on the journey's
     * schedule, the journey starts running immediately or at the scheduled
     * start time. If a journey's status is ACTIVE, you can't add, change, or
     * remove activities from it.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The CANCELLED, COMPLETED, and CLOSED values are not supported in requests
     * to create or update a journey. To cancel a journey, use the <link
     * linkend="apps-application-id-journeys-journey-id-state">Journey
     * State</link> resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, COMPLETED, CANCELLED, CLOSED
     *
     * @param state <p>
     *            The status of the journey. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            DRAFT - Saves the journey and doesn't publish it.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ACTIVE - Saves and publishes the journey. Depending on the
     *            journey's schedule, the journey starts running immediately or
     *            at the scheduled start time. If a journey's status is ACTIVE,
     *            you can't add, change, or remove activities from it.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The CANCELLED, COMPLETED, and CLOSED values are not supported
     *            in requests to create or update a journey. To cancel a
     *            journey, use the <link
     *            linkend="apps-application-id-journeys-journey-id-state"
     *            >Journey State</link> resource.
     *            </p>
     * @see State
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The status of the journey. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DRAFT - Saves the journey and doesn't publish it.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE - Saves and publishes the journey. Depending on the journey's
     * schedule, the journey starts running immediately or at the scheduled
     * start time. If a journey's status is ACTIVE, you can't add, change, or
     * remove activities from it.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The CANCELLED, COMPLETED, and CLOSED values are not supported in requests
     * to create or update a journey. To cancel a journey, use the <link
     * linkend="apps-application-id-journeys-journey-id-state">Journey
     * State</link> resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, COMPLETED, CANCELLED, CLOSED
     *
     * @param state <p>
     *            The status of the journey. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            DRAFT - Saves the journey and doesn't publish it.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ACTIVE - Saves and publishes the journey. Depending on the
     *            journey's schedule, the journey starts running immediately or
     *            at the scheduled start time. If a journey's status is ACTIVE,
     *            you can't add, change, or remove activities from it.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The CANCELLED, COMPLETED, and CLOSED values are not supported
     *            in requests to create or update a journey. To cancel a
     *            journey, use the <link
     *            linkend="apps-application-id-journeys-journey-id-state"
     *            >Journey State</link> resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see State
     */
    public WriteJourneyRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The status of the journey. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DRAFT - Saves the journey and doesn't publish it.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE - Saves and publishes the journey. Depending on the journey's
     * schedule, the journey starts running immediately or at the scheduled
     * start time. If a journey's status is ACTIVE, you can't add, change, or
     * remove activities from it.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The CANCELLED, COMPLETED, and CLOSED values are not supported in requests
     * to create or update a journey. To cancel a journey, use the <link
     * linkend="apps-application-id-journeys-journey-id-state">Journey
     * State</link> resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, COMPLETED, CANCELLED, CLOSED
     *
     * @param state <p>
     *            The status of the journey. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            DRAFT - Saves the journey and doesn't publish it.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ACTIVE - Saves and publishes the journey. Depending on the
     *            journey's schedule, the journey starts running immediately or
     *            at the scheduled start time. If a journey's status is ACTIVE,
     *            you can't add, change, or remove activities from it.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The CANCELLED, COMPLETED, and CLOSED values are not supported
     *            in requests to create or update a journey. To cancel a
     *            journey, use the <link
     *            linkend="apps-application-id-journeys-journey-id-state"
     *            >Journey State</link> resource.
     *            </p>
     * @see State
     */
    public void setState(State state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The status of the journey. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DRAFT - Saves the journey and doesn't publish it.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE - Saves and publishes the journey. Depending on the journey's
     * schedule, the journey starts running immediately or at the scheduled
     * start time. If a journey's status is ACTIVE, you can't add, change, or
     * remove activities from it.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The CANCELLED, COMPLETED, and CLOSED values are not supported in requests
     * to create or update a journey. To cancel a journey, use the <link
     * linkend="apps-application-id-journeys-journey-id-state">Journey
     * State</link> resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, COMPLETED, CANCELLED, CLOSED
     *
     * @param state <p>
     *            The status of the journey. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            DRAFT - Saves the journey and doesn't publish it.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ACTIVE - Saves and publishes the journey. Depending on the
     *            journey's schedule, the journey starts running immediately or
     *            at the scheduled start time. If a journey's status is ACTIVE,
     *            you can't add, change, or remove activities from it.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The CANCELLED, COMPLETED, and CLOSED values are not supported
     *            in requests to create or update a journey. To cancel a
     *            journey, use the <link
     *            linkend="apps-application-id-journeys-journey-id-state"
     *            >Journey State</link> resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see State
     */
    public WriteJourneyRequest withState(State state) {
        this.state = state.toString();
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
        if (getActivities() != null)
            sb.append("Activities: " + getActivities() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getLimits() != null)
            sb.append("Limits: " + getLimits() + ",");
        if (getLocalTime() != null)
            sb.append("LocalTime: " + getLocalTime() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getQuietTime() != null)
            sb.append("QuietTime: " + getQuietTime() + ",");
        if (getRefreshFrequency() != null)
            sb.append("RefreshFrequency: " + getRefreshFrequency() + ",");
        if (getSchedule() != null)
            sb.append("Schedule: " + getSchedule() + ",");
        if (getStartActivity() != null)
            sb.append("StartActivity: " + getStartActivity() + ",");
        if (getStartCondition() != null)
            sb.append("StartCondition: " + getStartCondition() + ",");
        if (getState() != null)
            sb.append("State: " + getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivities() == null) ? 0 : getActivities().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getLimits() == null) ? 0 : getLimits().hashCode());
        hashCode = prime * hashCode + ((getLocalTime() == null) ? 0 : getLocalTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getQuietTime() == null) ? 0 : getQuietTime().hashCode());
        hashCode = prime * hashCode
                + ((getRefreshFrequency() == null) ? 0 : getRefreshFrequency().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode
                + ((getStartActivity() == null) ? 0 : getStartActivity().hashCode());
        hashCode = prime * hashCode
                + ((getStartCondition() == null) ? 0 : getStartCondition().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WriteJourneyRequest == false)
            return false;
        WriteJourneyRequest other = (WriteJourneyRequest) obj;

        if (other.getActivities() == null ^ this.getActivities() == null)
            return false;
        if (other.getActivities() != null
                && other.getActivities().equals(this.getActivities()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getLimits() == null ^ this.getLimits() == null)
            return false;
        if (other.getLimits() != null && other.getLimits().equals(this.getLimits()) == false)
            return false;
        if (other.getLocalTime() == null ^ this.getLocalTime() == null)
            return false;
        if (other.getLocalTime() != null
                && other.getLocalTime().equals(this.getLocalTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getQuietTime() == null ^ this.getQuietTime() == null)
            return false;
        if (other.getQuietTime() != null
                && other.getQuietTime().equals(this.getQuietTime()) == false)
            return false;
        if (other.getRefreshFrequency() == null ^ this.getRefreshFrequency() == null)
            return false;
        if (other.getRefreshFrequency() != null
                && other.getRefreshFrequency().equals(this.getRefreshFrequency()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getStartActivity() == null ^ this.getStartActivity() == null)
            return false;
        if (other.getStartActivity() != null
                && other.getStartActivity().equals(this.getStartActivity()) == false)
            return false;
        if (other.getStartCondition() == null ^ this.getStartCondition() == null)
            return false;
        if (other.getStartCondition() != null
                && other.getStartCondition().equals(this.getStartCondition()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }
}
