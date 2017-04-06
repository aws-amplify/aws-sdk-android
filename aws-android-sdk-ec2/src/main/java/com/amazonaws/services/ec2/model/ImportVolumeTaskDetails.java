/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class ImportVolumeTaskDetails implements Serializable {

    /**
     * The number of bytes converted so far.
     */
    private Long bytesConverted;

    /**
     * The Availability Zone where the resulting volume will reside.
     */
    private String availabilityZone;

    /**
     * The description you provided when starting the import volume task.
     */
    private String description;

    /**
     * The image.
     */
    private DiskImageDescription image;

    /**
     * The volume.
     */
    private DiskImageVolumeDescription volume;

    /**
     * The number of bytes converted so far.
     *
     * @return The number of bytes converted so far.
     */
    public Long getBytesConverted() {
        return bytesConverted;
    }
    
    /**
     * The number of bytes converted so far.
     *
     * @param bytesConverted The number of bytes converted so far.
     */
    public void setBytesConverted(Long bytesConverted) {
        this.bytesConverted = bytesConverted;
    }
    
    /**
     * The number of bytes converted so far.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bytesConverted The number of bytes converted so far.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportVolumeTaskDetails withBytesConverted(Long bytesConverted) {
        this.bytesConverted = bytesConverted;
        return this;
    }

    /**
     * The Availability Zone where the resulting volume will reside.
     *
     * @return The Availability Zone where the resulting volume will reside.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone where the resulting volume will reside.
     *
     * @param availabilityZone The Availability Zone where the resulting volume will reside.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone where the resulting volume will reside.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone where the resulting volume will reside.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportVolumeTaskDetails withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The description you provided when starting the import volume task.
     *
     * @return The description you provided when starting the import volume task.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description you provided when starting the import volume task.
     *
     * @param description The description you provided when starting the import volume task.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description you provided when starting the import volume task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description you provided when starting the import volume task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportVolumeTaskDetails withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The image.
     *
     * @return The image.
     */
    public DiskImageDescription getImage() {
        return image;
    }
    
    /**
     * The image.
     *
     * @param image The image.
     */
    public void setImage(DiskImageDescription image) {
        this.image = image;
    }
    
    /**
     * The image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param image The image.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportVolumeTaskDetails withImage(DiskImageDescription image) {
        this.image = image;
        return this;
    }

    /**
     * The volume.
     *
     * @return The volume.
     */
    public DiskImageVolumeDescription getVolume() {
        return volume;
    }
    
    /**
     * The volume.
     *
     * @param volume The volume.
     */
    public void setVolume(DiskImageVolumeDescription volume) {
        this.volume = volume;
    }
    
    /**
     * The volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volume The volume.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportVolumeTaskDetails withVolume(DiskImageVolumeDescription volume) {
        this.volume = volume;
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
        if (getBytesConverted() != null) sb.append("BytesConverted: " + getBytesConverted() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getImage() != null) sb.append("Image: " + getImage() + ",");
        if (getVolume() != null) sb.append("Volume: " + getVolume() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getBytesConverted() == null) ? 0 : getBytesConverted().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode()); 
        hashCode = prime * hashCode + ((getVolume() == null) ? 0 : getVolume().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ImportVolumeTaskDetails == false) return false;
        ImportVolumeTaskDetails other = (ImportVolumeTaskDetails)obj;
        
        if (other.getBytesConverted() == null ^ this.getBytesConverted() == null) return false;
        if (other.getBytesConverted() != null && other.getBytesConverted().equals(this.getBytesConverted()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getImage() == null ^ this.getImage() == null) return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false) return false; 
        if (other.getVolume() == null ^ this.getVolume() == null) return false;
        if (other.getVolume() != null && other.getVolume().equals(this.getVolume()) == false) return false; 
        return true;
    }
    
}
    