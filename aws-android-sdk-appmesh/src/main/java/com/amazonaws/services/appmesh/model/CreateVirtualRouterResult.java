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
 * 
 */
public class CreateVirtualRouterResult implements Serializable {
    /**
     * <p>
     * The full description of your virtual router following the create call.
     * </p>
     */
    private VirtualRouterData virtualRouter;

    /**
     * <p>
     * The full description of your virtual router following the create call.
     * </p>
     *
     * @return <p>
     *         The full description of your virtual router following the create
     *         call.
     *         </p>
     */
    public VirtualRouterData getVirtualRouter() {
        return virtualRouter;
    }

    /**
     * <p>
     * The full description of your virtual router following the create call.
     * </p>
     *
     * @param virtualRouter <p>
     *            The full description of your virtual router following the
     *            create call.
     *            </p>
     */
    public void setVirtualRouter(VirtualRouterData virtualRouter) {
        this.virtualRouter = virtualRouter;
    }

    /**
     * <p>
     * The full description of your virtual router following the create call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualRouter <p>
     *            The full description of your virtual router following the
     *            create call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVirtualRouterResult withVirtualRouter(VirtualRouterData virtualRouter) {
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
                + ((getVirtualRouter() == null) ? 0 : getVirtualRouter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVirtualRouterResult == false)
            return false;
        CreateVirtualRouterResult other = (CreateVirtualRouterResult) obj;

        if (other.getVirtualRouter() == null ^ this.getVirtualRouter() == null)
            return false;
        if (other.getVirtualRouter() != null
                && other.getVirtualRouter().equals(this.getVirtualRouter()) == false)
            return false;
        return true;
    }
}
