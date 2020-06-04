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
 * Describes the deregistered transit gateway multicast group sources.
 * </p>
 */
public class TransitGatewayMulticastDeregisteredGroupSources implements Serializable {
    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     */
    private String transitGatewayMulticastDomainId;

    /**
     * <p>
     * The network interface IDs of the non-registered members.
     * </p>
     */
    private java.util.List<String> deregisteredNetworkInterfaceIds;

    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     */
    private String groupIpAddress;

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
    public TransitGatewayMulticastDeregisteredGroupSources withTransitGatewayMulticastDomainId(
            String transitGatewayMulticastDomainId) {
        this.transitGatewayMulticastDomainId = transitGatewayMulticastDomainId;
        return this;
    }

    /**
     * <p>
     * The network interface IDs of the non-registered members.
     * </p>
     *
     * @return <p>
     *         The network interface IDs of the non-registered members.
     *         </p>
     */
    public java.util.List<String> getDeregisteredNetworkInterfaceIds() {
        return deregisteredNetworkInterfaceIds;
    }

    /**
     * <p>
     * The network interface IDs of the non-registered members.
     * </p>
     *
     * @param deregisteredNetworkInterfaceIds <p>
     *            The network interface IDs of the non-registered members.
     *            </p>
     */
    public void setDeregisteredNetworkInterfaceIds(
            java.util.Collection<String> deregisteredNetworkInterfaceIds) {
        if (deregisteredNetworkInterfaceIds == null) {
            this.deregisteredNetworkInterfaceIds = null;
            return;
        }

        this.deregisteredNetworkInterfaceIds = new java.util.ArrayList<String>(
                deregisteredNetworkInterfaceIds);
    }

    /**
     * <p>
     * The network interface IDs of the non-registered members.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deregisteredNetworkInterfaceIds <p>
     *            The network interface IDs of the non-registered members.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayMulticastDeregisteredGroupSources withDeregisteredNetworkInterfaceIds(
            String... deregisteredNetworkInterfaceIds) {
        if (getDeregisteredNetworkInterfaceIds() == null) {
            this.deregisteredNetworkInterfaceIds = new java.util.ArrayList<String>(
                    deregisteredNetworkInterfaceIds.length);
        }
        for (String value : deregisteredNetworkInterfaceIds) {
            this.deregisteredNetworkInterfaceIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The network interface IDs of the non-registered members.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deregisteredNetworkInterfaceIds <p>
     *            The network interface IDs of the non-registered members.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayMulticastDeregisteredGroupSources withDeregisteredNetworkInterfaceIds(
            java.util.Collection<String> deregisteredNetworkInterfaceIds) {
        setDeregisteredNetworkInterfaceIds(deregisteredNetworkInterfaceIds);
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
    public TransitGatewayMulticastDeregisteredGroupSources withGroupIpAddress(String groupIpAddress) {
        this.groupIpAddress = groupIpAddress;
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
        if (getDeregisteredNetworkInterfaceIds() != null)
            sb.append("DeregisteredNetworkInterfaceIds: " + getDeregisteredNetworkInterfaceIds()
                    + ",");
        if (getGroupIpAddress() != null)
            sb.append("GroupIpAddress: " + getGroupIpAddress());
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
        hashCode = prime
                * hashCode
                + ((getDeregisteredNetworkInterfaceIds() == null) ? 0
                        : getDeregisteredNetworkInterfaceIds().hashCode());
        hashCode = prime * hashCode
                + ((getGroupIpAddress() == null) ? 0 : getGroupIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayMulticastDeregisteredGroupSources == false)
            return false;
        TransitGatewayMulticastDeregisteredGroupSources other = (TransitGatewayMulticastDeregisteredGroupSources) obj;

        if (other.getTransitGatewayMulticastDomainId() == null
                ^ this.getTransitGatewayMulticastDomainId() == null)
            return false;
        if (other.getTransitGatewayMulticastDomainId() != null
                && other.getTransitGatewayMulticastDomainId().equals(
                        this.getTransitGatewayMulticastDomainId()) == false)
            return false;
        if (other.getDeregisteredNetworkInterfaceIds() == null
                ^ this.getDeregisteredNetworkInterfaceIds() == null)
            return false;
        if (other.getDeregisteredNetworkInterfaceIds() != null
                && other.getDeregisteredNetworkInterfaceIds().equals(
                        this.getDeregisteredNetworkInterfaceIds()) == false)
            return false;
        if (other.getGroupIpAddress() == null ^ this.getGroupIpAddress() == null)
            return false;
        if (other.getGroupIpAddress() != null
                && other.getGroupIpAddress().equals(this.getGroupIpAddress()) == false)
            return false;
        return true;
    }
}
