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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the NETWORK_CONNECTION action described in the
 * finding.
 * </p>
 */
public class NetworkConnectionAction implements Serializable {
    /**
     * <p>
     * Indicates whether EC2 blocked the network connection to your instance.
     * </p>
     */
    private Boolean blocked;

    /**
     * <p>
     * The network connection direction.
     * </p>
     */
    private String connectionDirection;

    /**
     * <p>
     * The local port information of the connection.
     * </p>
     */
    private LocalPortDetails localPortDetails;

    /**
     * <p>
     * The network connection protocol.
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * The local IP information of the connection.
     * </p>
     */
    private LocalIpDetails localIpDetails;

    /**
     * <p>
     * The remote IP information of the connection.
     * </p>
     */
    private RemoteIpDetails remoteIpDetails;

    /**
     * <p>
     * The remote port information of the connection.
     * </p>
     */
    private RemotePortDetails remotePortDetails;

    /**
     * <p>
     * Indicates whether EC2 blocked the network connection to your instance.
     * </p>
     *
     * @return <p>
     *         Indicates whether EC2 blocked the network connection to your
     *         instance.
     *         </p>
     */
    public Boolean isBlocked() {
        return blocked;
    }

    /**
     * <p>
     * Indicates whether EC2 blocked the network connection to your instance.
     * </p>
     *
     * @return <p>
     *         Indicates whether EC2 blocked the network connection to your
     *         instance.
     *         </p>
     */
    public Boolean getBlocked() {
        return blocked;
    }

    /**
     * <p>
     * Indicates whether EC2 blocked the network connection to your instance.
     * </p>
     *
     * @param blocked <p>
     *            Indicates whether EC2 blocked the network connection to your
     *            instance.
     *            </p>
     */
    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    /**
     * <p>
     * Indicates whether EC2 blocked the network connection to your instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blocked <p>
     *            Indicates whether EC2 blocked the network connection to your
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkConnectionAction withBlocked(Boolean blocked) {
        this.blocked = blocked;
        return this;
    }

    /**
     * <p>
     * The network connection direction.
     * </p>
     *
     * @return <p>
     *         The network connection direction.
     *         </p>
     */
    public String getConnectionDirection() {
        return connectionDirection;
    }

    /**
     * <p>
     * The network connection direction.
     * </p>
     *
     * @param connectionDirection <p>
     *            The network connection direction.
     *            </p>
     */
    public void setConnectionDirection(String connectionDirection) {
        this.connectionDirection = connectionDirection;
    }

    /**
     * <p>
     * The network connection direction.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionDirection <p>
     *            The network connection direction.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkConnectionAction withConnectionDirection(String connectionDirection) {
        this.connectionDirection = connectionDirection;
        return this;
    }

    /**
     * <p>
     * The local port information of the connection.
     * </p>
     *
     * @return <p>
     *         The local port information of the connection.
     *         </p>
     */
    public LocalPortDetails getLocalPortDetails() {
        return localPortDetails;
    }

    /**
     * <p>
     * The local port information of the connection.
     * </p>
     *
     * @param localPortDetails <p>
     *            The local port information of the connection.
     *            </p>
     */
    public void setLocalPortDetails(LocalPortDetails localPortDetails) {
        this.localPortDetails = localPortDetails;
    }

    /**
     * <p>
     * The local port information of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localPortDetails <p>
     *            The local port information of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkConnectionAction withLocalPortDetails(LocalPortDetails localPortDetails) {
        this.localPortDetails = localPortDetails;
        return this;
    }

    /**
     * <p>
     * The network connection protocol.
     * </p>
     *
     * @return <p>
     *         The network connection protocol.
     *         </p>
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The network connection protocol.
     * </p>
     *
     * @param protocol <p>
     *            The network connection protocol.
     *            </p>
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The network connection protocol.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protocol <p>
     *            The network connection protocol.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkConnectionAction withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * The local IP information of the connection.
     * </p>
     *
     * @return <p>
     *         The local IP information of the connection.
     *         </p>
     */
    public LocalIpDetails getLocalIpDetails() {
        return localIpDetails;
    }

    /**
     * <p>
     * The local IP information of the connection.
     * </p>
     *
     * @param localIpDetails <p>
     *            The local IP information of the connection.
     *            </p>
     */
    public void setLocalIpDetails(LocalIpDetails localIpDetails) {
        this.localIpDetails = localIpDetails;
    }

    /**
     * <p>
     * The local IP information of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localIpDetails <p>
     *            The local IP information of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkConnectionAction withLocalIpDetails(LocalIpDetails localIpDetails) {
        this.localIpDetails = localIpDetails;
        return this;
    }

    /**
     * <p>
     * The remote IP information of the connection.
     * </p>
     *
     * @return <p>
     *         The remote IP information of the connection.
     *         </p>
     */
    public RemoteIpDetails getRemoteIpDetails() {
        return remoteIpDetails;
    }

    /**
     * <p>
     * The remote IP information of the connection.
     * </p>
     *
     * @param remoteIpDetails <p>
     *            The remote IP information of the connection.
     *            </p>
     */
    public void setRemoteIpDetails(RemoteIpDetails remoteIpDetails) {
        this.remoteIpDetails = remoteIpDetails;
    }

    /**
     * <p>
     * The remote IP information of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param remoteIpDetails <p>
     *            The remote IP information of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkConnectionAction withRemoteIpDetails(RemoteIpDetails remoteIpDetails) {
        this.remoteIpDetails = remoteIpDetails;
        return this;
    }

    /**
     * <p>
     * The remote port information of the connection.
     * </p>
     *
     * @return <p>
     *         The remote port information of the connection.
     *         </p>
     */
    public RemotePortDetails getRemotePortDetails() {
        return remotePortDetails;
    }

    /**
     * <p>
     * The remote port information of the connection.
     * </p>
     *
     * @param remotePortDetails <p>
     *            The remote port information of the connection.
     *            </p>
     */
    public void setRemotePortDetails(RemotePortDetails remotePortDetails) {
        this.remotePortDetails = remotePortDetails;
    }

    /**
     * <p>
     * The remote port information of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param remotePortDetails <p>
     *            The remote port information of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkConnectionAction withRemotePortDetails(RemotePortDetails remotePortDetails) {
        this.remotePortDetails = remotePortDetails;
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
        if (getBlocked() != null)
            sb.append("Blocked: " + getBlocked() + ",");
        if (getConnectionDirection() != null)
            sb.append("ConnectionDirection: " + getConnectionDirection() + ",");
        if (getLocalPortDetails() != null)
            sb.append("LocalPortDetails: " + getLocalPortDetails() + ",");
        if (getProtocol() != null)
            sb.append("Protocol: " + getProtocol() + ",");
        if (getLocalIpDetails() != null)
            sb.append("LocalIpDetails: " + getLocalIpDetails() + ",");
        if (getRemoteIpDetails() != null)
            sb.append("RemoteIpDetails: " + getRemoteIpDetails() + ",");
        if (getRemotePortDetails() != null)
            sb.append("RemotePortDetails: " + getRemotePortDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlocked() == null) ? 0 : getBlocked().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionDirection() == null) ? 0 : getConnectionDirection().hashCode());
        hashCode = prime * hashCode
                + ((getLocalPortDetails() == null) ? 0 : getLocalPortDetails().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode
                + ((getLocalIpDetails() == null) ? 0 : getLocalIpDetails().hashCode());
        hashCode = prime * hashCode
                + ((getRemoteIpDetails() == null) ? 0 : getRemoteIpDetails().hashCode());
        hashCode = prime * hashCode
                + ((getRemotePortDetails() == null) ? 0 : getRemotePortDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkConnectionAction == false)
            return false;
        NetworkConnectionAction other = (NetworkConnectionAction) obj;

        if (other.getBlocked() == null ^ this.getBlocked() == null)
            return false;
        if (other.getBlocked() != null && other.getBlocked().equals(this.getBlocked()) == false)
            return false;
        if (other.getConnectionDirection() == null ^ this.getConnectionDirection() == null)
            return false;
        if (other.getConnectionDirection() != null
                && other.getConnectionDirection().equals(this.getConnectionDirection()) == false)
            return false;
        if (other.getLocalPortDetails() == null ^ this.getLocalPortDetails() == null)
            return false;
        if (other.getLocalPortDetails() != null
                && other.getLocalPortDetails().equals(this.getLocalPortDetails()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getLocalIpDetails() == null ^ this.getLocalIpDetails() == null)
            return false;
        if (other.getLocalIpDetails() != null
                && other.getLocalIpDetails().equals(this.getLocalIpDetails()) == false)
            return false;
        if (other.getRemoteIpDetails() == null ^ this.getRemoteIpDetails() == null)
            return false;
        if (other.getRemoteIpDetails() != null
                && other.getRemoteIpDetails().equals(this.getRemoteIpDetails()) == false)
            return false;
        if (other.getRemotePortDetails() == null ^ this.getRemotePortDetails() == null)
            return false;
        if (other.getRemotePortDetails() != null
                && other.getRemotePortDetails().equals(this.getRemotePortDetails()) == false)
            return false;
        return true;
    }
}
