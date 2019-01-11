/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

public class DetectSentimentResult implements Serializable {
    /**
     * <p>
     * The inferred sentiment that Amazon Comprehend has the highest level of
     * confidence in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL, MIXED
     */
    private String sentiment;

    /**
     * <p>
     * An object that lists the sentiments, and their corresponding confidence
     * levels.
     * </p>
     */
    private SentimentScore sentimentScore;

    /**
     * <p>
     * The inferred sentiment that Amazon Comprehend has the highest level of
     * confidence in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL, MIXED
     *
     * @return <p>
     *         The inferred sentiment that Amazon Comprehend has the highest
     *         level of confidence in.
     *         </p>
     * @see SentimentType
     */
    public String getSentiment() {
        return sentiment;
    }

    /**
     * <p>
     * The inferred sentiment that Amazon Comprehend has the highest level of
     * confidence in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL, MIXED
     *
     * @param sentiment <p>
     *            The inferred sentiment that Amazon Comprehend has the highest
     *            level of confidence in.
     *            </p>
     * @see SentimentType
     */
    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    /**
     * <p>
     * The inferred sentiment that Amazon Comprehend has the highest level of
     * confidence in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL, MIXED
     *
     * @param sentiment <p>
     *            The inferred sentiment that Amazon Comprehend has the highest
     *            level of confidence in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SentimentType
     */
    public DetectSentimentResult withSentiment(String sentiment) {
        this.sentiment = sentiment;
        return this;
    }

    /**
     * <p>
     * The inferred sentiment that Amazon Comprehend has the highest level of
     * confidence in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL, MIXED
     *
     * @param sentiment <p>
     *            The inferred sentiment that Amazon Comprehend has the highest
     *            level of confidence in.
     *            </p>
     * @see SentimentType
     */
    public void setSentiment(SentimentType sentiment) {
        this.sentiment = sentiment.toString();
    }

    /**
     * <p>
     * The inferred sentiment that Amazon Comprehend has the highest level of
     * confidence in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL, MIXED
     *
     * @param sentiment <p>
     *            The inferred sentiment that Amazon Comprehend has the highest
     *            level of confidence in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SentimentType
     */
    public DetectSentimentResult withSentiment(SentimentType sentiment) {
        this.sentiment = sentiment.toString();
        return this;
    }

    /**
     * <p>
     * An object that lists the sentiments, and their corresponding confidence
     * levels.
     * </p>
     *
     * @return <p>
     *         An object that lists the sentiments, and their corresponding
     *         confidence levels.
     *         </p>
     */
    public SentimentScore getSentimentScore() {
        return sentimentScore;
    }

    /**
     * <p>
     * An object that lists the sentiments, and their corresponding confidence
     * levels.
     * </p>
     *
     * @param sentimentScore <p>
     *            An object that lists the sentiments, and their corresponding
     *            confidence levels.
     *            </p>
     */
    public void setSentimentScore(SentimentScore sentimentScore) {
        this.sentimentScore = sentimentScore;
    }

    /**
     * <p>
     * An object that lists the sentiments, and their corresponding confidence
     * levels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sentimentScore <p>
     *            An object that lists the sentiments, and their corresponding
     *            confidence levels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectSentimentResult withSentimentScore(SentimentScore sentimentScore) {
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
        if (getSentiment() != null)
            sb.append("Sentiment: " + getSentiment() + ",");
        if (getSentimentScore() != null)
            sb.append("SentimentScore: " + getSentimentScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSentiment() == null) ? 0 : getSentiment().hashCode());
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

        if (obj instanceof DetectSentimentResult == false)
            return false;
        DetectSentimentResult other = (DetectSentimentResult) obj;

        if (other.getSentiment() == null ^ this.getSentiment() == null)
            return false;
        if (other.getSentiment() != null
                && other.getSentiment().equals(this.getSentiment()) == false)
            return false;
        if (other.getSentimentScore() == null ^ this.getSentimentScore() == null)
            return false;
        if (other.getSentimentScore() != null
                && other.getSentimentScore().equals(this.getSentimentScore()) == false)
            return false;
        return true;
    }
}
