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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Searches a set of tables based on properties in the table metadata as well as
 * on the parent database. You can search against text or filter conditions.
 * </p>
 * <p>
 * You can only get tables that you have access to based on the security
 * policies defined in Lake Formation. You need at least a read-only access to
 * the table for it to be returned. If you do not have access to all the columns
 * in the table, these columns will not be searched against when returning the
 * list of tables back to you. If you have access to the columns but not the
 * data in the columns, those columns and the associated metadata for those
 * columns will be included in the search.
 * </p>
 */
public class SearchTablesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique identifier, consisting of
     * <code> <i>account_id</i>/datalake</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String catalogId;

    /**
     * <p>
     * A continuation token, included if this is a continuation call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of key-value pairs, and a comparator used to filter the search
     * results. Returns all entities matching the predicate.
     * </p>
     */
    private java.util.List<PropertyPredicate> filters;

    /**
     * <p>
     * A string used for a text search.
     * </p>
     * <p>
     * Specifying a value in quotes filters based on an exact match to the
     * value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String searchText;

    /**
     * <p>
     * A list of criteria for sorting the results by a field name, in an
     * ascending or descending order.
     * </p>
     */
    private java.util.List<SortCriterion> sortCriteria;

    /**
     * <p>
     * The maximum number of tables to return in a single response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A unique identifier, consisting of
     * <code> <i>account_id</i>/datalake</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         A unique identifier, consisting of
     *         <code> <i>account_id</i>/datalake</code>.
     *         </p>
     */
    public String getCatalogId() {
        return catalogId;
    }

    /**
     * <p>
     * A unique identifier, consisting of
     * <code> <i>account_id</i>/datalake</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param catalogId <p>
     *            A unique identifier, consisting of
     *            <code> <i>account_id</i>/datalake</code>.
     *            </p>
     */
    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * A unique identifier, consisting of
     * <code> <i>account_id</i>/datalake</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param catalogId <p>
     *            A unique identifier, consisting of
     *            <code> <i>account_id</i>/datalake</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchTablesRequest withCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * <p>
     * A continuation token, included if this is a continuation call.
     * </p>
     *
     * @return <p>
     *         A continuation token, included if this is a continuation call.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token, included if this is a continuation call.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token, included if this is a continuation call.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, included if this is a continuation call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token, included if this is a continuation call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchTablesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs, and a comparator used to filter the search
     * results. Returns all entities matching the predicate.
     * </p>
     *
     * @return <p>
     *         A list of key-value pairs, and a comparator used to filter the
     *         search results. Returns all entities matching the predicate.
     *         </p>
     */
    public java.util.List<PropertyPredicate> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A list of key-value pairs, and a comparator used to filter the search
     * results. Returns all entities matching the predicate.
     * </p>
     *
     * @param filters <p>
     *            A list of key-value pairs, and a comparator used to filter the
     *            search results. Returns all entities matching the predicate.
     *            </p>
     */
    public void setFilters(java.util.Collection<PropertyPredicate> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<PropertyPredicate>(filters);
    }

    /**
     * <p>
     * A list of key-value pairs, and a comparator used to filter the search
     * results. Returns all entities matching the predicate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A list of key-value pairs, and a comparator used to filter the
     *            search results. Returns all entities matching the predicate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchTablesRequest withFilters(PropertyPredicate... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<PropertyPredicate>(filters.length);
        }
        for (PropertyPredicate value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs, and a comparator used to filter the search
     * results. Returns all entities matching the predicate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A list of key-value pairs, and a comparator used to filter the
     *            search results. Returns all entities matching the predicate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchTablesRequest withFilters(java.util.Collection<PropertyPredicate> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * A string used for a text search.
     * </p>
     * <p>
     * Specifying a value in quotes filters based on an exact match to the
     * value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         A string used for a text search.
     *         </p>
     *         <p>
     *         Specifying a value in quotes filters based on an exact match to
     *         the value.
     *         </p>
     */
    public String getSearchText() {
        return searchText;
    }

    /**
     * <p>
     * A string used for a text search.
     * </p>
     * <p>
     * Specifying a value in quotes filters based on an exact match to the
     * value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param searchText <p>
     *            A string used for a text search.
     *            </p>
     *            <p>
     *            Specifying a value in quotes filters based on an exact match
     *            to the value.
     *            </p>
     */
    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    /**
     * <p>
     * A string used for a text search.
     * </p>
     * <p>
     * Specifying a value in quotes filters based on an exact match to the
     * value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param searchText <p>
     *            A string used for a text search.
     *            </p>
     *            <p>
     *            Specifying a value in quotes filters based on an exact match
     *            to the value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchTablesRequest withSearchText(String searchText) {
        this.searchText = searchText;
        return this;
    }

    /**
     * <p>
     * A list of criteria for sorting the results by a field name, in an
     * ascending or descending order.
     * </p>
     *
     * @return <p>
     *         A list of criteria for sorting the results by a field name, in an
     *         ascending or descending order.
     *         </p>
     */
    public java.util.List<SortCriterion> getSortCriteria() {
        return sortCriteria;
    }

    /**
     * <p>
     * A list of criteria for sorting the results by a field name, in an
     * ascending or descending order.
     * </p>
     *
     * @param sortCriteria <p>
     *            A list of criteria for sorting the results by a field name, in
     *            an ascending or descending order.
     *            </p>
     */
    public void setSortCriteria(java.util.Collection<SortCriterion> sortCriteria) {
        if (sortCriteria == null) {
            this.sortCriteria = null;
            return;
        }

        this.sortCriteria = new java.util.ArrayList<SortCriterion>(sortCriteria);
    }

    /**
     * <p>
     * A list of criteria for sorting the results by a field name, in an
     * ascending or descending order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sortCriteria <p>
     *            A list of criteria for sorting the results by a field name, in
     *            an ascending or descending order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchTablesRequest withSortCriteria(SortCriterion... sortCriteria) {
        if (getSortCriteria() == null) {
            this.sortCriteria = new java.util.ArrayList<SortCriterion>(sortCriteria.length);
        }
        for (SortCriterion value : sortCriteria) {
            this.sortCriteria.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of criteria for sorting the results by a field name, in an
     * ascending or descending order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sortCriteria <p>
     *            A list of criteria for sorting the results by a field name, in
     *            an ascending or descending order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchTablesRequest withSortCriteria(java.util.Collection<SortCriterion> sortCriteria) {
        setSortCriteria(sortCriteria);
        return this;
    }

    /**
     * <p>
     * The maximum number of tables to return in a single response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The maximum number of tables to return in a single response.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of tables to return in a single response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of tables to return in a single response.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of tables to return in a single response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of tables to return in a single response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchTablesRequest withMaxResults(Integer maxResults) {
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
        if (getCatalogId() != null)
            sb.append("CatalogId: " + getCatalogId() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getSearchText() != null)
            sb.append("SearchText: " + getSearchText() + ",");
        if (getSortCriteria() != null)
            sb.append("SortCriteria: " + getSortCriteria() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getSearchText() == null) ? 0 : getSearchText().hashCode());
        hashCode = prime * hashCode
                + ((getSortCriteria() == null) ? 0 : getSortCriteria().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchTablesRequest == false)
            return false;
        SearchTablesRequest other = (SearchTablesRequest) obj;

        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null
                && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getSearchText() == null ^ this.getSearchText() == null)
            return false;
        if (other.getSearchText() != null
                && other.getSearchText().equals(this.getSearchText()) == false)
            return false;
        if (other.getSortCriteria() == null ^ this.getSortCriteria() == null)
            return false;
        if (other.getSortCriteria() != null
                && other.getSortCriteria().equals(this.getSortCriteria()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
