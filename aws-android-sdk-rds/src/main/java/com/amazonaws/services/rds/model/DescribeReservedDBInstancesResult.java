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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the result of a successful invocation of the
 * <code>DescribeReservedDBInstances</code> action.
 * </p>
 */
public class DescribeReservedDBInstancesResult implements Serializable {
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
     * A list of reserved DB instances.
     * </p>
     */
    private java.util.List<ReservedDBInstance> reservedDBInstances;

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
    public DescribeReservedDBInstancesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A list of reserved DB instances.
     * </p>
     *
     * @return <p>
     *         A list of reserved DB instances.
     *         </p>
     */
    public java.util.List<ReservedDBInstance> getReservedDBInstances() {
        return reservedDBInstances;
    }

    /**
     * <p>
     * A list of reserved DB instances.
     * </p>
     *
     * @param reservedDBInstances <p>
     *            A list of reserved DB instances.
     *            </p>
     */
    public void setReservedDBInstances(java.util.Collection<ReservedDBInstance> reservedDBInstances) {
        if (reservedDBInstances == null) {
            this.reservedDBInstances = null;
            return;
        }

        this.reservedDBInstances = new java.util.ArrayList<ReservedDBInstance>(reservedDBInstances);
    }

    /**
     * <p>
     * A list of reserved DB instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedDBInstances <p>
     *            A list of reserved DB instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedDBInstancesResult withReservedDBInstances(
            ReservedDBInstance... reservedDBInstances) {
        if (getReservedDBInstances() == null) {
            this.reservedDBInstances = new java.util.ArrayList<ReservedDBInstance>(
                    reservedDBInstances.length);
        }
        for (ReservedDBInstance value : reservedDBInstances) {
            this.reservedDBInstances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of reserved DB instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedDBInstances <p>
     *            A list of reserved DB instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedDBInstancesResult withReservedDBInstances(
            java.util.Collection<ReservedDBInstance> reservedDBInstances) {
        setReservedDBInstances(reservedDBInstances);
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
        if (getReservedDBInstances() != null)
            sb.append("ReservedDBInstances: " + getReservedDBInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getReservedDBInstances() == null) ? 0 : getReservedDBInstances().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedDBInstancesResult == false)
            return false;
        DescribeReservedDBInstancesResult other = (DescribeReservedDBInstancesResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReservedDBInstances() == null ^ this.getReservedDBInstances() == null)
            return false;
        if (other.getReservedDBInstances() != null
                && other.getReservedDBInstances().equals(this.getReservedDBInstances()) == false)
            return false;
        return true;
    }
}
