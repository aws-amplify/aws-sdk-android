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

package com.amazonaws.services.dms.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class DescribeReplicationSubnetGroupsResult implements Serializable {
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
     * A description of the replication subnet groups.
     * </p>
     */
    private java.util.List<ReplicationSubnetGroup> replicationSubnetGroups;

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
    public DescribeReplicationSubnetGroupsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A description of the replication subnet groups.
     * </p>
     *
     * @return <p>
     *         A description of the replication subnet groups.
     *         </p>
     */
    public java.util.List<ReplicationSubnetGroup> getReplicationSubnetGroups() {
        return replicationSubnetGroups;
    }

    /**
     * <p>
     * A description of the replication subnet groups.
     * </p>
     *
     * @param replicationSubnetGroups <p>
     *            A description of the replication subnet groups.
     *            </p>
     */
    public void setReplicationSubnetGroups(
            java.util.Collection<ReplicationSubnetGroup> replicationSubnetGroups) {
        if (replicationSubnetGroups == null) {
            this.replicationSubnetGroups = null;
            return;
        }

        this.replicationSubnetGroups = new java.util.ArrayList<ReplicationSubnetGroup>(
                replicationSubnetGroups);
    }

    /**
     * <p>
     * A description of the replication subnet groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationSubnetGroups <p>
     *            A description of the replication subnet groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReplicationSubnetGroupsResult withReplicationSubnetGroups(
            ReplicationSubnetGroup... replicationSubnetGroups) {
        if (getReplicationSubnetGroups() == null) {
            this.replicationSubnetGroups = new java.util.ArrayList<ReplicationSubnetGroup>(
                    replicationSubnetGroups.length);
        }
        for (ReplicationSubnetGroup value : replicationSubnetGroups) {
            this.replicationSubnetGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A description of the replication subnet groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationSubnetGroups <p>
     *            A description of the replication subnet groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReplicationSubnetGroupsResult withReplicationSubnetGroups(
            java.util.Collection<ReplicationSubnetGroup> replicationSubnetGroups) {
        setReplicationSubnetGroups(replicationSubnetGroups);
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
        if (getReplicationSubnetGroups() != null)
            sb.append("ReplicationSubnetGroups: " + getReplicationSubnetGroups());
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
                + ((getReplicationSubnetGroups() == null) ? 0 : getReplicationSubnetGroups()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReplicationSubnetGroupsResult == false)
            return false;
        DescribeReplicationSubnetGroupsResult other = (DescribeReplicationSubnetGroupsResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReplicationSubnetGroups() == null ^ this.getReplicationSubnetGroups() == null)
            return false;
        if (other.getReplicationSubnetGroups() != null
                && other.getReplicationSubnetGroups().equals(this.getReplicationSubnetGroups()) == false)
            return false;
        return true;
    }
}
