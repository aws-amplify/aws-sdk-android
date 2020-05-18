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
 * Describes an IPv6 address associated with a network interface.
 * </p>
 */
public class NetworkInterfaceIpv6Address implements Serializable {
    /**
     * <p>
     * The IPv6 address.
     * </p>
     */
    private String ipv6Address;

    /**
     * <p>
     * The IPv6 address.
     * </p>
     *
     * @return <p>
     *         The IPv6 address.
     *         </p>
     */
    public String getIpv6Address() {
        return ipv6Address;
    }

    /**
     * <p>
     * The IPv6 address.
     * </p>
     *
     * @param ipv6Address <p>
     *            The IPv6 address.
     *            </p>
     */
    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    /**
     * <p>
     * The IPv6 address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Address <p>
     *            The IPv6 address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterfaceIpv6Address withIpv6Address(String ipv6Address) {
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
                + ((getIpv6Address() == null) ? 0 : getIpv6Address().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkInterfaceIpv6Address == false)
            return false;
        NetworkInterfaceIpv6Address other = (NetworkInterfaceIpv6Address) obj;

        if (other.getIpv6Address() == null ^ this.getIpv6Address() == null)
            return false;
        if (other.getIpv6Address() != null
                && other.getIpv6Address().equals(this.getIpv6Address()) == false)
            return false;
        return true;
    }
}
