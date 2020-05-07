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
 * Describes the properties of the Dedicated Host.
 * </p>
 */
public class Host implements Serializable {
    /**
     * <p>
     * Whether auto-placement is on or off.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     */
    private String autoPlacement;

    /**
     * <p>
     * The Availability Zone of the Dedicated Host.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * Information about the instances running on the Dedicated Host.
     * </p>
     */
    private AvailableCapacity availableCapacity;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the Dedicated Host.
     * </p>
     */
    private String hostId;

    /**
     * <p>
     * The hardware specifications of the Dedicated Host.
     * </p>
     */
    private HostProperties hostProperties;

    /**
     * <p>
     * The reservation ID of the Dedicated Host. This returns a
     * <code>null</code> response if the Dedicated Host doesn't have an
     * associated reservation.
     * </p>
     */
    private String hostReservationId;

    /**
     * <p>
     * The IDs and instance type that are currently running on the Dedicated
     * Host.
     * </p>
     */
    private java.util.List<HostInstance> instances;

    /**
     * <p>
     * The Dedicated Host's state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, under-assessment, permanent-failure,
     * released, released-permanent-failure, pending
     */
    private String state;

    /**
     * <p>
     * The time that the Dedicated Host was allocated.
     * </p>
     */
    private java.util.Date allocationTime;

    /**
     * <p>
     * The time that the Dedicated Host was released.
     * </p>
     */
    private java.util.Date releaseTime;

    /**
     * <p>
     * Any tags assigned to the Dedicated Host.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Indicates whether host recovery is enabled or disabled for the Dedicated
     * Host.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     */
    private String hostRecovery;

    /**
     * <p>
     * Indicates whether the Dedicated Host supports multiple instance types of
     * the same instance family, or a specific instance type only.
     * <code>one</code> indicates that the Dedicated Host supports multiple
     * instance types in the instance family. <code>off</code> indicates that
     * the Dedicated Host supports a single instance type only.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     */
    private String allowsMultipleInstanceTypes;

    /**
     * <p>
     * The ID of the AWS account that owns the Dedicated Host.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * The ID of the Availability Zone in which the Dedicated Host is allocated.
     * </p>
     */
    private String availabilityZoneId;

    /**
     * <p>
     * Indicates whether the Dedicated Host is in a host resource group. If
     * <b>memberOfServiceLinkedResourceGroup</b> is <code>true</code>, the host
     * is in a host resource group; otherwise, it is not.
     * </p>
     */
    private Boolean memberOfServiceLinkedResourceGroup;

    /**
     * <p>
     * Whether auto-placement is on or off.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @return <p>
     *         Whether auto-placement is on or off.
     *         </p>
     * @see AutoPlacement
     */
    public String getAutoPlacement() {
        return autoPlacement;
    }

    /**
     * <p>
     * Whether auto-placement is on or off.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement <p>
     *            Whether auto-placement is on or off.
     *            </p>
     * @see AutoPlacement
     */
    public void setAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
    }

    /**
     * <p>
     * Whether auto-placement is on or off.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement <p>
     *            Whether auto-placement is on or off.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoPlacement
     */
    public Host withAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
        return this;
    }

    /**
     * <p>
     * Whether auto-placement is on or off.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement <p>
     *            Whether auto-placement is on or off.
     *            </p>
     * @see AutoPlacement
     */
    public void setAutoPlacement(AutoPlacement autoPlacement) {
        this.autoPlacement = autoPlacement.toString();
    }

    /**
     * <p>
     * Whether auto-placement is on or off.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement <p>
     *            Whether auto-placement is on or off.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoPlacement
     */
    public Host withAutoPlacement(AutoPlacement autoPlacement) {
        this.autoPlacement = autoPlacement.toString();
        return this;
    }

    /**
     * <p>
     * The Availability Zone of the Dedicated Host.
     * </p>
     *
     * @return <p>
     *         The Availability Zone of the Dedicated Host.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the Dedicated Host.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone of the Dedicated Host.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the Dedicated Host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone of the Dedicated Host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Host withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * Information about the instances running on the Dedicated Host.
     * </p>
     *
     * @return <p>
     *         Information about the instances running on the Dedicated Host.
     *         </p>
     */
    public AvailableCapacity getAvailableCapacity() {
        return availableCapacity;
    }

    /**
     * <p>
     * Information about the instances running on the Dedicated Host.
     * </p>
     *
     * @param availableCapacity <p>
     *            Information about the instances running on the Dedicated Host.
     *            </p>
     */
    public void setAvailableCapacity(AvailableCapacity availableCapacity) {
        this.availableCapacity = availableCapacity;
    }

    /**
     * <p>
     * Information about the instances running on the Dedicated Host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availableCapacity <p>
     *            Information about the instances running on the Dedicated Host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Host withAvailableCapacity(AvailableCapacity availableCapacity) {
        this.availableCapacity = availableCapacity;
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that you provide to ensure the
     *         idempotency of the request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *         >How to Ensure Idempotency</a>.
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
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Host withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The ID of the Dedicated Host.
     * </p>
     *
     * @return <p>
     *         The ID of the Dedicated Host.
     *         </p>
     */
    public String getHostId() {
        return hostId;
    }

    /**
     * <p>
     * The ID of the Dedicated Host.
     * </p>
     *
     * @param hostId <p>
     *            The ID of the Dedicated Host.
     *            </p>
     */
    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    /**
     * <p>
     * The ID of the Dedicated Host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostId <p>
     *            The ID of the Dedicated Host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Host withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * <p>
     * The hardware specifications of the Dedicated Host.
     * </p>
     *
     * @return <p>
     *         The hardware specifications of the Dedicated Host.
     *         </p>
     */
    public HostProperties getHostProperties() {
        return hostProperties;
    }

    /**
     * <p>
     * The hardware specifications of the Dedicated Host.
     * </p>
     *
     * @param hostProperties <p>
     *            The hardware specifications of the Dedicated Host.
     *            </p>
     */
    public void setHostProperties(HostProperties hostProperties) {
        this.hostProperties = hostProperties;
    }

    /**
     * <p>
     * The hardware specifications of the Dedicated Host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostProperties <p>
     *            The hardware specifications of the Dedicated Host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Host withHostProperties(HostProperties hostProperties) {
        this.hostProperties = hostProperties;
        return this;
    }

    /**
     * <p>
     * The reservation ID of the Dedicated Host. This returns a
     * <code>null</code> response if the Dedicated Host doesn't have an
     * associated reservation.
     * </p>
     *
     * @return <p>
     *         The reservation ID of the Dedicated Host. This returns a
     *         <code>null</code> response if the Dedicated Host doesn't have an
     *         associated reservation.
     *         </p>
     */
    public String getHostReservationId() {
        return hostReservationId;
    }

    /**
     * <p>
     * The reservation ID of the Dedicated Host. This returns a
     * <code>null</code> response if the Dedicated Host doesn't have an
     * associated reservation.
     * </p>
     *
     * @param hostReservationId <p>
     *            The reservation ID of the Dedicated Host. This returns a
     *            <code>null</code> response if the Dedicated Host doesn't have
     *            an associated reservation.
     *            </p>
     */
    public void setHostReservationId(String hostReservationId) {
        this.hostReservationId = hostReservationId;
    }

    /**
     * <p>
     * The reservation ID of the Dedicated Host. This returns a
     * <code>null</code> response if the Dedicated Host doesn't have an
     * associated reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostReservationId <p>
     *            The reservation ID of the Dedicated Host. This returns a
     *            <code>null</code> response if the Dedicated Host doesn't have
     *            an associated reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Host withHostReservationId(String hostReservationId) {
        this.hostReservationId = hostReservationId;
        return this;
    }

    /**
     * <p>
     * The IDs and instance type that are currently running on the Dedicated
     * Host.
     * </p>
     *
     * @return <p>
     *         The IDs and instance type that are currently running on the
     *         Dedicated Host.
     *         </p>
     */
    public java.util.List<HostInstance> getInstances() {
        return instances;
    }

    /**
     * <p>
     * The IDs and instance type that are currently running on the Dedicated
     * Host.
     * </p>
     *
     * @param instances <p>
     *            The IDs and instance type that are currently running on the
     *            Dedicated Host.
     *            </p>
     */
    public void setInstances(java.util.Collection<HostInstance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<HostInstance>(instances);
    }

    /**
     * <p>
     * The IDs and instance type that are currently running on the Dedicated
     * Host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            The IDs and instance type that are currently running on the
     *            Dedicated Host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Host withInstances(HostInstance... instances) {
        if (getInstances() == null) {
            this.instances = new java.util.ArrayList<HostInstance>(instances.length);
        }
        for (HostInstance value : instances) {
            this.instances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs and instance type that are currently running on the Dedicated
     * Host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            The IDs and instance type that are currently running on the
     *            Dedicated Host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Host withInstances(java.util.Collection<HostInstance> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * The Dedicated Host's state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, under-assessment, permanent-failure,
     * released, released-permanent-failure, pending
     *
     * @return <p>
     *         The Dedicated Host's state.
     *         </p>
     * @see AllocationState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The Dedicated Host's state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, under-assessment, permanent-failure,
     * released, released-permanent-failure, pending
     *
     * @param state <p>
     *            The Dedicated Host's state.
     *            </p>
     * @see AllocationState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The Dedicated Host's state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, under-assessment, permanent-failure,
     * released, released-permanent-failure, pending
     *
     * @param state <p>
     *            The Dedicated Host's state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AllocationState
     */
    public Host withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The Dedicated Host's state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, under-assessment, permanent-failure,
     * released, released-permanent-failure, pending
     *
     * @param state <p>
     *            The Dedicated Host's state.
     *            </p>
     * @see AllocationState
     */
    public void setState(AllocationState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The Dedicated Host's state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, under-assessment, permanent-failure,
     * released, released-permanent-failure, pending
     *
     * @param state <p>
     *            The Dedicated Host's state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AllocationState
     */
    public Host withState(AllocationState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The time that the Dedicated Host was allocated.
     * </p>
     *
     * @return <p>
     *         The time that the Dedicated Host was allocated.
     *         </p>
     */
    public java.util.Date getAllocationTime() {
        return allocationTime;
    }

    /**
     * <p>
     * The time that the Dedicated Host was allocated.
     * </p>
     *
     * @param allocationTime <p>
     *            The time that the Dedicated Host was allocated.
     *            </p>
     */
    public void setAllocationTime(java.util.Date allocationTime) {
        this.allocationTime = allocationTime;
    }

    /**
     * <p>
     * The time that the Dedicated Host was allocated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocationTime <p>
     *            The time that the Dedicated Host was allocated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Host withAllocationTime(java.util.Date allocationTime) {
        this.allocationTime = allocationTime;
        return this;
    }

    /**
     * <p>
     * The time that the Dedicated Host was released.
     * </p>
     *
     * @return <p>
     *         The time that the Dedicated Host was released.
     *         </p>
     */
    public java.util.Date getReleaseTime() {
        return releaseTime;
    }

    /**
     * <p>
     * The time that the Dedicated Host was released.
     * </p>
     *
     * @param releaseTime <p>
     *            The time that the Dedicated Host was released.
     *            </p>
     */
    public void setReleaseTime(java.util.Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    /**
     * <p>
     * The time that the Dedicated Host was released.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param releaseTime <p>
     *            The time that the Dedicated Host was released.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Host withReleaseTime(java.util.Date releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the Dedicated Host.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the Dedicated Host.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the Dedicated Host.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the Dedicated Host.
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
     * Any tags assigned to the Dedicated Host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the Dedicated Host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Host withTags(Tag... tags) {
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
     * Any tags assigned to the Dedicated Host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the Dedicated Host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Host withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Indicates whether host recovery is enabled or disabled for the Dedicated
     * Host.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @return <p>
     *         Indicates whether host recovery is enabled or disabled for the
     *         Dedicated Host.
     *         </p>
     * @see HostRecovery
     */
    public String getHostRecovery() {
        return hostRecovery;
    }

    /**
     * <p>
     * Indicates whether host recovery is enabled or disabled for the Dedicated
     * Host.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param hostRecovery <p>
     *            Indicates whether host recovery is enabled or disabled for the
     *            Dedicated Host.
     *            </p>
     * @see HostRecovery
     */
    public void setHostRecovery(String hostRecovery) {
        this.hostRecovery = hostRecovery;
    }

    /**
     * <p>
     * Indicates whether host recovery is enabled or disabled for the Dedicated
     * Host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param hostRecovery <p>
     *            Indicates whether host recovery is enabled or disabled for the
     *            Dedicated Host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HostRecovery
     */
    public Host withHostRecovery(String hostRecovery) {
        this.hostRecovery = hostRecovery;
        return this;
    }

    /**
     * <p>
     * Indicates whether host recovery is enabled or disabled for the Dedicated
     * Host.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param hostRecovery <p>
     *            Indicates whether host recovery is enabled or disabled for the
     *            Dedicated Host.
     *            </p>
     * @see HostRecovery
     */
    public void setHostRecovery(HostRecovery hostRecovery) {
        this.hostRecovery = hostRecovery.toString();
    }

    /**
     * <p>
     * Indicates whether host recovery is enabled or disabled for the Dedicated
     * Host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param hostRecovery <p>
     *            Indicates whether host recovery is enabled or disabled for the
     *            Dedicated Host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HostRecovery
     */
    public Host withHostRecovery(HostRecovery hostRecovery) {
        this.hostRecovery = hostRecovery.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the Dedicated Host supports multiple instance types of
     * the same instance family, or a specific instance type only.
     * <code>one</code> indicates that the Dedicated Host supports multiple
     * instance types in the instance family. <code>off</code> indicates that
     * the Dedicated Host supports a single instance type only.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @return <p>
     *         Indicates whether the Dedicated Host supports multiple instance
     *         types of the same instance family, or a specific instance type
     *         only. <code>one</code> indicates that the Dedicated Host supports
     *         multiple instance types in the instance family. <code>off</code>
     *         indicates that the Dedicated Host supports a single instance type
     *         only.
     *         </p>
     * @see AllowsMultipleInstanceTypes
     */
    public String getAllowsMultipleInstanceTypes() {
        return allowsMultipleInstanceTypes;
    }

    /**
     * <p>
     * Indicates whether the Dedicated Host supports multiple instance types of
     * the same instance family, or a specific instance type only.
     * <code>one</code> indicates that the Dedicated Host supports multiple
     * instance types in the instance family. <code>off</code> indicates that
     * the Dedicated Host supports a single instance type only.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param allowsMultipleInstanceTypes <p>
     *            Indicates whether the Dedicated Host supports multiple
     *            instance types of the same instance family, or a specific
     *            instance type only. <code>one</code> indicates that the
     *            Dedicated Host supports multiple instance types in the
     *            instance family. <code>off</code> indicates that the Dedicated
     *            Host supports a single instance type only.
     *            </p>
     * @see AllowsMultipleInstanceTypes
     */
    public void setAllowsMultipleInstanceTypes(String allowsMultipleInstanceTypes) {
        this.allowsMultipleInstanceTypes = allowsMultipleInstanceTypes;
    }

    /**
     * <p>
     * Indicates whether the Dedicated Host supports multiple instance types of
     * the same instance family, or a specific instance type only.
     * <code>one</code> indicates that the Dedicated Host supports multiple
     * instance types in the instance family. <code>off</code> indicates that
     * the Dedicated Host supports a single instance type only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param allowsMultipleInstanceTypes <p>
     *            Indicates whether the Dedicated Host supports multiple
     *            instance types of the same instance family, or a specific
     *            instance type only. <code>one</code> indicates that the
     *            Dedicated Host supports multiple instance types in the
     *            instance family. <code>off</code> indicates that the Dedicated
     *            Host supports a single instance type only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AllowsMultipleInstanceTypes
     */
    public Host withAllowsMultipleInstanceTypes(String allowsMultipleInstanceTypes) {
        this.allowsMultipleInstanceTypes = allowsMultipleInstanceTypes;
        return this;
    }

    /**
     * <p>
     * Indicates whether the Dedicated Host supports multiple instance types of
     * the same instance family, or a specific instance type only.
     * <code>one</code> indicates that the Dedicated Host supports multiple
     * instance types in the instance family. <code>off</code> indicates that
     * the Dedicated Host supports a single instance type only.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param allowsMultipleInstanceTypes <p>
     *            Indicates whether the Dedicated Host supports multiple
     *            instance types of the same instance family, or a specific
     *            instance type only. <code>one</code> indicates that the
     *            Dedicated Host supports multiple instance types in the
     *            instance family. <code>off</code> indicates that the Dedicated
     *            Host supports a single instance type only.
     *            </p>
     * @see AllowsMultipleInstanceTypes
     */
    public void setAllowsMultipleInstanceTypes(
            AllowsMultipleInstanceTypes allowsMultipleInstanceTypes) {
        this.allowsMultipleInstanceTypes = allowsMultipleInstanceTypes.toString();
    }

    /**
     * <p>
     * Indicates whether the Dedicated Host supports multiple instance types of
     * the same instance family, or a specific instance type only.
     * <code>one</code> indicates that the Dedicated Host supports multiple
     * instance types in the instance family. <code>off</code> indicates that
     * the Dedicated Host supports a single instance type only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param allowsMultipleInstanceTypes <p>
     *            Indicates whether the Dedicated Host supports multiple
     *            instance types of the same instance family, or a specific
     *            instance type only. <code>one</code> indicates that the
     *            Dedicated Host supports multiple instance types in the
     *            instance family. <code>off</code> indicates that the Dedicated
     *            Host supports a single instance type only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AllowsMultipleInstanceTypes
     */
    public Host withAllowsMultipleInstanceTypes(
            AllowsMultipleInstanceTypes allowsMultipleInstanceTypes) {
        this.allowsMultipleInstanceTypes = allowsMultipleInstanceTypes.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Dedicated Host.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the Dedicated Host.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Dedicated Host.
     * </p>
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the Dedicated Host.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Dedicated Host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the Dedicated Host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Host withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * The ID of the Availability Zone in which the Dedicated Host is allocated.
     * </p>
     *
     * @return <p>
     *         The ID of the Availability Zone in which the Dedicated Host is
     *         allocated.
     *         </p>
     */
    public String getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    /**
     * <p>
     * The ID of the Availability Zone in which the Dedicated Host is allocated.
     * </p>
     *
     * @param availabilityZoneId <p>
     *            The ID of the Availability Zone in which the Dedicated Host is
     *            allocated.
     *            </p>
     */
    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    /**
     * <p>
     * The ID of the Availability Zone in which the Dedicated Host is allocated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZoneId <p>
     *            The ID of the Availability Zone in which the Dedicated Host is
     *            allocated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Host withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    /**
     * <p>
     * Indicates whether the Dedicated Host is in a host resource group. If
     * <b>memberOfServiceLinkedResourceGroup</b> is <code>true</code>, the host
     * is in a host resource group; otherwise, it is not.
     * </p>
     *
     * @return <p>
     *         Indicates whether the Dedicated Host is in a host resource group.
     *         If <b>memberOfServiceLinkedResourceGroup</b> is <code>true</code>
     *         , the host is in a host resource group; otherwise, it is not.
     *         </p>
     */
    public Boolean isMemberOfServiceLinkedResourceGroup() {
        return memberOfServiceLinkedResourceGroup;
    }

    /**
     * <p>
     * Indicates whether the Dedicated Host is in a host resource group. If
     * <b>memberOfServiceLinkedResourceGroup</b> is <code>true</code>, the host
     * is in a host resource group; otherwise, it is not.
     * </p>
     *
     * @return <p>
     *         Indicates whether the Dedicated Host is in a host resource group.
     *         If <b>memberOfServiceLinkedResourceGroup</b> is <code>true</code>
     *         , the host is in a host resource group; otherwise, it is not.
     *         </p>
     */
    public Boolean getMemberOfServiceLinkedResourceGroup() {
        return memberOfServiceLinkedResourceGroup;
    }

    /**
     * <p>
     * Indicates whether the Dedicated Host is in a host resource group. If
     * <b>memberOfServiceLinkedResourceGroup</b> is <code>true</code>, the host
     * is in a host resource group; otherwise, it is not.
     * </p>
     *
     * @param memberOfServiceLinkedResourceGroup <p>
     *            Indicates whether the Dedicated Host is in a host resource
     *            group. If <b>memberOfServiceLinkedResourceGroup</b> is
     *            <code>true</code>, the host is in a host resource group;
     *            otherwise, it is not.
     *            </p>
     */
    public void setMemberOfServiceLinkedResourceGroup(Boolean memberOfServiceLinkedResourceGroup) {
        this.memberOfServiceLinkedResourceGroup = memberOfServiceLinkedResourceGroup;
    }

    /**
     * <p>
     * Indicates whether the Dedicated Host is in a host resource group. If
     * <b>memberOfServiceLinkedResourceGroup</b> is <code>true</code>, the host
     * is in a host resource group; otherwise, it is not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memberOfServiceLinkedResourceGroup <p>
     *            Indicates whether the Dedicated Host is in a host resource
     *            group. If <b>memberOfServiceLinkedResourceGroup</b> is
     *            <code>true</code>, the host is in a host resource group;
     *            otherwise, it is not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Host withMemberOfServiceLinkedResourceGroup(Boolean memberOfServiceLinkedResourceGroup) {
        this.memberOfServiceLinkedResourceGroup = memberOfServiceLinkedResourceGroup;
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
        if (getAutoPlacement() != null)
            sb.append("AutoPlacement: " + getAutoPlacement() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getAvailableCapacity() != null)
            sb.append("AvailableCapacity: " + getAvailableCapacity() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getHostId() != null)
            sb.append("HostId: " + getHostId() + ",");
        if (getHostProperties() != null)
            sb.append("HostProperties: " + getHostProperties() + ",");
        if (getHostReservationId() != null)
            sb.append("HostReservationId: " + getHostReservationId() + ",");
        if (getInstances() != null)
            sb.append("Instances: " + getInstances() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getAllocationTime() != null)
            sb.append("AllocationTime: " + getAllocationTime() + ",");
        if (getReleaseTime() != null)
            sb.append("ReleaseTime: " + getReleaseTime() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getHostRecovery() != null)
            sb.append("HostRecovery: " + getHostRecovery() + ",");
        if (getAllowsMultipleInstanceTypes() != null)
            sb.append("AllowsMultipleInstanceTypes: " + getAllowsMultipleInstanceTypes() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: " + getAvailabilityZoneId() + ",");
        if (getMemberOfServiceLinkedResourceGroup() != null)
            sb.append("MemberOfServiceLinkedResourceGroup: "
                    + getMemberOfServiceLinkedResourceGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoPlacement() == null) ? 0 : getAutoPlacement().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getAvailableCapacity() == null) ? 0 : getAvailableCapacity().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getHostId() == null) ? 0 : getHostId().hashCode());
        hashCode = prime * hashCode
                + ((getHostProperties() == null) ? 0 : getHostProperties().hashCode());
        hashCode = prime * hashCode
                + ((getHostReservationId() == null) ? 0 : getHostReservationId().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getAllocationTime() == null) ? 0 : getAllocationTime().hashCode());
        hashCode = prime * hashCode
                + ((getReleaseTime() == null) ? 0 : getReleaseTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getHostRecovery() == null) ? 0 : getHostRecovery().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowsMultipleInstanceTypes() == null) ? 0
                        : getAllowsMultipleInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime
                * hashCode
                + ((getMemberOfServiceLinkedResourceGroup() == null) ? 0
                        : getMemberOfServiceLinkedResourceGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Host == false)
            return false;
        Host other = (Host) obj;

        if (other.getAutoPlacement() == null ^ this.getAutoPlacement() == null)
            return false;
        if (other.getAutoPlacement() != null
                && other.getAutoPlacement().equals(this.getAutoPlacement()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getAvailableCapacity() == null ^ this.getAvailableCapacity() == null)
            return false;
        if (other.getAvailableCapacity() != null
                && other.getAvailableCapacity().equals(this.getAvailableCapacity()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getHostId() == null ^ this.getHostId() == null)
            return false;
        if (other.getHostId() != null && other.getHostId().equals(this.getHostId()) == false)
            return false;
        if (other.getHostProperties() == null ^ this.getHostProperties() == null)
            return false;
        if (other.getHostProperties() != null
                && other.getHostProperties().equals(this.getHostProperties()) == false)
            return false;
        if (other.getHostReservationId() == null ^ this.getHostReservationId() == null)
            return false;
        if (other.getHostReservationId() != null
                && other.getHostReservationId().equals(this.getHostReservationId()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null
                && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getAllocationTime() == null ^ this.getAllocationTime() == null)
            return false;
        if (other.getAllocationTime() != null
                && other.getAllocationTime().equals(this.getAllocationTime()) == false)
            return false;
        if (other.getReleaseTime() == null ^ this.getReleaseTime() == null)
            return false;
        if (other.getReleaseTime() != null
                && other.getReleaseTime().equals(this.getReleaseTime()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getHostRecovery() == null ^ this.getHostRecovery() == null)
            return false;
        if (other.getHostRecovery() != null
                && other.getHostRecovery().equals(this.getHostRecovery()) == false)
            return false;
        if (other.getAllowsMultipleInstanceTypes() == null
                ^ this.getAllowsMultipleInstanceTypes() == null)
            return false;
        if (other.getAllowsMultipleInstanceTypes() != null
                && other.getAllowsMultipleInstanceTypes().equals(
                        this.getAllowsMultipleInstanceTypes()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null
                && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
            return false;
        if (other.getMemberOfServiceLinkedResourceGroup() == null
                ^ this.getMemberOfServiceLinkedResourceGroup() == null)
            return false;
        if (other.getMemberOfServiceLinkedResourceGroup() != null
                && other.getMemberOfServiceLinkedResourceGroup().equals(
                        this.getMemberOfServiceLinkedResourceGroup()) == false)
            return false;
        return true;
    }
}
