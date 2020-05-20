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
 * An object that represents the specification of a service mesh.
 * </p>
 */
public class MeshSpec implements Serializable {
    /**
     * <p>
     * The egress filter rules for the service mesh.
     * </p>
     */
    private EgressFilter egressFilter;

    /**
     * <p>
     * The egress filter rules for the service mesh.
     * </p>
     *
     * @return <p>
     *         The egress filter rules for the service mesh.
     *         </p>
     */
    public EgressFilter getEgressFilter() {
        return egressFilter;
    }

    /**
     * <p>
     * The egress filter rules for the service mesh.
     * </p>
     *
     * @param egressFilter <p>
     *            The egress filter rules for the service mesh.
     *            </p>
     */
    public void setEgressFilter(EgressFilter egressFilter) {
        this.egressFilter = egressFilter;
    }

    /**
     * <p>
     * The egress filter rules for the service mesh.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param egressFilter <p>
     *            The egress filter rules for the service mesh.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MeshSpec withEgressFilter(EgressFilter egressFilter) {
        this.egressFilter = egressFilter;
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
        if (getEgressFilter() != null)
            sb.append("egressFilter: " + getEgressFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEgressFilter() == null) ? 0 : getEgressFilter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MeshSpec == false)
            return false;
        MeshSpec other = (MeshSpec) obj;

        if (other.getEgressFilter() == null ^ this.getEgressFilter() == null)
            return false;
        if (other.getEgressFilter() != null
                && other.getEgressFilter().equals(this.getEgressFilter()) == false)
            return false;
        return true;
    }
}
