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
 * Describes the launch specification for a Scheduled Instance.
 * </p>
 * <p>
 * If you are launching the Scheduled Instance in EC2-VPC, you must specify the
 * ID of the subnet. You can specify the subnet using either
 * <code>SubnetId</code> or <code>NetworkInterface</code>.
 * </p>
 */
public class ScheduledInstancesLaunchSpecification implements Serializable {
    /**
     * <p>
     * The block device mapping entries.
     * </p>
     */
    private java.util.List<ScheduledInstancesBlockDeviceMapping> blockDeviceMappings;

    /**
     * <p>
     * Indicates whether the instances are optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal EBS I/O performance. This
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
    private ScheduledInstancesIamInstanceProfile iamInstanceProfile;

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI).
     * </p>
     */
    private String imageId;

    /**
     * <p>
     * The instance type.
     * </p>
     */
    private String instanceType;

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     */
    private String kernelId;

    /**
     * <p>
     * The name of the key pair.
     * </p>
     */
    private String keyName;

    /**
     * <p>
     * Enable or disable monitoring for the instances.
     * </p>
     */
    private ScheduledInstancesMonitoring monitoring;

    /**
     * <p>
     * The network interfaces.
     * </p>
     */
    private java.util.List<ScheduledInstancesNetworkInterface> networkInterfaces;

    /**
     * <p>
     * The placement information.
     * </p>
     */
    private ScheduledInstancesPlacement placement;

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     */
    private String ramdiskId;

    /**
     * <p>
     * The IDs of the security groups.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * The ID of the subnet in which to launch the instances.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * The base64-encoded MIME user data.
     * </p>
     */
    private String userData;

    /**
     * <p>
     * The block device mapping entries.
     * </p>
     *
     * @return <p>
     *         The block device mapping entries.
     *         </p>
     */
    public java.util.List<ScheduledInstancesBlockDeviceMapping> getBlockDeviceMappings() {
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
    public void setBlockDeviceMappings(
            java.util.Collection<ScheduledInstancesBlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new java.util.ArrayList<ScheduledInstancesBlockDeviceMapping>(
                blockDeviceMappings);
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
    public ScheduledInstancesLaunchSpecification withBlockDeviceMappings(
            ScheduledInstancesBlockDeviceMapping... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) {
            this.blockDeviceMappings = new java.util.ArrayList<ScheduledInstancesBlockDeviceMapping>(
                    blockDeviceMappings.length);
        }
        for (ScheduledInstancesBlockDeviceMapping value : blockDeviceMappings) {
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
    public ScheduledInstancesLaunchSpecification withBlockDeviceMappings(
            java.util.Collection<ScheduledInstancesBlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instances are optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS-optimized instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         Indicates whether the instances are optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal EBS I/O
     *         performance. This optimization isn't available with all instance
     *         types. Additional usage charges apply when using an EBS-optimized
     *         instance.
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
     * Indicates whether the instances are optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS-optimized instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         Indicates whether the instances are optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal EBS I/O
     *         performance. This optimization isn't available with all instance
     *         types. Additional usage charges apply when using an EBS-optimized
     *         instance.
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
     * Indicates whether the instances are optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS-optimized instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @param ebsOptimized <p>
     *            Indicates whether the instances are optimized for EBS I/O.
     *            This optimization provides dedicated throughput to Amazon EBS
     *            and an optimized configuration stack to provide optimal EBS
     *            I/O performance. This optimization isn't available with all
     *            instance types. Additional usage charges apply when using an
     *            EBS-optimized instance.
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
     * Indicates whether the instances are optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal EBS I/O performance. This
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
     *            Indicates whether the instances are optimized for EBS I/O.
     *            This optimization provides dedicated throughput to Amazon EBS
     *            and an optimized configuration stack to provide optimal EBS
     *            I/O performance. This optimization isn't available with all
     *            instance types. Additional usage charges apply when using an
     *            EBS-optimized instance.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesLaunchSpecification withEbsOptimized(Boolean ebsOptimized) {
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
    public ScheduledInstancesIamInstanceProfile getIamInstanceProfile() {
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
    public void setIamInstanceProfile(ScheduledInstancesIamInstanceProfile iamInstanceProfile) {
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
    public ScheduledInstancesLaunchSpecification withIamInstanceProfile(
            ScheduledInstancesIamInstanceProfile iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI).
     * </p>
     *
     * @return <p>
     *         The ID of the Amazon Machine Image (AMI).
     *         </p>
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI).
     * </p>
     *
     * @param imageId <p>
     *            The ID of the Amazon Machine Image (AMI).
     *            </p>
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageId <p>
     *            The ID of the Amazon Machine Image (AMI).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesLaunchSpecification withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     *
     * @return <p>
     *         The instance type.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     *
     * @param instanceType <p>
     *            The instance type.
     *            </p>
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
     *
     * @param instanceType <p>
     *            The instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesLaunchSpecification withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     *
     * @return <p>
     *         The ID of the kernel.
     *         </p>
     */
    public String getKernelId() {
        return kernelId;
    }

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     *
     * @param kernelId <p>
     *            The ID of the kernel.
     *            </p>
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kernelId <p>
     *            The ID of the kernel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesLaunchSpecification withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     *
     * @return <p>
     *         The name of the key pair.
     *         </p>
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     *
     * @param keyName <p>
     *            The name of the key pair.
     *            </p>
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyName <p>
     *            The name of the key pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesLaunchSpecification withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * <p>
     * Enable or disable monitoring for the instances.
     * </p>
     *
     * @return <p>
     *         Enable or disable monitoring for the instances.
     *         </p>
     */
    public ScheduledInstancesMonitoring getMonitoring() {
        return monitoring;
    }

    /**
     * <p>
     * Enable or disable monitoring for the instances.
     * </p>
     *
     * @param monitoring <p>
     *            Enable or disable monitoring for the instances.
     *            </p>
     */
    public void setMonitoring(ScheduledInstancesMonitoring monitoring) {
        this.monitoring = monitoring;
    }

    /**
     * <p>
     * Enable or disable monitoring for the instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoring <p>
     *            Enable or disable monitoring for the instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesLaunchSpecification withMonitoring(
            ScheduledInstancesMonitoring monitoring) {
        this.monitoring = monitoring;
        return this;
    }

    /**
     * <p>
     * The network interfaces.
     * </p>
     *
     * @return <p>
     *         The network interfaces.
     *         </p>
     */
    public java.util.List<ScheduledInstancesNetworkInterface> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * <p>
     * The network interfaces.
     * </p>
     *
     * @param networkInterfaces <p>
     *            The network interfaces.
     *            </p>
     */
    public void setNetworkInterfaces(
            java.util.Collection<ScheduledInstancesNetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new java.util.ArrayList<ScheduledInstancesNetworkInterface>(
                networkInterfaces);
    }

    /**
     * <p>
     * The network interfaces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaces <p>
     *            The network interfaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesLaunchSpecification withNetworkInterfaces(
            ScheduledInstancesNetworkInterface... networkInterfaces) {
        if (getNetworkInterfaces() == null) {
            this.networkInterfaces = new java.util.ArrayList<ScheduledInstancesNetworkInterface>(
                    networkInterfaces.length);
        }
        for (ScheduledInstancesNetworkInterface value : networkInterfaces) {
            this.networkInterfaces.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The network interfaces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaces <p>
     *            The network interfaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesLaunchSpecification withNetworkInterfaces(
            java.util.Collection<ScheduledInstancesNetworkInterface> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
        return this;
    }

    /**
     * <p>
     * The placement information.
     * </p>
     *
     * @return <p>
     *         The placement information.
     *         </p>
     */
    public ScheduledInstancesPlacement getPlacement() {
        return placement;
    }

    /**
     * <p>
     * The placement information.
     * </p>
     *
     * @param placement <p>
     *            The placement information.
     *            </p>
     */
    public void setPlacement(ScheduledInstancesPlacement placement) {
        this.placement = placement;
    }

    /**
     * <p>
     * The placement information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placement <p>
     *            The placement information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesLaunchSpecification withPlacement(ScheduledInstancesPlacement placement) {
        this.placement = placement;
        return this;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     *
     * @return <p>
     *         The ID of the RAM disk.
     *         </p>
     */
    public String getRamdiskId() {
        return ramdiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     *
     * @param ramdiskId <p>
     *            The ID of the RAM disk.
     *            </p>
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ramdiskId <p>
     *            The ID of the RAM disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesLaunchSpecification withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups.
     * </p>
     *
     * @return <p>
     *         The IDs of the security groups.
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The IDs of the security groups.
     * </p>
     *
     * @param securityGroupIds <p>
     *            The IDs of the security groups.
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
     * The IDs of the security groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The IDs of the security groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesLaunchSpecification withSecurityGroupIds(String... securityGroupIds) {
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
     * The IDs of the security groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The IDs of the security groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesLaunchSpecification withSecurityGroupIds(
            java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet in which to launch the instances.
     * </p>
     *
     * @return <p>
     *         The ID of the subnet in which to launch the instances.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in which to launch the instances.
     * </p>
     *
     * @param subnetId <p>
     *            The ID of the subnet in which to launch the instances.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in which to launch the instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetId <p>
     *            The ID of the subnet in which to launch the instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesLaunchSpecification withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * <p>
     * The base64-encoded MIME user data.
     * </p>
     *
     * @return <p>
     *         The base64-encoded MIME user data.
     *         </p>
     */
    public String getUserData() {
        return userData;
    }

    /**
     * <p>
     * The base64-encoded MIME user data.
     * </p>
     *
     * @param userData <p>
     *            The base64-encoded MIME user data.
     *            </p>
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * The base64-encoded MIME user data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userData <p>
     *            The base64-encoded MIME user data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesLaunchSpecification withUserData(String userData) {
        this.userData = userData;
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
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: " + getEbsOptimized() + ",");
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getKernelId() != null)
            sb.append("KernelId: " + getKernelId() + ",");
        if (getKeyName() != null)
            sb.append("KeyName: " + getKeyName() + ",");
        if (getMonitoring() != null)
            sb.append("Monitoring: " + getMonitoring() + ",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: " + getNetworkInterfaces() + ",");
        if (getPlacement() != null)
            sb.append("Placement: " + getPlacement() + ",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getUserData() != null)
            sb.append("UserData: " + getUserData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode
                + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode
                + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getMonitoring() == null) ? 0 : getMonitoring().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledInstancesLaunchSpecification == false)
            return false;
        ScheduledInstancesLaunchSpecification other = (ScheduledInstancesLaunchSpecification) obj;

        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null
                && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
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
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
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
        if (other.getMonitoring() == null ^ this.getMonitoring() == null)
            return false;
        if (other.getMonitoring() != null
                && other.getMonitoring().equals(this.getMonitoring()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null
                && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
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
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        return true;
    }
}
