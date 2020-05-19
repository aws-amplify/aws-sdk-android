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
 * Terminates active Client VPN endpoint connections. This action can be used to
 * terminate a specific client connection, or up to five connections established
 * by a specific user.
 * </p>
 */
public class TerminateClientVpnConnectionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the Client VPN endpoint to which the client is connected.
     * </p>
     */
    private String clientVpnEndpointId;

    /**
     * <p>
     * The ID of the client connection to be terminated.
     * </p>
     */
    private String connectionId;

    /**
     * <p>
     * The name of the user who initiated the connection. Use this option to
     * terminate all active connections for the specified user. This option can
     * only be used if the user has established up to five connections.
     * </p>
     */
    private String username;

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
    public TerminateClientVpnConnectionsRequest withClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
        return this;
    }

    /**
     * <p>
     * The ID of the client connection to be terminated.
     * </p>
     *
     * @return <p>
     *         The ID of the client connection to be terminated.
     *         </p>
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * <p>
     * The ID of the client connection to be terminated.
     * </p>
     *
     * @param connectionId <p>
     *            The ID of the client connection to be terminated.
     *            </p>
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the client connection to be terminated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionId <p>
     *            The ID of the client connection to be terminated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminateClientVpnConnectionsRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * <p>
     * The name of the user who initiated the connection. Use this option to
     * terminate all active connections for the specified user. This option can
     * only be used if the user has established up to five connections.
     * </p>
     *
     * @return <p>
     *         The name of the user who initiated the connection. Use this
     *         option to terminate all active connections for the specified
     *         user. This option can only be used if the user has established up
     *         to five connections.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The name of the user who initiated the connection. Use this option to
     * terminate all active connections for the specified user. This option can
     * only be used if the user has established up to five connections.
     * </p>
     *
     * @param username <p>
     *            The name of the user who initiated the connection. Use this
     *            option to terminate all active connections for the specified
     *            user. This option can only be used if the user has established
     *            up to five connections.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The name of the user who initiated the connection. Use this option to
     * terminate all active connections for the specified user. This option can
     * only be used if the user has established up to five connections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param username <p>
     *            The name of the user who initiated the connection. Use this
     *            option to terminate all active connections for the specified
     *            user. This option can only be used if the user has established
     *            up to five connections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminateClientVpnConnectionsRequest withUsername(String username) {
        this.username = username;
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
    public TerminateClientVpnConnectionsRequest withDryRun(Boolean dryRun) {
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
        if (getClientVpnEndpointId() != null)
            sb.append("ClientVpnEndpointId: " + getClientVpnEndpointId() + ",");
        if (getConnectionId() != null)
            sb.append("ConnectionId: " + getConnectionId() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
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
                + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateClientVpnConnectionsRequest == false)
            return false;
        TerminateClientVpnConnectionsRequest other = (TerminateClientVpnConnectionsRequest) obj;

        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null
                && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
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
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
