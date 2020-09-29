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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Query inventory information.</p>
 */
public class GetInventoryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>One or more filters. Use a filter to return a more specific list of results.</p>
     */
    private java.util.List<InventoryFilter> filters;

    /**
     * <p>Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using an expression that uses the <code>AWS:InstanceInformation.PlatformType</code> type, you can see a count of how many Windows and Linux instances exist in your inventoried fleet.</p>
     */
    private java.util.List<InventoryAggregator> aggregators;

    /**
     * <p>The list of inventory item types to return.</p>
     */
    private java.util.List<ResultAttribute> resultAttributes;

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     */
    private String nextToken;

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>One or more filters. Use a filter to return a more specific list of results.</p>
     *
     * @return <p>One or more filters. Use a filter to return a more specific list of results.</p>
     */
    public java.util.List<InventoryFilter> getFilters() {
        return filters;
    }

    /**
     * <p>One or more filters. Use a filter to return a more specific list of results.</p>
     *
     * @param filters <p>One or more filters. Use a filter to return a more specific list of results.</p>
     */
    public void setFilters(java.util.Collection<InventoryFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<InventoryFilter>(filters);
    }

    /**
     * <p>One or more filters. Use a filter to return a more specific list of results.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>One or more filters. Use a filter to return a more specific list of results.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetInventoryRequest withFilters(InventoryFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<InventoryFilter>(filters.length);
        }
        for (InventoryFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>One or more filters. Use a filter to return a more specific list of results.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>One or more filters. Use a filter to return a more specific list of results.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetInventoryRequest withFilters(java.util.Collection<InventoryFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using an expression that uses the <code>AWS:InstanceInformation.PlatformType</code> type, you can see a count of how many Windows and Linux instances exist in your inventoried fleet.</p>
     *
     * @return <p>Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using an expression that uses the <code>AWS:InstanceInformation.PlatformType</code> type, you can see a count of how many Windows and Linux instances exist in your inventoried fleet.</p>
     */
    public java.util.List<InventoryAggregator> getAggregators() {
        return aggregators;
    }

    /**
     * <p>Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using an expression that uses the <code>AWS:InstanceInformation.PlatformType</code> type, you can see a count of how many Windows and Linux instances exist in your inventoried fleet.</p>
     *
     * @param aggregators <p>Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using an expression that uses the <code>AWS:InstanceInformation.PlatformType</code> type, you can see a count of how many Windows and Linux instances exist in your inventoried fleet.</p>
     */
    public void setAggregators(java.util.Collection<InventoryAggregator> aggregators) {
        if (aggregators == null) {
            this.aggregators = null;
            return;
        }

        this.aggregators = new java.util.ArrayList<InventoryAggregator>(aggregators);
    }

    /**
     * <p>Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using an expression that uses the <code>AWS:InstanceInformation.PlatformType</code> type, you can see a count of how many Windows and Linux instances exist in your inventoried fleet.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aggregators <p>Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using an expression that uses the <code>AWS:InstanceInformation.PlatformType</code> type, you can see a count of how many Windows and Linux instances exist in your inventoried fleet.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetInventoryRequest withAggregators(InventoryAggregator... aggregators) {
        if (getAggregators() == null) {
            this.aggregators = new java.util.ArrayList<InventoryAggregator>(aggregators.length);
        }
        for (InventoryAggregator value : aggregators) {
            this.aggregators.add(value);
        }
        return this;
    }

    /**
     * <p>Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using an expression that uses the <code>AWS:InstanceInformation.PlatformType</code> type, you can see a count of how many Windows and Linux instances exist in your inventoried fleet.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aggregators <p>Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using an expression that uses the <code>AWS:InstanceInformation.PlatformType</code> type, you can see a count of how many Windows and Linux instances exist in your inventoried fleet.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetInventoryRequest withAggregators(java.util.Collection<InventoryAggregator> aggregators) {
        setAggregators(aggregators);
        return this;
    }

    /**
     * <p>The list of inventory item types to return.</p>
     *
     * @return <p>The list of inventory item types to return.</p>
     */
    public java.util.List<ResultAttribute> getResultAttributes() {
        return resultAttributes;
    }

    /**
     * <p>The list of inventory item types to return.</p>
     *
     * @param resultAttributes <p>The list of inventory item types to return.</p>
     */
    public void setResultAttributes(java.util.Collection<ResultAttribute> resultAttributes) {
        if (resultAttributes == null) {
            this.resultAttributes = null;
            return;
        }

        this.resultAttributes = new java.util.ArrayList<ResultAttribute>(resultAttributes);
    }

    /**
     * <p>The list of inventory item types to return.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resultAttributes <p>The list of inventory item types to return.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetInventoryRequest withResultAttributes(ResultAttribute... resultAttributes) {
        if (getResultAttributes() == null) {
            this.resultAttributes = new java.util.ArrayList<ResultAttribute>(resultAttributes.length);
        }
        for (ResultAttribute value : resultAttributes) {
            this.resultAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>The list of inventory item types to return.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resultAttributes <p>The list of inventory item types to return.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetInventoryRequest withResultAttributes(java.util.Collection<ResultAttribute> resultAttributes) {
        setResultAttributes(resultAttributes);
        return this;
    }

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     *
     * @return <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     *
     * @param nextToken <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetInventoryRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetInventoryRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getAggregators() != null) sb.append("Aggregators: " + getAggregators() + ",");
        if (getResultAttributes() != null) sb.append("ResultAttributes: " + getResultAttributes() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getAggregators() == null) ? 0 : getAggregators().hashCode());
        hashCode = prime * hashCode + ((getResultAttributes() == null) ? 0 : getResultAttributes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetInventoryRequest == false) return false;
        GetInventoryRequest other = (GetInventoryRequest)obj;

        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false;
        if (other.getAggregators() == null ^ this.getAggregators() == null) return false;
        if (other.getAggregators() != null && other.getAggregators().equals(this.getAggregators()) == false) return false;
        if (other.getResultAttributes() == null ^ this.getResultAttributes() == null) return false;
        if (other.getResultAttributes() != null && other.getResultAttributes().equals(this.getResultAttributes()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        return true;
    }
}
