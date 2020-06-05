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

public class DescribePortfolioShareStatusResult implements Serializable {
    /**
     * <p>
     * The token for the portfolio share operation. For example,
     * <code>share-6v24abcdefghi</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String portfolioShareToken;

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
     * Organization node identifier. It can be either account id, organizational
     * unit id or organization id.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^[0-9]{12}$)|(^arn:aws:organizations::\d{12}:organization
     * \/o-[a-z0-9]
     * {10,32})|(^o-[a-z0-9]{10,32}$)|(^arn:aws:organizations::\d{12}
     * :ou\/o-[a-z0
     * -9]{10,32}\/ou-[0-9a-z]{4,32}-[0-9a-z]{8,32}$)|(^ou-[0-9a-z]{4
     * ,32}-[a-z0-9]{8,32}$)<br/>
     */
    private String organizationNodeValue;

    /**
     * <p>
     * Status of the portfolio share operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, COMPLETED,
     * COMPLETED_WITH_ERRORS, ERROR
     */
    private String status;

    /**
     * <p>
     * Information about the portfolio share operation.
     * </p>
     */
    private ShareDetails shareDetails;

    /**
     * <p>
     * The token for the portfolio share operation. For example,
     * <code>share-6v24abcdefghi</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The token for the portfolio share operation. For example,
     *         <code>share-6v24abcdefghi</code>.
     *         </p>
     */
    public String getPortfolioShareToken() {
        return portfolioShareToken;
    }

    /**
     * <p>
     * The token for the portfolio share operation. For example,
     * <code>share-6v24abcdefghi</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param portfolioShareToken <p>
     *            The token for the portfolio share operation. For example,
     *            <code>share-6v24abcdefghi</code>.
     *            </p>
     */
    public void setPortfolioShareToken(String portfolioShareToken) {
        this.portfolioShareToken = portfolioShareToken;
    }

    /**
     * <p>
     * The token for the portfolio share operation. For example,
     * <code>share-6v24abcdefghi</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param portfolioShareToken <p>
     *            The token for the portfolio share operation. For example,
     *            <code>share-6v24abcdefghi</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePortfolioShareStatusResult withPortfolioShareToken(String portfolioShareToken) {
        this.portfolioShareToken = portfolioShareToken;
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
    public DescribePortfolioShareStatusResult withPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }

    /**
     * <p>
     * Organization node identifier. It can be either account id, organizational
     * unit id or organization id.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^[0-9]{12}$)|(^arn:aws:organizations::\d{12}:organization
     * \/o-[a-z0-9]
     * {10,32})|(^o-[a-z0-9]{10,32}$)|(^arn:aws:organizations::\d{12}
     * :ou\/o-[a-z0
     * -9]{10,32}\/ou-[0-9a-z]{4,32}-[0-9a-z]{8,32}$)|(^ou-[0-9a-z]{4
     * ,32}-[a-z0-9]{8,32}$)<br/>
     *
     * @return <p>
     *         Organization node identifier. It can be either account id,
     *         organizational unit id or organization id.
     *         </p>
     */
    public String getOrganizationNodeValue() {
        return organizationNodeValue;
    }

    /**
     * <p>
     * Organization node identifier. It can be either account id, organizational
     * unit id or organization id.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^[0-9]{12}$)|(^arn:aws:organizations::\d{12}:organization
     * \/o-[a-z0-9]
     * {10,32})|(^o-[a-z0-9]{10,32}$)|(^arn:aws:organizations::\d{12}
     * :ou\/o-[a-z0
     * -9]{10,32}\/ou-[0-9a-z]{4,32}-[0-9a-z]{8,32}$)|(^ou-[0-9a-z]{4
     * ,32}-[a-z0-9]{8,32}$)<br/>
     *
     * @param organizationNodeValue <p>
     *            Organization node identifier. It can be either account id,
     *            organizational unit id or organization id.
     *            </p>
     */
    public void setOrganizationNodeValue(String organizationNodeValue) {
        this.organizationNodeValue = organizationNodeValue;
    }

    /**
     * <p>
     * Organization node identifier. It can be either account id, organizational
     * unit id or organization id.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^[0-9]{12}$)|(^arn:aws:organizations::\d{12}:organization
     * \/o-[a-z0-9]
     * {10,32})|(^o-[a-z0-9]{10,32}$)|(^arn:aws:organizations::\d{12}
     * :ou\/o-[a-z0
     * -9]{10,32}\/ou-[0-9a-z]{4,32}-[0-9a-z]{8,32}$)|(^ou-[0-9a-z]{4
     * ,32}-[a-z0-9]{8,32}$)<br/>
     *
     * @param organizationNodeValue <p>
     *            Organization node identifier. It can be either account id,
     *            organizational unit id or organization id.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePortfolioShareStatusResult withOrganizationNodeValue(String organizationNodeValue) {
        this.organizationNodeValue = organizationNodeValue;
        return this;
    }

    /**
     * <p>
     * Status of the portfolio share operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, COMPLETED,
     * COMPLETED_WITH_ERRORS, ERROR
     *
     * @return <p>
     *         Status of the portfolio share operation.
     *         </p>
     * @see ShareStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Status of the portfolio share operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, COMPLETED,
     * COMPLETED_WITH_ERRORS, ERROR
     *
     * @param status <p>
     *            Status of the portfolio share operation.
     *            </p>
     * @see ShareStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the portfolio share operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, COMPLETED,
     * COMPLETED_WITH_ERRORS, ERROR
     *
     * @param status <p>
     *            Status of the portfolio share operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ShareStatus
     */
    public DescribePortfolioShareStatusResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Status of the portfolio share operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, COMPLETED,
     * COMPLETED_WITH_ERRORS, ERROR
     *
     * @param status <p>
     *            Status of the portfolio share operation.
     *            </p>
     * @see ShareStatus
     */
    public void setStatus(ShareStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Status of the portfolio share operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, COMPLETED,
     * COMPLETED_WITH_ERRORS, ERROR
     *
     * @param status <p>
     *            Status of the portfolio share operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ShareStatus
     */
    public DescribePortfolioShareStatusResult withStatus(ShareStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Information about the portfolio share operation.
     * </p>
     *
     * @return <p>
     *         Information about the portfolio share operation.
     *         </p>
     */
    public ShareDetails getShareDetails() {
        return shareDetails;
    }

    /**
     * <p>
     * Information about the portfolio share operation.
     * </p>
     *
     * @param shareDetails <p>
     *            Information about the portfolio share operation.
     *            </p>
     */
    public void setShareDetails(ShareDetails shareDetails) {
        this.shareDetails = shareDetails;
    }

    /**
     * <p>
     * Information about the portfolio share operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shareDetails <p>
     *            Information about the portfolio share operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePortfolioShareStatusResult withShareDetails(ShareDetails shareDetails) {
        this.shareDetails = shareDetails;
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
        if (getPortfolioShareToken() != null)
            sb.append("PortfolioShareToken: " + getPortfolioShareToken() + ",");
        if (getPortfolioId() != null)
            sb.append("PortfolioId: " + getPortfolioId() + ",");
        if (getOrganizationNodeValue() != null)
            sb.append("OrganizationNodeValue: " + getOrganizationNodeValue() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getShareDetails() != null)
            sb.append("ShareDetails: " + getShareDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPortfolioShareToken() == null) ? 0 : getPortfolioShareToken().hashCode());
        hashCode = prime * hashCode
                + ((getPortfolioId() == null) ? 0 : getPortfolioId().hashCode());
        hashCode = prime
                * hashCode
                + ((getOrganizationNodeValue() == null) ? 0 : getOrganizationNodeValue().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getShareDetails() == null) ? 0 : getShareDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePortfolioShareStatusResult == false)
            return false;
        DescribePortfolioShareStatusResult other = (DescribePortfolioShareStatusResult) obj;

        if (other.getPortfolioShareToken() == null ^ this.getPortfolioShareToken() == null)
            return false;
        if (other.getPortfolioShareToken() != null
                && other.getPortfolioShareToken().equals(this.getPortfolioShareToken()) == false)
            return false;
        if (other.getPortfolioId() == null ^ this.getPortfolioId() == null)
            return false;
        if (other.getPortfolioId() != null
                && other.getPortfolioId().equals(this.getPortfolioId()) == false)
            return false;
        if (other.getOrganizationNodeValue() == null ^ this.getOrganizationNodeValue() == null)
            return false;
        if (other.getOrganizationNodeValue() != null
                && other.getOrganizationNodeValue().equals(this.getOrganizationNodeValue()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getShareDetails() == null ^ this.getShareDetails() == null)
            return false;
        if (other.getShareDetails() != null
                && other.getShareDetails().equals(this.getShareDetails()) == false)
            return false;
        return true;
    }
}
