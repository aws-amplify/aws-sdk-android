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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a disk snapshot.
 * </p>
 */
public class DiskSnapshotInfo implements Serializable {
    /**
     * <p>
     * The size of the disk in GB (e.g., <code>32</code>).
     * </p>
     */
    private Integer sizeInGb;

    /**
     * <p>
     * The size of the disk in GB (e.g., <code>32</code>).
     * </p>
     *
     * @return <p>
     *         The size of the disk in GB (e.g., <code>32</code>).
     *         </p>
     */
    public Integer getSizeInGb() {
        return sizeInGb;
    }

    /**
     * <p>
     * The size of the disk in GB (e.g., <code>32</code>).
     * </p>
     *
     * @param sizeInGb <p>
     *            The size of the disk in GB (e.g., <code>32</code>).
     *            </p>
     */
    public void setSizeInGb(Integer sizeInGb) {
        this.sizeInGb = sizeInGb;
    }

    /**
     * <p>
     * The size of the disk in GB (e.g., <code>32</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizeInGb <p>
     *            The size of the disk in GB (e.g., <code>32</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskSnapshotInfo withSizeInGb(Integer sizeInGb) {
        this.sizeInGb = sizeInGb;
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
        if (getSizeInGb() != null)
            sb.append("sizeInGb: " + getSizeInGb());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSizeInGb() == null) ? 0 : getSizeInGb().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiskSnapshotInfo == false)
            return false;
        DiskSnapshotInfo other = (DiskSnapshotInfo) obj;

        if (other.getSizeInGb() == null ^ this.getSizeInGb() == null)
            return false;
        if (other.getSizeInGb() != null && other.getSizeInGb().equals(this.getSizeInGb()) == false)
            return false;
        return true;
    }
}
