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

package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;

public class OriginDetails implements Serializable {
    /**
     * The new value for the productId property for this object.
     */
    private String productId;

    /**
     * Returns the value of the productId property for this object.
     *
     * @return The value of the productId property for this object.
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of productId
     *
     * @param productId The new value for the productId property for this
     *            object.
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * Sets the value of the productId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productId The new value for the productId property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OriginDetails withProductId(String productId) {
        this.productId = productId;
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
        if (getProductId() != null)
            sb.append("ProductId: " + getProductId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginDetails == false)
            return false;
        OriginDetails other = (OriginDetails) obj;

        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null
                && other.getProductId().equals(this.getProductId()) == false)
            return false;
        return true;
    }
}
