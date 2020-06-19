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
public class DiskImage implements Serializable {
    /**
     * <p>
     * A description of the disk image.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Information about the disk image.
     * </p>
     */
    private DiskImageDetail image;

    /**
     * <p>
     * Information about the volume.
     * </p>
     */
    private VolumeDetail volume;

    /**
     * <p>
     * A description of the disk image.
     * </p>
     *
     * @return <p>
     *         A description of the disk image.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the disk image.
     * </p>
     *
     * @param description <p>
     *            A description of the disk image.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the disk image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the disk image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskImage withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Information about the disk image.
     * </p>
     *
     * @return <p>
     *         Information about the disk image.
     *         </p>
     */
    public DiskImageDetail getImage() {
        return image;
    }

    /**
     * <p>
     * Information about the disk image.
     * </p>
     *
     * @param image <p>
     *            Information about the disk image.
     *            </p>
     */
    public void setImage(DiskImageDetail image) {
        this.image = image;
    }

    /**
     * <p>
     * Information about the disk image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param image <p>
     *            Information about the disk image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskImage withImage(DiskImageDetail image) {
        this.image = image;
        return this;
    }

    /**
     * <p>
     * Information about the volume.
     * </p>
     *
     * @return <p>
     *         Information about the volume.
     *         </p>
     */
    public VolumeDetail getVolume() {
        return volume;
    }

    /**
     * <p>
     * Information about the volume.
     * </p>
     *
     * @param volume <p>
     *            Information about the volume.
     *            </p>
     */
    public void setVolume(VolumeDetail volume) {
        this.volume = volume;
    }

    /**
     * <p>
     * Information about the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volume <p>
     *            Information about the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskImage withVolume(VolumeDetail volume) {
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getImage() != null)
            sb.append("Image: " + getImage() + ",");
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
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getVolume() == null) ? 0 : getVolume().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiskImage == false)
            return false;
        DiskImage other = (DiskImage) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getVolume() == null ^ this.getVolume() == null)
            return false;
        if (other.getVolume() != null && other.getVolume().equals(this.getVolume()) == false)
            return false;
        return true;
    }
}
