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
 * Describes an image.
 * </p>
 */
public class Image implements Serializable {
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
     * The date and time the image was created.
     * </p>
     */
    private String creationDate;

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     */
    private String imageId;

    /**
     * <p>
     * The location of the AMI.
     * </p>
     */
    private String imageLocation;

    /**
     * <p>
     * The type of image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>machine, kernel, ramdisk
     */
    private String imageType;

    /**
     * <p>
     * Indicates whether the image has public launch permissions. The value is
     * <code>true</code> if this image has public launch permissions or
     * <code>false</code> if it has only implicit and explicit launch
     * permissions.
     * </p>
     */
    private Boolean publicValue;

    /**
     * <p>
     * The kernel associated with the image, if any. Only applicable for machine
     * images.
     * </p>
     */
    private String kernelId;

    /**
     * <p>
     * The AWS account ID of the image owner.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * This value is set to <code>windows</code> for Windows AMIs; otherwise, it
     * is blank.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     */
    private String platform;

    /**
     * <p>
     * The platform details associated with the billing code of the AMI. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-billing-info.html"
     * >Obtaining Billing Information</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     */
    private String platformDetails;

    /**
     * <p>
     * The operation of the Amazon EC2 instance and the billing code that is
     * associated with the AMI. <code>usageOperation</code> corresponds to the
     * <a href=
     * "https://docs.aws.amazon.com/cur/latest/userguide/Lineitem-columns.html#Lineitem-details-O-Operation"
     * >lineitem/Operation</a> column on your AWS Cost and Usage Report and in
     * the <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/price-changes.html"
     * >AWS Price List API</a>. For the list of <code>UsageOperation</code>
     * codes, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-billing-info.html#billing-info"
     * >Platform Details and Usage Operation Billing Codes</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private String usageOperation;

    /**
     * <p>
     * Any product codes associated with the AMI.
     * </p>
     */
    private java.util.List<ProductCode> productCodes;

    /**
     * <p>
     * The RAM disk associated with the image, if any. Only applicable for
     * machine images.
     * </p>
     */
    private String ramdiskId;

    /**
     * <p>
     * The current state of the AMI. If the state is <code>available</code>, the
     * image is successfully registered and can be used to launch an instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, invalid, deregistered,
     * transient, failed, error
     */
    private String state;

    /**
     * <p>
     * Any block device mapping entries.
     * </p>
     */
    private java.util.List<BlockDeviceMapping> blockDeviceMappings;

    /**
     * <p>
     * The description of the AMI that was provided during image creation.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Specifies whether enhanced networking with ENA is enabled.
     * </p>
     */
    private Boolean enaSupport;

    /**
     * <p>
     * The hypervisor type of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     */
    private String hypervisor;

    /**
     * <p>
     * The AWS account alias (for example, <code>amazon</code>,
     * <code>self</code>) or the AWS account ID of the AMI owner.
     * </p>
     */
    private String imageOwnerAlias;

    /**
     * <p>
     * The name of the AMI that was provided during image creation.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The device name of the root device volume (for example,
     * <code>/dev/sda1</code>).
     * </p>
     */
    private String rootDeviceName;

    /**
     * <p>
     * The type of root device used by the AMI. The AMI can use an EBS volume or
     * an instance store volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     */
    private String rootDeviceType;

    /**
     * <p>
     * Specifies whether enhanced networking with the Intel 82599 Virtual
     * Function interface is enabled.
     * </p>
     */
    private String sriovNetSupport;

    /**
     * <p>
     * The reason for the state change.
     * </p>
     */
    private StateReason stateReason;

    /**
     * <p>
     * Any tags assigned to the image.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The type of virtualization of the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     */
    private String virtualizationType;

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
    public Image withArchitecture(String architecture) {
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
    public Image withArchitecture(ArchitectureValues architecture) {
        this.architecture = architecture.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the image was created.
     * </p>
     *
     * @return <p>
     *         The date and time the image was created.
     *         </p>
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date and time the image was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date and time the image was created.
     *            </p>
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time the image was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date and time the image was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withCreationDate(String creationDate) {
        this.creationDate = creationDate;
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
    public Image withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * <p>
     * The location of the AMI.
     * </p>
     *
     * @return <p>
     *         The location of the AMI.
     *         </p>
     */
    public String getImageLocation() {
        return imageLocation;
    }

    /**
     * <p>
     * The location of the AMI.
     * </p>
     *
     * @param imageLocation <p>
     *            The location of the AMI.
     *            </p>
     */
    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    /**
     * <p>
     * The location of the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageLocation <p>
     *            The location of the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
        return this;
    }

    /**
     * <p>
     * The type of image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>machine, kernel, ramdisk
     *
     * @return <p>
     *         The type of image.
     *         </p>
     * @see ImageTypeValues
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * <p>
     * The type of image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>machine, kernel, ramdisk
     *
     * @param imageType <p>
     *            The type of image.
     *            </p>
     * @see ImageTypeValues
     */
    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    /**
     * <p>
     * The type of image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>machine, kernel, ramdisk
     *
     * @param imageType <p>
     *            The type of image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImageTypeValues
     */
    public Image withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * <p>
     * The type of image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>machine, kernel, ramdisk
     *
     * @param imageType <p>
     *            The type of image.
     *            </p>
     * @see ImageTypeValues
     */
    public void setImageType(ImageTypeValues imageType) {
        this.imageType = imageType.toString();
    }

    /**
     * <p>
     * The type of image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>machine, kernel, ramdisk
     *
     * @param imageType <p>
     *            The type of image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImageTypeValues
     */
    public Image withImageType(ImageTypeValues imageType) {
        this.imageType = imageType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the image has public launch permissions. The value is
     * <code>true</code> if this image has public launch permissions or
     * <code>false</code> if it has only implicit and explicit launch
     * permissions.
     * </p>
     *
     * @return <p>
     *         Indicates whether the image has public launch permissions. The
     *         value is <code>true</code> if this image has public launch
     *         permissions or <code>false</code> if it has only implicit and
     *         explicit launch permissions.
     *         </p>
     */
    public Boolean isPublic() {
        return publicValue;
    }

    /**
     * <p>
     * Indicates whether the image has public launch permissions. The value is
     * <code>true</code> if this image has public launch permissions or
     * <code>false</code> if it has only implicit and explicit launch
     * permissions.
     * </p>
     *
     * @return <p>
     *         Indicates whether the image has public launch permissions. The
     *         value is <code>true</code> if this image has public launch
     *         permissions or <code>false</code> if it has only implicit and
     *         explicit launch permissions.
     *         </p>
     */
    public Boolean getPublic() {
        return publicValue;
    }

    /**
     * <p>
     * Indicates whether the image has public launch permissions. The value is
     * <code>true</code> if this image has public launch permissions or
     * <code>false</code> if it has only implicit and explicit launch
     * permissions.
     * </p>
     *
     * @param publicValue <p>
     *            Indicates whether the image has public launch permissions. The
     *            value is <code>true</code> if this image has public launch
     *            permissions or <code>false</code> if it has only implicit and
     *            explicit launch permissions.
     *            </p>
     */
    public void setPublic(Boolean publicValue) {
        this.publicValue = publicValue;
    }

    /**
     * <p>
     * Indicates whether the image has public launch permissions. The value is
     * <code>true</code> if this image has public launch permissions or
     * <code>false</code> if it has only implicit and explicit launch
     * permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicValue <p>
     *            Indicates whether the image has public launch permissions. The
     *            value is <code>true</code> if this image has public launch
     *            permissions or <code>false</code> if it has only implicit and
     *            explicit launch permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withPublic(Boolean publicValue) {
        this.publicValue = publicValue;
        return this;
    }

    /**
     * <p>
     * The kernel associated with the image, if any. Only applicable for machine
     * images.
     * </p>
     *
     * @return <p>
     *         The kernel associated with the image, if any. Only applicable for
     *         machine images.
     *         </p>
     */
    public String getKernelId() {
        return kernelId;
    }

    /**
     * <p>
     * The kernel associated with the image, if any. Only applicable for machine
     * images.
     * </p>
     *
     * @param kernelId <p>
     *            The kernel associated with the image, if any. Only applicable
     *            for machine images.
     *            </p>
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    /**
     * <p>
     * The kernel associated with the image, if any. Only applicable for machine
     * images.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kernelId <p>
     *            The kernel associated with the image, if any. Only applicable
     *            for machine images.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the image owner.
     * </p>
     *
     * @return <p>
     *         The AWS account ID of the image owner.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the image owner.
     * </p>
     *
     * @param ownerId <p>
     *            The AWS account ID of the image owner.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the image owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The AWS account ID of the image owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * This value is set to <code>windows</code> for Windows AMIs; otherwise, it
     * is blank.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @return <p>
     *         This value is set to <code>windows</code> for Windows AMIs;
     *         otherwise, it is blank.
     *         </p>
     * @see PlatformValues
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * <p>
     * This value is set to <code>windows</code> for Windows AMIs; otherwise, it
     * is blank.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform <p>
     *            This value is set to <code>windows</code> for Windows AMIs;
     *            otherwise, it is blank.
     *            </p>
     * @see PlatformValues
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * This value is set to <code>windows</code> for Windows AMIs; otherwise, it
     * is blank.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform <p>
     *            This value is set to <code>windows</code> for Windows AMIs;
     *            otherwise, it is blank.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PlatformValues
     */
    public Image withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * <p>
     * This value is set to <code>windows</code> for Windows AMIs; otherwise, it
     * is blank.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform <p>
     *            This value is set to <code>windows</code> for Windows AMIs;
     *            otherwise, it is blank.
     *            </p>
     * @see PlatformValues
     */
    public void setPlatform(PlatformValues platform) {
        this.platform = platform.toString();
    }

    /**
     * <p>
     * This value is set to <code>windows</code> for Windows AMIs; otherwise, it
     * is blank.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform <p>
     *            This value is set to <code>windows</code> for Windows AMIs;
     *            otherwise, it is blank.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PlatformValues
     */
    public Image withPlatform(PlatformValues platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The platform details associated with the billing code of the AMI. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-billing-info.html"
     * >Obtaining Billing Information</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The platform details associated with the billing code of the AMI.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-billing-info.html"
     *         >Obtaining Billing Information</a> in the <i>Amazon Elastic
     *         Compute Cloud User Guide</i>.
     *         </p>
     */
    public String getPlatformDetails() {
        return platformDetails;
    }

    /**
     * <p>
     * The platform details associated with the billing code of the AMI. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-billing-info.html"
     * >Obtaining Billing Information</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     *
     * @param platformDetails <p>
     *            The platform details associated with the billing code of the
     *            AMI. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-billing-info.html"
     *            >Obtaining Billing Information</a> in the <i>Amazon Elastic
     *            Compute Cloud User Guide</i>.
     *            </p>
     */
    public void setPlatformDetails(String platformDetails) {
        this.platformDetails = platformDetails;
    }

    /**
     * <p>
     * The platform details associated with the billing code of the AMI. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-billing-info.html"
     * >Obtaining Billing Information</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformDetails <p>
     *            The platform details associated with the billing code of the
     *            AMI. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-billing-info.html"
     *            >Obtaining Billing Information</a> in the <i>Amazon Elastic
     *            Compute Cloud User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withPlatformDetails(String platformDetails) {
        this.platformDetails = platformDetails;
        return this;
    }

    /**
     * <p>
     * The operation of the Amazon EC2 instance and the billing code that is
     * associated with the AMI. <code>usageOperation</code> corresponds to the
     * <a href=
     * "https://docs.aws.amazon.com/cur/latest/userguide/Lineitem-columns.html#Lineitem-details-O-Operation"
     * >lineitem/Operation</a> column on your AWS Cost and Usage Report and in
     * the <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/price-changes.html"
     * >AWS Price List API</a>. For the list of <code>UsageOperation</code>
     * codes, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-billing-info.html#billing-info"
     * >Platform Details and Usage Operation Billing Codes</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The operation of the Amazon EC2 instance and the billing code
     *         that is associated with the AMI. <code>usageOperation</code>
     *         corresponds to the <a href=
     *         "https://docs.aws.amazon.com/cur/latest/userguide/Lineitem-columns.html#Lineitem-details-O-Operation"
     *         >lineitem/Operation</a> column on your AWS Cost and Usage Report
     *         and in the <a href=
     *         "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/price-changes.html"
     *         >AWS Price List API</a>. For the list of
     *         <code>UsageOperation</code> codes, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-billing-info.html#billing-info"
     *         >Platform Details and Usage Operation Billing Codes</a> in the
     *         <i>Amazon Elastic Compute Cloud User Guide</i>.
     *         </p>
     */
    public String getUsageOperation() {
        return usageOperation;
    }

    /**
     * <p>
     * The operation of the Amazon EC2 instance and the billing code that is
     * associated with the AMI. <code>usageOperation</code> corresponds to the
     * <a href=
     * "https://docs.aws.amazon.com/cur/latest/userguide/Lineitem-columns.html#Lineitem-details-O-Operation"
     * >lineitem/Operation</a> column on your AWS Cost and Usage Report and in
     * the <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/price-changes.html"
     * >AWS Price List API</a>. For the list of <code>UsageOperation</code>
     * codes, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-billing-info.html#billing-info"
     * >Platform Details and Usage Operation Billing Codes</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     *
     * @param usageOperation <p>
     *            The operation of the Amazon EC2 instance and the billing code
     *            that is associated with the AMI. <code>usageOperation</code>
     *            corresponds to the <a href=
     *            "https://docs.aws.amazon.com/cur/latest/userguide/Lineitem-columns.html#Lineitem-details-O-Operation"
     *            >lineitem/Operation</a> column on your AWS Cost and Usage
     *            Report and in the <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/price-changes.html"
     *            >AWS Price List API</a>. For the list of
     *            <code>UsageOperation</code> codes, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-billing-info.html#billing-info"
     *            >Platform Details and Usage Operation Billing Codes</a> in the
     *            <i>Amazon Elastic Compute Cloud User Guide</i>.
     *            </p>
     */
    public void setUsageOperation(String usageOperation) {
        this.usageOperation = usageOperation;
    }

    /**
     * <p>
     * The operation of the Amazon EC2 instance and the billing code that is
     * associated with the AMI. <code>usageOperation</code> corresponds to the
     * <a href=
     * "https://docs.aws.amazon.com/cur/latest/userguide/Lineitem-columns.html#Lineitem-details-O-Operation"
     * >lineitem/Operation</a> column on your AWS Cost and Usage Report and in
     * the <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/price-changes.html"
     * >AWS Price List API</a>. For the list of <code>UsageOperation</code>
     * codes, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-billing-info.html#billing-info"
     * >Platform Details and Usage Operation Billing Codes</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usageOperation <p>
     *            The operation of the Amazon EC2 instance and the billing code
     *            that is associated with the AMI. <code>usageOperation</code>
     *            corresponds to the <a href=
     *            "https://docs.aws.amazon.com/cur/latest/userguide/Lineitem-columns.html#Lineitem-details-O-Operation"
     *            >lineitem/Operation</a> column on your AWS Cost and Usage
     *            Report and in the <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/price-changes.html"
     *            >AWS Price List API</a>. For the list of
     *            <code>UsageOperation</code> codes, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-billing-info.html#billing-info"
     *            >Platform Details and Usage Operation Billing Codes</a> in the
     *            <i>Amazon Elastic Compute Cloud User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withUsageOperation(String usageOperation) {
        this.usageOperation = usageOperation;
        return this;
    }

    /**
     * <p>
     * Any product codes associated with the AMI.
     * </p>
     *
     * @return <p>
     *         Any product codes associated with the AMI.
     *         </p>
     */
    public java.util.List<ProductCode> getProductCodes() {
        return productCodes;
    }

    /**
     * <p>
     * Any product codes associated with the AMI.
     * </p>
     *
     * @param productCodes <p>
     *            Any product codes associated with the AMI.
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
     * Any product codes associated with the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCodes <p>
     *            Any product codes associated with the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withProductCodes(ProductCode... productCodes) {
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
     * Any product codes associated with the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCodes <p>
     *            Any product codes associated with the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withProductCodes(java.util.Collection<ProductCode> productCodes) {
        setProductCodes(productCodes);
        return this;
    }

    /**
     * <p>
     * The RAM disk associated with the image, if any. Only applicable for
     * machine images.
     * </p>
     *
     * @return <p>
     *         The RAM disk associated with the image, if any. Only applicable
     *         for machine images.
     *         </p>
     */
    public String getRamdiskId() {
        return ramdiskId;
    }

    /**
     * <p>
     * The RAM disk associated with the image, if any. Only applicable for
     * machine images.
     * </p>
     *
     * @param ramdiskId <p>
     *            The RAM disk associated with the image, if any. Only
     *            applicable for machine images.
     *            </p>
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    /**
     * <p>
     * The RAM disk associated with the image, if any. Only applicable for
     * machine images.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ramdiskId <p>
     *            The RAM disk associated with the image, if any. Only
     *            applicable for machine images.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * <p>
     * The current state of the AMI. If the state is <code>available</code>, the
     * image is successfully registered and can be used to launch an instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, invalid, deregistered,
     * transient, failed, error
     *
     * @return <p>
     *         The current state of the AMI. If the state is
     *         <code>available</code>, the image is successfully registered and
     *         can be used to launch an instance.
     *         </p>
     * @see ImageState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current state of the AMI. If the state is <code>available</code>, the
     * image is successfully registered and can be used to launch an instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, invalid, deregistered,
     * transient, failed, error
     *
     * @param state <p>
     *            The current state of the AMI. If the state is
     *            <code>available</code>, the image is successfully registered
     *            and can be used to launch an instance.
     *            </p>
     * @see ImageState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the AMI. If the state is <code>available</code>, the
     * image is successfully registered and can be used to launch an instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, invalid, deregistered,
     * transient, failed, error
     *
     * @param state <p>
     *            The current state of the AMI. If the state is
     *            <code>available</code>, the image is successfully registered
     *            and can be used to launch an instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImageState
     */
    public Image withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The current state of the AMI. If the state is <code>available</code>, the
     * image is successfully registered and can be used to launch an instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, invalid, deregistered,
     * transient, failed, error
     *
     * @param state <p>
     *            The current state of the AMI. If the state is
     *            <code>available</code>, the image is successfully registered
     *            and can be used to launch an instance.
     *            </p>
     * @see ImageState
     */
    public void setState(ImageState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current state of the AMI. If the state is <code>available</code>, the
     * image is successfully registered and can be used to launch an instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, invalid, deregistered,
     * transient, failed, error
     *
     * @param state <p>
     *            The current state of the AMI. If the state is
     *            <code>available</code>, the image is successfully registered
     *            and can be used to launch an instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImageState
     */
    public Image withState(ImageState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Any block device mapping entries.
     * </p>
     *
     * @return <p>
     *         Any block device mapping entries.
     *         </p>
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * <p>
     * Any block device mapping entries.
     * </p>
     *
     * @param blockDeviceMappings <p>
     *            Any block device mapping entries.
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
     * Any block device mapping entries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            Any block device mapping entries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
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
     * Any block device mapping entries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            Any block device mapping entries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withBlockDeviceMappings(
            java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * The description of the AMI that was provided during image creation.
     * </p>
     *
     * @return <p>
     *         The description of the AMI that was provided during image
     *         creation.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the AMI that was provided during image creation.
     * </p>
     *
     * @param description <p>
     *            The description of the AMI that was provided during image
     *            creation.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the AMI that was provided during image creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the AMI that was provided during image
     *            creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withDescription(String description) {
        this.description = description;
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
    public Image withEnaSupport(Boolean enaSupport) {
        this.enaSupport = enaSupport;
        return this;
    }

    /**
     * <p>
     * The hypervisor type of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @return <p>
     *         The hypervisor type of the image.
     *         </p>
     * @see HypervisorType
     */
    public String getHypervisor() {
        return hypervisor;
    }

    /**
     * <p>
     * The hypervisor type of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor <p>
     *            The hypervisor type of the image.
     *            </p>
     * @see HypervisorType
     */
    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }

    /**
     * <p>
     * The hypervisor type of the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor <p>
     *            The hypervisor type of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HypervisorType
     */
    public Image withHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
        return this;
    }

    /**
     * <p>
     * The hypervisor type of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor <p>
     *            The hypervisor type of the image.
     *            </p>
     * @see HypervisorType
     */
    public void setHypervisor(HypervisorType hypervisor) {
        this.hypervisor = hypervisor.toString();
    }

    /**
     * <p>
     * The hypervisor type of the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor <p>
     *            The hypervisor type of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HypervisorType
     */
    public Image withHypervisor(HypervisorType hypervisor) {
        this.hypervisor = hypervisor.toString();
        return this;
    }

    /**
     * <p>
     * The AWS account alias (for example, <code>amazon</code>,
     * <code>self</code>) or the AWS account ID of the AMI owner.
     * </p>
     *
     * @return <p>
     *         The AWS account alias (for example, <code>amazon</code>,
     *         <code>self</code>) or the AWS account ID of the AMI owner.
     *         </p>
     */
    public String getImageOwnerAlias() {
        return imageOwnerAlias;
    }

    /**
     * <p>
     * The AWS account alias (for example, <code>amazon</code>,
     * <code>self</code>) or the AWS account ID of the AMI owner.
     * </p>
     *
     * @param imageOwnerAlias <p>
     *            The AWS account alias (for example, <code>amazon</code>,
     *            <code>self</code>) or the AWS account ID of the AMI owner.
     *            </p>
     */
    public void setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
    }

    /**
     * <p>
     * The AWS account alias (for example, <code>amazon</code>,
     * <code>self</code>) or the AWS account ID of the AMI owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageOwnerAlias <p>
     *            The AWS account alias (for example, <code>amazon</code>,
     *            <code>self</code>) or the AWS account ID of the AMI owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }

    /**
     * <p>
     * The name of the AMI that was provided during image creation.
     * </p>
     *
     * @return <p>
     *         The name of the AMI that was provided during image creation.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the AMI that was provided during image creation.
     * </p>
     *
     * @param name <p>
     *            The name of the AMI that was provided during image creation.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the AMI that was provided during image creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the AMI that was provided during image creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withName(String name) {
        this.name = name;
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
    public Image withRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
        return this;
    }

    /**
     * <p>
     * The type of root device used by the AMI. The AMI can use an EBS volume or
     * an instance store volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @return <p>
     *         The type of root device used by the AMI. The AMI can use an EBS
     *         volume or an instance store volume.
     *         </p>
     * @see DeviceType
     */
    public String getRootDeviceType() {
        return rootDeviceType;
    }

    /**
     * <p>
     * The type of root device used by the AMI. The AMI can use an EBS volume or
     * an instance store volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType <p>
     *            The type of root device used by the AMI. The AMI can use an
     *            EBS volume or an instance store volume.
     *            </p>
     * @see DeviceType
     */
    public void setRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }

    /**
     * <p>
     * The type of root device used by the AMI. The AMI can use an EBS volume or
     * an instance store volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType <p>
     *            The type of root device used by the AMI. The AMI can use an
     *            EBS volume or an instance store volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceType
     */
    public Image withRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
        return this;
    }

    /**
     * <p>
     * The type of root device used by the AMI. The AMI can use an EBS volume or
     * an instance store volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType <p>
     *            The type of root device used by the AMI. The AMI can use an
     *            EBS volume or an instance store volume.
     *            </p>
     * @see DeviceType
     */
    public void setRootDeviceType(DeviceType rootDeviceType) {
        this.rootDeviceType = rootDeviceType.toString();
    }

    /**
     * <p>
     * The type of root device used by the AMI. The AMI can use an EBS volume or
     * an instance store volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType <p>
     *            The type of root device used by the AMI. The AMI can use an
     *            EBS volume or an instance store volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceType
     */
    public Image withRootDeviceType(DeviceType rootDeviceType) {
        this.rootDeviceType = rootDeviceType.toString();
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
    public Image withSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
        return this;
    }

    /**
     * <p>
     * The reason for the state change.
     * </p>
     *
     * @return <p>
     *         The reason for the state change.
     *         </p>
     */
    public StateReason getStateReason() {
        return stateReason;
    }

    /**
     * <p>
     * The reason for the state change.
     * </p>
     *
     * @param stateReason <p>
     *            The reason for the state change.
     *            </p>
     */
    public void setStateReason(StateReason stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * The reason for the state change.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stateReason <p>
     *            The reason for the state change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withStateReason(StateReason stateReason) {
        this.stateReason = stateReason;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the image.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the image.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the image.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the image.
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
     * Any tags assigned to the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withTags(Tag... tags) {
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
     * Any tags assigned to the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The type of virtualization of the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @return <p>
     *         The type of virtualization of the AMI.
     *         </p>
     * @see VirtualizationType
     */
    public String getVirtualizationType() {
        return virtualizationType;
    }

    /**
     * <p>
     * The type of virtualization of the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType <p>
     *            The type of virtualization of the AMI.
     *            </p>
     * @see VirtualizationType
     */
    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }

    /**
     * <p>
     * The type of virtualization of the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType <p>
     *            The type of virtualization of the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VirtualizationType
     */
    public Image withVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
        return this;
    }

    /**
     * <p>
     * The type of virtualization of the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType <p>
     *            The type of virtualization of the AMI.
     *            </p>
     * @see VirtualizationType
     */
    public void setVirtualizationType(VirtualizationType virtualizationType) {
        this.virtualizationType = virtualizationType.toString();
    }

    /**
     * <p>
     * The type of virtualization of the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType <p>
     *            The type of virtualization of the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VirtualizationType
     */
    public Image withVirtualizationType(VirtualizationType virtualizationType) {
        this.virtualizationType = virtualizationType.toString();
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
        if (getArchitecture() != null)
            sb.append("Architecture: " + getArchitecture() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getImageLocation() != null)
            sb.append("ImageLocation: " + getImageLocation() + ",");
        if (getImageType() != null)
            sb.append("ImageType: " + getImageType() + ",");
        if (getPublic() != null)
            sb.append("Public: " + getPublic() + ",");
        if (getKernelId() != null)
            sb.append("KernelId: " + getKernelId() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getPlatform() != null)
            sb.append("Platform: " + getPlatform() + ",");
        if (getPlatformDetails() != null)
            sb.append("PlatformDetails: " + getPlatformDetails() + ",");
        if (getUsageOperation() != null)
            sb.append("UsageOperation: " + getUsageOperation() + ",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: " + getProductCodes() + ",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getEnaSupport() != null)
            sb.append("EnaSupport: " + getEnaSupport() + ",");
        if (getHypervisor() != null)
            sb.append("Hypervisor: " + getHypervisor() + ",");
        if (getImageOwnerAlias() != null)
            sb.append("ImageOwnerAlias: " + getImageOwnerAlias() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getRootDeviceName() != null)
            sb.append("RootDeviceName: " + getRootDeviceName() + ",");
        if (getRootDeviceType() != null)
            sb.append("RootDeviceType: " + getRootDeviceType() + ",");
        if (getSriovNetSupport() != null)
            sb.append("SriovNetSupport: " + getSriovNetSupport() + ",");
        if (getStateReason() != null)
            sb.append("StateReason: " + getStateReason() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
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
                + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode
                + ((getImageLocation() == null) ? 0 : getImageLocation().hashCode());
        hashCode = prime * hashCode + ((getImageType() == null) ? 0 : getImageType().hashCode());
        hashCode = prime * hashCode + ((getPublic() == null) ? 0 : getPublic().hashCode());
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformDetails() == null) ? 0 : getPlatformDetails().hashCode());
        hashCode = prime * hashCode
                + ((getUsageOperation() == null) ? 0 : getUsageOperation().hashCode());
        hashCode = prime * hashCode
                + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode());
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnaSupport() == null) ? 0 : getEnaSupport().hashCode());
        hashCode = prime * hashCode + ((getHypervisor() == null) ? 0 : getHypervisor().hashCode());
        hashCode = prime * hashCode
                + ((getImageOwnerAlias() == null) ? 0 : getImageOwnerAlias().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getRootDeviceName() == null) ? 0 : getRootDeviceName().hashCode());
        hashCode = prime * hashCode
                + ((getRootDeviceType() == null) ? 0 : getRootDeviceType().hashCode());
        hashCode = prime * hashCode
                + ((getSriovNetSupport() == null) ? 0 : getSriovNetSupport().hashCode());
        hashCode = prime * hashCode
                + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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

        if (obj instanceof Image == false)
            return false;
        Image other = (Image) obj;

        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null
                && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getImageLocation() == null ^ this.getImageLocation() == null)
            return false;
        if (other.getImageLocation() != null
                && other.getImageLocation().equals(this.getImageLocation()) == false)
            return false;
        if (other.getImageType() == null ^ this.getImageType() == null)
            return false;
        if (other.getImageType() != null
                && other.getImageType().equals(this.getImageType()) == false)
            return false;
        if (other.getPublic() == null ^ this.getPublic() == null)
            return false;
        if (other.getPublic() != null && other.getPublic().equals(this.getPublic()) == false)
            return false;
        if (other.getKernelId() == null ^ this.getKernelId() == null)
            return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getPlatformDetails() == null ^ this.getPlatformDetails() == null)
            return false;
        if (other.getPlatformDetails() != null
                && other.getPlatformDetails().equals(this.getPlatformDetails()) == false)
            return false;
        if (other.getUsageOperation() == null ^ this.getUsageOperation() == null)
            return false;
        if (other.getUsageOperation() != null
                && other.getUsageOperation().equals(this.getUsageOperation()) == false)
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
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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
        if (other.getImageOwnerAlias() == null ^ this.getImageOwnerAlias() == null)
            return false;
        if (other.getImageOwnerAlias() != null
                && other.getImageOwnerAlias().equals(this.getImageOwnerAlias()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        return true;
    }
}
