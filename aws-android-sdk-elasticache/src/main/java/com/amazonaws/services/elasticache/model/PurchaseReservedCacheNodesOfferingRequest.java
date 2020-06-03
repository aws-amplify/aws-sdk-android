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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Allows you to purchase a reserved cache node offering.
 * </p>
 */
public class PurchaseReservedCacheNodesOfferingRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the reserved cache node offering to purchase.
     * </p>
     * <p>
     * Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     * </p>
     */
    private String reservedCacheNodesOfferingId;

    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     * <note>
     * <p>
     * The Reserved Cache Node ID is an unique customer-specified identifier to
     * track this reservation. If this parameter is not specified, ElastiCache
     * automatically generates an identifier for the reservation.
     * </p>
     * </note>
     * <p>
     * Example: myreservationID
     * </p>
     */
    private String reservedCacheNodeId;

    /**
     * <p>
     * The number of cache node instances to reserve.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     */
    private Integer cacheNodeCount;

    /**
     * <p>
     * The ID of the reserved cache node offering to purchase.
     * </p>
     * <p>
     * Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     * </p>
     *
     * @return <p>
     *         The ID of the reserved cache node offering to purchase.
     *         </p>
     *         <p>
     *         Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     *         </p>
     */
    public String getReservedCacheNodesOfferingId() {
        return reservedCacheNodesOfferingId;
    }

    /**
     * <p>
     * The ID of the reserved cache node offering to purchase.
     * </p>
     * <p>
     * Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     * </p>
     *
     * @param reservedCacheNodesOfferingId <p>
     *            The ID of the reserved cache node offering to purchase.
     *            </p>
     *            <p>
     *            Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     *            </p>
     */
    public void setReservedCacheNodesOfferingId(String reservedCacheNodesOfferingId) {
        this.reservedCacheNodesOfferingId = reservedCacheNodesOfferingId;
    }

    /**
     * <p>
     * The ID of the reserved cache node offering to purchase.
     * </p>
     * <p>
     * Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedCacheNodesOfferingId <p>
     *            The ID of the reserved cache node offering to purchase.
     *            </p>
     *            <p>
     *            Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedCacheNodesOfferingRequest withReservedCacheNodesOfferingId(
            String reservedCacheNodesOfferingId) {
        this.reservedCacheNodesOfferingId = reservedCacheNodesOfferingId;
        return this;
    }

    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     * <note>
     * <p>
     * The Reserved Cache Node ID is an unique customer-specified identifier to
     * track this reservation. If this parameter is not specified, ElastiCache
     * automatically generates an identifier for the reservation.
     * </p>
     * </note>
     * <p>
     * Example: myreservationID
     * </p>
     *
     * @return <p>
     *         A customer-specified identifier to track this reservation.
     *         </p>
     *         <note>
     *         <p>
     *         The Reserved Cache Node ID is an unique customer-specified
     *         identifier to track this reservation. If this parameter is not
     *         specified, ElastiCache automatically generates an identifier for
     *         the reservation.
     *         </p>
     *         </note>
     *         <p>
     *         Example: myreservationID
     *         </p>
     */
    public String getReservedCacheNodeId() {
        return reservedCacheNodeId;
    }

    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     * <note>
     * <p>
     * The Reserved Cache Node ID is an unique customer-specified identifier to
     * track this reservation. If this parameter is not specified, ElastiCache
     * automatically generates an identifier for the reservation.
     * </p>
     * </note>
     * <p>
     * Example: myreservationID
     * </p>
     *
     * @param reservedCacheNodeId <p>
     *            A customer-specified identifier to track this reservation.
     *            </p>
     *            <note>
     *            <p>
     *            The Reserved Cache Node ID is an unique customer-specified
     *            identifier to track this reservation. If this parameter is not
     *            specified, ElastiCache automatically generates an identifier
     *            for the reservation.
     *            </p>
     *            </note>
     *            <p>
     *            Example: myreservationID
     *            </p>
     */
    public void setReservedCacheNodeId(String reservedCacheNodeId) {
        this.reservedCacheNodeId = reservedCacheNodeId;
    }

    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     * <note>
     * <p>
     * The Reserved Cache Node ID is an unique customer-specified identifier to
     * track this reservation. If this parameter is not specified, ElastiCache
     * automatically generates an identifier for the reservation.
     * </p>
     * </note>
     * <p>
     * Example: myreservationID
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedCacheNodeId <p>
     *            A customer-specified identifier to track this reservation.
     *            </p>
     *            <note>
     *            <p>
     *            The Reserved Cache Node ID is an unique customer-specified
     *            identifier to track this reservation. If this parameter is not
     *            specified, ElastiCache automatically generates an identifier
     *            for the reservation.
     *            </p>
     *            </note>
     *            <p>
     *            Example: myreservationID
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedCacheNodesOfferingRequest withReservedCacheNodeId(
            String reservedCacheNodeId) {
        this.reservedCacheNodeId = reservedCacheNodeId;
        return this;
    }

    /**
     * <p>
     * The number of cache node instances to reserve.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     *
     * @return <p>
     *         The number of cache node instances to reserve.
     *         </p>
     *         <p>
     *         Default: <code>1</code>
     *         </p>
     */
    public Integer getCacheNodeCount() {
        return cacheNodeCount;
    }

    /**
     * <p>
     * The number of cache node instances to reserve.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     *
     * @param cacheNodeCount <p>
     *            The number of cache node instances to reserve.
     *            </p>
     *            <p>
     *            Default: <code>1</code>
     *            </p>
     */
    public void setCacheNodeCount(Integer cacheNodeCount) {
        this.cacheNodeCount = cacheNodeCount;
    }

    /**
     * <p>
     * The number of cache node instances to reserve.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeCount <p>
     *            The number of cache node instances to reserve.
     *            </p>
     *            <p>
     *            Default: <code>1</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedCacheNodesOfferingRequest withCacheNodeCount(Integer cacheNodeCount) {
        this.cacheNodeCount = cacheNodeCount;
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
        if (getReservedCacheNodesOfferingId() != null)
            sb.append("ReservedCacheNodesOfferingId: " + getReservedCacheNodesOfferingId() + ",");
        if (getReservedCacheNodeId() != null)
            sb.append("ReservedCacheNodeId: " + getReservedCacheNodeId() + ",");
        if (getCacheNodeCount() != null)
            sb.append("CacheNodeCount: " + getCacheNodeCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReservedCacheNodesOfferingId() == null) ? 0
                        : getReservedCacheNodesOfferingId().hashCode());
        hashCode = prime * hashCode
                + ((getReservedCacheNodeId() == null) ? 0 : getReservedCacheNodeId().hashCode());
        hashCode = prime * hashCode
                + ((getCacheNodeCount() == null) ? 0 : getCacheNodeCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseReservedCacheNodesOfferingRequest == false)
            return false;
        PurchaseReservedCacheNodesOfferingRequest other = (PurchaseReservedCacheNodesOfferingRequest) obj;

        if (other.getReservedCacheNodesOfferingId() == null
                ^ this.getReservedCacheNodesOfferingId() == null)
            return false;
        if (other.getReservedCacheNodesOfferingId() != null
                && other.getReservedCacheNodesOfferingId().equals(
                        this.getReservedCacheNodesOfferingId()) == false)
            return false;
        if (other.getReservedCacheNodeId() == null ^ this.getReservedCacheNodeId() == null)
            return false;
        if (other.getReservedCacheNodeId() != null
                && other.getReservedCacheNodeId().equals(this.getReservedCacheNodeId()) == false)
            return false;
        if (other.getCacheNodeCount() == null ^ this.getCacheNodeCount() == null)
            return false;
        if (other.getCacheNodeCount() != null
                && other.getCacheNodeCount().equals(this.getCacheNodeCount()) == false)
            return false;
        return true;
    }
}
