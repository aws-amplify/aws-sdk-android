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
 * The values to use to filter results from the <a>DescribeEvents</a> and
 * <a>DescribeEventAggregates</a> operations.
 * </p>
 */
public class EventFilter implements Serializable {
    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     */
    private java.util.List<String> eventArns;

    /**
     * <p>
     * A list of unique identifiers for event types. For example,
     * <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED".</code>
     * </p>
     */
    private java.util.List<String> eventTypeCodes;

    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     */
    private java.util.List<String> services;

    /**
     * <p>
     * A list of AWS regions.
     * </p>
     */
    private java.util.List<String> regions;

    /**
     * <p>
     * A list of AWS availability zones.
     * </p>
     */
    private java.util.List<String> availabilityZones;

    /**
     * <p>
     * A list of dates and times that the event began.
     * </p>
     */
    private java.util.List<DateTimeRange> startTimes;

    /**
     * <p>
     * A list of dates and times that the event ended.
     * </p>
     */
    private java.util.List<DateTimeRange> endTimes;

    /**
     * <p>
     * A list of dates and times that the event was last updated.
     * </p>
     */
    private java.util.List<DateTimeRange> lastUpdatedTimes;

    /**
     * <p>
     * A list of entity ARNs (unique identifiers).
     * </p>
     */
    private java.util.List<String> entityArns;

    /**
     * <p>
     * A list of entity identifiers, such as EC2 instance IDs (
     * <code>i-34ab692e</code>) or EBS volumes (<code>vol-426ab23e</code>).
     * </p>
     */
    private java.util.List<String> entityValues;

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>,
     * <code>scheduledChange</code>, or <code>accountNotification</code>).
     * </p>
     */
    private java.util.List<String> eventTypeCategories;

    /**
     * <p>
     * A map of entity tags attached to the affected entity.
     * </p>
     */
    private java.util.List<java.util.Map<String, String>> tags;

    /**
     * <p>
     * A list of event status codes.
     * </p>
     */
    private java.util.List<String> eventStatusCodes;

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     *
     * @return <p>
     *         A list of event ARNs (unique identifiers). For example:
     *         <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     *         </p>
     */
    public java.util.List<String> getEventArns() {
        return eventArns;
    }

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     *
     * @param eventArns <p>
     *            A list of event ARNs (unique identifiers). For example:
     *            <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     *            </p>
     */
    public void setEventArns(java.util.Collection<String> eventArns) {
        if (eventArns == null) {
            this.eventArns = null;
            return;
        }

        this.eventArns = new java.util.ArrayList<String>(eventArns);
    }

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventArns <p>
     *            A list of event ARNs (unique identifiers). For example:
     *            <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFilter withEventArns(String... eventArns) {
        if (getEventArns() == null) {
            this.eventArns = new java.util.ArrayList<String>(eventArns.length);
        }
        for (String value : eventArns) {
            this.eventArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventArns <p>
     *            A list of event ARNs (unique identifiers). For example:
     *            <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFilter withEventArns(java.util.Collection<String> eventArns) {
        setEventArns(eventArns);
        return this;
    }

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
    public EventFilter withEventTypeCodes(String... eventTypeCodes) {
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
    public EventFilter withEventTypeCodes(java.util.Collection<String> eventTypeCodes) {
        setEventTypeCodes(eventTypeCodes);
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
    public EventFilter withServices(String... services) {
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
    public EventFilter withServices(java.util.Collection<String> services) {
        setServices(services);
        return this;
    }

    /**
     * <p>
     * A list of AWS regions.
     * </p>
     *
     * @return <p>
     *         A list of AWS regions.
     *         </p>
     */
    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * <p>
     * A list of AWS regions.
     * </p>
     *
     * @param regions <p>
     *            A list of AWS regions.
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
     * A list of AWS regions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regions <p>
     *            A list of AWS regions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFilter withRegions(String... regions) {
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
     * A list of AWS regions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regions <p>
     *            A list of AWS regions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFilter withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * <p>
     * A list of AWS availability zones.
     * </p>
     *
     * @return <p>
     *         A list of AWS availability zones.
     *         </p>
     */
    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * A list of AWS availability zones.
     * </p>
     *
     * @param availabilityZones <p>
     *            A list of AWS availability zones.
     *            </p>
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * <p>
     * A list of AWS availability zones.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            A list of AWS availability zones.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFilter withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) {
            this.availabilityZones = new java.util.ArrayList<String>(availabilityZones.length);
        }
        for (String value : availabilityZones) {
            this.availabilityZones.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of AWS availability zones.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            A list of AWS availability zones.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFilter withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * A list of dates and times that the event began.
     * </p>
     *
     * @return <p>
     *         A list of dates and times that the event began.
     *         </p>
     */
    public java.util.List<DateTimeRange> getStartTimes() {
        return startTimes;
    }

    /**
     * <p>
     * A list of dates and times that the event began.
     * </p>
     *
     * @param startTimes <p>
     *            A list of dates and times that the event began.
     *            </p>
     */
    public void setStartTimes(java.util.Collection<DateTimeRange> startTimes) {
        if (startTimes == null) {
            this.startTimes = null;
            return;
        }

        this.startTimes = new java.util.ArrayList<DateTimeRange>(startTimes);
    }

    /**
     * <p>
     * A list of dates and times that the event began.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTimes <p>
     *            A list of dates and times that the event began.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFilter withStartTimes(DateTimeRange... startTimes) {
        if (getStartTimes() == null) {
            this.startTimes = new java.util.ArrayList<DateTimeRange>(startTimes.length);
        }
        for (DateTimeRange value : startTimes) {
            this.startTimes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of dates and times that the event began.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTimes <p>
     *            A list of dates and times that the event began.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFilter withStartTimes(java.util.Collection<DateTimeRange> startTimes) {
        setStartTimes(startTimes);
        return this;
    }

    /**
     * <p>
     * A list of dates and times that the event ended.
     * </p>
     *
     * @return <p>
     *         A list of dates and times that the event ended.
     *         </p>
     */
    public java.util.List<DateTimeRange> getEndTimes() {
        return endTimes;
    }

    /**
     * <p>
     * A list of dates and times that the event ended.
     * </p>
     *
     * @param endTimes <p>
     *            A list of dates and times that the event ended.
     *            </p>
     */
    public void setEndTimes(java.util.Collection<DateTimeRange> endTimes) {
        if (endTimes == null) {
            this.endTimes = null;
            return;
        }

        this.endTimes = new java.util.ArrayList<DateTimeRange>(endTimes);
    }

    /**
     * <p>
     * A list of dates and times that the event ended.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTimes <p>
     *            A list of dates and times that the event ended.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFilter withEndTimes(DateTimeRange... endTimes) {
        if (getEndTimes() == null) {
            this.endTimes = new java.util.ArrayList<DateTimeRange>(endTimes.length);
        }
        for (DateTimeRange value : endTimes) {
            this.endTimes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of dates and times that the event ended.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTimes <p>
     *            A list of dates and times that the event ended.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFilter withEndTimes(java.util.Collection<DateTimeRange> endTimes) {
        setEndTimes(endTimes);
        return this;
    }

    /**
     * <p>
     * A list of dates and times that the event was last updated.
     * </p>
     *
     * @return <p>
     *         A list of dates and times that the event was last updated.
     *         </p>
     */
    public java.util.List<DateTimeRange> getLastUpdatedTimes() {
        return lastUpdatedTimes;
    }

    /**
     * <p>
     * A list of dates and times that the event was last updated.
     * </p>
     *
     * @param lastUpdatedTimes <p>
     *            A list of dates and times that the event was last updated.
     *            </p>
     */
    public void setLastUpdatedTimes(java.util.Collection<DateTimeRange> lastUpdatedTimes) {
        if (lastUpdatedTimes == null) {
            this.lastUpdatedTimes = null;
            return;
        }

        this.lastUpdatedTimes = new java.util.ArrayList<DateTimeRange>(lastUpdatedTimes);
    }

    /**
     * <p>
     * A list of dates and times that the event was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTimes <p>
     *            A list of dates and times that the event was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFilter withLastUpdatedTimes(DateTimeRange... lastUpdatedTimes) {
        if (getLastUpdatedTimes() == null) {
            this.lastUpdatedTimes = new java.util.ArrayList<DateTimeRange>(lastUpdatedTimes.length);
        }
        for (DateTimeRange value : lastUpdatedTimes) {
            this.lastUpdatedTimes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of dates and times that the event was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTimes <p>
     *            A list of dates and times that the event was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFilter withLastUpdatedTimes(java.util.Collection<DateTimeRange> lastUpdatedTimes) {
        setLastUpdatedTimes(lastUpdatedTimes);
        return this;
    }

    /**
     * <p>
     * A list of entity ARNs (unique identifiers).
     * </p>
     *
     * @return <p>
     *         A list of entity ARNs (unique identifiers).
     *         </p>
     */
    public java.util.List<String> getEntityArns() {
        return entityArns;
    }

    /**
     * <p>
     * A list of entity ARNs (unique identifiers).
     * </p>
     *
     * @param entityArns <p>
     *            A list of entity ARNs (unique identifiers).
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
     * A list of entity ARNs (unique identifiers).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityArns <p>
     *            A list of entity ARNs (unique identifiers).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFilter withEntityArns(String... entityArns) {
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
     * A list of entity ARNs (unique identifiers).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityArns <p>
     *            A list of entity ARNs (unique identifiers).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFilter withEntityArns(java.util.Collection<String> entityArns) {
        setEntityArns(entityArns);
        return this;
    }

    /**
     * <p>
     * A list of entity identifiers, such as EC2 instance IDs (
     * <code>i-34ab692e</code>) or EBS volumes (<code>vol-426ab23e</code>).
     * </p>
     *
     * @return <p>
     *         A list of entity identifiers, such as EC2 instance IDs (
     *         <code>i-34ab692e</code>) or EBS volumes (
     *         <code>vol-426ab23e</code>).
     *         </p>
     */
    public java.util.List<String> getEntityValues() {
        return entityValues;
    }

    /**
     * <p>
     * A list of entity identifiers, such as EC2 instance IDs (
     * <code>i-34ab692e</code>) or EBS volumes (<code>vol-426ab23e</code>).
     * </p>
     *
     * @param entityValues <p>
     *            A list of entity identifiers, such as EC2 instance IDs (
     *            <code>i-34ab692e</code>) or EBS volumes (
     *            <code>vol-426ab23e</code>).
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
     * A list of entity identifiers, such as EC2 instance IDs (
     * <code>i-34ab692e</code>) or EBS volumes (<code>vol-426ab23e</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityValues <p>
     *            A list of entity identifiers, such as EC2 instance IDs (
     *            <code>i-34ab692e</code>) or EBS volumes (
     *            <code>vol-426ab23e</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFilter withEntityValues(String... entityValues) {
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
     * A list of entity identifiers, such as EC2 instance IDs (
     * <code>i-34ab692e</code>) or EBS volumes (<code>vol-426ab23e</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityValues <p>
     *            A list of entity identifiers, such as EC2 instance IDs (
     *            <code>i-34ab692e</code>) or EBS volumes (
     *            <code>vol-426ab23e</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFilter withEntityValues(java.util.Collection<String> entityValues) {
        setEntityValues(entityValues);
        return this;
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>,
     * <code>scheduledChange</code>, or <code>accountNotification</code>).
     * </p>
     *
     * @return <p>
     *         A list of event type category codes (<code>issue</code>,
     *         <code>scheduledChange</code>, or <code>accountNotification</code>
     *         ).
     *         </p>
     */
    public java.util.List<String> getEventTypeCategories() {
        return eventTypeCategories;
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>,
     * <code>scheduledChange</code>, or <code>accountNotification</code>).
     * </p>
     *
     * @param eventTypeCategories <p>
     *            A list of event type category codes (<code>issue</code>,
     *            <code>scheduledChange</code>, or
     *            <code>accountNotification</code>).
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
     * A list of event type category codes (<code>issue</code>,
     * <code>scheduledChange</code>, or <code>accountNotification</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventTypeCategories <p>
     *            A list of event type category codes (<code>issue</code>,
     *            <code>scheduledChange</code>, or
     *            <code>accountNotification</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFilter withEventTypeCategories(String... eventTypeCategories) {
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
     * A list of event type category codes (<code>issue</code>,
     * <code>scheduledChange</code>, or <code>accountNotification</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventTypeCategories <p>
     *            A list of event type category codes (<code>issue</code>,
     *            <code>scheduledChange</code>, or
     *            <code>accountNotification</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFilter withEventTypeCategories(java.util.Collection<String> eventTypeCategories) {
        setEventTypeCategories(eventTypeCategories);
        return this;
    }

    /**
     * <p>
     * A map of entity tags attached to the affected entity.
     * </p>
     *
     * @return <p>
     *         A map of entity tags attached to the affected entity.
     *         </p>
     */
    public java.util.List<java.util.Map<String, String>> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of entity tags attached to the affected entity.
     * </p>
     *
     * @param tags <p>
     *            A map of entity tags attached to the affected entity.
     *            </p>
     */
    public void setTags(java.util.Collection<java.util.Map<String, String>> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<java.util.Map<String, String>>(tags);
    }

    /**
     * <p>
     * A map of entity tags attached to the affected entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A map of entity tags attached to the affected entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFilter withTags(java.util.Map<String, String>... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<java.util.Map<String, String>>(tags.length);
        }
        for (java.util.Map<String, String> value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A map of entity tags attached to the affected entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A map of entity tags attached to the affected entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFilter withTags(java.util.Collection<java.util.Map<String, String>> tags) {
        setTags(tags);
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
    public EventFilter withEventStatusCodes(String... eventStatusCodes) {
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
    public EventFilter withEventStatusCodes(java.util.Collection<String> eventStatusCodes) {
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
        if (getEventArns() != null)
            sb.append("eventArns: " + getEventArns() + ",");
        if (getEventTypeCodes() != null)
            sb.append("eventTypeCodes: " + getEventTypeCodes() + ",");
        if (getServices() != null)
            sb.append("services: " + getServices() + ",");
        if (getRegions() != null)
            sb.append("regions: " + getRegions() + ",");
        if (getAvailabilityZones() != null)
            sb.append("availabilityZones: " + getAvailabilityZones() + ",");
        if (getStartTimes() != null)
            sb.append("startTimes: " + getStartTimes() + ",");
        if (getEndTimes() != null)
            sb.append("endTimes: " + getEndTimes() + ",");
        if (getLastUpdatedTimes() != null)
            sb.append("lastUpdatedTimes: " + getLastUpdatedTimes() + ",");
        if (getEntityArns() != null)
            sb.append("entityArns: " + getEntityArns() + ",");
        if (getEntityValues() != null)
            sb.append("entityValues: " + getEntityValues() + ",");
        if (getEventTypeCategories() != null)
            sb.append("eventTypeCategories: " + getEventTypeCategories() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getEventStatusCodes() != null)
            sb.append("eventStatusCodes: " + getEventStatusCodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventArns() == null) ? 0 : getEventArns().hashCode());
        hashCode = prime * hashCode
                + ((getEventTypeCodes() == null) ? 0 : getEventTypeCodes().hashCode());
        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getStartTimes() == null) ? 0 : getStartTimes().hashCode());
        hashCode = prime * hashCode + ((getEndTimes() == null) ? 0 : getEndTimes().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTimes() == null) ? 0 : getLastUpdatedTimes().hashCode());
        hashCode = prime * hashCode + ((getEntityArns() == null) ? 0 : getEntityArns().hashCode());
        hashCode = prime * hashCode
                + ((getEntityValues() == null) ? 0 : getEntityValues().hashCode());
        hashCode = prime * hashCode
                + ((getEventTypeCategories() == null) ? 0 : getEventTypeCategories().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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

        if (obj instanceof EventFilter == false)
            return false;
        EventFilter other = (EventFilter) obj;

        if (other.getEventArns() == null ^ this.getEventArns() == null)
            return false;
        if (other.getEventArns() != null
                && other.getEventArns().equals(this.getEventArns()) == false)
            return false;
        if (other.getEventTypeCodes() == null ^ this.getEventTypeCodes() == null)
            return false;
        if (other.getEventTypeCodes() != null
                && other.getEventTypeCodes().equals(this.getEventTypeCodes()) == false)
            return false;
        if (other.getServices() == null ^ this.getServices() == null)
            return false;
        if (other.getServices() != null && other.getServices().equals(this.getServices()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null
                && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getStartTimes() == null ^ this.getStartTimes() == null)
            return false;
        if (other.getStartTimes() != null
                && other.getStartTimes().equals(this.getStartTimes()) == false)
            return false;
        if (other.getEndTimes() == null ^ this.getEndTimes() == null)
            return false;
        if (other.getEndTimes() != null && other.getEndTimes().equals(this.getEndTimes()) == false)
            return false;
        if (other.getLastUpdatedTimes() == null ^ this.getLastUpdatedTimes() == null)
            return false;
        if (other.getLastUpdatedTimes() != null
                && other.getLastUpdatedTimes().equals(this.getLastUpdatedTimes()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getEventStatusCodes() == null ^ this.getEventStatusCodes() == null)
            return false;
        if (other.getEventStatusCodes() != null
                && other.getEventStatusCodes().equals(this.getEventStatusCodes()) == false)
            return false;
        return true;
    }
}
