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
 * Describes a Capacity Reservation.
 * </p>
 */
public class CapacityReservation implements Serializable {
    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     */
    private String capacityReservationId;

    /**
     * <p>
     * The ID of the AWS account that owns the Capacity Reservation.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Capacity Reservation.
     * </p>
     */
    private String capacityReservationArn;

    /**
     * <p>
     * The Availability Zone ID of the Capacity Reservation.
     * </p>
     */
    private String availabilityZoneId;

    /**
     * <p>
     * The type of instance for which the Capacity Reservation reserves
     * capacity.
     * </p>
     */
    private String instanceType;

    /**
     * <p>
     * The type of operating system for which the Capacity Reservation reserves
     * capacity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Red Hat Enterprise Linux, SUSE Linux,
     * Windows, Windows with SQL Server, Windows with SQL Server Enterprise,
     * Windows with SQL Server Standard, Windows with SQL Server Web, Linux with
     * SQL Server Standard, Linux with SQL Server Web, Linux with SQL Server
     * Enterprise
     */
    private String instancePlatform;

    /**
     * <p>
     * The Availability Zone in which the capacity is reserved.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * Indicates the tenancy of the Capacity Reservation. A Capacity Reservation
     * can have one of the following tenancy settings:
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     */
    private String tenancy;

    /**
     * <p>
     * The total number of instances for which the Capacity Reservation reserves
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
     * Indicates whether the Capacity Reservation supports EBS-optimized
     * instances. This optimization provides dedicated throughput to Amazon EBS
     * and an optimized configuration stack to provide optimal I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS- optimized instance.
     * </p>
     */
    private Boolean ebsOptimized;

    /**
     * <p>
     * Indicates whether the Capacity Reservation supports instances with
     * temporary, block-level storage.
     * </p>
     */
    private Boolean ephemeralStorage;

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
     * The date and time at which the Capacity Reservation expires. When a
     * Capacity Reservation expires, the reserved capacity is released and you
     * can no longer launch instances into it. The Capacity Reservation's state
     * changes to <code>expired</code> when it reaches its end date and time.
     * </p>
     */
    private java.util.Date endDate;

    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity
     * Reservation can have one of the following end types:
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unlimited, limited
     */
    private String endDateType;

    /**
     * <p>
     * Indicates the type of instance launches that the Capacity Reservation
     * accepts. The options include:
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, targeted
     */
    private String instanceMatchCriteria;

    /**
     * <p>
     * The date and time at which the Capacity Reservation was created.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * Any tags assigned to the Capacity Reservation.
     * </p>
     */
    private java.util.List<Tag> tags;

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
    public CapacityReservation withCapacityReservationId(String capacityReservationId) {
        this.capacityReservationId = capacityReservationId;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Capacity Reservation.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the Capacity Reservation.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Capacity Reservation.
     * </p>
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the Capacity Reservation.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Capacity Reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the Capacity Reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityReservation withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Capacity Reservation.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Capacity Reservation.
     *         </p>
     */
    public String getCapacityReservationArn() {
        return capacityReservationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Capacity Reservation.
     * </p>
     *
     * @param capacityReservationArn <p>
     *            The Amazon Resource Name (ARN) of the Capacity Reservation.
     *            </p>
     */
    public void setCapacityReservationArn(String capacityReservationArn) {
        this.capacityReservationArn = capacityReservationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Capacity Reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityReservationArn <p>
     *            The Amazon Resource Name (ARN) of the Capacity Reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityReservation withCapacityReservationArn(String capacityReservationArn) {
        this.capacityReservationArn = capacityReservationArn;
        return this;
    }

    /**
     * <p>
     * The Availability Zone ID of the Capacity Reservation.
     * </p>
     *
     * @return <p>
     *         The Availability Zone ID of the Capacity Reservation.
     *         </p>
     */
    public String getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    /**
     * <p>
     * The Availability Zone ID of the Capacity Reservation.
     * </p>
     *
     * @param availabilityZoneId <p>
     *            The Availability Zone ID of the Capacity Reservation.
     *            </p>
     */
    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    /**
     * <p>
     * The Availability Zone ID of the Capacity Reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZoneId <p>
     *            The Availability Zone ID of the Capacity Reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityReservation withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
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
    public CapacityReservation withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The type of operating system for which the Capacity Reservation reserves
     * capacity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Red Hat Enterprise Linux, SUSE Linux,
     * Windows, Windows with SQL Server, Windows with SQL Server Enterprise,
     * Windows with SQL Server Standard, Windows with SQL Server Web, Linux with
     * SQL Server Standard, Linux with SQL Server Web, Linux with SQL Server
     * Enterprise
     *
     * @return <p>
     *         The type of operating system for which the Capacity Reservation
     *         reserves capacity.
     *         </p>
     * @see CapacityReservationInstancePlatform
     */
    public String getInstancePlatform() {
        return instancePlatform;
    }

    /**
     * <p>
     * The type of operating system for which the Capacity Reservation reserves
     * capacity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Red Hat Enterprise Linux, SUSE Linux,
     * Windows, Windows with SQL Server, Windows with SQL Server Enterprise,
     * Windows with SQL Server Standard, Windows with SQL Server Web, Linux with
     * SQL Server Standard, Linux with SQL Server Web, Linux with SQL Server
     * Enterprise
     *
     * @param instancePlatform <p>
     *            The type of operating system for which the Capacity
     *            Reservation reserves capacity.
     *            </p>
     * @see CapacityReservationInstancePlatform
     */
    public void setInstancePlatform(String instancePlatform) {
        this.instancePlatform = instancePlatform;
    }

    /**
     * <p>
     * The type of operating system for which the Capacity Reservation reserves
     * capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Red Hat Enterprise Linux, SUSE Linux,
     * Windows, Windows with SQL Server, Windows with SQL Server Enterprise,
     * Windows with SQL Server Standard, Windows with SQL Server Web, Linux with
     * SQL Server Standard, Linux with SQL Server Web, Linux with SQL Server
     * Enterprise
     *
     * @param instancePlatform <p>
     *            The type of operating system for which the Capacity
     *            Reservation reserves capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CapacityReservationInstancePlatform
     */
    public CapacityReservation withInstancePlatform(String instancePlatform) {
        this.instancePlatform = instancePlatform;
        return this;
    }

    /**
     * <p>
     * The type of operating system for which the Capacity Reservation reserves
     * capacity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Red Hat Enterprise Linux, SUSE Linux,
     * Windows, Windows with SQL Server, Windows with SQL Server Enterprise,
     * Windows with SQL Server Standard, Windows with SQL Server Web, Linux with
     * SQL Server Standard, Linux with SQL Server Web, Linux with SQL Server
     * Enterprise
     *
     * @param instancePlatform <p>
     *            The type of operating system for which the Capacity
     *            Reservation reserves capacity.
     *            </p>
     * @see CapacityReservationInstancePlatform
     */
    public void setInstancePlatform(CapacityReservationInstancePlatform instancePlatform) {
        this.instancePlatform = instancePlatform.toString();
    }

    /**
     * <p>
     * The type of operating system for which the Capacity Reservation reserves
     * capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Red Hat Enterprise Linux, SUSE Linux,
     * Windows, Windows with SQL Server, Windows with SQL Server Enterprise,
     * Windows with SQL Server Standard, Windows with SQL Server Web, Linux with
     * SQL Server Standard, Linux with SQL Server Web, Linux with SQL Server
     * Enterprise
     *
     * @param instancePlatform <p>
     *            The type of operating system for which the Capacity
     *            Reservation reserves capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CapacityReservationInstancePlatform
     */
    public CapacityReservation withInstancePlatform(
            CapacityReservationInstancePlatform instancePlatform) {
        this.instancePlatform = instancePlatform.toString();
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which the capacity is reserved.
     * </p>
     *
     * @return <p>
     *         The Availability Zone in which the capacity is reserved.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the capacity is reserved.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone in which the capacity is reserved.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the capacity is reserved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone in which the capacity is reserved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityReservation withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * Indicates the tenancy of the Capacity Reservation. A Capacity Reservation
     * can have one of the following tenancy settings:
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @return <p>
     *         Indicates the tenancy of the Capacity Reservation. A Capacity
     *         Reservation can have one of the following tenancy settings:
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
     * @see CapacityReservationTenancy
     */
    public String getTenancy() {
        return tenancy;
    }

    /**
     * <p>
     * Indicates the tenancy of the Capacity Reservation. A Capacity Reservation
     * can have one of the following tenancy settings:
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param tenancy <p>
     *            Indicates the tenancy of the Capacity Reservation. A Capacity
     *            Reservation can have one of the following tenancy settings:
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
     * @see CapacityReservationTenancy
     */
    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * <p>
     * Indicates the tenancy of the Capacity Reservation. A Capacity Reservation
     * can have one of the following tenancy settings:
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
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param tenancy <p>
     *            Indicates the tenancy of the Capacity Reservation. A Capacity
     *            Reservation can have one of the following tenancy settings:
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CapacityReservationTenancy
     */
    public CapacityReservation withTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    /**
     * <p>
     * Indicates the tenancy of the Capacity Reservation. A Capacity Reservation
     * can have one of the following tenancy settings:
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param tenancy <p>
     *            Indicates the tenancy of the Capacity Reservation. A Capacity
     *            Reservation can have one of the following tenancy settings:
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
     * @see CapacityReservationTenancy
     */
    public void setTenancy(CapacityReservationTenancy tenancy) {
        this.tenancy = tenancy.toString();
    }

    /**
     * <p>
     * Indicates the tenancy of the Capacity Reservation. A Capacity Reservation
     * can have one of the following tenancy settings:
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
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param tenancy <p>
     *            Indicates the tenancy of the Capacity Reservation. A Capacity
     *            Reservation can have one of the following tenancy settings:
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CapacityReservationTenancy
     */
    public CapacityReservation withTenancy(CapacityReservationTenancy tenancy) {
        this.tenancy = tenancy.toString();
        return this;
    }

    /**
     * <p>
     * The total number of instances for which the Capacity Reservation reserves
     * capacity.
     * </p>
     *
     * @return <p>
     *         The total number of instances for which the Capacity Reservation
     *         reserves capacity.
     *         </p>
     */
    public Integer getTotalInstanceCount() {
        return totalInstanceCount;
    }

    /**
     * <p>
     * The total number of instances for which the Capacity Reservation reserves
     * capacity.
     * </p>
     *
     * @param totalInstanceCount <p>
     *            The total number of instances for which the Capacity
     *            Reservation reserves capacity.
     *            </p>
     */
    public void setTotalInstanceCount(Integer totalInstanceCount) {
        this.totalInstanceCount = totalInstanceCount;
    }

    /**
     * <p>
     * The total number of instances for which the Capacity Reservation reserves
     * capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalInstanceCount <p>
     *            The total number of instances for which the Capacity
     *            Reservation reserves capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityReservation withTotalInstanceCount(Integer totalInstanceCount) {
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
    public CapacityReservation withAvailableInstanceCount(Integer availableInstanceCount) {
        this.availableInstanceCount = availableInstanceCount;
        return this;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation supports EBS-optimized
     * instances. This optimization provides dedicated throughput to Amazon EBS
     * and an optimized configuration stack to provide optimal I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS- optimized instance.
     * </p>
     *
     * @return <p>
     *         Indicates whether the Capacity Reservation supports EBS-optimized
     *         instances. This optimization provides dedicated throughput to
     *         Amazon EBS and an optimized configuration stack to provide
     *         optimal I/O performance. This optimization isn't available with
     *         all instance types. Additional usage charges apply when using an
     *         EBS- optimized instance.
     *         </p>
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation supports EBS-optimized
     * instances. This optimization provides dedicated throughput to Amazon EBS
     * and an optimized configuration stack to provide optimal I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS- optimized instance.
     * </p>
     *
     * @return <p>
     *         Indicates whether the Capacity Reservation supports EBS-optimized
     *         instances. This optimization provides dedicated throughput to
     *         Amazon EBS and an optimized configuration stack to provide
     *         optimal I/O performance. This optimization isn't available with
     *         all instance types. Additional usage charges apply when using an
     *         EBS- optimized instance.
     *         </p>
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation supports EBS-optimized
     * instances. This optimization provides dedicated throughput to Amazon EBS
     * and an optimized configuration stack to provide optimal I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS- optimized instance.
     * </p>
     *
     * @param ebsOptimized <p>
     *            Indicates whether the Capacity Reservation supports
     *            EBS-optimized instances. This optimization provides dedicated
     *            throughput to Amazon EBS and an optimized configuration stack
     *            to provide optimal I/O performance. This optimization isn't
     *            available with all instance types. Additional usage charges
     *            apply when using an EBS- optimized instance.
     *            </p>
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation supports EBS-optimized
     * instances. This optimization provides dedicated throughput to Amazon EBS
     * and an optimized configuration stack to provide optimal I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS- optimized instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsOptimized <p>
     *            Indicates whether the Capacity Reservation supports
     *            EBS-optimized instances. This optimization provides dedicated
     *            throughput to Amazon EBS and an optimized configuration stack
     *            to provide optimal I/O performance. This optimization isn't
     *            available with all instance types. Additional usage charges
     *            apply when using an EBS- optimized instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityReservation withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation supports instances with
     * temporary, block-level storage.
     * </p>
     *
     * @return <p>
     *         Indicates whether the Capacity Reservation supports instances
     *         with temporary, block-level storage.
     *         </p>
     */
    public Boolean isEphemeralStorage() {
        return ephemeralStorage;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation supports instances with
     * temporary, block-level storage.
     * </p>
     *
     * @return <p>
     *         Indicates whether the Capacity Reservation supports instances
     *         with temporary, block-level storage.
     *         </p>
     */
    public Boolean getEphemeralStorage() {
        return ephemeralStorage;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation supports instances with
     * temporary, block-level storage.
     * </p>
     *
     * @param ephemeralStorage <p>
     *            Indicates whether the Capacity Reservation supports instances
     *            with temporary, block-level storage.
     *            </p>
     */
    public void setEphemeralStorage(Boolean ephemeralStorage) {
        this.ephemeralStorage = ephemeralStorage;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation supports instances with
     * temporary, block-level storage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ephemeralStorage <p>
     *            Indicates whether the Capacity Reservation supports instances
     *            with temporary, block-level storage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityReservation withEphemeralStorage(Boolean ephemeralStorage) {
        this.ephemeralStorage = ephemeralStorage;
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
    public CapacityReservation withState(String state) {
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
    public CapacityReservation withState(CapacityReservationState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation expires. When a
     * Capacity Reservation expires, the reserved capacity is released and you
     * can no longer launch instances into it. The Capacity Reservation's state
     * changes to <code>expired</code> when it reaches its end date and time.
     * </p>
     *
     * @return <p>
     *         The date and time at which the Capacity Reservation expires. When
     *         a Capacity Reservation expires, the reserved capacity is released
     *         and you can no longer launch instances into it. The Capacity
     *         Reservation's state changes to <code>expired</code> when it
     *         reaches its end date and time.
     *         </p>
     */
    public java.util.Date getEndDate() {
        return endDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation expires. When a
     * Capacity Reservation expires, the reserved capacity is released and you
     * can no longer launch instances into it. The Capacity Reservation's state
     * changes to <code>expired</code> when it reaches its end date and time.
     * </p>
     *
     * @param endDate <p>
     *            The date and time at which the Capacity Reservation expires.
     *            When a Capacity Reservation expires, the reserved capacity is
     *            released and you can no longer launch instances into it. The
     *            Capacity Reservation's state changes to <code>expired</code>
     *            when it reaches its end date and time.
     *            </p>
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation expires. When a
     * Capacity Reservation expires, the reserved capacity is released and you
     * can no longer launch instances into it. The Capacity Reservation's state
     * changes to <code>expired</code> when it reaches its end date and time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endDate <p>
     *            The date and time at which the Capacity Reservation expires.
     *            When a Capacity Reservation expires, the reserved capacity is
     *            released and you can no longer launch instances into it. The
     *            Capacity Reservation's state changes to <code>expired</code>
     *            when it reaches its end date and time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityReservation withEndDate(java.util.Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity
     * Reservation can have one of the following end types:
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unlimited, limited
     *
     * @return <p>
     *         Indicates the way in which the Capacity Reservation ends. A
     *         Capacity Reservation can have one of the following end types:
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
     * @see EndDateType
     */
    public String getEndDateType() {
        return endDateType;
    }

    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity
     * Reservation can have one of the following end types:
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unlimited, limited
     *
     * @param endDateType <p>
     *            Indicates the way in which the Capacity Reservation ends. A
     *            Capacity Reservation can have one of the following end types:
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
     * @see EndDateType
     */
    public void setEndDateType(String endDateType) {
        this.endDateType = endDateType;
    }

    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity
     * Reservation can have one of the following end types:
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
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unlimited, limited
     *
     * @param endDateType <p>
     *            Indicates the way in which the Capacity Reservation ends. A
     *            Capacity Reservation can have one of the following end types:
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndDateType
     */
    public CapacityReservation withEndDateType(String endDateType) {
        this.endDateType = endDateType;
        return this;
    }

    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity
     * Reservation can have one of the following end types:
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unlimited, limited
     *
     * @param endDateType <p>
     *            Indicates the way in which the Capacity Reservation ends. A
     *            Capacity Reservation can have one of the following end types:
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
     * @see EndDateType
     */
    public void setEndDateType(EndDateType endDateType) {
        this.endDateType = endDateType.toString();
    }

    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity
     * Reservation can have one of the following end types:
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
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unlimited, limited
     *
     * @param endDateType <p>
     *            Indicates the way in which the Capacity Reservation ends. A
     *            Capacity Reservation can have one of the following end types:
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndDateType
     */
    public CapacityReservation withEndDateType(EndDateType endDateType) {
        this.endDateType = endDateType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the type of instance launches that the Capacity Reservation
     * accepts. The options include:
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, targeted
     *
     * @return <p>
     *         Indicates the type of instance launches that the Capacity
     *         Reservation accepts. The options include:
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
     * @see InstanceMatchCriteria
     */
    public String getInstanceMatchCriteria() {
        return instanceMatchCriteria;
    }

    /**
     * <p>
     * Indicates the type of instance launches that the Capacity Reservation
     * accepts. The options include:
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, targeted
     *
     * @param instanceMatchCriteria <p>
     *            Indicates the type of instance launches that the Capacity
     *            Reservation accepts. The options include:
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
     * @see InstanceMatchCriteria
     */
    public void setInstanceMatchCriteria(String instanceMatchCriteria) {
        this.instanceMatchCriteria = instanceMatchCriteria;
    }

    /**
     * <p>
     * Indicates the type of instance launches that the Capacity Reservation
     * accepts. The options include:
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
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, targeted
     *
     * @param instanceMatchCriteria <p>
     *            Indicates the type of instance launches that the Capacity
     *            Reservation accepts. The options include:
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceMatchCriteria
     */
    public CapacityReservation withInstanceMatchCriteria(String instanceMatchCriteria) {
        this.instanceMatchCriteria = instanceMatchCriteria;
        return this;
    }

    /**
     * <p>
     * Indicates the type of instance launches that the Capacity Reservation
     * accepts. The options include:
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, targeted
     *
     * @param instanceMatchCriteria <p>
     *            Indicates the type of instance launches that the Capacity
     *            Reservation accepts. The options include:
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
     * @see InstanceMatchCriteria
     */
    public void setInstanceMatchCriteria(InstanceMatchCriteria instanceMatchCriteria) {
        this.instanceMatchCriteria = instanceMatchCriteria.toString();
    }

    /**
     * <p>
     * Indicates the type of instance launches that the Capacity Reservation
     * accepts. The options include:
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
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, targeted
     *
     * @param instanceMatchCriteria <p>
     *            Indicates the type of instance launches that the Capacity
     *            Reservation accepts. The options include:
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceMatchCriteria
     */
    public CapacityReservation withInstanceMatchCriteria(InstanceMatchCriteria instanceMatchCriteria) {
        this.instanceMatchCriteria = instanceMatchCriteria.toString();
        return this;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation was created.
     * </p>
     *
     * @return <p>
     *         The date and time at which the Capacity Reservation was created.
     *         </p>
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation was created.
     * </p>
     *
     * @param createDate <p>
     *            The date and time at which the Capacity Reservation was
     *            created.
     *            </p>
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createDate <p>
     *            The date and time at which the Capacity Reservation was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityReservation withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the Capacity Reservation.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the Capacity Reservation.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the Capacity Reservation.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the Capacity Reservation.
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
     * Any tags assigned to the Capacity Reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the Capacity Reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityReservation withTags(Tag... tags) {
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
     * Any tags assigned to the Capacity Reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the Capacity Reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityReservation withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getCapacityReservationId() != null)
            sb.append("CapacityReservationId: " + getCapacityReservationId() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getCapacityReservationArn() != null)
            sb.append("CapacityReservationArn: " + getCapacityReservationArn() + ",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: " + getAvailabilityZoneId() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getInstancePlatform() != null)
            sb.append("InstancePlatform: " + getInstancePlatform() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getTenancy() != null)
            sb.append("Tenancy: " + getTenancy() + ",");
        if (getTotalInstanceCount() != null)
            sb.append("TotalInstanceCount: " + getTotalInstanceCount() + ",");
        if (getAvailableInstanceCount() != null)
            sb.append("AvailableInstanceCount: " + getAvailableInstanceCount() + ",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: " + getEbsOptimized() + ",");
        if (getEphemeralStorage() != null)
            sb.append("EphemeralStorage: " + getEphemeralStorage() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getEndDate() != null)
            sb.append("EndDate: " + getEndDate() + ",");
        if (getEndDateType() != null)
            sb.append("EndDateType: " + getEndDateType() + ",");
        if (getInstanceMatchCriteria() != null)
            sb.append("InstanceMatchCriteria: " + getInstanceMatchCriteria() + ",");
        if (getCreateDate() != null)
            sb.append("CreateDate: " + getCreateDate() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCapacityReservationId() == null) ? 0 : getCapacityReservationId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime
                * hashCode
                + ((getCapacityReservationArn() == null) ? 0 : getCapacityReservationArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getInstancePlatform() == null) ? 0 : getInstancePlatform().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        hashCode = prime * hashCode
                + ((getTotalInstanceCount() == null) ? 0 : getTotalInstanceCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getAvailableInstanceCount() == null) ? 0 : getAvailableInstanceCount()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode
                + ((getEphemeralStorage() == null) ? 0 : getEphemeralStorage().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode
                + ((getEndDateType() == null) ? 0 : getEndDateType().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceMatchCriteria() == null) ? 0 : getInstanceMatchCriteria().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityReservation == false)
            return false;
        CapacityReservation other = (CapacityReservation) obj;

        if (other.getCapacityReservationId() == null ^ this.getCapacityReservationId() == null)
            return false;
        if (other.getCapacityReservationId() != null
                && other.getCapacityReservationId().equals(this.getCapacityReservationId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getCapacityReservationArn() == null ^ this.getCapacityReservationArn() == null)
            return false;
        if (other.getCapacityReservationArn() != null
                && other.getCapacityReservationArn().equals(this.getCapacityReservationArn()) == false)
            return false;
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null
                && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstancePlatform() == null ^ this.getInstancePlatform() == null)
            return false;
        if (other.getInstancePlatform() != null
                && other.getInstancePlatform().equals(this.getInstancePlatform()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getTenancy() == null ^ this.getTenancy() == null)
            return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false)
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
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null
                && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        if (other.getEphemeralStorage() == null ^ this.getEphemeralStorage() == null)
            return false;
        if (other.getEphemeralStorage() != null
                && other.getEphemeralStorage().equals(this.getEphemeralStorage()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getEndDateType() == null ^ this.getEndDateType() == null)
            return false;
        if (other.getEndDateType() != null
                && other.getEndDateType().equals(this.getEndDateType()) == false)
            return false;
        if (other.getInstanceMatchCriteria() == null ^ this.getInstanceMatchCriteria() == null)
            return false;
        if (other.getInstanceMatchCriteria() != null
                && other.getInstanceMatchCriteria().equals(this.getInstanceMatchCriteria()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null
                && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
