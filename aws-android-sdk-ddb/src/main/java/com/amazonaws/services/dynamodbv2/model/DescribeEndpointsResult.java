/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

public class DescribeEndpointsResult implements Serializable {
    /**
     * The new value for the endpoints property for this object.
     */
    private java.util.List<Endpoint> endpoints;

    /**
     * Returns the value of the endpoints property for this object.
     *
     * @return The value of the endpoints property for this object.
     */
    public java.util.List<Endpoint> getEndpoints() {
        return endpoints;
    }

    /**
     * Sets the value of endpoints
     *
     * @param endpoints The new value for the endpoints property for this
     *            object.
     */
    public void setEndpoints(java.util.Collection<Endpoint> endpoints) {
        if (endpoints == null) {
            this.endpoints = null;
            return;
        }

        this.endpoints = new java.util.ArrayList<Endpoint>(endpoints);
    }

    /**
     * Sets the value of the endpoints property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoints The new value for the endpoints property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointsResult withEndpoints(Endpoint... endpoints) {
        if (getEndpoints() == null) {
            this.endpoints = new java.util.ArrayList<Endpoint>(endpoints.length);
        }
        for (Endpoint value : endpoints) {
            this.endpoints.add(value);
        }
        return this;
    }

    /**
     * Sets the value of the endpoints property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoints The new value for the endpoints property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointsResult withEndpoints(java.util.Collection<Endpoint> endpoints) {
        setEndpoints(endpoints);
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
        if (getEndpoints() != null)
            sb.append("Endpoints: " + getEndpoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEndpointsResult == false)
            return false;
        DescribeEndpointsResult other = (DescribeEndpointsResult) obj;

        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null
                && other.getEndpoints().equals(this.getEndpoints()) == false)
            return false;
        return true;
    }
}
