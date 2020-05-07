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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an EBS volume that can be attached to an instance in the same
 * Availability Zone. The volume is created in the regional endpoint that you
 * send the HTTP request to. For more information see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and
 * Endpoints</a>.
 * </p>
 * <p>
 * You can create a new empty volume or restore a volume from an EBS snapshot.
 * Any AWS Marketplace product codes from the snapshot are propagated to the
 * volume.
 * </p>
 * <p>
 * You can create encrypted volumes. Encrypted volumes must be attached to
 * instances that support Amazon EBS encryption. Volumes that are created from
 * encrypted snapshots are also automatically encrypted. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
 * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 * <p>
 * You can tag your volumes during creation. For more information, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
 * >Tagging Your Amazon EC2 Resources</a> in the <i>Amazon Elastic Compute Cloud
 * User Guide</i>.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-creating-volume.html"
 * >Creating an Amazon EBS Volume</a> in the <i>Amazon Elastic Compute Cloud
 * User Guide</i>.
 * </p>
 */
public class CreateVolumeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Availability Zone in which to create the volume.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * Specifies whether the volume should be encrypted. The effect of setting
     * the encryption state to <code>true</code> depends on the volume origin
     * (new or from a snapshot), starting encryption state, ownership, and
     * whether encryption by default is enabled. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default"
     * >Encryption by Default</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Encrypted Amazon EBS volumes must be attached to instances that support
     * Amazon EBS encryption. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported Instance Types</a>.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * The number of I/O operations per second (IOPS) to provision for the
     * volume, with a maximum ratio of 50 IOPS/GiB. Range is 100 to 64,000 IOPS
     * for volumes in most Regions. Maximum IOPS of 64,000 is guaranteed only on
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instances</a>. Other instance families guarantee performance
     * up to 32,000 IOPS. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * This parameter is valid only for Provisioned IOPS SSD (io1) volumes.
     * </p>
     */
    private Integer iops;

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer
     * master key (CMK) to use for Amazon EBS encryption. If this parameter is
     * not specified, your AWS managed CMK for EBS is used. If
     * <code>KmsKeyId</code> is specified, the encrypted state must be
     * <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key
     * /<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias
     * /<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an
     * ID, alias, or ARN that is not valid, the action can appear to complete,
     * but eventually fails.
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
     * The size of the volume, in GiBs. You must specify either a snapshot ID or
     * a volume size.
     * </p>
     * <p>
     * Constraints: 1-16,384 for <code>gp2</code>, 4-16,384 for <code>io1</code>
     * , 500-16,384 for <code>st1</code>, 500-16,384 for <code>sc1</code>, and
     * 1-1,024 for <code>standard</code>. If you specify a snapshot, the volume
     * size must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify
     * a volume size, the default is the snapshot size.
     * </p>
     */
    private Integer size;

    /**
     * <p>
     * The snapshot from which to create the volume. You must specify either a
     * snapshot ID or a volume size.
     * </p>
     */
    private String snapshotId;

    /**
     * <p>
     * The volume type. This can be <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     * Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     * <code>standard</code> for Magnetic volumes.
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
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The tags to apply to the volume during creation.
     * </p>
     */
    private java.util.List<TagSpecification> tagSpecifications;

    /**
     * <p>
     * Specifies whether to enable Amazon EBS Multi-Attach. If you enable
     * Multi-Attach, you can attach the volume to up to 16 <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instances</a> in the same Availability Zone. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"
     * > Amazon EBS Multi-Attach</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     */
    private Boolean multiAttachEnabled;

    /**
     * <p>
     * The Availability Zone in which to create the volume.
     * </p>
     *
     * @return <p>
     *         The Availability Zone in which to create the volume.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to create the volume.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone in which to create the volume.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to create the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone in which to create the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * Specifies whether the volume should be encrypted. The effect of setting
     * the encryption state to <code>true</code> depends on the volume origin
     * (new or from a snapshot), starting encryption state, ownership, and
     * whether encryption by default is enabled. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default"
     * >Encryption by Default</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Encrypted Amazon EBS volumes must be attached to instances that support
     * Amazon EBS encryption. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported Instance Types</a>.
     * </p>
     *
     * @return <p>
     *         Specifies whether the volume should be encrypted. The effect of
     *         setting the encryption state to <code>true</code> depends on the
     *         volume origin (new or from a snapshot), starting encryption
     *         state, ownership, and whether encryption by default is enabled.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default"
     *         >Encryption by Default</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>.
     *         </p>
     *         <p>
     *         Encrypted Amazon EBS volumes must be attached to instances that
     *         support Amazon EBS encryption. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     *         >Supported Instance Types</a>.
     *         </p>
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Specifies whether the volume should be encrypted. The effect of setting
     * the encryption state to <code>true</code> depends on the volume origin
     * (new or from a snapshot), starting encryption state, ownership, and
     * whether encryption by default is enabled. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default"
     * >Encryption by Default</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Encrypted Amazon EBS volumes must be attached to instances that support
     * Amazon EBS encryption. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported Instance Types</a>.
     * </p>
     *
     * @return <p>
     *         Specifies whether the volume should be encrypted. The effect of
     *         setting the encryption state to <code>true</code> depends on the
     *         volume origin (new or from a snapshot), starting encryption
     *         state, ownership, and whether encryption by default is enabled.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default"
     *         >Encryption by Default</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>.
     *         </p>
     *         <p>
     *         Encrypted Amazon EBS volumes must be attached to instances that
     *         support Amazon EBS encryption. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     *         >Supported Instance Types</a>.
     *         </p>
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Specifies whether the volume should be encrypted. The effect of setting
     * the encryption state to <code>true</code> depends on the volume origin
     * (new or from a snapshot), starting encryption state, ownership, and
     * whether encryption by default is enabled. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default"
     * >Encryption by Default</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Encrypted Amazon EBS volumes must be attached to instances that support
     * Amazon EBS encryption. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported Instance Types</a>.
     * </p>
     *
     * @param encrypted <p>
     *            Specifies whether the volume should be encrypted. The effect
     *            of setting the encryption state to <code>true</code> depends
     *            on the volume origin (new or from a snapshot), starting
     *            encryption state, ownership, and whether encryption by default
     *            is enabled. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default"
     *            >Encryption by Default</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            <p>
     *            Encrypted Amazon EBS volumes must be attached to instances
     *            that support Amazon EBS encryption. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     *            >Supported Instance Types</a>.
     *            </p>
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Specifies whether the volume should be encrypted. The effect of setting
     * the encryption state to <code>true</code> depends on the volume origin
     * (new or from a snapshot), starting encryption state, ownership, and
     * whether encryption by default is enabled. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default"
     * >Encryption by Default</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Encrypted Amazon EBS volumes must be attached to instances that support
     * Amazon EBS encryption. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported Instance Types</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            Specifies whether the volume should be encrypted. The effect
     *            of setting the encryption state to <code>true</code> depends
     *            on the volume origin (new or from a snapshot), starting
     *            encryption state, ownership, and whether encryption by default
     *            is enabled. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default"
     *            >Encryption by Default</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            <p>
     *            Encrypted Amazon EBS volumes must be attached to instances
     *            that support Amazon EBS encryption. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     *            >Supported Instance Types</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeRequest withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) to provision for the
     * volume, with a maximum ratio of 50 IOPS/GiB. Range is 100 to 64,000 IOPS
     * for volumes in most Regions. Maximum IOPS of 64,000 is guaranteed only on
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instances</a>. Other instance families guarantee performance
     * up to 32,000 IOPS. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * This parameter is valid only for Provisioned IOPS SSD (io1) volumes.
     * </p>
     *
     * @return <p>
     *         The number of I/O operations per second (IOPS) to provision for
     *         the volume, with a maximum ratio of 50 IOPS/GiB. Range is 100 to
     *         64,000 IOPS for volumes in most Regions. Maximum IOPS of 64,000
     *         is guaranteed only on <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *         >Nitro-based instances</a>. Other instance families guarantee
     *         performance up to 32,000 IOPS. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *         >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide</i>.
     *         </p>
     *         <p>
     *         This parameter is valid only for Provisioned IOPS SSD (io1)
     *         volumes.
     *         </p>
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) to provision for the
     * volume, with a maximum ratio of 50 IOPS/GiB. Range is 100 to 64,000 IOPS
     * for volumes in most Regions. Maximum IOPS of 64,000 is guaranteed only on
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instances</a>. Other instance families guarantee performance
     * up to 32,000 IOPS. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * This parameter is valid only for Provisioned IOPS SSD (io1) volumes.
     * </p>
     *
     * @param iops <p>
     *            The number of I/O operations per second (IOPS) to provision
     *            for the volume, with a maximum ratio of 50 IOPS/GiB. Range is
     *            100 to 64,000 IOPS for volumes in most Regions. Maximum IOPS
     *            of 64,000 is guaranteed only on <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *            >Nitro-based instances</a>. Other instance families guarantee
     *            performance up to 32,000 IOPS. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *            >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            <p>
     *            This parameter is valid only for Provisioned IOPS SSD (io1)
     *            volumes.
     *            </p>
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) to provision for the
     * volume, with a maximum ratio of 50 IOPS/GiB. Range is 100 to 64,000 IOPS
     * for volumes in most Regions. Maximum IOPS of 64,000 is guaranteed only on
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instances</a>. Other instance families guarantee performance
     * up to 32,000 IOPS. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * This parameter is valid only for Provisioned IOPS SSD (io1) volumes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iops <p>
     *            The number of I/O operations per second (IOPS) to provision
     *            for the volume, with a maximum ratio of 50 IOPS/GiB. Range is
     *            100 to 64,000 IOPS for volumes in most Regions. Maximum IOPS
     *            of 64,000 is guaranteed only on <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *            >Nitro-based instances</a>. Other instance families guarantee
     *            performance up to 32,000 IOPS. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *            >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            <p>
     *            This parameter is valid only for Provisioned IOPS SSD (io1)
     *            volumes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeRequest withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer
     * master key (CMK) to use for Amazon EBS encryption. If this parameter is
     * not specified, your AWS managed CMK for EBS is used. If
     * <code>KmsKeyId</code> is specified, the encrypted state must be
     * <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key
     * /<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias
     * /<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an
     * ID, alias, or ARN that is not valid, the action can appear to complete,
     * but eventually fails.
     * </p>
     *
     * @return <p>
     *         The identifier of the AWS Key Management Service (AWS KMS)
     *         customer master key (CMK) to use for Amazon EBS encryption. If
     *         this parameter is not specified, your AWS managed CMK for EBS is
     *         used. If <code>KmsKeyId</code> is specified, the encrypted state
     *         must be <code>true</code>.
     *         </p>
     *         <p>
     *         You can specify the CMK using any of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key alias. For example, alias/ExampleAlias.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN. For example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910
     *         </i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias ARN. For example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910
     *         </i>:alias/<i>ExampleAlias</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         AWS authenticates the CMK asynchronously. Therefore, if you
     *         specify an ID, alias, or ARN that is not valid, the action can
     *         appear to complete, but eventually fails.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer
     * master key (CMK) to use for Amazon EBS encryption. If this parameter is
     * not specified, your AWS managed CMK for EBS is used. If
     * <code>KmsKeyId</code> is specified, the encrypted state must be
     * <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key
     * /<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias
     * /<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an
     * ID, alias, or ARN that is not valid, the action can appear to complete,
     * but eventually fails.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The identifier of the AWS Key Management Service (AWS KMS)
     *            customer master key (CMK) to use for Amazon EBS encryption. If
     *            this parameter is not specified, your AWS managed CMK for EBS
     *            is used. If <code>KmsKeyId</code> is specified, the encrypted
     *            state must be <code>true</code>.
     *            </p>
     *            <p>
     *            You can specify the CMK using any of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key alias. For example, alias/ExampleAlias.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN. For example,
     *            arn:aws:kms:<i>us-east-1</i>:<i>012345678910
     *            </i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias ARN. For example,
     *            arn:aws:kms:<i>us-east-1</i>:<i>012345678910
     *            </i>:alias/<i>ExampleAlias</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            AWS authenticates the CMK asynchronously. Therefore, if you
     *            specify an ID, alias, or ARN that is not valid, the action can
     *            appear to complete, but eventually fails.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer
     * master key (CMK) to use for Amazon EBS encryption. If this parameter is
     * not specified, your AWS managed CMK for EBS is used. If
     * <code>KmsKeyId</code> is specified, the encrypted state must be
     * <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key
     * /<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias
     * /<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an
     * ID, alias, or ARN that is not valid, the action can appear to complete,
     * but eventually fails.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The identifier of the AWS Key Management Service (AWS KMS)
     *            customer master key (CMK) to use for Amazon EBS encryption. If
     *            this parameter is not specified, your AWS managed CMK for EBS
     *            is used. If <code>KmsKeyId</code> is specified, the encrypted
     *            state must be <code>true</code>.
     *            </p>
     *            <p>
     *            You can specify the CMK using any of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key alias. For example, alias/ExampleAlias.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN. For example,
     *            arn:aws:kms:<i>us-east-1</i>:<i>012345678910
     *            </i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias ARN. For example,
     *            arn:aws:kms:<i>us-east-1</i>:<i>012345678910
     *            </i>:alias/<i>ExampleAlias</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            AWS authenticates the CMK asynchronously. Therefore, if you
     *            specify an ID, alias, or ARN that is not valid, the action can
     *            appear to complete, but eventually fails.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeRequest withKmsKeyId(String kmsKeyId) {
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
    public CreateVolumeRequest withOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
        return this;
    }

    /**
     * <p>
     * The size of the volume, in GiBs. You must specify either a snapshot ID or
     * a volume size.
     * </p>
     * <p>
     * Constraints: 1-16,384 for <code>gp2</code>, 4-16,384 for <code>io1</code>
     * , 500-16,384 for <code>st1</code>, 500-16,384 for <code>sc1</code>, and
     * 1-1,024 for <code>standard</code>. If you specify a snapshot, the volume
     * size must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify
     * a volume size, the default is the snapshot size.
     * </p>
     *
     * @return <p>
     *         The size of the volume, in GiBs. You must specify either a
     *         snapshot ID or a volume size.
     *         </p>
     *         <p>
     *         Constraints: 1-16,384 for <code>gp2</code>, 4-16,384 for
     *         <code>io1</code>, 500-16,384 for <code>st1</code>, 500-16,384 for
     *         <code>sc1</code>, and 1-1,024 for <code>standard</code>. If you
     *         specify a snapshot, the volume size must be equal to or larger
     *         than the snapshot size.
     *         </p>
     *         <p>
     *         Default: If you're creating the volume from a snapshot and don't
     *         specify a volume size, the default is the snapshot size.
     *         </p>
     */
    public Integer getSize() {
        return size;
    }

    /**
     * <p>
     * The size of the volume, in GiBs. You must specify either a snapshot ID or
     * a volume size.
     * </p>
     * <p>
     * Constraints: 1-16,384 for <code>gp2</code>, 4-16,384 for <code>io1</code>
     * , 500-16,384 for <code>st1</code>, 500-16,384 for <code>sc1</code>, and
     * 1-1,024 for <code>standard</code>. If you specify a snapshot, the volume
     * size must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify
     * a volume size, the default is the snapshot size.
     * </p>
     *
     * @param size <p>
     *            The size of the volume, in GiBs. You must specify either a
     *            snapshot ID or a volume size.
     *            </p>
     *            <p>
     *            Constraints: 1-16,384 for <code>gp2</code>, 4-16,384 for
     *            <code>io1</code>, 500-16,384 for <code>st1</code>, 500-16,384
     *            for <code>sc1</code>, and 1-1,024 for <code>standard</code>.
     *            If you specify a snapshot, the volume size must be equal to or
     *            larger than the snapshot size.
     *            </p>
     *            <p>
     *            Default: If you're creating the volume from a snapshot and
     *            don't specify a volume size, the default is the snapshot size.
     *            </p>
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the volume, in GiBs. You must specify either a snapshot ID or
     * a volume size.
     * </p>
     * <p>
     * Constraints: 1-16,384 for <code>gp2</code>, 4-16,384 for <code>io1</code>
     * , 500-16,384 for <code>st1</code>, 500-16,384 for <code>sc1</code>, and
     * 1-1,024 for <code>standard</code>. If you specify a snapshot, the volume
     * size must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify
     * a volume size, the default is the snapshot size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param size <p>
     *            The size of the volume, in GiBs. You must specify either a
     *            snapshot ID or a volume size.
     *            </p>
     *            <p>
     *            Constraints: 1-16,384 for <code>gp2</code>, 4-16,384 for
     *            <code>io1</code>, 500-16,384 for <code>st1</code>, 500-16,384
     *            for <code>sc1</code>, and 1-1,024 for <code>standard</code>.
     *            If you specify a snapshot, the volume size must be equal to or
     *            larger than the snapshot size.
     *            </p>
     *            <p>
     *            Default: If you're creating the volume from a snapshot and
     *            don't specify a volume size, the default is the snapshot size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * <p>
     * The snapshot from which to create the volume. You must specify either a
     * snapshot ID or a volume size.
     * </p>
     *
     * @return <p>
     *         The snapshot from which to create the volume. You must specify
     *         either a snapshot ID or a volume size.
     *         </p>
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * <p>
     * The snapshot from which to create the volume. You must specify either a
     * snapshot ID or a volume size.
     * </p>
     *
     * @param snapshotId <p>
     *            The snapshot from which to create the volume. You must specify
     *            either a snapshot ID or a volume size.
     *            </p>
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The snapshot from which to create the volume. You must specify either a
     * snapshot ID or a volume size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotId <p>
     *            The snapshot from which to create the volume. You must specify
     *            either a snapshot ID or a volume size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeRequest withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
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
     * Default: <code>gp2</code>
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
     * The volume type. This can be <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     * Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     * <code>standard</code> for Magnetic volumes.
     * </p>
     * <p>
     * Default: <code>gp2</code>
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
     * The volume type. This can be <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     * Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     * <code>standard</code> for Magnetic volumes.
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
     *            The volume type. This can be <code>gp2</code> for General
     *            Purpose SSD, <code>io1</code> for Provisioned IOPS SSD,
     *            <code>st1</code> for Throughput Optimized HDD,
     *            <code>sc1</code> for Cold HDD, or <code>standard</code> for
     *            Magnetic volumes.
     *            </p>
     *            <p>
     *            Default: <code>gp2</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeType
     */
    public CreateVolumeRequest withVolumeType(String volumeType) {
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
     * Default: <code>gp2</code>
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
     * The volume type. This can be <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     * Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     * <code>standard</code> for Magnetic volumes.
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
     *            The volume type. This can be <code>gp2</code> for General
     *            Purpose SSD, <code>io1</code> for Provisioned IOPS SSD,
     *            <code>st1</code> for Throughput Optimized HDD,
     *            <code>sc1</code> for Cold HDD, or <code>standard</code> for
     *            Magnetic volumes.
     *            </p>
     *            <p>
     *            Default: <code>gp2</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeType
     */
    public CreateVolumeRequest withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The tags to apply to the volume during creation.
     * </p>
     *
     * @return <p>
     *         The tags to apply to the volume during creation.
     *         </p>
     */
    public java.util.List<TagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the volume during creation.
     * </p>
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the volume during creation.
     *            </p>
     */
    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new java.util.ArrayList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the volume during creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the volume during creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (getTagSpecifications() == null) {
            this.tagSpecifications = new java.util.ArrayList<TagSpecification>(
                    tagSpecifications.length);
        }
        for (TagSpecification value : tagSpecifications) {
            this.tagSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the volume during creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the volume during creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeRequest withTagSpecifications(
            java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon EBS Multi-Attach. If you enable
     * Multi-Attach, you can attach the volume to up to 16 <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instances</a> in the same Availability Zone. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"
     * > Amazon EBS Multi-Attach</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable Amazon EBS Multi-Attach. If you
     *         enable Multi-Attach, you can attach the volume to up to 16 <a
     *         href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *         >Nitro-based instances</a> in the same Availability Zone. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"
     *         > Amazon EBS Multi-Attach</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide</i>.
     *         </p>
     */
    public Boolean isMultiAttachEnabled() {
        return multiAttachEnabled;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon EBS Multi-Attach. If you enable
     * Multi-Attach, you can attach the volume to up to 16 <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instances</a> in the same Availability Zone. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"
     * > Amazon EBS Multi-Attach</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable Amazon EBS Multi-Attach. If you
     *         enable Multi-Attach, you can attach the volume to up to 16 <a
     *         href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *         >Nitro-based instances</a> in the same Availability Zone. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"
     *         > Amazon EBS Multi-Attach</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide</i>.
     *         </p>
     */
    public Boolean getMultiAttachEnabled() {
        return multiAttachEnabled;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon EBS Multi-Attach. If you enable
     * Multi-Attach, you can attach the volume to up to 16 <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instances</a> in the same Availability Zone. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"
     * > Amazon EBS Multi-Attach</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @param multiAttachEnabled <p>
     *            Specifies whether to enable Amazon EBS Multi-Attach. If you
     *            enable Multi-Attach, you can attach the volume to up to 16 <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *            >Nitro-based instances</a> in the same Availability Zone. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"
     *            > Amazon EBS Multi-Attach</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     */
    public void setMultiAttachEnabled(Boolean multiAttachEnabled) {
        this.multiAttachEnabled = multiAttachEnabled;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon EBS Multi-Attach. If you enable
     * Multi-Attach, you can attach the volume to up to 16 <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instances</a> in the same Availability Zone. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"
     * > Amazon EBS Multi-Attach</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiAttachEnabled <p>
     *            Specifies whether to enable Amazon EBS Multi-Attach. If you
     *            enable Multi-Attach, you can attach the volume to up to 16 <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *            >Nitro-based instances</a> in the same Availability Zone. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"
     *            > Amazon EBS Multi-Attach</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumeRequest withMultiAttachEnabled(Boolean multiAttachEnabled) {
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: " + getOutpostArn() + ",");
        if (getSize() != null)
            sb.append("Size: " + getSize() + ",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getVolumeType() != null)
            sb.append("VolumeType: " + getVolumeType() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: " + getTagSpecifications() + ",");
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
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
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

        if (obj instanceof CreateVolumeRequest == false)
            return false;
        CreateVolumeRequest other = (CreateVolumeRequest) obj;

        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null
                && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
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
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null
                && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null
                && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getMultiAttachEnabled() == null ^ this.getMultiAttachEnabled() == null)
            return false;
        if (other.getMultiAttachEnabled() != null
                && other.getMultiAttachEnabled().equals(this.getMultiAttachEnabled()) == false)
            return false;
        return true;
    }
}
