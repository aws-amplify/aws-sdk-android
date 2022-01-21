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

/**
 * <p>
 * Matches the output of the transcription to either the specific phrases that
 * you specify, or the intent of the phrases that you specify.
 * </p>
 */
public class TranscriptFilter implements Serializable {
    /**
     * <p>
     * Matches the phrase to the transcription output in a word for word
     * fashion. For example, if you specify the phrase
     * "I want to speak to the manager." Amazon Transcribe attempts to match
     * that specific phrase to the transcription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXACT
     */
    private String transcriptFilterType;

    /**
     * <p>
     * A time range, set in seconds, between two points in the call.
     * </p>
     */
    private AbsoluteTimeRange absoluteTimeRange;

    /**
     * <p>
     * An object that allows percentages to specify the proportion of the call
     * where you would like to apply a filter. For example, you can specify the
     * first half of the call. You can also specify the period of time between
     * halfway through to three-quarters of the way through the call. Because
     * the length of conversation can vary between calls, you can apply relative
     * time ranges across all calls.
     * </p>
     */
    private RelativeTimeRange relativeTimeRange;

    /**
     * <p>
     * Determines whether the customer or the agent is speaking the phrases that
     * you've specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     */
    private String participantRole;

    /**
     * <p>
     * If <code>TRUE</code>, the rule that you specify is applied to everything
     * except for the phrases that you specify.
     * </p>
     */
    private Boolean negate;

    /**
     * <p>
     * The phrases that you're specifying for the transcript filter to match.
     * </p>
     */
    private java.util.List<String> targets;

    /**
     * <p>
     * Matches the phrase to the transcription output in a word for word
     * fashion. For example, if you specify the phrase
     * "I want to speak to the manager." Amazon Transcribe attempts to match
     * that specific phrase to the transcription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXACT
     *
     * @return <p>
     *         Matches the phrase to the transcription output in a word for word
     *         fashion. For example, if you specify the phrase
     *         "I want to speak to the manager." Amazon Transcribe attempts to
     *         match that specific phrase to the transcription.
     *         </p>
     * @see TranscriptFilterType
     */
    public String getTranscriptFilterType() {
        return transcriptFilterType;
    }

    /**
     * <p>
     * Matches the phrase to the transcription output in a word for word
     * fashion. For example, if you specify the phrase
     * "I want to speak to the manager." Amazon Transcribe attempts to match
     * that specific phrase to the transcription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXACT
     *
     * @param transcriptFilterType <p>
     *            Matches the phrase to the transcription output in a word for
     *            word fashion. For example, if you specify the phrase
     *            "I want to speak to the manager." Amazon Transcribe attempts
     *            to match that specific phrase to the transcription.
     *            </p>
     * @see TranscriptFilterType
     */
    public void setTranscriptFilterType(String transcriptFilterType) {
        this.transcriptFilterType = transcriptFilterType;
    }

    /**
     * <p>
     * Matches the phrase to the transcription output in a word for word
     * fashion. For example, if you specify the phrase
     * "I want to speak to the manager." Amazon Transcribe attempts to match
     * that specific phrase to the transcription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXACT
     *
     * @param transcriptFilterType <p>
     *            Matches the phrase to the transcription output in a word for
     *            word fashion. For example, if you specify the phrase
     *            "I want to speak to the manager." Amazon Transcribe attempts
     *            to match that specific phrase to the transcription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TranscriptFilterType
     */
    public TranscriptFilter withTranscriptFilterType(String transcriptFilterType) {
        this.transcriptFilterType = transcriptFilterType;
        return this;
    }

    /**
     * <p>
     * Matches the phrase to the transcription output in a word for word
     * fashion. For example, if you specify the phrase
     * "I want to speak to the manager." Amazon Transcribe attempts to match
     * that specific phrase to the transcription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXACT
     *
     * @param transcriptFilterType <p>
     *            Matches the phrase to the transcription output in a word for
     *            word fashion. For example, if you specify the phrase
     *            "I want to speak to the manager." Amazon Transcribe attempts
     *            to match that specific phrase to the transcription.
     *            </p>
     * @see TranscriptFilterType
     */
    public void setTranscriptFilterType(TranscriptFilterType transcriptFilterType) {
        this.transcriptFilterType = transcriptFilterType.toString();
    }

    /**
     * <p>
     * Matches the phrase to the transcription output in a word for word
     * fashion. For example, if you specify the phrase
     * "I want to speak to the manager." Amazon Transcribe attempts to match
     * that specific phrase to the transcription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXACT
     *
     * @param transcriptFilterType <p>
     *            Matches the phrase to the transcription output in a word for
     *            word fashion. For example, if you specify the phrase
     *            "I want to speak to the manager." Amazon Transcribe attempts
     *            to match that specific phrase to the transcription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TranscriptFilterType
     */
    public TranscriptFilter withTranscriptFilterType(TranscriptFilterType transcriptFilterType) {
        this.transcriptFilterType = transcriptFilterType.toString();
        return this;
    }

    /**
     * <p>
     * A time range, set in seconds, between two points in the call.
     * </p>
     *
     * @return <p>
     *         A time range, set in seconds, between two points in the call.
     *         </p>
     */
    public AbsoluteTimeRange getAbsoluteTimeRange() {
        return absoluteTimeRange;
    }

    /**
     * <p>
     * A time range, set in seconds, between two points in the call.
     * </p>
     *
     * @param absoluteTimeRange <p>
     *            A time range, set in seconds, between two points in the call.
     *            </p>
     */
    public void setAbsoluteTimeRange(AbsoluteTimeRange absoluteTimeRange) {
        this.absoluteTimeRange = absoluteTimeRange;
    }

    /**
     * <p>
     * A time range, set in seconds, between two points in the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param absoluteTimeRange <p>
     *            A time range, set in seconds, between two points in the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptFilter withAbsoluteTimeRange(AbsoluteTimeRange absoluteTimeRange) {
        this.absoluteTimeRange = absoluteTimeRange;
        return this;
    }

    /**
     * <p>
     * An object that allows percentages to specify the proportion of the call
     * where you would like to apply a filter. For example, you can specify the
     * first half of the call. You can also specify the period of time between
     * halfway through to three-quarters of the way through the call. Because
     * the length of conversation can vary between calls, you can apply relative
     * time ranges across all calls.
     * </p>
     *
     * @return <p>
     *         An object that allows percentages to specify the proportion of
     *         the call where you would like to apply a filter. For example, you
     *         can specify the first half of the call. You can also specify the
     *         period of time between halfway through to three-quarters of the
     *         way through the call. Because the length of conversation can vary
     *         between calls, you can apply relative time ranges across all
     *         calls.
     *         </p>
     */
    public RelativeTimeRange getRelativeTimeRange() {
        return relativeTimeRange;
    }

    /**
     * <p>
     * An object that allows percentages to specify the proportion of the call
     * where you would like to apply a filter. For example, you can specify the
     * first half of the call. You can also specify the period of time between
     * halfway through to three-quarters of the way through the call. Because
     * the length of conversation can vary between calls, you can apply relative
     * time ranges across all calls.
     * </p>
     *
     * @param relativeTimeRange <p>
     *            An object that allows percentages to specify the proportion of
     *            the call where you would like to apply a filter. For example,
     *            you can specify the first half of the call. You can also
     *            specify the period of time between halfway through to
     *            three-quarters of the way through the call. Because the length
     *            of conversation can vary between calls, you can apply relative
     *            time ranges across all calls.
     *            </p>
     */
    public void setRelativeTimeRange(RelativeTimeRange relativeTimeRange) {
        this.relativeTimeRange = relativeTimeRange;
    }

    /**
     * <p>
     * An object that allows percentages to specify the proportion of the call
     * where you would like to apply a filter. For example, you can specify the
     * first half of the call. You can also specify the period of time between
     * halfway through to three-quarters of the way through the call. Because
     * the length of conversation can vary between calls, you can apply relative
     * time ranges across all calls.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relativeTimeRange <p>
     *            An object that allows percentages to specify the proportion of
     *            the call where you would like to apply a filter. For example,
     *            you can specify the first half of the call. You can also
     *            specify the period of time between halfway through to
     *            three-quarters of the way through the call. Because the length
     *            of conversation can vary between calls, you can apply relative
     *            time ranges across all calls.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptFilter withRelativeTimeRange(RelativeTimeRange relativeTimeRange) {
        this.relativeTimeRange = relativeTimeRange;
        return this;
    }

    /**
     * <p>
     * Determines whether the customer or the agent is speaking the phrases that
     * you've specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @return <p>
     *         Determines whether the customer or the agent is speaking the
     *         phrases that you've specified.
     *         </p>
     * @see ParticipantRole
     */
    public String getParticipantRole() {
        return participantRole;
    }

    /**
     * <p>
     * Determines whether the customer or the agent is speaking the phrases that
     * you've specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @param participantRole <p>
     *            Determines whether the customer or the agent is speaking the
     *            phrases that you've specified.
     *            </p>
     * @see ParticipantRole
     */
    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * <p>
     * Determines whether the customer or the agent is speaking the phrases that
     * you've specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @param participantRole <p>
     *            Determines whether the customer or the agent is speaking the
     *            phrases that you've specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParticipantRole
     */
    public TranscriptFilter withParticipantRole(String participantRole) {
        this.participantRole = participantRole;
        return this;
    }

    /**
     * <p>
     * Determines whether the customer or the agent is speaking the phrases that
     * you've specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @param participantRole <p>
     *            Determines whether the customer or the agent is speaking the
     *            phrases that you've specified.
     *            </p>
     * @see ParticipantRole
     */
    public void setParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
    }

    /**
     * <p>
     * Determines whether the customer or the agent is speaking the phrases that
     * you've specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @param participantRole <p>
     *            Determines whether the customer or the agent is speaking the
     *            phrases that you've specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParticipantRole
     */
    public TranscriptFilter withParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
        return this;
    }

    /**
     * <p>
     * If <code>TRUE</code>, the rule that you specify is applied to everything
     * except for the phrases that you specify.
     * </p>
     *
     * @return <p>
     *         If <code>TRUE</code>, the rule that you specify is applied to
     *         everything except for the phrases that you specify.
     *         </p>
     */
    public Boolean isNegate() {
        return negate;
    }

    /**
     * <p>
     * If <code>TRUE</code>, the rule that you specify is applied to everything
     * except for the phrases that you specify.
     * </p>
     *
     * @return <p>
     *         If <code>TRUE</code>, the rule that you specify is applied to
     *         everything except for the phrases that you specify.
     *         </p>
     */
    public Boolean getNegate() {
        return negate;
    }

    /**
     * <p>
     * If <code>TRUE</code>, the rule that you specify is applied to everything
     * except for the phrases that you specify.
     * </p>
     *
     * @param negate <p>
     *            If <code>TRUE</code>, the rule that you specify is applied to
     *            everything except for the phrases that you specify.
     *            </p>
     */
    public void setNegate(Boolean negate) {
        this.negate = negate;
    }

    /**
     * <p>
     * If <code>TRUE</code>, the rule that you specify is applied to everything
     * except for the phrases that you specify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param negate <p>
     *            If <code>TRUE</code>, the rule that you specify is applied to
     *            everything except for the phrases that you specify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptFilter withNegate(Boolean negate) {
        this.negate = negate;
        return this;
    }

    /**
     * <p>
     * The phrases that you're specifying for the transcript filter to match.
     * </p>
     *
     * @return <p>
     *         The phrases that you're specifying for the transcript filter to
     *         match.
     *         </p>
     */
    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The phrases that you're specifying for the transcript filter to match.
     * </p>
     *
     * @param targets <p>
     *            The phrases that you're specifying for the transcript filter
     *            to match.
     *            </p>
     */
    public void setTargets(java.util.Collection<String> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<String>(targets);
    }

    /**
     * <p>
     * The phrases that you're specifying for the transcript filter to match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The phrases that you're specifying for the transcript filter
     *            to match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptFilter withTargets(String... targets) {
        if (getTargets() == null) {
            this.targets = new java.util.ArrayList<String>(targets.length);
        }
        for (String value : targets) {
            this.targets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The phrases that you're specifying for the transcript filter to match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The phrases that you're specifying for the transcript filter
     *            to match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptFilter withTargets(java.util.Collection<String> targets) {
        setTargets(targets);
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
        if (getTranscriptFilterType() != null)
            sb.append("TranscriptFilterType: " + getTranscriptFilterType() + ",");
        if (getAbsoluteTimeRange() != null)
            sb.append("AbsoluteTimeRange: " + getAbsoluteTimeRange() + ",");
        if (getRelativeTimeRange() != null)
            sb.append("RelativeTimeRange: " + getRelativeTimeRange() + ",");
        if (getParticipantRole() != null)
            sb.append("ParticipantRole: " + getParticipantRole() + ",");
        if (getNegate() != null)
            sb.append("Negate: " + getNegate() + ",");
        if (getTargets() != null)
            sb.append("Targets: " + getTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTranscriptFilterType() == null) ? 0 : getTranscriptFilterType().hashCode());
        hashCode = prime * hashCode
                + ((getAbsoluteTimeRange() == null) ? 0 : getAbsoluteTimeRange().hashCode());
        hashCode = prime * hashCode
                + ((getRelativeTimeRange() == null) ? 0 : getRelativeTimeRange().hashCode());
        hashCode = prime * hashCode
                + ((getParticipantRole() == null) ? 0 : getParticipantRole().hashCode());
        hashCode = prime * hashCode + ((getNegate() == null) ? 0 : getNegate().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranscriptFilter == false)
            return false;
        TranscriptFilter other = (TranscriptFilter) obj;

        if (other.getTranscriptFilterType() == null ^ this.getTranscriptFilterType() == null)
            return false;
        if (other.getTranscriptFilterType() != null
                && other.getTranscriptFilterType().equals(this.getTranscriptFilterType()) == false)
            return false;
        if (other.getAbsoluteTimeRange() == null ^ this.getAbsoluteTimeRange() == null)
            return false;
        if (other.getAbsoluteTimeRange() != null
                && other.getAbsoluteTimeRange().equals(this.getAbsoluteTimeRange()) == false)
            return false;
        if (other.getRelativeTimeRange() == null ^ this.getRelativeTimeRange() == null)
            return false;
        if (other.getRelativeTimeRange() != null
                && other.getRelativeTimeRange().equals(this.getRelativeTimeRange()) == false)
            return false;
        if (other.getParticipantRole() == null ^ this.getParticipantRole() == null)
            return false;
        if (other.getParticipantRole() != null
                && other.getParticipantRole().equals(this.getParticipantRole()) == false)
            return false;
        if (other.getNegate() == null ^ this.getNegate() == null)
            return false;
        if (other.getNegate() != null && other.getNegate().equals(this.getNegate()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        return true;
    }
}
