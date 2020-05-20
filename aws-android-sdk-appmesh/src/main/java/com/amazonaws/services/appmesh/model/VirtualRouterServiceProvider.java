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
 * An object that represents a virtual node service provider.
 * </p>
 */
public class VirtualRouterServiceProvider implements Serializable {
    /**
     * <p>
     * The name of the virtual router that is acting as a service provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String virtualRouterName;

    /**
     * <p>
     * The name of the virtual router that is acting as a service provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the virtual router that is acting as a service
     *         provider.
     *         </p>
     */
    public String getVirtualRouterName() {
        return virtualRouterName;
    }

    /**
     * <p>
     * The name of the virtual router that is acting as a service provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param virtualRouterName <p>
     *            The name of the virtual router that is acting as a service
     *            provider.
     *            </p>
     */
    public void setVirtualRouterName(String virtualRouterName) {
        this.virtualRouterName = virtualRouterName;
    }

    /**
     * <p>
     * The name of the virtual router that is acting as a service provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param virtualRouterName <p>
     *            The name of the virtual router that is acting as a service
     *            provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualRouterServiceProvider withVirtualRouterName(String virtualRouterName) {
        this.virtualRouterName = virtualRouterName;
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
        if (getVirtualRouterName() != null)
            sb.append("virtualRouterName: " + getVirtualRouterName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVirtualRouterName() == null) ? 0 : getVirtualRouterName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualRouterServiceProvider == false)
            return false;
        VirtualRouterServiceProvider other = (VirtualRouterServiceProvider) obj;

        if (other.getVirtualRouterName() == null ^ this.getVirtualRouterName() == null)
            return false;
        if (other.getVirtualRouterName() != null
                && other.getVirtualRouterName().equals(this.getVirtualRouterName()) == false)
            return false;
        return true;
    }
}
