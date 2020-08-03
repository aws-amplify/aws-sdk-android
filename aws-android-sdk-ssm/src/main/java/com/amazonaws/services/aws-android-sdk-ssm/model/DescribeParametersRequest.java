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
 * <p>Get information about a parameter.</p> <note> <p>Request results are returned on a best-effort basis. If you specify <code>MaxResults</code> in the request, the response includes information up to the limit specified. The number of items returned, however, can be between zero and the value of <code>MaxResults</code>. If the service reaches an internal limit while processing the results, it stops the operation and returns the matching values up to that point and a <code>NextToken</code>. You can specify the <code>NextToken</code> in a subsequent call to get the next set of results.</p> </note>
 */
public class DescribeParametersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>This data type is deprecated. Instead, use <code>ParameterFilters</code>.</p>
     */
    private java.util.List<ParametersFilter> filters;

    /**
     * <p>Filters to limit the request results.</p>
     */
    private java.util.List<ParameterStringFilter> parameterFilters;

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     */
    private String nextToken;

    /**
     * <p>This data type is deprecated. Instead, use <code>ParameterFilters</code>.</p>
     *
     * @return <p>This data type is deprecated. Instead, use <code>ParameterFilters</code>.</p>
     */
    public java.util.List<ParametersFilter> getFilters() {
        return filters;
    }

    /**
     * <p>This data type is deprecated. Instead, use <code>ParameterFilters</code>.</p>
     *
     * @param filters <p>This data type is deprecated. Instead, use <code>ParameterFilters</code>.</p>
     */
    public void setFilters(java.util.Collection<ParametersFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<ParametersFilter>(filters);
    }

    /**
     * <p>This data type is deprecated. Instead, use <code>ParameterFilters</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>This data type is deprecated. Instead, use <code>ParameterFilters</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeParametersRequest withFilters(ParametersFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<ParametersFilter>(filters.length);
        }
        for (ParametersFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>This data type is deprecated. Instead, use <code>ParameterFilters</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>This data type is deprecated. Instead, use <code>ParameterFilters</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeParametersRequest withFilters(java.util.Collection<ParametersFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>Filters to limit the request results.</p>
     *
     * @return <p>Filters to limit the request results.</p>
     */
    public java.util.List<ParameterStringFilter> getParameterFilters() {
        return parameterFilters;
    }

    /**
     * <p>Filters to limit the request results.</p>
     *
     * @param parameterFilters <p>Filters to limit the request results.</p>
     */
    public void setParameterFilters(java.util.Collection<ParameterStringFilter> parameterFilters) {
        if (parameterFilters == null) {
            this.parameterFilters = null;
            return;
        }

        this.parameterFilters = new java.util.ArrayList<ParameterStringFilter>(parameterFilters);
    }

    /**
     * <p>Filters to limit the request results.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterFilters <p>Filters to limit the request results.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeParametersRequest withParameterFilters(ParameterStringFilter... parameterFilters) {
        if (getParameterFilters() == null) {
            this.parameterFilters = new java.util.ArrayList<ParameterStringFilter>(parameterFilters.length);
        }
        for (ParameterStringFilter value : parameterFilters) {
            this.parameterFilters.add(value);
        }
        return this;
    }

    /**
     * <p>Filters to limit the request results.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterFilters <p>Filters to limit the request results.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeParametersRequest withParameterFilters(java.util.Collection<ParameterStringFilter> parameterFilters) {
        setParameterFilters(parameterFilters);
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
    public DescribeParametersRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
    public DescribeParametersRequest withNextToken(String nextToken) {
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
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getParameterFilters() != null) sb.append("ParameterFilters: " + getParameterFilters() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getParameterFilters() == null) ? 0 : getParameterFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeParametersRequest == false) return false;
        DescribeParametersRequest other = (DescribeParametersRequest)obj;

        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false;
        if (other.getParameterFilters() == null ^ this.getParameterFilters() == null) return false;
        if (other.getParameterFilters() != null && other.getParameterFilters().equals(this.getParameterFilters()) == false) return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
