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
 * Describes modifications to the load permissions of an Amazon FPGA image
 * (AFI).
 * </p>
 */
public class LoadPermissionModifications implements Serializable {
    /**
     * <p>
     * The load permissions to add.
     * </p>
     */
    private java.util.List<LoadPermissionRequest> add;

    /**
     * <p>
     * The load permissions to remove.
     * </p>
     */
    private java.util.List<LoadPermissionRequest> remove;

    /**
     * <p>
     * The load permissions to add.
     * </p>
     *
     * @return <p>
     *         The load permissions to add.
     *         </p>
     */
    public java.util.List<LoadPermissionRequest> getAdd() {
        return add;
    }

    /**
     * <p>
     * The load permissions to add.
     * </p>
     *
     * @param add <p>
     *            The load permissions to add.
     *            </p>
     */
    public void setAdd(java.util.Collection<LoadPermissionRequest> add) {
        if (add == null) {
            this.add = null;
            return;
        }

        this.add = new java.util.ArrayList<LoadPermissionRequest>(add);
    }

    /**
     * <p>
     * The load permissions to add.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param add <p>
     *            The load permissions to add.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadPermissionModifications withAdd(LoadPermissionRequest... add) {
        if (getAdd() == null) {
            this.add = new java.util.ArrayList<LoadPermissionRequest>(add.length);
        }
        for (LoadPermissionRequest value : add) {
            this.add.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The load permissions to add.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param add <p>
     *            The load permissions to add.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadPermissionModifications withAdd(java.util.Collection<LoadPermissionRequest> add) {
        setAdd(add);
        return this;
    }

    /**
     * <p>
     * The load permissions to remove.
     * </p>
     *
     * @return <p>
     *         The load permissions to remove.
     *         </p>
     */
    public java.util.List<LoadPermissionRequest> getRemove() {
        return remove;
    }

    /**
     * <p>
     * The load permissions to remove.
     * </p>
     *
     * @param remove <p>
     *            The load permissions to remove.
     *            </p>
     */
    public void setRemove(java.util.Collection<LoadPermissionRequest> remove) {
        if (remove == null) {
            this.remove = null;
            return;
        }

        this.remove = new java.util.ArrayList<LoadPermissionRequest>(remove);
    }

    /**
     * <p>
     * The load permissions to remove.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param remove <p>
     *            The load permissions to remove.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadPermissionModifications withRemove(LoadPermissionRequest... remove) {
        if (getRemove() == null) {
            this.remove = new java.util.ArrayList<LoadPermissionRequest>(remove.length);
        }
        for (LoadPermissionRequest value : remove) {
            this.remove.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The load permissions to remove.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param remove <p>
     *            The load permissions to remove.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadPermissionModifications withRemove(java.util.Collection<LoadPermissionRequest> remove) {
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

        if (obj instanceof LoadPermissionModifications == false)
            return false;
        LoadPermissionModifications other = (LoadPermissionModifications) obj;

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
