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
 * Creates a new Capacity Reservation with the specified attributes.
 * </p>
 * <p>
 * Capacity Reservations enable you to reserve capacity for your Amazon EC2
 * instances in a specific Availability Zone for any duration. This gives you
 * the flexibility to selectively add capacity reservations and still get the
 * Regional RI discounts for that usage. By creating Capacity Reservations, you
 * ensure that you always have access to Amazon EC2 capacity when you need it,
 * for as long as you need it. For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-capacity-reservations.html"
 * >Capacity Reservations</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 * <p>
 * Your request to create a Capacity Reservation could fail if Amazon EC2 does
 * not have sufficient capacity to fulfill the request. If your request fails
 * due to Amazon EC2 capacity constraints, either try again at a later time, try
 * in a different Availability Zone, or request a smaller capacity reservation.
 * If your application is flexible across instance types and sizes, try to
 * create a Capacity Reservation with different instance attributes.
 * </p>
 * <p>
 * Your request could also fail if the requested quantity exceeds your On-Demand
 * Instance limit for the selected instance type. If your request fails due to
 * limit constraints, increase your On-Demand Instance limit for the required
 * instance type and try again. For more information about increasing your
 * instance limits, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-resource-limits.html"
 * >Amazon EC2 Service Limits</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 */
public class CreateCapacityReservationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     * <p>
     * Constraint: Maximum 64 ASCII characters.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The instance type for which to reserve capacity. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     */
    private String instanceType;

    /**
     * <p>
     * The type of operating system for which to reserve capacity.
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
     * The Availability Zone in which to create the Capacity Reservation.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The ID of the Availability Zone in which to create the Capacity
     * Reservation.
     * </p>
     */
    private String availabilityZoneId;

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
     * The number of instances for which to reserve capacity.
     * </p>
     */
    private Integer instanceCount;

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
     * The date and time at which the Capacity Reservation expires. When a
     * Capacity Reservation expires, the reserved capacity is released and you
     * can no longer launch instances into it. The Capacity Reservation's state
     * changes to <code>expired</code> when it reaches its end date and time.
     * </p>
     * <p>
     * You must provide an <code>EndDate</code> value if
     * <code>EndDateType</code> is <code>limited</code>. Omit
     * <code>EndDate</code> if <code>EndDateType</code> is
     * <code>unlimited</code>.
     * </p>
     * <p>
     * If the <code>EndDateType</code> is <code>limited</code>, the Capacity
     * Reservation is cancelled within an hour from the specified time. For
     * example, if you specify 5/31/2019, 13:30:55, the Capacity Reservation is
     * guaranteed to end between 13:30:55 and 14:30:55 on 5/31/2019.
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
     * you explicitly cancel it. Do not provide an <code>EndDate</code> if the
     * <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at
     * a specified date and time. You must provide an <code>EndDate</code> value
     * if the <code>EndDateType</code> value is <code>limited</code>.
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
     * <code>open</code> - The Capacity Reservation automatically matches all
     * instances that have matching attributes (instance type, platform, and
     * Availability Zone). Instances that have matching attributes run in the
     * Capacity Reservation automatically without specifying any additional
     * parameters.
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
     * Default: <code>open</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, targeted
     */
    private String instanceMatchCriteria;

    /**
     * <p>
     * The tags to apply to the Capacity Reservation during launch.
     * </p>
     */
    private java.util.List<TagSpecification> tagSpecifications;

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
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     * <p>
     * Constraint: Maximum 64 ASCII characters.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that you provide to ensure the
     *         idempotency of the request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *         >How to Ensure Idempotency</a>.
     *         </p>
     *         <p>
     *         Constraint: Maximum 64 ASCII characters.
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
     * >How to Ensure Idempotency</a>.
     * </p>
     * <p>
     * Constraint: Maximum 64 ASCII characters.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
     *            </p>
     *            <p>
     *            Constraint: Maximum 64 ASCII characters.
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
     * >How to Ensure Idempotency</a>.
     * </p>
     * <p>
     * Constraint: Maximum 64 ASCII characters.
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
     *            >How to Ensure Idempotency</a>.
     *            </p>
     *            <p>
     *            Constraint: Maximum 64 ASCII characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCapacityReservationRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The instance type for which to reserve capacity. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The instance type for which to reserve capacity. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *         >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The instance type for which to reserve capacity. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @param instanceType <p>
     *            The instance type for which to reserve capacity. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *            >Instance Types</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type for which to reserve capacity. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceType <p>
     *            The instance type for which to reserve capacity. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *            >Instance Types</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCapacityReservationRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The type of operating system for which to reserve capacity.
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
     *         The type of operating system for which to reserve capacity.
     *         </p>
     * @see CapacityReservationInstancePlatform
     */
    public String getInstancePlatform() {
        return instancePlatform;
    }

    /**
     * <p>
     * The type of operating system for which to reserve capacity.
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
     *            The type of operating system for which to reserve capacity.
     *            </p>
     * @see CapacityReservationInstancePlatform
     */
    public void setInstancePlatform(String instancePlatform) {
        this.instancePlatform = instancePlatform;
    }

    /**
     * <p>
     * The type of operating system for which to reserve capacity.
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
     *            The type of operating system for which to reserve capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CapacityReservationInstancePlatform
     */
    public CreateCapacityReservationRequest withInstancePlatform(String instancePlatform) {
        this.instancePlatform = instancePlatform;
        return this;
    }

    /**
     * <p>
     * The type of operating system for which to reserve capacity.
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
     *            The type of operating system for which to reserve capacity.
     *            </p>
     * @see CapacityReservationInstancePlatform
     */
    public void setInstancePlatform(CapacityReservationInstancePlatform instancePlatform) {
        this.instancePlatform = instancePlatform.toString();
    }

    /**
     * <p>
     * The type of operating system for which to reserve capacity.
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
     *            The type of operating system for which to reserve capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CapacityReservationInstancePlatform
     */
    public CreateCapacityReservationRequest withInstancePlatform(
            CapacityReservationInstancePlatform instancePlatform) {
        this.instancePlatform = instancePlatform.toString();
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which to create the Capacity Reservation.
     * </p>
     *
     * @return <p>
     *         The Availability Zone in which to create the Capacity
     *         Reservation.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to create the Capacity Reservation.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone in which to create the Capacity
     *            Reservation.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to create the Capacity Reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone in which to create the Capacity
     *            Reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCapacityReservationRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The ID of the Availability Zone in which to create the Capacity
     * Reservation.
     * </p>
     *
     * @return <p>
     *         The ID of the Availability Zone in which to create the Capacity
     *         Reservation.
     *         </p>
     */
    public String getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    /**
     * <p>
     * The ID of the Availability Zone in which to create the Capacity
     * Reservation.
     * </p>
     *
     * @param availabilityZoneId <p>
     *            The ID of the Availability Zone in which to create the
     *            Capacity Reservation.
     *            </p>
     */
    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    /**
     * <p>
     * The ID of the Availability Zone in which to create the Capacity
     * Reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZoneId <p>
     *            The ID of the Availability Zone in which to create the
     *            Capacity Reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCapacityReservationRequest withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
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
    public CreateCapacityReservationRequest withTenancy(String tenancy) {
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
    public CreateCapacityReservationRequest withTenancy(CapacityReservationTenancy tenancy) {
        this.tenancy = tenancy.toString();
        return this;
    }

    /**
     * <p>
     * The number of instances for which to reserve capacity.
     * </p>
     *
     * @return <p>
     *         The number of instances for which to reserve capacity.
     *         </p>
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * <p>
     * The number of instances for which to reserve capacity.
     * </p>
     *
     * @param instanceCount <p>
     *            The number of instances for which to reserve capacity.
     *            </p>
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances for which to reserve capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCount <p>
     *            The number of instances for which to reserve capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCapacityReservationRequest withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
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
    public CreateCapacityReservationRequest withEbsOptimized(Boolean ebsOptimized) {
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
    public CreateCapacityReservationRequest withEphemeralStorage(Boolean ephemeralStorage) {
        this.ephemeralStorage = ephemeralStorage;
        return this;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation expires. When a
     * Capacity Reservation expires, the reserved capacity is released and you
     * can no longer launch instances into it. The Capacity Reservation's state
     * changes to <code>expired</code> when it reaches its end date and time.
     * </p>
     * <p>
     * You must provide an <code>EndDate</code> value if
     * <code>EndDateType</code> is <code>limited</code>. Omit
     * <code>EndDate</code> if <code>EndDateType</code> is
     * <code>unlimited</code>.
     * </p>
     * <p>
     * If the <code>EndDateType</code> is <code>limited</code>, the Capacity
     * Reservation is cancelled within an hour from the specified time. For
     * example, if you specify 5/31/2019, 13:30:55, the Capacity Reservation is
     * guaranteed to end between 13:30:55 and 14:30:55 on 5/31/2019.
     * </p>
     *
     * @return <p>
     *         The date and time at which the Capacity Reservation expires. When
     *         a Capacity Reservation expires, the reserved capacity is released
     *         and you can no longer launch instances into it. The Capacity
     *         Reservation's state changes to <code>expired</code> when it
     *         reaches its end date and time.
     *         </p>
     *         <p>
     *         You must provide an <code>EndDate</code> value if
     *         <code>EndDateType</code> is <code>limited</code>. Omit
     *         <code>EndDate</code> if <code>EndDateType</code> is
     *         <code>unlimited</code>.
     *         </p>
     *         <p>
     *         If the <code>EndDateType</code> is <code>limited</code>, the
     *         Capacity Reservation is cancelled within an hour from the
     *         specified time. For example, if you specify 5/31/2019, 13:30:55,
     *         the Capacity Reservation is guaranteed to end between 13:30:55
     *         and 14:30:55 on 5/31/2019.
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
     * <p>
     * You must provide an <code>EndDate</code> value if
     * <code>EndDateType</code> is <code>limited</code>. Omit
     * <code>EndDate</code> if <code>EndDateType</code> is
     * <code>unlimited</code>.
     * </p>
     * <p>
     * If the <code>EndDateType</code> is <code>limited</code>, the Capacity
     * Reservation is cancelled within an hour from the specified time. For
     * example, if you specify 5/31/2019, 13:30:55, the Capacity Reservation is
     * guaranteed to end between 13:30:55 and 14:30:55 on 5/31/2019.
     * </p>
     *
     * @param endDate <p>
     *            The date and time at which the Capacity Reservation expires.
     *            When a Capacity Reservation expires, the reserved capacity is
     *            released and you can no longer launch instances into it. The
     *            Capacity Reservation's state changes to <code>expired</code>
     *            when it reaches its end date and time.
     *            </p>
     *            <p>
     *            You must provide an <code>EndDate</code> value if
     *            <code>EndDateType</code> is <code>limited</code>. Omit
     *            <code>EndDate</code> if <code>EndDateType</code> is
     *            <code>unlimited</code>.
     *            </p>
     *            <p>
     *            If the <code>EndDateType</code> is <code>limited</code>, the
     *            Capacity Reservation is cancelled within an hour from the
     *            specified time. For example, if you specify 5/31/2019,
     *            13:30:55, the Capacity Reservation is guaranteed to end
     *            between 13:30:55 and 14:30:55 on 5/31/2019.
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
     * You must provide an <code>EndDate</code> value if
     * <code>EndDateType</code> is <code>limited</code>. Omit
     * <code>EndDate</code> if <code>EndDateType</code> is
     * <code>unlimited</code>.
     * </p>
     * <p>
     * If the <code>EndDateType</code> is <code>limited</code>, the Capacity
     * Reservation is cancelled within an hour from the specified time. For
     * example, if you specify 5/31/2019, 13:30:55, the Capacity Reservation is
     * guaranteed to end between 13:30:55 and 14:30:55 on 5/31/2019.
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
     *            <p>
     *            You must provide an <code>EndDate</code> value if
     *            <code>EndDateType</code> is <code>limited</code>. Omit
     *            <code>EndDate</code> if <code>EndDateType</code> is
     *            <code>unlimited</code>.
     *            </p>
     *            <p>
     *            If the <code>EndDateType</code> is <code>limited</code>, the
     *            Capacity Reservation is cancelled within an hour from the
     *            specified time. For example, if you specify 5/31/2019,
     *            13:30:55, the Capacity Reservation is guaranteed to end
     *            between 13:30:55 and 14:30:55 on 5/31/2019.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCapacityReservationRequest withEndDate(java.util.Date endDate) {
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
     * you explicitly cancel it. Do not provide an <code>EndDate</code> if the
     * <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at
     * a specified date and time. You must provide an <code>EndDate</code> value
     * if the <code>EndDateType</code> value is <code>limited</code>.
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
     *         until you explicitly cancel it. Do not provide an
     *         <code>EndDate</code> if the <code>EndDateType</code> is
     *         <code>unlimited</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>limited</code> - The Capacity Reservation expires
     *         automatically at a specified date and time. You must provide an
     *         <code>EndDate</code> value if the <code>EndDateType</code> value
     *         is <code>limited</code>.
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
     * you explicitly cancel it. Do not provide an <code>EndDate</code> if the
     * <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at
     * a specified date and time. You must provide an <code>EndDate</code> value
     * if the <code>EndDateType</code> value is <code>limited</code>.
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
     *            active until you explicitly cancel it. Do not provide an
     *            <code>EndDate</code> if the <code>EndDateType</code> is
     *            <code>unlimited</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>limited</code> - The Capacity Reservation expires
     *            automatically at a specified date and time. You must provide
     *            an <code>EndDate</code> value if the <code>EndDateType</code>
     *            value is <code>limited</code>.
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
     * you explicitly cancel it. Do not provide an <code>EndDate</code> if the
     * <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at
     * a specified date and time. You must provide an <code>EndDate</code> value
     * if the <code>EndDateType</code> value is <code>limited</code>.
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
     *            active until you explicitly cancel it. Do not provide an
     *            <code>EndDate</code> if the <code>EndDateType</code> is
     *            <code>unlimited</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>limited</code> - The Capacity Reservation expires
     *            automatically at a specified date and time. You must provide
     *            an <code>EndDate</code> value if the <code>EndDateType</code>
     *            value is <code>limited</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndDateType
     */
    public CreateCapacityReservationRequest withEndDateType(String endDateType) {
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
     * you explicitly cancel it. Do not provide an <code>EndDate</code> if the
     * <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at
     * a specified date and time. You must provide an <code>EndDate</code> value
     * if the <code>EndDateType</code> value is <code>limited</code>.
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
     *            active until you explicitly cancel it. Do not provide an
     *            <code>EndDate</code> if the <code>EndDateType</code> is
     *            <code>unlimited</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>limited</code> - The Capacity Reservation expires
     *            automatically at a specified date and time. You must provide
     *            an <code>EndDate</code> value if the <code>EndDateType</code>
     *            value is <code>limited</code>.
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
     * you explicitly cancel it. Do not provide an <code>EndDate</code> if the
     * <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at
     * a specified date and time. You must provide an <code>EndDate</code> value
     * if the <code>EndDateType</code> value is <code>limited</code>.
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
     *            active until you explicitly cancel it. Do not provide an
     *            <code>EndDate</code> if the <code>EndDateType</code> is
     *            <code>unlimited</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>limited</code> - The Capacity Reservation expires
     *            automatically at a specified date and time. You must provide
     *            an <code>EndDate</code> value if the <code>EndDateType</code>
     *            value is <code>limited</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndDateType
     */
    public CreateCapacityReservationRequest withEndDateType(EndDateType endDateType) {
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
     * <code>open</code> - The Capacity Reservation automatically matches all
     * instances that have matching attributes (instance type, platform, and
     * Availability Zone). Instances that have matching attributes run in the
     * Capacity Reservation automatically without specifying any additional
     * parameters.
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
     * Default: <code>open</code>
     * </p>
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
     *         <code>open</code> - The Capacity Reservation automatically
     *         matches all instances that have matching attributes (instance
     *         type, platform, and Availability Zone). Instances that have
     *         matching attributes run in the Capacity Reservation automatically
     *         without specifying any additional parameters.
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
     *         <p>
     *         Default: <code>open</code>
     *         </p>
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
     * <code>open</code> - The Capacity Reservation automatically matches all
     * instances that have matching attributes (instance type, platform, and
     * Availability Zone). Instances that have matching attributes run in the
     * Capacity Reservation automatically without specifying any additional
     * parameters.
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
     * Default: <code>open</code>
     * </p>
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
     *            <code>open</code> - The Capacity Reservation automatically
     *            matches all instances that have matching attributes (instance
     *            type, platform, and Availability Zone). Instances that have
     *            matching attributes run in the Capacity Reservation
     *            automatically without specifying any additional parameters.
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
     *            <p>
     *            Default: <code>open</code>
     *            </p>
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
     * <code>open</code> - The Capacity Reservation automatically matches all
     * instances that have matching attributes (instance type, platform, and
     * Availability Zone). Instances that have matching attributes run in the
     * Capacity Reservation automatically without specifying any additional
     * parameters.
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
     * Default: <code>open</code>
     * </p>
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
     *            <code>open</code> - The Capacity Reservation automatically
     *            matches all instances that have matching attributes (instance
     *            type, platform, and Availability Zone). Instances that have
     *            matching attributes run in the Capacity Reservation
     *            automatically without specifying any additional parameters.
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
     *            <p>
     *            Default: <code>open</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceMatchCriteria
     */
    public CreateCapacityReservationRequest withInstanceMatchCriteria(String instanceMatchCriteria) {
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
     * <code>open</code> - The Capacity Reservation automatically matches all
     * instances that have matching attributes (instance type, platform, and
     * Availability Zone). Instances that have matching attributes run in the
     * Capacity Reservation automatically without specifying any additional
     * parameters.
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
     * Default: <code>open</code>
     * </p>
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
     *            <code>open</code> - The Capacity Reservation automatically
     *            matches all instances that have matching attributes (instance
     *            type, platform, and Availability Zone). Instances that have
     *            matching attributes run in the Capacity Reservation
     *            automatically without specifying any additional parameters.
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
     *            <p>
     *            Default: <code>open</code>
     *            </p>
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
     * <code>open</code> - The Capacity Reservation automatically matches all
     * instances that have matching attributes (instance type, platform, and
     * Availability Zone). Instances that have matching attributes run in the
     * Capacity Reservation automatically without specifying any additional
     * parameters.
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
     * Default: <code>open</code>
     * </p>
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
     *            <code>open</code> - The Capacity Reservation automatically
     *            matches all instances that have matching attributes (instance
     *            type, platform, and Availability Zone). Instances that have
     *            matching attributes run in the Capacity Reservation
     *            automatically without specifying any additional parameters.
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
     *            <p>
     *            Default: <code>open</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceMatchCriteria
     */
    public CreateCapacityReservationRequest withInstanceMatchCriteria(
            InstanceMatchCriteria instanceMatchCriteria) {
        this.instanceMatchCriteria = instanceMatchCriteria.toString();
        return this;
    }

    /**
     * <p>
     * The tags to apply to the Capacity Reservation during launch.
     * </p>
     *
     * @return <p>
     *         The tags to apply to the Capacity Reservation during launch.
     *         </p>
     */
    public java.util.List<TagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the Capacity Reservation during launch.
     * </p>
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the Capacity Reservation during launch.
     *            </p>
     */
    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new java.util.ArrayList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the Capacity Reservation during launch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the Capacity Reservation during launch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCapacityReservationRequest withTagSpecifications(
            TagSpecification... tagSpecifications) {
        if (getTagSpecifications() == null) {
            this.tagSpecifications = new java.util.ArrayList<TagSpecification>(
                    tagSpecifications.length);
        }
        for (TagSpecification value : tagSpecifications) {
            this.tagSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the Capacity Reservation during launch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the Capacity Reservation during launch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCapacityReservationRequest withTagSpecifications(
            java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
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
    public CreateCapacityReservationRequest withDryRun(Boolean dryRun) {
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
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getInstancePlatform() != null)
            sb.append("InstancePlatform: " + getInstancePlatform() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: " + getAvailabilityZoneId() + ",");
        if (getTenancy() != null)
            sb.append("Tenancy: " + getTenancy() + ",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: " + getEbsOptimized() + ",");
        if (getEphemeralStorage() != null)
            sb.append("EphemeralStorage: " + getEphemeralStorage() + ",");
        if (getEndDate() != null)
            sb.append("EndDate: " + getEndDate() + ",");
        if (getEndDateType() != null)
            sb.append("EndDateType: " + getEndDateType() + ",");
        if (getInstanceMatchCriteria() != null)
            sb.append("InstanceMatchCriteria: " + getInstanceMatchCriteria() + ",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: " + getTagSpecifications() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getInstancePlatform() == null) ? 0 : getInstancePlatform().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode
                + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode
                + ((getEphemeralStorage() == null) ? 0 : getEphemeralStorage().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode
                + ((getEndDateType() == null) ? 0 : getEndDateType().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceMatchCriteria() == null) ? 0 : getInstanceMatchCriteria().hashCode());
        hashCode = prime * hashCode
                + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCapacityReservationRequest == false)
            return false;
        CreateCapacityReservationRequest other = (CreateCapacityReservationRequest) obj;

        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
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
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null
                && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
            return false;
        if (other.getTenancy() == null ^ this.getTenancy() == null)
            return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null
                && other.getInstanceCount().equals(this.getInstanceCount()) == false)
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
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null
                && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
