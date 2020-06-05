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

public class SearchProductsAsAdminResult implements Serializable {
    /**
     * <p>
     * Information about the product views.
     * </p>
     */
    private java.util.List<ProductViewDetail> productViewDetails;

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
     * Information about the product views.
     * </p>
     *
     * @return <p>
     *         Information about the product views.
     *         </p>
     */
    public java.util.List<ProductViewDetail> getProductViewDetails() {
        return productViewDetails;
    }

    /**
     * <p>
     * Information about the product views.
     * </p>
     *
     * @param productViewDetails <p>
     *            Information about the product views.
     *            </p>
     */
    public void setProductViewDetails(java.util.Collection<ProductViewDetail> productViewDetails) {
        if (productViewDetails == null) {
            this.productViewDetails = null;
            return;
        }

        this.productViewDetails = new java.util.ArrayList<ProductViewDetail>(productViewDetails);
    }

    /**
     * <p>
     * Information about the product views.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productViewDetails <p>
     *            Information about the product views.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchProductsAsAdminResult withProductViewDetails(
            ProductViewDetail... productViewDetails) {
        if (getProductViewDetails() == null) {
            this.productViewDetails = new java.util.ArrayList<ProductViewDetail>(
                    productViewDetails.length);
        }
        for (ProductViewDetail value : productViewDetails) {
            this.productViewDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the product views.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productViewDetails <p>
     *            Information about the product views.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchProductsAsAdminResult withProductViewDetails(
            java.util.Collection<ProductViewDetail> productViewDetails) {
        setProductViewDetails(productViewDetails);
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
    public SearchProductsAsAdminResult withNextPageToken(String nextPageToken) {
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
        if (getProductViewDetails() != null)
            sb.append("ProductViewDetails: " + getProductViewDetails() + ",");
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
                + ((getProductViewDetails() == null) ? 0 : getProductViewDetails().hashCode());
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

        if (obj instanceof SearchProductsAsAdminResult == false)
            return false;
        SearchProductsAsAdminResult other = (SearchProductsAsAdminResult) obj;

        if (other.getProductViewDetails() == null ^ this.getProductViewDetails() == null)
            return false;
        if (other.getProductViewDetails() != null
                && other.getProductViewDetails().equals(this.getProductViewDetails()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
