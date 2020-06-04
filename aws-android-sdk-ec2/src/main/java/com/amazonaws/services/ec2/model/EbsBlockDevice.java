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
 * Describes a block device for an EBS volume.
 * </p>
 */
public class EbsBlockDevice implements Serializable {
    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination"
     * >Preserving Amazon EBS Volumes on Instance Termination</a> in the Amazon
     * Elastic Compute Cloud User Guide.
     * </p>
     */
    private Boolean deleteOnTermination;

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * For <code>io1</code> volumes, this represents the number of IOPS that are
     * provisioned for the volume. For <code>gp2</code> volumes, this represents
     * the baseline performance of the volume and the rate at which the volume
     * accumulates I/O credits for bursting. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Constraints: Range is 100-16,000 IOPS for <code>gp2</code> volumes and
     * 100 to 64,000IOPS for <code>io1</code> volumes in most Regions. Maximum
     * <code>io1</code> IOPS of 64,000 is guaranteed only on <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instances</a>. Other instance families guarantee performance
     * up to 32,000 IOPS. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
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
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify
     * a volume size, the default is the snapshot size.
     * </p>
     * <p>
     * Constraints: 1-16384 for General Purpose SSD (<code>gp2</code>), 4-16384
     * for Provisioned IOPS SSD (<code>io1</code>), 500-16384 for Throughput
     * Optimized HDD (<code>st1</code>), 500-16384 for Cold HDD (
     * <code>sc1</code>), and 1-1024 for Magnetic (<code>standard</code>)
     * volumes. If you specify a snapshot, the volume size must be equal to or
     * larger than the snapshot size.
     * </p>
     */
    private Integer volumeSize;

    /**
     * <p>
     * The volume type. If you set the type to <code>io1</code>, you must also
     * specify the <b>Iops</b> parameter. If you set the type to
     * <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or
     * <code>standard</code>, you must omit the <b>Iops</b> parameter.
     * </p>
     * <p>
     * Default: <code>gp2</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     */
    private String volumeType;

    /**
     * <p>
     * Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer
     * managed CMK under which the EBS volume is encrypted.
     * </p>
     * <p>
     * This parameter is only supported on <code>BlockDeviceMapping</code>
     * objects called by <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     * >RunInstances</a>, <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html"
     * >RequestSpotFleet</a>, and <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html"
     * >RequestSpotInstances</a>.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Indicates whether the encryption state of an EBS volume is changed while
     * being restored from a backing snapshot. The effect of setting the
     * encryption state to <code>true</code> depends on the volume origin (new
     * or from a snapshot), starting encryption state, ownership, and whether
     * encryption by default is enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * In no case can you remove encryption from an encrypted volume.
     * </p>
     * <p>
     * Encrypted volumes can only be attached to instances that support Amazon
     * EBS encryption. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported Instance Types</a>.
     * </p>
     * <p>
     * This parameter is not returned by .
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination"
     * >Preserving Amazon EBS Volumes on Instance Termination</a> in the Amazon
     * Elastic Compute Cloud User Guide.
     * </p>
     *
     * @return <p>
     *         Indicates whether the EBS volume is deleted on instance
     *         termination. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination"
     *         >Preserving Amazon EBS Volumes on Instance Termination</a> in the
     *         Amazon Elastic Compute Cloud User Guide.
     *         </p>
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination"
     * >Preserving Amazon EBS Volumes on Instance Termination</a> in the Amazon
     * Elastic Compute Cloud User Guide.
     * </p>
     *
     * @return <p>
     *         Indicates whether the EBS volume is deleted on instance
     *         termination. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination"
     *         >Preserving Amazon EBS Volumes on Instance Termination</a> in the
     *         Amazon Elastic Compute Cloud User Guide.
     *         </p>
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination"
     * >Preserving Amazon EBS Volumes on Instance Termination</a> in the Amazon
     * Elastic Compute Cloud User Guide.
     * </p>
     *
     * @param deleteOnTermination <p>
     *            Indicates whether the EBS volume is deleted on instance
     *            termination. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination"
     *            >Preserving Amazon EBS Volumes on Instance Termination</a> in
     *            the Amazon Elastic Compute Cloud User Guide.
     *            </p>
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination"
     * >Preserving Amazon EBS Volumes on Instance Termination</a> in the Amazon
     * Elastic Compute Cloud User Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteOnTermination <p>
     *            Indicates whether the EBS volume is deleted on instance
     *            termination. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination"
     *            >Preserving Amazon EBS Volumes on Instance Termination</a> in
     *            the Amazon Elastic Compute Cloud User Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsBlockDevice withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * For <code>io1</code> volumes, this represents the number of IOPS that are
     * provisioned for the volume. For <code>gp2</code> volumes, this represents
     * the baseline performance of the volume and the rate at which the volume
     * accumulates I/O credits for bursting. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Constraints: Range is 100-16,000 IOPS for <code>gp2</code> volumes and
     * 100 to 64,000IOPS for <code>io1</code> volumes in most Regions. Maximum
     * <code>io1</code> IOPS of 64,000 is guaranteed only on <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instances</a>. Other instance families guarantee performance
     * up to 32,000 IOPS. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
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
     *         supports. For <code>io1</code> volumes, this represents the
     *         number of IOPS that are provisioned for the volume. For
     *         <code>gp2</code> volumes, this represents the baseline
     *         performance of the volume and the rate at which the volume
     *         accumulates I/O credits for bursting. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *         >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide</i>.
     *         </p>
     *         <p>
     *         Constraints: Range is 100-16,000 IOPS for <code>gp2</code>
     *         volumes and 100 to 64,000IOPS for <code>io1</code> volumes in
     *         most Regions. Maximum <code>io1</code> IOPS of 64,000 is
     *         guaranteed only on <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *         >Nitro-based instances</a>. Other instance families guarantee
     *         performance up to 32,000 IOPS. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *         >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide</i>.
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
     * For <code>io1</code> volumes, this represents the number of IOPS that are
     * provisioned for the volume. For <code>gp2</code> volumes, this represents
     * the baseline performance of the volume and the rate at which the volume
     * accumulates I/O credits for bursting. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Constraints: Range is 100-16,000 IOPS for <code>gp2</code> volumes and
     * 100 to 64,000IOPS for <code>io1</code> volumes in most Regions. Maximum
     * <code>io1</code> IOPS of 64,000 is guaranteed only on <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instances</a>. Other instance families guarantee performance
     * up to 32,000 IOPS. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
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
     *            supports. For <code>io1</code> volumes, this represents the
     *            number of IOPS that are provisioned for the volume. For
     *            <code>gp2</code> volumes, this represents the baseline
     *            performance of the volume and the rate at which the volume
     *            accumulates I/O credits for bursting. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *            >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            <p>
     *            Constraints: Range is 100-16,000 IOPS for <code>gp2</code>
     *            volumes and 100 to 64,000IOPS for <code>io1</code> volumes in
     *            most Regions. Maximum <code>io1</code> IOPS of 64,000 is
     *            guaranteed only on <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *            >Nitro-based instances</a>. Other instance families guarantee
     *            performance up to 32,000 IOPS. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *            >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
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
     * For <code>io1</code> volumes, this represents the number of IOPS that are
     * provisioned for the volume. For <code>gp2</code> volumes, this represents
     * the baseline performance of the volume and the rate at which the volume
     * accumulates I/O credits for bursting. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Constraints: Range is 100-16,000 IOPS for <code>gp2</code> volumes and
     * 100 to 64,000IOPS for <code>io1</code> volumes in most Regions. Maximum
     * <code>io1</code> IOPS of 64,000 is guaranteed only on <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instances</a>. Other instance families guarantee performance
     * up to 32,000 IOPS. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
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
     *            supports. For <code>io1</code> volumes, this represents the
     *            number of IOPS that are provisioned for the volume. For
     *            <code>gp2</code> volumes, this represents the baseline
     *            performance of the volume and the rate at which the volume
     *            accumulates I/O credits for bursting. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *            >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            <p>
     *            Constraints: Range is 100-16,000 IOPS for <code>gp2</code>
     *            volumes and 100 to 64,000IOPS for <code>io1</code> volumes in
     *            most Regions. Maximum <code>io1</code> IOPS of 64,000 is
     *            guaranteed only on <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *            >Nitro-based instances</a>. Other instance families guarantee
     *            performance up to 32,000 IOPS. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *            >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
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
    public EbsBlockDevice withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
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
     *
     * @param snapshotId <p>
     *            The ID of the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsBlockDevice withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify
     * a volume size, the default is the snapshot size.
     * </p>
     * <p>
     * Constraints: 1-16384 for General Purpose SSD (<code>gp2</code>), 4-16384
     * for Provisioned IOPS SSD (<code>io1</code>), 500-16384 for Throughput
     * Optimized HDD (<code>st1</code>), 500-16384 for Cold HDD (
     * <code>sc1</code>), and 1-1024 for Magnetic (<code>standard</code>)
     * volumes. If you specify a snapshot, the volume size must be equal to or
     * larger than the snapshot size.
     * </p>
     *
     * @return <p>
     *         The size of the volume, in GiB.
     *         </p>
     *         <p>
     *         Default: If you're creating the volume from a snapshot and don't
     *         specify a volume size, the default is the snapshot size.
     *         </p>
     *         <p>
     *         Constraints: 1-16384 for General Purpose SSD (<code>gp2</code>),
     *         4-16384 for Provisioned IOPS SSD (<code>io1</code>), 500-16384
     *         for Throughput Optimized HDD (<code>st1</code>), 500-16384 for
     *         Cold HDD (<code>sc1</code>), and 1-1024 for Magnetic (
     *         <code>standard</code>) volumes. If you specify a snapshot, the
     *         volume size must be equal to or larger than the snapshot size.
     *         </p>
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify
     * a volume size, the default is the snapshot size.
     * </p>
     * <p>
     * Constraints: 1-16384 for General Purpose SSD (<code>gp2</code>), 4-16384
     * for Provisioned IOPS SSD (<code>io1</code>), 500-16384 for Throughput
     * Optimized HDD (<code>st1</code>), 500-16384 for Cold HDD (
     * <code>sc1</code>), and 1-1024 for Magnetic (<code>standard</code>)
     * volumes. If you specify a snapshot, the volume size must be equal to or
     * larger than the snapshot size.
     * </p>
     *
     * @param volumeSize <p>
     *            The size of the volume, in GiB.
     *            </p>
     *            <p>
     *            Default: If you're creating the volume from a snapshot and
     *            don't specify a volume size, the default is the snapshot size.
     *            </p>
     *            <p>
     *            Constraints: 1-16384 for General Purpose SSD (<code>gp2</code>
     *            ), 4-16384 for Provisioned IOPS SSD (<code>io1</code>),
     *            500-16384 for Throughput Optimized HDD (<code>st1</code>),
     *            500-16384 for Cold HDD (<code>sc1</code>), and 1-1024 for
     *            Magnetic (<code>standard</code>) volumes. If you specify a
     *            snapshot, the volume size must be equal to or larger than the
     *            snapshot size.
     *            </p>
     */
    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify
     * a volume size, the default is the snapshot size.
     * </p>
     * <p>
     * Constraints: 1-16384 for General Purpose SSD (<code>gp2</code>), 4-16384
     * for Provisioned IOPS SSD (<code>io1</code>), 500-16384 for Throughput
     * Optimized HDD (<code>st1</code>), 500-16384 for Cold HDD (
     * <code>sc1</code>), and 1-1024 for Magnetic (<code>standard</code>)
     * volumes. If you specify a snapshot, the volume size must be equal to or
     * larger than the snapshot size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeSize <p>
     *            The size of the volume, in GiB.
     *            </p>
     *            <p>
     *            Default: If you're creating the volume from a snapshot and
     *            don't specify a volume size, the default is the snapshot size.
     *            </p>
     *            <p>
     *            Constraints: 1-16384 for General Purpose SSD (<code>gp2</code>
     *            ), 4-16384 for Provisioned IOPS SSD (<code>io1</code>),
     *            500-16384 for Throughput Optimized HDD (<code>st1</code>),
     *            500-16384 for Cold HDD (<code>sc1</code>), and 1-1024 for
     *            Magnetic (<code>standard</code>) volumes. If you specify a
     *            snapshot, the volume size must be equal to or larger than the
     *            snapshot size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsBlockDevice withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * <p>
     * The volume type. If you set the type to <code>io1</code>, you must also
     * specify the <b>Iops</b> parameter. If you set the type to
     * <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or
     * <code>standard</code>, you must omit the <b>Iops</b> parameter.
     * </p>
     * <p>
     * Default: <code>gp2</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @return <p>
     *         The volume type. If you set the type to <code>io1</code>, you
     *         must also specify the <b>Iops</b> parameter. If you set the type
     *         to <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or
     *         <code>standard</code>, you must omit the <b>Iops</b> parameter.
     *         </p>
     *         <p>
     *         Default: <code>gp2</code>
     *         </p>
     * @see VolumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    /**
     * <p>
     * The volume type. If you set the type to <code>io1</code>, you must also
     * specify the <b>Iops</b> parameter. If you set the type to
     * <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or
     * <code>standard</code>, you must omit the <b>Iops</b> parameter.
     * </p>
     * <p>
     * Default: <code>gp2</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param volumeType <p>
     *            The volume type. If you set the type to <code>io1</code>, you
     *            must also specify the <b>Iops</b> parameter. If you set the
     *            type to <code>gp2</code>, <code>st1</code>, <code>sc1</code>,
     *            or <code>standard</code>, you must omit the <b>Iops</b>
     *            parameter.
     *            </p>
     *            <p>
     *            Default: <code>gp2</code>
     *            </p>
     * @see VolumeType
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type. If you set the type to <code>io1</code>, you must also
     * specify the <b>Iops</b> parameter. If you set the type to
     * <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or
     * <code>standard</code>, you must omit the <b>Iops</b> parameter.
     * </p>
     * <p>
     * Default: <code>gp2</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param volumeType <p>
     *            The volume type. If you set the type to <code>io1</code>, you
     *            must also specify the <b>Iops</b> parameter. If you set the
     *            type to <code>gp2</code>, <code>st1</code>, <code>sc1</code>,
     *            or <code>standard</code>, you must omit the <b>Iops</b>
     *            parameter.
     *            </p>
     *            <p>
     *            Default: <code>gp2</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeType
     */
    public EbsBlockDevice withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * <p>
     * The volume type. If you set the type to <code>io1</code>, you must also
     * specify the <b>Iops</b> parameter. If you set the type to
     * <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or
     * <code>standard</code>, you must omit the <b>Iops</b> parameter.
     * </p>
     * <p>
     * Default: <code>gp2</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param volumeType <p>
     *            The volume type. If you set the type to <code>io1</code>, you
     *            must also specify the <b>Iops</b> parameter. If you set the
     *            type to <code>gp2</code>, <code>st1</code>, <code>sc1</code>,
     *            or <code>standard</code>, you must omit the <b>Iops</b>
     *            parameter.
     *            </p>
     *            <p>
     *            Default: <code>gp2</code>
     *            </p>
     * @see VolumeType
     */
    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
    }

    /**
     * <p>
     * The volume type. If you set the type to <code>io1</code>, you must also
     * specify the <b>Iops</b> parameter. If you set the type to
     * <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or
     * <code>standard</code>, you must omit the <b>Iops</b> parameter.
     * </p>
     * <p>
     * Default: <code>gp2</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param volumeType <p>
     *            The volume type. If you set the type to <code>io1</code>, you
     *            must also specify the <b>Iops</b> parameter. If you set the
     *            type to <code>gp2</code>, <code>st1</code>, <code>sc1</code>,
     *            or <code>standard</code>, you must omit the <b>Iops</b>
     *            parameter.
     *            </p>
     *            <p>
     *            Default: <code>gp2</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeType
     */
    public EbsBlockDevice withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }

    /**
     * <p>
     * Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer
     * managed CMK under which the EBS volume is encrypted.
     * </p>
     * <p>
     * This parameter is only supported on <code>BlockDeviceMapping</code>
     * objects called by <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     * >RunInstances</a>, <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html"
     * >RequestSpotFleet</a>, and <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html"
     * >RequestSpotInstances</a>.
     * </p>
     *
     * @return <p>
     *         Identifier (key ID, key alias, ID ARN, or alias ARN) for a
     *         customer managed CMK under which the EBS volume is encrypted.
     *         </p>
     *         <p>
     *         This parameter is only supported on
     *         <code>BlockDeviceMapping</code> objects called by <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     *         >RunInstances</a>, <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html"
     *         >RequestSpotFleet</a>, and <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html"
     *         >RequestSpotInstances</a>.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer
     * managed CMK under which the EBS volume is encrypted.
     * </p>
     * <p>
     * This parameter is only supported on <code>BlockDeviceMapping</code>
     * objects called by <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     * >RunInstances</a>, <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html"
     * >RequestSpotFleet</a>, and <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html"
     * >RequestSpotInstances</a>.
     * </p>
     *
     * @param kmsKeyId <p>
     *            Identifier (key ID, key alias, ID ARN, or alias ARN) for a
     *            customer managed CMK under which the EBS volume is encrypted.
     *            </p>
     *            <p>
     *            This parameter is only supported on
     *            <code>BlockDeviceMapping</code> objects called by <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     *            >RunInstances</a>, <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html"
     *            >RequestSpotFleet</a>, and <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html"
     *            >RequestSpotInstances</a>.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer
     * managed CMK under which the EBS volume is encrypted.
     * </p>
     * <p>
     * This parameter is only supported on <code>BlockDeviceMapping</code>
     * objects called by <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     * >RunInstances</a>, <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html"
     * >RequestSpotFleet</a>, and <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html"
     * >RequestSpotInstances</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            Identifier (key ID, key alias, ID ARN, or alias ARN) for a
     *            customer managed CMK under which the EBS volume is encrypted.
     *            </p>
     *            <p>
     *            This parameter is only supported on
     *            <code>BlockDeviceMapping</code> objects called by <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html"
     *            >RunInstances</a>, <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html"
     *            >RequestSpotFleet</a>, and <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html"
     *            >RequestSpotInstances</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsBlockDevice withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * Indicates whether the encryption state of an EBS volume is changed while
     * being restored from a backing snapshot. The effect of setting the
     * encryption state to <code>true</code> depends on the volume origin (new
     * or from a snapshot), starting encryption state, ownership, and whether
     * encryption by default is enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * In no case can you remove encryption from an encrypted volume.
     * </p>
     * <p>
     * Encrypted volumes can only be attached to instances that support Amazon
     * EBS encryption. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported Instance Types</a>.
     * </p>
     * <p>
     * This parameter is not returned by .
     * </p>
     *
     * @return <p>
     *         Indicates whether the encryption state of an EBS volume is
     *         changed while being restored from a backing snapshot. The effect
     *         of setting the encryption state to <code>true</code> depends on
     *         the volume origin (new or from a snapshot), starting encryption
     *         state, ownership, and whether encryption by default is enabled.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters"
     *         >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>.
     *         </p>
     *         <p>
     *         In no case can you remove encryption from an encrypted volume.
     *         </p>
     *         <p>
     *         Encrypted volumes can only be attached to instances that support
     *         Amazon EBS encryption. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     *         >Supported Instance Types</a>.
     *         </p>
     *         <p>
     *         This parameter is not returned by .
     *         </p>
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Indicates whether the encryption state of an EBS volume is changed while
     * being restored from a backing snapshot. The effect of setting the
     * encryption state to <code>true</code> depends on the volume origin (new
     * or from a snapshot), starting encryption state, ownership, and whether
     * encryption by default is enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * In no case can you remove encryption from an encrypted volume.
     * </p>
     * <p>
     * Encrypted volumes can only be attached to instances that support Amazon
     * EBS encryption. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported Instance Types</a>.
     * </p>
     * <p>
     * This parameter is not returned by .
     * </p>
     *
     * @return <p>
     *         Indicates whether the encryption state of an EBS volume is
     *         changed while being restored from a backing snapshot. The effect
     *         of setting the encryption state to <code>true</code> depends on
     *         the volume origin (new or from a snapshot), starting encryption
     *         state, ownership, and whether encryption by default is enabled.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters"
     *         >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>.
     *         </p>
     *         <p>
     *         In no case can you remove encryption from an encrypted volume.
     *         </p>
     *         <p>
     *         Encrypted volumes can only be attached to instances that support
     *         Amazon EBS encryption. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     *         >Supported Instance Types</a>.
     *         </p>
     *         <p>
     *         This parameter is not returned by .
     *         </p>
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Indicates whether the encryption state of an EBS volume is changed while
     * being restored from a backing snapshot. The effect of setting the
     * encryption state to <code>true</code> depends on the volume origin (new
     * or from a snapshot), starting encryption state, ownership, and whether
     * encryption by default is enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * In no case can you remove encryption from an encrypted volume.
     * </p>
     * <p>
     * Encrypted volumes can only be attached to instances that support Amazon
     * EBS encryption. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported Instance Types</a>.
     * </p>
     * <p>
     * This parameter is not returned by .
     * </p>
     *
     * @param encrypted <p>
     *            Indicates whether the encryption state of an EBS volume is
     *            changed while being restored from a backing snapshot. The
     *            effect of setting the encryption state to <code>true</code>
     *            depends on the volume origin (new or from a snapshot),
     *            starting encryption state, ownership, and whether encryption
     *            by default is enabled. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters"
     *            >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            <p>
     *            In no case can you remove encryption from an encrypted volume.
     *            </p>
     *            <p>
     *            Encrypted volumes can only be attached to instances that
     *            support Amazon EBS encryption. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     *            >Supported Instance Types</a>.
     *            </p>
     *            <p>
     *            This parameter is not returned by .
     *            </p>
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the encryption state of an EBS volume is changed while
     * being restored from a backing snapshot. The effect of setting the
     * encryption state to <code>true</code> depends on the volume origin (new
     * or from a snapshot), starting encryption state, ownership, and whether
     * encryption by default is enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * In no case can you remove encryption from an encrypted volume.
     * </p>
     * <p>
     * Encrypted volumes can only be attached to instances that support Amazon
     * EBS encryption. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported Instance Types</a>.
     * </p>
     * <p>
     * This parameter is not returned by .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            Indicates whether the encryption state of an EBS volume is
     *            changed while being restored from a backing snapshot. The
     *            effect of setting the encryption state to <code>true</code>
     *            depends on the volume origin (new or from a snapshot),
     *            starting encryption state, ownership, and whether encryption
     *            by default is enabled. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters"
     *            >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            <p>
     *            In no case can you remove encryption from an encrypted volume.
     *            </p>
     *            <p>
     *            Encrypted volumes can only be attached to instances that
     *            support Amazon EBS encryption. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     *            >Supported Instance Types</a>.
     *            </p>
     *            <p>
     *            This parameter is not returned by .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsBlockDevice withEncrypted(Boolean encrypted) {
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
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: " + getDeleteOnTermination() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops() + ",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getVolumeSize() != null)
            sb.append("VolumeSize: " + getVolumeSize() + ",");
        if (getVolumeType() != null)
            sb.append("VolumeType: " + getVolumeType() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsBlockDevice == false)
            return false;
        EbsBlockDevice other = (EbsBlockDevice) obj;

        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null
                && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
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
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null
                && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        return true;
    }
}
