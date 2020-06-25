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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies the VPN tunnel endpoint certificate.
 * </p>
 */
public class ModifyVpnTunnelCertificateRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the AWS Site-to-Site VPN connection.
     * </p>
     */
    private String vpnConnectionId;

    /**
     * <p>
     * The external IP address of the VPN tunnel.
     * </p>
     */
    private String vpnTunnelOutsideIpAddress;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The ID of the AWS Site-to-Site VPN connection.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS Site-to-Site VPN connection.
     *         </p>
     */
    public String getVpnConnectionId() {
        return vpnConnectionId;
    }

    /**
     * <p>
     * The ID of the AWS Site-to-Site VPN connection.
     * </p>
     *
     * @param vpnConnectionId <p>
     *            The ID of the AWS Site-to-Site VPN connection.
     *            </p>
     */
    public void setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }

    /**
     * <p>
     * The ID of the AWS Site-to-Site VPN connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnConnectionId <p>
     *            The ID of the AWS Site-to-Site VPN connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpnTunnelCertificateRequest withVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }

    /**
     * <p>
     * The external IP address of the VPN tunnel.
     * </p>
     *
     * @return <p>
     *         The external IP address of the VPN tunnel.
     *         </p>
     */
    public String getVpnTunnelOutsideIpAddress() {
        return vpnTunnelOutsideIpAddress;
    }

    /**
     * <p>
     * The external IP address of the VPN tunnel.
     * </p>
     *
     * @param vpnTunnelOutsideIpAddress <p>
     *            The external IP address of the VPN tunnel.
     *            </p>
     */
    public void setVpnTunnelOutsideIpAddress(String vpnTunnelOutsideIpAddress) {
        this.vpnTunnelOutsideIpAddress = vpnTunnelOutsideIpAddress;
    }

    /**
     * <p>
     * The external IP address of the VPN tunnel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnTunnelOutsideIpAddress <p>
     *            The external IP address of the VPN tunnel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpnTunnelCertificateRequest withVpnTunnelOutsideIpAddress(
            String vpnTunnelOutsideIpAddress) {
        this.vpnTunnelOutsideIpAddress = vpnTunnelOutsideIpAddress;
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpnTunnelCertificateRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getVpnConnectionId() != null)
            sb.append("VpnConnectionId: " + getVpnConnectionId() + ",");
        if (getVpnTunnelOutsideIpAddress() != null)
            sb.append("VpnTunnelOutsideIpAddress: " + getVpnTunnelOutsideIpAddress() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVpnConnectionId() == null) ? 0 : getVpnConnectionId().hashCode());
        hashCode = prime
                * hashCode
                + ((getVpnTunnelOutsideIpAddress() == null) ? 0 : getVpnTunnelOutsideIpAddress()
                        .hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpnTunnelCertificateRequest == false)
            return false;
        ModifyVpnTunnelCertificateRequest other = (ModifyVpnTunnelCertificateRequest) obj;

        if (other.getVpnConnectionId() == null ^ this.getVpnConnectionId() == null)
            return false;
        if (other.getVpnConnectionId() != null
                && other.getVpnConnectionId().equals(this.getVpnConnectionId()) == false)
            return false;
        if (other.getVpnTunnelOutsideIpAddress() == null
                ^ this.getVpnTunnelOutsideIpAddress() == null)
            return false;
        if (other.getVpnTunnelOutsideIpAddress() != null
                && other.getVpnTunnelOutsideIpAddress().equals(this.getVpnTunnelOutsideIpAddress()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
