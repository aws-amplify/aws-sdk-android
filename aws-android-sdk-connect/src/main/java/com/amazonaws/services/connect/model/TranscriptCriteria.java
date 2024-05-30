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
 * A structure that defines search criteria base on words or phrases,
 * participants in the Contact Lens conversational analytics transcript.
 * </p>
 */
public class TranscriptCriteria implements Serializable {
    /**
     * <p>
     * The participant role in a transcript
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT, SUPERVISOR
     */
    private String participantRole;

    /**
     * <p>
     * The words or phrases used to search within a transcript.
     * </p>
     */
    private java.util.List<String> searchText;

    /**
     * <p>
     * The match type combining search criteria using multiple search texts in a
     * transcript criteria.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MATCH_ALL, MATCH_ANY
     */
    private String matchType;

    /**
     * <p>
     * The participant role in a transcript
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT, SUPERVISOR
     *
     * @return <p>
     *         The participant role in a transcript
     *         </p>
     * @see ParticipantRole
     */
    public String getParticipantRole() {
        return participantRole;
    }

    /**
     * <p>
     * The participant role in a transcript
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT, SUPERVISOR
     *
     * @param participantRole <p>
     *            The participant role in a transcript
     *            </p>
     * @see ParticipantRole
     */
    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * <p>
     * The participant role in a transcript
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT, SUPERVISOR
     *
     * @param participantRole <p>
     *            The participant role in a transcript
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParticipantRole
     */
    public TranscriptCriteria withParticipantRole(String participantRole) {
        this.participantRole = participantRole;
        return this;
    }

    /**
     * <p>
     * The participant role in a transcript
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT, SUPERVISOR
     *
     * @param participantRole <p>
     *            The participant role in a transcript
     *            </p>
     * @see ParticipantRole
     */
    public void setParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
    }

    /**
     * <p>
     * The participant role in a transcript
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT, SUPERVISOR
     *
     * @param participantRole <p>
     *            The participant role in a transcript
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParticipantRole
     */
    public TranscriptCriteria withParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
        return this;
    }

    /**
     * <p>
     * The words or phrases used to search within a transcript.
     * </p>
     *
     * @return <p>
     *         The words or phrases used to search within a transcript.
     *         </p>
     */
    public java.util.List<String> getSearchText() {
        return searchText;
    }

    /**
     * <p>
     * The words or phrases used to search within a transcript.
     * </p>
     *
     * @param searchText <p>
     *            The words or phrases used to search within a transcript.
     *            </p>
     */
    public void setSearchText(java.util.Collection<String> searchText) {
        if (searchText == null) {
            this.searchText = null;
            return;
        }

        this.searchText = new java.util.ArrayList<String>(searchText);
    }

    /**
     * <p>
     * The words or phrases used to search within a transcript.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param searchText <p>
     *            The words or phrases used to search within a transcript.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptCriteria withSearchText(String... searchText) {
        if (getSearchText() == null) {
            this.searchText = new java.util.ArrayList<String>(searchText.length);
        }
        for (String value : searchText) {
            this.searchText.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The words or phrases used to search within a transcript.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param searchText <p>
     *            The words or phrases used to search within a transcript.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptCriteria withSearchText(java.util.Collection<String> searchText) {
        setSearchText(searchText);
        return this;
    }

    /**
     * <p>
     * The match type combining search criteria using multiple search texts in a
     * transcript criteria.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MATCH_ALL, MATCH_ANY
     *
     * @return <p>
     *         The match type combining search criteria using multiple search
     *         texts in a transcript criteria.
     *         </p>
     * @see SearchContactsMatchType
     */
    public String getMatchType() {
        return matchType;
    }

    /**
     * <p>
     * The match type combining search criteria using multiple search texts in a
     * transcript criteria.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MATCH_ALL, MATCH_ANY
     *
     * @param matchType <p>
     *            The match type combining search criteria using multiple search
     *            texts in a transcript criteria.
     *            </p>
     * @see SearchContactsMatchType
     */
    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    /**
     * <p>
     * The match type combining search criteria using multiple search texts in a
     * transcript criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MATCH_ALL, MATCH_ANY
     *
     * @param matchType <p>
     *            The match type combining search criteria using multiple search
     *            texts in a transcript criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SearchContactsMatchType
     */
    public TranscriptCriteria withMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * <p>
     * The match type combining search criteria using multiple search texts in a
     * transcript criteria.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MATCH_ALL, MATCH_ANY
     *
     * @param matchType <p>
     *            The match type combining search criteria using multiple search
     *            texts in a transcript criteria.
     *            </p>
     * @see SearchContactsMatchType
     */
    public void setMatchType(SearchContactsMatchType matchType) {
        this.matchType = matchType.toString();
    }

    /**
     * <p>
     * The match type combining search criteria using multiple search texts in a
     * transcript criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MATCH_ALL, MATCH_ANY
     *
     * @param matchType <p>
     *            The match type combining search criteria using multiple search
     *            texts in a transcript criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SearchContactsMatchType
     */
    public TranscriptCriteria withMatchType(SearchContactsMatchType matchType) {
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
        if (getParticipantRole() != null)
            sb.append("ParticipantRole: " + getParticipantRole() + ",");
        if (getSearchText() != null)
            sb.append("SearchText: " + getSearchText() + ",");
        if (getMatchType() != null)
            sb.append("MatchType: " + getMatchType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getParticipantRole() == null) ? 0 : getParticipantRole().hashCode());
        hashCode = prime * hashCode + ((getSearchText() == null) ? 0 : getSearchText().hashCode());
        hashCode = prime * hashCode + ((getMatchType() == null) ? 0 : getMatchType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranscriptCriteria == false)
            return false;
        TranscriptCriteria other = (TranscriptCriteria) obj;

        if (other.getParticipantRole() == null ^ this.getParticipantRole() == null)
            return false;
        if (other.getParticipantRole() != null
                && other.getParticipantRole().equals(this.getParticipantRole()) == false)
            return false;
        if (other.getSearchText() == null ^ this.getSearchText() == null)
            return false;
        if (other.getSearchText() != null
                && other.getSearchText().equals(this.getSearchText()) == false)
            return false;
        if (other.getMatchType() == null ^ this.getMatchType() == null)
            return false;
        if (other.getMatchType() != null
                && other.getMatchType().equals(this.getMatchType()) == false)
            return false;
        return true;
    }
}
