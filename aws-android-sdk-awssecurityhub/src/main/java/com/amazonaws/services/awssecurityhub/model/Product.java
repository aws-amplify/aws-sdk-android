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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Contains details about a product.
 * </p>
 */
public class Product implements Serializable {
    /**
     * <p>
     * The ARN assigned to the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String productArn;

    /**
     * <p>
     * The name of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String productName;

    /**
     * <p>
     * The name of the company that provides the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String companyName;

    /**
     * <p>
     * A description of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String description;

    /**
     * <p>
     * The categories assigned to the product.
     * </p>
     */
    private java.util.List<String> categories;

    /**
     * <p>
     * The types of integration that the product supports. Available values are
     * the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SEND_FINDINGS_TO_SECURITY_HUB</code> - Indicates that the
     * integration sends findings to Security Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECEIVE_FINDINGS_FROM_SECURITY_HUB</code> - Indicates that the
     * integration receives findings from Security Hub.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> integrationTypes;

    /**
     * <p>
     * The URL for the page that contains more information about the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String marketplaceUrl;

    /**
     * <p>
     * The URL used to activate the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String activationUrl;

    /**
     * <p>
     * The resource policy associated with the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String productSubscriptionResourcePolicy;

    /**
     * <p>
     * The ARN assigned to the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ARN assigned to the product.
     *         </p>
     */
    public String getProductArn() {
        return productArn;
    }

    /**
     * <p>
     * The ARN assigned to the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param productArn <p>
     *            The ARN assigned to the product.
     *            </p>
     */
    public void setProductArn(String productArn) {
        this.productArn = productArn;
    }

    /**
     * <p>
     * The ARN assigned to the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param productArn <p>
     *            The ARN assigned to the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Product withProductArn(String productArn) {
        this.productArn = productArn;
        return this;
    }

    /**
     * <p>
     * The name of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The name of the product.
     *         </p>
     */
    public String getProductName() {
        return productName;
    }

    /**
     * <p>
     * The name of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param productName <p>
     *            The name of the product.
     *            </p>
     */
    public void setProductName(String productName) {
        this.productName = productName;
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
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param productName <p>
     *            The name of the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Product withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * <p>
     * The name of the company that provides the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The name of the company that provides the product.
     *         </p>
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * <p>
     * The name of the company that provides the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param companyName <p>
     *            The name of the company that provides the product.
     *            </p>
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * <p>
     * The name of the company that provides the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param companyName <p>
     *            The name of the company that provides the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Product withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * <p>
     * A description of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A description of the product.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param description <p>
     *            A description of the product.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param description <p>
     *            A description of the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Product withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The categories assigned to the product.
     * </p>
     *
     * @return <p>
     *         The categories assigned to the product.
     *         </p>
     */
    public java.util.List<String> getCategories() {
        return categories;
    }

    /**
     * <p>
     * The categories assigned to the product.
     * </p>
     *
     * @param categories <p>
     *            The categories assigned to the product.
     *            </p>
     */
    public void setCategories(java.util.Collection<String> categories) {
        if (categories == null) {
            this.categories = null;
            return;
        }

        this.categories = new java.util.ArrayList<String>(categories);
    }

    /**
     * <p>
     * The categories assigned to the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param categories <p>
     *            The categories assigned to the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Product withCategories(String... categories) {
        if (getCategories() == null) {
            this.categories = new java.util.ArrayList<String>(categories.length);
        }
        for (String value : categories) {
            this.categories.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The categories assigned to the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param categories <p>
     *            The categories assigned to the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Product withCategories(java.util.Collection<String> categories) {
        setCategories(categories);
        return this;
    }

    /**
     * <p>
     * The types of integration that the product supports. Available values are
     * the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SEND_FINDINGS_TO_SECURITY_HUB</code> - Indicates that the
     * integration sends findings to Security Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECEIVE_FINDINGS_FROM_SECURITY_HUB</code> - Indicates that the
     * integration receives findings from Security Hub.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The types of integration that the product supports. Available
     *         values are the following.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SEND_FINDINGS_TO_SECURITY_HUB</code> - Indicates that the
     *         integration sends findings to Security Hub.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RECEIVE_FINDINGS_FROM_SECURITY_HUB</code> - Indicates that
     *         the integration receives findings from Security Hub.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getIntegrationTypes() {
        return integrationTypes;
    }

    /**
     * <p>
     * The types of integration that the product supports. Available values are
     * the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SEND_FINDINGS_TO_SECURITY_HUB</code> - Indicates that the
     * integration sends findings to Security Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECEIVE_FINDINGS_FROM_SECURITY_HUB</code> - Indicates that the
     * integration receives findings from Security Hub.
     * </p>
     * </li>
     * </ul>
     *
     * @param integrationTypes <p>
     *            The types of integration that the product supports. Available
     *            values are the following.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SEND_FINDINGS_TO_SECURITY_HUB</code> - Indicates that
     *            the integration sends findings to Security Hub.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RECEIVE_FINDINGS_FROM_SECURITY_HUB</code> - Indicates
     *            that the integration receives findings from Security Hub.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setIntegrationTypes(java.util.Collection<String> integrationTypes) {
        if (integrationTypes == null) {
            this.integrationTypes = null;
            return;
        }

        this.integrationTypes = new java.util.ArrayList<String>(integrationTypes);
    }

    /**
     * <p>
     * The types of integration that the product supports. Available values are
     * the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SEND_FINDINGS_TO_SECURITY_HUB</code> - Indicates that the
     * integration sends findings to Security Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECEIVE_FINDINGS_FROM_SECURITY_HUB</code> - Indicates that the
     * integration receives findings from Security Hub.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integrationTypes <p>
     *            The types of integration that the product supports. Available
     *            values are the following.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SEND_FINDINGS_TO_SECURITY_HUB</code> - Indicates that
     *            the integration sends findings to Security Hub.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RECEIVE_FINDINGS_FROM_SECURITY_HUB</code> - Indicates
     *            that the integration receives findings from Security Hub.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Product withIntegrationTypes(String... integrationTypes) {
        if (getIntegrationTypes() == null) {
            this.integrationTypes = new java.util.ArrayList<String>(integrationTypes.length);
        }
        for (String value : integrationTypes) {
            this.integrationTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The types of integration that the product supports. Available values are
     * the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SEND_FINDINGS_TO_SECURITY_HUB</code> - Indicates that the
     * integration sends findings to Security Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECEIVE_FINDINGS_FROM_SECURITY_HUB</code> - Indicates that the
     * integration receives findings from Security Hub.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integrationTypes <p>
     *            The types of integration that the product supports. Available
     *            values are the following.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SEND_FINDINGS_TO_SECURITY_HUB</code> - Indicates that
     *            the integration sends findings to Security Hub.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RECEIVE_FINDINGS_FROM_SECURITY_HUB</code> - Indicates
     *            that the integration receives findings from Security Hub.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Product withIntegrationTypes(java.util.Collection<String> integrationTypes) {
        setIntegrationTypes(integrationTypes);
        return this;
    }

    /**
     * <p>
     * The URL for the page that contains more information about the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The URL for the page that contains more information about the
     *         product.
     *         </p>
     */
    public String getMarketplaceUrl() {
        return marketplaceUrl;
    }

    /**
     * <p>
     * The URL for the page that contains more information about the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param marketplaceUrl <p>
     *            The URL for the page that contains more information about the
     *            product.
     *            </p>
     */
    public void setMarketplaceUrl(String marketplaceUrl) {
        this.marketplaceUrl = marketplaceUrl;
    }

    /**
     * <p>
     * The URL for the page that contains more information about the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param marketplaceUrl <p>
     *            The URL for the page that contains more information about the
     *            product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Product withMarketplaceUrl(String marketplaceUrl) {
        this.marketplaceUrl = marketplaceUrl;
        return this;
    }

    /**
     * <p>
     * The URL used to activate the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The URL used to activate the product.
     *         </p>
     */
    public String getActivationUrl() {
        return activationUrl;
    }

    /**
     * <p>
     * The URL used to activate the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param activationUrl <p>
     *            The URL used to activate the product.
     *            </p>
     */
    public void setActivationUrl(String activationUrl) {
        this.activationUrl = activationUrl;
    }

    /**
     * <p>
     * The URL used to activate the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param activationUrl <p>
     *            The URL used to activate the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Product withActivationUrl(String activationUrl) {
        this.activationUrl = activationUrl;
        return this;
    }

    /**
     * <p>
     * The resource policy associated with the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The resource policy associated with the product.
     *         </p>
     */
    public String getProductSubscriptionResourcePolicy() {
        return productSubscriptionResourcePolicy;
    }

    /**
     * <p>
     * The resource policy associated with the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param productSubscriptionResourcePolicy <p>
     *            The resource policy associated with the product.
     *            </p>
     */
    public void setProductSubscriptionResourcePolicy(String productSubscriptionResourcePolicy) {
        this.productSubscriptionResourcePolicy = productSubscriptionResourcePolicy;
    }

    /**
     * <p>
     * The resource policy associated with the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param productSubscriptionResourcePolicy <p>
     *            The resource policy associated with the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Product withProductSubscriptionResourcePolicy(String productSubscriptionResourcePolicy) {
        this.productSubscriptionResourcePolicy = productSubscriptionResourcePolicy;
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
        if (getProductArn() != null)
            sb.append("ProductArn: " + getProductArn() + ",");
        if (getProductName() != null)
            sb.append("ProductName: " + getProductName() + ",");
        if (getCompanyName() != null)
            sb.append("CompanyName: " + getCompanyName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCategories() != null)
            sb.append("Categories: " + getCategories() + ",");
        if (getIntegrationTypes() != null)
            sb.append("IntegrationTypes: " + getIntegrationTypes() + ",");
        if (getMarketplaceUrl() != null)
            sb.append("MarketplaceUrl: " + getMarketplaceUrl() + ",");
        if (getActivationUrl() != null)
            sb.append("ActivationUrl: " + getActivationUrl() + ",");
        if (getProductSubscriptionResourcePolicy() != null)
            sb.append("ProductSubscriptionResourcePolicy: "
                    + getProductSubscriptionResourcePolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductArn() == null) ? 0 : getProductArn().hashCode());
        hashCode = prime * hashCode
                + ((getProductName() == null) ? 0 : getProductName().hashCode());
        hashCode = prime * hashCode
                + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCategories() == null) ? 0 : getCategories().hashCode());
        hashCode = prime * hashCode
                + ((getIntegrationTypes() == null) ? 0 : getIntegrationTypes().hashCode());
        hashCode = prime * hashCode
                + ((getMarketplaceUrl() == null) ? 0 : getMarketplaceUrl().hashCode());
        hashCode = prime * hashCode
                + ((getActivationUrl() == null) ? 0 : getActivationUrl().hashCode());
        hashCode = prime
                * hashCode
                + ((getProductSubscriptionResourcePolicy() == null) ? 0
                        : getProductSubscriptionResourcePolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Product == false)
            return false;
        Product other = (Product) obj;

        if (other.getProductArn() == null ^ this.getProductArn() == null)
            return false;
        if (other.getProductArn() != null
                && other.getProductArn().equals(this.getProductArn()) == false)
            return false;
        if (other.getProductName() == null ^ this.getProductName() == null)
            return false;
        if (other.getProductName() != null
                && other.getProductName().equals(this.getProductName()) == false)
            return false;
        if (other.getCompanyName() == null ^ this.getCompanyName() == null)
            return false;
        if (other.getCompanyName() != null
                && other.getCompanyName().equals(this.getCompanyName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCategories() == null ^ this.getCategories() == null)
            return false;
        if (other.getCategories() != null
                && other.getCategories().equals(this.getCategories()) == false)
            return false;
        if (other.getIntegrationTypes() == null ^ this.getIntegrationTypes() == null)
            return false;
        if (other.getIntegrationTypes() != null
                && other.getIntegrationTypes().equals(this.getIntegrationTypes()) == false)
            return false;
        if (other.getMarketplaceUrl() == null ^ this.getMarketplaceUrl() == null)
            return false;
        if (other.getMarketplaceUrl() != null
                && other.getMarketplaceUrl().equals(this.getMarketplaceUrl()) == false)
            return false;
        if (other.getActivationUrl() == null ^ this.getActivationUrl() == null)
            return false;
        if (other.getActivationUrl() != null
                && other.getActivationUrl().equals(this.getActivationUrl()) == false)
            return false;
        if (other.getProductSubscriptionResourcePolicy() == null
                ^ this.getProductSubscriptionResourcePolicy() == null)
            return false;
        if (other.getProductSubscriptionResourcePolicy() != null
                && other.getProductSubscriptionResourcePolicy().equals(
                        this.getProductSubscriptionResourcePolicy()) == false)
            return false;
        return true;
    }
}
