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

package com.amazonaws.services.health.model;

import java.io.Serializable;

/**
 * <p>
 * The values to filter results from the <a>DescribeEventsForOrganization</a>
 * operation.
 * </p>
 */
public class OrganizationEventFilter implements Serializable {
    /**
     * <p>
     * A list of unique identifiers for event types. For example,
     * <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED".</code>
     * </p>
     */
    private java.util.List<String> eventTypeCodes;

    /**
     * <p>
     * A list of 12-digit AWS account numbers that contains the affected
     * entities.
     * </p>
     */
    private java.util.List<String> awsAccountIds;

    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     */
    private java.util.List<String> services;

    /**
     * <p>
     * A list of AWS Regions.
     * </p>
     */
    private java.util.List<String> regions;

    /**
     * <p>
     * A range of dates and times that is used by the <a>EventFilter</a> and
     * <a>EntityFilter</a> objects. If <code>from</code> is set and
     * <code>to</code> is set: match items where the timestamp (
     * <code>startTime</code>, <code>endTime</code>, or
     * <code>lastUpdatedTime</code>) is between <code>from</code> and
     * <code>to</code> inclusive. If <code>from</code> is set and
     * <code>to</code> is not set: match items where the timestamp value is
     * equal to or after <code>from</code>. If <code>from</code> is not set and
     * <code>to</code> is set: match items where the timestamp value is equal to
     * or before <code>to</code>.
     * </p>
     */
    private DateTimeRange startTime;

    /**
     * <p>
     * A range of dates and times that is used by the <a>EventFilter</a> and
     * <a>EntityFilter</a> objects. If <code>from</code> is set and
     * <code>to</code> is set: match items where the timestamp (
     * <code>startTime</code>, <code>endTime</code>, or
     * <code>lastUpdatedTime</code>) is between <code>from</code> and
     * <code>to</code> inclusive. If <code>from</code> is set and
     * <code>to</code> is not set: match items where the timestamp value is
     * equal to or after <code>from</code>. If <code>from</code> is not set and
     * <code>to</code> is set: match items where the timestamp value is equal to
     * or before <code>to</code>.
     * </p>
     */
    private DateTimeRange endTime;

    /**
     * <p>
     * A range of dates and times that is used by the <a>EventFilter</a> and
     * <a>EntityFilter</a> objects. If <code>from</code> is set and
     * <code>to</code> is set: match items where the timestamp (
     * <code>startTime</code>, <code>endTime</code>, or
     * <code>lastUpdatedTime</code>) is between <code>from</code> and
     * <code>to</code> inclusive. If <code>from</code> is set and
     * <code>to</code> is not set: match items where the timestamp value is
     * equal to or after <code>from</code>. If <code>from</code> is not set and
     * <code>to</code> is set: match items where the timestamp value is equal to
     * or before <code>to</code>.
     * </p>
     */
    private DateTimeRange lastUpdatedTime;

    /**
     * <p>
     * REPLACEME
     * </p>
     */
    private java.util.List<String> entityArns;

    /**
     * <p>
     * A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or
     * EBS volumes (vol-426ab23e).
     * </p>
     */
    private java.util.List<String> entityValues;

    /**
     * <p>
     * REPLACEME
     * </p>
     */
    private java.util.List<String> eventTypeCategories;

    /**
     * <p>
     * A list of event status codes.
     * </p>
     */
    private java.util.List<String> eventStatusCodes;

    /**
     * <p>
     * A list of unique identifiers for event types. For example,
     * <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED".</code>
     * </p>
     *
     * @return <p>
     *         A list of unique identifiers for event types. For example,
     *         <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED".</code>
     *         </p>
     */
    public java.util.List<String> getEventTypeCodes() {
        return eventTypeCodes;
    }

    /**
     * <p>
     * A list of unique identifiers for event types. For example,
     * <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED".</code>
     * </p>
     *
     * @param eventTypeCodes <p>
     *            A list of unique identifiers for event types. For example,
     *            <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED".</code>
     *            </p>
     */
    public void setEventTypeCodes(java.util.Collection<String> eventTypeCodes) {
        if (eventTypeCodes == null) {
            this.eventTypeCodes = null;
            return;
        }

        this.eventTypeCodes = new java.util.ArrayList<String>(eventTypeCodes);
    }

    /**
     * <p>
     * A list of unique identifiers for event types. For example,
     * <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED".</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventTypeCodes <p>
     *            A list of unique identifiers for event types. For example,
     *            <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED".</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEventFilter withEventTypeCodes(String... eventTypeCodes) {
        if (getEventTypeCodes() == null) {
            this.eventTypeCodes = new java.util.ArrayList<String>(eventTypeCodes.length);
        }
        for (String value : eventTypeCodes) {
            this.eventTypeCodes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of unique identifiers for event types. For example,
     * <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED".</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventTypeCodes <p>
     *            A list of unique identifiers for event types. For example,
     *            <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED".</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEventFilter withEventTypeCodes(java.util.Collection<String> eventTypeCodes) {
        setEventTypeCodes(eventTypeCodes);
        return this;
    }

    /**
     * <p>
     * A list of 12-digit AWS account numbers that contains the affected
     * entities.
     * </p>
     *
     * @return <p>
     *         A list of 12-digit AWS account numbers that contains the affected
     *         entities.
     *         </p>
     */
    public java.util.List<String> getAwsAccountIds() {
        return awsAccountIds;
    }

    /**
     * <p>
     * A list of 12-digit AWS account numbers that contains the affected
     * entities.
     * </p>
     *
     * @param awsAccountIds <p>
     *            A list of 12-digit AWS account numbers that contains the
     *            affected entities.
     *            </p>
     */
    public void setAwsAccountIds(java.util.Collection<String> awsAccountIds) {
        if (awsAccountIds == null) {
            this.awsAccountIds = null;
            return;
        }

        this.awsAccountIds = new java.util.ArrayList<String>(awsAccountIds);
    }

    /**
     * <p>
     * A list of 12-digit AWS account numbers that contains the affected
     * entities.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsAccountIds <p>
     *            A list of 12-digit AWS account numbers that contains the
     *            affected entities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEventFilter withAwsAccountIds(String... awsAccountIds) {
        if (getAwsAccountIds() == null) {
            this.awsAccountIds = new java.util.ArrayList<String>(awsAccountIds.length);
        }
        for (String value : awsAccountIds) {
            this.awsAccountIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of 12-digit AWS account numbers that contains the affected
     * entities.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsAccountIds <p>
     *            A list of 12-digit AWS account numbers that contains the
     *            affected entities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEventFilter withAwsAccountIds(java.util.Collection<String> awsAccountIds) {
        setAwsAccountIds(awsAccountIds);
        return this;
    }

    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     *
     * @return <p>
     *         The AWS services associated with the event. For example,
     *         <code>EC2</code>, <code>RDS</code>.
     *         </p>
     */
    public java.util.List<String> getServices() {
        return services;
    }

    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     *
     * @param services <p>
     *            The AWS services associated with the event. For example,
     *            <code>EC2</code>, <code>RDS</code>.
     *            </p>
     */
    public void setServices(java.util.Collection<String> services) {
        if (services == null) {
            this.services = null;
            return;
        }

        this.services = new java.util.ArrayList<String>(services);
    }

    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param services <p>
     *            The AWS services associated with the event. For example,
     *            <code>EC2</code>, <code>RDS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEventFilter withServices(String... services) {
        if (getServices() == null) {
            this.services = new java.util.ArrayList<String>(services.length);
        }
        for (String value : services) {
            this.services.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param services <p>
     *            The AWS services associated with the event. For example,
     *            <code>EC2</code>, <code>RDS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEventFilter withServices(java.util.Collection<String> services) {
        setServices(services);
        return this;
    }

    /**
     * <p>
     * A list of AWS Regions.
     * </p>
     *
     * @return <p>
     *         A list of AWS Regions.
     *         </p>
     */
    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * <p>
     * A list of AWS Regions.
     * </p>
     *
     * @param regions <p>
     *            A list of AWS Regions.
     *            </p>
     */
    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new java.util.ArrayList<String>(regions);
    }

    /**
     * <p>
     * A list of AWS Regions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regions <p>
     *            A list of AWS Regions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEventFilter withRegions(String... regions) {
        if (getRegions() == null) {
            this.regions = new java.util.ArrayList<String>(regions.length);
        }
        for (String value : regions) {
            this.regions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of AWS Regions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regions <p>
     *            A list of AWS Regions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEventFilter withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * <p>
     * A range of dates and times that is used by the <a>EventFilter</a> and
     * <a>EntityFilter</a> objects. If <code>from</code> is set and
     * <code>to</code> is set: match items where the timestamp (
     * <code>startTime</code>, <code>endTime</code>, or
     * <code>lastUpdatedTime</code>) is between <code>from</code> and
     * <code>to</code> inclusive. If <code>from</code> is set and
     * <code>to</code> is not set: match items where the timestamp value is
     * equal to or after <code>from</code>. If <code>from</code> is not set and
     * <code>to</code> is set: match items where the timestamp value is equal to
     * or before <code>to</code>.
     * </p>
     *
     * @return <p>
     *         A range of dates and times that is used by the <a>EventFilter</a>
     *         and <a>EntityFilter</a> objects. If <code>from</code> is set and
     *         <code>to</code> is set: match items where the timestamp (
     *         <code>startTime</code>, <code>endTime</code>, or
     *         <code>lastUpdatedTime</code>) is between <code>from</code> and
     *         <code>to</code> inclusive. If <code>from</code> is set and
     *         <code>to</code> is not set: match items where the timestamp value
     *         is equal to or after <code>from</code>. If <code>from</code> is
     *         not set and <code>to</code> is set: match items where the
     *         timestamp value is equal to or before <code>to</code>.
     *         </p>
     */
    public DateTimeRange getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * A range of dates and times that is used by the <a>EventFilter</a> and
     * <a>EntityFilter</a> objects. If <code>from</code> is set and
     * <code>to</code> is set: match items where the timestamp (
     * <code>startTime</code>, <code>endTime</code>, or
     * <code>lastUpdatedTime</code>) is between <code>from</code> and
     * <code>to</code> inclusive. If <code>from</code> is set and
     * <code>to</code> is not set: match items where the timestamp value is
     * equal to or after <code>from</code>. If <code>from</code> is not set and
     * <code>to</code> is set: match items where the timestamp value is equal to
     * or before <code>to</code>.
     * </p>
     *
     * @param startTime <p>
     *            A range of dates and times that is used by the
     *            <a>EventFilter</a> and <a>EntityFilter</a> objects. If
     *            <code>from</code> is set and <code>to</code> is set: match
     *            items where the timestamp (<code>startTime</code>,
     *            <code>endTime</code>, or <code>lastUpdatedTime</code>) is
     *            between <code>from</code> and <code>to</code> inclusive. If
     *            <code>from</code> is set and <code>to</code> is not set: match
     *            items where the timestamp value is equal to or after
     *            <code>from</code>. If <code>from</code> is not set and
     *            <code>to</code> is set: match items where the timestamp value
     *            is equal to or before <code>to</code>.
     *            </p>
     */
    public void setStartTime(DateTimeRange startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A range of dates and times that is used by the <a>EventFilter</a> and
     * <a>EntityFilter</a> objects. If <code>from</code> is set and
     * <code>to</code> is set: match items where the timestamp (
     * <code>startTime</code>, <code>endTime</code>, or
     * <code>lastUpdatedTime</code>) is between <code>from</code> and
     * <code>to</code> inclusive. If <code>from</code> is set and
     * <code>to</code> is not set: match items where the timestamp value is
     * equal to or after <code>from</code>. If <code>from</code> is not set and
     * <code>to</code> is set: match items where the timestamp value is equal to
     * or before <code>to</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            A range of dates and times that is used by the
     *            <a>EventFilter</a> and <a>EntityFilter</a> objects. If
     *            <code>from</code> is set and <code>to</code> is set: match
     *            items where the timestamp (<code>startTime</code>,
     *            <code>endTime</code>, or <code>lastUpdatedTime</code>) is
     *            between <code>from</code> and <code>to</code> inclusive. If
     *            <code>from</code> is set and <code>to</code> is not set: match
     *            items where the timestamp value is equal to or after
     *            <code>from</code>. If <code>from</code> is not set and
     *            <code>to</code> is set: match items where the timestamp value
     *            is equal to or before <code>to</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEventFilter withStartTime(DateTimeRange startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * A range of dates and times that is used by the <a>EventFilter</a> and
     * <a>EntityFilter</a> objects. If <code>from</code> is set and
     * <code>to</code> is set: match items where the timestamp (
     * <code>startTime</code>, <code>endTime</code>, or
     * <code>lastUpdatedTime</code>) is between <code>from</code> and
     * <code>to</code> inclusive. If <code>from</code> is set and
     * <code>to</code> is not set: match items where the timestamp value is
     * equal to or after <code>from</code>. If <code>from</code> is not set and
     * <code>to</code> is set: match items where the timestamp value is equal to
     * or before <code>to</code>.
     * </p>
     *
     * @return <p>
     *         A range of dates and times that is used by the <a>EventFilter</a>
     *         and <a>EntityFilter</a> objects. If <code>from</code> is set and
     *         <code>to</code> is set: match items where the timestamp (
     *         <code>startTime</code>, <code>endTime</code>, or
     *         <code>lastUpdatedTime</code>) is between <code>from</code> and
     *         <code>to</code> inclusive. If <code>from</code> is set and
     *         <code>to</code> is not set: match items where the timestamp value
     *         is equal to or after <code>from</code>. If <code>from</code> is
     *         not set and <code>to</code> is set: match items where the
     *         timestamp value is equal to or before <code>to</code>.
     *         </p>
     */
    public DateTimeRange getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * A range of dates and times that is used by the <a>EventFilter</a> and
     * <a>EntityFilter</a> objects. If <code>from</code> is set and
     * <code>to</code> is set: match items where the timestamp (
     * <code>startTime</code>, <code>endTime</code>, or
     * <code>lastUpdatedTime</code>) is between <code>from</code> and
     * <code>to</code> inclusive. If <code>from</code> is set and
     * <code>to</code> is not set: match items where the timestamp value is
     * equal to or after <code>from</code>. If <code>from</code> is not set and
     * <code>to</code> is set: match items where the timestamp value is equal to
     * or before <code>to</code>.
     * </p>
     *
     * @param endTime <p>
     *            A range of dates and times that is used by the
     *            <a>EventFilter</a> and <a>EntityFilter</a> objects. If
     *            <code>from</code> is set and <code>to</code> is set: match
     *            items where the timestamp (<code>startTime</code>,
     *            <code>endTime</code>, or <code>lastUpdatedTime</code>) is
     *            between <code>from</code> and <code>to</code> inclusive. If
     *            <code>from</code> is set and <code>to</code> is not set: match
     *            items where the timestamp value is equal to or after
     *            <code>from</code>. If <code>from</code> is not set and
     *            <code>to</code> is set: match items where the timestamp value
     *            is equal to or before <code>to</code>.
     *            </p>
     */
    public void setEndTime(DateTimeRange endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * A range of dates and times that is used by the <a>EventFilter</a> and
     * <a>EntityFilter</a> objects. If <code>from</code> is set and
     * <code>to</code> is set: match items where the timestamp (
     * <code>startTime</code>, <code>endTime</code>, or
     * <code>lastUpdatedTime</code>) is between <code>from</code> and
     * <code>to</code> inclusive. If <code>from</code> is set and
     * <code>to</code> is not set: match items where the timestamp value is
     * equal to or after <code>from</code>. If <code>from</code> is not set and
     * <code>to</code> is set: match items where the timestamp value is equal to
     * or before <code>to</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            A range of dates and times that is used by the
     *            <a>EventFilter</a> and <a>EntityFilter</a> objects. If
     *            <code>from</code> is set and <code>to</code> is set: match
     *            items where the timestamp (<code>startTime</code>,
     *            <code>endTime</code>, or <code>lastUpdatedTime</code>) is
     *            between <code>from</code> and <code>to</code> inclusive. If
     *            <code>from</code> is set and <code>to</code> is not set: match
     *            items where the timestamp value is equal to or after
     *            <code>from</code>. If <code>from</code> is not set and
     *            <code>to</code> is set: match items where the timestamp value
     *            is equal to or before <code>to</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEventFilter withEndTime(DateTimeRange endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * A range of dates and times that is used by the <a>EventFilter</a> and
     * <a>EntityFilter</a> objects. If <code>from</code> is set and
     * <code>to</code> is set: match items where the timestamp (
     * <code>startTime</code>, <code>endTime</code>, or
     * <code>lastUpdatedTime</code>) is between <code>from</code> and
     * <code>to</code> inclusive. If <code>from</code> is set and
     * <code>to</code> is not set: match items where the timestamp value is
     * equal to or after <code>from</code>. If <code>from</code> is not set and
     * <code>to</code> is set: match items where the timestamp value is equal to
     * or before <code>to</code>.
     * </p>
     *
     * @return <p>
     *         A range of dates and times that is used by the <a>EventFilter</a>
     *         and <a>EntityFilter</a> objects. If <code>from</code> is set and
     *         <code>to</code> is set: match items where the timestamp (
     *         <code>startTime</code>, <code>endTime</code>, or
     *         <code>lastUpdatedTime</code>) is between <code>from</code> and
     *         <code>to</code> inclusive. If <code>from</code> is set and
     *         <code>to</code> is not set: match items where the timestamp value
     *         is equal to or after <code>from</code>. If <code>from</code> is
     *         not set and <code>to</code> is set: match items where the
     *         timestamp value is equal to or before <code>to</code>.
     *         </p>
     */
    public DateTimeRange getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * A range of dates and times that is used by the <a>EventFilter</a> and
     * <a>EntityFilter</a> objects. If <code>from</code> is set and
     * <code>to</code> is set: match items where the timestamp (
     * <code>startTime</code>, <code>endTime</code>, or
     * <code>lastUpdatedTime</code>) is between <code>from</code> and
     * <code>to</code> inclusive. If <code>from</code> is set and
     * <code>to</code> is not set: match items where the timestamp value is
     * equal to or after <code>from</code>. If <code>from</code> is not set and
     * <code>to</code> is set: match items where the timestamp value is equal to
     * or before <code>to</code>.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            A range of dates and times that is used by the
     *            <a>EventFilter</a> and <a>EntityFilter</a> objects. If
     *            <code>from</code> is set and <code>to</code> is set: match
     *            items where the timestamp (<code>startTime</code>,
     *            <code>endTime</code>, or <code>lastUpdatedTime</code>) is
     *            between <code>from</code> and <code>to</code> inclusive. If
     *            <code>from</code> is set and <code>to</code> is not set: match
     *            items where the timestamp value is equal to or after
     *            <code>from</code>. If <code>from</code> is not set and
     *            <code>to</code> is set: match items where the timestamp value
     *            is equal to or before <code>to</code>.
     *            </p>
     */
    public void setLastUpdatedTime(DateTimeRange lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * A range of dates and times that is used by the <a>EventFilter</a> and
     * <a>EntityFilter</a> objects. If <code>from</code> is set and
     * <code>to</code> is set: match items where the timestamp (
     * <code>startTime</code>, <code>endTime</code>, or
     * <code>lastUpdatedTime</code>) is between <code>from</code> and
     * <code>to</code> inclusive. If <code>from</code> is set and
     * <code>to</code> is not set: match items where the timestamp value is
     * equal to or after <code>from</code>. If <code>from</code> is not set and
     * <code>to</code> is set: match items where the timestamp value is equal to
     * or before <code>to</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            A range of dates and times that is used by the
     *            <a>EventFilter</a> and <a>EntityFilter</a> objects. If
     *            <code>from</code> is set and <code>to</code> is set: match
     *            items where the timestamp (<code>startTime</code>,
     *            <code>endTime</code>, or <code>lastUpdatedTime</code>) is
     *            between <code>from</code> and <code>to</code> inclusive. If
     *            <code>from</code> is set and <code>to</code> is not set: match
     *            items where the timestamp value is equal to or after
     *            <code>from</code>. If <code>from</code> is not set and
     *            <code>to</code> is set: match items where the timestamp value
     *            is equal to or before <code>to</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEventFilter withLastUpdatedTime(DateTimeRange lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * <p>
     * REPLACEME
     * </p>
     *
     * @return <p>
     *         REPLACEME
     *         </p>
     */
    public java.util.List<String> getEntityArns() {
        return entityArns;
    }

    /**
     * <p>
     * REPLACEME
     * </p>
     *
     * @param entityArns <p>
     *            REPLACEME
     *            </p>
     */
    public void setEntityArns(java.util.Collection<String> entityArns) {
        if (entityArns == null) {
            this.entityArns = null;
            return;
        }

        this.entityArns = new java.util.ArrayList<String>(entityArns);
    }

    /**
     * <p>
     * REPLACEME
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityArns <p>
     *            REPLACEME
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEventFilter withEntityArns(String... entityArns) {
        if (getEntityArns() == null) {
            this.entityArns = new java.util.ArrayList<String>(entityArns.length);
        }
        for (String value : entityArns) {
            this.entityArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * REPLACEME
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityArns <p>
     *            REPLACEME
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEventFilter withEntityArns(java.util.Collection<String> entityArns) {
        setEntityArns(entityArns);
        return this;
    }

    /**
     * <p>
     * A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or
     * EBS volumes (vol-426ab23e).
     * </p>
     *
     * @return <p>
     *         A list of entity identifiers, such as EC2 instance IDs
     *         (i-34ab692e) or EBS volumes (vol-426ab23e).
     *         </p>
     */
    public java.util.List<String> getEntityValues() {
        return entityValues;
    }

    /**
     * <p>
     * A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or
     * EBS volumes (vol-426ab23e).
     * </p>
     *
     * @param entityValues <p>
     *            A list of entity identifiers, such as EC2 instance IDs
     *            (i-34ab692e) or EBS volumes (vol-426ab23e).
     *            </p>
     */
    public void setEntityValues(java.util.Collection<String> entityValues) {
        if (entityValues == null) {
            this.entityValues = null;
            return;
        }

        this.entityValues = new java.util.ArrayList<String>(entityValues);
    }

    /**
     * <p>
     * A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or
     * EBS volumes (vol-426ab23e).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityValues <p>
     *            A list of entity identifiers, such as EC2 instance IDs
     *            (i-34ab692e) or EBS volumes (vol-426ab23e).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEventFilter withEntityValues(String... entityValues) {
        if (getEntityValues() == null) {
            this.entityValues = new java.util.ArrayList<String>(entityValues.length);
        }
        for (String value : entityValues) {
            this.entityValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or
     * EBS volumes (vol-426ab23e).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityValues <p>
     *            A list of entity identifiers, such as EC2 instance IDs
     *            (i-34ab692e) or EBS volumes (vol-426ab23e).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEventFilter withEntityValues(java.util.Collection<String> entityValues) {
        setEntityValues(entityValues);
        return this;
    }

    /**
     * <p>
     * REPLACEME
     * </p>
     *
     * @return <p>
     *         REPLACEME
     *         </p>
     */
    public java.util.List<String> getEventTypeCategories() {
        return eventTypeCategories;
    }

    /**
     * <p>
     * REPLACEME
     * </p>
     *
     * @param eventTypeCategories <p>
     *            REPLACEME
     *            </p>
     */
    public void setEventTypeCategories(java.util.Collection<String> eventTypeCategories) {
        if (eventTypeCategories == null) {
            this.eventTypeCategories = null;
            return;
        }

        this.eventTypeCategories = new java.util.ArrayList<String>(eventTypeCategories);
    }

    /**
     * <p>
     * REPLACEME
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventTypeCategories <p>
     *            REPLACEME
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEventFilter withEventTypeCategories(String... eventTypeCategories) {
        if (getEventTypeCategories() == null) {
            this.eventTypeCategories = new java.util.ArrayList<String>(eventTypeCategories.length);
        }
        for (String value : eventTypeCategories) {
            this.eventTypeCategories.add(value);
        }
        return this;
    }

    /**
     * <p>
     * REPLACEME
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventTypeCategories <p>
     *            REPLACEME
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEventFilter withEventTypeCategories(
            java.util.Collection<String> eventTypeCategories) {
        setEventTypeCategories(eventTypeCategories);
        return this;
    }

    /**
     * <p>
     * A list of event status codes.
     * </p>
     *
     * @return <p>
     *         A list of event status codes.
     *         </p>
     */
    public java.util.List<String> getEventStatusCodes() {
        return eventStatusCodes;
    }

    /**
     * <p>
     * A list of event status codes.
     * </p>
     *
     * @param eventStatusCodes <p>
     *            A list of event status codes.
     *            </p>
     */
    public void setEventStatusCodes(java.util.Collection<String> eventStatusCodes) {
        if (eventStatusCodes == null) {
            this.eventStatusCodes = null;
            return;
        }

        this.eventStatusCodes = new java.util.ArrayList<String>(eventStatusCodes);
    }

    /**
     * <p>
     * A list of event status codes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventStatusCodes <p>
     *            A list of event status codes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEventFilter withEventStatusCodes(String... eventStatusCodes) {
        if (getEventStatusCodes() == null) {
            this.eventStatusCodes = new java.util.ArrayList<String>(eventStatusCodes.length);
        }
        for (String value : eventStatusCodes) {
            this.eventStatusCodes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of event status codes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventStatusCodes <p>
     *            A list of event status codes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEventFilter withEventStatusCodes(
            java.util.Collection<String> eventStatusCodes) {
        setEventStatusCodes(eventStatusCodes);
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
        if (getEventTypeCodes() != null)
            sb.append("eventTypeCodes: " + getEventTypeCodes() + ",");
        if (getAwsAccountIds() != null)
            sb.append("awsAccountIds: " + getAwsAccountIds() + ",");
        if (getServices() != null)
            sb.append("services: " + getServices() + ",");
        if (getRegions() != null)
            sb.append("regions: " + getRegions() + ",");
        if (getStartTime() != null)
            sb.append("startTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("endTime: " + getEndTime() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("lastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getEntityArns() != null)
            sb.append("entityArns: " + getEntityArns() + ",");
        if (getEntityValues() != null)
            sb.append("entityValues: " + getEntityValues() + ",");
        if (getEventTypeCategories() != null)
            sb.append("eventTypeCategories: " + getEventTypeCategories() + ",");
        if (getEventStatusCodes() != null)
            sb.append("eventStatusCodes: " + getEventStatusCodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEventTypeCodes() == null) ? 0 : getEventTypeCodes().hashCode());
        hashCode = prime * hashCode
                + ((getAwsAccountIds() == null) ? 0 : getAwsAccountIds().hashCode());
        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getEntityArns() == null) ? 0 : getEntityArns().hashCode());
        hashCode = prime * hashCode
                + ((getEntityValues() == null) ? 0 : getEntityValues().hashCode());
        hashCode = prime * hashCode
                + ((getEventTypeCategories() == null) ? 0 : getEventTypeCategories().hashCode());
        hashCode = prime * hashCode
                + ((getEventStatusCodes() == null) ? 0 : getEventStatusCodes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationEventFilter == false)
            return false;
        OrganizationEventFilter other = (OrganizationEventFilter) obj;

        if (other.getEventTypeCodes() == null ^ this.getEventTypeCodes() == null)
            return false;
        if (other.getEventTypeCodes() != null
                && other.getEventTypeCodes().equals(this.getEventTypeCodes()) == false)
            return false;
        if (other.getAwsAccountIds() == null ^ this.getAwsAccountIds() == null)
            return false;
        if (other.getAwsAccountIds() != null
                && other.getAwsAccountIds().equals(this.getAwsAccountIds()) == false)
            return false;
        if (other.getServices() == null ^ this.getServices() == null)
            return false;
        if (other.getServices() != null && other.getServices().equals(this.getServices()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getEntityArns() == null ^ this.getEntityArns() == null)
            return false;
        if (other.getEntityArns() != null
                && other.getEntityArns().equals(this.getEntityArns()) == false)
            return false;
        if (other.getEntityValues() == null ^ this.getEntityValues() == null)
            return false;
        if (other.getEntityValues() != null
                && other.getEntityValues().equals(this.getEntityValues()) == false)
            return false;
        if (other.getEventTypeCategories() == null ^ this.getEventTypeCategories() == null)
            return false;
        if (other.getEventTypeCategories() != null
                && other.getEventTypeCategories().equals(this.getEventTypeCategories()) == false)
            return false;
        if (other.getEventStatusCodes() == null ^ this.getEventStatusCodes() == null)
            return false;
        if (other.getEventStatusCodes() != null
                && other.getEventStatusCodes().equals(this.getEventStatusCodes()) == false)
            return false;
        return true;
    }
}
