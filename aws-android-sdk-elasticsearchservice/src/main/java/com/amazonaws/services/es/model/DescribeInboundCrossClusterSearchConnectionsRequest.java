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

package com.amazonaws.services.es.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists all the inbound cross-cluster search connections for a destination
 * domain.
 * </p>
 */
public class DescribeInboundCrossClusterSearchConnectionsRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * A list of filters used to match properties for inbound cross-cluster
     * search connection. Available <code><a>Filter</a></code> names for this
     * operation are:
     * <ul>
     * <li>cross-cluster-search-connection-id</li>
     * <li>source-domain-info.domain-name</li>
     * <li>source-domain-info.owner-id</li>
     * <li>source-domain-info.region</li>
     * <li>destination-domain-info.domain-name</li>
     * </ul>
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * Set this value to limit the number of results returned. If not specified,
     * defaults to 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * NextToken is sent in case the earlier API call results contain the
     * NextToken. It is used for pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of filters used to match properties for inbound cross-cluster
     * search connection. Available <code><a>Filter</a></code> names for this
     * operation are:
     * <ul>
     * <li>cross-cluster-search-connection-id</li>
     * <li>source-domain-info.domain-name</li>
     * <li>source-domain-info.owner-id</li>
     * <li>source-domain-info.region</li>
     * <li>destination-domain-info.domain-name</li>
     * </ul>
     * </p>
     *
     * @return <p>
     *         A list of filters used to match properties for inbound
     *         cross-cluster search connection. Available
     *         <code><a>Filter</a></code> names for this operation are:
     *         <ul>
     *         <li>cross-cluster-search-connection-id</li>
     *         <li>source-domain-info.domain-name</li>
     *         <li>source-domain-info.owner-id</li>
     *         <li>source-domain-info.region</li>
     *         <li>destination-domain-info.domain-name</li>
     *         </ul>
     *         </p>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A list of filters used to match properties for inbound cross-cluster
     * search connection. Available <code><a>Filter</a></code> names for this
     * operation are:
     * <ul>
     * <li>cross-cluster-search-connection-id</li>
     * <li>source-domain-info.domain-name</li>
     * <li>source-domain-info.owner-id</li>
     * <li>source-domain-info.region</li>
     * <li>destination-domain-info.domain-name</li>
     * </ul>
     * </p>
     *
     * @param filters <p>
     *            A list of filters used to match properties for inbound
     *            cross-cluster search connection. Available
     *            <code><a>Filter</a></code> names for this operation are:
     *            <ul>
     *            <li>cross-cluster-search-connection-id</li>
     *            <li>source-domain-info.domain-name</li>
     *            <li>source-domain-info.owner-id</li>
     *            <li>source-domain-info.region</li>
     *            <li>destination-domain-info.domain-name</li>
     *            </ul>
     *            </p>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * A list of filters used to match properties for inbound cross-cluster
     * search connection. Available <code><a>Filter</a></code> names for this
     * operation are:
     * <ul>
     * <li>cross-cluster-search-connection-id</li>
     * <li>source-domain-info.domain-name</li>
     * <li>source-domain-info.owner-id</li>
     * <li>source-domain-info.region</li>
     * <li>destination-domain-info.domain-name</li>
     * </ul>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A list of filters used to match properties for inbound
     *            cross-cluster search connection. Available
     *            <code><a>Filter</a></code> names for this operation are:
     *            <ul>
     *            <li>cross-cluster-search-connection-id</li>
     *            <li>source-domain-info.domain-name</li>
     *            <li>source-domain-info.owner-id</li>
     *            <li>source-domain-info.region</li>
     *            <li>destination-domain-info.domain-name</li>
     *            </ul>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInboundCrossClusterSearchConnectionsRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of filters used to match properties for inbound cross-cluster
     * search connection. Available <code><a>Filter</a></code> names for this
     * operation are:
     * <ul>
     * <li>cross-cluster-search-connection-id</li>
     * <li>source-domain-info.domain-name</li>
     * <li>source-domain-info.owner-id</li>
     * <li>source-domain-info.region</li>
     * <li>destination-domain-info.domain-name</li>
     * </ul>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A list of filters used to match properties for inbound
     *            cross-cluster search connection. Available
     *            <code><a>Filter</a></code> names for this operation are:
     *            <ul>
     *            <li>cross-cluster-search-connection-id</li>
     *            <li>source-domain-info.domain-name</li>
     *            <li>source-domain-info.owner-id</li>
     *            <li>source-domain-info.region</li>
     *            <li>destination-domain-info.domain-name</li>
     *            </ul>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInboundCrossClusterSearchConnectionsRequest withFilters(
            java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. If not specified,
     * defaults to 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @return <p>
     *         Set this value to limit the number of results returned. If not
     *         specified, defaults to 100.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. If not specified,
     * defaults to 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @param maxResults <p>
     *            Set this value to limit the number of results returned. If not
     *            specified, defaults to 100.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. If not specified,
     * defaults to 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @param maxResults <p>
     *            Set this value to limit the number of results returned. If not
     *            specified, defaults to 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInboundCrossClusterSearchConnectionsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * NextToken is sent in case the earlier API call results contain the
     * NextToken. It is used for pagination.
     * </p>
     *
     * @return <p>
     *         NextToken is sent in case the earlier API call results contain
     *         the NextToken. It is used for pagination.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * NextToken is sent in case the earlier API call results contain the
     * NextToken. It is used for pagination.
     * </p>
     *
     * @param nextToken <p>
     *            NextToken is sent in case the earlier API call results contain
     *            the NextToken. It is used for pagination.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * NextToken is sent in case the earlier API call results contain the
     * NextToken. It is used for pagination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            NextToken is sent in case the earlier API call results contain
     *            the NextToken. It is used for pagination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInboundCrossClusterSearchConnectionsRequest withNextToken(String nextToken) {
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
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInboundCrossClusterSearchConnectionsRequest == false)
            return false;
        DescribeInboundCrossClusterSearchConnectionsRequest other = (DescribeInboundCrossClusterSearchConnectionsRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
