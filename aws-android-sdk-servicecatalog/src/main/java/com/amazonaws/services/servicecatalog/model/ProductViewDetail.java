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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a product view.
 * </p>
 */
public class ProductViewDetail implements Serializable {
    /**
     * <p>
     * Summary information about the product view.
     * </p>
     */
    private ProductViewSummary productViewSummary;

    /**
     * <p>
     * The status of the product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The product is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Product creation has started; the product is not
     * ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An action failed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED
     */
    private String status;

    /**
     * <p>
     * The ARN of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     */
    private String productARN;

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * Summary information about the product view.
     * </p>
     *
     * @return <p>
     *         Summary information about the product view.
     *         </p>
     */
    public ProductViewSummary getProductViewSummary() {
        return productViewSummary;
    }

    /**
     * <p>
     * Summary information about the product view.
     * </p>
     *
     * @param productViewSummary <p>
     *            Summary information about the product view.
     *            </p>
     */
    public void setProductViewSummary(ProductViewSummary productViewSummary) {
        this.productViewSummary = productViewSummary;
    }

    /**
     * <p>
     * Summary information about the product view.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productViewSummary <p>
     *            Summary information about the product view.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductViewDetail withProductViewSummary(ProductViewSummary productViewSummary) {
        this.productViewSummary = productViewSummary;
        return this;
    }

    /**
     * <p>
     * The status of the product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The product is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Product creation has started; the product is not
     * ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An action failed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED
     *
     * @return <p>
     *         The status of the product.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AVAILABLE</code> - The product is ready for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - Product creation has started; the product
     *         is not ready for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - An action failed.
     *         </p>
     *         </li>
     *         </ul>
     * @see Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The product is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Product creation has started; the product is not
     * ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An action failed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED
     *
     * @param status <p>
     *            The status of the product.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AVAILABLE</code> - The product is ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - Product creation has started; the
     *            product is not ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - An action failed.
     *            </p>
     *            </li>
     *            </ul>
     * @see Status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The product is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Product creation has started; the product is not
     * ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An action failed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED
     *
     * @param status <p>
     *            The status of the product.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AVAILABLE</code> - The product is ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - Product creation has started; the
     *            product is not ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - An action failed.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public ProductViewDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The product is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Product creation has started; the product is not
     * ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An action failed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED
     *
     * @param status <p>
     *            The status of the product.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AVAILABLE</code> - The product is ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - Product creation has started; the
     *            product is not ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - An action failed.
     *            </p>
     *            </li>
     *            </ul>
     * @see Status
     */
    public void setStatus(Status status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The product is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Product creation has started; the product is not
     * ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An action failed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED
     *
     * @param status <p>
     *            The status of the product.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AVAILABLE</code> - The product is ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - Product creation has started; the
     *            product is not ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - An action failed.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public ProductViewDetail withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     *
     * @return <p>
     *         The ARN of the product.
     *         </p>
     */
    public String getProductARN() {
        return productARN;
    }

    /**
     * <p>
     * The ARN of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     *
     * @param productARN <p>
     *            The ARN of the product.
     *            </p>
     */
    public void setProductARN(String productARN) {
        this.productARN = productARN;
    }

    /**
     * <p>
     * The ARN of the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     *
     * @param productARN <p>
     *            The ARN of the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductViewDetail withProductARN(String productARN) {
        this.productARN = productARN;
        return this;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     *
     * @return <p>
     *         The UTC time stamp of the creation time.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     *
     * @param createdTime <p>
     *            The UTC time stamp of the creation time.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The UTC time stamp of the creation time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductViewDetail withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
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
        if (getProductViewSummary() != null)
            sb.append("ProductViewSummary: " + getProductViewSummary() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getProductARN() != null)
            sb.append("ProductARN: " + getProductARN() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProductViewSummary() == null) ? 0 : getProductViewSummary().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getProductARN() == null) ? 0 : getProductARN().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductViewDetail == false)
            return false;
        ProductViewDetail other = (ProductViewDetail) obj;

        if (other.getProductViewSummary() == null ^ this.getProductViewSummary() == null)
            return false;
        if (other.getProductViewSummary() != null
                && other.getProductViewSummary().equals(this.getProductViewSummary()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getProductARN() == null ^ this.getProductARN() == null)
            return false;
        if (other.getProductARN() != null
                && other.getProductARN().equals(this.getProductARN()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }
}
