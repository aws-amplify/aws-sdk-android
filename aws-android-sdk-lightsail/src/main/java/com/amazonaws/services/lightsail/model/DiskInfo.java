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
 * Describes a disk.
 * </p>
 */
public class DiskInfo implements Serializable {
    /**
     * <p>
     * The disk name.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The disk path.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String path;

    /**
     * <p>
     * The size of the disk in GB (e.g., <code>32</code>).
     * </p>
     */
    private Integer sizeInGb;

    /**
     * <p>
     * A Boolean value indicating whether this disk is a system disk (has an
     * operating system loaded on it).
     * </p>
     */
    private Boolean isSystemDisk;

    /**
     * <p>
     * The disk name.
     * </p>
     *
     * @return <p>
     *         The disk name.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The disk name.
     * </p>
     *
     * @param name <p>
     *            The disk name.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The disk name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The disk name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The disk path.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The disk path.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The disk path.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param path <p>
     *            The disk path.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The disk path.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param path <p>
     *            The disk path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskInfo withPath(String path) {
        this.path = path;
        return this;
    }

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
    public DiskInfo withSizeInGb(Integer sizeInGb) {
        this.sizeInGb = sizeInGb;
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether this disk is a system disk (has an
     * operating system loaded on it).
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether this disk is a system disk
     *         (has an operating system loaded on it).
     *         </p>
     */
    public Boolean isIsSystemDisk() {
        return isSystemDisk;
    }

    /**
     * <p>
     * A Boolean value indicating whether this disk is a system disk (has an
     * operating system loaded on it).
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether this disk is a system disk
     *         (has an operating system loaded on it).
     *         </p>
     */
    public Boolean getIsSystemDisk() {
        return isSystemDisk;
    }

    /**
     * <p>
     * A Boolean value indicating whether this disk is a system disk (has an
     * operating system loaded on it).
     * </p>
     *
     * @param isSystemDisk <p>
     *            A Boolean value indicating whether this disk is a system disk
     *            (has an operating system loaded on it).
     *            </p>
     */
    public void setIsSystemDisk(Boolean isSystemDisk) {
        this.isSystemDisk = isSystemDisk;
    }

    /**
     * <p>
     * A Boolean value indicating whether this disk is a system disk (has an
     * operating system loaded on it).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isSystemDisk <p>
     *            A Boolean value indicating whether this disk is a system disk
     *            (has an operating system loaded on it).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskInfo withIsSystemDisk(Boolean isSystemDisk) {
        this.isSystemDisk = isSystemDisk;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getPath() != null)
            sb.append("path: " + getPath() + ",");
        if (getSizeInGb() != null)
            sb.append("sizeInGb: " + getSizeInGb() + ",");
        if (getIsSystemDisk() != null)
            sb.append("isSystemDisk: " + getIsSystemDisk());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getSizeInGb() == null) ? 0 : getSizeInGb().hashCode());
        hashCode = prime * hashCode
                + ((getIsSystemDisk() == null) ? 0 : getIsSystemDisk().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiskInfo == false)
            return false;
        DiskInfo other = (DiskInfo) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getSizeInGb() == null ^ this.getSizeInGb() == null)
            return false;
        if (other.getSizeInGb() != null && other.getSizeInGb().equals(this.getSizeInGb()) == false)
            return false;
        if (other.getIsSystemDisk() == null ^ this.getIsSystemDisk() == null)
            return false;
        if (other.getIsSystemDisk() != null
                && other.getIsSystemDisk().equals(this.getIsSystemDisk()) == false)
            return false;
        return true;
    }
}
