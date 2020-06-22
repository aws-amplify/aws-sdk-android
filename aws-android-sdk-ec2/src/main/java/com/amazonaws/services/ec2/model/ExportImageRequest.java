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
 * Exports an Amazon Machine Image (AMI) to a VM file. For more information, see
 * <a href=
 * "https://docs.aws.amazon.com/vm-import/latest/userguide/vmexport_image.html"
 * >Exporting a VM Directory from an Amazon Machine Image (AMI)</a> in the <i>VM
 * Import/Export User Guide</i>.
 * </p>
 */
public class ExportImageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Token to enable idempotency for export image requests.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * A description of the image being exported. The maximum length is 255
     * characters.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The disk image format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     */
    private String diskImageFormat;

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
     * The ID of the image.
     * </p>
     */
    private String imageId;

    /**
     * <p>
     * Information about the destination Amazon S3 bucket. The bucket must exist
     * and grant WRITE and READ_ACP permissions to the AWS account
     * vm-import-export@amazon.com.
     * </p>
     */
    private ExportTaskS3LocationRequest s3ExportLocation;

    /**
     * <p>
     * The name of the role that grants VM Import/Export permission to export
     * images to your Amazon S3 bucket. If this parameter is not specified, the
     * default role is named 'vmimport'.
     * </p>
     */
    private String roleName;

    /**
     * <p>
     * The tags to apply to the image being exported.
     * </p>
     */
    private java.util.List<TagSpecification> tagSpecifications;

    /**
     * <p>
     * Token to enable idempotency for export image requests.
     * </p>
     *
     * @return <p>
     *         Token to enable idempotency for export image requests.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Token to enable idempotency for export image requests.
     * </p>
     *
     * @param clientToken <p>
     *            Token to enable idempotency for export image requests.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Token to enable idempotency for export image requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Token to enable idempotency for export image requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportImageRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * A description of the image being exported. The maximum length is 255
     * characters.
     * </p>
     *
     * @return <p>
     *         A description of the image being exported. The maximum length is
     *         255 characters.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the image being exported. The maximum length is 255
     * characters.
     * </p>
     *
     * @param description <p>
     *            A description of the image being exported. The maximum length
     *            is 255 characters.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the image being exported. The maximum length is 255
     * characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the image being exported. The maximum length
     *            is 255 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportImageRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The disk image format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @return <p>
     *         The disk image format.
     *         </p>
     * @see DiskImageFormat
     */
    public String getDiskImageFormat() {
        return diskImageFormat;
    }

    /**
     * <p>
     * The disk image format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @param diskImageFormat <p>
     *            The disk image format.
     *            </p>
     * @see DiskImageFormat
     */
    public void setDiskImageFormat(String diskImageFormat) {
        this.diskImageFormat = diskImageFormat;
    }

    /**
     * <p>
     * The disk image format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @param diskImageFormat <p>
     *            The disk image format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DiskImageFormat
     */
    public ExportImageRequest withDiskImageFormat(String diskImageFormat) {
        this.diskImageFormat = diskImageFormat;
        return this;
    }

    /**
     * <p>
     * The disk image format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @param diskImageFormat <p>
     *            The disk image format.
     *            </p>
     * @see DiskImageFormat
     */
    public void setDiskImageFormat(DiskImageFormat diskImageFormat) {
        this.diskImageFormat = diskImageFormat.toString();
    }

    /**
     * <p>
     * The disk image format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @param diskImageFormat <p>
     *            The disk image format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DiskImageFormat
     */
    public ExportImageRequest withDiskImageFormat(DiskImageFormat diskImageFormat) {
        this.diskImageFormat = diskImageFormat.toString();
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
    public ExportImageRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The ID of the image.
     * </p>
     *
     * @return <p>
     *         The ID of the image.
     *         </p>
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * <p>
     * The ID of the image.
     * </p>
     *
     * @param imageId <p>
     *            The ID of the image.
     *            </p>
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageId <p>
     *            The ID of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportImageRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * <p>
     * Information about the destination Amazon S3 bucket. The bucket must exist
     * and grant WRITE and READ_ACP permissions to the AWS account
     * vm-import-export@amazon.com.
     * </p>
     *
     * @return <p>
     *         Information about the destination Amazon S3 bucket. The bucket
     *         must exist and grant WRITE and READ_ACP permissions to the AWS
     *         account vm-import-export@amazon.com.
     *         </p>
     */
    public ExportTaskS3LocationRequest getS3ExportLocation() {
        return s3ExportLocation;
    }

    /**
     * <p>
     * Information about the destination Amazon S3 bucket. The bucket must exist
     * and grant WRITE and READ_ACP permissions to the AWS account
     * vm-import-export@amazon.com.
     * </p>
     *
     * @param s3ExportLocation <p>
     *            Information about the destination Amazon S3 bucket. The bucket
     *            must exist and grant WRITE and READ_ACP permissions to the AWS
     *            account vm-import-export@amazon.com.
     *            </p>
     */
    public void setS3ExportLocation(ExportTaskS3LocationRequest s3ExportLocation) {
        this.s3ExportLocation = s3ExportLocation;
    }

    /**
     * <p>
     * Information about the destination Amazon S3 bucket. The bucket must exist
     * and grant WRITE and READ_ACP permissions to the AWS account
     * vm-import-export@amazon.com.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3ExportLocation <p>
     *            Information about the destination Amazon S3 bucket. The bucket
     *            must exist and grant WRITE and READ_ACP permissions to the AWS
     *            account vm-import-export@amazon.com.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportImageRequest withS3ExportLocation(ExportTaskS3LocationRequest s3ExportLocation) {
        this.s3ExportLocation = s3ExportLocation;
        return this;
    }

    /**
     * <p>
     * The name of the role that grants VM Import/Export permission to export
     * images to your Amazon S3 bucket. If this parameter is not specified, the
     * default role is named 'vmimport'.
     * </p>
     *
     * @return <p>
     *         The name of the role that grants VM Import/Export permission to
     *         export images to your Amazon S3 bucket. If this parameter is not
     *         specified, the default role is named 'vmimport'.
     *         </p>
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * <p>
     * The name of the role that grants VM Import/Export permission to export
     * images to your Amazon S3 bucket. If this parameter is not specified, the
     * default role is named 'vmimport'.
     * </p>
     *
     * @param roleName <p>
     *            The name of the role that grants VM Import/Export permission
     *            to export images to your Amazon S3 bucket. If this parameter
     *            is not specified, the default role is named 'vmimport'.
     *            </p>
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the role that grants VM Import/Export permission to export
     * images to your Amazon S3 bucket. If this parameter is not specified, the
     * default role is named 'vmimport'.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleName <p>
     *            The name of the role that grants VM Import/Export permission
     *            to export images to your Amazon S3 bucket. If this parameter
     *            is not specified, the default role is named 'vmimport'.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportImageRequest withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * <p>
     * The tags to apply to the image being exported.
     * </p>
     *
     * @return <p>
     *         The tags to apply to the image being exported.
     *         </p>
     */
    public java.util.List<TagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the image being exported.
     * </p>
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the image being exported.
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
     * The tags to apply to the image being exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the image being exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportImageRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The tags to apply to the image being exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the image being exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportImageRequest withTagSpecifications(
            java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
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
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDiskImageFormat() != null)
            sb.append("DiskImageFormat: " + getDiskImageFormat() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getS3ExportLocation() != null)
            sb.append("S3ExportLocation: " + getS3ExportLocation() + ",");
        if (getRoleName() != null)
            sb.append("RoleName: " + getRoleName() + ",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: " + getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDiskImageFormat() == null) ? 0 : getDiskImageFormat().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode
                + ((getS3ExportLocation() == null) ? 0 : getS3ExportLocation().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode
                + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportImageRequest == false)
            return false;
        ExportImageRequest other = (ExportImageRequest) obj;

        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDiskImageFormat() == null ^ this.getDiskImageFormat() == null)
            return false;
        if (other.getDiskImageFormat() != null
                && other.getDiskImageFormat().equals(this.getDiskImageFormat()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getS3ExportLocation() == null ^ this.getS3ExportLocation() == null)
            return false;
        if (other.getS3ExportLocation() != null
                && other.getS3ExportLocation().equals(this.getS3ExportLocation()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null
                && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }
}
