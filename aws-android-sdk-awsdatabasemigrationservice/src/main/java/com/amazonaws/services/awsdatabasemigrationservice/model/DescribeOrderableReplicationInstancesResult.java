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

package com.amazonaws.services.awsdatabasemigrationservice.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class DescribeOrderableReplicationInstancesResult implements Serializable {
    /**
     * <p>
     * The order-able replication instances available.
     * </p>
     */
    private java.util.List<OrderableReplicationInstance> orderableReplicationInstances;

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
     * The order-able replication instances available.
     * </p>
     *
     * @return <p>
     *         The order-able replication instances available.
     *         </p>
     */
    public java.util.List<OrderableReplicationInstance> getOrderableReplicationInstances() {
        return orderableReplicationInstances;
    }

    /**
     * <p>
     * The order-able replication instances available.
     * </p>
     *
     * @param orderableReplicationInstances <p>
     *            The order-able replication instances available.
     *            </p>
     */
    public void setOrderableReplicationInstances(
            java.util.Collection<OrderableReplicationInstance> orderableReplicationInstances) {
        if (orderableReplicationInstances == null) {
            this.orderableReplicationInstances = null;
            return;
        }

        this.orderableReplicationInstances = new java.util.ArrayList<OrderableReplicationInstance>(
                orderableReplicationInstances);
    }

    /**
     * <p>
     * The order-able replication instances available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param orderableReplicationInstances <p>
     *            The order-able replication instances available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrderableReplicationInstancesResult withOrderableReplicationInstances(
            OrderableReplicationInstance... orderableReplicationInstances) {
        if (getOrderableReplicationInstances() == null) {
            this.orderableReplicationInstances = new java.util.ArrayList<OrderableReplicationInstance>(
                    orderableReplicationInstances.length);
        }
        for (OrderableReplicationInstance value : orderableReplicationInstances) {
            this.orderableReplicationInstances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The order-able replication instances available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param orderableReplicationInstances <p>
     *            The order-able replication instances available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrderableReplicationInstancesResult withOrderableReplicationInstances(
            java.util.Collection<OrderableReplicationInstance> orderableReplicationInstances) {
        setOrderableReplicationInstances(orderableReplicationInstances);
        return this;
    }

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
    public DescribeOrderableReplicationInstancesResult withMarker(String marker) {
        this.marker = marker;
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
        if (getOrderableReplicationInstances() != null)
            sb.append("OrderableReplicationInstances: " + getOrderableReplicationInstances() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getOrderableReplicationInstances() == null) ? 0
                        : getOrderableReplicationInstances().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOrderableReplicationInstancesResult == false)
            return false;
        DescribeOrderableReplicationInstancesResult other = (DescribeOrderableReplicationInstancesResult) obj;

        if (other.getOrderableReplicationInstances() == null
                ^ this.getOrderableReplicationInstances() == null)
            return false;
        if (other.getOrderableReplicationInstances() != null
                && other.getOrderableReplicationInstances().equals(
                        this.getOrderableReplicationInstances()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
