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
 * An analyzed segment for a real-time analysis session.
 * </p>
 */
public class RealtimeContactAnalysisSegment implements Serializable {
    /**
     * <p>
     * The analyzed transcript segment.
     * </p>
     */
    private RealTimeContactAnalysisSegmentTranscript transcript;

    /**
     * <p>
     * The matched category rules.
     * </p>
     */
    private RealTimeContactAnalysisSegmentCategories categories;

    /**
     * <p>
     * Segment type containing a list of detected issues.
     * </p>
     */
    private RealTimeContactAnalysisSegmentIssues issues;

    /**
     * <p>
     * Segment type describing a contact event.
     * </p>
     */
    private RealTimeContactAnalysisSegmentEvent event;

    /**
     * <p>
     * The analyzed attachments.
     * </p>
     */
    private RealTimeContactAnalysisSegmentAttachments attachments;

    /**
     * <p>
     * The analyzed transcript segment.
     * </p>
     *
     * @return <p>
     *         The analyzed transcript segment.
     *         </p>
     */
    public RealTimeContactAnalysisSegmentTranscript getTranscript() {
        return transcript;
    }

    /**
     * <p>
     * The analyzed transcript segment.
     * </p>
     *
     * @param transcript <p>
     *            The analyzed transcript segment.
     *            </p>
     */
    public void setTranscript(RealTimeContactAnalysisSegmentTranscript transcript) {
        this.transcript = transcript;
    }

    /**
     * <p>
     * The analyzed transcript segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transcript <p>
     *            The analyzed transcript segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealtimeContactAnalysisSegment withTranscript(
            RealTimeContactAnalysisSegmentTranscript transcript) {
        this.transcript = transcript;
        return this;
    }

    /**
     * <p>
     * The matched category rules.
     * </p>
     *
     * @return <p>
     *         The matched category rules.
     *         </p>
     */
    public RealTimeContactAnalysisSegmentCategories getCategories() {
        return categories;
    }

    /**
     * <p>
     * The matched category rules.
     * </p>
     *
     * @param categories <p>
     *            The matched category rules.
     *            </p>
     */
    public void setCategories(RealTimeContactAnalysisSegmentCategories categories) {
        this.categories = categories;
    }

    /**
     * <p>
     * The matched category rules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param categories <p>
     *            The matched category rules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealtimeContactAnalysisSegment withCategories(
            RealTimeContactAnalysisSegmentCategories categories) {
        this.categories = categories;
        return this;
    }

    /**
     * <p>
     * Segment type containing a list of detected issues.
     * </p>
     *
     * @return <p>
     *         Segment type containing a list of detected issues.
     *         </p>
     */
    public RealTimeContactAnalysisSegmentIssues getIssues() {
        return issues;
    }

    /**
     * <p>
     * Segment type containing a list of detected issues.
     * </p>
     *
     * @param issues <p>
     *            Segment type containing a list of detected issues.
     *            </p>
     */
    public void setIssues(RealTimeContactAnalysisSegmentIssues issues) {
        this.issues = issues;
    }

    /**
     * <p>
     * Segment type containing a list of detected issues.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param issues <p>
     *            Segment type containing a list of detected issues.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealtimeContactAnalysisSegment withIssues(RealTimeContactAnalysisSegmentIssues issues) {
        this.issues = issues;
        return this;
    }

    /**
     * <p>
     * Segment type describing a contact event.
     * </p>
     *
     * @return <p>
     *         Segment type describing a contact event.
     *         </p>
     */
    public RealTimeContactAnalysisSegmentEvent getEvent() {
        return event;
    }

    /**
     * <p>
     * Segment type describing a contact event.
     * </p>
     *
     * @param event <p>
     *            Segment type describing a contact event.
     *            </p>
     */
    public void setEvent(RealTimeContactAnalysisSegmentEvent event) {
        this.event = event;
    }

    /**
     * <p>
     * Segment type describing a contact event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param event <p>
     *            Segment type describing a contact event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealtimeContactAnalysisSegment withEvent(RealTimeContactAnalysisSegmentEvent event) {
        this.event = event;
        return this;
    }

    /**
     * <p>
     * The analyzed attachments.
     * </p>
     *
     * @return <p>
     *         The analyzed attachments.
     *         </p>
     */
    public RealTimeContactAnalysisSegmentAttachments getAttachments() {
        return attachments;
    }

    /**
     * <p>
     * The analyzed attachments.
     * </p>
     *
     * @param attachments <p>
     *            The analyzed attachments.
     *            </p>
     */
    public void setAttachments(RealTimeContactAnalysisSegmentAttachments attachments) {
        this.attachments = attachments;
    }

    /**
     * <p>
     * The analyzed attachments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            The analyzed attachments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealtimeContactAnalysisSegment withAttachments(
            RealTimeContactAnalysisSegmentAttachments attachments) {
        this.attachments = attachments;
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
        if (getTranscript() != null)
            sb.append("Transcript: " + getTranscript() + ",");
        if (getCategories() != null)
            sb.append("Categories: " + getCategories() + ",");
        if (getIssues() != null)
            sb.append("Issues: " + getIssues() + ",");
        if (getEvent() != null)
            sb.append("Event: " + getEvent() + ",");
        if (getAttachments() != null)
            sb.append("Attachments: " + getAttachments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTranscript() == null) ? 0 : getTranscript().hashCode());
        hashCode = prime * hashCode + ((getCategories() == null) ? 0 : getCategories().hashCode());
        hashCode = prime * hashCode + ((getIssues() == null) ? 0 : getIssues().hashCode());
        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode
                + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealtimeContactAnalysisSegment == false)
            return false;
        RealtimeContactAnalysisSegment other = (RealtimeContactAnalysisSegment) obj;

        if (other.getTranscript() == null ^ this.getTranscript() == null)
            return false;
        if (other.getTranscript() != null
                && other.getTranscript().equals(this.getTranscript()) == false)
            return false;
        if (other.getCategories() == null ^ this.getCategories() == null)
            return false;
        if (other.getCategories() != null
                && other.getCategories().equals(this.getCategories()) == false)
            return false;
        if (other.getIssues() == null ^ this.getIssues() == null)
            return false;
        if (other.getIssues() != null && other.getIssues().equals(this.getIssues()) == false)
            return false;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null
                && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        return true;
    }
}
