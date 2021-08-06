/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A condition in the call between the customer and the agent that you want to
 * filter for.
 * </p>
 */
public class Rule implements Serializable {
    /**
     * <p>
     * A condition for a time period when neither the customer nor the agent was
     * talking.
     * </p>
     */
    private NonTalkTimeFilter nonTalkTimeFilter;

    /**
     * <p>
     * A condition for a time period when either the customer or agent was
     * interrupting the other person.
     * </p>
     */
    private InterruptionFilter interruptionFilter;

    /**
     * <p>
     * A condition that catches particular words or phrases based on a exact
     * match. For example, if you set the phrase
     * "I want to speak to the manager", only that exact phrase will be
     * returned.
     * </p>
     */
    private TranscriptFilter transcriptFilter;

    /**
     * <p>
     * A condition that is applied to a particular customer sentiment.
     * </p>
     */
    private SentimentFilter sentimentFilter;

    /**
     * <p>
     * A condition for a time period when neither the customer nor the agent was
     * talking.
     * </p>
     *
     * @return <p>
     *         A condition for a time period when neither the customer nor the
     *         agent was talking.
     *         </p>
     */
    public NonTalkTimeFilter getNonTalkTimeFilter() {
        return nonTalkTimeFilter;
    }

    /**
     * <p>
     * A condition for a time period when neither the customer nor the agent was
     * talking.
     * </p>
     *
     * @param nonTalkTimeFilter <p>
     *            A condition for a time period when neither the customer nor
     *            the agent was talking.
     *            </p>
     */
    public void setNonTalkTimeFilter(NonTalkTimeFilter nonTalkTimeFilter) {
        this.nonTalkTimeFilter = nonTalkTimeFilter;
    }

    /**
     * <p>
     * A condition for a time period when neither the customer nor the agent was
     * talking.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nonTalkTimeFilter <p>
     *            A condition for a time period when neither the customer nor
     *            the agent was talking.
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
     * A condition for a time period when either the customer or agent was
     * interrupting the other person.
     * </p>
     *
     * @return <p>
     *         A condition for a time period when either the customer or agent
     *         was interrupting the other person.
     *         </p>
     */
    public InterruptionFilter getInterruptionFilter() {
        return interruptionFilter;
    }

    /**
     * <p>
     * A condition for a time period when either the customer or agent was
     * interrupting the other person.
     * </p>
     *
     * @param interruptionFilter <p>
     *            A condition for a time period when either the customer or
     *            agent was interrupting the other person.
     *            </p>
     */
    public void setInterruptionFilter(InterruptionFilter interruptionFilter) {
        this.interruptionFilter = interruptionFilter;
    }

    /**
     * <p>
     * A condition for a time period when either the customer or agent was
     * interrupting the other person.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param interruptionFilter <p>
     *            A condition for a time period when either the customer or
     *            agent was interrupting the other person.
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
     * A condition that catches particular words or phrases based on a exact
     * match. For example, if you set the phrase
     * "I want to speak to the manager", only that exact phrase will be
     * returned.
     * </p>
     *
     * @return <p>
     *         A condition that catches particular words or phrases based on a
     *         exact match. For example, if you set the phrase
     *         "I want to speak to the manager", only that exact phrase will be
     *         returned.
     *         </p>
     */
    public TranscriptFilter getTranscriptFilter() {
        return transcriptFilter;
    }

    /**
     * <p>
     * A condition that catches particular words or phrases based on a exact
     * match. For example, if you set the phrase
     * "I want to speak to the manager", only that exact phrase will be
     * returned.
     * </p>
     *
     * @param transcriptFilter <p>
     *            A condition that catches particular words or phrases based on
     *            a exact match. For example, if you set the phrase
     *            "I want to speak to the manager", only that exact phrase will
     *            be returned.
     *            </p>
     */
    public void setTranscriptFilter(TranscriptFilter transcriptFilter) {
        this.transcriptFilter = transcriptFilter;
    }

    /**
     * <p>
     * A condition that catches particular words or phrases based on a exact
     * match. For example, if you set the phrase
     * "I want to speak to the manager", only that exact phrase will be
     * returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transcriptFilter <p>
     *            A condition that catches particular words or phrases based on
     *            a exact match. For example, if you set the phrase
     *            "I want to speak to the manager", only that exact phrase will
     *            be returned.
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
     * A condition that is applied to a particular customer sentiment.
     * </p>
     *
     * @return <p>
     *         A condition that is applied to a particular customer sentiment.
     *         </p>
     */
    public SentimentFilter getSentimentFilter() {
        return sentimentFilter;
    }

    /**
     * <p>
     * A condition that is applied to a particular customer sentiment.
     * </p>
     *
     * @param sentimentFilter <p>
     *            A condition that is applied to a particular customer
     *            sentiment.
     *            </p>
     */
    public void setSentimentFilter(SentimentFilter sentimentFilter) {
        this.sentimentFilter = sentimentFilter;
    }

    /**
     * <p>
     * A condition that is applied to a particular customer sentiment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sentimentFilter <p>
     *            A condition that is applied to a particular customer
     *            sentiment.
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
