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
 * Registers an AMI. When you're creating an AMI, this is the final step you
 * must complete before you can launch an instance from the AMI. For more
 * information about creating AMIs, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami.html"
 * >Creating Your Own AMIs</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 * <note>
 * <p>
 * For Amazon EBS-backed instances, <a>CreateImage</a> creates and registers the
 * AMI in a single request, so you don't have to register the AMI yourself.
 * </p>
 * </note>
 * <p>
 * You can also use <code>RegisterImage</code> to create an Amazon EBS-backed
 * Linux AMI from a snapshot of a root device volume. You specify the snapshot
 * using the block device mapping. For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-launch-snapshot.html"
 * >Launching a Linux Instance from a Backup</a> in the <i>Amazon Elastic
 * Compute Cloud User Guide</i>.
 * </p>
 * <p>
 * You can't register an image where a secondary (non-root) snapshot has AWS
 * Marketplace product codes.
 * </p>
 * <p>
 * Windows and some Linux distributions, such as Red Hat Enterprise Linux (RHEL)
 * and SUSE Linux Enterprise Server (SLES), use the EC2 billing product code
 * associated with an AMI to verify the subscription status for package updates.
 * To create a new AMI for operating systems that require a billing product
 * code, instead of registering the AMI, do the following to preserve the
 * billing product code association:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Launch an instance from an existing AMI with that billing product code.
 * </p>
 * </li>
 * <li>
 * <p>
 * Customize the instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * Create an AMI from the instance using <a>CreateImage</a>.
 * </p>
 * </li>
 * </ol>
 * <p>
 * If you purchase a Reserved Instance to apply to an On-Demand Instance that
 * was launched from an AMI with a billing product code, make sure that the
 * Reserved Instance has the matching billing product code. If you purchase a
 * Reserved Instance without the matching billing product code, the Reserved
 * Instance will not be applied to the On-Demand Instance. For information about
 * how to obtain the platform details and billing information of an AMI, see <a
 * href
 * ="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-billing-info.html"
 * >Obtaining Billing Information</a> in the <i>Amazon Elastic Compute Cloud
 * User Guide</i>.
 * </p>
 * <p>
 * If needed, you can deregister an AMI at any time. Any modifications you make
 * to an AMI backed by an instance store volume invalidates its registration. If
 * you make changes to an image, deregister the previous image and register the
 * new image.
 * </p>
 */
public class RegisterImageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The full path to your AMI manifest in Amazon S3 storage. The specified
     * bucket must have the <code>aws-exec-read</code> canned access control
     * list (ACL) to ensure that it can be accessed by Amazon EC2. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl"
     * >Canned ACLs</a> in the <i>Amazon S3 Service Developer Guide</i>.
     * </p>
     */
    private String imageLocation;

    /**
     * <p>
     * The architecture of the AMI.
     * </p>
     * <p>
     * Default: For Amazon EBS-backed AMIs, <code>i386</code>. For instance
     * store-backed AMIs, the architecture specified in the manifest file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64, arm64
     */
    private String architecture;

    /**
     * <p>
     * The block device mapping entries.
     * </p>
     */
    private java.util.List<BlockDeviceMapping> blockDeviceMappings;

    /**
     * <p>
     * A description for your AMI.
     * </p>
     */
    private String description;

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
     * Set to <code>true</code> to enable enhanced networking with ENA for the
     * AMI and any instances that you launch from the AMI.
     * </p>
     * <p>
     * This option is supported only for HVM AMIs. Specifying this option with a
     * PV AMI can make instances launched from the AMI unreachable.
     * </p>
     */
    private Boolean enaSupport;

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     */
    private String kernelId;

    /**
     * <p>
     * A name for your AMI.
     * </p>
     * <p>
     * Constraints: 3-128 alphanumeric characters, parentheses (()), square
     * brackets ([]), spaces ( ), periods (.), slashes (/), dashes (-), single
     * quotes ('), at-signs (@), or underscores(_)
     * </p>
     */
    private String name;

    /**
     * <p>
     * The billing product codes. Your account must be authorized to specify
     * billing product codes. Otherwise, you can use the AWS Marketplace to bill
     * for the use of an AMI.
     * </p>
     */
    private java.util.List<String> billingProducts;

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     */
    private String ramdiskId;

    /**
     * <p>
     * The device name of the root device volume (for example,
     * <code>/dev/sda1</code>).
     * </p>
     */
    private String rootDeviceName;

    /**
     * <p>
     * Set to <code>simple</code> to enable enhanced networking with the Intel
     * 82599 Virtual Function interface for the AMI and any instances that you
     * launch from the AMI.
     * </p>
     * <p>
     * There is no way to disable <code>sriovNetSupport</code> at this time.
     * </p>
     * <p>
     * This option is supported only for HVM AMIs. Specifying this option with a
     * PV AMI can make instances launched from the AMI unreachable.
     * </p>
     */
    private String sriovNetSupport;

    /**
     * <p>
     * The type of virtualization (<code>hvm</code> | <code>paravirtual</code>).
     * </p>
     * <p>
     * Default: <code>paravirtual</code>
     * </p>
     */
    private String virtualizationType;

    /**
     * <p>
     * The full path to your AMI manifest in Amazon S3 storage. The specified
     * bucket must have the <code>aws-exec-read</code> canned access control
     * list (ACL) to ensure that it can be accessed by Amazon EC2. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl"
     * >Canned ACLs</a> in the <i>Amazon S3 Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The full path to your AMI manifest in Amazon S3 storage. The
     *         specified bucket must have the <code>aws-exec-read</code> canned
     *         access control list (ACL) to ensure that it can be accessed by
     *         Amazon EC2. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl"
     *         >Canned ACLs</a> in the <i>Amazon S3 Service Developer Guide</i>.
     *         </p>
     */
    public String getImageLocation() {
        return imageLocation;
    }

    /**
     * <p>
     * The full path to your AMI manifest in Amazon S3 storage. The specified
     * bucket must have the <code>aws-exec-read</code> canned access control
     * list (ACL) to ensure that it can be accessed by Amazon EC2. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl"
     * >Canned ACLs</a> in the <i>Amazon S3 Service Developer Guide</i>.
     * </p>
     *
     * @param imageLocation <p>
     *            The full path to your AMI manifest in Amazon S3 storage. The
     *            specified bucket must have the <code>aws-exec-read</code>
     *            canned access control list (ACL) to ensure that it can be
     *            accessed by Amazon EC2. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl"
     *            >Canned ACLs</a> in the <i>Amazon S3 Service Developer
     *            Guide</i>.
     *            </p>
     */
    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    /**
     * <p>
     * The full path to your AMI manifest in Amazon S3 storage. The specified
     * bucket must have the <code>aws-exec-read</code> canned access control
     * list (ACL) to ensure that it can be accessed by Amazon EC2. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl"
     * >Canned ACLs</a> in the <i>Amazon S3 Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageLocation <p>
     *            The full path to your AMI manifest in Amazon S3 storage. The
     *            specified bucket must have the <code>aws-exec-read</code>
     *            canned access control list (ACL) to ensure that it can be
     *            accessed by Amazon EC2. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl"
     *            >Canned ACLs</a> in the <i>Amazon S3 Service Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterImageRequest withImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
        return this;
    }

    /**
     * <p>
     * The architecture of the AMI.
     * </p>
     * <p>
     * Default: For Amazon EBS-backed AMIs, <code>i386</code>. For instance
     * store-backed AMIs, the architecture specified in the manifest file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64, arm64
     *
     * @return <p>
     *         The architecture of the AMI.
     *         </p>
     *         <p>
     *         Default: For Amazon EBS-backed AMIs, <code>i386</code>. For
     *         instance store-backed AMIs, the architecture specified in the
     *         manifest file.
     *         </p>
     * @see ArchitectureValues
     */
    public String getArchitecture() {
        return architecture;
    }

    /**
     * <p>
     * The architecture of the AMI.
     * </p>
     * <p>
     * Default: For Amazon EBS-backed AMIs, <code>i386</code>. For instance
     * store-backed AMIs, the architecture specified in the manifest file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64, arm64
     *
     * @param architecture <p>
     *            The architecture of the AMI.
     *            </p>
     *            <p>
     *            Default: For Amazon EBS-backed AMIs, <code>i386</code>. For
     *            instance store-backed AMIs, the architecture specified in the
     *            manifest file.
     *            </p>
     * @see ArchitectureValues
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The architecture of the AMI.
     * </p>
     * <p>
     * Default: For Amazon EBS-backed AMIs, <code>i386</code>. For instance
     * store-backed AMIs, the architecture specified in the manifest file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64, arm64
     *
     * @param architecture <p>
     *            The architecture of the AMI.
     *            </p>
     *            <p>
     *            Default: For Amazon EBS-backed AMIs, <code>i386</code>. For
     *            instance store-backed AMIs, the architecture specified in the
     *            manifest file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ArchitectureValues
     */
    public RegisterImageRequest withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * <p>
     * The architecture of the AMI.
     * </p>
     * <p>
     * Default: For Amazon EBS-backed AMIs, <code>i386</code>. For instance
     * store-backed AMIs, the architecture specified in the manifest file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64, arm64
     *
     * @param architecture <p>
     *            The architecture of the AMI.
     *            </p>
     *            <p>
     *            Default: For Amazon EBS-backed AMIs, <code>i386</code>. For
     *            instance store-backed AMIs, the architecture specified in the
     *            manifest file.
     *            </p>
     * @see ArchitectureValues
     */
    public void setArchitecture(ArchitectureValues architecture) {
        this.architecture = architecture.toString();
    }

    /**
     * <p>
     * The architecture of the AMI.
     * </p>
     * <p>
     * Default: For Amazon EBS-backed AMIs, <code>i386</code>. For instance
     * store-backed AMIs, the architecture specified in the manifest file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64, arm64
     *
     * @param architecture <p>
     *            The architecture of the AMI.
     *            </p>
     *            <p>
     *            Default: For Amazon EBS-backed AMIs, <code>i386</code>. For
     *            instance store-backed AMIs, the architecture specified in the
     *            manifest file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ArchitectureValues
     */
    public RegisterImageRequest withArchitecture(ArchitectureValues architecture) {
        this.architecture = architecture.toString();
        return this;
    }

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
    public RegisterImageRequest withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
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
    public RegisterImageRequest withBlockDeviceMappings(
            java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * A description for your AMI.
     * </p>
     *
     * @return <p>
     *         A description for your AMI.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for your AMI.
     * </p>
     *
     * @param description <p>
     *            A description for your AMI.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for your AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description for your AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterImageRequest withDescription(String description) {
        this.description = description;
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
    public RegisterImageRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to enable enhanced networking with ENA for the
     * AMI and any instances that you launch from the AMI.
     * </p>
     * <p>
     * This option is supported only for HVM AMIs. Specifying this option with a
     * PV AMI can make instances launched from the AMI unreachable.
     * </p>
     *
     * @return <p>
     *         Set to <code>true</code> to enable enhanced networking with ENA
     *         for the AMI and any instances that you launch from the AMI.
     *         </p>
     *         <p>
     *         This option is supported only for HVM AMIs. Specifying this
     *         option with a PV AMI can make instances launched from the AMI
     *         unreachable.
     *         </p>
     */
    public Boolean isEnaSupport() {
        return enaSupport;
    }

    /**
     * <p>
     * Set to <code>true</code> to enable enhanced networking with ENA for the
     * AMI and any instances that you launch from the AMI.
     * </p>
     * <p>
     * This option is supported only for HVM AMIs. Specifying this option with a
     * PV AMI can make instances launched from the AMI unreachable.
     * </p>
     *
     * @return <p>
     *         Set to <code>true</code> to enable enhanced networking with ENA
     *         for the AMI and any instances that you launch from the AMI.
     *         </p>
     *         <p>
     *         This option is supported only for HVM AMIs. Specifying this
     *         option with a PV AMI can make instances launched from the AMI
     *         unreachable.
     *         </p>
     */
    public Boolean getEnaSupport() {
        return enaSupport;
    }

    /**
     * <p>
     * Set to <code>true</code> to enable enhanced networking with ENA for the
     * AMI and any instances that you launch from the AMI.
     * </p>
     * <p>
     * This option is supported only for HVM AMIs. Specifying this option with a
     * PV AMI can make instances launched from the AMI unreachable.
     * </p>
     *
     * @param enaSupport <p>
     *            Set to <code>true</code> to enable enhanced networking with
     *            ENA for the AMI and any instances that you launch from the
     *            AMI.
     *            </p>
     *            <p>
     *            This option is supported only for HVM AMIs. Specifying this
     *            option with a PV AMI can make instances launched from the AMI
     *            unreachable.
     *            </p>
     */
    public void setEnaSupport(Boolean enaSupport) {
        this.enaSupport = enaSupport;
    }

    /**
     * <p>
     * Set to <code>true</code> to enable enhanced networking with ENA for the
     * AMI and any instances that you launch from the AMI.
     * </p>
     * <p>
     * This option is supported only for HVM AMIs. Specifying this option with a
     * PV AMI can make instances launched from the AMI unreachable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enaSupport <p>
     *            Set to <code>true</code> to enable enhanced networking with
     *            ENA for the AMI and any instances that you launch from the
     *            AMI.
     *            </p>
     *            <p>
     *            This option is supported only for HVM AMIs. Specifying this
     *            option with a PV AMI can make instances launched from the AMI
     *            unreachable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterImageRequest withEnaSupport(Boolean enaSupport) {
        this.enaSupport = enaSupport;
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
    public RegisterImageRequest withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * <p>
     * A name for your AMI.
     * </p>
     * <p>
     * Constraints: 3-128 alphanumeric characters, parentheses (()), square
     * brackets ([]), spaces ( ), periods (.), slashes (/), dashes (-), single
     * quotes ('), at-signs (@), or underscores(_)
     * </p>
     *
     * @return <p>
     *         A name for your AMI.
     *         </p>
     *         <p>
     *         Constraints: 3-128 alphanumeric characters, parentheses (()),
     *         square brackets ([]), spaces ( ), periods (.), slashes (/),
     *         dashes (-), single quotes ('), at-signs (@), or underscores(_)
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A name for your AMI.
     * </p>
     * <p>
     * Constraints: 3-128 alphanumeric characters, parentheses (()), square
     * brackets ([]), spaces ( ), periods (.), slashes (/), dashes (-), single
     * quotes ('), at-signs (@), or underscores(_)
     * </p>
     *
     * @param name <p>
     *            A name for your AMI.
     *            </p>
     *            <p>
     *            Constraints: 3-128 alphanumeric characters, parentheses (()),
     *            square brackets ([]), spaces ( ), periods (.), slashes (/),
     *            dashes (-), single quotes ('), at-signs (@), or underscores(_)
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for your AMI.
     * </p>
     * <p>
     * Constraints: 3-128 alphanumeric characters, parentheses (()), square
     * brackets ([]), spaces ( ), periods (.), slashes (/), dashes (-), single
     * quotes ('), at-signs (@), or underscores(_)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            A name for your AMI.
     *            </p>
     *            <p>
     *            Constraints: 3-128 alphanumeric characters, parentheses (()),
     *            square brackets ([]), spaces ( ), periods (.), slashes (/),
     *            dashes (-), single quotes ('), at-signs (@), or underscores(_)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterImageRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The billing product codes. Your account must be authorized to specify
     * billing product codes. Otherwise, you can use the AWS Marketplace to bill
     * for the use of an AMI.
     * </p>
     *
     * @return <p>
     *         The billing product codes. Your account must be authorized to
     *         specify billing product codes. Otherwise, you can use the AWS
     *         Marketplace to bill for the use of an AMI.
     *         </p>
     */
    public java.util.List<String> getBillingProducts() {
        return billingProducts;
    }

    /**
     * <p>
     * The billing product codes. Your account must be authorized to specify
     * billing product codes. Otherwise, you can use the AWS Marketplace to bill
     * for the use of an AMI.
     * </p>
     *
     * @param billingProducts <p>
     *            The billing product codes. Your account must be authorized to
     *            specify billing product codes. Otherwise, you can use the AWS
     *            Marketplace to bill for the use of an AMI.
     *            </p>
     */
    public void setBillingProducts(java.util.Collection<String> billingProducts) {
        if (billingProducts == null) {
            this.billingProducts = null;
            return;
        }

        this.billingProducts = new java.util.ArrayList<String>(billingProducts);
    }

    /**
     * <p>
     * The billing product codes. Your account must be authorized to specify
     * billing product codes. Otherwise, you can use the AWS Marketplace to bill
     * for the use of an AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param billingProducts <p>
     *            The billing product codes. Your account must be authorized to
     *            specify billing product codes. Otherwise, you can use the AWS
     *            Marketplace to bill for the use of an AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterImageRequest withBillingProducts(String... billingProducts) {
        if (getBillingProducts() == null) {
            this.billingProducts = new java.util.ArrayList<String>(billingProducts.length);
        }
        for (String value : billingProducts) {
            this.billingProducts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The billing product codes. Your account must be authorized to specify
     * billing product codes. Otherwise, you can use the AWS Marketplace to bill
     * for the use of an AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param billingProducts <p>
     *            The billing product codes. Your account must be authorized to
     *            specify billing product codes. Otherwise, you can use the AWS
     *            Marketplace to bill for the use of an AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterImageRequest withBillingProducts(java.util.Collection<String> billingProducts) {
        setBillingProducts(billingProducts);
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
    public RegisterImageRequest withRamdiskId(String ramdiskId) {
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
    public RegisterImageRequest withRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
        return this;
    }

    /**
     * <p>
     * Set to <code>simple</code> to enable enhanced networking with the Intel
     * 82599 Virtual Function interface for the AMI and any instances that you
     * launch from the AMI.
     * </p>
     * <p>
     * There is no way to disable <code>sriovNetSupport</code> at this time.
     * </p>
     * <p>
     * This option is supported only for HVM AMIs. Specifying this option with a
     * PV AMI can make instances launched from the AMI unreachable.
     * </p>
     *
     * @return <p>
     *         Set to <code>simple</code> to enable enhanced networking with the
     *         Intel 82599 Virtual Function interface for the AMI and any
     *         instances that you launch from the AMI.
     *         </p>
     *         <p>
     *         There is no way to disable <code>sriovNetSupport</code> at this
     *         time.
     *         </p>
     *         <p>
     *         This option is supported only for HVM AMIs. Specifying this
     *         option with a PV AMI can make instances launched from the AMI
     *         unreachable.
     *         </p>
     */
    public String getSriovNetSupport() {
        return sriovNetSupport;
    }

    /**
     * <p>
     * Set to <code>simple</code> to enable enhanced networking with the Intel
     * 82599 Virtual Function interface for the AMI and any instances that you
     * launch from the AMI.
     * </p>
     * <p>
     * There is no way to disable <code>sriovNetSupport</code> at this time.
     * </p>
     * <p>
     * This option is supported only for HVM AMIs. Specifying this option with a
     * PV AMI can make instances launched from the AMI unreachable.
     * </p>
     *
     * @param sriovNetSupport <p>
     *            Set to <code>simple</code> to enable enhanced networking with
     *            the Intel 82599 Virtual Function interface for the AMI and any
     *            instances that you launch from the AMI.
     *            </p>
     *            <p>
     *            There is no way to disable <code>sriovNetSupport</code> at
     *            this time.
     *            </p>
     *            <p>
     *            This option is supported only for HVM AMIs. Specifying this
     *            option with a PV AMI can make instances launched from the AMI
     *            unreachable.
     *            </p>
     */
    public void setSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }

    /**
     * <p>
     * Set to <code>simple</code> to enable enhanced networking with the Intel
     * 82599 Virtual Function interface for the AMI and any instances that you
     * launch from the AMI.
     * </p>
     * <p>
     * There is no way to disable <code>sriovNetSupport</code> at this time.
     * </p>
     * <p>
     * This option is supported only for HVM AMIs. Specifying this option with a
     * PV AMI can make instances launched from the AMI unreachable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sriovNetSupport <p>
     *            Set to <code>simple</code> to enable enhanced networking with
     *            the Intel 82599 Virtual Function interface for the AMI and any
     *            instances that you launch from the AMI.
     *            </p>
     *            <p>
     *            There is no way to disable <code>sriovNetSupport</code> at
     *            this time.
     *            </p>
     *            <p>
     *            This option is supported only for HVM AMIs. Specifying this
     *            option with a PV AMI can make instances launched from the AMI
     *            unreachable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterImageRequest withSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
        return this;
    }

    /**
     * <p>
     * The type of virtualization (<code>hvm</code> | <code>paravirtual</code>).
     * </p>
     * <p>
     * Default: <code>paravirtual</code>
     * </p>
     *
     * @return <p>
     *         The type of virtualization (<code>hvm</code> |
     *         <code>paravirtual</code>).
     *         </p>
     *         <p>
     *         Default: <code>paravirtual</code>
     *         </p>
     */
    public String getVirtualizationType() {
        return virtualizationType;
    }

    /**
     * <p>
     * The type of virtualization (<code>hvm</code> | <code>paravirtual</code>).
     * </p>
     * <p>
     * Default: <code>paravirtual</code>
     * </p>
     *
     * @param virtualizationType <p>
     *            The type of virtualization (<code>hvm</code> |
     *            <code>paravirtual</code>).
     *            </p>
     *            <p>
     *            Default: <code>paravirtual</code>
     *            </p>
     */
    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }

    /**
     * <p>
     * The type of virtualization (<code>hvm</code> | <code>paravirtual</code>).
     * </p>
     * <p>
     * Default: <code>paravirtual</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualizationType <p>
     *            The type of virtualization (<code>hvm</code> |
     *            <code>paravirtual</code>).
     *            </p>
     *            <p>
     *            Default: <code>paravirtual</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterImageRequest withVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
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
        if (getImageLocation() != null)
            sb.append("ImageLocation: " + getImageLocation() + ",");
        if (getArchitecture() != null)
            sb.append("Architecture: " + getArchitecture() + ",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getEnaSupport() != null)
            sb.append("EnaSupport: " + getEnaSupport() + ",");
        if (getKernelId() != null)
            sb.append("KernelId: " + getKernelId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getBillingProducts() != null)
            sb.append("BillingProducts: " + getBillingProducts() + ",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getRootDeviceName() != null)
            sb.append("RootDeviceName: " + getRootDeviceName() + ",");
        if (getSriovNetSupport() != null)
            sb.append("SriovNetSupport: " + getSriovNetSupport() + ",");
        if (getVirtualizationType() != null)
            sb.append("VirtualizationType: " + getVirtualizationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getImageLocation() == null) ? 0 : getImageLocation().hashCode());
        hashCode = prime * hashCode
                + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode
                + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getEnaSupport() == null) ? 0 : getEnaSupport().hashCode());
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getBillingProducts() == null) ? 0 : getBillingProducts().hashCode());
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode
                + ((getRootDeviceName() == null) ? 0 : getRootDeviceName().hashCode());
        hashCode = prime * hashCode
                + ((getSriovNetSupport() == null) ? 0 : getSriovNetSupport().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualizationType() == null) ? 0 : getVirtualizationType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterImageRequest == false)
            return false;
        RegisterImageRequest other = (RegisterImageRequest) obj;

        if (other.getImageLocation() == null ^ this.getImageLocation() == null)
            return false;
        if (other.getImageLocation() != null
                && other.getImageLocation().equals(this.getImageLocation()) == false)
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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getEnaSupport() == null ^ this.getEnaSupport() == null)
            return false;
        if (other.getEnaSupport() != null
                && other.getEnaSupport().equals(this.getEnaSupport()) == false)
            return false;
        if (other.getKernelId() == null ^ this.getKernelId() == null)
            return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getBillingProducts() == null ^ this.getBillingProducts() == null)
            return false;
        if (other.getBillingProducts() != null
                && other.getBillingProducts().equals(this.getBillingProducts()) == false)
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
        if (other.getSriovNetSupport() == null ^ this.getSriovNetSupport() == null)
            return false;
        if (other.getSriovNetSupport() != null
                && other.getSriovNetSupport().equals(this.getSriovNetSupport()) == false)
            return false;
        if (other.getVirtualizationType() == null ^ this.getVirtualizationType() == null)
            return false;
        if (other.getVirtualizationType() != null
                && other.getVirtualizationType().equals(this.getVirtualizationType()) == false)
            return false;
        return true;
    }
}
