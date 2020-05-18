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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * Hostnames and IP address entries that are added to the
 * <code>/etc/hosts</code> file of a container via the <code>extraHosts</code>
 * parameter of its <a>ContainerDefinition</a>.
 * </p>
 */
public class HostEntry implements Serializable {
    /**
     * <p>
     * The hostname to use in the <code>/etc/hosts</code> entry.
     * </p>
     */
    private String hostname;

    /**
     * <p>
     * The IP address to use in the <code>/etc/hosts</code> entry.
     * </p>
     */
    private String ipAddress;

    /**
     * <p>
     * The hostname to use in the <code>/etc/hosts</code> entry.
     * </p>
     *
     * @return <p>
     *         The hostname to use in the <code>/etc/hosts</code> entry.
     *         </p>
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * <p>
     * The hostname to use in the <code>/etc/hosts</code> entry.
     * </p>
     *
     * @param hostname <p>
     *            The hostname to use in the <code>/etc/hosts</code> entry.
     *            </p>
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * The hostname to use in the <code>/etc/hosts</code> entry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostname <p>
     *            The hostname to use in the <code>/etc/hosts</code> entry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostEntry withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * <p>
     * The IP address to use in the <code>/etc/hosts</code> entry.
     * </p>
     *
     * @return <p>
     *         The IP address to use in the <code>/etc/hosts</code> entry.
     *         </p>
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * <p>
     * The IP address to use in the <code>/etc/hosts</code> entry.
     * </p>
     *
     * @param ipAddress <p>
     *            The IP address to use in the <code>/etc/hosts</code> entry.
     *            </p>
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IP address to use in the <code>/etc/hosts</code> entry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipAddress <p>
     *            The IP address to use in the <code>/etc/hosts</code> entry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostEntry withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
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
            sb.append("hostname: " + getHostname() + ",");
        if (getIpAddress() != null)
            sb.append("ipAddress: " + getIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HostEntry == false)
            return false;
        HostEntry other = (HostEntry) obj;

        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null
                && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        return true;
    }
}
