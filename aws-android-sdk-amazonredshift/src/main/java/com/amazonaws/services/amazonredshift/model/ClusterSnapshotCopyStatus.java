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

/**
 * <p>
 * Returns the destination region and retention period that are configured for
 * cross-region snapshot copy.
 * </p>
 */
public class ClusterSnapshotCopyStatus implements Serializable {
    /**
     * <p>
     * The destination region that snapshots are automatically copied to when
     * cross-region snapshot copy is enabled.
     * </p>
     */
    private String destinationRegion;

    /**
     * <p>
     * The number of days that automated snapshots are retained in the
     * destination region after they are copied from a source region.
     * </p>
     */
    private Long retentionPeriod;

    /**
     * <p>
     * The number of days that automated snapshots are retained in the
     * destination region after they are copied from a source region. If the
     * value is -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     */
    private Integer manualSnapshotRetentionPeriod;

    /**
     * <p>
     * The name of the snapshot copy grant.
     * </p>
     */
    private String snapshotCopyGrantName;

    /**
     * <p>
     * The destination region that snapshots are automatically copied to when
     * cross-region snapshot copy is enabled.
     * </p>
     *
     * @return <p>
     *         The destination region that snapshots are automatically copied to
     *         when cross-region snapshot copy is enabled.
     *         </p>
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    /**
     * <p>
     * The destination region that snapshots are automatically copied to when
     * cross-region snapshot copy is enabled.
     * </p>
     *
     * @param destinationRegion <p>
     *            The destination region that snapshots are automatically copied
     *            to when cross-region snapshot copy is enabled.
     *            </p>
     */
    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    /**
     * <p>
     * The destination region that snapshots are automatically copied to when
     * cross-region snapshot copy is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationRegion <p>
     *            The destination region that snapshots are automatically copied
     *            to when cross-region snapshot copy is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSnapshotCopyStatus withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /**
     * <p>
     * The number of days that automated snapshots are retained in the
     * destination region after they are copied from a source region.
     * </p>
     *
     * @return <p>
     *         The number of days that automated snapshots are retained in the
     *         destination region after they are copied from a source region.
     *         </p>
     */
    public Long getRetentionPeriod() {
        return retentionPeriod;
    }

    /**
     * <p>
     * The number of days that automated snapshots are retained in the
     * destination region after they are copied from a source region.
     * </p>
     *
     * @param retentionPeriod <p>
     *            The number of days that automated snapshots are retained in
     *            the destination region after they are copied from a source
     *            region.
     *            </p>
     */
    public void setRetentionPeriod(Long retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * The number of days that automated snapshots are retained in the
     * destination region after they are copied from a source region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param retentionPeriod <p>
     *            The number of days that automated snapshots are retained in
     *            the destination region after they are copied from a source
     *            region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSnapshotCopyStatus withRetentionPeriod(Long retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
        return this;
    }

    /**
     * <p>
     * The number of days that automated snapshots are retained in the
     * destination region after they are copied from a source region. If the
     * value is -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     *
     * @return <p>
     *         The number of days that automated snapshots are retained in the
     *         destination region after they are copied from a source region. If
     *         the value is -1, the manual snapshot is retained indefinitely.
     *         </p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     *         </p>
     */
    public Integer getManualSnapshotRetentionPeriod() {
        return manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that automated snapshots are retained in the
     * destination region after they are copied from a source region. If the
     * value is -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     *
     * @param manualSnapshotRetentionPeriod <p>
     *            The number of days that automated snapshots are retained in
     *            the destination region after they are copied from a source
     *            region. If the value is -1, the manual snapshot is retained
     *            indefinitely.
     *            </p>
     *            <p>
     *            The value must be either -1 or an integer between 1 and 3,653.
     *            </p>
     */
    public void setManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        this.manualSnapshotRetentionPeriod = manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that automated snapshots are retained in the
     * destination region after they are copied from a source region. If the
     * value is -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param manualSnapshotRetentionPeriod <p>
     *            The number of days that automated snapshots are retained in
     *            the destination region after they are copied from a source
     *            region. If the value is -1, the manual snapshot is retained
     *            indefinitely.
     *            </p>
     *            <p>
     *            The value must be either -1 or an integer between 1 and 3,653.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSnapshotCopyStatus withManualSnapshotRetentionPeriod(
            Integer manualSnapshotRetentionPeriod) {
        this.manualSnapshotRetentionPeriod = manualSnapshotRetentionPeriod;
        return this;
    }

    /**
     * <p>
     * The name of the snapshot copy grant.
     * </p>
     *
     * @return <p>
     *         The name of the snapshot copy grant.
     *         </p>
     */
    public String getSnapshotCopyGrantName() {
        return snapshotCopyGrantName;
    }

    /**
     * <p>
     * The name of the snapshot copy grant.
     * </p>
     *
     * @param snapshotCopyGrantName <p>
     *            The name of the snapshot copy grant.
     *            </p>
     */
    public void setSnapshotCopyGrantName(String snapshotCopyGrantName) {
        this.snapshotCopyGrantName = snapshotCopyGrantName;
    }

    /**
     * <p>
     * The name of the snapshot copy grant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotCopyGrantName <p>
     *            The name of the snapshot copy grant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSnapshotCopyStatus withSnapshotCopyGrantName(String snapshotCopyGrantName) {
        this.snapshotCopyGrantName = snapshotCopyGrantName;
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
        if (getDestinationRegion() != null)
            sb.append("DestinationRegion: " + getDestinationRegion() + ",");
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: " + getRetentionPeriod() + ",");
        if (getManualSnapshotRetentionPeriod() != null)
            sb.append("ManualSnapshotRetentionPeriod: " + getManualSnapshotRetentionPeriod() + ",");
        if (getSnapshotCopyGrantName() != null)
            sb.append("SnapshotCopyGrantName: " + getSnapshotCopyGrantName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestinationRegion() == null) ? 0 : getDestinationRegion().hashCode());
        hashCode = prime * hashCode
                + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime
                * hashCode
                + ((getManualSnapshotRetentionPeriod() == null) ? 0
                        : getManualSnapshotRetentionPeriod().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotCopyGrantName() == null) ? 0 : getSnapshotCopyGrantName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterSnapshotCopyStatus == false)
            return false;
        ClusterSnapshotCopyStatus other = (ClusterSnapshotCopyStatus) obj;

        if (other.getDestinationRegion() == null ^ this.getDestinationRegion() == null)
            return false;
        if (other.getDestinationRegion() != null
                && other.getDestinationRegion().equals(this.getDestinationRegion()) == false)
            return false;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null
                && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        if (other.getManualSnapshotRetentionPeriod() == null
                ^ this.getManualSnapshotRetentionPeriod() == null)
            return false;
        if (other.getManualSnapshotRetentionPeriod() != null
                && other.getManualSnapshotRetentionPeriod().equals(
                        this.getManualSnapshotRetentionPeriod()) == false)
            return false;
        if (other.getSnapshotCopyGrantName() == null ^ this.getSnapshotCopyGrantName() == null)
            return false;
        if (other.getSnapshotCopyGrantName() != null
                && other.getSnapshotCopyGrantName().equals(this.getSnapshotCopyGrantName()) == false)
            return false;
        return true;
    }
}
