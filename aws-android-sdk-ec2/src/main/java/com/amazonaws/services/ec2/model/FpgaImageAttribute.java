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
 * Describes an Amazon FPGA image (AFI) attribute.
 * </p>
 */
public class FpgaImageAttribute implements Serializable {
    /**
     * <p>
     * The ID of the AFI.
     * </p>
     */
    private String fpgaImageId;

    /**
     * <p>
     * The name of the AFI.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The description of the AFI.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The load permissions.
     * </p>
     */
    private java.util.List<LoadPermission> loadPermissions;

    /**
     * <p>
     * The product codes.
     * </p>
     */
    private java.util.List<ProductCode> productCodes;

    /**
     * <p>
     * The ID of the AFI.
     * </p>
     *
     * @return <p>
     *         The ID of the AFI.
     *         </p>
     */
    public String getFpgaImageId() {
        return fpgaImageId;
    }

    /**
     * <p>
     * The ID of the AFI.
     * </p>
     *
     * @param fpgaImageId <p>
     *            The ID of the AFI.
     *            </p>
     */
    public void setFpgaImageId(String fpgaImageId) {
        this.fpgaImageId = fpgaImageId;
    }

    /**
     * <p>
     * The ID of the AFI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fpgaImageId <p>
     *            The ID of the AFI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImageAttribute withFpgaImageId(String fpgaImageId) {
        this.fpgaImageId = fpgaImageId;
        return this;
    }

    /**
     * <p>
     * The name of the AFI.
     * </p>
     *
     * @return <p>
     *         The name of the AFI.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the AFI.
     * </p>
     *
     * @param name <p>
     *            The name of the AFI.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the AFI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the AFI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImageAttribute withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the AFI.
     * </p>
     *
     * @return <p>
     *         The description of the AFI.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the AFI.
     * </p>
     *
     * @param description <p>
     *            The description of the AFI.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the AFI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the AFI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImageAttribute withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The load permissions.
     * </p>
     *
     * @return <p>
     *         The load permissions.
     *         </p>
     */
    public java.util.List<LoadPermission> getLoadPermissions() {
        return loadPermissions;
    }

    /**
     * <p>
     * The load permissions.
     * </p>
     *
     * @param loadPermissions <p>
     *            The load permissions.
     *            </p>
     */
    public void setLoadPermissions(java.util.Collection<LoadPermission> loadPermissions) {
        if (loadPermissions == null) {
            this.loadPermissions = null;
            return;
        }

        this.loadPermissions = new java.util.ArrayList<LoadPermission>(loadPermissions);
    }

    /**
     * <p>
     * The load permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadPermissions <p>
     *            The load permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImageAttribute withLoadPermissions(LoadPermission... loadPermissions) {
        if (getLoadPermissions() == null) {
            this.loadPermissions = new java.util.ArrayList<LoadPermission>(loadPermissions.length);
        }
        for (LoadPermission value : loadPermissions) {
            this.loadPermissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The load permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadPermissions <p>
     *            The load permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImageAttribute withLoadPermissions(
            java.util.Collection<LoadPermission> loadPermissions) {
        setLoadPermissions(loadPermissions);
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
    public FpgaImageAttribute withProductCodes(ProductCode... productCodes) {
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
    public FpgaImageAttribute withProductCodes(java.util.Collection<ProductCode> productCodes) {
        setProductCodes(productCodes);
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
        if (getFpgaImageId() != null)
            sb.append("FpgaImageId: " + getFpgaImageId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getLoadPermissions() != null)
            sb.append("LoadPermissions: " + getLoadPermissions() + ",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: " + getProductCodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFpgaImageId() == null) ? 0 : getFpgaImageId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getLoadPermissions() == null) ? 0 : getLoadPermissions().hashCode());
        hashCode = prime * hashCode
                + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FpgaImageAttribute == false)
            return false;
        FpgaImageAttribute other = (FpgaImageAttribute) obj;

        if (other.getFpgaImageId() == null ^ this.getFpgaImageId() == null)
            return false;
        if (other.getFpgaImageId() != null
                && other.getFpgaImageId().equals(this.getFpgaImageId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLoadPermissions() == null ^ this.getLoadPermissions() == null)
            return false;
        if (other.getLoadPermissions() != null
                && other.getLoadPermissions().equals(this.getLoadPermissions()) == false)
            return false;
        if (other.getProductCodes() == null ^ this.getProductCodes() == null)
            return false;
        if (other.getProductCodes() != null
                && other.getProductCodes().equals(this.getProductCodes()) == false)
            return false;
        return true;
    }
}
