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

package com.amazonaws.services.awsstoragegateway.model;

import java.io.Serializable;

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 */
public class CreateSnapshotResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume of which the snapshot was
     * taken.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String volumeARN;

    /**
     * <p>
     * The snapshot ID that is used to refer to the snapshot in future
     * operations such as describing snapshots (Amazon Elastic Compute Cloud API
     * <code>DescribeSnapshots</code>) or creating a volume from a snapshot
     * (<a>CreateStorediSCSIVolume</a>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-([0-9A-Fa-f]{8}|[0-9A-Fa-f]{17})\z<br/>
     */
    private String snapshotId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume of which the snapshot was
     * taken.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the volume of which the
     *         snapshot was taken.
     *         </p>
     */
    public String getVolumeARN() {
        return volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume of which the snapshot was
     * taken.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The Amazon Resource Name (ARN) of the volume of which the
     *            snapshot was taken.
     *            </p>
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume of which the snapshot was
     * taken.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The Amazon Resource Name (ARN) of the volume of which the
     *            snapshot was taken.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotResult withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
        return this;
    }

    /**
     * <p>
     * The snapshot ID that is used to refer to the snapshot in future
     * operations such as describing snapshots (Amazon Elastic Compute Cloud API
     * <code>DescribeSnapshots</code>) or creating a volume from a snapshot
     * (<a>CreateStorediSCSIVolume</a>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-([0-9A-Fa-f]{8}|[0-9A-Fa-f]{17})\z<br/>
     *
     * @return <p>
     *         The snapshot ID that is used to refer to the snapshot in future
     *         operations such as describing snapshots (Amazon Elastic Compute
     *         Cloud API <code>DescribeSnapshots</code>) or creating a volume
     *         from a snapshot (<a>CreateStorediSCSIVolume</a>).
     *         </p>
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * <p>
     * The snapshot ID that is used to refer to the snapshot in future
     * operations such as describing snapshots (Amazon Elastic Compute Cloud API
     * <code>DescribeSnapshots</code>) or creating a volume from a snapshot
     * (<a>CreateStorediSCSIVolume</a>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-([0-9A-Fa-f]{8}|[0-9A-Fa-f]{17})\z<br/>
     *
     * @param snapshotId <p>
     *            The snapshot ID that is used to refer to the snapshot in
     *            future operations such as describing snapshots (Amazon Elastic
     *            Compute Cloud API <code>DescribeSnapshots</code>) or creating
     *            a volume from a snapshot (<a>CreateStorediSCSIVolume</a>).
     *            </p>
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The snapshot ID that is used to refer to the snapshot in future
     * operations such as describing snapshots (Amazon Elastic Compute Cloud API
     * <code>DescribeSnapshots</code>) or creating a volume from a snapshot
     * (<a>CreateStorediSCSIVolume</a>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-([0-9A-Fa-f]{8}|[0-9A-Fa-f]{17})\z<br/>
     *
     * @param snapshotId <p>
     *            The snapshot ID that is used to refer to the snapshot in
     *            future operations such as describing snapshots (Amazon Elastic
     *            Compute Cloud API <code>DescribeSnapshots</code>) or creating
     *            a volume from a snapshot (<a>CreateStorediSCSIVolume</a>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotResult withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
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
        if (getVolumeARN() != null)
            sb.append("VolumeARN: " + getVolumeARN() + ",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotResult == false)
            return false;
        CreateSnapshotResult other = (CreateSnapshotResult) obj;

        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null
                && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null
                && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        return true;
    }
}
