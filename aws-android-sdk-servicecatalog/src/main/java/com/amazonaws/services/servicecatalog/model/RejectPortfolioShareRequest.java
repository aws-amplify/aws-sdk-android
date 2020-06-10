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
 * Rejects an offer to share the specified portfolio.
 * </p>
 */
public class RejectPortfolioShareRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The type of shared portfolios to reject. The default is to reject
     * imported portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - Reject portfolios shared by the master
     * account of your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - Reject imported portfolios.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - Not supported. (Throws
     * ResourceNotFoundException.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example,
     * <code>aws servicecatalog reject-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS</code>
     * </p>
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
    public RejectPortfolioShareRequest withAcceptLanguage(String acceptLanguage) {
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
    public RejectPortfolioShareRequest withPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }

    /**
     * <p>
     * The type of shared portfolios to reject. The default is to reject
     * imported portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - Reject portfolios shared by the master
     * account of your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - Reject imported portfolios.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - Not supported. (Throws
     * ResourceNotFoundException.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example,
     * <code>aws servicecatalog reject-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORTED, AWS_SERVICECATALOG, AWS_ORGANIZATIONS
     *
     * @return <p>
     *         The type of shared portfolios to reject. The default is to reject
     *         imported portfolios.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AWS_ORGANIZATIONS</code> - Reject portfolios shared by the
     *         master account of your organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IMPORTED</code> - Reject imported portfolios.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS_SERVICECATALOG</code> - Not supported. (Throws
     *         ResourceNotFoundException.)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example,
     *         <code>aws servicecatalog reject-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS</code>
     *         </p>
     * @see PortfolioShareType
     */
    public String getPortfolioShareType() {
        return portfolioShareType;
    }

    /**
     * <p>
     * The type of shared portfolios to reject. The default is to reject
     * imported portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - Reject portfolios shared by the master
     * account of your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - Reject imported portfolios.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - Not supported. (Throws
     * ResourceNotFoundException.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example,
     * <code>aws servicecatalog reject-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORTED, AWS_SERVICECATALOG, AWS_ORGANIZATIONS
     *
     * @param portfolioShareType <p>
     *            The type of shared portfolios to reject. The default is to
     *            reject imported portfolios.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AWS_ORGANIZATIONS</code> - Reject portfolios shared by
     *            the master account of your organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IMPORTED</code> - Reject imported portfolios.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AWS_SERVICECATALOG</code> - Not supported. (Throws
     *            ResourceNotFoundException.)
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For example,
     *            <code>aws servicecatalog reject-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS</code>
     *            </p>
     * @see PortfolioShareType
     */
    public void setPortfolioShareType(String portfolioShareType) {
        this.portfolioShareType = portfolioShareType;
    }

    /**
     * <p>
     * The type of shared portfolios to reject. The default is to reject
     * imported portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - Reject portfolios shared by the master
     * account of your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - Reject imported portfolios.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - Not supported. (Throws
     * ResourceNotFoundException.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example,
     * <code>aws servicecatalog reject-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORTED, AWS_SERVICECATALOG, AWS_ORGANIZATIONS
     *
     * @param portfolioShareType <p>
     *            The type of shared portfolios to reject. The default is to
     *            reject imported portfolios.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AWS_ORGANIZATIONS</code> - Reject portfolios shared by
     *            the master account of your organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IMPORTED</code> - Reject imported portfolios.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AWS_SERVICECATALOG</code> - Not supported. (Throws
     *            ResourceNotFoundException.)
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For example,
     *            <code>aws servicecatalog reject-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PortfolioShareType
     */
    public RejectPortfolioShareRequest withPortfolioShareType(String portfolioShareType) {
        this.portfolioShareType = portfolioShareType;
        return this;
    }

    /**
     * <p>
     * The type of shared portfolios to reject. The default is to reject
     * imported portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - Reject portfolios shared by the master
     * account of your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - Reject imported portfolios.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - Not supported. (Throws
     * ResourceNotFoundException.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example,
     * <code>aws servicecatalog reject-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORTED, AWS_SERVICECATALOG, AWS_ORGANIZATIONS
     *
     * @param portfolioShareType <p>
     *            The type of shared portfolios to reject. The default is to
     *            reject imported portfolios.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AWS_ORGANIZATIONS</code> - Reject portfolios shared by
     *            the master account of your organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IMPORTED</code> - Reject imported portfolios.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AWS_SERVICECATALOG</code> - Not supported. (Throws
     *            ResourceNotFoundException.)
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For example,
     *            <code>aws servicecatalog reject-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS</code>
     *            </p>
     * @see PortfolioShareType
     */
    public void setPortfolioShareType(PortfolioShareType portfolioShareType) {
        this.portfolioShareType = portfolioShareType.toString();
    }

    /**
     * <p>
     * The type of shared portfolios to reject. The default is to reject
     * imported portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - Reject portfolios shared by the master
     * account of your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - Reject imported portfolios.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - Not supported. (Throws
     * ResourceNotFoundException.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example,
     * <code>aws servicecatalog reject-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORTED, AWS_SERVICECATALOG, AWS_ORGANIZATIONS
     *
     * @param portfolioShareType <p>
     *            The type of shared portfolios to reject. The default is to
     *            reject imported portfolios.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AWS_ORGANIZATIONS</code> - Reject portfolios shared by
     *            the master account of your organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IMPORTED</code> - Reject imported portfolios.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AWS_SERVICECATALOG</code> - Not supported. (Throws
     *            ResourceNotFoundException.)
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For example,
     *            <code>aws servicecatalog reject-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PortfolioShareType
     */
    public RejectPortfolioShareRequest withPortfolioShareType(PortfolioShareType portfolioShareType) {
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
        if (getPortfolioId() != null)
            sb.append("PortfolioId: " + getPortfolioId() + ",");
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
        hashCode = prime * hashCode
                + ((getPortfolioId() == null) ? 0 : getPortfolioId().hashCode());
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

        if (obj instanceof RejectPortfolioShareRequest == false)
            return false;
        RejectPortfolioShareRequest other = (RejectPortfolioShareRequest) obj;

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
        if (other.getPortfolioShareType() == null ^ this.getPortfolioShareType() == null)
            return false;
        if (other.getPortfolioShareType() != null
                && other.getPortfolioShareType().equals(this.getPortfolioShareType()) == false)
            return false;
        return true;
    }
}
