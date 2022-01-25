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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class SearchVocabulariesResult implements Serializable {
    /**
     * <p>
     * The list of the available custom vocabularies.
     * </p>
     */
    private java.util.List<VocabularySummary> vocabularySummaryList;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131070<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The list of the available custom vocabularies.
     * </p>
     *
     * @return <p>
     *         The list of the available custom vocabularies.
     *         </p>
     */
    public java.util.List<VocabularySummary> getVocabularySummaryList() {
        return vocabularySummaryList;
    }

    /**
     * <p>
     * The list of the available custom vocabularies.
     * </p>
     *
     * @param vocabularySummaryList <p>
     *            The list of the available custom vocabularies.
     *            </p>
     */
    public void setVocabularySummaryList(
            java.util.Collection<VocabularySummary> vocabularySummaryList) {
        if (vocabularySummaryList == null) {
            this.vocabularySummaryList = null;
            return;
        }

        this.vocabularySummaryList = new java.util.ArrayList<VocabularySummary>(
                vocabularySummaryList);
    }

    /**
     * <p>
     * The list of the available custom vocabularies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vocabularySummaryList <p>
     *            The list of the available custom vocabularies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchVocabulariesResult withVocabularySummaryList(
            VocabularySummary... vocabularySummaryList) {
        if (getVocabularySummaryList() == null) {
            this.vocabularySummaryList = new java.util.ArrayList<VocabularySummary>(
                    vocabularySummaryList.length);
        }
        for (VocabularySummary value : vocabularySummaryList) {
            this.vocabularySummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of the available custom vocabularies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vocabularySummaryList <p>
     *            The list of the available custom vocabularies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchVocabulariesResult withVocabularySummaryList(
            java.util.Collection<VocabularySummary> vocabularySummaryList) {
        setVocabularySummaryList(vocabularySummaryList);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131070<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         If there are additional results, this is the token for the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131070<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131070<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchVocabulariesResult withNextToken(String nextToken) {
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
        if (getVocabularySummaryList() != null)
            sb.append("VocabularySummaryList: " + getVocabularySummaryList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getVocabularySummaryList() == null) ? 0 : getVocabularySummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchVocabulariesResult == false)
            return false;
        SearchVocabulariesResult other = (SearchVocabulariesResult) obj;

        if (other.getVocabularySummaryList() == null ^ this.getVocabularySummaryList() == null)
            return false;
        if (other.getVocabularySummaryList() != null
                && other.getVocabularySummaryList().equals(this.getVocabularySummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
