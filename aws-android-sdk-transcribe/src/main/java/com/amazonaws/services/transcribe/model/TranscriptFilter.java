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

/**
 * <p>
 * Flag the presence or absence of specific words or phrases detected in your
 * Call Analytics transcription output.
 * </p>
 * <p>
 * Rules using <code>TranscriptFilter</code> are designed to match:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Custom words or phrases spoken by the agent, the customer, or both
 * </p>
 * </li>
 * <li>
 * <p>
 * Custom words or phrases <b>not</b> spoken by the agent, the customer, or
 * either
 * </p>
 * </li>
 * <li>
 * <p>
 * Custom words or phrases that occur at a specific time frame
 * </p>
 * </li>
 * </ul>
 * <p>
 * See <a href=
 * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-batch.html#tca-rules-batch"
 * >Rule criteria for post-call categories</a> and <a href=
 * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-stream.html#tca-rules-stream"
 * >Rule criteria for streaming categories</a> for usage examples.
 * </p>
 */
public class TranscriptFilter implements Serializable {
    /**
     * <p>
     * Flag the presence or absence of an exact match to the phrases that you
     * specify. For example, if you specify the phrase "speak to a manager" as
     * your <code>Targets</code> value, only that exact phrase is flagged.
     * </p>
     * <p>
     * Note that semantic matching is not supported. For example, if your
     * customer says "speak to <i>the</i> manager", instead of
     * "speak to <i>a</i> manager", your content is not flagged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXACT
     */
    private String transcriptFilterType;

    /**
     * <p>
     * Makes it possible to specify a time range (in milliseconds) in your
     * audio, during which you want to search for the specified key words or
     * phrases. See for more detail.
     * </p>
     */
    private AbsoluteTimeRange absoluteTimeRange;

    /**
     * <p>
     * Makes it possible to specify a time range (in percentage) in your media
     * file, during which you want to search for the specified key words or
     * phrases. See for more detail.
     * </p>
     */
    private RelativeTimeRange relativeTimeRange;

    /**
     * <p>
     * Specify the participant that you want to flag. Omitting this parameter is
     * equivalent to specifying both participants.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     */
    private String participantRole;

    /**
     * <p>
     * Set to <code>TRUE</code> to flag the absence of the phrase that you
     * specified in your request. Set to <code>FALSE</code> to flag the presence
     * of the phrase that you specified in your request.
     * </p>
     */
    private Boolean negate;

    /**
     * <p>
     * Specify the phrases that you want to flag.
     * </p>
     */
    private java.util.List<String> targets;

    /**
     * <p>
     * Flag the presence or absence of an exact match to the phrases that you
     * specify. For example, if you specify the phrase "speak to a manager" as
     * your <code>Targets</code> value, only that exact phrase is flagged.
     * </p>
     * <p>
     * Note that semantic matching is not supported. For example, if your
     * customer says "speak to <i>the</i> manager", instead of
     * "speak to <i>a</i> manager", your content is not flagged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXACT
     *
     * @return <p>
     *         Flag the presence or absence of an exact match to the phrases
     *         that you specify. For example, if you specify the phrase
     *         "speak to a manager" as your <code>Targets</code> value, only
     *         that exact phrase is flagged.
     *         </p>
     *         <p>
     *         Note that semantic matching is not supported. For example, if
     *         your customer says "speak to <i>the</i> manager", instead of
     *         "speak to <i>a</i> manager", your content is not flagged.
     *         </p>
     * @see TranscriptFilterType
     */
    public String getTranscriptFilterType() {
        return transcriptFilterType;
    }

    /**
     * <p>
     * Flag the presence or absence of an exact match to the phrases that you
     * specify. For example, if you specify the phrase "speak to a manager" as
     * your <code>Targets</code> value, only that exact phrase is flagged.
     * </p>
     * <p>
     * Note that semantic matching is not supported. For example, if your
     * customer says "speak to <i>the</i> manager", instead of
     * "speak to <i>a</i> manager", your content is not flagged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXACT
     *
     * @param transcriptFilterType <p>
     *            Flag the presence or absence of an exact match to the phrases
     *            that you specify. For example, if you specify the phrase
     *            "speak to a manager" as your <code>Targets</code> value, only
     *            that exact phrase is flagged.
     *            </p>
     *            <p>
     *            Note that semantic matching is not supported. For example, if
     *            your customer says "speak to <i>the</i> manager", instead of
     *            "speak to <i>a</i> manager", your content is not flagged.
     *            </p>
     * @see TranscriptFilterType
     */
    public void setTranscriptFilterType(String transcriptFilterType) {
        this.transcriptFilterType = transcriptFilterType;
    }

    /**
     * <p>
     * Flag the presence or absence of an exact match to the phrases that you
     * specify. For example, if you specify the phrase "speak to a manager" as
     * your <code>Targets</code> value, only that exact phrase is flagged.
     * </p>
     * <p>
     * Note that semantic matching is not supported. For example, if your
     * customer says "speak to <i>the</i> manager", instead of
     * "speak to <i>a</i> manager", your content is not flagged.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXACT
     *
     * @param transcriptFilterType <p>
     *            Flag the presence or absence of an exact match to the phrases
     *            that you specify. For example, if you specify the phrase
     *            "speak to a manager" as your <code>Targets</code> value, only
     *            that exact phrase is flagged.
     *            </p>
     *            <p>
     *            Note that semantic matching is not supported. For example, if
     *            your customer says "speak to <i>the</i> manager", instead of
     *            "speak to <i>a</i> manager", your content is not flagged.
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
     * Flag the presence or absence of an exact match to the phrases that you
     * specify. For example, if you specify the phrase "speak to a manager" as
     * your <code>Targets</code> value, only that exact phrase is flagged.
     * </p>
     * <p>
     * Note that semantic matching is not supported. For example, if your
     * customer says "speak to <i>the</i> manager", instead of
     * "speak to <i>a</i> manager", your content is not flagged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXACT
     *
     * @param transcriptFilterType <p>
     *            Flag the presence or absence of an exact match to the phrases
     *            that you specify. For example, if you specify the phrase
     *            "speak to a manager" as your <code>Targets</code> value, only
     *            that exact phrase is flagged.
     *            </p>
     *            <p>
     *            Note that semantic matching is not supported. For example, if
     *            your customer says "speak to <i>the</i> manager", instead of
     *            "speak to <i>a</i> manager", your content is not flagged.
     *            </p>
     * @see TranscriptFilterType
     */
    public void setTranscriptFilterType(TranscriptFilterType transcriptFilterType) {
        this.transcriptFilterType = transcriptFilterType.toString();
    }

    /**
     * <p>
     * Flag the presence or absence of an exact match to the phrases that you
     * specify. For example, if you specify the phrase "speak to a manager" as
     * your <code>Targets</code> value, only that exact phrase is flagged.
     * </p>
     * <p>
     * Note that semantic matching is not supported. For example, if your
     * customer says "speak to <i>the</i> manager", instead of
     * "speak to <i>a</i> manager", your content is not flagged.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXACT
     *
     * @param transcriptFilterType <p>
     *            Flag the presence or absence of an exact match to the phrases
     *            that you specify. For example, if you specify the phrase
     *            "speak to a manager" as your <code>Targets</code> value, only
     *            that exact phrase is flagged.
     *            </p>
     *            <p>
     *            Note that semantic matching is not supported. For example, if
     *            your customer says "speak to <i>the</i> manager", instead of
     *            "speak to <i>a</i> manager", your content is not flagged.
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
     * Makes it possible to specify a time range (in milliseconds) in your
     * audio, during which you want to search for the specified key words or
     * phrases. See for more detail.
     * </p>
     *
     * @return <p>
     *         Makes it possible to specify a time range (in milliseconds) in
     *         your audio, during which you want to search for the specified key
     *         words or phrases. See for more detail.
     *         </p>
     */
    public AbsoluteTimeRange getAbsoluteTimeRange() {
        return absoluteTimeRange;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in milliseconds) in your
     * audio, during which you want to search for the specified key words or
     * phrases. See for more detail.
     * </p>
     *
     * @param absoluteTimeRange <p>
     *            Makes it possible to specify a time range (in milliseconds) in
     *            your audio, during which you want to search for the specified
     *            key words or phrases. See for more detail.
     *            </p>
     */
    public void setAbsoluteTimeRange(AbsoluteTimeRange absoluteTimeRange) {
        this.absoluteTimeRange = absoluteTimeRange;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in milliseconds) in your
     * audio, during which you want to search for the specified key words or
     * phrases. See for more detail.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param absoluteTimeRange <p>
     *            Makes it possible to specify a time range (in milliseconds) in
     *            your audio, during which you want to search for the specified
     *            key words or phrases. See for more detail.
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
     * Makes it possible to specify a time range (in percentage) in your media
     * file, during which you want to search for the specified key words or
     * phrases. See for more detail.
     * </p>
     *
     * @return <p>
     *         Makes it possible to specify a time range (in percentage) in your
     *         media file, during which you want to search for the specified key
     *         words or phrases. See for more detail.
     *         </p>
     */
    public RelativeTimeRange getRelativeTimeRange() {
        return relativeTimeRange;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in percentage) in your media
     * file, during which you want to search for the specified key words or
     * phrases. See for more detail.
     * </p>
     *
     * @param relativeTimeRange <p>
     *            Makes it possible to specify a time range (in percentage) in
     *            your media file, during which you want to search for the
     *            specified key words or phrases. See for more detail.
     *            </p>
     */
    public void setRelativeTimeRange(RelativeTimeRange relativeTimeRange) {
        this.relativeTimeRange = relativeTimeRange;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in percentage) in your media
     * file, during which you want to search for the specified key words or
     * phrases. See for more detail.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relativeTimeRange <p>
     *            Makes it possible to specify a time range (in percentage) in
     *            your media file, during which you want to search for the
     *            specified key words or phrases. See for more detail.
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
     * Specify the participant that you want to flag. Omitting this parameter is
     * equivalent to specifying both participants.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @return <p>
     *         Specify the participant that you want to flag. Omitting this
     *         parameter is equivalent to specifying both participants.
     *         </p>
     * @see ParticipantRole
     */
    public String getParticipantRole() {
        return participantRole;
    }

    /**
     * <p>
     * Specify the participant that you want to flag. Omitting this parameter is
     * equivalent to specifying both participants.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @param participantRole <p>
     *            Specify the participant that you want to flag. Omitting this
     *            parameter is equivalent to specifying both participants.
     *            </p>
     * @see ParticipantRole
     */
    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * <p>
     * Specify the participant that you want to flag. Omitting this parameter is
     * equivalent to specifying both participants.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @param participantRole <p>
     *            Specify the participant that you want to flag. Omitting this
     *            parameter is equivalent to specifying both participants.
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
     * Specify the participant that you want to flag. Omitting this parameter is
     * equivalent to specifying both participants.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @param participantRole <p>
     *            Specify the participant that you want to flag. Omitting this
     *            parameter is equivalent to specifying both participants.
     *            </p>
     * @see ParticipantRole
     */
    public void setParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
    }

    /**
     * <p>
     * Specify the participant that you want to flag. Omitting this parameter is
     * equivalent to specifying both participants.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @param participantRole <p>
     *            Specify the participant that you want to flag. Omitting this
     *            parameter is equivalent to specifying both participants.
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
     * Set to <code>TRUE</code> to flag the absence of the phrase that you
     * specified in your request. Set to <code>FALSE</code> to flag the presence
     * of the phrase that you specified in your request.
     * </p>
     *
     * @return <p>
     *         Set to <code>TRUE</code> to flag the absence of the phrase that
     *         you specified in your request. Set to <code>FALSE</code> to flag
     *         the presence of the phrase that you specified in your request.
     *         </p>
     */
    public Boolean isNegate() {
        return negate;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to flag the absence of the phrase that you
     * specified in your request. Set to <code>FALSE</code> to flag the presence
     * of the phrase that you specified in your request.
     * </p>
     *
     * @return <p>
     *         Set to <code>TRUE</code> to flag the absence of the phrase that
     *         you specified in your request. Set to <code>FALSE</code> to flag
     *         the presence of the phrase that you specified in your request.
     *         </p>
     */
    public Boolean getNegate() {
        return negate;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to flag the absence of the phrase that you
     * specified in your request. Set to <code>FALSE</code> to flag the presence
     * of the phrase that you specified in your request.
     * </p>
     *
     * @param negate <p>
     *            Set to <code>TRUE</code> to flag the absence of the phrase
     *            that you specified in your request. Set to <code>FALSE</code>
     *            to flag the presence of the phrase that you specified in your
     *            request.
     *            </p>
     */
    public void setNegate(Boolean negate) {
        this.negate = negate;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to flag the absence of the phrase that you
     * specified in your request. Set to <code>FALSE</code> to flag the presence
     * of the phrase that you specified in your request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param negate <p>
     *            Set to <code>TRUE</code> to flag the absence of the phrase
     *            that you specified in your request. Set to <code>FALSE</code>
     *            to flag the presence of the phrase that you specified in your
     *            request.
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
     * Specify the phrases that you want to flag.
     * </p>
     *
     * @return <p>
     *         Specify the phrases that you want to flag.
     *         </p>
     */
    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * Specify the phrases that you want to flag.
     * </p>
     *
     * @param targets <p>
     *            Specify the phrases that you want to flag.
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
     * Specify the phrases that you want to flag.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            Specify the phrases that you want to flag.
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
     * Specify the phrases that you want to flag.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            Specify the phrases that you want to flag.
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
