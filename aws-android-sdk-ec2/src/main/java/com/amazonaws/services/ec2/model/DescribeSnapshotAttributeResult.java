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

public class DescribeSnapshotAttributeResult implements Serializable {
    /**
     * <p>
     * The users and groups that have the permissions for creating volumes from
     * the snapshot.
     * </p>
     */
    private java.util.List<CreateVolumePermission> createVolumePermissions;

    /**
     * <p>
     * The product codes.
     * </p>
     */
    private java.util.List<ProductCode> productCodes;

    /**
     * <p>
     * The ID of the EBS snapshot.
     * </p>
     */
    private String snapshotId;

    /**
     * <p>
     * The users and groups that have the permissions for creating volumes from
     * the snapshot.
     * </p>
     *
     * @return <p>
     *         The users and groups that have the permissions for creating
     *         volumes from the snapshot.
     *         </p>
     */
    public java.util.List<CreateVolumePermission> getCreateVolumePermissions() {
        return createVolumePermissions;
    }

    /**
     * <p>
     * The users and groups that have the permissions for creating volumes from
     * the snapshot.
     * </p>
     *
     * @param createVolumePermissions <p>
     *            The users and groups that have the permissions for creating
     *            volumes from the snapshot.
     *            </p>
     */
    public void setCreateVolumePermissions(
            java.util.Collection<CreateVolumePermission> createVolumePermissions) {
        if (createVolumePermissions == null) {
            this.createVolumePermissions = null;
            return;
        }

        this.createVolumePermissions = new java.util.ArrayList<CreateVolumePermission>(
                createVolumePermissions);
    }

    /**
     * <p>
     * The users and groups that have the permissions for creating volumes from
     * the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createVolumePermissions <p>
     *            The users and groups that have the permissions for creating
     *            volumes from the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotAttributeResult withCreateVolumePermissions(
            CreateVolumePermission... createVolumePermissions) {
        if (getCreateVolumePermissions() == null) {
            this.createVolumePermissions = new java.util.ArrayList<CreateVolumePermission>(
                    createVolumePermissions.length);
        }
        for (CreateVolumePermission value : createVolumePermissions) {
            this.createVolumePermissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The users and groups that have the permissions for creating volumes from
     * the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createVolumePermissions <p>
     *            The users and groups that have the permissions for creating
     *            volumes from the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotAttributeResult withCreateVolumePermissions(
            java.util.Collection<CreateVolumePermission> createVolumePermissions) {
        setCreateVolumePermissions(createVolumePermissions);
        return this;
    }

    /**
     * <p>
     * The product codes.
     * </p>
     *
     * @return <p>
     *         The product codes.
     *         </p>
     */
    public java.util.List<ProductCode> getProductCodes() {
        return productCodes;
    }

    /**
     * <p>
     * The product codes.
     * </p>
     *
     * @param productCodes <p>
     *            The product codes.
     *            </p>
     */
    public void setProductCodes(java.util.Collection<ProductCode> productCodes) {
        if (productCodes == null) {
            this.productCodes = null;
            return;
        }

        this.productCodes = new java.util.ArrayList<ProductCode>(productCodes);
    }

    /**
     * <p>
     * The product codes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCodes <p>
     *            The product codes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotAttributeResult withProductCodes(ProductCode... productCodes) {
        if (getProductCodes() == null) {
            this.productCodes = new java.util.ArrayList<ProductCode>(productCodes.length);
        }
        for (ProductCode value : productCodes) {
            this.productCodes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The product codes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCodes <p>
     *            The product codes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotAttributeResult withProductCodes(
            java.util.Collection<ProductCode> productCodes) {
        setProductCodes(productCodes);
        return this;
    }

    /**
     * <p>
     * The ID of the EBS snapshot.
     * </p>
     *
     * @return <p>
     *         The ID of the EBS snapshot.
     *         </p>
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * <p>
     * The ID of the EBS snapshot.
     * </p>
     *
     * @param snapshotId <p>
     *            The ID of the EBS snapshot.
     *            </p>
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the EBS snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotId <p>
     *            The ID of the EBS snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotAttributeResult withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
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
        if (getCreateVolumePermissions() != null)
            sb.append("CreateVolumePermissions: " + getCreateVolumePermissions() + ",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: " + getProductCodes() + ",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCreateVolumePermissions() == null) ? 0 : getCreateVolumePermissions()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSnapshotAttributeResult == false)
            return false;
        DescribeSnapshotAttributeResult other = (DescribeSnapshotAttributeResult) obj;

        if (other.getCreateVolumePermissions() == null ^ this.getCreateVolumePermissions() == null)
            return false;
        if (other.getCreateVolumePermissions() != null
                && other.getCreateVolumePermissions().equals(this.getCreateVolumePermissions()) == false)
            return false;
        if (other.getProductCodes() == null ^ this.getProductCodes() == null)
            return false;
        if (other.getProductCodes() != null
                && other.getProductCodes().equals(this.getProductCodes()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null
                && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        return true;
    }
}
