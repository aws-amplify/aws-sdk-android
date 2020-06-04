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
 * Describes a block storage disk that is attached to an instance, and is
 * included in an automatic snapshot.
 * </p>
 */
public class AttachedDisk implements Serializable {
    /**
     * <p>
     * The path of the disk (e.g., <code>/dev/xvdf</code>).
     * </p>
     */
    private String path;

    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     */
    private Integer sizeInGb;

    /**
     * <p>
     * The path of the disk (e.g., <code>/dev/xvdf</code>).
     * </p>
     *
     * @return <p>
     *         The path of the disk (e.g., <code>/dev/xvdf</code>).
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The path of the disk (e.g., <code>/dev/xvdf</code>).
     * </p>
     *
     * @param path <p>
     *            The path of the disk (e.g., <code>/dev/xvdf</code>).
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path of the disk (e.g., <code>/dev/xvdf</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param path <p>
     *            The path of the disk (e.g., <code>/dev/xvdf</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachedDisk withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     *
     * @return <p>
     *         The size of the disk in GB.
     *         </p>
     */
    public Integer getSizeInGb() {
        return sizeInGb;
    }

    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     *
     * @param sizeInGb <p>
     *            The size of the disk in GB.
     *            </p>
     */
    public void setSizeInGb(Integer sizeInGb) {
        this.sizeInGb = sizeInGb;
    }

    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizeInGb <p>
     *            The size of the disk in GB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachedDisk withSizeInGb(Integer sizeInGb) {
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
        if (getPath() != null)
            sb.append("path: " + getPath() + ",");
        if (getSizeInGb() != null)
            sb.append("sizeInGb: " + getSizeInGb());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getSizeInGb() == null) ? 0 : getSizeInGb().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachedDisk == false)
            return false;
        AttachedDisk other = (AttachedDisk) obj;

        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getSizeInGb() == null ^ this.getSizeInGb() == null)
            return false;
        if (other.getSizeInGb() != null && other.getSizeInGb().equals(this.getSizeInGb()) == false)
            return false;
        return true;
    }
}
