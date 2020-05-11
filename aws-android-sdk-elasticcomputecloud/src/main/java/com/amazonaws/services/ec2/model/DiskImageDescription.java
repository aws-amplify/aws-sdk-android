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
 * Describes a disk image.
 * </p>
 */
public class DiskImageDescription implements Serializable {
    /**
     * <p>
     * The checksum computed for the disk image.
     * </p>
     */
    private String checksum;

    /**
     * <p>
     * The disk image format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     */
    private String format;

    /**
     * <p>
     * A presigned URL for the import manifest stored in Amazon S3. For
     * information about creating a presigned URL for an Amazon S3 object, read
     * the "Query String Request Authentication Alternative" section of the <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html"
     * >Authenticating REST Requests</a> topic in the <i>Amazon Simple Storage
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * For information about the import manifest referenced by this API action,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html">VM
     * Import Manifest</a>.
     * </p>
     */
    private String importManifestUrl;

    /**
     * <p>
     * The size of the disk image, in GiB.
     * </p>
     */
    private Long size;

    /**
     * <p>
     * The checksum computed for the disk image.
     * </p>
     *
     * @return <p>
     *         The checksum computed for the disk image.
     *         </p>
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * <p>
     * The checksum computed for the disk image.
     * </p>
     *
     * @param checksum <p>
     *            The checksum computed for the disk image.
     *            </p>
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * The checksum computed for the disk image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param checksum <p>
     *            The checksum computed for the disk image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskImageDescription withChecksum(String checksum) {
        this.checksum = checksum;
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
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * The disk image format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @param format <p>
     *            The disk image format.
     *            </p>
     * @see DiskImageFormat
     */
    public void setFormat(String format) {
        this.format = format;
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
     * @param format <p>
     *            The disk image format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DiskImageFormat
     */
    public DiskImageDescription withFormat(String format) {
        this.format = format;
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
     * @param format <p>
     *            The disk image format.
     *            </p>
     * @see DiskImageFormat
     */
    public void setFormat(DiskImageFormat format) {
        this.format = format.toString();
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
     * @param format <p>
     *            The disk image format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DiskImageFormat
     */
    public DiskImageDescription withFormat(DiskImageFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * A presigned URL for the import manifest stored in Amazon S3. For
     * information about creating a presigned URL for an Amazon S3 object, read
     * the "Query String Request Authentication Alternative" section of the <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html"
     * >Authenticating REST Requests</a> topic in the <i>Amazon Simple Storage
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * For information about the import manifest referenced by this API action,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html">VM
     * Import Manifest</a>.
     * </p>
     *
     * @return <p>
     *         A presigned URL for the import manifest stored in Amazon S3. For
     *         information about creating a presigned URL for an Amazon S3
     *         object, read the
     *         "Query String Request Authentication Alternative" section of the
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html"
     *         >Authenticating REST Requests</a> topic in the <i>Amazon Simple
     *         Storage Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         For information about the import manifest referenced by this API
     *         action, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html"
     *         >VM Import Manifest</a>.
     *         </p>
     */
    public String getImportManifestUrl() {
        return importManifestUrl;
    }

    /**
     * <p>
     * A presigned URL for the import manifest stored in Amazon S3. For
     * information about creating a presigned URL for an Amazon S3 object, read
     * the "Query String Request Authentication Alternative" section of the <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html"
     * >Authenticating REST Requests</a> topic in the <i>Amazon Simple Storage
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * For information about the import manifest referenced by this API action,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html">VM
     * Import Manifest</a>.
     * </p>
     *
     * @param importManifestUrl <p>
     *            A presigned URL for the import manifest stored in Amazon S3.
     *            For information about creating a presigned URL for an Amazon
     *            S3 object, read the
     *            "Query String Request Authentication Alternative" section of
     *            the <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html"
     *            >Authenticating REST Requests</a> topic in the <i>Amazon
     *            Simple Storage Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            For information about the import manifest referenced by this
     *            API action, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html"
     *            >VM Import Manifest</a>.
     *            </p>
     */
    public void setImportManifestUrl(String importManifestUrl) {
        this.importManifestUrl = importManifestUrl;
    }

    /**
     * <p>
     * A presigned URL for the import manifest stored in Amazon S3. For
     * information about creating a presigned URL for an Amazon S3 object, read
     * the "Query String Request Authentication Alternative" section of the <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html"
     * >Authenticating REST Requests</a> topic in the <i>Amazon Simple Storage
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * For information about the import manifest referenced by this API action,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html">VM
     * Import Manifest</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importManifestUrl <p>
     *            A presigned URL for the import manifest stored in Amazon S3.
     *            For information about creating a presigned URL for an Amazon
     *            S3 object, read the
     *            "Query String Request Authentication Alternative" section of
     *            the <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html"
     *            >Authenticating REST Requests</a> topic in the <i>Amazon
     *            Simple Storage Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            For information about the import manifest referenced by this
     *            API action, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html"
     *            >VM Import Manifest</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskImageDescription withImportManifestUrl(String importManifestUrl) {
        this.importManifestUrl = importManifestUrl;
        return this;
    }

    /**
     * <p>
     * The size of the disk image, in GiB.
     * </p>
     *
     * @return <p>
     *         The size of the disk image, in GiB.
     *         </p>
     */
    public Long getSize() {
        return size;
    }

    /**
     * <p>
     * The size of the disk image, in GiB.
     * </p>
     *
     * @param size <p>
     *            The size of the disk image, in GiB.
     *            </p>
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the disk image, in GiB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param size <p>
     *            The size of the disk image, in GiB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskImageDescription withSize(Long size) {
        this.size = size;
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
        if (getChecksum() != null)
            sb.append("Checksum: " + getChecksum() + ",");
        if (getFormat() != null)
            sb.append("Format: " + getFormat() + ",");
        if (getImportManifestUrl() != null)
            sb.append("ImportManifestUrl: " + getImportManifestUrl() + ",");
        if (getSize() != null)
            sb.append("Size: " + getSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode
                + ((getImportManifestUrl() == null) ? 0 : getImportManifestUrl().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiskImageDescription == false)
            return false;
        DiskImageDescription other = (DiskImageDescription) obj;

        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getImportManifestUrl() == null ^ this.getImportManifestUrl() == null)
            return false;
        if (other.getImportManifestUrl() != null
                && other.getImportManifestUrl().equals(this.getImportManifestUrl()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        return true;
    }
}
