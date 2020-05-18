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
 * Modifies the specified attribute of the specified instance. You can specify
 * only one attribute at a time.
 * </p>
 * <p>
 * <b>Note: </b>Using this action to change the security groups associated with
 * an elastic network interface (ENI) attached to an instance in a VPC can
 * result in an error if the instance has more than one ENI. To change the
 * security groups associated with an ENI attached to an instance that has
 * multiple ENIs, we recommend that you use the
 * <a>ModifyNetworkInterfaceAttribute</a> action.
 * </p>
 * <p>
 * To modify some attributes, the instance must be stopped. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_ChangingAttributesWhileInstanceStopped.html"
 * >Modifying Attributes of a Stopped Instance</a> in the <i>Amazon Elastic
 * Compute Cloud User Guide</i>.
 * </p>
 */
public class ModifyInstanceAttributeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies whether source/destination checking is enabled. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code>
     * means that checking is disabled. This value must be <code>false</code>
     * for a NAT instance to perform NAT.
     * </p>
     */
    private AttributeBooleanValue sourceDestCheck;

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData,
     * disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName,
     * blockDeviceMapping, productCodes, sourceDestCheck, groupSet,
     * ebsOptimized, sriovNetSupport, enaSupport
     */
    private String attribute;

    /**
     * <p>
     * Modifies the <code>DeleteOnTermination</code> attribute for volumes that
     * are currently attached. The volume must be owned by the caller. If no
     * value is specified for <code>DeleteOnTermination</code>, the default is
     * <code>true</code> and the volume is deleted when the instance is
     * terminated.
     * </p>
     * <p>
     * To add instance store volumes to an Amazon EBS-backed instance, you must
     * add them when you launch the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM"
     * >Updating the Block Device Mapping when Launching an Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private java.util.List<InstanceBlockDeviceMappingSpecification> blockDeviceMappings;

    /**
     * <p>
     * If the value is <code>true</code>, you can't terminate the instance using
     * the Amazon EC2 console, CLI, or API; otherwise, you can. You cannot use
     * this parameter for Spot Instances.
     * </p>
     */
    private AttributeBooleanValue disableApiTermination;

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
     * Specifies whether the instance is optimized for Amazon EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS Optimized instance.
     * </p>
     */
    private AttributeBooleanValue ebsOptimized;

    /**
     * <p>
     * Set to <code>true</code> to enable enhanced networking with ENA for the
     * instance.
     * </p>
     * <p>
     * This option is supported only for HVM instances. Specifying this option
     * with a PV instance can make it unreachable.
     * </p>
     */
    private AttributeBooleanValue enaSupport;

    /**
     * <p>
     * [EC2-VPC] Changes the security groups of the instance. You must specify
     * at least one security group, even if it's just the default security group
     * for the VPC. You must specify the security group ID, not the security
     * group name.
     * </p>
     */
    private java.util.List<String> groups;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * Specifies whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     */
    private AttributeValue instanceInitiatedShutdownBehavior;

    /**
     * <p>
     * Changes the instance type to the specified value. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a>. If the instance type is not valid, the error
     * returned is <code>InvalidInstanceAttributeValue</code>.
     * </p>
     */
    private AttributeValue instanceType;

    /**
     * <p>
     * Changes the instance's kernel to the specified value. We recommend that
     * you use PV-GRUB instead of kernels and RAM disks. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     * >PV-GRUB</a>.
     * </p>
     */
    private AttributeValue kernel;

    /**
     * <p>
     * Changes the instance's RAM disk to the specified value. We recommend that
     * you use PV-GRUB instead of kernels and RAM disks. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     * >PV-GRUB</a>.
     * </p>
     */
    private AttributeValue ramdisk;

    /**
     * <p>
     * Set to <code>simple</code> to enable enhanced networking with the Intel
     * 82599 Virtual Function interface for the instance.
     * </p>
     * <p>
     * There is no way to disable enhanced networking with the Intel 82599
     * Virtual Function interface at this time.
     * </p>
     * <p>
     * This option is supported only for HVM instances. Specifying this option
     * with a PV instance can make it unreachable.
     * </p>
     */
    private AttributeValue sriovNetSupport;

    /**
     * <p>
     * Changes the instance's user data to the specified value. If you are using
     * an AWS SDK or command line tool, base64-encoding is performed for you,
     * and you can load the text from a file. Otherwise, you must provide
     * base64-encoded text.
     * </p>
     */
    private BlobAttributeValue userData;

    /**
     * <p>
     * A new value for the attribute. Use only with the <code>kernel</code>,
     * <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code>, or
     * <code>instanceInitiatedShutdownBehavior</code> attribute.
     * </p>
     */
    private String value;

    /**
     * <p>
     * Specifies whether source/destination checking is enabled. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code>
     * means that checking is disabled. This value must be <code>false</code>
     * for a NAT instance to perform NAT.
     * </p>
     *
     * @return <p>
     *         Specifies whether source/destination checking is enabled. A value
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
     * Specifies whether source/destination checking is enabled. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code>
     * means that checking is disabled. This value must be <code>false</code>
     * for a NAT instance to perform NAT.
     * </p>
     *
     * @param sourceDestCheck <p>
     *            Specifies whether source/destination checking is enabled. A
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
     * Specifies whether source/destination checking is enabled. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code>
     * means that checking is disabled. This value must be <code>false</code>
     * for a NAT instance to perform NAT.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceDestCheck <p>
     *            Specifies whether source/destination checking is enabled. A
     *            value of <code>true</code> means that checking is enabled, and
     *            <code>false</code> means that checking is disabled. This value
     *            must be <code>false</code> for a NAT instance to perform NAT.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceAttributeRequest withSourceDestCheck(AttributeBooleanValue sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
        return this;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData,
     * disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName,
     * blockDeviceMapping, productCodes, sourceDestCheck, groupSet,
     * ebsOptimized, sriovNetSupport, enaSupport
     *
     * @return <p>
     *         The name of the attribute.
     *         </p>
     * @see InstanceAttributeName
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData,
     * disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName,
     * blockDeviceMapping, productCodes, sourceDestCheck, groupSet,
     * ebsOptimized, sriovNetSupport, enaSupport
     *
     * @param attribute <p>
     *            The name of the attribute.
     *            </p>
     * @see InstanceAttributeName
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData,
     * disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName,
     * blockDeviceMapping, productCodes, sourceDestCheck, groupSet,
     * ebsOptimized, sriovNetSupport, enaSupport
     *
     * @param attribute <p>
     *            The name of the attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceAttributeName
     */
    public ModifyInstanceAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData,
     * disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName,
     * blockDeviceMapping, productCodes, sourceDestCheck, groupSet,
     * ebsOptimized, sriovNetSupport, enaSupport
     *
     * @param attribute <p>
     *            The name of the attribute.
     *            </p>
     * @see InstanceAttributeName
     */
    public void setAttribute(InstanceAttributeName attribute) {
        this.attribute = attribute.toString();
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData,
     * disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName,
     * blockDeviceMapping, productCodes, sourceDestCheck, groupSet,
     * ebsOptimized, sriovNetSupport, enaSupport
     *
     * @param attribute <p>
     *            The name of the attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceAttributeName
     */
    public ModifyInstanceAttributeRequest withAttribute(InstanceAttributeName attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * <p>
     * Modifies the <code>DeleteOnTermination</code> attribute for volumes that
     * are currently attached. The volume must be owned by the caller. If no
     * value is specified for <code>DeleteOnTermination</code>, the default is
     * <code>true</code> and the volume is deleted when the instance is
     * terminated.
     * </p>
     * <p>
     * To add instance store volumes to an Amazon EBS-backed instance, you must
     * add them when you launch the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM"
     * >Updating the Block Device Mapping when Launching an Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     *
     * @return <p>
     *         Modifies the <code>DeleteOnTermination</code> attribute for
     *         volumes that are currently attached. The volume must be owned by
     *         the caller. If no value is specified for
     *         <code>DeleteOnTermination</code>, the default is
     *         <code>true</code> and the volume is deleted when the instance is
     *         terminated.
     *         </p>
     *         <p>
     *         To add instance store volumes to an Amazon EBS-backed instance,
     *         you must add them when you launch the instance. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM"
     *         >Updating the Block Device Mapping when Launching an Instance</a>
     *         in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *         </p>
     */
    public java.util.List<InstanceBlockDeviceMappingSpecification> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * <p>
     * Modifies the <code>DeleteOnTermination</code> attribute for volumes that
     * are currently attached. The volume must be owned by the caller. If no
     * value is specified for <code>DeleteOnTermination</code>, the default is
     * <code>true</code> and the volume is deleted when the instance is
     * terminated.
     * </p>
     * <p>
     * To add instance store volumes to an Amazon EBS-backed instance, you must
     * add them when you launch the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM"
     * >Updating the Block Device Mapping when Launching an Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     *
     * @param blockDeviceMappings <p>
     *            Modifies the <code>DeleteOnTermination</code> attribute for
     *            volumes that are currently attached. The volume must be owned
     *            by the caller. If no value is specified for
     *            <code>DeleteOnTermination</code>, the default is
     *            <code>true</code> and the volume is deleted when the instance
     *            is terminated.
     *            </p>
     *            <p>
     *            To add instance store volumes to an Amazon EBS-backed
     *            instance, you must add them when you launch the instance. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM"
     *            >Updating the Block Device Mapping when Launching an
     *            Instance</a> in the <i>Amazon Elastic Compute Cloud User
     *            Guide</i>.
     *            </p>
     */
    public void setBlockDeviceMappings(
            java.util.Collection<InstanceBlockDeviceMappingSpecification> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new java.util.ArrayList<InstanceBlockDeviceMappingSpecification>(
                blockDeviceMappings);
    }

    /**
     * <p>
     * Modifies the <code>DeleteOnTermination</code> attribute for volumes that
     * are currently attached. The volume must be owned by the caller. If no
     * value is specified for <code>DeleteOnTermination</code>, the default is
     * <code>true</code> and the volume is deleted when the instance is
     * terminated.
     * </p>
     * <p>
     * To add instance store volumes to an Amazon EBS-backed instance, you must
     * add them when you launch the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM"
     * >Updating the Block Device Mapping when Launching an Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            Modifies the <code>DeleteOnTermination</code> attribute for
     *            volumes that are currently attached. The volume must be owned
     *            by the caller. If no value is specified for
     *            <code>DeleteOnTermination</code>, the default is
     *            <code>true</code> and the volume is deleted when the instance
     *            is terminated.
     *            </p>
     *            <p>
     *            To add instance store volumes to an Amazon EBS-backed
     *            instance, you must add them when you launch the instance. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM"
     *            >Updating the Block Device Mapping when Launching an
     *            Instance</a> in the <i>Amazon Elastic Compute Cloud User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceAttributeRequest withBlockDeviceMappings(
            InstanceBlockDeviceMappingSpecification... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) {
            this.blockDeviceMappings = new java.util.ArrayList<InstanceBlockDeviceMappingSpecification>(
                    blockDeviceMappings.length);
        }
        for (InstanceBlockDeviceMappingSpecification value : blockDeviceMappings) {
            this.blockDeviceMappings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Modifies the <code>DeleteOnTermination</code> attribute for volumes that
     * are currently attached. The volume must be owned by the caller. If no
     * value is specified for <code>DeleteOnTermination</code>, the default is
     * <code>true</code> and the volume is deleted when the instance is
     * terminated.
     * </p>
     * <p>
     * To add instance store volumes to an Amazon EBS-backed instance, you must
     * add them when you launch the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM"
     * >Updating the Block Device Mapping when Launching an Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            Modifies the <code>DeleteOnTermination</code> attribute for
     *            volumes that are currently attached. The volume must be owned
     *            by the caller. If no value is specified for
     *            <code>DeleteOnTermination</code>, the default is
     *            <code>true</code> and the volume is deleted when the instance
     *            is terminated.
     *            </p>
     *            <p>
     *            To add instance store volumes to an Amazon EBS-backed
     *            instance, you must add them when you launch the instance. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM"
     *            >Updating the Block Device Mapping when Launching an
     *            Instance</a> in the <i>Amazon Elastic Compute Cloud User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceAttributeRequest withBlockDeviceMappings(
            java.util.Collection<InstanceBlockDeviceMappingSpecification> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * If the value is <code>true</code>, you can't terminate the instance using
     * the Amazon EC2 console, CLI, or API; otherwise, you can. You cannot use
     * this parameter for Spot Instances.
     * </p>
     *
     * @return <p>
     *         If the value is <code>true</code>, you can't terminate the
     *         instance using the Amazon EC2 console, CLI, or API; otherwise,
     *         you can. You cannot use this parameter for Spot Instances.
     *         </p>
     */
    public AttributeBooleanValue getDisableApiTermination() {
        return disableApiTermination;
    }

    /**
     * <p>
     * If the value is <code>true</code>, you can't terminate the instance using
     * the Amazon EC2 console, CLI, or API; otherwise, you can. You cannot use
     * this parameter for Spot Instances.
     * </p>
     *
     * @param disableApiTermination <p>
     *            If the value is <code>true</code>, you can't terminate the
     *            instance using the Amazon EC2 console, CLI, or API; otherwise,
     *            you can. You cannot use this parameter for Spot Instances.
     *            </p>
     */
    public void setDisableApiTermination(AttributeBooleanValue disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }

    /**
     * <p>
     * If the value is <code>true</code>, you can't terminate the instance using
     * the Amazon EC2 console, CLI, or API; otherwise, you can. You cannot use
     * this parameter for Spot Instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disableApiTermination <p>
     *            If the value is <code>true</code>, you can't terminate the
     *            instance using the Amazon EC2 console, CLI, or API; otherwise,
     *            you can. You cannot use this parameter for Spot Instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceAttributeRequest withDisableApiTermination(
            AttributeBooleanValue disableApiTermination) {
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
    public ModifyInstanceAttributeRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * Specifies whether the instance is optimized for Amazon EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS Optimized instance.
     * </p>
     *
     * @return <p>
     *         Specifies whether the instance is optimized for Amazon EBS I/O.
     *         This optimization provides dedicated throughput to Amazon EBS and
     *         an optimized configuration stack to provide optimal EBS I/O
     *         performance. This optimization isn't available with all instance
     *         types. Additional usage charges apply when using an EBS Optimized
     *         instance.
     *         </p>
     */
    public AttributeBooleanValue getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * <p>
     * Specifies whether the instance is optimized for Amazon EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS Optimized instance.
     * </p>
     *
     * @param ebsOptimized <p>
     *            Specifies whether the instance is optimized for Amazon EBS
     *            I/O. This optimization provides dedicated throughput to Amazon
     *            EBS and an optimized configuration stack to provide optimal
     *            EBS I/O performance. This optimization isn't available with
     *            all instance types. Additional usage charges apply when using
     *            an EBS Optimized instance.
     *            </p>
     */
    public void setEbsOptimized(AttributeBooleanValue ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Specifies whether the instance is optimized for Amazon EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS Optimized instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsOptimized <p>
     *            Specifies whether the instance is optimized for Amazon EBS
     *            I/O. This optimization provides dedicated throughput to Amazon
     *            EBS and an optimized configuration stack to provide optimal
     *            EBS I/O performance. This optimization isn't available with
     *            all instance types. Additional usage charges apply when using
     *            an EBS Optimized instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceAttributeRequest withEbsOptimized(AttributeBooleanValue ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to enable enhanced networking with ENA for the
     * instance.
     * </p>
     * <p>
     * This option is supported only for HVM instances. Specifying this option
     * with a PV instance can make it unreachable.
     * </p>
     *
     * @return <p>
     *         Set to <code>true</code> to enable enhanced networking with ENA
     *         for the instance.
     *         </p>
     *         <p>
     *         This option is supported only for HVM instances. Specifying this
     *         option with a PV instance can make it unreachable.
     *         </p>
     */
    public AttributeBooleanValue getEnaSupport() {
        return enaSupport;
    }

    /**
     * <p>
     * Set to <code>true</code> to enable enhanced networking with ENA for the
     * instance.
     * </p>
     * <p>
     * This option is supported only for HVM instances. Specifying this option
     * with a PV instance can make it unreachable.
     * </p>
     *
     * @param enaSupport <p>
     *            Set to <code>true</code> to enable enhanced networking with
     *            ENA for the instance.
     *            </p>
     *            <p>
     *            This option is supported only for HVM instances. Specifying
     *            this option with a PV instance can make it unreachable.
     *            </p>
     */
    public void setEnaSupport(AttributeBooleanValue enaSupport) {
        this.enaSupport = enaSupport;
    }

    /**
     * <p>
     * Set to <code>true</code> to enable enhanced networking with ENA for the
     * instance.
     * </p>
     * <p>
     * This option is supported only for HVM instances. Specifying this option
     * with a PV instance can make it unreachable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enaSupport <p>
     *            Set to <code>true</code> to enable enhanced networking with
     *            ENA for the instance.
     *            </p>
     *            <p>
     *            This option is supported only for HVM instances. Specifying
     *            this option with a PV instance can make it unreachable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceAttributeRequest withEnaSupport(AttributeBooleanValue enaSupport) {
        this.enaSupport = enaSupport;
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] Changes the security groups of the instance. You must specify
     * at least one security group, even if it's just the default security group
     * for the VPC. You must specify the security group ID, not the security
     * group name.
     * </p>
     *
     * @return <p>
     *         [EC2-VPC] Changes the security groups of the instance. You must
     *         specify at least one security group, even if it's just the
     *         default security group for the VPC. You must specify the security
     *         group ID, not the security group name.
     *         </p>
     */
    public java.util.List<String> getGroups() {
        return groups;
    }

    /**
     * <p>
     * [EC2-VPC] Changes the security groups of the instance. You must specify
     * at least one security group, even if it's just the default security group
     * for the VPC. You must specify the security group ID, not the security
     * group name.
     * </p>
     *
     * @param groups <p>
     *            [EC2-VPC] Changes the security groups of the instance. You
     *            must specify at least one security group, even if it's just
     *            the default security group for the VPC. You must specify the
     *            security group ID, not the security group name.
     *            </p>
     */
    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<String>(groups);
    }

    /**
     * <p>
     * [EC2-VPC] Changes the security groups of the instance. You must specify
     * at least one security group, even if it's just the default security group
     * for the VPC. You must specify the security group ID, not the security
     * group name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            [EC2-VPC] Changes the security groups of the instance. You
     *            must specify at least one security group, even if it's just
     *            the default security group for the VPC. You must specify the
     *            security group ID, not the security group name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceAttributeRequest withGroups(String... groups) {
        if (getGroups() == null) {
            this.groups = new java.util.ArrayList<String>(groups.length);
        }
        for (String value : groups) {
            this.groups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] Changes the security groups of the instance. You must specify
     * at least one security group, even if it's just the default security group
     * for the VPC. You must specify the security group ID, not the security
     * group name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            [EC2-VPC] Changes the security groups of the instance. You
     *            must specify at least one security group, even if it's just
     *            the default security group for the VPC. You must specify the
     *            security group ID, not the security group name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceAttributeRequest withGroups(java.util.Collection<String> groups) {
        setGroups(groups);
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
    public ModifyInstanceAttributeRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * Specifies whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     *
     * @return <p>
     *         Specifies whether an instance stops or terminates when you
     *         initiate shutdown from the instance (using the operating system
     *         command for system shutdown).
     *         </p>
     */
    public AttributeValue getInstanceInitiatedShutdownBehavior() {
        return instanceInitiatedShutdownBehavior;
    }

    /**
     * <p>
     * Specifies whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     *
     * @param instanceInitiatedShutdownBehavior <p>
     *            Specifies whether an instance stops or terminates when you
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
     * Specifies whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceInitiatedShutdownBehavior <p>
     *            Specifies whether an instance stops or terminates when you
     *            initiate shutdown from the instance (using the operating
     *            system command for system shutdown).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceAttributeRequest withInstanceInitiatedShutdownBehavior(
            AttributeValue instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
        return this;
    }

    /**
     * <p>
     * Changes the instance type to the specified value. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a>. If the instance type is not valid, the error
     * returned is <code>InvalidInstanceAttributeValue</code>.
     * </p>
     *
     * @return <p>
     *         Changes the instance type to the specified value. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *         >Instance Types</a>. If the instance type is not valid, the error
     *         returned is <code>InvalidInstanceAttributeValue</code>.
     *         </p>
     */
    public AttributeValue getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * Changes the instance type to the specified value. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a>. If the instance type is not valid, the error
     * returned is <code>InvalidInstanceAttributeValue</code>.
     * </p>
     *
     * @param instanceType <p>
     *            Changes the instance type to the specified value. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *            >Instance Types</a>. If the instance type is not valid, the
     *            error returned is <code>InvalidInstanceAttributeValue</code>.
     *            </p>
     */
    public void setInstanceType(AttributeValue instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * Changes the instance type to the specified value. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a>. If the instance type is not valid, the error
     * returned is <code>InvalidInstanceAttributeValue</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceType <p>
     *            Changes the instance type to the specified value. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *            >Instance Types</a>. If the instance type is not valid, the
     *            error returned is <code>InvalidInstanceAttributeValue</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceAttributeRequest withInstanceType(AttributeValue instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * Changes the instance's kernel to the specified value. We recommend that
     * you use PV-GRUB instead of kernels and RAM disks. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     * >PV-GRUB</a>.
     * </p>
     *
     * @return <p>
     *         Changes the instance's kernel to the specified value. We
     *         recommend that you use PV-GRUB instead of kernels and RAM disks.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     *         >PV-GRUB</a>.
     *         </p>
     */
    public AttributeValue getKernel() {
        return kernel;
    }

    /**
     * <p>
     * Changes the instance's kernel to the specified value. We recommend that
     * you use PV-GRUB instead of kernels and RAM disks. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     * >PV-GRUB</a>.
     * </p>
     *
     * @param kernel <p>
     *            Changes the instance's kernel to the specified value. We
     *            recommend that you use PV-GRUB instead of kernels and RAM
     *            disks. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     *            >PV-GRUB</a>.
     *            </p>
     */
    public void setKernel(AttributeValue kernel) {
        this.kernel = kernel;
    }

    /**
     * <p>
     * Changes the instance's kernel to the specified value. We recommend that
     * you use PV-GRUB instead of kernels and RAM disks. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     * >PV-GRUB</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kernel <p>
     *            Changes the instance's kernel to the specified value. We
     *            recommend that you use PV-GRUB instead of kernels and RAM
     *            disks. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     *            >PV-GRUB</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceAttributeRequest withKernel(AttributeValue kernel) {
        this.kernel = kernel;
        return this;
    }

    /**
     * <p>
     * Changes the instance's RAM disk to the specified value. We recommend that
     * you use PV-GRUB instead of kernels and RAM disks. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     * >PV-GRUB</a>.
     * </p>
     *
     * @return <p>
     *         Changes the instance's RAM disk to the specified value. We
     *         recommend that you use PV-GRUB instead of kernels and RAM disks.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     *         >PV-GRUB</a>.
     *         </p>
     */
    public AttributeValue getRamdisk() {
        return ramdisk;
    }

    /**
     * <p>
     * Changes the instance's RAM disk to the specified value. We recommend that
     * you use PV-GRUB instead of kernels and RAM disks. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     * >PV-GRUB</a>.
     * </p>
     *
     * @param ramdisk <p>
     *            Changes the instance's RAM disk to the specified value. We
     *            recommend that you use PV-GRUB instead of kernels and RAM
     *            disks. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     *            >PV-GRUB</a>.
     *            </p>
     */
    public void setRamdisk(AttributeValue ramdisk) {
        this.ramdisk = ramdisk;
    }

    /**
     * <p>
     * Changes the instance's RAM disk to the specified value. We recommend that
     * you use PV-GRUB instead of kernels and RAM disks. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     * >PV-GRUB</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ramdisk <p>
     *            Changes the instance's RAM disk to the specified value. We
     *            recommend that you use PV-GRUB instead of kernels and RAM
     *            disks. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     *            >PV-GRUB</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceAttributeRequest withRamdisk(AttributeValue ramdisk) {
        this.ramdisk = ramdisk;
        return this;
    }

    /**
     * <p>
     * Set to <code>simple</code> to enable enhanced networking with the Intel
     * 82599 Virtual Function interface for the instance.
     * </p>
     * <p>
     * There is no way to disable enhanced networking with the Intel 82599
     * Virtual Function interface at this time.
     * </p>
     * <p>
     * This option is supported only for HVM instances. Specifying this option
     * with a PV instance can make it unreachable.
     * </p>
     *
     * @return <p>
     *         Set to <code>simple</code> to enable enhanced networking with the
     *         Intel 82599 Virtual Function interface for the instance.
     *         </p>
     *         <p>
     *         There is no way to disable enhanced networking with the Intel
     *         82599 Virtual Function interface at this time.
     *         </p>
     *         <p>
     *         This option is supported only for HVM instances. Specifying this
     *         option with a PV instance can make it unreachable.
     *         </p>
     */
    public AttributeValue getSriovNetSupport() {
        return sriovNetSupport;
    }

    /**
     * <p>
     * Set to <code>simple</code> to enable enhanced networking with the Intel
     * 82599 Virtual Function interface for the instance.
     * </p>
     * <p>
     * There is no way to disable enhanced networking with the Intel 82599
     * Virtual Function interface at this time.
     * </p>
     * <p>
     * This option is supported only for HVM instances. Specifying this option
     * with a PV instance can make it unreachable.
     * </p>
     *
     * @param sriovNetSupport <p>
     *            Set to <code>simple</code> to enable enhanced networking with
     *            the Intel 82599 Virtual Function interface for the instance.
     *            </p>
     *            <p>
     *            There is no way to disable enhanced networking with the Intel
     *            82599 Virtual Function interface at this time.
     *            </p>
     *            <p>
     *            This option is supported only for HVM instances. Specifying
     *            this option with a PV instance can make it unreachable.
     *            </p>
     */
    public void setSriovNetSupport(AttributeValue sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }

    /**
     * <p>
     * Set to <code>simple</code> to enable enhanced networking with the Intel
     * 82599 Virtual Function interface for the instance.
     * </p>
     * <p>
     * There is no way to disable enhanced networking with the Intel 82599
     * Virtual Function interface at this time.
     * </p>
     * <p>
     * This option is supported only for HVM instances. Specifying this option
     * with a PV instance can make it unreachable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sriovNetSupport <p>
     *            Set to <code>simple</code> to enable enhanced networking with
     *            the Intel 82599 Virtual Function interface for the instance.
     *            </p>
     *            <p>
     *            There is no way to disable enhanced networking with the Intel
     *            82599 Virtual Function interface at this time.
     *            </p>
     *            <p>
     *            This option is supported only for HVM instances. Specifying
     *            this option with a PV instance can make it unreachable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceAttributeRequest withSriovNetSupport(AttributeValue sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
        return this;
    }

    /**
     * <p>
     * Changes the instance's user data to the specified value. If you are using
     * an AWS SDK or command line tool, base64-encoding is performed for you,
     * and you can load the text from a file. Otherwise, you must provide
     * base64-encoded text.
     * </p>
     *
     * @return <p>
     *         Changes the instance's user data to the specified value. If you
     *         are using an AWS SDK or command line tool, base64-encoding is
     *         performed for you, and you can load the text from a file.
     *         Otherwise, you must provide base64-encoded text.
     *         </p>
     */
    public BlobAttributeValue getUserData() {
        return userData;
    }

    /**
     * <p>
     * Changes the instance's user data to the specified value. If you are using
     * an AWS SDK or command line tool, base64-encoding is performed for you,
     * and you can load the text from a file. Otherwise, you must provide
     * base64-encoded text.
     * </p>
     *
     * @param userData <p>
     *            Changes the instance's user data to the specified value. If
     *            you are using an AWS SDK or command line tool, base64-encoding
     *            is performed for you, and you can load the text from a file.
     *            Otherwise, you must provide base64-encoded text.
     *            </p>
     */
    public void setUserData(BlobAttributeValue userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * Changes the instance's user data to the specified value. If you are using
     * an AWS SDK or command line tool, base64-encoding is performed for you,
     * and you can load the text from a file. Otherwise, you must provide
     * base64-encoded text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userData <p>
     *            Changes the instance's user data to the specified value. If
     *            you are using an AWS SDK or command line tool, base64-encoding
     *            is performed for you, and you can load the text from a file.
     *            Otherwise, you must provide base64-encoded text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceAttributeRequest withUserData(BlobAttributeValue userData) {
        this.userData = userData;
        return this;
    }

    /**
     * <p>
     * A new value for the attribute. Use only with the <code>kernel</code>,
     * <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code>, or
     * <code>instanceInitiatedShutdownBehavior</code> attribute.
     * </p>
     *
     * @return <p>
     *         A new value for the attribute. Use only with the
     *         <code>kernel</code>, <code>ramdisk</code>, <code>userData</code>,
     *         <code>disableApiTermination</code>, or
     *         <code>instanceInitiatedShutdownBehavior</code> attribute.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * A new value for the attribute. Use only with the <code>kernel</code>,
     * <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code>, or
     * <code>instanceInitiatedShutdownBehavior</code> attribute.
     * </p>
     *
     * @param value <p>
     *            A new value for the attribute. Use only with the
     *            <code>kernel</code>, <code>ramdisk</code>,
     *            <code>userData</code>, <code>disableApiTermination</code>, or
     *            <code>instanceInitiatedShutdownBehavior</code> attribute.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A new value for the attribute. Use only with the <code>kernel</code>,
     * <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code>, or
     * <code>instanceInitiatedShutdownBehavior</code> attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            A new value for the attribute. Use only with the
     *            <code>kernel</code>, <code>ramdisk</code>,
     *            <code>userData</code>, <code>disableApiTermination</code>, or
     *            <code>instanceInitiatedShutdownBehavior</code> attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceAttributeRequest withValue(String value) {
        this.value = value;
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
        if (getSourceDestCheck() != null)
            sb.append("SourceDestCheck: " + getSourceDestCheck() + ",");
        if (getAttribute() != null)
            sb.append("Attribute: " + getAttribute() + ",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getDisableApiTermination() != null)
            sb.append("DisableApiTermination: " + getDisableApiTermination() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: " + getEbsOptimized() + ",");
        if (getEnaSupport() != null)
            sb.append("EnaSupport: " + getEnaSupport() + ",");
        if (getGroups() != null)
            sb.append("Groups: " + getGroups() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getInstanceInitiatedShutdownBehavior() != null)
            sb.append("InstanceInitiatedShutdownBehavior: "
                    + getInstanceInitiatedShutdownBehavior() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getKernel() != null)
            sb.append("Kernel: " + getKernel() + ",");
        if (getRamdisk() != null)
            sb.append("Ramdisk: " + getRamdisk() + ",");
        if (getSriovNetSupport() != null)
            sb.append("SriovNetSupport: " + getSriovNetSupport() + ",");
        if (getUserData() != null)
            sb.append("UserData: " + getUserData() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceDestCheck() == null) ? 0 : getSourceDestCheck().hashCode());
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode
                + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime
                * hashCode
                + ((getDisableApiTermination() == null) ? 0 : getDisableApiTermination().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode + ((getEnaSupport() == null) ? 0 : getEnaSupport().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceInitiatedShutdownBehavior() == null) ? 0
                        : getInstanceInitiatedShutdownBehavior().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKernel() == null) ? 0 : getKernel().hashCode());
        hashCode = prime * hashCode + ((getRamdisk() == null) ? 0 : getRamdisk().hashCode());
        hashCode = prime * hashCode
                + ((getSriovNetSupport() == null) ? 0 : getSriovNetSupport().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyInstanceAttributeRequest == false)
            return false;
        ModifyInstanceAttributeRequest other = (ModifyInstanceAttributeRequest) obj;

        if (other.getSourceDestCheck() == null ^ this.getSourceDestCheck() == null)
            return false;
        if (other.getSourceDestCheck() != null
                && other.getSourceDestCheck().equals(this.getSourceDestCheck()) == false)
            return false;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null
                && other.getAttribute().equals(this.getAttribute()) == false)
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
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
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
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
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
        if (other.getKernel() == null ^ this.getKernel() == null)
            return false;
        if (other.getKernel() != null && other.getKernel().equals(this.getKernel()) == false)
            return false;
        if (other.getRamdisk() == null ^ this.getRamdisk() == null)
            return false;
        if (other.getRamdisk() != null && other.getRamdisk().equals(this.getRamdisk()) == false)
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
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
