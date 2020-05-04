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
 * Assigns one or more secondary private IP addresses to the specified network
 * interface.
 * </p>
 * <p>
 * You can specify one or more specific secondary IP addresses, or you can
 * specify the number of secondary IP addresses to be automatically assigned
 * within the subnet's CIDR block range. The number of secondary IP addresses
 * that you can assign to an instance varies by instance type. For information
 * about instance types, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
 * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
 * For more information about Elastic IP addresses, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"
 * >Elastic IP Addresses</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 * <p>
 * When you move a secondary private IP address to another network interface,
 * any Elastic IP address that is associated with the IP address is also moved.
 * </p>
 * <p>
 * Remapping an IP address is an asynchronous operation. When you move an IP
 * address from one network interface to another, check
 * <code>network/interfaces/macs/mac/local-ipv4s</code> in the instance metadata
 * to confirm that the remapping is complete.
 * </p>
 * <p>
 * You must specify either the IP addresses or the IP address count in the
 * request.
 * </p>
 */
public class AssignPrivateIpAddressesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Indicates whether to allow an IP address that is already assigned to
     * another network interface or instance to be reassigned to the specified
     * network interface.
     * </p>
     */
    private Boolean allowReassignment;

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * One or more IP addresses to be assigned as a secondary private IP address
     * to the network interface. You can't specify this parameter when also
     * specifying a number of secondary IP addresses.
     * </p>
     * <p>
     * If you don't specify an IP address, Amazon EC2 automatically selects an
     * IP address within the subnet range.
     * </p>
     */
    private java.util.List<String> privateIpAddresses;

    /**
     * <p>
     * The number of secondary IP addresses to assign to the network interface.
     * You can't specify this parameter when also specifying private IP
     * addresses.
     * </p>
     */
    private Integer secondaryPrivateIpAddressCount;

    /**
     * <p>
     * Indicates whether to allow an IP address that is already assigned to
     * another network interface or instance to be reassigned to the specified
     * network interface.
     * </p>
     *
     * @return <p>
     *         Indicates whether to allow an IP address that is already assigned
     *         to another network interface or instance to be reassigned to the
     *         specified network interface.
     *         </p>
     */
    public Boolean isAllowReassignment() {
        return allowReassignment;
    }

    /**
     * <p>
     * Indicates whether to allow an IP address that is already assigned to
     * another network interface or instance to be reassigned to the specified
     * network interface.
     * </p>
     *
     * @return <p>
     *         Indicates whether to allow an IP address that is already assigned
     *         to another network interface or instance to be reassigned to the
     *         specified network interface.
     *         </p>
     */
    public Boolean getAllowReassignment() {
        return allowReassignment;
    }

    /**
     * <p>
     * Indicates whether to allow an IP address that is already assigned to
     * another network interface or instance to be reassigned to the specified
     * network interface.
     * </p>
     *
     * @param allowReassignment <p>
     *            Indicates whether to allow an IP address that is already
     *            assigned to another network interface or instance to be
     *            reassigned to the specified network interface.
     *            </p>
     */
    public void setAllowReassignment(Boolean allowReassignment) {
        this.allowReassignment = allowReassignment;
    }

    /**
     * <p>
     * Indicates whether to allow an IP address that is already assigned to
     * another network interface or instance to be reassigned to the specified
     * network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowReassignment <p>
     *            Indicates whether to allow an IP address that is already
     *            assigned to another network interface or instance to be
     *            reassigned to the specified network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssignPrivateIpAddressesRequest withAllowReassignment(Boolean allowReassignment) {
        this.allowReassignment = allowReassignment;
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
    public AssignPrivateIpAddressesRequest withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * One or more IP addresses to be assigned as a secondary private IP address
     * to the network interface. You can't specify this parameter when also
     * specifying a number of secondary IP addresses.
     * </p>
     * <p>
     * If you don't specify an IP address, Amazon EC2 automatically selects an
     * IP address within the subnet range.
     * </p>
     *
     * @return <p>
     *         One or more IP addresses to be assigned as a secondary private IP
     *         address to the network interface. You can't specify this
     *         parameter when also specifying a number of secondary IP
     *         addresses.
     *         </p>
     *         <p>
     *         If you don't specify an IP address, Amazon EC2 automatically
     *         selects an IP address within the subnet range.
     *         </p>
     */
    public java.util.List<String> getPrivateIpAddresses() {
        return privateIpAddresses;
    }

    /**
     * <p>
     * One or more IP addresses to be assigned as a secondary private IP address
     * to the network interface. You can't specify this parameter when also
     * specifying a number of secondary IP addresses.
     * </p>
     * <p>
     * If you don't specify an IP address, Amazon EC2 automatically selects an
     * IP address within the subnet range.
     * </p>
     *
     * @param privateIpAddresses <p>
     *            One or more IP addresses to be assigned as a secondary private
     *            IP address to the network interface. You can't specify this
     *            parameter when also specifying a number of secondary IP
     *            addresses.
     *            </p>
     *            <p>
     *            If you don't specify an IP address, Amazon EC2 automatically
     *            selects an IP address within the subnet range.
     *            </p>
     */
    public void setPrivateIpAddresses(java.util.Collection<String> privateIpAddresses) {
        if (privateIpAddresses == null) {
            this.privateIpAddresses = null;
            return;
        }

        this.privateIpAddresses = new java.util.ArrayList<String>(privateIpAddresses);
    }

    /**
     * <p>
     * One or more IP addresses to be assigned as a secondary private IP address
     * to the network interface. You can't specify this parameter when also
     * specifying a number of secondary IP addresses.
     * </p>
     * <p>
     * If you don't specify an IP address, Amazon EC2 automatically selects an
     * IP address within the subnet range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddresses <p>
     *            One or more IP addresses to be assigned as a secondary private
     *            IP address to the network interface. You can't specify this
     *            parameter when also specifying a number of secondary IP
     *            addresses.
     *            </p>
     *            <p>
     *            If you don't specify an IP address, Amazon EC2 automatically
     *            selects an IP address within the subnet range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssignPrivateIpAddressesRequest withPrivateIpAddresses(String... privateIpAddresses) {
        if (getPrivateIpAddresses() == null) {
            this.privateIpAddresses = new java.util.ArrayList<String>(privateIpAddresses.length);
        }
        for (String value : privateIpAddresses) {
            this.privateIpAddresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more IP addresses to be assigned as a secondary private IP address
     * to the network interface. You can't specify this parameter when also
     * specifying a number of secondary IP addresses.
     * </p>
     * <p>
     * If you don't specify an IP address, Amazon EC2 automatically selects an
     * IP address within the subnet range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddresses <p>
     *            One or more IP addresses to be assigned as a secondary private
     *            IP address to the network interface. You can't specify this
     *            parameter when also specifying a number of secondary IP
     *            addresses.
     *            </p>
     *            <p>
     *            If you don't specify an IP address, Amazon EC2 automatically
     *            selects an IP address within the subnet range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssignPrivateIpAddressesRequest withPrivateIpAddresses(
            java.util.Collection<String> privateIpAddresses) {
        setPrivateIpAddresses(privateIpAddresses);
        return this;
    }

    /**
     * <p>
     * The number of secondary IP addresses to assign to the network interface.
     * You can't specify this parameter when also specifying private IP
     * addresses.
     * </p>
     *
     * @return <p>
     *         The number of secondary IP addresses to assign to the network
     *         interface. You can't specify this parameter when also specifying
     *         private IP addresses.
     *         </p>
     */
    public Integer getSecondaryPrivateIpAddressCount() {
        return secondaryPrivateIpAddressCount;
    }

    /**
     * <p>
     * The number of secondary IP addresses to assign to the network interface.
     * You can't specify this parameter when also specifying private IP
     * addresses.
     * </p>
     *
     * @param secondaryPrivateIpAddressCount <p>
     *            The number of secondary IP addresses to assign to the network
     *            interface. You can't specify this parameter when also
     *            specifying private IP addresses.
     *            </p>
     */
    public void setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
    }

    /**
     * <p>
     * The number of secondary IP addresses to assign to the network interface.
     * You can't specify this parameter when also specifying private IP
     * addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondaryPrivateIpAddressCount <p>
     *            The number of secondary IP addresses to assign to the network
     *            interface. You can't specify this parameter when also
     *            specifying private IP addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssignPrivateIpAddressesRequest withSecondaryPrivateIpAddressCount(
            Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
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
        if (getAllowReassignment() != null)
            sb.append("AllowReassignment: " + getAllowReassignment() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getPrivateIpAddresses() != null)
            sb.append("PrivateIpAddresses: " + getPrivateIpAddresses() + ",");
        if (getSecondaryPrivateIpAddressCount() != null)
            sb.append("SecondaryPrivateIpAddressCount: " + getSecondaryPrivateIpAddressCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAllowReassignment() == null) ? 0 : getAllowReassignment().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateIpAddresses() == null) ? 0 : getPrivateIpAddresses().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecondaryPrivateIpAddressCount() == null) ? 0
                        : getSecondaryPrivateIpAddressCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssignPrivateIpAddressesRequest == false)
            return false;
        AssignPrivateIpAddressesRequest other = (AssignPrivateIpAddressesRequest) obj;

        if (other.getAllowReassignment() == null ^ this.getAllowReassignment() == null)
            return false;
        if (other.getAllowReassignment() != null
                && other.getAllowReassignment().equals(this.getAllowReassignment()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getPrivateIpAddresses() == null ^ this.getPrivateIpAddresses() == null)
            return false;
        if (other.getPrivateIpAddresses() != null
                && other.getPrivateIpAddresses().equals(this.getPrivateIpAddresses()) == false)
            return false;
        if (other.getSecondaryPrivateIpAddressCount() == null
                ^ this.getSecondaryPrivateIpAddressCount() == null)
            return false;
        if (other.getSecondaryPrivateIpAddressCount() != null
                && other.getSecondaryPrivateIpAddressCount().equals(
                        this.getSecondaryPrivateIpAddressCount()) == false)
            return false;
        return true;
    }
}
