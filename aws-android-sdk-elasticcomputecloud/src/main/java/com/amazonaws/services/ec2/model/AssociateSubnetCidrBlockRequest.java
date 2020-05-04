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
 * Associates a CIDR block with your subnet. You can only associate a single
 * IPv6 CIDR block with your subnet. An IPv6 CIDR block must have a prefix
 * length of /64.
 * </p>
 */
public class AssociateSubnetCidrBlockRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The IPv6 CIDR block for your subnet. The subnet must have a /64 prefix
     * length.
     * </p>
     */
    private String ipv6CidrBlock;

    /**
     * <p>
     * The ID of your subnet.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * The IPv6 CIDR block for your subnet. The subnet must have a /64 prefix
     * length.
     * </p>
     *
     * @return <p>
     *         The IPv6 CIDR block for your subnet. The subnet must have a /64
     *         prefix length.
     *         </p>
     */
    public String getIpv6CidrBlock() {
        return ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block for your subnet. The subnet must have a /64 prefix
     * length.
     * </p>
     *
     * @param ipv6CidrBlock <p>
     *            The IPv6 CIDR block for your subnet. The subnet must have a
     *            /64 prefix length.
     *            </p>
     */
    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block for your subnet. The subnet must have a /64 prefix
     * length.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6CidrBlock <p>
     *            The IPv6 CIDR block for your subnet. The subnet must have a
     *            /64 prefix length.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateSubnetCidrBlockRequest withIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }

    /**
     * <p>
     * The ID of your subnet.
     * </p>
     *
     * @return <p>
     *         The ID of your subnet.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * The ID of your subnet.
     * </p>
     *
     * @param subnetId <p>
     *            The ID of your subnet.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of your subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetId <p>
     *            The ID of your subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateSubnetCidrBlockRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
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
        if (getIpv6CidrBlock() != null)
            sb.append("Ipv6CidrBlock: " + getIpv6CidrBlock() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIpv6CidrBlock() == null) ? 0 : getIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateSubnetCidrBlockRequest == false)
            return false;
        AssociateSubnetCidrBlockRequest other = (AssociateSubnetCidrBlockRequest) obj;

        if (other.getIpv6CidrBlock() == null ^ this.getIpv6CidrBlock() == null)
            return false;
        if (other.getIpv6CidrBlock() != null
                && other.getIpv6CidrBlock().equals(this.getIpv6CidrBlock()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        return true;
    }
}
