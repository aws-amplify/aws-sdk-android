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

public class GetDiskResult implements Serializable {
    /**
     * <p>
     * An object containing information about the disk.
     * </p>
     */
    private Disk disk;

    /**
     * <p>
     * An object containing information about the disk.
     * </p>
     *
     * @return <p>
     *         An object containing information about the disk.
     *         </p>
     */
    public Disk getDisk() {
        return disk;
    }

    /**
     * <p>
     * An object containing information about the disk.
     * </p>
     *
     * @param disk <p>
     *            An object containing information about the disk.
     *            </p>
     */
    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    /**
     * <p>
     * An object containing information about the disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disk <p>
     *            An object containing information about the disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDiskResult withDisk(Disk disk) {
        this.disk = disk;
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
        if (getDisk() != null)
            sb.append("disk: " + getDisk());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisk() == null) ? 0 : getDisk().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDiskResult == false)
            return false;
        GetDiskResult other = (GetDiskResult) obj;

        if (other.getDisk() == null ^ this.getDisk() == null)
            return false;
        if (other.getDisk() != null && other.getDisk().equals(this.getDisk()) == false)
            return false;
        return true;
    }
}
