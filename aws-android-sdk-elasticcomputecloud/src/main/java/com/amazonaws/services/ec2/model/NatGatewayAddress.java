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
 * Describes the IP addresses and network interface associated with a NAT
 * gateway.
 * </p>
 */
public class NatGatewayAddress implements Serializable {
    /**
     * <p>
     * The allocation ID of the Elastic IP address that's associated with the
     * NAT gateway.
     * </p>
     */
    private String allocationId;

    /**
     * <p>
     * The ID of the network interface associated with the NAT gateway.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The private IP address associated with the Elastic IP address.
     * </p>
     */
    private String privateIp;

    /**
     * <p>
     * The Elastic IP address associated with the NAT gateway.
     * </p>
     */
    private String publicIp;

    /**
     * <p>
     * The allocation ID of the Elastic IP address that's associated with the
     * NAT gateway.
     * </p>
     *
     * @return <p>
     *         The allocation ID of the Elastic IP address that's associated
     *         with the NAT gateway.
     *         </p>
     */
    public String getAllocationId() {
        return allocationId;
    }

    /**
     * <p>
     * The allocation ID of the Elastic IP address that's associated with the
     * NAT gateway.
     * </p>
     *
     * @param allocationId <p>
     *            The allocation ID of the Elastic IP address that's associated
     *            with the NAT gateway.
     *            </p>
     */
    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * The allocation ID of the Elastic IP address that's associated with the
     * NAT gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocationId <p>
     *            The allocation ID of the Elastic IP address that's associated
     *            with the NAT gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NatGatewayAddress withAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }

    /**
     * <p>
     * The ID of the network interface associated with the NAT gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the network interface associated with the NAT gateway.
     *         </p>
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface associated with the NAT gateway.
     * </p>
     *
     * @param networkInterfaceId <p>
     *            The ID of the network interface associated with the NAT
     *            gateway.
     *            </p>
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface associated with the NAT gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceId <p>
     *            The ID of the network interface associated with the NAT
     *            gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NatGatewayAddress withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * The private IP address associated with the Elastic IP address.
     * </p>
     *
     * @return <p>
     *         The private IP address associated with the Elastic IP address.
     *         </p>
     */
    public String getPrivateIp() {
        return privateIp;
    }

    /**
     * <p>
     * The private IP address associated with the Elastic IP address.
     * </p>
     *
     * @param privateIp <p>
     *            The private IP address associated with the Elastic IP address.
     *            </p>
     */
    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    /**
     * <p>
     * The private IP address associated with the Elastic IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIp <p>
     *            The private IP address associated with the Elastic IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NatGatewayAddress withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * <p>
     * The Elastic IP address associated with the NAT gateway.
     * </p>
     *
     * @return <p>
     *         The Elastic IP address associated with the NAT gateway.
     *         </p>
     */
    public String getPublicIp() {
        return publicIp;
    }

    /**
     * <p>
     * The Elastic IP address associated with the NAT gateway.
     * </p>
     *
     * @param publicIp <p>
     *            The Elastic IP address associated with the NAT gateway.
     *            </p>
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * The Elastic IP address associated with the NAT gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicIp <p>
     *            The Elastic IP address associated with the NAT gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NatGatewayAddress withPublicIp(String publicIp) {
        this.publicIp = publicIp;
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
        if (getAllocationId() != null)
            sb.append("AllocationId: " + getAllocationId() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getPrivateIp() != null)
            sb.append("PrivateIp: " + getPrivateIp() + ",");
        if (getPublicIp() != null)
            sb.append("PublicIp: " + getPublicIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getPrivateIp() == null) ? 0 : getPrivateIp().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NatGatewayAddress == false)
            return false;
        NatGatewayAddress other = (NatGatewayAddress) obj;

        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null
                && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getPrivateIp() == null ^ this.getPrivateIp() == null)
            return false;
        if (other.getPrivateIp() != null
                && other.getPrivateIp().equals(this.getPrivateIp()) == false)
            return false;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        return true;
    }
}
