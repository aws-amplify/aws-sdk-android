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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Searches address books and lists the ones that meet a set of filter and sort
 * criteria.
 * </p>
 */
public class SearchAddressBooksRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The filters to use to list a specified set of address books. The
     * supported filter key is AddressBookName.
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The sort order to use in listing the specified set of address books. The
     * supported sort key is AddressBookName.
     * </p>
     */
    private java.util.List<Sort> sortCriteria;

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for
     * pagination of results from this action. If this parameter is specified,
     * the response only includes results beyond the token, up to the value
     * specified by MaxResults.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to include in the response. If more results
     * exist than the specified MaxResults value, a token is included in the
     * response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The filters to use to list a specified set of address books. The
     * supported filter key is AddressBookName.
     * </p>
     *
     * @return <p>
     *         The filters to use to list a specified set of address books. The
     *         supported filter key is AddressBookName.
     *         </p>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters to use to list a specified set of address books. The
     * supported filter key is AddressBookName.
     * </p>
     *
     * @param filters <p>
     *            The filters to use to list a specified set of address books.
     *            The supported filter key is AddressBookName.
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
     * The filters to use to list a specified set of address books. The
     * supported filter key is AddressBookName.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The filters to use to list a specified set of address books.
     *            The supported filter key is AddressBookName.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchAddressBooksRequest withFilters(Filter... filters) {
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
     * The filters to use to list a specified set of address books. The
     * supported filter key is AddressBookName.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The filters to use to list a specified set of address books.
     *            The supported filter key is AddressBookName.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchAddressBooksRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The sort order to use in listing the specified set of address books. The
     * supported sort key is AddressBookName.
     * </p>
     *
     * @return <p>
     *         The sort order to use in listing the specified set of address
     *         books. The supported sort key is AddressBookName.
     *         </p>
     */
    public java.util.List<Sort> getSortCriteria() {
        return sortCriteria;
    }

    /**
     * <p>
     * The sort order to use in listing the specified set of address books. The
     * supported sort key is AddressBookName.
     * </p>
     *
     * @param sortCriteria <p>
     *            The sort order to use in listing the specified set of address
     *            books. The supported sort key is AddressBookName.
     *            </p>
     */
    public void setSortCriteria(java.util.Collection<Sort> sortCriteria) {
        if (sortCriteria == null) {
            this.sortCriteria = null;
            return;
        }

        this.sortCriteria = new java.util.ArrayList<Sort>(sortCriteria);
    }

    /**
     * <p>
     * The sort order to use in listing the specified set of address books. The
     * supported sort key is AddressBookName.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sortCriteria <p>
     *            The sort order to use in listing the specified set of address
     *            books. The supported sort key is AddressBookName.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchAddressBooksRequest withSortCriteria(Sort... sortCriteria) {
        if (getSortCriteria() == null) {
            this.sortCriteria = new java.util.ArrayList<Sort>(sortCriteria.length);
        }
        for (Sort value : sortCriteria) {
            this.sortCriteria.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The sort order to use in listing the specified set of address books. The
     * supported sort key is AddressBookName.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sortCriteria <p>
     *            The sort order to use in listing the specified set of address
     *            books. The supported sort key is AddressBookName.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchAddressBooksRequest withSortCriteria(java.util.Collection<Sort> sortCriteria) {
        setSortCriteria(sortCriteria);
        return this;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for
     * pagination of results from this action. If this parameter is specified,
     * the response only includes results beyond the token, up to the value
     * specified by MaxResults.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @return <p>
     *         An optional token returned from a prior request. Use this token
     *         for pagination of results from this action. If this parameter is
     *         specified, the response only includes results beyond the token,
     *         up to the value specified by MaxResults.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for
     * pagination of results from this action. If this parameter is specified,
     * the response only includes results beyond the token, up to the value
     * specified by MaxResults.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            An optional token returned from a prior request. Use this
     *            token for pagination of results from this action. If this
     *            parameter is specified, the response only includes results
     *            beyond the token, up to the value specified by MaxResults.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for
     * pagination of results from this action. If this parameter is specified,
     * the response only includes results beyond the token, up to the value
     * specified by MaxResults.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            An optional token returned from a prior request. Use this
     *            token for pagination of results from this action. If this
     *            parameter is specified, the response only includes results
     *            beyond the token, up to the value specified by MaxResults.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchAddressBooksRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results
     * exist than the specified MaxResults value, a token is included in the
     * response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         The maximum number of results to include in the response. If more
     *         results exist than the specified MaxResults value, a token is
     *         included in the response so that the remaining results can be
     *         retrieved.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results
     * exist than the specified MaxResults value, a token is included in the
     * response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to include in the response. If
     *            more results exist than the specified MaxResults value, a
     *            token is included in the response so that the remaining
     *            results can be retrieved.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results
     * exist than the specified MaxResults value, a token is included in the
     * response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to include in the response. If
     *            more results exist than the specified MaxResults value, a
     *            token is included in the response so that the remaining
     *            results can be retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchAddressBooksRequest withMaxResults(Integer maxResults) {
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
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getSortCriteria() != null)
            sb.append("SortCriteria: " + getSortCriteria() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode
                + ((getSortCriteria() == null) ? 0 : getSortCriteria().hashCode());
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

        if (obj instanceof SearchAddressBooksRequest == false)
            return false;
        SearchAddressBooksRequest other = (SearchAddressBooksRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getSortCriteria() == null ^ this.getSortCriteria() == null)
            return false;
        if (other.getSortCriteria() != null
                && other.getSortCriteria().equals(this.getSortCriteria()) == false)
            return false;
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
