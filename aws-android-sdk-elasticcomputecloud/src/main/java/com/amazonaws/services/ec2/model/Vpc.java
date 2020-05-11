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
 * Describes a VPC.
 * </p>
 */
public class Vpc implements Serializable {
    /**
     * <p>
     * The primary IPv4 CIDR block for the VPC.
     * </p>
     */
    private String cidrBlock;

    /**
     * <p>
     * The ID of the set of DHCP options you've associated with the VPC (or
     * <code>default</code> if the default options are associated with the VPC).
     * </p>
     */
    private String dhcpOptionsId;

    /**
     * <p>
     * The current state of the VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     */
    private String state;

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The ID of the AWS account that owns the VPC.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * The allowed tenancy of instances launched into the VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     */
    private String instanceTenancy;

    /**
     * <p>
     * Information about the IPv6 CIDR blocks associated with the VPC.
     * </p>
     */
    private java.util.List<VpcIpv6CidrBlockAssociation> ipv6CidrBlockAssociationSet;

    /**
     * <p>
     * Information about the IPv4 CIDR blocks associated with the VPC.
     * </p>
     */
    private java.util.List<VpcCidrBlockAssociation> cidrBlockAssociationSet;

    /**
     * <p>
     * Indicates whether the VPC is the default VPC.
     * </p>
     */
    private Boolean isDefault;

    /**
     * <p>
     * Any tags assigned to the VPC.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The primary IPv4 CIDR block for the VPC.
     * </p>
     *
     * @return <p>
     *         The primary IPv4 CIDR block for the VPC.
     *         </p>
     */
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * <p>
     * The primary IPv4 CIDR block for the VPC.
     * </p>
     *
     * @param cidrBlock <p>
     *            The primary IPv4 CIDR block for the VPC.
     *            </p>
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The primary IPv4 CIDR block for the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrBlock <p>
     *            The primary IPv4 CIDR block for the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Vpc withCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * <p>
     * The ID of the set of DHCP options you've associated with the VPC (or
     * <code>default</code> if the default options are associated with the VPC).
     * </p>
     *
     * @return <p>
     *         The ID of the set of DHCP options you've associated with the VPC
     *         (or <code>default</code> if the default options are associated
     *         with the VPC).
     *         </p>
     */
    public String getDhcpOptionsId() {
        return dhcpOptionsId;
    }

    /**
     * <p>
     * The ID of the set of DHCP options you've associated with the VPC (or
     * <code>default</code> if the default options are associated with the VPC).
     * </p>
     *
     * @param dhcpOptionsId <p>
     *            The ID of the set of DHCP options you've associated with the
     *            VPC (or <code>default</code> if the default options are
     *            associated with the VPC).
     *            </p>
     */
    public void setDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
    }

    /**
     * <p>
     * The ID of the set of DHCP options you've associated with the VPC (or
     * <code>default</code> if the default options are associated with the VPC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dhcpOptionsId <p>
     *            The ID of the set of DHCP options you've associated with the
     *            VPC (or <code>default</code> if the default options are
     *            associated with the VPC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Vpc withDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
        return this;
    }

    /**
     * <p>
     * The current state of the VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     *
     * @return <p>
     *         The current state of the VPC.
     *         </p>
     * @see VpcState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current state of the VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     *
     * @param state <p>
     *            The current state of the VPC.
     *            </p>
     * @see VpcState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     *
     * @param state <p>
     *            The current state of the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpcState
     */
    public Vpc withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The current state of the VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     *
     * @param state <p>
     *            The current state of the VPC.
     *            </p>
     * @see VpcState
     */
    public void setState(VpcState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current state of the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     *
     * @param state <p>
     *            The current state of the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpcState
     */
    public Vpc withState(VpcState state) {
        this.state = state.toString();
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
    public Vpc withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the VPC.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the VPC.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the VPC.
     * </p>
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the VPC.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Vpc withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * The allowed tenancy of instances launched into the VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @return <p>
     *         The allowed tenancy of instances launched into the VPC.
     *         </p>
     * @see Tenancy
     */
    public String getInstanceTenancy() {
        return instanceTenancy;
    }

    /**
     * <p>
     * The allowed tenancy of instances launched into the VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy <p>
     *            The allowed tenancy of instances launched into the VPC.
     *            </p>
     * @see Tenancy
     */
    public void setInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
    }

    /**
     * <p>
     * The allowed tenancy of instances launched into the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy <p>
     *            The allowed tenancy of instances launched into the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Tenancy
     */
    public Vpc withInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
        return this;
    }

    /**
     * <p>
     * The allowed tenancy of instances launched into the VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy <p>
     *            The allowed tenancy of instances launched into the VPC.
     *            </p>
     * @see Tenancy
     */
    public void setInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
    }

    /**
     * <p>
     * The allowed tenancy of instances launched into the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy <p>
     *            The allowed tenancy of instances launched into the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Tenancy
     */
    public Vpc withInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
        return this;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR blocks associated with the VPC.
     * </p>
     *
     * @return <p>
     *         Information about the IPv6 CIDR blocks associated with the VPC.
     *         </p>
     */
    public java.util.List<VpcIpv6CidrBlockAssociation> getIpv6CidrBlockAssociationSet() {
        return ipv6CidrBlockAssociationSet;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR blocks associated with the VPC.
     * </p>
     *
     * @param ipv6CidrBlockAssociationSet <p>
     *            Information about the IPv6 CIDR blocks associated with the
     *            VPC.
     *            </p>
     */
    public void setIpv6CidrBlockAssociationSet(
            java.util.Collection<VpcIpv6CidrBlockAssociation> ipv6CidrBlockAssociationSet) {
        if (ipv6CidrBlockAssociationSet == null) {
            this.ipv6CidrBlockAssociationSet = null;
            return;
        }

        this.ipv6CidrBlockAssociationSet = new java.util.ArrayList<VpcIpv6CidrBlockAssociation>(
                ipv6CidrBlockAssociationSet);
    }

    /**
     * <p>
     * Information about the IPv6 CIDR blocks associated with the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6CidrBlockAssociationSet <p>
     *            Information about the IPv6 CIDR blocks associated with the
     *            VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Vpc withIpv6CidrBlockAssociationSet(
            VpcIpv6CidrBlockAssociation... ipv6CidrBlockAssociationSet) {
        if (getIpv6CidrBlockAssociationSet() == null) {
            this.ipv6CidrBlockAssociationSet = new java.util.ArrayList<VpcIpv6CidrBlockAssociation>(
                    ipv6CidrBlockAssociationSet.length);
        }
        for (VpcIpv6CidrBlockAssociation value : ipv6CidrBlockAssociationSet) {
            this.ipv6CidrBlockAssociationSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR blocks associated with the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6CidrBlockAssociationSet <p>
     *            Information about the IPv6 CIDR blocks associated with the
     *            VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Vpc withIpv6CidrBlockAssociationSet(
            java.util.Collection<VpcIpv6CidrBlockAssociation> ipv6CidrBlockAssociationSet) {
        setIpv6CidrBlockAssociationSet(ipv6CidrBlockAssociationSet);
        return this;
    }

    /**
     * <p>
     * Information about the IPv4 CIDR blocks associated with the VPC.
     * </p>
     *
     * @return <p>
     *         Information about the IPv4 CIDR blocks associated with the VPC.
     *         </p>
     */
    public java.util.List<VpcCidrBlockAssociation> getCidrBlockAssociationSet() {
        return cidrBlockAssociationSet;
    }

    /**
     * <p>
     * Information about the IPv4 CIDR blocks associated with the VPC.
     * </p>
     *
     * @param cidrBlockAssociationSet <p>
     *            Information about the IPv4 CIDR blocks associated with the
     *            VPC.
     *            </p>
     */
    public void setCidrBlockAssociationSet(
            java.util.Collection<VpcCidrBlockAssociation> cidrBlockAssociationSet) {
        if (cidrBlockAssociationSet == null) {
            this.cidrBlockAssociationSet = null;
            return;
        }

        this.cidrBlockAssociationSet = new java.util.ArrayList<VpcCidrBlockAssociation>(
                cidrBlockAssociationSet);
    }

    /**
     * <p>
     * Information about the IPv4 CIDR blocks associated with the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrBlockAssociationSet <p>
     *            Information about the IPv4 CIDR blocks associated with the
     *            VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Vpc withCidrBlockAssociationSet(VpcCidrBlockAssociation... cidrBlockAssociationSet) {
        if (getCidrBlockAssociationSet() == null) {
            this.cidrBlockAssociationSet = new java.util.ArrayList<VpcCidrBlockAssociation>(
                    cidrBlockAssociationSet.length);
        }
        for (VpcCidrBlockAssociation value : cidrBlockAssociationSet) {
            this.cidrBlockAssociationSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the IPv4 CIDR blocks associated with the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrBlockAssociationSet <p>
     *            Information about the IPv4 CIDR blocks associated with the
     *            VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Vpc withCidrBlockAssociationSet(
            java.util.Collection<VpcCidrBlockAssociation> cidrBlockAssociationSet) {
        setCidrBlockAssociationSet(cidrBlockAssociationSet);
        return this;
    }

    /**
     * <p>
     * Indicates whether the VPC is the default VPC.
     * </p>
     *
     * @return <p>
     *         Indicates whether the VPC is the default VPC.
     *         </p>
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * <p>
     * Indicates whether the VPC is the default VPC.
     * </p>
     *
     * @return <p>
     *         Indicates whether the VPC is the default VPC.
     *         </p>
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * <p>
     * Indicates whether the VPC is the default VPC.
     * </p>
     *
     * @param isDefault <p>
     *            Indicates whether the VPC is the default VPC.
     *            </p>
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Indicates whether the VPC is the default VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isDefault <p>
     *            Indicates whether the VPC is the default VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Vpc withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the VPC.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the VPC.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the VPC.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the VPC.
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
     * Any tags assigned to the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Vpc withTags(Tag... tags) {
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
     * Any tags assigned to the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Vpc withTags(java.util.Collection<Tag> tags) {
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
        if (getCidrBlock() != null)
            sb.append("CidrBlock: " + getCidrBlock() + ",");
        if (getDhcpOptionsId() != null)
            sb.append("DhcpOptionsId: " + getDhcpOptionsId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getInstanceTenancy() != null)
            sb.append("InstanceTenancy: " + getInstanceTenancy() + ",");
        if (getIpv6CidrBlockAssociationSet() != null)
            sb.append("Ipv6CidrBlockAssociationSet: " + getIpv6CidrBlockAssociationSet() + ",");
        if (getCidrBlockAssociationSet() != null)
            sb.append("CidrBlockAssociationSet: " + getCidrBlockAssociationSet() + ",");
        if (getIsDefault() != null)
            sb.append("IsDefault: " + getIsDefault() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode
                + ((getDhcpOptionsId() == null) ? 0 : getDhcpOptionsId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceTenancy() == null) ? 0 : getInstanceTenancy().hashCode());
        hashCode = prime
                * hashCode
                + ((getIpv6CidrBlockAssociationSet() == null) ? 0
                        : getIpv6CidrBlockAssociationSet().hashCode());
        hashCode = prime
                * hashCode
                + ((getCidrBlockAssociationSet() == null) ? 0 : getCidrBlockAssociationSet()
                        .hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Vpc == false)
            return false;
        Vpc other = (Vpc) obj;

        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null
                && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getDhcpOptionsId() == null ^ this.getDhcpOptionsId() == null)
            return false;
        if (other.getDhcpOptionsId() != null
                && other.getDhcpOptionsId().equals(this.getDhcpOptionsId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getInstanceTenancy() == null ^ this.getInstanceTenancy() == null)
            return false;
        if (other.getInstanceTenancy() != null
                && other.getInstanceTenancy().equals(this.getInstanceTenancy()) == false)
            return false;
        if (other.getIpv6CidrBlockAssociationSet() == null
                ^ this.getIpv6CidrBlockAssociationSet() == null)
            return false;
        if (other.getIpv6CidrBlockAssociationSet() != null
                && other.getIpv6CidrBlockAssociationSet().equals(
                        this.getIpv6CidrBlockAssociationSet()) == false)
            return false;
        if (other.getCidrBlockAssociationSet() == null ^ this.getCidrBlockAssociationSet() == null)
            return false;
        if (other.getCidrBlockAssociationSet() != null
                && other.getCidrBlockAssociationSet().equals(this.getCidrBlockAssociationSet()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null
                && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
