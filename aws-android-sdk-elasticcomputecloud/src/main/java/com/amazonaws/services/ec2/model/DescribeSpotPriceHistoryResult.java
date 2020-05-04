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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of DescribeSpotPriceHistory.
 * </p>
 */
public class DescribeSpotPriceHistoryResult implements Serializable {
    /**
     * <p>
     * The token required to retrieve the next set of results. This value is
     * null or an empty string when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The historical Spot prices.
     * </p>
     */
    private java.util.List<SpotPrice> spotPriceHistory;

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is
     * null or an empty string when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The token required to retrieve the next set of results. This
     *         value is null or an empty string when there are no more results
     *         to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is
     * null or an empty string when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The token required to retrieve the next set of results. This
     *            value is null or an empty string when there are no more
     *            results to return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is
     * null or an empty string when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token required to retrieve the next set of results. This
     *            value is null or an empty string when there are no more
     *            results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotPriceHistoryResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The historical Spot prices.
     * </p>
     *
     * @return <p>
     *         The historical Spot prices.
     *         </p>
     */
    public java.util.List<SpotPrice> getSpotPriceHistory() {
        return spotPriceHistory;
    }

    /**
     * <p>
     * The historical Spot prices.
     * </p>
     *
     * @param spotPriceHistory <p>
     *            The historical Spot prices.
     *            </p>
     */
    public void setSpotPriceHistory(java.util.Collection<SpotPrice> spotPriceHistory) {
        if (spotPriceHistory == null) {
            this.spotPriceHistory = null;
            return;
        }

        this.spotPriceHistory = new java.util.ArrayList<SpotPrice>(spotPriceHistory);
    }

    /**
     * <p>
     * The historical Spot prices.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotPriceHistory <p>
     *            The historical Spot prices.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotPriceHistoryResult withSpotPriceHistory(SpotPrice... spotPriceHistory) {
        if (getSpotPriceHistory() == null) {
            this.spotPriceHistory = new java.util.ArrayList<SpotPrice>(spotPriceHistory.length);
        }
        for (SpotPrice value : spotPriceHistory) {
            this.spotPriceHistory.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The historical Spot prices.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotPriceHistory <p>
     *            The historical Spot prices.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotPriceHistoryResult withSpotPriceHistory(
            java.util.Collection<SpotPrice> spotPriceHistory) {
        setSpotPriceHistory(spotPriceHistory);
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
        if (getSpotPriceHistory() != null)
            sb.append("SpotPriceHistory: " + getSpotPriceHistory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getSpotPriceHistory() == null) ? 0 : getSpotPriceHistory().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSpotPriceHistoryResult == false)
            return false;
        DescribeSpotPriceHistoryResult other = (DescribeSpotPriceHistoryResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSpotPriceHistory() == null ^ this.getSpotPriceHistory() == null)
            return false;
        if (other.getSpotPriceHistory() != null
                && other.getSpotPriceHistory().equals(this.getSpotPriceHistory()) == false)
            return false;
        return true;
    }
}
