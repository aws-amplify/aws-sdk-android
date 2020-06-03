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
 * Information about an AWS Direct Connect connection.
 * </p>
 */
public class DeleteConnectionResult implements Serializable {
    /**
     * <p>
     * The ID of the AWS account that owns the connection.
     * </p>
     */
    private String ownerAccount;

    /**
     * <p>
     * The ID of the connection.
     * </p>
     */
    private String connectionId;

    /**
     * <p>
     * The name of the connection.
     * </p>
     */
    private String connectionName;

    /**
     * <p>
     * The state of the connection. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ordering</code>: The initial state of a hosted connection
     * provisioned on an interconnect. The connection stays in the ordering
     * state until the owner of the hosted connection confirms or declines the
     * connection order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a standard connection. The
     * connection stays in the requested state until the Letter of Authorization
     * (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The connection has been approved and is being
     * initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up and the connection is
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
     * <code>deleting</code>: The connection is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The connection has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: A hosted connection in the <code>ordering</code>
     * state enters the <code>rejected</code> state if it is deleted by the
     * customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the connection is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ordering, requested, pending, available, down,
     * deleting, deleted, rejected, unknown
     */
    private String connectionState;

    /**
     * <p>
     * The AWS Region where the connection is located.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The location of the connection.
     * </p>
     */
    private String location;

    /**
     * <p>
     * The bandwidth of the connection.
     * </p>
     */
    private String bandwidth;

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     */
    private Integer vlan;

    /**
     * <p>
     * The name of the AWS Direct Connect service provider associated with the
     * connection.
     * </p>
     */
    private String partnerName;

    /**
     * <p>
     * The time of the most recent call to <a>DescribeLoa</a> for this
     * connection.
     * </p>
     */
    private java.util.Date loaIssueTime;

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     */
    private String lagId;

    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     */
    private String awsDevice;

    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     */
    private Boolean jumboFrameCapable;

    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     */
    private String awsDeviceV2;

    /**
     * <p>
     * Indicates whether the connection supports a secondary BGP peer in the
     * same address family (IPv4/IPv6).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unknown, yes, no
     */
    private String hasLogicalRedundancy;

    /**
     * <p>
     * The tags associated with the connection.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the service provider associated with the connection.
     * </p>
     */
    private String providerName;

    /**
     * <p>
     * The ID of the AWS account that owns the connection.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the connection.
     *         </p>
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the connection.
     * </p>
     *
     * @param ownerAccount <p>
     *            The ID of the AWS account that owns the connection.
     *            </p>
     */
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerAccount <p>
     *            The ID of the AWS account that owns the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteConnectionResult withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     *
     * @return <p>
     *         The ID of the connection.
     *         </p>
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     *
     * @param connectionId <p>
     *            The ID of the connection.
     *            </p>
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionId <p>
     *            The ID of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteConnectionResult withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * <p>
     * The name of the connection.
     * </p>
     *
     * @return <p>
     *         The name of the connection.
     *         </p>
     */
    public String getConnectionName() {
        return connectionName;
    }

    /**
     * <p>
     * The name of the connection.
     * </p>
     *
     * @param connectionName <p>
     *            The name of the connection.
     *            </p>
     */
    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The name of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionName <p>
     *            The name of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteConnectionResult withConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * <p>
     * The state of the connection. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ordering</code>: The initial state of a hosted connection
     * provisioned on an interconnect. The connection stays in the ordering
     * state until the owner of the hosted connection confirms or declines the
     * connection order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a standard connection. The
     * connection stays in the requested state until the Letter of Authorization
     * (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The connection has been approved and is being
     * initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up and the connection is
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
     * <code>deleting</code>: The connection is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The connection has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: A hosted connection in the <code>ordering</code>
     * state enters the <code>rejected</code> state if it is deleted by the
     * customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the connection is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ordering, requested, pending, available, down,
     * deleting, deleted, rejected, unknown
     *
     * @return <p>
     *         The state of the connection. The following are the possible
     *         values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ordering</code>: The initial state of a hosted connection
     *         provisioned on an interconnect. The connection stays in the
     *         ordering state until the owner of the hosted connection confirms
     *         or declines the connection order.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>requested</code>: The initial state of a standard
     *         connection. The connection stays in the requested state until the
     *         Letter of Authorization (LOA) is sent to the customer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code>: The connection has been approved and is
     *         being initialized.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available</code>: The network link is up and the connection
     *         is ready for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>down</code>: The network link is down.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>: The connection is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code>: The connection has been deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>rejected</code>: A hosted connection in the
     *         <code>ordering</code> state enters the <code>rejected</code>
     *         state if it is deleted by the customer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unknown</code>: The state of the connection is not
     *         available.
     *         </p>
     *         </li>
     *         </ul>
     * @see ConnectionState
     */
    public String getConnectionState() {
        return connectionState;
    }

    /**
     * <p>
     * The state of the connection. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ordering</code>: The initial state of a hosted connection
     * provisioned on an interconnect. The connection stays in the ordering
     * state until the owner of the hosted connection confirms or declines the
     * connection order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a standard connection. The
     * connection stays in the requested state until the Letter of Authorization
     * (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The connection has been approved and is being
     * initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up and the connection is
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
     * <code>deleting</code>: The connection is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The connection has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: A hosted connection in the <code>ordering</code>
     * state enters the <code>rejected</code> state if it is deleted by the
     * customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the connection is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ordering, requested, pending, available, down,
     * deleting, deleted, rejected, unknown
     *
     * @param connectionState <p>
     *            The state of the connection. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ordering</code>: The initial state of a hosted
     *            connection provisioned on an interconnect. The connection
     *            stays in the ordering state until the owner of the hosted
     *            connection confirms or declines the connection order.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requested</code>: The initial state of a standard
     *            connection. The connection stays in the requested state until
     *            the Letter of Authorization (LOA) is sent to the customer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: The connection has been approved and is
     *            being initialized.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: The network link is up and the
     *            connection is ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: The network link is down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: The connection is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The connection has been deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>rejected</code>: A hosted connection in the
     *            <code>ordering</code> state enters the <code>rejected</code>
     *            state if it is deleted by the customer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The state of the connection is not
     *            available.
     *            </p>
     *            </li>
     *            </ul>
     * @see ConnectionState
     */
    public void setConnectionState(String connectionState) {
        this.connectionState = connectionState;
    }

    /**
     * <p>
     * The state of the connection. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ordering</code>: The initial state of a hosted connection
     * provisioned on an interconnect. The connection stays in the ordering
     * state until the owner of the hosted connection confirms or declines the
     * connection order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a standard connection. The
     * connection stays in the requested state until the Letter of Authorization
     * (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The connection has been approved and is being
     * initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up and the connection is
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
     * <code>deleting</code>: The connection is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The connection has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: A hosted connection in the <code>ordering</code>
     * state enters the <code>rejected</code> state if it is deleted by the
     * customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the connection is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ordering, requested, pending, available, down,
     * deleting, deleted, rejected, unknown
     *
     * @param connectionState <p>
     *            The state of the connection. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ordering</code>: The initial state of a hosted
     *            connection provisioned on an interconnect. The connection
     *            stays in the ordering state until the owner of the hosted
     *            connection confirms or declines the connection order.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requested</code>: The initial state of a standard
     *            connection. The connection stays in the requested state until
     *            the Letter of Authorization (LOA) is sent to the customer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: The connection has been approved and is
     *            being initialized.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: The network link is up and the
     *            connection is ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: The network link is down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: The connection is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The connection has been deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>rejected</code>: A hosted connection in the
     *            <code>ordering</code> state enters the <code>rejected</code>
     *            state if it is deleted by the customer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The state of the connection is not
     *            available.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConnectionState
     */
    public DeleteConnectionResult withConnectionState(String connectionState) {
        this.connectionState = connectionState;
        return this;
    }

    /**
     * <p>
     * The state of the connection. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ordering</code>: The initial state of a hosted connection
     * provisioned on an interconnect. The connection stays in the ordering
     * state until the owner of the hosted connection confirms or declines the
     * connection order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a standard connection. The
     * connection stays in the requested state until the Letter of Authorization
     * (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The connection has been approved and is being
     * initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up and the connection is
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
     * <code>deleting</code>: The connection is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The connection has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: A hosted connection in the <code>ordering</code>
     * state enters the <code>rejected</code> state if it is deleted by the
     * customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the connection is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ordering, requested, pending, available, down,
     * deleting, deleted, rejected, unknown
     *
     * @param connectionState <p>
     *            The state of the connection. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ordering</code>: The initial state of a hosted
     *            connection provisioned on an interconnect. The connection
     *            stays in the ordering state until the owner of the hosted
     *            connection confirms or declines the connection order.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requested</code>: The initial state of a standard
     *            connection. The connection stays in the requested state until
     *            the Letter of Authorization (LOA) is sent to the customer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: The connection has been approved and is
     *            being initialized.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: The network link is up and the
     *            connection is ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: The network link is down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: The connection is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The connection has been deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>rejected</code>: A hosted connection in the
     *            <code>ordering</code> state enters the <code>rejected</code>
     *            state if it is deleted by the customer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The state of the connection is not
     *            available.
     *            </p>
     *            </li>
     *            </ul>
     * @see ConnectionState
     */
    public void setConnectionState(ConnectionState connectionState) {
        this.connectionState = connectionState.toString();
    }

    /**
     * <p>
     * The state of the connection. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ordering</code>: The initial state of a hosted connection
     * provisioned on an interconnect. The connection stays in the ordering
     * state until the owner of the hosted connection confirms or declines the
     * connection order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a standard connection. The
     * connection stays in the requested state until the Letter of Authorization
     * (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The connection has been approved and is being
     * initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up and the connection is
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
     * <code>deleting</code>: The connection is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The connection has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: A hosted connection in the <code>ordering</code>
     * state enters the <code>rejected</code> state if it is deleted by the
     * customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the connection is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ordering, requested, pending, available, down,
     * deleting, deleted, rejected, unknown
     *
     * @param connectionState <p>
     *            The state of the connection. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ordering</code>: The initial state of a hosted
     *            connection provisioned on an interconnect. The connection
     *            stays in the ordering state until the owner of the hosted
     *            connection confirms or declines the connection order.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requested</code>: The initial state of a standard
     *            connection. The connection stays in the requested state until
     *            the Letter of Authorization (LOA) is sent to the customer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: The connection has been approved and is
     *            being initialized.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: The network link is up and the
     *            connection is ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: The network link is down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: The connection is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The connection has been deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>rejected</code>: A hosted connection in the
     *            <code>ordering</code> state enters the <code>rejected</code>
     *            state if it is deleted by the customer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The state of the connection is not
     *            available.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConnectionState
     */
    public DeleteConnectionResult withConnectionState(ConnectionState connectionState) {
        this.connectionState = connectionState.toString();
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
    public DeleteConnectionResult withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * The location of the connection.
     * </p>
     *
     * @return <p>
     *         The location of the connection.
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The location of the connection.
     * </p>
     *
     * @param location <p>
     *            The location of the connection.
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The location of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteConnectionResult withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The bandwidth of the connection.
     * </p>
     *
     * @return <p>
     *         The bandwidth of the connection.
     *         </p>
     */
    public String getBandwidth() {
        return bandwidth;
    }

    /**
     * <p>
     * The bandwidth of the connection.
     * </p>
     *
     * @param bandwidth <p>
     *            The bandwidth of the connection.
     *            </p>
     */
    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * <p>
     * The bandwidth of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bandwidth <p>
     *            The bandwidth of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteConnectionResult withBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     *
     * @return <p>
     *         The ID of the VLAN.
     *         </p>
     */
    public Integer getVlan() {
        return vlan;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     *
     * @param vlan <p>
     *            The ID of the VLAN.
     *            </p>
     */
    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vlan <p>
     *            The ID of the VLAN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteConnectionResult withVlan(Integer vlan) {
        this.vlan = vlan;
        return this;
    }

    /**
     * <p>
     * The name of the AWS Direct Connect service provider associated with the
     * connection.
     * </p>
     *
     * @return <p>
     *         The name of the AWS Direct Connect service provider associated
     *         with the connection.
     *         </p>
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * <p>
     * The name of the AWS Direct Connect service provider associated with the
     * connection.
     * </p>
     *
     * @param partnerName <p>
     *            The name of the AWS Direct Connect service provider associated
     *            with the connection.
     *            </p>
     */
    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    /**
     * <p>
     * The name of the AWS Direct Connect service provider associated with the
     * connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partnerName <p>
     *            The name of the AWS Direct Connect service provider associated
     *            with the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteConnectionResult withPartnerName(String partnerName) {
        this.partnerName = partnerName;
        return this;
    }

    /**
     * <p>
     * The time of the most recent call to <a>DescribeLoa</a> for this
     * connection.
     * </p>
     *
     * @return <p>
     *         The time of the most recent call to <a>DescribeLoa</a> for this
     *         connection.
     *         </p>
     */
    public java.util.Date getLoaIssueTime() {
        return loaIssueTime;
    }

    /**
     * <p>
     * The time of the most recent call to <a>DescribeLoa</a> for this
     * connection.
     * </p>
     *
     * @param loaIssueTime <p>
     *            The time of the most recent call to <a>DescribeLoa</a> for
     *            this connection.
     *            </p>
     */
    public void setLoaIssueTime(java.util.Date loaIssueTime) {
        this.loaIssueTime = loaIssueTime;
    }

    /**
     * <p>
     * The time of the most recent call to <a>DescribeLoa</a> for this
     * connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loaIssueTime <p>
     *            The time of the most recent call to <a>DescribeLoa</a> for
     *            this connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteConnectionResult withLoaIssueTime(java.util.Date loaIssueTime) {
        this.loaIssueTime = loaIssueTime;
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
    public DeleteConnectionResult withLagId(String lagId) {
        this.lagId = lagId;
        return this;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     *
     * @return <p>
     *         The Direct Connect endpoint on which the physical connection
     *         terminates.
     *         </p>
     */
    public String getAwsDevice() {
        return awsDevice;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     *
     * @param awsDevice <p>
     *            The Direct Connect endpoint on which the physical connection
     *            terminates.
     *            </p>
     */
    public void setAwsDevice(String awsDevice) {
        this.awsDevice = awsDevice;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsDevice <p>
     *            The Direct Connect endpoint on which the physical connection
     *            terminates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteConnectionResult withAwsDevice(String awsDevice) {
        this.awsDevice = awsDevice;
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
    public DeleteConnectionResult withJumboFrameCapable(Boolean jumboFrameCapable) {
        this.jumboFrameCapable = jumboFrameCapable;
        return this;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     *
     * @return <p>
     *         The Direct Connect endpoint on which the physical connection
     *         terminates.
     *         </p>
     */
    public String getAwsDeviceV2() {
        return awsDeviceV2;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     *
     * @param awsDeviceV2 <p>
     *            The Direct Connect endpoint on which the physical connection
     *            terminates.
     *            </p>
     */
    public void setAwsDeviceV2(String awsDeviceV2) {
        this.awsDeviceV2 = awsDeviceV2;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsDeviceV2 <p>
     *            The Direct Connect endpoint on which the physical connection
     *            terminates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteConnectionResult withAwsDeviceV2(String awsDeviceV2) {
        this.awsDeviceV2 = awsDeviceV2;
        return this;
    }

    /**
     * <p>
     * Indicates whether the connection supports a secondary BGP peer in the
     * same address family (IPv4/IPv6).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unknown, yes, no
     *
     * @return <p>
     *         Indicates whether the connection supports a secondary BGP peer in
     *         the same address family (IPv4/IPv6).
     *         </p>
     * @see HasLogicalRedundancy
     */
    public String getHasLogicalRedundancy() {
        return hasLogicalRedundancy;
    }

    /**
     * <p>
     * Indicates whether the connection supports a secondary BGP peer in the
     * same address family (IPv4/IPv6).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unknown, yes, no
     *
     * @param hasLogicalRedundancy <p>
     *            Indicates whether the connection supports a secondary BGP peer
     *            in the same address family (IPv4/IPv6).
     *            </p>
     * @see HasLogicalRedundancy
     */
    public void setHasLogicalRedundancy(String hasLogicalRedundancy) {
        this.hasLogicalRedundancy = hasLogicalRedundancy;
    }

    /**
     * <p>
     * Indicates whether the connection supports a secondary BGP peer in the
     * same address family (IPv4/IPv6).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unknown, yes, no
     *
     * @param hasLogicalRedundancy <p>
     *            Indicates whether the connection supports a secondary BGP peer
     *            in the same address family (IPv4/IPv6).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HasLogicalRedundancy
     */
    public DeleteConnectionResult withHasLogicalRedundancy(String hasLogicalRedundancy) {
        this.hasLogicalRedundancy = hasLogicalRedundancy;
        return this;
    }

    /**
     * <p>
     * Indicates whether the connection supports a secondary BGP peer in the
     * same address family (IPv4/IPv6).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unknown, yes, no
     *
     * @param hasLogicalRedundancy <p>
     *            Indicates whether the connection supports a secondary BGP peer
     *            in the same address family (IPv4/IPv6).
     *            </p>
     * @see HasLogicalRedundancy
     */
    public void setHasLogicalRedundancy(HasLogicalRedundancy hasLogicalRedundancy) {
        this.hasLogicalRedundancy = hasLogicalRedundancy.toString();
    }

    /**
     * <p>
     * Indicates whether the connection supports a secondary BGP peer in the
     * same address family (IPv4/IPv6).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unknown, yes, no
     *
     * @param hasLogicalRedundancy <p>
     *            Indicates whether the connection supports a secondary BGP peer
     *            in the same address family (IPv4/IPv6).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HasLogicalRedundancy
     */
    public DeleteConnectionResult withHasLogicalRedundancy(HasLogicalRedundancy hasLogicalRedundancy) {
        this.hasLogicalRedundancy = hasLogicalRedundancy.toString();
        return this;
    }

    /**
     * <p>
     * The tags associated with the connection.
     * </p>
     *
     * @return <p>
     *         The tags associated with the connection.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the connection.
     * </p>
     *
     * @param tags <p>
     *            The tags associated with the connection.
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
     * The tags associated with the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteConnectionResult withTags(Tag... tags) {
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
     * The tags associated with the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteConnectionResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the service provider associated with the connection.
     * </p>
     *
     * @return <p>
     *         The name of the service provider associated with the connection.
     *         </p>
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * <p>
     * The name of the service provider associated with the connection.
     * </p>
     *
     * @param providerName <p>
     *            The name of the service provider associated with the
     *            connection.
     *            </p>
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The name of the service provider associated with the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param providerName <p>
     *            The name of the service provider associated with the
     *            connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteConnectionResult withProviderName(String providerName) {
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
        if (getOwnerAccount() != null)
            sb.append("ownerAccount: " + getOwnerAccount() + ",");
        if (getConnectionId() != null)
            sb.append("connectionId: " + getConnectionId() + ",");
        if (getConnectionName() != null)
            sb.append("connectionName: " + getConnectionName() + ",");
        if (getConnectionState() != null)
            sb.append("connectionState: " + getConnectionState() + ",");
        if (getRegion() != null)
            sb.append("region: " + getRegion() + ",");
        if (getLocation() != null)
            sb.append("location: " + getLocation() + ",");
        if (getBandwidth() != null)
            sb.append("bandwidth: " + getBandwidth() + ",");
        if (getVlan() != null)
            sb.append("vlan: " + getVlan() + ",");
        if (getPartnerName() != null)
            sb.append("partnerName: " + getPartnerName() + ",");
        if (getLoaIssueTime() != null)
            sb.append("loaIssueTime: " + getLoaIssueTime() + ",");
        if (getLagId() != null)
            sb.append("lagId: " + getLagId() + ",");
        if (getAwsDevice() != null)
            sb.append("awsDevice: " + getAwsDevice() + ",");
        if (getJumboFrameCapable() != null)
            sb.append("jumboFrameCapable: " + getJumboFrameCapable() + ",");
        if (getAwsDeviceV2() != null)
            sb.append("awsDeviceV2: " + getAwsDeviceV2() + ",");
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
                + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionState() == null) ? 0 : getConnectionState().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode());
        hashCode = prime * hashCode + ((getVlan() == null) ? 0 : getVlan().hashCode());
        hashCode = prime * hashCode
                + ((getPartnerName() == null) ? 0 : getPartnerName().hashCode());
        hashCode = prime * hashCode
                + ((getLoaIssueTime() == null) ? 0 : getLoaIssueTime().hashCode());
        hashCode = prime * hashCode + ((getLagId() == null) ? 0 : getLagId().hashCode());
        hashCode = prime * hashCode + ((getAwsDevice() == null) ? 0 : getAwsDevice().hashCode());
        hashCode = prime * hashCode
                + ((getJumboFrameCapable() == null) ? 0 : getJumboFrameCapable().hashCode());
        hashCode = prime * hashCode
                + ((getAwsDeviceV2() == null) ? 0 : getAwsDeviceV2().hashCode());
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

        if (obj instanceof DeleteConnectionResult == false)
            return false;
        DeleteConnectionResult other = (DeleteConnectionResult) obj;

        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null
                && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null
                && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null
                && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        if (other.getConnectionState() == null ^ this.getConnectionState() == null)
            return false;
        if (other.getConnectionState() != null
                && other.getConnectionState().equals(this.getConnectionState()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getBandwidth() == null ^ this.getBandwidth() == null)
            return false;
        if (other.getBandwidth() != null
                && other.getBandwidth().equals(this.getBandwidth()) == false)
            return false;
        if (other.getVlan() == null ^ this.getVlan() == null)
            return false;
        if (other.getVlan() != null && other.getVlan().equals(this.getVlan()) == false)
            return false;
        if (other.getPartnerName() == null ^ this.getPartnerName() == null)
            return false;
        if (other.getPartnerName() != null
                && other.getPartnerName().equals(this.getPartnerName()) == false)
            return false;
        if (other.getLoaIssueTime() == null ^ this.getLoaIssueTime() == null)
            return false;
        if (other.getLoaIssueTime() != null
                && other.getLoaIssueTime().equals(this.getLoaIssueTime()) == false)
            return false;
        if (other.getLagId() == null ^ this.getLagId() == null)
            return false;
        if (other.getLagId() != null && other.getLagId().equals(this.getLagId()) == false)
            return false;
        if (other.getAwsDevice() == null ^ this.getAwsDevice() == null)
            return false;
        if (other.getAwsDevice() != null
                && other.getAwsDevice().equals(this.getAwsDevice()) == false)
            return false;
        if (other.getJumboFrameCapable() == null ^ this.getJumboFrameCapable() == null)
            return false;
        if (other.getJumboFrameCapable() != null
                && other.getJumboFrameCapable().equals(this.getJumboFrameCapable()) == false)
            return false;
        if (other.getAwsDeviceV2() == null ^ this.getAwsDeviceV2() == null)
            return false;
        if (other.getAwsDeviceV2() != null
                && other.getAwsDeviceV2().equals(this.getAwsDeviceV2()) == false)
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
