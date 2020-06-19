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

/**
 * <p>
 * Represents the output of a <code>DescribeReservedCacheNodes</code> operation.
 * </p>
 */
public class DescribeReservedCacheNodesResult implements Serializable {
    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of reserved cache nodes. Each element in the list contains
     * detailed information about one node.
     * </p>
     */
    private java.util.List<ReservedCacheNode> reservedCacheNodes;

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     *
     * @return <p>
     *         Provides an identifier to allow retrieval of paginated results.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     *
     * @param marker <p>
     *            Provides an identifier to allow retrieval of paginated
     *            results.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            Provides an identifier to allow retrieval of paginated
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedCacheNodesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A list of reserved cache nodes. Each element in the list contains
     * detailed information about one node.
     * </p>
     *
     * @return <p>
     *         A list of reserved cache nodes. Each element in the list contains
     *         detailed information about one node.
     *         </p>
     */
    public java.util.List<ReservedCacheNode> getReservedCacheNodes() {
        return reservedCacheNodes;
    }

    /**
     * <p>
     * A list of reserved cache nodes. Each element in the list contains
     * detailed information about one node.
     * </p>
     *
     * @param reservedCacheNodes <p>
     *            A list of reserved cache nodes. Each element in the list
     *            contains detailed information about one node.
     *            </p>
     */
    public void setReservedCacheNodes(java.util.Collection<ReservedCacheNode> reservedCacheNodes) {
        if (reservedCacheNodes == null) {
            this.reservedCacheNodes = null;
            return;
        }

        this.reservedCacheNodes = new java.util.ArrayList<ReservedCacheNode>(reservedCacheNodes);
    }

    /**
     * <p>
     * A list of reserved cache nodes. Each element in the list contains
     * detailed information about one node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedCacheNodes <p>
     *            A list of reserved cache nodes. Each element in the list
     *            contains detailed information about one node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedCacheNodesResult withReservedCacheNodes(
            ReservedCacheNode... reservedCacheNodes) {
        if (getReservedCacheNodes() == null) {
            this.reservedCacheNodes = new java.util.ArrayList<ReservedCacheNode>(
                    reservedCacheNodes.length);
        }
        for (ReservedCacheNode value : reservedCacheNodes) {
            this.reservedCacheNodes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of reserved cache nodes. Each element in the list contains
     * detailed information about one node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedCacheNodes <p>
     *            A list of reserved cache nodes. Each element in the list
     *            contains detailed information about one node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedCacheNodesResult withReservedCacheNodes(
            java.util.Collection<ReservedCacheNode> reservedCacheNodes) {
        setReservedCacheNodes(reservedCacheNodes);
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getReservedCacheNodes() != null)
            sb.append("ReservedCacheNodes: " + getReservedCacheNodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getReservedCacheNodes() == null) ? 0 : getReservedCacheNodes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedCacheNodesResult == false)
            return false;
        DescribeReservedCacheNodesResult other = (DescribeReservedCacheNodesResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReservedCacheNodes() == null ^ this.getReservedCacheNodes() == null)
            return false;
        if (other.getReservedCacheNodes() != null
                && other.getReservedCacheNodes().equals(this.getReservedCacheNodes()) == false)
            return false;
        return true;
    }
}
