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
 * An object that represents the specification of a virtual router.
 * </p>
 */
public class VirtualRouterSpec implements Serializable {
    /**
     * <p>
     * The listeners that the virtual router is expected to receive inbound
     * traffic from. You can specify one listener.
     * </p>
     */
    private java.util.List<VirtualRouterListener> listeners;

    /**
     * <p>
     * The listeners that the virtual router is expected to receive inbound
     * traffic from. You can specify one listener.
     * </p>
     *
     * @return <p>
     *         The listeners that the virtual router is expected to receive
     *         inbound traffic from. You can specify one listener.
     *         </p>
     */
    public java.util.List<VirtualRouterListener> getListeners() {
        return listeners;
    }

    /**
     * <p>
     * The listeners that the virtual router is expected to receive inbound
     * traffic from. You can specify one listener.
     * </p>
     *
     * @param listeners <p>
     *            The listeners that the virtual router is expected to receive
     *            inbound traffic from. You can specify one listener.
     *            </p>
     */
    public void setListeners(java.util.Collection<VirtualRouterListener> listeners) {
        if (listeners == null) {
            this.listeners = null;
            return;
        }

        this.listeners = new java.util.ArrayList<VirtualRouterListener>(listeners);
    }

    /**
     * <p>
     * The listeners that the virtual router is expected to receive inbound
     * traffic from. You can specify one listener.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listeners <p>
     *            The listeners that the virtual router is expected to receive
     *            inbound traffic from. You can specify one listener.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualRouterSpec withListeners(VirtualRouterListener... listeners) {
        if (getListeners() == null) {
            this.listeners = new java.util.ArrayList<VirtualRouterListener>(listeners.length);
        }
        for (VirtualRouterListener value : listeners) {
            this.listeners.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The listeners that the virtual router is expected to receive inbound
     * traffic from. You can specify one listener.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listeners <p>
     *            The listeners that the virtual router is expected to receive
     *            inbound traffic from. You can specify one listener.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualRouterSpec withListeners(java.util.Collection<VirtualRouterListener> listeners) {
        setListeners(listeners);
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
        if (getListeners() != null)
            sb.append("listeners: " + getListeners());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListeners() == null) ? 0 : getListeners().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualRouterSpec == false)
            return false;
        VirtualRouterSpec other = (VirtualRouterSpec) obj;

        if (other.getListeners() == null ^ this.getListeners() == null)
            return false;
        if (other.getListeners() != null
                && other.getListeners().equals(this.getListeners()) == false)
            return false;
        return true;
    }
}
