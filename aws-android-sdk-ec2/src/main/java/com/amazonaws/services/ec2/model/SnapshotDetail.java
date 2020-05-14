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
 * Describes the snapshot created from the imported disk.
 * </p>
 */
public class SnapshotDetail implements Serializable {
    /**
     * <p>
     * A description for the snapshot.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The block device mapping for the snapshot.
     * </p>
     */
    private String deviceName;

    /**
     * <p>
     * The size of the disk in the snapshot, in GiB.
     * </p>
     */
    private Double diskImageSize;

    /**
     * <p>
     * The format of the disk image from which the snapshot is created.
     * </p>
     */
    private String format;

    /**
     * <p>
     * The percentage of progress for the task.
     * </p>
     */
    private String progress;

    /**
     * <p>
     * The snapshot ID of the disk being imported.
     * </p>
     */
    private String snapshotId;

    /**
     * <p>
     * A brief status of the snapshot creation.
     * </p>
     */
    private String status;

    /**
     * <p>
     * A detailed status message for the snapshot creation.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The URL used to access the disk image.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The S3 bucket for the disk image.
     * </p>
     */
    private UserBucketDetails userBucket;

    /**
     * <p>
     * A description for the snapshot.
     * </p>
     *
     * @return <p>
     *         A description for the snapshot.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the snapshot.
     * </p>
     *
     * @param description <p>
     *            A description for the snapshot.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description for the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The block device mapping for the snapshot.
     * </p>
     *
     * @return <p>
     *         The block device mapping for the snapshot.
     *         </p>
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * <p>
     * The block device mapping for the snapshot.
     * </p>
     *
     * @param deviceName <p>
     *            The block device mapping for the snapshot.
     *            </p>
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The block device mapping for the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceName <p>
     *            The block device mapping for the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotDetail withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * <p>
     * The size of the disk in the snapshot, in GiB.
     * </p>
     *
     * @return <p>
     *         The size of the disk in the snapshot, in GiB.
     *         </p>
     */
    public Double getDiskImageSize() {
        return diskImageSize;
    }

    /**
     * <p>
     * The size of the disk in the snapshot, in GiB.
     * </p>
     *
     * @param diskImageSize <p>
     *            The size of the disk in the snapshot, in GiB.
     *            </p>
     */
    public void setDiskImageSize(Double diskImageSize) {
        this.diskImageSize = diskImageSize;
    }

    /**
     * <p>
     * The size of the disk in the snapshot, in GiB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskImageSize <p>
     *            The size of the disk in the snapshot, in GiB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotDetail withDiskImageSize(Double diskImageSize) {
        this.diskImageSize = diskImageSize;
        return this;
    }

    /**
     * <p>
     * The format of the disk image from which the snapshot is created.
     * </p>
     *
     * @return <p>
     *         The format of the disk image from which the snapshot is created.
     *         </p>
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * The format of the disk image from which the snapshot is created.
     * </p>
     *
     * @param format <p>
     *            The format of the disk image from which the snapshot is
     *            created.
     *            </p>
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the disk image from which the snapshot is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param format <p>
     *            The format of the disk image from which the snapshot is
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotDetail withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * The percentage of progress for the task.
     * </p>
     *
     * @return <p>
     *         The percentage of progress for the task.
     *         </p>
     */
    public String getProgress() {
        return progress;
    }

    /**
     * <p>
     * The percentage of progress for the task.
     * </p>
     *
     * @param progress <p>
     *            The percentage of progress for the task.
     *            </p>
     */
    public void setProgress(String progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The percentage of progress for the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param progress <p>
     *            The percentage of progress for the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotDetail withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * <p>
     * The snapshot ID of the disk being imported.
     * </p>
     *
     * @return <p>
     *         The snapshot ID of the disk being imported.
     *         </p>
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * <p>
     * The snapshot ID of the disk being imported.
     * </p>
     *
     * @param snapshotId <p>
     *            The snapshot ID of the disk being imported.
     *            </p>
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The snapshot ID of the disk being imported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotId <p>
     *            The snapshot ID of the disk being imported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotDetail withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * <p>
     * A brief status of the snapshot creation.
     * </p>
     *
     * @return <p>
     *         A brief status of the snapshot creation.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * A brief status of the snapshot creation.
     * </p>
     *
     * @param status <p>
     *            A brief status of the snapshot creation.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A brief status of the snapshot creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            A brief status of the snapshot creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * A detailed status message for the snapshot creation.
     * </p>
     *
     * @return <p>
     *         A detailed status message for the snapshot creation.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * A detailed status message for the snapshot creation.
     * </p>
     *
     * @param statusMessage <p>
     *            A detailed status message for the snapshot creation.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A detailed status message for the snapshot creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            A detailed status message for the snapshot creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotDetail withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * The URL used to access the disk image.
     * </p>
     *
     * @return <p>
     *         The URL used to access the disk image.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * The URL used to access the disk image.
     * </p>
     *
     * @param url <p>
     *            The URL used to access the disk image.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL used to access the disk image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param url <p>
     *            The URL used to access the disk image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotDetail withUrl(String url) {
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
    public UserBucketDetails getUserBucket() {
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
    public void setUserBucket(UserBucketDetails userBucket) {
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
    public SnapshotDetail withUserBucket(UserBucketDetails userBucket) {
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
        if (getDiskImageSize() != null)
            sb.append("DiskImageSize: " + getDiskImageSize() + ",");
        if (getFormat() != null)
            sb.append("Format: " + getFormat() + ",");
        if (getProgress() != null)
            sb.append("Progress: " + getProgress() + ",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
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
        hashCode = prime * hashCode
                + ((getDiskImageSize() == null) ? 0 : getDiskImageSize().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
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

        if (obj instanceof SnapshotDetail == false)
            return false;
        SnapshotDetail other = (SnapshotDetail) obj;

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
        if (other.getDiskImageSize() == null ^ this.getDiskImageSize() == null)
            return false;
        if (other.getDiskImageSize() != null
                && other.getDiskImageSize().equals(this.getDiskImageSize()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null
                && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
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
