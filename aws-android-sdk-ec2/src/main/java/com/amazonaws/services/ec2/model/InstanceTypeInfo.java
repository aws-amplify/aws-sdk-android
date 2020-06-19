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
 * Describes the instance type.
 * </p>
 */
public class InstanceTypeInfo implements Serializable {
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
     * Indicates whether the instance type is a current generation.
     * </p>
     */
    private Boolean currentGeneration;

    /**
     * <p>
     * Indicates whether the instance type is eligible for the free tier.
     * </p>
     */
    private Boolean freeTierEligible;

    /**
     * <p>
     * Indicates whether the instance type is offered for spot or On-Demand.
     * </p>
     */
    private java.util.List<String> supportedUsageClasses;

    /**
     * <p>
     * Indicates the supported root device types.
     * </p>
     */
    private java.util.List<String> supportedRootDeviceTypes;

    /**
     * <p>
     * The supported virtualization types.
     * </p>
     */
    private java.util.List<String> supportedVirtualizationTypes;

    /**
     * <p>
     * Indicates whether the instance is bare metal.
     * </p>
     */
    private Boolean bareMetal;

    /**
     * <p>
     * Indicates the hypervisor used for the instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nitro, xen
     */
    private String hypervisor;

    /**
     * <p>
     * Describes the processor.
     * </p>
     */
    private ProcessorInfo processorInfo;

    /**
     * <p>
     * Describes the vCPU configurations for the instance type.
     * </p>
     */
    private VCpuInfo vCpuInfo;

    /**
     * <p>
     * Describes the memory for the instance type.
     * </p>
     */
    private MemoryInfo memoryInfo;

    /**
     * <p>
     * Indicates whether instance storage is supported.
     * </p>
     */
    private Boolean instanceStorageSupported;

    /**
     * <p>
     * Describes the disks for the instance type.
     * </p>
     */
    private InstanceStorageInfo instanceStorageInfo;

    /**
     * <p>
     * Describes the Amazon EBS settings for the instance type.
     * </p>
     */
    private EbsInfo ebsInfo;

    /**
     * <p>
     * Describes the network settings for the instance type.
     * </p>
     */
    private NetworkInfo networkInfo;

    /**
     * <p>
     * Describes the GPU accelerator settings for the instance type.
     * </p>
     */
    private GpuInfo gpuInfo;

    /**
     * <p>
     * Describes the FPGA accelerator settings for the instance type.
     * </p>
     */
    private FpgaInfo fpgaInfo;

    /**
     * <p>
     * Describes the placement group settings for the instance type.
     * </p>
     */
    private PlacementGroupInfo placementGroupInfo;

    /**
     * <p>
     * Describes the Inference accelerator settings for the instance type.
     * </p>
     */
    private InferenceAcceleratorInfo inferenceAcceleratorInfo;

    /**
     * <p>
     * Indicates whether On-Demand hibernation is supported.
     * </p>
     */
    private Boolean hibernationSupported;

    /**
     * <p>
     * Indicates whether the instance type is a burstable performance instance
     * type.
     * </p>
     */
    private Boolean burstablePerformanceSupported;

    /**
     * <p>
     * Indicates whether Dedicated Hosts are supported on the instance type.
     * </p>
     */
    private Boolean dedicatedHostsSupported;

    /**
     * <p>
     * Indicates whether auto recovery is supported.
     * </p>
     */
    private Boolean autoRecoverySupported;

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
     *            >Instance Types</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public InstanceTypeInfo withInstanceType(String instanceType) {
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
     *            >Instance Types</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public InstanceTypeInfo withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance type is a current generation.
     * </p>
     *
     * @return <p>
     *         Indicates whether the instance type is a current generation.
     *         </p>
     */
    public Boolean isCurrentGeneration() {
        return currentGeneration;
    }

    /**
     * <p>
     * Indicates whether the instance type is a current generation.
     * </p>
     *
     * @return <p>
     *         Indicates whether the instance type is a current generation.
     *         </p>
     */
    public Boolean getCurrentGeneration() {
        return currentGeneration;
    }

    /**
     * <p>
     * Indicates whether the instance type is a current generation.
     * </p>
     *
     * @param currentGeneration <p>
     *            Indicates whether the instance type is a current generation.
     *            </p>
     */
    public void setCurrentGeneration(Boolean currentGeneration) {
        this.currentGeneration = currentGeneration;
    }

    /**
     * <p>
     * Indicates whether the instance type is a current generation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentGeneration <p>
     *            Indicates whether the instance type is a current generation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withCurrentGeneration(Boolean currentGeneration) {
        this.currentGeneration = currentGeneration;
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance type is eligible for the free tier.
     * </p>
     *
     * @return <p>
     *         Indicates whether the instance type is eligible for the free
     *         tier.
     *         </p>
     */
    public Boolean isFreeTierEligible() {
        return freeTierEligible;
    }

    /**
     * <p>
     * Indicates whether the instance type is eligible for the free tier.
     * </p>
     *
     * @return <p>
     *         Indicates whether the instance type is eligible for the free
     *         tier.
     *         </p>
     */
    public Boolean getFreeTierEligible() {
        return freeTierEligible;
    }

    /**
     * <p>
     * Indicates whether the instance type is eligible for the free tier.
     * </p>
     *
     * @param freeTierEligible <p>
     *            Indicates whether the instance type is eligible for the free
     *            tier.
     *            </p>
     */
    public void setFreeTierEligible(Boolean freeTierEligible) {
        this.freeTierEligible = freeTierEligible;
    }

    /**
     * <p>
     * Indicates whether the instance type is eligible for the free tier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param freeTierEligible <p>
     *            Indicates whether the instance type is eligible for the free
     *            tier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withFreeTierEligible(Boolean freeTierEligible) {
        this.freeTierEligible = freeTierEligible;
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance type is offered for spot or On-Demand.
     * </p>
     *
     * @return <p>
     *         Indicates whether the instance type is offered for spot or
     *         On-Demand.
     *         </p>
     */
    public java.util.List<String> getSupportedUsageClasses() {
        return supportedUsageClasses;
    }

    /**
     * <p>
     * Indicates whether the instance type is offered for spot or On-Demand.
     * </p>
     *
     * @param supportedUsageClasses <p>
     *            Indicates whether the instance type is offered for spot or
     *            On-Demand.
     *            </p>
     */
    public void setSupportedUsageClasses(java.util.Collection<String> supportedUsageClasses) {
        if (supportedUsageClasses == null) {
            this.supportedUsageClasses = null;
            return;
        }

        this.supportedUsageClasses = new java.util.ArrayList<String>(supportedUsageClasses);
    }

    /**
     * <p>
     * Indicates whether the instance type is offered for spot or On-Demand.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedUsageClasses <p>
     *            Indicates whether the instance type is offered for spot or
     *            On-Demand.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withSupportedUsageClasses(String... supportedUsageClasses) {
        if (getSupportedUsageClasses() == null) {
            this.supportedUsageClasses = new java.util.ArrayList<String>(
                    supportedUsageClasses.length);
        }
        for (String value : supportedUsageClasses) {
            this.supportedUsageClasses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance type is offered for spot or On-Demand.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedUsageClasses <p>
     *            Indicates whether the instance type is offered for spot or
     *            On-Demand.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withSupportedUsageClasses(
            java.util.Collection<String> supportedUsageClasses) {
        setSupportedUsageClasses(supportedUsageClasses);
        return this;
    }

    /**
     * <p>
     * Indicates the supported root device types.
     * </p>
     *
     * @return <p>
     *         Indicates the supported root device types.
     *         </p>
     */
    public java.util.List<String> getSupportedRootDeviceTypes() {
        return supportedRootDeviceTypes;
    }

    /**
     * <p>
     * Indicates the supported root device types.
     * </p>
     *
     * @param supportedRootDeviceTypes <p>
     *            Indicates the supported root device types.
     *            </p>
     */
    public void setSupportedRootDeviceTypes(java.util.Collection<String> supportedRootDeviceTypes) {
        if (supportedRootDeviceTypes == null) {
            this.supportedRootDeviceTypes = null;
            return;
        }

        this.supportedRootDeviceTypes = new java.util.ArrayList<String>(supportedRootDeviceTypes);
    }

    /**
     * <p>
     * Indicates the supported root device types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedRootDeviceTypes <p>
     *            Indicates the supported root device types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withSupportedRootDeviceTypes(String... supportedRootDeviceTypes) {
        if (getSupportedRootDeviceTypes() == null) {
            this.supportedRootDeviceTypes = new java.util.ArrayList<String>(
                    supportedRootDeviceTypes.length);
        }
        for (String value : supportedRootDeviceTypes) {
            this.supportedRootDeviceTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Indicates the supported root device types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedRootDeviceTypes <p>
     *            Indicates the supported root device types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withSupportedRootDeviceTypes(
            java.util.Collection<String> supportedRootDeviceTypes) {
        setSupportedRootDeviceTypes(supportedRootDeviceTypes);
        return this;
    }

    /**
     * <p>
     * The supported virtualization types.
     * </p>
     *
     * @return <p>
     *         The supported virtualization types.
     *         </p>
     */
    public java.util.List<String> getSupportedVirtualizationTypes() {
        return supportedVirtualizationTypes;
    }

    /**
     * <p>
     * The supported virtualization types.
     * </p>
     *
     * @param supportedVirtualizationTypes <p>
     *            The supported virtualization types.
     *            </p>
     */
    public void setSupportedVirtualizationTypes(
            java.util.Collection<String> supportedVirtualizationTypes) {
        if (supportedVirtualizationTypes == null) {
            this.supportedVirtualizationTypes = null;
            return;
        }

        this.supportedVirtualizationTypes = new java.util.ArrayList<String>(
                supportedVirtualizationTypes);
    }

    /**
     * <p>
     * The supported virtualization types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedVirtualizationTypes <p>
     *            The supported virtualization types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withSupportedVirtualizationTypes(String... supportedVirtualizationTypes) {
        if (getSupportedVirtualizationTypes() == null) {
            this.supportedVirtualizationTypes = new java.util.ArrayList<String>(
                    supportedVirtualizationTypes.length);
        }
        for (String value : supportedVirtualizationTypes) {
            this.supportedVirtualizationTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The supported virtualization types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedVirtualizationTypes <p>
     *            The supported virtualization types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withSupportedVirtualizationTypes(
            java.util.Collection<String> supportedVirtualizationTypes) {
        setSupportedVirtualizationTypes(supportedVirtualizationTypes);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is bare metal.
     * </p>
     *
     * @return <p>
     *         Indicates whether the instance is bare metal.
     *         </p>
     */
    public Boolean isBareMetal() {
        return bareMetal;
    }

    /**
     * <p>
     * Indicates whether the instance is bare metal.
     * </p>
     *
     * @return <p>
     *         Indicates whether the instance is bare metal.
     *         </p>
     */
    public Boolean getBareMetal() {
        return bareMetal;
    }

    /**
     * <p>
     * Indicates whether the instance is bare metal.
     * </p>
     *
     * @param bareMetal <p>
     *            Indicates whether the instance is bare metal.
     *            </p>
     */
    public void setBareMetal(Boolean bareMetal) {
        this.bareMetal = bareMetal;
    }

    /**
     * <p>
     * Indicates whether the instance is bare metal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bareMetal <p>
     *            Indicates whether the instance is bare metal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withBareMetal(Boolean bareMetal) {
        this.bareMetal = bareMetal;
        return this;
    }

    /**
     * <p>
     * Indicates the hypervisor used for the instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nitro, xen
     *
     * @return <p>
     *         Indicates the hypervisor used for the instance type.
     *         </p>
     * @see InstanceTypeHypervisor
     */
    public String getHypervisor() {
        return hypervisor;
    }

    /**
     * <p>
     * Indicates the hypervisor used for the instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nitro, xen
     *
     * @param hypervisor <p>
     *            Indicates the hypervisor used for the instance type.
     *            </p>
     * @see InstanceTypeHypervisor
     */
    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }

    /**
     * <p>
     * Indicates the hypervisor used for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nitro, xen
     *
     * @param hypervisor <p>
     *            Indicates the hypervisor used for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceTypeHypervisor
     */
    public InstanceTypeInfo withHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
        return this;
    }

    /**
     * <p>
     * Indicates the hypervisor used for the instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nitro, xen
     *
     * @param hypervisor <p>
     *            Indicates the hypervisor used for the instance type.
     *            </p>
     * @see InstanceTypeHypervisor
     */
    public void setHypervisor(InstanceTypeHypervisor hypervisor) {
        this.hypervisor = hypervisor.toString();
    }

    /**
     * <p>
     * Indicates the hypervisor used for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nitro, xen
     *
     * @param hypervisor <p>
     *            Indicates the hypervisor used for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceTypeHypervisor
     */
    public InstanceTypeInfo withHypervisor(InstanceTypeHypervisor hypervisor) {
        this.hypervisor = hypervisor.toString();
        return this;
    }

    /**
     * <p>
     * Describes the processor.
     * </p>
     *
     * @return <p>
     *         Describes the processor.
     *         </p>
     */
    public ProcessorInfo getProcessorInfo() {
        return processorInfo;
    }

    /**
     * <p>
     * Describes the processor.
     * </p>
     *
     * @param processorInfo <p>
     *            Describes the processor.
     *            </p>
     */
    public void setProcessorInfo(ProcessorInfo processorInfo) {
        this.processorInfo = processorInfo;
    }

    /**
     * <p>
     * Describes the processor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processorInfo <p>
     *            Describes the processor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withProcessorInfo(ProcessorInfo processorInfo) {
        this.processorInfo = processorInfo;
        return this;
    }

    /**
     * <p>
     * Describes the vCPU configurations for the instance type.
     * </p>
     *
     * @return <p>
     *         Describes the vCPU configurations for the instance type.
     *         </p>
     */
    public VCpuInfo getVCpuInfo() {
        return vCpuInfo;
    }

    /**
     * <p>
     * Describes the vCPU configurations for the instance type.
     * </p>
     *
     * @param vCpuInfo <p>
     *            Describes the vCPU configurations for the instance type.
     *            </p>
     */
    public void setVCpuInfo(VCpuInfo vCpuInfo) {
        this.vCpuInfo = vCpuInfo;
    }

    /**
     * <p>
     * Describes the vCPU configurations for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vCpuInfo <p>
     *            Describes the vCPU configurations for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withVCpuInfo(VCpuInfo vCpuInfo) {
        this.vCpuInfo = vCpuInfo;
        return this;
    }

    /**
     * <p>
     * Describes the memory for the instance type.
     * </p>
     *
     * @return <p>
     *         Describes the memory for the instance type.
     *         </p>
     */
    public MemoryInfo getMemoryInfo() {
        return memoryInfo;
    }

    /**
     * <p>
     * Describes the memory for the instance type.
     * </p>
     *
     * @param memoryInfo <p>
     *            Describes the memory for the instance type.
     *            </p>
     */
    public void setMemoryInfo(MemoryInfo memoryInfo) {
        this.memoryInfo = memoryInfo;
    }

    /**
     * <p>
     * Describes the memory for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memoryInfo <p>
     *            Describes the memory for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withMemoryInfo(MemoryInfo memoryInfo) {
        this.memoryInfo = memoryInfo;
        return this;
    }

    /**
     * <p>
     * Indicates whether instance storage is supported.
     * </p>
     *
     * @return <p>
     *         Indicates whether instance storage is supported.
     *         </p>
     */
    public Boolean isInstanceStorageSupported() {
        return instanceStorageSupported;
    }

    /**
     * <p>
     * Indicates whether instance storage is supported.
     * </p>
     *
     * @return <p>
     *         Indicates whether instance storage is supported.
     *         </p>
     */
    public Boolean getInstanceStorageSupported() {
        return instanceStorageSupported;
    }

    /**
     * <p>
     * Indicates whether instance storage is supported.
     * </p>
     *
     * @param instanceStorageSupported <p>
     *            Indicates whether instance storage is supported.
     *            </p>
     */
    public void setInstanceStorageSupported(Boolean instanceStorageSupported) {
        this.instanceStorageSupported = instanceStorageSupported;
    }

    /**
     * <p>
     * Indicates whether instance storage is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceStorageSupported <p>
     *            Indicates whether instance storage is supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withInstanceStorageSupported(Boolean instanceStorageSupported) {
        this.instanceStorageSupported = instanceStorageSupported;
        return this;
    }

    /**
     * <p>
     * Describes the disks for the instance type.
     * </p>
     *
     * @return <p>
     *         Describes the disks for the instance type.
     *         </p>
     */
    public InstanceStorageInfo getInstanceStorageInfo() {
        return instanceStorageInfo;
    }

    /**
     * <p>
     * Describes the disks for the instance type.
     * </p>
     *
     * @param instanceStorageInfo <p>
     *            Describes the disks for the instance type.
     *            </p>
     */
    public void setInstanceStorageInfo(InstanceStorageInfo instanceStorageInfo) {
        this.instanceStorageInfo = instanceStorageInfo;
    }

    /**
     * <p>
     * Describes the disks for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceStorageInfo <p>
     *            Describes the disks for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withInstanceStorageInfo(InstanceStorageInfo instanceStorageInfo) {
        this.instanceStorageInfo = instanceStorageInfo;
        return this;
    }

    /**
     * <p>
     * Describes the Amazon EBS settings for the instance type.
     * </p>
     *
     * @return <p>
     *         Describes the Amazon EBS settings for the instance type.
     *         </p>
     */
    public EbsInfo getEbsInfo() {
        return ebsInfo;
    }

    /**
     * <p>
     * Describes the Amazon EBS settings for the instance type.
     * </p>
     *
     * @param ebsInfo <p>
     *            Describes the Amazon EBS settings for the instance type.
     *            </p>
     */
    public void setEbsInfo(EbsInfo ebsInfo) {
        this.ebsInfo = ebsInfo;
    }

    /**
     * <p>
     * Describes the Amazon EBS settings for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsInfo <p>
     *            Describes the Amazon EBS settings for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withEbsInfo(EbsInfo ebsInfo) {
        this.ebsInfo = ebsInfo;
        return this;
    }

    /**
     * <p>
     * Describes the network settings for the instance type.
     * </p>
     *
     * @return <p>
     *         Describes the network settings for the instance type.
     *         </p>
     */
    public NetworkInfo getNetworkInfo() {
        return networkInfo;
    }

    /**
     * <p>
     * Describes the network settings for the instance type.
     * </p>
     *
     * @param networkInfo <p>
     *            Describes the network settings for the instance type.
     *            </p>
     */
    public void setNetworkInfo(NetworkInfo networkInfo) {
        this.networkInfo = networkInfo;
    }

    /**
     * <p>
     * Describes the network settings for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInfo <p>
     *            Describes the network settings for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withNetworkInfo(NetworkInfo networkInfo) {
        this.networkInfo = networkInfo;
        return this;
    }

    /**
     * <p>
     * Describes the GPU accelerator settings for the instance type.
     * </p>
     *
     * @return <p>
     *         Describes the GPU accelerator settings for the instance type.
     *         </p>
     */
    public GpuInfo getGpuInfo() {
        return gpuInfo;
    }

    /**
     * <p>
     * Describes the GPU accelerator settings for the instance type.
     * </p>
     *
     * @param gpuInfo <p>
     *            Describes the GPU accelerator settings for the instance type.
     *            </p>
     */
    public void setGpuInfo(GpuInfo gpuInfo) {
        this.gpuInfo = gpuInfo;
    }

    /**
     * <p>
     * Describes the GPU accelerator settings for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gpuInfo <p>
     *            Describes the GPU accelerator settings for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withGpuInfo(GpuInfo gpuInfo) {
        this.gpuInfo = gpuInfo;
        return this;
    }

    /**
     * <p>
     * Describes the FPGA accelerator settings for the instance type.
     * </p>
     *
     * @return <p>
     *         Describes the FPGA accelerator settings for the instance type.
     *         </p>
     */
    public FpgaInfo getFpgaInfo() {
        return fpgaInfo;
    }

    /**
     * <p>
     * Describes the FPGA accelerator settings for the instance type.
     * </p>
     *
     * @param fpgaInfo <p>
     *            Describes the FPGA accelerator settings for the instance type.
     *            </p>
     */
    public void setFpgaInfo(FpgaInfo fpgaInfo) {
        this.fpgaInfo = fpgaInfo;
    }

    /**
     * <p>
     * Describes the FPGA accelerator settings for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fpgaInfo <p>
     *            Describes the FPGA accelerator settings for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withFpgaInfo(FpgaInfo fpgaInfo) {
        this.fpgaInfo = fpgaInfo;
        return this;
    }

    /**
     * <p>
     * Describes the placement group settings for the instance type.
     * </p>
     *
     * @return <p>
     *         Describes the placement group settings for the instance type.
     *         </p>
     */
    public PlacementGroupInfo getPlacementGroupInfo() {
        return placementGroupInfo;
    }

    /**
     * <p>
     * Describes the placement group settings for the instance type.
     * </p>
     *
     * @param placementGroupInfo <p>
     *            Describes the placement group settings for the instance type.
     *            </p>
     */
    public void setPlacementGroupInfo(PlacementGroupInfo placementGroupInfo) {
        this.placementGroupInfo = placementGroupInfo;
    }

    /**
     * <p>
     * Describes the placement group settings for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementGroupInfo <p>
     *            Describes the placement group settings for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withPlacementGroupInfo(PlacementGroupInfo placementGroupInfo) {
        this.placementGroupInfo = placementGroupInfo;
        return this;
    }

    /**
     * <p>
     * Describes the Inference accelerator settings for the instance type.
     * </p>
     *
     * @return <p>
     *         Describes the Inference accelerator settings for the instance
     *         type.
     *         </p>
     */
    public InferenceAcceleratorInfo getInferenceAcceleratorInfo() {
        return inferenceAcceleratorInfo;
    }

    /**
     * <p>
     * Describes the Inference accelerator settings for the instance type.
     * </p>
     *
     * @param inferenceAcceleratorInfo <p>
     *            Describes the Inference accelerator settings for the instance
     *            type.
     *            </p>
     */
    public void setInferenceAcceleratorInfo(InferenceAcceleratorInfo inferenceAcceleratorInfo) {
        this.inferenceAcceleratorInfo = inferenceAcceleratorInfo;
    }

    /**
     * <p>
     * Describes the Inference accelerator settings for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inferenceAcceleratorInfo <p>
     *            Describes the Inference accelerator settings for the instance
     *            type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withInferenceAcceleratorInfo(
            InferenceAcceleratorInfo inferenceAcceleratorInfo) {
        this.inferenceAcceleratorInfo = inferenceAcceleratorInfo;
        return this;
    }

    /**
     * <p>
     * Indicates whether On-Demand hibernation is supported.
     * </p>
     *
     * @return <p>
     *         Indicates whether On-Demand hibernation is supported.
     *         </p>
     */
    public Boolean isHibernationSupported() {
        return hibernationSupported;
    }

    /**
     * <p>
     * Indicates whether On-Demand hibernation is supported.
     * </p>
     *
     * @return <p>
     *         Indicates whether On-Demand hibernation is supported.
     *         </p>
     */
    public Boolean getHibernationSupported() {
        return hibernationSupported;
    }

    /**
     * <p>
     * Indicates whether On-Demand hibernation is supported.
     * </p>
     *
     * @param hibernationSupported <p>
     *            Indicates whether On-Demand hibernation is supported.
     *            </p>
     */
    public void setHibernationSupported(Boolean hibernationSupported) {
        this.hibernationSupported = hibernationSupported;
    }

    /**
     * <p>
     * Indicates whether On-Demand hibernation is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hibernationSupported <p>
     *            Indicates whether On-Demand hibernation is supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withHibernationSupported(Boolean hibernationSupported) {
        this.hibernationSupported = hibernationSupported;
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance type is a burstable performance instance
     * type.
     * </p>
     *
     * @return <p>
     *         Indicates whether the instance type is a burstable performance
     *         instance type.
     *         </p>
     */
    public Boolean isBurstablePerformanceSupported() {
        return burstablePerformanceSupported;
    }

    /**
     * <p>
     * Indicates whether the instance type is a burstable performance instance
     * type.
     * </p>
     *
     * @return <p>
     *         Indicates whether the instance type is a burstable performance
     *         instance type.
     *         </p>
     */
    public Boolean getBurstablePerformanceSupported() {
        return burstablePerformanceSupported;
    }

    /**
     * <p>
     * Indicates whether the instance type is a burstable performance instance
     * type.
     * </p>
     *
     * @param burstablePerformanceSupported <p>
     *            Indicates whether the instance type is a burstable performance
     *            instance type.
     *            </p>
     */
    public void setBurstablePerformanceSupported(Boolean burstablePerformanceSupported) {
        this.burstablePerformanceSupported = burstablePerformanceSupported;
    }

    /**
     * <p>
     * Indicates whether the instance type is a burstable performance instance
     * type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param burstablePerformanceSupported <p>
     *            Indicates whether the instance type is a burstable performance
     *            instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withBurstablePerformanceSupported(Boolean burstablePerformanceSupported) {
        this.burstablePerformanceSupported = burstablePerformanceSupported;
        return this;
    }

    /**
     * <p>
     * Indicates whether Dedicated Hosts are supported on the instance type.
     * </p>
     *
     * @return <p>
     *         Indicates whether Dedicated Hosts are supported on the instance
     *         type.
     *         </p>
     */
    public Boolean isDedicatedHostsSupported() {
        return dedicatedHostsSupported;
    }

    /**
     * <p>
     * Indicates whether Dedicated Hosts are supported on the instance type.
     * </p>
     *
     * @return <p>
     *         Indicates whether Dedicated Hosts are supported on the instance
     *         type.
     *         </p>
     */
    public Boolean getDedicatedHostsSupported() {
        return dedicatedHostsSupported;
    }

    /**
     * <p>
     * Indicates whether Dedicated Hosts are supported on the instance type.
     * </p>
     *
     * @param dedicatedHostsSupported <p>
     *            Indicates whether Dedicated Hosts are supported on the
     *            instance type.
     *            </p>
     */
    public void setDedicatedHostsSupported(Boolean dedicatedHostsSupported) {
        this.dedicatedHostsSupported = dedicatedHostsSupported;
    }

    /**
     * <p>
     * Indicates whether Dedicated Hosts are supported on the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dedicatedHostsSupported <p>
     *            Indicates whether Dedicated Hosts are supported on the
     *            instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withDedicatedHostsSupported(Boolean dedicatedHostsSupported) {
        this.dedicatedHostsSupported = dedicatedHostsSupported;
        return this;
    }

    /**
     * <p>
     * Indicates whether auto recovery is supported.
     * </p>
     *
     * @return <p>
     *         Indicates whether auto recovery is supported.
     *         </p>
     */
    public Boolean isAutoRecoverySupported() {
        return autoRecoverySupported;
    }

    /**
     * <p>
     * Indicates whether auto recovery is supported.
     * </p>
     *
     * @return <p>
     *         Indicates whether auto recovery is supported.
     *         </p>
     */
    public Boolean getAutoRecoverySupported() {
        return autoRecoverySupported;
    }

    /**
     * <p>
     * Indicates whether auto recovery is supported.
     * </p>
     *
     * @param autoRecoverySupported <p>
     *            Indicates whether auto recovery is supported.
     *            </p>
     */
    public void setAutoRecoverySupported(Boolean autoRecoverySupported) {
        this.autoRecoverySupported = autoRecoverySupported;
    }

    /**
     * <p>
     * Indicates whether auto recovery is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoRecoverySupported <p>
     *            Indicates whether auto recovery is supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTypeInfo withAutoRecoverySupported(Boolean autoRecoverySupported) {
        this.autoRecoverySupported = autoRecoverySupported;
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
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getCurrentGeneration() != null)
            sb.append("CurrentGeneration: " + getCurrentGeneration() + ",");
        if (getFreeTierEligible() != null)
            sb.append("FreeTierEligible: " + getFreeTierEligible() + ",");
        if (getSupportedUsageClasses() != null)
            sb.append("SupportedUsageClasses: " + getSupportedUsageClasses() + ",");
        if (getSupportedRootDeviceTypes() != null)
            sb.append("SupportedRootDeviceTypes: " + getSupportedRootDeviceTypes() + ",");
        if (getSupportedVirtualizationTypes() != null)
            sb.append("SupportedVirtualizationTypes: " + getSupportedVirtualizationTypes() + ",");
        if (getBareMetal() != null)
            sb.append("BareMetal: " + getBareMetal() + ",");
        if (getHypervisor() != null)
            sb.append("Hypervisor: " + getHypervisor() + ",");
        if (getProcessorInfo() != null)
            sb.append("ProcessorInfo: " + getProcessorInfo() + ",");
        if (getVCpuInfo() != null)
            sb.append("VCpuInfo: " + getVCpuInfo() + ",");
        if (getMemoryInfo() != null)
            sb.append("MemoryInfo: " + getMemoryInfo() + ",");
        if (getInstanceStorageSupported() != null)
            sb.append("InstanceStorageSupported: " + getInstanceStorageSupported() + ",");
        if (getInstanceStorageInfo() != null)
            sb.append("InstanceStorageInfo: " + getInstanceStorageInfo() + ",");
        if (getEbsInfo() != null)
            sb.append("EbsInfo: " + getEbsInfo() + ",");
        if (getNetworkInfo() != null)
            sb.append("NetworkInfo: " + getNetworkInfo() + ",");
        if (getGpuInfo() != null)
            sb.append("GpuInfo: " + getGpuInfo() + ",");
        if (getFpgaInfo() != null)
            sb.append("FpgaInfo: " + getFpgaInfo() + ",");
        if (getPlacementGroupInfo() != null)
            sb.append("PlacementGroupInfo: " + getPlacementGroupInfo() + ",");
        if (getInferenceAcceleratorInfo() != null)
            sb.append("InferenceAcceleratorInfo: " + getInferenceAcceleratorInfo() + ",");
        if (getHibernationSupported() != null)
            sb.append("HibernationSupported: " + getHibernationSupported() + ",");
        if (getBurstablePerformanceSupported() != null)
            sb.append("BurstablePerformanceSupported: " + getBurstablePerformanceSupported() + ",");
        if (getDedicatedHostsSupported() != null)
            sb.append("DedicatedHostsSupported: " + getDedicatedHostsSupported() + ",");
        if (getAutoRecoverySupported() != null)
            sb.append("AutoRecoverySupported: " + getAutoRecoverySupported());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentGeneration() == null) ? 0 : getCurrentGeneration().hashCode());
        hashCode = prime * hashCode
                + ((getFreeTierEligible() == null) ? 0 : getFreeTierEligible().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportedUsageClasses() == null) ? 0 : getSupportedUsageClasses().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportedRootDeviceTypes() == null) ? 0 : getSupportedRootDeviceTypes()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportedVirtualizationTypes() == null) ? 0
                        : getSupportedVirtualizationTypes().hashCode());
        hashCode = prime * hashCode + ((getBareMetal() == null) ? 0 : getBareMetal().hashCode());
        hashCode = prime * hashCode + ((getHypervisor() == null) ? 0 : getHypervisor().hashCode());
        hashCode = prime * hashCode
                + ((getProcessorInfo() == null) ? 0 : getProcessorInfo().hashCode());
        hashCode = prime * hashCode + ((getVCpuInfo() == null) ? 0 : getVCpuInfo().hashCode());
        hashCode = prime * hashCode + ((getMemoryInfo() == null) ? 0 : getMemoryInfo().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceStorageSupported() == null) ? 0 : getInstanceStorageSupported()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getInstanceStorageInfo() == null) ? 0 : getInstanceStorageInfo().hashCode());
        hashCode = prime * hashCode + ((getEbsInfo() == null) ? 0 : getEbsInfo().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInfo() == null) ? 0 : getNetworkInfo().hashCode());
        hashCode = prime * hashCode + ((getGpuInfo() == null) ? 0 : getGpuInfo().hashCode());
        hashCode = prime * hashCode + ((getFpgaInfo() == null) ? 0 : getFpgaInfo().hashCode());
        hashCode = prime * hashCode
                + ((getPlacementGroupInfo() == null) ? 0 : getPlacementGroupInfo().hashCode());
        hashCode = prime
                * hashCode
                + ((getInferenceAcceleratorInfo() == null) ? 0 : getInferenceAcceleratorInfo()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getHibernationSupported() == null) ? 0 : getHibernationSupported().hashCode());
        hashCode = prime
                * hashCode
                + ((getBurstablePerformanceSupported() == null) ? 0
                        : getBurstablePerformanceSupported().hashCode());
        hashCode = prime
                * hashCode
                + ((getDedicatedHostsSupported() == null) ? 0 : getDedicatedHostsSupported()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoRecoverySupported() == null) ? 0 : getAutoRecoverySupported().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceTypeInfo == false)
            return false;
        InstanceTypeInfo other = (InstanceTypeInfo) obj;

        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getCurrentGeneration() == null ^ this.getCurrentGeneration() == null)
            return false;
        if (other.getCurrentGeneration() != null
                && other.getCurrentGeneration().equals(this.getCurrentGeneration()) == false)
            return false;
        if (other.getFreeTierEligible() == null ^ this.getFreeTierEligible() == null)
            return false;
        if (other.getFreeTierEligible() != null
                && other.getFreeTierEligible().equals(this.getFreeTierEligible()) == false)
            return false;
        if (other.getSupportedUsageClasses() == null ^ this.getSupportedUsageClasses() == null)
            return false;
        if (other.getSupportedUsageClasses() != null
                && other.getSupportedUsageClasses().equals(this.getSupportedUsageClasses()) == false)
            return false;
        if (other.getSupportedRootDeviceTypes() == null
                ^ this.getSupportedRootDeviceTypes() == null)
            return false;
        if (other.getSupportedRootDeviceTypes() != null
                && other.getSupportedRootDeviceTypes().equals(this.getSupportedRootDeviceTypes()) == false)
            return false;
        if (other.getSupportedVirtualizationTypes() == null
                ^ this.getSupportedVirtualizationTypes() == null)
            return false;
        if (other.getSupportedVirtualizationTypes() != null
                && other.getSupportedVirtualizationTypes().equals(
                        this.getSupportedVirtualizationTypes()) == false)
            return false;
        if (other.getBareMetal() == null ^ this.getBareMetal() == null)
            return false;
        if (other.getBareMetal() != null
                && other.getBareMetal().equals(this.getBareMetal()) == false)
            return false;
        if (other.getHypervisor() == null ^ this.getHypervisor() == null)
            return false;
        if (other.getHypervisor() != null
                && other.getHypervisor().equals(this.getHypervisor()) == false)
            return false;
        if (other.getProcessorInfo() == null ^ this.getProcessorInfo() == null)
            return false;
        if (other.getProcessorInfo() != null
                && other.getProcessorInfo().equals(this.getProcessorInfo()) == false)
            return false;
        if (other.getVCpuInfo() == null ^ this.getVCpuInfo() == null)
            return false;
        if (other.getVCpuInfo() != null && other.getVCpuInfo().equals(this.getVCpuInfo()) == false)
            return false;
        if (other.getMemoryInfo() == null ^ this.getMemoryInfo() == null)
            return false;
        if (other.getMemoryInfo() != null
                && other.getMemoryInfo().equals(this.getMemoryInfo()) == false)
            return false;
        if (other.getInstanceStorageSupported() == null
                ^ this.getInstanceStorageSupported() == null)
            return false;
        if (other.getInstanceStorageSupported() != null
                && other.getInstanceStorageSupported().equals(this.getInstanceStorageSupported()) == false)
            return false;
        if (other.getInstanceStorageInfo() == null ^ this.getInstanceStorageInfo() == null)
            return false;
        if (other.getInstanceStorageInfo() != null
                && other.getInstanceStorageInfo().equals(this.getInstanceStorageInfo()) == false)
            return false;
        if (other.getEbsInfo() == null ^ this.getEbsInfo() == null)
            return false;
        if (other.getEbsInfo() != null && other.getEbsInfo().equals(this.getEbsInfo()) == false)
            return false;
        if (other.getNetworkInfo() == null ^ this.getNetworkInfo() == null)
            return false;
        if (other.getNetworkInfo() != null
                && other.getNetworkInfo().equals(this.getNetworkInfo()) == false)
            return false;
        if (other.getGpuInfo() == null ^ this.getGpuInfo() == null)
            return false;
        if (other.getGpuInfo() != null && other.getGpuInfo().equals(this.getGpuInfo()) == false)
            return false;
        if (other.getFpgaInfo() == null ^ this.getFpgaInfo() == null)
            return false;
        if (other.getFpgaInfo() != null && other.getFpgaInfo().equals(this.getFpgaInfo()) == false)
            return false;
        if (other.getPlacementGroupInfo() == null ^ this.getPlacementGroupInfo() == null)
            return false;
        if (other.getPlacementGroupInfo() != null
                && other.getPlacementGroupInfo().equals(this.getPlacementGroupInfo()) == false)
            return false;
        if (other.getInferenceAcceleratorInfo() == null
                ^ this.getInferenceAcceleratorInfo() == null)
            return false;
        if (other.getInferenceAcceleratorInfo() != null
                && other.getInferenceAcceleratorInfo().equals(this.getInferenceAcceleratorInfo()) == false)
            return false;
        if (other.getHibernationSupported() == null ^ this.getHibernationSupported() == null)
            return false;
        if (other.getHibernationSupported() != null
                && other.getHibernationSupported().equals(this.getHibernationSupported()) == false)
            return false;
        if (other.getBurstablePerformanceSupported() == null
                ^ this.getBurstablePerformanceSupported() == null)
            return false;
        if (other.getBurstablePerformanceSupported() != null
                && other.getBurstablePerformanceSupported().equals(
                        this.getBurstablePerformanceSupported()) == false)
            return false;
        if (other.getDedicatedHostsSupported() == null ^ this.getDedicatedHostsSupported() == null)
            return false;
        if (other.getDedicatedHostsSupported() != null
                && other.getDedicatedHostsSupported().equals(this.getDedicatedHostsSupported()) == false)
            return false;
        if (other.getAutoRecoverySupported() == null ^ this.getAutoRecoverySupported() == null)
            return false;
        if (other.getAutoRecoverySupported() != null
                && other.getAutoRecoverySupported().equals(this.getAutoRecoverySupported()) == false)
            return false;
        return true;
    }
}
