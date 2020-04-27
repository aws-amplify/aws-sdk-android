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

public class DescribeReplicationInstanceTaskLogsResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     */
    private String replicationInstanceArn;

    /**
     * <p>
     * An array of replication task log metadata. Each member of the array
     * contains the replication task name, ARN, and task log size (in bytes).
     * </p>
     */
    private java.util.List<ReplicationInstanceTaskLog> replicationInstanceTaskLogs;

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
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the replication instance.
     *         </p>
     */
    public String getReplicationInstanceArn() {
        return replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     *
     * @param replicationInstanceArn <p>
     *            The Amazon Resource Name (ARN) of the replication instance.
     *            </p>
     */
    public void setReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstanceArn <p>
     *            The Amazon Resource Name (ARN) of the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReplicationInstanceTaskLogsResult withReplicationInstanceArn(
            String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
        return this;
    }

    /**
     * <p>
     * An array of replication task log metadata. Each member of the array
     * contains the replication task name, ARN, and task log size (in bytes).
     * </p>
     *
     * @return <p>
     *         An array of replication task log metadata. Each member of the
     *         array contains the replication task name, ARN, and task log size
     *         (in bytes).
     *         </p>
     */
    public java.util.List<ReplicationInstanceTaskLog> getReplicationInstanceTaskLogs() {
        return replicationInstanceTaskLogs;
    }

    /**
     * <p>
     * An array of replication task log metadata. Each member of the array
     * contains the replication task name, ARN, and task log size (in bytes).
     * </p>
     *
     * @param replicationInstanceTaskLogs <p>
     *            An array of replication task log metadata. Each member of the
     *            array contains the replication task name, ARN, and task log
     *            size (in bytes).
     *            </p>
     */
    public void setReplicationInstanceTaskLogs(
            java.util.Collection<ReplicationInstanceTaskLog> replicationInstanceTaskLogs) {
        if (replicationInstanceTaskLogs == null) {
            this.replicationInstanceTaskLogs = null;
            return;
        }

        this.replicationInstanceTaskLogs = new java.util.ArrayList<ReplicationInstanceTaskLog>(
                replicationInstanceTaskLogs);
    }

    /**
     * <p>
     * An array of replication task log metadata. Each member of the array
     * contains the replication task name, ARN, and task log size (in bytes).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstanceTaskLogs <p>
     *            An array of replication task log metadata. Each member of the
     *            array contains the replication task name, ARN, and task log
     *            size (in bytes).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReplicationInstanceTaskLogsResult withReplicationInstanceTaskLogs(
            ReplicationInstanceTaskLog... replicationInstanceTaskLogs) {
        if (getReplicationInstanceTaskLogs() == null) {
            this.replicationInstanceTaskLogs = new java.util.ArrayList<ReplicationInstanceTaskLog>(
                    replicationInstanceTaskLogs.length);
        }
        for (ReplicationInstanceTaskLog value : replicationInstanceTaskLogs) {
            this.replicationInstanceTaskLogs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of replication task log metadata. Each member of the array
     * contains the replication task name, ARN, and task log size (in bytes).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstanceTaskLogs <p>
     *            An array of replication task log metadata. Each member of the
     *            array contains the replication task name, ARN, and task log
     *            size (in bytes).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReplicationInstanceTaskLogsResult withReplicationInstanceTaskLogs(
            java.util.Collection<ReplicationInstanceTaskLog> replicationInstanceTaskLogs) {
        setReplicationInstanceTaskLogs(replicationInstanceTaskLogs);
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
    public DescribeReplicationInstanceTaskLogsResult withMarker(String marker) {
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
        if (getReplicationInstanceArn() != null)
            sb.append("ReplicationInstanceArn: " + getReplicationInstanceArn() + ",");
        if (getReplicationInstanceTaskLogs() != null)
            sb.append("ReplicationInstanceTaskLogs: " + getReplicationInstanceTaskLogs() + ",");
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
                + ((getReplicationInstanceArn() == null) ? 0 : getReplicationInstanceArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstanceTaskLogs() == null) ? 0
                        : getReplicationInstanceTaskLogs().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReplicationInstanceTaskLogsResult == false)
            return false;
        DescribeReplicationInstanceTaskLogsResult other = (DescribeReplicationInstanceTaskLogsResult) obj;

        if (other.getReplicationInstanceArn() == null ^ this.getReplicationInstanceArn() == null)
            return false;
        if (other.getReplicationInstanceArn() != null
                && other.getReplicationInstanceArn().equals(this.getReplicationInstanceArn()) == false)
            return false;
        if (other.getReplicationInstanceTaskLogs() == null
                ^ this.getReplicationInstanceTaskLogs() == null)
            return false;
        if (other.getReplicationInstanceTaskLogs() != null
                && other.getReplicationInstanceTaskLogs().equals(
                        this.getReplicationInstanceTaskLogs()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
