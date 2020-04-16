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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the result of a successful invocation of the
 * <code>DescribeReservedDBInstancesOfferings</code> action.
 * </p>
 */
public class DescribeReservedDBInstancesOfferingsResult implements Serializable {
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of reserved DB instance offerings.
     * </p>
     */
    private java.util.List<ReservedDBInstancesOffering> reservedDBInstancesOfferings;

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous request. If
     *         this parameter is specified, the response includes only records
     *         beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous request.
     *            If this parameter is specified, the response includes only
     *            records beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous request.
     *            If this parameter is specified, the response includes only
     *            records beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedDBInstancesOfferingsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A list of reserved DB instance offerings.
     * </p>
     *
     * @return <p>
     *         A list of reserved DB instance offerings.
     *         </p>
     */
    public java.util.List<ReservedDBInstancesOffering> getReservedDBInstancesOfferings() {
        return reservedDBInstancesOfferings;
    }

    /**
     * <p>
     * A list of reserved DB instance offerings.
     * </p>
     *
     * @param reservedDBInstancesOfferings <p>
     *            A list of reserved DB instance offerings.
     *            </p>
     */
    public void setReservedDBInstancesOfferings(
            java.util.Collection<ReservedDBInstancesOffering> reservedDBInstancesOfferings) {
        if (reservedDBInstancesOfferings == null) {
            this.reservedDBInstancesOfferings = null;
            return;
        }

        this.reservedDBInstancesOfferings = new java.util.ArrayList<ReservedDBInstancesOffering>(
                reservedDBInstancesOfferings);
    }

    /**
     * <p>
     * A list of reserved DB instance offerings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedDBInstancesOfferings <p>
     *            A list of reserved DB instance offerings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedDBInstancesOfferingsResult withReservedDBInstancesOfferings(
            ReservedDBInstancesOffering... reservedDBInstancesOfferings) {
        if (getReservedDBInstancesOfferings() == null) {
            this.reservedDBInstancesOfferings = new java.util.ArrayList<ReservedDBInstancesOffering>(
                    reservedDBInstancesOfferings.length);
        }
        for (ReservedDBInstancesOffering value : reservedDBInstancesOfferings) {
            this.reservedDBInstancesOfferings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of reserved DB instance offerings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedDBInstancesOfferings <p>
     *            A list of reserved DB instance offerings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedDBInstancesOfferingsResult withReservedDBInstancesOfferings(
            java.util.Collection<ReservedDBInstancesOffering> reservedDBInstancesOfferings) {
        setReservedDBInstancesOfferings(reservedDBInstancesOfferings);
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
        if (getReservedDBInstancesOfferings() != null)
            sb.append("ReservedDBInstancesOfferings: " + getReservedDBInstancesOfferings());
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
                + ((getReservedDBInstancesOfferings() == null) ? 0
                        : getReservedDBInstancesOfferings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedDBInstancesOfferingsResult == false)
            return false;
        DescribeReservedDBInstancesOfferingsResult other = (DescribeReservedDBInstancesOfferingsResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReservedDBInstancesOfferings() == null
                ^ this.getReservedDBInstancesOfferings() == null)
            return false;
        if (other.getReservedDBInstancesOfferings() != null
                && other.getReservedDBInstancesOfferings().equals(
                        this.getReservedDBInstancesOfferings()) == false)
            return false;
        return true;
    }
}
