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
 * Updates the specified product.
 * </p>
 */
public class UpdateProductRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String id;

    /**
     * <p>
     * The updated product name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     */
    private String name;

    /**
     * <p>
     * The updated owner of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     */
    private String owner;

    /**
     * <p>
     * The updated description of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     */
    private String description;

    /**
     * <p>
     * The updated distributor of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     */
    private String distributor;

    /**
     * <p>
     * The updated support description for the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     */
    private String supportDescription;

    /**
     * <p>
     * The updated support email for the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     */
    private String supportEmail;

    /**
     * <p>
     * The updated support URL for the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2083<br/>
     */
    private String supportUrl;

    /**
     * <p>
     * The tags to add to the product.
     * </p>
     */
    private java.util.List<Tag> addTags;

    /**
     * <p>
     * The tags to remove from the product.
     * </p>
     */
    private java.util.List<String> removeTags;

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
    public UpdateProductRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
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
    public String getId() {
        return id;
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
     * @param id <p>
     *            The product identifier.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
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
     * @param id <p>
     *            The product identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProductRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The updated product name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @return <p>
     *         The updated product name.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The updated product name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param name <p>
     *            The updated product name.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The updated product name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param name <p>
     *            The updated product name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProductRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The updated owner of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @return <p>
     *         The updated owner of the product.
     *         </p>
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <p>
     * The updated owner of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param owner <p>
     *            The updated owner of the product.
     *            </p>
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The updated owner of the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param owner <p>
     *            The updated owner of the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProductRequest withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * The updated description of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @return <p>
     *         The updated description of the product.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The updated description of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param description <p>
     *            The updated description of the product.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated description of the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param description <p>
     *            The updated description of the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProductRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The updated distributor of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @return <p>
     *         The updated distributor of the product.
     *         </p>
     */
    public String getDistributor() {
        return distributor;
    }

    /**
     * <p>
     * The updated distributor of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param distributor <p>
     *            The updated distributor of the product.
     *            </p>
     */
    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    /**
     * <p>
     * The updated distributor of the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param distributor <p>
     *            The updated distributor of the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProductRequest withDistributor(String distributor) {
        this.distributor = distributor;
        return this;
    }

    /**
     * <p>
     * The updated support description for the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @return <p>
     *         The updated support description for the product.
     *         </p>
     */
    public String getSupportDescription() {
        return supportDescription;
    }

    /**
     * <p>
     * The updated support description for the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param supportDescription <p>
     *            The updated support description for the product.
     *            </p>
     */
    public void setSupportDescription(String supportDescription) {
        this.supportDescription = supportDescription;
    }

    /**
     * <p>
     * The updated support description for the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param supportDescription <p>
     *            The updated support description for the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProductRequest withSupportDescription(String supportDescription) {
        this.supportDescription = supportDescription;
        return this;
    }

    /**
     * <p>
     * The updated support email for the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     *
     * @return <p>
     *         The updated support email for the product.
     *         </p>
     */
    public String getSupportEmail() {
        return supportEmail;
    }

    /**
     * <p>
     * The updated support email for the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     *
     * @param supportEmail <p>
     *            The updated support email for the product.
     *            </p>
     */
    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    /**
     * <p>
     * The updated support email for the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     *
     * @param supportEmail <p>
     *            The updated support email for the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProductRequest withSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
        return this;
    }

    /**
     * <p>
     * The updated support URL for the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2083<br/>
     *
     * @return <p>
     *         The updated support URL for the product.
     *         </p>
     */
    public String getSupportUrl() {
        return supportUrl;
    }

    /**
     * <p>
     * The updated support URL for the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2083<br/>
     *
     * @param supportUrl <p>
     *            The updated support URL for the product.
     *            </p>
     */
    public void setSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
    }

    /**
     * <p>
     * The updated support URL for the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2083<br/>
     *
     * @param supportUrl <p>
     *            The updated support URL for the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProductRequest withSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
        return this;
    }

    /**
     * <p>
     * The tags to add to the product.
     * </p>
     *
     * @return <p>
     *         The tags to add to the product.
     *         </p>
     */
    public java.util.List<Tag> getAddTags() {
        return addTags;
    }

    /**
     * <p>
     * The tags to add to the product.
     * </p>
     *
     * @param addTags <p>
     *            The tags to add to the product.
     *            </p>
     */
    public void setAddTags(java.util.Collection<Tag> addTags) {
        if (addTags == null) {
            this.addTags = null;
            return;
        }

        this.addTags = new java.util.ArrayList<Tag>(addTags);
    }

    /**
     * <p>
     * The tags to add to the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addTags <p>
     *            The tags to add to the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProductRequest withAddTags(Tag... addTags) {
        if (getAddTags() == null) {
            this.addTags = new java.util.ArrayList<Tag>(addTags.length);
        }
        for (Tag value : addTags) {
            this.addTags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to add to the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addTags <p>
     *            The tags to add to the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProductRequest withAddTags(java.util.Collection<Tag> addTags) {
        setAddTags(addTags);
        return this;
    }

    /**
     * <p>
     * The tags to remove from the product.
     * </p>
     *
     * @return <p>
     *         The tags to remove from the product.
     *         </p>
     */
    public java.util.List<String> getRemoveTags() {
        return removeTags;
    }

    /**
     * <p>
     * The tags to remove from the product.
     * </p>
     *
     * @param removeTags <p>
     *            The tags to remove from the product.
     *            </p>
     */
    public void setRemoveTags(java.util.Collection<String> removeTags) {
        if (removeTags == null) {
            this.removeTags = null;
            return;
        }

        this.removeTags = new java.util.ArrayList<String>(removeTags);
    }

    /**
     * <p>
     * The tags to remove from the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeTags <p>
     *            The tags to remove from the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProductRequest withRemoveTags(String... removeTags) {
        if (getRemoveTags() == null) {
            this.removeTags = new java.util.ArrayList<String>(removeTags.length);
        }
        for (String value : removeTags) {
            this.removeTags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to remove from the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeTags <p>
     *            The tags to remove from the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProductRequest withRemoveTags(java.util.Collection<String> removeTags) {
        setRemoveTags(removeTags);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
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
        if (getAddTags() != null)
            sb.append("AddTags: " + getAddTags() + ",");
        if (getRemoveTags() != null)
            sb.append("RemoveTags: " + getRemoveTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
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
        hashCode = prime * hashCode + ((getAddTags() == null) ? 0 : getAddTags().hashCode());
        hashCode = prime * hashCode + ((getRemoveTags() == null) ? 0 : getRemoveTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProductRequest == false)
            return false;
        UpdateProductRequest other = (UpdateProductRequest) obj;

        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null
                && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        if (other.getAddTags() == null ^ this.getAddTags() == null)
            return false;
        if (other.getAddTags() != null && other.getAddTags().equals(this.getAddTags()) == false)
            return false;
        if (other.getRemoveTags() == null ^ this.getRemoveTags() == null)
            return false;
        if (other.getRemoveTags() != null
                && other.getRemoveTags().equals(this.getRemoveTags()) == false)
            return false;
        return true;
    }
}
