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

public class GetCapacityReservationUsageResult implements Serializable {
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     */
    private String capacityReservationId;

    /**
     * <p>
     * The type of instance for which the Capacity Reservation reserves
     * capacity.
     * </p>
     */
    private String instanceType;

    /**
     * <p>
     * The number of instances for which the Capacity Reservation reserves
     * capacity.
     * </p>
     */
    private Integer totalInstanceCount;

    /**
     * <p>
     * The remaining capacity. Indicates the number of instances that can be
     * launched in the Capacity Reservation.
     * </p>
     */
    private Integer availableInstanceCount;

    /**
     * <p>
     * The current state of the Capacity Reservation. A Capacity Reservation can
     * be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Capacity Reservation is active and the capacity
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, expired, cancelled, pending, failed
     */
    private String state;

    /**
     * <p>
     * Information about the Capacity Reservation usage.
     * </p>
     */
    private java.util.List<InstanceUsage> instanceUsages;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results. This value
     *         is <code>null</code> when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCapacityReservationUsageResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     *
     * @return <p>
     *         The ID of the Capacity Reservation.
     *         </p>
     */
    public String getCapacityReservationId() {
        return capacityReservationId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     *
     * @param capacityReservationId <p>
     *            The ID of the Capacity Reservation.
     *            </p>
     */
    public void setCapacityReservationId(String capacityReservationId) {
        this.capacityReservationId = capacityReservationId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityReservationId <p>
     *            The ID of the Capacity Reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCapacityReservationUsageResult withCapacityReservationId(String capacityReservationId) {
        this.capacityReservationId = capacityReservationId;
        return this;
    }

    /**
     * <p>
     * The type of instance for which the Capacity Reservation reserves
     * capacity.
     * </p>
     *
     * @return <p>
     *         The type of instance for which the Capacity Reservation reserves
     *         capacity.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The type of instance for which the Capacity Reservation reserves
     * capacity.
     * </p>
     *
     * @param instanceType <p>
     *            The type of instance for which the Capacity Reservation
     *            reserves capacity.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of instance for which the Capacity Reservation reserves
     * capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceType <p>
     *            The type of instance for which the Capacity Reservation
     *            reserves capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCapacityReservationUsageResult withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The number of instances for which the Capacity Reservation reserves
     * capacity.
     * </p>
     *
     * @return <p>
     *         The number of instances for which the Capacity Reservation
     *         reserves capacity.
     *         </p>
     */
    public Integer getTotalInstanceCount() {
        return totalInstanceCount;
    }

    /**
     * <p>
     * The number of instances for which the Capacity Reservation reserves
     * capacity.
     * </p>
     *
     * @param totalInstanceCount <p>
     *            The number of instances for which the Capacity Reservation
     *            reserves capacity.
     *            </p>
     */
    public void setTotalInstanceCount(Integer totalInstanceCount) {
        this.totalInstanceCount = totalInstanceCount;
    }

    /**
     * <p>
     * The number of instances for which the Capacity Reservation reserves
     * capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalInstanceCount <p>
     *            The number of instances for which the Capacity Reservation
     *            reserves capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCapacityReservationUsageResult withTotalInstanceCount(Integer totalInstanceCount) {
        this.totalInstanceCount = totalInstanceCount;
        return this;
    }

    /**
     * <p>
     * The remaining capacity. Indicates the number of instances that can be
     * launched in the Capacity Reservation.
     * </p>
     *
     * @return <p>
     *         The remaining capacity. Indicates the number of instances that
     *         can be launched in the Capacity Reservation.
     *         </p>
     */
    public Integer getAvailableInstanceCount() {
        return availableInstanceCount;
    }

    /**
     * <p>
     * The remaining capacity. Indicates the number of instances that can be
     * launched in the Capacity Reservation.
     * </p>
     *
     * @param availableInstanceCount <p>
     *            The remaining capacity. Indicates the number of instances that
     *            can be launched in the Capacity Reservation.
     *            </p>
     */
    public void setAvailableInstanceCount(Integer availableInstanceCount) {
        this.availableInstanceCount = availableInstanceCount;
    }

    /**
     * <p>
     * The remaining capacity. Indicates the number of instances that can be
     * launched in the Capacity Reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availableInstanceCount <p>
     *            The remaining capacity. Indicates the number of instances that
     *            can be launched in the Capacity Reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCapacityReservationUsageResult withAvailableInstanceCount(
            Integer availableInstanceCount) {
        this.availableInstanceCount = availableInstanceCount;
        return this;
    }

    /**
     * <p>
     * The current state of the Capacity Reservation. A Capacity Reservation can
     * be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Capacity Reservation is active and the capacity
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, expired, cancelled, pending, failed
     *
     * @return <p>
     *         The current state of the Capacity Reservation. A Capacity
     *         Reservation can be in one of the following states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>active</code> - The Capacity Reservation is active and the
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
     * @see CapacityReservationState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current state of the Capacity Reservation. A Capacity Reservation can
     * be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Capacity Reservation is active and the capacity
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, expired, cancelled, pending, failed
     *
     * @param state <p>
     *            The current state of the Capacity Reservation. A Capacity
     *            Reservation can be in one of the following states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>active</code> - The Capacity Reservation is active and
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
     * @see CapacityReservationState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the Capacity Reservation. A Capacity Reservation can
     * be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Capacity Reservation is active and the capacity
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
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, expired, cancelled, pending, failed
     *
     * @param state <p>
     *            The current state of the Capacity Reservation. A Capacity
     *            Reservation can be in one of the following states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>active</code> - The Capacity Reservation is active and
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CapacityReservationState
     */
    public GetCapacityReservationUsageResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The current state of the Capacity Reservation. A Capacity Reservation can
     * be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Capacity Reservation is active and the capacity
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, expired, cancelled, pending, failed
     *
     * @param state <p>
     *            The current state of the Capacity Reservation. A Capacity
     *            Reservation can be in one of the following states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>active</code> - The Capacity Reservation is active and
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
     * @see CapacityReservationState
     */
    public void setState(CapacityReservationState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current state of the Capacity Reservation. A Capacity Reservation can
     * be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Capacity Reservation is active and the capacity
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
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, expired, cancelled, pending, failed
     *
     * @param state <p>
     *            The current state of the Capacity Reservation. A Capacity
     *            Reservation can be in one of the following states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>active</code> - The Capacity Reservation is active and
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CapacityReservationState
     */
    public GetCapacityReservationUsageResult withState(CapacityReservationState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Information about the Capacity Reservation usage.
     * </p>
     *
     * @return <p>
     *         Information about the Capacity Reservation usage.
     *         </p>
     */
    public java.util.List<InstanceUsage> getInstanceUsages() {
        return instanceUsages;
    }

    /**
     * <p>
     * Information about the Capacity Reservation usage.
     * </p>
     *
     * @param instanceUsages <p>
     *            Information about the Capacity Reservation usage.
     *            </p>
     */
    public void setInstanceUsages(java.util.Collection<InstanceUsage> instanceUsages) {
        if (instanceUsages == null) {
            this.instanceUsages = null;
            return;
        }

        this.instanceUsages = new java.util.ArrayList<InstanceUsage>(instanceUsages);
    }

    /**
     * <p>
     * Information about the Capacity Reservation usage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceUsages <p>
     *            Information about the Capacity Reservation usage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCapacityReservationUsageResult withInstanceUsages(InstanceUsage... instanceUsages) {
        if (getInstanceUsages() == null) {
            this.instanceUsages = new java.util.ArrayList<InstanceUsage>(instanceUsages.length);
        }
        for (InstanceUsage value : instanceUsages) {
            this.instanceUsages.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Capacity Reservation usage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceUsages <p>
     *            Information about the Capacity Reservation usage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCapacityReservationUsageResult withInstanceUsages(
            java.util.Collection<InstanceUsage> instanceUsages) {
        setInstanceUsages(instanceUsages);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getCapacityReservationId() != null)
            sb.append("CapacityReservationId: " + getCapacityReservationId() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getTotalInstanceCount() != null)
            sb.append("TotalInstanceCount: " + getTotalInstanceCount() + ",");
        if (getAvailableInstanceCount() != null)
            sb.append("AvailableInstanceCount: " + getAvailableInstanceCount() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getInstanceUsages() != null)
            sb.append("InstanceUsages: " + getInstanceUsages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getCapacityReservationId() == null) ? 0 : getCapacityReservationId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getTotalInstanceCount() == null) ? 0 : getTotalInstanceCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getAvailableInstanceCount() == null) ? 0 : getAvailableInstanceCount()
                        .hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceUsages() == null) ? 0 : getInstanceUsages().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCapacityReservationUsageResult == false)
            return false;
        GetCapacityReservationUsageResult other = (GetCapacityReservationUsageResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getCapacityReservationId() == null ^ this.getCapacityReservationId() == null)
            return false;
        if (other.getCapacityReservationId() != null
                && other.getCapacityReservationId().equals(this.getCapacityReservationId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getTotalInstanceCount() == null ^ this.getTotalInstanceCount() == null)
            return false;
        if (other.getTotalInstanceCount() != null
                && other.getTotalInstanceCount().equals(this.getTotalInstanceCount()) == false)
            return false;
        if (other.getAvailableInstanceCount() == null ^ this.getAvailableInstanceCount() == null)
            return false;
        if (other.getAvailableInstanceCount() != null
                && other.getAvailableInstanceCount().equals(this.getAvailableInstanceCount()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getInstanceUsages() == null ^ this.getInstanceUsages() == null)
            return false;
        if (other.getInstanceUsages() != null
                && other.getInstanceUsages().equals(this.getInstanceUsages()) == false)
            return false;
        return true;
    }
}
