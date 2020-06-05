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

public class DescribeProductAsAdminResult implements Serializable {
    /**
     * <p>
     * Information about the product view.
     * </p>
     */
    private ProductViewDetail productViewDetail;

    /**
     * <p>
     * Information about the provisioning artifacts (also known as versions) for
     * the specified product.
     * </p>
     */
    private java.util.List<ProvisioningArtifactSummary> provisioningArtifactSummaries;

    /**
     * <p>
     * Information about the tags associated with the product.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Information about the TagOptions associated with the product.
     * </p>
     */
    private java.util.List<TagOptionDetail> tagOptions;

    /**
     * <p>
     * Information about the associated budgets.
     * </p>
     */
    private java.util.List<BudgetDetail> budgets;

    /**
     * <p>
     * Information about the product view.
     * </p>
     *
     * @return <p>
     *         Information about the product view.
     *         </p>
     */
    public ProductViewDetail getProductViewDetail() {
        return productViewDetail;
    }

    /**
     * <p>
     * Information about the product view.
     * </p>
     *
     * @param productViewDetail <p>
     *            Information about the product view.
     *            </p>
     */
    public void setProductViewDetail(ProductViewDetail productViewDetail) {
        this.productViewDetail = productViewDetail;
    }

    /**
     * <p>
     * Information about the product view.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productViewDetail <p>
     *            Information about the product view.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProductAsAdminResult withProductViewDetail(ProductViewDetail productViewDetail) {
        this.productViewDetail = productViewDetail;
        return this;
    }

    /**
     * <p>
     * Information about the provisioning artifacts (also known as versions) for
     * the specified product.
     * </p>
     *
     * @return <p>
     *         Information about the provisioning artifacts (also known as
     *         versions) for the specified product.
     *         </p>
     */
    public java.util.List<ProvisioningArtifactSummary> getProvisioningArtifactSummaries() {
        return provisioningArtifactSummaries;
    }

    /**
     * <p>
     * Information about the provisioning artifacts (also known as versions) for
     * the specified product.
     * </p>
     *
     * @param provisioningArtifactSummaries <p>
     *            Information about the provisioning artifacts (also known as
     *            versions) for the specified product.
     *            </p>
     */
    public void setProvisioningArtifactSummaries(
            java.util.Collection<ProvisioningArtifactSummary> provisioningArtifactSummaries) {
        if (provisioningArtifactSummaries == null) {
            this.provisioningArtifactSummaries = null;
            return;
        }

        this.provisioningArtifactSummaries = new java.util.ArrayList<ProvisioningArtifactSummary>(
                provisioningArtifactSummaries);
    }

    /**
     * <p>
     * Information about the provisioning artifacts (also known as versions) for
     * the specified product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisioningArtifactSummaries <p>
     *            Information about the provisioning artifacts (also known as
     *            versions) for the specified product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProductAsAdminResult withProvisioningArtifactSummaries(
            ProvisioningArtifactSummary... provisioningArtifactSummaries) {
        if (getProvisioningArtifactSummaries() == null) {
            this.provisioningArtifactSummaries = new java.util.ArrayList<ProvisioningArtifactSummary>(
                    provisioningArtifactSummaries.length);
        }
        for (ProvisioningArtifactSummary value : provisioningArtifactSummaries) {
            this.provisioningArtifactSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the provisioning artifacts (also known as versions) for
     * the specified product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisioningArtifactSummaries <p>
     *            Information about the provisioning artifacts (also known as
     *            versions) for the specified product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProductAsAdminResult withProvisioningArtifactSummaries(
            java.util.Collection<ProvisioningArtifactSummary> provisioningArtifactSummaries) {
        setProvisioningArtifactSummaries(provisioningArtifactSummaries);
        return this;
    }

    /**
     * <p>
     * Information about the tags associated with the product.
     * </p>
     *
     * @return <p>
     *         Information about the tags associated with the product.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Information about the tags associated with the product.
     * </p>
     *
     * @param tags <p>
     *            Information about the tags associated with the product.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Information about the tags associated with the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Information about the tags associated with the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProductAsAdminResult withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the tags associated with the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Information about the tags associated with the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProductAsAdminResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Information about the TagOptions associated with the product.
     * </p>
     *
     * @return <p>
     *         Information about the TagOptions associated with the product.
     *         </p>
     */
    public java.util.List<TagOptionDetail> getTagOptions() {
        return tagOptions;
    }

    /**
     * <p>
     * Information about the TagOptions associated with the product.
     * </p>
     *
     * @param tagOptions <p>
     *            Information about the TagOptions associated with the product.
     *            </p>
     */
    public void setTagOptions(java.util.Collection<TagOptionDetail> tagOptions) {
        if (tagOptions == null) {
            this.tagOptions = null;
            return;
        }

        this.tagOptions = new java.util.ArrayList<TagOptionDetail>(tagOptions);
    }

    /**
     * <p>
     * Information about the TagOptions associated with the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagOptions <p>
     *            Information about the TagOptions associated with the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProductAsAdminResult withTagOptions(TagOptionDetail... tagOptions) {
        if (getTagOptions() == null) {
            this.tagOptions = new java.util.ArrayList<TagOptionDetail>(tagOptions.length);
        }
        for (TagOptionDetail value : tagOptions) {
            this.tagOptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the TagOptions associated with the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagOptions <p>
     *            Information about the TagOptions associated with the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProductAsAdminResult withTagOptions(
            java.util.Collection<TagOptionDetail> tagOptions) {
        setTagOptions(tagOptions);
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
    public DescribeProductAsAdminResult withBudgets(BudgetDetail... budgets) {
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
    public DescribeProductAsAdminResult withBudgets(java.util.Collection<BudgetDetail> budgets) {
        setBudgets(budgets);
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
        if (getProductViewDetail() != null)
            sb.append("ProductViewDetail: " + getProductViewDetail() + ",");
        if (getProvisioningArtifactSummaries() != null)
            sb.append("ProvisioningArtifactSummaries: " + getProvisioningArtifactSummaries() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getTagOptions() != null)
            sb.append("TagOptions: " + getTagOptions() + ",");
        if (getBudgets() != null)
            sb.append("Budgets: " + getBudgets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProductViewDetail() == null) ? 0 : getProductViewDetail().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisioningArtifactSummaries() == null) ? 0
                        : getProvisioningArtifactSummaries().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTagOptions() == null) ? 0 : getTagOptions().hashCode());
        hashCode = prime * hashCode + ((getBudgets() == null) ? 0 : getBudgets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProductAsAdminResult == false)
            return false;
        DescribeProductAsAdminResult other = (DescribeProductAsAdminResult) obj;

        if (other.getProductViewDetail() == null ^ this.getProductViewDetail() == null)
            return false;
        if (other.getProductViewDetail() != null
                && other.getProductViewDetail().equals(this.getProductViewDetail()) == false)
            return false;
        if (other.getProvisioningArtifactSummaries() == null
                ^ this.getProvisioningArtifactSummaries() == null)
            return false;
        if (other.getProvisioningArtifactSummaries() != null
                && other.getProvisioningArtifactSummaries().equals(
                        this.getProvisioningArtifactSummaries()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTagOptions() == null ^ this.getTagOptions() == null)
            return false;
        if (other.getTagOptions() != null
                && other.getTagOptions().equals(this.getTagOptions()) == false)
            return false;
        if (other.getBudgets() == null ^ this.getBudgets() == null)
            return false;
        if (other.getBudgets() != null && other.getBudgets().equals(this.getBudgets()) == false)
            return false;
        return true;
    }
}
