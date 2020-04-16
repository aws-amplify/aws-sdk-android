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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the virtual private network (VPN) between the VMware
 * vSphere cluster and the AWS website.
 * </p>
 * <p>
 * For more information about RDS on VMware, see the <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
 * > <i>RDS on VMware User Guide.</i> </a>
 * </p>
 */
public class VpnDetails implements Serializable {
    /**
     * <p>
     * The ID of the VPN.
     * </p>
     */
    private String vpnId;

    /**
     * <p>
     * The IP address of network traffic from your on-premises data center. A
     * custom AZ receives the network traffic.
     * </p>
     */
    private String vpnTunnelOriginatorIP;

    /**
     * <p>
     * The IP address of network traffic from AWS to your on-premises data
     * center.
     * </p>
     */
    private String vpnGatewayIp;

    /**
     * <p>
     * The preshared key (PSK) for the VPN.
     * </p>
     */
    private String vpnPSK;

    /**
     * <p>
     * The name of the VPN.
     * </p>
     */
    private String vpnName;

    /**
     * <p>
     * The state of the VPN.
     * </p>
     */
    private String vpnState;

    /**
     * <p>
     * The ID of the VPN.
     * </p>
     *
     * @return <p>
     *         The ID of the VPN.
     *         </p>
     */
    public String getVpnId() {
        return vpnId;
    }

    /**
     * <p>
     * The ID of the VPN.
     * </p>
     *
     * @param vpnId <p>
     *            The ID of the VPN.
     *            </p>
     */
    public void setVpnId(String vpnId) {
        this.vpnId = vpnId;
    }

    /**
     * <p>
     * The ID of the VPN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnId <p>
     *            The ID of the VPN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnDetails withVpnId(String vpnId) {
        this.vpnId = vpnId;
        return this;
    }

    /**
     * <p>
     * The IP address of network traffic from your on-premises data center. A
     * custom AZ receives the network traffic.
     * </p>
     *
     * @return <p>
     *         The IP address of network traffic from your on-premises data
     *         center. A custom AZ receives the network traffic.
     *         </p>
     */
    public String getVpnTunnelOriginatorIP() {
        return vpnTunnelOriginatorIP;
    }

    /**
     * <p>
     * The IP address of network traffic from your on-premises data center. A
     * custom AZ receives the network traffic.
     * </p>
     *
     * @param vpnTunnelOriginatorIP <p>
     *            The IP address of network traffic from your on-premises data
     *            center. A custom AZ receives the network traffic.
     *            </p>
     */
    public void setVpnTunnelOriginatorIP(String vpnTunnelOriginatorIP) {
        this.vpnTunnelOriginatorIP = vpnTunnelOriginatorIP;
    }

    /**
     * <p>
     * The IP address of network traffic from your on-premises data center. A
     * custom AZ receives the network traffic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnTunnelOriginatorIP <p>
     *            The IP address of network traffic from your on-premises data
     *            center. A custom AZ receives the network traffic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnDetails withVpnTunnelOriginatorIP(String vpnTunnelOriginatorIP) {
        this.vpnTunnelOriginatorIP = vpnTunnelOriginatorIP;
        return this;
    }

    /**
     * <p>
     * The IP address of network traffic from AWS to your on-premises data
     * center.
     * </p>
     *
     * @return <p>
     *         The IP address of network traffic from AWS to your on-premises
     *         data center.
     *         </p>
     */
    public String getVpnGatewayIp() {
        return vpnGatewayIp;
    }

    /**
     * <p>
     * The IP address of network traffic from AWS to your on-premises data
     * center.
     * </p>
     *
     * @param vpnGatewayIp <p>
     *            The IP address of network traffic from AWS to your on-premises
     *            data center.
     *            </p>
     */
    public void setVpnGatewayIp(String vpnGatewayIp) {
        this.vpnGatewayIp = vpnGatewayIp;
    }

    /**
     * <p>
     * The IP address of network traffic from AWS to your on-premises data
     * center.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnGatewayIp <p>
     *            The IP address of network traffic from AWS to your on-premises
     *            data center.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnDetails withVpnGatewayIp(String vpnGatewayIp) {
        this.vpnGatewayIp = vpnGatewayIp;
        return this;
    }

    /**
     * <p>
     * The preshared key (PSK) for the VPN.
     * </p>
     *
     * @return <p>
     *         The preshared key (PSK) for the VPN.
     *         </p>
     */
    public String getVpnPSK() {
        return vpnPSK;
    }

    /**
     * <p>
     * The preshared key (PSK) for the VPN.
     * </p>
     *
     * @param vpnPSK <p>
     *            The preshared key (PSK) for the VPN.
     *            </p>
     */
    public void setVpnPSK(String vpnPSK) {
        this.vpnPSK = vpnPSK;
    }

    /**
     * <p>
     * The preshared key (PSK) for the VPN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnPSK <p>
     *            The preshared key (PSK) for the VPN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnDetails withVpnPSK(String vpnPSK) {
        this.vpnPSK = vpnPSK;
        return this;
    }

    /**
     * <p>
     * The name of the VPN.
     * </p>
     *
     * @return <p>
     *         The name of the VPN.
     *         </p>
     */
    public String getVpnName() {
        return vpnName;
    }

    /**
     * <p>
     * The name of the VPN.
     * </p>
     *
     * @param vpnName <p>
     *            The name of the VPN.
     *            </p>
     */
    public void setVpnName(String vpnName) {
        this.vpnName = vpnName;
    }

    /**
     * <p>
     * The name of the VPN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnName <p>
     *            The name of the VPN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnDetails withVpnName(String vpnName) {
        this.vpnName = vpnName;
        return this;
    }

    /**
     * <p>
     * The state of the VPN.
     * </p>
     *
     * @return <p>
     *         The state of the VPN.
     *         </p>
     */
    public String getVpnState() {
        return vpnState;
    }

    /**
     * <p>
     * The state of the VPN.
     * </p>
     *
     * @param vpnState <p>
     *            The state of the VPN.
     *            </p>
     */
    public void setVpnState(String vpnState) {
        this.vpnState = vpnState;
    }

    /**
     * <p>
     * The state of the VPN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnState <p>
     *            The state of the VPN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnDetails withVpnState(String vpnState) {
        this.vpnState = vpnState;
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
        if (getVpnId() != null)
            sb.append("VpnId: " + getVpnId() + ",");
        if (getVpnTunnelOriginatorIP() != null)
            sb.append("VpnTunnelOriginatorIP: " + getVpnTunnelOriginatorIP() + ",");
        if (getVpnGatewayIp() != null)
            sb.append("VpnGatewayIp: " + getVpnGatewayIp() + ",");
        if (getVpnPSK() != null)
            sb.append("VpnPSK: " + getVpnPSK() + ",");
        if (getVpnName() != null)
            sb.append("VpnName: " + getVpnName() + ",");
        if (getVpnState() != null)
            sb.append("VpnState: " + getVpnState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpnId() == null) ? 0 : getVpnId().hashCode());
        hashCode = prime
                * hashCode
                + ((getVpnTunnelOriginatorIP() == null) ? 0 : getVpnTunnelOriginatorIP().hashCode());
        hashCode = prime * hashCode
                + ((getVpnGatewayIp() == null) ? 0 : getVpnGatewayIp().hashCode());
        hashCode = prime * hashCode + ((getVpnPSK() == null) ? 0 : getVpnPSK().hashCode());
        hashCode = prime * hashCode + ((getVpnName() == null) ? 0 : getVpnName().hashCode());
        hashCode = prime * hashCode + ((getVpnState() == null) ? 0 : getVpnState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpnDetails == false)
            return false;
        VpnDetails other = (VpnDetails) obj;

        if (other.getVpnId() == null ^ this.getVpnId() == null)
            return false;
        if (other.getVpnId() != null && other.getVpnId().equals(this.getVpnId()) == false)
            return false;
        if (other.getVpnTunnelOriginatorIP() == null ^ this.getVpnTunnelOriginatorIP() == null)
            return false;
        if (other.getVpnTunnelOriginatorIP() != null
                && other.getVpnTunnelOriginatorIP().equals(this.getVpnTunnelOriginatorIP()) == false)
            return false;
        if (other.getVpnGatewayIp() == null ^ this.getVpnGatewayIp() == null)
            return false;
        if (other.getVpnGatewayIp() != null
                && other.getVpnGatewayIp().equals(this.getVpnGatewayIp()) == false)
            return false;
        if (other.getVpnPSK() == null ^ this.getVpnPSK() == null)
            return false;
        if (other.getVpnPSK() != null && other.getVpnPSK().equals(this.getVpnPSK()) == false)
            return false;
        if (other.getVpnName() == null ^ this.getVpnName() == null)
            return false;
        if (other.getVpnName() != null && other.getVpnName().equals(this.getVpnName()) == false)
            return false;
        if (other.getVpnState() == null ^ this.getVpnState() == null)
            return false;
        if (other.getVpnState() != null && other.getVpnState().equals(this.getVpnState()) == false)
            return false;
        return true;
    }
}
