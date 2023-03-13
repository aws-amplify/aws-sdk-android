/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides a list of custom vocabularies that match the specified criteria. If
 * no criteria are specified, all custom vocabularies are returned.
 * </p>
 * <p>
 * To get detailed information about a specific custom vocabulary, use the
 * operation.
 * </p>
 */
public class ListVocabulariesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * If your <code>ListVocabularies</code> request returns more results than
     * can be displayed, <code>NextToken</code> is displayed in the response
     * with an associated string. To get the next page of results, copy this
     * string and repeat your request, including <code>NextToken</code> with the
     * value of the copied string. Repeat as needed to view all your results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of custom vocabularies to return in each page of
     * results. If there are fewer results than the value that you specify, only
     * the actual results are returned. If you don't specify a value, a default
     * of 5 is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * Returns only custom vocabularies with the specified state. Vocabularies
     * are ordered by creation date, with the newest vocabulary first. If you
     * don't include <code>StateEquals</code>, all custom medical vocabularies
     * are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     */
    private String stateEquals;

    /**
     * <p>
     * Returns only the custom vocabularies that contain the specified string.
     * The search is not case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String nameContains;

    /**
     * <p>
     * If your <code>ListVocabularies</code> request returns more results than
     * can be displayed, <code>NextToken</code> is displayed in the response
     * with an associated string. To get the next page of results, copy this
     * string and repeat your request, including <code>NextToken</code> with the
     * value of the copied string. Repeat as needed to view all your results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         If your <code>ListVocabularies</code> request returns more
     *         results than can be displayed, <code>NextToken</code> is
     *         displayed in the response with an associated string. To get the
     *         next page of results, copy this string and repeat your request,
     *         including <code>NextToken</code> with the value of the copied
     *         string. Repeat as needed to view all your results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If your <code>ListVocabularies</code> request returns more results than
     * can be displayed, <code>NextToken</code> is displayed in the response
     * with an associated string. To get the next page of results, copy this
     * string and repeat your request, including <code>NextToken</code> with the
     * value of the copied string. Repeat as needed to view all your results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param nextToken <p>
     *            If your <code>ListVocabularies</code> request returns more
     *            results than can be displayed, <code>NextToken</code> is
     *            displayed in the response with an associated string. To get
     *            the next page of results, copy this string and repeat your
     *            request, including <code>NextToken</code> with the value of
     *            the copied string. Repeat as needed to view all your results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If your <code>ListVocabularies</code> request returns more results than
     * can be displayed, <code>NextToken</code> is displayed in the response
     * with an associated string. To get the next page of results, copy this
     * string and repeat your request, including <code>NextToken</code> with the
     * value of the copied string. Repeat as needed to view all your results.
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
     *            If your <code>ListVocabularies</code> request returns more
     *            results than can be displayed, <code>NextToken</code> is
     *            displayed in the response with an associated string. To get
     *            the next page of results, copy this string and repeat your
     *            request, including <code>NextToken</code> with the value of
     *            the copied string. Repeat as needed to view all your results.
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
     * The maximum number of custom vocabularies to return in each page of
     * results. If there are fewer results than the value that you specify, only
     * the actual results are returned. If you don't specify a value, a default
     * of 5 is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of custom vocabularies to return in each page
     *         of results. If there are fewer results than the value that you
     *         specify, only the actual results are returned. If you don't
     *         specify a value, a default of 5 is used.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of custom vocabularies to return in each page of
     * results. If there are fewer results than the value that you specify, only
     * the actual results are returned. If you don't specify a value, a default
     * of 5 is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of custom vocabularies to return in each
     *            page of results. If there are fewer results than the value
     *            that you specify, only the actual results are returned. If you
     *            don't specify a value, a default of 5 is used.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of custom vocabularies to return in each page of
     * results. If there are fewer results than the value that you specify, only
     * the actual results are returned. If you don't specify a value, a default
     * of 5 is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of custom vocabularies to return in each
     *            page of results. If there are fewer results than the value
     *            that you specify, only the actual results are returned. If you
     *            don't specify a value, a default of 5 is used.
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
     * Returns only custom vocabularies with the specified state. Vocabularies
     * are ordered by creation date, with the newest vocabulary first. If you
     * don't include <code>StateEquals</code>, all custom medical vocabularies
     * are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @return <p>
     *         Returns only custom vocabularies with the specified state.
     *         Vocabularies are ordered by creation date, with the newest
     *         vocabulary first. If you don't include <code>StateEquals</code>,
     *         all custom medical vocabularies are returned.
     *         </p>
     * @see VocabularyState
     */
    public String getStateEquals() {
        return stateEquals;
    }

    /**
     * <p>
     * Returns only custom vocabularies with the specified state. Vocabularies
     * are ordered by creation date, with the newest vocabulary first. If you
     * don't include <code>StateEquals</code>, all custom medical vocabularies
     * are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @param stateEquals <p>
     *            Returns only custom vocabularies with the specified state.
     *            Vocabularies are ordered by creation date, with the newest
     *            vocabulary first. If you don't include
     *            <code>StateEquals</code>, all custom medical vocabularies are
     *            returned.
     *            </p>
     * @see VocabularyState
     */
    public void setStateEquals(String stateEquals) {
        this.stateEquals = stateEquals;
    }

    /**
     * <p>
     * Returns only custom vocabularies with the specified state. Vocabularies
     * are ordered by creation date, with the newest vocabulary first. If you
     * don't include <code>StateEquals</code>, all custom medical vocabularies
     * are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @param stateEquals <p>
     *            Returns only custom vocabularies with the specified state.
     *            Vocabularies are ordered by creation date, with the newest
     *            vocabulary first. If you don't include
     *            <code>StateEquals</code>, all custom medical vocabularies are
     *            returned.
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
     * Returns only custom vocabularies with the specified state. Vocabularies
     * are ordered by creation date, with the newest vocabulary first. If you
     * don't include <code>StateEquals</code>, all custom medical vocabularies
     * are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @param stateEquals <p>
     *            Returns only custom vocabularies with the specified state.
     *            Vocabularies are ordered by creation date, with the newest
     *            vocabulary first. If you don't include
     *            <code>StateEquals</code>, all custom medical vocabularies are
     *            returned.
     *            </p>
     * @see VocabularyState
     */
    public void setStateEquals(VocabularyState stateEquals) {
        this.stateEquals = stateEquals.toString();
    }

    /**
     * <p>
     * Returns only custom vocabularies with the specified state. Vocabularies
     * are ordered by creation date, with the newest vocabulary first. If you
     * don't include <code>StateEquals</code>, all custom medical vocabularies
     * are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @param stateEquals <p>
     *            Returns only custom vocabularies with the specified state.
     *            Vocabularies are ordered by creation date, with the newest
     *            vocabulary first. If you don't include
     *            <code>StateEquals</code>, all custom medical vocabularies are
     *            returned.
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
     * Returns only the custom vocabularies that contain the specified string.
     * The search is not case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         Returns only the custom vocabularies that contain the specified
     *         string. The search is not case sensitive.
     *         </p>
     */
    public String getNameContains() {
        return nameContains;
    }

    /**
     * <p>
     * Returns only the custom vocabularies that contain the specified string.
     * The search is not case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param nameContains <p>
     *            Returns only the custom vocabularies that contain the
     *            specified string. The search is not case sensitive.
     *            </p>
     */
    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * Returns only the custom vocabularies that contain the specified string.
     * The search is not case sensitive.
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
     *            Returns only the custom vocabularies that contain the
     *            specified string. The search is not case sensitive.
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
