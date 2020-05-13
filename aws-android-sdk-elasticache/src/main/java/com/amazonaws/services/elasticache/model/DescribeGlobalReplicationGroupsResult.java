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

public class DescribeGlobalReplicationGroupsResult implements Serializable {
    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by MaxRecords. &gt;
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Indicates the slot configuration and global identifier for each slice
     * group.
     * </p>
     */
    private java.util.List<GlobalReplicationGroup> globalReplicationGroups;

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by MaxRecords. &gt;
     * </p>
     *
     * @return <p>
     *         An optional marker returned from a prior request. Use this marker
     *         for pagination of results from this operation. If this parameter
     *         is specified, the response includes only records beyond the
     *         marker, up to the value specified by MaxRecords. &gt;
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by MaxRecords. &gt;
     * </p>
     *
     * @param marker <p>
     *            An optional marker returned from a prior request. Use this
     *            marker for pagination of results from this operation. If this
     *            parameter is specified, the response includes only records
     *            beyond the marker, up to the value specified by MaxRecords.
     *            &gt;
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by MaxRecords. &gt;
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional marker returned from a prior request. Use this
     *            marker for pagination of results from this operation. If this
     *            parameter is specified, the response includes only records
     *            beyond the marker, up to the value specified by MaxRecords.
     *            &gt;
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGlobalReplicationGroupsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * Indicates the slot configuration and global identifier for each slice
     * group.
     * </p>
     *
     * @return <p>
     *         Indicates the slot configuration and global identifier for each
     *         slice group.
     *         </p>
     */
    public java.util.List<GlobalReplicationGroup> getGlobalReplicationGroups() {
        return globalReplicationGroups;
    }

    /**
     * <p>
     * Indicates the slot configuration and global identifier for each slice
     * group.
     * </p>
     *
     * @param globalReplicationGroups <p>
     *            Indicates the slot configuration and global identifier for
     *            each slice group.
     *            </p>
     */
    public void setGlobalReplicationGroups(
            java.util.Collection<GlobalReplicationGroup> globalReplicationGroups) {
        if (globalReplicationGroups == null) {
            this.globalReplicationGroups = null;
            return;
        }

        this.globalReplicationGroups = new java.util.ArrayList<GlobalReplicationGroup>(
                globalReplicationGroups);
    }

    /**
     * <p>
     * Indicates the slot configuration and global identifier for each slice
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalReplicationGroups <p>
     *            Indicates the slot configuration and global identifier for
     *            each slice group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGlobalReplicationGroupsResult withGlobalReplicationGroups(
            GlobalReplicationGroup... globalReplicationGroups) {
        if (getGlobalReplicationGroups() == null) {
            this.globalReplicationGroups = new java.util.ArrayList<GlobalReplicationGroup>(
                    globalReplicationGroups.length);
        }
        for (GlobalReplicationGroup value : globalReplicationGroups) {
            this.globalReplicationGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Indicates the slot configuration and global identifier for each slice
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalReplicationGroups <p>
     *            Indicates the slot configuration and global identifier for
     *            each slice group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGlobalReplicationGroupsResult withGlobalReplicationGroups(
            java.util.Collection<GlobalReplicationGroup> globalReplicationGroups) {
        setGlobalReplicationGroups(globalReplicationGroups);
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
        if (getGlobalReplicationGroups() != null)
            sb.append("GlobalReplicationGroups: " + getGlobalReplicationGroups());
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
                + ((getGlobalReplicationGroups() == null) ? 0 : getGlobalReplicationGroups()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGlobalReplicationGroupsResult == false)
            return false;
        DescribeGlobalReplicationGroupsResult other = (DescribeGlobalReplicationGroupsResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getGlobalReplicationGroups() == null ^ this.getGlobalReplicationGroups() == null)
            return false;
        if (other.getGlobalReplicationGroups() != null
                && other.getGlobalReplicationGroups().equals(this.getGlobalReplicationGroups()) == false)
            return false;
        return true;
    }
}
