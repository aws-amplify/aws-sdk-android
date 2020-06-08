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

package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists summary information about the namespaces that were created by the
 * current AWS account.
 * </p>
 */
public class ListNamespacesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * For the first <code>ListNamespaces</code> request, omit this value.
     * </p>
     * <p>
     * If the response contains <code>NextToken</code>, submit another
     * <code>ListNamespaces</code> request to get the next group of results.
     * Specify the value of <code>NextToken</code> from the previous response in
     * the next request.
     * </p>
     * <note>
     * <p>
     * AWS Cloud Map gets <code>MaxResults</code> namespaces and then filters
     * them based on the specified criteria. It's possible that no namespaces in
     * the first <code>MaxResults</code> namespaces matched the specified
     * criteria but that subsequent groups of <code>MaxResults</code> namespaces
     * do contain namespaces that match the criteria.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of namespaces that you want AWS Cloud Map to return in
     * the response to a <code>ListNamespaces</code> request. If you don't
     * specify a value for <code>MaxResults</code>, AWS Cloud Map returns up to
     * 100 namespaces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A complex type that contains specifications for the namespaces that you
     * want to list.
     * </p>
     * <p>
     * If you specify more than one filter, a namespace must match all filters
     * to be returned by <code>ListNamespaces</code>.
     * </p>
     */
    private java.util.List<NamespaceFilter> filters;

    /**
     * <p>
     * For the first <code>ListNamespaces</code> request, omit this value.
     * </p>
     * <p>
     * If the response contains <code>NextToken</code>, submit another
     * <code>ListNamespaces</code> request to get the next group of results.
     * Specify the value of <code>NextToken</code> from the previous response in
     * the next request.
     * </p>
     * <note>
     * <p>
     * AWS Cloud Map gets <code>MaxResults</code> namespaces and then filters
     * them based on the specified criteria. It's possible that no namespaces in
     * the first <code>MaxResults</code> namespaces matched the specified
     * criteria but that subsequent groups of <code>MaxResults</code> namespaces
     * do contain namespaces that match the criteria.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @return <p>
     *         For the first <code>ListNamespaces</code> request, omit this
     *         value.
     *         </p>
     *         <p>
     *         If the response contains <code>NextToken</code>, submit another
     *         <code>ListNamespaces</code> request to get the next group of
     *         results. Specify the value of <code>NextToken</code> from the
     *         previous response in the next request.
     *         </p>
     *         <note>
     *         <p>
     *         AWS Cloud Map gets <code>MaxResults</code> namespaces and then
     *         filters them based on the specified criteria. It's possible that
     *         no namespaces in the first <code>MaxResults</code> namespaces
     *         matched the specified criteria but that subsequent groups of
     *         <code>MaxResults</code> namespaces do contain namespaces that
     *         match the criteria.
     *         </p>
     *         </note>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * For the first <code>ListNamespaces</code> request, omit this value.
     * </p>
     * <p>
     * If the response contains <code>NextToken</code>, submit another
     * <code>ListNamespaces</code> request to get the next group of results.
     * Specify the value of <code>NextToken</code> from the previous response in
     * the next request.
     * </p>
     * <note>
     * <p>
     * AWS Cloud Map gets <code>MaxResults</code> namespaces and then filters
     * them based on the specified criteria. It's possible that no namespaces in
     * the first <code>MaxResults</code> namespaces matched the specified
     * criteria but that subsequent groups of <code>MaxResults</code> namespaces
     * do contain namespaces that match the criteria.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param nextToken <p>
     *            For the first <code>ListNamespaces</code> request, omit this
     *            value.
     *            </p>
     *            <p>
     *            If the response contains <code>NextToken</code>, submit
     *            another <code>ListNamespaces</code> request to get the next
     *            group of results. Specify the value of <code>NextToken</code>
     *            from the previous response in the next request.
     *            </p>
     *            <note>
     *            <p>
     *            AWS Cloud Map gets <code>MaxResults</code> namespaces and then
     *            filters them based on the specified criteria. It's possible
     *            that no namespaces in the first <code>MaxResults</code>
     *            namespaces matched the specified criteria but that subsequent
     *            groups of <code>MaxResults</code> namespaces do contain
     *            namespaces that match the criteria.
     *            </p>
     *            </note>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For the first <code>ListNamespaces</code> request, omit this value.
     * </p>
     * <p>
     * If the response contains <code>NextToken</code>, submit another
     * <code>ListNamespaces</code> request to get the next group of results.
     * Specify the value of <code>NextToken</code> from the previous response in
     * the next request.
     * </p>
     * <note>
     * <p>
     * AWS Cloud Map gets <code>MaxResults</code> namespaces and then filters
     * them based on the specified criteria. It's possible that no namespaces in
     * the first <code>MaxResults</code> namespaces matched the specified
     * criteria but that subsequent groups of <code>MaxResults</code> namespaces
     * do contain namespaces that match the criteria.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param nextToken <p>
     *            For the first <code>ListNamespaces</code> request, omit this
     *            value.
     *            </p>
     *            <p>
     *            If the response contains <code>NextToken</code>, submit
     *            another <code>ListNamespaces</code> request to get the next
     *            group of results. Specify the value of <code>NextToken</code>
     *            from the previous response in the next request.
     *            </p>
     *            <note>
     *            <p>
     *            AWS Cloud Map gets <code>MaxResults</code> namespaces and then
     *            filters them based on the specified criteria. It's possible
     *            that no namespaces in the first <code>MaxResults</code>
     *            namespaces matched the specified criteria but that subsequent
     *            groups of <code>MaxResults</code> namespaces do contain
     *            namespaces that match the criteria.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNamespacesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of namespaces that you want AWS Cloud Map to return in
     * the response to a <code>ListNamespaces</code> request. If you don't
     * specify a value for <code>MaxResults</code>, AWS Cloud Map returns up to
     * 100 namespaces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of namespaces that you want AWS Cloud Map to
     *         return in the response to a <code>ListNamespaces</code> request.
     *         If you don't specify a value for <code>MaxResults</code>, AWS
     *         Cloud Map returns up to 100 namespaces.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of namespaces that you want AWS Cloud Map to return in
     * the response to a <code>ListNamespaces</code> request. If you don't
     * specify a value for <code>MaxResults</code>, AWS Cloud Map returns up to
     * 100 namespaces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of namespaces that you want AWS Cloud Map
     *            to return in the response to a <code>ListNamespaces</code>
     *            request. If you don't specify a value for
     *            <code>MaxResults</code>, AWS Cloud Map returns up to 100
     *            namespaces.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of namespaces that you want AWS Cloud Map to return in
     * the response to a <code>ListNamespaces</code> request. If you don't
     * specify a value for <code>MaxResults</code>, AWS Cloud Map returns up to
     * 100 namespaces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of namespaces that you want AWS Cloud Map
     *            to return in the response to a <code>ListNamespaces</code>
     *            request. If you don't specify a value for
     *            <code>MaxResults</code>, AWS Cloud Map returns up to 100
     *            namespaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNamespacesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A complex type that contains specifications for the namespaces that you
     * want to list.
     * </p>
     * <p>
     * If you specify more than one filter, a namespace must match all filters
     * to be returned by <code>ListNamespaces</code>.
     * </p>
     *
     * @return <p>
     *         A complex type that contains specifications for the namespaces
     *         that you want to list.
     *         </p>
     *         <p>
     *         If you specify more than one filter, a namespace must match all
     *         filters to be returned by <code>ListNamespaces</code>.
     *         </p>
     */
    public java.util.List<NamespaceFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A complex type that contains specifications for the namespaces that you
     * want to list.
     * </p>
     * <p>
     * If you specify more than one filter, a namespace must match all filters
     * to be returned by <code>ListNamespaces</code>.
     * </p>
     *
     * @param filters <p>
     *            A complex type that contains specifications for the namespaces
     *            that you want to list.
     *            </p>
     *            <p>
     *            If you specify more than one filter, a namespace must match
     *            all filters to be returned by <code>ListNamespaces</code>.
     *            </p>
     */
    public void setFilters(java.util.Collection<NamespaceFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<NamespaceFilter>(filters);
    }

    /**
     * <p>
     * A complex type that contains specifications for the namespaces that you
     * want to list.
     * </p>
     * <p>
     * If you specify more than one filter, a namespace must match all filters
     * to be returned by <code>ListNamespaces</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A complex type that contains specifications for the namespaces
     *            that you want to list.
     *            </p>
     *            <p>
     *            If you specify more than one filter, a namespace must match
     *            all filters to be returned by <code>ListNamespaces</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNamespacesRequest withFilters(NamespaceFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<NamespaceFilter>(filters.length);
        }
        for (NamespaceFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains specifications for the namespaces that you
     * want to list.
     * </p>
     * <p>
     * If you specify more than one filter, a namespace must match all filters
     * to be returned by <code>ListNamespaces</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A complex type that contains specifications for the namespaces
     *            that you want to list.
     *            </p>
     *            <p>
     *            If you specify more than one filter, a namespace must match
     *            all filters to be returned by <code>ListNamespaces</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNamespacesRequest withFilters(java.util.Collection<NamespaceFilter> filters) {
        setFilters(filters);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListNamespacesRequest == false)
            return false;
        ListNamespacesRequest other = (ListNamespacesRequest) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }
}
