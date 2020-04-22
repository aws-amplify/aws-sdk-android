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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns one or more snapshot objects, which contain metadata about your
 * cluster snapshots. By default, this operation returns information about all
 * snapshots of all clusters that are owned by you AWS customer account. No
 * information is returned for snapshots owned by inactive AWS customer
 * accounts.
 * </p>
 * <p>
 * If you specify both tag keys and tag values in the same request, Amazon
 * Redshift returns all snapshots that match any combination of the specified
 * keys and values. For example, if you have <code>owner</code> and
 * <code>environment</code> for tag keys, and <code>admin</code> and
 * <code>test</code> for tag values, all snapshots that have any combination of
 * those values are returned. Only snapshots that you own are returned in the
 * response; shared snapshots are not returned with the tag key and tag value
 * request parameters.
 * </p>
 * <p>
 * If both tag keys and values are omitted from the request, snapshots are
 * returned regardless of whether they have tag keys or values associated with
 * them.
 * </p>
 */
public class DescribeClusterSnapshotsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier of the cluster which generated the requested snapshots.
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * The snapshot identifier of the snapshot about which to return
     * information.
     * </p>
     */
    private String snapshotIdentifier;

    /**
     * <p>
     * The type of snapshots for which you are requesting information. By
     * default, snapshots of all types are returned.
     * </p>
     * <p>
     * Valid Values: <code>automated</code> | <code>manual</code>
     * </p>
     */
    private String snapshotType;

    /**
     * <p>
     * A value that requests only snapshots created at or after the specified
     * time. The time value is specified in ISO 8601 format. For more
     * information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2012-07-16T18:00:00Z</code>
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * A time value that requests only snapshots created at or before the
     * specified time. The time value is specified in ISO 8601 format. For more
     * information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2012-07-16T18:00:00Z</code>
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeClusterSnapshots</a> request exceed the value specified in
     * <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code>
     * field of the response. You can retrieve the next set of response records
     * by providing the returned marker value in the <code>Marker</code>
     * parameter and retrying the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Use this
     * field to filter the results to snapshots owned by a particular account.
     * To describe snapshots you own, either specify your AWS customer account,
     * or do not specify the parameter.
     * </p>
     */
    private String ownerAccount;

    /**
     * <p>
     * A tag key or keys for which you want to return all matching cluster
     * snapshots that are associated with the specified key or keys. For
     * example, suppose that you have snapshots that are tagged with keys called
     * <code>owner</code> and <code>environment</code>. If you specify both of
     * these tag keys in the request, Amazon Redshift returns a response with
     * the snapshots that have either or both of these tag keys associated with
     * them.
     * </p>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>
     * A tag value or values for which you want to return all matching cluster
     * snapshots that are associated with the specified tag value or values. For
     * example, suppose that you have snapshots that are tagged with values
     * called <code>admin</code> and <code>test</code>. If you specify both of
     * these tag values in the request, Amazon Redshift returns a response with
     * the snapshots that have either or both of these tag values associated
     * with them.
     * </p>
     */
    private java.util.List<String> tagValues;

    /**
     * <p>
     * A value that indicates whether to return snapshots only for an existing
     * cluster. You can perform table-level restore only by using a snapshot of
     * an existing cluster, that is, a cluster that has not been deleted. Values
     * for this parameter work as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ClusterExists</code> is set to <code>true</code>,
     * <code>ClusterIdentifier</code> is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>ClusterExists</code> is set to <code>false</code> and
     * <code>ClusterIdentifier</code> isn't specified, all snapshots associated
     * with deleted clusters (orphaned snapshots) are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>ClusterExists</code> is set to <code>false</code> and
     * <code>ClusterIdentifier</code> is specified for a deleted cluster,
     * snapshots associated with that cluster are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>ClusterExists</code> is set to <code>false</code> and
     * <code>ClusterIdentifier</code> is specified for an existing cluster, no
     * snapshots are returned.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean clusterExists;

    /**
     * <p/>
     */
    private java.util.List<SnapshotSortingEntity> sortingEntities;

    /**
     * <p>
     * The identifier of the cluster which generated the requested snapshots.
     * </p>
     *
     * @return <p>
     *         The identifier of the cluster which generated the requested
     *         snapshots.
     *         </p>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster which generated the requested snapshots.
     * </p>
     *
     * @param clusterIdentifier <p>
     *            The identifier of the cluster which generated the requested
     *            snapshots.
     *            </p>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster which generated the requested snapshots.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            The identifier of the cluster which generated the requested
     *            snapshots.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSnapshotsRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The snapshot identifier of the snapshot about which to return
     * information.
     * </p>
     *
     * @return <p>
     *         The snapshot identifier of the snapshot about which to return
     *         information.
     *         </p>
     */
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }

    /**
     * <p>
     * The snapshot identifier of the snapshot about which to return
     * information.
     * </p>
     *
     * @param snapshotIdentifier <p>
     *            The snapshot identifier of the snapshot about which to return
     *            information.
     *            </p>
     */
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The snapshot identifier of the snapshot about which to return
     * information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotIdentifier <p>
     *            The snapshot identifier of the snapshot about which to return
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSnapshotsRequest withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * The type of snapshots for which you are requesting information. By
     * default, snapshots of all types are returned.
     * </p>
     * <p>
     * Valid Values: <code>automated</code> | <code>manual</code>
     * </p>
     *
     * @return <p>
     *         The type of snapshots for which you are requesting information.
     *         By default, snapshots of all types are returned.
     *         </p>
     *         <p>
     *         Valid Values: <code>automated</code> | <code>manual</code>
     *         </p>
     */
    public String getSnapshotType() {
        return snapshotType;
    }

    /**
     * <p>
     * The type of snapshots for which you are requesting information. By
     * default, snapshots of all types are returned.
     * </p>
     * <p>
     * Valid Values: <code>automated</code> | <code>manual</code>
     * </p>
     *
     * @param snapshotType <p>
     *            The type of snapshots for which you are requesting
     *            information. By default, snapshots of all types are returned.
     *            </p>
     *            <p>
     *            Valid Values: <code>automated</code> | <code>manual</code>
     *            </p>
     */
    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * <p>
     * The type of snapshots for which you are requesting information. By
     * default, snapshots of all types are returned.
     * </p>
     * <p>
     * Valid Values: <code>automated</code> | <code>manual</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotType <p>
     *            The type of snapshots for which you are requesting
     *            information. By default, snapshots of all types are returned.
     *            </p>
     *            <p>
     *            Valid Values: <code>automated</code> | <code>manual</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSnapshotsRequest withSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }

    /**
     * <p>
     * A value that requests only snapshots created at or after the specified
     * time. The time value is specified in ISO 8601 format. For more
     * information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2012-07-16T18:00:00Z</code>
     * </p>
     *
     * @return <p>
     *         A value that requests only snapshots created at or after the
     *         specified time. The time value is specified in ISO 8601 format.
     *         For more information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a>
     *         </p>
     *         <p>
     *         Example: <code>2012-07-16T18:00:00Z</code>
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * A value that requests only snapshots created at or after the specified
     * time. The time value is specified in ISO 8601 format. For more
     * information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2012-07-16T18:00:00Z</code>
     * </p>
     *
     * @param startTime <p>
     *            A value that requests only snapshots created at or after the
     *            specified time. The time value is specified in ISO 8601
     *            format. For more information about ISO 8601, go to the <a
     *            href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *            page.</a>
     *            </p>
     *            <p>
     *            Example: <code>2012-07-16T18:00:00Z</code>
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A value that requests only snapshots created at or after the specified
     * time. The time value is specified in ISO 8601 format. For more
     * information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2012-07-16T18:00:00Z</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            A value that requests only snapshots created at or after the
     *            specified time. The time value is specified in ISO 8601
     *            format. For more information about ISO 8601, go to the <a
     *            href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *            page.</a>
     *            </p>
     *            <p>
     *            Example: <code>2012-07-16T18:00:00Z</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSnapshotsRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * A time value that requests only snapshots created at or before the
     * specified time. The time value is specified in ISO 8601 format. For more
     * information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2012-07-16T18:00:00Z</code>
     * </p>
     *
     * @return <p>
     *         A time value that requests only snapshots created at or before
     *         the specified time. The time value is specified in ISO 8601
     *         format. For more information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a>
     *         </p>
     *         <p>
     *         Example: <code>2012-07-16T18:00:00Z</code>
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * A time value that requests only snapshots created at or before the
     * specified time. The time value is specified in ISO 8601 format. For more
     * information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2012-07-16T18:00:00Z</code>
     * </p>
     *
     * @param endTime <p>
     *            A time value that requests only snapshots created at or before
     *            the specified time. The time value is specified in ISO 8601
     *            format. For more information about ISO 8601, go to the <a
     *            href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *            page.</a>
     *            </p>
     *            <p>
     *            Example: <code>2012-07-16T18:00:00Z</code>
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * A time value that requests only snapshots created at or before the
     * specified time. The time value is specified in ISO 8601 format. For more
     * information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2012-07-16T18:00:00Z</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            A time value that requests only snapshots created at or before
     *            the specified time. The time value is specified in ISO 8601
     *            format. For more information about ISO 8601, go to the <a
     *            href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *            page.</a>
     *            </p>
     *            <p>
     *            Example: <code>2012-07-16T18:00:00Z</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSnapshotsRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     *
     * @return <p>
     *         The maximum number of response records to return in each call. If
     *         the number of remaining response records exceeds the specified
     *         <code>MaxRecords</code> value, a value is returned in a
     *         <code>marker</code> field of the response. You can retrieve the
     *         next set of records by retrying the command with the returned
     *         marker value.
     *         </p>
     *         <p>
     *         Default: <code>100</code>
     *         </p>
     *         <p>
     *         Constraints: minimum 20, maximum 100.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number of response records to return in each call.
     *            If the number of remaining response records exceeds the
     *            specified <code>MaxRecords</code> value, a value is returned
     *            in a <code>marker</code> field of the response. You can
     *            retrieve the next set of records by retrying the command with
     *            the returned marker value.
     *            </p>
     *            <p>
     *            Default: <code>100</code>
     *            </p>
     *            <p>
     *            Constraints: minimum 20, maximum 100.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number of response records to return in each call.
     *            If the number of remaining response records exceeds the
     *            specified <code>MaxRecords</code> value, a value is returned
     *            in a <code>marker</code> field of the response. You can
     *            retrieve the next set of records by retrying the command with
     *            the returned marker value.
     *            </p>
     *            <p>
     *            Default: <code>100</code>
     *            </p>
     *            <p>
     *            Constraints: minimum 20, maximum 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSnapshotsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeClusterSnapshots</a> request exceed the value specified in
     * <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code>
     * field of the response. You can retrieve the next set of response records
     * by providing the returned marker value in the <code>Marker</code>
     * parameter and retrying the request.
     * </p>
     *
     * @return <p>
     *         An optional parameter that specifies the starting point to return
     *         a set of response records. When the results of a
     *         <a>DescribeClusterSnapshots</a> request exceed the value
     *         specified in <code>MaxRecords</code>, AWS returns a value in the
     *         <code>Marker</code> field of the response. You can retrieve the
     *         next set of response records by providing the returned marker
     *         value in the <code>Marker</code> parameter and retrying the
     *         request.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeClusterSnapshots</a> request exceed the value specified in
     * <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code>
     * field of the response. You can retrieve the next set of response records
     * by providing the returned marker value in the <code>Marker</code>
     * parameter and retrying the request.
     * </p>
     *
     * @param marker <p>
     *            An optional parameter that specifies the starting point to
     *            return a set of response records. When the results of a
     *            <a>DescribeClusterSnapshots</a> request exceed the value
     *            specified in <code>MaxRecords</code>, AWS returns a value in
     *            the <code>Marker</code> field of the response. You can
     *            retrieve the next set of response records by providing the
     *            returned marker value in the <code>Marker</code> parameter and
     *            retrying the request.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeClusterSnapshots</a> request exceed the value specified in
     * <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code>
     * field of the response. You can retrieve the next set of response records
     * by providing the returned marker value in the <code>Marker</code>
     * parameter and retrying the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional parameter that specifies the starting point to
     *            return a set of response records. When the results of a
     *            <a>DescribeClusterSnapshots</a> request exceed the value
     *            specified in <code>MaxRecords</code>, AWS returns a value in
     *            the <code>Marker</code> field of the response. You can
     *            retrieve the next set of response records by providing the
     *            returned marker value in the <code>Marker</code> parameter and
     *            retrying the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSnapshotsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Use this
     * field to filter the results to snapshots owned by a particular account.
     * To describe snapshots you own, either specify your AWS customer account,
     * or do not specify the parameter.
     * </p>
     *
     * @return <p>
     *         The AWS customer account used to create or copy the snapshot. Use
     *         this field to filter the results to snapshots owned by a
     *         particular account. To describe snapshots you own, either specify
     *         your AWS customer account, or do not specify the parameter.
     *         </p>
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }

    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Use this
     * field to filter the results to snapshots owned by a particular account.
     * To describe snapshots you own, either specify your AWS customer account,
     * or do not specify the parameter.
     * </p>
     *
     * @param ownerAccount <p>
     *            The AWS customer account used to create or copy the snapshot.
     *            Use this field to filter the results to snapshots owned by a
     *            particular account. To describe snapshots you own, either
     *            specify your AWS customer account, or do not specify the
     *            parameter.
     *            </p>
     */
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Use this
     * field to filter the results to snapshots owned by a particular account.
     * To describe snapshots you own, either specify your AWS customer account,
     * or do not specify the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerAccount <p>
     *            The AWS customer account used to create or copy the snapshot.
     *            Use this field to filter the results to snapshots owned by a
     *            particular account. To describe snapshots you own, either
     *            specify your AWS customer account, or do not specify the
     *            parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSnapshotsRequest withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching cluster
     * snapshots that are associated with the specified key or keys. For
     * example, suppose that you have snapshots that are tagged with keys called
     * <code>owner</code> and <code>environment</code>. If you specify both of
     * these tag keys in the request, Amazon Redshift returns a response with
     * the snapshots that have either or both of these tag keys associated with
     * them.
     * </p>
     *
     * @return <p>
     *         A tag key or keys for which you want to return all matching
     *         cluster snapshots that are associated with the specified key or
     *         keys. For example, suppose that you have snapshots that are
     *         tagged with keys called <code>owner</code> and
     *         <code>environment</code>. If you specify both of these tag keys
     *         in the request, Amazon Redshift returns a response with the
     *         snapshots that have either or both of these tag keys associated
     *         with them.
     *         </p>
     */
    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching cluster
     * snapshots that are associated with the specified key or keys. For
     * example, suppose that you have snapshots that are tagged with keys called
     * <code>owner</code> and <code>environment</code>. If you specify both of
     * these tag keys in the request, Amazon Redshift returns a response with
     * the snapshots that have either or both of these tag keys associated with
     * them.
     * </p>
     *
     * @param tagKeys <p>
     *            A tag key or keys for which you want to return all matching
     *            cluster snapshots that are associated with the specified key
     *            or keys. For example, suppose that you have snapshots that are
     *            tagged with keys called <code>owner</code> and
     *            <code>environment</code>. If you specify both of these tag
     *            keys in the request, Amazon Redshift returns a response with
     *            the snapshots that have either or both of these tag keys
     *            associated with them.
     *            </p>
     */
    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new java.util.ArrayList<String>(tagKeys);
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching cluster
     * snapshots that are associated with the specified key or keys. For
     * example, suppose that you have snapshots that are tagged with keys called
     * <code>owner</code> and <code>environment</code>. If you specify both of
     * these tag keys in the request, Amazon Redshift returns a response with
     * the snapshots that have either or both of these tag keys associated with
     * them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            A tag key or keys for which you want to return all matching
     *            cluster snapshots that are associated with the specified key
     *            or keys. For example, suppose that you have snapshots that are
     *            tagged with keys called <code>owner</code> and
     *            <code>environment</code>. If you specify both of these tag
     *            keys in the request, Amazon Redshift returns a response with
     *            the snapshots that have either or both of these tag keys
     *            associated with them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSnapshotsRequest withTagKeys(String... tagKeys) {
        if (getTagKeys() == null) {
            this.tagKeys = new java.util.ArrayList<String>(tagKeys.length);
        }
        for (String value : tagKeys) {
            this.tagKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching cluster
     * snapshots that are associated with the specified key or keys. For
     * example, suppose that you have snapshots that are tagged with keys called
     * <code>owner</code> and <code>environment</code>. If you specify both of
     * these tag keys in the request, Amazon Redshift returns a response with
     * the snapshots that have either or both of these tag keys associated with
     * them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            A tag key or keys for which you want to return all matching
     *            cluster snapshots that are associated with the specified key
     *            or keys. For example, suppose that you have snapshots that are
     *            tagged with keys called <code>owner</code> and
     *            <code>environment</code>. If you specify both of these tag
     *            keys in the request, Amazon Redshift returns a response with
     *            the snapshots that have either or both of these tag keys
     *            associated with them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSnapshotsRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
        return this;
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching cluster
     * snapshots that are associated with the specified tag value or values. For
     * example, suppose that you have snapshots that are tagged with values
     * called <code>admin</code> and <code>test</code>. If you specify both of
     * these tag values in the request, Amazon Redshift returns a response with
     * the snapshots that have either or both of these tag values associated
     * with them.
     * </p>
     *
     * @return <p>
     *         A tag value or values for which you want to return all matching
     *         cluster snapshots that are associated with the specified tag
     *         value or values. For example, suppose that you have snapshots
     *         that are tagged with values called <code>admin</code> and
     *         <code>test</code>. If you specify both of these tag values in the
     *         request, Amazon Redshift returns a response with the snapshots
     *         that have either or both of these tag values associated with
     *         them.
     *         </p>
     */
    public java.util.List<String> getTagValues() {
        return tagValues;
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching cluster
     * snapshots that are associated with the specified tag value or values. For
     * example, suppose that you have snapshots that are tagged with values
     * called <code>admin</code> and <code>test</code>. If you specify both of
     * these tag values in the request, Amazon Redshift returns a response with
     * the snapshots that have either or both of these tag values associated
     * with them.
     * </p>
     *
     * @param tagValues <p>
     *            A tag value or values for which you want to return all
     *            matching cluster snapshots that are associated with the
     *            specified tag value or values. For example, suppose that you
     *            have snapshots that are tagged with values called
     *            <code>admin</code> and <code>test</code>. If you specify both
     *            of these tag values in the request, Amazon Redshift returns a
     *            response with the snapshots that have either or both of these
     *            tag values associated with them.
     *            </p>
     */
    public void setTagValues(java.util.Collection<String> tagValues) {
        if (tagValues == null) {
            this.tagValues = null;
            return;
        }

        this.tagValues = new java.util.ArrayList<String>(tagValues);
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching cluster
     * snapshots that are associated with the specified tag value or values. For
     * example, suppose that you have snapshots that are tagged with values
     * called <code>admin</code> and <code>test</code>. If you specify both of
     * these tag values in the request, Amazon Redshift returns a response with
     * the snapshots that have either or both of these tag values associated
     * with them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagValues <p>
     *            A tag value or values for which you want to return all
     *            matching cluster snapshots that are associated with the
     *            specified tag value or values. For example, suppose that you
     *            have snapshots that are tagged with values called
     *            <code>admin</code> and <code>test</code>. If you specify both
     *            of these tag values in the request, Amazon Redshift returns a
     *            response with the snapshots that have either or both of these
     *            tag values associated with them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSnapshotsRequest withTagValues(String... tagValues) {
        if (getTagValues() == null) {
            this.tagValues = new java.util.ArrayList<String>(tagValues.length);
        }
        for (String value : tagValues) {
            this.tagValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching cluster
     * snapshots that are associated with the specified tag value or values. For
     * example, suppose that you have snapshots that are tagged with values
     * called <code>admin</code> and <code>test</code>. If you specify both of
     * these tag values in the request, Amazon Redshift returns a response with
     * the snapshots that have either or both of these tag values associated
     * with them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagValues <p>
     *            A tag value or values for which you want to return all
     *            matching cluster snapshots that are associated with the
     *            specified tag value or values. For example, suppose that you
     *            have snapshots that are tagged with values called
     *            <code>admin</code> and <code>test</code>. If you specify both
     *            of these tag values in the request, Amazon Redshift returns a
     *            response with the snapshots that have either or both of these
     *            tag values associated with them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSnapshotsRequest withTagValues(java.util.Collection<String> tagValues) {
        setTagValues(tagValues);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to return snapshots only for an existing
     * cluster. You can perform table-level restore only by using a snapshot of
     * an existing cluster, that is, a cluster that has not been deleted. Values
     * for this parameter work as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ClusterExists</code> is set to <code>true</code>,
     * <code>ClusterIdentifier</code> is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>ClusterExists</code> is set to <code>false</code> and
     * <code>ClusterIdentifier</code> isn't specified, all snapshots associated
     * with deleted clusters (orphaned snapshots) are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>ClusterExists</code> is set to <code>false</code> and
     * <code>ClusterIdentifier</code> is specified for a deleted cluster,
     * snapshots associated with that cluster are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>ClusterExists</code> is set to <code>false</code> and
     * <code>ClusterIdentifier</code> is specified for an existing cluster, no
     * snapshots are returned.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A value that indicates whether to return snapshots only for an
     *         existing cluster. You can perform table-level restore only by
     *         using a snapshot of an existing cluster, that is, a cluster that
     *         has not been deleted. Values for this parameter work as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>ClusterExists</code> is set to <code>true</code>,
     *         <code>ClusterIdentifier</code> is required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>ClusterExists</code> is set to <code>false</code> and
     *         <code>ClusterIdentifier</code> isn't specified, all snapshots
     *         associated with deleted clusters (orphaned snapshots) are
     *         returned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>ClusterExists</code> is set to <code>false</code> and
     *         <code>ClusterIdentifier</code> is specified for a deleted
     *         cluster, snapshots associated with that cluster are returned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>ClusterExists</code> is set to <code>false</code> and
     *         <code>ClusterIdentifier</code> is specified for an existing
     *         cluster, no snapshots are returned.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean isClusterExists() {
        return clusterExists;
    }

    /**
     * <p>
     * A value that indicates whether to return snapshots only for an existing
     * cluster. You can perform table-level restore only by using a snapshot of
     * an existing cluster, that is, a cluster that has not been deleted. Values
     * for this parameter work as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ClusterExists</code> is set to <code>true</code>,
     * <code>ClusterIdentifier</code> is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>ClusterExists</code> is set to <code>false</code> and
     * <code>ClusterIdentifier</code> isn't specified, all snapshots associated
     * with deleted clusters (orphaned snapshots) are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>ClusterExists</code> is set to <code>false</code> and
     * <code>ClusterIdentifier</code> is specified for a deleted cluster,
     * snapshots associated with that cluster are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>ClusterExists</code> is set to <code>false</code> and
     * <code>ClusterIdentifier</code> is specified for an existing cluster, no
     * snapshots are returned.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A value that indicates whether to return snapshots only for an
     *         existing cluster. You can perform table-level restore only by
     *         using a snapshot of an existing cluster, that is, a cluster that
     *         has not been deleted. Values for this parameter work as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>ClusterExists</code> is set to <code>true</code>,
     *         <code>ClusterIdentifier</code> is required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>ClusterExists</code> is set to <code>false</code> and
     *         <code>ClusterIdentifier</code> isn't specified, all snapshots
     *         associated with deleted clusters (orphaned snapshots) are
     *         returned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>ClusterExists</code> is set to <code>false</code> and
     *         <code>ClusterIdentifier</code> is specified for a deleted
     *         cluster, snapshots associated with that cluster are returned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>ClusterExists</code> is set to <code>false</code> and
     *         <code>ClusterIdentifier</code> is specified for an existing
     *         cluster, no snapshots are returned.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean getClusterExists() {
        return clusterExists;
    }

    /**
     * <p>
     * A value that indicates whether to return snapshots only for an existing
     * cluster. You can perform table-level restore only by using a snapshot of
     * an existing cluster, that is, a cluster that has not been deleted. Values
     * for this parameter work as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ClusterExists</code> is set to <code>true</code>,
     * <code>ClusterIdentifier</code> is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>ClusterExists</code> is set to <code>false</code> and
     * <code>ClusterIdentifier</code> isn't specified, all snapshots associated
     * with deleted clusters (orphaned snapshots) are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>ClusterExists</code> is set to <code>false</code> and
     * <code>ClusterIdentifier</code> is specified for a deleted cluster,
     * snapshots associated with that cluster are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>ClusterExists</code> is set to <code>false</code> and
     * <code>ClusterIdentifier</code> is specified for an existing cluster, no
     * snapshots are returned.
     * </p>
     * </li>
     * </ul>
     *
     * @param clusterExists <p>
     *            A value that indicates whether to return snapshots only for an
     *            existing cluster. You can perform table-level restore only by
     *            using a snapshot of an existing cluster, that is, a cluster
     *            that has not been deleted. Values for this parameter work as
     *            follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>ClusterExists</code> is set to <code>true</code>,
     *            <code>ClusterIdentifier</code> is required.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>ClusterExists</code> is set to <code>false</code> and
     *            <code>ClusterIdentifier</code> isn't specified, all snapshots
     *            associated with deleted clusters (orphaned snapshots) are
     *            returned.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>ClusterExists</code> is set to <code>false</code> and
     *            <code>ClusterIdentifier</code> is specified for a deleted
     *            cluster, snapshots associated with that cluster are returned.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>ClusterExists</code> is set to <code>false</code> and
     *            <code>ClusterIdentifier</code> is specified for an existing
     *            cluster, no snapshots are returned.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setClusterExists(Boolean clusterExists) {
        this.clusterExists = clusterExists;
    }

    /**
     * <p>
     * A value that indicates whether to return snapshots only for an existing
     * cluster. You can perform table-level restore only by using a snapshot of
     * an existing cluster, that is, a cluster that has not been deleted. Values
     * for this parameter work as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ClusterExists</code> is set to <code>true</code>,
     * <code>ClusterIdentifier</code> is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>ClusterExists</code> is set to <code>false</code> and
     * <code>ClusterIdentifier</code> isn't specified, all snapshots associated
     * with deleted clusters (orphaned snapshots) are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>ClusterExists</code> is set to <code>false</code> and
     * <code>ClusterIdentifier</code> is specified for a deleted cluster,
     * snapshots associated with that cluster are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>ClusterExists</code> is set to <code>false</code> and
     * <code>ClusterIdentifier</code> is specified for an existing cluster, no
     * snapshots are returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterExists <p>
     *            A value that indicates whether to return snapshots only for an
     *            existing cluster. You can perform table-level restore only by
     *            using a snapshot of an existing cluster, that is, a cluster
     *            that has not been deleted. Values for this parameter work as
     *            follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>ClusterExists</code> is set to <code>true</code>,
     *            <code>ClusterIdentifier</code> is required.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>ClusterExists</code> is set to <code>false</code> and
     *            <code>ClusterIdentifier</code> isn't specified, all snapshots
     *            associated with deleted clusters (orphaned snapshots) are
     *            returned.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>ClusterExists</code> is set to <code>false</code> and
     *            <code>ClusterIdentifier</code> is specified for a deleted
     *            cluster, snapshots associated with that cluster are returned.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>ClusterExists</code> is set to <code>false</code> and
     *            <code>ClusterIdentifier</code> is specified for an existing
     *            cluster, no snapshots are returned.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSnapshotsRequest withClusterExists(Boolean clusterExists) {
        this.clusterExists = clusterExists;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public java.util.List<SnapshotSortingEntity> getSortingEntities() {
        return sortingEntities;
    }

    /**
     * <p/>
     *
     * @param sortingEntities <p/>
     */
    public void setSortingEntities(java.util.Collection<SnapshotSortingEntity> sortingEntities) {
        if (sortingEntities == null) {
            this.sortingEntities = null;
            return;
        }

        this.sortingEntities = new java.util.ArrayList<SnapshotSortingEntity>(sortingEntities);
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sortingEntities <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSnapshotsRequest withSortingEntities(
            SnapshotSortingEntity... sortingEntities) {
        if (getSortingEntities() == null) {
            this.sortingEntities = new java.util.ArrayList<SnapshotSortingEntity>(
                    sortingEntities.length);
        }
        for (SnapshotSortingEntity value : sortingEntities) {
            this.sortingEntities.add(value);
        }
        return this;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sortingEntities <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSnapshotsRequest withSortingEntities(
            java.util.Collection<SnapshotSortingEntity> sortingEntities) {
        setSortingEntities(sortingEntities);
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: " + getSnapshotIdentifier() + ",");
        if (getSnapshotType() != null)
            sb.append("SnapshotType: " + getSnapshotType() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: " + getOwnerAccount() + ",");
        if (getTagKeys() != null)
            sb.append("TagKeys: " + getTagKeys() + ",");
        if (getTagValues() != null)
            sb.append("TagValues: " + getTagValues() + ",");
        if (getClusterExists() != null)
            sb.append("ClusterExists: " + getClusterExists() + ",");
        if (getSortingEntities() != null)
            sb.append("SortingEntities: " + getSortingEntities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotType() == null) ? 0 : getSnapshotType().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        hashCode = prime * hashCode + ((getTagValues() == null) ? 0 : getTagValues().hashCode());
        hashCode = prime * hashCode
                + ((getClusterExists() == null) ? 0 : getClusterExists().hashCode());
        hashCode = prime * hashCode
                + ((getSortingEntities() == null) ? 0 : getSortingEntities().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClusterSnapshotsRequest == false)
            return false;
        DescribeClusterSnapshotsRequest other = (DescribeClusterSnapshotsRequest) obj;

        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null
                && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false)
            return false;
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null)
            return false;
        if (other.getSnapshotType() != null
                && other.getSnapshotType().equals(this.getSnapshotType()) == false)
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
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null
                && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        if (other.getTagValues() == null ^ this.getTagValues() == null)
            return false;
        if (other.getTagValues() != null
                && other.getTagValues().equals(this.getTagValues()) == false)
            return false;
        if (other.getClusterExists() == null ^ this.getClusterExists() == null)
            return false;
        if (other.getClusterExists() != null
                && other.getClusterExists().equals(this.getClusterExists()) == false)
            return false;
        if (other.getSortingEntities() == null ^ this.getSortingEntities() == null)
            return false;
        if (other.getSortingEntities() != null
                && other.getSortingEntities().equals(this.getSortingEntities()) == false)
            return false;
        return true;
    }
}
