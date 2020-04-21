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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the elastic network interface of the EC2 instance.
 * </p>
 */
public class NetworkInterface implements Serializable {
    /**
     * <p>
     * A list of IPv6 addresses for the EC2 instance.
     * </p>
     */
    private java.util.List<String> ipv6Addresses;

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The private DNS name of the EC2 instance.
     * </p>
     */
    private String privateDnsName;

    /**
     * <p>
     * The private IP address of the EC2 instance.
     * </p>
     */
    private String privateIpAddress;

    /**
     * <p>
     * Other private IP address information of the EC2 instance.
     * </p>
     */
    private java.util.List<PrivateIpAddressDetails> privateIpAddresses;

    /**
     * <p>
     * The public DNS name of the EC2 instance.
     * </p>
     */
    private String publicDnsName;

    /**
     * <p>
     * The public IP address of the EC2 instance.
     * </p>
     */
    private String publicIp;

    /**
     * <p>
     * The security groups associated with the EC2 instance.
     * </p>
     */
    private java.util.List<SecurityGroup> securityGroups;

    /**
     * <p>
     * The subnet ID of the EC2 instance.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * The VPC ID of the EC2 instance.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * A list of IPv6 addresses for the EC2 instance.
     * </p>
     *
     * @return <p>
     *         A list of IPv6 addresses for the EC2 instance.
     *         </p>
     */
    public java.util.List<String> getIpv6Addresses() {
        return ipv6Addresses;
    }

    /**
     * <p>
     * A list of IPv6 addresses for the EC2 instance.
     * </p>
     *
     * @param ipv6Addresses <p>
     *            A list of IPv6 addresses for the EC2 instance.
     *            </p>
     */
    public void setIpv6Addresses(java.util.Collection<String> ipv6Addresses) {
        if (ipv6Addresses == null) {
            this.ipv6Addresses = null;
            return;
        }

        this.ipv6Addresses = new java.util.ArrayList<String>(ipv6Addresses);
    }

    /**
     * <p>
     * A list of IPv6 addresses for the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Addresses <p>
     *            A list of IPv6 addresses for the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withIpv6Addresses(String... ipv6Addresses) {
        if (getIpv6Addresses() == null) {
            this.ipv6Addresses = new java.util.ArrayList<String>(ipv6Addresses.length);
        }
        for (String value : ipv6Addresses) {
            this.ipv6Addresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of IPv6 addresses for the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Addresses <p>
     *            A list of IPv6 addresses for the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withIpv6Addresses(java.util.Collection<String> ipv6Addresses) {
        setIpv6Addresses(ipv6Addresses);
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
    public NetworkInterface withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * The private DNS name of the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The private DNS name of the EC2 instance.
     *         </p>
     */
    public String getPrivateDnsName() {
        return privateDnsName;
    }

    /**
     * <p>
     * The private DNS name of the EC2 instance.
     * </p>
     *
     * @param privateDnsName <p>
     *            The private DNS name of the EC2 instance.
     *            </p>
     */
    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    /**
     * <p>
     * The private DNS name of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateDnsName <p>
     *            The private DNS name of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
        return this;
    }

    /**
     * <p>
     * The private IP address of the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The private IP address of the EC2 instance.
     *         </p>
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * <p>
     * The private IP address of the EC2 instance.
     * </p>
     *
     * @param privateIpAddress <p>
     *            The private IP address of the EC2 instance.
     *            </p>
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The private IP address of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddress <p>
     *            The private IP address of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * <p>
     * Other private IP address information of the EC2 instance.
     * </p>
     *
     * @return <p>
     *         Other private IP address information of the EC2 instance.
     *         </p>
     */
    public java.util.List<PrivateIpAddressDetails> getPrivateIpAddresses() {
        return privateIpAddresses;
    }

    /**
     * <p>
     * Other private IP address information of the EC2 instance.
     * </p>
     *
     * @param privateIpAddresses <p>
     *            Other private IP address information of the EC2 instance.
     *            </p>
     */
    public void setPrivateIpAddresses(
            java.util.Collection<PrivateIpAddressDetails> privateIpAddresses) {
        if (privateIpAddresses == null) {
            this.privateIpAddresses = null;
            return;
        }

        this.privateIpAddresses = new java.util.ArrayList<PrivateIpAddressDetails>(
                privateIpAddresses);
    }

    /**
     * <p>
     * Other private IP address information of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddresses <p>
     *            Other private IP address information of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withPrivateIpAddresses(PrivateIpAddressDetails... privateIpAddresses) {
        if (getPrivateIpAddresses() == null) {
            this.privateIpAddresses = new java.util.ArrayList<PrivateIpAddressDetails>(
                    privateIpAddresses.length);
        }
        for (PrivateIpAddressDetails value : privateIpAddresses) {
            this.privateIpAddresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Other private IP address information of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddresses <p>
     *            Other private IP address information of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withPrivateIpAddresses(
            java.util.Collection<PrivateIpAddressDetails> privateIpAddresses) {
        setPrivateIpAddresses(privateIpAddresses);
        return this;
    }

    /**
     * <p>
     * The public DNS name of the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The public DNS name of the EC2 instance.
     *         </p>
     */
    public String getPublicDnsName() {
        return publicDnsName;
    }

    /**
     * <p>
     * The public DNS name of the EC2 instance.
     * </p>
     *
     * @param publicDnsName <p>
     *            The public DNS name of the EC2 instance.
     *            </p>
     */
    public void setPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
    }

    /**
     * <p>
     * The public DNS name of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicDnsName <p>
     *            The public DNS name of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
        return this;
    }

    /**
     * <p>
     * The public IP address of the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The public IP address of the EC2 instance.
     *         </p>
     */
    public String getPublicIp() {
        return publicIp;
    }

    /**
     * <p>
     * The public IP address of the EC2 instance.
     * </p>
     *
     * @param publicIp <p>
     *            The public IP address of the EC2 instance.
     *            </p>
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * The public IP address of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicIp <p>
     *            The public IP address of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * <p>
     * The security groups associated with the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The security groups associated with the EC2 instance.
     *         </p>
     */
    public java.util.List<SecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The security groups associated with the EC2 instance.
     * </p>
     *
     * @param securityGroups <p>
     *            The security groups associated with the EC2 instance.
     *            </p>
     */
    public void setSecurityGroups(java.util.Collection<SecurityGroup> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<SecurityGroup>(securityGroups);
    }

    /**
     * <p>
     * The security groups associated with the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The security groups associated with the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withSecurityGroups(SecurityGroup... securityGroups) {
        if (getSecurityGroups() == null) {
            this.securityGroups = new java.util.ArrayList<SecurityGroup>(securityGroups.length);
        }
        for (SecurityGroup value : securityGroups) {
            this.securityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The security groups associated with the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The security groups associated with the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withSecurityGroups(java.util.Collection<SecurityGroup> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The subnet ID of the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The subnet ID of the EC2 instance.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * The subnet ID of the EC2 instance.
     * </p>
     *
     * @param subnetId <p>
     *            The subnet ID of the EC2 instance.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The subnet ID of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetId <p>
     *            The subnet ID of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * <p>
     * The VPC ID of the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The VPC ID of the EC2 instance.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The VPC ID of the EC2 instance.
     * </p>
     *
     * @param vpcId <p>
     *            The VPC ID of the EC2 instance.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC ID of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The VPC ID of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withVpcId(String vpcId) {
        this.vpcId = vpcId;
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
        if (getIpv6Addresses() != null)
            sb.append("Ipv6Addresses: " + getIpv6Addresses() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getPrivateDnsName() != null)
            sb.append("PrivateDnsName: " + getPrivateDnsName() + ",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getPrivateIpAddresses() != null)
            sb.append("PrivateIpAddresses: " + getPrivateIpAddresses() + ",");
        if (getPublicDnsName() != null)
            sb.append("PublicDnsName: " + getPublicDnsName() + ",");
        if (getPublicIp() != null)
            sb.append("PublicIp: " + getPublicIp() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIpv6Addresses() == null) ? 0 : getIpv6Addresses().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateIpAddresses() == null) ? 0 : getPrivateIpAddresses().hashCode());
        hashCode = prime * hashCode
                + ((getPublicDnsName() == null) ? 0 : getPublicDnsName().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkInterface == false)
            return false;
        NetworkInterface other = (NetworkInterface) obj;

        if (other.getIpv6Addresses() == null ^ this.getIpv6Addresses() == null)
            return false;
        if (other.getIpv6Addresses() != null
                && other.getIpv6Addresses().equals(this.getIpv6Addresses()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getPrivateDnsName() == null ^ this.getPrivateDnsName() == null)
            return false;
        if (other.getPrivateDnsName() != null
                && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null
                && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getPrivateIpAddresses() == null ^ this.getPrivateIpAddresses() == null)
            return false;
        if (other.getPrivateIpAddresses() != null
                && other.getPrivateIpAddresses().equals(this.getPrivateIpAddresses()) == false)
            return false;
        if (other.getPublicDnsName() == null ^ this.getPublicDnsName() == null)
            return false;
        if (other.getPublicDnsName() != null
                && other.getPublicDnsName().equals(this.getPublicDnsName()) == false)
            return false;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }
}
