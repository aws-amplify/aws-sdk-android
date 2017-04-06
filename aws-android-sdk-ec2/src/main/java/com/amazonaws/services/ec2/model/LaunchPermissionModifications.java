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
 * Describes a launch permission modification.
 * </p>
 */
public class LaunchPermissionModifications implements Serializable {

    /**
     * The AWS account ID to add to the list of launch permissions for the
     * AMI.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<LaunchPermission> add;

    /**
     * The AWS account ID to remove from the list of launch permissions for
     * the AMI.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<LaunchPermission> remove;

    /**
     * The AWS account ID to add to the list of launch permissions for the
     * AMI.
     *
     * @return The AWS account ID to add to the list of launch permissions for the
     *         AMI.
     */
    public java.util.List<LaunchPermission> getAdd() {
        if (add == null) {
              add = new com.amazonaws.internal.ListWithAutoConstructFlag<LaunchPermission>();
              add.setAutoConstruct(true);
        }
        return add;
    }
    
    /**
     * The AWS account ID to add to the list of launch permissions for the
     * AMI.
     *
     * @param add The AWS account ID to add to the list of launch permissions for the
     *         AMI.
     */
    public void setAdd(java.util.Collection<LaunchPermission> add) {
        if (add == null) {
            this.add = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<LaunchPermission> addCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LaunchPermission>(add.size());
        addCopy.addAll(add);
        this.add = addCopy;
    }
    
    /**
     * The AWS account ID to add to the list of launch permissions for the
     * AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param add The AWS account ID to add to the list of launch permissions for the
     *         AMI.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LaunchPermissionModifications withAdd(LaunchPermission... add) {
        if (getAdd() == null) setAdd(new java.util.ArrayList<LaunchPermission>(add.length));
        for (LaunchPermission value : add) {
            getAdd().add(value);
        }
        return this;
    }
    
    /**
     * The AWS account ID to add to the list of launch permissions for the
     * AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param add The AWS account ID to add to the list of launch permissions for the
     *         AMI.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LaunchPermissionModifications withAdd(java.util.Collection<LaunchPermission> add) {
        if (add == null) {
            this.add = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<LaunchPermission> addCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LaunchPermission>(add.size());
            addCopy.addAll(add);
            this.add = addCopy;
        }

        return this;
    }

    /**
     * The AWS account ID to remove from the list of launch permissions for
     * the AMI.
     *
     * @return The AWS account ID to remove from the list of launch permissions for
     *         the AMI.
     */
    public java.util.List<LaunchPermission> getRemove() {
        if (remove == null) {
              remove = new com.amazonaws.internal.ListWithAutoConstructFlag<LaunchPermission>();
              remove.setAutoConstruct(true);
        }
        return remove;
    }
    
    /**
     * The AWS account ID to remove from the list of launch permissions for
     * the AMI.
     *
     * @param remove The AWS account ID to remove from the list of launch permissions for
     *         the AMI.
     */
    public void setRemove(java.util.Collection<LaunchPermission> remove) {
        if (remove == null) {
            this.remove = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<LaunchPermission> removeCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LaunchPermission>(remove.size());
        removeCopy.addAll(remove);
        this.remove = removeCopy;
    }
    
    /**
     * The AWS account ID to remove from the list of launch permissions for
     * the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param remove The AWS account ID to remove from the list of launch permissions for
     *         the AMI.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LaunchPermissionModifications withRemove(LaunchPermission... remove) {
        if (getRemove() == null) setRemove(new java.util.ArrayList<LaunchPermission>(remove.length));
        for (LaunchPermission value : remove) {
            getRemove().add(value);
        }
        return this;
    }
    
    /**
     * The AWS account ID to remove from the list of launch permissions for
     * the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param remove The AWS account ID to remove from the list of launch permissions for
     *         the AMI.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LaunchPermissionModifications withRemove(java.util.Collection<LaunchPermission> remove) {
        if (remove == null) {
            this.remove = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<LaunchPermission> removeCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LaunchPermission>(remove.size());
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

        if (obj instanceof LaunchPermissionModifications == false) return false;
        LaunchPermissionModifications other = (LaunchPermissionModifications)obj;
        
        if (other.getAdd() == null ^ this.getAdd() == null) return false;
        if (other.getAdd() != null && other.getAdd().equals(this.getAdd()) == false) return false; 
        if (other.getRemove() == null ^ this.getRemove() == null) return false;
        if (other.getRemove() != null && other.getRemove().equals(this.getRemove()) == false) return false; 
        return true;
    }
    
}
    