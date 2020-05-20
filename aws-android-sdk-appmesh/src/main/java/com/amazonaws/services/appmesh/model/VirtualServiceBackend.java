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
 * An object that represents a virtual service backend for a virtual node.
 * </p>
 */
public class VirtualServiceBackend implements Serializable {
    /**
     * <p>
     * A reference to an object that represents the client policy for a backend.
     * </p>
     */
    private ClientPolicy clientPolicy;

    /**
     * <p>
     * The name of the virtual service that is acting as a virtual node backend.
     * </p>
     */
    private String virtualServiceName;

    /**
     * <p>
     * A reference to an object that represents the client policy for a backend.
     * </p>
     *
     * @return <p>
     *         A reference to an object that represents the client policy for a
     *         backend.
     *         </p>
     */
    public ClientPolicy getClientPolicy() {
        return clientPolicy;
    }

    /**
     * <p>
     * A reference to an object that represents the client policy for a backend.
     * </p>
     *
     * @param clientPolicy <p>
     *            A reference to an object that represents the client policy for
     *            a backend.
     *            </p>
     */
    public void setClientPolicy(ClientPolicy clientPolicy) {
        this.clientPolicy = clientPolicy;
    }

    /**
     * <p>
     * A reference to an object that represents the client policy for a backend.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientPolicy <p>
     *            A reference to an object that represents the client policy for
     *            a backend.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualServiceBackend withClientPolicy(ClientPolicy clientPolicy) {
        this.clientPolicy = clientPolicy;
        return this;
    }

    /**
     * <p>
     * The name of the virtual service that is acting as a virtual node backend.
     * </p>
     *
     * @return <p>
     *         The name of the virtual service that is acting as a virtual node
     *         backend.
     *         </p>
     */
    public String getVirtualServiceName() {
        return virtualServiceName;
    }

    /**
     * <p>
     * The name of the virtual service that is acting as a virtual node backend.
     * </p>
     *
     * @param virtualServiceName <p>
     *            The name of the virtual service that is acting as a virtual
     *            node backend.
     *            </p>
     */
    public void setVirtualServiceName(String virtualServiceName) {
        this.virtualServiceName = virtualServiceName;
    }

    /**
     * <p>
     * The name of the virtual service that is acting as a virtual node backend.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualServiceName <p>
     *            The name of the virtual service that is acting as a virtual
     *            node backend.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualServiceBackend withVirtualServiceName(String virtualServiceName) {
        this.virtualServiceName = virtualServiceName;
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
        if (getClientPolicy() != null)
            sb.append("clientPolicy: " + getClientPolicy() + ",");
        if (getVirtualServiceName() != null)
            sb.append("virtualServiceName: " + getVirtualServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientPolicy() == null) ? 0 : getClientPolicy().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualServiceName() == null) ? 0 : getVirtualServiceName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualServiceBackend == false)
            return false;
        VirtualServiceBackend other = (VirtualServiceBackend) obj;

        if (other.getClientPolicy() == null ^ this.getClientPolicy() == null)
            return false;
        if (other.getClientPolicy() != null
                && other.getClientPolicy().equals(this.getClientPolicy()) == false)
            return false;
        if (other.getVirtualServiceName() == null ^ this.getVirtualServiceName() == null)
            return false;
        if (other.getVirtualServiceName() != null
                && other.getVirtualServiceName().equals(this.getVirtualServiceName()) == false)
            return false;
        return true;
    }
}
