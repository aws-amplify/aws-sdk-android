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
 * Describes a disk image volume.
 * </p>
 */
public class DiskImageVolumeDescription implements Serializable {
    /**
     * <p>
     * The volume identifier.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     */
    private Long size;

    /**
     * <p>
     * The volume identifier.
     * </p>
     *
     * @return <p>
     *         The volume identifier.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The volume identifier.
     * </p>
     *
     * @param id <p>
     *            The volume identifier.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The volume identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The volume identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskImageVolumeDescription withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     *
     * @return <p>
     *         The size of the volume, in GiB.
     *         </p>
     */
    public Long getSize() {
        return size;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     *
     * @param size <p>
     *            The size of the volume, in GiB.
     *            </p>
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param size <p>
     *            The size of the volume, in GiB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskImageVolumeDescription withSize(Long size) {
        this.size = size;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getSize() != null)
            sb.append("Size: " + getSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiskImageVolumeDescription == false)
            return false;
        DiskImageVolumeDescription other = (DiskImageVolumeDescription) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        return true;
    }
}
