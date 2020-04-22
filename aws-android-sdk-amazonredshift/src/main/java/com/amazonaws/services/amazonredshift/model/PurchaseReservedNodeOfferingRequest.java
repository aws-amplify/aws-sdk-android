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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Allows you to purchase reserved nodes. Amazon Redshift offers a predefined
 * set of reserved node offerings. You can purchase one or more of the
 * offerings. You can call the <a>DescribeReservedNodeOfferings</a> API to
 * obtain the available reserved node offerings. You can call this API by
 * providing a specific reserved node offering and the number of nodes you want
 * to reserve.
 * </p>
 * <p>
 * For more information about reserved node offerings, go to <a href=
 * "https://docs.aws.amazon.com/redshift/latest/mgmt/purchase-reserved-node-instance.html"
 * >Purchasing Reserved Nodes</a> in the <i>Amazon Redshift Cluster Management
 * Guide</i>.
 * </p>
 */
public class PurchaseReservedNodeOfferingRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The unique identifier of the reserved node offering you want to purchase.
     * </p>
     */
    private String reservedNodeOfferingId;

    /**
     * <p>
     * The number of reserved nodes that you want to purchase.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     */
    private Integer nodeCount;

    /**
     * <p>
     * The unique identifier of the reserved node offering you want to purchase.
     * </p>
     *
     * @return <p>
     *         The unique identifier of the reserved node offering you want to
     *         purchase.
     *         </p>
     */
    public String getReservedNodeOfferingId() {
        return reservedNodeOfferingId;
    }

    /**
     * <p>
     * The unique identifier of the reserved node offering you want to purchase.
     * </p>
     *
     * @param reservedNodeOfferingId <p>
     *            The unique identifier of the reserved node offering you want
     *            to purchase.
     *            </p>
     */
    public void setReservedNodeOfferingId(String reservedNodeOfferingId) {
        this.reservedNodeOfferingId = reservedNodeOfferingId;
    }

    /**
     * <p>
     * The unique identifier of the reserved node offering you want to purchase.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedNodeOfferingId <p>
     *            The unique identifier of the reserved node offering you want
     *            to purchase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedNodeOfferingRequest withReservedNodeOfferingId(
            String reservedNodeOfferingId) {
        this.reservedNodeOfferingId = reservedNodeOfferingId;
        return this;
    }

    /**
     * <p>
     * The number of reserved nodes that you want to purchase.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     *
     * @return <p>
     *         The number of reserved nodes that you want to purchase.
     *         </p>
     *         <p>
     *         Default: <code>1</code>
     *         </p>
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    /**
     * <p>
     * The number of reserved nodes that you want to purchase.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     *
     * @param nodeCount <p>
     *            The number of reserved nodes that you want to purchase.
     *            </p>
     *            <p>
     *            Default: <code>1</code>
     *            </p>
     */
    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    /**
     * <p>
     * The number of reserved nodes that you want to purchase.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeCount <p>
     *            The number of reserved nodes that you want to purchase.
     *            </p>
     *            <p>
     *            Default: <code>1</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedNodeOfferingRequest withNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
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
        if (getReservedNodeOfferingId() != null)
            sb.append("ReservedNodeOfferingId: " + getReservedNodeOfferingId() + ",");
        if (getNodeCount() != null)
            sb.append("NodeCount: " + getNodeCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReservedNodeOfferingId() == null) ? 0 : getReservedNodeOfferingId()
                        .hashCode());
        hashCode = prime * hashCode + ((getNodeCount() == null) ? 0 : getNodeCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseReservedNodeOfferingRequest == false)
            return false;
        PurchaseReservedNodeOfferingRequest other = (PurchaseReservedNodeOfferingRequest) obj;

        if (other.getReservedNodeOfferingId() == null ^ this.getReservedNodeOfferingId() == null)
            return false;
        if (other.getReservedNodeOfferingId() != null
                && other.getReservedNodeOfferingId().equals(this.getReservedNodeOfferingId()) == false)
            return false;
        if (other.getNodeCount() == null ^ this.getNodeCount() == null)
            return false;
        if (other.getNodeCount() != null
                && other.getNodeCount().equals(this.getNodeCount()) == false)
            return false;
        return true;
    }
}
