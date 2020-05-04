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
 * The information to include in the launch template.
 * </p>
 */
public class RequestLaunchTemplateData implements Serializable {
    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     * >User Provided Kernels</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * </important>
     */
    private String kernelId;

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal Amazon EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS-optimized instance.
     * </p>
     */
    private Boolean ebsOptimized;

    /**
     * <p>
     * The IAM instance profile.
     * </p>
     */
    private LaunchTemplateIamInstanceProfileSpecificationRequest iamInstanceProfile;

    /**
     * <p>
     * The block device mapping.
     * </p>
     */
    private java.util.List<LaunchTemplateBlockDeviceMappingRequest> blockDeviceMappings;

    /**
     * <p>
     * One or more network interfaces. If you specify a network interface, you
     * must specify any security groups and subnets as part of the network
     * interface.
     * </p>
     */
    private java.util.List<LaunchTemplateInstanceNetworkInterfaceSpecificationRequest> networkInterfaces;

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     */
    private String imageId;

    /**
     * <p>
     * The instance type. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5d.large,
     * c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge, c5d.12xlarge,
     * c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large, c5n.xlarge,
     * c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge, cc1.4xlarge,
     * cc2.8xlarge, g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge,
     * g3s.xlarge, g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge,
     * g4dn.12xlarge, g4dn.16xlarge, cg1.4xlarge, p2.xlarge, p2.8xlarge,
     * p2.16xlarge, p3.2xlarge, p3.8xlarge, p3.16xlarge, p3dn.24xlarge,
     * d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge,
     * f1.16xlarge, m5.large, m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge,
     * m5.12xlarge, m5.16xlarge, m5.24xlarge, m5.metal, m5a.large, m5a.xlarge,
     * m5a.2xlarge, m5a.4xlarge, m5a.8xlarge, m5a.12xlarge, m5a.16xlarge,
     * m5a.24xlarge, m5d.large, m5d.xlarge, m5d.2xlarge, m5d.4xlarge,
     * m5d.8xlarge, m5d.12xlarge, m5d.16xlarge, m5d.24xlarge, m5d.metal,
     * m5ad.large, m5ad.xlarge, m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge,
     * m5ad.12xlarge, m5ad.16xlarge, m5ad.24xlarge, h1.2xlarge, h1.4xlarge,
     * h1.8xlarge, h1.16xlarge, z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge,
     * z1d.6xlarge, z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal,
     * u-12tb1.metal, u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large,
     * a1.xlarge, a1.2xlarge, a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge,
     * m5dn.2xlarge, m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge,
     * m5dn.24xlarge, m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge,
     * m5n.8xlarge, m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large,
     * r5dn.xlarge, r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge,
     * r5dn.16xlarge, r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge,
     * r5n.4xlarge, r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge,
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge
     */
    private String instanceType;

    /**
     * <p>
     * The name of the key pair. You can create a key pair using <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html"
     * >CreateKeyPair</a> or <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html"
     * >ImportKeyPair</a>.
     * </p>
     * <important>
     * <p>
     * If you do not specify a key pair, you can't connect to the instance
     * unless you choose an AMI that is configured to allow users another way to
     * log in.
     * </p>
     * </important>
     */
    private String keyName;

    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     */
    private LaunchTemplatesMonitoringRequest monitoring;

    /**
     * <p>
     * The placement for the instance.
     * </p>
     */
    private LaunchTemplatePlacementRequest placement;

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     * >User Provided Kernels</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * </important>
     */
    private String ramDiskId;

    /**
     * <p>
     * If you set this parameter to <code>true</code>, you can't terminate the
     * instance using the Amazon EC2 console, CLI, or API; otherwise, you can.
     * To change this attribute after launch, use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html"
     * >ModifyInstanceAttribute</a>. Alternatively, if you set
     * <code>InstanceInitiatedShutdownBehavior</code> to <code>terminate</code>,
     * you can terminate the instance by running the shutdown command from the
     * instance.
     * </p>
     */
    private Boolean disableApiTermination;

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     * <p>
     * Default: <code>stop</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     */
    private String instanceInitiatedShutdownBehavior;

    /**
     * <p>
     * The Base64-encoded user data to make available to the instance. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html"
     * >Running Commands on Your Linux Instance at Launch</a> (Linux) and <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     * >Adding User Data</a> (Windows).
     * </p>
     */
    private String userData;

    /**
     * <p>
     * The tags to apply to the resources during launch. You can only tag
     * instances and volumes on launch. The specified tags are applied to all
     * instances or volumes that are created during launch. To tag a resource
     * after it has been created, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html"
     * >CreateTags</a>.
     * </p>
     */
    private java.util.List<LaunchTemplateTagSpecificationRequest> tagSpecifications;

    /**
     * <p>
     * An elastic GPU to associate with the instance.
     * </p>
     */
    private java.util.List<ElasticGpuSpecification> elasticGpuSpecifications;

    /**
     * <p>
     * The elastic inference accelerator for the instance.
     * </p>
     */
    private java.util.List<LaunchTemplateElasticInferenceAccelerator> elasticInferenceAccelerators;

    /**
     * <p>
     * One or more security group IDs. You can create a security group using <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSecurityGroup.html"
     * >CreateSecurityGroup</a>. You cannot specify both a security group ID and
     * security name in the same request.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * [EC2-Classic, default VPC] One or more security group names. For a
     * nondefault VPC, you must use security group IDs instead. You cannot
     * specify both a security group ID and security name in the same request.
     * </p>
     */
    private java.util.List<String> securityGroups;

    /**
     * <p>
     * The market (purchasing) option for the instances.
     * </p>
     */
    private LaunchTemplateInstanceMarketOptionsRequest instanceMarketOptions;

    /**
     * <p>
     * The credit option for CPU usage of the instance. Valid for T2 or T3
     * instances only.
     * </p>
     */
    private CreditSpecificationRequest creditSpecification;

    /**
     * <p>
     * The CPU options for the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html"
     * >Optimizing CPU Options</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     */
    private LaunchTemplateCpuOptionsRequest cpuOptions;

    /**
     * <p>
     * The Capacity Reservation targeting option. If you do not specify this
     * parameter, the instance's Capacity Reservation preference defaults to
     * <code>open</code>, which enables it to run in any open Capacity
     * Reservation that has matching attributes (instance type, platform,
     * Availability Zone).
     * </p>
     */
    private LaunchTemplateCapacityReservationSpecificationRequest capacityReservationSpecification;

    /**
     * <p>
     * The license configurations.
     * </p>
     */
    private java.util.List<LaunchTemplateLicenseConfigurationRequest> licenseSpecifications;

    /**
     * <p>
     * Indicates whether an instance is enabled for hibernation. This parameter
     * is valid only if the instance meets the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites"
     * >hibernation prerequisites</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     * >Hibernate Your Instance</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     */
    private LaunchTemplateHibernationOptionsRequest hibernationOptions;

    /**
     * <p>
     * The metadata options for the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     * >Instance Metadata and User Data</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     */
    private LaunchTemplateInstanceMetadataOptionsRequest metadataOptions;

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     * >User Provided Kernels</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * </important>
     *
     * @return <p>
     *         The ID of the kernel.
     *         </p>
     *         <important>
     *         <p>
     *         We recommend that you use PV-GRUB instead of kernels and RAM
     *         disks. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     *         >User Provided Kernels</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>.
     *         </p>
     *         </important>
     */
    public String getKernelId() {
        return kernelId;
    }

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     * >User Provided Kernels</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * </important>
     *
     * @param kernelId <p>
     *            The ID of the kernel.
     *            </p>
     *            <important>
     *            <p>
     *            We recommend that you use PV-GRUB instead of kernels and RAM
     *            disks. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     *            >User Provided Kernels</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            </important>
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     * >User Provided Kernels</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kernelId <p>
     *            The ID of the kernel.
     *            </p>
     *            <important>
     *            <p>
     *            We recommend that you use PV-GRUB instead of kernels and RAM
     *            disks. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     *            >User Provided Kernels</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal Amazon EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS-optimized instance.
     * </p>
     *
     * @return <p>
     *         Indicates whether the instance is optimized for Amazon EBS I/O.
     *         This optimization provides dedicated throughput to Amazon EBS and
     *         an optimized configuration stack to provide optimal Amazon EBS
     *         I/O performance. This optimization isn't available with all
     *         instance types. Additional usage charges apply when using an
     *         EBS-optimized instance.
     *         </p>
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal Amazon EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS-optimized instance.
     * </p>
     *
     * @return <p>
     *         Indicates whether the instance is optimized for Amazon EBS I/O.
     *         This optimization provides dedicated throughput to Amazon EBS and
     *         an optimized configuration stack to provide optimal Amazon EBS
     *         I/O performance. This optimization isn't available with all
     *         instance types. Additional usage charges apply when using an
     *         EBS-optimized instance.
     *         </p>
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal Amazon EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS-optimized instance.
     * </p>
     *
     * @param ebsOptimized <p>
     *            Indicates whether the instance is optimized for Amazon EBS
     *            I/O. This optimization provides dedicated throughput to Amazon
     *            EBS and an optimized configuration stack to provide optimal
     *            Amazon EBS I/O performance. This optimization isn't available
     *            with all instance types. Additional usage charges apply when
     *            using an EBS-optimized instance.
     *            </p>
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal Amazon EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS-optimized instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsOptimized <p>
     *            Indicates whether the instance is optimized for Amazon EBS
     *            I/O. This optimization provides dedicated throughput to Amazon
     *            EBS and an optimized configuration stack to provide optimal
     *            Amazon EBS I/O performance. This optimization isn't available
     *            with all instance types. Additional usage charges apply when
     *            using an EBS-optimized instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * <p>
     * The IAM instance profile.
     * </p>
     *
     * @return <p>
     *         The IAM instance profile.
     *         </p>
     */
    public LaunchTemplateIamInstanceProfileSpecificationRequest getIamInstanceProfile() {
        return iamInstanceProfile;
    }

    /**
     * <p>
     * The IAM instance profile.
     * </p>
     *
     * @param iamInstanceProfile <p>
     *            The IAM instance profile.
     *            </p>
     */
    public void setIamInstanceProfile(
            LaunchTemplateIamInstanceProfileSpecificationRequest iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    /**
     * <p>
     * The IAM instance profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamInstanceProfile <p>
     *            The IAM instance profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withIamInstanceProfile(
            LaunchTemplateIamInstanceProfileSpecificationRequest iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * <p>
     * The block device mapping.
     * </p>
     *
     * @return <p>
     *         The block device mapping.
     *         </p>
     */
    public java.util.List<LaunchTemplateBlockDeviceMappingRequest> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * <p>
     * The block device mapping.
     * </p>
     *
     * @param blockDeviceMappings <p>
     *            The block device mapping.
     *            </p>
     */
    public void setBlockDeviceMappings(
            java.util.Collection<LaunchTemplateBlockDeviceMappingRequest> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new java.util.ArrayList<LaunchTemplateBlockDeviceMappingRequest>(
                blockDeviceMappings);
    }

    /**
     * <p>
     * The block device mapping.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            The block device mapping.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withBlockDeviceMappings(
            LaunchTemplateBlockDeviceMappingRequest... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) {
            this.blockDeviceMappings = new java.util.ArrayList<LaunchTemplateBlockDeviceMappingRequest>(
                    blockDeviceMappings.length);
        }
        for (LaunchTemplateBlockDeviceMappingRequest value : blockDeviceMappings) {
            this.blockDeviceMappings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The block device mapping.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            The block device mapping.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withBlockDeviceMappings(
            java.util.Collection<LaunchTemplateBlockDeviceMappingRequest> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * One or more network interfaces. If you specify a network interface, you
     * must specify any security groups and subnets as part of the network
     * interface.
     * </p>
     *
     * @return <p>
     *         One or more network interfaces. If you specify a network
     *         interface, you must specify any security groups and subnets as
     *         part of the network interface.
     *         </p>
     */
    public java.util.List<LaunchTemplateInstanceNetworkInterfaceSpecificationRequest> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * <p>
     * One or more network interfaces. If you specify a network interface, you
     * must specify any security groups and subnets as part of the network
     * interface.
     * </p>
     *
     * @param networkInterfaces <p>
     *            One or more network interfaces. If you specify a network
     *            interface, you must specify any security groups and subnets as
     *            part of the network interface.
     *            </p>
     */
    public void setNetworkInterfaces(
            java.util.Collection<LaunchTemplateInstanceNetworkInterfaceSpecificationRequest> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new java.util.ArrayList<LaunchTemplateInstanceNetworkInterfaceSpecificationRequest>(
                networkInterfaces);
    }

    /**
     * <p>
     * One or more network interfaces. If you specify a network interface, you
     * must specify any security groups and subnets as part of the network
     * interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaces <p>
     *            One or more network interfaces. If you specify a network
     *            interface, you must specify any security groups and subnets as
     *            part of the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withNetworkInterfaces(
            LaunchTemplateInstanceNetworkInterfaceSpecificationRequest... networkInterfaces) {
        if (getNetworkInterfaces() == null) {
            this.networkInterfaces = new java.util.ArrayList<LaunchTemplateInstanceNetworkInterfaceSpecificationRequest>(
                    networkInterfaces.length);
        }
        for (LaunchTemplateInstanceNetworkInterfaceSpecificationRequest value : networkInterfaces) {
            this.networkInterfaces.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more network interfaces. If you specify a network interface, you
     * must specify any security groups and subnets as part of the network
     * interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaces <p>
     *            One or more network interfaces. If you specify a network
     *            interface, you must specify any security groups and subnets as
     *            part of the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withNetworkInterfaces(
            java.util.Collection<LaunchTemplateInstanceNetworkInterfaceSpecificationRequest> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
        return this;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     *
     * @return <p>
     *         The ID of the AMI.
     *         </p>
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     *
     * @param imageId <p>
     *            The ID of the AMI.
     *            </p>
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageId <p>
     *            The ID of the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * <p>
     * The instance type. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5d.large,
     * c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge, c5d.12xlarge,
     * c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large, c5n.xlarge,
     * c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge, cc1.4xlarge,
     * cc2.8xlarge, g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge,
     * g3s.xlarge, g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge,
     * g4dn.12xlarge, g4dn.16xlarge, cg1.4xlarge, p2.xlarge, p2.8xlarge,
     * p2.16xlarge, p3.2xlarge, p3.8xlarge, p3.16xlarge, p3dn.24xlarge,
     * d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge,
     * f1.16xlarge, m5.large, m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge,
     * m5.12xlarge, m5.16xlarge, m5.24xlarge, m5.metal, m5a.large, m5a.xlarge,
     * m5a.2xlarge, m5a.4xlarge, m5a.8xlarge, m5a.12xlarge, m5a.16xlarge,
     * m5a.24xlarge, m5d.large, m5d.xlarge, m5d.2xlarge, m5d.4xlarge,
     * m5d.8xlarge, m5d.12xlarge, m5d.16xlarge, m5d.24xlarge, m5d.metal,
     * m5ad.large, m5ad.xlarge, m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge,
     * m5ad.12xlarge, m5ad.16xlarge, m5ad.24xlarge, h1.2xlarge, h1.4xlarge,
     * h1.8xlarge, h1.16xlarge, z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge,
     * z1d.6xlarge, z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal,
     * u-12tb1.metal, u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large,
     * a1.xlarge, a1.2xlarge, a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge,
     * m5dn.2xlarge, m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge,
     * m5dn.24xlarge, m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge,
     * m5n.8xlarge, m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large,
     * r5dn.xlarge, r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge,
     * r5dn.16xlarge, r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge,
     * r5n.4xlarge, r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge,
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge
     *
     * @return <p>
     *         The instance type. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *         >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *         </p>
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The instance type. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5d.large,
     * c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge, c5d.12xlarge,
     * c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large, c5n.xlarge,
     * c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge, cc1.4xlarge,
     * cc2.8xlarge, g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge,
     * g3s.xlarge, g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge,
     * g4dn.12xlarge, g4dn.16xlarge, cg1.4xlarge, p2.xlarge, p2.8xlarge,
     * p2.16xlarge, p3.2xlarge, p3.8xlarge, p3.16xlarge, p3dn.24xlarge,
     * d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge,
     * f1.16xlarge, m5.large, m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge,
     * m5.12xlarge, m5.16xlarge, m5.24xlarge, m5.metal, m5a.large, m5a.xlarge,
     * m5a.2xlarge, m5a.4xlarge, m5a.8xlarge, m5a.12xlarge, m5a.16xlarge,
     * m5a.24xlarge, m5d.large, m5d.xlarge, m5d.2xlarge, m5d.4xlarge,
     * m5d.8xlarge, m5d.12xlarge, m5d.16xlarge, m5d.24xlarge, m5d.metal,
     * m5ad.large, m5ad.xlarge, m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge,
     * m5ad.12xlarge, m5ad.16xlarge, m5ad.24xlarge, h1.2xlarge, h1.4xlarge,
     * h1.8xlarge, h1.16xlarge, z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge,
     * z1d.6xlarge, z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal,
     * u-12tb1.metal, u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large,
     * a1.xlarge, a1.2xlarge, a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge,
     * m5dn.2xlarge, m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge,
     * m5dn.24xlarge, m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge,
     * m5n.8xlarge, m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large,
     * r5dn.xlarge, r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge,
     * r5dn.16xlarge, r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge,
     * r5n.4xlarge, r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge,
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge
     *
     * @param instanceType <p>
     *            The instance type. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *            >Instance Types</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5d.large,
     * c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge, c5d.12xlarge,
     * c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large, c5n.xlarge,
     * c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge, cc1.4xlarge,
     * cc2.8xlarge, g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge,
     * g3s.xlarge, g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge,
     * g4dn.12xlarge, g4dn.16xlarge, cg1.4xlarge, p2.xlarge, p2.8xlarge,
     * p2.16xlarge, p3.2xlarge, p3.8xlarge, p3.16xlarge, p3dn.24xlarge,
     * d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge,
     * f1.16xlarge, m5.large, m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge,
     * m5.12xlarge, m5.16xlarge, m5.24xlarge, m5.metal, m5a.large, m5a.xlarge,
     * m5a.2xlarge, m5a.4xlarge, m5a.8xlarge, m5a.12xlarge, m5a.16xlarge,
     * m5a.24xlarge, m5d.large, m5d.xlarge, m5d.2xlarge, m5d.4xlarge,
     * m5d.8xlarge, m5d.12xlarge, m5d.16xlarge, m5d.24xlarge, m5d.metal,
     * m5ad.large, m5ad.xlarge, m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge,
     * m5ad.12xlarge, m5ad.16xlarge, m5ad.24xlarge, h1.2xlarge, h1.4xlarge,
     * h1.8xlarge, h1.16xlarge, z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge,
     * z1d.6xlarge, z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal,
     * u-12tb1.metal, u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large,
     * a1.xlarge, a1.2xlarge, a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge,
     * m5dn.2xlarge, m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge,
     * m5dn.24xlarge, m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge,
     * m5n.8xlarge, m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large,
     * r5dn.xlarge, r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge,
     * r5dn.16xlarge, r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge,
     * r5n.4xlarge, r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge,
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge
     *
     * @param instanceType <p>
     *            The instance type. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *            >Instance Types</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public RequestLaunchTemplateData withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The instance type. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5d.large,
     * c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge, c5d.12xlarge,
     * c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large, c5n.xlarge,
     * c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge, cc1.4xlarge,
     * cc2.8xlarge, g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge,
     * g3s.xlarge, g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge,
     * g4dn.12xlarge, g4dn.16xlarge, cg1.4xlarge, p2.xlarge, p2.8xlarge,
     * p2.16xlarge, p3.2xlarge, p3.8xlarge, p3.16xlarge, p3dn.24xlarge,
     * d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge,
     * f1.16xlarge, m5.large, m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge,
     * m5.12xlarge, m5.16xlarge, m5.24xlarge, m5.metal, m5a.large, m5a.xlarge,
     * m5a.2xlarge, m5a.4xlarge, m5a.8xlarge, m5a.12xlarge, m5a.16xlarge,
     * m5a.24xlarge, m5d.large, m5d.xlarge, m5d.2xlarge, m5d.4xlarge,
     * m5d.8xlarge, m5d.12xlarge, m5d.16xlarge, m5d.24xlarge, m5d.metal,
     * m5ad.large, m5ad.xlarge, m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge,
     * m5ad.12xlarge, m5ad.16xlarge, m5ad.24xlarge, h1.2xlarge, h1.4xlarge,
     * h1.8xlarge, h1.16xlarge, z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge,
     * z1d.6xlarge, z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal,
     * u-12tb1.metal, u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large,
     * a1.xlarge, a1.2xlarge, a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge,
     * m5dn.2xlarge, m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge,
     * m5dn.24xlarge, m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge,
     * m5n.8xlarge, m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large,
     * r5dn.xlarge, r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge,
     * r5dn.16xlarge, r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge,
     * r5n.4xlarge, r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge,
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge
     *
     * @param instanceType <p>
     *            The instance type. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *            >Instance Types</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }

    /**
     * <p>
     * The instance type. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5d.large,
     * c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge, c5d.12xlarge,
     * c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large, c5n.xlarge,
     * c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge, cc1.4xlarge,
     * cc2.8xlarge, g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge,
     * g3s.xlarge, g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge,
     * g4dn.12xlarge, g4dn.16xlarge, cg1.4xlarge, p2.xlarge, p2.8xlarge,
     * p2.16xlarge, p3.2xlarge, p3.8xlarge, p3.16xlarge, p3dn.24xlarge,
     * d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge,
     * f1.16xlarge, m5.large, m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge,
     * m5.12xlarge, m5.16xlarge, m5.24xlarge, m5.metal, m5a.large, m5a.xlarge,
     * m5a.2xlarge, m5a.4xlarge, m5a.8xlarge, m5a.12xlarge, m5a.16xlarge,
     * m5a.24xlarge, m5d.large, m5d.xlarge, m5d.2xlarge, m5d.4xlarge,
     * m5d.8xlarge, m5d.12xlarge, m5d.16xlarge, m5d.24xlarge, m5d.metal,
     * m5ad.large, m5ad.xlarge, m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge,
     * m5ad.12xlarge, m5ad.16xlarge, m5ad.24xlarge, h1.2xlarge, h1.4xlarge,
     * h1.8xlarge, h1.16xlarge, z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge,
     * z1d.6xlarge, z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal,
     * u-12tb1.metal, u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large,
     * a1.xlarge, a1.2xlarge, a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge,
     * m5dn.2xlarge, m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge,
     * m5dn.24xlarge, m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge,
     * m5n.8xlarge, m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large,
     * r5dn.xlarge, r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge,
     * r5dn.16xlarge, r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge,
     * r5n.4xlarge, r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge,
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge
     *
     * @param instanceType <p>
     *            The instance type. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *            >Instance Types</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public RequestLaunchTemplateData withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the key pair. You can create a key pair using <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html"
     * >CreateKeyPair</a> or <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html"
     * >ImportKeyPair</a>.
     * </p>
     * <important>
     * <p>
     * If you do not specify a key pair, you can't connect to the instance
     * unless you choose an AMI that is configured to allow users another way to
     * log in.
     * </p>
     * </important>
     *
     * @return <p>
     *         The name of the key pair. You can create a key pair using <a
     *         href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html"
     *         >CreateKeyPair</a> or <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html"
     *         >ImportKeyPair</a>.
     *         </p>
     *         <important>
     *         <p>
     *         If you do not specify a key pair, you can't connect to the
     *         instance unless you choose an AMI that is configured to allow
     *         users another way to log in.
     *         </p>
     *         </important>
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * <p>
     * The name of the key pair. You can create a key pair using <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html"
     * >CreateKeyPair</a> or <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html"
     * >ImportKeyPair</a>.
     * </p>
     * <important>
     * <p>
     * If you do not specify a key pair, you can't connect to the instance
     * unless you choose an AMI that is configured to allow users another way to
     * log in.
     * </p>
     * </important>
     *
     * @param keyName <p>
     *            The name of the key pair. You can create a key pair using <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html"
     *            >CreateKeyPair</a> or <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html"
     *            >ImportKeyPair</a>.
     *            </p>
     *            <important>
     *            <p>
     *            If you do not specify a key pair, you can't connect to the
     *            instance unless you choose an AMI that is configured to allow
     *            users another way to log in.
     *            </p>
     *            </important>
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the key pair. You can create a key pair using <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html"
     * >CreateKeyPair</a> or <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html"
     * >ImportKeyPair</a>.
     * </p>
     * <important>
     * <p>
     * If you do not specify a key pair, you can't connect to the instance
     * unless you choose an AMI that is configured to allow users another way to
     * log in.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyName <p>
     *            The name of the key pair. You can create a key pair using <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html"
     *            >CreateKeyPair</a> or <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html"
     *            >ImportKeyPair</a>.
     *            </p>
     *            <important>
     *            <p>
     *            If you do not specify a key pair, you can't connect to the
     *            instance unless you choose an AMI that is configured to allow
     *            users another way to log in.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     *
     * @return <p>
     *         The monitoring for the instance.
     *         </p>
     */
    public LaunchTemplatesMonitoringRequest getMonitoring() {
        return monitoring;
    }

    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     *
     * @param monitoring <p>
     *            The monitoring for the instance.
     *            </p>
     */
    public void setMonitoring(LaunchTemplatesMonitoringRequest monitoring) {
        this.monitoring = monitoring;
    }

    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoring <p>
     *            The monitoring for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withMonitoring(LaunchTemplatesMonitoringRequest monitoring) {
        this.monitoring = monitoring;
        return this;
    }

    /**
     * <p>
     * The placement for the instance.
     * </p>
     *
     * @return <p>
     *         The placement for the instance.
     *         </p>
     */
    public LaunchTemplatePlacementRequest getPlacement() {
        return placement;
    }

    /**
     * <p>
     * The placement for the instance.
     * </p>
     *
     * @param placement <p>
     *            The placement for the instance.
     *            </p>
     */
    public void setPlacement(LaunchTemplatePlacementRequest placement) {
        this.placement = placement;
    }

    /**
     * <p>
     * The placement for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placement <p>
     *            The placement for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withPlacement(LaunchTemplatePlacementRequest placement) {
        this.placement = placement;
        return this;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     * >User Provided Kernels</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * </important>
     *
     * @return <p>
     *         The ID of the RAM disk.
     *         </p>
     *         <important>
     *         <p>
     *         We recommend that you use PV-GRUB instead of kernels and RAM
     *         disks. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     *         >User Provided Kernels</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>.
     *         </p>
     *         </important>
     */
    public String getRamDiskId() {
        return ramDiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     * >User Provided Kernels</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * </important>
     *
     * @param ramDiskId <p>
     *            The ID of the RAM disk.
     *            </p>
     *            <important>
     *            <p>
     *            We recommend that you use PV-GRUB instead of kernels and RAM
     *            disks. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     *            >User Provided Kernels</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            </important>
     */
    public void setRamDiskId(String ramDiskId) {
        this.ramDiskId = ramDiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     * >User Provided Kernels</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ramDiskId <p>
     *            The ID of the RAM disk.
     *            </p>
     *            <important>
     *            <p>
     *            We recommend that you use PV-GRUB instead of kernels and RAM
     *            disks. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     *            >User Provided Kernels</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withRamDiskId(String ramDiskId) {
        this.ramDiskId = ramDiskId;
        return this;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, you can't terminate the
     * instance using the Amazon EC2 console, CLI, or API; otherwise, you can.
     * To change this attribute after launch, use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html"
     * >ModifyInstanceAttribute</a>. Alternatively, if you set
     * <code>InstanceInitiatedShutdownBehavior</code> to <code>terminate</code>,
     * you can terminate the instance by running the shutdown command from the
     * instance.
     * </p>
     *
     * @return <p>
     *         If you set this parameter to <code>true</code>, you can't
     *         terminate the instance using the Amazon EC2 console, CLI, or API;
     *         otherwise, you can. To change this attribute after launch, use <a
     *         href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html"
     *         >ModifyInstanceAttribute</a>. Alternatively, if you set
     *         <code>InstanceInitiatedShutdownBehavior</code> to
     *         <code>terminate</code>, you can terminate the instance by running
     *         the shutdown command from the instance.
     *         </p>
     */
    public Boolean isDisableApiTermination() {
        return disableApiTermination;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, you can't terminate the
     * instance using the Amazon EC2 console, CLI, or API; otherwise, you can.
     * To change this attribute after launch, use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html"
     * >ModifyInstanceAttribute</a>. Alternatively, if you set
     * <code>InstanceInitiatedShutdownBehavior</code> to <code>terminate</code>,
     * you can terminate the instance by running the shutdown command from the
     * instance.
     * </p>
     *
     * @return <p>
     *         If you set this parameter to <code>true</code>, you can't
     *         terminate the instance using the Amazon EC2 console, CLI, or API;
     *         otherwise, you can. To change this attribute after launch, use <a
     *         href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html"
     *         >ModifyInstanceAttribute</a>. Alternatively, if you set
     *         <code>InstanceInitiatedShutdownBehavior</code> to
     *         <code>terminate</code>, you can terminate the instance by running
     *         the shutdown command from the instance.
     *         </p>
     */
    public Boolean getDisableApiTermination() {
        return disableApiTermination;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, you can't terminate the
     * instance using the Amazon EC2 console, CLI, or API; otherwise, you can.
     * To change this attribute after launch, use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html"
     * >ModifyInstanceAttribute</a>. Alternatively, if you set
     * <code>InstanceInitiatedShutdownBehavior</code> to <code>terminate</code>,
     * you can terminate the instance by running the shutdown command from the
     * instance.
     * </p>
     *
     * @param disableApiTermination <p>
     *            If you set this parameter to <code>true</code>, you can't
     *            terminate the instance using the Amazon EC2 console, CLI, or
     *            API; otherwise, you can. To change this attribute after
     *            launch, use <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html"
     *            >ModifyInstanceAttribute</a>. Alternatively, if you set
     *            <code>InstanceInitiatedShutdownBehavior</code> to
     *            <code>terminate</code>, you can terminate the instance by
     *            running the shutdown command from the instance.
     *            </p>
     */
    public void setDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, you can't terminate the
     * instance using the Amazon EC2 console, CLI, or API; otherwise, you can.
     * To change this attribute after launch, use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html"
     * >ModifyInstanceAttribute</a>. Alternatively, if you set
     * <code>InstanceInitiatedShutdownBehavior</code> to <code>terminate</code>,
     * you can terminate the instance by running the shutdown command from the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disableApiTermination <p>
     *            If you set this parameter to <code>true</code>, you can't
     *            terminate the instance using the Amazon EC2 console, CLI, or
     *            API; otherwise, you can. To change this attribute after
     *            launch, use <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html"
     *            >ModifyInstanceAttribute</a>. Alternatively, if you set
     *            <code>InstanceInitiatedShutdownBehavior</code> to
     *            <code>terminate</code>, you can terminate the instance by
     *            running the shutdown command from the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
        return this;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     * <p>
     * Default: <code>stop</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     *
     * @return <p>
     *         Indicates whether an instance stops or terminates when you
     *         initiate shutdown from the instance (using the operating system
     *         command for system shutdown).
     *         </p>
     *         <p>
     *         Default: <code>stop</code>
     *         </p>
     * @see ShutdownBehavior
     */
    public String getInstanceInitiatedShutdownBehavior() {
        return instanceInitiatedShutdownBehavior;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     * <p>
     * Default: <code>stop</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     *
     * @param instanceInitiatedShutdownBehavior <p>
     *            Indicates whether an instance stops or terminates when you
     *            initiate shutdown from the instance (using the operating
     *            system command for system shutdown).
     *            </p>
     *            <p>
     *            Default: <code>stop</code>
     *            </p>
     * @see ShutdownBehavior
     */
    public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     * <p>
     * Default: <code>stop</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     *
     * @param instanceInitiatedShutdownBehavior <p>
     *            Indicates whether an instance stops or terminates when you
     *            initiate shutdown from the instance (using the operating
     *            system command for system shutdown).
     *            </p>
     *            <p>
     *            Default: <code>stop</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ShutdownBehavior
     */
    public RequestLaunchTemplateData withInstanceInitiatedShutdownBehavior(
            String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
        return this;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     * <p>
     * Default: <code>stop</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     *
     * @param instanceInitiatedShutdownBehavior <p>
     *            Indicates whether an instance stops or terminates when you
     *            initiate shutdown from the instance (using the operating
     *            system command for system shutdown).
     *            </p>
     *            <p>
     *            Default: <code>stop</code>
     *            </p>
     * @see ShutdownBehavior
     */
    public void setInstanceInitiatedShutdownBehavior(
            ShutdownBehavior instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior.toString();
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     * <p>
     * Default: <code>stop</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     *
     * @param instanceInitiatedShutdownBehavior <p>
     *            Indicates whether an instance stops or terminates when you
     *            initiate shutdown from the instance (using the operating
     *            system command for system shutdown).
     *            </p>
     *            <p>
     *            Default: <code>stop</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ShutdownBehavior
     */
    public RequestLaunchTemplateData withInstanceInitiatedShutdownBehavior(
            ShutdownBehavior instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior.toString();
        return this;
    }

    /**
     * <p>
     * The Base64-encoded user data to make available to the instance. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html"
     * >Running Commands on Your Linux Instance at Launch</a> (Linux) and <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     * >Adding User Data</a> (Windows).
     * </p>
     *
     * @return <p>
     *         The Base64-encoded user data to make available to the instance.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html"
     *         >Running Commands on Your Linux Instance at Launch</a> (Linux)
     *         and <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     *         >Adding User Data</a> (Windows).
     *         </p>
     */
    public String getUserData() {
        return userData;
    }

    /**
     * <p>
     * The Base64-encoded user data to make available to the instance. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html"
     * >Running Commands on Your Linux Instance at Launch</a> (Linux) and <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     * >Adding User Data</a> (Windows).
     * </p>
     *
     * @param userData <p>
     *            The Base64-encoded user data to make available to the
     *            instance. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html"
     *            >Running Commands on Your Linux Instance at Launch</a> (Linux)
     *            and <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     *            >Adding User Data</a> (Windows).
     *            </p>
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * The Base64-encoded user data to make available to the instance. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html"
     * >Running Commands on Your Linux Instance at Launch</a> (Linux) and <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     * >Adding User Data</a> (Windows).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userData <p>
     *            The Base64-encoded user data to make available to the
     *            instance. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html"
     *            >Running Commands on Your Linux Instance at Launch</a> (Linux)
     *            and <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     *            >Adding User Data</a> (Windows).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * <p>
     * The tags to apply to the resources during launch. You can only tag
     * instances and volumes on launch. The specified tags are applied to all
     * instances or volumes that are created during launch. To tag a resource
     * after it has been created, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html"
     * >CreateTags</a>.
     * </p>
     *
     * @return <p>
     *         The tags to apply to the resources during launch. You can only
     *         tag instances and volumes on launch. The specified tags are
     *         applied to all instances or volumes that are created during
     *         launch. To tag a resource after it has been created, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html"
     *         >CreateTags</a>.
     *         </p>
     */
    public java.util.List<LaunchTemplateTagSpecificationRequest> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the resources during launch. You can only tag
     * instances and volumes on launch. The specified tags are applied to all
     * instances or volumes that are created during launch. To tag a resource
     * after it has been created, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html"
     * >CreateTags</a>.
     * </p>
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the resources during launch. You can only
     *            tag instances and volumes on launch. The specified tags are
     *            applied to all instances or volumes that are created during
     *            launch. To tag a resource after it has been created, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html"
     *            >CreateTags</a>.
     *            </p>
     */
    public void setTagSpecifications(
            java.util.Collection<LaunchTemplateTagSpecificationRequest> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new java.util.ArrayList<LaunchTemplateTagSpecificationRequest>(
                tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the resources during launch. You can only tag
     * instances and volumes on launch. The specified tags are applied to all
     * instances or volumes that are created during launch. To tag a resource
     * after it has been created, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html"
     * >CreateTags</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the resources during launch. You can only
     *            tag instances and volumes on launch. The specified tags are
     *            applied to all instances or volumes that are created during
     *            launch. To tag a resource after it has been created, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html"
     *            >CreateTags</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withTagSpecifications(
            LaunchTemplateTagSpecificationRequest... tagSpecifications) {
        if (getTagSpecifications() == null) {
            this.tagSpecifications = new java.util.ArrayList<LaunchTemplateTagSpecificationRequest>(
                    tagSpecifications.length);
        }
        for (LaunchTemplateTagSpecificationRequest value : tagSpecifications) {
            this.tagSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the resources during launch. You can only tag
     * instances and volumes on launch. The specified tags are applied to all
     * instances or volumes that are created during launch. To tag a resource
     * after it has been created, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html"
     * >CreateTags</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the resources during launch. You can only
     *            tag instances and volumes on launch. The specified tags are
     *            applied to all instances or volumes that are created during
     *            launch. To tag a resource after it has been created, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html"
     *            >CreateTags</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withTagSpecifications(
            java.util.Collection<LaunchTemplateTagSpecificationRequest> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * An elastic GPU to associate with the instance.
     * </p>
     *
     * @return <p>
     *         An elastic GPU to associate with the instance.
     *         </p>
     */
    public java.util.List<ElasticGpuSpecification> getElasticGpuSpecifications() {
        return elasticGpuSpecifications;
    }

    /**
     * <p>
     * An elastic GPU to associate with the instance.
     * </p>
     *
     * @param elasticGpuSpecifications <p>
     *            An elastic GPU to associate with the instance.
     *            </p>
     */
    public void setElasticGpuSpecifications(
            java.util.Collection<ElasticGpuSpecification> elasticGpuSpecifications) {
        if (elasticGpuSpecifications == null) {
            this.elasticGpuSpecifications = null;
            return;
        }

        this.elasticGpuSpecifications = new java.util.ArrayList<ElasticGpuSpecification>(
                elasticGpuSpecifications);
    }

    /**
     * <p>
     * An elastic GPU to associate with the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticGpuSpecifications <p>
     *            An elastic GPU to associate with the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withElasticGpuSpecifications(
            ElasticGpuSpecification... elasticGpuSpecifications) {
        if (getElasticGpuSpecifications() == null) {
            this.elasticGpuSpecifications = new java.util.ArrayList<ElasticGpuSpecification>(
                    elasticGpuSpecifications.length);
        }
        for (ElasticGpuSpecification value : elasticGpuSpecifications) {
            this.elasticGpuSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An elastic GPU to associate with the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticGpuSpecifications <p>
     *            An elastic GPU to associate with the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withElasticGpuSpecifications(
            java.util.Collection<ElasticGpuSpecification> elasticGpuSpecifications) {
        setElasticGpuSpecifications(elasticGpuSpecifications);
        return this;
    }

    /**
     * <p>
     * The elastic inference accelerator for the instance.
     * </p>
     *
     * @return <p>
     *         The elastic inference accelerator for the instance.
     *         </p>
     */
    public java.util.List<LaunchTemplateElasticInferenceAccelerator> getElasticInferenceAccelerators() {
        return elasticInferenceAccelerators;
    }

    /**
     * <p>
     * The elastic inference accelerator for the instance.
     * </p>
     *
     * @param elasticInferenceAccelerators <p>
     *            The elastic inference accelerator for the instance.
     *            </p>
     */
    public void setElasticInferenceAccelerators(
            java.util.Collection<LaunchTemplateElasticInferenceAccelerator> elasticInferenceAccelerators) {
        if (elasticInferenceAccelerators == null) {
            this.elasticInferenceAccelerators = null;
            return;
        }

        this.elasticInferenceAccelerators = new java.util.ArrayList<LaunchTemplateElasticInferenceAccelerator>(
                elasticInferenceAccelerators);
    }

    /**
     * <p>
     * The elastic inference accelerator for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticInferenceAccelerators <p>
     *            The elastic inference accelerator for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withElasticInferenceAccelerators(
            LaunchTemplateElasticInferenceAccelerator... elasticInferenceAccelerators) {
        if (getElasticInferenceAccelerators() == null) {
            this.elasticInferenceAccelerators = new java.util.ArrayList<LaunchTemplateElasticInferenceAccelerator>(
                    elasticInferenceAccelerators.length);
        }
        for (LaunchTemplateElasticInferenceAccelerator value : elasticInferenceAccelerators) {
            this.elasticInferenceAccelerators.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The elastic inference accelerator for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticInferenceAccelerators <p>
     *            The elastic inference accelerator for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withElasticInferenceAccelerators(
            java.util.Collection<LaunchTemplateElasticInferenceAccelerator> elasticInferenceAccelerators) {
        setElasticInferenceAccelerators(elasticInferenceAccelerators);
        return this;
    }

    /**
     * <p>
     * One or more security group IDs. You can create a security group using <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSecurityGroup.html"
     * >CreateSecurityGroup</a>. You cannot specify both a security group ID and
     * security name in the same request.
     * </p>
     *
     * @return <p>
     *         One or more security group IDs. You can create a security group
     *         using <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSecurityGroup.html"
     *         >CreateSecurityGroup</a>. You cannot specify both a security
     *         group ID and security name in the same request.
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * One or more security group IDs. You can create a security group using <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSecurityGroup.html"
     * >CreateSecurityGroup</a>. You cannot specify both a security group ID and
     * security name in the same request.
     * </p>
     *
     * @param securityGroupIds <p>
     *            One or more security group IDs. You can create a security
     *            group using <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSecurityGroup.html"
     *            >CreateSecurityGroup</a>. You cannot specify both a security
     *            group ID and security name in the same request.
     *            </p>
     */
    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * One or more security group IDs. You can create a security group using <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSecurityGroup.html"
     * >CreateSecurityGroup</a>. You cannot specify both a security group ID and
     * security name in the same request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            One or more security group IDs. You can create a security
     *            group using <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSecurityGroup.html"
     *            >CreateSecurityGroup</a>. You cannot specify both a security
     *            group ID and security name in the same request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) {
            this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds.length);
        }
        for (String value : securityGroupIds) {
            this.securityGroupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more security group IDs. You can create a security group using <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSecurityGroup.html"
     * >CreateSecurityGroup</a>. You cannot specify both a security group ID and
     * security name in the same request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            One or more security group IDs. You can create a security
     *            group using <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSecurityGroup.html"
     *            >CreateSecurityGroup</a>. You cannot specify both a security
     *            group ID and security name in the same request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withSecurityGroupIds(
            java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] One or more security group names. For a
     * nondefault VPC, you must use security group IDs instead. You cannot
     * specify both a security group ID and security name in the same request.
     * </p>
     *
     * @return <p>
     *         [EC2-Classic, default VPC] One or more security group names. For
     *         a nondefault VPC, you must use security group IDs instead. You
     *         cannot specify both a security group ID and security name in the
     *         same request.
     *         </p>
     */
    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] One or more security group names. For a
     * nondefault VPC, you must use security group IDs instead. You cannot
     * specify both a security group ID and security name in the same request.
     * </p>
     *
     * @param securityGroups <p>
     *            [EC2-Classic, default VPC] One or more security group names.
     *            For a nondefault VPC, you must use security group IDs instead.
     *            You cannot specify both a security group ID and security name
     *            in the same request.
     *            </p>
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] One or more security group names. For a
     * nondefault VPC, you must use security group IDs instead. You cannot
     * specify both a security group ID and security name in the same request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            [EC2-Classic, default VPC] One or more security group names.
     *            For a nondefault VPC, you must use security group IDs instead.
     *            You cannot specify both a security group ID and security name
     *            in the same request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) {
            this.securityGroups = new java.util.ArrayList<String>(securityGroups.length);
        }
        for (String value : securityGroups) {
            this.securityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] One or more security group names. For a
     * nondefault VPC, you must use security group IDs instead. You cannot
     * specify both a security group ID and security name in the same request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            [EC2-Classic, default VPC] One or more security group names.
     *            For a nondefault VPC, you must use security group IDs instead.
     *            You cannot specify both a security group ID and security name
     *            in the same request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The market (purchasing) option for the instances.
     * </p>
     *
     * @return <p>
     *         The market (purchasing) option for the instances.
     *         </p>
     */
    public LaunchTemplateInstanceMarketOptionsRequest getInstanceMarketOptions() {
        return instanceMarketOptions;
    }

    /**
     * <p>
     * The market (purchasing) option for the instances.
     * </p>
     *
     * @param instanceMarketOptions <p>
     *            The market (purchasing) option for the instances.
     *            </p>
     */
    public void setInstanceMarketOptions(
            LaunchTemplateInstanceMarketOptionsRequest instanceMarketOptions) {
        this.instanceMarketOptions = instanceMarketOptions;
    }

    /**
     * <p>
     * The market (purchasing) option for the instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceMarketOptions <p>
     *            The market (purchasing) option for the instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withInstanceMarketOptions(
            LaunchTemplateInstanceMarketOptionsRequest instanceMarketOptions) {
        this.instanceMarketOptions = instanceMarketOptions;
        return this;
    }

    /**
     * <p>
     * The credit option for CPU usage of the instance. Valid for T2 or T3
     * instances only.
     * </p>
     *
     * @return <p>
     *         The credit option for CPU usage of the instance. Valid for T2 or
     *         T3 instances only.
     *         </p>
     */
    public CreditSpecificationRequest getCreditSpecification() {
        return creditSpecification;
    }

    /**
     * <p>
     * The credit option for CPU usage of the instance. Valid for T2 or T3
     * instances only.
     * </p>
     *
     * @param creditSpecification <p>
     *            The credit option for CPU usage of the instance. Valid for T2
     *            or T3 instances only.
     *            </p>
     */
    public void setCreditSpecification(CreditSpecificationRequest creditSpecification) {
        this.creditSpecification = creditSpecification;
    }

    /**
     * <p>
     * The credit option for CPU usage of the instance. Valid for T2 or T3
     * instances only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creditSpecification <p>
     *            The credit option for CPU usage of the instance. Valid for T2
     *            or T3 instances only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withCreditSpecification(
            CreditSpecificationRequest creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }

    /**
     * <p>
     * The CPU options for the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html"
     * >Optimizing CPU Options</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The CPU options for the instance. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html"
     *         >Optimizing CPU Options</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide</i>.
     *         </p>
     */
    public LaunchTemplateCpuOptionsRequest getCpuOptions() {
        return cpuOptions;
    }

    /**
     * <p>
     * The CPU options for the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html"
     * >Optimizing CPU Options</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @param cpuOptions <p>
     *            The CPU options for the instance. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html"
     *            >Optimizing CPU Options</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     */
    public void setCpuOptions(LaunchTemplateCpuOptionsRequest cpuOptions) {
        this.cpuOptions = cpuOptions;
    }

    /**
     * <p>
     * The CPU options for the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html"
     * >Optimizing CPU Options</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cpuOptions <p>
     *            The CPU options for the instance. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html"
     *            >Optimizing CPU Options</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withCpuOptions(LaunchTemplateCpuOptionsRequest cpuOptions) {
        this.cpuOptions = cpuOptions;
        return this;
    }

    /**
     * <p>
     * The Capacity Reservation targeting option. If you do not specify this
     * parameter, the instance's Capacity Reservation preference defaults to
     * <code>open</code>, which enables it to run in any open Capacity
     * Reservation that has matching attributes (instance type, platform,
     * Availability Zone).
     * </p>
     *
     * @return <p>
     *         The Capacity Reservation targeting option. If you do not specify
     *         this parameter, the instance's Capacity Reservation preference
     *         defaults to <code>open</code>, which enables it to run in any
     *         open Capacity Reservation that has matching attributes (instance
     *         type, platform, Availability Zone).
     *         </p>
     */
    public LaunchTemplateCapacityReservationSpecificationRequest getCapacityReservationSpecification() {
        return capacityReservationSpecification;
    }

    /**
     * <p>
     * The Capacity Reservation targeting option. If you do not specify this
     * parameter, the instance's Capacity Reservation preference defaults to
     * <code>open</code>, which enables it to run in any open Capacity
     * Reservation that has matching attributes (instance type, platform,
     * Availability Zone).
     * </p>
     *
     * @param capacityReservationSpecification <p>
     *            The Capacity Reservation targeting option. If you do not
     *            specify this parameter, the instance's Capacity Reservation
     *            preference defaults to <code>open</code>, which enables it to
     *            run in any open Capacity Reservation that has matching
     *            attributes (instance type, platform, Availability Zone).
     *            </p>
     */
    public void setCapacityReservationSpecification(
            LaunchTemplateCapacityReservationSpecificationRequest capacityReservationSpecification) {
        this.capacityReservationSpecification = capacityReservationSpecification;
    }

    /**
     * <p>
     * The Capacity Reservation targeting option. If you do not specify this
     * parameter, the instance's Capacity Reservation preference defaults to
     * <code>open</code>, which enables it to run in any open Capacity
     * Reservation that has matching attributes (instance type, platform,
     * Availability Zone).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityReservationSpecification <p>
     *            The Capacity Reservation targeting option. If you do not
     *            specify this parameter, the instance's Capacity Reservation
     *            preference defaults to <code>open</code>, which enables it to
     *            run in any open Capacity Reservation that has matching
     *            attributes (instance type, platform, Availability Zone).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withCapacityReservationSpecification(
            LaunchTemplateCapacityReservationSpecificationRequest capacityReservationSpecification) {
        this.capacityReservationSpecification = capacityReservationSpecification;
        return this;
    }

    /**
     * <p>
     * The license configurations.
     * </p>
     *
     * @return <p>
     *         The license configurations.
     *         </p>
     */
    public java.util.List<LaunchTemplateLicenseConfigurationRequest> getLicenseSpecifications() {
        return licenseSpecifications;
    }

    /**
     * <p>
     * The license configurations.
     * </p>
     *
     * @param licenseSpecifications <p>
     *            The license configurations.
     *            </p>
     */
    public void setLicenseSpecifications(
            java.util.Collection<LaunchTemplateLicenseConfigurationRequest> licenseSpecifications) {
        if (licenseSpecifications == null) {
            this.licenseSpecifications = null;
            return;
        }

        this.licenseSpecifications = new java.util.ArrayList<LaunchTemplateLicenseConfigurationRequest>(
                licenseSpecifications);
    }

    /**
     * <p>
     * The license configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenseSpecifications <p>
     *            The license configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withLicenseSpecifications(
            LaunchTemplateLicenseConfigurationRequest... licenseSpecifications) {
        if (getLicenseSpecifications() == null) {
            this.licenseSpecifications = new java.util.ArrayList<LaunchTemplateLicenseConfigurationRequest>(
                    licenseSpecifications.length);
        }
        for (LaunchTemplateLicenseConfigurationRequest value : licenseSpecifications) {
            this.licenseSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The license configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenseSpecifications <p>
     *            The license configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withLicenseSpecifications(
            java.util.Collection<LaunchTemplateLicenseConfigurationRequest> licenseSpecifications) {
        setLicenseSpecifications(licenseSpecifications);
        return this;
    }

    /**
     * <p>
     * Indicates whether an instance is enabled for hibernation. This parameter
     * is valid only if the instance meets the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites"
     * >hibernation prerequisites</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     * >Hibernate Your Instance</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Indicates whether an instance is enabled for hibernation. This
     *         parameter is valid only if the instance meets the <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites"
     *         >hibernation prerequisites</a>. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     *         >Hibernate Your Instance</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide</i>.
     *         </p>
     */
    public LaunchTemplateHibernationOptionsRequest getHibernationOptions() {
        return hibernationOptions;
    }

    /**
     * <p>
     * Indicates whether an instance is enabled for hibernation. This parameter
     * is valid only if the instance meets the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites"
     * >hibernation prerequisites</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     * >Hibernate Your Instance</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @param hibernationOptions <p>
     *            Indicates whether an instance is enabled for hibernation. This
     *            parameter is valid only if the instance meets the <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites"
     *            >hibernation prerequisites</a>. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     *            >Hibernate Your Instance</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     */
    public void setHibernationOptions(LaunchTemplateHibernationOptionsRequest hibernationOptions) {
        this.hibernationOptions = hibernationOptions;
    }

    /**
     * <p>
     * Indicates whether an instance is enabled for hibernation. This parameter
     * is valid only if the instance meets the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites"
     * >hibernation prerequisites</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     * >Hibernate Your Instance</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hibernationOptions <p>
     *            Indicates whether an instance is enabled for hibernation. This
     *            parameter is valid only if the instance meets the <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites"
     *            >hibernation prerequisites</a>. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     *            >Hibernate Your Instance</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withHibernationOptions(
            LaunchTemplateHibernationOptionsRequest hibernationOptions) {
        this.hibernationOptions = hibernationOptions;
        return this;
    }

    /**
     * <p>
     * The metadata options for the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     * >Instance Metadata and User Data</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The metadata options for the instance. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     *         >Instance Metadata and User Data</a> in the <i>Amazon Elastic
     *         Compute Cloud User Guide</i>.
     *         </p>
     */
    public LaunchTemplateInstanceMetadataOptionsRequest getMetadataOptions() {
        return metadataOptions;
    }

    /**
     * <p>
     * The metadata options for the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     * >Instance Metadata and User Data</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     *
     * @param metadataOptions <p>
     *            The metadata options for the instance. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     *            >Instance Metadata and User Data</a> in the <i>Amazon Elastic
     *            Compute Cloud User Guide</i>.
     *            </p>
     */
    public void setMetadataOptions(LaunchTemplateInstanceMetadataOptionsRequest metadataOptions) {
        this.metadataOptions = metadataOptions;
    }

    /**
     * <p>
     * The metadata options for the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     * >Instance Metadata and User Data</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metadataOptions <p>
     *            The metadata options for the instance. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     *            >Instance Metadata and User Data</a> in the <i>Amazon Elastic
     *            Compute Cloud User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestLaunchTemplateData withMetadataOptions(
            LaunchTemplateInstanceMetadataOptionsRequest metadataOptions) {
        this.metadataOptions = metadataOptions;
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
        if (getKernelId() != null)
            sb.append("KernelId: " + getKernelId() + ",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: " + getEbsOptimized() + ",");
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: " + getNetworkInterfaces() + ",");
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getKeyName() != null)
            sb.append("KeyName: " + getKeyName() + ",");
        if (getMonitoring() != null)
            sb.append("Monitoring: " + getMonitoring() + ",");
        if (getPlacement() != null)
            sb.append("Placement: " + getPlacement() + ",");
        if (getRamDiskId() != null)
            sb.append("RamDiskId: " + getRamDiskId() + ",");
        if (getDisableApiTermination() != null)
            sb.append("DisableApiTermination: " + getDisableApiTermination() + ",");
        if (getInstanceInitiatedShutdownBehavior() != null)
            sb.append("InstanceInitiatedShutdownBehavior: "
                    + getInstanceInitiatedShutdownBehavior() + ",");
        if (getUserData() != null)
            sb.append("UserData: " + getUserData() + ",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: " + getTagSpecifications() + ",");
        if (getElasticGpuSpecifications() != null)
            sb.append("ElasticGpuSpecifications: " + getElasticGpuSpecifications() + ",");
        if (getElasticInferenceAccelerators() != null)
            sb.append("ElasticInferenceAccelerators: " + getElasticInferenceAccelerators() + ",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getInstanceMarketOptions() != null)
            sb.append("InstanceMarketOptions: " + getInstanceMarketOptions() + ",");
        if (getCreditSpecification() != null)
            sb.append("CreditSpecification: " + getCreditSpecification() + ",");
        if (getCpuOptions() != null)
            sb.append("CpuOptions: " + getCpuOptions() + ",");
        if (getCapacityReservationSpecification() != null)
            sb.append("CapacityReservationSpecification: " + getCapacityReservationSpecification()
                    + ",");
        if (getLicenseSpecifications() != null)
            sb.append("LicenseSpecifications: " + getLicenseSpecifications() + ",");
        if (getHibernationOptions() != null)
            sb.append("HibernationOptions: " + getHibernationOptions() + ",");
        if (getMetadataOptions() != null)
            sb.append("MetadataOptions: " + getMetadataOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode
                + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode
                + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
        hashCode = prime * hashCode
                + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getMonitoring() == null) ? 0 : getMonitoring().hashCode());
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        hashCode = prime * hashCode + ((getRamDiskId() == null) ? 0 : getRamDiskId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDisableApiTermination() == null) ? 0 : getDisableApiTermination().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceInitiatedShutdownBehavior() == null) ? 0
                        : getInstanceInitiatedShutdownBehavior().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode
                + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime
                * hashCode
                + ((getElasticGpuSpecifications() == null) ? 0 : getElasticGpuSpecifications()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getElasticInferenceAccelerators() == null) ? 0
                        : getElasticInferenceAccelerators().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceMarketOptions() == null) ? 0 : getInstanceMarketOptions().hashCode());
        hashCode = prime * hashCode
                + ((getCreditSpecification() == null) ? 0 : getCreditSpecification().hashCode());
        hashCode = prime * hashCode + ((getCpuOptions() == null) ? 0 : getCpuOptions().hashCode());
        hashCode = prime
                * hashCode
                + ((getCapacityReservationSpecification() == null) ? 0
                        : getCapacityReservationSpecification().hashCode());
        hashCode = prime
                * hashCode
                + ((getLicenseSpecifications() == null) ? 0 : getLicenseSpecifications().hashCode());
        hashCode = prime * hashCode
                + ((getHibernationOptions() == null) ? 0 : getHibernationOptions().hashCode());
        hashCode = prime * hashCode
                + ((getMetadataOptions() == null) ? 0 : getMetadataOptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequestLaunchTemplateData == false)
            return false;
        RequestLaunchTemplateData other = (RequestLaunchTemplateData) obj;

        if (other.getKernelId() == null ^ this.getKernelId() == null)
            return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null
                && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null)
            return false;
        if (other.getIamInstanceProfile() != null
                && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false)
            return false;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null
                && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null
                && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getMonitoring() == null ^ this.getMonitoring() == null)
            return false;
        if (other.getMonitoring() != null
                && other.getMonitoring().equals(this.getMonitoring()) == false)
            return false;
        if (other.getPlacement() == null ^ this.getPlacement() == null)
            return false;
        if (other.getPlacement() != null
                && other.getPlacement().equals(this.getPlacement()) == false)
            return false;
        if (other.getRamDiskId() == null ^ this.getRamDiskId() == null)
            return false;
        if (other.getRamDiskId() != null
                && other.getRamDiskId().equals(this.getRamDiskId()) == false)
            return false;
        if (other.getDisableApiTermination() == null ^ this.getDisableApiTermination() == null)
            return false;
        if (other.getDisableApiTermination() != null
                && other.getDisableApiTermination().equals(this.getDisableApiTermination()) == false)
            return false;
        if (other.getInstanceInitiatedShutdownBehavior() == null
                ^ this.getInstanceInitiatedShutdownBehavior() == null)
            return false;
        if (other.getInstanceInitiatedShutdownBehavior() != null
                && other.getInstanceInitiatedShutdownBehavior().equals(
                        this.getInstanceInitiatedShutdownBehavior()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null
                && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getElasticGpuSpecifications() == null
                ^ this.getElasticGpuSpecifications() == null)
            return false;
        if (other.getElasticGpuSpecifications() != null
                && other.getElasticGpuSpecifications().equals(this.getElasticGpuSpecifications()) == false)
            return false;
        if (other.getElasticInferenceAccelerators() == null
                ^ this.getElasticInferenceAccelerators() == null)
            return false;
        if (other.getElasticInferenceAccelerators() != null
                && other.getElasticInferenceAccelerators().equals(
                        this.getElasticInferenceAccelerators()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null
                && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getInstanceMarketOptions() == null ^ this.getInstanceMarketOptions() == null)
            return false;
        if (other.getInstanceMarketOptions() != null
                && other.getInstanceMarketOptions().equals(this.getInstanceMarketOptions()) == false)
            return false;
        if (other.getCreditSpecification() == null ^ this.getCreditSpecification() == null)
            return false;
        if (other.getCreditSpecification() != null
                && other.getCreditSpecification().equals(this.getCreditSpecification()) == false)
            return false;
        if (other.getCpuOptions() == null ^ this.getCpuOptions() == null)
            return false;
        if (other.getCpuOptions() != null
                && other.getCpuOptions().equals(this.getCpuOptions()) == false)
            return false;
        if (other.getCapacityReservationSpecification() == null
                ^ this.getCapacityReservationSpecification() == null)
            return false;
        if (other.getCapacityReservationSpecification() != null
                && other.getCapacityReservationSpecification().equals(
                        this.getCapacityReservationSpecification()) == false)
            return false;
        if (other.getLicenseSpecifications() == null ^ this.getLicenseSpecifications() == null)
            return false;
        if (other.getLicenseSpecifications() != null
                && other.getLicenseSpecifications().equals(this.getLicenseSpecifications()) == false)
            return false;
        if (other.getHibernationOptions() == null ^ this.getHibernationOptions() == null)
            return false;
        if (other.getHibernationOptions() != null
                && other.getHibernationOptions().equals(this.getHibernationOptions()) == false)
            return false;
        if (other.getMetadataOptions() == null ^ this.getMetadataOptions() == null)
            return false;
        if (other.getMetadataOptions() != null
                && other.getMetadataOptions().equals(this.getMetadataOptions()) == false)
            return false;
        return true;
    }
}
