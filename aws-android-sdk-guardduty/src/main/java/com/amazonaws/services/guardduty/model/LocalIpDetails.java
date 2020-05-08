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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the local IP address of the connection.
 * </p>
 */
public class LocalIpDetails implements Serializable {
    /**
     * <p>
     * The IPv4 local address of the connection.
     * </p>
     */
    private String ipAddressV4;

    /**
     * <p>
     * The IPv4 local address of the connection.
     * </p>
     *
     * @return <p>
     *         The IPv4 local address of the connection.
     *         </p>
     */
    public String getIpAddressV4() {
        return ipAddressV4;
    }

    /**
     * <p>
     * The IPv4 local address of the connection.
     * </p>
     *
     * @param ipAddressV4 <p>
     *            The IPv4 local address of the connection.
     *            </p>
     */
    public void setIpAddressV4(String ipAddressV4) {
        this.ipAddressV4 = ipAddressV4;
    }

    /**
     * <p>
     * The IPv4 local address of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipAddressV4 <p>
     *            The IPv4 local address of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalIpDetails withIpAddressV4(String ipAddressV4) {
        this.ipAddressV4 = ipAddressV4;
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
        if (getIpAddressV4() != null)
            sb.append("IpAddressV4: " + getIpAddressV4());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIpAddressV4() == null) ? 0 : getIpAddressV4().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocalIpDetails == false)
            return false;
        LocalIpDetails other = (LocalIpDetails) obj;

        if (other.getIpAddressV4() == null ^ this.getIpAddressV4() == null)
            return false;
        if (other.getIpAddressV4() != null
                && other.getIpAddressV4().equals(this.getIpAddressV4()) == false)
            return false;
        return true;
    }
}
