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
 * An object that represents the provider for a virtual service.
 * </p>
 */
public class VirtualServiceProvider implements Serializable {
    /**
     * <p>
     * The virtual node associated with a virtual service.
     * </p>
     */
    private VirtualNodeServiceProvider virtualNode;

    /**
     * <p>
     * The virtual router associated with a virtual service.
     * </p>
     */
    private VirtualRouterServiceProvider virtualRouter;

    /**
     * <p>
     * The virtual node associated with a virtual service.
     * </p>
     *
     * @return <p>
     *         The virtual node associated with a virtual service.
     *         </p>
     */
    public VirtualNodeServiceProvider getVirtualNode() {
        return virtualNode;
    }

    /**
     * <p>
     * The virtual node associated with a virtual service.
     * </p>
     *
     * @param virtualNode <p>
     *            The virtual node associated with a virtual service.
     *            </p>
     */
    public void setVirtualNode(VirtualNodeServiceProvider virtualNode) {
        this.virtualNode = virtualNode;
    }

    /**
     * <p>
     * The virtual node associated with a virtual service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualNode <p>
     *            The virtual node associated with a virtual service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualServiceProvider withVirtualNode(VirtualNodeServiceProvider virtualNode) {
        this.virtualNode = virtualNode;
        return this;
    }

    /**
     * <p>
     * The virtual router associated with a virtual service.
     * </p>
     *
     * @return <p>
     *         The virtual router associated with a virtual service.
     *         </p>
     */
    public VirtualRouterServiceProvider getVirtualRouter() {
        return virtualRouter;
    }

    /**
     * <p>
     * The virtual router associated with a virtual service.
     * </p>
     *
     * @param virtualRouter <p>
     *            The virtual router associated with a virtual service.
     *            </p>
     */
    public void setVirtualRouter(VirtualRouterServiceProvider virtualRouter) {
        this.virtualRouter = virtualRouter;
    }

    /**
     * <p>
     * The virtual router associated with a virtual service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualRouter <p>
     *            The virtual router associated with a virtual service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualServiceProvider withVirtualRouter(VirtualRouterServiceProvider virtualRouter) {
        this.virtualRouter = virtualRouter;
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
        if (getVirtualNode() != null)
            sb.append("virtualNode: " + getVirtualNode() + ",");
        if (getVirtualRouter() != null)
            sb.append("virtualRouter: " + getVirtualRouter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVirtualNode() == null) ? 0 : getVirtualNode().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualRouter() == null) ? 0 : getVirtualRouter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualServiceProvider == false)
            return false;
        VirtualServiceProvider other = (VirtualServiceProvider) obj;

        if (other.getVirtualNode() == null ^ this.getVirtualNode() == null)
            return false;
        if (other.getVirtualNode() != null
                && other.getVirtualNode().equals(this.getVirtualNode()) == false)
            return false;
        if (other.getVirtualRouter() == null ^ this.getVirtualRouter() == null)
            return false;
        if (other.getVirtualRouter() != null
                && other.getVirtualRouter().equals(this.getVirtualRouter()) == false)
            return false;
        return true;
    }
}
