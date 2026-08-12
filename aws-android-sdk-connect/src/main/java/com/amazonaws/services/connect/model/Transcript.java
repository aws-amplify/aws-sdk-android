/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * A structure that defines search criteria and matching logic to search for
 * contacts by matching text with transcripts analyzed by Amazon Connect Contact
 * Lens.
 * </p>
 */
public class Transcript implements Serializable {
    /**
     * <p>
     * The list of search criteria based on Contact Lens conversational
     * analytics transcript.
     * </p>
     */
    private java.util.List<TranscriptCriteria> criteria;

    /**
     * <p>
     * The match type combining search criteria using multiple transcript
     * criteria.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MATCH_ALL, MATCH_ANY
     */
    private String matchType;

    /**
     * <p>
     * The list of search criteria based on Contact Lens conversational
     * analytics transcript.
     * </p>
     *
     * @return <p>
     *         The list of search criteria based on Contact Lens conversational
     *         analytics transcript.
     *         </p>
     */
    public java.util.List<TranscriptCriteria> getCriteria() {
        return criteria;
    }

    /**
     * <p>
     * The list of search criteria based on Contact Lens conversational
     * analytics transcript.
     * </p>
     *
     * @param criteria <p>
     *            The list of search criteria based on Contact Lens
     *            conversational analytics transcript.
     *            </p>
     */
    public void setCriteria(java.util.Collection<TranscriptCriteria> criteria) {
        if (criteria == null) {
            this.criteria = null;
            return;
        }

        this.criteria = new java.util.ArrayList<TranscriptCriteria>(criteria);
    }

    /**
     * <p>
     * The list of search criteria based on Contact Lens conversational
     * analytics transcript.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param criteria <p>
     *            The list of search criteria based on Contact Lens
     *            conversational analytics transcript.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Transcript withCriteria(TranscriptCriteria... criteria) {
        if (getCriteria() == null) {
            this.criteria = new java.util.ArrayList<TranscriptCriteria>(criteria.length);
        }
        for (TranscriptCriteria value : criteria) {
            this.criteria.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of search criteria based on Contact Lens conversational
     * analytics transcript.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param criteria <p>
     *            The list of search criteria based on Contact Lens
     *            conversational analytics transcript.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Transcript withCriteria(java.util.Collection<TranscriptCriteria> criteria) {
        setCriteria(criteria);
        return this;
    }

    /**
     * <p>
     * The match type combining search criteria using multiple transcript
     * criteria.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MATCH_ALL, MATCH_ANY
     *
     * @return <p>
     *         The match type combining search criteria using multiple
     *         transcript criteria.
     *         </p>
     * @see SearchContactsMatchType
     */
    public String getMatchType() {
        return matchType;
    }

    /**
     * <p>
     * The match type combining search criteria using multiple transcript
     * criteria.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MATCH_ALL, MATCH_ANY
     *
     * @param matchType <p>
     *            The match type combining search criteria using multiple
     *            transcript criteria.
     *            </p>
     * @see SearchContactsMatchType
     */
    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    /**
     * <p>
     * The match type combining search criteria using multiple transcript
     * criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MATCH_ALL, MATCH_ANY
     *
     * @param matchType <p>
     *            The match type combining search criteria using multiple
     *            transcript criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SearchContactsMatchType
     */
    public Transcript withMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * <p>
     * The match type combining search criteria using multiple transcript
     * criteria.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MATCH_ALL, MATCH_ANY
     *
     * @param matchType <p>
     *            The match type combining search criteria using multiple
     *            transcript criteria.
     *            </p>
     * @see SearchContactsMatchType
     */
    public void setMatchType(SearchContactsMatchType matchType) {
        this.matchType = matchType.toString();
    }

    /**
     * <p>
     * The match type combining search criteria using multiple transcript
     * criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MATCH_ALL, MATCH_ANY
     *
     * @param matchType <p>
     *            The match type combining search criteria using multiple
     *            transcript criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SearchContactsMatchType
     */
    public Transcript withMatchType(SearchContactsMatchType matchType) {
        this.matchType = matchType.toString();
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
        if (getCriteria() != null)
            sb.append("Criteria: " + getCriteria() + ",");
        if (getMatchType() != null)
            sb.append("MatchType: " + getMatchType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCriteria() == null) ? 0 : getCriteria().hashCode());
        hashCode = prime * hashCode + ((getMatchType() == null) ? 0 : getMatchType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Transcript == false)
            return false;
        Transcript other = (Transcript) obj;

        if (other.getCriteria() == null ^ this.getCriteria() == null)
            return false;
        if (other.getCriteria() != null && other.getCriteria().equals(this.getCriteria()) == false)
            return false;
        if (other.getMatchType() == null ^ this.getMatchType() == null)
            return false;
        if (other.getMatchType() != null
                && other.getMatchType().equals(this.getMatchType()) == false)
            return false;
        return true;
    }
}
