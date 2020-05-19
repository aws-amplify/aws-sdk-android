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
 * Modifies the specified Client VPN endpoint. Modifying the DNS server resets
 * existing client connections.
 * </p>
 */
public class ModifyClientVpnEndpointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the Client VPN endpoint to modify.
     * </p>
     */
    private String clientVpnEndpointId;

    /**
     * <p>
     * The ARN of the server certificate to be used. The server certificate must
     * be provisioned in AWS Certificate Manager (ACM).
     * </p>
     */
    private String serverCertificateArn;

    /**
     * <p>
     * Information about the client connection logging options.
     * </p>
     * <p>
     * If you enable client connection logging, data about client connections is
     * sent to a Cloudwatch Logs log stream. The following information is
     * logged:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection results (successful and unsuccessful)
     * </p>
     * </li>
     * <li>
     * <p>
     * Reasons for unsuccessful client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection termination time
     * </p>
     * </li>
     * </ul>
     */
    private ConnectionLogOptions connectionLogOptions;

    /**
     * <p>
     * Information about the DNS servers to be used by Client VPN connections. A
     * Client VPN endpoint can have up to two DNS servers.
     * </p>
     */
    private DnsServersOptionsModifyStructure dnsServers;

    /**
     * <p>
     * The port number to assign to the Client VPN endpoint for TCP and UDP
     * traffic.
     * </p>
     * <p>
     * Valid Values: <code>443</code> | <code>1194</code>
     * </p>
     * <p>
     * Default Value: <code>443</code>
     * </p>
     */
    private Integer vpnPort;

    /**
     * <p>
     * A brief description of the Client VPN endpoint.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Indicates whether the VPN is split-tunnel.
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
     * The IDs of one or more security groups to apply to the target network.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * The ID of the VPC to associate with the Client VPN endpoint.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The ID of the Client VPN endpoint to modify.
     * </p>
     *
     * @return <p>
     *         The ID of the Client VPN endpoint to modify.
     *         </p>
     */
    public String getClientVpnEndpointId() {
        return clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint to modify.
     * </p>
     *
     * @param clientVpnEndpointId <p>
     *            The ID of the Client VPN endpoint to modify.
     *            </p>
     */
    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientVpnEndpointId <p>
     *            The ID of the Client VPN endpoint to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClientVpnEndpointRequest withClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
        return this;
    }

    /**
     * <p>
     * The ARN of the server certificate to be used. The server certificate must
     * be provisioned in AWS Certificate Manager (ACM).
     * </p>
     *
     * @return <p>
     *         The ARN of the server certificate to be used. The server
     *         certificate must be provisioned in AWS Certificate Manager (ACM).
     *         </p>
     */
    public String getServerCertificateArn() {
        return serverCertificateArn;
    }

    /**
     * <p>
     * The ARN of the server certificate to be used. The server certificate must
     * be provisioned in AWS Certificate Manager (ACM).
     * </p>
     *
     * @param serverCertificateArn <p>
     *            The ARN of the server certificate to be used. The server
     *            certificate must be provisioned in AWS Certificate Manager
     *            (ACM).
     *            </p>
     */
    public void setServerCertificateArn(String serverCertificateArn) {
        this.serverCertificateArn = serverCertificateArn;
    }

    /**
     * <p>
     * The ARN of the server certificate to be used. The server certificate must
     * be provisioned in AWS Certificate Manager (ACM).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverCertificateArn <p>
     *            The ARN of the server certificate to be used. The server
     *            certificate must be provisioned in AWS Certificate Manager
     *            (ACM).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClientVpnEndpointRequest withServerCertificateArn(String serverCertificateArn) {
        this.serverCertificateArn = serverCertificateArn;
        return this;
    }

    /**
     * <p>
     * Information about the client connection logging options.
     * </p>
     * <p>
     * If you enable client connection logging, data about client connections is
     * sent to a Cloudwatch Logs log stream. The following information is
     * logged:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection results (successful and unsuccessful)
     * </p>
     * </li>
     * <li>
     * <p>
     * Reasons for unsuccessful client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection termination time
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Information about the client connection logging options.
     *         </p>
     *         <p>
     *         If you enable client connection logging, data about client
     *         connections is sent to a Cloudwatch Logs log stream. The
     *         following information is logged:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Client connection requests
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Client connection results (successful and unsuccessful)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Reasons for unsuccessful client connection requests
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Client connection termination time
     *         </p>
     *         </li>
     *         </ul>
     */
    public ConnectionLogOptions getConnectionLogOptions() {
        return connectionLogOptions;
    }

    /**
     * <p>
     * Information about the client connection logging options.
     * </p>
     * <p>
     * If you enable client connection logging, data about client connections is
     * sent to a Cloudwatch Logs log stream. The following information is
     * logged:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection results (successful and unsuccessful)
     * </p>
     * </li>
     * <li>
     * <p>
     * Reasons for unsuccessful client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection termination time
     * </p>
     * </li>
     * </ul>
     *
     * @param connectionLogOptions <p>
     *            Information about the client connection logging options.
     *            </p>
     *            <p>
     *            If you enable client connection logging, data about client
     *            connections is sent to a Cloudwatch Logs log stream. The
     *            following information is logged:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Client connection requests
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Client connection results (successful and unsuccessful)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Reasons for unsuccessful client connection requests
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Client connection termination time
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setConnectionLogOptions(ConnectionLogOptions connectionLogOptions) {
        this.connectionLogOptions = connectionLogOptions;
    }

    /**
     * <p>
     * Information about the client connection logging options.
     * </p>
     * <p>
     * If you enable client connection logging, data about client connections is
     * sent to a Cloudwatch Logs log stream. The following information is
     * logged:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection results (successful and unsuccessful)
     * </p>
     * </li>
     * <li>
     * <p>
     * Reasons for unsuccessful client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection termination time
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionLogOptions <p>
     *            Information about the client connection logging options.
     *            </p>
     *            <p>
     *            If you enable client connection logging, data about client
     *            connections is sent to a Cloudwatch Logs log stream. The
     *            following information is logged:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Client connection requests
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Client connection results (successful and unsuccessful)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Reasons for unsuccessful client connection requests
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Client connection termination time
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClientVpnEndpointRequest withConnectionLogOptions(
            ConnectionLogOptions connectionLogOptions) {
        this.connectionLogOptions = connectionLogOptions;
        return this;
    }

    /**
     * <p>
     * Information about the DNS servers to be used by Client VPN connections. A
     * Client VPN endpoint can have up to two DNS servers.
     * </p>
     *
     * @return <p>
     *         Information about the DNS servers to be used by Client VPN
     *         connections. A Client VPN endpoint can have up to two DNS
     *         servers.
     *         </p>
     */
    public DnsServersOptionsModifyStructure getDnsServers() {
        return dnsServers;
    }

    /**
     * <p>
     * Information about the DNS servers to be used by Client VPN connections. A
     * Client VPN endpoint can have up to two DNS servers.
     * </p>
     *
     * @param dnsServers <p>
     *            Information about the DNS servers to be used by Client VPN
     *            connections. A Client VPN endpoint can have up to two DNS
     *            servers.
     *            </p>
     */
    public void setDnsServers(DnsServersOptionsModifyStructure dnsServers) {
        this.dnsServers = dnsServers;
    }

    /**
     * <p>
     * Information about the DNS servers to be used by Client VPN connections. A
     * Client VPN endpoint can have up to two DNS servers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsServers <p>
     *            Information about the DNS servers to be used by Client VPN
     *            connections. A Client VPN endpoint can have up to two DNS
     *            servers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClientVpnEndpointRequest withDnsServers(DnsServersOptionsModifyStructure dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

    /**
     * <p>
     * The port number to assign to the Client VPN endpoint for TCP and UDP
     * traffic.
     * </p>
     * <p>
     * Valid Values: <code>443</code> | <code>1194</code>
     * </p>
     * <p>
     * Default Value: <code>443</code>
     * </p>
     *
     * @return <p>
     *         The port number to assign to the Client VPN endpoint for TCP and
     *         UDP traffic.
     *         </p>
     *         <p>
     *         Valid Values: <code>443</code> | <code>1194</code>
     *         </p>
     *         <p>
     *         Default Value: <code>443</code>
     *         </p>
     */
    public Integer getVpnPort() {
        return vpnPort;
    }

    /**
     * <p>
     * The port number to assign to the Client VPN endpoint for TCP and UDP
     * traffic.
     * </p>
     * <p>
     * Valid Values: <code>443</code> | <code>1194</code>
     * </p>
     * <p>
     * Default Value: <code>443</code>
     * </p>
     *
     * @param vpnPort <p>
     *            The port number to assign to the Client VPN endpoint for TCP
     *            and UDP traffic.
     *            </p>
     *            <p>
     *            Valid Values: <code>443</code> | <code>1194</code>
     *            </p>
     *            <p>
     *            Default Value: <code>443</code>
     *            </p>
     */
    public void setVpnPort(Integer vpnPort) {
        this.vpnPort = vpnPort;
    }

    /**
     * <p>
     * The port number to assign to the Client VPN endpoint for TCP and UDP
     * traffic.
     * </p>
     * <p>
     * Valid Values: <code>443</code> | <code>1194</code>
     * </p>
     * <p>
     * Default Value: <code>443</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnPort <p>
     *            The port number to assign to the Client VPN endpoint for TCP
     *            and UDP traffic.
     *            </p>
     *            <p>
     *            Valid Values: <code>443</code> | <code>1194</code>
     *            </p>
     *            <p>
     *            Default Value: <code>443</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClientVpnEndpointRequest withVpnPort(Integer vpnPort) {
        this.vpnPort = vpnPort;
        return this;
    }

    /**
     * <p>
     * A brief description of the Client VPN endpoint.
     * </p>
     *
     * @return <p>
     *         A brief description of the Client VPN endpoint.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A brief description of the Client VPN endpoint.
     * </p>
     *
     * @param description <p>
     *            A brief description of the Client VPN endpoint.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the Client VPN endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A brief description of the Client VPN endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClientVpnEndpointRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Indicates whether the VPN is split-tunnel.
     * </p>
     * <p>
     * For information about split-tunnel VPN endpoints, see <a href=
     * "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html"
     * >Split-Tunnel AWS Client VPN Endpoint</a> in the <i>AWS Client VPN
     * Administrator Guide</i>.
     * </p>
     *
     * @return <p>
     *         Indicates whether the VPN is split-tunnel.
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
     * Indicates whether the VPN is split-tunnel.
     * </p>
     * <p>
     * For information about split-tunnel VPN endpoints, see <a href=
     * "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html"
     * >Split-Tunnel AWS Client VPN Endpoint</a> in the <i>AWS Client VPN
     * Administrator Guide</i>.
     * </p>
     *
     * @return <p>
     *         Indicates whether the VPN is split-tunnel.
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
     * Indicates whether the VPN is split-tunnel.
     * </p>
     * <p>
     * For information about split-tunnel VPN endpoints, see <a href=
     * "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html"
     * >Split-Tunnel AWS Client VPN Endpoint</a> in the <i>AWS Client VPN
     * Administrator Guide</i>.
     * </p>
     *
     * @param splitTunnel <p>
     *            Indicates whether the VPN is split-tunnel.
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
     * Indicates whether the VPN is split-tunnel.
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
     *            Indicates whether the VPN is split-tunnel.
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
    public ModifyClientVpnEndpointRequest withSplitTunnel(Boolean splitTunnel) {
        this.splitTunnel = splitTunnel;
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
    public ModifyClientVpnEndpointRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The IDs of one or more security groups to apply to the target network.
     * </p>
     *
     * @return <p>
     *         The IDs of one or more security groups to apply to the target
     *         network.
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The IDs of one or more security groups to apply to the target network.
     * </p>
     *
     * @param securityGroupIds <p>
     *            The IDs of one or more security groups to apply to the target
     *            network.
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
     * The IDs of one or more security groups to apply to the target network.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The IDs of one or more security groups to apply to the target
     *            network.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClientVpnEndpointRequest withSecurityGroupIds(String... securityGroupIds) {
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
     * The IDs of one or more security groups to apply to the target network.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The IDs of one or more security groups to apply to the target
     *            network.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClientVpnEndpointRequest withSecurityGroupIds(
            java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC to associate with the Client VPN endpoint.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC to associate with the Client VPN endpoint.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The ID of the VPC to associate with the Client VPN endpoint.
     * </p>
     *
     * @param vpcId <p>
     *            The ID of the VPC to associate with the Client VPN endpoint.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC to associate with the Client VPN endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The ID of the VPC to associate with the Client VPN endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClientVpnEndpointRequest withVpcId(String vpcId) {
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
        if (getServerCertificateArn() != null)
            sb.append("ServerCertificateArn: " + getServerCertificateArn() + ",");
        if (getConnectionLogOptions() != null)
            sb.append("ConnectionLogOptions: " + getConnectionLogOptions() + ",");
        if (getDnsServers() != null)
            sb.append("DnsServers: " + getDnsServers() + ",");
        if (getVpnPort() != null)
            sb.append("VpnPort: " + getVpnPort() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSplitTunnel() != null)
            sb.append("SplitTunnel: " + getSplitTunnel() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
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
                + ((getServerCertificateArn() == null) ? 0 : getServerCertificateArn().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionLogOptions() == null) ? 0 : getConnectionLogOptions().hashCode());
        hashCode = prime * hashCode + ((getDnsServers() == null) ? 0 : getDnsServers().hashCode());
        hashCode = prime * hashCode + ((getVpnPort() == null) ? 0 : getVpnPort().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getSplitTunnel() == null) ? 0 : getSplitTunnel().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
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

        if (obj instanceof ModifyClientVpnEndpointRequest == false)
            return false;
        ModifyClientVpnEndpointRequest other = (ModifyClientVpnEndpointRequest) obj;

        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null
                && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getServerCertificateArn() == null ^ this.getServerCertificateArn() == null)
            return false;
        if (other.getServerCertificateArn() != null
                && other.getServerCertificateArn().equals(this.getServerCertificateArn()) == false)
            return false;
        if (other.getConnectionLogOptions() == null ^ this.getConnectionLogOptions() == null)
            return false;
        if (other.getConnectionLogOptions() != null
                && other.getConnectionLogOptions().equals(this.getConnectionLogOptions()) == false)
            return false;
        if (other.getDnsServers() == null ^ this.getDnsServers() == null)
            return false;
        if (other.getDnsServers() != null
                && other.getDnsServers().equals(this.getDnsServers()) == false)
            return false;
        if (other.getVpnPort() == null ^ this.getVpnPort() == null)
            return false;
        if (other.getVpnPort() != null && other.getVpnPort().equals(this.getVpnPort()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSplitTunnel() == null ^ this.getSplitTunnel() == null)
            return false;
        if (other.getSplitTunnel() != null
                && other.getSplitTunnel().equals(this.getSplitTunnel()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
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
