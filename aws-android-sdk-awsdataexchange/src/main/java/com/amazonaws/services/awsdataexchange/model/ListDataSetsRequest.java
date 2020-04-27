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

package com.amazonaws.services.awsdataexchange.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This operation lists your data sets. When listing by origin OWNED, results
 * are sorted by CreatedAt in descending order. When listing by origin ENTITLED,
 * there is no order and the maxResults parameter is ignored.
 * </p>
 */
public class ListDataSetsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The maximum number of results returned by a single call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A property that defines the data set as OWNED by the account (for
     * providers) or ENTITLED to the account (for subscribers).
     * </p>
     */
    private String origin;

    /**
     * <p>
     * The maximum number of results returned by a single call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     *
     * @return <p>
     *         The maximum number of results returned by a single call.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by a single call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results returned by a single call.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by a single call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results returned by a single call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDataSetsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of
     * results.
     * </p>
     *
     * @return <p>
     *         The token value retrieved from a previous call to access the next
     *         page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            The token value retrieved from a previous call to access the
     *            next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token value retrieved from a previous call to access the
     *            next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDataSetsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * A property that defines the data set as OWNED by the account (for
     * providers) or ENTITLED to the account (for subscribers).
     * </p>
     *
     * @return <p>
     *         A property that defines the data set as OWNED by the account (for
     *         providers) or ENTITLED to the account (for subscribers).
     *         </p>
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * <p>
     * A property that defines the data set as OWNED by the account (for
     * providers) or ENTITLED to the account (for subscribers).
     * </p>
     *
     * @param origin <p>
     *            A property that defines the data set as OWNED by the account
     *            (for providers) or ENTITLED to the account (for subscribers).
     *            </p>
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * A property that defines the data set as OWNED by the account (for
     * providers) or ENTITLED to the account (for subscribers).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param origin <p>
     *            A property that defines the data set as OWNED by the account
     *            (for providers) or ENTITLED to the account (for subscribers).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDataSetsRequest withOrigin(String origin) {
        this.origin = origin;
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
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getOrigin() != null)
            sb.append("Origin: " + getOrigin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDataSetsRequest == false)
            return false;
        ListDataSetsRequest other = (ListDataSetsRequest) obj;

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
        if (other.getOrigin() == null ^ this.getOrigin() == null)
            return false;
        if (other.getOrigin() != null && other.getOrigin().equals(this.getOrigin()) == false)
            return false;
        return true;
    }
}
