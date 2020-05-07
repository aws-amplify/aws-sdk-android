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
 * Describes the disks that are available for the instance type.
 * </p>
 */
public class InstanceStorageInfo implements Serializable {
    /**
     * <p>
     * The total size of the disks, in GB.
     * </p>
     */
    private Long totalSizeInGB;

    /**
     * <p>
     * Array describing the disks that are available for the instance type.
     * </p>
     */
    private java.util.List<DiskInfo> disks;

    /**
     * <p>
     * The total size of the disks, in GB.
     * </p>
     *
     * @return <p>
     *         The total size of the disks, in GB.
     *         </p>
     */
    public Long getTotalSizeInGB() {
        return totalSizeInGB;
    }

    /**
     * <p>
     * The total size of the disks, in GB.
     * </p>
     *
     * @param totalSizeInGB <p>
     *            The total size of the disks, in GB.
     *            </p>
     */
    public void setTotalSizeInGB(Long totalSizeInGB) {
        this.totalSizeInGB = totalSizeInGB;
    }

    /**
     * <p>
     * The total size of the disks, in GB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalSizeInGB <p>
     *            The total size of the disks, in GB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStorageInfo withTotalSizeInGB(Long totalSizeInGB) {
        this.totalSizeInGB = totalSizeInGB;
        return this;
    }

    /**
     * <p>
     * Array describing the disks that are available for the instance type.
     * </p>
     *
     * @return <p>
     *         Array describing the disks that are available for the instance
     *         type.
     *         </p>
     */
    public java.util.List<DiskInfo> getDisks() {
        return disks;
    }

    /**
     * <p>
     * Array describing the disks that are available for the instance type.
     * </p>
     *
     * @param disks <p>
     *            Array describing the disks that are available for the instance
     *            type.
     *            </p>
     */
    public void setDisks(java.util.Collection<DiskInfo> disks) {
        if (disks == null) {
            this.disks = null;
            return;
        }

        this.disks = new java.util.ArrayList<DiskInfo>(disks);
    }

    /**
     * <p>
     * Array describing the disks that are available for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disks <p>
     *            Array describing the disks that are available for the instance
     *            type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStorageInfo withDisks(DiskInfo... disks) {
        if (getDisks() == null) {
            this.disks = new java.util.ArrayList<DiskInfo>(disks.length);
        }
        for (DiskInfo value : disks) {
            this.disks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Array describing the disks that are available for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disks <p>
     *            Array describing the disks that are available for the instance
     *            type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStorageInfo withDisks(java.util.Collection<DiskInfo> disks) {
        setDisks(disks);
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
        if (getTotalSizeInGB() != null)
            sb.append("TotalSizeInGB: " + getTotalSizeInGB() + ",");
        if (getDisks() != null)
            sb.append("Disks: " + getDisks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTotalSizeInGB() == null) ? 0 : getTotalSizeInGB().hashCode());
        hashCode = prime * hashCode + ((getDisks() == null) ? 0 : getDisks().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceStorageInfo == false)
            return false;
        InstanceStorageInfo other = (InstanceStorageInfo) obj;

        if (other.getTotalSizeInGB() == null ^ this.getTotalSizeInGB() == null)
            return false;
        if (other.getTotalSizeInGB() != null
                && other.getTotalSizeInGB().equals(this.getTotalSizeInGB()) == false)
            return false;
        if (other.getDisks() == null ^ this.getDisks() == null)
            return false;
        if (other.getDisks() != null && other.getDisks().equals(this.getDisks()) == false)
            return false;
        return true;
    }
}
