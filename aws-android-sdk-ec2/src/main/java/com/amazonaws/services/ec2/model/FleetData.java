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

/**
 * <p>
 * Describes an EC2 Fleet.
 * </p>
 */
public class FleetData implements Serializable {
    /**
     * <p>
     * The progress of the EC2 Fleet. If there is an error, the status is
     * <code>error</code>. After all requests are placed, the status is
     * <code>pending_fulfillment</code>. If the size of the EC2 Fleet is equal
     * to or greater than its target capacity, the status is
     * <code>fulfilled</code>. If the size of the EC2 Fleet is decreased, the
     * status is <code>pending_termination</code> while instances are
     * terminating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>error, pending_fulfillment, pending_termination,
     * fulfilled
     */
    private String activityStatus;

    /**
     * <p>
     * The creation date and time of the EC2 Fleet.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     */
    private String fleetId;

    /**
     * <p>
     * The state of the EC2 Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, deleted, failed,
     * deleted_running, deleted_terminating, modifying
     */
    private String fleetState;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Maximum 64 ASCII characters
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Indicates whether running instances should be terminated if the target
     * capacity of the EC2 Fleet is decreased below the current size of the EC2
     * Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no-termination, termination
     */
    private String excessCapacityTerminationPolicy;

    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target
     * capacity.
     * </p>
     */
    private Double fulfilledCapacity;

    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target
     * On-Demand capacity.
     * </p>
     */
    private Double fulfilledOnDemandCapacity;

    /**
     * <p>
     * The launch template and overrides.
     * </p>
     */
    private java.util.List<FleetLaunchTemplateConfig> launchTemplateConfigs;

    /**
     * <p>
     * The number of units to request. You can choose to set the target capacity
     * in terms of instances or a performance characteristic that is important
     * to your application workload, such as vCPUs, memory, or I/O. If the
     * request type is <code>maintain</code>, you can specify a target capacity
     * of 0 and add capacity later.
     * </p>
     */
    private TargetCapacitySpecification targetCapacitySpecification;

    /**
     * <p>
     * Indicates whether running instances should be terminated when the EC2
     * Fleet expires.
     * </p>
     */
    private Boolean terminateInstancesWithExpiration;

    /**
     * <p>
     * The type of request. Indicates whether the EC2 Fleet only
     * <code>requests</code> the target capacity, or also attempts to
     * <code>maintain</code> it. If you request a certain target capacity, EC2
     * Fleet only places the required requests; it does not attempt to replenish
     * instances if capacity is diminished, and it does not submit requests in
     * alternative capacity pools if capacity is unavailable. To maintain a
     * certain target capacity, EC2 Fleet places the required requests to meet
     * this target capacity. It also automatically replenishes any interrupted
     * Spot Instances. Default: <code>maintain</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>request, maintain, instant
     */
    private String type;

    /**
     * <p>
     * The start date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The
     * default is to start fulfilling the request immediately.
     * </p>
     */
    private java.util.Date validFrom;

    /**
     * <p>
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this
     * point, no new instance requests are placed or able to fulfill the
     * request. The default end date is 7 days from the current date.
     * </p>
     */
    private java.util.Date validUntil;

    /**
     * <p>
     * Indicates whether EC2 Fleet should replace unhealthy instances.
     * </p>
     */
    private Boolean replaceUnhealthyInstances;

    /**
     * <p>
     * The configuration of Spot Instances in an EC2 Fleet.
     * </p>
     */
    private SpotOptions spotOptions;

    /**
     * <p>
     * The allocation strategy of On-Demand Instances in an EC2 Fleet.
     * </p>
     */
    private OnDemandOptions onDemandOptions;

    /**
     * <p>
     * The tags for an EC2 Fleet resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Information about the instances that could not be launched by the fleet.
     * Valid only when <b>Type</b> is set to <code>instant</code>.
     * </p>
     */
    private java.util.List<DescribeFleetError> errors;

    /**
     * <p>
     * Information about the instances that were launched by the fleet. Valid
     * only when <b>Type</b> is set to <code>instant</code>.
     * </p>
     */
    private java.util.List<DescribeFleetsInstances> instances;

    /**
     * <p>
     * The progress of the EC2 Fleet. If there is an error, the status is
     * <code>error</code>. After all requests are placed, the status is
     * <code>pending_fulfillment</code>. If the size of the EC2 Fleet is equal
     * to or greater than its target capacity, the status is
     * <code>fulfilled</code>. If the size of the EC2 Fleet is decreased, the
     * status is <code>pending_termination</code> while instances are
     * terminating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>error, pending_fulfillment, pending_termination,
     * fulfilled
     *
     * @return <p>
     *         The progress of the EC2 Fleet. If there is an error, the status
     *         is <code>error</code>. After all requests are placed, the status
     *         is <code>pending_fulfillment</code>. If the size of the EC2 Fleet
     *         is equal to or greater than its target capacity, the status is
     *         <code>fulfilled</code>. If the size of the EC2 Fleet is
     *         decreased, the status is <code>pending_termination</code> while
     *         instances are terminating.
     *         </p>
     * @see FleetActivityStatus
     */
    public String getActivityStatus() {
        return activityStatus;
    }

    /**
     * <p>
     * The progress of the EC2 Fleet. If there is an error, the status is
     * <code>error</code>. After all requests are placed, the status is
     * <code>pending_fulfillment</code>. If the size of the EC2 Fleet is equal
     * to or greater than its target capacity, the status is
     * <code>fulfilled</code>. If the size of the EC2 Fleet is decreased, the
     * status is <code>pending_termination</code> while instances are
     * terminating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>error, pending_fulfillment, pending_termination,
     * fulfilled
     *
     * @param activityStatus <p>
     *            The progress of the EC2 Fleet. If there is an error, the
     *            status is <code>error</code>. After all requests are placed,
     *            the status is <code>pending_fulfillment</code>. If the size of
     *            the EC2 Fleet is equal to or greater than its target capacity,
     *            the status is <code>fulfilled</code>. If the size of the EC2
     *            Fleet is decreased, the status is
     *            <code>pending_termination</code> while instances are
     *            terminating.
     *            </p>
     * @see FleetActivityStatus
     */
    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
    }

    /**
     * <p>
     * The progress of the EC2 Fleet. If there is an error, the status is
     * <code>error</code>. After all requests are placed, the status is
     * <code>pending_fulfillment</code>. If the size of the EC2 Fleet is equal
     * to or greater than its target capacity, the status is
     * <code>fulfilled</code>. If the size of the EC2 Fleet is decreased, the
     * status is <code>pending_termination</code> while instances are
     * terminating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>error, pending_fulfillment, pending_termination,
     * fulfilled
     *
     * @param activityStatus <p>
     *            The progress of the EC2 Fleet. If there is an error, the
     *            status is <code>error</code>. After all requests are placed,
     *            the status is <code>pending_fulfillment</code>. If the size of
     *            the EC2 Fleet is equal to or greater than its target capacity,
     *            the status is <code>fulfilled</code>. If the size of the EC2
     *            Fleet is decreased, the status is
     *            <code>pending_termination</code> while instances are
     *            terminating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetActivityStatus
     */
    public FleetData withActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
        return this;
    }

    /**
     * <p>
     * The progress of the EC2 Fleet. If there is an error, the status is
     * <code>error</code>. After all requests are placed, the status is
     * <code>pending_fulfillment</code>. If the size of the EC2 Fleet is equal
     * to or greater than its target capacity, the status is
     * <code>fulfilled</code>. If the size of the EC2 Fleet is decreased, the
     * status is <code>pending_termination</code> while instances are
     * terminating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>error, pending_fulfillment, pending_termination,
     * fulfilled
     *
     * @param activityStatus <p>
     *            The progress of the EC2 Fleet. If there is an error, the
     *            status is <code>error</code>. After all requests are placed,
     *            the status is <code>pending_fulfillment</code>. If the size of
     *            the EC2 Fleet is equal to or greater than its target capacity,
     *            the status is <code>fulfilled</code>. If the size of the EC2
     *            Fleet is decreased, the status is
     *            <code>pending_termination</code> while instances are
     *            terminating.
     *            </p>
     * @see FleetActivityStatus
     */
    public void setActivityStatus(FleetActivityStatus activityStatus) {
        this.activityStatus = activityStatus.toString();
    }

    /**
     * <p>
     * The progress of the EC2 Fleet. If there is an error, the status is
     * <code>error</code>. After all requests are placed, the status is
     * <code>pending_fulfillment</code>. If the size of the EC2 Fleet is equal
     * to or greater than its target capacity, the status is
     * <code>fulfilled</code>. If the size of the EC2 Fleet is decreased, the
     * status is <code>pending_termination</code> while instances are
     * terminating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>error, pending_fulfillment, pending_termination,
     * fulfilled
     *
     * @param activityStatus <p>
     *            The progress of the EC2 Fleet. If there is an error, the
     *            status is <code>error</code>. After all requests are placed,
     *            the status is <code>pending_fulfillment</code>. If the size of
     *            the EC2 Fleet is equal to or greater than its target capacity,
     *            the status is <code>fulfilled</code>. If the size of the EC2
     *            Fleet is decreased, the status is
     *            <code>pending_termination</code> while instances are
     *            terminating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetActivityStatus
     */
    public FleetData withActivityStatus(FleetActivityStatus activityStatus) {
        this.activityStatus = activityStatus.toString();
        return this;
    }

    /**
     * <p>
     * The creation date and time of the EC2 Fleet.
     * </p>
     *
     * @return <p>
     *         The creation date and time of the EC2 Fleet.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The creation date and time of the EC2 Fleet.
     * </p>
     *
     * @param createTime <p>
     *            The creation date and time of the EC2 Fleet.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The creation date and time of the EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The creation date and time of the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetData withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     *
     * @return <p>
     *         The ID of the EC2 Fleet.
     *         </p>
     */
    public String getFleetId() {
        return fleetId;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     *
     * @param fleetId <p>
     *            The ID of the EC2 Fleet.
     *            </p>
     */
    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fleetId <p>
     *            The ID of the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetData withFleetId(String fleetId) {
        this.fleetId = fleetId;
        return this;
    }

    /**
     * <p>
     * The state of the EC2 Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, deleted, failed,
     * deleted_running, deleted_terminating, modifying
     *
     * @return <p>
     *         The state of the EC2 Fleet.
     *         </p>
     * @see FleetStateCode
     */
    public String getFleetState() {
        return fleetState;
    }

    /**
     * <p>
     * The state of the EC2 Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, deleted, failed,
     * deleted_running, deleted_terminating, modifying
     *
     * @param fleetState <p>
     *            The state of the EC2 Fleet.
     *            </p>
     * @see FleetStateCode
     */
    public void setFleetState(String fleetState) {
        this.fleetState = fleetState;
    }

    /**
     * <p>
     * The state of the EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, deleted, failed,
     * deleted_running, deleted_terminating, modifying
     *
     * @param fleetState <p>
     *            The state of the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetStateCode
     */
    public FleetData withFleetState(String fleetState) {
        this.fleetState = fleetState;
        return this;
    }

    /**
     * <p>
     * The state of the EC2 Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, deleted, failed,
     * deleted_running, deleted_terminating, modifying
     *
     * @param fleetState <p>
     *            The state of the EC2 Fleet.
     *            </p>
     * @see FleetStateCode
     */
    public void setFleetState(FleetStateCode fleetState) {
        this.fleetState = fleetState.toString();
    }

    /**
     * <p>
     * The state of the EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, deleted, failed,
     * deleted_running, deleted_terminating, modifying
     *
     * @param fleetState <p>
     *            The state of the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetStateCode
     */
    public FleetData withFleetState(FleetStateCode fleetState) {
        this.fleetState = fleetState.toString();
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Maximum 64 ASCII characters
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that you provide to ensure the
     *         idempotency of the request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *         >Ensuring Idempotency</a>.
     *         </p>
     *         <p>
     *         Constraints: Maximum 64 ASCII characters
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Maximum 64 ASCII characters
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     *            <p>
     *            Constraints: Maximum 64 ASCII characters
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Maximum 64 ASCII characters
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     *            <p>
     *            Constraints: Maximum 64 ASCII characters
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetData withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the target
     * capacity of the EC2 Fleet is decreased below the current size of the EC2
     * Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no-termination, termination
     *
     * @return <p>
     *         Indicates whether running instances should be terminated if the
     *         target capacity of the EC2 Fleet is decreased below the current
     *         size of the EC2 Fleet.
     *         </p>
     * @see FleetExcessCapacityTerminationPolicy
     */
    public String getExcessCapacityTerminationPolicy() {
        return excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the target
     * capacity of the EC2 Fleet is decreased below the current size of the EC2
     * Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no-termination, termination
     *
     * @param excessCapacityTerminationPolicy <p>
     *            Indicates whether running instances should be terminated if
     *            the target capacity of the EC2 Fleet is decreased below the
     *            current size of the EC2 Fleet.
     *            </p>
     * @see FleetExcessCapacityTerminationPolicy
     */
    public void setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the target
     * capacity of the EC2 Fleet is decreased below the current size of the EC2
     * Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no-termination, termination
     *
     * @param excessCapacityTerminationPolicy <p>
     *            Indicates whether running instances should be terminated if
     *            the target capacity of the EC2 Fleet is decreased below the
     *            current size of the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetExcessCapacityTerminationPolicy
     */
    public FleetData withExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        return this;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the target
     * capacity of the EC2 Fleet is decreased below the current size of the EC2
     * Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no-termination, termination
     *
     * @param excessCapacityTerminationPolicy <p>
     *            Indicates whether running instances should be terminated if
     *            the target capacity of the EC2 Fleet is decreased below the
     *            current size of the EC2 Fleet.
     *            </p>
     * @see FleetExcessCapacityTerminationPolicy
     */
    public void setExcessCapacityTerminationPolicy(
            FleetExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy.toString();
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the target
     * capacity of the EC2 Fleet is decreased below the current size of the EC2
     * Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no-termination, termination
     *
     * @param excessCapacityTerminationPolicy <p>
     *            Indicates whether running instances should be terminated if
     *            the target capacity of the EC2 Fleet is decreased below the
     *            current size of the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetExcessCapacityTerminationPolicy
     */
    public FleetData withExcessCapacityTerminationPolicy(
            FleetExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target
     * capacity.
     * </p>
     *
     * @return <p>
     *         The number of units fulfilled by this request compared to the set
     *         target capacity.
     *         </p>
     */
    public Double getFulfilledCapacity() {
        return fulfilledCapacity;
    }

    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target
     * capacity.
     * </p>
     *
     * @param fulfilledCapacity <p>
     *            The number of units fulfilled by this request compared to the
     *            set target capacity.
     *            </p>
     */
    public void setFulfilledCapacity(Double fulfilledCapacity) {
        this.fulfilledCapacity = fulfilledCapacity;
    }

    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target
     * capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fulfilledCapacity <p>
     *            The number of units fulfilled by this request compared to the
     *            set target capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetData withFulfilledCapacity(Double fulfilledCapacity) {
        this.fulfilledCapacity = fulfilledCapacity;
        return this;
    }

    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target
     * On-Demand capacity.
     * </p>
     *
     * @return <p>
     *         The number of units fulfilled by this request compared to the set
     *         target On-Demand capacity.
     *         </p>
     */
    public Double getFulfilledOnDemandCapacity() {
        return fulfilledOnDemandCapacity;
    }

    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target
     * On-Demand capacity.
     * </p>
     *
     * @param fulfilledOnDemandCapacity <p>
     *            The number of units fulfilled by this request compared to the
     *            set target On-Demand capacity.
     *            </p>
     */
    public void setFulfilledOnDemandCapacity(Double fulfilledOnDemandCapacity) {
        this.fulfilledOnDemandCapacity = fulfilledOnDemandCapacity;
    }

    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target
     * On-Demand capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fulfilledOnDemandCapacity <p>
     *            The number of units fulfilled by this request compared to the
     *            set target On-Demand capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetData withFulfilledOnDemandCapacity(Double fulfilledOnDemandCapacity) {
        this.fulfilledOnDemandCapacity = fulfilledOnDemandCapacity;
        return this;
    }

    /**
     * <p>
     * The launch template and overrides.
     * </p>
     *
     * @return <p>
     *         The launch template and overrides.
     *         </p>
     */
    public java.util.List<FleetLaunchTemplateConfig> getLaunchTemplateConfigs() {
        return launchTemplateConfigs;
    }

    /**
     * <p>
     * The launch template and overrides.
     * </p>
     *
     * @param launchTemplateConfigs <p>
     *            The launch template and overrides.
     *            </p>
     */
    public void setLaunchTemplateConfigs(
            java.util.Collection<FleetLaunchTemplateConfig> launchTemplateConfigs) {
        if (launchTemplateConfigs == null) {
            this.launchTemplateConfigs = null;
            return;
        }

        this.launchTemplateConfigs = new java.util.ArrayList<FleetLaunchTemplateConfig>(
                launchTemplateConfigs);
    }

    /**
     * <p>
     * The launch template and overrides.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplateConfigs <p>
     *            The launch template and overrides.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetData withLaunchTemplateConfigs(FleetLaunchTemplateConfig... launchTemplateConfigs) {
        if (getLaunchTemplateConfigs() == null) {
            this.launchTemplateConfigs = new java.util.ArrayList<FleetLaunchTemplateConfig>(
                    launchTemplateConfigs.length);
        }
        for (FleetLaunchTemplateConfig value : launchTemplateConfigs) {
            this.launchTemplateConfigs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The launch template and overrides.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplateConfigs <p>
     *            The launch template and overrides.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetData withLaunchTemplateConfigs(
            java.util.Collection<FleetLaunchTemplateConfig> launchTemplateConfigs) {
        setLaunchTemplateConfigs(launchTemplateConfigs);
        return this;
    }

    /**
     * <p>
     * The number of units to request. You can choose to set the target capacity
     * in terms of instances or a performance characteristic that is important
     * to your application workload, such as vCPUs, memory, or I/O. If the
     * request type is <code>maintain</code>, you can specify a target capacity
     * of 0 and add capacity later.
     * </p>
     *
     * @return <p>
     *         The number of units to request. You can choose to set the target
     *         capacity in terms of instances or a performance characteristic
     *         that is important to your application workload, such as vCPUs,
     *         memory, or I/O. If the request type is <code>maintain</code>, you
     *         can specify a target capacity of 0 and add capacity later.
     *         </p>
     */
    public TargetCapacitySpecification getTargetCapacitySpecification() {
        return targetCapacitySpecification;
    }

    /**
     * <p>
     * The number of units to request. You can choose to set the target capacity
     * in terms of instances or a performance characteristic that is important
     * to your application workload, such as vCPUs, memory, or I/O. If the
     * request type is <code>maintain</code>, you can specify a target capacity
     * of 0 and add capacity later.
     * </p>
     *
     * @param targetCapacitySpecification <p>
     *            The number of units to request. You can choose to set the
     *            target capacity in terms of instances or a performance
     *            characteristic that is important to your application workload,
     *            such as vCPUs, memory, or I/O. If the request type is
     *            <code>maintain</code>, you can specify a target capacity of 0
     *            and add capacity later.
     *            </p>
     */
    public void setTargetCapacitySpecification(
            TargetCapacitySpecification targetCapacitySpecification) {
        this.targetCapacitySpecification = targetCapacitySpecification;
    }

    /**
     * <p>
     * The number of units to request. You can choose to set the target capacity
     * in terms of instances or a performance characteristic that is important
     * to your application workload, such as vCPUs, memory, or I/O. If the
     * request type is <code>maintain</code>, you can specify a target capacity
     * of 0 and add capacity later.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetCapacitySpecification <p>
     *            The number of units to request. You can choose to set the
     *            target capacity in terms of instances or a performance
     *            characteristic that is important to your application workload,
     *            such as vCPUs, memory, or I/O. If the request type is
     *            <code>maintain</code>, you can specify a target capacity of 0
     *            and add capacity later.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetData withTargetCapacitySpecification(
            TargetCapacitySpecification targetCapacitySpecification) {
        this.targetCapacitySpecification = targetCapacitySpecification;
        return this;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated when the EC2
     * Fleet expires.
     * </p>
     *
     * @return <p>
     *         Indicates whether running instances should be terminated when the
     *         EC2 Fleet expires.
     *         </p>
     */
    public Boolean isTerminateInstancesWithExpiration() {
        return terminateInstancesWithExpiration;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated when the EC2
     * Fleet expires.
     * </p>
     *
     * @return <p>
     *         Indicates whether running instances should be terminated when the
     *         EC2 Fleet expires.
     *         </p>
     */
    public Boolean getTerminateInstancesWithExpiration() {
        return terminateInstancesWithExpiration;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated when the EC2
     * Fleet expires.
     * </p>
     *
     * @param terminateInstancesWithExpiration <p>
     *            Indicates whether running instances should be terminated when
     *            the EC2 Fleet expires.
     *            </p>
     */
    public void setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated when the EC2
     * Fleet expires.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminateInstancesWithExpiration <p>
     *            Indicates whether running instances should be terminated when
     *            the EC2 Fleet expires.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetData withTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
        return this;
    }

    /**
     * <p>
     * The type of request. Indicates whether the EC2 Fleet only
     * <code>requests</code> the target capacity, or also attempts to
     * <code>maintain</code> it. If you request a certain target capacity, EC2
     * Fleet only places the required requests; it does not attempt to replenish
     * instances if capacity is diminished, and it does not submit requests in
     * alternative capacity pools if capacity is unavailable. To maintain a
     * certain target capacity, EC2 Fleet places the required requests to meet
     * this target capacity. It also automatically replenishes any interrupted
     * Spot Instances. Default: <code>maintain</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>request, maintain, instant
     *
     * @return <p>
     *         The type of request. Indicates whether the EC2 Fleet only
     *         <code>requests</code> the target capacity, or also attempts to
     *         <code>maintain</code> it. If you request a certain target
     *         capacity, EC2 Fleet only places the required requests; it does
     *         not attempt to replenish instances if capacity is diminished, and
     *         it does not submit requests in alternative capacity pools if
     *         capacity is unavailable. To maintain a certain target capacity,
     *         EC2 Fleet places the required requests to meet this target
     *         capacity. It also automatically replenishes any interrupted Spot
     *         Instances. Default: <code>maintain</code>.
     *         </p>
     * @see FleetType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of request. Indicates whether the EC2 Fleet only
     * <code>requests</code> the target capacity, or also attempts to
     * <code>maintain</code> it. If you request a certain target capacity, EC2
     * Fleet only places the required requests; it does not attempt to replenish
     * instances if capacity is diminished, and it does not submit requests in
     * alternative capacity pools if capacity is unavailable. To maintain a
     * certain target capacity, EC2 Fleet places the required requests to meet
     * this target capacity. It also automatically replenishes any interrupted
     * Spot Instances. Default: <code>maintain</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>request, maintain, instant
     *
     * @param type <p>
     *            The type of request. Indicates whether the EC2 Fleet only
     *            <code>requests</code> the target capacity, or also attempts to
     *            <code>maintain</code> it. If you request a certain target
     *            capacity, EC2 Fleet only places the required requests; it does
     *            not attempt to replenish instances if capacity is diminished,
     *            and it does not submit requests in alternative capacity pools
     *            if capacity is unavailable. To maintain a certain target
     *            capacity, EC2 Fleet places the required requests to meet this
     *            target capacity. It also automatically replenishes any
     *            interrupted Spot Instances. Default: <code>maintain</code>.
     *            </p>
     * @see FleetType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of request. Indicates whether the EC2 Fleet only
     * <code>requests</code> the target capacity, or also attempts to
     * <code>maintain</code> it. If you request a certain target capacity, EC2
     * Fleet only places the required requests; it does not attempt to replenish
     * instances if capacity is diminished, and it does not submit requests in
     * alternative capacity pools if capacity is unavailable. To maintain a
     * certain target capacity, EC2 Fleet places the required requests to meet
     * this target capacity. It also automatically replenishes any interrupted
     * Spot Instances. Default: <code>maintain</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>request, maintain, instant
     *
     * @param type <p>
     *            The type of request. Indicates whether the EC2 Fleet only
     *            <code>requests</code> the target capacity, or also attempts to
     *            <code>maintain</code> it. If you request a certain target
     *            capacity, EC2 Fleet only places the required requests; it does
     *            not attempt to replenish instances if capacity is diminished,
     *            and it does not submit requests in alternative capacity pools
     *            if capacity is unavailable. To maintain a certain target
     *            capacity, EC2 Fleet places the required requests to meet this
     *            target capacity. It also automatically replenishes any
     *            interrupted Spot Instances. Default: <code>maintain</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetType
     */
    public FleetData withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of request. Indicates whether the EC2 Fleet only
     * <code>requests</code> the target capacity, or also attempts to
     * <code>maintain</code> it. If you request a certain target capacity, EC2
     * Fleet only places the required requests; it does not attempt to replenish
     * instances if capacity is diminished, and it does not submit requests in
     * alternative capacity pools if capacity is unavailable. To maintain a
     * certain target capacity, EC2 Fleet places the required requests to meet
     * this target capacity. It also automatically replenishes any interrupted
     * Spot Instances. Default: <code>maintain</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>request, maintain, instant
     *
     * @param type <p>
     *            The type of request. Indicates whether the EC2 Fleet only
     *            <code>requests</code> the target capacity, or also attempts to
     *            <code>maintain</code> it. If you request a certain target
     *            capacity, EC2 Fleet only places the required requests; it does
     *            not attempt to replenish instances if capacity is diminished,
     *            and it does not submit requests in alternative capacity pools
     *            if capacity is unavailable. To maintain a certain target
     *            capacity, EC2 Fleet places the required requests to meet this
     *            target capacity. It also automatically replenishes any
     *            interrupted Spot Instances. Default: <code>maintain</code>.
     *            </p>
     * @see FleetType
     */
    public void setType(FleetType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of request. Indicates whether the EC2 Fleet only
     * <code>requests</code> the target capacity, or also attempts to
     * <code>maintain</code> it. If you request a certain target capacity, EC2
     * Fleet only places the required requests; it does not attempt to replenish
     * instances if capacity is diminished, and it does not submit requests in
     * alternative capacity pools if capacity is unavailable. To maintain a
     * certain target capacity, EC2 Fleet places the required requests to meet
     * this target capacity. It also automatically replenishes any interrupted
     * Spot Instances. Default: <code>maintain</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>request, maintain, instant
     *
     * @param type <p>
     *            The type of request. Indicates whether the EC2 Fleet only
     *            <code>requests</code> the target capacity, or also attempts to
     *            <code>maintain</code> it. If you request a certain target
     *            capacity, EC2 Fleet only places the required requests; it does
     *            not attempt to replenish instances if capacity is diminished,
     *            and it does not submit requests in alternative capacity pools
     *            if capacity is unavailable. To maintain a certain target
     *            capacity, EC2 Fleet places the required requests to meet this
     *            target capacity. It also automatically replenishes any
     *            interrupted Spot Instances. Default: <code>maintain</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetType
     */
    public FleetData withType(FleetType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The start date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The
     * default is to start fulfilling the request immediately.
     * </p>
     *
     * @return <p>
     *         The start date and time of the request, in UTC format (for
     *         example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *         The default is to start fulfilling the request immediately.
     *         </p>
     */
    public java.util.Date getValidFrom() {
        return validFrom;
    }

    /**
     * <p>
     * The start date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The
     * default is to start fulfilling the request immediately.
     * </p>
     *
     * @param validFrom <p>
     *            The start date and time of the request, in UTC format (for
     *            example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i
     *            >SS</i>Z). The default is to start fulfilling the request
     *            immediately.
     *            </p>
     */
    public void setValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * <p>
     * The start date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The
     * default is to start fulfilling the request immediately.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validFrom <p>
     *            The start date and time of the request, in UTC format (for
     *            example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i
     *            >SS</i>Z). The default is to start fulfilling the request
     *            immediately.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetData withValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * <p>
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this
     * point, no new instance requests are placed or able to fulfill the
     * request. The default end date is 7 days from the current date.
     * </p>
     *
     * @return <p>
     *         The end date and time of the request, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *         At this point, no new instance requests are placed or able to
     *         fulfill the request. The default end date is 7 days from the
     *         current date.
     *         </p>
     */
    public java.util.Date getValidUntil() {
        return validUntil;
    }

    /**
     * <p>
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this
     * point, no new instance requests are placed or able to fulfill the
     * request. The default end date is 7 days from the current date.
     * </p>
     *
     * @param validUntil <p>
     *            The end date and time of the request, in UTC format (for
     *            example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i
     *            >SS</i>Z). At this point, no new instance requests are placed
     *            or able to fulfill the request. The default end date is 7 days
     *            from the current date.
     *            </p>
     */
    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }

    /**
     * <p>
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this
     * point, no new instance requests are placed or able to fulfill the
     * request. The default end date is 7 days from the current date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validUntil <p>
     *            The end date and time of the request, in UTC format (for
     *            example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i
     *            >SS</i>Z). At this point, no new instance requests are placed
     *            or able to fulfill the request. The default end date is 7 days
     *            from the current date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetData withValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * <p>
     * Indicates whether EC2 Fleet should replace unhealthy instances.
     * </p>
     *
     * @return <p>
     *         Indicates whether EC2 Fleet should replace unhealthy instances.
     *         </p>
     */
    public Boolean isReplaceUnhealthyInstances() {
        return replaceUnhealthyInstances;
    }

    /**
     * <p>
     * Indicates whether EC2 Fleet should replace unhealthy instances.
     * </p>
     *
     * @return <p>
     *         Indicates whether EC2 Fleet should replace unhealthy instances.
     *         </p>
     */
    public Boolean getReplaceUnhealthyInstances() {
        return replaceUnhealthyInstances;
    }

    /**
     * <p>
     * Indicates whether EC2 Fleet should replace unhealthy instances.
     * </p>
     *
     * @param replaceUnhealthyInstances <p>
     *            Indicates whether EC2 Fleet should replace unhealthy
     *            instances.
     *            </p>
     */
    public void setReplaceUnhealthyInstances(Boolean replaceUnhealthyInstances) {
        this.replaceUnhealthyInstances = replaceUnhealthyInstances;
    }

    /**
     * <p>
     * Indicates whether EC2 Fleet should replace unhealthy instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replaceUnhealthyInstances <p>
     *            Indicates whether EC2 Fleet should replace unhealthy
     *            instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetData withReplaceUnhealthyInstances(Boolean replaceUnhealthyInstances) {
        this.replaceUnhealthyInstances = replaceUnhealthyInstances;
        return this;
    }

    /**
     * <p>
     * The configuration of Spot Instances in an EC2 Fleet.
     * </p>
     *
     * @return <p>
     *         The configuration of Spot Instances in an EC2 Fleet.
     *         </p>
     */
    public SpotOptions getSpotOptions() {
        return spotOptions;
    }

    /**
     * <p>
     * The configuration of Spot Instances in an EC2 Fleet.
     * </p>
     *
     * @param spotOptions <p>
     *            The configuration of Spot Instances in an EC2 Fleet.
     *            </p>
     */
    public void setSpotOptions(SpotOptions spotOptions) {
        this.spotOptions = spotOptions;
    }

    /**
     * <p>
     * The configuration of Spot Instances in an EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotOptions <p>
     *            The configuration of Spot Instances in an EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetData withSpotOptions(SpotOptions spotOptions) {
        this.spotOptions = spotOptions;
        return this;
    }

    /**
     * <p>
     * The allocation strategy of On-Demand Instances in an EC2 Fleet.
     * </p>
     *
     * @return <p>
     *         The allocation strategy of On-Demand Instances in an EC2 Fleet.
     *         </p>
     */
    public OnDemandOptions getOnDemandOptions() {
        return onDemandOptions;
    }

    /**
     * <p>
     * The allocation strategy of On-Demand Instances in an EC2 Fleet.
     * </p>
     *
     * @param onDemandOptions <p>
     *            The allocation strategy of On-Demand Instances in an EC2
     *            Fleet.
     *            </p>
     */
    public void setOnDemandOptions(OnDemandOptions onDemandOptions) {
        this.onDemandOptions = onDemandOptions;
    }

    /**
     * <p>
     * The allocation strategy of On-Demand Instances in an EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onDemandOptions <p>
     *            The allocation strategy of On-Demand Instances in an EC2
     *            Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetData withOnDemandOptions(OnDemandOptions onDemandOptions) {
        this.onDemandOptions = onDemandOptions;
        return this;
    }

    /**
     * <p>
     * The tags for an EC2 Fleet resource.
     * </p>
     *
     * @return <p>
     *         The tags for an EC2 Fleet resource.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for an EC2 Fleet resource.
     * </p>
     *
     * @param tags <p>
     *            The tags for an EC2 Fleet resource.
     *            </p>
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
     * The tags for an EC2 Fleet resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for an EC2 Fleet resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetData withTags(Tag... tags) {
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
     * The tags for an EC2 Fleet resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for an EC2 Fleet resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetData withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Information about the instances that could not be launched by the fleet.
     * Valid only when <b>Type</b> is set to <code>instant</code>.
     * </p>
     *
     * @return <p>
     *         Information about the instances that could not be launched by the
     *         fleet. Valid only when <b>Type</b> is set to <code>instant</code>
     *         .
     *         </p>
     */
    public java.util.List<DescribeFleetError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Information about the instances that could not be launched by the fleet.
     * Valid only when <b>Type</b> is set to <code>instant</code>.
     * </p>
     *
     * @param errors <p>
     *            Information about the instances that could not be launched by
     *            the fleet. Valid only when <b>Type</b> is set to
     *            <code>instant</code>.
     *            </p>
     */
    public void setErrors(java.util.Collection<DescribeFleetError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<DescribeFleetError>(errors);
    }

    /**
     * <p>
     * Information about the instances that could not be launched by the fleet.
     * Valid only when <b>Type</b> is set to <code>instant</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Information about the instances that could not be launched by
     *            the fleet. Valid only when <b>Type</b> is set to
     *            <code>instant</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetData withErrors(DescribeFleetError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<DescribeFleetError>(errors.length);
        }
        for (DescribeFleetError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the instances that could not be launched by the fleet.
     * Valid only when <b>Type</b> is set to <code>instant</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Information about the instances that could not be launched by
     *            the fleet. Valid only when <b>Type</b> is set to
     *            <code>instant</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetData withErrors(java.util.Collection<DescribeFleetError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * Information about the instances that were launched by the fleet. Valid
     * only when <b>Type</b> is set to <code>instant</code>.
     * </p>
     *
     * @return <p>
     *         Information about the instances that were launched by the fleet.
     *         Valid only when <b>Type</b> is set to <code>instant</code>.
     *         </p>
     */
    public java.util.List<DescribeFleetsInstances> getInstances() {
        return instances;
    }

    /**
     * <p>
     * Information about the instances that were launched by the fleet. Valid
     * only when <b>Type</b> is set to <code>instant</code>.
     * </p>
     *
     * @param instances <p>
     *            Information about the instances that were launched by the
     *            fleet. Valid only when <b>Type</b> is set to
     *            <code>instant</code>.
     *            </p>
     */
    public void setInstances(java.util.Collection<DescribeFleetsInstances> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<DescribeFleetsInstances>(instances);
    }

    /**
     * <p>
     * Information about the instances that were launched by the fleet. Valid
     * only when <b>Type</b> is set to <code>instant</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            Information about the instances that were launched by the
     *            fleet. Valid only when <b>Type</b> is set to
     *            <code>instant</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetData withInstances(DescribeFleetsInstances... instances) {
        if (getInstances() == null) {
            this.instances = new java.util.ArrayList<DescribeFleetsInstances>(instances.length);
        }
        for (DescribeFleetsInstances value : instances) {
            this.instances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the instances that were launched by the fleet. Valid
     * only when <b>Type</b> is set to <code>instant</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            Information about the instances that were launched by the
     *            fleet. Valid only when <b>Type</b> is set to
     *            <code>instant</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetData withInstances(java.util.Collection<DescribeFleetsInstances> instances) {
        setInstances(instances);
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
        if (getActivityStatus() != null)
            sb.append("ActivityStatus: " + getActivityStatus() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getFleetId() != null)
            sb.append("FleetId: " + getFleetId() + ",");
        if (getFleetState() != null)
            sb.append("FleetState: " + getFleetState() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getExcessCapacityTerminationPolicy() != null)
            sb.append("ExcessCapacityTerminationPolicy: " + getExcessCapacityTerminationPolicy()
                    + ",");
        if (getFulfilledCapacity() != null)
            sb.append("FulfilledCapacity: " + getFulfilledCapacity() + ",");
        if (getFulfilledOnDemandCapacity() != null)
            sb.append("FulfilledOnDemandCapacity: " + getFulfilledOnDemandCapacity() + ",");
        if (getLaunchTemplateConfigs() != null)
            sb.append("LaunchTemplateConfigs: " + getLaunchTemplateConfigs() + ",");
        if (getTargetCapacitySpecification() != null)
            sb.append("TargetCapacitySpecification: " + getTargetCapacitySpecification() + ",");
        if (getTerminateInstancesWithExpiration() != null)
            sb.append("TerminateInstancesWithExpiration: " + getTerminateInstancesWithExpiration()
                    + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getValidFrom() != null)
            sb.append("ValidFrom: " + getValidFrom() + ",");
        if (getValidUntil() != null)
            sb.append("ValidUntil: " + getValidUntil() + ",");
        if (getReplaceUnhealthyInstances() != null)
            sb.append("ReplaceUnhealthyInstances: " + getReplaceUnhealthyInstances() + ",");
        if (getSpotOptions() != null)
            sb.append("SpotOptions: " + getSpotOptions() + ",");
        if (getOnDemandOptions() != null)
            sb.append("OnDemandOptions: " + getOnDemandOptions() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getErrors() != null)
            sb.append("Errors: " + getErrors() + ",");
        if (getInstances() != null)
            sb.append("Instances: " + getInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getActivityStatus() == null) ? 0 : getActivityStatus().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getFleetState() == null) ? 0 : getFleetState().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getExcessCapacityTerminationPolicy() == null) ? 0
                        : getExcessCapacityTerminationPolicy().hashCode());
        hashCode = prime * hashCode
                + ((getFulfilledCapacity() == null) ? 0 : getFulfilledCapacity().hashCode());
        hashCode = prime
                * hashCode
                + ((getFulfilledOnDemandCapacity() == null) ? 0 : getFulfilledOnDemandCapacity()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLaunchTemplateConfigs() == null) ? 0 : getLaunchTemplateConfigs().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetCapacitySpecification() == null) ? 0
                        : getTargetCapacitySpecification().hashCode());
        hashCode = prime
                * hashCode
                + ((getTerminateInstancesWithExpiration() == null) ? 0
                        : getTerminateInstancesWithExpiration().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValidFrom() == null) ? 0 : getValidFrom().hashCode());
        hashCode = prime * hashCode + ((getValidUntil() == null) ? 0 : getValidUntil().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplaceUnhealthyInstances() == null) ? 0 : getReplaceUnhealthyInstances()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSpotOptions() == null) ? 0 : getSpotOptions().hashCode());
        hashCode = prime * hashCode
                + ((getOnDemandOptions() == null) ? 0 : getOnDemandOptions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FleetData == false)
            return false;
        FleetData other = (FleetData) obj;

        if (other.getActivityStatus() == null ^ this.getActivityStatus() == null)
            return false;
        if (other.getActivityStatus() != null
                && other.getActivityStatus().equals(this.getActivityStatus()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getFleetState() == null ^ this.getFleetState() == null)
            return false;
        if (other.getFleetState() != null
                && other.getFleetState().equals(this.getFleetState()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getExcessCapacityTerminationPolicy() == null
                ^ this.getExcessCapacityTerminationPolicy() == null)
            return false;
        if (other.getExcessCapacityTerminationPolicy() != null
                && other.getExcessCapacityTerminationPolicy().equals(
                        this.getExcessCapacityTerminationPolicy()) == false)
            return false;
        if (other.getFulfilledCapacity() == null ^ this.getFulfilledCapacity() == null)
            return false;
        if (other.getFulfilledCapacity() != null
                && other.getFulfilledCapacity().equals(this.getFulfilledCapacity()) == false)
            return false;
        if (other.getFulfilledOnDemandCapacity() == null
                ^ this.getFulfilledOnDemandCapacity() == null)
            return false;
        if (other.getFulfilledOnDemandCapacity() != null
                && other.getFulfilledOnDemandCapacity().equals(this.getFulfilledOnDemandCapacity()) == false)
            return false;
        if (other.getLaunchTemplateConfigs() == null ^ this.getLaunchTemplateConfigs() == null)
            return false;
        if (other.getLaunchTemplateConfigs() != null
                && other.getLaunchTemplateConfigs().equals(this.getLaunchTemplateConfigs()) == false)
            return false;
        if (other.getTargetCapacitySpecification() == null
                ^ this.getTargetCapacitySpecification() == null)
            return false;
        if (other.getTargetCapacitySpecification() != null
                && other.getTargetCapacitySpecification().equals(
                        this.getTargetCapacitySpecification()) == false)
            return false;
        if (other.getTerminateInstancesWithExpiration() == null
                ^ this.getTerminateInstancesWithExpiration() == null)
            return false;
        if (other.getTerminateInstancesWithExpiration() != null
                && other.getTerminateInstancesWithExpiration().equals(
                        this.getTerminateInstancesWithExpiration()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValidFrom() == null ^ this.getValidFrom() == null)
            return false;
        if (other.getValidFrom() != null
                && other.getValidFrom().equals(this.getValidFrom()) == false)
            return false;
        if (other.getValidUntil() == null ^ this.getValidUntil() == null)
            return false;
        if (other.getValidUntil() != null
                && other.getValidUntil().equals(this.getValidUntil()) == false)
            return false;
        if (other.getReplaceUnhealthyInstances() == null
                ^ this.getReplaceUnhealthyInstances() == null)
            return false;
        if (other.getReplaceUnhealthyInstances() != null
                && other.getReplaceUnhealthyInstances().equals(this.getReplaceUnhealthyInstances()) == false)
            return false;
        if (other.getSpotOptions() == null ^ this.getSpotOptions() == null)
            return false;
        if (other.getSpotOptions() != null
                && other.getSpotOptions().equals(this.getSpotOptions()) == false)
            return false;
        if (other.getOnDemandOptions() == null ^ this.getOnDemandOptions() == null)
            return false;
        if (other.getOnDemandOptions() != null
                && other.getOnDemandOptions().equals(this.getOnDemandOptions()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null
                && other.getInstances().equals(this.getInstances()) == false)
            return false;
        return true;
    }
}
