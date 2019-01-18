/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of vocabularies that match the specified criteria. If no
 * criteria are specified, returns the entire list of vocabularies.
 * </p>
 */
public class ListVocabulariesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * If the result of the previous request to <code>ListVocabularies</code>
     * was truncated, include the <code>NextToken</code> to fetch the next set
     * of jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of vocabularies to return in the response. If there
     * are fewer results in the list, this response contains only the actual
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * When specified, only returns vocabularies with the
     * <code>VocabularyState</code> field equal to the specified state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     */
    private String stateEquals;

    /**
     * <p>
     * When specified, the vocabularies returned in the list are limited to
     * vocabularies whose name contains the specified string. The search is
     * case-insensitive, <code>ListVocabularies</code> will return both
     * "vocabularyname" and "VocabularyName" in the response list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String nameContains;

    /**
     * <p>
     * If the result of the previous request to <code>ListVocabularies</code>
     * was truncated, include the <code>NextToken</code> to fetch the next set
     * of jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @return <p>
     *         If the result of the previous request to
     *         <code>ListVocabularies</code> was truncated, include the
     *         <code>NextToken</code> to fetch the next set of jobs.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the result of the previous request to <code>ListVocabularies</code>
     * was truncated, include the <code>NextToken</code> to fetch the next set
     * of jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @param nextToken <p>
     *            If the result of the previous request to
     *            <code>ListVocabularies</code> was truncated, include the
     *            <code>NextToken</code> to fetch the next set of jobs.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous request to <code>ListVocabularies</code>
     * was truncated, include the <code>NextToken</code> to fetch the next set
     * of jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @param nextToken <p>
     *            If the result of the previous request to
     *            <code>ListVocabularies</code> was truncated, include the
     *            <code>NextToken</code> to fetch the next set of jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVocabulariesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of vocabularies to return in the response. If there
     * are fewer results in the list, this response contains only the actual
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of vocabularies to return in the response. If
     *         there are fewer results in the list, this response contains only
     *         the actual results.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of vocabularies to return in the response. If there
     * are fewer results in the list, this response contains only the actual
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of vocabularies to return in the response.
     *            If there are fewer results in the list, this response contains
     *            only the actual results.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of vocabularies to return in the response. If there
     * are fewer results in the list, this response contains only the actual
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of vocabularies to return in the response.
     *            If there are fewer results in the list, this response contains
     *            only the actual results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVocabulariesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * When specified, only returns vocabularies with the
     * <code>VocabularyState</code> field equal to the specified state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @return <p>
     *         When specified, only returns vocabularies with the
     *         <code>VocabularyState</code> field equal to the specified state.
     *         </p>
     * @see VocabularyState
     */
    public String getStateEquals() {
        return stateEquals;
    }

    /**
     * <p>
     * When specified, only returns vocabularies with the
     * <code>VocabularyState</code> field equal to the specified state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @param stateEquals <p>
     *            When specified, only returns vocabularies with the
     *            <code>VocabularyState</code> field equal to the specified
     *            state.
     *            </p>
     * @see VocabularyState
     */
    public void setStateEquals(String stateEquals) {
        this.stateEquals = stateEquals;
    }

    /**
     * <p>
     * When specified, only returns vocabularies with the
     * <code>VocabularyState</code> field equal to the specified state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @param stateEquals <p>
     *            When specified, only returns vocabularies with the
     *            <code>VocabularyState</code> field equal to the specified
     *            state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyState
     */
    public ListVocabulariesRequest withStateEquals(String stateEquals) {
        this.stateEquals = stateEquals;
        return this;
    }

    /**
     * <p>
     * When specified, only returns vocabularies with the
     * <code>VocabularyState</code> field equal to the specified state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @param stateEquals <p>
     *            When specified, only returns vocabularies with the
     *            <code>VocabularyState</code> field equal to the specified
     *            state.
     *            </p>
     * @see VocabularyState
     */
    public void setStateEquals(VocabularyState stateEquals) {
        this.stateEquals = stateEquals.toString();
    }

    /**
     * <p>
     * When specified, only returns vocabularies with the
     * <code>VocabularyState</code> field equal to the specified state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @param stateEquals <p>
     *            When specified, only returns vocabularies with the
     *            <code>VocabularyState</code> field equal to the specified
     *            state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyState
     */
    public ListVocabulariesRequest withStateEquals(VocabularyState stateEquals) {
        this.stateEquals = stateEquals.toString();
        return this;
    }

    /**
     * <p>
     * When specified, the vocabularies returned in the list are limited to
     * vocabularies whose name contains the specified string. The search is
     * case-insensitive, <code>ListVocabularies</code> will return both
     * "vocabularyname" and "VocabularyName" in the response list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         When specified, the vocabularies returned in the list are limited
     *         to vocabularies whose name contains the specified string. The
     *         search is case-insensitive, <code>ListVocabularies</code> will
     *         return both "vocabularyname" and "VocabularyName" in the response
     *         list.
     *         </p>
     */
    public String getNameContains() {
        return nameContains;
    }

    /**
     * <p>
     * When specified, the vocabularies returned in the list are limited to
     * vocabularies whose name contains the specified string. The search is
     * case-insensitive, <code>ListVocabularies</code> will return both
     * "vocabularyname" and "VocabularyName" in the response list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param nameContains <p>
     *            When specified, the vocabularies returned in the list are
     *            limited to vocabularies whose name contains the specified
     *            string. The search is case-insensitive,
     *            <code>ListVocabularies</code> will return both
     *            "vocabularyname" and "VocabularyName" in the response list.
     *            </p>
     */
    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * When specified, the vocabularies returned in the list are limited to
     * vocabularies whose name contains the specified string. The search is
     * case-insensitive, <code>ListVocabularies</code> will return both
     * "vocabularyname" and "VocabularyName" in the response list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param nameContains <p>
     *            When specified, the vocabularies returned in the list are
     *            limited to vocabularies whose name contains the specified
     *            string. The search is case-insensitive,
     *            <code>ListVocabularies</code> will return both
     *            "vocabularyname" and "VocabularyName" in the response list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVocabulariesRequest withNameContains(String nameContains) {
        this.nameContains = nameContains;
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
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getStateEquals() != null)
            sb.append("StateEquals: " + getStateEquals() + ",");
        if (getNameContains() != null)
            sb.append("NameContains: " + getNameContains());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getStateEquals() == null) ? 0 : getStateEquals().hashCode());
        hashCode = prime * hashCode
                + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVocabulariesRequest == false)
            return false;
        ListVocabulariesRequest other = (ListVocabulariesRequest) obj;

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
        if (other.getStateEquals() == null ^ this.getStateEquals() == null)
            return false;
        if (other.getStateEquals() != null
                && other.getStateEquals().equals(this.getStateEquals()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null
                && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        return true;
    }
}
