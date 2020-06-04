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
 * Describes a Client VPN endpoint.
 * </p>
 */
public class ClientVpnEndpoint implements Serializable {
    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     */
    private String clientVpnEndpointId;

    /**
     * <p>
     * A brief description of the endpoint.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The current state of the Client VPN endpoint.
     * </p>
     */
    private ClientVpnEndpointStatus status;

    /**
     * <p>
     * The date and time the Client VPN endpoint was created.
     * </p>
     */
    private String creationTime;

    /**
     * <p>
     * The date and time the Client VPN endpoint was deleted, if applicable.
     * </p>
     */
    private String deletionTime;

    /**
     * <p>
     * The DNS name to be used by clients when connecting to the Client VPN
     * endpoint.
     * </p>
     */
    private String dnsName;

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, from which client IP addresses
     * are assigned.
     * </p>
     */
    private String clientCidrBlock;

    /**
     * <p>
     * Information about the DNS servers to be used for DNS resolution.
     * </p>
     */
    private java.util.List<String> dnsServers;

    /**
     * <p>
     * Indicates whether split-tunnel is enabled in the AWS Client VPN endpoint.
     * </p>
     * <p>
     * For information about split-tunnel VPN endpoints, see <a href=
     * "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html"
     * >Split-Tunnel AWS Client VPN Endpoint</a> in the <i>AWS Client VPN
     * Administrator Guide</i>.
     * </p>
     */
    private Boolean splitTunnel;

    /**
     * <p>
     * The protocol used by the VPN session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>openvpn
     */
    private String vpnProtocol;

    /**
     * <p>
     * The transport protocol used by the Client VPN endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     */
    private String transportProtocol;

    /**
     * <p>
     * The port number for the Client VPN endpoint.
     * </p>
     */
    private Integer vpnPort;

    /**
     * <p>
     * Information about the associated target networks. A target network is a
     * subnet in a VPC.
     * </p>
     */
    private java.util.List<AssociatedTargetNetwork> associatedTargetNetworks;

    /**
     * <p>
     * The ARN of the server certificate.
     * </p>
     */
    private String serverCertificateArn;

    /**
     * <p>
     * Information about the authentication method used by the Client VPN
     * endpoint.
     * </p>
     */
    private java.util.List<ClientVpnAuthentication> authenticationOptions;

    /**
     * <p>
     * Information about the client connection logging options for the Client
     * VPN endpoint.
     * </p>
     */
    private ConnectionLogResponseOptions connectionLogOptions;

    /**
     * <p>
     * Any tags assigned to the Client VPN endpoint.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The IDs of the security groups for the target network.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     *
     * @return <p>
     *         The ID of the Client VPN endpoint.
     *         </p>
     */
    public String getClientVpnEndpointId() {
        return clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     *
     * @param clientVpnEndpointId <p>
     *            The ID of the Client VPN endpoint.
     *            </p>
     */
    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientVpnEndpointId <p>
     *            The ID of the Client VPN endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
        return this;
    }

    /**
     * <p>
     * A brief description of the endpoint.
     * </p>
     *
     * @return <p>
     *         A brief description of the endpoint.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A brief description of the endpoint.
     * </p>
     *
     * @param description <p>
     *            A brief description of the endpoint.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A brief description of the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The current state of the Client VPN endpoint.
     * </p>
     *
     * @return <p>
     *         The current state of the Client VPN endpoint.
     *         </p>
     */
    public ClientVpnEndpointStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The current state of the Client VPN endpoint.
     * </p>
     *
     * @param status <p>
     *            The current state of the Client VPN endpoint.
     *            </p>
     */
    public void setStatus(ClientVpnEndpointStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the Client VPN endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current state of the Client VPN endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withStatus(ClientVpnEndpointStatus status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The date and time the Client VPN endpoint was created.
     * </p>
     *
     * @return <p>
     *         The date and time the Client VPN endpoint was created.
     *         </p>
     */
    public String getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The date and time the Client VPN endpoint was created.
     * </p>
     *
     * @param creationTime <p>
     *            The date and time the Client VPN endpoint was created.
     *            </p>
     */
    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time the Client VPN endpoint was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The date and time the Client VPN endpoint was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The date and time the Client VPN endpoint was deleted, if applicable.
     * </p>
     *
     * @return <p>
     *         The date and time the Client VPN endpoint was deleted, if
     *         applicable.
     *         </p>
     */
    public String getDeletionTime() {
        return deletionTime;
    }

    /**
     * <p>
     * The date and time the Client VPN endpoint was deleted, if applicable.
     * </p>
     *
     * @param deletionTime <p>
     *            The date and time the Client VPN endpoint was deleted, if
     *            applicable.
     *            </p>
     */
    public void setDeletionTime(String deletionTime) {
        this.deletionTime = deletionTime;
    }

    /**
     * <p>
     * The date and time the Client VPN endpoint was deleted, if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletionTime <p>
     *            The date and time the Client VPN endpoint was deleted, if
     *            applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withDeletionTime(String deletionTime) {
        this.deletionTime = deletionTime;
        return this;
    }

    /**
     * <p>
     * The DNS name to be used by clients when connecting to the Client VPN
     * endpoint.
     * </p>
     *
     * @return <p>
     *         The DNS name to be used by clients when connecting to the Client
     *         VPN endpoint.
     *         </p>
     */
    public String getDnsName() {
        return dnsName;
    }

    /**
     * <p>
     * The DNS name to be used by clients when connecting to the Client VPN
     * endpoint.
     * </p>
     *
     * @param dnsName <p>
     *            The DNS name to be used by clients when connecting to the
     *            Client VPN endpoint.
     *            </p>
     */
    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    /**
     * <p>
     * The DNS name to be used by clients when connecting to the Client VPN
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsName <p>
     *            The DNS name to be used by clients when connecting to the
     *            Client VPN endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, from which client IP addresses
     * are assigned.
     * </p>
     *
     * @return <p>
     *         The IPv4 address range, in CIDR notation, from which client IP
     *         addresses are assigned.
     *         </p>
     */
    public String getClientCidrBlock() {
        return clientCidrBlock;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, from which client IP addresses
     * are assigned.
     * </p>
     *
     * @param clientCidrBlock <p>
     *            The IPv4 address range, in CIDR notation, from which client IP
     *            addresses are assigned.
     *            </p>
     */
    public void setClientCidrBlock(String clientCidrBlock) {
        this.clientCidrBlock = clientCidrBlock;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, from which client IP addresses
     * are assigned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientCidrBlock <p>
     *            The IPv4 address range, in CIDR notation, from which client IP
     *            addresses are assigned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withClientCidrBlock(String clientCidrBlock) {
        this.clientCidrBlock = clientCidrBlock;
        return this;
    }

    /**
     * <p>
     * Information about the DNS servers to be used for DNS resolution.
     * </p>
     *
     * @return <p>
     *         Information about the DNS servers to be used for DNS resolution.
     *         </p>
     */
    public java.util.List<String> getDnsServers() {
        return dnsServers;
    }

    /**
     * <p>
     * Information about the DNS servers to be used for DNS resolution.
     * </p>
     *
     * @param dnsServers <p>
     *            Information about the DNS servers to be used for DNS
     *            resolution.
     *            </p>
     */
    public void setDnsServers(java.util.Collection<String> dnsServers) {
        if (dnsServers == null) {
            this.dnsServers = null;
            return;
        }

        this.dnsServers = new java.util.ArrayList<String>(dnsServers);
    }

    /**
     * <p>
     * Information about the DNS servers to be used for DNS resolution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsServers <p>
     *            Information about the DNS servers to be used for DNS
     *            resolution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withDnsServers(String... dnsServers) {
        if (getDnsServers() == null) {
            this.dnsServers = new java.util.ArrayList<String>(dnsServers.length);
        }
        for (String value : dnsServers) {
            this.dnsServers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the DNS servers to be used for DNS resolution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsServers <p>
     *            Information about the DNS servers to be used for DNS
     *            resolution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withDnsServers(java.util.Collection<String> dnsServers) {
        setDnsServers(dnsServers);
        return this;
    }

    /**
     * <p>
     * Indicates whether split-tunnel is enabled in the AWS Client VPN endpoint.
     * </p>
     * <p>
     * For information about split-tunnel VPN endpoints, see <a href=
     * "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html"
     * >Split-Tunnel AWS Client VPN Endpoint</a> in the <i>AWS Client VPN
     * Administrator Guide</i>.
     * </p>
     *
     * @return <p>
     *         Indicates whether split-tunnel is enabled in the AWS Client VPN
     *         endpoint.
     *         </p>
     *         <p>
     *         For information about split-tunnel VPN endpoints, see <a href=
     *         "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html"
     *         >Split-Tunnel AWS Client VPN Endpoint</a> in the <i>AWS Client
     *         VPN Administrator Guide</i>.
     *         </p>
     */
    public Boolean isSplitTunnel() {
        return splitTunnel;
    }

    /**
     * <p>
     * Indicates whether split-tunnel is enabled in the AWS Client VPN endpoint.
     * </p>
     * <p>
     * For information about split-tunnel VPN endpoints, see <a href=
     * "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html"
     * >Split-Tunnel AWS Client VPN Endpoint</a> in the <i>AWS Client VPN
     * Administrator Guide</i>.
     * </p>
     *
     * @return <p>
     *         Indicates whether split-tunnel is enabled in the AWS Client VPN
     *         endpoint.
     *         </p>
     *         <p>
     *         For information about split-tunnel VPN endpoints, see <a href=
     *         "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html"
     *         >Split-Tunnel AWS Client VPN Endpoint</a> in the <i>AWS Client
     *         VPN Administrator Guide</i>.
     *         </p>
     */
    public Boolean getSplitTunnel() {
        return splitTunnel;
    }

    /**
     * <p>
     * Indicates whether split-tunnel is enabled in the AWS Client VPN endpoint.
     * </p>
     * <p>
     * For information about split-tunnel VPN endpoints, see <a href=
     * "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html"
     * >Split-Tunnel AWS Client VPN Endpoint</a> in the <i>AWS Client VPN
     * Administrator Guide</i>.
     * </p>
     *
     * @param splitTunnel <p>
     *            Indicates whether split-tunnel is enabled in the AWS Client
     *            VPN endpoint.
     *            </p>
     *            <p>
     *            For information about split-tunnel VPN endpoints, see <a href=
     *            "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html"
     *            >Split-Tunnel AWS Client VPN Endpoint</a> in the <i>AWS Client
     *            VPN Administrator Guide</i>.
     *            </p>
     */
    public void setSplitTunnel(Boolean splitTunnel) {
        this.splitTunnel = splitTunnel;
    }

    /**
     * <p>
     * Indicates whether split-tunnel is enabled in the AWS Client VPN endpoint.
     * </p>
     * <p>
     * For information about split-tunnel VPN endpoints, see <a href=
     * "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html"
     * >Split-Tunnel AWS Client VPN Endpoint</a> in the <i>AWS Client VPN
     * Administrator Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param splitTunnel <p>
     *            Indicates whether split-tunnel is enabled in the AWS Client
     *            VPN endpoint.
     *            </p>
     *            <p>
     *            For information about split-tunnel VPN endpoints, see <a href=
     *            "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html"
     *            >Split-Tunnel AWS Client VPN Endpoint</a> in the <i>AWS Client
     *            VPN Administrator Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withSplitTunnel(Boolean splitTunnel) {
        this.splitTunnel = splitTunnel;
        return this;
    }

    /**
     * <p>
     * The protocol used by the VPN session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>openvpn
     *
     * @return <p>
     *         The protocol used by the VPN session.
     *         </p>
     * @see VpnProtocol
     */
    public String getVpnProtocol() {
        return vpnProtocol;
    }

    /**
     * <p>
     * The protocol used by the VPN session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>openvpn
     *
     * @param vpnProtocol <p>
     *            The protocol used by the VPN session.
     *            </p>
     * @see VpnProtocol
     */
    public void setVpnProtocol(String vpnProtocol) {
        this.vpnProtocol = vpnProtocol;
    }

    /**
     * <p>
     * The protocol used by the VPN session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>openvpn
     *
     * @param vpnProtocol <p>
     *            The protocol used by the VPN session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpnProtocol
     */
    public ClientVpnEndpoint withVpnProtocol(String vpnProtocol) {
        this.vpnProtocol = vpnProtocol;
        return this;
    }

    /**
     * <p>
     * The protocol used by the VPN session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>openvpn
     *
     * @param vpnProtocol <p>
     *            The protocol used by the VPN session.
     *            </p>
     * @see VpnProtocol
     */
    public void setVpnProtocol(VpnProtocol vpnProtocol) {
        this.vpnProtocol = vpnProtocol.toString();
    }

    /**
     * <p>
     * The protocol used by the VPN session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>openvpn
     *
     * @param vpnProtocol <p>
     *            The protocol used by the VPN session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpnProtocol
     */
    public ClientVpnEndpoint withVpnProtocol(VpnProtocol vpnProtocol) {
        this.vpnProtocol = vpnProtocol.toString();
        return this;
    }

    /**
     * <p>
     * The transport protocol used by the Client VPN endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @return <p>
     *         The transport protocol used by the Client VPN endpoint.
     *         </p>
     * @see TransportProtocol
     */
    public String getTransportProtocol() {
        return transportProtocol;
    }

    /**
     * <p>
     * The transport protocol used by the Client VPN endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @param transportProtocol <p>
     *            The transport protocol used by the Client VPN endpoint.
     *            </p>
     * @see TransportProtocol
     */
    public void setTransportProtocol(String transportProtocol) {
        this.transportProtocol = transportProtocol;
    }

    /**
     * <p>
     * The transport protocol used by the Client VPN endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @param transportProtocol <p>
     *            The transport protocol used by the Client VPN endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransportProtocol
     */
    public ClientVpnEndpoint withTransportProtocol(String transportProtocol) {
        this.transportProtocol = transportProtocol;
        return this;
    }

    /**
     * <p>
     * The transport protocol used by the Client VPN endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @param transportProtocol <p>
     *            The transport protocol used by the Client VPN endpoint.
     *            </p>
     * @see TransportProtocol
     */
    public void setTransportProtocol(TransportProtocol transportProtocol) {
        this.transportProtocol = transportProtocol.toString();
    }

    /**
     * <p>
     * The transport protocol used by the Client VPN endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @param transportProtocol <p>
     *            The transport protocol used by the Client VPN endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransportProtocol
     */
    public ClientVpnEndpoint withTransportProtocol(TransportProtocol transportProtocol) {
        this.transportProtocol = transportProtocol.toString();
        return this;
    }

    /**
     * <p>
     * The port number for the Client VPN endpoint.
     * </p>
     *
     * @return <p>
     *         The port number for the Client VPN endpoint.
     *         </p>
     */
    public Integer getVpnPort() {
        return vpnPort;
    }

    /**
     * <p>
     * The port number for the Client VPN endpoint.
     * </p>
     *
     * @param vpnPort <p>
     *            The port number for the Client VPN endpoint.
     *            </p>
     */
    public void setVpnPort(Integer vpnPort) {
        this.vpnPort = vpnPort;
    }

    /**
     * <p>
     * The port number for the Client VPN endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnPort <p>
     *            The port number for the Client VPN endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withVpnPort(Integer vpnPort) {
        this.vpnPort = vpnPort;
        return this;
    }

    /**
     * <p>
     * Information about the associated target networks. A target network is a
     * subnet in a VPC.
     * </p>
     *
     * @return <p>
     *         Information about the associated target networks. A target
     *         network is a subnet in a VPC.
     *         </p>
     */
    public java.util.List<AssociatedTargetNetwork> getAssociatedTargetNetworks() {
        return associatedTargetNetworks;
    }

    /**
     * <p>
     * Information about the associated target networks. A target network is a
     * subnet in a VPC.
     * </p>
     *
     * @param associatedTargetNetworks <p>
     *            Information about the associated target networks. A target
     *            network is a subnet in a VPC.
     *            </p>
     */
    public void setAssociatedTargetNetworks(
            java.util.Collection<AssociatedTargetNetwork> associatedTargetNetworks) {
        if (associatedTargetNetworks == null) {
            this.associatedTargetNetworks = null;
            return;
        }

        this.associatedTargetNetworks = new java.util.ArrayList<AssociatedTargetNetwork>(
                associatedTargetNetworks);
    }

    /**
     * <p>
     * Information about the associated target networks. A target network is a
     * subnet in a VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedTargetNetworks <p>
     *            Information about the associated target networks. A target
     *            network is a subnet in a VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withAssociatedTargetNetworks(
            AssociatedTargetNetwork... associatedTargetNetworks) {
        if (getAssociatedTargetNetworks() == null) {
            this.associatedTargetNetworks = new java.util.ArrayList<AssociatedTargetNetwork>(
                    associatedTargetNetworks.length);
        }
        for (AssociatedTargetNetwork value : associatedTargetNetworks) {
            this.associatedTargetNetworks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the associated target networks. A target network is a
     * subnet in a VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedTargetNetworks <p>
     *            Information about the associated target networks. A target
     *            network is a subnet in a VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withAssociatedTargetNetworks(
            java.util.Collection<AssociatedTargetNetwork> associatedTargetNetworks) {
        setAssociatedTargetNetworks(associatedTargetNetworks);
        return this;
    }

    /**
     * <p>
     * The ARN of the server certificate.
     * </p>
     *
     * @return <p>
     *         The ARN of the server certificate.
     *         </p>
     */
    public String getServerCertificateArn() {
        return serverCertificateArn;
    }

    /**
     * <p>
     * The ARN of the server certificate.
     * </p>
     *
     * @param serverCertificateArn <p>
     *            The ARN of the server certificate.
     *            </p>
     */
    public void setServerCertificateArn(String serverCertificateArn) {
        this.serverCertificateArn = serverCertificateArn;
    }

    /**
     * <p>
     * The ARN of the server certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverCertificateArn <p>
     *            The ARN of the server certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withServerCertificateArn(String serverCertificateArn) {
        this.serverCertificateArn = serverCertificateArn;
        return this;
    }

    /**
     * <p>
     * Information about the authentication method used by the Client VPN
     * endpoint.
     * </p>
     *
     * @return <p>
     *         Information about the authentication method used by the Client
     *         VPN endpoint.
     *         </p>
     */
    public java.util.List<ClientVpnAuthentication> getAuthenticationOptions() {
        return authenticationOptions;
    }

    /**
     * <p>
     * Information about the authentication method used by the Client VPN
     * endpoint.
     * </p>
     *
     * @param authenticationOptions <p>
     *            Information about the authentication method used by the Client
     *            VPN endpoint.
     *            </p>
     */
    public void setAuthenticationOptions(
            java.util.Collection<ClientVpnAuthentication> authenticationOptions) {
        if (authenticationOptions == null) {
            this.authenticationOptions = null;
            return;
        }

        this.authenticationOptions = new java.util.ArrayList<ClientVpnAuthentication>(
                authenticationOptions);
    }

    /**
     * <p>
     * Information about the authentication method used by the Client VPN
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authenticationOptions <p>
     *            Information about the authentication method used by the Client
     *            VPN endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withAuthenticationOptions(
            ClientVpnAuthentication... authenticationOptions) {
        if (getAuthenticationOptions() == null) {
            this.authenticationOptions = new java.util.ArrayList<ClientVpnAuthentication>(
                    authenticationOptions.length);
        }
        for (ClientVpnAuthentication value : authenticationOptions) {
            this.authenticationOptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the authentication method used by the Client VPN
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authenticationOptions <p>
     *            Information about the authentication method used by the Client
     *            VPN endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withAuthenticationOptions(
            java.util.Collection<ClientVpnAuthentication> authenticationOptions) {
        setAuthenticationOptions(authenticationOptions);
        return this;
    }

    /**
     * <p>
     * Information about the client connection logging options for the Client
     * VPN endpoint.
     * </p>
     *
     * @return <p>
     *         Information about the client connection logging options for the
     *         Client VPN endpoint.
     *         </p>
     */
    public ConnectionLogResponseOptions getConnectionLogOptions() {
        return connectionLogOptions;
    }

    /**
     * <p>
     * Information about the client connection logging options for the Client
     * VPN endpoint.
     * </p>
     *
     * @param connectionLogOptions <p>
     *            Information about the client connection logging options for
     *            the Client VPN endpoint.
     *            </p>
     */
    public void setConnectionLogOptions(ConnectionLogResponseOptions connectionLogOptions) {
        this.connectionLogOptions = connectionLogOptions;
    }

    /**
     * <p>
     * Information about the client connection logging options for the Client
     * VPN endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionLogOptions <p>
     *            Information about the client connection logging options for
     *            the Client VPN endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withConnectionLogOptions(
            ConnectionLogResponseOptions connectionLogOptions) {
        this.connectionLogOptions = connectionLogOptions;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the Client VPN endpoint.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the Client VPN endpoint.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the Client VPN endpoint.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the Client VPN endpoint.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the Client VPN endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the Client VPN endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the Client VPN endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the Client VPN endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups for the target network.
     * </p>
     *
     * @return <p>
     *         The IDs of the security groups for the target network.
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The IDs of the security groups for the target network.
     * </p>
     *
     * @param securityGroupIds <p>
     *            The IDs of the security groups for the target network.
     *            </p>
     */
    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The IDs of the security groups for the target network.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The IDs of the security groups for the target network.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) {
            this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds.length);
        }
        for (String value : securityGroupIds) {
            this.securityGroupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups for the target network.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The IDs of the security groups for the target network.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     *
     * @param vpcId <p>
     *            The ID of the VPC.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The ID of the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnEndpoint withVpcId(String vpcId) {
        this.vpcId = vpcId;
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
        if (getClientVpnEndpointId() != null)
            sb.append("ClientVpnEndpointId: " + getClientVpnEndpointId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getDeletionTime() != null)
            sb.append("DeletionTime: " + getDeletionTime() + ",");
        if (getDnsName() != null)
            sb.append("DnsName: " + getDnsName() + ",");
        if (getClientCidrBlock() != null)
            sb.append("ClientCidrBlock: " + getClientCidrBlock() + ",");
        if (getDnsServers() != null)
            sb.append("DnsServers: " + getDnsServers() + ",");
        if (getSplitTunnel() != null)
            sb.append("SplitTunnel: " + getSplitTunnel() + ",");
        if (getVpnProtocol() != null)
            sb.append("VpnProtocol: " + getVpnProtocol() + ",");
        if (getTransportProtocol() != null)
            sb.append("TransportProtocol: " + getTransportProtocol() + ",");
        if (getVpnPort() != null)
            sb.append("VpnPort: " + getVpnPort() + ",");
        if (getAssociatedTargetNetworks() != null)
            sb.append("AssociatedTargetNetworks: " + getAssociatedTargetNetworks() + ",");
        if (getServerCertificateArn() != null)
            sb.append("ServerCertificateArn: " + getServerCertificateArn() + ",");
        if (getAuthenticationOptions() != null)
            sb.append("AuthenticationOptions: " + getAuthenticationOptions() + ",");
        if (getConnectionLogOptions() != null)
            sb.append("ConnectionLogOptions: " + getConnectionLogOptions() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getDeletionTime() == null) ? 0 : getDeletionTime().hashCode());
        hashCode = prime * hashCode + ((getDnsName() == null) ? 0 : getDnsName().hashCode());
        hashCode = prime * hashCode
                + ((getClientCidrBlock() == null) ? 0 : getClientCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getDnsServers() == null) ? 0 : getDnsServers().hashCode());
        hashCode = prime * hashCode
                + ((getSplitTunnel() == null) ? 0 : getSplitTunnel().hashCode());
        hashCode = prime * hashCode
                + ((getVpnProtocol() == null) ? 0 : getVpnProtocol().hashCode());
        hashCode = prime * hashCode
                + ((getTransportProtocol() == null) ? 0 : getTransportProtocol().hashCode());
        hashCode = prime * hashCode + ((getVpnPort() == null) ? 0 : getVpnPort().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssociatedTargetNetworks() == null) ? 0 : getAssociatedTargetNetworks()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getServerCertificateArn() == null) ? 0 : getServerCertificateArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuthenticationOptions() == null) ? 0 : getAuthenticationOptions().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionLogOptions() == null) ? 0 : getConnectionLogOptions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClientVpnEndpoint == false)
            return false;
        ClientVpnEndpoint other = (ClientVpnEndpoint) obj;

        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null
                && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDeletionTime() == null ^ this.getDeletionTime() == null)
            return false;
        if (other.getDeletionTime() != null
                && other.getDeletionTime().equals(this.getDeletionTime()) == false)
            return false;
        if (other.getDnsName() == null ^ this.getDnsName() == null)
            return false;
        if (other.getDnsName() != null && other.getDnsName().equals(this.getDnsName()) == false)
            return false;
        if (other.getClientCidrBlock() == null ^ this.getClientCidrBlock() == null)
            return false;
        if (other.getClientCidrBlock() != null
                && other.getClientCidrBlock().equals(this.getClientCidrBlock()) == false)
            return false;
        if (other.getDnsServers() == null ^ this.getDnsServers() == null)
            return false;
        if (other.getDnsServers() != null
                && other.getDnsServers().equals(this.getDnsServers()) == false)
            return false;
        if (other.getSplitTunnel() == null ^ this.getSplitTunnel() == null)
            return false;
        if (other.getSplitTunnel() != null
                && other.getSplitTunnel().equals(this.getSplitTunnel()) == false)
            return false;
        if (other.getVpnProtocol() == null ^ this.getVpnProtocol() == null)
            return false;
        if (other.getVpnProtocol() != null
                && other.getVpnProtocol().equals(this.getVpnProtocol()) == false)
            return false;
        if (other.getTransportProtocol() == null ^ this.getTransportProtocol() == null)
            return false;
        if (other.getTransportProtocol() != null
                && other.getTransportProtocol().equals(this.getTransportProtocol()) == false)
            return false;
        if (other.getVpnPort() == null ^ this.getVpnPort() == null)
            return false;
        if (other.getVpnPort() != null && other.getVpnPort().equals(this.getVpnPort()) == false)
            return false;
        if (other.getAssociatedTargetNetworks() == null
                ^ this.getAssociatedTargetNetworks() == null)
            return false;
        if (other.getAssociatedTargetNetworks() != null
                && other.getAssociatedTargetNetworks().equals(this.getAssociatedTargetNetworks()) == false)
            return false;
        if (other.getServerCertificateArn() == null ^ this.getServerCertificateArn() == null)
            return false;
        if (other.getServerCertificateArn() != null
                && other.getServerCertificateArn().equals(this.getServerCertificateArn()) == false)
            return false;
        if (other.getAuthenticationOptions() == null ^ this.getAuthenticationOptions() == null)
            return false;
        if (other.getAuthenticationOptions() != null
                && other.getAuthenticationOptions().equals(this.getAuthenticationOptions()) == false)
            return false;
        if (other.getConnectionLogOptions() == null ^ this.getConnectionLogOptions() == null)
            return false;
        if (other.getConnectionLogOptions() != null
                && other.getConnectionLogOptions().equals(this.getConnectionLogOptions()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null
                && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }
}
