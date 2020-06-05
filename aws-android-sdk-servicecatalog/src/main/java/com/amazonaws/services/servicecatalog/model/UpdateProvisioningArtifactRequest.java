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
 * Updates the specified provisioning artifact (also known as a version) for the
 * specified product.
 * </p>
 * <p>
 * You cannot update a provisioning artifact for a product that was shared with
 * you.
 * </p>
 */
public class UpdateProvisioningArtifactRequest extends AmazonWebServiceRequest implements
        Serializable {
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
    private String productId;

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String provisioningArtifactId;

    /**
     * <p>
     * The updated name of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     */
    private String name;

    /**
     * <p>
     * The updated description of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     */
    private String description;

    /**
     * <p>
     * Indicates whether the product version is active.
     * </p>
     * <p>
     * Inactive provisioning artifacts are invisible to end users. End users
     * cannot launch or update a provisioned product from an inactive
     * provisioning artifact.
     * </p>
     */
    private Boolean active;

    /**
     * <p>
     * Information set by the administrator to provide guidance to end users
     * about which provisioning artifacts to use.
     * </p>
     * <p>
     * The <code>DEFAULT</code> value indicates that the product version is
     * active.
     * </p>
     * <p>
     * The administrator can set the guidance to <code>DEPRECATED</code> to
     * inform users that the product version is deprecated. Users are able to
     * make updates to a provisioned product of a deprecated version but cannot
     * launch new provisioned products using a deprecated version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, DEPRECATED
     */
    private String guidance;

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
    public UpdateProvisioningArtifactRequest withAcceptLanguage(String acceptLanguage) {
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
    public UpdateProvisioningArtifactRequest withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The identifier of the provisioning artifact.
     *         </p>
     */
    public String getProvisioningArtifactId() {
        return provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisioningArtifactId <p>
     *            The identifier of the provisioning artifact.
     *            </p>
     */
    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisioningArtifactId <p>
     *            The identifier of the provisioning artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningArtifactRequest withProvisioningArtifactId(
            String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
        return this;
    }

    /**
     * <p>
     * The updated name of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @return <p>
     *         The updated name of the provisioning artifact.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The updated name of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @param name <p>
     *            The updated name of the provisioning artifact.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The updated name of the provisioning artifact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @param name <p>
     *            The updated name of the provisioning artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningArtifactRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The updated description of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @return <p>
     *         The updated description of the provisioning artifact.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The updated description of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @param description <p>
     *            The updated description of the provisioning artifact.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated description of the provisioning artifact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @param description <p>
     *            The updated description of the provisioning artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningArtifactRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Indicates whether the product version is active.
     * </p>
     * <p>
     * Inactive provisioning artifacts are invisible to end users. End users
     * cannot launch or update a provisioned product from an inactive
     * provisioning artifact.
     * </p>
     *
     * @return <p>
     *         Indicates whether the product version is active.
     *         </p>
     *         <p>
     *         Inactive provisioning artifacts are invisible to end users. End
     *         users cannot launch or update a provisioned product from an
     *         inactive provisioning artifact.
     *         </p>
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * <p>
     * Indicates whether the product version is active.
     * </p>
     * <p>
     * Inactive provisioning artifacts are invisible to end users. End users
     * cannot launch or update a provisioned product from an inactive
     * provisioning artifact.
     * </p>
     *
     * @return <p>
     *         Indicates whether the product version is active.
     *         </p>
     *         <p>
     *         Inactive provisioning artifacts are invisible to end users. End
     *         users cannot launch or update a provisioned product from an
     *         inactive provisioning artifact.
     *         </p>
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * <p>
     * Indicates whether the product version is active.
     * </p>
     * <p>
     * Inactive provisioning artifacts are invisible to end users. End users
     * cannot launch or update a provisioned product from an inactive
     * provisioning artifact.
     * </p>
     *
     * @param active <p>
     *            Indicates whether the product version is active.
     *            </p>
     *            <p>
     *            Inactive provisioning artifacts are invisible to end users.
     *            End users cannot launch or update a provisioned product from
     *            an inactive provisioning artifact.
     *            </p>
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>
     * Indicates whether the product version is active.
     * </p>
     * <p>
     * Inactive provisioning artifacts are invisible to end users. End users
     * cannot launch or update a provisioned product from an inactive
     * provisioning artifact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param active <p>
     *            Indicates whether the product version is active.
     *            </p>
     *            <p>
     *            Inactive provisioning artifacts are invisible to end users.
     *            End users cannot launch or update a provisioned product from
     *            an inactive provisioning artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningArtifactRequest withActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * <p>
     * Information set by the administrator to provide guidance to end users
     * about which provisioning artifacts to use.
     * </p>
     * <p>
     * The <code>DEFAULT</code> value indicates that the product version is
     * active.
     * </p>
     * <p>
     * The administrator can set the guidance to <code>DEPRECATED</code> to
     * inform users that the product version is deprecated. Users are able to
     * make updates to a provisioned product of a deprecated version but cannot
     * launch new provisioned products using a deprecated version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, DEPRECATED
     *
     * @return <p>
     *         Information set by the administrator to provide guidance to end
     *         users about which provisioning artifacts to use.
     *         </p>
     *         <p>
     *         The <code>DEFAULT</code> value indicates that the product version
     *         is active.
     *         </p>
     *         <p>
     *         The administrator can set the guidance to <code>DEPRECATED</code>
     *         to inform users that the product version is deprecated. Users are
     *         able to make updates to a provisioned product of a deprecated
     *         version but cannot launch new provisioned products using a
     *         deprecated version.
     *         </p>
     * @see ProvisioningArtifactGuidance
     */
    public String getGuidance() {
        return guidance;
    }

    /**
     * <p>
     * Information set by the administrator to provide guidance to end users
     * about which provisioning artifacts to use.
     * </p>
     * <p>
     * The <code>DEFAULT</code> value indicates that the product version is
     * active.
     * </p>
     * <p>
     * The administrator can set the guidance to <code>DEPRECATED</code> to
     * inform users that the product version is deprecated. Users are able to
     * make updates to a provisioned product of a deprecated version but cannot
     * launch new provisioned products using a deprecated version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, DEPRECATED
     *
     * @param guidance <p>
     *            Information set by the administrator to provide guidance to
     *            end users about which provisioning artifacts to use.
     *            </p>
     *            <p>
     *            The <code>DEFAULT</code> value indicates that the product
     *            version is active.
     *            </p>
     *            <p>
     *            The administrator can set the guidance to
     *            <code>DEPRECATED</code> to inform users that the product
     *            version is deprecated. Users are able to make updates to a
     *            provisioned product of a deprecated version but cannot launch
     *            new provisioned products using a deprecated version.
     *            </p>
     * @see ProvisioningArtifactGuidance
     */
    public void setGuidance(String guidance) {
        this.guidance = guidance;
    }

    /**
     * <p>
     * Information set by the administrator to provide guidance to end users
     * about which provisioning artifacts to use.
     * </p>
     * <p>
     * The <code>DEFAULT</code> value indicates that the product version is
     * active.
     * </p>
     * <p>
     * The administrator can set the guidance to <code>DEPRECATED</code> to
     * inform users that the product version is deprecated. Users are able to
     * make updates to a provisioned product of a deprecated version but cannot
     * launch new provisioned products using a deprecated version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, DEPRECATED
     *
     * @param guidance <p>
     *            Information set by the administrator to provide guidance to
     *            end users about which provisioning artifacts to use.
     *            </p>
     *            <p>
     *            The <code>DEFAULT</code> value indicates that the product
     *            version is active.
     *            </p>
     *            <p>
     *            The administrator can set the guidance to
     *            <code>DEPRECATED</code> to inform users that the product
     *            version is deprecated. Users are able to make updates to a
     *            provisioned product of a deprecated version but cannot launch
     *            new provisioned products using a deprecated version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProvisioningArtifactGuidance
     */
    public UpdateProvisioningArtifactRequest withGuidance(String guidance) {
        this.guidance = guidance;
        return this;
    }

    /**
     * <p>
     * Information set by the administrator to provide guidance to end users
     * about which provisioning artifacts to use.
     * </p>
     * <p>
     * The <code>DEFAULT</code> value indicates that the product version is
     * active.
     * </p>
     * <p>
     * The administrator can set the guidance to <code>DEPRECATED</code> to
     * inform users that the product version is deprecated. Users are able to
     * make updates to a provisioned product of a deprecated version but cannot
     * launch new provisioned products using a deprecated version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, DEPRECATED
     *
     * @param guidance <p>
     *            Information set by the administrator to provide guidance to
     *            end users about which provisioning artifacts to use.
     *            </p>
     *            <p>
     *            The <code>DEFAULT</code> value indicates that the product
     *            version is active.
     *            </p>
     *            <p>
     *            The administrator can set the guidance to
     *            <code>DEPRECATED</code> to inform users that the product
     *            version is deprecated. Users are able to make updates to a
     *            provisioned product of a deprecated version but cannot launch
     *            new provisioned products using a deprecated version.
     *            </p>
     * @see ProvisioningArtifactGuidance
     */
    public void setGuidance(ProvisioningArtifactGuidance guidance) {
        this.guidance = guidance.toString();
    }

    /**
     * <p>
     * Information set by the administrator to provide guidance to end users
     * about which provisioning artifacts to use.
     * </p>
     * <p>
     * The <code>DEFAULT</code> value indicates that the product version is
     * active.
     * </p>
     * <p>
     * The administrator can set the guidance to <code>DEPRECATED</code> to
     * inform users that the product version is deprecated. Users are able to
     * make updates to a provisioned product of a deprecated version but cannot
     * launch new provisioned products using a deprecated version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, DEPRECATED
     *
     * @param guidance <p>
     *            Information set by the administrator to provide guidance to
     *            end users about which provisioning artifacts to use.
     *            </p>
     *            <p>
     *            The <code>DEFAULT</code> value indicates that the product
     *            version is active.
     *            </p>
     *            <p>
     *            The administrator can set the guidance to
     *            <code>DEPRECATED</code> to inform users that the product
     *            version is deprecated. Users are able to make updates to a
     *            provisioned product of a deprecated version but cannot launch
     *            new provisioned products using a deprecated version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProvisioningArtifactGuidance
     */
    public UpdateProvisioningArtifactRequest withGuidance(ProvisioningArtifactGuidance guidance) {
        this.guidance = guidance.toString();
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
        if (getProductId() != null)
            sb.append("ProductId: " + getProductId() + ",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: " + getProvisioningArtifactId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getActive() != null)
            sb.append("Active: " + getActive() + ",");
        if (getGuidance() != null)
            sb.append("Guidance: " + getGuidance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId()
                        .hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getActive() == null) ? 0 : getActive().hashCode());
        hashCode = prime * hashCode + ((getGuidance() == null) ? 0 : getGuidance().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProvisioningArtifactRequest == false)
            return false;
        UpdateProvisioningArtifactRequest other = (UpdateProvisioningArtifactRequest) obj;

        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null
                && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null
                && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null
                && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getActive() == null ^ this.getActive() == null)
            return false;
        if (other.getActive() != null && other.getActive().equals(this.getActive()) == false)
            return false;
        if (other.getGuidance() == null ^ this.getGuidance() == null)
            return false;
        if (other.getGuidance() != null && other.getGuidance().equals(this.getGuidance()) == false)
            return false;
        return true;
    }
}
