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
 * Modifies a subnet attribute. You can only modify one attribute at a time.
 * </p>
 */
public class ModifySubnetAttributeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces created in
     * the specified subnet should be assigned an IPv6 address. This includes a
     * network interface that's created when launching an instance into the
     * subnet (the instance therefore receives an IPv6 address).
     * </p>
     * <p>
     * If you enable the IPv6 addressing feature for your subnet, your network
     * interface or instance only receives an IPv6 address if it's created using
     * version <code>2016-11-15</code> or later of the Amazon EC2 API.
     * </p>
     */
    private AttributeBooleanValue assignIpv6AddressOnCreation;

    /**
     * <p>
     * Specify <code>true</code> to indicate that ENIs attached to instances
     * created in the specified subnet should be assigned a public IPv4 address.
     * </p>
     */
    private AttributeBooleanValue mapPublicIpOnLaunch;

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces created in
     * the specified subnet should be assigned an IPv6 address. This includes a
     * network interface that's created when launching an instance into the
     * subnet (the instance therefore receives an IPv6 address).
     * </p>
     * <p>
     * If you enable the IPv6 addressing feature for your subnet, your network
     * interface or instance only receives an IPv6 address if it's created using
     * version <code>2016-11-15</code> or later of the Amazon EC2 API.
     * </p>
     *
     * @return <p>
     *         Specify <code>true</code> to indicate that network interfaces
     *         created in the specified subnet should be assigned an IPv6
     *         address. This includes a network interface that's created when
     *         launching an instance into the subnet (the instance therefore
     *         receives an IPv6 address).
     *         </p>
     *         <p>
     *         If you enable the IPv6 addressing feature for your subnet, your
     *         network interface or instance only receives an IPv6 address if
     *         it's created using version <code>2016-11-15</code> or later of
     *         the Amazon EC2 API.
     *         </p>
     */
    public AttributeBooleanValue getAssignIpv6AddressOnCreation() {
        return assignIpv6AddressOnCreation;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces created in
     * the specified subnet should be assigned an IPv6 address. This includes a
     * network interface that's created when launching an instance into the
     * subnet (the instance therefore receives an IPv6 address).
     * </p>
     * <p>
     * If you enable the IPv6 addressing feature for your subnet, your network
     * interface or instance only receives an IPv6 address if it's created using
     * version <code>2016-11-15</code> or later of the Amazon EC2 API.
     * </p>
     *
     * @param assignIpv6AddressOnCreation <p>
     *            Specify <code>true</code> to indicate that network interfaces
     *            created in the specified subnet should be assigned an IPv6
     *            address. This includes a network interface that's created when
     *            launching an instance into the subnet (the instance therefore
     *            receives an IPv6 address).
     *            </p>
     *            <p>
     *            If you enable the IPv6 addressing feature for your subnet,
     *            your network interface or instance only receives an IPv6
     *            address if it's created using version <code>2016-11-15</code>
     *            or later of the Amazon EC2 API.
     *            </p>
     */
    public void setAssignIpv6AddressOnCreation(AttributeBooleanValue assignIpv6AddressOnCreation) {
        this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces created in
     * the specified subnet should be assigned an IPv6 address. This includes a
     * network interface that's created when launching an instance into the
     * subnet (the instance therefore receives an IPv6 address).
     * </p>
     * <p>
     * If you enable the IPv6 addressing feature for your subnet, your network
     * interface or instance only receives an IPv6 address if it's created using
     * version <code>2016-11-15</code> or later of the Amazon EC2 API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assignIpv6AddressOnCreation <p>
     *            Specify <code>true</code> to indicate that network interfaces
     *            created in the specified subnet should be assigned an IPv6
     *            address. This includes a network interface that's created when
     *            launching an instance into the subnet (the instance therefore
     *            receives an IPv6 address).
     *            </p>
     *            <p>
     *            If you enable the IPv6 addressing feature for your subnet,
     *            your network interface or instance only receives an IPv6
     *            address if it's created using version <code>2016-11-15</code>
     *            or later of the Amazon EC2 API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifySubnetAttributeRequest withAssignIpv6AddressOnCreation(
            AttributeBooleanValue assignIpv6AddressOnCreation) {
        this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that ENIs attached to instances
     * created in the specified subnet should be assigned a public IPv4 address.
     * </p>
     *
     * @return <p>
     *         Specify <code>true</code> to indicate that ENIs attached to
     *         instances created in the specified subnet should be assigned a
     *         public IPv4 address.
     *         </p>
     */
    public AttributeBooleanValue getMapPublicIpOnLaunch() {
        return mapPublicIpOnLaunch;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that ENIs attached to instances
     * created in the specified subnet should be assigned a public IPv4 address.
     * </p>
     *
     * @param mapPublicIpOnLaunch <p>
     *            Specify <code>true</code> to indicate that ENIs attached to
     *            instances created in the specified subnet should be assigned a
     *            public IPv4 address.
     *            </p>
     */
    public void setMapPublicIpOnLaunch(AttributeBooleanValue mapPublicIpOnLaunch) {
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that ENIs attached to instances
     * created in the specified subnet should be assigned a public IPv4 address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mapPublicIpOnLaunch <p>
     *            Specify <code>true</code> to indicate that ENIs attached to
     *            instances created in the specified subnet should be assigned a
     *            public IPv4 address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifySubnetAttributeRequest withMapPublicIpOnLaunch(
            AttributeBooleanValue mapPublicIpOnLaunch) {
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
        return this;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     *
     * @return <p>
     *         The ID of the subnet.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     *
     * @param subnetId <p>
     *            The ID of the subnet.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetId <p>
     *            The ID of the subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifySubnetAttributeRequest withSubnetId(String subnetId) {
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
        if (getAssignIpv6AddressOnCreation() != null)
            sb.append("AssignIpv6AddressOnCreation: " + getAssignIpv6AddressOnCreation() + ",");
        if (getMapPublicIpOnLaunch() != null)
            sb.append("MapPublicIpOnLaunch: " + getMapPublicIpOnLaunch() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAssignIpv6AddressOnCreation() == null) ? 0
                        : getAssignIpv6AddressOnCreation().hashCode());
        hashCode = prime * hashCode
                + ((getMapPublicIpOnLaunch() == null) ? 0 : getMapPublicIpOnLaunch().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifySubnetAttributeRequest == false)
            return false;
        ModifySubnetAttributeRequest other = (ModifySubnetAttributeRequest) obj;

        if (other.getAssignIpv6AddressOnCreation() == null
                ^ this.getAssignIpv6AddressOnCreation() == null)
            return false;
        if (other.getAssignIpv6AddressOnCreation() != null
                && other.getAssignIpv6AddressOnCreation().equals(
                        this.getAssignIpv6AddressOnCreation()) == false)
            return false;
        if (other.getMapPublicIpOnLaunch() == null ^ this.getMapPublicIpOnLaunch() == null)
            return false;
        if (other.getMapPublicIpOnLaunch() != null
                && other.getMapPublicIpOnLaunch().equals(this.getMapPublicIpOnLaunch()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        return true;
    }
}
