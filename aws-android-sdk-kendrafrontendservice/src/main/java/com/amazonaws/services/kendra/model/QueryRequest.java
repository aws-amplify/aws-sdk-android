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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Searches an active index. Use this API to search your documents using query.
 * The <code>Query</code> operation enables to do faceted search and to filter
 * results based on document attributes.
 * </p>
 * <p>
 * It also enables you to provide user context that Amazon Kendra uses to
 * enforce document access control in the search results.
 * </p>
 * <p>
 * Amazon Kendra searches your index for text content and question and answer
 * (FAQ) content. By default the response contains three types of results.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Relevant passages
 * </p>
 * </li>
 * <li>
 * <p>
 * Matching FAQs
 * </p>
 * </li>
 * <li>
 * <p>
 * Relevant documents
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can specify that the query return only one type of result using the
 * <code>QueryResultTypeConfig</code> parameter.
 * </p>
 */
public class QueryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier of the index to search. The identifier is returned
     * in the response from the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     */
    private String indexId;

    /**
     * <p>
     * The text to search for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     */
    private String queryText;

    /**
     * <p>
     * Enables filtered searches based on document attributes. You can only
     * provide one attribute filter; however, the <code>AndAllFilters</code>,
     * <code>NotFilter</code>, and <code>OrAllFilters</code> parameters contain
     * a list of other filters.
     * </p>
     * <p>
     * The <code>AttributeFilter</code> parameter enables you to create a set of
     * filtering rules that a document must satisfy to be included in the query
     * results.
     * </p>
     */
    private AttributeFilter attributeFilter;

    /**
     * <p>
     * An array of documents attributes. Amazon Kendra returns a count for each
     * attribute key specified. You can use this information to help narrow the
     * search for your user.
     * </p>
     */
    private java.util.List<Facet> facets;

    /**
     * <p>
     * An array of document attributes to include in the response. No other
     * document attributes are included in the response. By default all document
     * attributes are included in the response.
     * </p>
     */
    private java.util.List<String> requestedDocumentAttributes;

    /**
     * <p>
     * Sets the type of query. Only results for the specified query type are
     * returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT, QUESTION_ANSWER, ANSWER
     */
    private String queryResultTypeFilter;

    /**
     * <p>
     * Query results are returned in pages the size of the <code>PageSize</code>
     * parameter. By default, Amazon Kendra returns the first page of results.
     * Use this parameter to get result pages after the first one.
     * </p>
     */
    private Integer pageNumber;

    /**
     * <p>
     * Sets the number of results that are returned in each page of results. The
     * default page size is 10. The maximum number of results returned is 100.
     * If you ask for more than 100 results, only 100 are returned.
     * </p>
     */
    private Integer pageSize;

    /**
     * <p>
     * The unique identifier of the index to search. The identifier is returned
     * in the response from the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @return <p>
     *         The unique identifier of the index to search. The identifier is
     *         returned in the response from the operation.
     *         </p>
     */
    public String getIndexId() {
        return indexId;
    }

    /**
     * <p>
     * The unique identifier of the index to search. The identifier is returned
     * in the response from the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @param indexId <p>
     *            The unique identifier of the index to search. The identifier
     *            is returned in the response from the operation.
     *            </p>
     */
    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The unique identifier of the index to search. The identifier is returned
     * in the response from the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @param indexId <p>
     *            The unique identifier of the index to search. The identifier
     *            is returned in the response from the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }

    /**
     * <p>
     * The text to search for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @return <p>
     *         The text to search for.
     *         </p>
     */
    public String getQueryText() {
        return queryText;
    }

    /**
     * <p>
     * The text to search for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param queryText <p>
     *            The text to search for.
     *            </p>
     */
    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    /**
     * <p>
     * The text to search for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param queryText <p>
     *            The text to search for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withQueryText(String queryText) {
        this.queryText = queryText;
        return this;
    }

    /**
     * <p>
     * Enables filtered searches based on document attributes. You can only
     * provide one attribute filter; however, the <code>AndAllFilters</code>,
     * <code>NotFilter</code>, and <code>OrAllFilters</code> parameters contain
     * a list of other filters.
     * </p>
     * <p>
     * The <code>AttributeFilter</code> parameter enables you to create a set of
     * filtering rules that a document must satisfy to be included in the query
     * results.
     * </p>
     *
     * @return <p>
     *         Enables filtered searches based on document attributes. You can
     *         only provide one attribute filter; however, the
     *         <code>AndAllFilters</code>, <code>NotFilter</code>, and
     *         <code>OrAllFilters</code> parameters contain a list of other
     *         filters.
     *         </p>
     *         <p>
     *         The <code>AttributeFilter</code> parameter enables you to create
     *         a set of filtering rules that a document must satisfy to be
     *         included in the query results.
     *         </p>
     */
    public AttributeFilter getAttributeFilter() {
        return attributeFilter;
    }

    /**
     * <p>
     * Enables filtered searches based on document attributes. You can only
     * provide one attribute filter; however, the <code>AndAllFilters</code>,
     * <code>NotFilter</code>, and <code>OrAllFilters</code> parameters contain
     * a list of other filters.
     * </p>
     * <p>
     * The <code>AttributeFilter</code> parameter enables you to create a set of
     * filtering rules that a document must satisfy to be included in the query
     * results.
     * </p>
     *
     * @param attributeFilter <p>
     *            Enables filtered searches based on document attributes. You
     *            can only provide one attribute filter; however, the
     *            <code>AndAllFilters</code>, <code>NotFilter</code>, and
     *            <code>OrAllFilters</code> parameters contain a list of other
     *            filters.
     *            </p>
     *            <p>
     *            The <code>AttributeFilter</code> parameter enables you to
     *            create a set of filtering rules that a document must satisfy
     *            to be included in the query results.
     *            </p>
     */
    public void setAttributeFilter(AttributeFilter attributeFilter) {
        this.attributeFilter = attributeFilter;
    }

    /**
     * <p>
     * Enables filtered searches based on document attributes. You can only
     * provide one attribute filter; however, the <code>AndAllFilters</code>,
     * <code>NotFilter</code>, and <code>OrAllFilters</code> parameters contain
     * a list of other filters.
     * </p>
     * <p>
     * The <code>AttributeFilter</code> parameter enables you to create a set of
     * filtering rules that a document must satisfy to be included in the query
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeFilter <p>
     *            Enables filtered searches based on document attributes. You
     *            can only provide one attribute filter; however, the
     *            <code>AndAllFilters</code>, <code>NotFilter</code>, and
     *            <code>OrAllFilters</code> parameters contain a list of other
     *            filters.
     *            </p>
     *            <p>
     *            The <code>AttributeFilter</code> parameter enables you to
     *            create a set of filtering rules that a document must satisfy
     *            to be included in the query results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withAttributeFilter(AttributeFilter attributeFilter) {
        this.attributeFilter = attributeFilter;
        return this;
    }

    /**
     * <p>
     * An array of documents attributes. Amazon Kendra returns a count for each
     * attribute key specified. You can use this information to help narrow the
     * search for your user.
     * </p>
     *
     * @return <p>
     *         An array of documents attributes. Amazon Kendra returns a count
     *         for each attribute key specified. You can use this information to
     *         help narrow the search for your user.
     *         </p>
     */
    public java.util.List<Facet> getFacets() {
        return facets;
    }

    /**
     * <p>
     * An array of documents attributes. Amazon Kendra returns a count for each
     * attribute key specified. You can use this information to help narrow the
     * search for your user.
     * </p>
     *
     * @param facets <p>
     *            An array of documents attributes. Amazon Kendra returns a
     *            count for each attribute key specified. You can use this
     *            information to help narrow the search for your user.
     *            </p>
     */
    public void setFacets(java.util.Collection<Facet> facets) {
        if (facets == null) {
            this.facets = null;
            return;
        }

        this.facets = new java.util.ArrayList<Facet>(facets);
    }

    /**
     * <p>
     * An array of documents attributes. Amazon Kendra returns a count for each
     * attribute key specified. You can use this information to help narrow the
     * search for your user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param facets <p>
     *            An array of documents attributes. Amazon Kendra returns a
     *            count for each attribute key specified. You can use this
     *            information to help narrow the search for your user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withFacets(Facet... facets) {
        if (getFacets() == null) {
            this.facets = new java.util.ArrayList<Facet>(facets.length);
        }
        for (Facet value : facets) {
            this.facets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of documents attributes. Amazon Kendra returns a count for each
     * attribute key specified. You can use this information to help narrow the
     * search for your user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param facets <p>
     *            An array of documents attributes. Amazon Kendra returns a
     *            count for each attribute key specified. You can use this
     *            information to help narrow the search for your user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withFacets(java.util.Collection<Facet> facets) {
        setFacets(facets);
        return this;
    }

    /**
     * <p>
     * An array of document attributes to include in the response. No other
     * document attributes are included in the response. By default all document
     * attributes are included in the response.
     * </p>
     *
     * @return <p>
     *         An array of document attributes to include in the response. No
     *         other document attributes are included in the response. By
     *         default all document attributes are included in the response.
     *         </p>
     */
    public java.util.List<String> getRequestedDocumentAttributes() {
        return requestedDocumentAttributes;
    }

    /**
     * <p>
     * An array of document attributes to include in the response. No other
     * document attributes are included in the response. By default all document
     * attributes are included in the response.
     * </p>
     *
     * @param requestedDocumentAttributes <p>
     *            An array of document attributes to include in the response. No
     *            other document attributes are included in the response. By
     *            default all document attributes are included in the response.
     *            </p>
     */
    public void setRequestedDocumentAttributes(
            java.util.Collection<String> requestedDocumentAttributes) {
        if (requestedDocumentAttributes == null) {
            this.requestedDocumentAttributes = null;
            return;
        }

        this.requestedDocumentAttributes = new java.util.ArrayList<String>(
                requestedDocumentAttributes);
    }

    /**
     * <p>
     * An array of document attributes to include in the response. No other
     * document attributes are included in the response. By default all document
     * attributes are included in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestedDocumentAttributes <p>
     *            An array of document attributes to include in the response. No
     *            other document attributes are included in the response. By
     *            default all document attributes are included in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withRequestedDocumentAttributes(String... requestedDocumentAttributes) {
        if (getRequestedDocumentAttributes() == null) {
            this.requestedDocumentAttributes = new java.util.ArrayList<String>(
                    requestedDocumentAttributes.length);
        }
        for (String value : requestedDocumentAttributes) {
            this.requestedDocumentAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of document attributes to include in the response. No other
     * document attributes are included in the response. By default all document
     * attributes are included in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestedDocumentAttributes <p>
     *            An array of document attributes to include in the response. No
     *            other document attributes are included in the response. By
     *            default all document attributes are included in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withRequestedDocumentAttributes(
            java.util.Collection<String> requestedDocumentAttributes) {
        setRequestedDocumentAttributes(requestedDocumentAttributes);
        return this;
    }

    /**
     * <p>
     * Sets the type of query. Only results for the specified query type are
     * returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT, QUESTION_ANSWER, ANSWER
     *
     * @return <p>
     *         Sets the type of query. Only results for the specified query type
     *         are returned.
     *         </p>
     * @see QueryResultType
     */
    public String getQueryResultTypeFilter() {
        return queryResultTypeFilter;
    }

    /**
     * <p>
     * Sets the type of query. Only results for the specified query type are
     * returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT, QUESTION_ANSWER, ANSWER
     *
     * @param queryResultTypeFilter <p>
     *            Sets the type of query. Only results for the specified query
     *            type are returned.
     *            </p>
     * @see QueryResultType
     */
    public void setQueryResultTypeFilter(String queryResultTypeFilter) {
        this.queryResultTypeFilter = queryResultTypeFilter;
    }

    /**
     * <p>
     * Sets the type of query. Only results for the specified query type are
     * returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT, QUESTION_ANSWER, ANSWER
     *
     * @param queryResultTypeFilter <p>
     *            Sets the type of query. Only results for the specified query
     *            type are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QueryResultType
     */
    public QueryRequest withQueryResultTypeFilter(String queryResultTypeFilter) {
        this.queryResultTypeFilter = queryResultTypeFilter;
        return this;
    }

    /**
     * <p>
     * Sets the type of query. Only results for the specified query type are
     * returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT, QUESTION_ANSWER, ANSWER
     *
     * @param queryResultTypeFilter <p>
     *            Sets the type of query. Only results for the specified query
     *            type are returned.
     *            </p>
     * @see QueryResultType
     */
    public void setQueryResultTypeFilter(QueryResultType queryResultTypeFilter) {
        this.queryResultTypeFilter = queryResultTypeFilter.toString();
    }

    /**
     * <p>
     * Sets the type of query. Only results for the specified query type are
     * returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT, QUESTION_ANSWER, ANSWER
     *
     * @param queryResultTypeFilter <p>
     *            Sets the type of query. Only results for the specified query
     *            type are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QueryResultType
     */
    public QueryRequest withQueryResultTypeFilter(QueryResultType queryResultTypeFilter) {
        this.queryResultTypeFilter = queryResultTypeFilter.toString();
        return this;
    }

    /**
     * <p>
     * Query results are returned in pages the size of the <code>PageSize</code>
     * parameter. By default, Amazon Kendra returns the first page of results.
     * Use this parameter to get result pages after the first one.
     * </p>
     *
     * @return <p>
     *         Query results are returned in pages the size of the
     *         <code>PageSize</code> parameter. By default, Amazon Kendra
     *         returns the first page of results. Use this parameter to get
     *         result pages after the first one.
     *         </p>
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * <p>
     * Query results are returned in pages the size of the <code>PageSize</code>
     * parameter. By default, Amazon Kendra returns the first page of results.
     * Use this parameter to get result pages after the first one.
     * </p>
     *
     * @param pageNumber <p>
     *            Query results are returned in pages the size of the
     *            <code>PageSize</code> parameter. By default, Amazon Kendra
     *            returns the first page of results. Use this parameter to get
     *            result pages after the first one.
     *            </p>
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * <p>
     * Query results are returned in pages the size of the <code>PageSize</code>
     * parameter. By default, Amazon Kendra returns the first page of results.
     * Use this parameter to get result pages after the first one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pageNumber <p>
     *            Query results are returned in pages the size of the
     *            <code>PageSize</code> parameter. By default, Amazon Kendra
     *            returns the first page of results. Use this parameter to get
     *            result pages after the first one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * <p>
     * Sets the number of results that are returned in each page of results. The
     * default page size is 10. The maximum number of results returned is 100.
     * If you ask for more than 100 results, only 100 are returned.
     * </p>
     *
     * @return <p>
     *         Sets the number of results that are returned in each page of
     *         results. The default page size is 10. The maximum number of
     *         results returned is 100. If you ask for more than 100 results,
     *         only 100 are returned.
     *         </p>
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * <p>
     * Sets the number of results that are returned in each page of results. The
     * default page size is 10. The maximum number of results returned is 100.
     * If you ask for more than 100 results, only 100 are returned.
     * </p>
     *
     * @param pageSize <p>
     *            Sets the number of results that are returned in each page of
     *            results. The default page size is 10. The maximum number of
     *            results returned is 100. If you ask for more than 100 results,
     *            only 100 are returned.
     *            </p>
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * Sets the number of results that are returned in each page of results. The
     * default page size is 10. The maximum number of results returned is 100.
     * If you ask for more than 100 results, only 100 are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pageSize <p>
     *            Sets the number of results that are returned in each page of
     *            results. The default page size is 10. The maximum number of
     *            results returned is 100. If you ask for more than 100 results,
     *            only 100 are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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
        if (getIndexId() != null)
            sb.append("IndexId: " + getIndexId() + ",");
        if (getQueryText() != null)
            sb.append("QueryText: " + getQueryText() + ",");
        if (getAttributeFilter() != null)
            sb.append("AttributeFilter: " + getAttributeFilter() + ",");
        if (getFacets() != null)
            sb.append("Facets: " + getFacets() + ",");
        if (getRequestedDocumentAttributes() != null)
            sb.append("RequestedDocumentAttributes: " + getRequestedDocumentAttributes() + ",");
        if (getQueryResultTypeFilter() != null)
            sb.append("QueryResultTypeFilter: " + getQueryResultTypeFilter() + ",");
        if (getPageNumber() != null)
            sb.append("PageNumber: " + getPageNumber() + ",");
        if (getPageSize() != null)
            sb.append("PageSize: " + getPageSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getQueryText() == null) ? 0 : getQueryText().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeFilter() == null) ? 0 : getAttributeFilter().hashCode());
        hashCode = prime * hashCode + ((getFacets() == null) ? 0 : getFacets().hashCode());
        hashCode = prime
                * hashCode
                + ((getRequestedDocumentAttributes() == null) ? 0
                        : getRequestedDocumentAttributes().hashCode());
        hashCode = prime
                * hashCode
                + ((getQueryResultTypeFilter() == null) ? 0 : getQueryResultTypeFilter().hashCode());
        hashCode = prime * hashCode + ((getPageNumber() == null) ? 0 : getPageNumber().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryRequest == false)
            return false;
        QueryRequest other = (QueryRequest) obj;

        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getQueryText() == null ^ this.getQueryText() == null)
            return false;
        if (other.getQueryText() != null
                && other.getQueryText().equals(this.getQueryText()) == false)
            return false;
        if (other.getAttributeFilter() == null ^ this.getAttributeFilter() == null)
            return false;
        if (other.getAttributeFilter() != null
                && other.getAttributeFilter().equals(this.getAttributeFilter()) == false)
            return false;
        if (other.getFacets() == null ^ this.getFacets() == null)
            return false;
        if (other.getFacets() != null && other.getFacets().equals(this.getFacets()) == false)
            return false;
        if (other.getRequestedDocumentAttributes() == null
                ^ this.getRequestedDocumentAttributes() == null)
            return false;
        if (other.getRequestedDocumentAttributes() != null
                && other.getRequestedDocumentAttributes().equals(
                        this.getRequestedDocumentAttributes()) == false)
            return false;
        if (other.getQueryResultTypeFilter() == null ^ this.getQueryResultTypeFilter() == null)
            return false;
        if (other.getQueryResultTypeFilter() != null
                && other.getQueryResultTypeFilter().equals(this.getQueryResultTypeFilter()) == false)
            return false;
        if (other.getPageNumber() == null ^ this.getPageNumber() == null)
            return false;
        if (other.getPageNumber() != null
                && other.getPageNumber().equals(this.getPageNumber()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        return true;
    }
}
