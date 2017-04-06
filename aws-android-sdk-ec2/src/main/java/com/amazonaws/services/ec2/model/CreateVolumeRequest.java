/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateVolumeRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createVolume(CreateVolumeRequest) CreateVolume operation}.
 * <p>
 * Creates an EBS volume that can be attached to an instance in the same
 * Availability Zone. The volume is created in the regional endpoint that
 * you send the HTTP request to. For more information see
 * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html"> Regions and Endpoints </a>
 * .
 * </p>
 * <p>
 * You can create a new empty volume or restore a volume from an EBS
 * snapshot. Any AWS Marketplace product codes from the snapshot are
 * propagated to the volume.
 * </p>
 * <p>
 * You can create encrypted volumes with the <code>Encrypted</code>
 * parameter. Encrypted volumes may only be attached to instances that
 * support Amazon EBS encryption. Volumes that are created from encrypted
 * snapshots are also automatically encrypted. For more information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"> Amazon EBS Encryption </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-creating-volume.html"> Creating or Restoring an Amazon EBS Volume </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createVolume(CreateVolumeRequest)
 */
public class CreateVolumeRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateVolumeRequest> {

    /**
     * The size of the volume, in GiBs. <p>Constraints: 1-16384 for
     * <code>gp2</code>, 4-16384 for <code>io1</code>, 500-16384 for
     * <code>st1</code>, 500-16384 for <code>sc1</code>, and 1-1024 for
     * <code>standard</code>. If you specify a snapshot, the volume size must
     * be equal to or larger than the snapshot size. <p>Default: If you're
     * creating the volume from a snapshot and don't specify a volume size,
     * the default is the snapshot size.
     */
    private Integer size;

    /**
     * The snapshot from which to create the volume.
     */
    private String snapshotId;

    /**
     * The Availability Zone in which to create the volume. Use
     * <a>DescribeAvailabilityZones</a> to list the Availability Zones that
     * are currently available to you.
     */
    private String availabilityZone;

    /**
     * The volume type. This can be <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     * Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     * <code>standard</code> for Magnetic volumes. <p>Default:
     * <code>standard</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     */
    private String volumeType;

    /**
     * Only valid for Provisioned IOPS SSD volumes. The number of I/O
     * operations per second (IOPS) to provision for the volume, with a
     * maximum ratio of 30 IOPS/GiB. <p>Constraint: Range is 100 to 20000 for
     * Provisioned IOPS SSD volumes
     */
    private Integer iops;

    /**
     * Specifies whether the volume should be encrypted. Encrypted Amazon EBS
     * volumes may only be attached to instances that support Amazon EBS
     * encryption. Volumes that are created from encrypted snapshots are
     * automatically encrypted. There is no way to create an encrypted volume
     * from an unencrypted snapshot or vice versa. If your AMI uses encrypted
     * volumes, you can only launch it on supported instance types. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     */
    private Boolean encrypted;

    /**
     * The full ARN of the AWS Key Management Service (AWS KMS) customer
     * master key (CMK) to use when creating the encrypted volume. This
     * parameter is only required if you want to use a non-default CMK; if
     * this parameter is not specified, the default CMK for EBS is used. The
     * ARN contains the <code>arn:aws:kms</code> namespace, followed by the
     * region of the CMK, the AWS account ID of the CMK owner, the
     * <code>key</code> namespace, and then the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * If a <code>KmsKeyId</code> is specified, the <code>Encrypted</code>
     * flag must also be set.
     */
    private String kmsKeyId;

    /**
     * Default constructor for a new CreateVolumeRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateVolumeRequest() {}
    
    /**
     * Constructs a new CreateVolumeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param size The size of the volume, in GiBs. <p>Constraints: 1-16384
     * for <code>gp2</code>, 4-16384 for <code>io1</code>, 500-16384 for
     * <code>st1</code>, 500-16384 for <code>sc1</code>, and 1-1024 for
     * <code>standard</code>. If you specify a snapshot, the volume size must
     * be equal to or larger than the snapshot size. <p>Default: If you're
     * creating the volume from a snapshot and don't specify a volume size,
     * the default is the snapshot size.
     * @param availabilityZone The Availability Zone in which to create the
     * volume. Use <a>DescribeAvailabilityZones</a> to list the Availability
     * Zones that are currently available to you.
     */
    public CreateVolumeRequest(Integer size, String availabilityZone) {
        setSize(size);
        setAvailabilityZone(availabilityZone);
    }

    /**
     * Constructs a new CreateVolumeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param snapshotId The snapshot from which to create the volume.
     * @param availabilityZone The Availability Zone in which to create the
     * volume. Use <a>DescribeAvailabilityZones</a> to list the Availability
     * Zones that are currently available to you.
     */
    public CreateVolumeRequest(String snapshotId, String availabilityZone) {
        setSnapshotId(snapshotId);
        setAvailabilityZone(availabilityZone);
    }

    /**
     * The size of the volume, in GiBs. <p>Constraints: 1-16384 for
     * <code>gp2</code>, 4-16384 for <code>io1</code>, 500-16384 for
     * <code>st1</code>, 500-16384 for <code>sc1</code>, and 1-1024 for
     * <code>standard</code>. If you specify a snapshot, the volume size must
     * be equal to or larger than the snapshot size. <p>Default: If you're
     * creating the volume from a snapshot and don't specify a volume size,
     * the default is the snapshot size.
     *
     * @return The size of the volume, in GiBs. <p>Constraints: 1-16384 for
     *         <code>gp2</code>, 4-16384 for <code>io1</code>, 500-16384 for
     *         <code>st1</code>, 500-16384 for <code>sc1</code>, and 1-1024 for
     *         <code>standard</code>. If you specify a snapshot, the volume size must
     *         be equal to or larger than the snapshot size. <p>Default: If you're
     *         creating the volume from a snapshot and don't specify a volume size,
     *         the default is the snapshot size.
     */
    public Integer getSize() {
        return size;
    }
    
    /**
     * The size of the volume, in GiBs. <p>Constraints: 1-16384 for
     * <code>gp2</code>, 4-16384 for <code>io1</code>, 500-16384 for
     * <code>st1</code>, 500-16384 for <code>sc1</code>, and 1-1024 for
     * <code>standard</code>. If you specify a snapshot, the volume size must
     * be equal to or larger than the snapshot size. <p>Default: If you're
     * creating the volume from a snapshot and don't specify a volume size,
     * the default is the snapshot size.
     *
     * @param size The size of the volume, in GiBs. <p>Constraints: 1-16384 for
     *         <code>gp2</code>, 4-16384 for <code>io1</code>, 500-16384 for
     *         <code>st1</code>, 500-16384 for <code>sc1</code>, and 1-1024 for
     *         <code>standard</code>. If you specify a snapshot, the volume size must
     *         be equal to or larger than the snapshot size. <p>Default: If you're
     *         creating the volume from a snapshot and don't specify a volume size,
     *         the default is the snapshot size.
     */
    public void setSize(Integer size) {
        this.size = size;
    }
    
    /**
     * The size of the volume, in GiBs. <p>Constraints: 1-16384 for
     * <code>gp2</code>, 4-16384 for <code>io1</code>, 500-16384 for
     * <code>st1</code>, 500-16384 for <code>sc1</code>, and 1-1024 for
     * <code>standard</code>. If you specify a snapshot, the volume size must
     * be equal to or larger than the snapshot size. <p>Default: If you're
     * creating the volume from a snapshot and don't specify a volume size,
     * the default is the snapshot size.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param size The size of the volume, in GiBs. <p>Constraints: 1-16384 for
     *         <code>gp2</code>, 4-16384 for <code>io1</code>, 500-16384 for
     *         <code>st1</code>, 500-16384 for <code>sc1</code>, and 1-1024 for
     *         <code>standard</code>. If you specify a snapshot, the volume size must
     *         be equal to or larger than the snapshot size. <p>Default: If you're
     *         creating the volume from a snapshot and don't specify a volume size,
     *         the default is the snapshot size.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateVolumeRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * The snapshot from which to create the volume.
     *
     * @return The snapshot from which to create the volume.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The snapshot from which to create the volume.
     *
     * @param snapshotId The snapshot from which to create the volume.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The snapshot from which to create the volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotId The snapshot from which to create the volume.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateVolumeRequest withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * The Availability Zone in which to create the volume. Use
     * <a>DescribeAvailabilityZones</a> to list the Availability Zones that
     * are currently available to you.
     *
     * @return The Availability Zone in which to create the volume. Use
     *         <a>DescribeAvailabilityZones</a> to list the Availability Zones that
     *         are currently available to you.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone in which to create the volume. Use
     * <a>DescribeAvailabilityZones</a> to list the Availability Zones that
     * are currently available to you.
     *
     * @param availabilityZone The Availability Zone in which to create the volume. Use
     *         <a>DescribeAvailabilityZones</a> to list the Availability Zones that
     *         are currently available to you.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone in which to create the volume. Use
     * <a>DescribeAvailabilityZones</a> to list the Availability Zones that
     * are currently available to you.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone in which to create the volume. Use
     *         <a>DescribeAvailabilityZones</a> to list the Availability Zones that
     *         are currently available to you.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateVolumeRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The volume type. This can be <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     * Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     * <code>standard</code> for Magnetic volumes. <p>Default:
     * <code>standard</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @return The volume type. This can be <code>gp2</code> for General Purpose SSD,
     *         <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     *         Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *         <code>standard</code> for Magnetic volumes. <p>Default:
     *         <code>standard</code>
     *
     * @see VolumeType
     */
    public String getVolumeType() {
        return volumeType;
    }
    
    /**
     * The volume type. This can be <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     * Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     * <code>standard</code> for Magnetic volumes. <p>Default:
     * <code>standard</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param volumeType The volume type. This can be <code>gp2</code> for General Purpose SSD,
     *         <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     *         Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *         <code>standard</code> for Magnetic volumes. <p>Default:
     *         <code>standard</code>
     *
     * @see VolumeType
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }
    
    /**
     * The volume type. This can be <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     * Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     * <code>standard</code> for Magnetic volumes. <p>Default:
     * <code>standard</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param volumeType The volume type. This can be <code>gp2</code> for General Purpose SSD,
     *         <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     *         Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *         <code>standard</code> for Magnetic volumes. <p>Default:
     *         <code>standard</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see VolumeType
     */
    public CreateVolumeRequest withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * The volume type. This can be <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     * Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     * <code>standard</code> for Magnetic volumes. <p>Default:
     * <code>standard</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param volumeType The volume type. This can be <code>gp2</code> for General Purpose SSD,
     *         <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     *         Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *         <code>standard</code> for Magnetic volumes. <p>Default:
     *         <code>standard</code>
     *
     * @see VolumeType
     */
    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
    }
    
    /**
     * The volume type. This can be <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     * Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     * <code>standard</code> for Magnetic volumes. <p>Default:
     * <code>standard</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param volumeType The volume type. This can be <code>gp2</code> for General Purpose SSD,
     *         <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     *         Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *         <code>standard</code> for Magnetic volumes. <p>Default:
     *         <code>standard</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see VolumeType
     */
    public CreateVolumeRequest withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }

    /**
     * Only valid for Provisioned IOPS SSD volumes. The number of I/O
     * operations per second (IOPS) to provision for the volume, with a
     * maximum ratio of 30 IOPS/GiB. <p>Constraint: Range is 100 to 20000 for
     * Provisioned IOPS SSD volumes
     *
     * @return Only valid for Provisioned IOPS SSD volumes. The number of I/O
     *         operations per second (IOPS) to provision for the volume, with a
     *         maximum ratio of 30 IOPS/GiB. <p>Constraint: Range is 100 to 20000 for
     *         Provisioned IOPS SSD volumes
     */
    public Integer getIops() {
        return iops;
    }
    
    /**
     * Only valid for Provisioned IOPS SSD volumes. The number of I/O
     * operations per second (IOPS) to provision for the volume, with a
     * maximum ratio of 30 IOPS/GiB. <p>Constraint: Range is 100 to 20000 for
     * Provisioned IOPS SSD volumes
     *
     * @param iops Only valid for Provisioned IOPS SSD volumes. The number of I/O
     *         operations per second (IOPS) to provision for the volume, with a
     *         maximum ratio of 30 IOPS/GiB. <p>Constraint: Range is 100 to 20000 for
     *         Provisioned IOPS SSD volumes
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }
    
    /**
     * Only valid for Provisioned IOPS SSD volumes. The number of I/O
     * operations per second (IOPS) to provision for the volume, with a
     * maximum ratio of 30 IOPS/GiB. <p>Constraint: Range is 100 to 20000 for
     * Provisioned IOPS SSD volumes
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iops Only valid for Provisioned IOPS SSD volumes. The number of I/O
     *         operations per second (IOPS) to provision for the volume, with a
     *         maximum ratio of 30 IOPS/GiB. <p>Constraint: Range is 100 to 20000 for
     *         Provisioned IOPS SSD volumes
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateVolumeRequest withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * Specifies whether the volume should be encrypted. Encrypted Amazon EBS
     * volumes may only be attached to instances that support Amazon EBS
     * encryption. Volumes that are created from encrypted snapshots are
     * automatically encrypted. There is no way to create an encrypted volume
     * from an unencrypted snapshot or vice versa. If your AMI uses encrypted
     * volumes, you can only launch it on supported instance types. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     *
     * @return Specifies whether the volume should be encrypted. Encrypted Amazon EBS
     *         volumes may only be attached to instances that support Amazon EBS
     *         encryption. Volumes that are created from encrypted snapshots are
     *         automatically encrypted. There is no way to create an encrypted volume
     *         from an unencrypted snapshot or vice versa. If your AMI uses encrypted
     *         volumes, you can only launch it on supported instance types. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     *         EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public Boolean isEncrypted() {
        return encrypted;
    }
    
    /**
     * Specifies whether the volume should be encrypted. Encrypted Amazon EBS
     * volumes may only be attached to instances that support Amazon EBS
     * encryption. Volumes that are created from encrypted snapshots are
     * automatically encrypted. There is no way to create an encrypted volume
     * from an unencrypted snapshot or vice versa. If your AMI uses encrypted
     * volumes, you can only launch it on supported instance types. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     *
     * @param encrypted Specifies whether the volume should be encrypted. Encrypted Amazon EBS
     *         volumes may only be attached to instances that support Amazon EBS
     *         encryption. Volumes that are created from encrypted snapshots are
     *         automatically encrypted. There is no way to create an encrypted volume
     *         from an unencrypted snapshot or vice versa. If your AMI uses encrypted
     *         volumes, you can only launch it on supported instance types. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     *         EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }
    
    /**
     * Specifies whether the volume should be encrypted. Encrypted Amazon EBS
     * volumes may only be attached to instances that support Amazon EBS
     * encryption. Volumes that are created from encrypted snapshots are
     * automatically encrypted. There is no way to create an encrypted volume
     * from an unencrypted snapshot or vice versa. If your AMI uses encrypted
     * volumes, you can only launch it on supported instance types. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param encrypted Specifies whether the volume should be encrypted. Encrypted Amazon EBS
     *         volumes may only be attached to instances that support Amazon EBS
     *         encryption. Volumes that are created from encrypted snapshots are
     *         automatically encrypted. There is no way to create an encrypted volume
     *         from an unencrypted snapshot or vice versa. If your AMI uses encrypted
     *         volumes, you can only launch it on supported instance types. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     *         EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateVolumeRequest withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * Specifies whether the volume should be encrypted. Encrypted Amazon EBS
     * volumes may only be attached to instances that support Amazon EBS
     * encryption. Volumes that are created from encrypted snapshots are
     * automatically encrypted. There is no way to create an encrypted volume
     * from an unencrypted snapshot or vice versa. If your AMI uses encrypted
     * volumes, you can only launch it on supported instance types. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     *
     * @return Specifies whether the volume should be encrypted. Encrypted Amazon EBS
     *         volumes may only be attached to instances that support Amazon EBS
     *         encryption. Volumes that are created from encrypted snapshots are
     *         automatically encrypted. There is no way to create an encrypted volume
     *         from an unencrypted snapshot or vice versa. If your AMI uses encrypted
     *         volumes, you can only launch it on supported instance types. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     *         EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * The full ARN of the AWS Key Management Service (AWS KMS) customer
     * master key (CMK) to use when creating the encrypted volume. This
     * parameter is only required if you want to use a non-default CMK; if
     * this parameter is not specified, the default CMK for EBS is used. The
     * ARN contains the <code>arn:aws:kms</code> namespace, followed by the
     * region of the CMK, the AWS account ID of the CMK owner, the
     * <code>key</code> namespace, and then the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * If a <code>KmsKeyId</code> is specified, the <code>Encrypted</code>
     * flag must also be set.
     *
     * @return The full ARN of the AWS Key Management Service (AWS KMS) customer
     *         master key (CMK) to use when creating the encrypted volume. This
     *         parameter is only required if you want to use a non-default CMK; if
     *         this parameter is not specified, the default CMK for EBS is used. The
     *         ARN contains the <code>arn:aws:kms</code> namespace, followed by the
     *         region of the CMK, the AWS account ID of the CMK owner, the
     *         <code>key</code> namespace, and then the CMK ID. For example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *         If a <code>KmsKeyId</code> is specified, the <code>Encrypted</code>
     *         flag must also be set.
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }
    
    /**
     * The full ARN of the AWS Key Management Service (AWS KMS) customer
     * master key (CMK) to use when creating the encrypted volume. This
     * parameter is only required if you want to use a non-default CMK; if
     * this parameter is not specified, the default CMK for EBS is used. The
     * ARN contains the <code>arn:aws:kms</code> namespace, followed by the
     * region of the CMK, the AWS account ID of the CMK owner, the
     * <code>key</code> namespace, and then the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * If a <code>KmsKeyId</code> is specified, the <code>Encrypted</code>
     * flag must also be set.
     *
     * @param kmsKeyId The full ARN of the AWS Key Management Service (AWS KMS) customer
     *         master key (CMK) to use when creating the encrypted volume. This
     *         parameter is only required if you want to use a non-default CMK; if
     *         this parameter is not specified, the default CMK for EBS is used. The
     *         ARN contains the <code>arn:aws:kms</code> namespace, followed by the
     *         region of the CMK, the AWS account ID of the CMK owner, the
     *         <code>key</code> namespace, and then the CMK ID. For example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *         If a <code>KmsKeyId</code> is specified, the <code>Encrypted</code>
     *         flag must also be set.
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }
    
    /**
     * The full ARN of the AWS Key Management Service (AWS KMS) customer
     * master key (CMK) to use when creating the encrypted volume. This
     * parameter is only required if you want to use a non-default CMK; if
     * this parameter is not specified, the default CMK for EBS is used. The
     * ARN contains the <code>arn:aws:kms</code> namespace, followed by the
     * region of the CMK, the AWS account ID of the CMK owner, the
     * <code>key</code> namespace, and then the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * If a <code>KmsKeyId</code> is specified, the <code>Encrypted</code>
     * flag must also be set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kmsKeyId The full ARN of the AWS Key Management Service (AWS KMS) customer
     *         master key (CMK) to use when creating the encrypted volume. This
     *         parameter is only required if you want to use a non-default CMK; if
     *         this parameter is not specified, the default CMK for EBS is used. The
     *         ARN contains the <code>arn:aws:kms</code> namespace, followed by the
     *         region of the CMK, the AWS account ID of the CMK owner, the
     *         <code>key</code> namespace, and then the CMK ID. For example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *         If a <code>KmsKeyId</code> is specified, the <code>Encrypted</code>
     *         flag must also be set.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateVolumeRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateVolumeRequest> getDryRunRequest() {
        Request<CreateVolumeRequest> request = new CreateVolumeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSize() != null) sb.append("Size: " + getSize() + ",");
        if (getSnapshotId() != null) sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getVolumeType() != null) sb.append("VolumeType: " + getVolumeType() + ",");
        if (getIops() != null) sb.append("Iops: " + getIops() + ",");
        if (isEncrypted() != null) sb.append("Encrypted: " + isEncrypted() + ",");
        if (getKmsKeyId() != null) sb.append("KmsKeyId: " + getKmsKeyId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode()); 
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode()); 
        hashCode = prime * hashCode + ((isEncrypted() == null) ? 0 : isEncrypted().hashCode()); 
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateVolumeRequest == false) return false;
        CreateVolumeRequest other = (CreateVolumeRequest)obj;
        
        if (other.getSize() == null ^ this.getSize() == null) return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false) return false; 
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null) return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getVolumeType() == null ^ this.getVolumeType() == null) return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false) return false; 
        if (other.getIops() == null ^ this.getIops() == null) return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false) return false; 
        if (other.isEncrypted() == null ^ this.isEncrypted() == null) return false;
        if (other.isEncrypted() != null && other.isEncrypted().equals(this.isEncrypted()) == false) return false; 
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null) return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false) return false; 
        return true;
    }
    
}
    