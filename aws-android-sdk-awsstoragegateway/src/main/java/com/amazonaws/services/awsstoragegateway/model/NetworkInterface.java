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

package com.amazonaws.services.awsstoragegateway.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a gateway's network interface.
 * </p>
 */
public class NetworkInterface implements Serializable {
    /**
     * <p>
     * The Internet Protocol version 4 (IPv4) address of the interface.
     * </p>
     */
    private String ipv4Address;

    /**
     * <p>
     * The Media Access Control (MAC) address of the interface.
     * </p>
     * <note>
     * <p>
     * This is currently unsupported and will not be returned in output.
     * </p>
     * </note>
     */
    private String macAddress;

    /**
     * <p>
     * The Internet Protocol version 6 (IPv6) address of the interface.
     * <i>Currently not supported</i>.
     * </p>
     */
    private String ipv6Address;

    /**
     * <p>
     * The Internet Protocol version 4 (IPv4) address of the interface.
     * </p>
     *
     * @return <p>
     *         The Internet Protocol version 4 (IPv4) address of the interface.
     *         </p>
     */
    public String getIpv4Address() {
        return ipv4Address;
    }

    /**
     * <p>
     * The Internet Protocol version 4 (IPv4) address of the interface.
     * </p>
     *
     * @param ipv4Address <p>
     *            The Internet Protocol version 4 (IPv4) address of the
     *            interface.
     *            </p>
     */
    public void setIpv4Address(String ipv4Address) {
        this.ipv4Address = ipv4Address;
    }

    /**
     * <p>
     * The Internet Protocol version 4 (IPv4) address of the interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv4Address <p>
     *            The Internet Protocol version 4 (IPv4) address of the
     *            interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withIpv4Address(String ipv4Address) {
        this.ipv4Address = ipv4Address;
        return this;
    }

    /**
     * <p>
     * The Media Access Control (MAC) address of the interface.
     * </p>
     * <note>
     * <p>
     * This is currently unsupported and will not be returned in output.
     * </p>
     * </note>
     *
     * @return <p>
     *         The Media Access Control (MAC) address of the interface.
     *         </p>
     *         <note>
     *         <p>
     *         This is currently unsupported and will not be returned in output.
     *         </p>
     *         </note>
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * <p>
     * The Media Access Control (MAC) address of the interface.
     * </p>
     * <note>
     * <p>
     * This is currently unsupported and will not be returned in output.
     * </p>
     * </note>
     *
     * @param macAddress <p>
     *            The Media Access Control (MAC) address of the interface.
     *            </p>
     *            <note>
     *            <p>
     *            This is currently unsupported and will not be returned in
     *            output.
     *            </p>
     *            </note>
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * <p>
     * The Media Access Control (MAC) address of the interface.
     * </p>
     * <note>
     * <p>
     * This is currently unsupported and will not be returned in output.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param macAddress <p>
     *            The Media Access Control (MAC) address of the interface.
     *            </p>
     *            <note>
     *            <p>
     *            This is currently unsupported and will not be returned in
     *            output.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    /**
     * <p>
     * The Internet Protocol version 6 (IPv6) address of the interface.
     * <i>Currently not supported</i>.
     * </p>
     *
     * @return <p>
     *         The Internet Protocol version 6 (IPv6) address of the interface.
     *         <i>Currently not supported</i>.
     *         </p>
     */
    public String getIpv6Address() {
        return ipv6Address;
    }

    /**
     * <p>
     * The Internet Protocol version 6 (IPv6) address of the interface.
     * <i>Currently not supported</i>.
     * </p>
     *
     * @param ipv6Address <p>
     *            The Internet Protocol version 6 (IPv6) address of the
     *            interface. <i>Currently not supported</i>.
     *            </p>
     */
    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    /**
     * <p>
     * The Internet Protocol version 6 (IPv6) address of the interface.
     * <i>Currently not supported</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Address <p>
     *            The Internet Protocol version 6 (IPv6) address of the
     *            interface. <i>Currently not supported</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
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
        if (getIpv4Address() != null)
            sb.append("Ipv4Address: " + getIpv4Address() + ",");
        if (getMacAddress() != null)
            sb.append("MacAddress: " + getMacAddress() + ",");
        if (getIpv6Address() != null)
            sb.append("Ipv6Address: " + getIpv6Address());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIpv4Address() == null) ? 0 : getIpv4Address().hashCode());
        hashCode = prime * hashCode + ((getMacAddress() == null) ? 0 : getMacAddress().hashCode());
        hashCode = prime * hashCode
                + ((getIpv6Address() == null) ? 0 : getIpv6Address().hashCode());
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

        if (other.getIpv4Address() == null ^ this.getIpv4Address() == null)
            return false;
        if (other.getIpv4Address() != null
                && other.getIpv4Address().equals(this.getIpv4Address()) == false)
            return false;
        if (other.getMacAddress() == null ^ this.getMacAddress() == null)
            return false;
        if (other.getMacAddress() != null
                && other.getMacAddress().equals(this.getMacAddress()) == false)
            return false;
        if (other.getIpv6Address() == null ^ this.getIpv6Address() == null)
            return false;
        if (other.getIpv6Address() != null
                && other.getIpv6Address().equals(this.getIpv6Address()) == false)
            return false;
        return true;
    }
}
