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
 * Describes a VPC in a VPC peering connection.
 * </p>
 */
public class VpcPeeringConnectionVpcInfo implements Serializable {
    /**
     * <p>
     * The IPv4 CIDR block for the VPC.
     * </p>
     */
    private String cidrBlock;

    /**
     * <p>
     * The IPv6 CIDR block for the VPC.
     * </p>
     */
    private java.util.List<Ipv6CidrBlock> ipv6CidrBlockSet;

    /**
     * <p>
     * Information about the IPv4 CIDR blocks for the VPC.
     * </p>
     */
    private java.util.List<CidrBlock> cidrBlockSet;

    /**
     * <p>
     * The AWS account ID of the VPC owner.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * Information about the VPC peering connection options for the accepter or
     * requester VPC.
     * </p>
     */
    private VpcPeeringConnectionOptionsDescription peeringOptions;

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The Region in which the VPC is located.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The IPv4 CIDR block for the VPC.
     * </p>
     *
     * @return <p>
     *         The IPv4 CIDR block for the VPC.
     *         </p>
     */
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * <p>
     * The IPv4 CIDR block for the VPC.
     * </p>
     *
     * @param cidrBlock <p>
     *            The IPv4 CIDR block for the VPC.
     *            </p>
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The IPv4 CIDR block for the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrBlock <p>
     *            The IPv4 CIDR block for the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcPeeringConnectionVpcInfo withCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * <p>
     * The IPv6 CIDR block for the VPC.
     * </p>
     *
     * @return <p>
     *         The IPv6 CIDR block for the VPC.
     *         </p>
     */
    public java.util.List<Ipv6CidrBlock> getIpv6CidrBlockSet() {
        return ipv6CidrBlockSet;
    }

    /**
     * <p>
     * The IPv6 CIDR block for the VPC.
     * </p>
     *
     * @param ipv6CidrBlockSet <p>
     *            The IPv6 CIDR block for the VPC.
     *            </p>
     */
    public void setIpv6CidrBlockSet(java.util.Collection<Ipv6CidrBlock> ipv6CidrBlockSet) {
        if (ipv6CidrBlockSet == null) {
            this.ipv6CidrBlockSet = null;
            return;
        }

        this.ipv6CidrBlockSet = new java.util.ArrayList<Ipv6CidrBlock>(ipv6CidrBlockSet);
    }

    /**
     * <p>
     * The IPv6 CIDR block for the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6CidrBlockSet <p>
     *            The IPv6 CIDR block for the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcPeeringConnectionVpcInfo withIpv6CidrBlockSet(Ipv6CidrBlock... ipv6CidrBlockSet) {
        if (getIpv6CidrBlockSet() == null) {
            this.ipv6CidrBlockSet = new java.util.ArrayList<Ipv6CidrBlock>(ipv6CidrBlockSet.length);
        }
        for (Ipv6CidrBlock value : ipv6CidrBlockSet) {
            this.ipv6CidrBlockSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IPv6 CIDR block for the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6CidrBlockSet <p>
     *            The IPv6 CIDR block for the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcPeeringConnectionVpcInfo withIpv6CidrBlockSet(
            java.util.Collection<Ipv6CidrBlock> ipv6CidrBlockSet) {
        setIpv6CidrBlockSet(ipv6CidrBlockSet);
        return this;
    }

    /**
     * <p>
     * Information about the IPv4 CIDR blocks for the VPC.
     * </p>
     *
     * @return <p>
     *         Information about the IPv4 CIDR blocks for the VPC.
     *         </p>
     */
    public java.util.List<CidrBlock> getCidrBlockSet() {
        return cidrBlockSet;
    }

    /**
     * <p>
     * Information about the IPv4 CIDR blocks for the VPC.
     * </p>
     *
     * @param cidrBlockSet <p>
     *            Information about the IPv4 CIDR blocks for the VPC.
     *            </p>
     */
    public void setCidrBlockSet(java.util.Collection<CidrBlock> cidrBlockSet) {
        if (cidrBlockSet == null) {
            this.cidrBlockSet = null;
            return;
        }

        this.cidrBlockSet = new java.util.ArrayList<CidrBlock>(cidrBlockSet);
    }

    /**
     * <p>
     * Information about the IPv4 CIDR blocks for the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrBlockSet <p>
     *            Information about the IPv4 CIDR blocks for the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcPeeringConnectionVpcInfo withCidrBlockSet(CidrBlock... cidrBlockSet) {
        if (getCidrBlockSet() == null) {
            this.cidrBlockSet = new java.util.ArrayList<CidrBlock>(cidrBlockSet.length);
        }
        for (CidrBlock value : cidrBlockSet) {
            this.cidrBlockSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the IPv4 CIDR blocks for the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrBlockSet <p>
     *            Information about the IPv4 CIDR blocks for the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcPeeringConnectionVpcInfo withCidrBlockSet(java.util.Collection<CidrBlock> cidrBlockSet) {
        setCidrBlockSet(cidrBlockSet);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the VPC owner.
     * </p>
     *
     * @return <p>
     *         The AWS account ID of the VPC owner.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the VPC owner.
     * </p>
     *
     * @param ownerId <p>
     *            The AWS account ID of the VPC owner.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the VPC owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The AWS account ID of the VPC owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcPeeringConnectionVpcInfo withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * Information about the VPC peering connection options for the accepter or
     * requester VPC.
     * </p>
     *
     * @return <p>
     *         Information about the VPC peering connection options for the
     *         accepter or requester VPC.
     *         </p>
     */
    public VpcPeeringConnectionOptionsDescription getPeeringOptions() {
        return peeringOptions;
    }

    /**
     * <p>
     * Information about the VPC peering connection options for the accepter or
     * requester VPC.
     * </p>
     *
     * @param peeringOptions <p>
     *            Information about the VPC peering connection options for the
     *            accepter or requester VPC.
     *            </p>
     */
    public void setPeeringOptions(VpcPeeringConnectionOptionsDescription peeringOptions) {
        this.peeringOptions = peeringOptions;
    }

    /**
     * <p>
     * Information about the VPC peering connection options for the accepter or
     * requester VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param peeringOptions <p>
     *            Information about the VPC peering connection options for the
     *            accepter or requester VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcPeeringConnectionVpcInfo withPeeringOptions(
            VpcPeeringConnectionOptionsDescription peeringOptions) {
        this.peeringOptions = peeringOptions;
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     *
     * @param vpcId <p>
     *            The ID of the VPC.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The ID of the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcPeeringConnectionVpcInfo withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * The Region in which the VPC is located.
     * </p>
     *
     * @return <p>
     *         The Region in which the VPC is located.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The Region in which the VPC is located.
     * </p>
     *
     * @param region <p>
     *            The Region in which the VPC is located.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Region in which the VPC is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param region <p>
     *            The Region in which the VPC is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcPeeringConnectionVpcInfo withRegion(String region) {
        this.region = region;
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
        if (getCidrBlock() != null)
            sb.append("CidrBlock: " + getCidrBlock() + ",");
        if (getIpv6CidrBlockSet() != null)
            sb.append("Ipv6CidrBlockSet: " + getIpv6CidrBlockSet() + ",");
        if (getCidrBlockSet() != null)
            sb.append("CidrBlockSet: " + getCidrBlockSet() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getPeeringOptions() != null)
            sb.append("PeeringOptions: " + getPeeringOptions() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode
                + ((getIpv6CidrBlockSet() == null) ? 0 : getIpv6CidrBlockSet().hashCode());
        hashCode = prime * hashCode
                + ((getCidrBlockSet() == null) ? 0 : getCidrBlockSet().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode
                + ((getPeeringOptions() == null) ? 0 : getPeeringOptions().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcPeeringConnectionVpcInfo == false)
            return false;
        VpcPeeringConnectionVpcInfo other = (VpcPeeringConnectionVpcInfo) obj;

        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null
                && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getIpv6CidrBlockSet() == null ^ this.getIpv6CidrBlockSet() == null)
            return false;
        if (other.getIpv6CidrBlockSet() != null
                && other.getIpv6CidrBlockSet().equals(this.getIpv6CidrBlockSet()) == false)
            return false;
        if (other.getCidrBlockSet() == null ^ this.getCidrBlockSet() == null)
            return false;
        if (other.getCidrBlockSet() != null
                && other.getCidrBlockSet().equals(this.getCidrBlockSet()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getPeeringOptions() == null ^ this.getPeeringOptions() == null)
            return false;
        if (other.getPeeringOptions() != null
                && other.getPeeringOptions().equals(this.getPeeringOptions()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }
}
