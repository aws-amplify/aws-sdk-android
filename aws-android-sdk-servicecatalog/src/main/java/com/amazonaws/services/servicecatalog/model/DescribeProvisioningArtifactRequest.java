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
 * Gets information about the specified provisioning artifact (also known as a
 * version) for the specified product.
 * </p>
 */
public class DescribeProvisioningArtifactRequest extends AmazonWebServiceRequest implements
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
     * The provisioning artifact name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     */
    private String provisioningArtifactName;

    /**
     * <p>
     * The product name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     */
    private String productName;

    /**
     * <p>
     * Indicates whether a verbose level of detail is enabled.
     * </p>
     */
    private Boolean verbose;

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
    public DescribeProvisioningArtifactRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
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
    public DescribeProvisioningArtifactRequest withProvisioningArtifactId(
            String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
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
    public DescribeProvisioningArtifactRequest withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * <p>
     * The provisioning artifact name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @return <p>
     *         The provisioning artifact name.
     *         </p>
     */
    public String getProvisioningArtifactName() {
        return provisioningArtifactName;
    }

    /**
     * <p>
     * The provisioning artifact name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @param provisioningArtifactName <p>
     *            The provisioning artifact name.
     *            </p>
     */
    public void setProvisioningArtifactName(String provisioningArtifactName) {
        this.provisioningArtifactName = provisioningArtifactName;
    }

    /**
     * <p>
     * The provisioning artifact name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @param provisioningArtifactName <p>
     *            The provisioning artifact name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProvisioningArtifactRequest withProvisioningArtifactName(
            String provisioningArtifactName) {
        this.provisioningArtifactName = provisioningArtifactName;
        return this;
    }

    /**
     * <p>
     * The product name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @return <p>
     *         The product name.
     *         </p>
     */
    public String getProductName() {
        return productName;
    }

    /**
     * <p>
     * The product name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param productName <p>
     *            The product name.
     *            </p>
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * <p>
     * The product name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param productName <p>
     *            The product name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProvisioningArtifactRequest withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * <p>
     * Indicates whether a verbose level of detail is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether a verbose level of detail is enabled.
     *         </p>
     */
    public Boolean isVerbose() {
        return verbose;
    }

    /**
     * <p>
     * Indicates whether a verbose level of detail is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether a verbose level of detail is enabled.
     *         </p>
     */
    public Boolean getVerbose() {
        return verbose;
    }

    /**
     * <p>
     * Indicates whether a verbose level of detail is enabled.
     * </p>
     *
     * @param verbose <p>
     *            Indicates whether a verbose level of detail is enabled.
     *            </p>
     */
    public void setVerbose(Boolean verbose) {
        this.verbose = verbose;
    }

    /**
     * <p>
     * Indicates whether a verbose level of detail is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param verbose <p>
     *            Indicates whether a verbose level of detail is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProvisioningArtifactRequest withVerbose(Boolean verbose) {
        this.verbose = verbose;
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
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: " + getProvisioningArtifactId() + ",");
        if (getProductId() != null)
            sb.append("ProductId: " + getProductId() + ",");
        if (getProvisioningArtifactName() != null)
            sb.append("ProvisioningArtifactName: " + getProvisioningArtifactName() + ",");
        if (getProductName() != null)
            sb.append("ProductName: " + getProductName() + ",");
        if (getVerbose() != null)
            sb.append("Verbose: " + getVerbose());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId()
                        .hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisioningArtifactName() == null) ? 0 : getProvisioningArtifactName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getProductName() == null) ? 0 : getProductName().hashCode());
        hashCode = prime * hashCode + ((getVerbose() == null) ? 0 : getVerbose().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProvisioningArtifactRequest == false)
            return false;
        DescribeProvisioningArtifactRequest other = (DescribeProvisioningArtifactRequest) obj;

        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null
                && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null
                && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null
                && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProvisioningArtifactName() == null
                ^ this.getProvisioningArtifactName() == null)
            return false;
        if (other.getProvisioningArtifactName() != null
                && other.getProvisioningArtifactName().equals(this.getProvisioningArtifactName()) == false)
            return false;
        if (other.getProductName() == null ^ this.getProductName() == null)
            return false;
        if (other.getProductName() != null
                && other.getProductName().equals(this.getProductName()) == false)
            return false;
        if (other.getVerbose() == null ^ this.getVerbose() == null)
            return false;
        if (other.getVerbose() != null && other.getVerbose().equals(this.getVerbose()) == false)
            return false;
        return true;
    }
}
