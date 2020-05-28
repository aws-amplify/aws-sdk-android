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
 * Provides the list of entities of a given type.
 * </p>
 */
public class ListEntitiesRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The type of entities to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     */
    private String entityType;

    /**
     * <p>
     * An array of filter objects. Each filter object contains two attributes,
     * <code>filterName</code> and <code>filterValues</code>.
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
     * The value of the next token, if it exists. Null if there are no more
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
     * Specifies the upper limit of the elements on a single page. If a value
     * isn't provided, the default value is 20.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     */
    private Integer maxResults;

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
    public ListEntitiesRequest withCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }

    /**
     * <p>
     * The type of entities to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @return <p>
     *         The type of entities to retrieve.
     *         </p>
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * <p>
     * The type of entities to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @param entityType <p>
     *            The type of entities to retrieve.
     *            </p>
     */
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * The type of entities to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @param entityType <p>
     *            The type of entities to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntitiesRequest withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * <p>
     * An array of filter objects. Each filter object contains two attributes,
     * <code>filterName</code> and <code>filterValues</code>.
     * </p>
     *
     * @return <p>
     *         An array of filter objects. Each filter object contains two
     *         attributes, <code>filterName</code> and <code>filterValues</code>
     *         .
     *         </p>
     */
    public java.util.List<Filter> getFilterList() {
        return filterList;
    }

    /**
     * <p>
     * An array of filter objects. Each filter object contains two attributes,
     * <code>filterName</code> and <code>filterValues</code>.
     * </p>
     *
     * @param filterList <p>
     *            An array of filter objects. Each filter object contains two
     *            attributes, <code>filterName</code> and
     *            <code>filterValues</code>.
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
     * An array of filter objects. Each filter object contains two attributes,
     * <code>filterName</code> and <code>filterValues</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterList <p>
     *            An array of filter objects. Each filter object contains two
     *            attributes, <code>filterName</code> and
     *            <code>filterValues</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntitiesRequest withFilterList(Filter... filterList) {
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
     * An array of filter objects. Each filter object contains two attributes,
     * <code>filterName</code> and <code>filterValues</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterList <p>
     *            An array of filter objects. Each filter object contains two
     *            attributes, <code>filterName</code> and
     *            <code>filterValues</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntitiesRequest withFilterList(java.util.Collection<Filter> filterList) {
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
    public ListEntitiesRequest withSort(Sort sort) {
        this.sort = sort;
        return this;
    }

    /**
     * <p>
     * The value of the next token, if it exists. Null if there are no more
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[\w+=.:@\-\/]$<br/>
     *
     * @return <p>
     *         The value of the next token, if it exists. Null if there are no
     *         more results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The value of the next token, if it exists. Null if there are no more
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[\w+=.:@\-\/]$<br/>
     *
     * @param nextToken <p>
     *            The value of the next token, if it exists. Null if there are
     *            no more results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The value of the next token, if it exists. Null if there are no more
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
     *            The value of the next token, if it exists. Null if there are
     *            no more results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntitiesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Specifies the upper limit of the elements on a single page. If a value
     * isn't provided, the default value is 20.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @return <p>
     *         Specifies the upper limit of the elements on a single page. If a
     *         value isn't provided, the default value is 20.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Specifies the upper limit of the elements on a single page. If a value
     * isn't provided, the default value is 20.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param maxResults <p>
     *            Specifies the upper limit of the elements on a single page. If
     *            a value isn't provided, the default value is 20.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the upper limit of the elements on a single page. If a value
     * isn't provided, the default value is 20.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param maxResults <p>
     *            Specifies the upper limit of the elements on a single page. If
     *            a value isn't provided, the default value is 20.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntitiesRequest withMaxResults(Integer maxResults) {
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
        if (getCatalog() != null)
            sb.append("Catalog: " + getCatalog() + ",");
        if (getEntityType() != null)
            sb.append("EntityType: " + getEntityType() + ",");
        if (getFilterList() != null)
            sb.append("FilterList: " + getFilterList() + ",");
        if (getSort() != null)
            sb.append("Sort: " + getSort() + ",");
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

        hashCode = prime * hashCode + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        hashCode = prime * hashCode + ((getFilterList() == null) ? 0 : getFilterList().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
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

        if (obj instanceof ListEntitiesRequest == false)
            return false;
        ListEntitiesRequest other = (ListEntitiesRequest) obj;

        if (other.getCatalog() == null ^ this.getCatalog() == null)
            return false;
        if (other.getCatalog() != null && other.getCatalog().equals(this.getCatalog()) == false)
            return false;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null
                && other.getEntityType().equals(this.getEntityType()) == false)
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
