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

package com.amazonaws.services.lexrts.model;

import java.io.Serializable;

/**
 * <p>
 * The sentiment expressed in an utterance.
 * </p>
 * <p>
 * When the bot is configured to send utterances to Amazon Comprehend for
 * sentiment analysis, this field structure contains the result of the analysis.
 * </p>
 */
public class SentimentResponse implements Serializable {
    /**
     * <p>
     * The inferred sentiment that Amazon Comprehend has the highest confidence
     * in.
     * </p>
     */
    private String sentimentLabel;

    /**
     * <p>
     * The likelihood that the sentiment was correctly inferred.
     * </p>
     */
    private String sentimentScore;

    /**
     * <p>
     * The inferred sentiment that Amazon Comprehend has the highest confidence
     * in.
     * </p>
     *
     * @return <p>
     *         The inferred sentiment that Amazon Comprehend has the highest
     *         confidence in.
     *         </p>
     */
    public String getSentimentLabel() {
        return sentimentLabel;
    }

    /**
     * <p>
     * The inferred sentiment that Amazon Comprehend has the highest confidence
     * in.
     * </p>
     *
     * @param sentimentLabel <p>
     *            The inferred sentiment that Amazon Comprehend has the highest
     *            confidence in.
     *            </p>
     */
    public void setSentimentLabel(String sentimentLabel) {
        this.sentimentLabel = sentimentLabel;
    }

    /**
     * <p>
     * The inferred sentiment that Amazon Comprehend has the highest confidence
     * in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sentimentLabel <p>
     *            The inferred sentiment that Amazon Comprehend has the highest
     *            confidence in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SentimentResponse withSentimentLabel(String sentimentLabel) {
        this.sentimentLabel = sentimentLabel;
        return this;
    }

    /**
     * <p>
     * The likelihood that the sentiment was correctly inferred.
     * </p>
     *
     * @return <p>
     *         The likelihood that the sentiment was correctly inferred.
     *         </p>
     */
    public String getSentimentScore() {
        return sentimentScore;
    }

    /**
     * <p>
     * The likelihood that the sentiment was correctly inferred.
     * </p>
     *
     * @param sentimentScore <p>
     *            The likelihood that the sentiment was correctly inferred.
     *            </p>
     */
    public void setSentimentScore(String sentimentScore) {
        this.sentimentScore = sentimentScore;
    }

    /**
     * <p>
     * The likelihood that the sentiment was correctly inferred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sentimentScore <p>
     *            The likelihood that the sentiment was correctly inferred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SentimentResponse withSentimentScore(String sentimentScore) {
        this.sentimentScore = sentimentScore;
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
        if (getSentimentLabel() != null)
            sb.append("sentimentLabel: " + getSentimentLabel() + ",");
        if (getSentimentScore() != null)
            sb.append("sentimentScore: " + getSentimentScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSentimentLabel() == null) ? 0 : getSentimentLabel().hashCode());
        hashCode = prime * hashCode
                + ((getSentimentScore() == null) ? 0 : getSentimentScore().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SentimentResponse == false)
            return false;
        SentimentResponse other = (SentimentResponse) obj;

        if (other.getSentimentLabel() == null ^ this.getSentimentLabel() == null)
            return false;
        if (other.getSentimentLabel() != null
                && other.getSentimentLabel().equals(this.getSentimentLabel()) == false)
            return false;
        if (other.getSentimentScore() == null ^ this.getSentimentScore() == null)
            return false;
        if (other.getSentimentScore() != null
                && other.getSentimentScore().equals(this.getSentimentScore()) == false)
            return false;
        return true;
    }
}
