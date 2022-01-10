/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

public class ListVocabularyFiltersResult implements Serializable {
    /**
     * <p>
     * The <code>ListVocabularyFilters</code> operation returns a page of
     * collections at a time. The maximum size of the page is set by the
     * <code>MaxResults</code> parameter. If there are more jobs in the list
     * than the page size, Amazon Transcribe returns the <code>NextPage</code>
     * token. Include the token in the next request to the
     * <code>ListVocabularyFilters</code> operation to return in the next page
     * of jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The list of vocabulary filters. It contains at most
     * <code>MaxResults</code> number of filters. If there are more filters,
     * call the <code>ListVocabularyFilters</code> operation again with the
     * <code>NextToken</code> parameter in the request set to the value of the
     * <code>NextToken</code> field in the response.
     * </p>
     */
    private java.util.List<VocabularyFilterInfo> vocabularyFilters;

    /**
     * <p>
     * The <code>ListVocabularyFilters</code> operation returns a page of
     * collections at a time. The maximum size of the page is set by the
     * <code>MaxResults</code> parameter. If there are more jobs in the list
     * than the page size, Amazon Transcribe returns the <code>NextPage</code>
     * token. Include the token in the next request to the
     * <code>ListVocabularyFilters</code> operation to return in the next page
     * of jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         The <code>ListVocabularyFilters</code> operation returns a page
     *         of collections at a time. The maximum size of the page is set by
     *         the <code>MaxResults</code> parameter. If there are more jobs in
     *         the list than the page size, Amazon Transcribe returns the
     *         <code>NextPage</code> token. Include the token in the next
     *         request to the <code>ListVocabularyFilters</code> operation to
     *         return in the next page of jobs.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>ListVocabularyFilters</code> operation returns a page of
     * collections at a time. The maximum size of the page is set by the
     * <code>MaxResults</code> parameter. If there are more jobs in the list
     * than the page size, Amazon Transcribe returns the <code>NextPage</code>
     * token. Include the token in the next request to the
     * <code>ListVocabularyFilters</code> operation to return in the next page
     * of jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param nextToken <p>
     *            The <code>ListVocabularyFilters</code> operation returns a
     *            page of collections at a time. The maximum size of the page is
     *            set by the <code>MaxResults</code> parameter. If there are
     *            more jobs in the list than the page size, Amazon Transcribe
     *            returns the <code>NextPage</code> token. Include the token in
     *            the next request to the <code>ListVocabularyFilters</code>
     *            operation to return in the next page of jobs.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>ListVocabularyFilters</code> operation returns a page of
     * collections at a time. The maximum size of the page is set by the
     * <code>MaxResults</code> parameter. If there are more jobs in the list
     * than the page size, Amazon Transcribe returns the <code>NextPage</code>
     * token. Include the token in the next request to the
     * <code>ListVocabularyFilters</code> operation to return in the next page
     * of jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param nextToken <p>
     *            The <code>ListVocabularyFilters</code> operation returns a
     *            page of collections at a time. The maximum size of the page is
     *            set by the <code>MaxResults</code> parameter. If there are
     *            more jobs in the list than the page size, Amazon Transcribe
     *            returns the <code>NextPage</code> token. Include the token in
     *            the next request to the <code>ListVocabularyFilters</code>
     *            operation to return in the next page of jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVocabularyFiltersResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The list of vocabulary filters. It contains at most
     * <code>MaxResults</code> number of filters. If there are more filters,
     * call the <code>ListVocabularyFilters</code> operation again with the
     * <code>NextToken</code> parameter in the request set to the value of the
     * <code>NextToken</code> field in the response.
     * </p>
     *
     * @return <p>
     *         The list of vocabulary filters. It contains at most
     *         <code>MaxResults</code> number of filters. If there are more
     *         filters, call the <code>ListVocabularyFilters</code> operation
     *         again with the <code>NextToken</code> parameter in the request
     *         set to the value of the <code>NextToken</code> field in the
     *         response.
     *         </p>
     */
    public java.util.List<VocabularyFilterInfo> getVocabularyFilters() {
        return vocabularyFilters;
    }

    /**
     * <p>
     * The list of vocabulary filters. It contains at most
     * <code>MaxResults</code> number of filters. If there are more filters,
     * call the <code>ListVocabularyFilters</code> operation again with the
     * <code>NextToken</code> parameter in the request set to the value of the
     * <code>NextToken</code> field in the response.
     * </p>
     *
     * @param vocabularyFilters <p>
     *            The list of vocabulary filters. It contains at most
     *            <code>MaxResults</code> number of filters. If there are more
     *            filters, call the <code>ListVocabularyFilters</code> operation
     *            again with the <code>NextToken</code> parameter in the request
     *            set to the value of the <code>NextToken</code> field in the
     *            response.
     *            </p>
     */
    public void setVocabularyFilters(java.util.Collection<VocabularyFilterInfo> vocabularyFilters) {
        if (vocabularyFilters == null) {
            this.vocabularyFilters = null;
            return;
        }

        this.vocabularyFilters = new java.util.ArrayList<VocabularyFilterInfo>(vocabularyFilters);
    }

    /**
     * <p>
     * The list of vocabulary filters. It contains at most
     * <code>MaxResults</code> number of filters. If there are more filters,
     * call the <code>ListVocabularyFilters</code> operation again with the
     * <code>NextToken</code> parameter in the request set to the value of the
     * <code>NextToken</code> field in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vocabularyFilters <p>
     *            The list of vocabulary filters. It contains at most
     *            <code>MaxResults</code> number of filters. If there are more
     *            filters, call the <code>ListVocabularyFilters</code> operation
     *            again with the <code>NextToken</code> parameter in the request
     *            set to the value of the <code>NextToken</code> field in the
     *            response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVocabularyFiltersResult withVocabularyFilters(
            VocabularyFilterInfo... vocabularyFilters) {
        if (getVocabularyFilters() == null) {
            this.vocabularyFilters = new java.util.ArrayList<VocabularyFilterInfo>(
                    vocabularyFilters.length);
        }
        for (VocabularyFilterInfo value : vocabularyFilters) {
            this.vocabularyFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of vocabulary filters. It contains at most
     * <code>MaxResults</code> number of filters. If there are more filters,
     * call the <code>ListVocabularyFilters</code> operation again with the
     * <code>NextToken</code> parameter in the request set to the value of the
     * <code>NextToken</code> field in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vocabularyFilters <p>
     *            The list of vocabulary filters. It contains at most
     *            <code>MaxResults</code> number of filters. If there are more
     *            filters, call the <code>ListVocabularyFilters</code> operation
     *            again with the <code>NextToken</code> parameter in the request
     *            set to the value of the <code>NextToken</code> field in the
     *            response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVocabularyFiltersResult withVocabularyFilters(
            java.util.Collection<VocabularyFilterInfo> vocabularyFilters) {
        setVocabularyFilters(vocabularyFilters);
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
        if (getVocabularyFilters() != null)
            sb.append("VocabularyFilters: " + getVocabularyFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getVocabularyFilters() == null) ? 0 : getVocabularyFilters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVocabularyFiltersResult == false)
            return false;
        ListVocabularyFiltersResult other = (ListVocabularyFiltersResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVocabularyFilters() == null ^ this.getVocabularyFilters() == null)
            return false;
        if (other.getVocabularyFilters() != null
                && other.getVocabularyFilters().equals(this.getVocabularyFilters()) == false)
            return false;
        return true;
    }
}
