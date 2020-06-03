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
 * Represents the output of a <code>DescribeReservedCacheNodesOfferings</code>
 * operation.
 * </p>
 */
public class DescribeReservedCacheNodesOfferingsResult implements Serializable {
    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of reserved cache node offerings. Each element in the list
     * contains detailed information about one offering.
     * </p>
     */
    private java.util.List<ReservedCacheNodesOffering> reservedCacheNodesOfferings;

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
    public DescribeReservedCacheNodesOfferingsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A list of reserved cache node offerings. Each element in the list
     * contains detailed information about one offering.
     * </p>
     *
     * @return <p>
     *         A list of reserved cache node offerings. Each element in the list
     *         contains detailed information about one offering.
     *         </p>
     */
    public java.util.List<ReservedCacheNodesOffering> getReservedCacheNodesOfferings() {
        return reservedCacheNodesOfferings;
    }

    /**
     * <p>
     * A list of reserved cache node offerings. Each element in the list
     * contains detailed information about one offering.
     * </p>
     *
     * @param reservedCacheNodesOfferings <p>
     *            A list of reserved cache node offerings. Each element in the
     *            list contains detailed information about one offering.
     *            </p>
     */
    public void setReservedCacheNodesOfferings(
            java.util.Collection<ReservedCacheNodesOffering> reservedCacheNodesOfferings) {
        if (reservedCacheNodesOfferings == null) {
            this.reservedCacheNodesOfferings = null;
            return;
        }

        this.reservedCacheNodesOfferings = new java.util.ArrayList<ReservedCacheNodesOffering>(
                reservedCacheNodesOfferings);
    }

    /**
     * <p>
     * A list of reserved cache node offerings. Each element in the list
     * contains detailed information about one offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedCacheNodesOfferings <p>
     *            A list of reserved cache node offerings. Each element in the
     *            list contains detailed information about one offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedCacheNodesOfferingsResult withReservedCacheNodesOfferings(
            ReservedCacheNodesOffering... reservedCacheNodesOfferings) {
        if (getReservedCacheNodesOfferings() == null) {
            this.reservedCacheNodesOfferings = new java.util.ArrayList<ReservedCacheNodesOffering>(
                    reservedCacheNodesOfferings.length);
        }
        for (ReservedCacheNodesOffering value : reservedCacheNodesOfferings) {
            this.reservedCacheNodesOfferings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of reserved cache node offerings. Each element in the list
     * contains detailed information about one offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedCacheNodesOfferings <p>
     *            A list of reserved cache node offerings. Each element in the
     *            list contains detailed information about one offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedCacheNodesOfferingsResult withReservedCacheNodesOfferings(
            java.util.Collection<ReservedCacheNodesOffering> reservedCacheNodesOfferings) {
        setReservedCacheNodesOfferings(reservedCacheNodesOfferings);
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
        if (getReservedCacheNodesOfferings() != null)
            sb.append("ReservedCacheNodesOfferings: " + getReservedCacheNodesOfferings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime
                * hashCode
                + ((getReservedCacheNodesOfferings() == null) ? 0
                        : getReservedCacheNodesOfferings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedCacheNodesOfferingsResult == false)
            return false;
        DescribeReservedCacheNodesOfferingsResult other = (DescribeReservedCacheNodesOfferingsResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReservedCacheNodesOfferings() == null
                ^ this.getReservedCacheNodesOfferings() == null)
            return false;
        if (other.getReservedCacheNodesOfferings() != null
                && other.getReservedCacheNodesOfferings().equals(
                        this.getReservedCacheNodesOfferings()) == false)
            return false;
        return true;
    }
}
