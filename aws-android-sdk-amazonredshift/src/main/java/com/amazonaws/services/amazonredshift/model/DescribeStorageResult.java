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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

public class DescribeStorageResult implements Serializable {
    /**
     * <p>
     * The total amount of storage currently used for snapshots.
     * </p>
     */
    private Double totalBackupSizeInMegaBytes;

    /**
     * <p>
     * The total amount of storage currently provisioned.
     * </p>
     */
    private Double totalProvisionedStorageInMegaBytes;

    /**
     * <p>
     * The total amount of storage currently used for snapshots.
     * </p>
     *
     * @return <p>
     *         The total amount of storage currently used for snapshots.
     *         </p>
     */
    public Double getTotalBackupSizeInMegaBytes() {
        return totalBackupSizeInMegaBytes;
    }

    /**
     * <p>
     * The total amount of storage currently used for snapshots.
     * </p>
     *
     * @param totalBackupSizeInMegaBytes <p>
     *            The total amount of storage currently used for snapshots.
     *            </p>
     */
    public void setTotalBackupSizeInMegaBytes(Double totalBackupSizeInMegaBytes) {
        this.totalBackupSizeInMegaBytes = totalBackupSizeInMegaBytes;
    }

    /**
     * <p>
     * The total amount of storage currently used for snapshots.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalBackupSizeInMegaBytes <p>
     *            The total amount of storage currently used for snapshots.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStorageResult withTotalBackupSizeInMegaBytes(Double totalBackupSizeInMegaBytes) {
        this.totalBackupSizeInMegaBytes = totalBackupSizeInMegaBytes;
        return this;
    }

    /**
     * <p>
     * The total amount of storage currently provisioned.
     * </p>
     *
     * @return <p>
     *         The total amount of storage currently provisioned.
     *         </p>
     */
    public Double getTotalProvisionedStorageInMegaBytes() {
        return totalProvisionedStorageInMegaBytes;
    }

    /**
     * <p>
     * The total amount of storage currently provisioned.
     * </p>
     *
     * @param totalProvisionedStorageInMegaBytes <p>
     *            The total amount of storage currently provisioned.
     *            </p>
     */
    public void setTotalProvisionedStorageInMegaBytes(Double totalProvisionedStorageInMegaBytes) {
        this.totalProvisionedStorageInMegaBytes = totalProvisionedStorageInMegaBytes;
    }

    /**
     * <p>
     * The total amount of storage currently provisioned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalProvisionedStorageInMegaBytes <p>
     *            The total amount of storage currently provisioned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStorageResult withTotalProvisionedStorageInMegaBytes(
            Double totalProvisionedStorageInMegaBytes) {
        this.totalProvisionedStorageInMegaBytes = totalProvisionedStorageInMegaBytes;
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
        if (getTotalBackupSizeInMegaBytes() != null)
            sb.append("TotalBackupSizeInMegaBytes: " + getTotalBackupSizeInMegaBytes() + ",");
        if (getTotalProvisionedStorageInMegaBytes() != null)
            sb.append("TotalProvisionedStorageInMegaBytes: "
                    + getTotalProvisionedStorageInMegaBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTotalBackupSizeInMegaBytes() == null) ? 0 : getTotalBackupSizeInMegaBytes()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTotalProvisionedStorageInMegaBytes() == null) ? 0
                        : getTotalProvisionedStorageInMegaBytes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStorageResult == false)
            return false;
        DescribeStorageResult other = (DescribeStorageResult) obj;

        if (other.getTotalBackupSizeInMegaBytes() == null
                ^ this.getTotalBackupSizeInMegaBytes() == null)
            return false;
        if (other.getTotalBackupSizeInMegaBytes() != null
                && other.getTotalBackupSizeInMegaBytes().equals(
                        this.getTotalBackupSizeInMegaBytes()) == false)
            return false;
        if (other.getTotalProvisionedStorageInMegaBytes() == null
                ^ this.getTotalProvisionedStorageInMegaBytes() == null)
            return false;
        if (other.getTotalProvisionedStorageInMegaBytes() != null
                && other.getTotalProvisionedStorageInMegaBytes().equals(
                        this.getTotalProvisionedStorageInMegaBytes()) == false)
            return false;
        return true;
    }
}
