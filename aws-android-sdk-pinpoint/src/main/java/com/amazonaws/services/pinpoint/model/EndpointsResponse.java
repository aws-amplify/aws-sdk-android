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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * List of endpoints
 */
public class EndpointsResponse implements Serializable {
    /**
     * The list of endpoints.
     */
    private java.util.List<EndpointResponse> item;

    /**
     * The list of endpoints.
     *
     * @return The list of endpoints.
     */
    public java.util.List<EndpointResponse> getItem() {
        return item;
    }

    /**
     * The list of endpoints.
     *
     * @param item The list of endpoints.
     */
    public void setItem(java.util.Collection<EndpointResponse> item) {
        if (item == null) {
            this.item = null;
            return;
        }

        this.item = new java.util.ArrayList<EndpointResponse>(item);
    }

    /**
     * The list of endpoints.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param item The list of endpoints.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointsResponse withItem(EndpointResponse... item) {
        if (getItem() == null) {
            this.item = new java.util.ArrayList<EndpointResponse>(item.length);
        }
        for (EndpointResponse value : item) {
            this.item.add(value);
        }
        return this;
    }

    /**
     * The list of endpoints.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param item The list of endpoints.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointsResponse withItem(java.util.Collection<EndpointResponse> item) {
        setItem(item);
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
        if (getItem() != null)
            sb.append("Item: " + getItem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointsResponse == false)
            return false;
        EndpointsResponse other = (EndpointsResponse) obj;

        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
            return false;
        return true;
    }
}
