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
 * <p>Retrieves a list of all active sessions (both connected and disconnected) or terminated sessions from the past 30 days.</p>
 */
public class DescribeSessionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The session status to retrieve a list of sessions for. For example, "Active".</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, History
     */
    private String state;

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 200<br/>
     */
    private Integer maxResults;

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     */
    private String nextToken;

    /**
     * <p>One or more filters to limit the type of sessions returned by the request.</p>
     */
    private java.util.List<SessionFilter> filters;

    /**
     * <p>The session status to retrieve a list of sessions for. For example, "Active".</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, History
     *
     * @return <p>The session status to retrieve a list of sessions for. For example, "Active".</p>
     *
     * @see SessionState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>The session status to retrieve a list of sessions for. For example, "Active".</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, History
     *
     * @param state <p>The session status to retrieve a list of sessions for. For example, "Active".</p>
     *
     * @see SessionState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>The session status to retrieve a list of sessions for. For example, "Active".</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, History
     *
     * @param state <p>The session status to retrieve a list of sessions for. For example, "Active".</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see SessionState
     */
    public DescribeSessionsRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>The session status to retrieve a list of sessions for. For example, "Active".</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, History
     *
     * @param state <p>The session status to retrieve a list of sessions for. For example, "Active".</p>
     *
     * @see SessionState
     */
    public void setState(SessionState state) {
        this.state = state.toString();
    }

    /**
     * <p>The session status to retrieve a list of sessions for. For example, "Active".</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, History
     *
     * @param state <p>The session status to retrieve a list of sessions for. For example, "Active".</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see SessionState
     */
    public DescribeSessionsRequest withState(SessionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 200<br/>
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
     * <b>Range: </b>1 - 200<br/>
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
     * <b>Range: </b>1 - 200<br/>
     *
     * @param maxResults <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeSessionsRequest withMaxResults(Integer maxResults) {
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
    public DescribeSessionsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>One or more filters to limit the type of sessions returned by the request.</p>
     *
     * @return <p>One or more filters to limit the type of sessions returned by the request.</p>
     */
    public java.util.List<SessionFilter> getFilters() {
        return filters;
    }

    /**
     * <p>One or more filters to limit the type of sessions returned by the request.</p>
     *
     * @param filters <p>One or more filters to limit the type of sessions returned by the request.</p>
     */
    public void setFilters(java.util.Collection<SessionFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<SessionFilter>(filters);
    }

    /**
     * <p>One or more filters to limit the type of sessions returned by the request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>One or more filters to limit the type of sessions returned by the request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeSessionsRequest withFilters(SessionFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<SessionFilter>(filters.length);
        }
        for (SessionFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>One or more filters to limit the type of sessions returned by the request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>One or more filters to limit the type of sessions returned by the request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeSessionsRequest withFilters(java.util.Collection<SessionFilter> filters) {
        setFilters(filters);
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
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSessionsRequest == false) return false;
        DescribeSessionsRequest other = (DescribeSessionsRequest)obj;

        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false;
        return true;
    }
}
