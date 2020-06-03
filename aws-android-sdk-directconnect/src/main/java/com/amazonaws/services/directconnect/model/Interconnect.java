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
 * Information about an interconnect.
 * </p>
 */
public class Interconnect implements Serializable {
    /**
     * <p>
     * The ID of the interconnect.
     * </p>
     */
    private String interconnectId;

    /**
     * <p>
     * The name of the interconnect.
     * </p>
     */
    private String interconnectName;

    /**
     * <p>
     * The state of the interconnect. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of an interconnect. The
     * interconnect stays in the requested state until the Letter of
     * Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The interconnect is approved, and is being
     * initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up, and the interconnect is
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
     * <code>deleting</code>: The interconnect is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The interconnect is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the interconnect is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting,
     * deleted, unknown
     */
    private String interconnectState;

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
     * Indicates whether the interconnect supports a secondary BGP in the same
     * address family (IPv4/IPv6).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unknown, yes, no
     */
    private String hasLogicalRedundancy;

    /**
     * <p>
     * The tags associated with the interconnect.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the service provider associated with the interconnect.
     * </p>
     */
    private String providerName;

    /**
     * <p>
     * The ID of the interconnect.
     * </p>
     *
     * @return <p>
     *         The ID of the interconnect.
     *         </p>
     */
    public String getInterconnectId() {
        return interconnectId;
    }

    /**
     * <p>
     * The ID of the interconnect.
     * </p>
     *
     * @param interconnectId <p>
     *            The ID of the interconnect.
     *            </p>
     */
    public void setInterconnectId(String interconnectId) {
        this.interconnectId = interconnectId;
    }

    /**
     * <p>
     * The ID of the interconnect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param interconnectId <p>
     *            The ID of the interconnect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Interconnect withInterconnectId(String interconnectId) {
        this.interconnectId = interconnectId;
        return this;
    }

    /**
     * <p>
     * The name of the interconnect.
     * </p>
     *
     * @return <p>
     *         The name of the interconnect.
     *         </p>
     */
    public String getInterconnectName() {
        return interconnectName;
    }

    /**
     * <p>
     * The name of the interconnect.
     * </p>
     *
     * @param interconnectName <p>
     *            The name of the interconnect.
     *            </p>
     */
    public void setInterconnectName(String interconnectName) {
        this.interconnectName = interconnectName;
    }

    /**
     * <p>
     * The name of the interconnect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param interconnectName <p>
     *            The name of the interconnect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Interconnect withInterconnectName(String interconnectName) {
        this.interconnectName = interconnectName;
        return this;
    }

    /**
     * <p>
     * The state of the interconnect. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of an interconnect. The
     * interconnect stays in the requested state until the Letter of
     * Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The interconnect is approved, and is being
     * initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up, and the interconnect is
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
     * <code>deleting</code>: The interconnect is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The interconnect is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the interconnect is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting,
     * deleted, unknown
     *
     * @return <p>
     *         The state of the interconnect. The following are the possible
     *         values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>requested</code>: The initial state of an interconnect. The
     *         interconnect stays in the requested state until the Letter of
     *         Authorization (LOA) is sent to the customer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code>: The interconnect is approved, and is being
     *         initialized.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available</code>: The network link is up, and the
     *         interconnect is ready for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>down</code>: The network link is down.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>: The interconnect is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code>: The interconnect is deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unknown</code>: The state of the interconnect is not
     *         available.
     *         </p>
     *         </li>
     *         </ul>
     * @see InterconnectState
     */
    public String getInterconnectState() {
        return interconnectState;
    }

    /**
     * <p>
     * The state of the interconnect. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of an interconnect. The
     * interconnect stays in the requested state until the Letter of
     * Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The interconnect is approved, and is being
     * initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up, and the interconnect is
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
     * <code>deleting</code>: The interconnect is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The interconnect is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the interconnect is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting,
     * deleted, unknown
     *
     * @param interconnectState <p>
     *            The state of the interconnect. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>requested</code>: The initial state of an interconnect.
     *            The interconnect stays in the requested state until the Letter
     *            of Authorization (LOA) is sent to the customer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: The interconnect is approved, and is
     *            being initialized.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: The network link is up, and the
     *            interconnect is ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: The network link is down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: The interconnect is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The interconnect is deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The state of the interconnect is not
     *            available.
     *            </p>
     *            </li>
     *            </ul>
     * @see InterconnectState
     */
    public void setInterconnectState(String interconnectState) {
        this.interconnectState = interconnectState;
    }

    /**
     * <p>
     * The state of the interconnect. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of an interconnect. The
     * interconnect stays in the requested state until the Letter of
     * Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The interconnect is approved, and is being
     * initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up, and the interconnect is
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
     * <code>deleting</code>: The interconnect is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The interconnect is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the interconnect is not available.
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
     * @param interconnectState <p>
     *            The state of the interconnect. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>requested</code>: The initial state of an interconnect.
     *            The interconnect stays in the requested state until the Letter
     *            of Authorization (LOA) is sent to the customer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: The interconnect is approved, and is
     *            being initialized.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: The network link is up, and the
     *            interconnect is ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: The network link is down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: The interconnect is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The interconnect is deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The state of the interconnect is not
     *            available.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InterconnectState
     */
    public Interconnect withInterconnectState(String interconnectState) {
        this.interconnectState = interconnectState;
        return this;
    }

    /**
     * <p>
     * The state of the interconnect. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of an interconnect. The
     * interconnect stays in the requested state until the Letter of
     * Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The interconnect is approved, and is being
     * initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up, and the interconnect is
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
     * <code>deleting</code>: The interconnect is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The interconnect is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the interconnect is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting,
     * deleted, unknown
     *
     * @param interconnectState <p>
     *            The state of the interconnect. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>requested</code>: The initial state of an interconnect.
     *            The interconnect stays in the requested state until the Letter
     *            of Authorization (LOA) is sent to the customer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: The interconnect is approved, and is
     *            being initialized.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: The network link is up, and the
     *            interconnect is ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: The network link is down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: The interconnect is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The interconnect is deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The state of the interconnect is not
     *            available.
     *            </p>
     *            </li>
     *            </ul>
     * @see InterconnectState
     */
    public void setInterconnectState(InterconnectState interconnectState) {
        this.interconnectState = interconnectState.toString();
    }

    /**
     * <p>
     * The state of the interconnect. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of an interconnect. The
     * interconnect stays in the requested state until the Letter of
     * Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The interconnect is approved, and is being
     * initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up, and the interconnect is
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
     * <code>deleting</code>: The interconnect is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The interconnect is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the interconnect is not available.
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
     * @param interconnectState <p>
     *            The state of the interconnect. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>requested</code>: The initial state of an interconnect.
     *            The interconnect stays in the requested state until the Letter
     *            of Authorization (LOA) is sent to the customer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: The interconnect is approved, and is
     *            being initialized.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: The network link is up, and the
     *            interconnect is ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: The network link is down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: The interconnect is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The interconnect is deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The state of the interconnect is not
     *            available.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InterconnectState
     */
    public Interconnect withInterconnectState(InterconnectState interconnectState) {
        this.interconnectState = interconnectState.toString();
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
    public Interconnect withRegion(String region) {
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
    public Interconnect withLocation(String location) {
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
    public Interconnect withBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
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
    public Interconnect withLoaIssueTime(java.util.Date loaIssueTime) {
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
    public Interconnect withLagId(String lagId) {
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
    public Interconnect withAwsDevice(String awsDevice) {
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
    public Interconnect withJumboFrameCapable(Boolean jumboFrameCapable) {
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
    public Interconnect withAwsDeviceV2(String awsDeviceV2) {
        this.awsDeviceV2 = awsDeviceV2;
        return this;
    }

    /**
     * <p>
     * Indicates whether the interconnect supports a secondary BGP in the same
     * address family (IPv4/IPv6).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unknown, yes, no
     *
     * @return <p>
     *         Indicates whether the interconnect supports a secondary BGP in
     *         the same address family (IPv4/IPv6).
     *         </p>
     * @see HasLogicalRedundancy
     */
    public String getHasLogicalRedundancy() {
        return hasLogicalRedundancy;
    }

    /**
     * <p>
     * Indicates whether the interconnect supports a secondary BGP in the same
     * address family (IPv4/IPv6).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unknown, yes, no
     *
     * @param hasLogicalRedundancy <p>
     *            Indicates whether the interconnect supports a secondary BGP in
     *            the same address family (IPv4/IPv6).
     *            </p>
     * @see HasLogicalRedundancy
     */
    public void setHasLogicalRedundancy(String hasLogicalRedundancy) {
        this.hasLogicalRedundancy = hasLogicalRedundancy;
    }

    /**
     * <p>
     * Indicates whether the interconnect supports a secondary BGP in the same
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
     *            Indicates whether the interconnect supports a secondary BGP in
     *            the same address family (IPv4/IPv6).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HasLogicalRedundancy
     */
    public Interconnect withHasLogicalRedundancy(String hasLogicalRedundancy) {
        this.hasLogicalRedundancy = hasLogicalRedundancy;
        return this;
    }

    /**
     * <p>
     * Indicates whether the interconnect supports a secondary BGP in the same
     * address family (IPv4/IPv6).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unknown, yes, no
     *
     * @param hasLogicalRedundancy <p>
     *            Indicates whether the interconnect supports a secondary BGP in
     *            the same address family (IPv4/IPv6).
     *            </p>
     * @see HasLogicalRedundancy
     */
    public void setHasLogicalRedundancy(HasLogicalRedundancy hasLogicalRedundancy) {
        this.hasLogicalRedundancy = hasLogicalRedundancy.toString();
    }

    /**
     * <p>
     * Indicates whether the interconnect supports a secondary BGP in the same
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
     *            Indicates whether the interconnect supports a secondary BGP in
     *            the same address family (IPv4/IPv6).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HasLogicalRedundancy
     */
    public Interconnect withHasLogicalRedundancy(HasLogicalRedundancy hasLogicalRedundancy) {
        this.hasLogicalRedundancy = hasLogicalRedundancy.toString();
        return this;
    }

    /**
     * <p>
     * The tags associated with the interconnect.
     * </p>
     *
     * @return <p>
     *         The tags associated with the interconnect.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the interconnect.
     * </p>
     *
     * @param tags <p>
     *            The tags associated with the interconnect.
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
     * The tags associated with the interconnect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the interconnect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Interconnect withTags(Tag... tags) {
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
     * The tags associated with the interconnect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the interconnect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Interconnect withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the service provider associated with the interconnect.
     * </p>
     *
     * @return <p>
     *         The name of the service provider associated with the
     *         interconnect.
     *         </p>
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * <p>
     * The name of the service provider associated with the interconnect.
     * </p>
     *
     * @param providerName <p>
     *            The name of the service provider associated with the
     *            interconnect.
     *            </p>
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The name of the service provider associated with the interconnect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param providerName <p>
     *            The name of the service provider associated with the
     *            interconnect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Interconnect withProviderName(String providerName) {
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
        if (getInterconnectId() != null)
            sb.append("interconnectId: " + getInterconnectId() + ",");
        if (getInterconnectName() != null)
            sb.append("interconnectName: " + getInterconnectName() + ",");
        if (getInterconnectState() != null)
            sb.append("interconnectState: " + getInterconnectState() + ",");
        if (getRegion() != null)
            sb.append("region: " + getRegion() + ",");
        if (getLocation() != null)
            sb.append("location: " + getLocation() + ",");
        if (getBandwidth() != null)
            sb.append("bandwidth: " + getBandwidth() + ",");
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
                + ((getInterconnectId() == null) ? 0 : getInterconnectId().hashCode());
        hashCode = prime * hashCode
                + ((getInterconnectName() == null) ? 0 : getInterconnectName().hashCode());
        hashCode = prime * hashCode
                + ((getInterconnectState() == null) ? 0 : getInterconnectState().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode());
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

        if (obj instanceof Interconnect == false)
            return false;
        Interconnect other = (Interconnect) obj;

        if (other.getInterconnectId() == null ^ this.getInterconnectId() == null)
            return false;
        if (other.getInterconnectId() != null
                && other.getInterconnectId().equals(this.getInterconnectId()) == false)
            return false;
        if (other.getInterconnectName() == null ^ this.getInterconnectName() == null)
            return false;
        if (other.getInterconnectName() != null
                && other.getInterconnectName().equals(this.getInterconnectName()) == false)
            return false;
        if (other.getInterconnectState() == null ^ this.getInterconnectState() == null)
            return false;
        if (other.getInterconnectState() != null
                && other.getInterconnectState().equals(this.getInterconnectState()) == false)
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
