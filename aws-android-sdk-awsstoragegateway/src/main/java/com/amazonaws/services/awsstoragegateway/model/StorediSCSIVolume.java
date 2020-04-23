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
 * Describes an iSCSI stored volume.
 * </p>
 */
public class StorediSCSIVolume implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String volumeARN;

    /**
     * <p>
     * The unique identifier of the volume, e.g. vol-AE4B946D.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     */
    private String volumeId;

    /**
     * <p>
     * One of the VolumeType enumeration values describing the type of the
     * volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     */
    private String volumeType;

    /**
     * <p>
     * One of the VolumeStatus values that indicates the state of the storage
     * volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     */
    private String volumeStatus;

    /**
     * <p>
     * A value that indicates whether a storage volume is attached to, detached
     * from, or is in the process of detaching from a gateway. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-volumes.html#attach-detach-volume"
     * >Moving Your Volumes to a Different Gateway</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     */
    private String volumeAttachmentStatus;

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     */
    private Long volumeSizeInBytes;

    /**
     * <p>
     * Represents the percentage complete if the volume is restoring or
     * bootstrapping that represents the percent of data transferred. This field
     * does not appear in the response if the stored volume is not restoring or
     * bootstrapping.
     * </p>
     */
    private Double volumeProgress;

    /**
     * <p>
     * The ID of the local disk that was specified in the
     * <a>CreateStorediSCSIVolume</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String volumeDiskId;

    /**
     * <p>
     * If the stored volume was created from a snapshot, this field contains the
     * snapshot ID used, e.g. snap-78e22663. Otherwise, this field is not
     * included.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-([0-9A-Fa-f]{8}|[0-9A-Fa-f]{17})\z<br/>
     */
    private String sourceSnapshotId;

    /**
     * <p>
     * Indicates if when the stored volume was created, existing data on the
     * underlying local disk was preserved.
     * </p>
     * <p>
     * Valid Values: true, false
     * </p>
     */
    private Boolean preservedExistingData;

    /**
     * <p>
     * An <a>VolumeiSCSIAttributes</a> object that represents a collection of
     * iSCSI attributes for one stored volume.
     * </p>
     */
    private VolumeiSCSIAttributes volumeiSCSIAttributes;

    /**
     * <p>
     * The date the volume was created. Volumes created prior to March 28, 2017
     * don’t have this time stamp.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * The size of the data stored on the volume in bytes. This value is
     * calculated based on the number of blocks that are touched, instead of the
     * actual amount of data written. This value can be useful for sequential
     * write patterns but less accurate for random write patterns.
     * <code>VolumeUsedInBytes</code> is different from the compressed size of
     * the volume, which is the value that is used to calculate your bill.
     * </p>
     * <note>
     * <p>
     * This value is not available for volumes created prior to May 13, 2015,
     * until you store data on the volume.
     * </p>
     * </note>
     */
    private Long volumeUsedInBytes;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3
     * server-side encryption. This value can only be set when KMSEncrypted is
     * true. Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     */
    private String kMSKey;

    /**
     * <p>
     * The name of the iSCSI target used by an initiator to connect to a volume
     * and used as a suffix for the target ARN. For example, specifying
     * <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     * . The target name must be unique across all volumes on a gateway.
     * </p>
     * <p>
     * If you don't specify a value, Storage Gateway uses the value that was
     * previously used for this volume as the new target name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[-\.;a-z0-9]+$<br/>
     */
    private String targetName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the storage volume.
     *         </p>
     */
    public String getVolumeARN() {
        return volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The Amazon Resource Name (ARN) of the storage volume.
     *            </p>
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The Amazon Resource Name (ARN) of the storage volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorediSCSIVolume withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the volume, e.g. vol-AE4B946D.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @return <p>
     *         The unique identifier of the volume, e.g. vol-AE4B946D.
     *         </p>
     */
    public String getVolumeId() {
        return volumeId;
    }

    /**
     * <p>
     * The unique identifier of the volume, e.g. vol-AE4B946D.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param volumeId <p>
     *            The unique identifier of the volume, e.g. vol-AE4B946D.
     *            </p>
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The unique identifier of the volume, e.g. vol-AE4B946D.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param volumeId <p>
     *            The unique identifier of the volume, e.g. vol-AE4B946D.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorediSCSIVolume withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * <p>
     * One of the VolumeType enumeration values describing the type of the
     * volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     *
     * @return <p>
     *         One of the VolumeType enumeration values describing the type of
     *         the volume.
     *         </p>
     */
    public String getVolumeType() {
        return volumeType;
    }

    /**
     * <p>
     * One of the VolumeType enumeration values describing the type of the
     * volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     *
     * @param volumeType <p>
     *            One of the VolumeType enumeration values describing the type
     *            of the volume.
     *            </p>
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * One of the VolumeType enumeration values describing the type of the
     * volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     *
     * @param volumeType <p>
     *            One of the VolumeType enumeration values describing the type
     *            of the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorediSCSIVolume withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * <p>
     * One of the VolumeStatus values that indicates the state of the storage
     * volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @return <p>
     *         One of the VolumeStatus values that indicates the state of the
     *         storage volume.
     *         </p>
     */
    public String getVolumeStatus() {
        return volumeStatus;
    }

    /**
     * <p>
     * One of the VolumeStatus values that indicates the state of the storage
     * volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @param volumeStatus <p>
     *            One of the VolumeStatus values that indicates the state of the
     *            storage volume.
     *            </p>
     */
    public void setVolumeStatus(String volumeStatus) {
        this.volumeStatus = volumeStatus;
    }

    /**
     * <p>
     * One of the VolumeStatus values that indicates the state of the storage
     * volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @param volumeStatus <p>
     *            One of the VolumeStatus values that indicates the state of the
     *            storage volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorediSCSIVolume withVolumeStatus(String volumeStatus) {
        this.volumeStatus = volumeStatus;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether a storage volume is attached to, detached
     * from, or is in the process of detaching from a gateway. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-volumes.html#attach-detach-volume"
     * >Moving Your Volumes to a Different Gateway</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @return <p>
     *         A value that indicates whether a storage volume is attached to,
     *         detached from, or is in the process of detaching from a gateway.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-volumes.html#attach-detach-volume"
     *         >Moving Your Volumes to a Different Gateway</a>.
     *         </p>
     */
    public String getVolumeAttachmentStatus() {
        return volumeAttachmentStatus;
    }

    /**
     * <p>
     * A value that indicates whether a storage volume is attached to, detached
     * from, or is in the process of detaching from a gateway. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-volumes.html#attach-detach-volume"
     * >Moving Your Volumes to a Different Gateway</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @param volumeAttachmentStatus <p>
     *            A value that indicates whether a storage volume is attached
     *            to, detached from, or is in the process of detaching from a
     *            gateway. For more information, see <a href=
     *            "https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-volumes.html#attach-detach-volume"
     *            >Moving Your Volumes to a Different Gateway</a>.
     *            </p>
     */
    public void setVolumeAttachmentStatus(String volumeAttachmentStatus) {
        this.volumeAttachmentStatus = volumeAttachmentStatus;
    }

    /**
     * <p>
     * A value that indicates whether a storage volume is attached to, detached
     * from, or is in the process of detaching from a gateway. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-volumes.html#attach-detach-volume"
     * >Moving Your Volumes to a Different Gateway</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @param volumeAttachmentStatus <p>
     *            A value that indicates whether a storage volume is attached
     *            to, detached from, or is in the process of detaching from a
     *            gateway. For more information, see <a href=
     *            "https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-volumes.html#attach-detach-volume"
     *            >Moving Your Volumes to a Different Gateway</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorediSCSIVolume withVolumeAttachmentStatus(String volumeAttachmentStatus) {
        this.volumeAttachmentStatus = volumeAttachmentStatus;
        return this;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     *
     * @return <p>
     *         The size of the volume in bytes.
     *         </p>
     */
    public Long getVolumeSizeInBytes() {
        return volumeSizeInBytes;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     *
     * @param volumeSizeInBytes <p>
     *            The size of the volume in bytes.
     *            </p>
     */
    public void setVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeSizeInBytes <p>
     *            The size of the volume in bytes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorediSCSIVolume withVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
        return this;
    }

    /**
     * <p>
     * Represents the percentage complete if the volume is restoring or
     * bootstrapping that represents the percent of data transferred. This field
     * does not appear in the response if the stored volume is not restoring or
     * bootstrapping.
     * </p>
     *
     * @return <p>
     *         Represents the percentage complete if the volume is restoring or
     *         bootstrapping that represents the percent of data transferred.
     *         This field does not appear in the response if the stored volume
     *         is not restoring or bootstrapping.
     *         </p>
     */
    public Double getVolumeProgress() {
        return volumeProgress;
    }

    /**
     * <p>
     * Represents the percentage complete if the volume is restoring or
     * bootstrapping that represents the percent of data transferred. This field
     * does not appear in the response if the stored volume is not restoring or
     * bootstrapping.
     * </p>
     *
     * @param volumeProgress <p>
     *            Represents the percentage complete if the volume is restoring
     *            or bootstrapping that represents the percent of data
     *            transferred. This field does not appear in the response if the
     *            stored volume is not restoring or bootstrapping.
     *            </p>
     */
    public void setVolumeProgress(Double volumeProgress) {
        this.volumeProgress = volumeProgress;
    }

    /**
     * <p>
     * Represents the percentage complete if the volume is restoring or
     * bootstrapping that represents the percent of data transferred. This field
     * does not appear in the response if the stored volume is not restoring or
     * bootstrapping.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeProgress <p>
     *            Represents the percentage complete if the volume is restoring
     *            or bootstrapping that represents the percent of data
     *            transferred. This field does not appear in the response if the
     *            stored volume is not restoring or bootstrapping.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorediSCSIVolume withVolumeProgress(Double volumeProgress) {
        this.volumeProgress = volumeProgress;
        return this;
    }

    /**
     * <p>
     * The ID of the local disk that was specified in the
     * <a>CreateStorediSCSIVolume</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The ID of the local disk that was specified in the
     *         <a>CreateStorediSCSIVolume</a> operation.
     *         </p>
     */
    public String getVolumeDiskId() {
        return volumeDiskId;
    }

    /**
     * <p>
     * The ID of the local disk that was specified in the
     * <a>CreateStorediSCSIVolume</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param volumeDiskId <p>
     *            The ID of the local disk that was specified in the
     *            <a>CreateStorediSCSIVolume</a> operation.
     *            </p>
     */
    public void setVolumeDiskId(String volumeDiskId) {
        this.volumeDiskId = volumeDiskId;
    }

    /**
     * <p>
     * The ID of the local disk that was specified in the
     * <a>CreateStorediSCSIVolume</a> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param volumeDiskId <p>
     *            The ID of the local disk that was specified in the
     *            <a>CreateStorediSCSIVolume</a> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorediSCSIVolume withVolumeDiskId(String volumeDiskId) {
        this.volumeDiskId = volumeDiskId;
        return this;
    }

    /**
     * <p>
     * If the stored volume was created from a snapshot, this field contains the
     * snapshot ID used, e.g. snap-78e22663. Otherwise, this field is not
     * included.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-([0-9A-Fa-f]{8}|[0-9A-Fa-f]{17})\z<br/>
     *
     * @return <p>
     *         If the stored volume was created from a snapshot, this field
     *         contains the snapshot ID used, e.g. snap-78e22663. Otherwise,
     *         this field is not included.
     *         </p>
     */
    public String getSourceSnapshotId() {
        return sourceSnapshotId;
    }

    /**
     * <p>
     * If the stored volume was created from a snapshot, this field contains the
     * snapshot ID used, e.g. snap-78e22663. Otherwise, this field is not
     * included.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-([0-9A-Fa-f]{8}|[0-9A-Fa-f]{17})\z<br/>
     *
     * @param sourceSnapshotId <p>
     *            If the stored volume was created from a snapshot, this field
     *            contains the snapshot ID used, e.g. snap-78e22663. Otherwise,
     *            this field is not included.
     *            </p>
     */
    public void setSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
    }

    /**
     * <p>
     * If the stored volume was created from a snapshot, this field contains the
     * snapshot ID used, e.g. snap-78e22663. Otherwise, this field is not
     * included.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-([0-9A-Fa-f]{8}|[0-9A-Fa-f]{17})\z<br/>
     *
     * @param sourceSnapshotId <p>
     *            If the stored volume was created from a snapshot, this field
     *            contains the snapshot ID used, e.g. snap-78e22663. Otherwise,
     *            this field is not included.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorediSCSIVolume withSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
        return this;
    }

    /**
     * <p>
     * Indicates if when the stored volume was created, existing data on the
     * underlying local disk was preserved.
     * </p>
     * <p>
     * Valid Values: true, false
     * </p>
     *
     * @return <p>
     *         Indicates if when the stored volume was created, existing data on
     *         the underlying local disk was preserved.
     *         </p>
     *         <p>
     *         Valid Values: true, false
     *         </p>
     */
    public Boolean isPreservedExistingData() {
        return preservedExistingData;
    }

    /**
     * <p>
     * Indicates if when the stored volume was created, existing data on the
     * underlying local disk was preserved.
     * </p>
     * <p>
     * Valid Values: true, false
     * </p>
     *
     * @return <p>
     *         Indicates if when the stored volume was created, existing data on
     *         the underlying local disk was preserved.
     *         </p>
     *         <p>
     *         Valid Values: true, false
     *         </p>
     */
    public Boolean getPreservedExistingData() {
        return preservedExistingData;
    }

    /**
     * <p>
     * Indicates if when the stored volume was created, existing data on the
     * underlying local disk was preserved.
     * </p>
     * <p>
     * Valid Values: true, false
     * </p>
     *
     * @param preservedExistingData <p>
     *            Indicates if when the stored volume was created, existing data
     *            on the underlying local disk was preserved.
     *            </p>
     *            <p>
     *            Valid Values: true, false
     *            </p>
     */
    public void setPreservedExistingData(Boolean preservedExistingData) {
        this.preservedExistingData = preservedExistingData;
    }

    /**
     * <p>
     * Indicates if when the stored volume was created, existing data on the
     * underlying local disk was preserved.
     * </p>
     * <p>
     * Valid Values: true, false
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preservedExistingData <p>
     *            Indicates if when the stored volume was created, existing data
     *            on the underlying local disk was preserved.
     *            </p>
     *            <p>
     *            Valid Values: true, false
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorediSCSIVolume withPreservedExistingData(Boolean preservedExistingData) {
        this.preservedExistingData = preservedExistingData;
        return this;
    }

    /**
     * <p>
     * An <a>VolumeiSCSIAttributes</a> object that represents a collection of
     * iSCSI attributes for one stored volume.
     * </p>
     *
     * @return <p>
     *         An <a>VolumeiSCSIAttributes</a> object that represents a
     *         collection of iSCSI attributes for one stored volume.
     *         </p>
     */
    public VolumeiSCSIAttributes getVolumeiSCSIAttributes() {
        return volumeiSCSIAttributes;
    }

    /**
     * <p>
     * An <a>VolumeiSCSIAttributes</a> object that represents a collection of
     * iSCSI attributes for one stored volume.
     * </p>
     *
     * @param volumeiSCSIAttributes <p>
     *            An <a>VolumeiSCSIAttributes</a> object that represents a
     *            collection of iSCSI attributes for one stored volume.
     *            </p>
     */
    public void setVolumeiSCSIAttributes(VolumeiSCSIAttributes volumeiSCSIAttributes) {
        this.volumeiSCSIAttributes = volumeiSCSIAttributes;
    }

    /**
     * <p>
     * An <a>VolumeiSCSIAttributes</a> object that represents a collection of
     * iSCSI attributes for one stored volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeiSCSIAttributes <p>
     *            An <a>VolumeiSCSIAttributes</a> object that represents a
     *            collection of iSCSI attributes for one stored volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorediSCSIVolume withVolumeiSCSIAttributes(VolumeiSCSIAttributes volumeiSCSIAttributes) {
        this.volumeiSCSIAttributes = volumeiSCSIAttributes;
        return this;
    }

    /**
     * <p>
     * The date the volume was created. Volumes created prior to March 28, 2017
     * don’t have this time stamp.
     * </p>
     *
     * @return <p>
     *         The date the volume was created. Volumes created prior to March
     *         28, 2017 don’t have this time stamp.
     *         </p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>
     * The date the volume was created. Volumes created prior to March 28, 2017
     * don’t have this time stamp.
     * </p>
     *
     * @param createdDate <p>
     *            The date the volume was created. Volumes created prior to
     *            March 28, 2017 don’t have this time stamp.
     *            </p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date the volume was created. Volumes created prior to March 28, 2017
     * don’t have this time stamp.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdDate <p>
     *            The date the volume was created. Volumes created prior to
     *            March 28, 2017 don’t have this time stamp.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorediSCSIVolume withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * <p>
     * The size of the data stored on the volume in bytes. This value is
     * calculated based on the number of blocks that are touched, instead of the
     * actual amount of data written. This value can be useful for sequential
     * write patterns but less accurate for random write patterns.
     * <code>VolumeUsedInBytes</code> is different from the compressed size of
     * the volume, which is the value that is used to calculate your bill.
     * </p>
     * <note>
     * <p>
     * This value is not available for volumes created prior to May 13, 2015,
     * until you store data on the volume.
     * </p>
     * </note>
     *
     * @return <p>
     *         The size of the data stored on the volume in bytes. This value is
     *         calculated based on the number of blocks that are touched,
     *         instead of the actual amount of data written. This value can be
     *         useful for sequential write patterns but less accurate for random
     *         write patterns. <code>VolumeUsedInBytes</code> is different from
     *         the compressed size of the volume, which is the value that is
     *         used to calculate your bill.
     *         </p>
     *         <note>
     *         <p>
     *         This value is not available for volumes created prior to May 13,
     *         2015, until you store data on the volume.
     *         </p>
     *         </note>
     */
    public Long getVolumeUsedInBytes() {
        return volumeUsedInBytes;
    }

    /**
     * <p>
     * The size of the data stored on the volume in bytes. This value is
     * calculated based on the number of blocks that are touched, instead of the
     * actual amount of data written. This value can be useful for sequential
     * write patterns but less accurate for random write patterns.
     * <code>VolumeUsedInBytes</code> is different from the compressed size of
     * the volume, which is the value that is used to calculate your bill.
     * </p>
     * <note>
     * <p>
     * This value is not available for volumes created prior to May 13, 2015,
     * until you store data on the volume.
     * </p>
     * </note>
     *
     * @param volumeUsedInBytes <p>
     *            The size of the data stored on the volume in bytes. This value
     *            is calculated based on the number of blocks that are touched,
     *            instead of the actual amount of data written. This value can
     *            be useful for sequential write patterns but less accurate for
     *            random write patterns. <code>VolumeUsedInBytes</code> is
     *            different from the compressed size of the volume, which is the
     *            value that is used to calculate your bill.
     *            </p>
     *            <note>
     *            <p>
     *            This value is not available for volumes created prior to May
     *            13, 2015, until you store data on the volume.
     *            </p>
     *            </note>
     */
    public void setVolumeUsedInBytes(Long volumeUsedInBytes) {
        this.volumeUsedInBytes = volumeUsedInBytes;
    }

    /**
     * <p>
     * The size of the data stored on the volume in bytes. This value is
     * calculated based on the number of blocks that are touched, instead of the
     * actual amount of data written. This value can be useful for sequential
     * write patterns but less accurate for random write patterns.
     * <code>VolumeUsedInBytes</code> is different from the compressed size of
     * the volume, which is the value that is used to calculate your bill.
     * </p>
     * <note>
     * <p>
     * This value is not available for volumes created prior to May 13, 2015,
     * until you store data on the volume.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeUsedInBytes <p>
     *            The size of the data stored on the volume in bytes. This value
     *            is calculated based on the number of blocks that are touched,
     *            instead of the actual amount of data written. This value can
     *            be useful for sequential write patterns but less accurate for
     *            random write patterns. <code>VolumeUsedInBytes</code> is
     *            different from the compressed size of the volume, which is the
     *            value that is used to calculate your bill.
     *            </p>
     *            <note>
     *            <p>
     *            This value is not available for volumes created prior to May
     *            13, 2015, until you store data on the volume.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorediSCSIVolume withVolumeUsedInBytes(Long volumeUsedInBytes) {
        this.volumeUsedInBytes = volumeUsedInBytes;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3
     * server-side encryption. This value can only be set when KMSEncrypted is
     * true. Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon
     *         S3 server-side encryption. This value can only be set when
     *         KMSEncrypted is true. Optional.
     *         </p>
     */
    public String getKMSKey() {
        return kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3
     * server-side encryption. This value can only be set when KMSEncrypted is
     * true. Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     *
     * @param kMSKey <p>
     *            The Amazon Resource Name (ARN) of the AWS KMS key used for
     *            Amazon S3 server-side encryption. This value can only be set
     *            when KMSEncrypted is true. Optional.
     *            </p>
     */
    public void setKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3
     * server-side encryption. This value can only be set when KMSEncrypted is
     * true. Optional.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     *
     * @param kMSKey <p>
     *            The Amazon Resource Name (ARN) of the AWS KMS key used for
     *            Amazon S3 server-side encryption. This value can only be set
     *            when KMSEncrypted is true. Optional.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorediSCSIVolume withKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
        return this;
    }

    /**
     * <p>
     * The name of the iSCSI target used by an initiator to connect to a volume
     * and used as a suffix for the target ARN. For example, specifying
     * <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     * . The target name must be unique across all volumes on a gateway.
     * </p>
     * <p>
     * If you don't specify a value, Storage Gateway uses the value that was
     * previously used for this volume as the new target name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[-\.;a-z0-9]+$<br/>
     *
     * @return <p>
     *         The name of the iSCSI target used by an initiator to connect to a
     *         volume and used as a suffix for the target ARN. For example,
     *         specifying <code>TargetName</code> as <i>myvolume</i> results in
     *         the target ARN of
     *         <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     *         . The target name must be unique across all volumes on a gateway.
     *         </p>
     *         <p>
     *         If you don't specify a value, Storage Gateway uses the value that
     *         was previously used for this volume as the new target name.
     *         </p>
     */
    public String getTargetName() {
        return targetName;
    }

    /**
     * <p>
     * The name of the iSCSI target used by an initiator to connect to a volume
     * and used as a suffix for the target ARN. For example, specifying
     * <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     * . The target name must be unique across all volumes on a gateway.
     * </p>
     * <p>
     * If you don't specify a value, Storage Gateway uses the value that was
     * previously used for this volume as the new target name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[-\.;a-z0-9]+$<br/>
     *
     * @param targetName <p>
     *            The name of the iSCSI target used by an initiator to connect
     *            to a volume and used as a suffix for the target ARN. For
     *            example, specifying <code>TargetName</code> as <i>myvolume</i>
     *            results in the target ARN of
     *            <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     *            . The target name must be unique across all volumes on a
     *            gateway.
     *            </p>
     *            <p>
     *            If you don't specify a value, Storage Gateway uses the value
     *            that was previously used for this volume as the new target
     *            name.
     *            </p>
     */
    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    /**
     * <p>
     * The name of the iSCSI target used by an initiator to connect to a volume
     * and used as a suffix for the target ARN. For example, specifying
     * <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     * . The target name must be unique across all volumes on a gateway.
     * </p>
     * <p>
     * If you don't specify a value, Storage Gateway uses the value that was
     * previously used for this volume as the new target name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[-\.;a-z0-9]+$<br/>
     *
     * @param targetName <p>
     *            The name of the iSCSI target used by an initiator to connect
     *            to a volume and used as a suffix for the target ARN. For
     *            example, specifying <code>TargetName</code> as <i>myvolume</i>
     *            results in the target ARN of
     *            <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     *            . The target name must be unique across all volumes on a
     *            gateway.
     *            </p>
     *            <p>
     *            If you don't specify a value, Storage Gateway uses the value
     *            that was previously used for this volume as the new target
     *            name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorediSCSIVolume withTargetName(String targetName) {
        this.targetName = targetName;
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
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId() + ",");
        if (getVolumeType() != null)
            sb.append("VolumeType: " + getVolumeType() + ",");
        if (getVolumeStatus() != null)
            sb.append("VolumeStatus: " + getVolumeStatus() + ",");
        if (getVolumeAttachmentStatus() != null)
            sb.append("VolumeAttachmentStatus: " + getVolumeAttachmentStatus() + ",");
        if (getVolumeSizeInBytes() != null)
            sb.append("VolumeSizeInBytes: " + getVolumeSizeInBytes() + ",");
        if (getVolumeProgress() != null)
            sb.append("VolumeProgress: " + getVolumeProgress() + ",");
        if (getVolumeDiskId() != null)
            sb.append("VolumeDiskId: " + getVolumeDiskId() + ",");
        if (getSourceSnapshotId() != null)
            sb.append("SourceSnapshotId: " + getSourceSnapshotId() + ",");
        if (getPreservedExistingData() != null)
            sb.append("PreservedExistingData: " + getPreservedExistingData() + ",");
        if (getVolumeiSCSIAttributes() != null)
            sb.append("VolumeiSCSIAttributes: " + getVolumeiSCSIAttributes() + ",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: " + getCreatedDate() + ",");
        if (getVolumeUsedInBytes() != null)
            sb.append("VolumeUsedInBytes: " + getVolumeUsedInBytes() + ",");
        if (getKMSKey() != null)
            sb.append("KMSKey: " + getKMSKey() + ",");
        if (getTargetName() != null)
            sb.append("TargetName: " + getTargetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeStatus() == null) ? 0 : getVolumeStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getVolumeAttachmentStatus() == null) ? 0 : getVolumeAttachmentStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getVolumeSizeInBytes() == null) ? 0 : getVolumeSizeInBytes().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeProgress() == null) ? 0 : getVolumeProgress().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeDiskId() == null) ? 0 : getVolumeDiskId().hashCode());
        hashCode = prime * hashCode
                + ((getSourceSnapshotId() == null) ? 0 : getSourceSnapshotId().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreservedExistingData() == null) ? 0 : getPreservedExistingData().hashCode());
        hashCode = prime
                * hashCode
                + ((getVolumeiSCSIAttributes() == null) ? 0 : getVolumeiSCSIAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeUsedInBytes() == null) ? 0 : getVolumeUsedInBytes().hashCode());
        hashCode = prime * hashCode + ((getKMSKey() == null) ? 0 : getKMSKey().hashCode());
        hashCode = prime * hashCode + ((getTargetName() == null) ? 0 : getTargetName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorediSCSIVolume == false)
            return false;
        StorediSCSIVolume other = (StorediSCSIVolume) obj;

        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null
                && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null
                && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getVolumeStatus() == null ^ this.getVolumeStatus() == null)
            return false;
        if (other.getVolumeStatus() != null
                && other.getVolumeStatus().equals(this.getVolumeStatus()) == false)
            return false;
        if (other.getVolumeAttachmentStatus() == null ^ this.getVolumeAttachmentStatus() == null)
            return false;
        if (other.getVolumeAttachmentStatus() != null
                && other.getVolumeAttachmentStatus().equals(this.getVolumeAttachmentStatus()) == false)
            return false;
        if (other.getVolumeSizeInBytes() == null ^ this.getVolumeSizeInBytes() == null)
            return false;
        if (other.getVolumeSizeInBytes() != null
                && other.getVolumeSizeInBytes().equals(this.getVolumeSizeInBytes()) == false)
            return false;
        if (other.getVolumeProgress() == null ^ this.getVolumeProgress() == null)
            return false;
        if (other.getVolumeProgress() != null
                && other.getVolumeProgress().equals(this.getVolumeProgress()) == false)
            return false;
        if (other.getVolumeDiskId() == null ^ this.getVolumeDiskId() == null)
            return false;
        if (other.getVolumeDiskId() != null
                && other.getVolumeDiskId().equals(this.getVolumeDiskId()) == false)
            return false;
        if (other.getSourceSnapshotId() == null ^ this.getSourceSnapshotId() == null)
            return false;
        if (other.getSourceSnapshotId() != null
                && other.getSourceSnapshotId().equals(this.getSourceSnapshotId()) == false)
            return false;
        if (other.getPreservedExistingData() == null ^ this.getPreservedExistingData() == null)
            return false;
        if (other.getPreservedExistingData() != null
                && other.getPreservedExistingData().equals(this.getPreservedExistingData()) == false)
            return false;
        if (other.getVolumeiSCSIAttributes() == null ^ this.getVolumeiSCSIAttributes() == null)
            return false;
        if (other.getVolumeiSCSIAttributes() != null
                && other.getVolumeiSCSIAttributes().equals(this.getVolumeiSCSIAttributes()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getVolumeUsedInBytes() == null ^ this.getVolumeUsedInBytes() == null)
            return false;
        if (other.getVolumeUsedInBytes() != null
                && other.getVolumeUsedInBytes().equals(this.getVolumeUsedInBytes()) == false)
            return false;
        if (other.getKMSKey() == null ^ this.getKMSKey() == null)
            return false;
        if (other.getKMSKey() != null && other.getKMSKey().equals(this.getKMSKey()) == false)
            return false;
        if (other.getTargetName() == null ^ this.getTargetName() == null)
            return false;
        if (other.getTargetName() != null
                && other.getTargetName().equals(this.getTargetName()) == false)
            return false;
        return true;
    }
}
