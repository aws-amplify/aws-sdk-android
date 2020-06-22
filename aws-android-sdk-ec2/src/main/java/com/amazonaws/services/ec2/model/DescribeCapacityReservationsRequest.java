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
 * Describes one or more of your Capacity Reservations. The results describe
 * only the Capacity Reservations in the AWS Region that you're currently using.
 * </p>
 */
public class DescribeCapacityReservationsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     */
    private java.util.List<String> capacityReservationIds;

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * returned nextToken value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance for which the Capacity
     * Reservation reserves capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the Capacity
     * Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The Availability Zone ID of the
     * Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-platform</code> - The type of operating system for which
     * the Capacity Reservation reserves capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone ID of the Capacity
     * Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - Indicates the tenancy of the Capacity Reservation.
     * A Capacity Reservation can have one of the following tenancy settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code> - The Capacity Reservation is created on hardware
     * that is shared with other AWS accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dedicated</code> - The Capacity Reservation is created on
     * single-tenant hardware that is dedicated to a single AWS account.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The current state of the Capacity Reservation. A
     * Capacity Reservation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code>- The Capacity Reservation is active and the capacity
     * is available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation expired automatically at
     * the date and time specified in your request. The reserved capacity is no
     * longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation was manually cancelled.
     * The reserved capacity is no longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The Capacity Reservation request was successful
     * but the capacity provisioning is still pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation request has failed. A
     * request might fail due to invalid request parameters, capacity
     * constraints, or instance limit constraints. Failed requests are retained
     * for 60 minutes.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>end-date</code> - The date and time at which the Capacity
     * Reservation expires. When a Capacity Reservation expires, the reserved
     * capacity is released and you can no longer launch instances into it. The
     * Capacity Reservation's state changes to expired when it reaches its end
     * date and time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end-date-type</code> - Indicates the way in which the Capacity
     * Reservation ends. A Capacity Reservation can have one of the following
     * end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until
     * you explicitly cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at
     * a specified date and time.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>instance-match-criteria</code> - Indicates the type of instance
     * launches that the Capacity Reservation accepts. The options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The Capacity Reservation accepts all instances that
     * have matching attributes (instance type, platform, and Availability
     * Zone). Instances that have matching attributes launch into the Capacity
     * Reservation automatically without specifying any additional parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targeted</code> - The Capacity Reservation only accepts instances
     * that have matching attributes (instance type, platform, and Availability
     * Zone), and explicitly target the Capacity Reservation. This ensures that
     * only permitted instances can use the reserved capacity.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

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
     * The ID of the Capacity Reservation.
     * </p>
     *
     * @return <p>
     *         The ID of the Capacity Reservation.
     *         </p>
     */
    public java.util.List<String> getCapacityReservationIds() {
        return capacityReservationIds;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     *
     * @param capacityReservationIds <p>
     *            The ID of the Capacity Reservation.
     *            </p>
     */
    public void setCapacityReservationIds(java.util.Collection<String> capacityReservationIds) {
        if (capacityReservationIds == null) {
            this.capacityReservationIds = null;
            return;
        }

        this.capacityReservationIds = new java.util.ArrayList<String>(capacityReservationIds);
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityReservationIds <p>
     *            The ID of the Capacity Reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCapacityReservationsRequest withCapacityReservationIds(
            String... capacityReservationIds) {
        if (getCapacityReservationIds() == null) {
            this.capacityReservationIds = new java.util.ArrayList<String>(
                    capacityReservationIds.length);
        }
        for (String value : capacityReservationIds) {
            this.capacityReservationIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityReservationIds <p>
     *            The ID of the Capacity Reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCapacityReservationsRequest withCapacityReservationIds(
            java.util.Collection<String> capacityReservationIds) {
        setCapacityReservationIds(capacityReservationIds);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     *
     * @return <p>
     *         The token to retrieve the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to retrieve the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to retrieve the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCapacityReservationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * returned nextToken value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The maximum number of results to return for the request in a
     *         single page. The remaining results can be seen by sending another
     *         request with the returned nextToken value.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * returned nextToken value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return for the request in a
     *            single page. The remaining results can be seen by sending
     *            another request with the returned nextToken value.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * returned nextToken value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return for the request in a
     *            single page. The remaining results can be seen by sending
     *            another request with the returned nextToken value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCapacityReservationsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance for which the Capacity
     * Reservation reserves capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the Capacity
     * Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The Availability Zone ID of the
     * Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-platform</code> - The type of operating system for which
     * the Capacity Reservation reserves capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone ID of the Capacity
     * Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - Indicates the tenancy of the Capacity Reservation.
     * A Capacity Reservation can have one of the following tenancy settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code> - The Capacity Reservation is created on hardware
     * that is shared with other AWS accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dedicated</code> - The Capacity Reservation is created on
     * single-tenant hardware that is dedicated to a single AWS account.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The current state of the Capacity Reservation. A
     * Capacity Reservation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code>- The Capacity Reservation is active and the capacity
     * is available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation expired automatically at
     * the date and time specified in your request. The reserved capacity is no
     * longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation was manually cancelled.
     * The reserved capacity is no longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The Capacity Reservation request was successful
     * but the capacity provisioning is still pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation request has failed. A
     * request might fail due to invalid request parameters, capacity
     * constraints, or instance limit constraints. Failed requests are retained
     * for 60 minutes.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>end-date</code> - The date and time at which the Capacity
     * Reservation expires. When a Capacity Reservation expires, the reserved
     * capacity is released and you can no longer launch instances into it. The
     * Capacity Reservation's state changes to expired when it reaches its end
     * date and time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end-date-type</code> - Indicates the way in which the Capacity
     * Reservation ends. A Capacity Reservation can have one of the following
     * end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until
     * you explicitly cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at
     * a specified date and time.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>instance-match-criteria</code> - Indicates the type of instance
     * launches that the Capacity Reservation accepts. The options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The Capacity Reservation accepts all instances that
     * have matching attributes (instance type, platform, and Availability
     * Zone). Instances that have matching attributes launch into the Capacity
     * Reservation automatically without specifying any additional parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targeted</code> - The Capacity Reservation only accepts instances
     * that have matching attributes (instance type, platform, and Availability
     * Zone), and explicitly target the Capacity Reservation. This ensures that
     * only permitted instances can use the reserved capacity.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @return <p>
     *         One or more filters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>instance-type</code> - The type of instance for which the
     *         Capacity Reservation reserves capacity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The ID of the AWS account that owns the
     *         Capacity Reservation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>availability-zone-id</code> - The Availability Zone ID of
     *         the Capacity Reservation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-platform</code> - The type of operating system for
     *         which the Capacity Reservation reserves capacity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone ID of the
     *         Capacity Reservation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tenancy</code> - Indicates the tenancy of the Capacity
     *         Reservation. A Capacity Reservation can have one of the following
     *         tenancy settings:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>default</code> - The Capacity Reservation is created on
     *         hardware that is shared with other AWS accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dedicated</code> - The Capacity Reservation is created on
     *         single-tenant hardware that is dedicated to a single AWS account.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The current state of the Capacity
     *         Reservation. A Capacity Reservation can be in one of the
     *         following states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>active</code>- The Capacity Reservation is active and the
     *         capacity is available for your use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>expired</code> - The Capacity Reservation expired
     *         automatically at the date and time specified in your request. The
     *         reserved capacity is no longer available for your use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cancelled</code> - The Capacity Reservation was manually
     *         cancelled. The reserved capacity is no longer available for your
     *         use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code> - The Capacity Reservation request was
     *         successful but the capacity provisioning is still pending.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>failed</code> - The Capacity Reservation request has
     *         failed. A request might fail due to invalid request parameters,
     *         capacity constraints, or instance limit constraints. Failed
     *         requests are retained for 60 minutes.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>end-date</code> - The date and time at which the Capacity
     *         Reservation expires. When a Capacity Reservation expires, the
     *         reserved capacity is released and you can no longer launch
     *         instances into it. The Capacity Reservation's state changes to
     *         expired when it reaches its end date and time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>end-date-type</code> - Indicates the way in which the
     *         Capacity Reservation ends. A Capacity Reservation can have one of
     *         the following end types:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>unlimited</code> - The Capacity Reservation remains active
     *         until you explicitly cancel it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>limited</code> - The Capacity Reservation expires
     *         automatically at a specified date and time.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-match-criteria</code> - Indicates the type of
     *         instance launches that the Capacity Reservation accepts. The
     *         options include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>open</code> - The Capacity Reservation accepts all
     *         instances that have matching attributes (instance type, platform,
     *         and Availability Zone). Instances that have matching attributes
     *         launch into the Capacity Reservation automatically without
     *         specifying any additional parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>targeted</code> - The Capacity Reservation only accepts
     *         instances that have matching attributes (instance type, platform,
     *         and Availability Zone), and explicitly target the Capacity
     *         Reservation. This ensures that only permitted instances can use
     *         the reserved capacity.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance for which the Capacity
     * Reservation reserves capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the Capacity
     * Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The Availability Zone ID of the
     * Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-platform</code> - The type of operating system for which
     * the Capacity Reservation reserves capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone ID of the Capacity
     * Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - Indicates the tenancy of the Capacity Reservation.
     * A Capacity Reservation can have one of the following tenancy settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code> - The Capacity Reservation is created on hardware
     * that is shared with other AWS accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dedicated</code> - The Capacity Reservation is created on
     * single-tenant hardware that is dedicated to a single AWS account.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The current state of the Capacity Reservation. A
     * Capacity Reservation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code>- The Capacity Reservation is active and the capacity
     * is available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation expired automatically at
     * the date and time specified in your request. The reserved capacity is no
     * longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation was manually cancelled.
     * The reserved capacity is no longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The Capacity Reservation request was successful
     * but the capacity provisioning is still pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation request has failed. A
     * request might fail due to invalid request parameters, capacity
     * constraints, or instance limit constraints. Failed requests are retained
     * for 60 minutes.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>end-date</code> - The date and time at which the Capacity
     * Reservation expires. When a Capacity Reservation expires, the reserved
     * capacity is released and you can no longer launch instances into it. The
     * Capacity Reservation's state changes to expired when it reaches its end
     * date and time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end-date-type</code> - Indicates the way in which the Capacity
     * Reservation ends. A Capacity Reservation can have one of the following
     * end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until
     * you explicitly cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at
     * a specified date and time.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>instance-match-criteria</code> - Indicates the type of instance
     * launches that the Capacity Reservation accepts. The options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The Capacity Reservation accepts all instances that
     * have matching attributes (instance type, platform, and Availability
     * Zone). Instances that have matching attributes launch into the Capacity
     * Reservation automatically without specifying any additional parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targeted</code> - The Capacity Reservation only accepts instances
     * that have matching attributes (instance type, platform, and Availability
     * Zone), and explicitly target the Capacity Reservation. This ensures that
     * only permitted instances can use the reserved capacity.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @param filters <p>
     *            One or more filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>instance-type</code> - The type of instance for which
     *            the Capacity Reservation reserves capacity.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The ID of the AWS account that owns
     *            the Capacity Reservation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone-id</code> - The Availability Zone ID
     *            of the Capacity Reservation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-platform</code> - The type of operating system
     *            for which the Capacity Reservation reserves capacity.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone ID of
     *            the Capacity Reservation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tenancy</code> - Indicates the tenancy of the Capacity
     *            Reservation. A Capacity Reservation can have one of the
     *            following tenancy settings:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>default</code> - The Capacity Reservation is created on
     *            hardware that is shared with other AWS accounts.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dedicated</code> - The Capacity Reservation is created
     *            on single-tenant hardware that is dedicated to a single AWS
     *            account.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The current state of the Capacity
     *            Reservation. A Capacity Reservation can be in one of the
     *            following states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>active</code>- The Capacity Reservation is active and
     *            the capacity is available for your use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>expired</code> - The Capacity Reservation expired
     *            automatically at the date and time specified in your request.
     *            The reserved capacity is no longer available for your use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>cancelled</code> - The Capacity Reservation was manually
     *            cancelled. The reserved capacity is no longer available for
     *            your use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code> - The Capacity Reservation request was
     *            successful but the capacity provisioning is still pending.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>failed</code> - The Capacity Reservation request has
     *            failed. A request might fail due to invalid request
     *            parameters, capacity constraints, or instance limit
     *            constraints. Failed requests are retained for 60 minutes.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>end-date</code> - The date and time at which the
     *            Capacity Reservation expires. When a Capacity Reservation
     *            expires, the reserved capacity is released and you can no
     *            longer launch instances into it. The Capacity Reservation's
     *            state changes to expired when it reaches its end date and
     *            time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>end-date-type</code> - Indicates the way in which the
     *            Capacity Reservation ends. A Capacity Reservation can have one
     *            of the following end types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>unlimited</code> - The Capacity Reservation remains
     *            active until you explicitly cancel it.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>limited</code> - The Capacity Reservation expires
     *            automatically at a specified date and time.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-match-criteria</code> - Indicates the type of
     *            instance launches that the Capacity Reservation accepts. The
     *            options include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>open</code> - The Capacity Reservation accepts all
     *            instances that have matching attributes (instance type,
     *            platform, and Availability Zone). Instances that have matching
     *            attributes launch into the Capacity Reservation automatically
     *            without specifying any additional parameters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>targeted</code> - The Capacity Reservation only accepts
     *            instances that have matching attributes (instance type,
     *            platform, and Availability Zone), and explicitly target the
     *            Capacity Reservation. This ensures that only permitted
     *            instances can use the reserved capacity.
     *            </p>
     *            </li>
     *            </ul>
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
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance for which the Capacity
     * Reservation reserves capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the Capacity
     * Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The Availability Zone ID of the
     * Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-platform</code> - The type of operating system for which
     * the Capacity Reservation reserves capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone ID of the Capacity
     * Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - Indicates the tenancy of the Capacity Reservation.
     * A Capacity Reservation can have one of the following tenancy settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code> - The Capacity Reservation is created on hardware
     * that is shared with other AWS accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dedicated</code> - The Capacity Reservation is created on
     * single-tenant hardware that is dedicated to a single AWS account.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The current state of the Capacity Reservation. A
     * Capacity Reservation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code>- The Capacity Reservation is active and the capacity
     * is available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation expired automatically at
     * the date and time specified in your request. The reserved capacity is no
     * longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation was manually cancelled.
     * The reserved capacity is no longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The Capacity Reservation request was successful
     * but the capacity provisioning is still pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation request has failed. A
     * request might fail due to invalid request parameters, capacity
     * constraints, or instance limit constraints. Failed requests are retained
     * for 60 minutes.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>end-date</code> - The date and time at which the Capacity
     * Reservation expires. When a Capacity Reservation expires, the reserved
     * capacity is released and you can no longer launch instances into it. The
     * Capacity Reservation's state changes to expired when it reaches its end
     * date and time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end-date-type</code> - Indicates the way in which the Capacity
     * Reservation ends. A Capacity Reservation can have one of the following
     * end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until
     * you explicitly cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at
     * a specified date and time.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>instance-match-criteria</code> - Indicates the type of instance
     * launches that the Capacity Reservation accepts. The options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The Capacity Reservation accepts all instances that
     * have matching attributes (instance type, platform, and Availability
     * Zone). Instances that have matching attributes launch into the Capacity
     * Reservation automatically without specifying any additional parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targeted</code> - The Capacity Reservation only accepts instances
     * that have matching attributes (instance type, platform, and Availability
     * Zone), and explicitly target the Capacity Reservation. This ensures that
     * only permitted instances can use the reserved capacity.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>instance-type</code> - The type of instance for which
     *            the Capacity Reservation reserves capacity.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The ID of the AWS account that owns
     *            the Capacity Reservation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone-id</code> - The Availability Zone ID
     *            of the Capacity Reservation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-platform</code> - The type of operating system
     *            for which the Capacity Reservation reserves capacity.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone ID of
     *            the Capacity Reservation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tenancy</code> - Indicates the tenancy of the Capacity
     *            Reservation. A Capacity Reservation can have one of the
     *            following tenancy settings:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>default</code> - The Capacity Reservation is created on
     *            hardware that is shared with other AWS accounts.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dedicated</code> - The Capacity Reservation is created
     *            on single-tenant hardware that is dedicated to a single AWS
     *            account.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The current state of the Capacity
     *            Reservation. A Capacity Reservation can be in one of the
     *            following states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>active</code>- The Capacity Reservation is active and
     *            the capacity is available for your use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>expired</code> - The Capacity Reservation expired
     *            automatically at the date and time specified in your request.
     *            The reserved capacity is no longer available for your use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>cancelled</code> - The Capacity Reservation was manually
     *            cancelled. The reserved capacity is no longer available for
     *            your use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code> - The Capacity Reservation request was
     *            successful but the capacity provisioning is still pending.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>failed</code> - The Capacity Reservation request has
     *            failed. A request might fail due to invalid request
     *            parameters, capacity constraints, or instance limit
     *            constraints. Failed requests are retained for 60 minutes.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>end-date</code> - The date and time at which the
     *            Capacity Reservation expires. When a Capacity Reservation
     *            expires, the reserved capacity is released and you can no
     *            longer launch instances into it. The Capacity Reservation's
     *            state changes to expired when it reaches its end date and
     *            time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>end-date-type</code> - Indicates the way in which the
     *            Capacity Reservation ends. A Capacity Reservation can have one
     *            of the following end types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>unlimited</code> - The Capacity Reservation remains
     *            active until you explicitly cancel it.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>limited</code> - The Capacity Reservation expires
     *            automatically at a specified date and time.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-match-criteria</code> - Indicates the type of
     *            instance launches that the Capacity Reservation accepts. The
     *            options include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>open</code> - The Capacity Reservation accepts all
     *            instances that have matching attributes (instance type,
     *            platform, and Availability Zone). Instances that have matching
     *            attributes launch into the Capacity Reservation automatically
     *            without specifying any additional parameters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>targeted</code> - The Capacity Reservation only accepts
     *            instances that have matching attributes (instance type,
     *            platform, and Availability Zone), and explicitly target the
     *            Capacity Reservation. This ensures that only permitted
     *            instances can use the reserved capacity.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCapacityReservationsRequest withFilters(Filter... filters) {
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
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance for which the Capacity
     * Reservation reserves capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the Capacity
     * Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The Availability Zone ID of the
     * Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-platform</code> - The type of operating system for which
     * the Capacity Reservation reserves capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone ID of the Capacity
     * Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - Indicates the tenancy of the Capacity Reservation.
     * A Capacity Reservation can have one of the following tenancy settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code> - The Capacity Reservation is created on hardware
     * that is shared with other AWS accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dedicated</code> - The Capacity Reservation is created on
     * single-tenant hardware that is dedicated to a single AWS account.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The current state of the Capacity Reservation. A
     * Capacity Reservation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code>- The Capacity Reservation is active and the capacity
     * is available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation expired automatically at
     * the date and time specified in your request. The reserved capacity is no
     * longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation was manually cancelled.
     * The reserved capacity is no longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The Capacity Reservation request was successful
     * but the capacity provisioning is still pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation request has failed. A
     * request might fail due to invalid request parameters, capacity
     * constraints, or instance limit constraints. Failed requests are retained
     * for 60 minutes.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>end-date</code> - The date and time at which the Capacity
     * Reservation expires. When a Capacity Reservation expires, the reserved
     * capacity is released and you can no longer launch instances into it. The
     * Capacity Reservation's state changes to expired when it reaches its end
     * date and time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end-date-type</code> - Indicates the way in which the Capacity
     * Reservation ends. A Capacity Reservation can have one of the following
     * end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until
     * you explicitly cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at
     * a specified date and time.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>instance-match-criteria</code> - Indicates the type of instance
     * launches that the Capacity Reservation accepts. The options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The Capacity Reservation accepts all instances that
     * have matching attributes (instance type, platform, and Availability
     * Zone). Instances that have matching attributes launch into the Capacity
     * Reservation automatically without specifying any additional parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targeted</code> - The Capacity Reservation only accepts instances
     * that have matching attributes (instance type, platform, and Availability
     * Zone), and explicitly target the Capacity Reservation. This ensures that
     * only permitted instances can use the reserved capacity.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>instance-type</code> - The type of instance for which
     *            the Capacity Reservation reserves capacity.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The ID of the AWS account that owns
     *            the Capacity Reservation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone-id</code> - The Availability Zone ID
     *            of the Capacity Reservation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-platform</code> - The type of operating system
     *            for which the Capacity Reservation reserves capacity.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone ID of
     *            the Capacity Reservation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tenancy</code> - Indicates the tenancy of the Capacity
     *            Reservation. A Capacity Reservation can have one of the
     *            following tenancy settings:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>default</code> - The Capacity Reservation is created on
     *            hardware that is shared with other AWS accounts.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dedicated</code> - The Capacity Reservation is created
     *            on single-tenant hardware that is dedicated to a single AWS
     *            account.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The current state of the Capacity
     *            Reservation. A Capacity Reservation can be in one of the
     *            following states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>active</code>- The Capacity Reservation is active and
     *            the capacity is available for your use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>expired</code> - The Capacity Reservation expired
     *            automatically at the date and time specified in your request.
     *            The reserved capacity is no longer available for your use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>cancelled</code> - The Capacity Reservation was manually
     *            cancelled. The reserved capacity is no longer available for
     *            your use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code> - The Capacity Reservation request was
     *            successful but the capacity provisioning is still pending.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>failed</code> - The Capacity Reservation request has
     *            failed. A request might fail due to invalid request
     *            parameters, capacity constraints, or instance limit
     *            constraints. Failed requests are retained for 60 minutes.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>end-date</code> - The date and time at which the
     *            Capacity Reservation expires. When a Capacity Reservation
     *            expires, the reserved capacity is released and you can no
     *            longer launch instances into it. The Capacity Reservation's
     *            state changes to expired when it reaches its end date and
     *            time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>end-date-type</code> - Indicates the way in which the
     *            Capacity Reservation ends. A Capacity Reservation can have one
     *            of the following end types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>unlimited</code> - The Capacity Reservation remains
     *            active until you explicitly cancel it.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>limited</code> - The Capacity Reservation expires
     *            automatically at a specified date and time.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-match-criteria</code> - Indicates the type of
     *            instance launches that the Capacity Reservation accepts. The
     *            options include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>open</code> - The Capacity Reservation accepts all
     *            instances that have matching attributes (instance type,
     *            platform, and Availability Zone). Instances that have matching
     *            attributes launch into the Capacity Reservation automatically
     *            without specifying any additional parameters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>targeted</code> - The Capacity Reservation only accepts
     *            instances that have matching attributes (instance type,
     *            platform, and Availability Zone), and explicitly target the
     *            Capacity Reservation. This ensures that only permitted
     *            instances can use the reserved capacity.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCapacityReservationsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
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
    public DescribeCapacityReservationsRequest withDryRun(Boolean dryRun) {
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
        if (getCapacityReservationIds() != null)
            sb.append("CapacityReservationIds: " + getCapacityReservationIds() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCapacityReservationIds() == null) ? 0 : getCapacityReservationIds()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCapacityReservationsRequest == false)
            return false;
        DescribeCapacityReservationsRequest other = (DescribeCapacityReservationsRequest) obj;

        if (other.getCapacityReservationIds() == null ^ this.getCapacityReservationIds() == null)
            return false;
        if (other.getCapacityReservationIds() != null
                && other.getCapacityReservationIds().equals(this.getCapacityReservationIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
