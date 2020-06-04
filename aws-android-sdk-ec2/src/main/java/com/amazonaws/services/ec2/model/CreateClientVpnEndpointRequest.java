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
 * Creates a Client VPN endpoint. A Client VPN endpoint is the resource you
 * create and configure to enable and manage client VPN sessions. It is the
 * destination endpoint at which all client VPN sessions are terminated.
 * </p>
 */
public class CreateClientVpnEndpointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The IPv4 address range, in CIDR notation, from which to assign client IP
     * addresses. The address range cannot overlap with the local CIDR of the
     * VPC in which the associated subnet is located, or the routes that you add
     * manually. The address range cannot be changed after the Client VPN
     * endpoint has been created. The CIDR block should be /22 or greater.
     * </p>
     */
    private String clientCidrBlock;

    /**
     * <p>
     * The ARN of the server certificate. For more information, see the <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate
     * Manager User Guide</a>.
     * </p>
     */
    private String serverCertificateArn;

    /**
     * <p>
     * Information about the authentication method to be used to authenticate
     * clients.
     * </p>
     */
    private java.util.List<ClientVpnAuthenticationRequest> authenticationOptions;

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
     * Information about the DNS servers to be used for DNS resolution. A Client
     * VPN endpoint can have up to two DNS servers. If no DNS server is
     * specified, the DNS address configured on the device is used for the DNS
     * server.
     * </p>
     */
    private java.util.List<String> dnsServers;

    /**
     * <p>
     * The transport protocol to be used by the VPN session.
     * </p>
     * <p>
     * Default value: <code>udp</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     */
    private String transportProtocol;

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
     * Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
     * </p>
     * <p>
     * By default, split-tunnel on a VPN endpoint is disabled.
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
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The tags to apply to the Client VPN endpoint during creation.
     * </p>
     */
    private java.util.List<TagSpecification> tagSpecifications;

    /**
     * <p>
     * The IDs of one or more security groups to apply to the target network.
     * You must also specify the ID of the VPC that contains the security
     * groups.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * The ID of the VPC to associate with the Client VPN endpoint. If no
     * security group IDs are specified in the request, the default security
     * group for the VPC is applied.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, from which to assign client IP
     * addresses. The address range cannot overlap with the local CIDR of the
     * VPC in which the associated subnet is located, or the routes that you add
     * manually. The address range cannot be changed after the Client VPN
     * endpoint has been created. The CIDR block should be /22 or greater.
     * </p>
     *
     * @return <p>
     *         The IPv4 address range, in CIDR notation, from which to assign
     *         client IP addresses. The address range cannot overlap with the
     *         local CIDR of the VPC in which the associated subnet is located,
     *         or the routes that you add manually. The address range cannot be
     *         changed after the Client VPN endpoint has been created. The CIDR
     *         block should be /22 or greater.
     *         </p>
     */
    public String getClientCidrBlock() {
        return clientCidrBlock;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, from which to assign client IP
     * addresses. The address range cannot overlap with the local CIDR of the
     * VPC in which the associated subnet is located, or the routes that you add
     * manually. The address range cannot be changed after the Client VPN
     * endpoint has been created. The CIDR block should be /22 or greater.
     * </p>
     *
     * @param clientCidrBlock <p>
     *            The IPv4 address range, in CIDR notation, from which to assign
     *            client IP addresses. The address range cannot overlap with the
     *            local CIDR of the VPC in which the associated subnet is
     *            located, or the routes that you add manually. The address
     *            range cannot be changed after the Client VPN endpoint has been
     *            created. The CIDR block should be /22 or greater.
     *            </p>
     */
    public void setClientCidrBlock(String clientCidrBlock) {
        this.clientCidrBlock = clientCidrBlock;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, from which to assign client IP
     * addresses. The address range cannot overlap with the local CIDR of the
     * VPC in which the associated subnet is located, or the routes that you add
     * manually. The address range cannot be changed after the Client VPN
     * endpoint has been created. The CIDR block should be /22 or greater.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientCidrBlock <p>
     *            The IPv4 address range, in CIDR notation, from which to assign
     *            client IP addresses. The address range cannot overlap with the
     *            local CIDR of the VPC in which the associated subnet is
     *            located, or the routes that you add manually. The address
     *            range cannot be changed after the Client VPN endpoint has been
     *            created. The CIDR block should be /22 or greater.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClientVpnEndpointRequest withClientCidrBlock(String clientCidrBlock) {
        this.clientCidrBlock = clientCidrBlock;
        return this;
    }

    /**
     * <p>
     * The ARN of the server certificate. For more information, see the <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate
     * Manager User Guide</a>.
     * </p>
     *
     * @return <p>
     *         The ARN of the server certificate. For more information, see the
     *         <a href="https://docs.aws.amazon.com/acm/latest/userguide/">AWS
     *         Certificate Manager User Guide</a>.
     *         </p>
     */
    public String getServerCertificateArn() {
        return serverCertificateArn;
    }

    /**
     * <p>
     * The ARN of the server certificate. For more information, see the <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate
     * Manager User Guide</a>.
     * </p>
     *
     * @param serverCertificateArn <p>
     *            The ARN of the server certificate. For more information, see
     *            the <a
     *            href="https://docs.aws.amazon.com/acm/latest/userguide/">AWS
     *            Certificate Manager User Guide</a>.
     *            </p>
     */
    public void setServerCertificateArn(String serverCertificateArn) {
        this.serverCertificateArn = serverCertificateArn;
    }

    /**
     * <p>
     * The ARN of the server certificate. For more information, see the <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate
     * Manager User Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverCertificateArn <p>
     *            The ARN of the server certificate. For more information, see
     *            the <a
     *            href="https://docs.aws.amazon.com/acm/latest/userguide/">AWS
     *            Certificate Manager User Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClientVpnEndpointRequest withServerCertificateArn(String serverCertificateArn) {
        this.serverCertificateArn = serverCertificateArn;
        return this;
    }

    /**
     * <p>
     * Information about the authentication method to be used to authenticate
     * clients.
     * </p>
     *
     * @return <p>
     *         Information about the authentication method to be used to
     *         authenticate clients.
     *         </p>
     */
    public java.util.List<ClientVpnAuthenticationRequest> getAuthenticationOptions() {
        return authenticationOptions;
    }

    /**
     * <p>
     * Information about the authentication method to be used to authenticate
     * clients.
     * </p>
     *
     * @param authenticationOptions <p>
     *            Information about the authentication method to be used to
     *            authenticate clients.
     *            </p>
     */
    public void setAuthenticationOptions(
            java.util.Collection<ClientVpnAuthenticationRequest> authenticationOptions) {
        if (authenticationOptions == null) {
            this.authenticationOptions = null;
            return;
        }

        this.authenticationOptions = new java.util.ArrayList<ClientVpnAuthenticationRequest>(
                authenticationOptions);
    }

    /**
     * <p>
     * Information about the authentication method to be used to authenticate
     * clients.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authenticationOptions <p>
     *            Information about the authentication method to be used to
     *            authenticate clients.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClientVpnEndpointRequest withAuthenticationOptions(
            ClientVpnAuthenticationRequest... authenticationOptions) {
        if (getAuthenticationOptions() == null) {
            this.authenticationOptions = new java.util.ArrayList<ClientVpnAuthenticationRequest>(
                    authenticationOptions.length);
        }
        for (ClientVpnAuthenticationRequest value : authenticationOptions) {
            this.authenticationOptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the authentication method to be used to authenticate
     * clients.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authenticationOptions <p>
     *            Information about the authentication method to be used to
     *            authenticate clients.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClientVpnEndpointRequest withAuthenticationOptions(
            java.util.Collection<ClientVpnAuthenticationRequest> authenticationOptions) {
        setAuthenticationOptions(authenticationOptions);
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
    public CreateClientVpnEndpointRequest withConnectionLogOptions(
            ConnectionLogOptions connectionLogOptions) {
        this.connectionLogOptions = connectionLogOptions;
        return this;
    }

    /**
     * <p>
     * Information about the DNS servers to be used for DNS resolution. A Client
     * VPN endpoint can have up to two DNS servers. If no DNS server is
     * specified, the DNS address configured on the device is used for the DNS
     * server.
     * </p>
     *
     * @return <p>
     *         Information about the DNS servers to be used for DNS resolution.
     *         A Client VPN endpoint can have up to two DNS servers. If no DNS
     *         server is specified, the DNS address configured on the device is
     *         used for the DNS server.
     *         </p>
     */
    public java.util.List<String> getDnsServers() {
        return dnsServers;
    }

    /**
     * <p>
     * Information about the DNS servers to be used for DNS resolution. A Client
     * VPN endpoint can have up to two DNS servers. If no DNS server is
     * specified, the DNS address configured on the device is used for the DNS
     * server.
     * </p>
     *
     * @param dnsServers <p>
     *            Information about the DNS servers to be used for DNS
     *            resolution. A Client VPN endpoint can have up to two DNS
     *            servers. If no DNS server is specified, the DNS address
     *            configured on the device is used for the DNS server.
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
     * Information about the DNS servers to be used for DNS resolution. A Client
     * VPN endpoint can have up to two DNS servers. If no DNS server is
     * specified, the DNS address configured on the device is used for the DNS
     * server.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsServers <p>
     *            Information about the DNS servers to be used for DNS
     *            resolution. A Client VPN endpoint can have up to two DNS
     *            servers. If no DNS server is specified, the DNS address
     *            configured on the device is used for the DNS server.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClientVpnEndpointRequest withDnsServers(String... dnsServers) {
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
     * Information about the DNS servers to be used for DNS resolution. A Client
     * VPN endpoint can have up to two DNS servers. If no DNS server is
     * specified, the DNS address configured on the device is used for the DNS
     * server.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsServers <p>
     *            Information about the DNS servers to be used for DNS
     *            resolution. A Client VPN endpoint can have up to two DNS
     *            servers. If no DNS server is specified, the DNS address
     *            configured on the device is used for the DNS server.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClientVpnEndpointRequest withDnsServers(java.util.Collection<String> dnsServers) {
        setDnsServers(dnsServers);
        return this;
    }

    /**
     * <p>
     * The transport protocol to be used by the VPN session.
     * </p>
     * <p>
     * Default value: <code>udp</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @return <p>
     *         The transport protocol to be used by the VPN session.
     *         </p>
     *         <p>
     *         Default value: <code>udp</code>
     *         </p>
     * @see TransportProtocol
     */
    public String getTransportProtocol() {
        return transportProtocol;
    }

    /**
     * <p>
     * The transport protocol to be used by the VPN session.
     * </p>
     * <p>
     * Default value: <code>udp</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @param transportProtocol <p>
     *            The transport protocol to be used by the VPN session.
     *            </p>
     *            <p>
     *            Default value: <code>udp</code>
     *            </p>
     * @see TransportProtocol
     */
    public void setTransportProtocol(String transportProtocol) {
        this.transportProtocol = transportProtocol;
    }

    /**
     * <p>
     * The transport protocol to be used by the VPN session.
     * </p>
     * <p>
     * Default value: <code>udp</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @param transportProtocol <p>
     *            The transport protocol to be used by the VPN session.
     *            </p>
     *            <p>
     *            Default value: <code>udp</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransportProtocol
     */
    public CreateClientVpnEndpointRequest withTransportProtocol(String transportProtocol) {
        this.transportProtocol = transportProtocol;
        return this;
    }

    /**
     * <p>
     * The transport protocol to be used by the VPN session.
     * </p>
     * <p>
     * Default value: <code>udp</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @param transportProtocol <p>
     *            The transport protocol to be used by the VPN session.
     *            </p>
     *            <p>
     *            Default value: <code>udp</code>
     *            </p>
     * @see TransportProtocol
     */
    public void setTransportProtocol(TransportProtocol transportProtocol) {
        this.transportProtocol = transportProtocol.toString();
    }

    /**
     * <p>
     * The transport protocol to be used by the VPN session.
     * </p>
     * <p>
     * Default value: <code>udp</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @param transportProtocol <p>
     *            The transport protocol to be used by the VPN session.
     *            </p>
     *            <p>
     *            Default value: <code>udp</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransportProtocol
     */
    public CreateClientVpnEndpointRequest withTransportProtocol(TransportProtocol transportProtocol) {
        this.transportProtocol = transportProtocol.toString();
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
    public CreateClientVpnEndpointRequest withVpnPort(Integer vpnPort) {
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
    public CreateClientVpnEndpointRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
     * </p>
     * <p>
     * By default, split-tunnel on a VPN endpoint is disabled.
     * </p>
     * <p>
     * For information about split-tunnel VPN endpoints, see <a href=
     * "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html"
     * >Split-Tunnel AWS Client VPN Endpoint</a> in the <i>AWS Client VPN
     * Administrator Guide</i>.
     * </p>
     *
     * @return <p>
     *         Indicates whether split-tunnel is enabled on the AWS Client VPN
     *         endpoint.
     *         </p>
     *         <p>
     *         By default, split-tunnel on a VPN endpoint is disabled.
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
     * Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
     * </p>
     * <p>
     * By default, split-tunnel on a VPN endpoint is disabled.
     * </p>
     * <p>
     * For information about split-tunnel VPN endpoints, see <a href=
     * "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html"
     * >Split-Tunnel AWS Client VPN Endpoint</a> in the <i>AWS Client VPN
     * Administrator Guide</i>.
     * </p>
     *
     * @return <p>
     *         Indicates whether split-tunnel is enabled on the AWS Client VPN
     *         endpoint.
     *         </p>
     *         <p>
     *         By default, split-tunnel on a VPN endpoint is disabled.
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
     * Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
     * </p>
     * <p>
     * By default, split-tunnel on a VPN endpoint is disabled.
     * </p>
     * <p>
     * For information about split-tunnel VPN endpoints, see <a href=
     * "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html"
     * >Split-Tunnel AWS Client VPN Endpoint</a> in the <i>AWS Client VPN
     * Administrator Guide</i>.
     * </p>
     *
     * @param splitTunnel <p>
     *            Indicates whether split-tunnel is enabled on the AWS Client
     *            VPN endpoint.
     *            </p>
     *            <p>
     *            By default, split-tunnel on a VPN endpoint is disabled.
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
     * Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
     * </p>
     * <p>
     * By default, split-tunnel on a VPN endpoint is disabled.
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
     *            Indicates whether split-tunnel is enabled on the AWS Client
     *            VPN endpoint.
     *            </p>
     *            <p>
     *            By default, split-tunnel on a VPN endpoint is disabled.
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
    public CreateClientVpnEndpointRequest withSplitTunnel(Boolean splitTunnel) {
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
    public CreateClientVpnEndpointRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that you provide to ensure the
     *         idempotency of the request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *         >How to Ensure Idempotency</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClientVpnEndpointRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The tags to apply to the Client VPN endpoint during creation.
     * </p>
     *
     * @return <p>
     *         The tags to apply to the Client VPN endpoint during creation.
     *         </p>
     */
    public java.util.List<TagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the Client VPN endpoint during creation.
     * </p>
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the Client VPN endpoint during creation.
     *            </p>
     */
    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new java.util.ArrayList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the Client VPN endpoint during creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the Client VPN endpoint during creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClientVpnEndpointRequest withTagSpecifications(
            TagSpecification... tagSpecifications) {
        if (getTagSpecifications() == null) {
            this.tagSpecifications = new java.util.ArrayList<TagSpecification>(
                    tagSpecifications.length);
        }
        for (TagSpecification value : tagSpecifications) {
            this.tagSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the Client VPN endpoint during creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the Client VPN endpoint during creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClientVpnEndpointRequest withTagSpecifications(
            java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * The IDs of one or more security groups to apply to the target network.
     * You must also specify the ID of the VPC that contains the security
     * groups.
     * </p>
     *
     * @return <p>
     *         The IDs of one or more security groups to apply to the target
     *         network. You must also specify the ID of the VPC that contains
     *         the security groups.
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The IDs of one or more security groups to apply to the target network.
     * You must also specify the ID of the VPC that contains the security
     * groups.
     * </p>
     *
     * @param securityGroupIds <p>
     *            The IDs of one or more security groups to apply to the target
     *            network. You must also specify the ID of the VPC that contains
     *            the security groups.
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
     * You must also specify the ID of the VPC that contains the security
     * groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The IDs of one or more security groups to apply to the target
     *            network. You must also specify the ID of the VPC that contains
     *            the security groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClientVpnEndpointRequest withSecurityGroupIds(String... securityGroupIds) {
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
     * You must also specify the ID of the VPC that contains the security
     * groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The IDs of one or more security groups to apply to the target
     *            network. You must also specify the ID of the VPC that contains
     *            the security groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClientVpnEndpointRequest withSecurityGroupIds(
            java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC to associate with the Client VPN endpoint. If no
     * security group IDs are specified in the request, the default security
     * group for the VPC is applied.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC to associate with the Client VPN endpoint. If
     *         no security group IDs are specified in the request, the default
     *         security group for the VPC is applied.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The ID of the VPC to associate with the Client VPN endpoint. If no
     * security group IDs are specified in the request, the default security
     * group for the VPC is applied.
     * </p>
     *
     * @param vpcId <p>
     *            The ID of the VPC to associate with the Client VPN endpoint.
     *            If no security group IDs are specified in the request, the
     *            default security group for the VPC is applied.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC to associate with the Client VPN endpoint. If no
     * security group IDs are specified in the request, the default security
     * group for the VPC is applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The ID of the VPC to associate with the Client VPN endpoint.
     *            If no security group IDs are specified in the request, the
     *            default security group for the VPC is applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClientVpnEndpointRequest withVpcId(String vpcId) {
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
        if (getClientCidrBlock() != null)
            sb.append("ClientCidrBlock: " + getClientCidrBlock() + ",");
        if (getServerCertificateArn() != null)
            sb.append("ServerCertificateArn: " + getServerCertificateArn() + ",");
        if (getAuthenticationOptions() != null)
            sb.append("AuthenticationOptions: " + getAuthenticationOptions() + ",");
        if (getConnectionLogOptions() != null)
            sb.append("ConnectionLogOptions: " + getConnectionLogOptions() + ",");
        if (getDnsServers() != null)
            sb.append("DnsServers: " + getDnsServers() + ",");
        if (getTransportProtocol() != null)
            sb.append("TransportProtocol: " + getTransportProtocol() + ",");
        if (getVpnPort() != null)
            sb.append("VpnPort: " + getVpnPort() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSplitTunnel() != null)
            sb.append("SplitTunnel: " + getSplitTunnel() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: " + getTagSpecifications() + ",");
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
                + ((getClientCidrBlock() == null) ? 0 : getClientCidrBlock().hashCode());
        hashCode = prime * hashCode
                + ((getServerCertificateArn() == null) ? 0 : getServerCertificateArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuthenticationOptions() == null) ? 0 : getAuthenticationOptions().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionLogOptions() == null) ? 0 : getConnectionLogOptions().hashCode());
        hashCode = prime * hashCode + ((getDnsServers() == null) ? 0 : getDnsServers().hashCode());
        hashCode = prime * hashCode
                + ((getTransportProtocol() == null) ? 0 : getTransportProtocol().hashCode());
        hashCode = prime * hashCode + ((getVpnPort() == null) ? 0 : getVpnPort().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getSplitTunnel() == null) ? 0 : getSplitTunnel().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
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

        if (obj instanceof CreateClientVpnEndpointRequest == false)
            return false;
        CreateClientVpnEndpointRequest other = (CreateClientVpnEndpointRequest) obj;

        if (other.getClientCidrBlock() == null ^ this.getClientCidrBlock() == null)
            return false;
        if (other.getClientCidrBlock() != null
                && other.getClientCidrBlock().equals(this.getClientCidrBlock()) == false)
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
        if (other.getDnsServers() == null ^ this.getDnsServers() == null)
            return false;
        if (other.getDnsServers() != null
                && other.getDnsServers().equals(this.getDnsServers()) == false)
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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null
                && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
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
