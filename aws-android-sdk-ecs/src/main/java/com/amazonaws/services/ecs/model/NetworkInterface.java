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
 * An object representing the elastic network interface for tasks that use the
 * <code>awsvpc</code> network mode.
 * </p>
 */
public class NetworkInterface implements Serializable {
    /**
     * <p>
     * The attachment ID for the network interface.
     * </p>
     */
    private String attachmentId;

    /**
     * <p>
     * The private IPv4 address for the network interface.
     * </p>
     */
    private String privateIpv4Address;

    /**
     * <p>
     * The private IPv6 address for the network interface.
     * </p>
     */
    private String ipv6Address;

    /**
     * <p>
     * The attachment ID for the network interface.
     * </p>
     *
     * @return <p>
     *         The attachment ID for the network interface.
     *         </p>
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    /**
     * <p>
     * The attachment ID for the network interface.
     * </p>
     *
     * @param attachmentId <p>
     *            The attachment ID for the network interface.
     *            </p>
     */
    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * <p>
     * The attachment ID for the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachmentId <p>
     *            The attachment ID for the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * <p>
     * The private IPv4 address for the network interface.
     * </p>
     *
     * @return <p>
     *         The private IPv4 address for the network interface.
     *         </p>
     */
    public String getPrivateIpv4Address() {
        return privateIpv4Address;
    }

    /**
     * <p>
     * The private IPv4 address for the network interface.
     * </p>
     *
     * @param privateIpv4Address <p>
     *            The private IPv4 address for the network interface.
     *            </p>
     */
    public void setPrivateIpv4Address(String privateIpv4Address) {
        this.privateIpv4Address = privateIpv4Address;
    }

    /**
     * <p>
     * The private IPv4 address for the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpv4Address <p>
     *            The private IPv4 address for the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterface withPrivateIpv4Address(String privateIpv4Address) {
        this.privateIpv4Address = privateIpv4Address;
        return this;
    }

    /**
     * <p>
     * The private IPv6 address for the network interface.
     * </p>
     *
     * @return <p>
     *         The private IPv6 address for the network interface.
     *         </p>
     */
    public String getIpv6Address() {
        return ipv6Address;
    }

    /**
     * <p>
     * The private IPv6 address for the network interface.
     * </p>
     *
     * @param ipv6Address <p>
     *            The private IPv6 address for the network interface.
     *            </p>
     */
    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    /**
     * <p>
     * The private IPv6 address for the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Address <p>
     *            The private IPv6 address for the network interface.
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
        if (getAttachmentId() != null)
            sb.append("attachmentId: " + getAttachmentId() + ",");
        if (getPrivateIpv4Address() != null)
            sb.append("privateIpv4Address: " + getPrivateIpv4Address() + ",");
        if (getIpv6Address() != null)
            sb.append("ipv6Address: " + getIpv6Address());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateIpv4Address() == null) ? 0 : getPrivateIpv4Address().hashCode());
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

        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null)
            return false;
        if (other.getAttachmentId() != null
                && other.getAttachmentId().equals(this.getAttachmentId()) == false)
            return false;
        if (other.getPrivateIpv4Address() == null ^ this.getPrivateIpv4Address() == null)
            return false;
        if (other.getPrivateIpv4Address() != null
                && other.getPrivateIpv4Address().equals(this.getPrivateIpv4Address()) == false)
            return false;
        if (other.getIpv6Address() == null ^ this.getIpv6Address() == null)
            return false;
        if (other.getIpv6Address() != null
                && other.getIpv6Address().equals(this.getIpv6Address()) == false)
            return false;
        return true;
    }
}
