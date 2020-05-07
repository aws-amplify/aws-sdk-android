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

public class TerminateClientVpnConnectionsResult implements Serializable {
    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     */
    private String clientVpnEndpointId;

    /**
     * <p>
     * The user who established the terminated client connections.
     * </p>
     */
    private String username;

    /**
     * <p>
     * The current state of the client connections.
     * </p>
     */
    private java.util.List<TerminateConnectionStatus> connectionStatuses;

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
    public TerminateClientVpnConnectionsResult withClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
        return this;
    }

    /**
     * <p>
     * The user who established the terminated client connections.
     * </p>
     *
     * @return <p>
     *         The user who established the terminated client connections.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The user who established the terminated client connections.
     * </p>
     *
     * @param username <p>
     *            The user who established the terminated client connections.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user who established the terminated client connections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param username <p>
     *            The user who established the terminated client connections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminateClientVpnConnectionsResult withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * The current state of the client connections.
     * </p>
     *
     * @return <p>
     *         The current state of the client connections.
     *         </p>
     */
    public java.util.List<TerminateConnectionStatus> getConnectionStatuses() {
        return connectionStatuses;
    }

    /**
     * <p>
     * The current state of the client connections.
     * </p>
     *
     * @param connectionStatuses <p>
     *            The current state of the client connections.
     *            </p>
     */
    public void setConnectionStatuses(
            java.util.Collection<TerminateConnectionStatus> connectionStatuses) {
        if (connectionStatuses == null) {
            this.connectionStatuses = null;
            return;
        }

        this.connectionStatuses = new java.util.ArrayList<TerminateConnectionStatus>(
                connectionStatuses);
    }

    /**
     * <p>
     * The current state of the client connections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionStatuses <p>
     *            The current state of the client connections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminateClientVpnConnectionsResult withConnectionStatuses(
            TerminateConnectionStatus... connectionStatuses) {
        if (getConnectionStatuses() == null) {
            this.connectionStatuses = new java.util.ArrayList<TerminateConnectionStatus>(
                    connectionStatuses.length);
        }
        for (TerminateConnectionStatus value : connectionStatuses) {
            this.connectionStatuses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The current state of the client connections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionStatuses <p>
     *            The current state of the client connections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminateClientVpnConnectionsResult withConnectionStatuses(
            java.util.Collection<TerminateConnectionStatus> connectionStatuses) {
        setConnectionStatuses(connectionStatuses);
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
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getConnectionStatuses() != null)
            sb.append("ConnectionStatuses: " + getConnectionStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionStatuses() == null) ? 0 : getConnectionStatuses().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateClientVpnConnectionsResult == false)
            return false;
        TerminateClientVpnConnectionsResult other = (TerminateClientVpnConnectionsResult) obj;

        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null
                && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getConnectionStatuses() == null ^ this.getConnectionStatuses() == null)
            return false;
        if (other.getConnectionStatuses() != null
                && other.getConnectionStatuses().equals(this.getConnectionStatuses()) == false)
            return false;
        return true;
    }
}
