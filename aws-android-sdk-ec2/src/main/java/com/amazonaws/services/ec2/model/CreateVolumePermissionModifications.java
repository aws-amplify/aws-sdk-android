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
 * Describes modifications to the list of create volume permissions for a
 * volume.
 * </p>
 */
public class CreateVolumePermissionModifications implements Serializable {
    /**
     * <p>
     * Adds the specified AWS account ID or group to the list.
     * </p>
     */
    private java.util.List<CreateVolumePermission> add;

    /**
     * <p>
     * Removes the specified AWS account ID or group from the list.
     * </p>
     */
    private java.util.List<CreateVolumePermission> remove;

    /**
     * <p>
     * Adds the specified AWS account ID or group to the list.
     * </p>
     *
     * @return <p>
     *         Adds the specified AWS account ID or group to the list.
     *         </p>
     */
    public java.util.List<CreateVolumePermission> getAdd() {
        return add;
    }

    /**
     * <p>
     * Adds the specified AWS account ID or group to the list.
     * </p>
     *
     * @param add <p>
     *            Adds the specified AWS account ID or group to the list.
     *            </p>
     */
    public void setAdd(java.util.Collection<CreateVolumePermission> add) {
        if (add == null) {
            this.add = null;
            return;
        }

        this.add = new java.util.ArrayList<CreateVolumePermission>(add);
    }

    /**
     * <p>
     * Adds the specified AWS account ID or group to the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param add <p>
     *            Adds the specified AWS account ID or group to the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumePermissionModifications withAdd(CreateVolumePermission... add) {
        if (getAdd() == null) {
            this.add = new java.util.ArrayList<CreateVolumePermission>(add.length);
        }
        for (CreateVolumePermission value : add) {
            this.add.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Adds the specified AWS account ID or group to the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param add <p>
     *            Adds the specified AWS account ID or group to the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumePermissionModifications withAdd(
            java.util.Collection<CreateVolumePermission> add) {
        setAdd(add);
        return this;
    }

    /**
     * <p>
     * Removes the specified AWS account ID or group from the list.
     * </p>
     *
     * @return <p>
     *         Removes the specified AWS account ID or group from the list.
     *         </p>
     */
    public java.util.List<CreateVolumePermission> getRemove() {
        return remove;
    }

    /**
     * <p>
     * Removes the specified AWS account ID or group from the list.
     * </p>
     *
     * @param remove <p>
     *            Removes the specified AWS account ID or group from the list.
     *            </p>
     */
    public void setRemove(java.util.Collection<CreateVolumePermission> remove) {
        if (remove == null) {
            this.remove = null;
            return;
        }

        this.remove = new java.util.ArrayList<CreateVolumePermission>(remove);
    }

    /**
     * <p>
     * Removes the specified AWS account ID or group from the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param remove <p>
     *            Removes the specified AWS account ID or group from the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumePermissionModifications withRemove(CreateVolumePermission... remove) {
        if (getRemove() == null) {
            this.remove = new java.util.ArrayList<CreateVolumePermission>(remove.length);
        }
        for (CreateVolumePermission value : remove) {
            this.remove.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Removes the specified AWS account ID or group from the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param remove <p>
     *            Removes the specified AWS account ID or group from the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumePermissionModifications withRemove(
            java.util.Collection<CreateVolumePermission> remove) {
        setRemove(remove);
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
        if (getAdd() != null)
            sb.append("Add: " + getAdd() + ",");
        if (getRemove() != null)
            sb.append("Remove: " + getRemove());
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
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVolumePermissionModifications == false)
            return false;
        CreateVolumePermissionModifications other = (CreateVolumePermissionModifications) obj;

        if (other.getAdd() == null ^ this.getAdd() == null)
            return false;
        if (other.getAdd() != null && other.getAdd().equals(this.getAdd()) == false)
            return false;
        if (other.getRemove() == null ^ this.getRemove() == null)
            return false;
        if (other.getRemove() != null && other.getRemove().equals(this.getRemove()) == false)
            return false;
        return true;
    }
}
