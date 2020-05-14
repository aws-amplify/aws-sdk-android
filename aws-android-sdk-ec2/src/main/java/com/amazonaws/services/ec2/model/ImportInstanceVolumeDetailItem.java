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
 * Describes an import volume task.
 * </p>
 */
public class ImportInstanceVolumeDetailItem implements Serializable {
    /**
     * <p>
     * The Availability Zone where the resulting instance will reside.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The number of bytes converted so far.
     * </p>
     */
    private Long bytesConverted;

    /**
     * <p>
     * A description of the task.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The image.
     * </p>
     */
    private DiskImageDescription image;

    /**
     * <p>
     * The status of the import of this particular disk image.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The status information or errors related to the disk image.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The volume.
     * </p>
     */
    private DiskImageVolumeDescription volume;

    /**
     * <p>
     * The Availability Zone where the resulting instance will reside.
     * </p>
     *
     * @return <p>
     *         The Availability Zone where the resulting instance will reside.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the resulting instance will reside.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone where the resulting instance will
     *            reside.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the resulting instance will reside.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone where the resulting instance will
     *            reside.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportInstanceVolumeDetailItem withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The number of bytes converted so far.
     * </p>
     *
     * @return <p>
     *         The number of bytes converted so far.
     *         </p>
     */
    public Long getBytesConverted() {
        return bytesConverted;
    }

    /**
     * <p>
     * The number of bytes converted so far.
     * </p>
     *
     * @param bytesConverted <p>
     *            The number of bytes converted so far.
     *            </p>
     */
    public void setBytesConverted(Long bytesConverted) {
        this.bytesConverted = bytesConverted;
    }

    /**
     * <p>
     * The number of bytes converted so far.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bytesConverted <p>
     *            The number of bytes converted so far.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportInstanceVolumeDetailItem withBytesConverted(Long bytesConverted) {
        this.bytesConverted = bytesConverted;
        return this;
    }

    /**
     * <p>
     * A description of the task.
     * </p>
     *
     * @return <p>
     *         A description of the task.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the task.
     * </p>
     *
     * @param description <p>
     *            A description of the task.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportInstanceVolumeDetailItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The image.
     * </p>
     *
     * @return <p>
     *         The image.
     *         </p>
     */
    public DiskImageDescription getImage() {
        return image;
    }

    /**
     * <p>
     * The image.
     * </p>
     *
     * @param image <p>
     *            The image.
     *            </p>
     */
    public void setImage(DiskImageDescription image) {
        this.image = image;
    }

    /**
     * <p>
     * The image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param image <p>
     *            The image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportInstanceVolumeDetailItem withImage(DiskImageDescription image) {
        this.image = image;
        return this;
    }

    /**
     * <p>
     * The status of the import of this particular disk image.
     * </p>
     *
     * @return <p>
     *         The status of the import of this particular disk image.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the import of this particular disk image.
     * </p>
     *
     * @param status <p>
     *            The status of the import of this particular disk image.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the import of this particular disk image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the import of this particular disk image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportInstanceVolumeDetailItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status information or errors related to the disk image.
     * </p>
     *
     * @return <p>
     *         The status information or errors related to the disk image.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * The status information or errors related to the disk image.
     * </p>
     *
     * @param statusMessage <p>
     *            The status information or errors related to the disk image.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status information or errors related to the disk image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            The status information or errors related to the disk image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportInstanceVolumeDetailItem withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * The volume.
     * </p>
     *
     * @return <p>
     *         The volume.
     *         </p>
     */
    public DiskImageVolumeDescription getVolume() {
        return volume;
    }

    /**
     * <p>
     * The volume.
     * </p>
     *
     * @param volume <p>
     *            The volume.
     *            </p>
     */
    public void setVolume(DiskImageVolumeDescription volume) {
        this.volume = volume;
    }

    /**
     * <p>
     * The volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volume <p>
     *            The volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportInstanceVolumeDetailItem withVolume(DiskImageVolumeDescription volume) {
        this.volume = volume;
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getBytesConverted() != null)
            sb.append("BytesConverted: " + getBytesConverted() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getImage() != null)
            sb.append("Image: " + getImage() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getVolume() != null)
            sb.append("Volume: " + getVolume());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getBytesConverted() == null) ? 0 : getBytesConverted().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getVolume() == null) ? 0 : getVolume().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportInstanceVolumeDetailItem == false)
            return false;
        ImportInstanceVolumeDetailItem other = (ImportInstanceVolumeDetailItem) obj;

        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getBytesConverted() == null ^ this.getBytesConverted() == null)
            return false;
        if (other.getBytesConverted() != null
                && other.getBytesConverted().equals(this.getBytesConverted()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
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
        if (other.getVolume() == null ^ this.getVolume() == null)
            return false;
        if (other.getVolume() != null && other.getVolume().equals(this.getVolume()) == false)
            return false;
        return true;
    }
}
