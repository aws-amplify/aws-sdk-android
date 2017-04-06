/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The historical Spot prices.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<SpotPrice> spotPriceHistory;

    /**
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     */
    private String nextToken;

    /**
     * The historical Spot prices.
     *
     * @return The historical Spot prices.
     */
    public java.util.List<SpotPrice> getSpotPriceHistory() {
        if (spotPriceHistory == null) {
              spotPriceHistory = new com.amazonaws.internal.ListWithAutoConstructFlag<SpotPrice>();
              spotPriceHistory.setAutoConstruct(true);
        }
        return spotPriceHistory;
    }
    
    /**
     * The historical Spot prices.
     *
     * @param spotPriceHistory The historical Spot prices.
     */
    public void setSpotPriceHistory(java.util.Collection<SpotPrice> spotPriceHistory) {
        if (spotPriceHistory == null) {
            this.spotPriceHistory = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<SpotPrice> spotPriceHistoryCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SpotPrice>(spotPriceHistory.size());
        spotPriceHistoryCopy.addAll(spotPriceHistory);
        this.spotPriceHistory = spotPriceHistoryCopy;
    }
    
    /**
     * The historical Spot prices.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotPriceHistory The historical Spot prices.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotPriceHistoryResult withSpotPriceHistory(SpotPrice... spotPriceHistory) {
        if (getSpotPriceHistory() == null) setSpotPriceHistory(new java.util.ArrayList<SpotPrice>(spotPriceHistory.length));
        for (SpotPrice value : spotPriceHistory) {
            getSpotPriceHistory().add(value);
        }
        return this;
    }
    
    /**
     * The historical Spot prices.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotPriceHistory The historical Spot prices.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotPriceHistoryResult withSpotPriceHistory(java.util.Collection<SpotPrice> spotPriceHistory) {
        if (spotPriceHistory == null) {
            this.spotPriceHistory = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<SpotPrice> spotPriceHistoryCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SpotPrice>(spotPriceHistory.size());
            spotPriceHistoryCopy.addAll(spotPriceHistory);
            this.spotPriceHistory = spotPriceHistoryCopy;
        }

        return this;
    }

    /**
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @return The token required to retrieve the next set of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @param nextToken The token required to retrieve the next set of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token required to retrieve the next set of results. This value is
     *         <code>null</code> when there are no more results to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotPriceHistoryResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSpotPriceHistory() != null) sb.append("SpotPriceHistory: " + getSpotPriceHistory() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSpotPriceHistory() == null) ? 0 : getSpotPriceHistory().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSpotPriceHistoryResult == false) return false;
        DescribeSpotPriceHistoryResult other = (DescribeSpotPriceHistoryResult)obj;
        
        if (other.getSpotPriceHistory() == null ^ this.getSpotPriceHistory() == null) return false;
        if (other.getSpotPriceHistory() != null && other.getSpotPriceHistory().equals(this.getSpotPriceHistory()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    