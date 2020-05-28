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

package com.amazonaws.services.catalog.marketplace.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the list of change sets owned by the account being used to make the
 * call. You can filter this list by providing any combination of
 * <code>entityId</code>, <code>ChangeSetName</code>, and status. If you provide
 * more than one filter, the API operation applies a logical AND between the
 * filters.
 * </p>
 * <p>
 * You can describe a change during the 60-day request history retention period
 * for API calls.
 * </p>
 */
public class ListChangeSetsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The catalog related to the request. Fixed value:
     * <code>AWSMarketplace</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     */
    private String catalog;

    /**
     * <p>
     * An array of filter objects.
     * </p>
     */
    private java.util.List<Filter> filterList;

    /**
     * <p>
     * An object that contains two attributes, <code>SortBy</code> and
     * <code>SortOrder</code>.
     * </p>
     */
    private Sort sort;

    /**
     * <p>
     * The maximum number of results returned by a single call. This value must
     * be provided in the next call to retrieve the next set of results. By
     * default, this value is 20.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[\w+=.:@\-\/]$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The catalog related to the request. Fixed value:
     * <code>AWSMarketplace</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @return <p>
     *         The catalog related to the request. Fixed value:
     *         <code>AWSMarketplace</code>
     *         </p>
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * <p>
     * The catalog related to the request. Fixed value:
     * <code>AWSMarketplace</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @param catalog <p>
     *            The catalog related to the request. Fixed value:
     *            <code>AWSMarketplace</code>
     *            </p>
     */
    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /**
     * <p>
     * The catalog related to the request. Fixed value:
     * <code>AWSMarketplace</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @param catalog <p>
     *            The catalog related to the request. Fixed value:
     *            <code>AWSMarketplace</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChangeSetsRequest withCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }

    /**
     * <p>
     * An array of filter objects.
     * </p>
     *
     * @return <p>
     *         An array of filter objects.
     *         </p>
     */
    public java.util.List<Filter> getFilterList() {
        return filterList;
    }

    /**
     * <p>
     * An array of filter objects.
     * </p>
     *
     * @param filterList <p>
     *            An array of filter objects.
     *            </p>
     */
    public void setFilterList(java.util.Collection<Filter> filterList) {
        if (filterList == null) {
            this.filterList = null;
            return;
        }

        this.filterList = new java.util.ArrayList<Filter>(filterList);
    }

    /**
     * <p>
     * An array of filter objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterList <p>
     *            An array of filter objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChangeSetsRequest withFilterList(Filter... filterList) {
        if (getFilterList() == null) {
            this.filterList = new java.util.ArrayList<Filter>(filterList.length);
        }
        for (Filter value : filterList) {
            this.filterList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of filter objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterList <p>
     *            An array of filter objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChangeSetsRequest withFilterList(java.util.Collection<Filter> filterList) {
        setFilterList(filterList);
        return this;
    }

    /**
     * <p>
     * An object that contains two attributes, <code>SortBy</code> and
     * <code>SortOrder</code>.
     * </p>
     *
     * @return <p>
     *         An object that contains two attributes, <code>SortBy</code> and
     *         <code>SortOrder</code>.
     *         </p>
     */
    public Sort getSort() {
        return sort;
    }

    /**
     * <p>
     * An object that contains two attributes, <code>SortBy</code> and
     * <code>SortOrder</code>.
     * </p>
     *
     * @param sort <p>
     *            An object that contains two attributes, <code>SortBy</code>
     *            and <code>SortOrder</code>.
     *            </p>
     */
    public void setSort(Sort sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * An object that contains two attributes, <code>SortBy</code> and
     * <code>SortOrder</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sort <p>
     *            An object that contains two attributes, <code>SortBy</code>
     *            and <code>SortOrder</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChangeSetsRequest withSort(Sort sort) {
        this.sort = sort;
        return this;
    }

    /**
     * <p>
     * The maximum number of results returned by a single call. This value must
     * be provided in the next call to retrieve the next set of results. By
     * default, this value is 20.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @return <p>
     *         The maximum number of results returned by a single call. This
     *         value must be provided in the next call to retrieve the next set
     *         of results. By default, this value is 20.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by a single call. This value must
     * be provided in the next call to retrieve the next set of results. By
     * default, this value is 20.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results returned by a single call. This
     *            value must be provided in the next call to retrieve the next
     *            set of results. By default, this value is 20.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by a single call. This value must
     * be provided in the next call to retrieve the next set of results. By
     * default, this value is 20.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results returned by a single call. This
     *            value must be provided in the next call to retrieve the next
     *            set of results. By default, this value is 20.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChangeSetsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[\w+=.:@\-\/]$<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[\w+=.:@\-\/]$<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[\w+=.:@\-\/]$<br/>
     *
     * @param nextToken <p>
     *            The token value retrieved from a previous call to access the
     *            next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChangeSetsRequest withNextToken(String nextToken) {
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
        if (getCatalog() != null)
            sb.append("Catalog: " + getCatalog() + ",");
        if (getFilterList() != null)
            sb.append("FilterList: " + getFilterList() + ",");
        if (getSort() != null)
            sb.append("Sort: " + getSort() + ",");
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

        hashCode = prime * hashCode + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        hashCode = prime * hashCode + ((getFilterList() == null) ? 0 : getFilterList().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
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

        if (obj instanceof ListChangeSetsRequest == false)
            return false;
        ListChangeSetsRequest other = (ListChangeSetsRequest) obj;

        if (other.getCatalog() == null ^ this.getCatalog() == null)
            return false;
        if (other.getCatalog() != null && other.getCatalog().equals(this.getCatalog()) == false)
            return false;
        if (other.getFilterList() == null ^ this.getFilterList() == null)
            return false;
        if (other.getFilterList() != null
                && other.getFilterList().equals(this.getFilterList()) == false)
            return false;
        if (other.getSort() == null ^ this.getSort() == null)
            return false;
        if (other.getSort() != null && other.getSort().equals(this.getSort()) == false)
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
