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
 * Associates a CIDR block with your VPC. You can associate a secondary IPv4
 * CIDR block, an Amazon-provided IPv6 CIDR block, or an IPv6 CIDR block from an
 * IPv6 address pool that you provisioned through bring your own IP addresses
 * (<a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html">
 * BYOIP</a>). The IPv6 CIDR block size is fixed at /56.
 * </p>
 * <p>
 * You must specify one of the following in the request: an IPv4 CIDR block, an
 * IPv6 pool, or an Amazon-provided IPv6 CIDR block.
 * </p>
 * <p>
 * For more information about associating CIDR blocks with your VPC and
 * applicable restrictions, see <a href=
 * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html#VPC_Sizing"
 * >VPC and Subnet Sizing</a> in the <i>Amazon Virtual Private Cloud User
 * Guide</i>.
 * </p>
 */
public class AssociateVpcCidrBlockRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for
     * the VPC. You cannot specify the range of IPv6 addresses, or the size of
     * the CIDR block.
     * </p>
     */
    private Boolean amazonProvidedIpv6CidrBlock;

    /**
     * <p>
     * An IPv4 CIDR block to associate with the VPC.
     * </p>
     */
    private String cidrBlock;

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The name of the location from which we advertise the IPV6 CIDR block. Use
     * this parameter to limit the CiDR block to this location.
     * </p>
     * <p>
     * You must set <code>AmazonProvidedIpv6CidrBlock</code> to
     * <code>true</code> to use this parameter.
     * </p>
     * <p>
     * You can have one IPv6 CIDR block association per network border group.
     * </p>
     */
    private String ipv6CidrBlockNetworkBorderGroup;

    /**
     * <p>
     * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR
     * block.
     * </p>
     */
    private String ipv6Pool;

    /**
     * <p>
     * An IPv6 CIDR block from the IPv6 address pool. You must also specify
     * <code>Ipv6Pool</code> in the request.
     * </p>
     * <p>
     * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     * </p>
     */
    private String ipv6CidrBlock;

    /**
     * <p>
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for
     * the VPC. You cannot specify the range of IPv6 addresses, or the size of
     * the CIDR block.
     * </p>
     *
     * @return <p>
     *         Requests an Amazon-provided IPv6 CIDR block with a /56 prefix
     *         length for the VPC. You cannot specify the range of IPv6
     *         addresses, or the size of the CIDR block.
     *         </p>
     */
    public Boolean isAmazonProvidedIpv6CidrBlock() {
        return amazonProvidedIpv6CidrBlock;
    }

    /**
     * <p>
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for
     * the VPC. You cannot specify the range of IPv6 addresses, or the size of
     * the CIDR block.
     * </p>
     *
     * @return <p>
     *         Requests an Amazon-provided IPv6 CIDR block with a /56 prefix
     *         length for the VPC. You cannot specify the range of IPv6
     *         addresses, or the size of the CIDR block.
     *         </p>
     */
    public Boolean getAmazonProvidedIpv6CidrBlock() {
        return amazonProvidedIpv6CidrBlock;
    }

    /**
     * <p>
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for
     * the VPC. You cannot specify the range of IPv6 addresses, or the size of
     * the CIDR block.
     * </p>
     *
     * @param amazonProvidedIpv6CidrBlock <p>
     *            Requests an Amazon-provided IPv6 CIDR block with a /56 prefix
     *            length for the VPC. You cannot specify the range of IPv6
     *            addresses, or the size of the CIDR block.
     *            </p>
     */
    public void setAmazonProvidedIpv6CidrBlock(Boolean amazonProvidedIpv6CidrBlock) {
        this.amazonProvidedIpv6CidrBlock = amazonProvidedIpv6CidrBlock;
    }

    /**
     * <p>
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for
     * the VPC. You cannot specify the range of IPv6 addresses, or the size of
     * the CIDR block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amazonProvidedIpv6CidrBlock <p>
     *            Requests an Amazon-provided IPv6 CIDR block with a /56 prefix
     *            length for the VPC. You cannot specify the range of IPv6
     *            addresses, or the size of the CIDR block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateVpcCidrBlockRequest withAmazonProvidedIpv6CidrBlock(
            Boolean amazonProvidedIpv6CidrBlock) {
        this.amazonProvidedIpv6CidrBlock = amazonProvidedIpv6CidrBlock;
        return this;
    }

    /**
     * <p>
     * An IPv4 CIDR block to associate with the VPC.
     * </p>
     *
     * @return <p>
     *         An IPv4 CIDR block to associate with the VPC.
     *         </p>
     */
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * <p>
     * An IPv4 CIDR block to associate with the VPC.
     * </p>
     *
     * @param cidrBlock <p>
     *            An IPv4 CIDR block to associate with the VPC.
     *            </p>
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * An IPv4 CIDR block to associate with the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrBlock <p>
     *            An IPv4 CIDR block to associate with the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateVpcCidrBlockRequest withCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
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
    public AssociateVpcCidrBlockRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * The name of the location from which we advertise the IPV6 CIDR block. Use
     * this parameter to limit the CiDR block to this location.
     * </p>
     * <p>
     * You must set <code>AmazonProvidedIpv6CidrBlock</code> to
     * <code>true</code> to use this parameter.
     * </p>
     * <p>
     * You can have one IPv6 CIDR block association per network border group.
     * </p>
     *
     * @return <p>
     *         The name of the location from which we advertise the IPV6 CIDR
     *         block. Use this parameter to limit the CiDR block to this
     *         location.
     *         </p>
     *         <p>
     *         You must set <code>AmazonProvidedIpv6CidrBlock</code> to
     *         <code>true</code> to use this parameter.
     *         </p>
     *         <p>
     *         You can have one IPv6 CIDR block association per network border
     *         group.
     *         </p>
     */
    public String getIpv6CidrBlockNetworkBorderGroup() {
        return ipv6CidrBlockNetworkBorderGroup;
    }

    /**
     * <p>
     * The name of the location from which we advertise the IPV6 CIDR block. Use
     * this parameter to limit the CiDR block to this location.
     * </p>
     * <p>
     * You must set <code>AmazonProvidedIpv6CidrBlock</code> to
     * <code>true</code> to use this parameter.
     * </p>
     * <p>
     * You can have one IPv6 CIDR block association per network border group.
     * </p>
     *
     * @param ipv6CidrBlockNetworkBorderGroup <p>
     *            The name of the location from which we advertise the IPV6 CIDR
     *            block. Use this parameter to limit the CiDR block to this
     *            location.
     *            </p>
     *            <p>
     *            You must set <code>AmazonProvidedIpv6CidrBlock</code> to
     *            <code>true</code> to use this parameter.
     *            </p>
     *            <p>
     *            You can have one IPv6 CIDR block association per network
     *            border group.
     *            </p>
     */
    public void setIpv6CidrBlockNetworkBorderGroup(String ipv6CidrBlockNetworkBorderGroup) {
        this.ipv6CidrBlockNetworkBorderGroup = ipv6CidrBlockNetworkBorderGroup;
    }

    /**
     * <p>
     * The name of the location from which we advertise the IPV6 CIDR block. Use
     * this parameter to limit the CiDR block to this location.
     * </p>
     * <p>
     * You must set <code>AmazonProvidedIpv6CidrBlock</code> to
     * <code>true</code> to use this parameter.
     * </p>
     * <p>
     * You can have one IPv6 CIDR block association per network border group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6CidrBlockNetworkBorderGroup <p>
     *            The name of the location from which we advertise the IPV6 CIDR
     *            block. Use this parameter to limit the CiDR block to this
     *            location.
     *            </p>
     *            <p>
     *            You must set <code>AmazonProvidedIpv6CidrBlock</code> to
     *            <code>true</code> to use this parameter.
     *            </p>
     *            <p>
     *            You can have one IPv6 CIDR block association per network
     *            border group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateVpcCidrBlockRequest withIpv6CidrBlockNetworkBorderGroup(
            String ipv6CidrBlockNetworkBorderGroup) {
        this.ipv6CidrBlockNetworkBorderGroup = ipv6CidrBlockNetworkBorderGroup;
        return this;
    }

    /**
     * <p>
     * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR
     * block.
     * </p>
     *
     * @return <p>
     *         The ID of an IPv6 address pool from which to allocate the IPv6
     *         CIDR block.
     *         </p>
     */
    public String getIpv6Pool() {
        return ipv6Pool;
    }

    /**
     * <p>
     * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR
     * block.
     * </p>
     *
     * @param ipv6Pool <p>
     *            The ID of an IPv6 address pool from which to allocate the IPv6
     *            CIDR block.
     *            </p>
     */
    public void setIpv6Pool(String ipv6Pool) {
        this.ipv6Pool = ipv6Pool;
    }

    /**
     * <p>
     * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR
     * block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Pool <p>
     *            The ID of an IPv6 address pool from which to allocate the IPv6
     *            CIDR block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateVpcCidrBlockRequest withIpv6Pool(String ipv6Pool) {
        this.ipv6Pool = ipv6Pool;
        return this;
    }

    /**
     * <p>
     * An IPv6 CIDR block from the IPv6 address pool. You must also specify
     * <code>Ipv6Pool</code> in the request.
     * </p>
     * <p>
     * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     * </p>
     *
     * @return <p>
     *         An IPv6 CIDR block from the IPv6 address pool. You must also
     *         specify <code>Ipv6Pool</code> in the request.
     *         </p>
     *         <p>
     *         To let Amazon choose the IPv6 CIDR block for you, omit this
     *         parameter.
     *         </p>
     */
    public String getIpv6CidrBlock() {
        return ipv6CidrBlock;
    }

    /**
     * <p>
     * An IPv6 CIDR block from the IPv6 address pool. You must also specify
     * <code>Ipv6Pool</code> in the request.
     * </p>
     * <p>
     * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     * </p>
     *
     * @param ipv6CidrBlock <p>
     *            An IPv6 CIDR block from the IPv6 address pool. You must also
     *            specify <code>Ipv6Pool</code> in the request.
     *            </p>
     *            <p>
     *            To let Amazon choose the IPv6 CIDR block for you, omit this
     *            parameter.
     *            </p>
     */
    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    /**
     * <p>
     * An IPv6 CIDR block from the IPv6 address pool. You must also specify
     * <code>Ipv6Pool</code> in the request.
     * </p>
     * <p>
     * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6CidrBlock <p>
     *            An IPv6 CIDR block from the IPv6 address pool. You must also
     *            specify <code>Ipv6Pool</code> in the request.
     *            </p>
     *            <p>
     *            To let Amazon choose the IPv6 CIDR block for you, omit this
     *            parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateVpcCidrBlockRequest withIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
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
        if (getAmazonProvidedIpv6CidrBlock() != null)
            sb.append("AmazonProvidedIpv6CidrBlock: " + getAmazonProvidedIpv6CidrBlock() + ",");
        if (getCidrBlock() != null)
            sb.append("CidrBlock: " + getCidrBlock() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getIpv6CidrBlockNetworkBorderGroup() != null)
            sb.append("Ipv6CidrBlockNetworkBorderGroup: " + getIpv6CidrBlockNetworkBorderGroup()
                    + ",");
        if (getIpv6Pool() != null)
            sb.append("Ipv6Pool: " + getIpv6Pool() + ",");
        if (getIpv6CidrBlock() != null)
            sb.append("Ipv6CidrBlock: " + getIpv6CidrBlock());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAmazonProvidedIpv6CidrBlock() == null) ? 0
                        : getAmazonProvidedIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime
                * hashCode
                + ((getIpv6CidrBlockNetworkBorderGroup() == null) ? 0
                        : getIpv6CidrBlockNetworkBorderGroup().hashCode());
        hashCode = prime * hashCode + ((getIpv6Pool() == null) ? 0 : getIpv6Pool().hashCode());
        hashCode = prime * hashCode
                + ((getIpv6CidrBlock() == null) ? 0 : getIpv6CidrBlock().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateVpcCidrBlockRequest == false)
            return false;
        AssociateVpcCidrBlockRequest other = (AssociateVpcCidrBlockRequest) obj;

        if (other.getAmazonProvidedIpv6CidrBlock() == null
                ^ this.getAmazonProvidedIpv6CidrBlock() == null)
            return false;
        if (other.getAmazonProvidedIpv6CidrBlock() != null
                && other.getAmazonProvidedIpv6CidrBlock().equals(
                        this.getAmazonProvidedIpv6CidrBlock()) == false)
            return false;
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null
                && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getIpv6CidrBlockNetworkBorderGroup() == null
                ^ this.getIpv6CidrBlockNetworkBorderGroup() == null)
            return false;
        if (other.getIpv6CidrBlockNetworkBorderGroup() != null
                && other.getIpv6CidrBlockNetworkBorderGroup().equals(
                        this.getIpv6CidrBlockNetworkBorderGroup()) == false)
            return false;
        if (other.getIpv6Pool() == null ^ this.getIpv6Pool() == null)
            return false;
        if (other.getIpv6Pool() != null && other.getIpv6Pool().equals(this.getIpv6Pool()) == false)
            return false;
        if (other.getIpv6CidrBlock() == null ^ this.getIpv6CidrBlock() == null)
            return false;
        if (other.getIpv6CidrBlock() != null
                && other.getIpv6CidrBlock().equals(this.getIpv6CidrBlock()) == false)
            return false;
        return true;
    }
}
