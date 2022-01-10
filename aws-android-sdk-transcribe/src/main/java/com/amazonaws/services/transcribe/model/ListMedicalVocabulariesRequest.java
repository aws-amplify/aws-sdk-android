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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of vocabularies that match the specified criteria. If you
 * don't enter a value in any of the request parameters, returns the entire list
 * of vocabularies.
 * </p>
 */
public class ListMedicalVocabulariesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * If the result of your previous request to
     * <code>ListMedicalVocabularies</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of vocabularies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of vocabularies to return in each page of results. If
     * there are fewer results than the value you specify, only the actual
     * results are returned. If you do not specify a value, the default of 5 is
     * used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * When specified, returns only vocabularies with the
     * <code>VocabularyState</code> equal to the specified vocabulary state. Use
     * this field to see which vocabularies are ready for your medical
     * transcription jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     */
    private String stateEquals;

    /**
     * <p>
     * Returns vocabularies whose names contain the specified string. The search
     * is not case sensitive. <code>ListMedicalVocabularies</code> returns both
     * "<code>vocabularyname</code>" and "<code>VocabularyName</code>".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String nameContains;

    /**
     * <p>
     * If the result of your previous request to
     * <code>ListMedicalVocabularies</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of vocabularies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         If the result of your previous request to
     *         <code>ListMedicalVocabularies</code> was truncated, include the
     *         <code>NextToken</code> to fetch the next set of vocabularies.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the result of your previous request to
     * <code>ListMedicalVocabularies</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of vocabularies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param nextToken <p>
     *            If the result of your previous request to
     *            <code>ListMedicalVocabularies</code> was truncated, include
     *            the <code>NextToken</code> to fetch the next set of
     *            vocabularies.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of your previous request to
     * <code>ListMedicalVocabularies</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of vocabularies.
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
     *            If the result of your previous request to
     *            <code>ListMedicalVocabularies</code> was truncated, include
     *            the <code>NextToken</code> to fetch the next set of
     *            vocabularies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMedicalVocabulariesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of vocabularies to return in each page of results. If
     * there are fewer results than the value you specify, only the actual
     * results are returned. If you do not specify a value, the default of 5 is
     * used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of vocabularies to return in each page of
     *         results. If there are fewer results than the value you specify,
     *         only the actual results are returned. If you do not specify a
     *         value, the default of 5 is used.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of vocabularies to return in each page of results. If
     * there are fewer results than the value you specify, only the actual
     * results are returned. If you do not specify a value, the default of 5 is
     * used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of vocabularies to return in each page of
     *            results. If there are fewer results than the value you
     *            specify, only the actual results are returned. If you do not
     *            specify a value, the default of 5 is used.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of vocabularies to return in each page of results. If
     * there are fewer results than the value you specify, only the actual
     * results are returned. If you do not specify a value, the default of 5 is
     * used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of vocabularies to return in each page of
     *            results. If there are fewer results than the value you
     *            specify, only the actual results are returned. If you do not
     *            specify a value, the default of 5 is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMedicalVocabulariesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * When specified, returns only vocabularies with the
     * <code>VocabularyState</code> equal to the specified vocabulary state. Use
     * this field to see which vocabularies are ready for your medical
     * transcription jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @return <p>
     *         When specified, returns only vocabularies with the
     *         <code>VocabularyState</code> equal to the specified vocabulary
     *         state. Use this field to see which vocabularies are ready for
     *         your medical transcription jobs.
     *         </p>
     * @see VocabularyState
     */
    public String getStateEquals() {
        return stateEquals;
    }

    /**
     * <p>
     * When specified, returns only vocabularies with the
     * <code>VocabularyState</code> equal to the specified vocabulary state. Use
     * this field to see which vocabularies are ready for your medical
     * transcription jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @param stateEquals <p>
     *            When specified, returns only vocabularies with the
     *            <code>VocabularyState</code> equal to the specified vocabulary
     *            state. Use this field to see which vocabularies are ready for
     *            your medical transcription jobs.
     *            </p>
     * @see VocabularyState
     */
    public void setStateEquals(String stateEquals) {
        this.stateEquals = stateEquals;
    }

    /**
     * <p>
     * When specified, returns only vocabularies with the
     * <code>VocabularyState</code> equal to the specified vocabulary state. Use
     * this field to see which vocabularies are ready for your medical
     * transcription jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @param stateEquals <p>
     *            When specified, returns only vocabularies with the
     *            <code>VocabularyState</code> equal to the specified vocabulary
     *            state. Use this field to see which vocabularies are ready for
     *            your medical transcription jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyState
     */
    public ListMedicalVocabulariesRequest withStateEquals(String stateEquals) {
        this.stateEquals = stateEquals;
        return this;
    }

    /**
     * <p>
     * When specified, returns only vocabularies with the
     * <code>VocabularyState</code> equal to the specified vocabulary state. Use
     * this field to see which vocabularies are ready for your medical
     * transcription jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @param stateEquals <p>
     *            When specified, returns only vocabularies with the
     *            <code>VocabularyState</code> equal to the specified vocabulary
     *            state. Use this field to see which vocabularies are ready for
     *            your medical transcription jobs.
     *            </p>
     * @see VocabularyState
     */
    public void setStateEquals(VocabularyState stateEquals) {
        this.stateEquals = stateEquals.toString();
    }

    /**
     * <p>
     * When specified, returns only vocabularies with the
     * <code>VocabularyState</code> equal to the specified vocabulary state. Use
     * this field to see which vocabularies are ready for your medical
     * transcription jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @param stateEquals <p>
     *            When specified, returns only vocabularies with the
     *            <code>VocabularyState</code> equal to the specified vocabulary
     *            state. Use this field to see which vocabularies are ready for
     *            your medical transcription jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyState
     */
    public ListMedicalVocabulariesRequest withStateEquals(VocabularyState stateEquals) {
        this.stateEquals = stateEquals.toString();
        return this;
    }

    /**
     * <p>
     * Returns vocabularies whose names contain the specified string. The search
     * is not case sensitive. <code>ListMedicalVocabularies</code> returns both
     * "<code>vocabularyname</code>" and "<code>VocabularyName</code>".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         Returns vocabularies whose names contain the specified string.
     *         The search is not case sensitive.
     *         <code>ListMedicalVocabularies</code> returns both "
     *         <code>vocabularyname</code>" and "<code>VocabularyName</code>".
     *         </p>
     */
    public String getNameContains() {
        return nameContains;
    }

    /**
     * <p>
     * Returns vocabularies whose names contain the specified string. The search
     * is not case sensitive. <code>ListMedicalVocabularies</code> returns both
     * "<code>vocabularyname</code>" and "<code>VocabularyName</code>".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param nameContains <p>
     *            Returns vocabularies whose names contain the specified string.
     *            The search is not case sensitive.
     *            <code>ListMedicalVocabularies</code> returns both "
     *            <code>vocabularyname</code>" and "<code>VocabularyName</code>
     *            ".
     *            </p>
     */
    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * Returns vocabularies whose names contain the specified string. The search
     * is not case sensitive. <code>ListMedicalVocabularies</code> returns both
     * "<code>vocabularyname</code>" and "<code>VocabularyName</code>".
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
     *            Returns vocabularies whose names contain the specified string.
     *            The search is not case sensitive.
     *            <code>ListMedicalVocabularies</code> returns both "
     *            <code>vocabularyname</code>" and "<code>VocabularyName</code>
     *            ".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMedicalVocabulariesRequest withNameContains(String nameContains) {
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

        if (obj instanceof ListMedicalVocabulariesRequest == false)
            return false;
        ListMedicalVocabulariesRequest other = (ListMedicalVocabulariesRequest) obj;

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
