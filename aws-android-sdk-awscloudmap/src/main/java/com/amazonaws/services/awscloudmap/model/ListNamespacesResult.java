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

package com.amazonaws.services.awscloudmap.model;

import java.io.Serializable;

public class ListNamespacesResult implements Serializable {
    /**
     * <p>
     * An array that contains one <code>NamespaceSummary</code> object for each
     * namespace that matches the specified filter criteria.
     * </p>
     */
    private java.util.List<NamespaceSummary> namespaces;

    /**
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
     * An array that contains one <code>NamespaceSummary</code> object for each
     * namespace that matches the specified filter criteria.
     * </p>
     *
     * @return <p>
     *         An array that contains one <code>NamespaceSummary</code> object
     *         for each namespace that matches the specified filter criteria.
     *         </p>
     */
    public java.util.List<NamespaceSummary> getNamespaces() {
        return namespaces;
    }

    /**
     * <p>
     * An array that contains one <code>NamespaceSummary</code> object for each
     * namespace that matches the specified filter criteria.
     * </p>
     *
     * @param namespaces <p>
     *            An array that contains one <code>NamespaceSummary</code>
     *            object for each namespace that matches the specified filter
     *            criteria.
     *            </p>
     */
    public void setNamespaces(java.util.Collection<NamespaceSummary> namespaces) {
        if (namespaces == null) {
            this.namespaces = null;
            return;
        }

        this.namespaces = new java.util.ArrayList<NamespaceSummary>(namespaces);
    }

    /**
     * <p>
     * An array that contains one <code>NamespaceSummary</code> object for each
     * namespace that matches the specified filter criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param namespaces <p>
     *            An array that contains one <code>NamespaceSummary</code>
     *            object for each namespace that matches the specified filter
     *            criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNamespacesResult withNamespaces(NamespaceSummary... namespaces) {
        if (getNamespaces() == null) {
            this.namespaces = new java.util.ArrayList<NamespaceSummary>(namespaces.length);
        }
        for (NamespaceSummary value : namespaces) {
            this.namespaces.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains one <code>NamespaceSummary</code> object for each
     * namespace that matches the specified filter criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param namespaces <p>
     *            An array that contains one <code>NamespaceSummary</code>
     *            object for each namespace that matches the specified filter
     *            criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNamespacesResult withNamespaces(java.util.Collection<NamespaceSummary> namespaces) {
        setNamespaces(namespaces);
        return this;
    }

    /**
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
    public ListNamespacesResult withNextToken(String nextToken) {
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
        if (getNamespaces() != null)
            sb.append("Namespaces: " + getNamespaces() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespaces() == null) ? 0 : getNamespaces().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListNamespacesResult == false)
            return false;
        ListNamespacesResult other = (ListNamespacesResult) obj;

        if (other.getNamespaces() == null ^ this.getNamespaces() == null)
            return false;
        if (other.getNamespaces() != null
                && other.getNamespaces().equals(this.getNamespaces()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
