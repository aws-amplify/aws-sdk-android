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
 * Describes an IPv6 CIDR block associated with a VPC.
 * </p>
 */
public class VpcIpv6CidrBlockAssociation implements Serializable {
    /**
     * <p>
     * The association ID for the IPv6 CIDR block.
     * </p>
     */
    private String associationId;

    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     */
    private String ipv6CidrBlock;

    /**
     * <p>
     * Information about the state of the CIDR block.
     * </p>
     */
    private VpcCidrBlockState ipv6CidrBlockState;

    /**
     * <p>
     * The name of the location from which we advertise the IPV6 CIDR block.
     * </p>
     */
    private String networkBorderGroup;

    /**
     * <p>
     * The ID of the IPv6 address pool from which the IPv6 CIDR block is
     * allocated.
     * </p>
     */
    private String ipv6Pool;

    /**
     * <p>
     * The association ID for the IPv6 CIDR block.
     * </p>
     *
     * @return <p>
     *         The association ID for the IPv6 CIDR block.
     *         </p>
     */
    public String getAssociationId() {
        return associationId;
    }

    /**
     * <p>
     * The association ID for the IPv6 CIDR block.
     * </p>
     *
     * @param associationId <p>
     *            The association ID for the IPv6 CIDR block.
     *            </p>
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The association ID for the IPv6 CIDR block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associationId <p>
     *            The association ID for the IPv6 CIDR block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcIpv6CidrBlockAssociation withAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }

    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     *
     * @return <p>
     *         The IPv6 CIDR block.
     *         </p>
     */
    public String getIpv6CidrBlock() {
        return ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     *
     * @param ipv6CidrBlock <p>
     *            The IPv6 CIDR block.
     *            </p>
     */
    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6CidrBlock <p>
     *            The IPv6 CIDR block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcIpv6CidrBlockAssociation withIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }

    /**
     * <p>
     * Information about the state of the CIDR block.
     * </p>
     *
     * @return <p>
     *         Information about the state of the CIDR block.
     *         </p>
     */
    public VpcCidrBlockState getIpv6CidrBlockState() {
        return ipv6CidrBlockState;
    }

    /**
     * <p>
     * Information about the state of the CIDR block.
     * </p>
     *
     * @param ipv6CidrBlockState <p>
     *            Information about the state of the CIDR block.
     *            </p>
     */
    public void setIpv6CidrBlockState(VpcCidrBlockState ipv6CidrBlockState) {
        this.ipv6CidrBlockState = ipv6CidrBlockState;
    }

    /**
     * <p>
     * Information about the state of the CIDR block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6CidrBlockState <p>
     *            Information about the state of the CIDR block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcIpv6CidrBlockAssociation withIpv6CidrBlockState(VpcCidrBlockState ipv6CidrBlockState) {
        this.ipv6CidrBlockState = ipv6CidrBlockState;
        return this;
    }

    /**
     * <p>
     * The name of the location from which we advertise the IPV6 CIDR block.
     * </p>
     *
     * @return <p>
     *         The name of the location from which we advertise the IPV6 CIDR
     *         block.
     *         </p>
     */
    public String getNetworkBorderGroup() {
        return networkBorderGroup;
    }

    /**
     * <p>
     * The name of the location from which we advertise the IPV6 CIDR block.
     * </p>
     *
     * @param networkBorderGroup <p>
     *            The name of the location from which we advertise the IPV6 CIDR
     *            block.
     *            </p>
     */
    public void setNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
    }

    /**
     * <p>
     * The name of the location from which we advertise the IPV6 CIDR block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkBorderGroup <p>
     *            The name of the location from which we advertise the IPV6 CIDR
     *            block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcIpv6CidrBlockAssociation withNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
        return this;
    }

    /**
     * <p>
     * The ID of the IPv6 address pool from which the IPv6 CIDR block is
     * allocated.
     * </p>
     *
     * @return <p>
     *         The ID of the IPv6 address pool from which the IPv6 CIDR block is
     *         allocated.
     *         </p>
     */
    public String getIpv6Pool() {
        return ipv6Pool;
    }

    /**
     * <p>
     * The ID of the IPv6 address pool from which the IPv6 CIDR block is
     * allocated.
     * </p>
     *
     * @param ipv6Pool <p>
     *            The ID of the IPv6 address pool from which the IPv6 CIDR block
     *            is allocated.
     *            </p>
     */
    public void setIpv6Pool(String ipv6Pool) {
        this.ipv6Pool = ipv6Pool;
    }

    /**
     * <p>
     * The ID of the IPv6 address pool from which the IPv6 CIDR block is
     * allocated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Pool <p>
     *            The ID of the IPv6 address pool from which the IPv6 CIDR block
     *            is allocated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcIpv6CidrBlockAssociation withIpv6Pool(String ipv6Pool) {
        this.ipv6Pool = ipv6Pool;
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
        if (getAssociationId() != null)
            sb.append("AssociationId: " + getAssociationId() + ",");
        if (getIpv6CidrBlock() != null)
            sb.append("Ipv6CidrBlock: " + getIpv6CidrBlock() + ",");
        if (getIpv6CidrBlockState() != null)
            sb.append("Ipv6CidrBlockState: " + getIpv6CidrBlockState() + ",");
        if (getNetworkBorderGroup() != null)
            sb.append("NetworkBorderGroup: " + getNetworkBorderGroup() + ",");
        if (getIpv6Pool() != null)
            sb.append("Ipv6Pool: " + getIpv6Pool());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode
                + ((getIpv6CidrBlock() == null) ? 0 : getIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode
                + ((getIpv6CidrBlockState() == null) ? 0 : getIpv6CidrBlockState().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkBorderGroup() == null) ? 0 : getNetworkBorderGroup().hashCode());
        hashCode = prime * hashCode + ((getIpv6Pool() == null) ? 0 : getIpv6Pool().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcIpv6CidrBlockAssociation == false)
            return false;
        VpcIpv6CidrBlockAssociation other = (VpcIpv6CidrBlockAssociation) obj;

        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null
                && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getIpv6CidrBlock() == null ^ this.getIpv6CidrBlock() == null)
            return false;
        if (other.getIpv6CidrBlock() != null
                && other.getIpv6CidrBlock().equals(this.getIpv6CidrBlock()) == false)
            return false;
        if (other.getIpv6CidrBlockState() == null ^ this.getIpv6CidrBlockState() == null)
            return false;
        if (other.getIpv6CidrBlockState() != null
                && other.getIpv6CidrBlockState().equals(this.getIpv6CidrBlockState()) == false)
            return false;
        if (other.getNetworkBorderGroup() == null ^ this.getNetworkBorderGroup() == null)
            return false;
        if (other.getNetworkBorderGroup() != null
                && other.getNetworkBorderGroup().equals(this.getNetworkBorderGroup()) == false)
            return false;
        if (other.getIpv6Pool() == null ^ this.getIpv6Pool() == null)
            return false;
        if (other.getIpv6Pool() != null && other.getIpv6Pool().equals(this.getIpv6Pool()) == false)
            return false;
        return true;
    }
}
