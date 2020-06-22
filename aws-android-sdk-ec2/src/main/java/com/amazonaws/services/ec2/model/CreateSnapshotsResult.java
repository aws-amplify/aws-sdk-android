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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class CreateSnapshotsResult implements Serializable {
    /**
     * <p>
     * List of snapshots.
     * </p>
     */
    private java.util.List<SnapshotInfo> snapshots;

    /**
     * <p>
     * List of snapshots.
     * </p>
     *
     * @return <p>
     *         List of snapshots.
     *         </p>
     */
    public java.util.List<SnapshotInfo> getSnapshots() {
        return snapshots;
    }

    /**
     * <p>
     * List of snapshots.
     * </p>
     *
     * @param snapshots <p>
     *            List of snapshots.
     *            </p>
     */
    public void setSnapshots(java.util.Collection<SnapshotInfo> snapshots) {
        if (snapshots == null) {
            this.snapshots = null;
            return;
        }

        this.snapshots = new java.util.ArrayList<SnapshotInfo>(snapshots);
    }

    /**
     * <p>
     * List of snapshots.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshots <p>
     *            List of snapshots.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotsResult withSnapshots(SnapshotInfo... snapshots) {
        if (getSnapshots() == null) {
            this.snapshots = new java.util.ArrayList<SnapshotInfo>(snapshots.length);
        }
        for (SnapshotInfo value : snapshots) {
            this.snapshots.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of snapshots.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshots <p>
     *            List of snapshots.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotsResult withSnapshots(java.util.Collection<SnapshotInfo> snapshots) {
        setSnapshots(snapshots);
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
        if (getSnapshots() != null)
            sb.append("Snapshots: " + getSnapshots());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshots() == null) ? 0 : getSnapshots().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotsResult == false)
            return false;
        CreateSnapshotsResult other = (CreateSnapshotsResult) obj;

        if (other.getSnapshots() == null ^ this.getSnapshots() == null)
            return false;
        if (other.getSnapshots() != null
                && other.getSnapshots().equals(this.getSnapshots()) == false)
            return false;
        return true;
    }
}
