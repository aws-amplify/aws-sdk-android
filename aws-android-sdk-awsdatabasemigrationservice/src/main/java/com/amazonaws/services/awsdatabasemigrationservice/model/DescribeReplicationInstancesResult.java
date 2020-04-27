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
public class DescribeReplicationInstancesResult implements Serializable {
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
     * The replication instances described.
     * </p>
     */
    private java.util.List<ReplicationInstance> replicationInstances;

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
    public DescribeReplicationInstancesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * The replication instances described.
     * </p>
     *
     * @return <p>
     *         The replication instances described.
     *         </p>
     */
    public java.util.List<ReplicationInstance> getReplicationInstances() {
        return replicationInstances;
    }

    /**
     * <p>
     * The replication instances described.
     * </p>
     *
     * @param replicationInstances <p>
     *            The replication instances described.
     *            </p>
     */
    public void setReplicationInstances(
            java.util.Collection<ReplicationInstance> replicationInstances) {
        if (replicationInstances == null) {
            this.replicationInstances = null;
            return;
        }

        this.replicationInstances = new java.util.ArrayList<ReplicationInstance>(
                replicationInstances);
    }

    /**
     * <p>
     * The replication instances described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstances <p>
     *            The replication instances described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReplicationInstancesResult withReplicationInstances(
            ReplicationInstance... replicationInstances) {
        if (getReplicationInstances() == null) {
            this.replicationInstances = new java.util.ArrayList<ReplicationInstance>(
                    replicationInstances.length);
        }
        for (ReplicationInstance value : replicationInstances) {
            this.replicationInstances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The replication instances described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstances <p>
     *            The replication instances described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReplicationInstancesResult withReplicationInstances(
            java.util.Collection<ReplicationInstance> replicationInstances) {
        setReplicationInstances(replicationInstances);
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
        if (getReplicationInstances() != null)
            sb.append("ReplicationInstances: " + getReplicationInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getReplicationInstances() == null) ? 0 : getReplicationInstances().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReplicationInstancesResult == false)
            return false;
        DescribeReplicationInstancesResult other = (DescribeReplicationInstancesResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReplicationInstances() == null ^ this.getReplicationInstances() == null)
            return false;
        if (other.getReplicationInstances() != null
                && other.getReplicationInstances().equals(this.getReplicationInstances()) == false)
            return false;
        return true;
    }
}
