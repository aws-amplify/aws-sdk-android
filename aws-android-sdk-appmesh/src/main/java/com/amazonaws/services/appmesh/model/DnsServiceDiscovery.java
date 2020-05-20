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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents the DNS service discovery information for your
 * virtual node.
 * </p>
 */
public class DnsServiceDiscovery implements Serializable {
    /**
     * <p>
     * Specifies the DNS service discovery hostname for the virtual node.
     * </p>
     */
    private String hostname;

    /**
     * <p>
     * Specifies the DNS service discovery hostname for the virtual node.
     * </p>
     *
     * @return <p>
     *         Specifies the DNS service discovery hostname for the virtual
     *         node.
     *         </p>
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * <p>
     * Specifies the DNS service discovery hostname for the virtual node.
     * </p>
     *
     * @param hostname <p>
     *            Specifies the DNS service discovery hostname for the virtual
     *            node.
     *            </p>
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * Specifies the DNS service discovery hostname for the virtual node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostname <p>
     *            Specifies the DNS service discovery hostname for the virtual
     *            node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DnsServiceDiscovery withHostname(String hostname) {
        this.hostname = hostname;
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
        if (getHostname() != null)
            sb.append("hostname: " + getHostname());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DnsServiceDiscovery == false)
            return false;
        DnsServiceDiscovery other = (DnsServiceDiscovery) obj;

        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        return true;
    }
}
