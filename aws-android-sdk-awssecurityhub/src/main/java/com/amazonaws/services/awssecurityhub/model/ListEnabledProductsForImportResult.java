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

public class ListEnabledProductsForImportResult implements Serializable {
    /**
     * <p>
     * The list of ARNs for the resources that represent your subscriptions to
     * products.
     * </p>
     */
    private java.util.List<String> productSubscriptions;

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of ARNs for the resources that represent your subscriptions to
     * products.
     * </p>
     *
     * @return <p>
     *         The list of ARNs for the resources that represent your
     *         subscriptions to products.
     *         </p>
     */
    public java.util.List<String> getProductSubscriptions() {
        return productSubscriptions;
    }

    /**
     * <p>
     * The list of ARNs for the resources that represent your subscriptions to
     * products.
     * </p>
     *
     * @param productSubscriptions <p>
     *            The list of ARNs for the resources that represent your
     *            subscriptions to products.
     *            </p>
     */
    public void setProductSubscriptions(java.util.Collection<String> productSubscriptions) {
        if (productSubscriptions == null) {
            this.productSubscriptions = null;
            return;
        }

        this.productSubscriptions = new java.util.ArrayList<String>(productSubscriptions);
    }

    /**
     * <p>
     * The list of ARNs for the resources that represent your subscriptions to
     * products.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productSubscriptions <p>
     *            The list of ARNs for the resources that represent your
     *            subscriptions to products.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEnabledProductsForImportResult withProductSubscriptions(
            String... productSubscriptions) {
        if (getProductSubscriptions() == null) {
            this.productSubscriptions = new java.util.ArrayList<String>(productSubscriptions.length);
        }
        for (String value : productSubscriptions) {
            this.productSubscriptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of ARNs for the resources that represent your subscriptions to
     * products.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productSubscriptions <p>
     *            The list of ARNs for the resources that represent your
     *            subscriptions to products.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEnabledProductsForImportResult withProductSubscriptions(
            java.util.Collection<String> productSubscriptions) {
        setProductSubscriptions(productSubscriptions);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     *
     * @return <p>
     *         The pagination token to use to request the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The pagination token to use to request the next page of
     *            results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The pagination token to use to request the next page of
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEnabledProductsForImportResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getProductSubscriptions() != null)
            sb.append("ProductSubscriptions: " + getProductSubscriptions() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProductSubscriptions() == null) ? 0 : getProductSubscriptions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEnabledProductsForImportResult == false)
            return false;
        ListEnabledProductsForImportResult other = (ListEnabledProductsForImportResult) obj;

        if (other.getProductSubscriptions() == null ^ this.getProductSubscriptions() == null)
            return false;
        if (other.getProductSubscriptions() != null
                && other.getProductSubscriptions().equals(this.getProductSubscriptions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
