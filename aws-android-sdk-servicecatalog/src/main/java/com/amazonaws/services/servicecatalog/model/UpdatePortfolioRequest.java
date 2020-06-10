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
 * Updates the specified portfolio.
 * </p>
 * <p>
 * You cannot update a product that was shared with you.
 * </p>
 */
public class UpdatePortfolioRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The portfolio identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String id;

    /**
     * <p>
     * The name to use for display purposes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String displayName;

    /**
     * <p>
     * The updated description of the portfolio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     */
    private String description;

    /**
     * <p>
     * The updated name of the portfolio provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     */
    private String providerName;

    /**
     * <p>
     * The tags to add.
     * </p>
     */
    private java.util.List<Tag> addTags;

    /**
     * <p>
     * The tags to remove.
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
    public UpdatePortfolioRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The portfolio identifier.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param id <p>
     *            The portfolio identifier.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The portfolio identifier.
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
     *            The portfolio identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePortfolioRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name to use for display purposes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name to use for display purposes.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The name to use for display purposes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param displayName <p>
     *            The name to use for display purposes.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name to use for display purposes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param displayName <p>
     *            The name to use for display purposes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePortfolioRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The updated description of the portfolio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @return <p>
     *         The updated description of the portfolio.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The updated description of the portfolio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param description <p>
     *            The updated description of the portfolio.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated description of the portfolio.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param description <p>
     *            The updated description of the portfolio.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePortfolioRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The updated name of the portfolio provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return <p>
     *         The updated name of the portfolio provider.
     *         </p>
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * <p>
     * The updated name of the portfolio provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param providerName <p>
     *            The updated name of the portfolio provider.
     *            </p>
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The updated name of the portfolio provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param providerName <p>
     *            The updated name of the portfolio provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePortfolioRequest withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * <p>
     * The tags to add.
     * </p>
     *
     * @return <p>
     *         The tags to add.
     *         </p>
     */
    public java.util.List<Tag> getAddTags() {
        return addTags;
    }

    /**
     * <p>
     * The tags to add.
     * </p>
     *
     * @param addTags <p>
     *            The tags to add.
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
     * The tags to add.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addTags <p>
     *            The tags to add.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePortfolioRequest withAddTags(Tag... addTags) {
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
     * The tags to add.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addTags <p>
     *            The tags to add.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePortfolioRequest withAddTags(java.util.Collection<Tag> addTags) {
        setAddTags(addTags);
        return this;
    }

    /**
     * <p>
     * The tags to remove.
     * </p>
     *
     * @return <p>
     *         The tags to remove.
     *         </p>
     */
    public java.util.List<String> getRemoveTags() {
        return removeTags;
    }

    /**
     * <p>
     * The tags to remove.
     * </p>
     *
     * @param removeTags <p>
     *            The tags to remove.
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
     * The tags to remove.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeTags <p>
     *            The tags to remove.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePortfolioRequest withRemoveTags(String... removeTags) {
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
     * The tags to remove.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeTags <p>
     *            The tags to remove.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePortfolioRequest withRemoveTags(java.util.Collection<String> removeTags) {
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
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getProviderName() != null)
            sb.append("ProviderName: " + getProviderName() + ",");
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
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
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

        if (obj instanceof UpdatePortfolioRequest == false)
            return false;
        UpdatePortfolioRequest other = (UpdatePortfolioRequest) obj;

        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null
                && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null
                && other.getProviderName().equals(this.getProviderName()) == false)
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
