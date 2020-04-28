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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns all Systems Manager (SSM) documents in the current AWS account and
 * Region. You can limit the results of this request by using a filter.
 * </p>
 */
public class ListDocumentsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * This data type is deprecated. Instead, use <code>Filters</code>.
     * </p>
     */
    private java.util.List<DocumentFilter> documentFilterList;

    /**
     * <p>
     * One or more DocumentKeyValuesFilter objects. Use a filter to return a
     * more specific list of results. For keys, you can specify one or more
     * key-value pair tags that have been applied to a document. Other valid
     * keys include <code>Owner</code>, <code>Name</code>,
     * <code>PlatformTypes</code>, and <code>DocumentType</code>. For example,
     * to return documents you own use <code>Key=Owner,Values=Self</code>. To
     * specify a custom key-value pair, use the format
     * <code>Key=tag:tagName,Values=valueName</code>.
     * </p>
     */
    private java.util.List<DocumentKeyValuesFilter> filters;

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * This data type is deprecated. Instead, use <code>Filters</code>.
     * </p>
     *
     * @return <p>
     *         This data type is deprecated. Instead, use <code>Filters</code>.
     *         </p>
     */
    public java.util.List<DocumentFilter> getDocumentFilterList() {
        return documentFilterList;
    }

    /**
     * <p>
     * This data type is deprecated. Instead, use <code>Filters</code>.
     * </p>
     *
     * @param documentFilterList <p>
     *            This data type is deprecated. Instead, use
     *            <code>Filters</code>.
     *            </p>
     */
    public void setDocumentFilterList(java.util.Collection<DocumentFilter> documentFilterList) {
        if (documentFilterList == null) {
            this.documentFilterList = null;
            return;
        }

        this.documentFilterList = new java.util.ArrayList<DocumentFilter>(documentFilterList);
    }

    /**
     * <p>
     * This data type is deprecated. Instead, use <code>Filters</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentFilterList <p>
     *            This data type is deprecated. Instead, use
     *            <code>Filters</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDocumentsRequest withDocumentFilterList(DocumentFilter... documentFilterList) {
        if (getDocumentFilterList() == null) {
            this.documentFilterList = new java.util.ArrayList<DocumentFilter>(
                    documentFilterList.length);
        }
        for (DocumentFilter value : documentFilterList) {
            this.documentFilterList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * This data type is deprecated. Instead, use <code>Filters</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentFilterList <p>
     *            This data type is deprecated. Instead, use
     *            <code>Filters</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDocumentsRequest withDocumentFilterList(
            java.util.Collection<DocumentFilter> documentFilterList) {
        setDocumentFilterList(documentFilterList);
        return this;
    }

    /**
     * <p>
     * One or more DocumentKeyValuesFilter objects. Use a filter to return a
     * more specific list of results. For keys, you can specify one or more
     * key-value pair tags that have been applied to a document. Other valid
     * keys include <code>Owner</code>, <code>Name</code>,
     * <code>PlatformTypes</code>, and <code>DocumentType</code>. For example,
     * to return documents you own use <code>Key=Owner,Values=Self</code>. To
     * specify a custom key-value pair, use the format
     * <code>Key=tag:tagName,Values=valueName</code>.
     * </p>
     *
     * @return <p>
     *         One or more DocumentKeyValuesFilter objects. Use a filter to
     *         return a more specific list of results. For keys, you can specify
     *         one or more key-value pair tags that have been applied to a
     *         document. Other valid keys include <code>Owner</code>,
     *         <code>Name</code>, <code>PlatformTypes</code>, and
     *         <code>DocumentType</code>. For example, to return documents you
     *         own use <code>Key=Owner,Values=Self</code>. To specify a custom
     *         key-value pair, use the format
     *         <code>Key=tag:tagName,Values=valueName</code>.
     *         </p>
     */
    public java.util.List<DocumentKeyValuesFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * One or more DocumentKeyValuesFilter objects. Use a filter to return a
     * more specific list of results. For keys, you can specify one or more
     * key-value pair tags that have been applied to a document. Other valid
     * keys include <code>Owner</code>, <code>Name</code>,
     * <code>PlatformTypes</code>, and <code>DocumentType</code>. For example,
     * to return documents you own use <code>Key=Owner,Values=Self</code>. To
     * specify a custom key-value pair, use the format
     * <code>Key=tag:tagName,Values=valueName</code>.
     * </p>
     *
     * @param filters <p>
     *            One or more DocumentKeyValuesFilter objects. Use a filter to
     *            return a more specific list of results. For keys, you can
     *            specify one or more key-value pair tags that have been applied
     *            to a document. Other valid keys include <code>Owner</code>,
     *            <code>Name</code>, <code>PlatformTypes</code>, and
     *            <code>DocumentType</code>. For example, to return documents
     *            you own use <code>Key=Owner,Values=Self</code>. To specify a
     *            custom key-value pair, use the format
     *            <code>Key=tag:tagName,Values=valueName</code>.
     *            </p>
     */
    public void setFilters(java.util.Collection<DocumentKeyValuesFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<DocumentKeyValuesFilter>(filters);
    }

    /**
     * <p>
     * One or more DocumentKeyValuesFilter objects. Use a filter to return a
     * more specific list of results. For keys, you can specify one or more
     * key-value pair tags that have been applied to a document. Other valid
     * keys include <code>Owner</code>, <code>Name</code>,
     * <code>PlatformTypes</code>, and <code>DocumentType</code>. For example,
     * to return documents you own use <code>Key=Owner,Values=Self</code>. To
     * specify a custom key-value pair, use the format
     * <code>Key=tag:tagName,Values=valueName</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more DocumentKeyValuesFilter objects. Use a filter to
     *            return a more specific list of results. For keys, you can
     *            specify one or more key-value pair tags that have been applied
     *            to a document. Other valid keys include <code>Owner</code>,
     *            <code>Name</code>, <code>PlatformTypes</code>, and
     *            <code>DocumentType</code>. For example, to return documents
     *            you own use <code>Key=Owner,Values=Self</code>. To specify a
     *            custom key-value pair, use the format
     *            <code>Key=tag:tagName,Values=valueName</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDocumentsRequest withFilters(DocumentKeyValuesFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<DocumentKeyValuesFilter>(filters.length);
        }
        for (DocumentKeyValuesFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more DocumentKeyValuesFilter objects. Use a filter to return a
     * more specific list of results. For keys, you can specify one or more
     * key-value pair tags that have been applied to a document. Other valid
     * keys include <code>Owner</code>, <code>Name</code>,
     * <code>PlatformTypes</code>, and <code>DocumentType</code>. For example,
     * to return documents you own use <code>Key=Owner,Values=Self</code>. To
     * specify a custom key-value pair, use the format
     * <code>Key=tag:tagName,Values=valueName</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more DocumentKeyValuesFilter objects. Use a filter to
     *            return a more specific list of results. For keys, you can
     *            specify one or more key-value pair tags that have been applied
     *            to a document. Other valid keys include <code>Owner</code>,
     *            <code>Name</code>, <code>PlatformTypes</code>, and
     *            <code>DocumentType</code>. For example, to return documents
     *            you own use <code>Key=Owner,Values=Self</code>. To specify a
     *            custom key-value pair, use the format
     *            <code>Key=tag:tagName,Values=valueName</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDocumentsRequest withFilters(java.util.Collection<DocumentKeyValuesFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         The maximum number of items to return for this call. The call
     *         also returns a token that you can specify in a subsequent call to
     *         get the next set of results.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return for this call. The call
     *            also returns a token that you can specify in a subsequent call
     *            to get the next set of results.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return for this call. The call
     *            also returns a token that you can specify in a subsequent call
     *            to get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDocumentsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     *
     * @return <p>
     *         The token for the next set of items to return. (You received this
     *         token from a previous call.)
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. (You received
     *            this token from a previous call.)
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. (You received
     *            this token from a previous call.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDocumentsRequest withNextToken(String nextToken) {
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
        if (getDocumentFilterList() != null)
            sb.append("DocumentFilterList: " + getDocumentFilterList() + ",");
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

        hashCode = prime * hashCode
                + ((getDocumentFilterList() == null) ? 0 : getDocumentFilterList().hashCode());
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

        if (obj instanceof ListDocumentsRequest == false)
            return false;
        ListDocumentsRequest other = (ListDocumentsRequest) obj;

        if (other.getDocumentFilterList() == null ^ this.getDocumentFilterList() == null)
            return false;
        if (other.getDocumentFilterList() != null
                && other.getDocumentFilterList().equals(this.getDocumentFilterList()) == false)
            return false;
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
