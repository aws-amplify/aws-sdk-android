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

public class DescribeProductViewResult implements Serializable {
    /**
     * <p>
     * Summary information about the product.
     * </p>
     */
    private ProductViewSummary productViewSummary;

    /**
     * <p>
     * Information about the provisioning artifacts for the product.
     * </p>
     */
    private java.util.List<ProvisioningArtifact> provisioningArtifacts;

    /**
     * <p>
     * Summary information about the product.
     * </p>
     *
     * @return <p>
     *         Summary information about the product.
     *         </p>
     */
    public ProductViewSummary getProductViewSummary() {
        return productViewSummary;
    }

    /**
     * <p>
     * Summary information about the product.
     * </p>
     *
     * @param productViewSummary <p>
     *            Summary information about the product.
     *            </p>
     */
    public void setProductViewSummary(ProductViewSummary productViewSummary) {
        this.productViewSummary = productViewSummary;
    }

    /**
     * <p>
     * Summary information about the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productViewSummary <p>
     *            Summary information about the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProductViewResult withProductViewSummary(ProductViewSummary productViewSummary) {
        this.productViewSummary = productViewSummary;
        return this;
    }

    /**
     * <p>
     * Information about the provisioning artifacts for the product.
     * </p>
     *
     * @return <p>
     *         Information about the provisioning artifacts for the product.
     *         </p>
     */
    public java.util.List<ProvisioningArtifact> getProvisioningArtifacts() {
        return provisioningArtifacts;
    }

    /**
     * <p>
     * Information about the provisioning artifacts for the product.
     * </p>
     *
     * @param provisioningArtifacts <p>
     *            Information about the provisioning artifacts for the product.
     *            </p>
     */
    public void setProvisioningArtifacts(
            java.util.Collection<ProvisioningArtifact> provisioningArtifacts) {
        if (provisioningArtifacts == null) {
            this.provisioningArtifacts = null;
            return;
        }

        this.provisioningArtifacts = new java.util.ArrayList<ProvisioningArtifact>(
                provisioningArtifacts);
    }

    /**
     * <p>
     * Information about the provisioning artifacts for the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisioningArtifacts <p>
     *            Information about the provisioning artifacts for the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProductViewResult withProvisioningArtifacts(
            ProvisioningArtifact... provisioningArtifacts) {
        if (getProvisioningArtifacts() == null) {
            this.provisioningArtifacts = new java.util.ArrayList<ProvisioningArtifact>(
                    provisioningArtifacts.length);
        }
        for (ProvisioningArtifact value : provisioningArtifacts) {
            this.provisioningArtifacts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the provisioning artifacts for the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisioningArtifacts <p>
     *            Information about the provisioning artifacts for the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProductViewResult withProvisioningArtifacts(
            java.util.Collection<ProvisioningArtifact> provisioningArtifacts) {
        setProvisioningArtifacts(provisioningArtifacts);
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
        if (getProvisioningArtifacts() != null)
            sb.append("ProvisioningArtifacts: " + getProvisioningArtifacts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProductViewSummary() == null) ? 0 : getProductViewSummary().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisioningArtifacts() == null) ? 0 : getProvisioningArtifacts().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProductViewResult == false)
            return false;
        DescribeProductViewResult other = (DescribeProductViewResult) obj;

        if (other.getProductViewSummary() == null ^ this.getProductViewSummary() == null)
            return false;
        if (other.getProductViewSummary() != null
                && other.getProductViewSummary().equals(this.getProductViewSummary()) == false)
            return false;
        if (other.getProvisioningArtifacts() == null ^ this.getProvisioningArtifacts() == null)
            return false;
        if (other.getProvisioningArtifacts() != null
                && other.getProvisioningArtifacts().equals(this.getProvisioningArtifacts()) == false)
            return false;
        return true;
    }
}
