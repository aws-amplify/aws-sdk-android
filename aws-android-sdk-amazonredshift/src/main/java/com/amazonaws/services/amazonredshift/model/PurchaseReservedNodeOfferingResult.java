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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

public class PurchaseReservedNodeOfferingResult implements Serializable {
    /**
     * <p>
     * Describes a reserved node. You can call the
     * <a>DescribeReservedNodeOfferings</a> API to obtain the available reserved
     * node offerings.
     * </p>
     */
    private ReservedNode reservedNode;

    /**
     * <p>
     * Describes a reserved node. You can call the
     * <a>DescribeReservedNodeOfferings</a> API to obtain the available reserved
     * node offerings.
     * </p>
     *
     * @return <p>
     *         Describes a reserved node. You can call the
     *         <a>DescribeReservedNodeOfferings</a> API to obtain the available
     *         reserved node offerings.
     *         </p>
     */
    public ReservedNode getReservedNode() {
        return reservedNode;
    }

    /**
     * <p>
     * Describes a reserved node. You can call the
     * <a>DescribeReservedNodeOfferings</a> API to obtain the available reserved
     * node offerings.
     * </p>
     *
     * @param reservedNode <p>
     *            Describes a reserved node. You can call the
     *            <a>DescribeReservedNodeOfferings</a> API to obtain the
     *            available reserved node offerings.
     *            </p>
     */
    public void setReservedNode(ReservedNode reservedNode) {
        this.reservedNode = reservedNode;
    }

    /**
     * <p>
     * Describes a reserved node. You can call the
     * <a>DescribeReservedNodeOfferings</a> API to obtain the available reserved
     * node offerings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedNode <p>
     *            Describes a reserved node. You can call the
     *            <a>DescribeReservedNodeOfferings</a> API to obtain the
     *            available reserved node offerings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedNodeOfferingResult withReservedNode(ReservedNode reservedNode) {
        this.reservedNode = reservedNode;
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
        if (getReservedNode() != null)
            sb.append("ReservedNode: " + getReservedNode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReservedNode() == null) ? 0 : getReservedNode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseReservedNodeOfferingResult == false)
            return false;
        PurchaseReservedNodeOfferingResult other = (PurchaseReservedNodeOfferingResult) obj;

        if (other.getReservedNode() == null ^ this.getReservedNode() == null)
            return false;
        if (other.getReservedNode() != null
                && other.getReservedNode().equals(this.getReservedNode()) == false)
            return false;
        return true;
    }
}
