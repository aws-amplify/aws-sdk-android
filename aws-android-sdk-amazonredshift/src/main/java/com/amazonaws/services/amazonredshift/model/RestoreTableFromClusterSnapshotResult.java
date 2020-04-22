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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

public class RestoreTableFromClusterSnapshotResult implements Serializable {
    /**
     * <p>
     * Describes the status of a <a>RestoreTableFromClusterSnapshot</a>
     * operation.
     * </p>
     */
    private TableRestoreStatus tableRestoreStatus;

    /**
     * <p>
     * Describes the status of a <a>RestoreTableFromClusterSnapshot</a>
     * operation.
     * </p>
     *
     * @return <p>
     *         Describes the status of a <a>RestoreTableFromClusterSnapshot</a>
     *         operation.
     *         </p>
     */
    public TableRestoreStatus getTableRestoreStatus() {
        return tableRestoreStatus;
    }

    /**
     * <p>
     * Describes the status of a <a>RestoreTableFromClusterSnapshot</a>
     * operation.
     * </p>
     *
     * @param tableRestoreStatus <p>
     *            Describes the status of a
     *            <a>RestoreTableFromClusterSnapshot</a> operation.
     *            </p>
     */
    public void setTableRestoreStatus(TableRestoreStatus tableRestoreStatus) {
        this.tableRestoreStatus = tableRestoreStatus;
    }

    /**
     * <p>
     * Describes the status of a <a>RestoreTableFromClusterSnapshot</a>
     * operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableRestoreStatus <p>
     *            Describes the status of a
     *            <a>RestoreTableFromClusterSnapshot</a> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableFromClusterSnapshotResult withTableRestoreStatus(
            TableRestoreStatus tableRestoreStatus) {
        this.tableRestoreStatus = tableRestoreStatus;
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
        if (getTableRestoreStatus() != null)
            sb.append("TableRestoreStatus: " + getTableRestoreStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTableRestoreStatus() == null) ? 0 : getTableRestoreStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreTableFromClusterSnapshotResult == false)
            return false;
        RestoreTableFromClusterSnapshotResult other = (RestoreTableFromClusterSnapshotResult) obj;

        if (other.getTableRestoreStatus() == null ^ this.getTableRestoreStatus() == null)
            return false;
        if (other.getTableRestoreStatus() != null
                && other.getTableRestoreStatus().equals(this.getTableRestoreStatus()) == false)
            return false;
        return true;
    }
}
