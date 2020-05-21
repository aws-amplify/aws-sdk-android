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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the status of the specified volumes. Volume status provides the
 * result of the checks performed on your volumes to determine events that can
 * impair the performance of your volumes. The performance of a volume can be
 * affected if an issue occurs on the volume's underlying host. If the volume's
 * underlying host experiences a power outage or system issue, after the system
 * is restored, there could be data inconsistencies on the volume. Volume events
 * notify you if this occurs. Volume actions notify you if any action needs to
 * be taken in response to the event.
 * </p>
 * <p>
 * The <code>DescribeVolumeStatus</code> operation provides the following
 * information about the specified volumes:
 * </p>
 * <p>
 * <i>Status</i>: Reflects the current status of the volume. The possible values
 * are <code>ok</code>, <code>impaired</code> , <code>warning</code>, or
 * <code>insufficient-data</code>. If all checks pass, the overall status of the
 * volume is <code>ok</code>. If the check fails, the overall status is
 * <code>impaired</code>. If the status is <code>insufficient-data</code>, then
 * the checks may still be taking place on your volume at the time. We recommend
 * that you retry the request. For more information about volume status, see <a
 * href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-volume-status.html"
 * >Monitoring the Status of Your Volumes</a> in the <i>Amazon Elastic Compute
 * Cloud User Guide</i>.
 * </p>
 * <p>
 * <i>Events</i>: Reflect the cause of a volume status and may require you to
 * take action. For example, if your volume returns an <code>impaired</code>
 * status, then the volume event might be
 * <code>potential-data-inconsistency</code>. This means that your volume has
 * been affected by an issue with the underlying host, has all I/O operations
 * disabled, and may have inconsistent data.
 * </p>
 * <p>
 * <i>Actions</i>: Reflect the actions you may have to take in response to an
 * event. For example, if the status of the volume is <code>impaired</code> and
 * the volume event shows <code>potential-data-inconsistency</code>, then the
 * action shows <code>enable-volume-io</code>. This means that you may want to
 * enable the I/O operations for the volume by calling the <a>EnableVolumeIO</a>
 * action and then check the volume for data consistency.
 * </p>
 * <p>
 * Volume status is based on the volume status checks, and does not reflect the
 * volume state. Therefore, volume status does not indicate volumes in the
 * <code>error</code> state (for example, when a volume is incapable of
 * accepting I/O.)
 * </p>
 */
public class DescribeVolumeStatusRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>action.code</code> - The action code for the event (for example,
     * <code>enable-volume-io</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>action.description</code> - A description of the action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>action.event-id</code> - The event ID associated with the action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.description</code> - A description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.event-id</code> - The event ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.event-type</code> - The event type (for
     * <code>io-enabled</code>: <code>passed</code> | <code>failed</code>; for
     * <code>io-performance</code>: <code>io-performance:degraded</code> |
     * <code>io-performance:severely-degraded</code> |
     * <code>io-performance:stalled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-after</code> - The latest end time for the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before</code> - The earliest start time for the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.details-name</code> - The cause for
     * <code>volume-status.status</code> (<code>io-enabled</code> |
     * <code>io-performance</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.details-status</code> - The status of
     * <code>volume-status.details-name</code> (for <code>io-enabled</code>:
     * <code>passed</code> | <code>failed</code>; for
     * <code>io-performance</code>: <code>normal</code> | <code>degraded</code>
     * | <code>severely-degraded</code> | <code>stalled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.status</code> - The status of the volume (
     * <code>ok</code> | <code>impaired</code> | <code>warning</code> |
     * <code>insufficient-data</code>).
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The maximum number of volume results returned by
     * <code>DescribeVolumeStatus</code> in paginated output. When this
     * parameter is used, the request only returns <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another request with the returned <code>NextToken</code> value.
     * This value can be between 5 and 1000; if <code>MaxResults</code> is given
     * a value larger than 1000, only 1000 results are returned. If this
     * parameter is not used, then <code>DescribeVolumeStatus</code> returns all
     * results. You cannot specify this parameter and the volume IDs parameter
     * in the same request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future
     * <code>DescribeVolumeStatus</code> request. When the results of the
     * request exceed <code>MaxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code> when
     * there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The IDs of the volumes.
     * </p>
     * <p>
     * Default: Describes all your volumes.
     * </p>
     */
    private java.util.List<String> volumeIds;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>action.code</code> - The action code for the event (for example,
     * <code>enable-volume-io</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>action.description</code> - A description of the action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>action.event-id</code> - The event ID associated with the action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.description</code> - A description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.event-id</code> - The event ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.event-type</code> - The event type (for
     * <code>io-enabled</code>: <code>passed</code> | <code>failed</code>; for
     * <code>io-performance</code>: <code>io-performance:degraded</code> |
     * <code>io-performance:severely-degraded</code> |
     * <code>io-performance:stalled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-after</code> - The latest end time for the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before</code> - The earliest start time for the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.details-name</code> - The cause for
     * <code>volume-status.status</code> (<code>io-enabled</code> |
     * <code>io-performance</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.details-status</code> - The status of
     * <code>volume-status.details-name</code> (for <code>io-enabled</code>:
     * <code>passed</code> | <code>failed</code>; for
     * <code>io-performance</code>: <code>normal</code> | <code>degraded</code>
     * | <code>severely-degraded</code> | <code>stalled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.status</code> - The status of the volume (
     * <code>ok</code> | <code>impaired</code> | <code>warning</code> |
     * <code>insufficient-data</code>).
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The filters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>action.code</code> - The action code for the event (for
     *         example, <code>enable-volume-io</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>action.description</code> - A description of the action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>action.event-id</code> - The event ID associated with the
     *         action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone of the
     *         instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.description</code> - A description of the event.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.event-id</code> - The event ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.event-type</code> - The event type (for
     *         <code>io-enabled</code>: <code>passed</code> |
     *         <code>failed</code>; for <code>io-performance</code>:
     *         <code>io-performance:degraded</code> |
     *         <code>io-performance:severely-degraded</code> |
     *         <code>io-performance:stalled</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.not-after</code> - The latest end time for the event.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.not-before</code> - The earliest start time for the
     *         event.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>volume-status.details-name</code> - The cause for
     *         <code>volume-status.status</code> (<code>io-enabled</code> |
     *         <code>io-performance</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>volume-status.details-status</code> - The status of
     *         <code>volume-status.details-name</code> (for
     *         <code>io-enabled</code>: <code>passed</code> |
     *         <code>failed</code>; for <code>io-performance</code>:
     *         <code>normal</code> | <code>degraded</code> |
     *         <code>severely-degraded</code> | <code>stalled</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>volume-status.status</code> - The status of the volume (
     *         <code>ok</code> | <code>impaired</code> | <code>warning</code> |
     *         <code>insufficient-data</code>).
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>action.code</code> - The action code for the event (for example,
     * <code>enable-volume-io</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>action.description</code> - A description of the action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>action.event-id</code> - The event ID associated with the action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.description</code> - A description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.event-id</code> - The event ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.event-type</code> - The event type (for
     * <code>io-enabled</code>: <code>passed</code> | <code>failed</code>; for
     * <code>io-performance</code>: <code>io-performance:degraded</code> |
     * <code>io-performance:severely-degraded</code> |
     * <code>io-performance:stalled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-after</code> - The latest end time for the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before</code> - The earliest start time for the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.details-name</code> - The cause for
     * <code>volume-status.status</code> (<code>io-enabled</code> |
     * <code>io-performance</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.details-status</code> - The status of
     * <code>volume-status.details-name</code> (for <code>io-enabled</code>:
     * <code>passed</code> | <code>failed</code>; for
     * <code>io-performance</code>: <code>normal</code> | <code>degraded</code>
     * | <code>severely-degraded</code> | <code>stalled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.status</code> - The status of the volume (
     * <code>ok</code> | <code>impaired</code> | <code>warning</code> |
     * <code>insufficient-data</code>).
     * </p>
     * </li>
     * </ul>
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>action.code</code> - The action code for the event (for
     *            example, <code>enable-volume-io</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>action.description</code> - A description of the action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>action.event-id</code> - The event ID associated with
     *            the action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone of the
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.description</code> - A description of the event.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.event-id</code> - The event ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.event-type</code> - The event type (for
     *            <code>io-enabled</code>: <code>passed</code> |
     *            <code>failed</code>; for <code>io-performance</code>:
     *            <code>io-performance:degraded</code> |
     *            <code>io-performance:severely-degraded</code> |
     *            <code>io-performance:stalled</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.not-after</code> - The latest end time for the
     *            event.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.not-before</code> - The earliest start time for
     *            the event.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>volume-status.details-name</code> - The cause for
     *            <code>volume-status.status</code> (<code>io-enabled</code> |
     *            <code>io-performance</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>volume-status.details-status</code> - The status of
     *            <code>volume-status.details-name</code> (for
     *            <code>io-enabled</code>: <code>passed</code> |
     *            <code>failed</code>; for <code>io-performance</code>:
     *            <code>normal</code> | <code>degraded</code> |
     *            <code>severely-degraded</code> | <code>stalled</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>volume-status.status</code> - The status of the volume (
     *            <code>ok</code> | <code>impaired</code> | <code>warning</code>
     *            | <code>insufficient-data</code>).
     *            </p>
     *            </li>
     *            </ul>
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>action.code</code> - The action code for the event (for example,
     * <code>enable-volume-io</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>action.description</code> - A description of the action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>action.event-id</code> - The event ID associated with the action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.description</code> - A description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.event-id</code> - The event ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.event-type</code> - The event type (for
     * <code>io-enabled</code>: <code>passed</code> | <code>failed</code>; for
     * <code>io-performance</code>: <code>io-performance:degraded</code> |
     * <code>io-performance:severely-degraded</code> |
     * <code>io-performance:stalled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-after</code> - The latest end time for the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before</code> - The earliest start time for the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.details-name</code> - The cause for
     * <code>volume-status.status</code> (<code>io-enabled</code> |
     * <code>io-performance</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.details-status</code> - The status of
     * <code>volume-status.details-name</code> (for <code>io-enabled</code>:
     * <code>passed</code> | <code>failed</code>; for
     * <code>io-performance</code>: <code>normal</code> | <code>degraded</code>
     * | <code>severely-degraded</code> | <code>stalled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.status</code> - The status of the volume (
     * <code>ok</code> | <code>impaired</code> | <code>warning</code> |
     * <code>insufficient-data</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>action.code</code> - The action code for the event (for
     *            example, <code>enable-volume-io</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>action.description</code> - A description of the action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>action.event-id</code> - The event ID associated with
     *            the action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone of the
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.description</code> - A description of the event.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.event-id</code> - The event ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.event-type</code> - The event type (for
     *            <code>io-enabled</code>: <code>passed</code> |
     *            <code>failed</code>; for <code>io-performance</code>:
     *            <code>io-performance:degraded</code> |
     *            <code>io-performance:severely-degraded</code> |
     *            <code>io-performance:stalled</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.not-after</code> - The latest end time for the
     *            event.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.not-before</code> - The earliest start time for
     *            the event.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>volume-status.details-name</code> - The cause for
     *            <code>volume-status.status</code> (<code>io-enabled</code> |
     *            <code>io-performance</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>volume-status.details-status</code> - The status of
     *            <code>volume-status.details-name</code> (for
     *            <code>io-enabled</code>: <code>passed</code> |
     *            <code>failed</code>; for <code>io-performance</code>:
     *            <code>normal</code> | <code>degraded</code> |
     *            <code>severely-degraded</code> | <code>stalled</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>volume-status.status</code> - The status of the volume (
     *            <code>ok</code> | <code>impaired</code> | <code>warning</code>
     *            | <code>insufficient-data</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumeStatusRequest withFilters(Filter... filters) {
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>action.code</code> - The action code for the event (for example,
     * <code>enable-volume-io</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>action.description</code> - A description of the action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>action.event-id</code> - The event ID associated with the action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.description</code> - A description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.event-id</code> - The event ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.event-type</code> - The event type (for
     * <code>io-enabled</code>: <code>passed</code> | <code>failed</code>; for
     * <code>io-performance</code>: <code>io-performance:degraded</code> |
     * <code>io-performance:severely-degraded</code> |
     * <code>io-performance:stalled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-after</code> - The latest end time for the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before</code> - The earliest start time for the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.details-name</code> - The cause for
     * <code>volume-status.status</code> (<code>io-enabled</code> |
     * <code>io-performance</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.details-status</code> - The status of
     * <code>volume-status.details-name</code> (for <code>io-enabled</code>:
     * <code>passed</code> | <code>failed</code>; for
     * <code>io-performance</code>: <code>normal</code> | <code>degraded</code>
     * | <code>severely-degraded</code> | <code>stalled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.status</code> - The status of the volume (
     * <code>ok</code> | <code>impaired</code> | <code>warning</code> |
     * <code>insufficient-data</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>action.code</code> - The action code for the event (for
     *            example, <code>enable-volume-io</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>action.description</code> - A description of the action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>action.event-id</code> - The event ID associated with
     *            the action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone of the
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.description</code> - A description of the event.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.event-id</code> - The event ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.event-type</code> - The event type (for
     *            <code>io-enabled</code>: <code>passed</code> |
     *            <code>failed</code>; for <code>io-performance</code>:
     *            <code>io-performance:degraded</code> |
     *            <code>io-performance:severely-degraded</code> |
     *            <code>io-performance:stalled</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.not-after</code> - The latest end time for the
     *            event.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.not-before</code> - The earliest start time for
     *            the event.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>volume-status.details-name</code> - The cause for
     *            <code>volume-status.status</code> (<code>io-enabled</code> |
     *            <code>io-performance</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>volume-status.details-status</code> - The status of
     *            <code>volume-status.details-name</code> (for
     *            <code>io-enabled</code>: <code>passed</code> |
     *            <code>failed</code>; for <code>io-performance</code>:
     *            <code>normal</code> | <code>degraded</code> |
     *            <code>severely-degraded</code> | <code>stalled</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>volume-status.status</code> - The status of the volume (
     *            <code>ok</code> | <code>impaired</code> | <code>warning</code>
     *            | <code>insufficient-data</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumeStatusRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of volume results returned by
     * <code>DescribeVolumeStatus</code> in paginated output. When this
     * parameter is used, the request only returns <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another request with the returned <code>NextToken</code> value.
     * This value can be between 5 and 1000; if <code>MaxResults</code> is given
     * a value larger than 1000, only 1000 results are returned. If this
     * parameter is not used, then <code>DescribeVolumeStatus</code> returns all
     * results. You cannot specify this parameter and the volume IDs parameter
     * in the same request.
     * </p>
     *
     * @return <p>
     *         The maximum number of volume results returned by
     *         <code>DescribeVolumeStatus</code> in paginated output. When this
     *         parameter is used, the request only returns
     *         <code>MaxResults</code> results in a single page along with a
     *         <code>NextToken</code> response element. The remaining results of
     *         the initial request can be seen by sending another request with
     *         the returned <code>NextToken</code> value. This value can be
     *         between 5 and 1000; if <code>MaxResults</code> is given a value
     *         larger than 1000, only 1000 results are returned. If this
     *         parameter is not used, then <code>DescribeVolumeStatus</code>
     *         returns all results. You cannot specify this parameter and the
     *         volume IDs parameter in the same request.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of volume results returned by
     * <code>DescribeVolumeStatus</code> in paginated output. When this
     * parameter is used, the request only returns <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another request with the returned <code>NextToken</code> value.
     * This value can be between 5 and 1000; if <code>MaxResults</code> is given
     * a value larger than 1000, only 1000 results are returned. If this
     * parameter is not used, then <code>DescribeVolumeStatus</code> returns all
     * results. You cannot specify this parameter and the volume IDs parameter
     * in the same request.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of volume results returned by
     *            <code>DescribeVolumeStatus</code> in paginated output. When
     *            this parameter is used, the request only returns
     *            <code>MaxResults</code> results in a single page along with a
     *            <code>NextToken</code> response element. The remaining results
     *            of the initial request can be seen by sending another request
     *            with the returned <code>NextToken</code> value. This value can
     *            be between 5 and 1000; if <code>MaxResults</code> is given a
     *            value larger than 1000, only 1000 results are returned. If
     *            this parameter is not used, then
     *            <code>DescribeVolumeStatus</code> returns all results. You
     *            cannot specify this parameter and the volume IDs parameter in
     *            the same request.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of volume results returned by
     * <code>DescribeVolumeStatus</code> in paginated output. When this
     * parameter is used, the request only returns <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another request with the returned <code>NextToken</code> value.
     * This value can be between 5 and 1000; if <code>MaxResults</code> is given
     * a value larger than 1000, only 1000 results are returned. If this
     * parameter is not used, then <code>DescribeVolumeStatus</code> returns all
     * results. You cannot specify this parameter and the volume IDs parameter
     * in the same request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of volume results returned by
     *            <code>DescribeVolumeStatus</code> in paginated output. When
     *            this parameter is used, the request only returns
     *            <code>MaxResults</code> results in a single page along with a
     *            <code>NextToken</code> response element. The remaining results
     *            of the initial request can be seen by sending another request
     *            with the returned <code>NextToken</code> value. This value can
     *            be between 5 and 1000; if <code>MaxResults</code> is given a
     *            value larger than 1000, only 1000 results are returned. If
     *            this parameter is not used, then
     *            <code>DescribeVolumeStatus</code> returns all results. You
     *            cannot specify this parameter and the volume IDs parameter in
     *            the same request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumeStatusRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future
     * <code>DescribeVolumeStatus</code> request. When the results of the
     * request exceed <code>MaxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code> when
     * there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The <code>NextToken</code> value to include in a future
     *         <code>DescribeVolumeStatus</code> request. When the results of
     *         the request exceed <code>MaxResults</code>, this value can be
     *         used to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future
     * <code>DescribeVolumeStatus</code> request. When the results of the
     * request exceed <code>MaxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code> when
     * there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The <code>NextToken</code> value to include in a future
     *            <code>DescribeVolumeStatus</code> request. When the results of
     *            the request exceed <code>MaxResults</code>, this value can be
     *            used to retrieve the next page of results. This value is
     *            <code>null</code> when there are no more results to return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future
     * <code>DescribeVolumeStatus</code> request. When the results of the
     * request exceed <code>MaxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code> when
     * there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>NextToken</code> value to include in a future
     *            <code>DescribeVolumeStatus</code> request. When the results of
     *            the request exceed <code>MaxResults</code>, this value can be
     *            used to retrieve the next page of results. This value is
     *            <code>null</code> when there are no more results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumeStatusRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The IDs of the volumes.
     * </p>
     * <p>
     * Default: Describes all your volumes.
     * </p>
     *
     * @return <p>
     *         The IDs of the volumes.
     *         </p>
     *         <p>
     *         Default: Describes all your volumes.
     *         </p>
     */
    public java.util.List<String> getVolumeIds() {
        return volumeIds;
    }

    /**
     * <p>
     * The IDs of the volumes.
     * </p>
     * <p>
     * Default: Describes all your volumes.
     * </p>
     *
     * @param volumeIds <p>
     *            The IDs of the volumes.
     *            </p>
     *            <p>
     *            Default: Describes all your volumes.
     *            </p>
     */
    public void setVolumeIds(java.util.Collection<String> volumeIds) {
        if (volumeIds == null) {
            this.volumeIds = null;
            return;
        }

        this.volumeIds = new java.util.ArrayList<String>(volumeIds);
    }

    /**
     * <p>
     * The IDs of the volumes.
     * </p>
     * <p>
     * Default: Describes all your volumes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeIds <p>
     *            The IDs of the volumes.
     *            </p>
     *            <p>
     *            Default: Describes all your volumes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumeStatusRequest withVolumeIds(String... volumeIds) {
        if (getVolumeIds() == null) {
            this.volumeIds = new java.util.ArrayList<String>(volumeIds.length);
        }
        for (String value : volumeIds) {
            this.volumeIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the volumes.
     * </p>
     * <p>
     * Default: Describes all your volumes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeIds <p>
     *            The IDs of the volumes.
     *            </p>
     *            <p>
     *            Default: Describes all your volumes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumeStatusRequest withVolumeIds(java.util.Collection<String> volumeIds) {
        setVolumeIds(volumeIds);
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumeStatusRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getVolumeIds() != null)
            sb.append("VolumeIds: " + getVolumeIds() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getVolumeIds() == null) ? 0 : getVolumeIds().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVolumeStatusRequest == false)
            return false;
        DescribeVolumeStatusRequest other = (DescribeVolumeStatusRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVolumeIds() == null ^ this.getVolumeIds() == null)
            return false;
        if (other.getVolumeIds() != null
                && other.getVolumeIds().equals(this.getVolumeIds()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
