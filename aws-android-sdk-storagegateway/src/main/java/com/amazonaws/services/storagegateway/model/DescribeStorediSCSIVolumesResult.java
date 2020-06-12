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

public class DescribeStorediSCSIVolumesResult implements Serializable {
    /**
     * <p>
     * Describes a single unit of output from <a>DescribeStorediSCSIVolumes</a>.
     * The following fields are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChapEnabled</code>: Indicates whether mutual CHAP is enabled for
     * the iSCSI target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LunNumber</code>: The logical disk number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetworkInterfaceId</code>: The network interface ID of the stored
     * volume that initiator use to map the stored volume as an iSCSI target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetworkInterfacePort</code>: The port used to communicate with
     * iSCSI targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreservedExistingData</code>: Indicates when the stored volume was
     * created, existing data on the underlying local disk was preserved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceSnapshotId</code>: If the stored volume was created from a
     * snapshot, this field contains the snapshot ID used, e.g.
     * <code>snap-1122aabb</code>. Otherwise, this field is not included.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StorediSCSIVolumes</code>: An array of StorediSCSIVolume objects
     * where each object contains metadata about one stored volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetARN</code>: The Amazon Resource Name (ARN) of the volume
     * target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeARN</code>: The Amazon Resource Name (ARN) of the stored
     * volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeDiskId</code>: The disk ID of the local disk that was
     * specified in the <a>CreateStorediSCSIVolume</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeId</code>: The unique identifier of the storage volume, e.g.
     * <code>vol-1122AABB</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeiSCSIAttributes</code>: An <a>VolumeiSCSIAttributes</a>
     * object that represents a collection of iSCSI attributes for one stored
     * volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeProgress</code>: Represents the percentage complete if the
     * volume is restoring or bootstrapping that represents the percent of data
     * transferred. This field does not appear in the response if the stored
     * volume is not restoring or bootstrapping.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeSizeInBytes</code>: The size of the volume in bytes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeStatus</code>: One of the <code>VolumeStatus</code> values
     * that indicates the state of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeType</code>: One of the enumeration values describing the
     * type of the volume. Currently, only <code>STORED</code> volumes are
     * supported.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<StorediSCSIVolume> storediSCSIVolumes;

    /**
     * <p>
     * Describes a single unit of output from <a>DescribeStorediSCSIVolumes</a>.
     * The following fields are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChapEnabled</code>: Indicates whether mutual CHAP is enabled for
     * the iSCSI target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LunNumber</code>: The logical disk number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetworkInterfaceId</code>: The network interface ID of the stored
     * volume that initiator use to map the stored volume as an iSCSI target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetworkInterfacePort</code>: The port used to communicate with
     * iSCSI targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreservedExistingData</code>: Indicates when the stored volume was
     * created, existing data on the underlying local disk was preserved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceSnapshotId</code>: If the stored volume was created from a
     * snapshot, this field contains the snapshot ID used, e.g.
     * <code>snap-1122aabb</code>. Otherwise, this field is not included.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StorediSCSIVolumes</code>: An array of StorediSCSIVolume objects
     * where each object contains metadata about one stored volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetARN</code>: The Amazon Resource Name (ARN) of the volume
     * target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeARN</code>: The Amazon Resource Name (ARN) of the stored
     * volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeDiskId</code>: The disk ID of the local disk that was
     * specified in the <a>CreateStorediSCSIVolume</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeId</code>: The unique identifier of the storage volume, e.g.
     * <code>vol-1122AABB</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeiSCSIAttributes</code>: An <a>VolumeiSCSIAttributes</a>
     * object that represents a collection of iSCSI attributes for one stored
     * volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeProgress</code>: Represents the percentage complete if the
     * volume is restoring or bootstrapping that represents the percent of data
     * transferred. This field does not appear in the response if the stored
     * volume is not restoring or bootstrapping.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeSizeInBytes</code>: The size of the volume in bytes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeStatus</code>: One of the <code>VolumeStatus</code> values
     * that indicates the state of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeType</code>: One of the enumeration values describing the
     * type of the volume. Currently, only <code>STORED</code> volumes are
     * supported.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Describes a single unit of output from
     *         <a>DescribeStorediSCSIVolumes</a>. The following fields are
     *         returned:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ChapEnabled</code>: Indicates whether mutual CHAP is
     *         enabled for the iSCSI target.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LunNumber</code>: The logical disk number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NetworkInterfaceId</code>: The network interface ID of the
     *         stored volume that initiator use to map the stored volume as an
     *         iSCSI target.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NetworkInterfacePort</code>: The port used to communicate
     *         with iSCSI targets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PreservedExistingData</code>: Indicates when the stored
     *         volume was created, existing data on the underlying local disk
     *         was preserved.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SourceSnapshotId</code>: If the stored volume was created
     *         from a snapshot, this field contains the snapshot ID used, e.g.
     *         <code>snap-1122aabb</code>. Otherwise, this field is not
     *         included.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>StorediSCSIVolumes</code>: An array of StorediSCSIVolume
     *         objects where each object contains metadata about one stored
     *         volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TargetARN</code>: The Amazon Resource Name (ARN) of the
     *         volume target.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VolumeARN</code>: The Amazon Resource Name (ARN) of the
     *         stored volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VolumeDiskId</code>: The disk ID of the local disk that was
     *         specified in the <a>CreateStorediSCSIVolume</a> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VolumeId</code>: The unique identifier of the storage
     *         volume, e.g. <code>vol-1122AABB</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VolumeiSCSIAttributes</code>: An
     *         <a>VolumeiSCSIAttributes</a> object that represents a collection
     *         of iSCSI attributes for one stored volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VolumeProgress</code>: Represents the percentage complete
     *         if the volume is restoring or bootstrapping that represents the
     *         percent of data transferred. This field does not appear in the
     *         response if the stored volume is not restoring or bootstrapping.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VolumeSizeInBytes</code>: The size of the volume in bytes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VolumeStatus</code>: One of the <code>VolumeStatus</code>
     *         values that indicates the state of the volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VolumeType</code>: One of the enumeration values describing
     *         the type of the volume. Currently, only <code>STORED</code>
     *         volumes are supported.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<StorediSCSIVolume> getStorediSCSIVolumes() {
        return storediSCSIVolumes;
    }

    /**
     * <p>
     * Describes a single unit of output from <a>DescribeStorediSCSIVolumes</a>.
     * The following fields are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChapEnabled</code>: Indicates whether mutual CHAP is enabled for
     * the iSCSI target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LunNumber</code>: The logical disk number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetworkInterfaceId</code>: The network interface ID of the stored
     * volume that initiator use to map the stored volume as an iSCSI target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetworkInterfacePort</code>: The port used to communicate with
     * iSCSI targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreservedExistingData</code>: Indicates when the stored volume was
     * created, existing data on the underlying local disk was preserved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceSnapshotId</code>: If the stored volume was created from a
     * snapshot, this field contains the snapshot ID used, e.g.
     * <code>snap-1122aabb</code>. Otherwise, this field is not included.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StorediSCSIVolumes</code>: An array of StorediSCSIVolume objects
     * where each object contains metadata about one stored volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetARN</code>: The Amazon Resource Name (ARN) of the volume
     * target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeARN</code>: The Amazon Resource Name (ARN) of the stored
     * volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeDiskId</code>: The disk ID of the local disk that was
     * specified in the <a>CreateStorediSCSIVolume</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeId</code>: The unique identifier of the storage volume, e.g.
     * <code>vol-1122AABB</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeiSCSIAttributes</code>: An <a>VolumeiSCSIAttributes</a>
     * object that represents a collection of iSCSI attributes for one stored
     * volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeProgress</code>: Represents the percentage complete if the
     * volume is restoring or bootstrapping that represents the percent of data
     * transferred. This field does not appear in the response if the stored
     * volume is not restoring or bootstrapping.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeSizeInBytes</code>: The size of the volume in bytes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeStatus</code>: One of the <code>VolumeStatus</code> values
     * that indicates the state of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeType</code>: One of the enumeration values describing the
     * type of the volume. Currently, only <code>STORED</code> volumes are
     * supported.
     * </p>
     * </li>
     * </ul>
     *
     * @param storediSCSIVolumes <p>
     *            Describes a single unit of output from
     *            <a>DescribeStorediSCSIVolumes</a>. The following fields are
     *            returned:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ChapEnabled</code>: Indicates whether mutual CHAP is
     *            enabled for the iSCSI target.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LunNumber</code>: The logical disk number.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NetworkInterfaceId</code>: The network interface ID of
     *            the stored volume that initiator use to map the stored volume
     *            as an iSCSI target.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NetworkInterfacePort</code>: The port used to
     *            communicate with iSCSI targets.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PreservedExistingData</code>: Indicates when the stored
     *            volume was created, existing data on the underlying local disk
     *            was preserved.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SourceSnapshotId</code>: If the stored volume was
     *            created from a snapshot, this field contains the snapshot ID
     *            used, e.g. <code>snap-1122aabb</code>. Otherwise, this field
     *            is not included.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>StorediSCSIVolumes</code>: An array of StorediSCSIVolume
     *            objects where each object contains metadata about one stored
     *            volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TargetARN</code>: The Amazon Resource Name (ARN) of the
     *            volume target.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeARN</code>: The Amazon Resource Name (ARN) of the
     *            stored volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeDiskId</code>: The disk ID of the local disk that
     *            was specified in the <a>CreateStorediSCSIVolume</a> operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeId</code>: The unique identifier of the storage
     *            volume, e.g. <code>vol-1122AABB</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeiSCSIAttributes</code>: An
     *            <a>VolumeiSCSIAttributes</a> object that represents a
     *            collection of iSCSI attributes for one stored volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeProgress</code>: Represents the percentage
     *            complete if the volume is restoring or bootstrapping that
     *            represents the percent of data transferred. This field does
     *            not appear in the response if the stored volume is not
     *            restoring or bootstrapping.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeSizeInBytes</code>: The size of the volume in
     *            bytes.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeStatus</code>: One of the
     *            <code>VolumeStatus</code> values that indicates the state of
     *            the volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeType</code>: One of the enumeration values
     *            describing the type of the volume. Currently, only
     *            <code>STORED</code> volumes are supported.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStorediSCSIVolumes(java.util.Collection<StorediSCSIVolume> storediSCSIVolumes) {
        if (storediSCSIVolumes == null) {
            this.storediSCSIVolumes = null;
            return;
        }

        this.storediSCSIVolumes = new java.util.ArrayList<StorediSCSIVolume>(storediSCSIVolumes);
    }

    /**
     * <p>
     * Describes a single unit of output from <a>DescribeStorediSCSIVolumes</a>.
     * The following fields are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChapEnabled</code>: Indicates whether mutual CHAP is enabled for
     * the iSCSI target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LunNumber</code>: The logical disk number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetworkInterfaceId</code>: The network interface ID of the stored
     * volume that initiator use to map the stored volume as an iSCSI target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetworkInterfacePort</code>: The port used to communicate with
     * iSCSI targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreservedExistingData</code>: Indicates when the stored volume was
     * created, existing data on the underlying local disk was preserved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceSnapshotId</code>: If the stored volume was created from a
     * snapshot, this field contains the snapshot ID used, e.g.
     * <code>snap-1122aabb</code>. Otherwise, this field is not included.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StorediSCSIVolumes</code>: An array of StorediSCSIVolume objects
     * where each object contains metadata about one stored volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetARN</code>: The Amazon Resource Name (ARN) of the volume
     * target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeARN</code>: The Amazon Resource Name (ARN) of the stored
     * volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeDiskId</code>: The disk ID of the local disk that was
     * specified in the <a>CreateStorediSCSIVolume</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeId</code>: The unique identifier of the storage volume, e.g.
     * <code>vol-1122AABB</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeiSCSIAttributes</code>: An <a>VolumeiSCSIAttributes</a>
     * object that represents a collection of iSCSI attributes for one stored
     * volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeProgress</code>: Represents the percentage complete if the
     * volume is restoring or bootstrapping that represents the percent of data
     * transferred. This field does not appear in the response if the stored
     * volume is not restoring or bootstrapping.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeSizeInBytes</code>: The size of the volume in bytes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeStatus</code>: One of the <code>VolumeStatus</code> values
     * that indicates the state of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeType</code>: One of the enumeration values describing the
     * type of the volume. Currently, only <code>STORED</code> volumes are
     * supported.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storediSCSIVolumes <p>
     *            Describes a single unit of output from
     *            <a>DescribeStorediSCSIVolumes</a>. The following fields are
     *            returned:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ChapEnabled</code>: Indicates whether mutual CHAP is
     *            enabled for the iSCSI target.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LunNumber</code>: The logical disk number.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NetworkInterfaceId</code>: The network interface ID of
     *            the stored volume that initiator use to map the stored volume
     *            as an iSCSI target.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NetworkInterfacePort</code>: The port used to
     *            communicate with iSCSI targets.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PreservedExistingData</code>: Indicates when the stored
     *            volume was created, existing data on the underlying local disk
     *            was preserved.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SourceSnapshotId</code>: If the stored volume was
     *            created from a snapshot, this field contains the snapshot ID
     *            used, e.g. <code>snap-1122aabb</code>. Otherwise, this field
     *            is not included.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>StorediSCSIVolumes</code>: An array of StorediSCSIVolume
     *            objects where each object contains metadata about one stored
     *            volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TargetARN</code>: The Amazon Resource Name (ARN) of the
     *            volume target.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeARN</code>: The Amazon Resource Name (ARN) of the
     *            stored volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeDiskId</code>: The disk ID of the local disk that
     *            was specified in the <a>CreateStorediSCSIVolume</a> operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeId</code>: The unique identifier of the storage
     *            volume, e.g. <code>vol-1122AABB</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeiSCSIAttributes</code>: An
     *            <a>VolumeiSCSIAttributes</a> object that represents a
     *            collection of iSCSI attributes for one stored volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeProgress</code>: Represents the percentage
     *            complete if the volume is restoring or bootstrapping that
     *            represents the percent of data transferred. This field does
     *            not appear in the response if the stored volume is not
     *            restoring or bootstrapping.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeSizeInBytes</code>: The size of the volume in
     *            bytes.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeStatus</code>: One of the
     *            <code>VolumeStatus</code> values that indicates the state of
     *            the volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeType</code>: One of the enumeration values
     *            describing the type of the volume. Currently, only
     *            <code>STORED</code> volumes are supported.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStorediSCSIVolumesResult withStorediSCSIVolumes(
            StorediSCSIVolume... storediSCSIVolumes) {
        if (getStorediSCSIVolumes() == null) {
            this.storediSCSIVolumes = new java.util.ArrayList<StorediSCSIVolume>(
                    storediSCSIVolumes.length);
        }
        for (StorediSCSIVolume value : storediSCSIVolumes) {
            this.storediSCSIVolumes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Describes a single unit of output from <a>DescribeStorediSCSIVolumes</a>.
     * The following fields are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChapEnabled</code>: Indicates whether mutual CHAP is enabled for
     * the iSCSI target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LunNumber</code>: The logical disk number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetworkInterfaceId</code>: The network interface ID of the stored
     * volume that initiator use to map the stored volume as an iSCSI target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetworkInterfacePort</code>: The port used to communicate with
     * iSCSI targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreservedExistingData</code>: Indicates when the stored volume was
     * created, existing data on the underlying local disk was preserved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceSnapshotId</code>: If the stored volume was created from a
     * snapshot, this field contains the snapshot ID used, e.g.
     * <code>snap-1122aabb</code>. Otherwise, this field is not included.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StorediSCSIVolumes</code>: An array of StorediSCSIVolume objects
     * where each object contains metadata about one stored volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetARN</code>: The Amazon Resource Name (ARN) of the volume
     * target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeARN</code>: The Amazon Resource Name (ARN) of the stored
     * volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeDiskId</code>: The disk ID of the local disk that was
     * specified in the <a>CreateStorediSCSIVolume</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeId</code>: The unique identifier of the storage volume, e.g.
     * <code>vol-1122AABB</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeiSCSIAttributes</code>: An <a>VolumeiSCSIAttributes</a>
     * object that represents a collection of iSCSI attributes for one stored
     * volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeProgress</code>: Represents the percentage complete if the
     * volume is restoring or bootstrapping that represents the percent of data
     * transferred. This field does not appear in the response if the stored
     * volume is not restoring or bootstrapping.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeSizeInBytes</code>: The size of the volume in bytes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeStatus</code>: One of the <code>VolumeStatus</code> values
     * that indicates the state of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VolumeType</code>: One of the enumeration values describing the
     * type of the volume. Currently, only <code>STORED</code> volumes are
     * supported.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storediSCSIVolumes <p>
     *            Describes a single unit of output from
     *            <a>DescribeStorediSCSIVolumes</a>. The following fields are
     *            returned:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ChapEnabled</code>: Indicates whether mutual CHAP is
     *            enabled for the iSCSI target.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LunNumber</code>: The logical disk number.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NetworkInterfaceId</code>: The network interface ID of
     *            the stored volume that initiator use to map the stored volume
     *            as an iSCSI target.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NetworkInterfacePort</code>: The port used to
     *            communicate with iSCSI targets.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PreservedExistingData</code>: Indicates when the stored
     *            volume was created, existing data on the underlying local disk
     *            was preserved.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SourceSnapshotId</code>: If the stored volume was
     *            created from a snapshot, this field contains the snapshot ID
     *            used, e.g. <code>snap-1122aabb</code>. Otherwise, this field
     *            is not included.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>StorediSCSIVolumes</code>: An array of StorediSCSIVolume
     *            objects where each object contains metadata about one stored
     *            volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TargetARN</code>: The Amazon Resource Name (ARN) of the
     *            volume target.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeARN</code>: The Amazon Resource Name (ARN) of the
     *            stored volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeDiskId</code>: The disk ID of the local disk that
     *            was specified in the <a>CreateStorediSCSIVolume</a> operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeId</code>: The unique identifier of the storage
     *            volume, e.g. <code>vol-1122AABB</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeiSCSIAttributes</code>: An
     *            <a>VolumeiSCSIAttributes</a> object that represents a
     *            collection of iSCSI attributes for one stored volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeProgress</code>: Represents the percentage
     *            complete if the volume is restoring or bootstrapping that
     *            represents the percent of data transferred. This field does
     *            not appear in the response if the stored volume is not
     *            restoring or bootstrapping.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeSizeInBytes</code>: The size of the volume in
     *            bytes.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeStatus</code>: One of the
     *            <code>VolumeStatus</code> values that indicates the state of
     *            the volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VolumeType</code>: One of the enumeration values
     *            describing the type of the volume. Currently, only
     *            <code>STORED</code> volumes are supported.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStorediSCSIVolumesResult withStorediSCSIVolumes(
            java.util.Collection<StorediSCSIVolume> storediSCSIVolumes) {
        setStorediSCSIVolumes(storediSCSIVolumes);
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
        if (getStorediSCSIVolumes() != null)
            sb.append("StorediSCSIVolumes: " + getStorediSCSIVolumes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStorediSCSIVolumes() == null) ? 0 : getStorediSCSIVolumes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStorediSCSIVolumesResult == false)
            return false;
        DescribeStorediSCSIVolumesResult other = (DescribeStorediSCSIVolumesResult) obj;

        if (other.getStorediSCSIVolumes() == null ^ this.getStorediSCSIVolumes() == null)
            return false;
        if (other.getStorediSCSIVolumes() != null
                && other.getStorediSCSIVolumes().equals(this.getStorediSCSIVolumes()) == false)
            return false;
        return true;
    }
}
