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

public class ListPortfoliosForProductResult implements Serializable {
    /**
     * <p>
     * Information about the portfolios.
     * </p>
     */
    private java.util.List<PortfolioDetail> portfolioDetails;

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     */
    private String nextPageToken;

    /**
     * <p>
     * Information about the portfolios.
     * </p>
     *
     * @return <p>
     *         Information about the portfolios.
     *         </p>
     */
    public java.util.List<PortfolioDetail> getPortfolioDetails() {
        return portfolioDetails;
    }

    /**
     * <p>
     * Information about the portfolios.
     * </p>
     *
     * @param portfolioDetails <p>
     *            Information about the portfolios.
     *            </p>
     */
    public void setPortfolioDetails(java.util.Collection<PortfolioDetail> portfolioDetails) {
        if (portfolioDetails == null) {
            this.portfolioDetails = null;
            return;
        }

        this.portfolioDetails = new java.util.ArrayList<PortfolioDetail>(portfolioDetails);
    }

    /**
     * <p>
     * Information about the portfolios.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portfolioDetails <p>
     *            Information about the portfolios.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPortfoliosForProductResult withPortfolioDetails(PortfolioDetail... portfolioDetails) {
        if (getPortfolioDetails() == null) {
            this.portfolioDetails = new java.util.ArrayList<PortfolioDetail>(
                    portfolioDetails.length);
        }
        for (PortfolioDetail value : portfolioDetails) {
            this.portfolioDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the portfolios.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portfolioDetails <p>
     *            Information about the portfolios.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPortfoliosForProductResult withPortfolioDetails(
            java.util.Collection<PortfolioDetail> portfolioDetails) {
        setPortfolioDetails(portfolioDetails);
        return this;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @return <p>
     *         The page token to use to retrieve the next set of results. If
     *         there are no additional results, this value is null.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param nextPageToken <p>
     *            The page token to use to retrieve the next set of results. If
     *            there are no additional results, this value is null.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param nextPageToken <p>
     *            The page token to use to retrieve the next set of results. If
     *            there are no additional results, this value is null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPortfoliosForProductResult withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getPortfolioDetails() != null)
            sb.append("PortfolioDetails: " + getPortfolioDetails() + ",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPortfolioDetails() == null) ? 0 : getPortfolioDetails().hashCode());
        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPortfoliosForProductResult == false)
            return false;
        ListPortfoliosForProductResult other = (ListPortfoliosForProductResult) obj;

        if (other.getPortfolioDetails() == null ^ this.getPortfolioDetails() == null)
            return false;
        if (other.getPortfolioDetails() != null
                && other.getPortfolioDetails().equals(this.getPortfolioDetails()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
