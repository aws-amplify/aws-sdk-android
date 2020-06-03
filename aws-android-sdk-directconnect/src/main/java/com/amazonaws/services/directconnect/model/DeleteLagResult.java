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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a link aggregation group (LAG).
 * </p>
 */
public class DeleteLagResult implements Serializable {
    /**
     * <p>
     * The individual bandwidth of the physical connections bundled by the LAG.
     * The possible values are 1Gbps and 10Gbps.
     * </p>
     */
    private String connectionsBandwidth;

    /**
     * <p>
     * The number of physical connections bundled by the LAG, up to a maximum of
     * 10.
     * </p>
     */
    private Integer numberOfConnections;

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     */
    private String lagId;

    /**
     * <p>
     * The ID of the AWS account that owns the LAG.
     * </p>
     */
    private String ownerAccount;

    /**
     * <p>
     * The name of the LAG.
     * </p>
     */
    private String lagName;

    /**
     * <p>
     * The state of the LAG. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a LAG. The LAG stays in the
     * requested state until the Letter of Authorization (LOA) is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The LAG has been approved and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is established and the LAG is
     * ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The LAG is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The LAG is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the LAG is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting,
     * deleted, unknown
     */
    private String lagState;

    /**
     * <p>
     * The location of the LAG.
     * </p>
     */
    private String location;

    /**
     * <p>
     * The AWS Region where the connection is located.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The minimum number of physical connections that must be operational for
     * the LAG itself to be operational.
     * </p>
     */
    private Integer minimumLinks;

    /**
     * <p>
     * The AWS Direct Connect endpoint that hosts the LAG.
     * </p>
     */
    private String awsDevice;

    /**
     * <p>
     * The AWS Direct Connect endpoint that hosts the LAG.
     * </p>
     */
    private String awsDeviceV2;

    /**
     * <p>
     * The connections bundled by the LAG.
     * </p>
     */
    private java.util.List<Connection> connections;

    /**
     * <p>
     * Indicates whether the LAG can host other connections.
     * </p>
     */
    private Boolean allowsHostedConnections;

    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     */
    private Boolean jumboFrameCapable;

    /**
     * <p>
     * Indicates whether the LAG supports a secondary BGP peer in the same
     * address family (IPv4/IPv6).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unknown, yes, no
     */
    private String hasLogicalRedundancy;

    /**
     * <p>
     * The tags associated with the LAG.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the service provider associated with the LAG.
     * </p>
     */
    private String providerName;

    /**
     * <p>
     * The individual bandwidth of the physical connections bundled by the LAG.
     * The possible values are 1Gbps and 10Gbps.
     * </p>
     *
     * @return <p>
     *         The individual bandwidth of the physical connections bundled by
     *         the LAG. The possible values are 1Gbps and 10Gbps.
     *         </p>
     */
    public String getConnectionsBandwidth() {
        return connectionsBandwidth;
    }

    /**
     * <p>
     * The individual bandwidth of the physical connections bundled by the LAG.
     * The possible values are 1Gbps and 10Gbps.
     * </p>
     *
     * @param connectionsBandwidth <p>
     *            The individual bandwidth of the physical connections bundled
     *            by the LAG. The possible values are 1Gbps and 10Gbps.
     *            </p>
     */
    public void setConnectionsBandwidth(String connectionsBandwidth) {
        this.connectionsBandwidth = connectionsBandwidth;
    }

    /**
     * <p>
     * The individual bandwidth of the physical connections bundled by the LAG.
     * The possible values are 1Gbps and 10Gbps.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionsBandwidth <p>
     *            The individual bandwidth of the physical connections bundled
     *            by the LAG. The possible values are 1Gbps and 10Gbps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLagResult withConnectionsBandwidth(String connectionsBandwidth) {
        this.connectionsBandwidth = connectionsBandwidth;
        return this;
    }

    /**
     * <p>
     * The number of physical connections bundled by the LAG, up to a maximum of
     * 10.
     * </p>
     *
     * @return <p>
     *         The number of physical connections bundled by the LAG, up to a
     *         maximum of 10.
     *         </p>
     */
    public Integer getNumberOfConnections() {
        return numberOfConnections;
    }

    /**
     * <p>
     * The number of physical connections bundled by the LAG, up to a maximum of
     * 10.
     * </p>
     *
     * @param numberOfConnections <p>
     *            The number of physical connections bundled by the LAG, up to a
     *            maximum of 10.
     *            </p>
     */
    public void setNumberOfConnections(Integer numberOfConnections) {
        this.numberOfConnections = numberOfConnections;
    }

    /**
     * <p>
     * The number of physical connections bundled by the LAG, up to a maximum of
     * 10.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfConnections <p>
     *            The number of physical connections bundled by the LAG, up to a
     *            maximum of 10.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLagResult withNumberOfConnections(Integer numberOfConnections) {
        this.numberOfConnections = numberOfConnections;
        return this;
    }

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     *
     * @return <p>
     *         The ID of the LAG.
     *         </p>
     */
    public String getLagId() {
        return lagId;
    }

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     *
     * @param lagId <p>
     *            The ID of the LAG.
     *            </p>
     */
    public void setLagId(String lagId) {
        this.lagId = lagId;
    }

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lagId <p>
     *            The ID of the LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLagResult withLagId(String lagId) {
        this.lagId = lagId;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the LAG.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the LAG.
     *         </p>
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the LAG.
     * </p>
     *
     * @param ownerAccount <p>
     *            The ID of the AWS account that owns the LAG.
     *            </p>
     */
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerAccount <p>
     *            The ID of the AWS account that owns the LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLagResult withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }

    /**
     * <p>
     * The name of the LAG.
     * </p>
     *
     * @return <p>
     *         The name of the LAG.
     *         </p>
     */
    public String getLagName() {
        return lagName;
    }

    /**
     * <p>
     * The name of the LAG.
     * </p>
     *
     * @param lagName <p>
     *            The name of the LAG.
     *            </p>
     */
    public void setLagName(String lagName) {
        this.lagName = lagName;
    }

    /**
     * <p>
     * The name of the LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lagName <p>
     *            The name of the LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLagResult withLagName(String lagName) {
        this.lagName = lagName;
        return this;
    }

    /**
     * <p>
     * The state of the LAG. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a LAG. The LAG stays in the
     * requested state until the Letter of Authorization (LOA) is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The LAG has been approved and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is established and the LAG is
     * ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The LAG is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The LAG is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the LAG is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting,
     * deleted, unknown
     *
     * @return <p>
     *         The state of the LAG. The following are the possible values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>requested</code>: The initial state of a LAG. The LAG stays
     *         in the requested state until the Letter of Authorization (LOA) is
     *         available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code>: The LAG has been approved and is being
     *         initialized.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available</code>: The network link is established and the
     *         LAG is ready for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>down</code>: The network link is down.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>: The LAG is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code>: The LAG is deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unknown</code>: The state of the LAG is not available.
     *         </p>
     *         </li>
     *         </ul>
     * @see LagState
     */
    public String getLagState() {
        return lagState;
    }

    /**
     * <p>
     * The state of the LAG. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a LAG. The LAG stays in the
     * requested state until the Letter of Authorization (LOA) is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The LAG has been approved and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is established and the LAG is
     * ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The LAG is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The LAG is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the LAG is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting,
     * deleted, unknown
     *
     * @param lagState <p>
     *            The state of the LAG. The following are the possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>requested</code>: The initial state of a LAG. The LAG
     *            stays in the requested state until the Letter of Authorization
     *            (LOA) is available.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: The LAG has been approved and is being
     *            initialized.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: The network link is established and
     *            the LAG is ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: The network link is down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: The LAG is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The LAG is deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The state of the LAG is not available.
     *            </p>
     *            </li>
     *            </ul>
     * @see LagState
     */
    public void setLagState(String lagState) {
        this.lagState = lagState;
    }

    /**
     * <p>
     * The state of the LAG. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a LAG. The LAG stays in the
     * requested state until the Letter of Authorization (LOA) is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The LAG has been approved and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is established and the LAG is
     * ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The LAG is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The LAG is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the LAG is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting,
     * deleted, unknown
     *
     * @param lagState <p>
     *            The state of the LAG. The following are the possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>requested</code>: The initial state of a LAG. The LAG
     *            stays in the requested state until the Letter of Authorization
     *            (LOA) is available.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: The LAG has been approved and is being
     *            initialized.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: The network link is established and
     *            the LAG is ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: The network link is down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: The LAG is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The LAG is deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The state of the LAG is not available.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LagState
     */
    public DeleteLagResult withLagState(String lagState) {
        this.lagState = lagState;
        return this;
    }

    /**
     * <p>
     * The state of the LAG. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a LAG. The LAG stays in the
     * requested state until the Letter of Authorization (LOA) is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The LAG has been approved and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is established and the LAG is
     * ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The LAG is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The LAG is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the LAG is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting,
     * deleted, unknown
     *
     * @param lagState <p>
     *            The state of the LAG. The following are the possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>requested</code>: The initial state of a LAG. The LAG
     *            stays in the requested state until the Letter of Authorization
     *            (LOA) is available.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: The LAG has been approved and is being
     *            initialized.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: The network link is established and
     *            the LAG is ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: The network link is down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: The LAG is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The LAG is deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The state of the LAG is not available.
     *            </p>
     *            </li>
     *            </ul>
     * @see LagState
     */
    public void setLagState(LagState lagState) {
        this.lagState = lagState.toString();
    }

    /**
     * <p>
     * The state of the LAG. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a LAG. The LAG stays in the
     * requested state until the Letter of Authorization (LOA) is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The LAG has been approved and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is established and the LAG is
     * ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The LAG is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The LAG is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the LAG is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting,
     * deleted, unknown
     *
     * @param lagState <p>
     *            The state of the LAG. The following are the possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>requested</code>: The initial state of a LAG. The LAG
     *            stays in the requested state until the Letter of Authorization
     *            (LOA) is available.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: The LAG has been approved and is being
     *            initialized.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: The network link is established and
     *            the LAG is ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: The network link is down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: The LAG is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The LAG is deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The state of the LAG is not available.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LagState
     */
    public DeleteLagResult withLagState(LagState lagState) {
        this.lagState = lagState.toString();
        return this;
    }

    /**
     * <p>
     * The location of the LAG.
     * </p>
     *
     * @return <p>
     *         The location of the LAG.
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The location of the LAG.
     * </p>
     *
     * @param location <p>
     *            The location of the LAG.
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The location of the LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLagResult withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The AWS Region where the connection is located.
     * </p>
     *
     * @return <p>
     *         The AWS Region where the connection is located.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The AWS Region where the connection is located.
     * </p>
     *
     * @param region <p>
     *            The AWS Region where the connection is located.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region where the connection is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param region <p>
     *            The AWS Region where the connection is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLagResult withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * The minimum number of physical connections that must be operational for
     * the LAG itself to be operational.
     * </p>
     *
     * @return <p>
     *         The minimum number of physical connections that must be
     *         operational for the LAG itself to be operational.
     *         </p>
     */
    public Integer getMinimumLinks() {
        return minimumLinks;
    }

    /**
     * <p>
     * The minimum number of physical connections that must be operational for
     * the LAG itself to be operational.
     * </p>
     *
     * @param minimumLinks <p>
     *            The minimum number of physical connections that must be
     *            operational for the LAG itself to be operational.
     *            </p>
     */
    public void setMinimumLinks(Integer minimumLinks) {
        this.minimumLinks = minimumLinks;
    }

    /**
     * <p>
     * The minimum number of physical connections that must be operational for
     * the LAG itself to be operational.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minimumLinks <p>
     *            The minimum number of physical connections that must be
     *            operational for the LAG itself to be operational.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLagResult withMinimumLinks(Integer minimumLinks) {
        this.minimumLinks = minimumLinks;
        return this;
    }

    /**
     * <p>
     * The AWS Direct Connect endpoint that hosts the LAG.
     * </p>
     *
     * @return <p>
     *         The AWS Direct Connect endpoint that hosts the LAG.
     *         </p>
     */
    public String getAwsDevice() {
        return awsDevice;
    }

    /**
     * <p>
     * The AWS Direct Connect endpoint that hosts the LAG.
     * </p>
     *
     * @param awsDevice <p>
     *            The AWS Direct Connect endpoint that hosts the LAG.
     *            </p>
     */
    public void setAwsDevice(String awsDevice) {
        this.awsDevice = awsDevice;
    }

    /**
     * <p>
     * The AWS Direct Connect endpoint that hosts the LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsDevice <p>
     *            The AWS Direct Connect endpoint that hosts the LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLagResult withAwsDevice(String awsDevice) {
        this.awsDevice = awsDevice;
        return this;
    }

    /**
     * <p>
     * The AWS Direct Connect endpoint that hosts the LAG.
     * </p>
     *
     * @return <p>
     *         The AWS Direct Connect endpoint that hosts the LAG.
     *         </p>
     */
    public String getAwsDeviceV2() {
        return awsDeviceV2;
    }

    /**
     * <p>
     * The AWS Direct Connect endpoint that hosts the LAG.
     * </p>
     *
     * @param awsDeviceV2 <p>
     *            The AWS Direct Connect endpoint that hosts the LAG.
     *            </p>
     */
    public void setAwsDeviceV2(String awsDeviceV2) {
        this.awsDeviceV2 = awsDeviceV2;
    }

    /**
     * <p>
     * The AWS Direct Connect endpoint that hosts the LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsDeviceV2 <p>
     *            The AWS Direct Connect endpoint that hosts the LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLagResult withAwsDeviceV2(String awsDeviceV2) {
        this.awsDeviceV2 = awsDeviceV2;
        return this;
    }

    /**
     * <p>
     * The connections bundled by the LAG.
     * </p>
     *
     * @return <p>
     *         The connections bundled by the LAG.
     *         </p>
     */
    public java.util.List<Connection> getConnections() {
        return connections;
    }

    /**
     * <p>
     * The connections bundled by the LAG.
     * </p>
     *
     * @param connections <p>
     *            The connections bundled by the LAG.
     *            </p>
     */
    public void setConnections(java.util.Collection<Connection> connections) {
        if (connections == null) {
            this.connections = null;
            return;
        }

        this.connections = new java.util.ArrayList<Connection>(connections);
    }

    /**
     * <p>
     * The connections bundled by the LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connections <p>
     *            The connections bundled by the LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLagResult withConnections(Connection... connections) {
        if (getConnections() == null) {
            this.connections = new java.util.ArrayList<Connection>(connections.length);
        }
        for (Connection value : connections) {
            this.connections.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The connections bundled by the LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connections <p>
     *            The connections bundled by the LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLagResult withConnections(java.util.Collection<Connection> connections) {
        setConnections(connections);
        return this;
    }

    /**
     * <p>
     * Indicates whether the LAG can host other connections.
     * </p>
     *
     * @return <p>
     *         Indicates whether the LAG can host other connections.
     *         </p>
     */
    public Boolean isAllowsHostedConnections() {
        return allowsHostedConnections;
    }

    /**
     * <p>
     * Indicates whether the LAG can host other connections.
     * </p>
     *
     * @return <p>
     *         Indicates whether the LAG can host other connections.
     *         </p>
     */
    public Boolean getAllowsHostedConnections() {
        return allowsHostedConnections;
    }

    /**
     * <p>
     * Indicates whether the LAG can host other connections.
     * </p>
     *
     * @param allowsHostedConnections <p>
     *            Indicates whether the LAG can host other connections.
     *            </p>
     */
    public void setAllowsHostedConnections(Boolean allowsHostedConnections) {
        this.allowsHostedConnections = allowsHostedConnections;
    }

    /**
     * <p>
     * Indicates whether the LAG can host other connections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowsHostedConnections <p>
     *            Indicates whether the LAG can host other connections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLagResult withAllowsHostedConnections(Boolean allowsHostedConnections) {
        this.allowsHostedConnections = allowsHostedConnections;
        return this;
    }

    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     *
     * @return <p>
     *         Indicates whether jumbo frames (9001 MTU) are supported.
     *         </p>
     */
    public Boolean isJumboFrameCapable() {
        return jumboFrameCapable;
    }

    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     *
     * @return <p>
     *         Indicates whether jumbo frames (9001 MTU) are supported.
     *         </p>
     */
    public Boolean getJumboFrameCapable() {
        return jumboFrameCapable;
    }

    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     *
     * @param jumboFrameCapable <p>
     *            Indicates whether jumbo frames (9001 MTU) are supported.
     *            </p>
     */
    public void setJumboFrameCapable(Boolean jumboFrameCapable) {
        this.jumboFrameCapable = jumboFrameCapable;
    }

    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jumboFrameCapable <p>
     *            Indicates whether jumbo frames (9001 MTU) are supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLagResult withJumboFrameCapable(Boolean jumboFrameCapable) {
        this.jumboFrameCapable = jumboFrameCapable;
        return this;
    }

    /**
     * <p>
     * Indicates whether the LAG supports a secondary BGP peer in the same
     * address family (IPv4/IPv6).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unknown, yes, no
     *
     * @return <p>
     *         Indicates whether the LAG supports a secondary BGP peer in the
     *         same address family (IPv4/IPv6).
     *         </p>
     * @see HasLogicalRedundancy
     */
    public String getHasLogicalRedundancy() {
        return hasLogicalRedundancy;
    }

    /**
     * <p>
     * Indicates whether the LAG supports a secondary BGP peer in the same
     * address family (IPv4/IPv6).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unknown, yes, no
     *
     * @param hasLogicalRedundancy <p>
     *            Indicates whether the LAG supports a secondary BGP peer in the
     *            same address family (IPv4/IPv6).
     *            </p>
     * @see HasLogicalRedundancy
     */
    public void setHasLogicalRedundancy(String hasLogicalRedundancy) {
        this.hasLogicalRedundancy = hasLogicalRedundancy;
    }

    /**
     * <p>
     * Indicates whether the LAG supports a secondary BGP peer in the same
     * address family (IPv4/IPv6).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unknown, yes, no
     *
     * @param hasLogicalRedundancy <p>
     *            Indicates whether the LAG supports a secondary BGP peer in the
     *            same address family (IPv4/IPv6).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HasLogicalRedundancy
     */
    public DeleteLagResult withHasLogicalRedundancy(String hasLogicalRedundancy) {
        this.hasLogicalRedundancy = hasLogicalRedundancy;
        return this;
    }

    /**
     * <p>
     * Indicates whether the LAG supports a secondary BGP peer in the same
     * address family (IPv4/IPv6).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unknown, yes, no
     *
     * @param hasLogicalRedundancy <p>
     *            Indicates whether the LAG supports a secondary BGP peer in the
     *            same address family (IPv4/IPv6).
     *            </p>
     * @see HasLogicalRedundancy
     */
    public void setHasLogicalRedundancy(HasLogicalRedundancy hasLogicalRedundancy) {
        this.hasLogicalRedundancy = hasLogicalRedundancy.toString();
    }

    /**
     * <p>
     * Indicates whether the LAG supports a secondary BGP peer in the same
     * address family (IPv4/IPv6).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unknown, yes, no
     *
     * @param hasLogicalRedundancy <p>
     *            Indicates whether the LAG supports a secondary BGP peer in the
     *            same address family (IPv4/IPv6).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HasLogicalRedundancy
     */
    public DeleteLagResult withHasLogicalRedundancy(HasLogicalRedundancy hasLogicalRedundancy) {
        this.hasLogicalRedundancy = hasLogicalRedundancy.toString();
        return this;
    }

    /**
     * <p>
     * The tags associated with the LAG.
     * </p>
     *
     * @return <p>
     *         The tags associated with the LAG.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the LAG.
     * </p>
     *
     * @param tags <p>
     *            The tags associated with the LAG.
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
     * The tags associated with the LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLagResult withTags(Tag... tags) {
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
     * The tags associated with the LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLagResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the service provider associated with the LAG.
     * </p>
     *
     * @return <p>
     *         The name of the service provider associated with the LAG.
     *         </p>
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * <p>
     * The name of the service provider associated with the LAG.
     * </p>
     *
     * @param providerName <p>
     *            The name of the service provider associated with the LAG.
     *            </p>
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The name of the service provider associated with the LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param providerName <p>
     *            The name of the service provider associated with the LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLagResult withProviderName(String providerName) {
        this.providerName = providerName;
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
        if (getConnectionsBandwidth() != null)
            sb.append("connectionsBandwidth: " + getConnectionsBandwidth() + ",");
        if (getNumberOfConnections() != null)
            sb.append("numberOfConnections: " + getNumberOfConnections() + ",");
        if (getLagId() != null)
            sb.append("lagId: " + getLagId() + ",");
        if (getOwnerAccount() != null)
            sb.append("ownerAccount: " + getOwnerAccount() + ",");
        if (getLagName() != null)
            sb.append("lagName: " + getLagName() + ",");
        if (getLagState() != null)
            sb.append("lagState: " + getLagState() + ",");
        if (getLocation() != null)
            sb.append("location: " + getLocation() + ",");
        if (getRegion() != null)
            sb.append("region: " + getRegion() + ",");
        if (getMinimumLinks() != null)
            sb.append("minimumLinks: " + getMinimumLinks() + ",");
        if (getAwsDevice() != null)
            sb.append("awsDevice: " + getAwsDevice() + ",");
        if (getAwsDeviceV2() != null)
            sb.append("awsDeviceV2: " + getAwsDeviceV2() + ",");
        if (getConnections() != null)
            sb.append("connections: " + getConnections() + ",");
        if (getAllowsHostedConnections() != null)
            sb.append("allowsHostedConnections: " + getAllowsHostedConnections() + ",");
        if (getJumboFrameCapable() != null)
            sb.append("jumboFrameCapable: " + getJumboFrameCapable() + ",");
        if (getHasLogicalRedundancy() != null)
            sb.append("hasLogicalRedundancy: " + getHasLogicalRedundancy() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getProviderName() != null)
            sb.append("providerName: " + getProviderName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConnectionsBandwidth() == null) ? 0 : getConnectionsBandwidth().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfConnections() == null) ? 0 : getNumberOfConnections().hashCode());
        hashCode = prime * hashCode + ((getLagId() == null) ? 0 : getLagId().hashCode());
        hashCode = prime * hashCode
                + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getLagName() == null) ? 0 : getLagName().hashCode());
        hashCode = prime * hashCode + ((getLagState() == null) ? 0 : getLagState().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode
                + ((getMinimumLinks() == null) ? 0 : getMinimumLinks().hashCode());
        hashCode = prime * hashCode + ((getAwsDevice() == null) ? 0 : getAwsDevice().hashCode());
        hashCode = prime * hashCode
                + ((getAwsDeviceV2() == null) ? 0 : getAwsDeviceV2().hashCode());
        hashCode = prime * hashCode
                + ((getConnections() == null) ? 0 : getConnections().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowsHostedConnections() == null) ? 0 : getAllowsHostedConnections()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getJumboFrameCapable() == null) ? 0 : getJumboFrameCapable().hashCode());
        hashCode = prime * hashCode
                + ((getHasLogicalRedundancy() == null) ? 0 : getHasLogicalRedundancy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLagResult == false)
            return false;
        DeleteLagResult other = (DeleteLagResult) obj;

        if (other.getConnectionsBandwidth() == null ^ this.getConnectionsBandwidth() == null)
            return false;
        if (other.getConnectionsBandwidth() != null
                && other.getConnectionsBandwidth().equals(this.getConnectionsBandwidth()) == false)
            return false;
        if (other.getNumberOfConnections() == null ^ this.getNumberOfConnections() == null)
            return false;
        if (other.getNumberOfConnections() != null
                && other.getNumberOfConnections().equals(this.getNumberOfConnections()) == false)
            return false;
        if (other.getLagId() == null ^ this.getLagId() == null)
            return false;
        if (other.getLagId() != null && other.getLagId().equals(this.getLagId()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null
                && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getLagName() == null ^ this.getLagName() == null)
            return false;
        if (other.getLagName() != null && other.getLagName().equals(this.getLagName()) == false)
            return false;
        if (other.getLagState() == null ^ this.getLagState() == null)
            return false;
        if (other.getLagState() != null && other.getLagState().equals(this.getLagState()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getMinimumLinks() == null ^ this.getMinimumLinks() == null)
            return false;
        if (other.getMinimumLinks() != null
                && other.getMinimumLinks().equals(this.getMinimumLinks()) == false)
            return false;
        if (other.getAwsDevice() == null ^ this.getAwsDevice() == null)
            return false;
        if (other.getAwsDevice() != null
                && other.getAwsDevice().equals(this.getAwsDevice()) == false)
            return false;
        if (other.getAwsDeviceV2() == null ^ this.getAwsDeviceV2() == null)
            return false;
        if (other.getAwsDeviceV2() != null
                && other.getAwsDeviceV2().equals(this.getAwsDeviceV2()) == false)
            return false;
        if (other.getConnections() == null ^ this.getConnections() == null)
            return false;
        if (other.getConnections() != null
                && other.getConnections().equals(this.getConnections()) == false)
            return false;
        if (other.getAllowsHostedConnections() == null ^ this.getAllowsHostedConnections() == null)
            return false;
        if (other.getAllowsHostedConnections() != null
                && other.getAllowsHostedConnections().equals(this.getAllowsHostedConnections()) == false)
            return false;
        if (other.getJumboFrameCapable() == null ^ this.getJumboFrameCapable() == null)
            return false;
        if (other.getJumboFrameCapable() != null
                && other.getJumboFrameCapable().equals(this.getJumboFrameCapable()) == false)
            return false;
        if (other.getHasLogicalRedundancy() == null ^ this.getHasLogicalRedundancy() == null)
            return false;
        if (other.getHasLogicalRedundancy() != null
                && other.getHasLogicalRedundancy().equals(this.getHasLogicalRedundancy()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null
                && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        return true;
    }
}
