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
 * Describes modifications to the permissions for a volume.
 * </p>
 */
public class CreateVolumePermissionModifications implements Serializable {

    /**
     * Adds a specific AWS account ID or group to a volume's list of create
     * volume permissions.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CreateVolumePermission> add;

    /**
     * Removes a specific AWS account ID or group from a volume's list of
     * create volume permissions.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CreateVolumePermission> remove;

    /**
     * Adds a specific AWS account ID or group to a volume's list of create
     * volume permissions.
     *
     * @return Adds a specific AWS account ID or group to a volume's list of create
     *         volume permissions.
     */
    public java.util.List<CreateVolumePermission> getAdd() {
        if (add == null) {
              add = new com.amazonaws.internal.ListWithAutoConstructFlag<CreateVolumePermission>();
              add.setAutoConstruct(true);
        }
        return add;
    }
    
    /**
     * Adds a specific AWS account ID or group to a volume's list of create
     * volume permissions.
     *
     * @param add Adds a specific AWS account ID or group to a volume's list of create
     *         volume permissions.
     */
    public void setAdd(java.util.Collection<CreateVolumePermission> add) {
        if (add == null) {
            this.add = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CreateVolumePermission> addCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CreateVolumePermission>(add.size());
        addCopy.addAll(add);
        this.add = addCopy;
    }
    
    /**
     * Adds a specific AWS account ID or group to a volume's list of create
     * volume permissions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param add Adds a specific AWS account ID or group to a volume's list of create
     *         volume permissions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateVolumePermissionModifications withAdd(CreateVolumePermission... add) {
        if (getAdd() == null) setAdd(new java.util.ArrayList<CreateVolumePermission>(add.length));
        for (CreateVolumePermission value : add) {
            getAdd().add(value);
        }
        return this;
    }
    
    /**
     * Adds a specific AWS account ID or group to a volume's list of create
     * volume permissions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param add Adds a specific AWS account ID or group to a volume's list of create
     *         volume permissions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateVolumePermissionModifications withAdd(java.util.Collection<CreateVolumePermission> add) {
        if (add == null) {
            this.add = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CreateVolumePermission> addCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CreateVolumePermission>(add.size());
            addCopy.addAll(add);
            this.add = addCopy;
        }

        return this;
    }

    /**
     * Removes a specific AWS account ID or group from a volume's list of
     * create volume permissions.
     *
     * @return Removes a specific AWS account ID or group from a volume's list of
     *         create volume permissions.
     */
    public java.util.List<CreateVolumePermission> getRemove() {
        if (remove == null) {
              remove = new com.amazonaws.internal.ListWithAutoConstructFlag<CreateVolumePermission>();
              remove.setAutoConstruct(true);
        }
        return remove;
    }
    
    /**
     * Removes a specific AWS account ID or group from a volume's list of
     * create volume permissions.
     *
     * @param remove Removes a specific AWS account ID or group from a volume's list of
     *         create volume permissions.
     */
    public void setRemove(java.util.Collection<CreateVolumePermission> remove) {
        if (remove == null) {
            this.remove = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CreateVolumePermission> removeCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CreateVolumePermission>(remove.size());
        removeCopy.addAll(remove);
        this.remove = removeCopy;
    }
    
    /**
     * Removes a specific AWS account ID or group from a volume's list of
     * create volume permissions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param remove Removes a specific AWS account ID or group from a volume's list of
     *         create volume permissions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateVolumePermissionModifications withRemove(CreateVolumePermission... remove) {
        if (getRemove() == null) setRemove(new java.util.ArrayList<CreateVolumePermission>(remove.length));
        for (CreateVolumePermission value : remove) {
            getRemove().add(value);
        }
        return this;
    }
    
    /**
     * Removes a specific AWS account ID or group from a volume's list of
     * create volume permissions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param remove Removes a specific AWS account ID or group from a volume's list of
     *         create volume permissions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateVolumePermissionModifications withRemove(java.util.Collection<CreateVolumePermission> remove) {
        if (remove == null) {
            this.remove = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CreateVolumePermission> removeCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CreateVolumePermission>(remove.size());
            removeCopy.addAll(remove);
            this.remove = removeCopy;
        }

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
        if (getAdd() != null) sb.append("Add: " + getAdd() + ",");
        if (getRemove() != null) sb.append("Remove: " + getRemove() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAdd() == null) ? 0 : getAdd().hashCode()); 
        hashCode = prime * hashCode + ((getRemove() == null) ? 0 : getRemove().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateVolumePermissionModifications == false) return false;
        CreateVolumePermissionModifications other = (CreateVolumePermissionModifications)obj;
        
        if (other.getAdd() == null ^ this.getAdd() == null) return false;
        if (other.getAdd() != null && other.getAdd().equals(this.getAdd()) == false) return false; 
        if (other.getRemove() == null ^ this.getRemove() == null) return false;
        if (other.getRemove() != null && other.getRemove().equals(this.getRemove()) == false) return false; 
        return true;
    }
    
}
    