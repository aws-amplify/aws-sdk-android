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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * Details on the network bindings between a container and its host container
 * instance. After a task reaches the <code>RUNNING</code> status, manual and
 * automatic host and container port assignments are visible in the
 * <code>networkBindings</code> section of <a>DescribeTasks</a> API responses.
 * </p>
 */
public class NetworkBinding implements Serializable {
    /**
     * <p>
     * The IP address that the container is bound to on the container instance.
     * </p>
     */
    private String bindIP;

    /**
     * <p>
     * The port number on the container that is used with the network binding.
     * </p>
     */
    private Integer containerPort;

    /**
     * <p>
     * The port number on the host that is used with the network binding.
     * </p>
     */
    private Integer hostPort;

    /**
     * <p>
     * The protocol used for the network binding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     */
    private String protocol;

    /**
     * <p>
     * The IP address that the container is bound to on the container instance.
     * </p>
     *
     * @return <p>
     *         The IP address that the container is bound to on the container
     *         instance.
     *         </p>
     */
    public String getBindIP() {
        return bindIP;
    }

    /**
     * <p>
     * The IP address that the container is bound to on the container instance.
     * </p>
     *
     * @param bindIP <p>
     *            The IP address that the container is bound to on the container
     *            instance.
     *            </p>
     */
    public void setBindIP(String bindIP) {
        this.bindIP = bindIP;
    }

    /**
     * <p>
     * The IP address that the container is bound to on the container instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bindIP <p>
     *            The IP address that the container is bound to on the container
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkBinding withBindIP(String bindIP) {
        this.bindIP = bindIP;
        return this;
    }

    /**
     * <p>
     * The port number on the container that is used with the network binding.
     * </p>
     *
     * @return <p>
     *         The port number on the container that is used with the network
     *         binding.
     *         </p>
     */
    public Integer getContainerPort() {
        return containerPort;
    }

    /**
     * <p>
     * The port number on the container that is used with the network binding.
     * </p>
     *
     * @param containerPort <p>
     *            The port number on the container that is used with the network
     *            binding.
     *            </p>
     */
    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }

    /**
     * <p>
     * The port number on the container that is used with the network binding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerPort <p>
     *            The port number on the container that is used with the network
     *            binding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkBinding withContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
        return this;
    }

    /**
     * <p>
     * The port number on the host that is used with the network binding.
     * </p>
     *
     * @return <p>
     *         The port number on the host that is used with the network
     *         binding.
     *         </p>
     */
    public Integer getHostPort() {
        return hostPort;
    }

    /**
     * <p>
     * The port number on the host that is used with the network binding.
     * </p>
     *
     * @param hostPort <p>
     *            The port number on the host that is used with the network
     *            binding.
     *            </p>
     */
    public void setHostPort(Integer hostPort) {
        this.hostPort = hostPort;
    }

    /**
     * <p>
     * The port number on the host that is used with the network binding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostPort <p>
     *            The port number on the host that is used with the network
     *            binding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkBinding withHostPort(Integer hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * <p>
     * The protocol used for the network binding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @return <p>
     *         The protocol used for the network binding.
     *         </p>
     * @see TransportProtocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The protocol used for the network binding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @param protocol <p>
     *            The protocol used for the network binding.
     *            </p>
     * @see TransportProtocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol used for the network binding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @param protocol <p>
     *            The protocol used for the network binding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransportProtocol
     */
    public NetworkBinding withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * The protocol used for the network binding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @param protocol <p>
     *            The protocol used for the network binding.
     *            </p>
     * @see TransportProtocol
     */
    public void setProtocol(TransportProtocol protocol) {
        this.protocol = protocol.toString();
    }

    /**
     * <p>
     * The protocol used for the network binding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @param protocol <p>
     *            The protocol used for the network binding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransportProtocol
     */
    public NetworkBinding withProtocol(TransportProtocol protocol) {
        this.protocol = protocol.toString();
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
        if (getBindIP() != null)
            sb.append("bindIP: " + getBindIP() + ",");
        if (getContainerPort() != null)
            sb.append("containerPort: " + getContainerPort() + ",");
        if (getHostPort() != null)
            sb.append("hostPort: " + getHostPort() + ",");
        if (getProtocol() != null)
            sb.append("protocol: " + getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBindIP() == null) ? 0 : getBindIP().hashCode());
        hashCode = prime * hashCode
                + ((getContainerPort() == null) ? 0 : getContainerPort().hashCode());
        hashCode = prime * hashCode + ((getHostPort() == null) ? 0 : getHostPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkBinding == false)
            return false;
        NetworkBinding other = (NetworkBinding) obj;

        if (other.getBindIP() == null ^ this.getBindIP() == null)
            return false;
        if (other.getBindIP() != null && other.getBindIP().equals(this.getBindIP()) == false)
            return false;
        if (other.getContainerPort() == null ^ this.getContainerPort() == null)
            return false;
        if (other.getContainerPort() != null
                && other.getContainerPort().equals(this.getContainerPort()) == false)
            return false;
        if (other.getHostPort() == null ^ this.getHostPort() == null)
            return false;
        if (other.getHostPort() != null && other.getHostPort().equals(this.getHostPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }
}
