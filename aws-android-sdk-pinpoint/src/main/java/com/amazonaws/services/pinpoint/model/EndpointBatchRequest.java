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
 * Endpoint batch update request.
 */
public class EndpointBatchRequest implements Serializable {
    /**
     * List of items to update. Maximum 100 items
     */
    private java.util.List<EndpointBatchItem> item;

    /**
     * List of items to update. Maximum 100 items
     *
     * @return List of items to update. Maximum 100 items
     */
    public java.util.List<EndpointBatchItem> getItem() {
        return item;
    }

    /**
     * List of items to update. Maximum 100 items
     *
     * @param item List of items to update. Maximum 100 items
     */
    public void setItem(java.util.Collection<EndpointBatchItem> item) {
        if (item == null) {
            this.item = null;
            return;
        }

        this.item = new java.util.ArrayList<EndpointBatchItem>(item);
    }

    /**
     * List of items to update. Maximum 100 items
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param item List of items to update. Maximum 100 items
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointBatchRequest withItem(EndpointBatchItem... item) {
        if (getItem() == null) {
            this.item = new java.util.ArrayList<EndpointBatchItem>(item.length);
        }
        for (EndpointBatchItem value : item) {
            this.item.add(value);
        }
        return this;
    }

    /**
     * List of items to update. Maximum 100 items
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param item List of items to update. Maximum 100 items
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointBatchRequest withItem(java.util.Collection<EndpointBatchItem> item) {
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

        if (obj instanceof EndpointBatchRequest == false)
            return false;
        EndpointBatchRequest other = (EndpointBatchRequest) obj;

        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
            return false;
        return true;
    }
}
