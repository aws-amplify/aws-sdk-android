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

/**
 * <p>
 * Describes a volume.
 * </p>
 */
public class CreateVolumeResult implements Serializable {
    /**
     * <p>
     * Information about the volume attachments.
     * </p>
     */
    private java.util.List<VolumeAttachment> attachments;

    /**
     * <p>
     * The Availability Zone for the volume.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The time stamp when volume creation was initiated.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * Indicates whether the volume is encrypted.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS
     * KMS) customer master key (CMK) that was used to protect the volume
     * encryption key for the volume.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     */
    private String outpostArn;

    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     */
    private Integer size;

    /**
     * <p>
     * The snapshot from which the volume was created, if applicable.
     * </p>
     */
    private String snapshotId;

    /**
     * <p>
     * The volume state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, in-use, deleting, deleted,
     * error
     */
    private String state;

    /**
     * <p>
     * The ID of the volume.
     * </p>
     */
    private String volumeId;

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * For Provisioned IOPS SSD volumes, this represents the number of IOPS that
     * are provisioned for the volume. For General Purpose SSD volumes, this
     * represents the baseline performance of the volume and the rate at which
     * the volume accumulates I/O credits for bursting. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Constraints: Range is 100-16,000 IOPS for <code>gp2</code> volumes and
     * 100 to 64,000IOPS for <code>io1</code> volumes, in most Regions. The
     * maximum IOPS for <code>io1</code> of 64,000 is guaranteed only on <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instances</a>. Other instance families guarantee performance
     * up to 32,000 IOPS.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create
     * <code>io1</code> volumes; it is not used in requests to create
     * <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or
     * <code>standard</code> volumes.
     * </p>
     */
    private Integer iops;

    /**
     * <p>
     * Any tags assigned to the volume.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The volume type. This can be <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     * Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     * <code>standard</code> for Magnetic volumes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     */
    private String volumeType;

    /**
     * <p>
     * Indicates whether the volume was created using fast snapshot restore.
     * </p>
     */
    private Boolean fastRestored;

    /**
     * <p>
     * Indicates whether Amazon EBS Multi-Attach is enabled.
     * </p>
     */
    private Boolean multiAttachEnabled;

    /**
     * <p>
     * Information about the volume attachments.
     * </p>
     *
     * @return <p>
     *         Information about the volume attachments.
     *         </p>
     */
    public java.util.List<VolumeAttachment> getAttachments() {
        return attachments;
    }

    /**
     * <p>
     * Information about the volume attachments.
     * </p>
     *
     * @param attachments <p>
     *            Information about the volume attachments.
     *            </p>
     */
    public void setAttachments(java.util.Collection<VolumeAttachment> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new java.util.ArrayList<VolumeAttachment>(attachments);
    }

    /**
     * <p>
     * Information about the volume attachments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            Information about the volume attachments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeResult withAttachments(VolumeAttachment... attachments) {
        if (getAttachments() == null) {
            this.attachments = new java.util.ArrayList<VolumeAttachment>(attachments.length);
        }
        for (VolumeAttachment value : attachments) {
            this.attachments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the volume attachments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            Information about the volume attachments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeResult withAttachments(java.util.Collection<VolumeAttachment> attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * <p>
     * The Availability Zone for the volume.
     * </p>
     *
     * @return <p>
     *         The Availability Zone for the volume.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the volume.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone for the volume.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone for the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeResult withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The time stamp when volume creation was initiated.
     * </p>
     *
     * @return <p>
     *         The time stamp when volume creation was initiated.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The time stamp when volume creation was initiated.
     * </p>
     *
     * @param createTime <p>
     *            The time stamp when volume creation was initiated.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time stamp when volume creation was initiated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The time stamp when volume creation was initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeResult withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume is encrypted.
     * </p>
     *
     * @return <p>
     *         Indicates whether the volume is encrypted.
     *         </p>
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Indicates whether the volume is encrypted.
     * </p>
     *
     * @return <p>
     *         Indicates whether the volume is encrypted.
     *         </p>
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Indicates whether the volume is encrypted.
     * </p>
     *
     * @param encrypted <p>
     *            Indicates whether the volume is encrypted.
     *            </p>
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the volume is encrypted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            Indicates whether the volume is encrypted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeResult withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS
     * KMS) customer master key (CMK) that was used to protect the volume
     * encryption key for the volume.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS Key Management Service
     *         (AWS KMS) customer master key (CMK) that was used to protect the
     *         volume encryption key for the volume.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS
     * KMS) customer master key (CMK) that was used to protect the volume
     * encryption key for the volume.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The Amazon Resource Name (ARN) of the AWS Key Management
     *            Service (AWS KMS) customer master key (CMK) that was used to
     *            protect the volume encryption key for the volume.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS
     * KMS) customer master key (CMK) that was used to protect the volume
     * encryption key for the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The Amazon Resource Name (ARN) of the AWS Key Management
     *            Service (AWS KMS) customer master key (CMK) that was used to
     *            protect the volume encryption key for the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeResult withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Outpost.
     *         </p>
     */
    public String getOutpostArn() {
        return outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     *
     * @param outpostArn <p>
     *            The Amazon Resource Name (ARN) of the Outpost.
     *            </p>
     */
    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outpostArn <p>
     *            The Amazon Resource Name (ARN) of the Outpost.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeResult withOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
        return this;
    }

    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     *
     * @return <p>
     *         The size of the volume, in GiBs.
     *         </p>
     */
    public Integer getSize() {
        return size;
    }

    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     *
     * @param size <p>
     *            The size of the volume, in GiBs.
     *            </p>
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param size <p>
     *            The size of the volume, in GiBs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeResult withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * <p>
     * The snapshot from which the volume was created, if applicable.
     * </p>
     *
     * @return <p>
     *         The snapshot from which the volume was created, if applicable.
     *         </p>
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * <p>
     * The snapshot from which the volume was created, if applicable.
     * </p>
     *
     * @param snapshotId <p>
     *            The snapshot from which the volume was created, if applicable.
     *            </p>
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The snapshot from which the volume was created, if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotId <p>
     *            The snapshot from which the volume was created, if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeResult withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * <p>
     * The volume state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, in-use, deleting, deleted,
     * error
     *
     * @return <p>
     *         The volume state.
     *         </p>
     * @see VolumeState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The volume state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, in-use, deleting, deleted,
     * error
     *
     * @param state <p>
     *            The volume state.
     *            </p>
     * @see VolumeState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The volume state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, in-use, deleting, deleted,
     * error
     *
     * @param state <p>
     *            The volume state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeState
     */
    public CreateVolumeResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The volume state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, in-use, deleting, deleted,
     * error
     *
     * @param state <p>
     *            The volume state.
     *            </p>
     * @see VolumeState
     */
    public void setState(VolumeState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The volume state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, in-use, deleting, deleted,
     * error
     *
     * @param state <p>
     *            The volume state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeState
     */
    public CreateVolumeResult withState(VolumeState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     *
     * @return <p>
     *         The ID of the volume.
     *         </p>
     */
    public String getVolumeId() {
        return volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     *
     * @param volumeId <p>
     *            The ID of the volume.
     *            </p>
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeId <p>
     *            The ID of the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeResult withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * For Provisioned IOPS SSD volumes, this represents the number of IOPS that
     * are provisioned for the volume. For General Purpose SSD volumes, this
     * represents the baseline performance of the volume and the rate at which
     * the volume accumulates I/O credits for bursting. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Constraints: Range is 100-16,000 IOPS for <code>gp2</code> volumes and
     * 100 to 64,000IOPS for <code>io1</code> volumes, in most Regions. The
     * maximum IOPS for <code>io1</code> of 64,000 is guaranteed only on <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instances</a>. Other instance families guarantee performance
     * up to 32,000 IOPS.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create
     * <code>io1</code> volumes; it is not used in requests to create
     * <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or
     * <code>standard</code> volumes.
     * </p>
     *
     * @return <p>
     *         The number of I/O operations per second (IOPS) that the volume
     *         supports. For Provisioned IOPS SSD volumes, this represents the
     *         number of IOPS that are provisioned for the volume. For General
     *         Purpose SSD volumes, this represents the baseline performance of
     *         the volume and the rate at which the volume accumulates I/O
     *         credits for bursting. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *         >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide</i>.
     *         </p>
     *         <p>
     *         Constraints: Range is 100-16,000 IOPS for <code>gp2</code>
     *         volumes and 100 to 64,000IOPS for <code>io1</code> volumes, in
     *         most Regions. The maximum IOPS for <code>io1</code> of 64,000 is
     *         guaranteed only on <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *         >Nitro-based instances</a>. Other instance families guarantee
     *         performance up to 32,000 IOPS.
     *         </p>
     *         <p>
     *         Condition: This parameter is required for requests to create
     *         <code>io1</code> volumes; it is not used in requests to create
     *         <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or
     *         <code>standard</code> volumes.
     *         </p>
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * For Provisioned IOPS SSD volumes, this represents the number of IOPS that
     * are provisioned for the volume. For General Purpose SSD volumes, this
     * represents the baseline performance of the volume and the rate at which
     * the volume accumulates I/O credits for bursting. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Constraints: Range is 100-16,000 IOPS for <code>gp2</code> volumes and
     * 100 to 64,000IOPS for <code>io1</code> volumes, in most Regions. The
     * maximum IOPS for <code>io1</code> of 64,000 is guaranteed only on <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instances</a>. Other instance families guarantee performance
     * up to 32,000 IOPS.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create
     * <code>io1</code> volumes; it is not used in requests to create
     * <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or
     * <code>standard</code> volumes.
     * </p>
     *
     * @param iops <p>
     *            The number of I/O operations per second (IOPS) that the volume
     *            supports. For Provisioned IOPS SSD volumes, this represents
     *            the number of IOPS that are provisioned for the volume. For
     *            General Purpose SSD volumes, this represents the baseline
     *            performance of the volume and the rate at which the volume
     *            accumulates I/O credits for bursting. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *            >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            <p>
     *            Constraints: Range is 100-16,000 IOPS for <code>gp2</code>
     *            volumes and 100 to 64,000IOPS for <code>io1</code> volumes, in
     *            most Regions. The maximum IOPS for <code>io1</code> of 64,000
     *            is guaranteed only on <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *            >Nitro-based instances</a>. Other instance families guarantee
     *            performance up to 32,000 IOPS.
     *            </p>
     *            <p>
     *            Condition: This parameter is required for requests to create
     *            <code>io1</code> volumes; it is not used in requests to create
     *            <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or
     *            <code>standard</code> volumes.
     *            </p>
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * For Provisioned IOPS SSD volumes, this represents the number of IOPS that
     * are provisioned for the volume. For General Purpose SSD volumes, this
     * represents the baseline performance of the volume and the rate at which
     * the volume accumulates I/O credits for bursting. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Constraints: Range is 100-16,000 IOPS for <code>gp2</code> volumes and
     * 100 to 64,000IOPS for <code>io1</code> volumes, in most Regions. The
     * maximum IOPS for <code>io1</code> of 64,000 is guaranteed only on <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instances</a>. Other instance families guarantee performance
     * up to 32,000 IOPS.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create
     * <code>io1</code> volumes; it is not used in requests to create
     * <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or
     * <code>standard</code> volumes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iops <p>
     *            The number of I/O operations per second (IOPS) that the volume
     *            supports. For Provisioned IOPS SSD volumes, this represents
     *            the number of IOPS that are provisioned for the volume. For
     *            General Purpose SSD volumes, this represents the baseline
     *            performance of the volume and the rate at which the volume
     *            accumulates I/O credits for bursting. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *            >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            <p>
     *            Constraints: Range is 100-16,000 IOPS for <code>gp2</code>
     *            volumes and 100 to 64,000IOPS for <code>io1</code> volumes, in
     *            most Regions. The maximum IOPS for <code>io1</code> of 64,000
     *            is guaranteed only on <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *            >Nitro-based instances</a>. Other instance families guarantee
     *            performance up to 32,000 IOPS.
     *            </p>
     *            <p>
     *            Condition: This parameter is required for requests to create
     *            <code>io1</code> volumes; it is not used in requests to create
     *            <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or
     *            <code>standard</code> volumes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeResult withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the volume.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the volume.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the volume.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the volume.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeResult withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The volume type. This can be <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     * Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     * <code>standard</code> for Magnetic volumes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @return <p>
     *         The volume type. This can be <code>gp2</code> for General Purpose
     *         SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code>
     *         for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *         <code>standard</code> for Magnetic volumes.
     *         </p>
     * @see VolumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    /**
     * <p>
     * The volume type. This can be <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     * Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     * <code>standard</code> for Magnetic volumes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param volumeType <p>
     *            The volume type. This can be <code>gp2</code> for General
     *            Purpose SSD, <code>io1</code> for Provisioned IOPS SSD,
     *            <code>st1</code> for Throughput Optimized HDD,
     *            <code>sc1</code> for Cold HDD, or <code>standard</code> for
     *            Magnetic volumes.
     *            </p>
     * @see VolumeType
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type. This can be <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     * Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     * <code>standard</code> for Magnetic volumes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param volumeType <p>
     *            The volume type. This can be <code>gp2</code> for General
     *            Purpose SSD, <code>io1</code> for Provisioned IOPS SSD,
     *            <code>st1</code> for Throughput Optimized HDD,
     *            <code>sc1</code> for Cold HDD, or <code>standard</code> for
     *            Magnetic volumes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeType
     */
    public CreateVolumeResult withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * <p>
     * The volume type. This can be <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     * Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     * <code>standard</code> for Magnetic volumes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param volumeType <p>
     *            The volume type. This can be <code>gp2</code> for General
     *            Purpose SSD, <code>io1</code> for Provisioned IOPS SSD,
     *            <code>st1</code> for Throughput Optimized HDD,
     *            <code>sc1</code> for Cold HDD, or <code>standard</code> for
     *            Magnetic volumes.
     *            </p>
     * @see VolumeType
     */
    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
    }

    /**
     * <p>
     * The volume type. This can be <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     * Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     * <code>standard</code> for Magnetic volumes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param volumeType <p>
     *            The volume type. This can be <code>gp2</code> for General
     *            Purpose SSD, <code>io1</code> for Provisioned IOPS SSD,
     *            <code>st1</code> for Throughput Optimized HDD,
     *            <code>sc1</code> for Cold HDD, or <code>standard</code> for
     *            Magnetic volumes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeType
     */
    public CreateVolumeResult withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume was created using fast snapshot restore.
     * </p>
     *
     * @return <p>
     *         Indicates whether the volume was created using fast snapshot
     *         restore.
     *         </p>
     */
    public Boolean isFastRestored() {
        return fastRestored;
    }

    /**
     * <p>
     * Indicates whether the volume was created using fast snapshot restore.
     * </p>
     *
     * @return <p>
     *         Indicates whether the volume was created using fast snapshot
     *         restore.
     *         </p>
     */
    public Boolean getFastRestored() {
        return fastRestored;
    }

    /**
     * <p>
     * Indicates whether the volume was created using fast snapshot restore.
     * </p>
     *
     * @param fastRestored <p>
     *            Indicates whether the volume was created using fast snapshot
     *            restore.
     *            </p>
     */
    public void setFastRestored(Boolean fastRestored) {
        this.fastRestored = fastRestored;
    }

    /**
     * <p>
     * Indicates whether the volume was created using fast snapshot restore.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fastRestored <p>
     *            Indicates whether the volume was created using fast snapshot
     *            restore.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeResult withFastRestored(Boolean fastRestored) {
        this.fastRestored = fastRestored;
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon EBS Multi-Attach is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether Amazon EBS Multi-Attach is enabled.
     *         </p>
     */
    public Boolean isMultiAttachEnabled() {
        return multiAttachEnabled;
    }

    /**
     * <p>
     * Indicates whether Amazon EBS Multi-Attach is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether Amazon EBS Multi-Attach is enabled.
     *         </p>
     */
    public Boolean getMultiAttachEnabled() {
        return multiAttachEnabled;
    }

    /**
     * <p>
     * Indicates whether Amazon EBS Multi-Attach is enabled.
     * </p>
     *
     * @param multiAttachEnabled <p>
     *            Indicates whether Amazon EBS Multi-Attach is enabled.
     *            </p>
     */
    public void setMultiAttachEnabled(Boolean multiAttachEnabled) {
        this.multiAttachEnabled = multiAttachEnabled;
    }

    /**
     * <p>
     * Indicates whether Amazon EBS Multi-Attach is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiAttachEnabled <p>
     *            Indicates whether Amazon EBS Multi-Attach is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeResult withMultiAttachEnabled(Boolean multiAttachEnabled) {
        this.multiAttachEnabled = multiAttachEnabled;
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
        if (getAttachments() != null)
            sb.append("Attachments: " + getAttachments() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: " + getOutpostArn() + ",");
        if (getSize() != null)
            sb.append("Size: " + getSize() + ",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getVolumeType() != null)
            sb.append("VolumeType: " + getVolumeType() + ",");
        if (getFastRestored() != null)
            sb.append("FastRestored: " + getFastRestored() + ",");
        if (getMultiAttachEnabled() != null)
            sb.append("MultiAttachEnabled: " + getMultiAttachEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode
                + ((getFastRestored() == null) ? 0 : getFastRestored().hashCode());
        hashCode = prime * hashCode
                + ((getMultiAttachEnabled() == null) ? 0 : getMultiAttachEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVolumeResult == false)
            return false;
        CreateVolumeResult other = (CreateVolumeResult) obj;

        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null
                && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null
                && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null
                && other.getOutpostArn().equals(this.getOutpostArn()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null
                && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null
                && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getFastRestored() == null ^ this.getFastRestored() == null)
            return false;
        if (other.getFastRestored() != null
                && other.getFastRestored().equals(this.getFastRestored()) == false)
            return false;
        if (other.getMultiAttachEnabled() == null ^ this.getMultiAttachEnabled() == null)
            return false;
        if (other.getMultiAttachEnabled() != null
                && other.getMultiAttachEnabled().equals(this.getMultiAttachEnabled()) == false)
            return false;
        return true;
    }
}
