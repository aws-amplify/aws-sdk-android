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
 * Launches the specified number of instances using an AMI for which you have
 * permissions.
 * </p>
 * <p>
 * You can specify a number of options, or leave the default options. The
 * following rules apply:
 * </p>
 * <ul>
 * <li>
 * <p>
 * [EC2-VPC] If you don't specify a subnet ID, we choose a default subnet from
 * your default VPC for you. If you don't have a default VPC, you must specify a
 * subnet ID in the request.
 * </p>
 * </li>
 * <li>
 * <p>
 * [EC2-Classic] If don't specify an Availability Zone, we choose one for you.
 * </p>
 * </li>
 * <li>
 * <p>
 * Some instance types must be launched into a VPC. If you do not have a default
 * VPC, or if you do not specify a subnet ID, the request fails. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-vpc.html#vpc-only-instance-types"
 * >Instance types available only in a VPC</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * [EC2-VPC] All instances have a network interface with a primary private IPv4
 * address. If you don't specify this address, we choose one from the IPv4 range
 * of your subnet.
 * </p>
 * </li>
 * <li>
 * <p>
 * Not all instance types support IPv6 addresses. For more information, see <a
 * href
 * ="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
 * >Instance types</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you don't specify a security group ID, we use the default security group.
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"
 * >Security groups</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * If any of the AMIs have a product code attached for which the user has not
 * subscribed, the request fails.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can create a <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html"
 * >launch template</a>, which is a resource that contains the parameters to
 * launch an instance. When you launch an instance using <a>RunInstances</a>,
 * you can specify the launch template instead of specifying the launch
 * parameters.
 * </p>
 * <p>
 * To ensure faster instance launches, break up large requests into smaller
 * batches. For example, create five separate launch requests for 100 instances
 * each instead of one launch request for 500 instances.
 * </p>
 * <p>
 * An instance is ready for you to use when it's in the <code>running</code>
 * state. You can check the state of your instance using
 * <a>DescribeInstances</a>. You can tag instances and EBS volumes during
 * launch, after launch, or both. For more information, see <a>CreateTags</a>
 * and <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
 * >Tagging your Amazon EC2 resources</a>.
 * </p>
 * <p>
 * Linux instances have access to the public key of the key pair at boot. You
 * can use this key to provide secure access to the instance. Amazon EC2 public
 * images use this feature to provide secure access without passwords. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Key
 * pairs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
 * </p>
 * <p>
 * For troubleshooting, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_InstanceStraightToTerminated.html"
 * >What to do if an instance immediately terminates</a>, and <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstancesConnecting.html"
 * >Troubleshooting connecting to your instance</a> in the <i>Amazon Elastic
 * Compute Cloud User Guide</i>.
 * </p>
 */
public class RunInstancesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The block device mapping entries.
     * </p>
     */
    private java.util.List<BlockDeviceMapping> blockDeviceMappings;

    /**
     * <p>
     * The ID of the AMI. An AMI ID is required to launch an instance and must
     * be specified here or in a launch template.
     * </p>
     */
    private String imageId;

    /**
     * <p>
     * The instance type. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Default: <code>m1.small</code>
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
     * r6g.metal, r6g.medium, r6g.large, r6g.xlarge, r6g.2xlarge, r6g.4xlarge,
     * r6g.8xlarge, r6g.12xlarge, r6g.16xlarge, x1.16xlarge, x1.32xlarge,
     * x1e.xlarge, x1e.2xlarge, x1e.4xlarge, x1e.8xlarge, x1e.16xlarge,
     * x1e.32xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, i3.large,
     * i3.xlarge, i3.2xlarge, i3.4xlarge, i3.8xlarge, i3.16xlarge, i3.metal,
     * i3en.large, i3en.xlarge, i3en.2xlarge, i3en.3xlarge, i3en.6xlarge,
     * i3en.12xlarge, i3en.24xlarge, i3en.metal, hi1.4xlarge, hs1.8xlarge,
     * c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge,
     * c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge,
     * c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge, c5.9xlarge, c5.12xlarge,
     * c5.18xlarge, c5.24xlarge, c5.metal, c5a.large, c5a.xlarge, c5a.2xlarge,
     * c5a.4xlarge, c5a.8xlarge, c5a.12xlarge, c5a.16xlarge, c5a.24xlarge,
     * c5d.large, c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge,
     * c5d.12xlarge, c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large,
     * c5n.xlarge, c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge,
     * c6g.metal, c6g.medium, c6g.large, c6g.xlarge, c6g.2xlarge, c6g.4xlarge,
     * c6g.8xlarge, c6g.12xlarge, c6g.16xlarge, cc1.4xlarge, cc2.8xlarge,
     * g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge, g3s.xlarge,
     * g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge, g4dn.12xlarge,
     * g4dn.16xlarge, g4dn.metal, cg1.4xlarge, p2.xlarge, p2.8xlarge,
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
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal,
     * m6g.medium, m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     */
    private String instanceType;

    /**
     * <p>
     * [EC2-VPC] The number of IPv6 addresses to associate with the primary
     * network interface. Amazon EC2 chooses the IPv6 addresses from the range
     * of your subnet. You cannot specify this option and the option to assign
     * specific IPv6 addresses in the same request. You can specify this option
     * if you've specified a minimum number of instances to launch.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the
     * same request.
     * </p>
     */
    private Integer ipv6AddressCount;

    /**
     * <p>
     * [EC2-VPC] The IPv6 addresses from the range of the subnet to associate
     * with the primary network interface. You cannot specify this option and
     * the option to assign a number of IPv6 addresses in the same request. You
     * cannot specify this option if you've specified a minimum number of
     * instances to launch.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the
     * same request.
     * </p>
     */
    private java.util.List<InstanceIpv6Address> ipv6Addresses;

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     * > PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     */
    private String kernelId;

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
     * The maximum number of instances to launch. If you specify more instances
     * than Amazon EC2 can launch in the target Availability Zone, Amazon EC2
     * launches the largest possible number of instances above
     * <code>MinCount</code>.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the
     * specified instance type. For more information about the default limits,
     * and how to request an increase, see <a href=
     * "http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2"
     * >How many instances can I run in Amazon EC2</a> in the Amazon EC2 FAQ.
     * </p>
     */
    private Integer maxCount;

    /**
     * <p>
     * The minimum number of instances to launch. If you specify a minimum that
     * is more instances than Amazon EC2 can launch in the target Availability
     * Zone, Amazon EC2 launches no instances.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the
     * specified instance type. For more information about the default limits,
     * and how to request an increase, see <a href=
     * "http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2"
     * >How many instances can I run in Amazon EC2</a> in the Amazon EC2 General
     * FAQ.
     * </p>
     */
    private Integer minCount;

    /**
     * <p>
     * Specifies whether detailed monitoring is enabled for the instance.
     * </p>
     */
    private RunInstancesMonitoringEnabled monitoring;

    /**
     * <p>
     * The placement for the instance.
     * </p>
     */
    private Placement placement;

    /**
     * <p>
     * The ID of the RAM disk to select. Some kernels require additional drivers
     * at launch. Check the kernel requirements for information about whether
     * you need to specify a RAM disk. To find kernel requirements, go to the
     * AWS Resource Center and search for the kernel ID.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     * > PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     */
    private String ramdiskId;

    /**
     * <p>
     * The IDs of the security groups. You can create a security group using <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSecurityGroup.html"
     * >CreateSecurityGroup</a>.
     * </p>
     * <p>
     * If you specify a network interface, you must specify any security groups
     * as part of the network interface.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * [EC2-Classic, default VPC] The names of the security groups. For a
     * nondefault VPC, you must use security group IDs instead.
     * </p>
     * <p>
     * If you specify a network interface, you must specify any security groups
     * as part of the network interface.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     */
    private java.util.List<String> securityGroups;

    /**
     * <p>
     * [EC2-VPC] The ID of the subnet to launch the instance into.
     * </p>
     * <p>
     * If you specify a network interface, you must specify any subnets as part
     * of the network interface.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * The user data to make available to the instance. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html"
     * >Running commands on your Linux instance at launch</a> (Linux) and <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     * >Adding User Data</a> (Windows). If you are using a command line tool,
     * base64-encoding is performed for you, and you can load the text from a
     * file. Otherwise, you must provide base64-encoded text. User data is
     * limited to 16 KB.
     * </p>
     */
    private String userData;

    /**
     * <p>
     * Reserved.
     * </p>
     */
    private String additionalInfo;

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency
     * of the request. If you do not specify a client token, a randomly
     * generated token is used for the request to ensure idempotency.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Maximum 64 ASCII characters
     * </p>
     */
    private String clientToken;

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
     * Default: <code>false</code>
     * </p>
     */
    private Boolean disableApiTermination;

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
     * Indicates whether the instance is optimized for Amazon EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal Amazon EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS-optimized instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean ebsOptimized;

    /**
     * <p>
     * The IAM instance profile.
     * </p>
     */
    private IamInstanceProfileSpecification iamInstanceProfile;

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
     * The network interfaces to associate with the instance. If you specify a
     * network interface, you must specify any security groups and subnets as
     * part of the network interface.
     * </p>
     */
    private java.util.List<InstanceNetworkInterfaceSpecification> networkInterfaces;

    /**
     * <p>
     * [EC2-VPC] The primary IPv4 address. You must specify a value from the
     * IPv4 address range of the subnet.
     * </p>
     * <p>
     * Only one private IP address can be designated as primary. You can't
     * specify this option if you've specified the option to designate a private
     * IP address as the primary IP address in a network interface
     * specification. You cannot specify this option if you're launching more
     * than one instance in the request.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the
     * same request.
     * </p>
     */
    private String privateIpAddress;

    /**
     * <p>
     * An elastic GPU to associate with the instance. An Elastic GPU is a GPU
     * resource that you can attach to your Windows instance to accelerate the
     * graphics performance of your applications. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html"
     * > Amazon EC2 Elastic GPUs</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     */
    private java.util.List<ElasticGpuSpecification> elasticGpuSpecification;

    /**
     * <p>
     * An elastic inference accelerator to associate with the instance. Elastic
     * inference accelerators are a resource you can attach to your Amazon EC2
     * instances to accelerate your Deep Learning (DL) inference workloads.
     * </p>
     * <p>
     * You cannot specify accelerators from different generations in the same
     * request.
     * </p>
     */
    private java.util.List<ElasticInferenceAccelerator> elasticInferenceAccelerators;

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
    private java.util.List<TagSpecification> tagSpecifications;

    /**
     * <p>
     * The launch template to use to launch the instances. Any parameters that
     * you specify in <a>RunInstances</a> override the same parameters in the
     * launch template. You can specify either the name or ID of a launch
     * template, but not both.
     * </p>
     */
    private LaunchTemplateSpecification launchTemplate;

    /**
     * <p>
     * The market (purchasing) option for the instances.
     * </p>
     * <p>
     * For <a>RunInstances</a>, persistent Spot Instance requests are only
     * supported when <b>InstanceInterruptionBehavior</b> is set to either
     * <code>hibernate</code> or <code>stop</code>.
     * </p>
     */
    private InstanceMarketOptionsRequest instanceMarketOptions;

    /**
     * <p>
     * The credit option for CPU usage of the burstable performance instance.
     * Valid values are <code>standard</code> and <code>unlimited</code>. To
     * change this attribute after launch, use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceCreditSpecification.html"
     * > ModifyInstanceCreditSpecification</a>. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html"
     * >Burstable performance instances</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>standard</code> (T2 instances) or <code>unlimited</code>
     * (T3/T3a instances)
     * </p>
     */
    private CreditSpecificationRequest creditSpecification;

    /**
     * <p>
     * The CPU options for the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html"
     * >Optimizing CPU options</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     */
    private CpuOptionsRequest cpuOptions;

    /**
     * <p>
     * Information about the Capacity Reservation targeting option. If you do
     * not specify this parameter, the instance's Capacity Reservation
     * preference defaults to <code>open</code>, which enables it to run in any
     * open Capacity Reservation that has matching attributes (instance type,
     * platform, Availability Zone).
     * </p>
     */
    private CapacityReservationSpecification capacityReservationSpecification;

    /**
     * <p>
     * Indicates whether an instance is enabled for hibernation. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     * >Hibernate your instance</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     */
    private HibernationOptionsRequest hibernationOptions;

    /**
     * <p>
     * The license configurations.
     * </p>
     */
    private java.util.List<LicenseConfigurationRequest> licenseSpecifications;

    /**
     * <p>
     * The metadata options for the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     * >Instance metadata and user data</a>.
     * </p>
     */
    private InstanceMetadataOptionsRequest metadataOptions;

    /**
     * <p>
     * The block device mapping entries.
     * </p>
     *
     * @return <p>
     *         The block device mapping entries.
     *         </p>
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * <p>
     * The block device mapping entries.
     * </p>
     *
     * @param blockDeviceMappings <p>
     *            The block device mapping entries.
     *            </p>
     */
    public void setBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new java.util.ArrayList<BlockDeviceMapping>(blockDeviceMappings);
    }

    /**
     * <p>
     * The block device mapping entries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            The block device mapping entries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) {
            this.blockDeviceMappings = new java.util.ArrayList<BlockDeviceMapping>(
                    blockDeviceMappings.length);
        }
        for (BlockDeviceMapping value : blockDeviceMappings) {
            this.blockDeviceMappings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The block device mapping entries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            The block device mapping entries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withBlockDeviceMappings(
            java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * The ID of the AMI. An AMI ID is required to launch an instance and must
     * be specified here or in a launch template.
     * </p>
     *
     * @return <p>
     *         The ID of the AMI. An AMI ID is required to launch an instance
     *         and must be specified here or in a launch template.
     *         </p>
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * <p>
     * The ID of the AMI. An AMI ID is required to launch an instance and must
     * be specified here or in a launch template.
     * </p>
     *
     * @param imageId <p>
     *            The ID of the AMI. An AMI ID is required to launch an instance
     *            and must be specified here or in a launch template.
     *            </p>
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the AMI. An AMI ID is required to launch an instance and must
     * be specified here or in a launch template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageId <p>
     *            The ID of the AMI. An AMI ID is required to launch an instance
     *            and must be specified here or in a launch template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * <p>
     * The instance type. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Default: <code>m1.small</code>
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
     * r6g.metal, r6g.medium, r6g.large, r6g.xlarge, r6g.2xlarge, r6g.4xlarge,
     * r6g.8xlarge, r6g.12xlarge, r6g.16xlarge, x1.16xlarge, x1.32xlarge,
     * x1e.xlarge, x1e.2xlarge, x1e.4xlarge, x1e.8xlarge, x1e.16xlarge,
     * x1e.32xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, i3.large,
     * i3.xlarge, i3.2xlarge, i3.4xlarge, i3.8xlarge, i3.16xlarge, i3.metal,
     * i3en.large, i3en.xlarge, i3en.2xlarge, i3en.3xlarge, i3en.6xlarge,
     * i3en.12xlarge, i3en.24xlarge, i3en.metal, hi1.4xlarge, hs1.8xlarge,
     * c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge,
     * c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge,
     * c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge, c5.9xlarge, c5.12xlarge,
     * c5.18xlarge, c5.24xlarge, c5.metal, c5a.large, c5a.xlarge, c5a.2xlarge,
     * c5a.4xlarge, c5a.8xlarge, c5a.12xlarge, c5a.16xlarge, c5a.24xlarge,
     * c5d.large, c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge,
     * c5d.12xlarge, c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large,
     * c5n.xlarge, c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge,
     * c6g.metal, c6g.medium, c6g.large, c6g.xlarge, c6g.2xlarge, c6g.4xlarge,
     * c6g.8xlarge, c6g.12xlarge, c6g.16xlarge, cc1.4xlarge, cc2.8xlarge,
     * g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge, g3s.xlarge,
     * g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge, g4dn.12xlarge,
     * g4dn.16xlarge, g4dn.metal, cg1.4xlarge, p2.xlarge, p2.8xlarge,
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
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal,
     * m6g.medium, m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     *
     * @return <p>
     *         The instance type. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *         >Instance types</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *         </p>
     *         <p>
     *         Default: <code>m1.small</code>
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
     * >Instance types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Default: <code>m1.small</code>
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
     * r6g.metal, r6g.medium, r6g.large, r6g.xlarge, r6g.2xlarge, r6g.4xlarge,
     * r6g.8xlarge, r6g.12xlarge, r6g.16xlarge, x1.16xlarge, x1.32xlarge,
     * x1e.xlarge, x1e.2xlarge, x1e.4xlarge, x1e.8xlarge, x1e.16xlarge,
     * x1e.32xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, i3.large,
     * i3.xlarge, i3.2xlarge, i3.4xlarge, i3.8xlarge, i3.16xlarge, i3.metal,
     * i3en.large, i3en.xlarge, i3en.2xlarge, i3en.3xlarge, i3en.6xlarge,
     * i3en.12xlarge, i3en.24xlarge, i3en.metal, hi1.4xlarge, hs1.8xlarge,
     * c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge,
     * c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge,
     * c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge, c5.9xlarge, c5.12xlarge,
     * c5.18xlarge, c5.24xlarge, c5.metal, c5a.large, c5a.xlarge, c5a.2xlarge,
     * c5a.4xlarge, c5a.8xlarge, c5a.12xlarge, c5a.16xlarge, c5a.24xlarge,
     * c5d.large, c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge,
     * c5d.12xlarge, c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large,
     * c5n.xlarge, c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge,
     * c6g.metal, c6g.medium, c6g.large, c6g.xlarge, c6g.2xlarge, c6g.4xlarge,
     * c6g.8xlarge, c6g.12xlarge, c6g.16xlarge, cc1.4xlarge, cc2.8xlarge,
     * g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge, g3s.xlarge,
     * g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge, g4dn.12xlarge,
     * g4dn.16xlarge, g4dn.metal, cg1.4xlarge, p2.xlarge, p2.8xlarge,
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
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal,
     * m6g.medium, m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     *
     * @param instanceType <p>
     *            The instance type. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *            >Instance types</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     *            <p>
     *            Default: <code>m1.small</code>
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
     * >Instance types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Default: <code>m1.small</code>
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
     * r6g.metal, r6g.medium, r6g.large, r6g.xlarge, r6g.2xlarge, r6g.4xlarge,
     * r6g.8xlarge, r6g.12xlarge, r6g.16xlarge, x1.16xlarge, x1.32xlarge,
     * x1e.xlarge, x1e.2xlarge, x1e.4xlarge, x1e.8xlarge, x1e.16xlarge,
     * x1e.32xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, i3.large,
     * i3.xlarge, i3.2xlarge, i3.4xlarge, i3.8xlarge, i3.16xlarge, i3.metal,
     * i3en.large, i3en.xlarge, i3en.2xlarge, i3en.3xlarge, i3en.6xlarge,
     * i3en.12xlarge, i3en.24xlarge, i3en.metal, hi1.4xlarge, hs1.8xlarge,
     * c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge,
     * c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge,
     * c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge, c5.9xlarge, c5.12xlarge,
     * c5.18xlarge, c5.24xlarge, c5.metal, c5a.large, c5a.xlarge, c5a.2xlarge,
     * c5a.4xlarge, c5a.8xlarge, c5a.12xlarge, c5a.16xlarge, c5a.24xlarge,
     * c5d.large, c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge,
     * c5d.12xlarge, c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large,
     * c5n.xlarge, c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge,
     * c6g.metal, c6g.medium, c6g.large, c6g.xlarge, c6g.2xlarge, c6g.4xlarge,
     * c6g.8xlarge, c6g.12xlarge, c6g.16xlarge, cc1.4xlarge, cc2.8xlarge,
     * g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge, g3s.xlarge,
     * g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge, g4dn.12xlarge,
     * g4dn.16xlarge, g4dn.metal, cg1.4xlarge, p2.xlarge, p2.8xlarge,
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
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal,
     * m6g.medium, m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     *
     * @param instanceType <p>
     *            The instance type. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *            >Instance types</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     *            <p>
     *            Default: <code>m1.small</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public RunInstancesRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The instance type. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Default: <code>m1.small</code>
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
     * r6g.metal, r6g.medium, r6g.large, r6g.xlarge, r6g.2xlarge, r6g.4xlarge,
     * r6g.8xlarge, r6g.12xlarge, r6g.16xlarge, x1.16xlarge, x1.32xlarge,
     * x1e.xlarge, x1e.2xlarge, x1e.4xlarge, x1e.8xlarge, x1e.16xlarge,
     * x1e.32xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, i3.large,
     * i3.xlarge, i3.2xlarge, i3.4xlarge, i3.8xlarge, i3.16xlarge, i3.metal,
     * i3en.large, i3en.xlarge, i3en.2xlarge, i3en.3xlarge, i3en.6xlarge,
     * i3en.12xlarge, i3en.24xlarge, i3en.metal, hi1.4xlarge, hs1.8xlarge,
     * c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge,
     * c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge,
     * c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge, c5.9xlarge, c5.12xlarge,
     * c5.18xlarge, c5.24xlarge, c5.metal, c5a.large, c5a.xlarge, c5a.2xlarge,
     * c5a.4xlarge, c5a.8xlarge, c5a.12xlarge, c5a.16xlarge, c5a.24xlarge,
     * c5d.large, c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge,
     * c5d.12xlarge, c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large,
     * c5n.xlarge, c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge,
     * c6g.metal, c6g.medium, c6g.large, c6g.xlarge, c6g.2xlarge, c6g.4xlarge,
     * c6g.8xlarge, c6g.12xlarge, c6g.16xlarge, cc1.4xlarge, cc2.8xlarge,
     * g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge, g3s.xlarge,
     * g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge, g4dn.12xlarge,
     * g4dn.16xlarge, g4dn.metal, cg1.4xlarge, p2.xlarge, p2.8xlarge,
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
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal,
     * m6g.medium, m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     *
     * @param instanceType <p>
     *            The instance type. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *            >Instance types</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     *            <p>
     *            Default: <code>m1.small</code>
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
     * >Instance types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Default: <code>m1.small</code>
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
     * r6g.metal, r6g.medium, r6g.large, r6g.xlarge, r6g.2xlarge, r6g.4xlarge,
     * r6g.8xlarge, r6g.12xlarge, r6g.16xlarge, x1.16xlarge, x1.32xlarge,
     * x1e.xlarge, x1e.2xlarge, x1e.4xlarge, x1e.8xlarge, x1e.16xlarge,
     * x1e.32xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, i3.large,
     * i3.xlarge, i3.2xlarge, i3.4xlarge, i3.8xlarge, i3.16xlarge, i3.metal,
     * i3en.large, i3en.xlarge, i3en.2xlarge, i3en.3xlarge, i3en.6xlarge,
     * i3en.12xlarge, i3en.24xlarge, i3en.metal, hi1.4xlarge, hs1.8xlarge,
     * c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge,
     * c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge,
     * c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge, c5.9xlarge, c5.12xlarge,
     * c5.18xlarge, c5.24xlarge, c5.metal, c5a.large, c5a.xlarge, c5a.2xlarge,
     * c5a.4xlarge, c5a.8xlarge, c5a.12xlarge, c5a.16xlarge, c5a.24xlarge,
     * c5d.large, c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge,
     * c5d.12xlarge, c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large,
     * c5n.xlarge, c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge,
     * c6g.metal, c6g.medium, c6g.large, c6g.xlarge, c6g.2xlarge, c6g.4xlarge,
     * c6g.8xlarge, c6g.12xlarge, c6g.16xlarge, cc1.4xlarge, cc2.8xlarge,
     * g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge, g3s.xlarge,
     * g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge, g4dn.12xlarge,
     * g4dn.16xlarge, g4dn.metal, cg1.4xlarge, p2.xlarge, p2.8xlarge,
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
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal,
     * m6g.medium, m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     *
     * @param instanceType <p>
     *            The instance type. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *            >Instance types</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     *            <p>
     *            Default: <code>m1.small</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public RunInstancesRequest withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The number of IPv6 addresses to associate with the primary
     * network interface. Amazon EC2 chooses the IPv6 addresses from the range
     * of your subnet. You cannot specify this option and the option to assign
     * specific IPv6 addresses in the same request. You can specify this option
     * if you've specified a minimum number of instances to launch.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the
     * same request.
     * </p>
     *
     * @return <p>
     *         [EC2-VPC] The number of IPv6 addresses to associate with the
     *         primary network interface. Amazon EC2 chooses the IPv6 addresses
     *         from the range of your subnet. You cannot specify this option and
     *         the option to assign specific IPv6 addresses in the same request.
     *         You can specify this option if you've specified a minimum number
     *         of instances to launch.
     *         </p>
     *         <p>
     *         You cannot specify this option and the network interfaces option
     *         in the same request.
     *         </p>
     */
    public Integer getIpv6AddressCount() {
        return ipv6AddressCount;
    }

    /**
     * <p>
     * [EC2-VPC] The number of IPv6 addresses to associate with the primary
     * network interface. Amazon EC2 chooses the IPv6 addresses from the range
     * of your subnet. You cannot specify this option and the option to assign
     * specific IPv6 addresses in the same request. You can specify this option
     * if you've specified a minimum number of instances to launch.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the
     * same request.
     * </p>
     *
     * @param ipv6AddressCount <p>
     *            [EC2-VPC] The number of IPv6 addresses to associate with the
     *            primary network interface. Amazon EC2 chooses the IPv6
     *            addresses from the range of your subnet. You cannot specify
     *            this option and the option to assign specific IPv6 addresses
     *            in the same request. You can specify this option if you've
     *            specified a minimum number of instances to launch.
     *            </p>
     *            <p>
     *            You cannot specify this option and the network interfaces
     *            option in the same request.
     *            </p>
     */
    public void setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
    }

    /**
     * <p>
     * [EC2-VPC] The number of IPv6 addresses to associate with the primary
     * network interface. Amazon EC2 chooses the IPv6 addresses from the range
     * of your subnet. You cannot specify this option and the option to assign
     * specific IPv6 addresses in the same request. You can specify this option
     * if you've specified a minimum number of instances to launch.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the
     * same request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6AddressCount <p>
     *            [EC2-VPC] The number of IPv6 addresses to associate with the
     *            primary network interface. Amazon EC2 chooses the IPv6
     *            addresses from the range of your subnet. You cannot specify
     *            this option and the option to assign specific IPv6 addresses
     *            in the same request. You can specify this option if you've
     *            specified a minimum number of instances to launch.
     *            </p>
     *            <p>
     *            You cannot specify this option and the network interfaces
     *            option in the same request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The IPv6 addresses from the range of the subnet to associate
     * with the primary network interface. You cannot specify this option and
     * the option to assign a number of IPv6 addresses in the same request. You
     * cannot specify this option if you've specified a minimum number of
     * instances to launch.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the
     * same request.
     * </p>
     *
     * @return <p>
     *         [EC2-VPC] The IPv6 addresses from the range of the subnet to
     *         associate with the primary network interface. You cannot specify
     *         this option and the option to assign a number of IPv6 addresses
     *         in the same request. You cannot specify this option if you've
     *         specified a minimum number of instances to launch.
     *         </p>
     *         <p>
     *         You cannot specify this option and the network interfaces option
     *         in the same request.
     *         </p>
     */
    public java.util.List<InstanceIpv6Address> getIpv6Addresses() {
        return ipv6Addresses;
    }

    /**
     * <p>
     * [EC2-VPC] The IPv6 addresses from the range of the subnet to associate
     * with the primary network interface. You cannot specify this option and
     * the option to assign a number of IPv6 addresses in the same request. You
     * cannot specify this option if you've specified a minimum number of
     * instances to launch.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the
     * same request.
     * </p>
     *
     * @param ipv6Addresses <p>
     *            [EC2-VPC] The IPv6 addresses from the range of the subnet to
     *            associate with the primary network interface. You cannot
     *            specify this option and the option to assign a number of IPv6
     *            addresses in the same request. You cannot specify this option
     *            if you've specified a minimum number of instances to launch.
     *            </p>
     *            <p>
     *            You cannot specify this option and the network interfaces
     *            option in the same request.
     *            </p>
     */
    public void setIpv6Addresses(java.util.Collection<InstanceIpv6Address> ipv6Addresses) {
        if (ipv6Addresses == null) {
            this.ipv6Addresses = null;
            return;
        }

        this.ipv6Addresses = new java.util.ArrayList<InstanceIpv6Address>(ipv6Addresses);
    }

    /**
     * <p>
     * [EC2-VPC] The IPv6 addresses from the range of the subnet to associate
     * with the primary network interface. You cannot specify this option and
     * the option to assign a number of IPv6 addresses in the same request. You
     * cannot specify this option if you've specified a minimum number of
     * instances to launch.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the
     * same request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Addresses <p>
     *            [EC2-VPC] The IPv6 addresses from the range of the subnet to
     *            associate with the primary network interface. You cannot
     *            specify this option and the option to assign a number of IPv6
     *            addresses in the same request. You cannot specify this option
     *            if you've specified a minimum number of instances to launch.
     *            </p>
     *            <p>
     *            You cannot specify this option and the network interfaces
     *            option in the same request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withIpv6Addresses(InstanceIpv6Address... ipv6Addresses) {
        if (getIpv6Addresses() == null) {
            this.ipv6Addresses = new java.util.ArrayList<InstanceIpv6Address>(ipv6Addresses.length);
        }
        for (InstanceIpv6Address value : ipv6Addresses) {
            this.ipv6Addresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The IPv6 addresses from the range of the subnet to associate
     * with the primary network interface. You cannot specify this option and
     * the option to assign a number of IPv6 addresses in the same request. You
     * cannot specify this option if you've specified a minimum number of
     * instances to launch.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the
     * same request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Addresses <p>
     *            [EC2-VPC] The IPv6 addresses from the range of the subnet to
     *            associate with the primary network interface. You cannot
     *            specify this option and the option to assign a number of IPv6
     *            addresses in the same request. You cannot specify this option
     *            if you've specified a minimum number of instances to launch.
     *            </p>
     *            <p>
     *            You cannot specify this option and the network interfaces
     *            option in the same request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withIpv6Addresses(
            java.util.Collection<InstanceIpv6Address> ipv6Addresses) {
        setIpv6Addresses(ipv6Addresses);
        return this;
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
     * > PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
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
     *         > PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
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
     * > PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
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
     *            > PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User
     *            Guide</i>.
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
     * > PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
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
     *            > PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User
     *            Guide</i>.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withKernelId(String kernelId) {
        this.kernelId = kernelId;
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
    public RunInstancesRequest withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * <p>
     * The maximum number of instances to launch. If you specify more instances
     * than Amazon EC2 can launch in the target Availability Zone, Amazon EC2
     * launches the largest possible number of instances above
     * <code>MinCount</code>.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the
     * specified instance type. For more information about the default limits,
     * and how to request an increase, see <a href=
     * "http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2"
     * >How many instances can I run in Amazon EC2</a> in the Amazon EC2 FAQ.
     * </p>
     *
     * @return <p>
     *         The maximum number of instances to launch. If you specify more
     *         instances than Amazon EC2 can launch in the target Availability
     *         Zone, Amazon EC2 launches the largest possible number of
     *         instances above <code>MinCount</code>.
     *         </p>
     *         <p>
     *         Constraints: Between 1 and the maximum number you're allowed for
     *         the specified instance type. For more information about the
     *         default limits, and how to request an increase, see <a href=
     *         "http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2"
     *         >How many instances can I run in Amazon EC2</a> in the Amazon EC2
     *         FAQ.
     *         </p>
     */
    public Integer getMaxCount() {
        return maxCount;
    }

    /**
     * <p>
     * The maximum number of instances to launch. If you specify more instances
     * than Amazon EC2 can launch in the target Availability Zone, Amazon EC2
     * launches the largest possible number of instances above
     * <code>MinCount</code>.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the
     * specified instance type. For more information about the default limits,
     * and how to request an increase, see <a href=
     * "http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2"
     * >How many instances can I run in Amazon EC2</a> in the Amazon EC2 FAQ.
     * </p>
     *
     * @param maxCount <p>
     *            The maximum number of instances to launch. If you specify more
     *            instances than Amazon EC2 can launch in the target
     *            Availability Zone, Amazon EC2 launches the largest possible
     *            number of instances above <code>MinCount</code>.
     *            </p>
     *            <p>
     *            Constraints: Between 1 and the maximum number you're allowed
     *            for the specified instance type. For more information about
     *            the default limits, and how to request an increase, see <a
     *            href=
     *            "http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2"
     *            >How many instances can I run in Amazon EC2</a> in the Amazon
     *            EC2 FAQ.
     *            </p>
     */
    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    /**
     * <p>
     * The maximum number of instances to launch. If you specify more instances
     * than Amazon EC2 can launch in the target Availability Zone, Amazon EC2
     * launches the largest possible number of instances above
     * <code>MinCount</code>.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the
     * specified instance type. For more information about the default limits,
     * and how to request an increase, see <a href=
     * "http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2"
     * >How many instances can I run in Amazon EC2</a> in the Amazon EC2 FAQ.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxCount <p>
     *            The maximum number of instances to launch. If you specify more
     *            instances than Amazon EC2 can launch in the target
     *            Availability Zone, Amazon EC2 launches the largest possible
     *            number of instances above <code>MinCount</code>.
     *            </p>
     *            <p>
     *            Constraints: Between 1 and the maximum number you're allowed
     *            for the specified instance type. For more information about
     *            the default limits, and how to request an increase, see <a
     *            href=
     *            "http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2"
     *            >How many instances can I run in Amazon EC2</a> in the Amazon
     *            EC2 FAQ.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * <p>
     * The minimum number of instances to launch. If you specify a minimum that
     * is more instances than Amazon EC2 can launch in the target Availability
     * Zone, Amazon EC2 launches no instances.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the
     * specified instance type. For more information about the default limits,
     * and how to request an increase, see <a href=
     * "http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2"
     * >How many instances can I run in Amazon EC2</a> in the Amazon EC2 General
     * FAQ.
     * </p>
     *
     * @return <p>
     *         The minimum number of instances to launch. If you specify a
     *         minimum that is more instances than Amazon EC2 can launch in the
     *         target Availability Zone, Amazon EC2 launches no instances.
     *         </p>
     *         <p>
     *         Constraints: Between 1 and the maximum number you're allowed for
     *         the specified instance type. For more information about the
     *         default limits, and how to request an increase, see <a href=
     *         "http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2"
     *         >How many instances can I run in Amazon EC2</a> in the Amazon EC2
     *         General FAQ.
     *         </p>
     */
    public Integer getMinCount() {
        return minCount;
    }

    /**
     * <p>
     * The minimum number of instances to launch. If you specify a minimum that
     * is more instances than Amazon EC2 can launch in the target Availability
     * Zone, Amazon EC2 launches no instances.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the
     * specified instance type. For more information about the default limits,
     * and how to request an increase, see <a href=
     * "http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2"
     * >How many instances can I run in Amazon EC2</a> in the Amazon EC2 General
     * FAQ.
     * </p>
     *
     * @param minCount <p>
     *            The minimum number of instances to launch. If you specify a
     *            minimum that is more instances than Amazon EC2 can launch in
     *            the target Availability Zone, Amazon EC2 launches no
     *            instances.
     *            </p>
     *            <p>
     *            Constraints: Between 1 and the maximum number you're allowed
     *            for the specified instance type. For more information about
     *            the default limits, and how to request an increase, see <a
     *            href=
     *            "http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2"
     *            >How many instances can I run in Amazon EC2</a> in the Amazon
     *            EC2 General FAQ.
     *            </p>
     */
    public void setMinCount(Integer minCount) {
        this.minCount = minCount;
    }

    /**
     * <p>
     * The minimum number of instances to launch. If you specify a minimum that
     * is more instances than Amazon EC2 can launch in the target Availability
     * Zone, Amazon EC2 launches no instances.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the
     * specified instance type. For more information about the default limits,
     * and how to request an increase, see <a href=
     * "http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2"
     * >How many instances can I run in Amazon EC2</a> in the Amazon EC2 General
     * FAQ.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minCount <p>
     *            The minimum number of instances to launch. If you specify a
     *            minimum that is more instances than Amazon EC2 can launch in
     *            the target Availability Zone, Amazon EC2 launches no
     *            instances.
     *            </p>
     *            <p>
     *            Constraints: Between 1 and the maximum number you're allowed
     *            for the specified instance type. For more information about
     *            the default limits, and how to request an increase, see <a
     *            href=
     *            "http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2"
     *            >How many instances can I run in Amazon EC2</a> in the Amazon
     *            EC2 General FAQ.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withMinCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }

    /**
     * <p>
     * Specifies whether detailed monitoring is enabled for the instance.
     * </p>
     *
     * @return <p>
     *         Specifies whether detailed monitoring is enabled for the
     *         instance.
     *         </p>
     */
    public RunInstancesMonitoringEnabled getMonitoring() {
        return monitoring;
    }

    /**
     * <p>
     * Specifies whether detailed monitoring is enabled for the instance.
     * </p>
     *
     * @param monitoring <p>
     *            Specifies whether detailed monitoring is enabled for the
     *            instance.
     *            </p>
     */
    public void setMonitoring(RunInstancesMonitoringEnabled monitoring) {
        this.monitoring = monitoring;
    }

    /**
     * <p>
     * Specifies whether detailed monitoring is enabled for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoring <p>
     *            Specifies whether detailed monitoring is enabled for the
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withMonitoring(RunInstancesMonitoringEnabled monitoring) {
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
    public Placement getPlacement() {
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
    public void setPlacement(Placement placement) {
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
    public RunInstancesRequest withPlacement(Placement placement) {
        this.placement = placement;
        return this;
    }

    /**
     * <p>
     * The ID of the RAM disk to select. Some kernels require additional drivers
     * at launch. Check the kernel requirements for information about whether
     * you need to specify a RAM disk. To find kernel requirements, go to the
     * AWS Resource Center and search for the kernel ID.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     * > PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     *
     * @return <p>
     *         The ID of the RAM disk to select. Some kernels require additional
     *         drivers at launch. Check the kernel requirements for information
     *         about whether you need to specify a RAM disk. To find kernel
     *         requirements, go to the AWS Resource Center and search for the
     *         kernel ID.
     *         </p>
     *         <important>
     *         <p>
     *         We recommend that you use PV-GRUB instead of kernels and RAM
     *         disks. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     *         > PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *         </p>
     *         </important>
     */
    public String getRamdiskId() {
        return ramdiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk to select. Some kernels require additional drivers
     * at launch. Check the kernel requirements for information about whether
     * you need to specify a RAM disk. To find kernel requirements, go to the
     * AWS Resource Center and search for the kernel ID.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     * > PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     *
     * @param ramdiskId <p>
     *            The ID of the RAM disk to select. Some kernels require
     *            additional drivers at launch. Check the kernel requirements
     *            for information about whether you need to specify a RAM disk.
     *            To find kernel requirements, go to the AWS Resource Center and
     *            search for the kernel ID.
     *            </p>
     *            <important>
     *            <p>
     *            We recommend that you use PV-GRUB instead of kernels and RAM
     *            disks. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     *            > PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User
     *            Guide</i>.
     *            </p>
     *            </important>
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk to select. Some kernels require additional drivers
     * at launch. Check the kernel requirements for information about whether
     * you need to specify a RAM disk. To find kernel requirements, go to the
     * AWS Resource Center and search for the kernel ID.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     * > PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ramdiskId <p>
     *            The ID of the RAM disk to select. Some kernels require
     *            additional drivers at launch. Check the kernel requirements
     *            for information about whether you need to specify a RAM disk.
     *            To find kernel requirements, go to the AWS Resource Center and
     *            search for the kernel ID.
     *            </p>
     *            <important>
     *            <p>
     *            We recommend that you use PV-GRUB instead of kernels and RAM
     *            disks. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"
     *            > PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User
     *            Guide</i>.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups. You can create a security group using <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSecurityGroup.html"
     * >CreateSecurityGroup</a>.
     * </p>
     * <p>
     * If you specify a network interface, you must specify any security groups
     * as part of the network interface.
     * </p>
     *
     * @return <p>
     *         The IDs of the security groups. You can create a security group
     *         using <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSecurityGroup.html"
     *         >CreateSecurityGroup</a>.
     *         </p>
     *         <p>
     *         If you specify a network interface, you must specify any security
     *         groups as part of the network interface.
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The IDs of the security groups. You can create a security group using <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSecurityGroup.html"
     * >CreateSecurityGroup</a>.
     * </p>
     * <p>
     * If you specify a network interface, you must specify any security groups
     * as part of the network interface.
     * </p>
     *
     * @param securityGroupIds <p>
     *            The IDs of the security groups. You can create a security
     *            group using <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSecurityGroup.html"
     *            >CreateSecurityGroup</a>.
     *            </p>
     *            <p>
     *            If you specify a network interface, you must specify any
     *            security groups as part of the network interface.
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
     * The IDs of the security groups. You can create a security group using <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSecurityGroup.html"
     * >CreateSecurityGroup</a>.
     * </p>
     * <p>
     * If you specify a network interface, you must specify any security groups
     * as part of the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The IDs of the security groups. You can create a security
     *            group using <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSecurityGroup.html"
     *            >CreateSecurityGroup</a>.
     *            </p>
     *            <p>
     *            If you specify a network interface, you must specify any
     *            security groups as part of the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withSecurityGroupIds(String... securityGroupIds) {
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
     * The IDs of the security groups. You can create a security group using <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSecurityGroup.html"
     * >CreateSecurityGroup</a>.
     * </p>
     * <p>
     * If you specify a network interface, you must specify any security groups
     * as part of the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The IDs of the security groups. You can create a security
     *            group using <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSecurityGroup.html"
     *            >CreateSecurityGroup</a>.
     *            </p>
     *            <p>
     *            If you specify a network interface, you must specify any
     *            security groups as part of the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The names of the security groups. For a
     * nondefault VPC, you must use security group IDs instead.
     * </p>
     * <p>
     * If you specify a network interface, you must specify any security groups
     * as part of the network interface.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     *
     * @return <p>
     *         [EC2-Classic, default VPC] The names of the security groups. For
     *         a nondefault VPC, you must use security group IDs instead.
     *         </p>
     *         <p>
     *         If you specify a network interface, you must specify any security
     *         groups as part of the network interface.
     *         </p>
     *         <p>
     *         Default: Amazon EC2 uses the default security group.
     *         </p>
     */
    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The names of the security groups. For a
     * nondefault VPC, you must use security group IDs instead.
     * </p>
     * <p>
     * If you specify a network interface, you must specify any security groups
     * as part of the network interface.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     *
     * @param securityGroups <p>
     *            [EC2-Classic, default VPC] The names of the security groups.
     *            For a nondefault VPC, you must use security group IDs instead.
     *            </p>
     *            <p>
     *            If you specify a network interface, you must specify any
     *            security groups as part of the network interface.
     *            </p>
     *            <p>
     *            Default: Amazon EC2 uses the default security group.
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
     * [EC2-Classic, default VPC] The names of the security groups. For a
     * nondefault VPC, you must use security group IDs instead.
     * </p>
     * <p>
     * If you specify a network interface, you must specify any security groups
     * as part of the network interface.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            [EC2-Classic, default VPC] The names of the security groups.
     *            For a nondefault VPC, you must use security group IDs instead.
     *            </p>
     *            <p>
     *            If you specify a network interface, you must specify any
     *            security groups as part of the network interface.
     *            </p>
     *            <p>
     *            Default: Amazon EC2 uses the default security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withSecurityGroups(String... securityGroups) {
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
     * [EC2-Classic, default VPC] The names of the security groups. For a
     * nondefault VPC, you must use security group IDs instead.
     * </p>
     * <p>
     * If you specify a network interface, you must specify any security groups
     * as part of the network interface.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            [EC2-Classic, default VPC] The names of the security groups.
     *            For a nondefault VPC, you must use security group IDs instead.
     *            </p>
     *            <p>
     *            If you specify a network interface, you must specify any
     *            security groups as part of the network interface.
     *            </p>
     *            <p>
     *            Default: Amazon EC2 uses the default security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the subnet to launch the instance into.
     * </p>
     * <p>
     * If you specify a network interface, you must specify any subnets as part
     * of the network interface.
     * </p>
     *
     * @return <p>
     *         [EC2-VPC] The ID of the subnet to launch the instance into.
     *         </p>
     *         <p>
     *         If you specify a network interface, you must specify any subnets
     *         as part of the network interface.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the subnet to launch the instance into.
     * </p>
     * <p>
     * If you specify a network interface, you must specify any subnets as part
     * of the network interface.
     * </p>
     *
     * @param subnetId <p>
     *            [EC2-VPC] The ID of the subnet to launch the instance into.
     *            </p>
     *            <p>
     *            If you specify a network interface, you must specify any
     *            subnets as part of the network interface.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the subnet to launch the instance into.
     * </p>
     * <p>
     * If you specify a network interface, you must specify any subnets as part
     * of the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetId <p>
     *            [EC2-VPC] The ID of the subnet to launch the instance into.
     *            </p>
     *            <p>
     *            If you specify a network interface, you must specify any
     *            subnets as part of the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * <p>
     * The user data to make available to the instance. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html"
     * >Running commands on your Linux instance at launch</a> (Linux) and <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     * >Adding User Data</a> (Windows). If you are using a command line tool,
     * base64-encoding is performed for you, and you can load the text from a
     * file. Otherwise, you must provide base64-encoded text. User data is
     * limited to 16 KB.
     * </p>
     *
     * @return <p>
     *         The user data to make available to the instance. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html"
     *         >Running commands on your Linux instance at launch</a> (Linux)
     *         and <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     *         >Adding User Data</a> (Windows). If you are using a command line
     *         tool, base64-encoding is performed for you, and you can load the
     *         text from a file. Otherwise, you must provide base64-encoded
     *         text. User data is limited to 16 KB.
     *         </p>
     */
    public String getUserData() {
        return userData;
    }

    /**
     * <p>
     * The user data to make available to the instance. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html"
     * >Running commands on your Linux instance at launch</a> (Linux) and <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     * >Adding User Data</a> (Windows). If you are using a command line tool,
     * base64-encoding is performed for you, and you can load the text from a
     * file. Otherwise, you must provide base64-encoded text. User data is
     * limited to 16 KB.
     * </p>
     *
     * @param userData <p>
     *            The user data to make available to the instance. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html"
     *            >Running commands on your Linux instance at launch</a> (Linux)
     *            and <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     *            >Adding User Data</a> (Windows). If you are using a command
     *            line tool, base64-encoding is performed for you, and you can
     *            load the text from a file. Otherwise, you must provide
     *            base64-encoded text. User data is limited to 16 KB.
     *            </p>
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * The user data to make available to the instance. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html"
     * >Running commands on your Linux instance at launch</a> (Linux) and <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     * >Adding User Data</a> (Windows). If you are using a command line tool,
     * base64-encoding is performed for you, and you can load the text from a
     * file. Otherwise, you must provide base64-encoded text. User data is
     * limited to 16 KB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userData <p>
     *            The user data to make available to the instance. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html"
     *            >Running commands on your Linux instance at launch</a> (Linux)
     *            and <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     *            >Adding User Data</a> (Windows). If you are using a command
     *            line tool, base64-encoding is performed for you, and you can
     *            load the text from a file. Otherwise, you must provide
     *            base64-encoded text. User data is limited to 16 KB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     *
     * @return <p>
     *         Reserved.
     *         </p>
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     *
     * @param additionalInfo <p>
     *            Reserved.
     *            </p>
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalInfo <p>
     *            Reserved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency
     * of the request. If you do not specify a client token, a randomly
     * generated token is used for the request to ensure idempotency.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Maximum 64 ASCII characters
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request. If you do not specify a client token,
     *         a randomly generated token is used for the request to ensure
     *         idempotency.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *         >Ensuring Idempotency</a>.
     *         </p>
     *         <p>
     *         Constraints: Maximum 64 ASCII characters
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency
     * of the request. If you do not specify a client token, a randomly
     * generated token is used for the request to ensure idempotency.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Maximum 64 ASCII characters
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier you provide to ensure the
     *            idempotency of the request. If you do not specify a client
     *            token, a randomly generated token is used for the request to
     *            ensure idempotency.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     *            <p>
     *            Constraints: Maximum 64 ASCII characters
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency
     * of the request. If you do not specify a client token, a randomly
     * generated token is used for the request to ensure idempotency.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Maximum 64 ASCII characters
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier you provide to ensure the
     *            idempotency of the request. If you do not specify a client
     *            token, a randomly generated token is used for the request to
     *            ensure idempotency.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     *            <p>
     *            Constraints: Maximum 64 ASCII characters
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
     * <p>
     * Default: <code>false</code>
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
     *         <p>
     *         Default: <code>false</code>
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
     * <p>
     * Default: <code>false</code>
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
     *         <p>
     *         Default: <code>false</code>
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
     * <p>
     * Default: <code>false</code>
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
     *            <p>
     *            Default: <code>false</code>
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
     * Default: <code>false</code>
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
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
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
    public RunInstancesRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
     * <p>
     * Default: <code>false</code>
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
     *         <p>
     *         Default: <code>false</code>
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
     * <p>
     * Default: <code>false</code>
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
     *         <p>
     *         Default: <code>false</code>
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
     * <p>
     * Default: <code>false</code>
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
     *            <p>
     *            Default: <code>false</code>
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
     * Default: <code>false</code>
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
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withEbsOptimized(Boolean ebsOptimized) {
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
    public IamInstanceProfileSpecification getIamInstanceProfile() {
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
    public void setIamInstanceProfile(IamInstanceProfileSpecification iamInstanceProfile) {
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
    public RunInstancesRequest withIamInstanceProfile(
            IamInstanceProfileSpecification iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
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
    public RunInstancesRequest withInstanceInitiatedShutdownBehavior(
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
    public RunInstancesRequest withInstanceInitiatedShutdownBehavior(
            ShutdownBehavior instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior.toString();
        return this;
    }

    /**
     * <p>
     * The network interfaces to associate with the instance. If you specify a
     * network interface, you must specify any security groups and subnets as
     * part of the network interface.
     * </p>
     *
     * @return <p>
     *         The network interfaces to associate with the instance. If you
     *         specify a network interface, you must specify any security groups
     *         and subnets as part of the network interface.
     *         </p>
     */
    public java.util.List<InstanceNetworkInterfaceSpecification> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * <p>
     * The network interfaces to associate with the instance. If you specify a
     * network interface, you must specify any security groups and subnets as
     * part of the network interface.
     * </p>
     *
     * @param networkInterfaces <p>
     *            The network interfaces to associate with the instance. If you
     *            specify a network interface, you must specify any security
     *            groups and subnets as part of the network interface.
     *            </p>
     */
    public void setNetworkInterfaces(
            java.util.Collection<InstanceNetworkInterfaceSpecification> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new java.util.ArrayList<InstanceNetworkInterfaceSpecification>(
                networkInterfaces);
    }

    /**
     * <p>
     * The network interfaces to associate with the instance. If you specify a
     * network interface, you must specify any security groups and subnets as
     * part of the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaces <p>
     *            The network interfaces to associate with the instance. If you
     *            specify a network interface, you must specify any security
     *            groups and subnets as part of the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withNetworkInterfaces(
            InstanceNetworkInterfaceSpecification... networkInterfaces) {
        if (getNetworkInterfaces() == null) {
            this.networkInterfaces = new java.util.ArrayList<InstanceNetworkInterfaceSpecification>(
                    networkInterfaces.length);
        }
        for (InstanceNetworkInterfaceSpecification value : networkInterfaces) {
            this.networkInterfaces.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The network interfaces to associate with the instance. If you specify a
     * network interface, you must specify any security groups and subnets as
     * part of the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaces <p>
     *            The network interfaces to associate with the instance. If you
     *            specify a network interface, you must specify any security
     *            groups and subnets as part of the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withNetworkInterfaces(
            java.util.Collection<InstanceNetworkInterfaceSpecification> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The primary IPv4 address. You must specify a value from the
     * IPv4 address range of the subnet.
     * </p>
     * <p>
     * Only one private IP address can be designated as primary. You can't
     * specify this option if you've specified the option to designate a private
     * IP address as the primary IP address in a network interface
     * specification. You cannot specify this option if you're launching more
     * than one instance in the request.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the
     * same request.
     * </p>
     *
     * @return <p>
     *         [EC2-VPC] The primary IPv4 address. You must specify a value from
     *         the IPv4 address range of the subnet.
     *         </p>
     *         <p>
     *         Only one private IP address can be designated as primary. You
     *         can't specify this option if you've specified the option to
     *         designate a private IP address as the primary IP address in a
     *         network interface specification. You cannot specify this option
     *         if you're launching more than one instance in the request.
     *         </p>
     *         <p>
     *         You cannot specify this option and the network interfaces option
     *         in the same request.
     *         </p>
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * <p>
     * [EC2-VPC] The primary IPv4 address. You must specify a value from the
     * IPv4 address range of the subnet.
     * </p>
     * <p>
     * Only one private IP address can be designated as primary. You can't
     * specify this option if you've specified the option to designate a private
     * IP address as the primary IP address in a network interface
     * specification. You cannot specify this option if you're launching more
     * than one instance in the request.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the
     * same request.
     * </p>
     *
     * @param privateIpAddress <p>
     *            [EC2-VPC] The primary IPv4 address. You must specify a value
     *            from the IPv4 address range of the subnet.
     *            </p>
     *            <p>
     *            Only one private IP address can be designated as primary. You
     *            can't specify this option if you've specified the option to
     *            designate a private IP address as the primary IP address in a
     *            network interface specification. You cannot specify this
     *            option if you're launching more than one instance in the
     *            request.
     *            </p>
     *            <p>
     *            You cannot specify this option and the network interfaces
     *            option in the same request.
     *            </p>
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * [EC2-VPC] The primary IPv4 address. You must specify a value from the
     * IPv4 address range of the subnet.
     * </p>
     * <p>
     * Only one private IP address can be designated as primary. You can't
     * specify this option if you've specified the option to designate a private
     * IP address as the primary IP address in a network interface
     * specification. You cannot specify this option if you're launching more
     * than one instance in the request.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the
     * same request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddress <p>
     *            [EC2-VPC] The primary IPv4 address. You must specify a value
     *            from the IPv4 address range of the subnet.
     *            </p>
     *            <p>
     *            Only one private IP address can be designated as primary. You
     *            can't specify this option if you've specified the option to
     *            designate a private IP address as the primary IP address in a
     *            network interface specification. You cannot specify this
     *            option if you're launching more than one instance in the
     *            request.
     *            </p>
     *            <p>
     *            You cannot specify this option and the network interfaces
     *            option in the same request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * <p>
     * An elastic GPU to associate with the instance. An Elastic GPU is a GPU
     * resource that you can attach to your Windows instance to accelerate the
     * graphics performance of your applications. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html"
     * > Amazon EC2 Elastic GPUs</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         An elastic GPU to associate with the instance. An Elastic GPU is
     *         a GPU resource that you can attach to your Windows instance to
     *         accelerate the graphics performance of your applications. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html"
     *         > Amazon EC2 Elastic GPUs</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide</i>.
     *         </p>
     */
    public java.util.List<ElasticGpuSpecification> getElasticGpuSpecification() {
        return elasticGpuSpecification;
    }

    /**
     * <p>
     * An elastic GPU to associate with the instance. An Elastic GPU is a GPU
     * resource that you can attach to your Windows instance to accelerate the
     * graphics performance of your applications. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html"
     * > Amazon EC2 Elastic GPUs</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @param elasticGpuSpecification <p>
     *            An elastic GPU to associate with the instance. An Elastic GPU
     *            is a GPU resource that you can attach to your Windows instance
     *            to accelerate the graphics performance of your applications.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html"
     *            > Amazon EC2 Elastic GPUs</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     */
    public void setElasticGpuSpecification(
            java.util.Collection<ElasticGpuSpecification> elasticGpuSpecification) {
        if (elasticGpuSpecification == null) {
            this.elasticGpuSpecification = null;
            return;
        }

        this.elasticGpuSpecification = new java.util.ArrayList<ElasticGpuSpecification>(
                elasticGpuSpecification);
    }

    /**
     * <p>
     * An elastic GPU to associate with the instance. An Elastic GPU is a GPU
     * resource that you can attach to your Windows instance to accelerate the
     * graphics performance of your applications. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html"
     * > Amazon EC2 Elastic GPUs</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticGpuSpecification <p>
     *            An elastic GPU to associate with the instance. An Elastic GPU
     *            is a GPU resource that you can attach to your Windows instance
     *            to accelerate the graphics performance of your applications.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html"
     *            > Amazon EC2 Elastic GPUs</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withElasticGpuSpecification(
            ElasticGpuSpecification... elasticGpuSpecification) {
        if (getElasticGpuSpecification() == null) {
            this.elasticGpuSpecification = new java.util.ArrayList<ElasticGpuSpecification>(
                    elasticGpuSpecification.length);
        }
        for (ElasticGpuSpecification value : elasticGpuSpecification) {
            this.elasticGpuSpecification.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An elastic GPU to associate with the instance. An Elastic GPU is a GPU
     * resource that you can attach to your Windows instance to accelerate the
     * graphics performance of your applications. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html"
     * > Amazon EC2 Elastic GPUs</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticGpuSpecification <p>
     *            An elastic GPU to associate with the instance. An Elastic GPU
     *            is a GPU resource that you can attach to your Windows instance
     *            to accelerate the graphics performance of your applications.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html"
     *            > Amazon EC2 Elastic GPUs</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withElasticGpuSpecification(
            java.util.Collection<ElasticGpuSpecification> elasticGpuSpecification) {
        setElasticGpuSpecification(elasticGpuSpecification);
        return this;
    }

    /**
     * <p>
     * An elastic inference accelerator to associate with the instance. Elastic
     * inference accelerators are a resource you can attach to your Amazon EC2
     * instances to accelerate your Deep Learning (DL) inference workloads.
     * </p>
     * <p>
     * You cannot specify accelerators from different generations in the same
     * request.
     * </p>
     *
     * @return <p>
     *         An elastic inference accelerator to associate with the instance.
     *         Elastic inference accelerators are a resource you can attach to
     *         your Amazon EC2 instances to accelerate your Deep Learning (DL)
     *         inference workloads.
     *         </p>
     *         <p>
     *         You cannot specify accelerators from different generations in the
     *         same request.
     *         </p>
     */
    public java.util.List<ElasticInferenceAccelerator> getElasticInferenceAccelerators() {
        return elasticInferenceAccelerators;
    }

    /**
     * <p>
     * An elastic inference accelerator to associate with the instance. Elastic
     * inference accelerators are a resource you can attach to your Amazon EC2
     * instances to accelerate your Deep Learning (DL) inference workloads.
     * </p>
     * <p>
     * You cannot specify accelerators from different generations in the same
     * request.
     * </p>
     *
     * @param elasticInferenceAccelerators <p>
     *            An elastic inference accelerator to associate with the
     *            instance. Elastic inference accelerators are a resource you
     *            can attach to your Amazon EC2 instances to accelerate your
     *            Deep Learning (DL) inference workloads.
     *            </p>
     *            <p>
     *            You cannot specify accelerators from different generations in
     *            the same request.
     *            </p>
     */
    public void setElasticInferenceAccelerators(
            java.util.Collection<ElasticInferenceAccelerator> elasticInferenceAccelerators) {
        if (elasticInferenceAccelerators == null) {
            this.elasticInferenceAccelerators = null;
            return;
        }

        this.elasticInferenceAccelerators = new java.util.ArrayList<ElasticInferenceAccelerator>(
                elasticInferenceAccelerators);
    }

    /**
     * <p>
     * An elastic inference accelerator to associate with the instance. Elastic
     * inference accelerators are a resource you can attach to your Amazon EC2
     * instances to accelerate your Deep Learning (DL) inference workloads.
     * </p>
     * <p>
     * You cannot specify accelerators from different generations in the same
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticInferenceAccelerators <p>
     *            An elastic inference accelerator to associate with the
     *            instance. Elastic inference accelerators are a resource you
     *            can attach to your Amazon EC2 instances to accelerate your
     *            Deep Learning (DL) inference workloads.
     *            </p>
     *            <p>
     *            You cannot specify accelerators from different generations in
     *            the same request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withElasticInferenceAccelerators(
            ElasticInferenceAccelerator... elasticInferenceAccelerators) {
        if (getElasticInferenceAccelerators() == null) {
            this.elasticInferenceAccelerators = new java.util.ArrayList<ElasticInferenceAccelerator>(
                    elasticInferenceAccelerators.length);
        }
        for (ElasticInferenceAccelerator value : elasticInferenceAccelerators) {
            this.elasticInferenceAccelerators.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An elastic inference accelerator to associate with the instance. Elastic
     * inference accelerators are a resource you can attach to your Amazon EC2
     * instances to accelerate your Deep Learning (DL) inference workloads.
     * </p>
     * <p>
     * You cannot specify accelerators from different generations in the same
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticInferenceAccelerators <p>
     *            An elastic inference accelerator to associate with the
     *            instance. Elastic inference accelerators are a resource you
     *            can attach to your Amazon EC2 instances to accelerate your
     *            Deep Learning (DL) inference workloads.
     *            </p>
     *            <p>
     *            You cannot specify accelerators from different generations in
     *            the same request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withElasticInferenceAccelerators(
            java.util.Collection<ElasticInferenceAccelerator> elasticInferenceAccelerators) {
        setElasticInferenceAccelerators(elasticInferenceAccelerators);
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
    public java.util.List<TagSpecification> getTagSpecifications() {
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
    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new java.util.ArrayList<TagSpecification>(tagSpecifications);
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
    public RunInstancesRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
    public RunInstancesRequest withTagSpecifications(
            java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * The launch template to use to launch the instances. Any parameters that
     * you specify in <a>RunInstances</a> override the same parameters in the
     * launch template. You can specify either the name or ID of a launch
     * template, but not both.
     * </p>
     *
     * @return <p>
     *         The launch template to use to launch the instances. Any
     *         parameters that you specify in <a>RunInstances</a> override the
     *         same parameters in the launch template. You can specify either
     *         the name or ID of a launch template, but not both.
     *         </p>
     */
    public LaunchTemplateSpecification getLaunchTemplate() {
        return launchTemplate;
    }

    /**
     * <p>
     * The launch template to use to launch the instances. Any parameters that
     * you specify in <a>RunInstances</a> override the same parameters in the
     * launch template. You can specify either the name or ID of a launch
     * template, but not both.
     * </p>
     *
     * @param launchTemplate <p>
     *            The launch template to use to launch the instances. Any
     *            parameters that you specify in <a>RunInstances</a> override
     *            the same parameters in the launch template. You can specify
     *            either the name or ID of a launch template, but not both.
     *            </p>
     */
    public void setLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * The launch template to use to launch the instances. Any parameters that
     * you specify in <a>RunInstances</a> override the same parameters in the
     * launch template. You can specify either the name or ID of a launch
     * template, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplate <p>
     *            The launch template to use to launch the instances. Any
     *            parameters that you specify in <a>RunInstances</a> override
     *            the same parameters in the launch template. You can specify
     *            either the name or ID of a launch template, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
        return this;
    }

    /**
     * <p>
     * The market (purchasing) option for the instances.
     * </p>
     * <p>
     * For <a>RunInstances</a>, persistent Spot Instance requests are only
     * supported when <b>InstanceInterruptionBehavior</b> is set to either
     * <code>hibernate</code> or <code>stop</code>.
     * </p>
     *
     * @return <p>
     *         The market (purchasing) option for the instances.
     *         </p>
     *         <p>
     *         For <a>RunInstances</a>, persistent Spot Instance requests are
     *         only supported when <b>InstanceInterruptionBehavior</b> is set to
     *         either <code>hibernate</code> or <code>stop</code>.
     *         </p>
     */
    public InstanceMarketOptionsRequest getInstanceMarketOptions() {
        return instanceMarketOptions;
    }

    /**
     * <p>
     * The market (purchasing) option for the instances.
     * </p>
     * <p>
     * For <a>RunInstances</a>, persistent Spot Instance requests are only
     * supported when <b>InstanceInterruptionBehavior</b> is set to either
     * <code>hibernate</code> or <code>stop</code>.
     * </p>
     *
     * @param instanceMarketOptions <p>
     *            The market (purchasing) option for the instances.
     *            </p>
     *            <p>
     *            For <a>RunInstances</a>, persistent Spot Instance requests are
     *            only supported when <b>InstanceInterruptionBehavior</b> is set
     *            to either <code>hibernate</code> or <code>stop</code>.
     *            </p>
     */
    public void setInstanceMarketOptions(InstanceMarketOptionsRequest instanceMarketOptions) {
        this.instanceMarketOptions = instanceMarketOptions;
    }

    /**
     * <p>
     * The market (purchasing) option for the instances.
     * </p>
     * <p>
     * For <a>RunInstances</a>, persistent Spot Instance requests are only
     * supported when <b>InstanceInterruptionBehavior</b> is set to either
     * <code>hibernate</code> or <code>stop</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceMarketOptions <p>
     *            The market (purchasing) option for the instances.
     *            </p>
     *            <p>
     *            For <a>RunInstances</a>, persistent Spot Instance requests are
     *            only supported when <b>InstanceInterruptionBehavior</b> is set
     *            to either <code>hibernate</code> or <code>stop</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withInstanceMarketOptions(
            InstanceMarketOptionsRequest instanceMarketOptions) {
        this.instanceMarketOptions = instanceMarketOptions;
        return this;
    }

    /**
     * <p>
     * The credit option for CPU usage of the burstable performance instance.
     * Valid values are <code>standard</code> and <code>unlimited</code>. To
     * change this attribute after launch, use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceCreditSpecification.html"
     * > ModifyInstanceCreditSpecification</a>. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html"
     * >Burstable performance instances</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>standard</code> (T2 instances) or <code>unlimited</code>
     * (T3/T3a instances)
     * </p>
     *
     * @return <p>
     *         The credit option for CPU usage of the burstable performance
     *         instance. Valid values are <code>standard</code> and
     *         <code>unlimited</code>. To change this attribute after launch,
     *         use <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceCreditSpecification.html"
     *         > ModifyInstanceCreditSpecification</a>. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html"
     *         >Burstable performance instances</a> in the <i>Amazon Elastic
     *         Compute Cloud User Guide</i>.
     *         </p>
     *         <p>
     *         Default: <code>standard</code> (T2 instances) or
     *         <code>unlimited</code> (T3/T3a instances)
     *         </p>
     */
    public CreditSpecificationRequest getCreditSpecification() {
        return creditSpecification;
    }

    /**
     * <p>
     * The credit option for CPU usage of the burstable performance instance.
     * Valid values are <code>standard</code> and <code>unlimited</code>. To
     * change this attribute after launch, use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceCreditSpecification.html"
     * > ModifyInstanceCreditSpecification</a>. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html"
     * >Burstable performance instances</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>standard</code> (T2 instances) or <code>unlimited</code>
     * (T3/T3a instances)
     * </p>
     *
     * @param creditSpecification <p>
     *            The credit option for CPU usage of the burstable performance
     *            instance. Valid values are <code>standard</code> and
     *            <code>unlimited</code>. To change this attribute after launch,
     *            use <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceCreditSpecification.html"
     *            > ModifyInstanceCreditSpecification</a>. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html"
     *            >Burstable performance instances</a> in the <i>Amazon Elastic
     *            Compute Cloud User Guide</i>.
     *            </p>
     *            <p>
     *            Default: <code>standard</code> (T2 instances) or
     *            <code>unlimited</code> (T3/T3a instances)
     *            </p>
     */
    public void setCreditSpecification(CreditSpecificationRequest creditSpecification) {
        this.creditSpecification = creditSpecification;
    }

    /**
     * <p>
     * The credit option for CPU usage of the burstable performance instance.
     * Valid values are <code>standard</code> and <code>unlimited</code>. To
     * change this attribute after launch, use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceCreditSpecification.html"
     * > ModifyInstanceCreditSpecification</a>. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html"
     * >Burstable performance instances</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>standard</code> (T2 instances) or <code>unlimited</code>
     * (T3/T3a instances)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creditSpecification <p>
     *            The credit option for CPU usage of the burstable performance
     *            instance. Valid values are <code>standard</code> and
     *            <code>unlimited</code>. To change this attribute after launch,
     *            use <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceCreditSpecification.html"
     *            > ModifyInstanceCreditSpecification</a>. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html"
     *            >Burstable performance instances</a> in the <i>Amazon Elastic
     *            Compute Cloud User Guide</i>.
     *            </p>
     *            <p>
     *            Default: <code>standard</code> (T2 instances) or
     *            <code>unlimited</code> (T3/T3a instances)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withCreditSpecification(
            CreditSpecificationRequest creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }

    /**
     * <p>
     * The CPU options for the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html"
     * >Optimizing CPU options</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The CPU options for the instance. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html"
     *         >Optimizing CPU options</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide</i>.
     *         </p>
     */
    public CpuOptionsRequest getCpuOptions() {
        return cpuOptions;
    }

    /**
     * <p>
     * The CPU options for the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html"
     * >Optimizing CPU options</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @param cpuOptions <p>
     *            The CPU options for the instance. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html"
     *            >Optimizing CPU options</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     */
    public void setCpuOptions(CpuOptionsRequest cpuOptions) {
        this.cpuOptions = cpuOptions;
    }

    /**
     * <p>
     * The CPU options for the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html"
     * >Optimizing CPU options</a> in the <i>Amazon Elastic Compute Cloud User
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
     *            >Optimizing CPU options</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withCpuOptions(CpuOptionsRequest cpuOptions) {
        this.cpuOptions = cpuOptions;
        return this;
    }

    /**
     * <p>
     * Information about the Capacity Reservation targeting option. If you do
     * not specify this parameter, the instance's Capacity Reservation
     * preference defaults to <code>open</code>, which enables it to run in any
     * open Capacity Reservation that has matching attributes (instance type,
     * platform, Availability Zone).
     * </p>
     *
     * @return <p>
     *         Information about the Capacity Reservation targeting option. If
     *         you do not specify this parameter, the instance's Capacity
     *         Reservation preference defaults to <code>open</code>, which
     *         enables it to run in any open Capacity Reservation that has
     *         matching attributes (instance type, platform, Availability Zone).
     *         </p>
     */
    public CapacityReservationSpecification getCapacityReservationSpecification() {
        return capacityReservationSpecification;
    }

    /**
     * <p>
     * Information about the Capacity Reservation targeting option. If you do
     * not specify this parameter, the instance's Capacity Reservation
     * preference defaults to <code>open</code>, which enables it to run in any
     * open Capacity Reservation that has matching attributes (instance type,
     * platform, Availability Zone).
     * </p>
     *
     * @param capacityReservationSpecification <p>
     *            Information about the Capacity Reservation targeting option.
     *            If you do not specify this parameter, the instance's Capacity
     *            Reservation preference defaults to <code>open</code>, which
     *            enables it to run in any open Capacity Reservation that has
     *            matching attributes (instance type, platform, Availability
     *            Zone).
     *            </p>
     */
    public void setCapacityReservationSpecification(
            CapacityReservationSpecification capacityReservationSpecification) {
        this.capacityReservationSpecification = capacityReservationSpecification;
    }

    /**
     * <p>
     * Information about the Capacity Reservation targeting option. If you do
     * not specify this parameter, the instance's Capacity Reservation
     * preference defaults to <code>open</code>, which enables it to run in any
     * open Capacity Reservation that has matching attributes (instance type,
     * platform, Availability Zone).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityReservationSpecification <p>
     *            Information about the Capacity Reservation targeting option.
     *            If you do not specify this parameter, the instance's Capacity
     *            Reservation preference defaults to <code>open</code>, which
     *            enables it to run in any open Capacity Reservation that has
     *            matching attributes (instance type, platform, Availability
     *            Zone).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withCapacityReservationSpecification(
            CapacityReservationSpecification capacityReservationSpecification) {
        this.capacityReservationSpecification = capacityReservationSpecification;
        return this;
    }

    /**
     * <p>
     * Indicates whether an instance is enabled for hibernation. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     * >Hibernate your instance</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Indicates whether an instance is enabled for hibernation. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     *         >Hibernate your instance</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide</i>.
     *         </p>
     */
    public HibernationOptionsRequest getHibernationOptions() {
        return hibernationOptions;
    }

    /**
     * <p>
     * Indicates whether an instance is enabled for hibernation. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     * >Hibernate your instance</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @param hibernationOptions <p>
     *            Indicates whether an instance is enabled for hibernation. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     *            >Hibernate your instance</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     */
    public void setHibernationOptions(HibernationOptionsRequest hibernationOptions) {
        this.hibernationOptions = hibernationOptions;
    }

    /**
     * <p>
     * Indicates whether an instance is enabled for hibernation. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     * >Hibernate your instance</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hibernationOptions <p>
     *            Indicates whether an instance is enabled for hibernation. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     *            >Hibernate your instance</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withHibernationOptions(HibernationOptionsRequest hibernationOptions) {
        this.hibernationOptions = hibernationOptions;
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
    public java.util.List<LicenseConfigurationRequest> getLicenseSpecifications() {
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
            java.util.Collection<LicenseConfigurationRequest> licenseSpecifications) {
        if (licenseSpecifications == null) {
            this.licenseSpecifications = null;
            return;
        }

        this.licenseSpecifications = new java.util.ArrayList<LicenseConfigurationRequest>(
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
    public RunInstancesRequest withLicenseSpecifications(
            LicenseConfigurationRequest... licenseSpecifications) {
        if (getLicenseSpecifications() == null) {
            this.licenseSpecifications = new java.util.ArrayList<LicenseConfigurationRequest>(
                    licenseSpecifications.length);
        }
        for (LicenseConfigurationRequest value : licenseSpecifications) {
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
    public RunInstancesRequest withLicenseSpecifications(
            java.util.Collection<LicenseConfigurationRequest> licenseSpecifications) {
        setLicenseSpecifications(licenseSpecifications);
        return this;
    }

    /**
     * <p>
     * The metadata options for the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     * >Instance metadata and user data</a>.
     * </p>
     *
     * @return <p>
     *         The metadata options for the instance. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     *         >Instance metadata and user data</a>.
     *         </p>
     */
    public InstanceMetadataOptionsRequest getMetadataOptions() {
        return metadataOptions;
    }

    /**
     * <p>
     * The metadata options for the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     * >Instance metadata and user data</a>.
     * </p>
     *
     * @param metadataOptions <p>
     *            The metadata options for the instance. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     *            >Instance metadata and user data</a>.
     *            </p>
     */
    public void setMetadataOptions(InstanceMetadataOptionsRequest metadataOptions) {
        this.metadataOptions = metadataOptions;
    }

    /**
     * <p>
     * The metadata options for the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     * >Instance metadata and user data</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metadataOptions <p>
     *            The metadata options for the instance. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     *            >Instance metadata and user data</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesRequest withMetadataOptions(InstanceMetadataOptionsRequest metadataOptions) {
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
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getIpv6AddressCount() != null)
            sb.append("Ipv6AddressCount: " + getIpv6AddressCount() + ",");
        if (getIpv6Addresses() != null)
            sb.append("Ipv6Addresses: " + getIpv6Addresses() + ",");
        if (getKernelId() != null)
            sb.append("KernelId: " + getKernelId() + ",");
        if (getKeyName() != null)
            sb.append("KeyName: " + getKeyName() + ",");
        if (getMaxCount() != null)
            sb.append("MaxCount: " + getMaxCount() + ",");
        if (getMinCount() != null)
            sb.append("MinCount: " + getMinCount() + ",");
        if (getMonitoring() != null)
            sb.append("Monitoring: " + getMonitoring() + ",");
        if (getPlacement() != null)
            sb.append("Placement: " + getPlacement() + ",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getUserData() != null)
            sb.append("UserData: " + getUserData() + ",");
        if (getAdditionalInfo() != null)
            sb.append("AdditionalInfo: " + getAdditionalInfo() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getDisableApiTermination() != null)
            sb.append("DisableApiTermination: " + getDisableApiTermination() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: " + getEbsOptimized() + ",");
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
        if (getInstanceInitiatedShutdownBehavior() != null)
            sb.append("InstanceInitiatedShutdownBehavior: "
                    + getInstanceInitiatedShutdownBehavior() + ",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: " + getNetworkInterfaces() + ",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getElasticGpuSpecification() != null)
            sb.append("ElasticGpuSpecification: " + getElasticGpuSpecification() + ",");
        if (getElasticInferenceAccelerators() != null)
            sb.append("ElasticInferenceAccelerators: " + getElasticInferenceAccelerators() + ",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: " + getTagSpecifications() + ",");
        if (getLaunchTemplate() != null)
            sb.append("LaunchTemplate: " + getLaunchTemplate() + ",");
        if (getInstanceMarketOptions() != null)
            sb.append("InstanceMarketOptions: " + getInstanceMarketOptions() + ",");
        if (getCreditSpecification() != null)
            sb.append("CreditSpecification: " + getCreditSpecification() + ",");
        if (getCpuOptions() != null)
            sb.append("CpuOptions: " + getCpuOptions() + ",");
        if (getCapacityReservationSpecification() != null)
            sb.append("CapacityReservationSpecification: " + getCapacityReservationSpecification()
                    + ",");
        if (getHibernationOptions() != null)
            sb.append("HibernationOptions: " + getHibernationOptions() + ",");
        if (getLicenseSpecifications() != null)
            sb.append("LicenseSpecifications: " + getLicenseSpecifications() + ",");
        if (getMetadataOptions() != null)
            sb.append("MetadataOptions: " + getMetadataOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getIpv6AddressCount() == null) ? 0 : getIpv6AddressCount().hashCode());
        hashCode = prime * hashCode
                + ((getIpv6Addresses() == null) ? 0 : getIpv6Addresses().hashCode());
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getMaxCount() == null) ? 0 : getMaxCount().hashCode());
        hashCode = prime * hashCode + ((getMinCount() == null) ? 0 : getMinCount().hashCode());
        hashCode = prime * hashCode + ((getMonitoring() == null) ? 0 : getMonitoring().hashCode());
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode
                + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getDisableApiTermination() == null) ? 0 : getDisableApiTermination().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode
                + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceInitiatedShutdownBehavior() == null) ? 0
                        : getInstanceInitiatedShutdownBehavior().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime
                * hashCode
                + ((getElasticGpuSpecification() == null) ? 0 : getElasticGpuSpecification()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getElasticInferenceAccelerators() == null) ? 0
                        : getElasticInferenceAccelerators().hashCode());
        hashCode = prime * hashCode
                + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchTemplate() == null) ? 0 : getLaunchTemplate().hashCode());
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
        hashCode = prime * hashCode
                + ((getHibernationOptions() == null) ? 0 : getHibernationOptions().hashCode());
        hashCode = prime
                * hashCode
                + ((getLicenseSpecifications() == null) ? 0 : getLicenseSpecifications().hashCode());
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

        if (obj instanceof RunInstancesRequest == false)
            return false;
        RunInstancesRequest other = (RunInstancesRequest) obj;

        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null
                && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
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
        if (other.getIpv6AddressCount() == null ^ this.getIpv6AddressCount() == null)
            return false;
        if (other.getIpv6AddressCount() != null
                && other.getIpv6AddressCount().equals(this.getIpv6AddressCount()) == false)
            return false;
        if (other.getIpv6Addresses() == null ^ this.getIpv6Addresses() == null)
            return false;
        if (other.getIpv6Addresses() != null
                && other.getIpv6Addresses().equals(this.getIpv6Addresses()) == false)
            return false;
        if (other.getKernelId() == null ^ this.getKernelId() == null)
            return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getMaxCount() == null ^ this.getMaxCount() == null)
            return false;
        if (other.getMaxCount() != null && other.getMaxCount().equals(this.getMaxCount()) == false)
            return false;
        if (other.getMinCount() == null ^ this.getMinCount() == null)
            return false;
        if (other.getMinCount() != null && other.getMinCount().equals(this.getMinCount()) == false)
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
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null)
            return false;
        if (other.getRamdiskId() != null
                && other.getRamdiskId().equals(this.getRamdiskId()) == false)
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
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null)
            return false;
        if (other.getAdditionalInfo() != null
                && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDisableApiTermination() == null ^ this.getDisableApiTermination() == null)
            return false;
        if (other.getDisableApiTermination() != null
                && other.getDisableApiTermination().equals(this.getDisableApiTermination()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
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
        if (other.getInstanceInitiatedShutdownBehavior() == null
                ^ this.getInstanceInitiatedShutdownBehavior() == null)
            return false;
        if (other.getInstanceInitiatedShutdownBehavior() != null
                && other.getInstanceInitiatedShutdownBehavior().equals(
                        this.getInstanceInitiatedShutdownBehavior()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null
                && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null
                && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getElasticGpuSpecification() == null ^ this.getElasticGpuSpecification() == null)
            return false;
        if (other.getElasticGpuSpecification() != null
                && other.getElasticGpuSpecification().equals(this.getElasticGpuSpecification()) == false)
            return false;
        if (other.getElasticInferenceAccelerators() == null
                ^ this.getElasticInferenceAccelerators() == null)
            return false;
        if (other.getElasticInferenceAccelerators() != null
                && other.getElasticInferenceAccelerators().equals(
                        this.getElasticInferenceAccelerators()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null
                && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getLaunchTemplate() == null ^ this.getLaunchTemplate() == null)
            return false;
        if (other.getLaunchTemplate() != null
                && other.getLaunchTemplate().equals(this.getLaunchTemplate()) == false)
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
        if (other.getHibernationOptions() == null ^ this.getHibernationOptions() == null)
            return false;
        if (other.getHibernationOptions() != null
                && other.getHibernationOptions().equals(this.getHibernationOptions()) == false)
            return false;
        if (other.getLicenseSpecifications() == null ^ this.getLicenseSpecifications() == null)
            return false;
        if (other.getLicenseSpecifications() != null
                && other.getLicenseSpecifications().equals(this.getLicenseSpecifications()) == false)
            return false;
        if (other.getMetadataOptions() == null ^ this.getMetadataOptions() == null)
            return false;
        if (other.getMetadataOptions() != null
                && other.getMetadataOptions().equals(this.getMetadataOptions()) == false)
            return false;
        return true;
    }
}
