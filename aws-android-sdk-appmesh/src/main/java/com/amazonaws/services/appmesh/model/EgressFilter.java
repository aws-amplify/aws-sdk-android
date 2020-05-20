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
 * An object that represents the egress filter rules for a service mesh.
 * </p>
 */
public class EgressFilter implements Serializable {
    /**
     * <p>
     * The egress filter type. By default, the type is <code>DROP_ALL</code>,
     * which allows egress only from virtual nodes to other defined resources in
     * the service mesh (and any traffic to <code>*.amazonaws.com</code> for AWS
     * API calls). You can set the egress filter type to <code>ALLOW_ALL</code>
     * to allow egress to any endpoint inside or outside of the service mesh.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_ALL, DROP_ALL
     */
    private String type;

    /**
     * <p>
     * The egress filter type. By default, the type is <code>DROP_ALL</code>,
     * which allows egress only from virtual nodes to other defined resources in
     * the service mesh (and any traffic to <code>*.amazonaws.com</code> for AWS
     * API calls). You can set the egress filter type to <code>ALLOW_ALL</code>
     * to allow egress to any endpoint inside or outside of the service mesh.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_ALL, DROP_ALL
     *
     * @return <p>
     *         The egress filter type. By default, the type is
     *         <code>DROP_ALL</code>, which allows egress only from virtual
     *         nodes to other defined resources in the service mesh (and any
     *         traffic to <code>*.amazonaws.com</code> for AWS API calls). You
     *         can set the egress filter type to <code>ALLOW_ALL</code> to allow
     *         egress to any endpoint inside or outside of the service mesh.
     *         </p>
     * @see EgressFilterType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The egress filter type. By default, the type is <code>DROP_ALL</code>,
     * which allows egress only from virtual nodes to other defined resources in
     * the service mesh (and any traffic to <code>*.amazonaws.com</code> for AWS
     * API calls). You can set the egress filter type to <code>ALLOW_ALL</code>
     * to allow egress to any endpoint inside or outside of the service mesh.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_ALL, DROP_ALL
     *
     * @param type <p>
     *            The egress filter type. By default, the type is
     *            <code>DROP_ALL</code>, which allows egress only from virtual
     *            nodes to other defined resources in the service mesh (and any
     *            traffic to <code>*.amazonaws.com</code> for AWS API calls).
     *            You can set the egress filter type to <code>ALLOW_ALL</code>
     *            to allow egress to any endpoint inside or outside of the
     *            service mesh.
     *            </p>
     * @see EgressFilterType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The egress filter type. By default, the type is <code>DROP_ALL</code>,
     * which allows egress only from virtual nodes to other defined resources in
     * the service mesh (and any traffic to <code>*.amazonaws.com</code> for AWS
     * API calls). You can set the egress filter type to <code>ALLOW_ALL</code>
     * to allow egress to any endpoint inside or outside of the service mesh.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_ALL, DROP_ALL
     *
     * @param type <p>
     *            The egress filter type. By default, the type is
     *            <code>DROP_ALL</code>, which allows egress only from virtual
     *            nodes to other defined resources in the service mesh (and any
     *            traffic to <code>*.amazonaws.com</code> for AWS API calls).
     *            You can set the egress filter type to <code>ALLOW_ALL</code>
     *            to allow egress to any endpoint inside or outside of the
     *            service mesh.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EgressFilterType
     */
    public EgressFilter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The egress filter type. By default, the type is <code>DROP_ALL</code>,
     * which allows egress only from virtual nodes to other defined resources in
     * the service mesh (and any traffic to <code>*.amazonaws.com</code> for AWS
     * API calls). You can set the egress filter type to <code>ALLOW_ALL</code>
     * to allow egress to any endpoint inside or outside of the service mesh.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_ALL, DROP_ALL
     *
     * @param type <p>
     *            The egress filter type. By default, the type is
     *            <code>DROP_ALL</code>, which allows egress only from virtual
     *            nodes to other defined resources in the service mesh (and any
     *            traffic to <code>*.amazonaws.com</code> for AWS API calls).
     *            You can set the egress filter type to <code>ALLOW_ALL</code>
     *            to allow egress to any endpoint inside or outside of the
     *            service mesh.
     *            </p>
     * @see EgressFilterType
     */
    public void setType(EgressFilterType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The egress filter type. By default, the type is <code>DROP_ALL</code>,
     * which allows egress only from virtual nodes to other defined resources in
     * the service mesh (and any traffic to <code>*.amazonaws.com</code> for AWS
     * API calls). You can set the egress filter type to <code>ALLOW_ALL</code>
     * to allow egress to any endpoint inside or outside of the service mesh.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_ALL, DROP_ALL
     *
     * @param type <p>
     *            The egress filter type. By default, the type is
     *            <code>DROP_ALL</code>, which allows egress only from virtual
     *            nodes to other defined resources in the service mesh (and any
     *            traffic to <code>*.amazonaws.com</code> for AWS API calls).
     *            You can set the egress filter type to <code>ALLOW_ALL</code>
     *            to allow egress to any endpoint inside or outside of the
     *            service mesh.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EgressFilterType
     */
    public EgressFilter withType(EgressFilterType type) {
        this.type = type.toString();
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
        if (getType() != null)
            sb.append("type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EgressFilter == false)
            return false;
        EgressFilter other = (EgressFilter) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
