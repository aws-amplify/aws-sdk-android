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
 * An object that represents the specification of a virtual service.
 * </p>
 */
public class VirtualServiceSpec implements Serializable {
    /**
     * <p>
     * The App Mesh object that is acting as the provider for a virtual service.
     * You can specify a single virtual node or virtual router.
     * </p>
     */
    private VirtualServiceProvider provider;

    /**
     * <p>
     * The App Mesh object that is acting as the provider for a virtual service.
     * You can specify a single virtual node or virtual router.
     * </p>
     *
     * @return <p>
     *         The App Mesh object that is acting as the provider for a virtual
     *         service. You can specify a single virtual node or virtual router.
     *         </p>
     */
    public VirtualServiceProvider getProvider() {
        return provider;
    }

    /**
     * <p>
     * The App Mesh object that is acting as the provider for a virtual service.
     * You can specify a single virtual node or virtual router.
     * </p>
     *
     * @param provider <p>
     *            The App Mesh object that is acting as the provider for a
     *            virtual service. You can specify a single virtual node or
     *            virtual router.
     *            </p>
     */
    public void setProvider(VirtualServiceProvider provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The App Mesh object that is acting as the provider for a virtual service.
     * You can specify a single virtual node or virtual router.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provider <p>
     *            The App Mesh object that is acting as the provider for a
     *            virtual service. You can specify a single virtual node or
     *            virtual router.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualServiceSpec withProvider(VirtualServiceProvider provider) {
        this.provider = provider;
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
        if (getProvider() != null)
            sb.append("provider: " + getProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualServiceSpec == false)
            return false;
        VirtualServiceSpec other = (VirtualServiceSpec) obj;

        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        return true;
    }
}
