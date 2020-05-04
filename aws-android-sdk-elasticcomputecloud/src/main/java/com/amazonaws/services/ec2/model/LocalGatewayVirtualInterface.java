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
 * Describes a local gateway virtual interface.
 * </p>
 */
public class LocalGatewayVirtualInterface implements Serializable {
    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     */
    private String localGatewayVirtualInterfaceId;

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     */
    private String localGatewayId;

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     */
    private Integer vlan;

    /**
     * <p>
     * The local address.
     * </p>
     */
    private String localAddress;

    /**
     * <p>
     * The peer address.
     * </p>
     */
    private String peerAddress;

    /**
     * <p>
     * The Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the
     * local gateway.
     * </p>
     */
    private Integer localBgpAsn;

    /**
     * <p>
     * The peer BGP ASN.
     * </p>
     */
    private Integer peerBgpAsn;

    /**
     * <p>
     * The tags assigned to the virtual interface.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     *
     * @return <p>
     *         The ID of the virtual interface.
     *         </p>
     */
    public String getLocalGatewayVirtualInterfaceId() {
        return localGatewayVirtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     *
     * @param localGatewayVirtualInterfaceId <p>
     *            The ID of the virtual interface.
     *            </p>
     */
    public void setLocalGatewayVirtualInterfaceId(String localGatewayVirtualInterfaceId) {
        this.localGatewayVirtualInterfaceId = localGatewayVirtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localGatewayVirtualInterfaceId <p>
     *            The ID of the virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGatewayVirtualInterface withLocalGatewayVirtualInterfaceId(
            String localGatewayVirtualInterfaceId) {
        this.localGatewayVirtualInterfaceId = localGatewayVirtualInterfaceId;
        return this;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the local gateway.
     *         </p>
     */
    public String getLocalGatewayId() {
        return localGatewayId;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     *
     * @param localGatewayId <p>
     *            The ID of the local gateway.
     *            </p>
     */
    public void setLocalGatewayId(String localGatewayId) {
        this.localGatewayId = localGatewayId;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localGatewayId <p>
     *            The ID of the local gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGatewayVirtualInterface withLocalGatewayId(String localGatewayId) {
        this.localGatewayId = localGatewayId;
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
    public LocalGatewayVirtualInterface withVlan(Integer vlan) {
        this.vlan = vlan;
        return this;
    }

    /**
     * <p>
     * The local address.
     * </p>
     *
     * @return <p>
     *         The local address.
     *         </p>
     */
    public String getLocalAddress() {
        return localAddress;
    }

    /**
     * <p>
     * The local address.
     * </p>
     *
     * @param localAddress <p>
     *            The local address.
     *            </p>
     */
    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    /**
     * <p>
     * The local address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localAddress <p>
     *            The local address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGatewayVirtualInterface withLocalAddress(String localAddress) {
        this.localAddress = localAddress;
        return this;
    }

    /**
     * <p>
     * The peer address.
     * </p>
     *
     * @return <p>
     *         The peer address.
     *         </p>
     */
    public String getPeerAddress() {
        return peerAddress;
    }

    /**
     * <p>
     * The peer address.
     * </p>
     *
     * @param peerAddress <p>
     *            The peer address.
     *            </p>
     */
    public void setPeerAddress(String peerAddress) {
        this.peerAddress = peerAddress;
    }

    /**
     * <p>
     * The peer address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param peerAddress <p>
     *            The peer address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGatewayVirtualInterface withPeerAddress(String peerAddress) {
        this.peerAddress = peerAddress;
        return this;
    }

    /**
     * <p>
     * The Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the
     * local gateway.
     * </p>
     *
     * @return <p>
     *         The Border Gateway Protocol (BGP) Autonomous System Number (ASN)
     *         of the local gateway.
     *         </p>
     */
    public Integer getLocalBgpAsn() {
        return localBgpAsn;
    }

    /**
     * <p>
     * The Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the
     * local gateway.
     * </p>
     *
     * @param localBgpAsn <p>
     *            The Border Gateway Protocol (BGP) Autonomous System Number
     *            (ASN) of the local gateway.
     *            </p>
     */
    public void setLocalBgpAsn(Integer localBgpAsn) {
        this.localBgpAsn = localBgpAsn;
    }

    /**
     * <p>
     * The Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the
     * local gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localBgpAsn <p>
     *            The Border Gateway Protocol (BGP) Autonomous System Number
     *            (ASN) of the local gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGatewayVirtualInterface withLocalBgpAsn(Integer localBgpAsn) {
        this.localBgpAsn = localBgpAsn;
        return this;
    }

    /**
     * <p>
     * The peer BGP ASN.
     * </p>
     *
     * @return <p>
     *         The peer BGP ASN.
     *         </p>
     */
    public Integer getPeerBgpAsn() {
        return peerBgpAsn;
    }

    /**
     * <p>
     * The peer BGP ASN.
     * </p>
     *
     * @param peerBgpAsn <p>
     *            The peer BGP ASN.
     *            </p>
     */
    public void setPeerBgpAsn(Integer peerBgpAsn) {
        this.peerBgpAsn = peerBgpAsn;
    }

    /**
     * <p>
     * The peer BGP ASN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param peerBgpAsn <p>
     *            The peer BGP ASN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGatewayVirtualInterface withPeerBgpAsn(Integer peerBgpAsn) {
        this.peerBgpAsn = peerBgpAsn;
        return this;
    }

    /**
     * <p>
     * The tags assigned to the virtual interface.
     * </p>
     *
     * @return <p>
     *         The tags assigned to the virtual interface.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the virtual interface.
     * </p>
     *
     * @param tags <p>
     *            The tags assigned to the virtual interface.
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
     * The tags assigned to the virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags assigned to the virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGatewayVirtualInterface withTags(Tag... tags) {
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
     * The tags assigned to the virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags assigned to the virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGatewayVirtualInterface withTags(java.util.Collection<Tag> tags) {
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
        if (getLocalGatewayVirtualInterfaceId() != null)
            sb.append("LocalGatewayVirtualInterfaceId: " + getLocalGatewayVirtualInterfaceId()
                    + ",");
        if (getLocalGatewayId() != null)
            sb.append("LocalGatewayId: " + getLocalGatewayId() + ",");
        if (getVlan() != null)
            sb.append("Vlan: " + getVlan() + ",");
        if (getLocalAddress() != null)
            sb.append("LocalAddress: " + getLocalAddress() + ",");
        if (getPeerAddress() != null)
            sb.append("PeerAddress: " + getPeerAddress() + ",");
        if (getLocalBgpAsn() != null)
            sb.append("LocalBgpAsn: " + getLocalBgpAsn() + ",");
        if (getPeerBgpAsn() != null)
            sb.append("PeerBgpAsn: " + getPeerBgpAsn() + ",");
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
                + ((getLocalGatewayVirtualInterfaceId() == null) ? 0
                        : getLocalGatewayVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode
                + ((getLocalGatewayId() == null) ? 0 : getLocalGatewayId().hashCode());
        hashCode = prime * hashCode + ((getVlan() == null) ? 0 : getVlan().hashCode());
        hashCode = prime * hashCode
                + ((getLocalAddress() == null) ? 0 : getLocalAddress().hashCode());
        hashCode = prime * hashCode
                + ((getPeerAddress() == null) ? 0 : getPeerAddress().hashCode());
        hashCode = prime * hashCode
                + ((getLocalBgpAsn() == null) ? 0 : getLocalBgpAsn().hashCode());
        hashCode = prime * hashCode + ((getPeerBgpAsn() == null) ? 0 : getPeerBgpAsn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocalGatewayVirtualInterface == false)
            return false;
        LocalGatewayVirtualInterface other = (LocalGatewayVirtualInterface) obj;

        if (other.getLocalGatewayVirtualInterfaceId() == null
                ^ this.getLocalGatewayVirtualInterfaceId() == null)
            return false;
        if (other.getLocalGatewayVirtualInterfaceId() != null
                && other.getLocalGatewayVirtualInterfaceId().equals(
                        this.getLocalGatewayVirtualInterfaceId()) == false)
            return false;
        if (other.getLocalGatewayId() == null ^ this.getLocalGatewayId() == null)
            return false;
        if (other.getLocalGatewayId() != null
                && other.getLocalGatewayId().equals(this.getLocalGatewayId()) == false)
            return false;
        if (other.getVlan() == null ^ this.getVlan() == null)
            return false;
        if (other.getVlan() != null && other.getVlan().equals(this.getVlan()) == false)
            return false;
        if (other.getLocalAddress() == null ^ this.getLocalAddress() == null)
            return false;
        if (other.getLocalAddress() != null
                && other.getLocalAddress().equals(this.getLocalAddress()) == false)
            return false;
        if (other.getPeerAddress() == null ^ this.getPeerAddress() == null)
            return false;
        if (other.getPeerAddress() != null
                && other.getPeerAddress().equals(this.getPeerAddress()) == false)
            return false;
        if (other.getLocalBgpAsn() == null ^ this.getLocalBgpAsn() == null)
            return false;
        if (other.getLocalBgpAsn() != null
                && other.getLocalBgpAsn().equals(this.getLocalBgpAsn()) == false)
            return false;
        if (other.getPeerBgpAsn() == null ^ this.getPeerBgpAsn() == null)
            return false;
        if (other.getPeerBgpAsn() != null
                && other.getPeerBgpAsn().equals(this.getPeerBgpAsn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
