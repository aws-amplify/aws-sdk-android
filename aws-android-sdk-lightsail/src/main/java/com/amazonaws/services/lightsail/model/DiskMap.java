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
 * Describes a block storage disk mapping.
 * </p>
 */
public class DiskMap implements Serializable {
    /**
     * <p>
     * The original disk path exposed to the instance (for example,
     * <code>/dev/sdh</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String originalDiskPath;

    /**
     * <p>
     * The new disk name (e.g., <code>my-new-disk</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String newDiskName;

    /**
     * <p>
     * The original disk path exposed to the instance (for example,
     * <code>/dev/sdh</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The original disk path exposed to the instance (for example,
     *         <code>/dev/sdh</code>).
     *         </p>
     */
    public String getOriginalDiskPath() {
        return originalDiskPath;
    }

    /**
     * <p>
     * The original disk path exposed to the instance (for example,
     * <code>/dev/sdh</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param originalDiskPath <p>
     *            The original disk path exposed to the instance (for example,
     *            <code>/dev/sdh</code>).
     *            </p>
     */
    public void setOriginalDiskPath(String originalDiskPath) {
        this.originalDiskPath = originalDiskPath;
    }

    /**
     * <p>
     * The original disk path exposed to the instance (for example,
     * <code>/dev/sdh</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param originalDiskPath <p>
     *            The original disk path exposed to the instance (for example,
     *            <code>/dev/sdh</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskMap withOriginalDiskPath(String originalDiskPath) {
        this.originalDiskPath = originalDiskPath;
        return this;
    }

    /**
     * <p>
     * The new disk name (e.g., <code>my-new-disk</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The new disk name (e.g., <code>my-new-disk</code>).
     *         </p>
     */
    public String getNewDiskName() {
        return newDiskName;
    }

    /**
     * <p>
     * The new disk name (e.g., <code>my-new-disk</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param newDiskName <p>
     *            The new disk name (e.g., <code>my-new-disk</code>).
     *            </p>
     */
    public void setNewDiskName(String newDiskName) {
        this.newDiskName = newDiskName;
    }

    /**
     * <p>
     * The new disk name (e.g., <code>my-new-disk</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param newDiskName <p>
     *            The new disk name (e.g., <code>my-new-disk</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskMap withNewDiskName(String newDiskName) {
        this.newDiskName = newDiskName;
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
        if (getOriginalDiskPath() != null)
            sb.append("originalDiskPath: " + getOriginalDiskPath() + ",");
        if (getNewDiskName() != null)
            sb.append("newDiskName: " + getNewDiskName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOriginalDiskPath() == null) ? 0 : getOriginalDiskPath().hashCode());
        hashCode = prime * hashCode
                + ((getNewDiskName() == null) ? 0 : getNewDiskName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiskMap == false)
            return false;
        DiskMap other = (DiskMap) obj;

        if (other.getOriginalDiskPath() == null ^ this.getOriginalDiskPath() == null)
            return false;
        if (other.getOriginalDiskPath() != null
                && other.getOriginalDiskPath().equals(this.getOriginalDiskPath()) == false)
            return false;
        if (other.getNewDiskName() == null ^ this.getNewDiskName() == null)
            return false;
        if (other.getNewDiskName() != null
                && other.getNewDiskName().equals(this.getNewDiskName()) == false)
            return false;
        return true;
    }
}
