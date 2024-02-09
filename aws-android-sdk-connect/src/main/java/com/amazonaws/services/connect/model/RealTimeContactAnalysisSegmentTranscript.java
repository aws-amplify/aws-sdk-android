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
 * The analyzed transcript segment.
 * </p>
 */
public class RealTimeContactAnalysisSegmentTranscript implements Serializable {
    /**
     * <p>
     * The identifier of the transcript.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String id;

    /**
     * <p>
     * The identifier of the participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String participantId;

    /**
     * <p>
     * The role of the participant. For example, is it a customer, agent, or
     * system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT, SUPERVISOR
     */
    private String participantRole;

    /**
     * <p>
     * The display name of the participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String displayName;

    /**
     * <p>
     * The content of the transcript. Can be redacted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     */
    private String content;

    /**
     * <p>
     * The type of content of the item. For example, <code>text/plain</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String contentType;

    /**
     * <p>
     * Field describing the time of the event. It can have different
     * representations of time.
     * </p>
     */
    private RealTimeContactAnalysisTimeData time;

    /**
     * <p>
     * Object describing redaction that was applied to the transcript. If
     * transcript has the field it means part of the transcript was redacted.
     * </p>
     */
    private RealTimeContactAnalysisTranscriptItemRedaction redaction;

    /**
     * <p>
     * The sentiment detected for this piece of transcript.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL
     */
    private String sentiment;

    /**
     * <p>
     * The identifier of the transcript.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the transcript.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the transcript.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param id <p>
     *            The identifier of the transcript.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the transcript.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param id <p>
     *            The identifier of the transcript.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisSegmentTranscript withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The identifier of the participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the participant.
     *         </p>
     */
    public String getParticipantId() {
        return participantId;
    }

    /**
     * <p>
     * The identifier of the participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param participantId <p>
     *            The identifier of the participant.
     *            </p>
     */
    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    /**
     * <p>
     * The identifier of the participant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param participantId <p>
     *            The identifier of the participant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisSegmentTranscript withParticipantId(String participantId) {
        this.participantId = participantId;
        return this;
    }

    /**
     * <p>
     * The role of the participant. For example, is it a customer, agent, or
     * system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT, SUPERVISOR
     *
     * @return <p>
     *         The role of the participant. For example, is it a customer,
     *         agent, or system.
     *         </p>
     * @see ParticipantRole
     */
    public String getParticipantRole() {
        return participantRole;
    }

    /**
     * <p>
     * The role of the participant. For example, is it a customer, agent, or
     * system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT, SUPERVISOR
     *
     * @param participantRole <p>
     *            The role of the participant. For example, is it a customer,
     *            agent, or system.
     *            </p>
     * @see ParticipantRole
     */
    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * <p>
     * The role of the participant. For example, is it a customer, agent, or
     * system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT, SUPERVISOR
     *
     * @param participantRole <p>
     *            The role of the participant. For example, is it a customer,
     *            agent, or system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParticipantRole
     */
    public RealTimeContactAnalysisSegmentTranscript withParticipantRole(String participantRole) {
        this.participantRole = participantRole;
        return this;
    }

    /**
     * <p>
     * The role of the participant. For example, is it a customer, agent, or
     * system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT, SUPERVISOR
     *
     * @param participantRole <p>
     *            The role of the participant. For example, is it a customer,
     *            agent, or system.
     *            </p>
     * @see ParticipantRole
     */
    public void setParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
    }

    /**
     * <p>
     * The role of the participant. For example, is it a customer, agent, or
     * system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT, SUPERVISOR
     *
     * @param participantRole <p>
     *            The role of the participant. For example, is it a customer,
     *            agent, or system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParticipantRole
     */
    public RealTimeContactAnalysisSegmentTranscript withParticipantRole(
            ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
        return this;
    }

    /**
     * <p>
     * The display name of the participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The display name of the participant.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The display name of the participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param displayName <p>
     *            The display name of the participant.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the participant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param displayName <p>
     *            The display name of the participant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisSegmentTranscript withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The content of the transcript. Can be redacted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @return <p>
     *         The content of the transcript. Can be redacted.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * The content of the transcript. Can be redacted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @param content <p>
     *            The content of the transcript. Can be redacted.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the transcript. Can be redacted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @param content <p>
     *            The content of the transcript. Can be redacted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisSegmentTranscript withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * The type of content of the item. For example, <code>text/plain</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The type of content of the item. For example,
     *         <code>text/plain</code>.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * The type of content of the item. For example, <code>text/plain</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contentType <p>
     *            The type of content of the item. For example,
     *            <code>text/plain</code>.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The type of content of the item. For example, <code>text/plain</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contentType <p>
     *            The type of content of the item. For example,
     *            <code>text/plain</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisSegmentTranscript withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * Field describing the time of the event. It can have different
     * representations of time.
     * </p>
     *
     * @return <p>
     *         Field describing the time of the event. It can have different
     *         representations of time.
     *         </p>
     */
    public RealTimeContactAnalysisTimeData getTime() {
        return time;
    }

    /**
     * <p>
     * Field describing the time of the event. It can have different
     * representations of time.
     * </p>
     *
     * @param time <p>
     *            Field describing the time of the event. It can have different
     *            representations of time.
     *            </p>
     */
    public void setTime(RealTimeContactAnalysisTimeData time) {
        this.time = time;
    }

    /**
     * <p>
     * Field describing the time of the event. It can have different
     * representations of time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param time <p>
     *            Field describing the time of the event. It can have different
     *            representations of time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisSegmentTranscript withTime(RealTimeContactAnalysisTimeData time) {
        this.time = time;
        return this;
    }

    /**
     * <p>
     * Object describing redaction that was applied to the transcript. If
     * transcript has the field it means part of the transcript was redacted.
     * </p>
     *
     * @return <p>
     *         Object describing redaction that was applied to the transcript.
     *         If transcript has the field it means part of the transcript was
     *         redacted.
     *         </p>
     */
    public RealTimeContactAnalysisTranscriptItemRedaction getRedaction() {
        return redaction;
    }

    /**
     * <p>
     * Object describing redaction that was applied to the transcript. If
     * transcript has the field it means part of the transcript was redacted.
     * </p>
     *
     * @param redaction <p>
     *            Object describing redaction that was applied to the
     *            transcript. If transcript has the field it means part of the
     *            transcript was redacted.
     *            </p>
     */
    public void setRedaction(RealTimeContactAnalysisTranscriptItemRedaction redaction) {
        this.redaction = redaction;
    }

    /**
     * <p>
     * Object describing redaction that was applied to the transcript. If
     * transcript has the field it means part of the transcript was redacted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param redaction <p>
     *            Object describing redaction that was applied to the
     *            transcript. If transcript has the field it means part of the
     *            transcript was redacted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisSegmentTranscript withRedaction(
            RealTimeContactAnalysisTranscriptItemRedaction redaction) {
        this.redaction = redaction;
        return this;
    }

    /**
     * <p>
     * The sentiment detected for this piece of transcript.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL
     *
     * @return <p>
     *         The sentiment detected for this piece of transcript.
     *         </p>
     * @see RealTimeContactAnalysisSentimentLabel
     */
    public String getSentiment() {
        return sentiment;
    }

    /**
     * <p>
     * The sentiment detected for this piece of transcript.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL
     *
     * @param sentiment <p>
     *            The sentiment detected for this piece of transcript.
     *            </p>
     * @see RealTimeContactAnalysisSentimentLabel
     */
    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    /**
     * <p>
     * The sentiment detected for this piece of transcript.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL
     *
     * @param sentiment <p>
     *            The sentiment detected for this piece of transcript.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RealTimeContactAnalysisSentimentLabel
     */
    public RealTimeContactAnalysisSegmentTranscript withSentiment(String sentiment) {
        this.sentiment = sentiment;
        return this;
    }

    /**
     * <p>
     * The sentiment detected for this piece of transcript.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL
     *
     * @param sentiment <p>
     *            The sentiment detected for this piece of transcript.
     *            </p>
     * @see RealTimeContactAnalysisSentimentLabel
     */
    public void setSentiment(RealTimeContactAnalysisSentimentLabel sentiment) {
        this.sentiment = sentiment.toString();
    }

    /**
     * <p>
     * The sentiment detected for this piece of transcript.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL
     *
     * @param sentiment <p>
     *            The sentiment detected for this piece of transcript.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RealTimeContactAnalysisSentimentLabel
     */
    public RealTimeContactAnalysisSegmentTranscript withSentiment(
            RealTimeContactAnalysisSentimentLabel sentiment) {
        this.sentiment = sentiment.toString();
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getParticipantId() != null)
            sb.append("ParticipantId: " + getParticipantId() + ",");
        if (getParticipantRole() != null)
            sb.append("ParticipantRole: " + getParticipantRole() + ",");
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType() + ",");
        if (getTime() != null)
            sb.append("Time: " + getTime() + ",");
        if (getRedaction() != null)
            sb.append("Redaction: " + getRedaction() + ",");
        if (getSentiment() != null)
            sb.append("Sentiment: " + getSentiment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getParticipantId() == null) ? 0 : getParticipantId().hashCode());
        hashCode = prime * hashCode
                + ((getParticipantRole() == null) ? 0 : getParticipantRole().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        hashCode = prime * hashCode + ((getRedaction() == null) ? 0 : getRedaction().hashCode());
        hashCode = prime * hashCode + ((getSentiment() == null) ? 0 : getSentiment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealTimeContactAnalysisSegmentTranscript == false)
            return false;
        RealTimeContactAnalysisSegmentTranscript other = (RealTimeContactAnalysisSegmentTranscript) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getParticipantId() == null ^ this.getParticipantId() == null)
            return false;
        if (other.getParticipantId() != null
                && other.getParticipantId().equals(this.getParticipantId()) == false)
            return false;
        if (other.getParticipantRole() == null ^ this.getParticipantRole() == null)
            return false;
        if (other.getParticipantRole() != null
                && other.getParticipantRole().equals(this.getParticipantRole()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        if (other.getRedaction() == null ^ this.getRedaction() == null)
            return false;
        if (other.getRedaction() != null
                && other.getRedaction().equals(this.getRedaction()) == false)
            return false;
        if (other.getSentiment() == null ^ this.getSentiment() == null)
            return false;
        if (other.getSentiment() != null
                && other.getSentiment().equals(this.getSentiment()) == false)
            return false;
        return true;
    }
}
