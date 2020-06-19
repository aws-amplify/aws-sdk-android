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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * The network settings for the input device.
 */
public class InputDeviceNetworkSettings implements Serializable {
    /**
     * The DNS addresses of the input device.
     */
    private java.util.List<String> dnsAddresses;

    /**
     * The network gateway IP address.
     */
    private String gateway;

    /**
     * The IP address of the input device.
     */
    private String ipAddress;

    /**
     * Specifies whether the input device has been configured (outside of
     * MediaLive) to use a dynamic IP address assignment (DHCP) or a static IP
     * address.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, DHCP
     */
    private String ipScheme;

    /**
     * The subnet mask of the input device.
     */
    private String subnetMask;

    /**
     * The DNS addresses of the input device.
     *
     * @return The DNS addresses of the input device.
     */
    public java.util.List<String> getDnsAddresses() {
        return dnsAddresses;
    }

    /**
     * The DNS addresses of the input device.
     *
     * @param dnsAddresses The DNS addresses of the input device.
     */
    public void setDnsAddresses(java.util.Collection<String> dnsAddresses) {
        if (dnsAddresses == null) {
            this.dnsAddresses = null;
            return;
        }

        this.dnsAddresses = new java.util.ArrayList<String>(dnsAddresses);
    }

    /**
     * The DNS addresses of the input device.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsAddresses The DNS addresses of the input device.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDeviceNetworkSettings withDnsAddresses(String... dnsAddresses) {
        if (getDnsAddresses() == null) {
            this.dnsAddresses = new java.util.ArrayList<String>(dnsAddresses.length);
        }
        for (String value : dnsAddresses) {
            this.dnsAddresses.add(value);
        }
        return this;
    }

    /**
     * The DNS addresses of the input device.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsAddresses The DNS addresses of the input device.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDeviceNetworkSettings withDnsAddresses(java.util.Collection<String> dnsAddresses) {
        setDnsAddresses(dnsAddresses);
        return this;
    }

    /**
     * The network gateway IP address.
     *
     * @return The network gateway IP address.
     */
    public String getGateway() {
        return gateway;
    }

    /**
     * The network gateway IP address.
     *
     * @param gateway The network gateway IP address.
     */
    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    /**
     * The network gateway IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gateway The network gateway IP address.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDeviceNetworkSettings withGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    /**
     * The IP address of the input device.
     *
     * @return The IP address of the input device.
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * The IP address of the input device.
     *
     * @param ipAddress The IP address of the input device.
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * The IP address of the input device.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipAddress The IP address of the input device.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDeviceNetworkSettings withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Specifies whether the input device has been configured (outside of
     * MediaLive) to use a dynamic IP address assignment (DHCP) or a static IP
     * address.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, DHCP
     *
     * @return Specifies whether the input device has been configured (outside
     *         of MediaLive) to use a dynamic IP address assignment (DHCP) or a
     *         static IP address.
     * @see InputDeviceIpScheme
     */
    public String getIpScheme() {
        return ipScheme;
    }

    /**
     * Specifies whether the input device has been configured (outside of
     * MediaLive) to use a dynamic IP address assignment (DHCP) or a static IP
     * address.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, DHCP
     *
     * @param ipScheme Specifies whether the input device has been configured
     *            (outside of MediaLive) to use a dynamic IP address assignment
     *            (DHCP) or a static IP address.
     * @see InputDeviceIpScheme
     */
    public void setIpScheme(String ipScheme) {
        this.ipScheme = ipScheme;
    }

    /**
     * Specifies whether the input device has been configured (outside of
     * MediaLive) to use a dynamic IP address assignment (DHCP) or a static IP
     * address.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, DHCP
     *
     * @param ipScheme Specifies whether the input device has been configured
     *            (outside of MediaLive) to use a dynamic IP address assignment
     *            (DHCP) or a static IP address.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputDeviceIpScheme
     */
    public InputDeviceNetworkSettings withIpScheme(String ipScheme) {
        this.ipScheme = ipScheme;
        return this;
    }

    /**
     * Specifies whether the input device has been configured (outside of
     * MediaLive) to use a dynamic IP address assignment (DHCP) or a static IP
     * address.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, DHCP
     *
     * @param ipScheme Specifies whether the input device has been configured
     *            (outside of MediaLive) to use a dynamic IP address assignment
     *            (DHCP) or a static IP address.
     * @see InputDeviceIpScheme
     */
    public void setIpScheme(InputDeviceIpScheme ipScheme) {
        this.ipScheme = ipScheme.toString();
    }

    /**
     * Specifies whether the input device has been configured (outside of
     * MediaLive) to use a dynamic IP address assignment (DHCP) or a static IP
     * address.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STATIC, DHCP
     *
     * @param ipScheme Specifies whether the input device has been configured
     *            (outside of MediaLive) to use a dynamic IP address assignment
     *            (DHCP) or a static IP address.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputDeviceIpScheme
     */
    public InputDeviceNetworkSettings withIpScheme(InputDeviceIpScheme ipScheme) {
        this.ipScheme = ipScheme.toString();
        return this;
    }

    /**
     * The subnet mask of the input device.
     *
     * @return The subnet mask of the input device.
     */
    public String getSubnetMask() {
        return subnetMask;
    }

    /**
     * The subnet mask of the input device.
     *
     * @param subnetMask The subnet mask of the input device.
     */
    public void setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
    }

    /**
     * The subnet mask of the input device.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetMask The subnet mask of the input device.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDeviceNetworkSettings withSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
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
        if (getDnsAddresses() != null)
            sb.append("DnsAddresses: " + getDnsAddresses() + ",");
        if (getGateway() != null)
            sb.append("Gateway: " + getGateway() + ",");
        if (getIpAddress() != null)
            sb.append("IpAddress: " + getIpAddress() + ",");
        if (getIpScheme() != null)
            sb.append("IpScheme: " + getIpScheme() + ",");
        if (getSubnetMask() != null)
            sb.append("SubnetMask: " + getSubnetMask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDnsAddresses() == null) ? 0 : getDnsAddresses().hashCode());
        hashCode = prime * hashCode + ((getGateway() == null) ? 0 : getGateway().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getIpScheme() == null) ? 0 : getIpScheme().hashCode());
        hashCode = prime * hashCode + ((getSubnetMask() == null) ? 0 : getSubnetMask().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDeviceNetworkSettings == false)
            return false;
        InputDeviceNetworkSettings other = (InputDeviceNetworkSettings) obj;

        if (other.getDnsAddresses() == null ^ this.getDnsAddresses() == null)
            return false;
        if (other.getDnsAddresses() != null
                && other.getDnsAddresses().equals(this.getDnsAddresses()) == false)
            return false;
        if (other.getGateway() == null ^ this.getGateway() == null)
            return false;
        if (other.getGateway() != null && other.getGateway().equals(this.getGateway()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null
                && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getIpScheme() == null ^ this.getIpScheme() == null)
            return false;
        if (other.getIpScheme() != null && other.getIpScheme().equals(this.getIpScheme()) == false)
            return false;
        if (other.getSubnetMask() == null ^ this.getSubnetMask() == null)
            return false;
        if (other.getSubnetMask() != null
                && other.getSubnetMask().equals(this.getSubnetMask()) == false)
            return false;
        return true;
    }
}
