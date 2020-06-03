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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a transit virtual interface.
 * </p>
 */
public class NewTransitVirtualInterface implements Serializable {
    /**
     * <p>
     * The name of the virtual interface assigned by the customer network. The
     * name has a maximum of 100 characters. The following are valid characters:
     * a-z, 0-9 and a hyphen (-).
     * </p>
     */
    private String virtualInterfaceName;

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     */
    private Integer vlan;

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration.
     * </p>
     * <p>
     * The valid values are 1-2147483647.
     * </p>
     */
    private Integer asn;

    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are
     * 1500 and 9001. The default value is 1500.
     * </p>
     */
    private Integer mtu;

    /**
     * <p>
     * The authentication key for BGP configuration. This string has a minimum
     * length of 6 characters and and a maximun lenth of 80 characters.
     * </p>
     */
    private String authKey;

    /**
     * <p>
     * The IP address assigned to the Amazon interface.
     * </p>
     */
    private String amazonAddress;

    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     */
    private String customerAddress;

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipv4, ipv6
     */
    private String addressFamily;

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayId;

    /**
     * <p>
     * The tags associated with the transitive virtual interface.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the virtual interface assigned by the customer network. The
     * name has a maximum of 100 characters. The following are valid characters:
     * a-z, 0-9 and a hyphen (-).
     * </p>
     *
     * @return <p>
     *         The name of the virtual interface assigned by the customer
     *         network. The name has a maximum of 100 characters. The following
     *         are valid characters: a-z, 0-9 and a hyphen (-).
     *         </p>
     */
    public String getVirtualInterfaceName() {
        return virtualInterfaceName;
    }

    /**
     * <p>
     * The name of the virtual interface assigned by the customer network. The
     * name has a maximum of 100 characters. The following are valid characters:
     * a-z, 0-9 and a hyphen (-).
     * </p>
     *
     * @param virtualInterfaceName <p>
     *            The name of the virtual interface assigned by the customer
     *            network. The name has a maximum of 100 characters. The
     *            following are valid characters: a-z, 0-9 and a hyphen (-).
     *            </p>
     */
    public void setVirtualInterfaceName(String virtualInterfaceName) {
        this.virtualInterfaceName = virtualInterfaceName;
    }

    /**
     * <p>
     * The name of the virtual interface assigned by the customer network. The
     * name has a maximum of 100 characters. The following are valid characters:
     * a-z, 0-9 and a hyphen (-).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualInterfaceName <p>
     *            The name of the virtual interface assigned by the customer
     *            network. The name has a maximum of 100 characters. The
     *            following are valid characters: a-z, 0-9 and a hyphen (-).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NewTransitVirtualInterface withVirtualInterfaceName(String virtualInterfaceName) {
        this.virtualInterfaceName = virtualInterfaceName;
        return this;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     *
     * @return <p>
     *         The ID of the VLAN.
     *         </p>
     */
    public Integer getVlan() {
        return vlan;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     *
     * @param vlan <p>
     *            The ID of the VLAN.
     *            </p>
     */
    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vlan <p>
     *            The ID of the VLAN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NewTransitVirtualInterface withVlan(Integer vlan) {
        this.vlan = vlan;
        return this;
    }

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration.
     * </p>
     * <p>
     * The valid values are 1-2147483647.
     * </p>
     *
     * @return <p>
     *         The autonomous system (AS) number for Border Gateway Protocol
     *         (BGP) configuration.
     *         </p>
     *         <p>
     *         The valid values are 1-2147483647.
     *         </p>
     */
    public Integer getAsn() {
        return asn;
    }

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration.
     * </p>
     * <p>
     * The valid values are 1-2147483647.
     * </p>
     *
     * @param asn <p>
     *            The autonomous system (AS) number for Border Gateway Protocol
     *            (BGP) configuration.
     *            </p>
     *            <p>
     *            The valid values are 1-2147483647.
     *            </p>
     */
    public void setAsn(Integer asn) {
        this.asn = asn;
    }

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration.
     * </p>
     * <p>
     * The valid values are 1-2147483647.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param asn <p>
     *            The autonomous system (AS) number for Border Gateway Protocol
     *            (BGP) configuration.
     *            </p>
     *            <p>
     *            The valid values are 1-2147483647.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NewTransitVirtualInterface withAsn(Integer asn) {
        this.asn = asn;
        return this;
    }

    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are
     * 1500 and 9001. The default value is 1500.
     * </p>
     *
     * @return <p>
     *         The maximum transmission unit (MTU), in bytes. The supported
     *         values are 1500 and 9001. The default value is 1500.
     *         </p>
     */
    public Integer getMtu() {
        return mtu;
    }

    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are
     * 1500 and 9001. The default value is 1500.
     * </p>
     *
     * @param mtu <p>
     *            The maximum transmission unit (MTU), in bytes. The supported
     *            values are 1500 and 9001. The default value is 1500.
     *            </p>
     */
    public void setMtu(Integer mtu) {
        this.mtu = mtu;
    }

    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are
     * 1500 and 9001. The default value is 1500.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mtu <p>
     *            The maximum transmission unit (MTU), in bytes. The supported
     *            values are 1500 and 9001. The default value is 1500.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NewTransitVirtualInterface withMtu(Integer mtu) {
        this.mtu = mtu;
        return this;
    }

    /**
     * <p>
     * The authentication key for BGP configuration. This string has a minimum
     * length of 6 characters and and a maximun lenth of 80 characters.
     * </p>
     *
     * @return <p>
     *         The authentication key for BGP configuration. This string has a
     *         minimum length of 6 characters and and a maximun lenth of 80
     *         characters.
     *         </p>
     */
    public String getAuthKey() {
        return authKey;
    }

    /**
     * <p>
     * The authentication key for BGP configuration. This string has a minimum
     * length of 6 characters and and a maximun lenth of 80 characters.
     * </p>
     *
     * @param authKey <p>
     *            The authentication key for BGP configuration. This string has
     *            a minimum length of 6 characters and and a maximun lenth of 80
     *            characters.
     *            </p>
     */
    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    /**
     * <p>
     * The authentication key for BGP configuration. This string has a minimum
     * length of 6 characters and and a maximun lenth of 80 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authKey <p>
     *            The authentication key for BGP configuration. This string has
     *            a minimum length of 6 characters and and a maximun lenth of 80
     *            characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NewTransitVirtualInterface withAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }

    /**
     * <p>
     * The IP address assigned to the Amazon interface.
     * </p>
     *
     * @return <p>
     *         The IP address assigned to the Amazon interface.
     *         </p>
     */
    public String getAmazonAddress() {
        return amazonAddress;
    }

    /**
     * <p>
     * The IP address assigned to the Amazon interface.
     * </p>
     *
     * @param amazonAddress <p>
     *            The IP address assigned to the Amazon interface.
     *            </p>
     */
    public void setAmazonAddress(String amazonAddress) {
        this.amazonAddress = amazonAddress;
    }

    /**
     * <p>
     * The IP address assigned to the Amazon interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amazonAddress <p>
     *            The IP address assigned to the Amazon interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NewTransitVirtualInterface withAmazonAddress(String amazonAddress) {
        this.amazonAddress = amazonAddress;
        return this;
    }

    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     *
     * @return <p>
     *         The IP address assigned to the customer interface.
     *         </p>
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     *
     * @param customerAddress <p>
     *            The IP address assigned to the customer interface.
     *            </p>
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerAddress <p>
     *            The IP address assigned to the customer interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NewTransitVirtualInterface withCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
        return this;
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipv4, ipv6
     *
     * @return <p>
     *         The address family for the BGP peer.
     *         </p>
     * @see AddressFamily
     */
    public String getAddressFamily() {
        return addressFamily;
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipv4, ipv6
     *
     * @param addressFamily <p>
     *            The address family for the BGP peer.
     *            </p>
     * @see AddressFamily
     */
    public void setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipv4, ipv6
     *
     * @param addressFamily <p>
     *            The address family for the BGP peer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AddressFamily
     */
    public NewTransitVirtualInterface withAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
        return this;
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipv4, ipv6
     *
     * @param addressFamily <p>
     *            The address family for the BGP peer.
     *            </p>
     * @see AddressFamily
     */
    public void setAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily.toString();
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipv4, ipv6
     *
     * @param addressFamily <p>
     *            The address family for the BGP peer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AddressFamily
     */
    public NewTransitVirtualInterface withAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the Direct Connect gateway.
     *         </p>
     */
    public String getDirectConnectGatewayId() {
        return directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     *
     * @param directConnectGatewayId <p>
     *            The ID of the Direct Connect gateway.
     *            </p>
     */
    public void setDirectConnectGatewayId(String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directConnectGatewayId <p>
     *            The ID of the Direct Connect gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NewTransitVirtualInterface withDirectConnectGatewayId(String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
        return this;
    }

    /**
     * <p>
     * The tags associated with the transitive virtual interface.
     * </p>
     *
     * @return <p>
     *         The tags associated with the transitive virtual interface.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the transitive virtual interface.
     * </p>
     *
     * @param tags <p>
     *            The tags associated with the transitive virtual interface.
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
     * The tags associated with the transitive virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the transitive virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NewTransitVirtualInterface withTags(Tag... tags) {
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
     * The tags associated with the transitive virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the transitive virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NewTransitVirtualInterface withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getVirtualInterfaceName() != null)
            sb.append("virtualInterfaceName: " + getVirtualInterfaceName() + ",");
        if (getVlan() != null)
            sb.append("vlan: " + getVlan() + ",");
        if (getAsn() != null)
            sb.append("asn: " + getAsn() + ",");
        if (getMtu() != null)
            sb.append("mtu: " + getMtu() + ",");
        if (getAuthKey() != null)
            sb.append("authKey: " + getAuthKey() + ",");
        if (getAmazonAddress() != null)
            sb.append("amazonAddress: " + getAmazonAddress() + ",");
        if (getCustomerAddress() != null)
            sb.append("customerAddress: " + getCustomerAddress() + ",");
        if (getAddressFamily() != null)
            sb.append("addressFamily: " + getAddressFamily() + ",");
        if (getDirectConnectGatewayId() != null)
            sb.append("directConnectGatewayId: " + getDirectConnectGatewayId() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVirtualInterfaceName() == null) ? 0 : getVirtualInterfaceName().hashCode());
        hashCode = prime * hashCode + ((getVlan() == null) ? 0 : getVlan().hashCode());
        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode + ((getMtu() == null) ? 0 : getMtu().hashCode());
        hashCode = prime * hashCode + ((getAuthKey() == null) ? 0 : getAuthKey().hashCode());
        hashCode = prime * hashCode
                + ((getAmazonAddress() == null) ? 0 : getAmazonAddress().hashCode());
        hashCode = prime * hashCode
                + ((getCustomerAddress() == null) ? 0 : getCustomerAddress().hashCode());
        hashCode = prime * hashCode
                + ((getAddressFamily() == null) ? 0 : getAddressFamily().hashCode());
        hashCode = prime
                * hashCode
                + ((getDirectConnectGatewayId() == null) ? 0 : getDirectConnectGatewayId()
                        .hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NewTransitVirtualInterface == false)
            return false;
        NewTransitVirtualInterface other = (NewTransitVirtualInterface) obj;

        if (other.getVirtualInterfaceName() == null ^ this.getVirtualInterfaceName() == null)
            return false;
        if (other.getVirtualInterfaceName() != null
                && other.getVirtualInterfaceName().equals(this.getVirtualInterfaceName()) == false)
            return false;
        if (other.getVlan() == null ^ this.getVlan() == null)
            return false;
        if (other.getVlan() != null && other.getVlan().equals(this.getVlan()) == false)
            return false;
        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
            return false;
        if (other.getMtu() == null ^ this.getMtu() == null)
            return false;
        if (other.getMtu() != null && other.getMtu().equals(this.getMtu()) == false)
            return false;
        if (other.getAuthKey() == null ^ this.getAuthKey() == null)
            return false;
        if (other.getAuthKey() != null && other.getAuthKey().equals(this.getAuthKey()) == false)
            return false;
        if (other.getAmazonAddress() == null ^ this.getAmazonAddress() == null)
            return false;
        if (other.getAmazonAddress() != null
                && other.getAmazonAddress().equals(this.getAmazonAddress()) == false)
            return false;
        if (other.getCustomerAddress() == null ^ this.getCustomerAddress() == null)
            return false;
        if (other.getCustomerAddress() != null
                && other.getCustomerAddress().equals(this.getCustomerAddress()) == false)
            return false;
        if (other.getAddressFamily() == null ^ this.getAddressFamily() == null)
            return false;
        if (other.getAddressFamily() != null
                && other.getAddressFamily().equals(this.getAddressFamily()) == false)
            return false;
        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null
                && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
