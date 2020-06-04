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
 * Describes a client connection.
 * </p>
 */
public class ClientVpnConnection implements Serializable {
    /**
     * <p>
     * The ID of the Client VPN endpoint to which the client is connected.
     * </p>
     */
    private String clientVpnEndpointId;

    /**
     * <p>
     * The current date and time.
     * </p>
     */
    private String timestamp;

    /**
     * <p>
     * The ID of the client connection.
     * </p>
     */
    private String connectionId;

    /**
     * <p>
     * The username of the client who established the client connection. This
     * information is only provided if Active Directory client authentication is
     * used.
     * </p>
     */
    private String username;

    /**
     * <p>
     * The date and time the client connection was established.
     * </p>
     */
    private String connectionEstablishedTime;

    /**
     * <p>
     * The number of bytes sent by the client.
     * </p>
     */
    private String ingressBytes;

    /**
     * <p>
     * The number of bytes received by the client.
     * </p>
     */
    private String egressBytes;

    /**
     * <p>
     * The number of packets sent by the client.
     * </p>
     */
    private String ingressPackets;

    /**
     * <p>
     * The number of packets received by the client.
     * </p>
     */
    private String egressPackets;

    /**
     * <p>
     * The IP address of the client.
     * </p>
     */
    private String clientIp;

    /**
     * <p>
     * The common name associated with the client. This is either the name of
     * the client certificate, or the Active Directory user name.
     * </p>
     */
    private String commonName;

    /**
     * <p>
     * The current state of the client connection.
     * </p>
     */
    private ClientVpnConnectionStatus status;

    /**
     * <p>
     * The date and time the client connection was terminated.
     * </p>
     */
    private String connectionEndTime;

    /**
     * <p>
     * The ID of the Client VPN endpoint to which the client is connected.
     * </p>
     *
     * @return <p>
     *         The ID of the Client VPN endpoint to which the client is
     *         connected.
     *         </p>
     */
    public String getClientVpnEndpointId() {
        return clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint to which the client is connected.
     * </p>
     *
     * @param clientVpnEndpointId <p>
     *            The ID of the Client VPN endpoint to which the client is
     *            connected.
     *            </p>
     */
    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint to which the client is connected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientVpnEndpointId <p>
     *            The ID of the Client VPN endpoint to which the client is
     *            connected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnConnection withClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
        return this;
    }

    /**
     * <p>
     * The current date and time.
     * </p>
     *
     * @return <p>
     *         The current date and time.
     *         </p>
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The current date and time.
     * </p>
     *
     * @param timestamp <p>
     *            The current date and time.
     *            </p>
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The current date and time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The current date and time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnConnection withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * The ID of the client connection.
     * </p>
     *
     * @return <p>
     *         The ID of the client connection.
     *         </p>
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * <p>
     * The ID of the client connection.
     * </p>
     *
     * @param connectionId <p>
     *            The ID of the client connection.
     *            </p>
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the client connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionId <p>
     *            The ID of the client connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnConnection withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * <p>
     * The username of the client who established the client connection. This
     * information is only provided if Active Directory client authentication is
     * used.
     * </p>
     *
     * @return <p>
     *         The username of the client who established the client connection.
     *         This information is only provided if Active Directory client
     *         authentication is used.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The username of the client who established the client connection. This
     * information is only provided if Active Directory client authentication is
     * used.
     * </p>
     *
     * @param username <p>
     *            The username of the client who established the client
     *            connection. This information is only provided if Active
     *            Directory client authentication is used.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The username of the client who established the client connection. This
     * information is only provided if Active Directory client authentication is
     * used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param username <p>
     *            The username of the client who established the client
     *            connection. This information is only provided if Active
     *            Directory client authentication is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnConnection withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * The date and time the client connection was established.
     * </p>
     *
     * @return <p>
     *         The date and time the client connection was established.
     *         </p>
     */
    public String getConnectionEstablishedTime() {
        return connectionEstablishedTime;
    }

    /**
     * <p>
     * The date and time the client connection was established.
     * </p>
     *
     * @param connectionEstablishedTime <p>
     *            The date and time the client connection was established.
     *            </p>
     */
    public void setConnectionEstablishedTime(String connectionEstablishedTime) {
        this.connectionEstablishedTime = connectionEstablishedTime;
    }

    /**
     * <p>
     * The date and time the client connection was established.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionEstablishedTime <p>
     *            The date and time the client connection was established.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnConnection withConnectionEstablishedTime(String connectionEstablishedTime) {
        this.connectionEstablishedTime = connectionEstablishedTime;
        return this;
    }

    /**
     * <p>
     * The number of bytes sent by the client.
     * </p>
     *
     * @return <p>
     *         The number of bytes sent by the client.
     *         </p>
     */
    public String getIngressBytes() {
        return ingressBytes;
    }

    /**
     * <p>
     * The number of bytes sent by the client.
     * </p>
     *
     * @param ingressBytes <p>
     *            The number of bytes sent by the client.
     *            </p>
     */
    public void setIngressBytes(String ingressBytes) {
        this.ingressBytes = ingressBytes;
    }

    /**
     * <p>
     * The number of bytes sent by the client.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ingressBytes <p>
     *            The number of bytes sent by the client.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnConnection withIngressBytes(String ingressBytes) {
        this.ingressBytes = ingressBytes;
        return this;
    }

    /**
     * <p>
     * The number of bytes received by the client.
     * </p>
     *
     * @return <p>
     *         The number of bytes received by the client.
     *         </p>
     */
    public String getEgressBytes() {
        return egressBytes;
    }

    /**
     * <p>
     * The number of bytes received by the client.
     * </p>
     *
     * @param egressBytes <p>
     *            The number of bytes received by the client.
     *            </p>
     */
    public void setEgressBytes(String egressBytes) {
        this.egressBytes = egressBytes;
    }

    /**
     * <p>
     * The number of bytes received by the client.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param egressBytes <p>
     *            The number of bytes received by the client.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnConnection withEgressBytes(String egressBytes) {
        this.egressBytes = egressBytes;
        return this;
    }

    /**
     * <p>
     * The number of packets sent by the client.
     * </p>
     *
     * @return <p>
     *         The number of packets sent by the client.
     *         </p>
     */
    public String getIngressPackets() {
        return ingressPackets;
    }

    /**
     * <p>
     * The number of packets sent by the client.
     * </p>
     *
     * @param ingressPackets <p>
     *            The number of packets sent by the client.
     *            </p>
     */
    public void setIngressPackets(String ingressPackets) {
        this.ingressPackets = ingressPackets;
    }

    /**
     * <p>
     * The number of packets sent by the client.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ingressPackets <p>
     *            The number of packets sent by the client.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnConnection withIngressPackets(String ingressPackets) {
        this.ingressPackets = ingressPackets;
        return this;
    }

    /**
     * <p>
     * The number of packets received by the client.
     * </p>
     *
     * @return <p>
     *         The number of packets received by the client.
     *         </p>
     */
    public String getEgressPackets() {
        return egressPackets;
    }

    /**
     * <p>
     * The number of packets received by the client.
     * </p>
     *
     * @param egressPackets <p>
     *            The number of packets received by the client.
     *            </p>
     */
    public void setEgressPackets(String egressPackets) {
        this.egressPackets = egressPackets;
    }

    /**
     * <p>
     * The number of packets received by the client.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param egressPackets <p>
     *            The number of packets received by the client.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnConnection withEgressPackets(String egressPackets) {
        this.egressPackets = egressPackets;
        return this;
    }

    /**
     * <p>
     * The IP address of the client.
     * </p>
     *
     * @return <p>
     *         The IP address of the client.
     *         </p>
     */
    public String getClientIp() {
        return clientIp;
    }

    /**
     * <p>
     * The IP address of the client.
     * </p>
     *
     * @param clientIp <p>
     *            The IP address of the client.
     *            </p>
     */
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    /**
     * <p>
     * The IP address of the client.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientIp <p>
     *            The IP address of the client.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnConnection withClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * <p>
     * The common name associated with the client. This is either the name of
     * the client certificate, or the Active Directory user name.
     * </p>
     *
     * @return <p>
     *         The common name associated with the client. This is either the
     *         name of the client certificate, or the Active Directory user
     *         name.
     *         </p>
     */
    public String getCommonName() {
        return commonName;
    }

    /**
     * <p>
     * The common name associated with the client. This is either the name of
     * the client certificate, or the Active Directory user name.
     * </p>
     *
     * @param commonName <p>
     *            The common name associated with the client. This is either the
     *            name of the client certificate, or the Active Directory user
     *            name.
     *            </p>
     */
    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    /**
     * <p>
     * The common name associated with the client. This is either the name of
     * the client certificate, or the Active Directory user name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commonName <p>
     *            The common name associated with the client. This is either the
     *            name of the client certificate, or the Active Directory user
     *            name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnConnection withCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }

    /**
     * <p>
     * The current state of the client connection.
     * </p>
     *
     * @return <p>
     *         The current state of the client connection.
     *         </p>
     */
    public ClientVpnConnectionStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The current state of the client connection.
     * </p>
     *
     * @param status <p>
     *            The current state of the client connection.
     *            </p>
     */
    public void setStatus(ClientVpnConnectionStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the client connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current state of the client connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnConnection withStatus(ClientVpnConnectionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The date and time the client connection was terminated.
     * </p>
     *
     * @return <p>
     *         The date and time the client connection was terminated.
     *         </p>
     */
    public String getConnectionEndTime() {
        return connectionEndTime;
    }

    /**
     * <p>
     * The date and time the client connection was terminated.
     * </p>
     *
     * @param connectionEndTime <p>
     *            The date and time the client connection was terminated.
     *            </p>
     */
    public void setConnectionEndTime(String connectionEndTime) {
        this.connectionEndTime = connectionEndTime;
    }

    /**
     * <p>
     * The date and time the client connection was terminated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionEndTime <p>
     *            The date and time the client connection was terminated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnConnection withConnectionEndTime(String connectionEndTime) {
        this.connectionEndTime = connectionEndTime;
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
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp() + ",");
        if (getConnectionId() != null)
            sb.append("ConnectionId: " + getConnectionId() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getConnectionEstablishedTime() != null)
            sb.append("ConnectionEstablishedTime: " + getConnectionEstablishedTime() + ",");
        if (getIngressBytes() != null)
            sb.append("IngressBytes: " + getIngressBytes() + ",");
        if (getEgressBytes() != null)
            sb.append("EgressBytes: " + getEgressBytes() + ",");
        if (getIngressPackets() != null)
            sb.append("IngressPackets: " + getIngressPackets() + ",");
        if (getEgressPackets() != null)
            sb.append("EgressPackets: " + getEgressPackets() + ",");
        if (getClientIp() != null)
            sb.append("ClientIp: " + getClientIp() + ",");
        if (getCommonName() != null)
            sb.append("CommonName: " + getCommonName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getConnectionEndTime() != null)
            sb.append("ConnectionEndTime: " + getConnectionEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime
                * hashCode
                + ((getConnectionEstablishedTime() == null) ? 0 : getConnectionEstablishedTime()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getIngressBytes() == null) ? 0 : getIngressBytes().hashCode());
        hashCode = prime * hashCode
                + ((getEgressBytes() == null) ? 0 : getEgressBytes().hashCode());
        hashCode = prime * hashCode
                + ((getIngressPackets() == null) ? 0 : getIngressPackets().hashCode());
        hashCode = prime * hashCode
                + ((getEgressPackets() == null) ? 0 : getEgressPackets().hashCode());
        hashCode = prime * hashCode + ((getClientIp() == null) ? 0 : getClientIp().hashCode());
        hashCode = prime * hashCode + ((getCommonName() == null) ? 0 : getCommonName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionEndTime() == null) ? 0 : getConnectionEndTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClientVpnConnection == false)
            return false;
        ClientVpnConnection other = (ClientVpnConnection) obj;

        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null
                && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null
                && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getConnectionEstablishedTime() == null
                ^ this.getConnectionEstablishedTime() == null)
            return false;
        if (other.getConnectionEstablishedTime() != null
                && other.getConnectionEstablishedTime().equals(this.getConnectionEstablishedTime()) == false)
            return false;
        if (other.getIngressBytes() == null ^ this.getIngressBytes() == null)
            return false;
        if (other.getIngressBytes() != null
                && other.getIngressBytes().equals(this.getIngressBytes()) == false)
            return false;
        if (other.getEgressBytes() == null ^ this.getEgressBytes() == null)
            return false;
        if (other.getEgressBytes() != null
                && other.getEgressBytes().equals(this.getEgressBytes()) == false)
            return false;
        if (other.getIngressPackets() == null ^ this.getIngressPackets() == null)
            return false;
        if (other.getIngressPackets() != null
                && other.getIngressPackets().equals(this.getIngressPackets()) == false)
            return false;
        if (other.getEgressPackets() == null ^ this.getEgressPackets() == null)
            return false;
        if (other.getEgressPackets() != null
                && other.getEgressPackets().equals(this.getEgressPackets()) == false)
            return false;
        if (other.getClientIp() == null ^ this.getClientIp() == null)
            return false;
        if (other.getClientIp() != null && other.getClientIp().equals(this.getClientIp()) == false)
            return false;
        if (other.getCommonName() == null ^ this.getCommonName() == null)
            return false;
        if (other.getCommonName() != null
                && other.getCommonName().equals(this.getCommonName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getConnectionEndTime() == null ^ this.getConnectionEndTime() == null)
            return false;
        if (other.getConnectionEndTime() != null
                && other.getConnectionEndTime().equals(this.getConnectionEndTime()) == false)
            return false;
        return true;
    }
}
