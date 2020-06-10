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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a product.
 * </p>
 * <p>
 * A delegated admin is authorized to invoke this command.
 * </p>
 */
public class CreateProductRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     */
    private String acceptLanguage;

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
     * The owner of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     */
    private String owner;

    /**
     * <p>
     * The description of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     */
    private String description;

    /**
     * <p>
     * The distributor of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     */
    private String distributor;

    /**
     * <p>
     * The support information about the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     */
    private String supportDescription;

    /**
     * <p>
     * The contact email for product support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     */
    private String supportEmail;

    /**
     * <p>
     * The contact URL for product support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2083<br/>
     */
    private String supportUrl;

    /**
     * <p>
     * The type of product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     * <b>Allowed Values: </b>CLOUD_FORMATION_TEMPLATE, MARKETPLACE
     */
    private String productType;

    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The configuration of the provisioning artifact.
     * </p>
     */
    private ProvisioningArtifactProperties provisioningArtifactParameters;

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple
     * requests differ only by the idempotency token, the same response is
     * returned for each repeated request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String idempotencyToken;

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @return <p>
     *         The language code.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param acceptLanguage <p>
     *            The language code.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>en</code> - English (default)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>jp</code> - Japanese
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zh</code> - Chinese
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param acceptLanguage <p>
     *            The language code.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>en</code> - English (default)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>jp</code> - Japanese
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zh</code> - Chinese
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProductRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
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
    public CreateProductRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The owner of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @return <p>
     *         The owner of the product.
     *         </p>
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <p>
     * The owner of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param owner <p>
     *            The owner of the product.
     *            </p>
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param owner <p>
     *            The owner of the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProductRequest withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * The description of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @return <p>
     *         The description of the product.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param description <p>
     *            The description of the product.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param description <p>
     *            The description of the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProductRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The distributor of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @return <p>
     *         The distributor of the product.
     *         </p>
     */
    public String getDistributor() {
        return distributor;
    }

    /**
     * <p>
     * The distributor of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param distributor <p>
     *            The distributor of the product.
     *            </p>
     */
    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    /**
     * <p>
     * The distributor of the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param distributor <p>
     *            The distributor of the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProductRequest withDistributor(String distributor) {
        this.distributor = distributor;
        return this;
    }

    /**
     * <p>
     * The support information about the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @return <p>
     *         The support information about the product.
     *         </p>
     */
    public String getSupportDescription() {
        return supportDescription;
    }

    /**
     * <p>
     * The support information about the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param supportDescription <p>
     *            The support information about the product.
     *            </p>
     */
    public void setSupportDescription(String supportDescription) {
        this.supportDescription = supportDescription;
    }

    /**
     * <p>
     * The support information about the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param supportDescription <p>
     *            The support information about the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProductRequest withSupportDescription(String supportDescription) {
        this.supportDescription = supportDescription;
        return this;
    }

    /**
     * <p>
     * The contact email for product support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     *
     * @return <p>
     *         The contact email for product support.
     *         </p>
     */
    public String getSupportEmail() {
        return supportEmail;
    }

    /**
     * <p>
     * The contact email for product support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     *
     * @param supportEmail <p>
     *            The contact email for product support.
     *            </p>
     */
    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    /**
     * <p>
     * The contact email for product support.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     *
     * @param supportEmail <p>
     *            The contact email for product support.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProductRequest withSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
        return this;
    }

    /**
     * <p>
     * The contact URL for product support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2083<br/>
     *
     * @return <p>
     *         The contact URL for product support.
     *         </p>
     */
    public String getSupportUrl() {
        return supportUrl;
    }

    /**
     * <p>
     * The contact URL for product support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2083<br/>
     *
     * @param supportUrl <p>
     *            The contact URL for product support.
     *            </p>
     */
    public void setSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
    }

    /**
     * <p>
     * The contact URL for product support.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2083<br/>
     *
     * @param supportUrl <p>
     *            The contact URL for product support.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProductRequest withSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
        return this;
    }

    /**
     * <p>
     * The type of product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     * <b>Allowed Values: </b>CLOUD_FORMATION_TEMPLATE, MARKETPLACE
     *
     * @return <p>
     *         The type of product.
     *         </p>
     * @see ProductType
     */
    public String getProductType() {
        return productType;
    }

    /**
     * <p>
     * The type of product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     * <b>Allowed Values: </b>CLOUD_FORMATION_TEMPLATE, MARKETPLACE
     *
     * @param productType <p>
     *            The type of product.
     *            </p>
     * @see ProductType
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * <p>
     * The type of product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     * <b>Allowed Values: </b>CLOUD_FORMATION_TEMPLATE, MARKETPLACE
     *
     * @param productType <p>
     *            The type of product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProductType
     */
    public CreateProductRequest withProductType(String productType) {
        this.productType = productType;
        return this;
    }

    /**
     * <p>
     * The type of product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     * <b>Allowed Values: </b>CLOUD_FORMATION_TEMPLATE, MARKETPLACE
     *
     * @param productType <p>
     *            The type of product.
     *            </p>
     * @see ProductType
     */
    public void setProductType(ProductType productType) {
        this.productType = productType.toString();
    }

    /**
     * <p>
     * The type of product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     * <b>Allowed Values: </b>CLOUD_FORMATION_TEMPLATE, MARKETPLACE
     *
     * @param productType <p>
     *            The type of product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProductType
     */
    public CreateProductRequest withProductType(ProductType productType) {
        this.productType = productType.toString();
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     *
     * @return <p>
     *         One or more tags.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     *
     * @param tags <p>
     *            One or more tags.
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
     * One or more tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProductRequest withTags(Tag... tags) {
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
     * One or more tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProductRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The configuration of the provisioning artifact.
     * </p>
     *
     * @return <p>
     *         The configuration of the provisioning artifact.
     *         </p>
     */
    public ProvisioningArtifactProperties getProvisioningArtifactParameters() {
        return provisioningArtifactParameters;
    }

    /**
     * <p>
     * The configuration of the provisioning artifact.
     * </p>
     *
     * @param provisioningArtifactParameters <p>
     *            The configuration of the provisioning artifact.
     *            </p>
     */
    public void setProvisioningArtifactParameters(
            ProvisioningArtifactProperties provisioningArtifactParameters) {
        this.provisioningArtifactParameters = provisioningArtifactParameters;
    }

    /**
     * <p>
     * The configuration of the provisioning artifact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisioningArtifactParameters <p>
     *            The configuration of the provisioning artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProductRequest withProvisioningArtifactParameters(
            ProvisioningArtifactProperties provisioningArtifactParameters) {
        this.provisioningArtifactParameters = provisioningArtifactParameters;
        return this;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple
     * requests differ only by the idempotency token, the same response is
     * returned for each repeated request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         A unique identifier that you provide to ensure idempotency. If
     *         multiple requests differ only by the idempotency token, the same
     *         response is returned for each repeated request.
     *         </p>
     */
    public String getIdempotencyToken() {
        return idempotencyToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple
     * requests differ only by the idempotency token, the same response is
     * returned for each repeated request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param idempotencyToken <p>
     *            A unique identifier that you provide to ensure idempotency. If
     *            multiple requests differ only by the idempotency token, the
     *            same response is returned for each repeated request.
     *            </p>
     */
    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple
     * requests differ only by the idempotency token, the same response is
     * returned for each repeated request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param idempotencyToken <p>
     *            A unique identifier that you provide to ensure idempotency. If
     *            multiple requests differ only by the idempotency token, the
     *            same response is returned for each repeated request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProductRequest withIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
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
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: " + getAcceptLanguage() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getOwner() != null)
            sb.append("Owner: " + getOwner() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDistributor() != null)
            sb.append("Distributor: " + getDistributor() + ",");
        if (getSupportDescription() != null)
            sb.append("SupportDescription: " + getSupportDescription() + ",");
        if (getSupportEmail() != null)
            sb.append("SupportEmail: " + getSupportEmail() + ",");
        if (getSupportUrl() != null)
            sb.append("SupportUrl: " + getSupportUrl() + ",");
        if (getProductType() != null)
            sb.append("ProductType: " + getProductType() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getProvisioningArtifactParameters() != null)
            sb.append("ProvisioningArtifactParameters: " + getProvisioningArtifactParameters()
                    + ",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: " + getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDistributor() == null) ? 0 : getDistributor().hashCode());
        hashCode = prime * hashCode
                + ((getSupportDescription() == null) ? 0 : getSupportDescription().hashCode());
        hashCode = prime * hashCode
                + ((getSupportEmail() == null) ? 0 : getSupportEmail().hashCode());
        hashCode = prime * hashCode + ((getSupportUrl() == null) ? 0 : getSupportUrl().hashCode());
        hashCode = prime * hashCode
                + ((getProductType() == null) ? 0 : getProductType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisioningArtifactParameters() == null) ? 0
                        : getProvisioningArtifactParameters().hashCode());
        hashCode = prime * hashCode
                + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProductRequest == false)
            return false;
        CreateProductRequest other = (CreateProductRequest) obj;

        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null
                && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDistributor() == null ^ this.getDistributor() == null)
            return false;
        if (other.getDistributor() != null
                && other.getDistributor().equals(this.getDistributor()) == false)
            return false;
        if (other.getSupportDescription() == null ^ this.getSupportDescription() == null)
            return false;
        if (other.getSupportDescription() != null
                && other.getSupportDescription().equals(this.getSupportDescription()) == false)
            return false;
        if (other.getSupportEmail() == null ^ this.getSupportEmail() == null)
            return false;
        if (other.getSupportEmail() != null
                && other.getSupportEmail().equals(this.getSupportEmail()) == false)
            return false;
        if (other.getSupportUrl() == null ^ this.getSupportUrl() == null)
            return false;
        if (other.getSupportUrl() != null
                && other.getSupportUrl().equals(this.getSupportUrl()) == false)
            return false;
        if (other.getProductType() == null ^ this.getProductType() == null)
            return false;
        if (other.getProductType() != null
                && other.getProductType().equals(this.getProductType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getProvisioningArtifactParameters() == null
                ^ this.getProvisioningArtifactParameters() == null)
            return false;
        if (other.getProvisioningArtifactParameters() != null
                && other.getProvisioningArtifactParameters().equals(
                        this.getProvisioningArtifactParameters()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null
                && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }
}
