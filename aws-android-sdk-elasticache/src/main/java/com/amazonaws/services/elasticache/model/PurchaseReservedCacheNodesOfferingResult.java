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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

public class PurchaseReservedCacheNodesOfferingResult implements Serializable {
    /**
     * <p>
     * Represents the output of a
     * <code>PurchaseReservedCacheNodesOffering</code> operation.
     * </p>
     */
    private ReservedCacheNode reservedCacheNode;

    /**
     * <p>
     * Represents the output of a
     * <code>PurchaseReservedCacheNodesOffering</code> operation.
     * </p>
     *
     * @return <p>
     *         Represents the output of a
     *         <code>PurchaseReservedCacheNodesOffering</code> operation.
     *         </p>
     */
    public ReservedCacheNode getReservedCacheNode() {
        return reservedCacheNode;
    }

    /**
     * <p>
     * Represents the output of a
     * <code>PurchaseReservedCacheNodesOffering</code> operation.
     * </p>
     *
     * @param reservedCacheNode <p>
     *            Represents the output of a
     *            <code>PurchaseReservedCacheNodesOffering</code> operation.
     *            </p>
     */
    public void setReservedCacheNode(ReservedCacheNode reservedCacheNode) {
        this.reservedCacheNode = reservedCacheNode;
    }

    /**
     * <p>
     * Represents the output of a
     * <code>PurchaseReservedCacheNodesOffering</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedCacheNode <p>
     *            Represents the output of a
     *            <code>PurchaseReservedCacheNodesOffering</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedCacheNodesOfferingResult withReservedCacheNode(
            ReservedCacheNode reservedCacheNode) {
        this.reservedCacheNode = reservedCacheNode;
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
        if (getReservedCacheNode() != null)
            sb.append("ReservedCacheNode: " + getReservedCacheNode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReservedCacheNode() == null) ? 0 : getReservedCacheNode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseReservedCacheNodesOfferingResult == false)
            return false;
        PurchaseReservedCacheNodesOfferingResult other = (PurchaseReservedCacheNodesOfferingResult) obj;

        if (other.getReservedCacheNode() == null ^ this.getReservedCacheNode() == null)
            return false;
        if (other.getReservedCacheNode() != null
                && other.getReservedCacheNode().equals(this.getReservedCacheNode()) == false)
            return false;
        return true;
    }
}
