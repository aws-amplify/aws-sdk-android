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
 * Shares the specified portfolio with the specified account or organization
 * node. Shares to an organization node can only be created by the master
 * account of an Organization. AWSOrganizationsAccess must be enabled in order
 * to create a portfolio share to an organization node.
 * </p>
 */
public class CreatePortfolioShareRequest extends AmazonWebServiceRequest implements Serializable {
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
    private String portfolioId;

    /**
     * <p>
     * The AWS account ID. For example, <code>123456789012</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String accountId;

    /**
     * <p>
     * The organization node to whom you are going to share. If
     * <code>OrganizationNode</code> is passed in, <code>PortfolioShare</code>
     * will be created for the node and its children (when applies), and a
     * <code>PortfolioShareToken</code> will be returned in the output in order
     * for the administrator to monitor the status of the
     * <code>PortfolioShare</code> creation process.
     * </p>
     */
    private OrganizationNode organizationNode;

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
    public CreatePortfolioShareRequest withAcceptLanguage(String acceptLanguage) {
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
    public String getPortfolioId() {
        return portfolioId;
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
     * @param portfolioId <p>
     *            The portfolio identifier.
     *            </p>
     */
    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
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
     * @param portfolioId <p>
     *            The portfolio identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePortfolioShareRequest withPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }

    /**
     * <p>
     * The AWS account ID. For example, <code>123456789012</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The AWS account ID. For example, <code>123456789012</code>.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The AWS account ID. For example, <code>123456789012</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param accountId <p>
     *            The AWS account ID. For example, <code>123456789012</code>.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID. For example, <code>123456789012</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param accountId <p>
     *            The AWS account ID. For example, <code>123456789012</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePortfolioShareRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The organization node to whom you are going to share. If
     * <code>OrganizationNode</code> is passed in, <code>PortfolioShare</code>
     * will be created for the node and its children (when applies), and a
     * <code>PortfolioShareToken</code> will be returned in the output in order
     * for the administrator to monitor the status of the
     * <code>PortfolioShare</code> creation process.
     * </p>
     *
     * @return <p>
     *         The organization node to whom you are going to share. If
     *         <code>OrganizationNode</code> is passed in,
     *         <code>PortfolioShare</code> will be created for the node and its
     *         children (when applies), and a <code>PortfolioShareToken</code>
     *         will be returned in the output in order for the administrator to
     *         monitor the status of the <code>PortfolioShare</code> creation
     *         process.
     *         </p>
     */
    public OrganizationNode getOrganizationNode() {
        return organizationNode;
    }

    /**
     * <p>
     * The organization node to whom you are going to share. If
     * <code>OrganizationNode</code> is passed in, <code>PortfolioShare</code>
     * will be created for the node and its children (when applies), and a
     * <code>PortfolioShareToken</code> will be returned in the output in order
     * for the administrator to monitor the status of the
     * <code>PortfolioShare</code> creation process.
     * </p>
     *
     * @param organizationNode <p>
     *            The organization node to whom you are going to share. If
     *            <code>OrganizationNode</code> is passed in,
     *            <code>PortfolioShare</code> will be created for the node and
     *            its children (when applies), and a
     *            <code>PortfolioShareToken</code> will be returned in the
     *            output in order for the administrator to monitor the status of
     *            the <code>PortfolioShare</code> creation process.
     *            </p>
     */
    public void setOrganizationNode(OrganizationNode organizationNode) {
        this.organizationNode = organizationNode;
    }

    /**
     * <p>
     * The organization node to whom you are going to share. If
     * <code>OrganizationNode</code> is passed in, <code>PortfolioShare</code>
     * will be created for the node and its children (when applies), and a
     * <code>PortfolioShareToken</code> will be returned in the output in order
     * for the administrator to monitor the status of the
     * <code>PortfolioShare</code> creation process.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param organizationNode <p>
     *            The organization node to whom you are going to share. If
     *            <code>OrganizationNode</code> is passed in,
     *            <code>PortfolioShare</code> will be created for the node and
     *            its children (when applies), and a
     *            <code>PortfolioShareToken</code> will be returned in the
     *            output in order for the administrator to monitor the status of
     *            the <code>PortfolioShare</code> creation process.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePortfolioShareRequest withOrganizationNode(OrganizationNode organizationNode) {
        this.organizationNode = organizationNode;
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
        if (getPortfolioId() != null)
            sb.append("PortfolioId: " + getPortfolioId() + ",");
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getOrganizationNode() != null)
            sb.append("OrganizationNode: " + getOrganizationNode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode
                + ((getPortfolioId() == null) ? 0 : getPortfolioId().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getOrganizationNode() == null) ? 0 : getOrganizationNode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePortfolioShareRequest == false)
            return false;
        CreatePortfolioShareRequest other = (CreatePortfolioShareRequest) obj;

        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null
                && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getPortfolioId() == null ^ this.getPortfolioId() == null)
            return false;
        if (other.getPortfolioId() != null
                && other.getPortfolioId().equals(this.getPortfolioId()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getOrganizationNode() == null ^ this.getOrganizationNode() == null)
            return false;
        if (other.getOrganizationNode() != null
                && other.getOrganizationNode().equals(this.getOrganizationNode()) == false)
            return false;
        return true;
    }
}
