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

public class SearchProductsResult implements Serializable {
    /**
     * <p>
     * Information about the product views.
     * </p>
     */
    private java.util.List<ProductViewSummary> productViewSummaries;

    /**
     * <p>
     * The product view aggregations.
     * </p>
     */
    private java.util.Map<String, java.util.List<ProductViewAggregationValue>> productViewAggregations;

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
    public java.util.List<ProductViewSummary> getProductViewSummaries() {
        return productViewSummaries;
    }

    /**
     * <p>
     * Information about the product views.
     * </p>
     *
     * @param productViewSummaries <p>
     *            Information about the product views.
     *            </p>
     */
    public void setProductViewSummaries(
            java.util.Collection<ProductViewSummary> productViewSummaries) {
        if (productViewSummaries == null) {
            this.productViewSummaries = null;
            return;
        }

        this.productViewSummaries = new java.util.ArrayList<ProductViewSummary>(
                productViewSummaries);
    }

    /**
     * <p>
     * Information about the product views.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productViewSummaries <p>
     *            Information about the product views.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchProductsResult withProductViewSummaries(ProductViewSummary... productViewSummaries) {
        if (getProductViewSummaries() == null) {
            this.productViewSummaries = new java.util.ArrayList<ProductViewSummary>(
                    productViewSummaries.length);
        }
        for (ProductViewSummary value : productViewSummaries) {
            this.productViewSummaries.add(value);
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
     * @param productViewSummaries <p>
     *            Information about the product views.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchProductsResult withProductViewSummaries(
            java.util.Collection<ProductViewSummary> productViewSummaries) {
        setProductViewSummaries(productViewSummaries);
        return this;
    }

    /**
     * <p>
     * The product view aggregations.
     * </p>
     *
     * @return <p>
     *         The product view aggregations.
     *         </p>
     */
    public java.util.Map<String, java.util.List<ProductViewAggregationValue>> getProductViewAggregations() {
        return productViewAggregations;
    }

    /**
     * <p>
     * The product view aggregations.
     * </p>
     *
     * @param productViewAggregations <p>
     *            The product view aggregations.
     *            </p>
     */
    public void setProductViewAggregations(
            java.util.Map<String, java.util.List<ProductViewAggregationValue>> productViewAggregations) {
        this.productViewAggregations = productViewAggregations;
    }

    /**
     * <p>
     * The product view aggregations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productViewAggregations <p>
     *            The product view aggregations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchProductsResult withProductViewAggregations(
            java.util.Map<String, java.util.List<ProductViewAggregationValue>> productViewAggregations) {
        this.productViewAggregations = productViewAggregations;
        return this;
    }

    /**
     * <p>
     * The product view aggregations.
     * </p>
     * <p>
     * The method adds a new key-value pair into ProductViewAggregations
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into ProductViewAggregations.
     * @param value The corresponding value of the entry to be added into
     *            ProductViewAggregations.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchProductsResult addProductViewAggregationsEntry(String key,
            java.util.List<ProductViewAggregationValue> value) {
        if (null == this.productViewAggregations) {
            this.productViewAggregations = new java.util.HashMap<String, java.util.List<ProductViewAggregationValue>>();
        }
        if (this.productViewAggregations.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.productViewAggregations.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ProductViewAggregations.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SearchProductsResult clearProductViewAggregationsEntries() {
        this.productViewAggregations = null;
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
    public SearchProductsResult withNextPageToken(String nextPageToken) {
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
        if (getProductViewSummaries() != null)
            sb.append("ProductViewSummaries: " + getProductViewSummaries() + ",");
        if (getProductViewAggregations() != null)
            sb.append("ProductViewAggregations: " + getProductViewAggregations() + ",");
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
                + ((getProductViewSummaries() == null) ? 0 : getProductViewSummaries().hashCode());
        hashCode = prime
                * hashCode
                + ((getProductViewAggregations() == null) ? 0 : getProductViewAggregations()
                        .hashCode());
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

        if (obj instanceof SearchProductsResult == false)
            return false;
        SearchProductsResult other = (SearchProductsResult) obj;

        if (other.getProductViewSummaries() == null ^ this.getProductViewSummaries() == null)
            return false;
        if (other.getProductViewSummaries() != null
                && other.getProductViewSummaries().equals(this.getProductViewSummaries()) == false)
            return false;
        if (other.getProductViewAggregations() == null ^ this.getProductViewAggregations() == null)
            return false;
        if (other.getProductViewAggregations() != null
                && other.getProductViewAggregations().equals(this.getProductViewAggregations()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
