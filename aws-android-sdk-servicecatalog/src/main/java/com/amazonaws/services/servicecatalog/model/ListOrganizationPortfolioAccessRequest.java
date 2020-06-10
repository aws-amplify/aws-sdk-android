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
 * Lists the organization nodes that have access to the specified portfolio.
 * This API can only be called by the master account in the organization or by a
 * delegated admin.
 * </p>
 * <p>
 * If a delegated admin is de-registered, they can no longer perform this
 * operation.
 * </p>
 */
public class ListOrganizationPortfolioAccessRequest extends AmazonWebServiceRequest implements
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
     * The portfolio identifier. For example, <code>port-2abcdext3y5fk</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String portfolioId;

    /**
     * <p>
     * The organization node type that will be returned in the output.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Organization that has access to the
     * portfolio.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATIONAL_UNIT</code> - Organizational unit that has access to
     * the portfolio within your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Account that has access to the portfolio within
     * your organization.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORGANIZATION, ORGANIZATIONAL_UNIT, ACCOUNT
     */
    private String organizationNodeType;

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of
     * results, use null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     */
    private String pageToken;

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 20<br/>
     */
    private Integer pageSize;

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
    public ListOrganizationPortfolioAccessRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * <p>
     * The portfolio identifier. For example, <code>port-2abcdext3y5fk</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The portfolio identifier. For example,
     *         <code>port-2abcdext3y5fk</code>.
     *         </p>
     */
    public String getPortfolioId() {
        return portfolioId;
    }

    /**
     * <p>
     * The portfolio identifier. For example, <code>port-2abcdext3y5fk</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param portfolioId <p>
     *            The portfolio identifier. For example,
     *            <code>port-2abcdext3y5fk</code>.
     *            </p>
     */
    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    /**
     * <p>
     * The portfolio identifier. For example, <code>port-2abcdext3y5fk</code>.
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
     *            The portfolio identifier. For example,
     *            <code>port-2abcdext3y5fk</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOrganizationPortfolioAccessRequest withPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }

    /**
     * <p>
     * The organization node type that will be returned in the output.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Organization that has access to the
     * portfolio.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATIONAL_UNIT</code> - Organizational unit that has access to
     * the portfolio within your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Account that has access to the portfolio within
     * your organization.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORGANIZATION, ORGANIZATIONAL_UNIT, ACCOUNT
     *
     * @return <p>
     *         The organization node type that will be returned in the output.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ORGANIZATION</code> - Organization that has access to the
     *         portfolio.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ORGANIZATIONAL_UNIT</code> - Organizational unit that has
     *         access to the portfolio within your organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACCOUNT</code> - Account that has access to the portfolio
     *         within your organization.
     *         </p>
     *         </li>
     *         </ul>
     * @see OrganizationNodeType
     */
    public String getOrganizationNodeType() {
        return organizationNodeType;
    }

    /**
     * <p>
     * The organization node type that will be returned in the output.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Organization that has access to the
     * portfolio.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATIONAL_UNIT</code> - Organizational unit that has access to
     * the portfolio within your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Account that has access to the portfolio within
     * your organization.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORGANIZATION, ORGANIZATIONAL_UNIT, ACCOUNT
     *
     * @param organizationNodeType <p>
     *            The organization node type that will be returned in the
     *            output.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ORGANIZATION</code> - Organization that has access to
     *            the portfolio.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ORGANIZATIONAL_UNIT</code> - Organizational unit that
     *            has access to the portfolio within your organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACCOUNT</code> - Account that has access to the
     *            portfolio within your organization.
     *            </p>
     *            </li>
     *            </ul>
     * @see OrganizationNodeType
     */
    public void setOrganizationNodeType(String organizationNodeType) {
        this.organizationNodeType = organizationNodeType;
    }

    /**
     * <p>
     * The organization node type that will be returned in the output.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Organization that has access to the
     * portfolio.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATIONAL_UNIT</code> - Organizational unit that has access to
     * the portfolio within your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Account that has access to the portfolio within
     * your organization.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORGANIZATION, ORGANIZATIONAL_UNIT, ACCOUNT
     *
     * @param organizationNodeType <p>
     *            The organization node type that will be returned in the
     *            output.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ORGANIZATION</code> - Organization that has access to
     *            the portfolio.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ORGANIZATIONAL_UNIT</code> - Organizational unit that
     *            has access to the portfolio within your organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACCOUNT</code> - Account that has access to the
     *            portfolio within your organization.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrganizationNodeType
     */
    public ListOrganizationPortfolioAccessRequest withOrganizationNodeType(
            String organizationNodeType) {
        this.organizationNodeType = organizationNodeType;
        return this;
    }

    /**
     * <p>
     * The organization node type that will be returned in the output.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Organization that has access to the
     * portfolio.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATIONAL_UNIT</code> - Organizational unit that has access to
     * the portfolio within your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Account that has access to the portfolio within
     * your organization.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORGANIZATION, ORGANIZATIONAL_UNIT, ACCOUNT
     *
     * @param organizationNodeType <p>
     *            The organization node type that will be returned in the
     *            output.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ORGANIZATION</code> - Organization that has access to
     *            the portfolio.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ORGANIZATIONAL_UNIT</code> - Organizational unit that
     *            has access to the portfolio within your organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACCOUNT</code> - Account that has access to the
     *            portfolio within your organization.
     *            </p>
     *            </li>
     *            </ul>
     * @see OrganizationNodeType
     */
    public void setOrganizationNodeType(OrganizationNodeType organizationNodeType) {
        this.organizationNodeType = organizationNodeType.toString();
    }

    /**
     * <p>
     * The organization node type that will be returned in the output.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Organization that has access to the
     * portfolio.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATIONAL_UNIT</code> - Organizational unit that has access to
     * the portfolio within your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Account that has access to the portfolio within
     * your organization.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORGANIZATION, ORGANIZATIONAL_UNIT, ACCOUNT
     *
     * @param organizationNodeType <p>
     *            The organization node type that will be returned in the
     *            output.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ORGANIZATION</code> - Organization that has access to
     *            the portfolio.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ORGANIZATIONAL_UNIT</code> - Organizational unit that
     *            has access to the portfolio within your organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACCOUNT</code> - Account that has access to the
     *            portfolio within your organization.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrganizationNodeType
     */
    public ListOrganizationPortfolioAccessRequest withOrganizationNodeType(
            OrganizationNodeType organizationNodeType) {
        this.organizationNodeType = organizationNodeType.toString();
        return this;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of
     * results, use null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @return <p>
     *         The page token for the next set of results. To retrieve the first
     *         set of results, use null.
     *         </p>
     */
    public String getPageToken() {
        return pageToken;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of
     * results, use null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param pageToken <p>
     *            The page token for the next set of results. To retrieve the
     *            first set of results, use null.
     *            </p>
     */
    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of
     * results, use null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param pageToken <p>
     *            The page token for the next set of results. To retrieve the
     *            first set of results, use null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOrganizationPortfolioAccessRequest withPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 20<br/>
     *
     * @return <p>
     *         The maximum number of items to return with this call.
     *         </p>
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 20<br/>
     *
     * @param pageSize <p>
     *            The maximum number of items to return with this call.
     *            </p>
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 20<br/>
     *
     * @param pageSize <p>
     *            The maximum number of items to return with this call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOrganizationPortfolioAccessRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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
        if (getOrganizationNodeType() != null)
            sb.append("OrganizationNodeType: " + getOrganizationNodeType() + ",");
        if (getPageToken() != null)
            sb.append("PageToken: " + getPageToken() + ",");
        if (getPageSize() != null)
            sb.append("PageSize: " + getPageSize());
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
        hashCode = prime * hashCode
                + ((getOrganizationNodeType() == null) ? 0 : getOrganizationNodeType().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOrganizationPortfolioAccessRequest == false)
            return false;
        ListOrganizationPortfolioAccessRequest other = (ListOrganizationPortfolioAccessRequest) obj;

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
        if (other.getOrganizationNodeType() == null ^ this.getOrganizationNodeType() == null)
            return false;
        if (other.getOrganizationNodeType() != null
                && other.getOrganizationNodeType().equals(this.getOrganizationNodeType()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null
                && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        return true;
    }
}
