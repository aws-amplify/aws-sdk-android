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
 * Describes an instance.
 * </p>
 */
public class Instance implements Serializable {
    /**
     * <p>
     * The AMI launch index, which can be used to find this instance in the
     * launch group.
     * </p>
     */
    private Integer amiLaunchIndex;

    /**
     * <p>
     * The ID of the AMI used to launch the instance.
     * </p>
     */
    private String imageId;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The instance type.
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
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5a.large,
     * c5a.xlarge, c5a.2xlarge, c5a.4xlarge, c5a.8xlarge, c5a.12xlarge,
     * c5a.16xlarge, c5a.24xlarge, c5d.large, c5d.xlarge, c5d.2xlarge,
     * c5d.4xlarge, c5d.9xlarge, c5d.12xlarge, c5d.18xlarge, c5d.24xlarge,
     * c5d.metal, c5n.large, c5n.xlarge, c5n.2xlarge, c5n.4xlarge, c5n.9xlarge,
     * c5n.18xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge,
     * g3.4xlarge, g3.8xlarge, g3.16xlarge, g3s.xlarge, g4dn.xlarge,
     * g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge, g4dn.12xlarge, g4dn.16xlarge,
     * g4dn.metal, cg1.4xlarge, p2.xlarge, p2.8xlarge, p2.16xlarge, p3.2xlarge,
     * p3.8xlarge, p3.16xlarge, p3dn.24xlarge, d2.xlarge, d2.2xlarge,
     * d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge, f1.16xlarge, m5.large,
     * m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge, m5.12xlarge, m5.16xlarge,
     * m5.24xlarge, m5.metal, m5a.large, m5a.xlarge, m5a.2xlarge, m5a.4xlarge,
     * m5a.8xlarge, m5a.12xlarge, m5a.16xlarge, m5a.24xlarge, m5d.large,
     * m5d.xlarge, m5d.2xlarge, m5d.4xlarge, m5d.8xlarge, m5d.12xlarge,
     * m5d.16xlarge, m5d.24xlarge, m5d.metal, m5ad.large, m5ad.xlarge,
     * m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge, m5ad.12xlarge, m5ad.16xlarge,
     * m5ad.24xlarge, h1.2xlarge, h1.4xlarge, h1.8xlarge, h1.16xlarge,
     * z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge, z1d.6xlarge,
     * z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal, u-12tb1.metal,
     * u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large, a1.xlarge, a1.2xlarge,
     * a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge, m5dn.2xlarge,
     * m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge, m5dn.24xlarge,
     * m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge, m5n.8xlarge,
     * m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large, r5dn.xlarge,
     * r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge, r5dn.16xlarge,
     * r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge, r5n.4xlarge,
     * r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge, inf1.xlarge,
     * inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal, m6g.medium,
     * m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     */
    private String instanceType;

    /**
     * <p>
     * The kernel associated with this instance, if applicable.
     * </p>
     */
    private String kernelId;

    /**
     * <p>
     * The name of the key pair, if this instance was launched with an
     * associated key pair.
     * </p>
     */
    private String keyName;

    /**
     * <p>
     * The time the instance was launched.
     * </p>
     */
    private java.util.Date launchTime;

    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     */
    private Monitoring monitoring;

    /**
     * <p>
     * The location where the instance launched, if applicable.
     * </p>
     */
    private Placement placement;

    /**
     * <p>
     * The value is <code>Windows</code> for Windows instances; otherwise blank.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     */
    private String platform;

    /**
     * <p>
     * (IPv4 only) The private DNS hostname name assigned to the instance. This
     * DNS hostname can only be used inside the Amazon EC2 network. This name is
     * not available until the instance enters the <code>running</code> state.
     * </p>
     * <p>
     * [EC2-VPC] The Amazon-provided DNS server resolves Amazon-provided private
     * DNS hostnames if you've enabled DNS resolution and DNS hostnames in your
     * VPC. If you are not using the Amazon-provided DNS server in your VPC,
     * your custom domain name servers must resolve the hostname as appropriate.
     * </p>
     */
    private String privateDnsName;

    /**
     * <p>
     * The private IPv4 address assigned to the instance.
     * </p>
     */
    private String privateIpAddress;

    /**
     * <p>
     * The product codes attached to this instance, if applicable.
     * </p>
     */
    private java.util.List<ProductCode> productCodes;

    /**
     * <p>
     * (IPv4 only) The public DNS name assigned to the instance. This name is
     * not available until the instance enters the <code>running</code> state.
     * For EC2-VPC, this name is only available if you've enabled DNS hostnames
     * for your VPC.
     * </p>
     */
    private String publicDnsName;

    /**
     * <p>
     * The public IPv4 address assigned to the instance, if applicable.
     * </p>
     */
    private String publicIpAddress;

    /**
     * <p>
     * The RAM disk associated with this instance, if applicable.
     * </p>
     */
    private String ramdiskId;

    /**
     * <p>
     * The current state of the instance.
     * </p>
     */
    private InstanceState state;

    /**
     * <p>
     * The reason for the most recent state transition. This might be an empty
     * string.
     * </p>
     */
    private String stateTransitionReason;

    /**
     * <p>
     * [EC2-VPC] The ID of the subnet in which the instance is running.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * [EC2-VPC] The ID of the VPC in which the instance is running.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The architecture of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64, arm64
     */
    private String architecture;

    /**
     * <p>
     * Any block device mapping entries for the instance.
     * </p>
     */
    private java.util.List<InstanceBlockDeviceMapping> blockDeviceMappings;

    /**
     * <p>
     * The idempotency token you provided when you launched the instance, if
     * applicable.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal I/O performance. This optimization
     * isn't available with all instance types. Additional usage charges apply
     * when using an EBS Optimized instance.
     * </p>
     */
    private Boolean ebsOptimized;

    /**
     * <p>
     * Specifies whether enhanced networking with ENA is enabled.
     * </p>
     */
    private Boolean enaSupport;

    /**
     * <p>
     * The hypervisor type of the instance. The value <code>xen</code> is used
     * for both Xen and Nitro hypervisors.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     */
    private String hypervisor;

    /**
     * <p>
     * The IAM instance profile associated with the instance, if applicable.
     * </p>
     */
    private IamInstanceProfile iamInstanceProfile;

    /**
     * <p>
     * Indicates whether this is a Spot Instance or a Scheduled Instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot, scheduled
     */
    private String instanceLifecycle;

    /**
     * <p>
     * The Elastic GPU associated with the instance.
     * </p>
     */
    private java.util.List<ElasticGpuAssociation> elasticGpuAssociations;

    /**
     * <p>
     * The elastic inference accelerator associated with the instance.
     * </p>
     */
    private java.util.List<ElasticInferenceAcceleratorAssociation> elasticInferenceAcceleratorAssociations;

    /**
     * <p>
     * [EC2-VPC] The network interfaces for the instance.
     * </p>
     */
    private java.util.List<InstanceNetworkInterface> networkInterfaces;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     */
    private String outpostArn;

    /**
     * <p>
     * The device name of the root device volume (for example,
     * <code>/dev/sda1</code>).
     * </p>
     */
    private String rootDeviceName;

    /**
     * <p>
     * The root device type used by the AMI. The AMI can use an EBS volume or an
     * instance store volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     */
    private String rootDeviceType;

    /**
     * <p>
     * The security groups for the instance.
     * </p>
     */
    private java.util.List<GroupIdentifier> securityGroups;

    /**
     * <p>
     * Specifies whether to enable an instance launched in a VPC to perform NAT.
     * This controls whether source/destination checking is enabled on the
     * instance. A value of <code>true</code> means that checking is enabled,
     * and <code>false</code> means that checking is disabled. The value must be
     * <code>false</code> for the instance to perform NAT. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     * >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     */
    private Boolean sourceDestCheck;

    /**
     * <p>
     * If the request is a Spot Instance request, the ID of the request.
     * </p>
     */
    private String spotInstanceRequestId;

    /**
     * <p>
     * Specifies whether enhanced networking with the Intel 82599 Virtual
     * Function interface is enabled.
     * </p>
     */
    private String sriovNetSupport;

    /**
     * <p>
     * The reason for the most recent state transition.
     * </p>
     */
    private StateReason stateReason;

    /**
     * <p>
     * Any tags assigned to the instance.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The virtualization type of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     */
    private String virtualizationType;

    /**
     * <p>
     * The CPU options for the instance.
     * </p>
     */
    private CpuOptions cpuOptions;

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     */
    private String capacityReservationId;

    /**
     * <p>
     * Information about the Capacity Reservation targeting option.
     * </p>
     */
    private CapacityReservationSpecificationResponse capacityReservationSpecification;

    /**
     * <p>
     * Indicates whether the instance is enabled for hibernation.
     * </p>
     */
    private HibernationOptions hibernationOptions;

    /**
     * <p>
     * The license configurations.
     * </p>
     */
    private java.util.List<LicenseConfiguration> licenses;

    /**
     * <p>
     * The metadata options for the instance.
     * </p>
     */
    private InstanceMetadataOptionsResponse metadataOptions;

    /**
     * <p>
     * The AMI launch index, which can be used to find this instance in the
     * launch group.
     * </p>
     *
     * @return <p>
     *         The AMI launch index, which can be used to find this instance in
     *         the launch group.
     *         </p>
     */
    public Integer getAmiLaunchIndex() {
        return amiLaunchIndex;
    }

    /**
     * <p>
     * The AMI launch index, which can be used to find this instance in the
     * launch group.
     * </p>
     *
     * @param amiLaunchIndex <p>
     *            The AMI launch index, which can be used to find this instance
     *            in the launch group.
     *            </p>
     */
    public void setAmiLaunchIndex(Integer amiLaunchIndex) {
        this.amiLaunchIndex = amiLaunchIndex;
    }

    /**
     * <p>
     * The AMI launch index, which can be used to find this instance in the
     * launch group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amiLaunchIndex <p>
     *            The AMI launch index, which can be used to find this instance
     *            in the launch group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withAmiLaunchIndex(Integer amiLaunchIndex) {
        this.amiLaunchIndex = amiLaunchIndex;
        return this;
    }

    /**
     * <p>
     * The ID of the AMI used to launch the instance.
     * </p>
     *
     * @return <p>
     *         The ID of the AMI used to launch the instance.
     *         </p>
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * <p>
     * The ID of the AMI used to launch the instance.
     * </p>
     *
     * @param imageId <p>
     *            The ID of the AMI used to launch the instance.
     *            </p>
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the AMI used to launch the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageId <p>
     *            The ID of the AMI used to launch the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     *
     * @return <p>
     *         The ID of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The instance type.
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
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5a.large,
     * c5a.xlarge, c5a.2xlarge, c5a.4xlarge, c5a.8xlarge, c5a.12xlarge,
     * c5a.16xlarge, c5a.24xlarge, c5d.large, c5d.xlarge, c5d.2xlarge,
     * c5d.4xlarge, c5d.9xlarge, c5d.12xlarge, c5d.18xlarge, c5d.24xlarge,
     * c5d.metal, c5n.large, c5n.xlarge, c5n.2xlarge, c5n.4xlarge, c5n.9xlarge,
     * c5n.18xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge,
     * g3.4xlarge, g3.8xlarge, g3.16xlarge, g3s.xlarge, g4dn.xlarge,
     * g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge, g4dn.12xlarge, g4dn.16xlarge,
     * g4dn.metal, cg1.4xlarge, p2.xlarge, p2.8xlarge, p2.16xlarge, p3.2xlarge,
     * p3.8xlarge, p3.16xlarge, p3dn.24xlarge, d2.xlarge, d2.2xlarge,
     * d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge, f1.16xlarge, m5.large,
     * m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge, m5.12xlarge, m5.16xlarge,
     * m5.24xlarge, m5.metal, m5a.large, m5a.xlarge, m5a.2xlarge, m5a.4xlarge,
     * m5a.8xlarge, m5a.12xlarge, m5a.16xlarge, m5a.24xlarge, m5d.large,
     * m5d.xlarge, m5d.2xlarge, m5d.4xlarge, m5d.8xlarge, m5d.12xlarge,
     * m5d.16xlarge, m5d.24xlarge, m5d.metal, m5ad.large, m5ad.xlarge,
     * m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge, m5ad.12xlarge, m5ad.16xlarge,
     * m5ad.24xlarge, h1.2xlarge, h1.4xlarge, h1.8xlarge, h1.16xlarge,
     * z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge, z1d.6xlarge,
     * z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal, u-12tb1.metal,
     * u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large, a1.xlarge, a1.2xlarge,
     * a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge, m5dn.2xlarge,
     * m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge, m5dn.24xlarge,
     * m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge, m5n.8xlarge,
     * m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large, r5dn.xlarge,
     * r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge, r5dn.16xlarge,
     * r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge, r5n.4xlarge,
     * r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge, inf1.xlarge,
     * inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal, m6g.medium,
     * m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     *
     * @return <p>
     *         The instance type.
     *         </p>
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The instance type.
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
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5a.large,
     * c5a.xlarge, c5a.2xlarge, c5a.4xlarge, c5a.8xlarge, c5a.12xlarge,
     * c5a.16xlarge, c5a.24xlarge, c5d.large, c5d.xlarge, c5d.2xlarge,
     * c5d.4xlarge, c5d.9xlarge, c5d.12xlarge, c5d.18xlarge, c5d.24xlarge,
     * c5d.metal, c5n.large, c5n.xlarge, c5n.2xlarge, c5n.4xlarge, c5n.9xlarge,
     * c5n.18xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge,
     * g3.4xlarge, g3.8xlarge, g3.16xlarge, g3s.xlarge, g4dn.xlarge,
     * g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge, g4dn.12xlarge, g4dn.16xlarge,
     * g4dn.metal, cg1.4xlarge, p2.xlarge, p2.8xlarge, p2.16xlarge, p3.2xlarge,
     * p3.8xlarge, p3.16xlarge, p3dn.24xlarge, d2.xlarge, d2.2xlarge,
     * d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge, f1.16xlarge, m5.large,
     * m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge, m5.12xlarge, m5.16xlarge,
     * m5.24xlarge, m5.metal, m5a.large, m5a.xlarge, m5a.2xlarge, m5a.4xlarge,
     * m5a.8xlarge, m5a.12xlarge, m5a.16xlarge, m5a.24xlarge, m5d.large,
     * m5d.xlarge, m5d.2xlarge, m5d.4xlarge, m5d.8xlarge, m5d.12xlarge,
     * m5d.16xlarge, m5d.24xlarge, m5d.metal, m5ad.large, m5ad.xlarge,
     * m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge, m5ad.12xlarge, m5ad.16xlarge,
     * m5ad.24xlarge, h1.2xlarge, h1.4xlarge, h1.8xlarge, h1.16xlarge,
     * z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge, z1d.6xlarge,
     * z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal, u-12tb1.metal,
     * u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large, a1.xlarge, a1.2xlarge,
     * a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge, m5dn.2xlarge,
     * m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge, m5dn.24xlarge,
     * m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge, m5n.8xlarge,
     * m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large, r5dn.xlarge,
     * r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge, r5dn.16xlarge,
     * r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge, r5n.4xlarge,
     * r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge, inf1.xlarge,
     * inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal, m6g.medium,
     * m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     *
     * @param instanceType <p>
     *            The instance type.
     *            </p>
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type.
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
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5a.large,
     * c5a.xlarge, c5a.2xlarge, c5a.4xlarge, c5a.8xlarge, c5a.12xlarge,
     * c5a.16xlarge, c5a.24xlarge, c5d.large, c5d.xlarge, c5d.2xlarge,
     * c5d.4xlarge, c5d.9xlarge, c5d.12xlarge, c5d.18xlarge, c5d.24xlarge,
     * c5d.metal, c5n.large, c5n.xlarge, c5n.2xlarge, c5n.4xlarge, c5n.9xlarge,
     * c5n.18xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge,
     * g3.4xlarge, g3.8xlarge, g3.16xlarge, g3s.xlarge, g4dn.xlarge,
     * g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge, g4dn.12xlarge, g4dn.16xlarge,
     * g4dn.metal, cg1.4xlarge, p2.xlarge, p2.8xlarge, p2.16xlarge, p3.2xlarge,
     * p3.8xlarge, p3.16xlarge, p3dn.24xlarge, d2.xlarge, d2.2xlarge,
     * d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge, f1.16xlarge, m5.large,
     * m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge, m5.12xlarge, m5.16xlarge,
     * m5.24xlarge, m5.metal, m5a.large, m5a.xlarge, m5a.2xlarge, m5a.4xlarge,
     * m5a.8xlarge, m5a.12xlarge, m5a.16xlarge, m5a.24xlarge, m5d.large,
     * m5d.xlarge, m5d.2xlarge, m5d.4xlarge, m5d.8xlarge, m5d.12xlarge,
     * m5d.16xlarge, m5d.24xlarge, m5d.metal, m5ad.large, m5ad.xlarge,
     * m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge, m5ad.12xlarge, m5ad.16xlarge,
     * m5ad.24xlarge, h1.2xlarge, h1.4xlarge, h1.8xlarge, h1.16xlarge,
     * z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge, z1d.6xlarge,
     * z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal, u-12tb1.metal,
     * u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large, a1.xlarge, a1.2xlarge,
     * a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge, m5dn.2xlarge,
     * m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge, m5dn.24xlarge,
     * m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge, m5n.8xlarge,
     * m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large, r5dn.xlarge,
     * r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge, r5dn.16xlarge,
     * r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge, r5n.4xlarge,
     * r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge, inf1.xlarge,
     * inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal, m6g.medium,
     * m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     *
     * @param instanceType <p>
     *            The instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public Instance withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The instance type.
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
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5a.large,
     * c5a.xlarge, c5a.2xlarge, c5a.4xlarge, c5a.8xlarge, c5a.12xlarge,
     * c5a.16xlarge, c5a.24xlarge, c5d.large, c5d.xlarge, c5d.2xlarge,
     * c5d.4xlarge, c5d.9xlarge, c5d.12xlarge, c5d.18xlarge, c5d.24xlarge,
     * c5d.metal, c5n.large, c5n.xlarge, c5n.2xlarge, c5n.4xlarge, c5n.9xlarge,
     * c5n.18xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge,
     * g3.4xlarge, g3.8xlarge, g3.16xlarge, g3s.xlarge, g4dn.xlarge,
     * g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge, g4dn.12xlarge, g4dn.16xlarge,
     * g4dn.metal, cg1.4xlarge, p2.xlarge, p2.8xlarge, p2.16xlarge, p3.2xlarge,
     * p3.8xlarge, p3.16xlarge, p3dn.24xlarge, d2.xlarge, d2.2xlarge,
     * d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge, f1.16xlarge, m5.large,
     * m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge, m5.12xlarge, m5.16xlarge,
     * m5.24xlarge, m5.metal, m5a.large, m5a.xlarge, m5a.2xlarge, m5a.4xlarge,
     * m5a.8xlarge, m5a.12xlarge, m5a.16xlarge, m5a.24xlarge, m5d.large,
     * m5d.xlarge, m5d.2xlarge, m5d.4xlarge, m5d.8xlarge, m5d.12xlarge,
     * m5d.16xlarge, m5d.24xlarge, m5d.metal, m5ad.large, m5ad.xlarge,
     * m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge, m5ad.12xlarge, m5ad.16xlarge,
     * m5ad.24xlarge, h1.2xlarge, h1.4xlarge, h1.8xlarge, h1.16xlarge,
     * z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge, z1d.6xlarge,
     * z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal, u-12tb1.metal,
     * u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large, a1.xlarge, a1.2xlarge,
     * a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge, m5dn.2xlarge,
     * m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge, m5dn.24xlarge,
     * m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge, m5n.8xlarge,
     * m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large, r5dn.xlarge,
     * r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge, r5dn.16xlarge,
     * r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge, r5n.4xlarge,
     * r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge, inf1.xlarge,
     * inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal, m6g.medium,
     * m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     *
     * @param instanceType <p>
     *            The instance type.
     *            </p>
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }

    /**
     * <p>
     * The instance type.
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
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5a.large,
     * c5a.xlarge, c5a.2xlarge, c5a.4xlarge, c5a.8xlarge, c5a.12xlarge,
     * c5a.16xlarge, c5a.24xlarge, c5d.large, c5d.xlarge, c5d.2xlarge,
     * c5d.4xlarge, c5d.9xlarge, c5d.12xlarge, c5d.18xlarge, c5d.24xlarge,
     * c5d.metal, c5n.large, c5n.xlarge, c5n.2xlarge, c5n.4xlarge, c5n.9xlarge,
     * c5n.18xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge,
     * g3.4xlarge, g3.8xlarge, g3.16xlarge, g3s.xlarge, g4dn.xlarge,
     * g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge, g4dn.12xlarge, g4dn.16xlarge,
     * g4dn.metal, cg1.4xlarge, p2.xlarge, p2.8xlarge, p2.16xlarge, p3.2xlarge,
     * p3.8xlarge, p3.16xlarge, p3dn.24xlarge, d2.xlarge, d2.2xlarge,
     * d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge, f1.16xlarge, m5.large,
     * m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge, m5.12xlarge, m5.16xlarge,
     * m5.24xlarge, m5.metal, m5a.large, m5a.xlarge, m5a.2xlarge, m5a.4xlarge,
     * m5a.8xlarge, m5a.12xlarge, m5a.16xlarge, m5a.24xlarge, m5d.large,
     * m5d.xlarge, m5d.2xlarge, m5d.4xlarge, m5d.8xlarge, m5d.12xlarge,
     * m5d.16xlarge, m5d.24xlarge, m5d.metal, m5ad.large, m5ad.xlarge,
     * m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge, m5ad.12xlarge, m5ad.16xlarge,
     * m5ad.24xlarge, h1.2xlarge, h1.4xlarge, h1.8xlarge, h1.16xlarge,
     * z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge, z1d.6xlarge,
     * z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal, u-12tb1.metal,
     * u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large, a1.xlarge, a1.2xlarge,
     * a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge, m5dn.2xlarge,
     * m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge, m5dn.24xlarge,
     * m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge, m5n.8xlarge,
     * m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large, r5dn.xlarge,
     * r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge, r5dn.16xlarge,
     * r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge, r5n.4xlarge,
     * r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge, inf1.xlarge,
     * inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal, m6g.medium,
     * m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     *
     * @param instanceType <p>
     *            The instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public Instance withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The kernel associated with this instance, if applicable.
     * </p>
     *
     * @return <p>
     *         The kernel associated with this instance, if applicable.
     *         </p>
     */
    public String getKernelId() {
        return kernelId;
    }

    /**
     * <p>
     * The kernel associated with this instance, if applicable.
     * </p>
     *
     * @param kernelId <p>
     *            The kernel associated with this instance, if applicable.
     *            </p>
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    /**
     * <p>
     * The kernel associated with this instance, if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kernelId <p>
     *            The kernel associated with this instance, if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * <p>
     * The name of the key pair, if this instance was launched with an
     * associated key pair.
     * </p>
     *
     * @return <p>
     *         The name of the key pair, if this instance was launched with an
     *         associated key pair.
     *         </p>
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * <p>
     * The name of the key pair, if this instance was launched with an
     * associated key pair.
     * </p>
     *
     * @param keyName <p>
     *            The name of the key pair, if this instance was launched with
     *            an associated key pair.
     *            </p>
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the key pair, if this instance was launched with an
     * associated key pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyName <p>
     *            The name of the key pair, if this instance was launched with
     *            an associated key pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * <p>
     * The time the instance was launched.
     * </p>
     *
     * @return <p>
     *         The time the instance was launched.
     *         </p>
     */
    public java.util.Date getLaunchTime() {
        return launchTime;
    }

    /**
     * <p>
     * The time the instance was launched.
     * </p>
     *
     * @param launchTime <p>
     *            The time the instance was launched.
     *            </p>
     */
    public void setLaunchTime(java.util.Date launchTime) {
        this.launchTime = launchTime;
    }

    /**
     * <p>
     * The time the instance was launched.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTime <p>
     *            The time the instance was launched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withLaunchTime(java.util.Date launchTime) {
        this.launchTime = launchTime;
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
    public Monitoring getMonitoring() {
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
    public void setMonitoring(Monitoring monitoring) {
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
    public Instance withMonitoring(Monitoring monitoring) {
        this.monitoring = monitoring;
        return this;
    }

    /**
     * <p>
     * The location where the instance launched, if applicable.
     * </p>
     *
     * @return <p>
     *         The location where the instance launched, if applicable.
     *         </p>
     */
    public Placement getPlacement() {
        return placement;
    }

    /**
     * <p>
     * The location where the instance launched, if applicable.
     * </p>
     *
     * @param placement <p>
     *            The location where the instance launched, if applicable.
     *            </p>
     */
    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

    /**
     * <p>
     * The location where the instance launched, if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placement <p>
     *            The location where the instance launched, if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withPlacement(Placement placement) {
        this.placement = placement;
        return this;
    }

    /**
     * <p>
     * The value is <code>Windows</code> for Windows instances; otherwise blank.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @return <p>
     *         The value is <code>Windows</code> for Windows instances;
     *         otherwise blank.
     *         </p>
     * @see PlatformValues
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * <p>
     * The value is <code>Windows</code> for Windows instances; otherwise blank.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform <p>
     *            The value is <code>Windows</code> for Windows instances;
     *            otherwise blank.
     *            </p>
     * @see PlatformValues
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The value is <code>Windows</code> for Windows instances; otherwise blank.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform <p>
     *            The value is <code>Windows</code> for Windows instances;
     *            otherwise blank.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PlatformValues
     */
    public Instance withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * <p>
     * The value is <code>Windows</code> for Windows instances; otherwise blank.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform <p>
     *            The value is <code>Windows</code> for Windows instances;
     *            otherwise blank.
     *            </p>
     * @see PlatformValues
     */
    public void setPlatform(PlatformValues platform) {
        this.platform = platform.toString();
    }

    /**
     * <p>
     * The value is <code>Windows</code> for Windows instances; otherwise blank.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform <p>
     *            The value is <code>Windows</code> for Windows instances;
     *            otherwise blank.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PlatformValues
     */
    public Instance withPlatform(PlatformValues platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * (IPv4 only) The private DNS hostname name assigned to the instance. This
     * DNS hostname can only be used inside the Amazon EC2 network. This name is
     * not available until the instance enters the <code>running</code> state.
     * </p>
     * <p>
     * [EC2-VPC] The Amazon-provided DNS server resolves Amazon-provided private
     * DNS hostnames if you've enabled DNS resolution and DNS hostnames in your
     * VPC. If you are not using the Amazon-provided DNS server in your VPC,
     * your custom domain name servers must resolve the hostname as appropriate.
     * </p>
     *
     * @return <p>
     *         (IPv4 only) The private DNS hostname name assigned to the
     *         instance. This DNS hostname can only be used inside the Amazon
     *         EC2 network. This name is not available until the instance enters
     *         the <code>running</code> state.
     *         </p>
     *         <p>
     *         [EC2-VPC] The Amazon-provided DNS server resolves Amazon-provided
     *         private DNS hostnames if you've enabled DNS resolution and DNS
     *         hostnames in your VPC. If you are not using the Amazon-provided
     *         DNS server in your VPC, your custom domain name servers must
     *         resolve the hostname as appropriate.
     *         </p>
     */
    public String getPrivateDnsName() {
        return privateDnsName;
    }

    /**
     * <p>
     * (IPv4 only) The private DNS hostname name assigned to the instance. This
     * DNS hostname can only be used inside the Amazon EC2 network. This name is
     * not available until the instance enters the <code>running</code> state.
     * </p>
     * <p>
     * [EC2-VPC] The Amazon-provided DNS server resolves Amazon-provided private
     * DNS hostnames if you've enabled DNS resolution and DNS hostnames in your
     * VPC. If you are not using the Amazon-provided DNS server in your VPC,
     * your custom domain name servers must resolve the hostname as appropriate.
     * </p>
     *
     * @param privateDnsName <p>
     *            (IPv4 only) The private DNS hostname name assigned to the
     *            instance. This DNS hostname can only be used inside the Amazon
     *            EC2 network. This name is not available until the instance
     *            enters the <code>running</code> state.
     *            </p>
     *            <p>
     *            [EC2-VPC] The Amazon-provided DNS server resolves
     *            Amazon-provided private DNS hostnames if you've enabled DNS
     *            resolution and DNS hostnames in your VPC. If you are not using
     *            the Amazon-provided DNS server in your VPC, your custom domain
     *            name servers must resolve the hostname as appropriate.
     *            </p>
     */
    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    /**
     * <p>
     * (IPv4 only) The private DNS hostname name assigned to the instance. This
     * DNS hostname can only be used inside the Amazon EC2 network. This name is
     * not available until the instance enters the <code>running</code> state.
     * </p>
     * <p>
     * [EC2-VPC] The Amazon-provided DNS server resolves Amazon-provided private
     * DNS hostnames if you've enabled DNS resolution and DNS hostnames in your
     * VPC. If you are not using the Amazon-provided DNS server in your VPC,
     * your custom domain name servers must resolve the hostname as appropriate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateDnsName <p>
     *            (IPv4 only) The private DNS hostname name assigned to the
     *            instance. This DNS hostname can only be used inside the Amazon
     *            EC2 network. This name is not available until the instance
     *            enters the <code>running</code> state.
     *            </p>
     *            <p>
     *            [EC2-VPC] The Amazon-provided DNS server resolves
     *            Amazon-provided private DNS hostnames if you've enabled DNS
     *            resolution and DNS hostnames in your VPC. If you are not using
     *            the Amazon-provided DNS server in your VPC, your custom domain
     *            name servers must resolve the hostname as appropriate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
        return this;
    }

    /**
     * <p>
     * The private IPv4 address assigned to the instance.
     * </p>
     *
     * @return <p>
     *         The private IPv4 address assigned to the instance.
     *         </p>
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * <p>
     * The private IPv4 address assigned to the instance.
     * </p>
     *
     * @param privateIpAddress <p>
     *            The private IPv4 address assigned to the instance.
     *            </p>
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The private IPv4 address assigned to the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddress <p>
     *            The private IPv4 address assigned to the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * <p>
     * The product codes attached to this instance, if applicable.
     * </p>
     *
     * @return <p>
     *         The product codes attached to this instance, if applicable.
     *         </p>
     */
    public java.util.List<ProductCode> getProductCodes() {
        return productCodes;
    }

    /**
     * <p>
     * The product codes attached to this instance, if applicable.
     * </p>
     *
     * @param productCodes <p>
     *            The product codes attached to this instance, if applicable.
     *            </p>
     */
    public void setProductCodes(java.util.Collection<ProductCode> productCodes) {
        if (productCodes == null) {
            this.productCodes = null;
            return;
        }

        this.productCodes = new java.util.ArrayList<ProductCode>(productCodes);
    }

    /**
     * <p>
     * The product codes attached to this instance, if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCodes <p>
     *            The product codes attached to this instance, if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withProductCodes(ProductCode... productCodes) {
        if (getProductCodes() == null) {
            this.productCodes = new java.util.ArrayList<ProductCode>(productCodes.length);
        }
        for (ProductCode value : productCodes) {
            this.productCodes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The product codes attached to this instance, if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCodes <p>
     *            The product codes attached to this instance, if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withProductCodes(java.util.Collection<ProductCode> productCodes) {
        setProductCodes(productCodes);
        return this;
    }

    /**
     * <p>
     * (IPv4 only) The public DNS name assigned to the instance. This name is
     * not available until the instance enters the <code>running</code> state.
     * For EC2-VPC, this name is only available if you've enabled DNS hostnames
     * for your VPC.
     * </p>
     *
     * @return <p>
     *         (IPv4 only) The public DNS name assigned to the instance. This
     *         name is not available until the instance enters the
     *         <code>running</code> state. For EC2-VPC, this name is only
     *         available if you've enabled DNS hostnames for your VPC.
     *         </p>
     */
    public String getPublicDnsName() {
        return publicDnsName;
    }

    /**
     * <p>
     * (IPv4 only) The public DNS name assigned to the instance. This name is
     * not available until the instance enters the <code>running</code> state.
     * For EC2-VPC, this name is only available if you've enabled DNS hostnames
     * for your VPC.
     * </p>
     *
     * @param publicDnsName <p>
     *            (IPv4 only) The public DNS name assigned to the instance. This
     *            name is not available until the instance enters the
     *            <code>running</code> state. For EC2-VPC, this name is only
     *            available if you've enabled DNS hostnames for your VPC.
     *            </p>
     */
    public void setPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
    }

    /**
     * <p>
     * (IPv4 only) The public DNS name assigned to the instance. This name is
     * not available until the instance enters the <code>running</code> state.
     * For EC2-VPC, this name is only available if you've enabled DNS hostnames
     * for your VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicDnsName <p>
     *            (IPv4 only) The public DNS name assigned to the instance. This
     *            name is not available until the instance enters the
     *            <code>running</code> state. For EC2-VPC, this name is only
     *            available if you've enabled DNS hostnames for your VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
        return this;
    }

    /**
     * <p>
     * The public IPv4 address assigned to the instance, if applicable.
     * </p>
     *
     * @return <p>
     *         The public IPv4 address assigned to the instance, if applicable.
     *         </p>
     */
    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    /**
     * <p>
     * The public IPv4 address assigned to the instance, if applicable.
     * </p>
     *
     * @param publicIpAddress <p>
     *            The public IPv4 address assigned to the instance, if
     *            applicable.
     *            </p>
     */
    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    /**
     * <p>
     * The public IPv4 address assigned to the instance, if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicIpAddress <p>
     *            The public IPv4 address assigned to the instance, if
     *            applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * <p>
     * The RAM disk associated with this instance, if applicable.
     * </p>
     *
     * @return <p>
     *         The RAM disk associated with this instance, if applicable.
     *         </p>
     */
    public String getRamdiskId() {
        return ramdiskId;
    }

    /**
     * <p>
     * The RAM disk associated with this instance, if applicable.
     * </p>
     *
     * @param ramdiskId <p>
     *            The RAM disk associated with this instance, if applicable.
     *            </p>
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    /**
     * <p>
     * The RAM disk associated with this instance, if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ramdiskId <p>
     *            The RAM disk associated with this instance, if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * <p>
     * The current state of the instance.
     * </p>
     *
     * @return <p>
     *         The current state of the instance.
     *         </p>
     */
    public InstanceState getState() {
        return state;
    }

    /**
     * <p>
     * The current state of the instance.
     * </p>
     *
     * @param state <p>
     *            The current state of the instance.
     *            </p>
     */
    public void setState(InstanceState state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param state <p>
     *            The current state of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withState(InstanceState state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The reason for the most recent state transition. This might be an empty
     * string.
     * </p>
     *
     * @return <p>
     *         The reason for the most recent state transition. This might be an
     *         empty string.
     *         </p>
     */
    public String getStateTransitionReason() {
        return stateTransitionReason;
    }

    /**
     * <p>
     * The reason for the most recent state transition. This might be an empty
     * string.
     * </p>
     *
     * @param stateTransitionReason <p>
     *            The reason for the most recent state transition. This might be
     *            an empty string.
     *            </p>
     */
    public void setStateTransitionReason(String stateTransitionReason) {
        this.stateTransitionReason = stateTransitionReason;
    }

    /**
     * <p>
     * The reason for the most recent state transition. This might be an empty
     * string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stateTransitionReason <p>
     *            The reason for the most recent state transition. This might be
     *            an empty string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withStateTransitionReason(String stateTransitionReason) {
        this.stateTransitionReason = stateTransitionReason;
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the subnet in which the instance is running.
     * </p>
     *
     * @return <p>
     *         [EC2-VPC] The ID of the subnet in which the instance is running.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the subnet in which the instance is running.
     * </p>
     *
     * @param subnetId <p>
     *            [EC2-VPC] The ID of the subnet in which the instance is
     *            running.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the subnet in which the instance is running.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetId <p>
     *            [EC2-VPC] The ID of the subnet in which the instance is
     *            running.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the VPC in which the instance is running.
     * </p>
     *
     * @return <p>
     *         [EC2-VPC] The ID of the VPC in which the instance is running.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the VPC in which the instance is running.
     * </p>
     *
     * @param vpcId <p>
     *            [EC2-VPC] The ID of the VPC in which the instance is running.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the VPC in which the instance is running.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            [EC2-VPC] The ID of the VPC in which the instance is running.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * The architecture of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64, arm64
     *
     * @return <p>
     *         The architecture of the image.
     *         </p>
     * @see ArchitectureValues
     */
    public String getArchitecture() {
        return architecture;
    }

    /**
     * <p>
     * The architecture of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64, arm64
     *
     * @param architecture <p>
     *            The architecture of the image.
     *            </p>
     * @see ArchitectureValues
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The architecture of the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64, arm64
     *
     * @param architecture <p>
     *            The architecture of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ArchitectureValues
     */
    public Instance withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * <p>
     * The architecture of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64, arm64
     *
     * @param architecture <p>
     *            The architecture of the image.
     *            </p>
     * @see ArchitectureValues
     */
    public void setArchitecture(ArchitectureValues architecture) {
        this.architecture = architecture.toString();
    }

    /**
     * <p>
     * The architecture of the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64, arm64
     *
     * @param architecture <p>
     *            The architecture of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ArchitectureValues
     */
    public Instance withArchitecture(ArchitectureValues architecture) {
        this.architecture = architecture.toString();
        return this;
    }

    /**
     * <p>
     * Any block device mapping entries for the instance.
     * </p>
     *
     * @return <p>
     *         Any block device mapping entries for the instance.
     *         </p>
     */
    public java.util.List<InstanceBlockDeviceMapping> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * <p>
     * Any block device mapping entries for the instance.
     * </p>
     *
     * @param blockDeviceMappings <p>
     *            Any block device mapping entries for the instance.
     *            </p>
     */
    public void setBlockDeviceMappings(
            java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new java.util.ArrayList<InstanceBlockDeviceMapping>(
                blockDeviceMappings);
    }

    /**
     * <p>
     * Any block device mapping entries for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            Any block device mapping entries for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withBlockDeviceMappings(InstanceBlockDeviceMapping... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) {
            this.blockDeviceMappings = new java.util.ArrayList<InstanceBlockDeviceMapping>(
                    blockDeviceMappings.length);
        }
        for (InstanceBlockDeviceMapping value : blockDeviceMappings) {
            this.blockDeviceMappings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any block device mapping entries for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            Any block device mapping entries for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withBlockDeviceMappings(
            java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * The idempotency token you provided when you launched the instance, if
     * applicable.
     * </p>
     *
     * @return <p>
     *         The idempotency token you provided when you launched the
     *         instance, if applicable.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * The idempotency token you provided when you launched the instance, if
     * applicable.
     * </p>
     *
     * @param clientToken <p>
     *            The idempotency token you provided when you launched the
     *            instance, if applicable.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token you provided when you launched the instance, if
     * applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            The idempotency token you provided when you launched the
     *            instance, if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal I/O performance. This optimization
     * isn't available with all instance types. Additional usage charges apply
     * when using an EBS Optimized instance.
     * </p>
     *
     * @return <p>
     *         Indicates whether the instance is optimized for Amazon EBS I/O.
     *         This optimization provides dedicated throughput to Amazon EBS and
     *         an optimized configuration stack to provide optimal I/O
     *         performance. This optimization isn't available with all instance
     *         types. Additional usage charges apply when using an EBS Optimized
     *         instance.
     *         </p>
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal I/O performance. This optimization
     * isn't available with all instance types. Additional usage charges apply
     * when using an EBS Optimized instance.
     * </p>
     *
     * @return <p>
     *         Indicates whether the instance is optimized for Amazon EBS I/O.
     *         This optimization provides dedicated throughput to Amazon EBS and
     *         an optimized configuration stack to provide optimal I/O
     *         performance. This optimization isn't available with all instance
     *         types. Additional usage charges apply when using an EBS Optimized
     *         instance.
     *         </p>
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal I/O performance. This optimization
     * isn't available with all instance types. Additional usage charges apply
     * when using an EBS Optimized instance.
     * </p>
     *
     * @param ebsOptimized <p>
     *            Indicates whether the instance is optimized for Amazon EBS
     *            I/O. This optimization provides dedicated throughput to Amazon
     *            EBS and an optimized configuration stack to provide optimal
     *            I/O performance. This optimization isn't available with all
     *            instance types. Additional usage charges apply when using an
     *            EBS Optimized instance.
     *            </p>
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal I/O performance. This optimization
     * isn't available with all instance types. Additional usage charges apply
     * when using an EBS Optimized instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsOptimized <p>
     *            Indicates whether the instance is optimized for Amazon EBS
     *            I/O. This optimization provides dedicated throughput to Amazon
     *            EBS and an optimized configuration stack to provide optimal
     *            I/O performance. This optimization isn't available with all
     *            instance types. Additional usage charges apply when using an
     *            EBS Optimized instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * <p>
     * Specifies whether enhanced networking with ENA is enabled.
     * </p>
     *
     * @return <p>
     *         Specifies whether enhanced networking with ENA is enabled.
     *         </p>
     */
    public Boolean isEnaSupport() {
        return enaSupport;
    }

    /**
     * <p>
     * Specifies whether enhanced networking with ENA is enabled.
     * </p>
     *
     * @return <p>
     *         Specifies whether enhanced networking with ENA is enabled.
     *         </p>
     */
    public Boolean getEnaSupport() {
        return enaSupport;
    }

    /**
     * <p>
     * Specifies whether enhanced networking with ENA is enabled.
     * </p>
     *
     * @param enaSupport <p>
     *            Specifies whether enhanced networking with ENA is enabled.
     *            </p>
     */
    public void setEnaSupport(Boolean enaSupport) {
        this.enaSupport = enaSupport;
    }

    /**
     * <p>
     * Specifies whether enhanced networking with ENA is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enaSupport <p>
     *            Specifies whether enhanced networking with ENA is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withEnaSupport(Boolean enaSupport) {
        this.enaSupport = enaSupport;
        return this;
    }

    /**
     * <p>
     * The hypervisor type of the instance. The value <code>xen</code> is used
     * for both Xen and Nitro hypervisors.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @return <p>
     *         The hypervisor type of the instance. The value <code>xen</code>
     *         is used for both Xen and Nitro hypervisors.
     *         </p>
     * @see HypervisorType
     */
    public String getHypervisor() {
        return hypervisor;
    }

    /**
     * <p>
     * The hypervisor type of the instance. The value <code>xen</code> is used
     * for both Xen and Nitro hypervisors.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor <p>
     *            The hypervisor type of the instance. The value
     *            <code>xen</code> is used for both Xen and Nitro hypervisors.
     *            </p>
     * @see HypervisorType
     */
    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }

    /**
     * <p>
     * The hypervisor type of the instance. The value <code>xen</code> is used
     * for both Xen and Nitro hypervisors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor <p>
     *            The hypervisor type of the instance. The value
     *            <code>xen</code> is used for both Xen and Nitro hypervisors.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HypervisorType
     */
    public Instance withHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
        return this;
    }

    /**
     * <p>
     * The hypervisor type of the instance. The value <code>xen</code> is used
     * for both Xen and Nitro hypervisors.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor <p>
     *            The hypervisor type of the instance. The value
     *            <code>xen</code> is used for both Xen and Nitro hypervisors.
     *            </p>
     * @see HypervisorType
     */
    public void setHypervisor(HypervisorType hypervisor) {
        this.hypervisor = hypervisor.toString();
    }

    /**
     * <p>
     * The hypervisor type of the instance. The value <code>xen</code> is used
     * for both Xen and Nitro hypervisors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor <p>
     *            The hypervisor type of the instance. The value
     *            <code>xen</code> is used for both Xen and Nitro hypervisors.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HypervisorType
     */
    public Instance withHypervisor(HypervisorType hypervisor) {
        this.hypervisor = hypervisor.toString();
        return this;
    }

    /**
     * <p>
     * The IAM instance profile associated with the instance, if applicable.
     * </p>
     *
     * @return <p>
     *         The IAM instance profile associated with the instance, if
     *         applicable.
     *         </p>
     */
    public IamInstanceProfile getIamInstanceProfile() {
        return iamInstanceProfile;
    }

    /**
     * <p>
     * The IAM instance profile associated with the instance, if applicable.
     * </p>
     *
     * @param iamInstanceProfile <p>
     *            The IAM instance profile associated with the instance, if
     *            applicable.
     *            </p>
     */
    public void setIamInstanceProfile(IamInstanceProfile iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    /**
     * <p>
     * The IAM instance profile associated with the instance, if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamInstanceProfile <p>
     *            The IAM instance profile associated with the instance, if
     *            applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withIamInstanceProfile(IamInstanceProfile iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * <p>
     * Indicates whether this is a Spot Instance or a Scheduled Instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot, scheduled
     *
     * @return <p>
     *         Indicates whether this is a Spot Instance or a Scheduled
     *         Instance.
     *         </p>
     * @see InstanceLifecycleType
     */
    public String getInstanceLifecycle() {
        return instanceLifecycle;
    }

    /**
     * <p>
     * Indicates whether this is a Spot Instance or a Scheduled Instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot, scheduled
     *
     * @param instanceLifecycle <p>
     *            Indicates whether this is a Spot Instance or a Scheduled
     *            Instance.
     *            </p>
     * @see InstanceLifecycleType
     */
    public void setInstanceLifecycle(String instanceLifecycle) {
        this.instanceLifecycle = instanceLifecycle;
    }

    /**
     * <p>
     * Indicates whether this is a Spot Instance or a Scheduled Instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot, scheduled
     *
     * @param instanceLifecycle <p>
     *            Indicates whether this is a Spot Instance or a Scheduled
     *            Instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceLifecycleType
     */
    public Instance withInstanceLifecycle(String instanceLifecycle) {
        this.instanceLifecycle = instanceLifecycle;
        return this;
    }

    /**
     * <p>
     * Indicates whether this is a Spot Instance or a Scheduled Instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot, scheduled
     *
     * @param instanceLifecycle <p>
     *            Indicates whether this is a Spot Instance or a Scheduled
     *            Instance.
     *            </p>
     * @see InstanceLifecycleType
     */
    public void setInstanceLifecycle(InstanceLifecycleType instanceLifecycle) {
        this.instanceLifecycle = instanceLifecycle.toString();
    }

    /**
     * <p>
     * Indicates whether this is a Spot Instance or a Scheduled Instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot, scheduled
     *
     * @param instanceLifecycle <p>
     *            Indicates whether this is a Spot Instance or a Scheduled
     *            Instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceLifecycleType
     */
    public Instance withInstanceLifecycle(InstanceLifecycleType instanceLifecycle) {
        this.instanceLifecycle = instanceLifecycle.toString();
        return this;
    }

    /**
     * <p>
     * The Elastic GPU associated with the instance.
     * </p>
     *
     * @return <p>
     *         The Elastic GPU associated with the instance.
     *         </p>
     */
    public java.util.List<ElasticGpuAssociation> getElasticGpuAssociations() {
        return elasticGpuAssociations;
    }

    /**
     * <p>
     * The Elastic GPU associated with the instance.
     * </p>
     *
     * @param elasticGpuAssociations <p>
     *            The Elastic GPU associated with the instance.
     *            </p>
     */
    public void setElasticGpuAssociations(
            java.util.Collection<ElasticGpuAssociation> elasticGpuAssociations) {
        if (elasticGpuAssociations == null) {
            this.elasticGpuAssociations = null;
            return;
        }

        this.elasticGpuAssociations = new java.util.ArrayList<ElasticGpuAssociation>(
                elasticGpuAssociations);
    }

    /**
     * <p>
     * The Elastic GPU associated with the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticGpuAssociations <p>
     *            The Elastic GPU associated with the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withElasticGpuAssociations(ElasticGpuAssociation... elasticGpuAssociations) {
        if (getElasticGpuAssociations() == null) {
            this.elasticGpuAssociations = new java.util.ArrayList<ElasticGpuAssociation>(
                    elasticGpuAssociations.length);
        }
        for (ElasticGpuAssociation value : elasticGpuAssociations) {
            this.elasticGpuAssociations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Elastic GPU associated with the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticGpuAssociations <p>
     *            The Elastic GPU associated with the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withElasticGpuAssociations(
            java.util.Collection<ElasticGpuAssociation> elasticGpuAssociations) {
        setElasticGpuAssociations(elasticGpuAssociations);
        return this;
    }

    /**
     * <p>
     * The elastic inference accelerator associated with the instance.
     * </p>
     *
     * @return <p>
     *         The elastic inference accelerator associated with the instance.
     *         </p>
     */
    public java.util.List<ElasticInferenceAcceleratorAssociation> getElasticInferenceAcceleratorAssociations() {
        return elasticInferenceAcceleratorAssociations;
    }

    /**
     * <p>
     * The elastic inference accelerator associated with the instance.
     * </p>
     *
     * @param elasticInferenceAcceleratorAssociations <p>
     *            The elastic inference accelerator associated with the
     *            instance.
     *            </p>
     */
    public void setElasticInferenceAcceleratorAssociations(
            java.util.Collection<ElasticInferenceAcceleratorAssociation> elasticInferenceAcceleratorAssociations) {
        if (elasticInferenceAcceleratorAssociations == null) {
            this.elasticInferenceAcceleratorAssociations = null;
            return;
        }

        this.elasticInferenceAcceleratorAssociations = new java.util.ArrayList<ElasticInferenceAcceleratorAssociation>(
                elasticInferenceAcceleratorAssociations);
    }

    /**
     * <p>
     * The elastic inference accelerator associated with the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticInferenceAcceleratorAssociations <p>
     *            The elastic inference accelerator associated with the
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withElasticInferenceAcceleratorAssociations(
            ElasticInferenceAcceleratorAssociation... elasticInferenceAcceleratorAssociations) {
        if (getElasticInferenceAcceleratorAssociations() == null) {
            this.elasticInferenceAcceleratorAssociations = new java.util.ArrayList<ElasticInferenceAcceleratorAssociation>(
                    elasticInferenceAcceleratorAssociations.length);
        }
        for (ElasticInferenceAcceleratorAssociation value : elasticInferenceAcceleratorAssociations) {
            this.elasticInferenceAcceleratorAssociations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The elastic inference accelerator associated with the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticInferenceAcceleratorAssociations <p>
     *            The elastic inference accelerator associated with the
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withElasticInferenceAcceleratorAssociations(
            java.util.Collection<ElasticInferenceAcceleratorAssociation> elasticInferenceAcceleratorAssociations) {
        setElasticInferenceAcceleratorAssociations(elasticInferenceAcceleratorAssociations);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The network interfaces for the instance.
     * </p>
     *
     * @return <p>
     *         [EC2-VPC] The network interfaces for the instance.
     *         </p>
     */
    public java.util.List<InstanceNetworkInterface> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * <p>
     * [EC2-VPC] The network interfaces for the instance.
     * </p>
     *
     * @param networkInterfaces <p>
     *            [EC2-VPC] The network interfaces for the instance.
     *            </p>
     */
    public void setNetworkInterfaces(
            java.util.Collection<InstanceNetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new java.util.ArrayList<InstanceNetworkInterface>(
                networkInterfaces);
    }

    /**
     * <p>
     * [EC2-VPC] The network interfaces for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaces <p>
     *            [EC2-VPC] The network interfaces for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withNetworkInterfaces(InstanceNetworkInterface... networkInterfaces) {
        if (getNetworkInterfaces() == null) {
            this.networkInterfaces = new java.util.ArrayList<InstanceNetworkInterface>(
                    networkInterfaces.length);
        }
        for (InstanceNetworkInterface value : networkInterfaces) {
            this.networkInterfaces.add(value);
        }
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The network interfaces for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaces <p>
     *            [EC2-VPC] The network interfaces for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withNetworkInterfaces(
            java.util.Collection<InstanceNetworkInterface> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
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
    public Instance withOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
        return this;
    }

    /**
     * <p>
     * The device name of the root device volume (for example,
     * <code>/dev/sda1</code>).
     * </p>
     *
     * @return <p>
     *         The device name of the root device volume (for example,
     *         <code>/dev/sda1</code>).
     *         </p>
     */
    public String getRootDeviceName() {
        return rootDeviceName;
    }

    /**
     * <p>
     * The device name of the root device volume (for example,
     * <code>/dev/sda1</code>).
     * </p>
     *
     * @param rootDeviceName <p>
     *            The device name of the root device volume (for example,
     *            <code>/dev/sda1</code>).
     *            </p>
     */
    public void setRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
    }

    /**
     * <p>
     * The device name of the root device volume (for example,
     * <code>/dev/sda1</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rootDeviceName <p>
     *            The device name of the root device volume (for example,
     *            <code>/dev/sda1</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
        return this;
    }

    /**
     * <p>
     * The root device type used by the AMI. The AMI can use an EBS volume or an
     * instance store volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @return <p>
     *         The root device type used by the AMI. The AMI can use an EBS
     *         volume or an instance store volume.
     *         </p>
     * @see DeviceType
     */
    public String getRootDeviceType() {
        return rootDeviceType;
    }

    /**
     * <p>
     * The root device type used by the AMI. The AMI can use an EBS volume or an
     * instance store volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType <p>
     *            The root device type used by the AMI. The AMI can use an EBS
     *            volume or an instance store volume.
     *            </p>
     * @see DeviceType
     */
    public void setRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }

    /**
     * <p>
     * The root device type used by the AMI. The AMI can use an EBS volume or an
     * instance store volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType <p>
     *            The root device type used by the AMI. The AMI can use an EBS
     *            volume or an instance store volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceType
     */
    public Instance withRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
        return this;
    }

    /**
     * <p>
     * The root device type used by the AMI. The AMI can use an EBS volume or an
     * instance store volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType <p>
     *            The root device type used by the AMI. The AMI can use an EBS
     *            volume or an instance store volume.
     *            </p>
     * @see DeviceType
     */
    public void setRootDeviceType(DeviceType rootDeviceType) {
        this.rootDeviceType = rootDeviceType.toString();
    }

    /**
     * <p>
     * The root device type used by the AMI. The AMI can use an EBS volume or an
     * instance store volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType <p>
     *            The root device type used by the AMI. The AMI can use an EBS
     *            volume or an instance store volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceType
     */
    public Instance withRootDeviceType(DeviceType rootDeviceType) {
        this.rootDeviceType = rootDeviceType.toString();
        return this;
    }

    /**
     * <p>
     * The security groups for the instance.
     * </p>
     *
     * @return <p>
     *         The security groups for the instance.
     *         </p>
     */
    public java.util.List<GroupIdentifier> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The security groups for the instance.
     * </p>
     *
     * @param securityGroups <p>
     *            The security groups for the instance.
     *            </p>
     */
    public void setSecurityGroups(java.util.Collection<GroupIdentifier> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<GroupIdentifier>(securityGroups);
    }

    /**
     * <p>
     * The security groups for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The security groups for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withSecurityGroups(GroupIdentifier... securityGroups) {
        if (getSecurityGroups() == null) {
            this.securityGroups = new java.util.ArrayList<GroupIdentifier>(securityGroups.length);
        }
        for (GroupIdentifier value : securityGroups) {
            this.securityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The security groups for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The security groups for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withSecurityGroups(java.util.Collection<GroupIdentifier> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable an instance launched in a VPC to perform NAT.
     * This controls whether source/destination checking is enabled on the
     * instance. A value of <code>true</code> means that checking is enabled,
     * and <code>false</code> means that checking is disabled. The value must be
     * <code>false</code> for the instance to perform NAT. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     * >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable an instance launched in a VPC to
     *         perform NAT. This controls whether source/destination checking is
     *         enabled on the instance. A value of <code>true</code> means that
     *         checking is enabled, and <code>false</code> means that checking
     *         is disabled. The value must be <code>false</code> for the
     *         instance to perform NAT. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     *         >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User
     *         Guide</i>.
     *         </p>
     */
    public Boolean isSourceDestCheck() {
        return sourceDestCheck;
    }

    /**
     * <p>
     * Specifies whether to enable an instance launched in a VPC to perform NAT.
     * This controls whether source/destination checking is enabled on the
     * instance. A value of <code>true</code> means that checking is enabled,
     * and <code>false</code> means that checking is disabled. The value must be
     * <code>false</code> for the instance to perform NAT. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     * >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable an instance launched in a VPC to
     *         perform NAT. This controls whether source/destination checking is
     *         enabled on the instance. A value of <code>true</code> means that
     *         checking is enabled, and <code>false</code> means that checking
     *         is disabled. The value must be <code>false</code> for the
     *         instance to perform NAT. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     *         >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User
     *         Guide</i>.
     *         </p>
     */
    public Boolean getSourceDestCheck() {
        return sourceDestCheck;
    }

    /**
     * <p>
     * Specifies whether to enable an instance launched in a VPC to perform NAT.
     * This controls whether source/destination checking is enabled on the
     * instance. A value of <code>true</code> means that checking is enabled,
     * and <code>false</code> means that checking is disabled. The value must be
     * <code>false</code> for the instance to perform NAT. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     * >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     *
     * @param sourceDestCheck <p>
     *            Specifies whether to enable an instance launched in a VPC to
     *            perform NAT. This controls whether source/destination checking
     *            is enabled on the instance. A value of <code>true</code> means
     *            that checking is enabled, and <code>false</code> means that
     *            checking is disabled. The value must be <code>false</code> for
     *            the instance to perform NAT. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     *            >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User
     *            Guide</i>.
     *            </p>
     */
    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }

    /**
     * <p>
     * Specifies whether to enable an instance launched in a VPC to perform NAT.
     * This controls whether source/destination checking is enabled on the
     * instance. A value of <code>true</code> means that checking is enabled,
     * and <code>false</code> means that checking is disabled. The value must be
     * <code>false</code> for the instance to perform NAT. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     * >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceDestCheck <p>
     *            Specifies whether to enable an instance launched in a VPC to
     *            perform NAT. This controls whether source/destination checking
     *            is enabled on the instance. A value of <code>true</code> means
     *            that checking is enabled, and <code>false</code> means that
     *            checking is disabled. The value must be <code>false</code> for
     *            the instance to perform NAT. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     *            >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
        return this;
    }

    /**
     * <p>
     * If the request is a Spot Instance request, the ID of the request.
     * </p>
     *
     * @return <p>
     *         If the request is a Spot Instance request, the ID of the request.
     *         </p>
     */
    public String getSpotInstanceRequestId() {
        return spotInstanceRequestId;
    }

    /**
     * <p>
     * If the request is a Spot Instance request, the ID of the request.
     * </p>
     *
     * @param spotInstanceRequestId <p>
     *            If the request is a Spot Instance request, the ID of the
     *            request.
     *            </p>
     */
    public void setSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
    }

    /**
     * <p>
     * If the request is a Spot Instance request, the ID of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotInstanceRequestId <p>
     *            If the request is a Spot Instance request, the ID of the
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
        return this;
    }

    /**
     * <p>
     * Specifies whether enhanced networking with the Intel 82599 Virtual
     * Function interface is enabled.
     * </p>
     *
     * @return <p>
     *         Specifies whether enhanced networking with the Intel 82599
     *         Virtual Function interface is enabled.
     *         </p>
     */
    public String getSriovNetSupport() {
        return sriovNetSupport;
    }

    /**
     * <p>
     * Specifies whether enhanced networking with the Intel 82599 Virtual
     * Function interface is enabled.
     * </p>
     *
     * @param sriovNetSupport <p>
     *            Specifies whether enhanced networking with the Intel 82599
     *            Virtual Function interface is enabled.
     *            </p>
     */
    public void setSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }

    /**
     * <p>
     * Specifies whether enhanced networking with the Intel 82599 Virtual
     * Function interface is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sriovNetSupport <p>
     *            Specifies whether enhanced networking with the Intel 82599
     *            Virtual Function interface is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
        return this;
    }

    /**
     * <p>
     * The reason for the most recent state transition.
     * </p>
     *
     * @return <p>
     *         The reason for the most recent state transition.
     *         </p>
     */
    public StateReason getStateReason() {
        return stateReason;
    }

    /**
     * <p>
     * The reason for the most recent state transition.
     * </p>
     *
     * @param stateReason <p>
     *            The reason for the most recent state transition.
     *            </p>
     */
    public void setStateReason(StateReason stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * The reason for the most recent state transition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stateReason <p>
     *            The reason for the most recent state transition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withStateReason(StateReason stateReason) {
        this.stateReason = stateReason;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the instance.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the instance.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the instance.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the instance.
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
     * Any tags assigned to the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withTags(Tag... tags) {
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
     * Any tags assigned to the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The virtualization type of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @return <p>
     *         The virtualization type of the instance.
     *         </p>
     * @see VirtualizationType
     */
    public String getVirtualizationType() {
        return virtualizationType;
    }

    /**
     * <p>
     * The virtualization type of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType <p>
     *            The virtualization type of the instance.
     *            </p>
     * @see VirtualizationType
     */
    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }

    /**
     * <p>
     * The virtualization type of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType <p>
     *            The virtualization type of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VirtualizationType
     */
    public Instance withVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
        return this;
    }

    /**
     * <p>
     * The virtualization type of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType <p>
     *            The virtualization type of the instance.
     *            </p>
     * @see VirtualizationType
     */
    public void setVirtualizationType(VirtualizationType virtualizationType) {
        this.virtualizationType = virtualizationType.toString();
    }

    /**
     * <p>
     * The virtualization type of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType <p>
     *            The virtualization type of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VirtualizationType
     */
    public Instance withVirtualizationType(VirtualizationType virtualizationType) {
        this.virtualizationType = virtualizationType.toString();
        return this;
    }

    /**
     * <p>
     * The CPU options for the instance.
     * </p>
     *
     * @return <p>
     *         The CPU options for the instance.
     *         </p>
     */
    public CpuOptions getCpuOptions() {
        return cpuOptions;
    }

    /**
     * <p>
     * The CPU options for the instance.
     * </p>
     *
     * @param cpuOptions <p>
     *            The CPU options for the instance.
     *            </p>
     */
    public void setCpuOptions(CpuOptions cpuOptions) {
        this.cpuOptions = cpuOptions;
    }

    /**
     * <p>
     * The CPU options for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cpuOptions <p>
     *            The CPU options for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withCpuOptions(CpuOptions cpuOptions) {
        this.cpuOptions = cpuOptions;
        return this;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     *
     * @return <p>
     *         The ID of the Capacity Reservation.
     *         </p>
     */
    public String getCapacityReservationId() {
        return capacityReservationId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     *
     * @param capacityReservationId <p>
     *            The ID of the Capacity Reservation.
     *            </p>
     */
    public void setCapacityReservationId(String capacityReservationId) {
        this.capacityReservationId = capacityReservationId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityReservationId <p>
     *            The ID of the Capacity Reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withCapacityReservationId(String capacityReservationId) {
        this.capacityReservationId = capacityReservationId;
        return this;
    }

    /**
     * <p>
     * Information about the Capacity Reservation targeting option.
     * </p>
     *
     * @return <p>
     *         Information about the Capacity Reservation targeting option.
     *         </p>
     */
    public CapacityReservationSpecificationResponse getCapacityReservationSpecification() {
        return capacityReservationSpecification;
    }

    /**
     * <p>
     * Information about the Capacity Reservation targeting option.
     * </p>
     *
     * @param capacityReservationSpecification <p>
     *            Information about the Capacity Reservation targeting option.
     *            </p>
     */
    public void setCapacityReservationSpecification(
            CapacityReservationSpecificationResponse capacityReservationSpecification) {
        this.capacityReservationSpecification = capacityReservationSpecification;
    }

    /**
     * <p>
     * Information about the Capacity Reservation targeting option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityReservationSpecification <p>
     *            Information about the Capacity Reservation targeting option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withCapacityReservationSpecification(
            CapacityReservationSpecificationResponse capacityReservationSpecification) {
        this.capacityReservationSpecification = capacityReservationSpecification;
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is enabled for hibernation.
     * </p>
     *
     * @return <p>
     *         Indicates whether the instance is enabled for hibernation.
     *         </p>
     */
    public HibernationOptions getHibernationOptions() {
        return hibernationOptions;
    }

    /**
     * <p>
     * Indicates whether the instance is enabled for hibernation.
     * </p>
     *
     * @param hibernationOptions <p>
     *            Indicates whether the instance is enabled for hibernation.
     *            </p>
     */
    public void setHibernationOptions(HibernationOptions hibernationOptions) {
        this.hibernationOptions = hibernationOptions;
    }

    /**
     * <p>
     * Indicates whether the instance is enabled for hibernation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hibernationOptions <p>
     *            Indicates whether the instance is enabled for hibernation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withHibernationOptions(HibernationOptions hibernationOptions) {
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
    public java.util.List<LicenseConfiguration> getLicenses() {
        return licenses;
    }

    /**
     * <p>
     * The license configurations.
     * </p>
     *
     * @param licenses <p>
     *            The license configurations.
     *            </p>
     */
    public void setLicenses(java.util.Collection<LicenseConfiguration> licenses) {
        if (licenses == null) {
            this.licenses = null;
            return;
        }

        this.licenses = new java.util.ArrayList<LicenseConfiguration>(licenses);
    }

    /**
     * <p>
     * The license configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenses <p>
     *            The license configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withLicenses(LicenseConfiguration... licenses) {
        if (getLicenses() == null) {
            this.licenses = new java.util.ArrayList<LicenseConfiguration>(licenses.length);
        }
        for (LicenseConfiguration value : licenses) {
            this.licenses.add(value);
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
     * @param licenses <p>
     *            The license configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withLicenses(java.util.Collection<LicenseConfiguration> licenses) {
        setLicenses(licenses);
        return this;
    }

    /**
     * <p>
     * The metadata options for the instance.
     * </p>
     *
     * @return <p>
     *         The metadata options for the instance.
     *         </p>
     */
    public InstanceMetadataOptionsResponse getMetadataOptions() {
        return metadataOptions;
    }

    /**
     * <p>
     * The metadata options for the instance.
     * </p>
     *
     * @param metadataOptions <p>
     *            The metadata options for the instance.
     *            </p>
     */
    public void setMetadataOptions(InstanceMetadataOptionsResponse metadataOptions) {
        this.metadataOptions = metadataOptions;
    }

    /**
     * <p>
     * The metadata options for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metadataOptions <p>
     *            The metadata options for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withMetadataOptions(InstanceMetadataOptionsResponse metadataOptions) {
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
        if (getAmiLaunchIndex() != null)
            sb.append("AmiLaunchIndex: " + getAmiLaunchIndex() + ",");
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getKernelId() != null)
            sb.append("KernelId: " + getKernelId() + ",");
        if (getKeyName() != null)
            sb.append("KeyName: " + getKeyName() + ",");
        if (getLaunchTime() != null)
            sb.append("LaunchTime: " + getLaunchTime() + ",");
        if (getMonitoring() != null)
            sb.append("Monitoring: " + getMonitoring() + ",");
        if (getPlacement() != null)
            sb.append("Placement: " + getPlacement() + ",");
        if (getPlatform() != null)
            sb.append("Platform: " + getPlatform() + ",");
        if (getPrivateDnsName() != null)
            sb.append("PrivateDnsName: " + getPrivateDnsName() + ",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: " + getProductCodes() + ",");
        if (getPublicDnsName() != null)
            sb.append("PublicDnsName: " + getPublicDnsName() + ",");
        if (getPublicIpAddress() != null)
            sb.append("PublicIpAddress: " + getPublicIpAddress() + ",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getStateTransitionReason() != null)
            sb.append("StateTransitionReason: " + getStateTransitionReason() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getArchitecture() != null)
            sb.append("Architecture: " + getArchitecture() + ",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: " + getEbsOptimized() + ",");
        if (getEnaSupport() != null)
            sb.append("EnaSupport: " + getEnaSupport() + ",");
        if (getHypervisor() != null)
            sb.append("Hypervisor: " + getHypervisor() + ",");
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
        if (getInstanceLifecycle() != null)
            sb.append("InstanceLifecycle: " + getInstanceLifecycle() + ",");
        if (getElasticGpuAssociations() != null)
            sb.append("ElasticGpuAssociations: " + getElasticGpuAssociations() + ",");
        if (getElasticInferenceAcceleratorAssociations() != null)
            sb.append("ElasticInferenceAcceleratorAssociations: "
                    + getElasticInferenceAcceleratorAssociations() + ",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: " + getNetworkInterfaces() + ",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: " + getOutpostArn() + ",");
        if (getRootDeviceName() != null)
            sb.append("RootDeviceName: " + getRootDeviceName() + ",");
        if (getRootDeviceType() != null)
            sb.append("RootDeviceType: " + getRootDeviceType() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getSourceDestCheck() != null)
            sb.append("SourceDestCheck: " + getSourceDestCheck() + ",");
        if (getSpotInstanceRequestId() != null)
            sb.append("SpotInstanceRequestId: " + getSpotInstanceRequestId() + ",");
        if (getSriovNetSupport() != null)
            sb.append("SriovNetSupport: " + getSriovNetSupport() + ",");
        if (getStateReason() != null)
            sb.append("StateReason: " + getStateReason() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getVirtualizationType() != null)
            sb.append("VirtualizationType: " + getVirtualizationType() + ",");
        if (getCpuOptions() != null)
            sb.append("CpuOptions: " + getCpuOptions() + ",");
        if (getCapacityReservationId() != null)
            sb.append("CapacityReservationId: " + getCapacityReservationId() + ",");
        if (getCapacityReservationSpecification() != null)
            sb.append("CapacityReservationSpecification: " + getCapacityReservationSpecification()
                    + ",");
        if (getHibernationOptions() != null)
            sb.append("HibernationOptions: " + getHibernationOptions() + ",");
        if (getLicenses() != null)
            sb.append("Licenses: " + getLicenses() + ",");
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
                + ((getAmiLaunchIndex() == null) ? 0 : getAmiLaunchIndex().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getLaunchTime() == null) ? 0 : getLaunchTime().hashCode());
        hashCode = prime * hashCode + ((getMonitoring() == null) ? 0 : getMonitoring().hashCode());
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode
                + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode());
        hashCode = prime * hashCode
                + ((getPublicDnsName() == null) ? 0 : getPublicDnsName().hashCode());
        hashCode = prime * hashCode
                + ((getPublicIpAddress() == null) ? 0 : getPublicIpAddress().hashCode());
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime
                * hashCode
                + ((getStateTransitionReason() == null) ? 0 : getStateTransitionReason().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode
                + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode
                + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode + ((getEnaSupport() == null) ? 0 : getEnaSupport().hashCode());
        hashCode = prime * hashCode + ((getHypervisor() == null) ? 0 : getHypervisor().hashCode());
        hashCode = prime * hashCode
                + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceLifecycle() == null) ? 0 : getInstanceLifecycle().hashCode());
        hashCode = prime
                * hashCode
                + ((getElasticGpuAssociations() == null) ? 0 : getElasticGpuAssociations()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getElasticInferenceAcceleratorAssociations() == null) ? 0
                        : getElasticInferenceAcceleratorAssociations().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode
                + ((getRootDeviceName() == null) ? 0 : getRootDeviceName().hashCode());
        hashCode = prime * hashCode
                + ((getRootDeviceType() == null) ? 0 : getRootDeviceType().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode
                + ((getSourceDestCheck() == null) ? 0 : getSourceDestCheck().hashCode());
        hashCode = prime
                * hashCode
                + ((getSpotInstanceRequestId() == null) ? 0 : getSpotInstanceRequestId().hashCode());
        hashCode = prime * hashCode
                + ((getSriovNetSupport() == null) ? 0 : getSriovNetSupport().hashCode());
        hashCode = prime * hashCode
                + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualizationType() == null) ? 0 : getVirtualizationType().hashCode());
        hashCode = prime * hashCode + ((getCpuOptions() == null) ? 0 : getCpuOptions().hashCode());
        hashCode = prime
                * hashCode
                + ((getCapacityReservationId() == null) ? 0 : getCapacityReservationId().hashCode());
        hashCode = prime
                * hashCode
                + ((getCapacityReservationSpecification() == null) ? 0
                        : getCapacityReservationSpecification().hashCode());
        hashCode = prime * hashCode
                + ((getHibernationOptions() == null) ? 0 : getHibernationOptions().hashCode());
        hashCode = prime * hashCode + ((getLicenses() == null) ? 0 : getLicenses().hashCode());
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

        if (obj instanceof Instance == false)
            return false;
        Instance other = (Instance) obj;

        if (other.getAmiLaunchIndex() == null ^ this.getAmiLaunchIndex() == null)
            return false;
        if (other.getAmiLaunchIndex() != null
                && other.getAmiLaunchIndex().equals(this.getAmiLaunchIndex()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getKernelId() == null ^ this.getKernelId() == null)
            return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getLaunchTime() == null ^ this.getLaunchTime() == null)
            return false;
        if (other.getLaunchTime() != null
                && other.getLaunchTime().equals(this.getLaunchTime()) == false)
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
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getPrivateDnsName() == null ^ this.getPrivateDnsName() == null)
            return false;
        if (other.getPrivateDnsName() != null
                && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null
                && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getProductCodes() == null ^ this.getProductCodes() == null)
            return false;
        if (other.getProductCodes() != null
                && other.getProductCodes().equals(this.getProductCodes()) == false)
            return false;
        if (other.getPublicDnsName() == null ^ this.getPublicDnsName() == null)
            return false;
        if (other.getPublicDnsName() != null
                && other.getPublicDnsName().equals(this.getPublicDnsName()) == false)
            return false;
        if (other.getPublicIpAddress() == null ^ this.getPublicIpAddress() == null)
            return false;
        if (other.getPublicIpAddress() != null
                && other.getPublicIpAddress().equals(this.getPublicIpAddress()) == false)
            return false;
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null)
            return false;
        if (other.getRamdiskId() != null
                && other.getRamdiskId().equals(this.getRamdiskId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateTransitionReason() == null ^ this.getStateTransitionReason() == null)
            return false;
        if (other.getStateTransitionReason() != null
                && other.getStateTransitionReason().equals(this.getStateTransitionReason()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null
                && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null
                && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null
                && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        if (other.getEnaSupport() == null ^ this.getEnaSupport() == null)
            return false;
        if (other.getEnaSupport() != null
                && other.getEnaSupport().equals(this.getEnaSupport()) == false)
            return false;
        if (other.getHypervisor() == null ^ this.getHypervisor() == null)
            return false;
        if (other.getHypervisor() != null
                && other.getHypervisor().equals(this.getHypervisor()) == false)
            return false;
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null)
            return false;
        if (other.getIamInstanceProfile() != null
                && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false)
            return false;
        if (other.getInstanceLifecycle() == null ^ this.getInstanceLifecycle() == null)
            return false;
        if (other.getInstanceLifecycle() != null
                && other.getInstanceLifecycle().equals(this.getInstanceLifecycle()) == false)
            return false;
        if (other.getElasticGpuAssociations() == null ^ this.getElasticGpuAssociations() == null)
            return false;
        if (other.getElasticGpuAssociations() != null
                && other.getElasticGpuAssociations().equals(this.getElasticGpuAssociations()) == false)
            return false;
        if (other.getElasticInferenceAcceleratorAssociations() == null
                ^ this.getElasticInferenceAcceleratorAssociations() == null)
            return false;
        if (other.getElasticInferenceAcceleratorAssociations() != null
                && other.getElasticInferenceAcceleratorAssociations().equals(
                        this.getElasticInferenceAcceleratorAssociations()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null
                && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
            return false;
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null
                && other.getOutpostArn().equals(this.getOutpostArn()) == false)
            return false;
        if (other.getRootDeviceName() == null ^ this.getRootDeviceName() == null)
            return false;
        if (other.getRootDeviceName() != null
                && other.getRootDeviceName().equals(this.getRootDeviceName()) == false)
            return false;
        if (other.getRootDeviceType() == null ^ this.getRootDeviceType() == null)
            return false;
        if (other.getRootDeviceType() != null
                && other.getRootDeviceType().equals(this.getRootDeviceType()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getSourceDestCheck() == null ^ this.getSourceDestCheck() == null)
            return false;
        if (other.getSourceDestCheck() != null
                && other.getSourceDestCheck().equals(this.getSourceDestCheck()) == false)
            return false;
        if (other.getSpotInstanceRequestId() == null ^ this.getSpotInstanceRequestId() == null)
            return false;
        if (other.getSpotInstanceRequestId() != null
                && other.getSpotInstanceRequestId().equals(this.getSpotInstanceRequestId()) == false)
            return false;
        if (other.getSriovNetSupport() == null ^ this.getSriovNetSupport() == null)
            return false;
        if (other.getSriovNetSupport() != null
                && other.getSriovNetSupport().equals(this.getSriovNetSupport()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null
                && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVirtualizationType() == null ^ this.getVirtualizationType() == null)
            return false;
        if (other.getVirtualizationType() != null
                && other.getVirtualizationType().equals(this.getVirtualizationType()) == false)
            return false;
        if (other.getCpuOptions() == null ^ this.getCpuOptions() == null)
            return false;
        if (other.getCpuOptions() != null
                && other.getCpuOptions().equals(this.getCpuOptions()) == false)
            return false;
        if (other.getCapacityReservationId() == null ^ this.getCapacityReservationId() == null)
            return false;
        if (other.getCapacityReservationId() != null
                && other.getCapacityReservationId().equals(this.getCapacityReservationId()) == false)
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
        if (other.getLicenses() == null ^ this.getLicenses() == null)
            return false;
        if (other.getLicenses() != null && other.getLicenses().equals(this.getLicenses()) == false)
            return false;
        if (other.getMetadataOptions() == null ^ this.getMetadataOptions() == null)
            return false;
        if (other.getMetadataOptions() != null
                && other.getMetadataOptions().equals(this.getMetadataOptions()) == false)
            return false;
        return true;
    }
}
