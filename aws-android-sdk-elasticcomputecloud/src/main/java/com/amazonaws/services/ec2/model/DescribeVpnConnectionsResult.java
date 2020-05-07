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
 * Contains the output of DescribeVpnConnections.
 * </p>
 */
public class DescribeVpnConnectionsResult implements Serializable {
    /**
     * <p>
     * Information about one or more VPN connections.
     * </p>
     */
    private java.util.List<VpnConnection> vpnConnections;

    /**
     * <p>
     * Information about one or more VPN connections.
     * </p>
     *
     * @return <p>
     *         Information about one or more VPN connections.
     *         </p>
     */
    public java.util.List<VpnConnection> getVpnConnections() {
        return vpnConnections;
    }

    /**
     * <p>
     * Information about one or more VPN connections.
     * </p>
     *
     * @param vpnConnections <p>
     *            Information about one or more VPN connections.
     *            </p>
     */
    public void setVpnConnections(java.util.Collection<VpnConnection> vpnConnections) {
        if (vpnConnections == null) {
            this.vpnConnections = null;
            return;
        }

        this.vpnConnections = new java.util.ArrayList<VpnConnection>(vpnConnections);
    }

    /**
     * <p>
     * Information about one or more VPN connections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnConnections <p>
     *            Information about one or more VPN connections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpnConnectionsResult withVpnConnections(VpnConnection... vpnConnections) {
        if (getVpnConnections() == null) {
            this.vpnConnections = new java.util.ArrayList<VpnConnection>(vpnConnections.length);
        }
        for (VpnConnection value : vpnConnections) {
            this.vpnConnections.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more VPN connections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnConnections <p>
     *            Information about one or more VPN connections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpnConnectionsResult withVpnConnections(
            java.util.Collection<VpnConnection> vpnConnections) {
        setVpnConnections(vpnConnections);
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
        if (getVpnConnections() != null)
            sb.append("VpnConnections: " + getVpnConnections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVpnConnections() == null) ? 0 : getVpnConnections().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpnConnectionsResult == false)
            return false;
        DescribeVpnConnectionsResult other = (DescribeVpnConnectionsResult) obj;

        if (other.getVpnConnections() == null ^ this.getVpnConnections() == null)
            return false;
        if (other.getVpnConnections() != null
                && other.getVpnConnections().equals(this.getVpnConnections()) == false)
            return false;
        return true;
    }
}
