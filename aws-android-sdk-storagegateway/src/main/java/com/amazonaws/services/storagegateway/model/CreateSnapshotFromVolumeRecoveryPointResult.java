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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

public class CreateSnapshotFromVolumeRecoveryPointResult implements Serializable {
    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-([0-9A-Fa-f]{8}|[0-9A-Fa-f]{17})\z<br/>
     */
    private String snapshotId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the
     * <a>DescribeStorediSCSIVolumes</a> operation to return to retrieve the
     * TargetARN for specified VolumeARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String volumeARN;

    /**
     * <p>
     * The time the volume was created from the recovery point.
     * </p>
     */
    private String volumeRecoveryPointTime;

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-([0-9A-Fa-f]{8}|[0-9A-Fa-f]{17})\z<br/>
     *
     * @return <p>
     *         The ID of the snapshot.
     *         </p>
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-([0-9A-Fa-f]{8}|[0-9A-Fa-f]{17})\z<br/>
     *
     * @param snapshotId <p>
     *            The ID of the snapshot.
     *            </p>
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-([0-9A-Fa-f]{8}|[0-9A-Fa-f]{17})\z<br/>
     *
     * @param snapshotId <p>
     *            The ID of the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotFromVolumeRecoveryPointResult withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the
     * <a>DescribeStorediSCSIVolumes</a> operation to return to retrieve the
     * TargetARN for specified VolumeARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the iSCSI volume target. Use
     *         the <a>DescribeStorediSCSIVolumes</a> operation to return to
     *         retrieve the TargetARN for specified VolumeARN.
     *         </p>
     */
    public String getVolumeARN() {
        return volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the
     * <a>DescribeStorediSCSIVolumes</a> operation to return to retrieve the
     * TargetARN for specified VolumeARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The Amazon Resource Name (ARN) of the iSCSI volume target. Use
     *            the <a>DescribeStorediSCSIVolumes</a> operation to return to
     *            retrieve the TargetARN for specified VolumeARN.
     *            </p>
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the
     * <a>DescribeStorediSCSIVolumes</a> operation to return to retrieve the
     * TargetARN for specified VolumeARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The Amazon Resource Name (ARN) of the iSCSI volume target. Use
     *            the <a>DescribeStorediSCSIVolumes</a> operation to return to
     *            retrieve the TargetARN for specified VolumeARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotFromVolumeRecoveryPointResult withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
        return this;
    }

    /**
     * <p>
     * The time the volume was created from the recovery point.
     * </p>
     *
     * @return <p>
     *         The time the volume was created from the recovery point.
     *         </p>
     */
    public String getVolumeRecoveryPointTime() {
        return volumeRecoveryPointTime;
    }

    /**
     * <p>
     * The time the volume was created from the recovery point.
     * </p>
     *
     * @param volumeRecoveryPointTime <p>
     *            The time the volume was created from the recovery point.
     *            </p>
     */
    public void setVolumeRecoveryPointTime(String volumeRecoveryPointTime) {
        this.volumeRecoveryPointTime = volumeRecoveryPointTime;
    }

    /**
     * <p>
     * The time the volume was created from the recovery point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeRecoveryPointTime <p>
     *            The time the volume was created from the recovery point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotFromVolumeRecoveryPointResult withVolumeRecoveryPointTime(
            String volumeRecoveryPointTime) {
        this.volumeRecoveryPointTime = volumeRecoveryPointTime;
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
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getVolumeARN() != null)
            sb.append("VolumeARN: " + getVolumeARN() + ",");
        if (getVolumeRecoveryPointTime() != null)
            sb.append("VolumeRecoveryPointTime: " + getVolumeRecoveryPointTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getVolumeRecoveryPointTime() == null) ? 0 : getVolumeRecoveryPointTime()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotFromVolumeRecoveryPointResult == false)
            return false;
        CreateSnapshotFromVolumeRecoveryPointResult other = (CreateSnapshotFromVolumeRecoveryPointResult) obj;

        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null
                && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null
                && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        if (other.getVolumeRecoveryPointTime() == null ^ this.getVolumeRecoveryPointTime() == null)
            return false;
        if (other.getVolumeRecoveryPointTime() != null
                && other.getVolumeRecoveryPointTime().equals(this.getVolumeRecoveryPointTime()) == false)
            return false;
        return true;
    }
}
