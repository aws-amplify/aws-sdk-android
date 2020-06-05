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

public class DescribeProductResult implements Serializable {
    /**
     * <p>
     * Summary information about the product view.
     * </p>
     */
    private ProductViewSummary productViewSummary;

    /**
     * <p>
     * Information about the provisioning artifacts for the specified product.
     * </p>
     */
    private java.util.List<ProvisioningArtifact> provisioningArtifacts;

    /**
     * <p>
     * Information about the associated budgets.
     * </p>
     */
    private java.util.List<BudgetDetail> budgets;

    /**
     * <p>
     * Information about the associated launch paths.
     * </p>
     */
    private java.util.List<LaunchPath> launchPaths;

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
    public DescribeProductResult withProductViewSummary(ProductViewSummary productViewSummary) {
        this.productViewSummary = productViewSummary;
        return this;
    }

    /**
     * <p>
     * Information about the provisioning artifacts for the specified product.
     * </p>
     *
     * @return <p>
     *         Information about the provisioning artifacts for the specified
     *         product.
     *         </p>
     */
    public java.util.List<ProvisioningArtifact> getProvisioningArtifacts() {
        return provisioningArtifacts;
    }

    /**
     * <p>
     * Information about the provisioning artifacts for the specified product.
     * </p>
     *
     * @param provisioningArtifacts <p>
     *            Information about the provisioning artifacts for the specified
     *            product.
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
     * Information about the provisioning artifacts for the specified product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisioningArtifacts <p>
     *            Information about the provisioning artifacts for the specified
     *            product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProductResult withProvisioningArtifacts(
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
     * Information about the provisioning artifacts for the specified product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisioningArtifacts <p>
     *            Information about the provisioning artifacts for the specified
     *            product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProductResult withProvisioningArtifacts(
            java.util.Collection<ProvisioningArtifact> provisioningArtifacts) {
        setProvisioningArtifacts(provisioningArtifacts);
        return this;
    }

    /**
     * <p>
     * Information about the associated budgets.
     * </p>
     *
     * @return <p>
     *         Information about the associated budgets.
     *         </p>
     */
    public java.util.List<BudgetDetail> getBudgets() {
        return budgets;
    }

    /**
     * <p>
     * Information about the associated budgets.
     * </p>
     *
     * @param budgets <p>
     *            Information about the associated budgets.
     *            </p>
     */
    public void setBudgets(java.util.Collection<BudgetDetail> budgets) {
        if (budgets == null) {
            this.budgets = null;
            return;
        }

        this.budgets = new java.util.ArrayList<BudgetDetail>(budgets);
    }

    /**
     * <p>
     * Information about the associated budgets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param budgets <p>
     *            Information about the associated budgets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProductResult withBudgets(BudgetDetail... budgets) {
        if (getBudgets() == null) {
            this.budgets = new java.util.ArrayList<BudgetDetail>(budgets.length);
        }
        for (BudgetDetail value : budgets) {
            this.budgets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the associated budgets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param budgets <p>
     *            Information about the associated budgets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProductResult withBudgets(java.util.Collection<BudgetDetail> budgets) {
        setBudgets(budgets);
        return this;
    }

    /**
     * <p>
     * Information about the associated launch paths.
     * </p>
     *
     * @return <p>
     *         Information about the associated launch paths.
     *         </p>
     */
    public java.util.List<LaunchPath> getLaunchPaths() {
        return launchPaths;
    }

    /**
     * <p>
     * Information about the associated launch paths.
     * </p>
     *
     * @param launchPaths <p>
     *            Information about the associated launch paths.
     *            </p>
     */
    public void setLaunchPaths(java.util.Collection<LaunchPath> launchPaths) {
        if (launchPaths == null) {
            this.launchPaths = null;
            return;
        }

        this.launchPaths = new java.util.ArrayList<LaunchPath>(launchPaths);
    }

    /**
     * <p>
     * Information about the associated launch paths.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchPaths <p>
     *            Information about the associated launch paths.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProductResult withLaunchPaths(LaunchPath... launchPaths) {
        if (getLaunchPaths() == null) {
            this.launchPaths = new java.util.ArrayList<LaunchPath>(launchPaths.length);
        }
        for (LaunchPath value : launchPaths) {
            this.launchPaths.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the associated launch paths.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchPaths <p>
     *            Information about the associated launch paths.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProductResult withLaunchPaths(java.util.Collection<LaunchPath> launchPaths) {
        setLaunchPaths(launchPaths);
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
            sb.append("ProvisioningArtifacts: " + getProvisioningArtifacts() + ",");
        if (getBudgets() != null)
            sb.append("Budgets: " + getBudgets() + ",");
        if (getLaunchPaths() != null)
            sb.append("LaunchPaths: " + getLaunchPaths());
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
        hashCode = prime * hashCode + ((getBudgets() == null) ? 0 : getBudgets().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchPaths() == null) ? 0 : getLaunchPaths().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProductResult == false)
            return false;
        DescribeProductResult other = (DescribeProductResult) obj;

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
        if (other.getBudgets() == null ^ this.getBudgets() == null)
            return false;
        if (other.getBudgets() != null && other.getBudgets().equals(this.getBudgets()) == false)
            return false;
        if (other.getLaunchPaths() == null ^ this.getLaunchPaths() == null)
            return false;
        if (other.getLaunchPaths() != null
                && other.getLaunchPaths().equals(this.getLaunchPaths()) == false)
            return false;
        return true;
    }
}
