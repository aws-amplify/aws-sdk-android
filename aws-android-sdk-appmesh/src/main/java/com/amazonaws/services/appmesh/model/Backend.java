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
 * An object that represents the backends that a virtual node is expected to
 * send outbound traffic to.
 * </p>
 */
public class Backend implements Serializable {
    /**
     * <p>
     * Specifies a virtual service to use as a backend for a virtual node.
     * </p>
     */
    private VirtualServiceBackend virtualService;

    /**
     * <p>
     * Specifies a virtual service to use as a backend for a virtual node.
     * </p>
     *
     * @return <p>
     *         Specifies a virtual service to use as a backend for a virtual
     *         node.
     *         </p>
     */
    public VirtualServiceBackend getVirtualService() {
        return virtualService;
    }

    /**
     * <p>
     * Specifies a virtual service to use as a backend for a virtual node.
     * </p>
     *
     * @param virtualService <p>
     *            Specifies a virtual service to use as a backend for a virtual
     *            node.
     *            </p>
     */
    public void setVirtualService(VirtualServiceBackend virtualService) {
        this.virtualService = virtualService;
    }

    /**
     * <p>
     * Specifies a virtual service to use as a backend for a virtual node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualService <p>
     *            Specifies a virtual service to use as a backend for a virtual
     *            node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backend withVirtualService(VirtualServiceBackend virtualService) {
        this.virtualService = virtualService;
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
        if (getVirtualService() != null)
            sb.append("virtualService: " + getVirtualService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVirtualService() == null) ? 0 : getVirtualService().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Backend == false)
            return false;
        Backend other = (Backend) obj;

        if (other.getVirtualService() == null ^ this.getVirtualService() == null)
            return false;
        if (other.getVirtualService() != null
                && other.getVirtualService().equals(this.getVirtualService()) == false)
            return false;
        return true;
    }
}
