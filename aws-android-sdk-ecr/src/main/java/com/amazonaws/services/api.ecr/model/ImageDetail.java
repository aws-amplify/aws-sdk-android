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
package com.amazonaws.services.api.ecr.model;

import java.io.Serializable;


/**
 * <p>An object that describes an image returned by a <a>DescribeImages</a> operation.</p>
 */
public class ImageDetail implements Serializable {
    /**
     * <p>The AWS account ID associated with the registry to which this image belongs.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String registryId;

    /**
     * <p>The name of the repository to which this image belongs.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     */
    private String repositoryName;

    /**
     * <p>The <code>sha256</code> digest of the image manifest.</p>
     */
    private String imageDigest;

    /**
     * <p>The list of tags associated with this image.</p>
     */
    private java.util.List<String> imageTags;

    /**
     * <p>The size, in bytes, of the image in the repository.</p> <p>If the image is a manifest list, this will be the max size of all manifests in the list.</p> <note> <p>Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the <code>docker images</code> command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by <a>DescribeImages</a>.</p> </note>
     */
    private Long imageSizeInBytes;

    /**
     * <p>The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the repository. </p>
     */
    private java.util.Date imagePushedAt;

    /**
     * <p>The current state of the scan.</p>
     */
    private ImageScanStatus imageScanStatus;

    /**
     * <p>A summary of the last completed image scan.</p>
     */
    private ImageScanFindingsSummary imageScanFindingsSummary;

    /**
     * <p>The AWS account ID associated with the registry to which this image belongs.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p>The AWS account ID associated with the registry to which this image belongs.</p>
     */
    public String getRegistryId() {
        return registryId;
    }

    /**
     * <p>The AWS account ID associated with the registry to which this image belongs.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param registryId <p>The AWS account ID associated with the registry to which this image belongs.</p>
     */
    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>The AWS account ID associated with the registry to which this image belongs.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param registryId <p>The AWS account ID associated with the registry to which this image belongs.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ImageDetail withRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }

    /**
     * <p>The name of the repository to which this image belongs.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @return <p>The name of the repository to which this image belongs.</p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>The name of the repository to which this image belongs.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @param repositoryName <p>The name of the repository to which this image belongs.</p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>The name of the repository to which this image belongs.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @param repositoryName <p>The name of the repository to which this image belongs.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ImageDetail withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>The <code>sha256</code> digest of the image manifest.</p>
     *
     * @return <p>The <code>sha256</code> digest of the image manifest.</p>
     */
    public String getImageDigest() {
        return imageDigest;
    }

    /**
     * <p>The <code>sha256</code> digest of the image manifest.</p>
     *
     * @param imageDigest <p>The <code>sha256</code> digest of the image manifest.</p>
     */
    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    /**
     * <p>The <code>sha256</code> digest of the image manifest.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageDigest <p>The <code>sha256</code> digest of the image manifest.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ImageDetail withImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }

    /**
     * <p>The list of tags associated with this image.</p>
     *
     * @return <p>The list of tags associated with this image.</p>
     */
    public java.util.List<String> getImageTags() {
        return imageTags;
    }

    /**
     * <p>The list of tags associated with this image.</p>
     *
     * @param imageTags <p>The list of tags associated with this image.</p>
     */
    public void setImageTags(java.util.Collection<String> imageTags) {
        if (imageTags == null) {
            this.imageTags = null;
            return;
        }

        this.imageTags = new java.util.ArrayList<String>(imageTags);
    }

    /**
     * <p>The list of tags associated with this image.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageTags <p>The list of tags associated with this image.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ImageDetail withImageTags(String... imageTags) {
        if (getImageTags() == null) {
            this.imageTags = new java.util.ArrayList<String>(imageTags.length);
        }
        for (String value : imageTags) {
            this.imageTags.add(value);
        }
        return this;
    }

    /**
     * <p>The list of tags associated with this image.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageTags <p>The list of tags associated with this image.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ImageDetail withImageTags(java.util.Collection<String> imageTags) {
        setImageTags(imageTags);
        return this;
    }

    /**
     * <p>The size, in bytes, of the image in the repository.</p> <p>If the image is a manifest list, this will be the max size of all manifests in the list.</p> <note> <p>Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the <code>docker images</code> command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by <a>DescribeImages</a>.</p> </note>
     *
     * @return <p>The size, in bytes, of the image in the repository.</p> <p>If the image is a manifest list, this will be the max size of all manifests in the list.</p> <note> <p>Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the <code>docker images</code> command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by <a>DescribeImages</a>.</p> </note>
     */
    public Long getImageSizeInBytes() {
        return imageSizeInBytes;
    }

    /**
     * <p>The size, in bytes, of the image in the repository.</p> <p>If the image is a manifest list, this will be the max size of all manifests in the list.</p> <note> <p>Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the <code>docker images</code> command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by <a>DescribeImages</a>.</p> </note>
     *
     * @param imageSizeInBytes <p>The size, in bytes, of the image in the repository.</p> <p>If the image is a manifest list, this will be the max size of all manifests in the list.</p> <note> <p>Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the <code>docker images</code> command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by <a>DescribeImages</a>.</p> </note>
     */
    public void setImageSizeInBytes(Long imageSizeInBytes) {
        this.imageSizeInBytes = imageSizeInBytes;
    }

    /**
     * <p>The size, in bytes, of the image in the repository.</p> <p>If the image is a manifest list, this will be the max size of all manifests in the list.</p> <note> <p>Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the <code>docker images</code> command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by <a>DescribeImages</a>.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageSizeInBytes <p>The size, in bytes, of the image in the repository.</p> <p>If the image is a manifest list, this will be the max size of all manifests in the list.</p> <note> <p>Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the <code>docker images</code> command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by <a>DescribeImages</a>.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ImageDetail withImageSizeInBytes(Long imageSizeInBytes) {
        this.imageSizeInBytes = imageSizeInBytes;
        return this;
    }

    /**
     * <p>The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the repository. </p>
     *
     * @return <p>The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the repository. </p>
     */
    public java.util.Date getImagePushedAt() {
        return imagePushedAt;
    }

    /**
     * <p>The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the repository. </p>
     *
     * @param imagePushedAt <p>The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the repository. </p>
     */
    public void setImagePushedAt(java.util.Date imagePushedAt) {
        this.imagePushedAt = imagePushedAt;
    }

    /**
     * <p>The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the repository. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imagePushedAt <p>The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the repository. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ImageDetail withImagePushedAt(java.util.Date imagePushedAt) {
        this.imagePushedAt = imagePushedAt;
        return this;
    }

    /**
     * <p>The current state of the scan.</p>
     *
     * @return <p>The current state of the scan.</p>
     */
    public ImageScanStatus getImageScanStatus() {
        return imageScanStatus;
    }

    /**
     * <p>The current state of the scan.</p>
     *
     * @param imageScanStatus <p>The current state of the scan.</p>
     */
    public void setImageScanStatus(ImageScanStatus imageScanStatus) {
        this.imageScanStatus = imageScanStatus;
    }

    /**
     * <p>The current state of the scan.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageScanStatus <p>The current state of the scan.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ImageDetail withImageScanStatus(ImageScanStatus imageScanStatus) {
        this.imageScanStatus = imageScanStatus;
        return this;
    }

    /**
     * <p>A summary of the last completed image scan.</p>
     *
     * @return <p>A summary of the last completed image scan.</p>
     */
    public ImageScanFindingsSummary getImageScanFindingsSummary() {
        return imageScanFindingsSummary;
    }

    /**
     * <p>A summary of the last completed image scan.</p>
     *
     * @param imageScanFindingsSummary <p>A summary of the last completed image scan.</p>
     */
    public void setImageScanFindingsSummary(ImageScanFindingsSummary imageScanFindingsSummary) {
        this.imageScanFindingsSummary = imageScanFindingsSummary;
    }

    /**
     * <p>A summary of the last completed image scan.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageScanFindingsSummary <p>A summary of the last completed image scan.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ImageDetail withImageScanFindingsSummary(ImageScanFindingsSummary imageScanFindingsSummary) {
        this.imageScanFindingsSummary = imageScanFindingsSummary;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRegistryId() != null) sb.append("registryId: " + getRegistryId() + ",");
        if (getRepositoryName() != null) sb.append("repositoryName: " + getRepositoryName() + ",");
        if (getImageDigest() != null) sb.append("imageDigest: " + getImageDigest() + ",");
        if (getImageTags() != null) sb.append("imageTags: " + getImageTags() + ",");
        if (getImageSizeInBytes() != null) sb.append("imageSizeInBytes: " + getImageSizeInBytes() + ",");
        if (getImagePushedAt() != null) sb.append("imagePushedAt: " + getImagePushedAt() + ",");
        if (getImageScanStatus() != null) sb.append("imageScanStatus: " + getImageScanStatus() + ",");
        if (getImageScanFindingsSummary() != null) sb.append("imageScanFindingsSummary: " + getImageScanFindingsSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getImageDigest() == null) ? 0 : getImageDigest().hashCode());
        hashCode = prime * hashCode + ((getImageTags() == null) ? 0 : getImageTags().hashCode());
        hashCode = prime * hashCode + ((getImageSizeInBytes() == null) ? 0 : getImageSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getImagePushedAt() == null) ? 0 : getImagePushedAt().hashCode());
        hashCode = prime * hashCode + ((getImageScanStatus() == null) ? 0 : getImageScanStatus().hashCode());
        hashCode = prime * hashCode + ((getImageScanFindingsSummary() == null) ? 0 : getImageScanFindingsSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ImageDetail == false) return false;
        ImageDetail other = (ImageDetail)obj;

        if (other.getRegistryId() == null ^ this.getRegistryId() == null) return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false) return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null) return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false) return false;
        if (other.getImageDigest() == null ^ this.getImageDigest() == null) return false;
        if (other.getImageDigest() != null && other.getImageDigest().equals(this.getImageDigest()) == false) return false;
        if (other.getImageTags() == null ^ this.getImageTags() == null) return false;
        if (other.getImageTags() != null && other.getImageTags().equals(this.getImageTags()) == false) return false;
        if (other.getImageSizeInBytes() == null ^ this.getImageSizeInBytes() == null) return false;
        if (other.getImageSizeInBytes() != null && other.getImageSizeInBytes().equals(this.getImageSizeInBytes()) == false) return false;
        if (other.getImagePushedAt() == null ^ this.getImagePushedAt() == null) return false;
        if (other.getImagePushedAt() != null && other.getImagePushedAt().equals(this.getImagePushedAt()) == false) return false;
        if (other.getImageScanStatus() == null ^ this.getImageScanStatus() == null) return false;
        if (other.getImageScanStatus() != null && other.getImageScanStatus().equals(this.getImageScanStatus()) == false) return false;
        if (other.getImageScanFindingsSummary() == null ^ this.getImageScanFindingsSummary() == null) return false;
        if (other.getImageScanFindingsSummary() != null && other.getImageScanFindingsSummary().equals(this.getImageScanFindingsSummary()) == false) return false;
        return true;
    }
}
