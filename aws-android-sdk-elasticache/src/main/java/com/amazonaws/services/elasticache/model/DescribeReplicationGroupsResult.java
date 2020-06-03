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
 * Represents the output of a <code>DescribeReplicationGroups</code> operation.
 * </p>
 */
public class DescribeReplicationGroupsResult implements Serializable {
    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of replication groups. Each item in the list contains detailed
     * information about one replication group.
     * </p>
     */
    private java.util.List<ReplicationGroup> replicationGroups;

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
    public DescribeReplicationGroupsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A list of replication groups. Each item in the list contains detailed
     * information about one replication group.
     * </p>
     *
     * @return <p>
     *         A list of replication groups. Each item in the list contains
     *         detailed information about one replication group.
     *         </p>
     */
    public java.util.List<ReplicationGroup> getReplicationGroups() {
        return replicationGroups;
    }

    /**
     * <p>
     * A list of replication groups. Each item in the list contains detailed
     * information about one replication group.
     * </p>
     *
     * @param replicationGroups <p>
     *            A list of replication groups. Each item in the list contains
     *            detailed information about one replication group.
     *            </p>
     */
    public void setReplicationGroups(java.util.Collection<ReplicationGroup> replicationGroups) {
        if (replicationGroups == null) {
            this.replicationGroups = null;
            return;
        }

        this.replicationGroups = new java.util.ArrayList<ReplicationGroup>(replicationGroups);
    }

    /**
     * <p>
     * A list of replication groups. Each item in the list contains detailed
     * information about one replication group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroups <p>
     *            A list of replication groups. Each item in the list contains
     *            detailed information about one replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReplicationGroupsResult withReplicationGroups(
            ReplicationGroup... replicationGroups) {
        if (getReplicationGroups() == null) {
            this.replicationGroups = new java.util.ArrayList<ReplicationGroup>(
                    replicationGroups.length);
        }
        for (ReplicationGroup value : replicationGroups) {
            this.replicationGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of replication groups. Each item in the list contains detailed
     * information about one replication group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroups <p>
     *            A list of replication groups. Each item in the list contains
     *            detailed information about one replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReplicationGroupsResult withReplicationGroups(
            java.util.Collection<ReplicationGroup> replicationGroups) {
        setReplicationGroups(replicationGroups);
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
        if (getReplicationGroups() != null)
            sb.append("ReplicationGroups: " + getReplicationGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getReplicationGroups() == null) ? 0 : getReplicationGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReplicationGroupsResult == false)
            return false;
        DescribeReplicationGroupsResult other = (DescribeReplicationGroupsResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReplicationGroups() == null ^ this.getReplicationGroups() == null)
            return false;
        if (other.getReplicationGroups() != null
                && other.getReplicationGroups().equals(this.getReplicationGroups()) == false)
            return false;
        return true;
    }
}
