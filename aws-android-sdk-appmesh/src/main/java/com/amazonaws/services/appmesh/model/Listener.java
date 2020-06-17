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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents a listener for a virtual node.
 * </p>
 */
public class Listener implements Serializable {
    /**
     * <p>
     * The health check information for the listener.
     * </p>
     */
    private HealthCheckPolicy healthCheck;

    /**
     * <p>
     * The port mapping information for the listener.
     * </p>
     */
    private PortMapping portMapping;

    /**
     * The new value for the timeout property for this object.
     */
    private ListenerTimeout timeout;

    /**
     * <p>
     * A reference to an object that represents the Transport Layer Security
     * (TLS) properties for a listener.
     * </p>
     */
    private ListenerTls tls;

    /**
     * <p>
     * The health check information for the listener.
     * </p>
     *
     * @return <p>
     *         The health check information for the listener.
     *         </p>
     */
    public HealthCheckPolicy getHealthCheck() {
        return healthCheck;
    }

    /**
     * <p>
     * The health check information for the listener.
     * </p>
     *
     * @param healthCheck <p>
     *            The health check information for the listener.
     *            </p>
     */
    public void setHealthCheck(HealthCheckPolicy healthCheck) {
        this.healthCheck = healthCheck;
    }

    /**
     * <p>
     * The health check information for the listener.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthCheck <p>
     *            The health check information for the listener.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Listener withHealthCheck(HealthCheckPolicy healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    /**
     * <p>
     * The port mapping information for the listener.
     * </p>
     *
     * @return <p>
     *         The port mapping information for the listener.
     *         </p>
     */
    public PortMapping getPortMapping() {
        return portMapping;
    }

    /**
     * <p>
     * The port mapping information for the listener.
     * </p>
     *
     * @param portMapping <p>
     *            The port mapping information for the listener.
     *            </p>
     */
    public void setPortMapping(PortMapping portMapping) {
        this.portMapping = portMapping;
    }

    /**
     * <p>
     * The port mapping information for the listener.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portMapping <p>
     *            The port mapping information for the listener.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Listener withPortMapping(PortMapping portMapping) {
        this.portMapping = portMapping;
        return this;
    }

    /**
     * Returns the value of the timeout property for this object.
     *
     * @return The value of the timeout property for this object.
     */
    public ListenerTimeout getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of timeout
     *
     * @param timeout The new value for the timeout property for this object.
     */
    public void setTimeout(ListenerTimeout timeout) {
        this.timeout = timeout;
    }

    /**
     * Sets the value of the timeout property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeout The new value for the timeout property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Listener withTimeout(ListenerTimeout timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * <p>
     * A reference to an object that represents the Transport Layer Security
     * (TLS) properties for a listener.
     * </p>
     *
     * @return <p>
     *         A reference to an object that represents the Transport Layer
     *         Security (TLS) properties for a listener.
     *         </p>
     */
    public ListenerTls getTls() {
        return tls;
    }

    /**
     * <p>
     * A reference to an object that represents the Transport Layer Security
     * (TLS) properties for a listener.
     * </p>
     *
     * @param tls <p>
     *            A reference to an object that represents the Transport Layer
     *            Security (TLS) properties for a listener.
     *            </p>
     */
    public void setTls(ListenerTls tls) {
        this.tls = tls;
    }

    /**
     * <p>
     * A reference to an object that represents the Transport Layer Security
     * (TLS) properties for a listener.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tls <p>
     *            A reference to an object that represents the Transport Layer
     *            Security (TLS) properties for a listener.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Listener withTls(ListenerTls tls) {
        this.tls = tls;
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
        if (getHealthCheck() != null)
            sb.append("healthCheck: " + getHealthCheck() + ",");
        if (getPortMapping() != null)
            sb.append("portMapping: " + getPortMapping() + ",");
        if (getTimeout() != null)
            sb.append("timeout: " + getTimeout() + ",");
        if (getTls() != null)
            sb.append("tls: " + getTls());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHealthCheck() == null) ? 0 : getHealthCheck().hashCode());
        hashCode = prime * hashCode
                + ((getPortMapping() == null) ? 0 : getPortMapping().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getTls() == null) ? 0 : getTls().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Listener == false)
            return false;
        Listener other = (Listener) obj;

        if (other.getHealthCheck() == null ^ this.getHealthCheck() == null)
            return false;
        if (other.getHealthCheck() != null
                && other.getHealthCheck().equals(this.getHealthCheck()) == false)
            return false;
        if (other.getPortMapping() == null ^ this.getPortMapping() == null)
            return false;
        if (other.getPortMapping() != null
                && other.getPortMapping().equals(this.getPortMapping()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getTls() == null ^ this.getTls() == null)
            return false;
        if (other.getTls() != null && other.getTls().equals(this.getTls()) == false)
            return false;
        return true;
    }
}
