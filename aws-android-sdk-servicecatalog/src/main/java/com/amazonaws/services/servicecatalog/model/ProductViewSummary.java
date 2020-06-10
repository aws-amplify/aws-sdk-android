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
 * Summary information about a product view.
 * </p>
 */
public class ProductViewSummary implements Serializable {
    /**
     * <p>
     * The product view identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String id;

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String productId;

    /**
     * <p>
     * The name of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     */
    private String name;

    /**
     * <p>
     * The owner of the product. Contact the product administrator for the
     * significance of this value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     */
    private String owner;

    /**
     * <p>
     * Short description of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     */
    private String shortDescription;

    /**
     * <p>
     * The product type. Contact the product administrator for the significance
     * of this value. If this value is <code>MARKETPLACE</code>, the product was
     * created by AWS Marketplace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     * <b>Allowed Values: </b>CLOUD_FORMATION_TEMPLATE, MARKETPLACE
     */
    private String type;

    /**
     * <p>
     * The distributor of the product. Contact the product administrator for the
     * significance of this value.
     * </p>
     */
    private String distributor;

    /**
     * <p>
     * Indicates whether the product has a default path. If the product does not
     * have a default path, call <a>ListLaunchPaths</a> to disambiguate between
     * paths. Otherwise, <a>ListLaunchPaths</a> is not required, and the output
     * of <a>ProductViewSummary</a> can be used directly with
     * <a>DescribeProvisioningParameters</a>.
     * </p>
     */
    private Boolean hasDefaultPath;

    /**
     * <p>
     * The email contact information to obtain support for this Product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     */
    private String supportEmail;

    /**
     * <p>
     * The description of the support for this Product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     */
    private String supportDescription;

    /**
     * <p>
     * The URL information to obtain support for this Product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2083<br/>
     */
    private String supportUrl;

    /**
     * <p>
     * The product view identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The product view identifier.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The product view identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param id <p>
     *            The product view identifier.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The product view identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param id <p>
     *            The product view identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductViewSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The product identifier.
     *         </p>
     */
    public String getProductId() {
        return productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param productId <p>
     *            The product identifier.
     *            </p>
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param productId <p>
     *            The product identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductViewSummary withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * <p>
     * The name of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @return <p>
     *         The name of the product.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param name <p>
     *            The name of the product.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param name <p>
     *            The name of the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductViewSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The owner of the product. Contact the product administrator for the
     * significance of this value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @return <p>
     *         The owner of the product. Contact the product administrator for
     *         the significance of this value.
     *         </p>
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <p>
     * The owner of the product. Contact the product administrator for the
     * significance of this value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param owner <p>
     *            The owner of the product. Contact the product administrator
     *            for the significance of this value.
     *            </p>
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the product. Contact the product administrator for the
     * significance of this value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param owner <p>
     *            The owner of the product. Contact the product administrator
     *            for the significance of this value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductViewSummary withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * Short description of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @return <p>
     *         Short description of the product.
     *         </p>
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * <p>
     * Short description of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param shortDescription <p>
     *            Short description of the product.
     *            </p>
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * <p>
     * Short description of the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param shortDescription <p>
     *            Short description of the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductViewSummary withShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    /**
     * <p>
     * The product type. Contact the product administrator for the significance
     * of this value. If this value is <code>MARKETPLACE</code>, the product was
     * created by AWS Marketplace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     * <b>Allowed Values: </b>CLOUD_FORMATION_TEMPLATE, MARKETPLACE
     *
     * @return <p>
     *         The product type. Contact the product administrator for the
     *         significance of this value. If this value is
     *         <code>MARKETPLACE</code>, the product was created by AWS
     *         Marketplace.
     *         </p>
     * @see ProductType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The product type. Contact the product administrator for the significance
     * of this value. If this value is <code>MARKETPLACE</code>, the product was
     * created by AWS Marketplace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     * <b>Allowed Values: </b>CLOUD_FORMATION_TEMPLATE, MARKETPLACE
     *
     * @param type <p>
     *            The product type. Contact the product administrator for the
     *            significance of this value. If this value is
     *            <code>MARKETPLACE</code>, the product was created by AWS
     *            Marketplace.
     *            </p>
     * @see ProductType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The product type. Contact the product administrator for the significance
     * of this value. If this value is <code>MARKETPLACE</code>, the product was
     * created by AWS Marketplace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     * <b>Allowed Values: </b>CLOUD_FORMATION_TEMPLATE, MARKETPLACE
     *
     * @param type <p>
     *            The product type. Contact the product administrator for the
     *            significance of this value. If this value is
     *            <code>MARKETPLACE</code>, the product was created by AWS
     *            Marketplace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProductType
     */
    public ProductViewSummary withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The product type. Contact the product administrator for the significance
     * of this value. If this value is <code>MARKETPLACE</code>, the product was
     * created by AWS Marketplace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     * <b>Allowed Values: </b>CLOUD_FORMATION_TEMPLATE, MARKETPLACE
     *
     * @param type <p>
     *            The product type. Contact the product administrator for the
     *            significance of this value. If this value is
     *            <code>MARKETPLACE</code>, the product was created by AWS
     *            Marketplace.
     *            </p>
     * @see ProductType
     */
    public void setType(ProductType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The product type. Contact the product administrator for the significance
     * of this value. If this value is <code>MARKETPLACE</code>, the product was
     * created by AWS Marketplace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     * <b>Allowed Values: </b>CLOUD_FORMATION_TEMPLATE, MARKETPLACE
     *
     * @param type <p>
     *            The product type. Contact the product administrator for the
     *            significance of this value. If this value is
     *            <code>MARKETPLACE</code>, the product was created by AWS
     *            Marketplace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProductType
     */
    public ProductViewSummary withType(ProductType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The distributor of the product. Contact the product administrator for the
     * significance of this value.
     * </p>
     *
     * @return <p>
     *         The distributor of the product. Contact the product administrator
     *         for the significance of this value.
     *         </p>
     */
    public String getDistributor() {
        return distributor;
    }

    /**
     * <p>
     * The distributor of the product. Contact the product administrator for the
     * significance of this value.
     * </p>
     *
     * @param distributor <p>
     *            The distributor of the product. Contact the product
     *            administrator for the significance of this value.
     *            </p>
     */
    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    /**
     * <p>
     * The distributor of the product. Contact the product administrator for the
     * significance of this value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param distributor <p>
     *            The distributor of the product. Contact the product
     *            administrator for the significance of this value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductViewSummary withDistributor(String distributor) {
        this.distributor = distributor;
        return this;
    }

    /**
     * <p>
     * Indicates whether the product has a default path. If the product does not
     * have a default path, call <a>ListLaunchPaths</a> to disambiguate between
     * paths. Otherwise, <a>ListLaunchPaths</a> is not required, and the output
     * of <a>ProductViewSummary</a> can be used directly with
     * <a>DescribeProvisioningParameters</a>.
     * </p>
     *
     * @return <p>
     *         Indicates whether the product has a default path. If the product
     *         does not have a default path, call <a>ListLaunchPaths</a> to
     *         disambiguate between paths. Otherwise, <a>ListLaunchPaths</a> is
     *         not required, and the output of <a>ProductViewSummary</a> can be
     *         used directly with <a>DescribeProvisioningParameters</a>.
     *         </p>
     */
    public Boolean isHasDefaultPath() {
        return hasDefaultPath;
    }

    /**
     * <p>
     * Indicates whether the product has a default path. If the product does not
     * have a default path, call <a>ListLaunchPaths</a> to disambiguate between
     * paths. Otherwise, <a>ListLaunchPaths</a> is not required, and the output
     * of <a>ProductViewSummary</a> can be used directly with
     * <a>DescribeProvisioningParameters</a>.
     * </p>
     *
     * @return <p>
     *         Indicates whether the product has a default path. If the product
     *         does not have a default path, call <a>ListLaunchPaths</a> to
     *         disambiguate between paths. Otherwise, <a>ListLaunchPaths</a> is
     *         not required, and the output of <a>ProductViewSummary</a> can be
     *         used directly with <a>DescribeProvisioningParameters</a>.
     *         </p>
     */
    public Boolean getHasDefaultPath() {
        return hasDefaultPath;
    }

    /**
     * <p>
     * Indicates whether the product has a default path. If the product does not
     * have a default path, call <a>ListLaunchPaths</a> to disambiguate between
     * paths. Otherwise, <a>ListLaunchPaths</a> is not required, and the output
     * of <a>ProductViewSummary</a> can be used directly with
     * <a>DescribeProvisioningParameters</a>.
     * </p>
     *
     * @param hasDefaultPath <p>
     *            Indicates whether the product has a default path. If the
     *            product does not have a default path, call
     *            <a>ListLaunchPaths</a> to disambiguate between paths.
     *            Otherwise, <a>ListLaunchPaths</a> is not required, and the
     *            output of <a>ProductViewSummary</a> can be used directly with
     *            <a>DescribeProvisioningParameters</a>.
     *            </p>
     */
    public void setHasDefaultPath(Boolean hasDefaultPath) {
        this.hasDefaultPath = hasDefaultPath;
    }

    /**
     * <p>
     * Indicates whether the product has a default path. If the product does not
     * have a default path, call <a>ListLaunchPaths</a> to disambiguate between
     * paths. Otherwise, <a>ListLaunchPaths</a> is not required, and the output
     * of <a>ProductViewSummary</a> can be used directly with
     * <a>DescribeProvisioningParameters</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hasDefaultPath <p>
     *            Indicates whether the product has a default path. If the
     *            product does not have a default path, call
     *            <a>ListLaunchPaths</a> to disambiguate between paths.
     *            Otherwise, <a>ListLaunchPaths</a> is not required, and the
     *            output of <a>ProductViewSummary</a> can be used directly with
     *            <a>DescribeProvisioningParameters</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductViewSummary withHasDefaultPath(Boolean hasDefaultPath) {
        this.hasDefaultPath = hasDefaultPath;
        return this;
    }

    /**
     * <p>
     * The email contact information to obtain support for this Product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     *
     * @return <p>
     *         The email contact information to obtain support for this Product.
     *         </p>
     */
    public String getSupportEmail() {
        return supportEmail;
    }

    /**
     * <p>
     * The email contact information to obtain support for this Product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     *
     * @param supportEmail <p>
     *            The email contact information to obtain support for this
     *            Product.
     *            </p>
     */
    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    /**
     * <p>
     * The email contact information to obtain support for this Product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     *
     * @param supportEmail <p>
     *            The email contact information to obtain support for this
     *            Product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductViewSummary withSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
        return this;
    }

    /**
     * <p>
     * The description of the support for this Product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @return <p>
     *         The description of the support for this Product.
     *         </p>
     */
    public String getSupportDescription() {
        return supportDescription;
    }

    /**
     * <p>
     * The description of the support for this Product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param supportDescription <p>
     *            The description of the support for this Product.
     *            </p>
     */
    public void setSupportDescription(String supportDescription) {
        this.supportDescription = supportDescription;
    }

    /**
     * <p>
     * The description of the support for this Product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param supportDescription <p>
     *            The description of the support for this Product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductViewSummary withSupportDescription(String supportDescription) {
        this.supportDescription = supportDescription;
        return this;
    }

    /**
     * <p>
     * The URL information to obtain support for this Product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2083<br/>
     *
     * @return <p>
     *         The URL information to obtain support for this Product.
     *         </p>
     */
    public String getSupportUrl() {
        return supportUrl;
    }

    /**
     * <p>
     * The URL information to obtain support for this Product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2083<br/>
     *
     * @param supportUrl <p>
     *            The URL information to obtain support for this Product.
     *            </p>
     */
    public void setSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
    }

    /**
     * <p>
     * The URL information to obtain support for this Product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2083<br/>
     *
     * @param supportUrl <p>
     *            The URL information to obtain support for this Product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductViewSummary withSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getProductId() != null)
            sb.append("ProductId: " + getProductId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getOwner() != null)
            sb.append("Owner: " + getOwner() + ",");
        if (getShortDescription() != null)
            sb.append("ShortDescription: " + getShortDescription() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getDistributor() != null)
            sb.append("Distributor: " + getDistributor() + ",");
        if (getHasDefaultPath() != null)
            sb.append("HasDefaultPath: " + getHasDefaultPath() + ",");
        if (getSupportEmail() != null)
            sb.append("SupportEmail: " + getSupportEmail() + ",");
        if (getSupportDescription() != null)
            sb.append("SupportDescription: " + getSupportDescription() + ",");
        if (getSupportUrl() != null)
            sb.append("SupportUrl: " + getSupportUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode
                + ((getShortDescription() == null) ? 0 : getShortDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getDistributor() == null) ? 0 : getDistributor().hashCode());
        hashCode = prime * hashCode
                + ((getHasDefaultPath() == null) ? 0 : getHasDefaultPath().hashCode());
        hashCode = prime * hashCode
                + ((getSupportEmail() == null) ? 0 : getSupportEmail().hashCode());
        hashCode = prime * hashCode
                + ((getSupportDescription() == null) ? 0 : getSupportDescription().hashCode());
        hashCode = prime * hashCode + ((getSupportUrl() == null) ? 0 : getSupportUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductViewSummary == false)
            return false;
        ProductViewSummary other = (ProductViewSummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null
                && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getShortDescription() == null ^ this.getShortDescription() == null)
            return false;
        if (other.getShortDescription() != null
                && other.getShortDescription().equals(this.getShortDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDistributor() == null ^ this.getDistributor() == null)
            return false;
        if (other.getDistributor() != null
                && other.getDistributor().equals(this.getDistributor()) == false)
            return false;
        if (other.getHasDefaultPath() == null ^ this.getHasDefaultPath() == null)
            return false;
        if (other.getHasDefaultPath() != null
                && other.getHasDefaultPath().equals(this.getHasDefaultPath()) == false)
            return false;
        if (other.getSupportEmail() == null ^ this.getSupportEmail() == null)
            return false;
        if (other.getSupportEmail() != null
                && other.getSupportEmail().equals(this.getSupportEmail()) == false)
            return false;
        if (other.getSupportDescription() == null ^ this.getSupportDescription() == null)
            return false;
        if (other.getSupportDescription() != null
                && other.getSupportDescription().equals(this.getSupportDescription()) == false)
            return false;
        if (other.getSupportUrl() == null ^ this.getSupportUrl() == null)
            return false;
        if (other.getSupportUrl() != null
                && other.getSupportUrl().equals(this.getSupportUrl()) == false)
            return false;
        return true;
    }
}
