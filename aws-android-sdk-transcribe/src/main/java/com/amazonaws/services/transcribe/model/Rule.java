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
 * A rule is a set of criteria that you can specify to flag an attribute in your
 * Call Analytics output. Rules define a Call Analytics category.
 * </p>
 * <p>
 * Rules can include these parameters: , , , and .
 * </p>
 * <p>
 * To learn more about Call Analytics rules and categories, see <a href=
 * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-batch.html"
 * >Creating categories for post-call transcriptions</a> and <a href=
 * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-stream.html"
 * >Creating categories for real-time transcriptions</a>.
 * </p>
 * <p>
 * To learn more about Call Analytics, see <a
 * href="https://docs.aws.amazon.com/transcribe/latest/dg/call-analytics.html"
 * >Analyzing call center audio with Call Analytics</a>.
 * </p>
 */
public class Rule implements Serializable {
    /**
     * <p>
     * Flag the presence or absence of periods of silence in your Call Analytics
     * transcription output. Refer to for more detail.
     * </p>
     */
    private NonTalkTimeFilter nonTalkTimeFilter;

    /**
     * <p>
     * Flag the presence or absence of interruptions in your Call Analytics
     * transcription output. Refer to for more detail.
     * </p>
     */
    private InterruptionFilter interruptionFilter;

    /**
     * <p>
     * Flag the presence or absence of specific words or phrases in your Call
     * Analytics transcription output. Refer to for more detail.
     * </p>
     */
    private TranscriptFilter transcriptFilter;

    /**
     * <p>
     * Flag the presence or absence of specific sentiments in your Call
     * Analytics transcription output. Refer to for more detail.
     * </p>
     */
    private SentimentFilter sentimentFilter;

    /**
     * <p>
     * Flag the presence or absence of periods of silence in your Call Analytics
     * transcription output. Refer to for more detail.
     * </p>
     *
     * @return <p>
     *         Flag the presence or absence of periods of silence in your Call
     *         Analytics transcription output. Refer to for more detail.
     *         </p>
     */
    public NonTalkTimeFilter getNonTalkTimeFilter() {
        return nonTalkTimeFilter;
    }

    /**
     * <p>
     * Flag the presence or absence of periods of silence in your Call Analytics
     * transcription output. Refer to for more detail.
     * </p>
     *
     * @param nonTalkTimeFilter <p>
     *            Flag the presence or absence of periods of silence in your
     *            Call Analytics transcription output. Refer to for more detail.
     *            </p>
     */
    public void setNonTalkTimeFilter(NonTalkTimeFilter nonTalkTimeFilter) {
        this.nonTalkTimeFilter = nonTalkTimeFilter;
    }

    /**
     * <p>
     * Flag the presence or absence of periods of silence in your Call Analytics
     * transcription output. Refer to for more detail.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nonTalkTimeFilter <p>
     *            Flag the presence or absence of periods of silence in your
     *            Call Analytics transcription output. Refer to for more detail.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withNonTalkTimeFilter(NonTalkTimeFilter nonTalkTimeFilter) {
        this.nonTalkTimeFilter = nonTalkTimeFilter;
        return this;
    }

    /**
     * <p>
     * Flag the presence or absence of interruptions in your Call Analytics
     * transcription output. Refer to for more detail.
     * </p>
     *
     * @return <p>
     *         Flag the presence or absence of interruptions in your Call
     *         Analytics transcription output. Refer to for more detail.
     *         </p>
     */
    public InterruptionFilter getInterruptionFilter() {
        return interruptionFilter;
    }

    /**
     * <p>
     * Flag the presence or absence of interruptions in your Call Analytics
     * transcription output. Refer to for more detail.
     * </p>
     *
     * @param interruptionFilter <p>
     *            Flag the presence or absence of interruptions in your Call
     *            Analytics transcription output. Refer to for more detail.
     *            </p>
     */
    public void setInterruptionFilter(InterruptionFilter interruptionFilter) {
        this.interruptionFilter = interruptionFilter;
    }

    /**
     * <p>
     * Flag the presence or absence of interruptions in your Call Analytics
     * transcription output. Refer to for more detail.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param interruptionFilter <p>
     *            Flag the presence or absence of interruptions in your Call
     *            Analytics transcription output. Refer to for more detail.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withInterruptionFilter(InterruptionFilter interruptionFilter) {
        this.interruptionFilter = interruptionFilter;
        return this;
    }

    /**
     * <p>
     * Flag the presence or absence of specific words or phrases in your Call
     * Analytics transcription output. Refer to for more detail.
     * </p>
     *
     * @return <p>
     *         Flag the presence or absence of specific words or phrases in your
     *         Call Analytics transcription output. Refer to for more detail.
     *         </p>
     */
    public TranscriptFilter getTranscriptFilter() {
        return transcriptFilter;
    }

    /**
     * <p>
     * Flag the presence or absence of specific words or phrases in your Call
     * Analytics transcription output. Refer to for more detail.
     * </p>
     *
     * @param transcriptFilter <p>
     *            Flag the presence or absence of specific words or phrases in
     *            your Call Analytics transcription output. Refer to for more
     *            detail.
     *            </p>
     */
    public void setTranscriptFilter(TranscriptFilter transcriptFilter) {
        this.transcriptFilter = transcriptFilter;
    }

    /**
     * <p>
     * Flag the presence or absence of specific words or phrases in your Call
     * Analytics transcription output. Refer to for more detail.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transcriptFilter <p>
     *            Flag the presence or absence of specific words or phrases in
     *            your Call Analytics transcription output. Refer to for more
     *            detail.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withTranscriptFilter(TranscriptFilter transcriptFilter) {
        this.transcriptFilter = transcriptFilter;
        return this;
    }

    /**
     * <p>
     * Flag the presence or absence of specific sentiments in your Call
     * Analytics transcription output. Refer to for more detail.
     * </p>
     *
     * @return <p>
     *         Flag the presence or absence of specific sentiments in your Call
     *         Analytics transcription output. Refer to for more detail.
     *         </p>
     */
    public SentimentFilter getSentimentFilter() {
        return sentimentFilter;
    }

    /**
     * <p>
     * Flag the presence or absence of specific sentiments in your Call
     * Analytics transcription output. Refer to for more detail.
     * </p>
     *
     * @param sentimentFilter <p>
     *            Flag the presence or absence of specific sentiments in your
     *            Call Analytics transcription output. Refer to for more detail.
     *            </p>
     */
    public void setSentimentFilter(SentimentFilter sentimentFilter) {
        this.sentimentFilter = sentimentFilter;
    }

    /**
     * <p>
     * Flag the presence or absence of specific sentiments in your Call
     * Analytics transcription output. Refer to for more detail.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sentimentFilter <p>
     *            Flag the presence or absence of specific sentiments in your
     *            Call Analytics transcription output. Refer to for more detail.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withSentimentFilter(SentimentFilter sentimentFilter) {
        this.sentimentFilter = sentimentFilter;
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
        if (getNonTalkTimeFilter() != null)
            sb.append("NonTalkTimeFilter: " + getNonTalkTimeFilter() + ",");
        if (getInterruptionFilter() != null)
            sb.append("InterruptionFilter: " + getInterruptionFilter() + ",");
        if (getTranscriptFilter() != null)
            sb.append("TranscriptFilter: " + getTranscriptFilter() + ",");
        if (getSentimentFilter() != null)
            sb.append("SentimentFilter: " + getSentimentFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNonTalkTimeFilter() == null) ? 0 : getNonTalkTimeFilter().hashCode());
        hashCode = prime * hashCode
                + ((getInterruptionFilter() == null) ? 0 : getInterruptionFilter().hashCode());
        hashCode = prime * hashCode
                + ((getTranscriptFilter() == null) ? 0 : getTranscriptFilter().hashCode());
        hashCode = prime * hashCode
                + ((getSentimentFilter() == null) ? 0 : getSentimentFilter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Rule == false)
            return false;
        Rule other = (Rule) obj;

        if (other.getNonTalkTimeFilter() == null ^ this.getNonTalkTimeFilter() == null)
            return false;
        if (other.getNonTalkTimeFilter() != null
                && other.getNonTalkTimeFilter().equals(this.getNonTalkTimeFilter()) == false)
            return false;
        if (other.getInterruptionFilter() == null ^ this.getInterruptionFilter() == null)
            return false;
        if (other.getInterruptionFilter() != null
                && other.getInterruptionFilter().equals(this.getInterruptionFilter()) == false)
            return false;
        if (other.getTranscriptFilter() == null ^ this.getTranscriptFilter() == null)
            return false;
        if (other.getTranscriptFilter() != null
                && other.getTranscriptFilter().equals(this.getTranscriptFilter()) == false)
            return false;
        if (other.getSentimentFilter() == null ^ this.getSentimentFilter() == null)
            return false;
        if (other.getSentimentFilter() != null
                && other.getSentimentFilter().equals(this.getSentimentFilter()) == false)
            return false;
        return true;
    }
}
