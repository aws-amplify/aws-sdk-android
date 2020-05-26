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
 * Registers members (network interfaces) with the transit gateway multicast
 * group. A member is a network interface associated with a supported EC2
 * instance that receives multicast traffic. For information about supported
 * instances, see <a href=
 * "https://docs.aws.amazon.com/vpc/latest/tgw/transit-gateway-limits.html#multicast-limits"
 * >Multicast Consideration</a> in <i>Amazon VPC Transit Gateways</i>.
 * </p>
 * <p>
 * After you add the members, use <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SearchTransitGatewayMulticastGroups.html"
 * >SearchTransitGatewayMulticastGroups</a> to verify that the members were
 * added to the transit gateway multicast group.
 * </p>
 */
public class RegisterTransitGatewayMulticastGroupMembersRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     */
    private String transitGatewayMulticastDomainId;

    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     */
    private String groupIpAddress;

    /**
     * <p>
     * The group members' network interface IDs to register with the transit
     * gateway multicast group.
     * </p>
     */
    private java.util.List<String> networkInterfaceIds;

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
     * The ID of the transit gateway multicast domain.
     * </p>
     *
     * @return <p>
     *         The ID of the transit gateway multicast domain.
     *         </p>
     */
    public String getTransitGatewayMulticastDomainId() {
        return transitGatewayMulticastDomainId;
    }

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     *
     * @param transitGatewayMulticastDomainId <p>
     *            The ID of the transit gateway multicast domain.
     *            </p>
     */
    public void setTransitGatewayMulticastDomainId(String transitGatewayMulticastDomainId) {
        this.transitGatewayMulticastDomainId = transitGatewayMulticastDomainId;
    }

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayMulticastDomainId <p>
     *            The ID of the transit gateway multicast domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTransitGatewayMulticastGroupMembersRequest withTransitGatewayMulticastDomainId(
            String transitGatewayMulticastDomainId) {
        this.transitGatewayMulticastDomainId = transitGatewayMulticastDomainId;
        return this;
    }

    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     *
     * @return <p>
     *         The IP address assigned to the transit gateway multicast group.
     *         </p>
     */
    public String getGroupIpAddress() {
        return groupIpAddress;
    }

    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     *
     * @param groupIpAddress <p>
     *            The IP address assigned to the transit gateway multicast
     *            group.
     *            </p>
     */
    public void setGroupIpAddress(String groupIpAddress) {
        this.groupIpAddress = groupIpAddress;
    }

    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupIpAddress <p>
     *            The IP address assigned to the transit gateway multicast
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTransitGatewayMulticastGroupMembersRequest withGroupIpAddress(
            String groupIpAddress) {
        this.groupIpAddress = groupIpAddress;
        return this;
    }

    /**
     * <p>
     * The group members' network interface IDs to register with the transit
     * gateway multicast group.
     * </p>
     *
     * @return <p>
     *         The group members' network interface IDs to register with the
     *         transit gateway multicast group.
     *         </p>
     */
    public java.util.List<String> getNetworkInterfaceIds() {
        return networkInterfaceIds;
    }

    /**
     * <p>
     * The group members' network interface IDs to register with the transit
     * gateway multicast group.
     * </p>
     *
     * @param networkInterfaceIds <p>
     *            The group members' network interface IDs to register with the
     *            transit gateway multicast group.
     *            </p>
     */
    public void setNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        if (networkInterfaceIds == null) {
            this.networkInterfaceIds = null;
            return;
        }

        this.networkInterfaceIds = new java.util.ArrayList<String>(networkInterfaceIds);
    }

    /**
     * <p>
     * The group members' network interface IDs to register with the transit
     * gateway multicast group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceIds <p>
     *            The group members' network interface IDs to register with the
     *            transit gateway multicast group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTransitGatewayMulticastGroupMembersRequest withNetworkInterfaceIds(
            String... networkInterfaceIds) {
        if (getNetworkInterfaceIds() == null) {
            this.networkInterfaceIds = new java.util.ArrayList<String>(networkInterfaceIds.length);
        }
        for (String value : networkInterfaceIds) {
            this.networkInterfaceIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The group members' network interface IDs to register with the transit
     * gateway multicast group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceIds <p>
     *            The group members' network interface IDs to register with the
     *            transit gateway multicast group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTransitGatewayMulticastGroupMembersRequest withNetworkInterfaceIds(
            java.util.Collection<String> networkInterfaceIds) {
        setNetworkInterfaceIds(networkInterfaceIds);
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
    public RegisterTransitGatewayMulticastGroupMembersRequest withDryRun(Boolean dryRun) {
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
        if (getTransitGatewayMulticastDomainId() != null)
            sb.append("TransitGatewayMulticastDomainId: " + getTransitGatewayMulticastDomainId()
                    + ",");
        if (getGroupIpAddress() != null)
            sb.append("GroupIpAddress: " + getGroupIpAddress() + ",");
        if (getNetworkInterfaceIds() != null)
            sb.append("NetworkInterfaceIds: " + getNetworkInterfaceIds() + ",");
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
                + ((getTransitGatewayMulticastDomainId() == null) ? 0
                        : getTransitGatewayMulticastDomainId().hashCode());
        hashCode = prime * hashCode
                + ((getGroupIpAddress() == null) ? 0 : getGroupIpAddress().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceIds() == null) ? 0 : getNetworkInterfaceIds().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterTransitGatewayMulticastGroupMembersRequest == false)
            return false;
        RegisterTransitGatewayMulticastGroupMembersRequest other = (RegisterTransitGatewayMulticastGroupMembersRequest) obj;

        if (other.getTransitGatewayMulticastDomainId() == null
                ^ this.getTransitGatewayMulticastDomainId() == null)
            return false;
        if (other.getTransitGatewayMulticastDomainId() != null
                && other.getTransitGatewayMulticastDomainId().equals(
                        this.getTransitGatewayMulticastDomainId()) == false)
            return false;
        if (other.getGroupIpAddress() == null ^ this.getGroupIpAddress() == null)
            return false;
        if (other.getGroupIpAddress() != null
                && other.getGroupIpAddress().equals(this.getGroupIpAddress()) == false)
            return false;
        if (other.getNetworkInterfaceIds() == null ^ this.getNetworkInterfaceIds() == null)
            return false;
        if (other.getNetworkInterfaceIds() != null
                && other.getNetworkInterfaceIds().equals(this.getNetworkInterfaceIds()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
