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

public class DescribeVolumeAttributeResult implements Serializable {
    /**
     * <p>
     * The state of <code>autoEnableIO</code> attribute.
     * </p>
     */
    private AttributeBooleanValue autoEnableIO;

    /**
     * <p>
     * A list of product codes.
     * </p>
     */
    private java.util.List<ProductCode> productCodes;

    /**
     * <p>
     * The ID of the volume.
     * </p>
     */
    private String volumeId;

    /**
     * <p>
     * The state of <code>autoEnableIO</code> attribute.
     * </p>
     *
     * @return <p>
     *         The state of <code>autoEnableIO</code> attribute.
     *         </p>
     */
    public AttributeBooleanValue getAutoEnableIO() {
        return autoEnableIO;
    }

    /**
     * <p>
     * The state of <code>autoEnableIO</code> attribute.
     * </p>
     *
     * @param autoEnableIO <p>
     *            The state of <code>autoEnableIO</code> attribute.
     *            </p>
     */
    public void setAutoEnableIO(AttributeBooleanValue autoEnableIO) {
        this.autoEnableIO = autoEnableIO;
    }

    /**
     * <p>
     * The state of <code>autoEnableIO</code> attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoEnableIO <p>
     *            The state of <code>autoEnableIO</code> attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumeAttributeResult withAutoEnableIO(AttributeBooleanValue autoEnableIO) {
        this.autoEnableIO = autoEnableIO;
        return this;
    }

    /**
     * <p>
     * A list of product codes.
     * </p>
     *
     * @return <p>
     *         A list of product codes.
     *         </p>
     */
    public java.util.List<ProductCode> getProductCodes() {
        return productCodes;
    }

    /**
     * <p>
     * A list of product codes.
     * </p>
     *
     * @param productCodes <p>
     *            A list of product codes.
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
     * A list of product codes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCodes <p>
     *            A list of product codes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumeAttributeResult withProductCodes(ProductCode... productCodes) {
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
     * A list of product codes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCodes <p>
     *            A list of product codes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumeAttributeResult withProductCodes(
            java.util.Collection<ProductCode> productCodes) {
        setProductCodes(productCodes);
        return this;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     *
     * @return <p>
     *         The ID of the volume.
     *         </p>
     */
    public String getVolumeId() {
        return volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     *
     * @param volumeId <p>
     *            The ID of the volume.
     *            </p>
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeId <p>
     *            The ID of the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumeAttributeResult withVolumeId(String volumeId) {
        this.volumeId = volumeId;
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
        if (getAutoEnableIO() != null)
            sb.append("AutoEnableIO: " + getAutoEnableIO() + ",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: " + getProductCodes() + ",");
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoEnableIO() == null) ? 0 : getAutoEnableIO().hashCode());
        hashCode = prime * hashCode
                + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVolumeAttributeResult == false)
            return false;
        DescribeVolumeAttributeResult other = (DescribeVolumeAttributeResult) obj;

        if (other.getAutoEnableIO() == null ^ this.getAutoEnableIO() == null)
            return false;
        if (other.getAutoEnableIO() != null
                && other.getAutoEnableIO().equals(this.getAutoEnableIO()) == false)
            return false;
        if (other.getProductCodes() == null ^ this.getProductCodes() == null)
            return false;
        if (other.getProductCodes() != null
                && other.getProductCodes().equals(this.getProductCodes()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        return true;
    }
}
