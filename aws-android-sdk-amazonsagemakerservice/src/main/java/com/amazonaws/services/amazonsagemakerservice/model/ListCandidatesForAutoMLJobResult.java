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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

public class ListCandidatesForAutoMLJobResult implements Serializable {
    /**
     * <p>
     * Summaries about the Candidates.
     * </p>
     */
    private java.util.List<AutoMLCandidate> candidates;

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Summaries about the Candidates.
     * </p>
     *
     * @return <p>
     *         Summaries about the Candidates.
     *         </p>
     */
    public java.util.List<AutoMLCandidate> getCandidates() {
        return candidates;
    }

    /**
     * <p>
     * Summaries about the Candidates.
     * </p>
     *
     * @param candidates <p>
     *            Summaries about the Candidates.
     *            </p>
     */
    public void setCandidates(java.util.Collection<AutoMLCandidate> candidates) {
        if (candidates == null) {
            this.candidates = null;
            return;
        }

        this.candidates = new java.util.ArrayList<AutoMLCandidate>(candidates);
    }

    /**
     * <p>
     * Summaries about the Candidates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param candidates <p>
     *            Summaries about the Candidates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCandidatesForAutoMLJobResult withCandidates(AutoMLCandidate... candidates) {
        if (getCandidates() == null) {
            this.candidates = new java.util.ArrayList<AutoMLCandidate>(candidates.length);
        }
        for (AutoMLCandidate value : candidates) {
            this.candidates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Summaries about the Candidates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param candidates <p>
     *            Summaries about the Candidates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCandidatesForAutoMLJobResult withCandidates(
            java.util.Collection<AutoMLCandidate> candidates) {
        setCandidates(candidates);
        return this;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the previous response was truncated, you will receive this
     *         token. Use it in your next request to receive the next set of
     *         results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the previous response was truncated, you will receive this
     *            token. Use it in your next request to receive the next set of
     *            results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the previous response was truncated, you will receive this
     *            token. Use it in your next request to receive the next set of
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCandidatesForAutoMLJobResult withNextToken(String nextToken) {
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
        if (getCandidates() != null)
            sb.append("Candidates: " + getCandidates() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCandidates() == null) ? 0 : getCandidates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCandidatesForAutoMLJobResult == false)
            return false;
        ListCandidatesForAutoMLJobResult other = (ListCandidatesForAutoMLJobResult) obj;

        if (other.getCandidates() == null ^ this.getCandidates() == null)
            return false;
        if (other.getCandidates() != null
                && other.getCandidates().equals(this.getCandidates()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
