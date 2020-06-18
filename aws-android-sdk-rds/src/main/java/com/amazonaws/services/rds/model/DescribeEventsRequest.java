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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns events related to DB instances, DB security groups, DB snapshots, and
 * DB parameter groups for the past 14 days. Events specific to a particular DB
 * instance, DB security group, database snapshot, or DB parameter group can be
 * obtained by providing the name as a parameter. By default, the past hour of
 * events are returned.
 * </p>
 */
public class DescribeEventsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the event source for which events are returned. If not
     * specified, then all sources are included in the response.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If SourceIdentifier is supplied, SourceType must also be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBInstance</code>, then a
     * <code>DBInstanceIdentifier</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBSecurityGroup</code>, a
     * <code>DBSecurityGroupName</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBParameterGroup</code>, a
     * <code>DBParameterGroupName</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBSnapshot</code>, a
     * <code>DBSnapshotIdentifier</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceIdentifier;

    /**
     * <p>
     * The event source to retrieve events for. If no value is specified, all
     * events are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group,
     * db-security-group, db-snapshot, db-cluster, db-cluster-snapshot
     */
    private String sourceType;

    /**
     * <p>
     * The beginning of the time interval to retrieve events for, specified in
     * ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: 2009-07-08T18:00Z
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The end of the time interval for which to retrieve events, specified in
     * ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: 2009-07-08T18:00Z
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The number of minutes to retrieve events for.
     * </p>
     * <p>
     * Default: 60
     * </p>
     */
    private Integer duration;

    /**
     * <p>
     * A list of event categories that trigger notifications for a event
     * notification subscription.
     * </p>
     */
    private java.util.List<String> eventCategories;

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * An optional pagination token provided by a previous DescribeEvents
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The identifier of the event source for which events are returned. If not
     * specified, then all sources are included in the response.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If SourceIdentifier is supplied, SourceType must also be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBInstance</code>, then a
     * <code>DBInstanceIdentifier</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBSecurityGroup</code>, a
     * <code>DBSecurityGroupName</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBParameterGroup</code>, a
     * <code>DBParameterGroupName</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBSnapshot</code>, a
     * <code>DBSnapshotIdentifier</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The identifier of the event source for which events are returned.
     *         If not specified, then all sources are included in the response.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If SourceIdentifier is supplied, SourceType must also be
     *         provided.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source type is <code>DBInstance</code>, then a
     *         <code>DBInstanceIdentifier</code> must be supplied.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source type is <code>DBSecurityGroup</code>, a
     *         <code>DBSecurityGroupName</code> must be supplied.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source type is <code>DBParameterGroup</code>, a
     *         <code>DBParameterGroupName</code> must be supplied.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source type is <code>DBSnapshot</code>, a
     *         <code>DBSnapshotIdentifier</code> must be supplied.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getSourceIdentifier() {
        return sourceIdentifier;
    }

    /**
     * <p>
     * The identifier of the event source for which events are returned. If not
     * specified, then all sources are included in the response.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If SourceIdentifier is supplied, SourceType must also be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBInstance</code>, then a
     * <code>DBInstanceIdentifier</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBSecurityGroup</code>, a
     * <code>DBSecurityGroupName</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBParameterGroup</code>, a
     * <code>DBParameterGroupName</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBSnapshot</code>, a
     * <code>DBSnapshotIdentifier</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     *
     * @param sourceIdentifier <p>
     *            The identifier of the event source for which events are
     *            returned. If not specified, then all sources are included in
     *            the response.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If SourceIdentifier is supplied, SourceType must also be
     *            provided.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source type is <code>DBInstance</code>, then a
     *            <code>DBInstanceIdentifier</code> must be supplied.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source type is <code>DBSecurityGroup</code>, a
     *            <code>DBSecurityGroupName</code> must be supplied.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source type is <code>DBParameterGroup</code>, a
     *            <code>DBParameterGroupName</code> must be supplied.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source type is <code>DBSnapshot</code>, a
     *            <code>DBSnapshotIdentifier</code> must be supplied.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    /**
     * <p>
     * The identifier of the event source for which events are returned. If not
     * specified, then all sources are included in the response.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If SourceIdentifier is supplied, SourceType must also be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBInstance</code>, then a
     * <code>DBInstanceIdentifier</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBSecurityGroup</code>, a
     * <code>DBSecurityGroupName</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBParameterGroup</code>, a
     * <code>DBParameterGroupName</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is <code>DBSnapshot</code>, a
     * <code>DBSnapshotIdentifier</code> must be supplied.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceIdentifier <p>
     *            The identifier of the event source for which events are
     *            returned. If not specified, then all sources are included in
     *            the response.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If SourceIdentifier is supplied, SourceType must also be
     *            provided.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source type is <code>DBInstance</code>, then a
     *            <code>DBInstanceIdentifier</code> must be supplied.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source type is <code>DBSecurityGroup</code>, a
     *            <code>DBSecurityGroupName</code> must be supplied.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source type is <code>DBParameterGroup</code>, a
     *            <code>DBParameterGroupName</code> must be supplied.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source type is <code>DBSnapshot</code>, a
     *            <code>DBSnapshotIdentifier</code> must be supplied.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }

    /**
     * <p>
     * The event source to retrieve events for. If no value is specified, all
     * events are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group,
     * db-security-group, db-snapshot, db-cluster, db-cluster-snapshot
     *
     * @return <p>
     *         The event source to retrieve events for. If no value is
     *         specified, all events are returned.
     *         </p>
     * @see SourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * <p>
     * The event source to retrieve events for. If no value is specified, all
     * events are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group,
     * db-security-group, db-snapshot, db-cluster, db-cluster-snapshot
     *
     * @param sourceType <p>
     *            The event source to retrieve events for. If no value is
     *            specified, all events are returned.
     *            </p>
     * @see SourceType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The event source to retrieve events for. If no value is specified, all
     * events are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group,
     * db-security-group, db-snapshot, db-cluster, db-cluster-snapshot
     *
     * @param sourceType <p>
     *            The event source to retrieve events for. If no value is
     *            specified, all events are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceType
     */
    public DescribeEventsRequest withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * <p>
     * The event source to retrieve events for. If no value is specified, all
     * events are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group,
     * db-security-group, db-snapshot, db-cluster, db-cluster-snapshot
     *
     * @param sourceType <p>
     *            The event source to retrieve events for. If no value is
     *            specified, all events are returned.
     *            </p>
     * @see SourceType
     */
    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
    }

    /**
     * <p>
     * The event source to retrieve events for. If no value is specified, all
     * events are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group,
     * db-security-group, db-snapshot, db-cluster, db-cluster-snapshot
     *
     * @param sourceType <p>
     *            The event source to retrieve events for. If no value is
     *            specified, all events are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceType
     */
    public DescribeEventsRequest withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * The beginning of the time interval to retrieve events for, specified in
     * ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: 2009-07-08T18:00Z
     * </p>
     *
     * @return <p>
     *         The beginning of the time interval to retrieve events for,
     *         specified in ISO 8601 format. For more information about ISO
     *         8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a>
     *         </p>
     *         <p>
     *         Example: 2009-07-08T18:00Z
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The beginning of the time interval to retrieve events for, specified in
     * ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: 2009-07-08T18:00Z
     * </p>
     *
     * @param startTime <p>
     *            The beginning of the time interval to retrieve events for,
     *            specified in ISO 8601 format. For more information about ISO
     *            8601, go to the <a
     *            href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *            page.</a>
     *            </p>
     *            <p>
     *            Example: 2009-07-08T18:00Z
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The beginning of the time interval to retrieve events for, specified in
     * ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: 2009-07-08T18:00Z
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The beginning of the time interval to retrieve events for,
     *            specified in ISO 8601 format. For more information about ISO
     *            8601, go to the <a
     *            href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *            page.</a>
     *            </p>
     *            <p>
     *            Example: 2009-07-08T18:00Z
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The end of the time interval for which to retrieve events, specified in
     * ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: 2009-07-08T18:00Z
     * </p>
     *
     * @return <p>
     *         The end of the time interval for which to retrieve events,
     *         specified in ISO 8601 format. For more information about ISO
     *         8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a>
     *         </p>
     *         <p>
     *         Example: 2009-07-08T18:00Z
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The end of the time interval for which to retrieve events, specified in
     * ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: 2009-07-08T18:00Z
     * </p>
     *
     * @param endTime <p>
     *            The end of the time interval for which to retrieve events,
     *            specified in ISO 8601 format. For more information about ISO
     *            8601, go to the <a
     *            href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *            page.</a>
     *            </p>
     *            <p>
     *            Example: 2009-07-08T18:00Z
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time interval for which to retrieve events, specified in
     * ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: 2009-07-08T18:00Z
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The end of the time interval for which to retrieve events,
     *            specified in ISO 8601 format. For more information about ISO
     *            8601, go to the <a
     *            href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *            page.</a>
     *            </p>
     *            <p>
     *            Example: 2009-07-08T18:00Z
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The number of minutes to retrieve events for.
     * </p>
     * <p>
     * Default: 60
     * </p>
     *
     * @return <p>
     *         The number of minutes to retrieve events for.
     *         </p>
     *         <p>
     *         Default: 60
     *         </p>
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * <p>
     * The number of minutes to retrieve events for.
     * </p>
     * <p>
     * Default: 60
     * </p>
     *
     * @param duration <p>
     *            The number of minutes to retrieve events for.
     *            </p>
     *            <p>
     *            Default: 60
     *            </p>
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The number of minutes to retrieve events for.
     * </p>
     * <p>
     * Default: 60
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param duration <p>
     *            The number of minutes to retrieve events for.
     *            </p>
     *            <p>
     *            Default: 60
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * <p>
     * A list of event categories that trigger notifications for a event
     * notification subscription.
     * </p>
     *
     * @return <p>
     *         A list of event categories that trigger notifications for a event
     *         notification subscription.
     *         </p>
     */
    public java.util.List<String> getEventCategories() {
        return eventCategories;
    }

    /**
     * <p>
     * A list of event categories that trigger notifications for a event
     * notification subscription.
     * </p>
     *
     * @param eventCategories <p>
     *            A list of event categories that trigger notifications for a
     *            event notification subscription.
     *            </p>
     */
    public void setEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
            return;
        }

        this.eventCategories = new java.util.ArrayList<String>(eventCategories);
    }

    /**
     * <p>
     * A list of event categories that trigger notifications for a event
     * notification subscription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventCategories <p>
     *            A list of event categories that trigger notifications for a
     *            event notification subscription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withEventCategories(String... eventCategories) {
        if (getEventCategories() == null) {
            this.eventCategories = new java.util.ArrayList<String>(eventCategories.length);
        }
        for (String value : eventCategories) {
            this.eventCategories.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of event categories that trigger notifications for a event
     * notification subscription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventCategories <p>
     *            A list of event categories that trigger notifications for a
     *            event notification subscription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withEventCategories(java.util.Collection<String> eventCategories) {
        setEventCategories(eventCategories);
        return this;
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     *
     * @return <p>
     *         This parameter isn't currently supported.
     *         </p>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     *
     * @param filters <p>
     *            This parameter isn't currently supported.
     *            </p>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            This parameter isn't currently supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            This parameter isn't currently supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     *
     * @return <p>
     *         The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so
     *         that you can retrieve the remaining results.
     *         </p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: Minimum 20, maximum 100.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response. If
     *            more records exist than the specified <code>MaxRecords</code>
     *            value, a pagination token called a marker is included in the
     *            response so that you can retrieve the remaining results.
     *            </p>
     *            <p>
     *            Default: 100
     *            </p>
     *            <p>
     *            Constraints: Minimum 20, maximum 100.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response. If
     *            more records exist than the specified <code>MaxRecords</code>
     *            value, a pagination token called a marker is included in the
     *            response so that you can retrieve the remaining results.
     *            </p>
     *            <p>
     *            Default: 100
     *            </p>
     *            <p>
     *            Constraints: Minimum 20, maximum 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous DescribeEvents
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous
     *         DescribeEvents request. If this parameter is specified, the
     *         response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code>.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous DescribeEvents
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            DescribeEvents request. If this parameter is specified, the
     *            response includes only records beyond the marker, up to the
     *            value specified by <code>MaxRecords</code>.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous DescribeEvents
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            DescribeEvents request. If this parameter is specified, the
     *            response includes only records beyond the marker, up to the
     *            value specified by <code>MaxRecords</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getSourceIdentifier() != null)
            sb.append("SourceIdentifier: " + getSourceIdentifier() + ",");
        if (getSourceType() != null)
            sb.append("SourceType: " + getSourceType() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getEventCategories() != null)
            sb.append("EventCategories: " + getEventCategories() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceIdentifier() == null) ? 0 : getSourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode
                + ((getEventCategories() == null) ? 0 : getEventCategories().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventsRequest == false)
            return false;
        DescribeEventsRequest other = (DescribeEventsRequest) obj;

        if (other.getSourceIdentifier() == null ^ this.getSourceIdentifier() == null)
            return false;
        if (other.getSourceIdentifier() != null
                && other.getSourceIdentifier().equals(this.getSourceIdentifier()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null
                && other.getSourceType().equals(this.getSourceType()) == false)
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
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getEventCategories() == null ^ this.getEventCategories() == null)
            return false;
        if (other.getEventCategories() != null
                && other.getEventCategories().equals(this.getEventCategories()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
