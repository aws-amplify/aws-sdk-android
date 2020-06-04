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

public class GetDiskSnapshotResult implements Serializable {
    /**
     * <p>
     * An object containing information about the disk snapshot.
     * </p>
     */
    private DiskSnapshot diskSnapshot;

    /**
     * <p>
     * An object containing information about the disk snapshot.
     * </p>
     *
     * @return <p>
     *         An object containing information about the disk snapshot.
     *         </p>
     */
    public DiskSnapshot getDiskSnapshot() {
        return diskSnapshot;
    }

    /**
     * <p>
     * An object containing information about the disk snapshot.
     * </p>
     *
     * @param diskSnapshot <p>
     *            An object containing information about the disk snapshot.
     *            </p>
     */
    public void setDiskSnapshot(DiskSnapshot diskSnapshot) {
        this.diskSnapshot = diskSnapshot;
    }

    /**
     * <p>
     * An object containing information about the disk snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskSnapshot <p>
     *            An object containing information about the disk snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDiskSnapshotResult withDiskSnapshot(DiskSnapshot diskSnapshot) {
        this.diskSnapshot = diskSnapshot;
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
        if (getDiskSnapshot() != null)
            sb.append("diskSnapshot: " + getDiskSnapshot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDiskSnapshot() == null) ? 0 : getDiskSnapshot().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDiskSnapshotResult == false)
            return false;
        GetDiskSnapshotResult other = (GetDiskSnapshotResult) obj;

        if (other.getDiskSnapshot() == null ^ this.getDiskSnapshot() == null)
            return false;
        if (other.getDiskSnapshot() != null
                && other.getDiskSnapshot().equals(this.getDiskSnapshot()) == false)
            return false;
        return true;
    }
}
