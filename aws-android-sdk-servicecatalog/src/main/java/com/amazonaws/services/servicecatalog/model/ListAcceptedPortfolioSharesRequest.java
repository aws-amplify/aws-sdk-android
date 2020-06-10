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
 * Lists all portfolios for which sharing was accepted by this account.
 * </p>
 */
public class ListAcceptedPortfolioSharesRequest extends AmazonWebServiceRequest implements
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
     * The type of shared portfolios to list. The default is to list imported
     * portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - List portfolios shared by the master
     * account of your organization
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - List default portfolios
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - List imported portfolios
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORTED, AWS_SERVICECATALOG, AWS_ORGANIZATIONS
     */
    private String portfolioShareType;

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
    public ListAcceptedPortfolioSharesRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
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
    public ListAcceptedPortfolioSharesRequest withPageToken(String pageToken) {
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
    public ListAcceptedPortfolioSharesRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * <p>
     * The type of shared portfolios to list. The default is to list imported
     * portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - List portfolios shared by the master
     * account of your organization
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - List default portfolios
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - List imported portfolios
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORTED, AWS_SERVICECATALOG, AWS_ORGANIZATIONS
     *
     * @return <p>
     *         The type of shared portfolios to list. The default is to list
     *         imported portfolios.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AWS_ORGANIZATIONS</code> - List portfolios shared by the
     *         master account of your organization
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS_SERVICECATALOG</code> - List default portfolios
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IMPORTED</code> - List imported portfolios
     *         </p>
     *         </li>
     *         </ul>
     * @see PortfolioShareType
     */
    public String getPortfolioShareType() {
        return portfolioShareType;
    }

    /**
     * <p>
     * The type of shared portfolios to list. The default is to list imported
     * portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - List portfolios shared by the master
     * account of your organization
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - List default portfolios
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - List imported portfolios
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORTED, AWS_SERVICECATALOG, AWS_ORGANIZATIONS
     *
     * @param portfolioShareType <p>
     *            The type of shared portfolios to list. The default is to list
     *            imported portfolios.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AWS_ORGANIZATIONS</code> - List portfolios shared by the
     *            master account of your organization
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AWS_SERVICECATALOG</code> - List default portfolios
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IMPORTED</code> - List imported portfolios
     *            </p>
     *            </li>
     *            </ul>
     * @see PortfolioShareType
     */
    public void setPortfolioShareType(String portfolioShareType) {
        this.portfolioShareType = portfolioShareType;
    }

    /**
     * <p>
     * The type of shared portfolios to list. The default is to list imported
     * portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - List portfolios shared by the master
     * account of your organization
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - List default portfolios
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - List imported portfolios
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORTED, AWS_SERVICECATALOG, AWS_ORGANIZATIONS
     *
     * @param portfolioShareType <p>
     *            The type of shared portfolios to list. The default is to list
     *            imported portfolios.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AWS_ORGANIZATIONS</code> - List portfolios shared by the
     *            master account of your organization
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AWS_SERVICECATALOG</code> - List default portfolios
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IMPORTED</code> - List imported portfolios
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PortfolioShareType
     */
    public ListAcceptedPortfolioSharesRequest withPortfolioShareType(String portfolioShareType) {
        this.portfolioShareType = portfolioShareType;
        return this;
    }

    /**
     * <p>
     * The type of shared portfolios to list. The default is to list imported
     * portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - List portfolios shared by the master
     * account of your organization
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - List default portfolios
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - List imported portfolios
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORTED, AWS_SERVICECATALOG, AWS_ORGANIZATIONS
     *
     * @param portfolioShareType <p>
     *            The type of shared portfolios to list. The default is to list
     *            imported portfolios.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AWS_ORGANIZATIONS</code> - List portfolios shared by the
     *            master account of your organization
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AWS_SERVICECATALOG</code> - List default portfolios
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IMPORTED</code> - List imported portfolios
     *            </p>
     *            </li>
     *            </ul>
     * @see PortfolioShareType
     */
    public void setPortfolioShareType(PortfolioShareType portfolioShareType) {
        this.portfolioShareType = portfolioShareType.toString();
    }

    /**
     * <p>
     * The type of shared portfolios to list. The default is to list imported
     * portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - List portfolios shared by the master
     * account of your organization
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - List default portfolios
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - List imported portfolios
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORTED, AWS_SERVICECATALOG, AWS_ORGANIZATIONS
     *
     * @param portfolioShareType <p>
     *            The type of shared portfolios to list. The default is to list
     *            imported portfolios.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AWS_ORGANIZATIONS</code> - List portfolios shared by the
     *            master account of your organization
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AWS_SERVICECATALOG</code> - List default portfolios
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IMPORTED</code> - List imported portfolios
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PortfolioShareType
     */
    public ListAcceptedPortfolioSharesRequest withPortfolioShareType(
            PortfolioShareType portfolioShareType) {
        this.portfolioShareType = portfolioShareType.toString();
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
        if (getPageToken() != null)
            sb.append("PageToken: " + getPageToken() + ",");
        if (getPageSize() != null)
            sb.append("PageSize: " + getPageSize() + ",");
        if (getPortfolioShareType() != null)
            sb.append("PortfolioShareType: " + getPortfolioShareType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode
                + ((getPortfolioShareType() == null) ? 0 : getPortfolioShareType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAcceptedPortfolioSharesRequest == false)
            return false;
        ListAcceptedPortfolioSharesRequest other = (ListAcceptedPortfolioSharesRequest) obj;

        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null
                && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
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
        if (other.getPortfolioShareType() == null ^ this.getPortfolioShareType() == null)
            return false;
        if (other.getPortfolioShareType() != null
                && other.getPortfolioShareType().equals(this.getPortfolioShareType()) == false)
            return false;
        return true;
    }
}
