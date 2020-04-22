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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

/**
 * <p>
 * Container for results from
 * <code>DescribeReservedElasticsearchInstanceOfferings</code>
 * </p>
 */
public class DescribeReservedElasticsearchInstanceOfferingsResult implements Serializable {
    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of reserved Elasticsearch instance offerings
     * </p>
     */
    private java.util.List<ReservedElasticsearchInstanceOffering> reservedElasticsearchInstanceOfferings;

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     *
     * @return <p>
     *         Provides an identifier to allow retrieval of paginated results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     *
     * @param nextToken <p>
     *            Provides an identifier to allow retrieval of paginated
     *            results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            Provides an identifier to allow retrieval of paginated
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedElasticsearchInstanceOfferingsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * List of reserved Elasticsearch instance offerings
     * </p>
     *
     * @return <p>
     *         List of reserved Elasticsearch instance offerings
     *         </p>
     */
    public java.util.List<ReservedElasticsearchInstanceOffering> getReservedElasticsearchInstanceOfferings() {
        return reservedElasticsearchInstanceOfferings;
    }

    /**
     * <p>
     * List of reserved Elasticsearch instance offerings
     * </p>
     *
     * @param reservedElasticsearchInstanceOfferings <p>
     *            List of reserved Elasticsearch instance offerings
     *            </p>
     */
    public void setReservedElasticsearchInstanceOfferings(
            java.util.Collection<ReservedElasticsearchInstanceOffering> reservedElasticsearchInstanceOfferings) {
        if (reservedElasticsearchInstanceOfferings == null) {
            this.reservedElasticsearchInstanceOfferings = null;
            return;
        }

        this.reservedElasticsearchInstanceOfferings = new java.util.ArrayList<ReservedElasticsearchInstanceOffering>(
                reservedElasticsearchInstanceOfferings);
    }

    /**
     * <p>
     * List of reserved Elasticsearch instance offerings
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedElasticsearchInstanceOfferings <p>
     *            List of reserved Elasticsearch instance offerings
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedElasticsearchInstanceOfferingsResult withReservedElasticsearchInstanceOfferings(
            ReservedElasticsearchInstanceOffering... reservedElasticsearchInstanceOfferings) {
        if (getReservedElasticsearchInstanceOfferings() == null) {
            this.reservedElasticsearchInstanceOfferings = new java.util.ArrayList<ReservedElasticsearchInstanceOffering>(
                    reservedElasticsearchInstanceOfferings.length);
        }
        for (ReservedElasticsearchInstanceOffering value : reservedElasticsearchInstanceOfferings) {
            this.reservedElasticsearchInstanceOfferings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of reserved Elasticsearch instance offerings
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedElasticsearchInstanceOfferings <p>
     *            List of reserved Elasticsearch instance offerings
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedElasticsearchInstanceOfferingsResult withReservedElasticsearchInstanceOfferings(
            java.util.Collection<ReservedElasticsearchInstanceOffering> reservedElasticsearchInstanceOfferings) {
        setReservedElasticsearchInstanceOfferings(reservedElasticsearchInstanceOfferings);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getReservedElasticsearchInstanceOfferings() != null)
            sb.append("ReservedElasticsearchInstanceOfferings: "
                    + getReservedElasticsearchInstanceOfferings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getReservedElasticsearchInstanceOfferings() == null) ? 0
                        : getReservedElasticsearchInstanceOfferings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedElasticsearchInstanceOfferingsResult == false)
            return false;
        DescribeReservedElasticsearchInstanceOfferingsResult other = (DescribeReservedElasticsearchInstanceOfferingsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReservedElasticsearchInstanceOfferings() == null
                ^ this.getReservedElasticsearchInstanceOfferings() == null)
            return false;
        if (other.getReservedElasticsearchInstanceOfferings() != null
                && other.getReservedElasticsearchInstanceOfferings().equals(
                        this.getReservedElasticsearchInstanceOfferings()) == false)
            return false;
        return true;
    }
}
