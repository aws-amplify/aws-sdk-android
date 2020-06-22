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
 * Describes the disk container object for an import image task.
 * </p>
 */
public class ImageDiskContainer implements Serializable {
    /**
     * <p>
     * The description of the disk image.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The block device mapping for the disk.
     * </p>
     */
    private String deviceName;

    /**
     * <p>
     * The format of the disk image being imported.
     * </p>
     * <p>
     * Valid values: <code>OVA</code> | <code>VHD</code> | <code>VHDX</code> |
     * <code>VMDK</code>
     * </p>
     */
    private String format;

    /**
     * <p>
     * The ID of the EBS snapshot to be used for importing the snapshot.
     * </p>
     */
    private String snapshotId;

    /**
     * <p>
     * The URL to the Amazon S3-based disk image being imported. The URL can
     * either be a https URL (https://..) or an Amazon S3 URL (s3://..)
     * </p>
     */
    private String url;

    /**
     * <p>
     * The S3 bucket for the disk image.
     * </p>
     */
    private UserBucket userBucket;

    /**
     * <p>
     * The description of the disk image.
     * </p>
     *
     * @return <p>
     *         The description of the disk image.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the disk image.
     * </p>
     *
     * @param description <p>
     *            The description of the disk image.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the disk image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the disk image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageDiskContainer withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The block device mapping for the disk.
     * </p>
     *
     * @return <p>
     *         The block device mapping for the disk.
     *         </p>
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * <p>
     * The block device mapping for the disk.
     * </p>
     *
     * @param deviceName <p>
     *            The block device mapping for the disk.
     *            </p>
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The block device mapping for the disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceName <p>
     *            The block device mapping for the disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageDiskContainer withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * <p>
     * The format of the disk image being imported.
     * </p>
     * <p>
     * Valid values: <code>OVA</code> | <code>VHD</code> | <code>VHDX</code> |
     * <code>VMDK</code>
     * </p>
     *
     * @return <p>
     *         The format of the disk image being imported.
     *         </p>
     *         <p>
     *         Valid values: <code>OVA</code> | <code>VHD</code> |
     *         <code>VHDX</code> |<code>VMDK</code>
     *         </p>
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * The format of the disk image being imported.
     * </p>
     * <p>
     * Valid values: <code>OVA</code> | <code>VHD</code> | <code>VHDX</code> |
     * <code>VMDK</code>
     * </p>
     *
     * @param format <p>
     *            The format of the disk image being imported.
     *            </p>
     *            <p>
     *            Valid values: <code>OVA</code> | <code>VHD</code> |
     *            <code>VHDX</code> |<code>VMDK</code>
     *            </p>
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the disk image being imported.
     * </p>
     * <p>
     * Valid values: <code>OVA</code> | <code>VHD</code> | <code>VHDX</code> |
     * <code>VMDK</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param format <p>
     *            The format of the disk image being imported.
     *            </p>
     *            <p>
     *            Valid values: <code>OVA</code> | <code>VHD</code> |
     *            <code>VHDX</code> |<code>VMDK</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageDiskContainer withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * The ID of the EBS snapshot to be used for importing the snapshot.
     * </p>
     *
     * @return <p>
     *         The ID of the EBS snapshot to be used for importing the snapshot.
     *         </p>
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * <p>
     * The ID of the EBS snapshot to be used for importing the snapshot.
     * </p>
     *
     * @param snapshotId <p>
     *            The ID of the EBS snapshot to be used for importing the
     *            snapshot.
     *            </p>
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the EBS snapshot to be used for importing the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotId <p>
     *            The ID of the EBS snapshot to be used for importing the
     *            snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageDiskContainer withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * <p>
     * The URL to the Amazon S3-based disk image being imported. The URL can
     * either be a https URL (https://..) or an Amazon S3 URL (s3://..)
     * </p>
     *
     * @return <p>
     *         The URL to the Amazon S3-based disk image being imported. The URL
     *         can either be a https URL (https://..) or an Amazon S3 URL
     *         (s3://..)
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * The URL to the Amazon S3-based disk image being imported. The URL can
     * either be a https URL (https://..) or an Amazon S3 URL (s3://..)
     * </p>
     *
     * @param url <p>
     *            The URL to the Amazon S3-based disk image being imported. The
     *            URL can either be a https URL (https://..) or an Amazon S3 URL
     *            (s3://..)
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL to the Amazon S3-based disk image being imported. The URL can
     * either be a https URL (https://..) or an Amazon S3 URL (s3://..)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param url <p>
     *            The URL to the Amazon S3-based disk image being imported. The
     *            URL can either be a https URL (https://..) or an Amazon S3 URL
     *            (s3://..)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageDiskContainer withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * <p>
     * The S3 bucket for the disk image.
     * </p>
     *
     * @return <p>
     *         The S3 bucket for the disk image.
     *         </p>
     */
    public UserBucket getUserBucket() {
        return userBucket;
    }

    /**
     * <p>
     * The S3 bucket for the disk image.
     * </p>
     *
     * @param userBucket <p>
     *            The S3 bucket for the disk image.
     *            </p>
     */
    public void setUserBucket(UserBucket userBucket) {
        this.userBucket = userBucket;
    }

    /**
     * <p>
     * The S3 bucket for the disk image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userBucket <p>
     *            The S3 bucket for the disk image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageDiskContainer withUserBucket(UserBucket userBucket) {
        this.userBucket = userBucket;
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDeviceName() != null)
            sb.append("DeviceName: " + getDeviceName() + ",");
        if (getFormat() != null)
            sb.append("Format: " + getFormat() + ",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getUrl() != null)
            sb.append("Url: " + getUrl() + ",");
        if (getUserBucket() != null)
            sb.append("UserBucket: " + getUserBucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getUserBucket() == null) ? 0 : getUserBucket().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageDiskContainer == false)
            return false;
        ImageDiskContainer other = (ImageDiskContainer) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null
                && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null
                && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getUserBucket() == null ^ this.getUserBucket() == null)
            return false;
        if (other.getUserBucket() != null
                && other.getUserBucket().equals(this.getUserBucket()) == false)
            return false;
        return true;
    }
}
