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
 * Describes a private IPv4 address.
 * </p>
 */
public class InstancePrivateIpAddress implements Serializable {
    /**
     * <p>
     * The association information for an Elastic IP address for the network
     * interface.
     * </p>
     */
    private InstanceNetworkInterfaceAssociation association;

    /**
     * <p>
     * Indicates whether this IPv4 address is the primary private IP address of
     * the network interface.
     * </p>
     */
    private Boolean primary;

    /**
     * <p>
     * The private IPv4 DNS name.
     * </p>
     */
    private String privateDnsName;

    /**
     * <p>
     * The private IPv4 address of the network interface.
     * </p>
     */
    private String privateIpAddress;

    /**
     * <p>
     * The association information for an Elastic IP address for the network
     * interface.
     * </p>
     *
     * @return <p>
     *         The association information for an Elastic IP address for the
     *         network interface.
     *         </p>
     */
    public InstanceNetworkInterfaceAssociation getAssociation() {
        return association;
    }

    /**
     * <p>
     * The association information for an Elastic IP address for the network
     * interface.
     * </p>
     *
     * @param association <p>
     *            The association information for an Elastic IP address for the
     *            network interface.
     *            </p>
     */
    public void setAssociation(InstanceNetworkInterfaceAssociation association) {
        this.association = association;
    }

    /**
     * <p>
     * The association information for an Elastic IP address for the network
     * interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param association <p>
     *            The association information for an Elastic IP address for the
     *            network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstancePrivateIpAddress withAssociation(InstanceNetworkInterfaceAssociation association) {
        this.association = association;
        return this;
    }

    /**
     * <p>
     * Indicates whether this IPv4 address is the primary private IP address of
     * the network interface.
     * </p>
     *
     * @return <p>
     *         Indicates whether this IPv4 address is the primary private IP
     *         address of the network interface.
     *         </p>
     */
    public Boolean isPrimary() {
        return primary;
    }

    /**
     * <p>
     * Indicates whether this IPv4 address is the primary private IP address of
     * the network interface.
     * </p>
     *
     * @return <p>
     *         Indicates whether this IPv4 address is the primary private IP
     *         address of the network interface.
     *         </p>
     */
    public Boolean getPrimary() {
        return primary;
    }

    /**
     * <p>
     * Indicates whether this IPv4 address is the primary private IP address of
     * the network interface.
     * </p>
     *
     * @param primary <p>
     *            Indicates whether this IPv4 address is the primary private IP
     *            address of the network interface.
     *            </p>
     */
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    /**
     * <p>
     * Indicates whether this IPv4 address is the primary private IP address of
     * the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param primary <p>
     *            Indicates whether this IPv4 address is the primary private IP
     *            address of the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstancePrivateIpAddress withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * <p>
     * The private IPv4 DNS name.
     * </p>
     *
     * @return <p>
     *         The private IPv4 DNS name.
     *         </p>
     */
    public String getPrivateDnsName() {
        return privateDnsName;
    }

    /**
     * <p>
     * The private IPv4 DNS name.
     * </p>
     *
     * @param privateDnsName <p>
     *            The private IPv4 DNS name.
     *            </p>
     */
    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    /**
     * <p>
     * The private IPv4 DNS name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateDnsName <p>
     *            The private IPv4 DNS name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstancePrivateIpAddress withPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
        return this;
    }

    /**
     * <p>
     * The private IPv4 address of the network interface.
     * </p>
     *
     * @return <p>
     *         The private IPv4 address of the network interface.
     *         </p>
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * <p>
     * The private IPv4 address of the network interface.
     * </p>
     *
     * @param privateIpAddress <p>
     *            The private IPv4 address of the network interface.
     *            </p>
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The private IPv4 address of the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddress <p>
     *            The private IPv4 address of the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstancePrivateIpAddress withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
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
        if (getAssociation() != null)
            sb.append("Association: " + getAssociation() + ",");
        if (getPrimary() != null)
            sb.append("Primary: " + getPrimary() + ",");
        if (getPrivateDnsName() != null)
            sb.append("PrivateDnsName: " + getPrivateDnsName() + ",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: " + getPrivateIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssociation() == null) ? 0 : getAssociation().hashCode());
        hashCode = prime * hashCode + ((getPrimary() == null) ? 0 : getPrimary().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstancePrivateIpAddress == false)
            return false;
        InstancePrivateIpAddress other = (InstancePrivateIpAddress) obj;

        if (other.getAssociation() == null ^ this.getAssociation() == null)
            return false;
        if (other.getAssociation() != null
                && other.getAssociation().equals(this.getAssociation()) == false)
            return false;
        if (other.getPrimary() == null ^ this.getPrimary() == null)
            return false;
        if (other.getPrimary() != null && other.getPrimary().equals(this.getPrimary()) == false)
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
        return true;
    }
}
