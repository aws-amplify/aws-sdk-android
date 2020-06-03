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
 * Information about a new BGP peer.
 * </p>
 */
public class NewBGPPeer implements Serializable {
    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration.
     * </p>
     */
    private Integer asn;

    /**
     * <p>
     * The authentication key for BGP configuration. This string has a minimum
     * length of 6 characters and and a maximun lenth of 80 characters.
     * </p>
     */
    private String authKey;

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
     * The autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration.
     * </p>
     *
     * @return <p>
     *         The autonomous system (AS) number for Border Gateway Protocol
     *         (BGP) configuration.
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
     *
     * @param asn <p>
     *            The autonomous system (AS) number for Border Gateway Protocol
     *            (BGP) configuration.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param asn <p>
     *            The autonomous system (AS) number for Border Gateway Protocol
     *            (BGP) configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NewBGPPeer withAsn(Integer asn) {
        this.asn = asn;
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
    public NewBGPPeer withAuthKey(String authKey) {
        this.authKey = authKey;
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
    public NewBGPPeer withAddressFamily(String addressFamily) {
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
    public NewBGPPeer withAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily.toString();
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
    public NewBGPPeer withAmazonAddress(String amazonAddress) {
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
    public NewBGPPeer withCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
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
        if (getAsn() != null)
            sb.append("asn: " + getAsn() + ",");
        if (getAuthKey() != null)
            sb.append("authKey: " + getAuthKey() + ",");
        if (getAddressFamily() != null)
            sb.append("addressFamily: " + getAddressFamily() + ",");
        if (getAmazonAddress() != null)
            sb.append("amazonAddress: " + getAmazonAddress() + ",");
        if (getCustomerAddress() != null)
            sb.append("customerAddress: " + getCustomerAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode + ((getAuthKey() == null) ? 0 : getAuthKey().hashCode());
        hashCode = prime * hashCode
                + ((getAddressFamily() == null) ? 0 : getAddressFamily().hashCode());
        hashCode = prime * hashCode
                + ((getAmazonAddress() == null) ? 0 : getAmazonAddress().hashCode());
        hashCode = prime * hashCode
                + ((getCustomerAddress() == null) ? 0 : getCustomerAddress().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NewBGPPeer == false)
            return false;
        NewBGPPeer other = (NewBGPPeer) obj;

        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
            return false;
        if (other.getAuthKey() == null ^ this.getAuthKey() == null)
            return false;
        if (other.getAuthKey() != null && other.getAuthKey().equals(this.getAuthKey()) == false)
            return false;
        if (other.getAddressFamily() == null ^ this.getAddressFamily() == null)
            return false;
        if (other.getAddressFamily() != null
                && other.getAddressFamily().equals(this.getAddressFamily()) == false)
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
        return true;
    }
}
