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
 * Describes an instance attribute.
 * </p>
 */
public class DescribeInstanceAttributeResult implements Serializable {
    /**
     * <p>
     * The security groups associated with the instance.
     * </p>
     */
    private java.util.List<GroupIdentifier> groups;

    /**
     * <p>
     * The block device mapping of the instance.
     * </p>
     */
    private java.util.List<InstanceBlockDeviceMapping> blockDeviceMappings;

    /**
     * <p>
     * If the value is <code>true</code>, you can't terminate the instance
     * through the Amazon EC2 console, CLI, or API; otherwise, you can.
     * </p>
     */
    private AttributeBooleanValue disableApiTermination;

    /**
     * <p>
     * Indicates whether enhanced networking with ENA is enabled.
     * </p>
     */
    private AttributeBooleanValue enaSupport;

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O.
     * </p>
     */
    private AttributeBooleanValue ebsOptimized;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     */
    private AttributeValue instanceInitiatedShutdownBehavior;

    /**
     * <p>
     * The instance type.
     * </p>
     */
    private AttributeValue instanceType;

    /**
     * <p>
     * The kernel ID.
     * </p>
     */
    private AttributeValue kernelId;

    /**
     * <p>
     * A list of product codes.
     * </p>
     */
    private java.util.List<ProductCode> productCodes;

    /**
     * <p>
     * The RAM disk ID.
     * </p>
     */
    private AttributeValue ramdiskId;

    /**
     * <p>
     * The device name of the root device volume (for example,
     * <code>/dev/sda1</code>).
     * </p>
     */
    private AttributeValue rootDeviceName;

    /**
     * <p>
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code>
     * means that checking is disabled. This value must be <code>false</code>
     * for a NAT instance to perform NAT.
     * </p>
     */
    private AttributeBooleanValue sourceDestCheck;

    /**
     * <p>
     * Indicates whether enhanced networking with the Intel 82599 Virtual
     * Function interface is enabled.
     * </p>
     */
    private AttributeValue sriovNetSupport;

    /**
     * <p>
     * The user data.
     * </p>
     */
    private AttributeValue userData;

    /**
     * <p>
     * The security groups associated with the instance.
     * </p>
     *
     * @return <p>
     *         The security groups associated with the instance.
     *         </p>
     */
    public java.util.List<GroupIdentifier> getGroups() {
        return groups;
    }

    /**
     * <p>
     * The security groups associated with the instance.
     * </p>
     *
     * @param groups <p>
     *            The security groups associated with the instance.
     *            </p>
     */
    public void setGroups(java.util.Collection<GroupIdentifier> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<GroupIdentifier>(groups);
    }

    /**
     * <p>
     * The security groups associated with the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            The security groups associated with the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceAttributeResult withGroups(GroupIdentifier... groups) {
        if (getGroups() == null) {
            this.groups = new java.util.ArrayList<GroupIdentifier>(groups.length);
        }
        for (GroupIdentifier value : groups) {
            this.groups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The security groups associated with the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            The security groups associated with the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceAttributeResult withGroups(java.util.Collection<GroupIdentifier> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The block device mapping of the instance.
     * </p>
     *
     * @return <p>
     *         The block device mapping of the instance.
     *         </p>
     */
    public java.util.List<InstanceBlockDeviceMapping> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * <p>
     * The block device mapping of the instance.
     * </p>
     *
     * @param blockDeviceMappings <p>
     *            The block device mapping of the instance.
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
     * The block device mapping of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            The block device mapping of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceAttributeResult withBlockDeviceMappings(
            InstanceBlockDeviceMapping... blockDeviceMappings) {
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
     * The block device mapping of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            The block device mapping of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceAttributeResult withBlockDeviceMappings(
            java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * If the value is <code>true</code>, you can't terminate the instance
     * through the Amazon EC2 console, CLI, or API; otherwise, you can.
     * </p>
     *
     * @return <p>
     *         If the value is <code>true</code>, you can't terminate the
     *         instance through the Amazon EC2 console, CLI, or API; otherwise,
     *         you can.
     *         </p>
     */
    public AttributeBooleanValue getDisableApiTermination() {
        return disableApiTermination;
    }

    /**
     * <p>
     * If the value is <code>true</code>, you can't terminate the instance
     * through the Amazon EC2 console, CLI, or API; otherwise, you can.
     * </p>
     *
     * @param disableApiTermination <p>
     *            If the value is <code>true</code>, you can't terminate the
     *            instance through the Amazon EC2 console, CLI, or API;
     *            otherwise, you can.
     *            </p>
     */
    public void setDisableApiTermination(AttributeBooleanValue disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }

    /**
     * <p>
     * If the value is <code>true</code>, you can't terminate the instance
     * through the Amazon EC2 console, CLI, or API; otherwise, you can.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disableApiTermination <p>
     *            If the value is <code>true</code>, you can't terminate the
     *            instance through the Amazon EC2 console, CLI, or API;
     *            otherwise, you can.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceAttributeResult withDisableApiTermination(
            AttributeBooleanValue disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
        return this;
    }

    /**
     * <p>
     * Indicates whether enhanced networking with ENA is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether enhanced networking with ENA is enabled.
     *         </p>
     */
    public AttributeBooleanValue getEnaSupport() {
        return enaSupport;
    }

    /**
     * <p>
     * Indicates whether enhanced networking with ENA is enabled.
     * </p>
     *
     * @param enaSupport <p>
     *            Indicates whether enhanced networking with ENA is enabled.
     *            </p>
     */
    public void setEnaSupport(AttributeBooleanValue enaSupport) {
        this.enaSupport = enaSupport;
    }

    /**
     * <p>
     * Indicates whether enhanced networking with ENA is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enaSupport <p>
     *            Indicates whether enhanced networking with ENA is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceAttributeResult withEnaSupport(AttributeBooleanValue enaSupport) {
        this.enaSupport = enaSupport;
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O.
     * </p>
     *
     * @return <p>
     *         Indicates whether the instance is optimized for Amazon EBS I/O.
     *         </p>
     */
    public AttributeBooleanValue getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O.
     * </p>
     *
     * @param ebsOptimized <p>
     *            Indicates whether the instance is optimized for Amazon EBS
     *            I/O.
     *            </p>
     */
    public void setEbsOptimized(AttributeBooleanValue ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsOptimized <p>
     *            Indicates whether the instance is optimized for Amazon EBS
     *            I/O.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceAttributeResult withEbsOptimized(AttributeBooleanValue ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
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
    public DescribeInstanceAttributeResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     *
     * @return <p>
     *         Indicates whether an instance stops or terminates when you
     *         initiate shutdown from the instance (using the operating system
     *         command for system shutdown).
     *         </p>
     */
    public AttributeValue getInstanceInitiatedShutdownBehavior() {
        return instanceInitiatedShutdownBehavior;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     *
     * @param instanceInitiatedShutdownBehavior <p>
     *            Indicates whether an instance stops or terminates when you
     *            initiate shutdown from the instance (using the operating
     *            system command for system shutdown).
     *            </p>
     */
    public void setInstanceInitiatedShutdownBehavior(
            AttributeValue instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceInitiatedShutdownBehavior <p>
     *            Indicates whether an instance stops or terminates when you
     *            initiate shutdown from the instance (using the operating
     *            system command for system shutdown).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceAttributeResult withInstanceInitiatedShutdownBehavior(
            AttributeValue instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
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
    public AttributeValue getInstanceType() {
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
    public void setInstanceType(AttributeValue instanceType) {
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
    public DescribeInstanceAttributeResult withInstanceType(AttributeValue instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The kernel ID.
     * </p>
     *
     * @return <p>
     *         The kernel ID.
     *         </p>
     */
    public AttributeValue getKernelId() {
        return kernelId;
    }

    /**
     * <p>
     * The kernel ID.
     * </p>
     *
     * @param kernelId <p>
     *            The kernel ID.
     *            </p>
     */
    public void setKernelId(AttributeValue kernelId) {
        this.kernelId = kernelId;
    }

    /**
     * <p>
     * The kernel ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kernelId <p>
     *            The kernel ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceAttributeResult withKernelId(AttributeValue kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * <p>
     * A list of product codes.
     * </p>
     *
     * @return <p>
     *         A list of product codes.
     *         </p>
     */
    public java.util.List<ProductCode> getProductCodes() {
        return productCodes;
    }

    /**
     * <p>
     * A list of product codes.
     * </p>
     *
     * @param productCodes <p>
     *            A list of product codes.
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
     * A list of product codes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCodes <p>
     *            A list of product codes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceAttributeResult withProductCodes(ProductCode... productCodes) {
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
     * A list of product codes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCodes <p>
     *            A list of product codes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceAttributeResult withProductCodes(
            java.util.Collection<ProductCode> productCodes) {
        setProductCodes(productCodes);
        return this;
    }

    /**
     * <p>
     * The RAM disk ID.
     * </p>
     *
     * @return <p>
     *         The RAM disk ID.
     *         </p>
     */
    public AttributeValue getRamdiskId() {
        return ramdiskId;
    }

    /**
     * <p>
     * The RAM disk ID.
     * </p>
     *
     * @param ramdiskId <p>
     *            The RAM disk ID.
     *            </p>
     */
    public void setRamdiskId(AttributeValue ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    /**
     * <p>
     * The RAM disk ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ramdiskId <p>
     *            The RAM disk ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceAttributeResult withRamdiskId(AttributeValue ramdiskId) {
        this.ramdiskId = ramdiskId;
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
    public AttributeValue getRootDeviceName() {
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
    public void setRootDeviceName(AttributeValue rootDeviceName) {
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
    public DescribeInstanceAttributeResult withRootDeviceName(AttributeValue rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
        return this;
    }

    /**
     * <p>
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code>
     * means that checking is disabled. This value must be <code>false</code>
     * for a NAT instance to perform NAT.
     * </p>
     *
     * @return <p>
     *         Indicates whether source/destination checking is enabled. A value
     *         of <code>true</code> means that checking is enabled, and
     *         <code>false</code> means that checking is disabled. This value
     *         must be <code>false</code> for a NAT instance to perform NAT.
     *         </p>
     */
    public AttributeBooleanValue getSourceDestCheck() {
        return sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code>
     * means that checking is disabled. This value must be <code>false</code>
     * for a NAT instance to perform NAT.
     * </p>
     *
     * @param sourceDestCheck <p>
     *            Indicates whether source/destination checking is enabled. A
     *            value of <code>true</code> means that checking is enabled, and
     *            <code>false</code> means that checking is disabled. This value
     *            must be <code>false</code> for a NAT instance to perform NAT.
     *            </p>
     */
    public void setSourceDestCheck(AttributeBooleanValue sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code>
     * means that checking is disabled. This value must be <code>false</code>
     * for a NAT instance to perform NAT.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceDestCheck <p>
     *            Indicates whether source/destination checking is enabled. A
     *            value of <code>true</code> means that checking is enabled, and
     *            <code>false</code> means that checking is disabled. This value
     *            must be <code>false</code> for a NAT instance to perform NAT.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceAttributeResult withSourceDestCheck(AttributeBooleanValue sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
        return this;
    }

    /**
     * <p>
     * Indicates whether enhanced networking with the Intel 82599 Virtual
     * Function interface is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether enhanced networking with the Intel 82599
     *         Virtual Function interface is enabled.
     *         </p>
     */
    public AttributeValue getSriovNetSupport() {
        return sriovNetSupport;
    }

    /**
     * <p>
     * Indicates whether enhanced networking with the Intel 82599 Virtual
     * Function interface is enabled.
     * </p>
     *
     * @param sriovNetSupport <p>
     *            Indicates whether enhanced networking with the Intel 82599
     *            Virtual Function interface is enabled.
     *            </p>
     */
    public void setSriovNetSupport(AttributeValue sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }

    /**
     * <p>
     * Indicates whether enhanced networking with the Intel 82599 Virtual
     * Function interface is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sriovNetSupport <p>
     *            Indicates whether enhanced networking with the Intel 82599
     *            Virtual Function interface is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceAttributeResult withSriovNetSupport(AttributeValue sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
        return this;
    }

    /**
     * <p>
     * The user data.
     * </p>
     *
     * @return <p>
     *         The user data.
     *         </p>
     */
    public AttributeValue getUserData() {
        return userData;
    }

    /**
     * <p>
     * The user data.
     * </p>
     *
     * @param userData <p>
     *            The user data.
     *            </p>
     */
    public void setUserData(AttributeValue userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * The user data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userData <p>
     *            The user data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceAttributeResult withUserData(AttributeValue userData) {
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
        if (getGroups() != null)
            sb.append("Groups: " + getGroups() + ",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getDisableApiTermination() != null)
            sb.append("DisableApiTermination: " + getDisableApiTermination() + ",");
        if (getEnaSupport() != null)
            sb.append("EnaSupport: " + getEnaSupport() + ",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: " + getEbsOptimized() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getInstanceInitiatedShutdownBehavior() != null)
            sb.append("InstanceInitiatedShutdownBehavior: "
                    + getInstanceInitiatedShutdownBehavior() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getKernelId() != null)
            sb.append("KernelId: " + getKernelId() + ",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: " + getProductCodes() + ",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getRootDeviceName() != null)
            sb.append("RootDeviceName: " + getRootDeviceName() + ",");
        if (getSourceDestCheck() != null)
            sb.append("SourceDestCheck: " + getSourceDestCheck() + ",");
        if (getSriovNetSupport() != null)
            sb.append("SriovNetSupport: " + getSriovNetSupport() + ",");
        if (getUserData() != null)
            sb.append("UserData: " + getUserData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode
                + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime
                * hashCode
                + ((getDisableApiTermination() == null) ? 0 : getDisableApiTermination().hashCode());
        hashCode = prime * hashCode + ((getEnaSupport() == null) ? 0 : getEnaSupport().hashCode());
        hashCode = prime * hashCode
                + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceInitiatedShutdownBehavior() == null) ? 0
                        : getInstanceInitiatedShutdownBehavior().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode
                + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode());
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode
                + ((getRootDeviceName() == null) ? 0 : getRootDeviceName().hashCode());
        hashCode = prime * hashCode
                + ((getSourceDestCheck() == null) ? 0 : getSourceDestCheck().hashCode());
        hashCode = prime * hashCode
                + ((getSriovNetSupport() == null) ? 0 : getSriovNetSupport().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceAttributeResult == false)
            return false;
        DescribeInstanceAttributeResult other = (DescribeInstanceAttributeResult) obj;

        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null
                && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getDisableApiTermination() == null ^ this.getDisableApiTermination() == null)
            return false;
        if (other.getDisableApiTermination() != null
                && other.getDisableApiTermination().equals(this.getDisableApiTermination()) == false)
            return false;
        if (other.getEnaSupport() == null ^ this.getEnaSupport() == null)
            return false;
        if (other.getEnaSupport() != null
                && other.getEnaSupport().equals(this.getEnaSupport()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null
                && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceInitiatedShutdownBehavior() == null
                ^ this.getInstanceInitiatedShutdownBehavior() == null)
            return false;
        if (other.getInstanceInitiatedShutdownBehavior() != null
                && other.getInstanceInitiatedShutdownBehavior().equals(
                        this.getInstanceInitiatedShutdownBehavior()) == false)
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
        if (other.getProductCodes() == null ^ this.getProductCodes() == null)
            return false;
        if (other.getProductCodes() != null
                && other.getProductCodes().equals(this.getProductCodes()) == false)
            return false;
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null)
            return false;
        if (other.getRamdiskId() != null
                && other.getRamdiskId().equals(this.getRamdiskId()) == false)
            return false;
        if (other.getRootDeviceName() == null ^ this.getRootDeviceName() == null)
            return false;
        if (other.getRootDeviceName() != null
                && other.getRootDeviceName().equals(this.getRootDeviceName()) == false)
            return false;
        if (other.getSourceDestCheck() == null ^ this.getSourceDestCheck() == null)
            return false;
        if (other.getSourceDestCheck() != null
                && other.getSourceDestCheck().equals(this.getSourceDestCheck()) == false)
            return false;
        if (other.getSriovNetSupport() == null ^ this.getSriovNetSupport() == null)
            return false;
        if (other.getSriovNetSupport() != null
                && other.getSriovNetSupport().equals(this.getSriovNetSupport()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        return true;
    }
}
