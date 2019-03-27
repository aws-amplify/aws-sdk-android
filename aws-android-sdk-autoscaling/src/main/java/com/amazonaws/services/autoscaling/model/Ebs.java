/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an Amazon EBS volume. Used in combination with
 * <a>BlockDeviceMapping</a>.
 * </p>
 */
public class Ebs implements Serializable {
    /**
     * <p>
     * The ID of the snapshot. This parameter is optional if you specify a
     * volume size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String snapshotId;

    /**
     * <p>
     * The volume size, in GiB.
     * </p>
     * <p>
     * Constraints: 1-1,024 for <code>standard</code>, 4-16,384 for
     * <code>io1</code>, 1-16,384 for <code>gp2</code>, and 500-16,384 for
     * <code>st1</code> and <code>sc1</code>. If you specify a snapshot, the
     * volume size must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you create a volume from a snapshot and you don't specify a
     * volume size, the default is the snapshot size.
     * </p>
     * <note>
     * <p>
     * At least one of VolumeSize or SnapshotId is required.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16384<br/>
     */
    private Integer volumeSize;

    /**
     * <p>
     * The volume type, which can be <code>standard</code> for Magnetic,
     * <code>io1</code> for Provisioned IOPS SSD, <code>gp2</code> for General
     * Purpose SSD, <code>st1</code> for Throughput Optimized HDD, or
     * <code>sc1</code> for Cold HDD. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     * <p>
     * Valid values: <code>standard</code> | <code>io1</code> | <code>gp2</code>
     * | <code>st1</code> | <code>sc1</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String volumeType;

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination. The
     * default value is <code>true</code>.
     * </p>
     */
    private Boolean deleteOnTermination;

    /**
     * <p>
     * The number of I/O operations per second (IOPS) to provision for the
     * volume. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     * <p>
     * Conditional: This parameter is required when the volume type is
     * <code>io1</code>. (Not used with <code>standard</code>, <code>gp2</code>,
     * <code>st1</code>, or <code>sc1</code> volumes.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100 - 20000<br/>
     */
    private Integer iops;

    /**
     * <p>
     * Specifies whether the volume should be encrypted. Encrypted EBS volumes
     * must be attached to instances that support Amazon EBS encryption. Volumes
     * that are created from encrypted snapshots are automatically encrypted.
     * There is no way to create an encrypted volume from an unencrypted
     * snapshot or an unencrypted volume from an encrypted snapshot. If your AMI
     * uses encrypted volumes, you can only launch it on supported instance
     * types. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * The ID of the snapshot. This parameter is optional if you specify a
     * volume size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The ID of the snapshot. This parameter is optional if you specify
     *         a volume size.
     *         </p>
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot. This parameter is optional if you specify a
     * volume size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param snapshotId <p>
     *            The ID of the snapshot. This parameter is optional if you
     *            specify a volume size.
     *            </p>
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot. This parameter is optional if you specify a
     * volume size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param snapshotId <p>
     *            The ID of the snapshot. This parameter is optional if you
     *            specify a volume size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ebs withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * <p>
     * The volume size, in GiB.
     * </p>
     * <p>
     * Constraints: 1-1,024 for <code>standard</code>, 4-16,384 for
     * <code>io1</code>, 1-16,384 for <code>gp2</code>, and 500-16,384 for
     * <code>st1</code> and <code>sc1</code>. If you specify a snapshot, the
     * volume size must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you create a volume from a snapshot and you don't specify a
     * volume size, the default is the snapshot size.
     * </p>
     * <note>
     * <p>
     * At least one of VolumeSize or SnapshotId is required.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16384<br/>
     *
     * @return <p>
     *         The volume size, in GiB.
     *         </p>
     *         <p>
     *         Constraints: 1-1,024 for <code>standard</code>, 4-16,384 for
     *         <code>io1</code>, 1-16,384 for <code>gp2</code>, and 500-16,384
     *         for <code>st1</code> and <code>sc1</code>. If you specify a
     *         snapshot, the volume size must be equal to or larger than the
     *         snapshot size.
     *         </p>
     *         <p>
     *         Default: If you create a volume from a snapshot and you don't
     *         specify a volume size, the default is the snapshot size.
     *         </p>
     *         <note>
     *         <p>
     *         At least one of VolumeSize or SnapshotId is required.
     *         </p>
     *         </note>
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }

    /**
     * <p>
     * The volume size, in GiB.
     * </p>
     * <p>
     * Constraints: 1-1,024 for <code>standard</code>, 4-16,384 for
     * <code>io1</code>, 1-16,384 for <code>gp2</code>, and 500-16,384 for
     * <code>st1</code> and <code>sc1</code>. If you specify a snapshot, the
     * volume size must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you create a volume from a snapshot and you don't specify a
     * volume size, the default is the snapshot size.
     * </p>
     * <note>
     * <p>
     * At least one of VolumeSize or SnapshotId is required.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16384<br/>
     *
     * @param volumeSize <p>
     *            The volume size, in GiB.
     *            </p>
     *            <p>
     *            Constraints: 1-1,024 for <code>standard</code>, 4-16,384 for
     *            <code>io1</code>, 1-16,384 for <code>gp2</code>, and
     *            500-16,384 for <code>st1</code> and <code>sc1</code>. If you
     *            specify a snapshot, the volume size must be equal to or larger
     *            than the snapshot size.
     *            </p>
     *            <p>
     *            Default: If you create a volume from a snapshot and you don't
     *            specify a volume size, the default is the snapshot size.
     *            </p>
     *            <note>
     *            <p>
     *            At least one of VolumeSize or SnapshotId is required.
     *            </p>
     *            </note>
     */
    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * The volume size, in GiB.
     * </p>
     * <p>
     * Constraints: 1-1,024 for <code>standard</code>, 4-16,384 for
     * <code>io1</code>, 1-16,384 for <code>gp2</code>, and 500-16,384 for
     * <code>st1</code> and <code>sc1</code>. If you specify a snapshot, the
     * volume size must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you create a volume from a snapshot and you don't specify a
     * volume size, the default is the snapshot size.
     * </p>
     * <note>
     * <p>
     * At least one of VolumeSize or SnapshotId is required.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16384<br/>
     *
     * @param volumeSize <p>
     *            The volume size, in GiB.
     *            </p>
     *            <p>
     *            Constraints: 1-1,024 for <code>standard</code>, 4-16,384 for
     *            <code>io1</code>, 1-16,384 for <code>gp2</code>, and
     *            500-16,384 for <code>st1</code> and <code>sc1</code>. If you
     *            specify a snapshot, the volume size must be equal to or larger
     *            than the snapshot size.
     *            </p>
     *            <p>
     *            Default: If you create a volume from a snapshot and you don't
     *            specify a volume size, the default is the snapshot size.
     *            </p>
     *            <note>
     *            <p>
     *            At least one of VolumeSize or SnapshotId is required.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ebs withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * <p>
     * The volume type, which can be <code>standard</code> for Magnetic,
     * <code>io1</code> for Provisioned IOPS SSD, <code>gp2</code> for General
     * Purpose SSD, <code>st1</code> for Throughput Optimized HDD, or
     * <code>sc1</code> for Cold HDD. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     * <p>
     * Valid values: <code>standard</code> | <code>io1</code> | <code>gp2</code>
     * | <code>st1</code> | <code>sc1</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The volume type, which can be <code>standard</code> for Magnetic,
     *         <code>io1</code> for Provisioned IOPS SSD, <code>gp2</code> for
     *         General Purpose SSD, <code>st1</code> for Throughput Optimized
     *         HDD, or <code>sc1</code> for Cold HDD. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *         >Amazon EBS Volume Types</a> in the <i>Amazon EC2 User Guide for
     *         Linux Instances</i>.
     *         </p>
     *         <p>
     *         Valid values: <code>standard</code> | <code>io1</code> |
     *         <code>gp2</code> | <code>st1</code> | <code>sc1</code>
     *         </p>
     */
    public String getVolumeType() {
        return volumeType;
    }

    /**
     * <p>
     * The volume type, which can be <code>standard</code> for Magnetic,
     * <code>io1</code> for Provisioned IOPS SSD, <code>gp2</code> for General
     * Purpose SSD, <code>st1</code> for Throughput Optimized HDD, or
     * <code>sc1</code> for Cold HDD. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     * <p>
     * Valid values: <code>standard</code> | <code>io1</code> | <code>gp2</code>
     * | <code>st1</code> | <code>sc1</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param volumeType <p>
     *            The volume type, which can be <code>standard</code> for
     *            Magnetic, <code>io1</code> for Provisioned IOPS SSD,
     *            <code>gp2</code> for General Purpose SSD, <code>st1</code> for
     *            Throughput Optimized HDD, or <code>sc1</code> for Cold HDD.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *            >Amazon EBS Volume Types</a> in the <i>Amazon EC2 User Guide
     *            for Linux Instances</i>.
     *            </p>
     *            <p>
     *            Valid values: <code>standard</code> | <code>io1</code> |
     *            <code>gp2</code> | <code>st1</code> | <code>sc1</code>
     *            </p>
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type, which can be <code>standard</code> for Magnetic,
     * <code>io1</code> for Provisioned IOPS SSD, <code>gp2</code> for General
     * Purpose SSD, <code>st1</code> for Throughput Optimized HDD, or
     * <code>sc1</code> for Cold HDD. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     * <p>
     * Valid values: <code>standard</code> | <code>io1</code> | <code>gp2</code>
     * | <code>st1</code> | <code>sc1</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param volumeType <p>
     *            The volume type, which can be <code>standard</code> for
     *            Magnetic, <code>io1</code> for Provisioned IOPS SSD,
     *            <code>gp2</code> for General Purpose SSD, <code>st1</code> for
     *            Throughput Optimized HDD, or <code>sc1</code> for Cold HDD.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *            >Amazon EBS Volume Types</a> in the <i>Amazon EC2 User Guide
     *            for Linux Instances</i>.
     *            </p>
     *            <p>
     *            Valid values: <code>standard</code> | <code>io1</code> |
     *            <code>gp2</code> | <code>st1</code> | <code>sc1</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ebs withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination. The
     * default value is <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Indicates whether the volume is deleted on instance termination.
     *         The default value is <code>true</code>.
     *         </p>
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination. The
     * default value is <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Indicates whether the volume is deleted on instance termination.
     *         The default value is <code>true</code>.
     *         </p>
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination. The
     * default value is <code>true</code>.
     * </p>
     *
     * @param deleteOnTermination <p>
     *            Indicates whether the volume is deleted on instance
     *            termination. The default value is <code>true</code>.
     *            </p>
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination. The
     * default value is <code>true</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteOnTermination <p>
     *            Indicates whether the volume is deleted on instance
     *            termination. The default value is <code>true</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ebs withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) to provision for the
     * volume. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     * <p>
     * Conditional: This parameter is required when the volume type is
     * <code>io1</code>. (Not used with <code>standard</code>, <code>gp2</code>,
     * <code>st1</code>, or <code>sc1</code> volumes.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100 - 20000<br/>
     *
     * @return <p>
     *         The number of I/O operations per second (IOPS) to provision for
     *         the volume. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *         >Amazon EBS Volume Types</a> in the <i>Amazon EC2 User Guide for
     *         Linux Instances</i>.
     *         </p>
     *         <p>
     *         Conditional: This parameter is required when the volume type is
     *         <code>io1</code>. (Not used with <code>standard</code>,
     *         <code>gp2</code>, <code>st1</code>, or <code>sc1</code> volumes.)
     *         </p>
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) to provision for the
     * volume. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     * <p>
     * Conditional: This parameter is required when the volume type is
     * <code>io1</code>. (Not used with <code>standard</code>, <code>gp2</code>,
     * <code>st1</code>, or <code>sc1</code> volumes.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100 - 20000<br/>
     *
     * @param iops <p>
     *            The number of I/O operations per second (IOPS) to provision
     *            for the volume. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *            >Amazon EBS Volume Types</a> in the <i>Amazon EC2 User Guide
     *            for Linux Instances</i>.
     *            </p>
     *            <p>
     *            Conditional: This parameter is required when the volume type
     *            is <code>io1</code>. (Not used with <code>standard</code>,
     *            <code>gp2</code>, <code>st1</code>, or <code>sc1</code>
     *            volumes.)
     *            </p>
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) to provision for the
     * volume. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     * <p>
     * Conditional: This parameter is required when the volume type is
     * <code>io1</code>. (Not used with <code>standard</code>, <code>gp2</code>,
     * <code>st1</code>, or <code>sc1</code> volumes.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100 - 20000<br/>
     *
     * @param iops <p>
     *            The number of I/O operations per second (IOPS) to provision
     *            for the volume. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *            >Amazon EBS Volume Types</a> in the <i>Amazon EC2 User Guide
     *            for Linux Instances</i>.
     *            </p>
     *            <p>
     *            Conditional: This parameter is required when the volume type
     *            is <code>io1</code>. (Not used with <code>standard</code>,
     *            <code>gp2</code>, <code>st1</code>, or <code>sc1</code>
     *            volumes.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ebs withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * <p>
     * Specifies whether the volume should be encrypted. Encrypted EBS volumes
     * must be attached to instances that support Amazon EBS encryption. Volumes
     * that are created from encrypted snapshots are automatically encrypted.
     * There is no way to create an encrypted volume from an unencrypted
     * snapshot or an unencrypted volume from an encrypted snapshot. If your AMI
     * uses encrypted volumes, you can only launch it on supported instance
     * types. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether the volume should be encrypted. Encrypted EBS
     *         volumes must be attached to instances that support Amazon EBS
     *         encryption. Volumes that are created from encrypted snapshots are
     *         automatically encrypted. There is no way to create an encrypted
     *         volume from an unencrypted snapshot or an unencrypted volume from
     *         an encrypted snapshot. If your AMI uses encrypted volumes, you
     *         can only launch it on supported instance types. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     *         >Amazon EBS Encryption</a> in the <i>Amazon EC2 User Guide for
     *         Linux Instances</i>.
     *         </p>
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Specifies whether the volume should be encrypted. Encrypted EBS volumes
     * must be attached to instances that support Amazon EBS encryption. Volumes
     * that are created from encrypted snapshots are automatically encrypted.
     * There is no way to create an encrypted volume from an unencrypted
     * snapshot or an unencrypted volume from an encrypted snapshot. If your AMI
     * uses encrypted volumes, you can only launch it on supported instance
     * types. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether the volume should be encrypted. Encrypted EBS
     *         volumes must be attached to instances that support Amazon EBS
     *         encryption. Volumes that are created from encrypted snapshots are
     *         automatically encrypted. There is no way to create an encrypted
     *         volume from an unencrypted snapshot or an unencrypted volume from
     *         an encrypted snapshot. If your AMI uses encrypted volumes, you
     *         can only launch it on supported instance types. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     *         >Amazon EBS Encryption</a> in the <i>Amazon EC2 User Guide for
     *         Linux Instances</i>.
     *         </p>
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Specifies whether the volume should be encrypted. Encrypted EBS volumes
     * must be attached to instances that support Amazon EBS encryption. Volumes
     * that are created from encrypted snapshots are automatically encrypted.
     * There is no way to create an encrypted volume from an unencrypted
     * snapshot or an unencrypted volume from an encrypted snapshot. If your AMI
     * uses encrypted volumes, you can only launch it on supported instance
     * types. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     *
     * @param encrypted <p>
     *            Specifies whether the volume should be encrypted. Encrypted
     *            EBS volumes must be attached to instances that support Amazon
     *            EBS encryption. Volumes that are created from encrypted
     *            snapshots are automatically encrypted. There is no way to
     *            create an encrypted volume from an unencrypted snapshot or an
     *            unencrypted volume from an encrypted snapshot. If your AMI
     *            uses encrypted volumes, you can only launch it on supported
     *            instance types. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     *            >Amazon EBS Encryption</a> in the <i>Amazon EC2 User Guide for
     *            Linux Instances</i>.
     *            </p>
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Specifies whether the volume should be encrypted. Encrypted EBS volumes
     * must be attached to instances that support Amazon EBS encryption. Volumes
     * that are created from encrypted snapshots are automatically encrypted.
     * There is no way to create an encrypted volume from an unencrypted
     * snapshot or an unencrypted volume from an encrypted snapshot. If your AMI
     * uses encrypted volumes, you can only launch it on supported instance
     * types. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            Specifies whether the volume should be encrypted. Encrypted
     *            EBS volumes must be attached to instances that support Amazon
     *            EBS encryption. Volumes that are created from encrypted
     *            snapshots are automatically encrypted. There is no way to
     *            create an encrypted volume from an unencrypted snapshot or an
     *            unencrypted volume from an encrypted snapshot. If your AMI
     *            uses encrypted volumes, you can only launch it on supported
     *            instance types. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     *            >Amazon EBS Encryption</a> in the <i>Amazon EC2 User Guide for
     *            Linux Instances</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ebs withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
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
        if (getVolumeSize() != null)
            sb.append("VolumeSize: " + getVolumeSize() + ",");
        if (getVolumeType() != null)
            sb.append("VolumeType: " + getVolumeType() + ",");
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: " + getDeleteOnTermination() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode
                + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ebs == false)
            return false;
        Ebs other = (Ebs) obj;

        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null
                && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null)
            return false;
        if (other.getVolumeSize() != null
                && other.getVolumeSize().equals(this.getVolumeSize()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null
                && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null
                && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null
                && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        return true;
    }
}
