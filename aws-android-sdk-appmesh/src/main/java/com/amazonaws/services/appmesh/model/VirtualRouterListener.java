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
 * An object that represents a virtual router listener.
 * </p>
 */
public class VirtualRouterListener implements Serializable {
    /**
     * <p>
     * An object that represents a port mapping.
     * </p>
     */
    private PortMapping portMapping;

    /**
     * <p>
     * An object that represents a port mapping.
     * </p>
     *
     * @return <p>
     *         An object that represents a port mapping.
     *         </p>
     */
    public PortMapping getPortMapping() {
        return portMapping;
    }

    /**
     * <p>
     * An object that represents a port mapping.
     * </p>
     *
     * @param portMapping <p>
     *            An object that represents a port mapping.
     *            </p>
     */
    public void setPortMapping(PortMapping portMapping) {
        this.portMapping = portMapping;
    }

    /**
     * <p>
     * An object that represents a port mapping.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portMapping <p>
     *            An object that represents a port mapping.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualRouterListener withPortMapping(PortMapping portMapping) {
        this.portMapping = portMapping;
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
        if (getPortMapping() != null)
            sb.append("portMapping: " + getPortMapping());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPortMapping() == null) ? 0 : getPortMapping().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualRouterListener == false)
            return false;
        VirtualRouterListener other = (VirtualRouterListener) obj;

        if (other.getPortMapping() == null ^ this.getPortMapping() == null)
            return false;
        if (other.getPortMapping() != null
                && other.getPortMapping().equals(this.getPortMapping()) == false)
            return false;
        return true;
    }
}
