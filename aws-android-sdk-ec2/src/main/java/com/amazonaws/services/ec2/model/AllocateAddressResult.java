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

public class AllocateAddressResult implements Serializable {
    /**
     * <p>
     * The Elastic IP address.
     * </p>
     */
    private String publicIp;

    /**
     * <p>
     * [EC2-VPC] The ID that AWS assigns to represent the allocation of the
     * Elastic IP address for use with instances in a VPC.
     * </p>
     */
    private String allocationId;

    /**
     * <p>
     * The ID of an address pool.
     * </p>
     */
    private String publicIpv4Pool;

    /**
     * <p>
     * The location from which the IP address is advertised.
     * </p>
     */
    private String networkBorderGroup;

    /**
     * <p>
     * Indicates whether this Elastic IP address is for use with instances in
     * EC2-Classic (<code>standard</code>) or instances in a VPC (
     * <code>vpc</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     */
    private String domain;

    /**
     * <p>
     * The customer-owned IP address.
     * </p>
     */
    private String customerOwnedIp;

    /**
     * <p>
     * The ID of the customer-owned address pool.
     * </p>
     */
    private String customerOwnedIpv4Pool;

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     *
     * @return <p>
     *         The Elastic IP address.
     *         </p>
     */
    public String getPublicIp() {
        return publicIp;
    }

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     *
     * @param publicIp <p>
     *            The Elastic IP address.
     *            </p>
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicIp <p>
     *            The Elastic IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateAddressResult withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The ID that AWS assigns to represent the allocation of the
     * Elastic IP address for use with instances in a VPC.
     * </p>
     *
     * @return <p>
     *         [EC2-VPC] The ID that AWS assigns to represent the allocation of
     *         the Elastic IP address for use with instances in a VPC.
     *         </p>
     */
    public String getAllocationId() {
        return allocationId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID that AWS assigns to represent the allocation of the
     * Elastic IP address for use with instances in a VPC.
     * </p>
     *
     * @param allocationId <p>
     *            [EC2-VPC] The ID that AWS assigns to represent the allocation
     *            of the Elastic IP address for use with instances in a VPC.
     *            </p>
     */
    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID that AWS assigns to represent the allocation of the
     * Elastic IP address for use with instances in a VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocationId <p>
     *            [EC2-VPC] The ID that AWS assigns to represent the allocation
     *            of the Elastic IP address for use with instances in a VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateAddressResult withAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }

    /**
     * <p>
     * The ID of an address pool.
     * </p>
     *
     * @return <p>
     *         The ID of an address pool.
     *         </p>
     */
    public String getPublicIpv4Pool() {
        return publicIpv4Pool;
    }

    /**
     * <p>
     * The ID of an address pool.
     * </p>
     *
     * @param publicIpv4Pool <p>
     *            The ID of an address pool.
     *            </p>
     */
    public void setPublicIpv4Pool(String publicIpv4Pool) {
        this.publicIpv4Pool = publicIpv4Pool;
    }

    /**
     * <p>
     * The ID of an address pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicIpv4Pool <p>
     *            The ID of an address pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateAddressResult withPublicIpv4Pool(String publicIpv4Pool) {
        this.publicIpv4Pool = publicIpv4Pool;
        return this;
    }

    /**
     * <p>
     * The location from which the IP address is advertised.
     * </p>
     *
     * @return <p>
     *         The location from which the IP address is advertised.
     *         </p>
     */
    public String getNetworkBorderGroup() {
        return networkBorderGroup;
    }

    /**
     * <p>
     * The location from which the IP address is advertised.
     * </p>
     *
     * @param networkBorderGroup <p>
     *            The location from which the IP address is advertised.
     *            </p>
     */
    public void setNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
    }

    /**
     * <p>
     * The location from which the IP address is advertised.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkBorderGroup <p>
     *            The location from which the IP address is advertised.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateAddressResult withNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
        return this;
    }

    /**
     * <p>
     * Indicates whether this Elastic IP address is for use with instances in
     * EC2-Classic (<code>standard</code>) or instances in a VPC (
     * <code>vpc</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     *
     * @return <p>
     *         Indicates whether this Elastic IP address is for use with
     *         instances in EC2-Classic (<code>standard</code>) or instances in
     *         a VPC (<code>vpc</code>).
     *         </p>
     * @see DomainType
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <p>
     * Indicates whether this Elastic IP address is for use with instances in
     * EC2-Classic (<code>standard</code>) or instances in a VPC (
     * <code>vpc</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     *
     * @param domain <p>
     *            Indicates whether this Elastic IP address is for use with
     *            instances in EC2-Classic (<code>standard</code>) or instances
     *            in a VPC (<code>vpc</code>).
     *            </p>
     * @see DomainType
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Indicates whether this Elastic IP address is for use with instances in
     * EC2-Classic (<code>standard</code>) or instances in a VPC (
     * <code>vpc</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     *
     * @param domain <p>
     *            Indicates whether this Elastic IP address is for use with
     *            instances in EC2-Classic (<code>standard</code>) or instances
     *            in a VPC (<code>vpc</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainType
     */
    public AllocateAddressResult withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * <p>
     * Indicates whether this Elastic IP address is for use with instances in
     * EC2-Classic (<code>standard</code>) or instances in a VPC (
     * <code>vpc</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     *
     * @param domain <p>
     *            Indicates whether this Elastic IP address is for use with
     *            instances in EC2-Classic (<code>standard</code>) or instances
     *            in a VPC (<code>vpc</code>).
     *            </p>
     * @see DomainType
     */
    public void setDomain(DomainType domain) {
        this.domain = domain.toString();
    }

    /**
     * <p>
     * Indicates whether this Elastic IP address is for use with instances in
     * EC2-Classic (<code>standard</code>) or instances in a VPC (
     * <code>vpc</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     *
     * @param domain <p>
     *            Indicates whether this Elastic IP address is for use with
     *            instances in EC2-Classic (<code>standard</code>) or instances
     *            in a VPC (<code>vpc</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainType
     */
    public AllocateAddressResult withDomain(DomainType domain) {
        this.domain = domain.toString();
        return this;
    }

    /**
     * <p>
     * The customer-owned IP address.
     * </p>
     *
     * @return <p>
     *         The customer-owned IP address.
     *         </p>
     */
    public String getCustomerOwnedIp() {
        return customerOwnedIp;
    }

    /**
     * <p>
     * The customer-owned IP address.
     * </p>
     *
     * @param customerOwnedIp <p>
     *            The customer-owned IP address.
     *            </p>
     */
    public void setCustomerOwnedIp(String customerOwnedIp) {
        this.customerOwnedIp = customerOwnedIp;
    }

    /**
     * <p>
     * The customer-owned IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerOwnedIp <p>
     *            The customer-owned IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateAddressResult withCustomerOwnedIp(String customerOwnedIp) {
        this.customerOwnedIp = customerOwnedIp;
        return this;
    }

    /**
     * <p>
     * The ID of the customer-owned address pool.
     * </p>
     *
     * @return <p>
     *         The ID of the customer-owned address pool.
     *         </p>
     */
    public String getCustomerOwnedIpv4Pool() {
        return customerOwnedIpv4Pool;
    }

    /**
     * <p>
     * The ID of the customer-owned address pool.
     * </p>
     *
     * @param customerOwnedIpv4Pool <p>
     *            The ID of the customer-owned address pool.
     *            </p>
     */
    public void setCustomerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
        this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
    }

    /**
     * <p>
     * The ID of the customer-owned address pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerOwnedIpv4Pool <p>
     *            The ID of the customer-owned address pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateAddressResult withCustomerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
        this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
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
        if (getPublicIp() != null)
            sb.append("PublicIp: " + getPublicIp() + ",");
        if (getAllocationId() != null)
            sb.append("AllocationId: " + getAllocationId() + ",");
        if (getPublicIpv4Pool() != null)
            sb.append("PublicIpv4Pool: " + getPublicIpv4Pool() + ",");
        if (getNetworkBorderGroup() != null)
            sb.append("NetworkBorderGroup: " + getNetworkBorderGroup() + ",");
        if (getDomain() != null)
            sb.append("Domain: " + getDomain() + ",");
        if (getCustomerOwnedIp() != null)
            sb.append("CustomerOwnedIp: " + getCustomerOwnedIp() + ",");
        if (getCustomerOwnedIpv4Pool() != null)
            sb.append("CustomerOwnedIpv4Pool: " + getCustomerOwnedIpv4Pool());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        hashCode = prime * hashCode
                + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode
                + ((getPublicIpv4Pool() == null) ? 0 : getPublicIpv4Pool().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkBorderGroup() == null) ? 0 : getNetworkBorderGroup().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode
                + ((getCustomerOwnedIp() == null) ? 0 : getCustomerOwnedIp().hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomerOwnedIpv4Pool() == null) ? 0 : getCustomerOwnedIpv4Pool().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllocateAddressResult == false)
            return false;
        AllocateAddressResult other = (AllocateAddressResult) obj;

        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null
                && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getPublicIpv4Pool() == null ^ this.getPublicIpv4Pool() == null)
            return false;
        if (other.getPublicIpv4Pool() != null
                && other.getPublicIpv4Pool().equals(this.getPublicIpv4Pool()) == false)
            return false;
        if (other.getNetworkBorderGroup() == null ^ this.getNetworkBorderGroup() == null)
            return false;
        if (other.getNetworkBorderGroup() != null
                && other.getNetworkBorderGroup().equals(this.getNetworkBorderGroup()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getCustomerOwnedIp() == null ^ this.getCustomerOwnedIp() == null)
            return false;
        if (other.getCustomerOwnedIp() != null
                && other.getCustomerOwnedIp().equals(this.getCustomerOwnedIp()) == false)
            return false;
        if (other.getCustomerOwnedIpv4Pool() == null ^ this.getCustomerOwnedIpv4Pool() == null)
            return false;
        if (other.getCustomerOwnedIpv4Pool() != null
                && other.getCustomerOwnedIpv4Pool().equals(this.getCustomerOwnedIpv4Pool()) == false)
            return false;
        return true;
    }
}
