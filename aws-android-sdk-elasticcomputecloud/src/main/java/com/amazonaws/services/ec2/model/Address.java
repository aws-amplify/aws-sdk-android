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
 * Describes an Elastic IP address.
 * </p>
 */
public class Address implements Serializable {
    /**
     * <p>
     * The ID of the instance that the address is associated with (if any).
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     */
    private String publicIp;

    /**
     * <p>
     * The ID representing the allocation of the address for use with EC2-VPC.
     * </p>
     */
    private String allocationId;

    /**
     * <p>
     * The ID representing the association of the address with an instance in a
     * VPC.
     * </p>
     */
    private String associationId;

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
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The ID of the AWS account that owns the network interface.
     * </p>
     */
    private String networkInterfaceOwnerId;

    /**
     * <p>
     * The private IP address associated with the Elastic IP address.
     * </p>
     */
    private String privateIpAddress;

    /**
     * <p>
     * Any tags assigned to the Elastic IP address.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of an address pool.
     * </p>
     */
    private String publicIpv4Pool;

    /**
     * <p>
     * The name of the location from which the IP address is advertised.
     * </p>
     */
    private String networkBorderGroup;

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
     * The ID of the instance that the address is associated with (if any).
     * </p>
     *
     * @return <p>
     *         The ID of the instance that the address is associated with (if
     *         any).
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance that the address is associated with (if any).
     * </p>
     *
     * @param instanceId <p>
     *            The ID of the instance that the address is associated with (if
     *            any).
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance that the address is associated with (if any).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of the instance that the address is associated with (if
     *            any).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

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
    public Address withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * <p>
     * The ID representing the allocation of the address for use with EC2-VPC.
     * </p>
     *
     * @return <p>
     *         The ID representing the allocation of the address for use with
     *         EC2-VPC.
     *         </p>
     */
    public String getAllocationId() {
        return allocationId;
    }

    /**
     * <p>
     * The ID representing the allocation of the address for use with EC2-VPC.
     * </p>
     *
     * @param allocationId <p>
     *            The ID representing the allocation of the address for use with
     *            EC2-VPC.
     *            </p>
     */
    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * The ID representing the allocation of the address for use with EC2-VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocationId <p>
     *            The ID representing the allocation of the address for use with
     *            EC2-VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }

    /**
     * <p>
     * The ID representing the association of the address with an instance in a
     * VPC.
     * </p>
     *
     * @return <p>
     *         The ID representing the association of the address with an
     *         instance in a VPC.
     *         </p>
     */
    public String getAssociationId() {
        return associationId;
    }

    /**
     * <p>
     * The ID representing the association of the address with an instance in a
     * VPC.
     * </p>
     *
     * @param associationId <p>
     *            The ID representing the association of the address with an
     *            instance in a VPC.
     *            </p>
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID representing the association of the address with an instance in a
     * VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associationId <p>
     *            The ID representing the association of the address with an
     *            instance in a VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withAssociationId(String associationId) {
        this.associationId = associationId;
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
    public Address withDomain(String domain) {
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
    public Address withDomain(DomainType domain) {
        this.domain = domain.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     *
     * @return <p>
     *         The ID of the network interface.
     *         </p>
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     *
     * @param networkInterfaceId <p>
     *            The ID of the network interface.
     *            </p>
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceId <p>
     *            The ID of the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the network interface.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the network interface.
     *         </p>
     */
    public String getNetworkInterfaceOwnerId() {
        return networkInterfaceOwnerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the network interface.
     * </p>
     *
     * @param networkInterfaceOwnerId <p>
     *            The ID of the AWS account that owns the network interface.
     *            </p>
     */
    public void setNetworkInterfaceOwnerId(String networkInterfaceOwnerId) {
        this.networkInterfaceOwnerId = networkInterfaceOwnerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceOwnerId <p>
     *            The ID of the AWS account that owns the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withNetworkInterfaceOwnerId(String networkInterfaceOwnerId) {
        this.networkInterfaceOwnerId = networkInterfaceOwnerId;
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
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * <p>
     * The private IP address associated with the Elastic IP address.
     * </p>
     *
     * @param privateIpAddress <p>
     *            The private IP address associated with the Elastic IP address.
     *            </p>
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The private IP address associated with the Elastic IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddress <p>
     *            The private IP address associated with the Elastic IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the Elastic IP address.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the Elastic IP address.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the Elastic IP address.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the Elastic IP address.
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
     * Any tags assigned to the Elastic IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the Elastic IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withTags(Tag... tags) {
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
     * Any tags assigned to the Elastic IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the Elastic IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
    public Address withPublicIpv4Pool(String publicIpv4Pool) {
        this.publicIpv4Pool = publicIpv4Pool;
        return this;
    }

    /**
     * <p>
     * The name of the location from which the IP address is advertised.
     * </p>
     *
     * @return <p>
     *         The name of the location from which the IP address is advertised.
     *         </p>
     */
    public String getNetworkBorderGroup() {
        return networkBorderGroup;
    }

    /**
     * <p>
     * The name of the location from which the IP address is advertised.
     * </p>
     *
     * @param networkBorderGroup <p>
     *            The name of the location from which the IP address is
     *            advertised.
     *            </p>
     */
    public void setNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
    }

    /**
     * <p>
     * The name of the location from which the IP address is advertised.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkBorderGroup <p>
     *            The name of the location from which the IP address is
     *            advertised.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
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
    public Address withCustomerOwnedIp(String customerOwnedIp) {
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
    public Address withCustomerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getPublicIp() != null)
            sb.append("PublicIp: " + getPublicIp() + ",");
        if (getAllocationId() != null)
            sb.append("AllocationId: " + getAllocationId() + ",");
        if (getAssociationId() != null)
            sb.append("AssociationId: " + getAssociationId() + ",");
        if (getDomain() != null)
            sb.append("Domain: " + getDomain() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getNetworkInterfaceOwnerId() != null)
            sb.append("NetworkInterfaceOwnerId: " + getNetworkInterfaceOwnerId() + ",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getPublicIpv4Pool() != null)
            sb.append("PublicIpv4Pool: " + getPublicIpv4Pool() + ",");
        if (getNetworkBorderGroup() != null)
            sb.append("NetworkBorderGroup: " + getNetworkBorderGroup() + ",");
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

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        hashCode = prime * hashCode
                + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode
                + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getNetworkInterfaceOwnerId() == null) ? 0 : getNetworkInterfaceOwnerId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getPublicIpv4Pool() == null) ? 0 : getPublicIpv4Pool().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkBorderGroup() == null) ? 0 : getNetworkBorderGroup().hashCode());
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

        if (obj instanceof Address == false)
            return false;
        Address other = (Address) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null
                && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null
                && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getNetworkInterfaceOwnerId() == null ^ this.getNetworkInterfaceOwnerId() == null)
            return false;
        if (other.getNetworkInterfaceOwnerId() != null
                && other.getNetworkInterfaceOwnerId().equals(this.getNetworkInterfaceOwnerId()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null
                && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
