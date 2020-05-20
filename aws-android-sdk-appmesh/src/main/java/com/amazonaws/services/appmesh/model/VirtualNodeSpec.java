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
 * An object that represents the specification of a virtual node.
 * </p>
 */
public class VirtualNodeSpec implements Serializable {
    /**
     * <p>
     * A reference to an object that represents the defaults for backends.
     * </p>
     */
    private BackendDefaults backendDefaults;

    /**
     * <p>
     * The backends that the virtual node is expected to send outbound traffic
     * to.
     * </p>
     */
    private java.util.List<Backend> backends;

    /**
     * <p>
     * The listener that the virtual node is expected to receive inbound traffic
     * from. You can specify one listener.
     * </p>
     */
    private java.util.List<Listener> listeners;

    /**
     * <p>
     * The inbound and outbound access logging information for the virtual node.
     * </p>
     */
    private Logging logging;

    /**
     * <p>
     * The service discovery information for the virtual node. If your virtual
     * node does not expect ingress traffic, you can omit this parameter. If you
     * specify a <code>listener</code>, then you must specify service discovery
     * information.
     * </p>
     */
    private ServiceDiscovery serviceDiscovery;

    /**
     * <p>
     * A reference to an object that represents the defaults for backends.
     * </p>
     *
     * @return <p>
     *         A reference to an object that represents the defaults for
     *         backends.
     *         </p>
     */
    public BackendDefaults getBackendDefaults() {
        return backendDefaults;
    }

    /**
     * <p>
     * A reference to an object that represents the defaults for backends.
     * </p>
     *
     * @param backendDefaults <p>
     *            A reference to an object that represents the defaults for
     *            backends.
     *            </p>
     */
    public void setBackendDefaults(BackendDefaults backendDefaults) {
        this.backendDefaults = backendDefaults;
    }

    /**
     * <p>
     * A reference to an object that represents the defaults for backends.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backendDefaults <p>
     *            A reference to an object that represents the defaults for
     *            backends.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualNodeSpec withBackendDefaults(BackendDefaults backendDefaults) {
        this.backendDefaults = backendDefaults;
        return this;
    }

    /**
     * <p>
     * The backends that the virtual node is expected to send outbound traffic
     * to.
     * </p>
     *
     * @return <p>
     *         The backends that the virtual node is expected to send outbound
     *         traffic to.
     *         </p>
     */
    public java.util.List<Backend> getBackends() {
        return backends;
    }

    /**
     * <p>
     * The backends that the virtual node is expected to send outbound traffic
     * to.
     * </p>
     *
     * @param backends <p>
     *            The backends that the virtual node is expected to send
     *            outbound traffic to.
     *            </p>
     */
    public void setBackends(java.util.Collection<Backend> backends) {
        if (backends == null) {
            this.backends = null;
            return;
        }

        this.backends = new java.util.ArrayList<Backend>(backends);
    }

    /**
     * <p>
     * The backends that the virtual node is expected to send outbound traffic
     * to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backends <p>
     *            The backends that the virtual node is expected to send
     *            outbound traffic to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualNodeSpec withBackends(Backend... backends) {
        if (getBackends() == null) {
            this.backends = new java.util.ArrayList<Backend>(backends.length);
        }
        for (Backend value : backends) {
            this.backends.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The backends that the virtual node is expected to send outbound traffic
     * to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backends <p>
     *            The backends that the virtual node is expected to send
     *            outbound traffic to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualNodeSpec withBackends(java.util.Collection<Backend> backends) {
        setBackends(backends);
        return this;
    }

    /**
     * <p>
     * The listener that the virtual node is expected to receive inbound traffic
     * from. You can specify one listener.
     * </p>
     *
     * @return <p>
     *         The listener that the virtual node is expected to receive inbound
     *         traffic from. You can specify one listener.
     *         </p>
     */
    public java.util.List<Listener> getListeners() {
        return listeners;
    }

    /**
     * <p>
     * The listener that the virtual node is expected to receive inbound traffic
     * from. You can specify one listener.
     * </p>
     *
     * @param listeners <p>
     *            The listener that the virtual node is expected to receive
     *            inbound traffic from. You can specify one listener.
     *            </p>
     */
    public void setListeners(java.util.Collection<Listener> listeners) {
        if (listeners == null) {
            this.listeners = null;
            return;
        }

        this.listeners = new java.util.ArrayList<Listener>(listeners);
    }

    /**
     * <p>
     * The listener that the virtual node is expected to receive inbound traffic
     * from. You can specify one listener.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listeners <p>
     *            The listener that the virtual node is expected to receive
     *            inbound traffic from. You can specify one listener.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualNodeSpec withListeners(Listener... listeners) {
        if (getListeners() == null) {
            this.listeners = new java.util.ArrayList<Listener>(listeners.length);
        }
        for (Listener value : listeners) {
            this.listeners.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The listener that the virtual node is expected to receive inbound traffic
     * from. You can specify one listener.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listeners <p>
     *            The listener that the virtual node is expected to receive
     *            inbound traffic from. You can specify one listener.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualNodeSpec withListeners(java.util.Collection<Listener> listeners) {
        setListeners(listeners);
        return this;
    }

    /**
     * <p>
     * The inbound and outbound access logging information for the virtual node.
     * </p>
     *
     * @return <p>
     *         The inbound and outbound access logging information for the
     *         virtual node.
     *         </p>
     */
    public Logging getLogging() {
        return logging;
    }

    /**
     * <p>
     * The inbound and outbound access logging information for the virtual node.
     * </p>
     *
     * @param logging <p>
     *            The inbound and outbound access logging information for the
     *            virtual node.
     *            </p>
     */
    public void setLogging(Logging logging) {
        this.logging = logging;
    }

    /**
     * <p>
     * The inbound and outbound access logging information for the virtual node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logging <p>
     *            The inbound and outbound access logging information for the
     *            virtual node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualNodeSpec withLogging(Logging logging) {
        this.logging = logging;
        return this;
    }

    /**
     * <p>
     * The service discovery information for the virtual node. If your virtual
     * node does not expect ingress traffic, you can omit this parameter. If you
     * specify a <code>listener</code>, then you must specify service discovery
     * information.
     * </p>
     *
     * @return <p>
     *         The service discovery information for the virtual node. If your
     *         virtual node does not expect ingress traffic, you can omit this
     *         parameter. If you specify a <code>listener</code>, then you must
     *         specify service discovery information.
     *         </p>
     */
    public ServiceDiscovery getServiceDiscovery() {
        return serviceDiscovery;
    }

    /**
     * <p>
     * The service discovery information for the virtual node. If your virtual
     * node does not expect ingress traffic, you can omit this parameter. If you
     * specify a <code>listener</code>, then you must specify service discovery
     * information.
     * </p>
     *
     * @param serviceDiscovery <p>
     *            The service discovery information for the virtual node. If
     *            your virtual node does not expect ingress traffic, you can
     *            omit this parameter. If you specify a <code>listener</code>,
     *            then you must specify service discovery information.
     *            </p>
     */
    public void setServiceDiscovery(ServiceDiscovery serviceDiscovery) {
        this.serviceDiscovery = serviceDiscovery;
    }

    /**
     * <p>
     * The service discovery information for the virtual node. If your virtual
     * node does not expect ingress traffic, you can omit this parameter. If you
     * specify a <code>listener</code>, then you must specify service discovery
     * information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceDiscovery <p>
     *            The service discovery information for the virtual node. If
     *            your virtual node does not expect ingress traffic, you can
     *            omit this parameter. If you specify a <code>listener</code>,
     *            then you must specify service discovery information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualNodeSpec withServiceDiscovery(ServiceDiscovery serviceDiscovery) {
        this.serviceDiscovery = serviceDiscovery;
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
        if (getBackendDefaults() != null)
            sb.append("backendDefaults: " + getBackendDefaults() + ",");
        if (getBackends() != null)
            sb.append("backends: " + getBackends() + ",");
        if (getListeners() != null)
            sb.append("listeners: " + getListeners() + ",");
        if (getLogging() != null)
            sb.append("logging: " + getLogging() + ",");
        if (getServiceDiscovery() != null)
            sb.append("serviceDiscovery: " + getServiceDiscovery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackendDefaults() == null) ? 0 : getBackendDefaults().hashCode());
        hashCode = prime * hashCode + ((getBackends() == null) ? 0 : getBackends().hashCode());
        hashCode = prime * hashCode + ((getListeners() == null) ? 0 : getListeners().hashCode());
        hashCode = prime * hashCode + ((getLogging() == null) ? 0 : getLogging().hashCode());
        hashCode = prime * hashCode
                + ((getServiceDiscovery() == null) ? 0 : getServiceDiscovery().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualNodeSpec == false)
            return false;
        VirtualNodeSpec other = (VirtualNodeSpec) obj;

        if (other.getBackendDefaults() == null ^ this.getBackendDefaults() == null)
            return false;
        if (other.getBackendDefaults() != null
                && other.getBackendDefaults().equals(this.getBackendDefaults()) == false)
            return false;
        if (other.getBackends() == null ^ this.getBackends() == null)
            return false;
        if (other.getBackends() != null && other.getBackends().equals(this.getBackends()) == false)
            return false;
        if (other.getListeners() == null ^ this.getListeners() == null)
            return false;
        if (other.getListeners() != null
                && other.getListeners().equals(this.getListeners()) == false)
            return false;
        if (other.getLogging() == null ^ this.getLogging() == null)
            return false;
        if (other.getLogging() != null && other.getLogging().equals(this.getLogging()) == false)
            return false;
        if (other.getServiceDiscovery() == null ^ this.getServiceDiscovery() == null)
            return false;
        if (other.getServiceDiscovery() != null
                && other.getServiceDiscovery().equals(this.getServiceDiscovery()) == false)
            return false;
        return true;
    }
}
