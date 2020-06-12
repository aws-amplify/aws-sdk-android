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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of existing clusters.
 * </p>
 */
public class ListClustersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListClusters</code> request indicating that more results are
     * available to fulfill the request and further calls will be needed. If
     * <code>maxResults</code> was provided, it is possible the number of
     * results to be fewer than <code>maxResults</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of cluster results returned by
     * <code>ListClusters</code> in paginated output. When this parameter is
     * used, <code>ListClusters</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>ListClusters</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListClusters</code> returns up to
     * 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListClusters</code> request indicating that more results are
     * available to fulfill the request and further calls will be needed. If
     * <code>maxResults</code> was provided, it is possible the number of
     * results to be fewer than <code>maxResults</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     *
     * @return <p>
     *         The <code>nextToken</code> value returned from a
     *         <code>ListClusters</code> request indicating that more results
     *         are available to fulfill the request and further calls will be
     *         needed. If <code>maxResults</code> was provided, it is possible
     *         the number of results to be fewer than <code>maxResults</code>.
     *         </p>
     *         <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is only
     *         used to retrieve the next items in a list and not for other
     *         programmatic purposes.
     *         </p>
     *         </note>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListClusters</code> request indicating that more results are
     * available to fulfill the request and further calls will be needed. If
     * <code>maxResults</code> was provided, it is possible the number of
     * results to be fewer than <code>maxResults</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value returned from a
     *            <code>ListClusters</code> request indicating that more results
     *            are available to fulfill the request and further calls will be
     *            needed. If <code>maxResults</code> was provided, it is
     *            possible the number of results to be fewer than
     *            <code>maxResults</code>.
     *            </p>
     *            <note>
     *            <p>
     *            This token should be treated as an opaque identifier that is
     *            only used to retrieve the next items in a list and not for
     *            other programmatic purposes.
     *            </p>
     *            </note>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListClusters</code> request indicating that more results are
     * available to fulfill the request and further calls will be needed. If
     * <code>maxResults</code> was provided, it is possible the number of
     * results to be fewer than <code>maxResults</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value returned from a
     *            <code>ListClusters</code> request indicating that more results
     *            are available to fulfill the request and further calls will be
     *            needed. If <code>maxResults</code> was provided, it is
     *            possible the number of results to be fewer than
     *            <code>maxResults</code>.
     *            </p>
     *            <note>
     *            <p>
     *            This token should be treated as an opaque identifier that is
     *            only used to retrieve the next items in a list and not for
     *            other programmatic purposes.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClustersRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of cluster results returned by
     * <code>ListClusters</code> in paginated output. When this parameter is
     * used, <code>ListClusters</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>ListClusters</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListClusters</code> returns up to
     * 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     *
     * @return <p>
     *         The maximum number of cluster results returned by
     *         <code>ListClusters</code> in paginated output. When this
     *         parameter is used, <code>ListClusters</code> only returns
     *         <code>maxResults</code> results in a single page along with a
     *         <code>nextToken</code> response element. The remaining results of
     *         the initial request can be seen by sending another
     *         <code>ListClusters</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and
     *         100. If this parameter is not used, then
     *         <code>ListClusters</code> returns up to 100 results and a
     *         <code>nextToken</code> value if applicable.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of cluster results returned by
     * <code>ListClusters</code> in paginated output. When this parameter is
     * used, <code>ListClusters</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>ListClusters</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListClusters</code> returns up to
     * 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of cluster results returned by
     *            <code>ListClusters</code> in paginated output. When this
     *            parameter is used, <code>ListClusters</code> only returns
     *            <code>maxResults</code> results in a single page along with a
     *            <code>nextToken</code> response element. The remaining results
     *            of the initial request can be seen by sending another
     *            <code>ListClusters</code> request with the returned
     *            <code>nextToken</code> value. This value can be between 1 and
     *            100. If this parameter is not used, then
     *            <code>ListClusters</code> returns up to 100 results and a
     *            <code>nextToken</code> value if applicable.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of cluster results returned by
     * <code>ListClusters</code> in paginated output. When this parameter is
     * used, <code>ListClusters</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>ListClusters</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListClusters</code> returns up to
     * 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of cluster results returned by
     *            <code>ListClusters</code> in paginated output. When this
     *            parameter is used, <code>ListClusters</code> only returns
     *            <code>maxResults</code> results in a single page along with a
     *            <code>nextToken</code> response element. The remaining results
     *            of the initial request can be seen by sending another
     *            <code>ListClusters</code> request with the returned
     *            <code>nextToken</code> value. This value can be between 1 and
     *            100. If this parameter is not used, then
     *            <code>ListClusters</code> returns up to 100 results and a
     *            <code>nextToken</code> value if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClustersRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListClustersRequest == false)
            return false;
        ListClustersRequest other = (ListClustersRequest) obj;

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
        return true;
    }
}
