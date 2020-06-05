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
 * An object that contains summary information about a product view and a
 * provisioning artifact.
 * </p>
 */
public class ProvisioningArtifactView implements Serializable {
    /**
     * <p>
     * Summary information about a product view.
     * </p>
     */
    private ProductViewSummary productViewSummary;

    /**
     * <p>
     * Information about a provisioning artifact. A provisioning artifact is
     * also known as a product version.
     * </p>
     */
    private ProvisioningArtifact provisioningArtifact;

    /**
     * <p>
     * Summary information about a product view.
     * </p>
     *
     * @return <p>
     *         Summary information about a product view.
     *         </p>
     */
    public ProductViewSummary getProductViewSummary() {
        return productViewSummary;
    }

    /**
     * <p>
     * Summary information about a product view.
     * </p>
     *
     * @param productViewSummary <p>
     *            Summary information about a product view.
     *            </p>
     */
    public void setProductViewSummary(ProductViewSummary productViewSummary) {
        this.productViewSummary = productViewSummary;
    }

    /**
     * <p>
     * Summary information about a product view.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productViewSummary <p>
     *            Summary information about a product view.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactView withProductViewSummary(ProductViewSummary productViewSummary) {
        this.productViewSummary = productViewSummary;
        return this;
    }

    /**
     * <p>
     * Information about a provisioning artifact. A provisioning artifact is
     * also known as a product version.
     * </p>
     *
     * @return <p>
     *         Information about a provisioning artifact. A provisioning
     *         artifact is also known as a product version.
     *         </p>
     */
    public ProvisioningArtifact getProvisioningArtifact() {
        return provisioningArtifact;
    }

    /**
     * <p>
     * Information about a provisioning artifact. A provisioning artifact is
     * also known as a product version.
     * </p>
     *
     * @param provisioningArtifact <p>
     *            Information about a provisioning artifact. A provisioning
     *            artifact is also known as a product version.
     *            </p>
     */
    public void setProvisioningArtifact(ProvisioningArtifact provisioningArtifact) {
        this.provisioningArtifact = provisioningArtifact;
    }

    /**
     * <p>
     * Information about a provisioning artifact. A provisioning artifact is
     * also known as a product version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisioningArtifact <p>
     *            Information about a provisioning artifact. A provisioning
     *            artifact is also known as a product version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactView withProvisioningArtifact(
            ProvisioningArtifact provisioningArtifact) {
        this.provisioningArtifact = provisioningArtifact;
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
        if (getProvisioningArtifact() != null)
            sb.append("ProvisioningArtifact: " + getProvisioningArtifact());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProductViewSummary() == null) ? 0 : getProductViewSummary().hashCode());
        hashCode = prime * hashCode
                + ((getProvisioningArtifact() == null) ? 0 : getProvisioningArtifact().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisioningArtifactView == false)
            return false;
        ProvisioningArtifactView other = (ProvisioningArtifactView) obj;

        if (other.getProductViewSummary() == null ^ this.getProductViewSummary() == null)
            return false;
        if (other.getProductViewSummary() != null
                && other.getProductViewSummary().equals(this.getProductViewSummary()) == false)
            return false;
        if (other.getProvisioningArtifact() == null ^ this.getProvisioningArtifact() == null)
            return false;
        if (other.getProvisioningArtifact() != null
                && other.getProvisioningArtifact().equals(this.getProvisioningArtifact()) == false)
            return false;
        return true;
    }
}
