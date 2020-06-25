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
 * Describes a product code.
 * </p>
 */
public class ProductCode implements Serializable {
    /**
     * <p>
     * The product code.
     * </p>
     */
    private String productCodeId;

    /**
     * <p>
     * The type of product code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>devpay, marketplace
     */
    private String productCodeType;

    /**
     * <p>
     * The product code.
     * </p>
     *
     * @return <p>
     *         The product code.
     *         </p>
     */
    public String getProductCodeId() {
        return productCodeId;
    }

    /**
     * <p>
     * The product code.
     * </p>
     *
     * @param productCodeId <p>
     *            The product code.
     *            </p>
     */
    public void setProductCodeId(String productCodeId) {
        this.productCodeId = productCodeId;
    }

    /**
     * <p>
     * The product code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCodeId <p>
     *            The product code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductCode withProductCodeId(String productCodeId) {
        this.productCodeId = productCodeId;
        return this;
    }

    /**
     * <p>
     * The type of product code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>devpay, marketplace
     *
     * @return <p>
     *         The type of product code.
     *         </p>
     * @see ProductCodeValues
     */
    public String getProductCodeType() {
        return productCodeType;
    }

    /**
     * <p>
     * The type of product code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>devpay, marketplace
     *
     * @param productCodeType <p>
     *            The type of product code.
     *            </p>
     * @see ProductCodeValues
     */
    public void setProductCodeType(String productCodeType) {
        this.productCodeType = productCodeType;
    }

    /**
     * <p>
     * The type of product code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>devpay, marketplace
     *
     * @param productCodeType <p>
     *            The type of product code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProductCodeValues
     */
    public ProductCode withProductCodeType(String productCodeType) {
        this.productCodeType = productCodeType;
        return this;
    }

    /**
     * <p>
     * The type of product code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>devpay, marketplace
     *
     * @param productCodeType <p>
     *            The type of product code.
     *            </p>
     * @see ProductCodeValues
     */
    public void setProductCodeType(ProductCodeValues productCodeType) {
        this.productCodeType = productCodeType.toString();
    }

    /**
     * <p>
     * The type of product code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>devpay, marketplace
     *
     * @param productCodeType <p>
     *            The type of product code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProductCodeValues
     */
    public ProductCode withProductCodeType(ProductCodeValues productCodeType) {
        this.productCodeType = productCodeType.toString();
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
        if (getProductCodeId() != null)
            sb.append("ProductCodeId: " + getProductCodeId() + ",");
        if (getProductCodeType() != null)
            sb.append("ProductCodeType: " + getProductCodeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProductCodeId() == null) ? 0 : getProductCodeId().hashCode());
        hashCode = prime * hashCode
                + ((getProductCodeType() == null) ? 0 : getProductCodeType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductCode == false)
            return false;
        ProductCode other = (ProductCode) obj;

        if (other.getProductCodeId() == null ^ this.getProductCodeId() == null)
            return false;
        if (other.getProductCodeId() != null
                && other.getProductCodeId().equals(this.getProductCodeId()) == false)
            return false;
        if (other.getProductCodeType() == null ^ this.getProductCodeType() == null)
            return false;
        if (other.getProductCodeType() != null
                && other.getProductCodeType().equals(this.getProductCodeType()) == false)
            return false;
        return true;
    }
}
