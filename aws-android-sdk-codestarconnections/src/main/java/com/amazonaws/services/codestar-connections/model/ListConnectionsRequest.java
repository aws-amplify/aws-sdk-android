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
package com.amazonaws.services.codestar-connections.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Lists the connections associated with your account.</p>
 */
public class ListConnectionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>Filters the list of connections to those associated with a specified provider, such as Bitbucket.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bitbucket
     */
    private String providerTypeFilter;

    /**
     * <p>The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned <code>nextToken</code> value.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 5000<br/>
     */
    private Integer maxResults;

    /**
     * <p>The token that was returned from the previous <code>ListConnections</code> call, which can be used to return the next set of connections in the list.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>Filters the list of connections to those associated with a specified provider, such as Bitbucket.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bitbucket
     *
     * @return <p>Filters the list of connections to those associated with a specified provider, such as Bitbucket.</p>
     *
     * @see ProviderType
     */
    public String getProviderTypeFilter() {
        return providerTypeFilter;
    }

    /**
     * <p>Filters the list of connections to those associated with a specified provider, such as Bitbucket.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bitbucket
     *
     * @param providerTypeFilter <p>Filters the list of connections to those associated with a specified provider, such as Bitbucket.</p>
     *
     * @see ProviderType
     */
    public void setProviderTypeFilter(String providerTypeFilter) {
        this.providerTypeFilter = providerTypeFilter;
    }

    /**
     * <p>Filters the list of connections to those associated with a specified provider, such as Bitbucket.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bitbucket
     *
     * @param providerTypeFilter <p>Filters the list of connections to those associated with a specified provider, such as Bitbucket.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ProviderType
     */
    public ListConnectionsRequest withProviderTypeFilter(String providerTypeFilter) {
        this.providerTypeFilter = providerTypeFilter;
        return this;
    }

    /**
     * <p>Filters the list of connections to those associated with a specified provider, such as Bitbucket.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bitbucket
     *
     * @param providerTypeFilter <p>Filters the list of connections to those associated with a specified provider, such as Bitbucket.</p>
     *
     * @see ProviderType
     */
    public void setProviderTypeFilter(ProviderType providerTypeFilter) {
        this.providerTypeFilter = providerTypeFilter.toString();
    }

    /**
     * <p>Filters the list of connections to those associated with a specified provider, such as Bitbucket.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bitbucket
     *
     * @param providerTypeFilter <p>Filters the list of connections to those associated with a specified provider, such as Bitbucket.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ProviderType
     */
    public ListConnectionsRequest withProviderTypeFilter(ProviderType providerTypeFilter) {
        this.providerTypeFilter = providerTypeFilter.toString();
        return this;
    }

    /**
     * <p>The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned <code>nextToken</code> value.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 5000<br/>
     *
     * @return <p>The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned <code>nextToken</code> value.</p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned <code>nextToken</code> value.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 5000<br/>
     *
     * @param maxResults <p>The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned <code>nextToken</code> value.</p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned <code>nextToken</code> value.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 5000<br/>
     *
     * @param maxResults <p>The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned <code>nextToken</code> value.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListConnectionsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>The token that was returned from the previous <code>ListConnections</code> call, which can be used to return the next set of connections in the list.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>The token that was returned from the previous <code>ListConnections</code> call, which can be used to return the next set of connections in the list.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token that was returned from the previous <code>ListConnections</code> call, which can be used to return the next set of connections in the list.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>The token that was returned from the previous <code>ListConnections</code> call, which can be used to return the next set of connections in the list.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token that was returned from the previous <code>ListConnections</code> call, which can be used to return the next set of connections in the list.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>The token that was returned from the previous <code>ListConnections</code> call, which can be used to return the next set of connections in the list.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListConnectionsRequest withNextToken(String nextToken) {
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
        if (getProviderTypeFilter() != null) sb.append("ProviderTypeFilter: " + getProviderTypeFilter() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProviderTypeFilter() == null) ? 0 : getProviderTypeFilter().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListConnectionsRequest == false) return false;
        ListConnectionsRequest other = (ListConnectionsRequest)obj;

        if (other.getProviderTypeFilter() == null ^ this.getProviderTypeFilter() == null) return false;
        if (other.getProviderTypeFilter() != null && other.getProviderTypeFilter().equals(this.getProviderTypeFilter()) == false) return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
