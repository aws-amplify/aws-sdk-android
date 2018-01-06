/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes an EBS volume.
 * </p>
 */
public class VolumeDetail implements Serializable {

    /**
     * The size of the volume, in GiB.
     */
    private Long size;

    /**
     * The size of the volume, in GiB.
     *
     * @return The size of the volume, in GiB.
     */
    public Long getSize() {
        return size;
    }
    
    /**
     * The size of the volume, in GiB.
     *
     * @param size The size of the volume, in GiB.
     */
    public void setSize(Long size) {
        this.size = size;
    }
    
    /**
     * The size of the volume, in GiB.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param size The size of the volume, in GiB.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VolumeDetail withSize(Long size) {
        this.size = size;
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
        if (getSize() != null) sb.append("Size: " + getSize() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VolumeDetail == false) return false;
        VolumeDetail other = (VolumeDetail)obj;
        
        if (other.getSize() == null ^ this.getSize() == null) return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false) return false; 
        return true;
    }
    
}
    