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
 * Describes the disk.
 * </p>
 */
public class DiskInfo implements Serializable {
    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     */
    private Long sizeInGB;

    /**
     * <p>
     * The number of disks with this configuration.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * The type of disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hdd, ssd
     */
    private String type;

    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     *
     * @return <p>
     *         The size of the disk in GB.
     *         </p>
     */
    public Long getSizeInGB() {
        return sizeInGB;
    }

    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     *
     * @param sizeInGB <p>
     *            The size of the disk in GB.
     *            </p>
     */
    public void setSizeInGB(Long sizeInGB) {
        this.sizeInGB = sizeInGB;
    }

    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizeInGB <p>
     *            The size of the disk in GB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskInfo withSizeInGB(Long sizeInGB) {
        this.sizeInGB = sizeInGB;
        return this;
    }

    /**
     * <p>
     * The number of disks with this configuration.
     * </p>
     *
     * @return <p>
     *         The number of disks with this configuration.
     *         </p>
     */
    public Integer getCount() {
        return count;
    }

    /**
     * <p>
     * The number of disks with this configuration.
     * </p>
     *
     * @param count <p>
     *            The number of disks with this configuration.
     *            </p>
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of disks with this configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param count <p>
     *            The number of disks with this configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskInfo withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * <p>
     * The type of disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hdd, ssd
     *
     * @return <p>
     *         The type of disk.
     *         </p>
     * @see DiskType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hdd, ssd
     *
     * @param type <p>
     *            The type of disk.
     *            </p>
     * @see DiskType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hdd, ssd
     *
     * @param type <p>
     *            The type of disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DiskType
     */
    public DiskInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hdd, ssd
     *
     * @param type <p>
     *            The type of disk.
     *            </p>
     * @see DiskType
     */
    public void setType(DiskType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hdd, ssd
     *
     * @param type <p>
     *            The type of disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DiskType
     */
    public DiskInfo withType(DiskType type) {
        this.type = type.toString();
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
        if (getSizeInGB() != null)
            sb.append("SizeInGB: " + getSizeInGB() + ",");
        if (getCount() != null)
            sb.append("Count: " + getCount() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSizeInGB() == null) ? 0 : getSizeInGB().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
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

        if (other.getSizeInGB() == null ^ this.getSizeInGB() == null)
            return false;
        if (other.getSizeInGB() != null && other.getSizeInGB().equals(this.getSizeInGB()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
