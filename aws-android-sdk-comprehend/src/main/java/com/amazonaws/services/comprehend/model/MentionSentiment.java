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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the sentiment and sentiment score for one mention of an entity.
 * </p>
 * <p>
 * For more information about targeted sentiment, see <a href=
 * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html"
 * >Targeted sentiment</a>.
 * </p>
 */
public class MentionSentiment implements Serializable {
    /**
     * <p>
     * The sentiment of the mention.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL, MIXED
     */
    private String sentiment;

    /**
     * <p>
     * Describes the level of confidence that Amazon Comprehend has in the
     * accuracy of its detection of sentiments.
     * </p>
     */
    private SentimentScore sentimentScore;

    /**
     * <p>
     * The sentiment of the mention.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL, MIXED
     *
     * @return <p>
     *         The sentiment of the mention.
     *         </p>
     * @see SentimentType
     */
    public String getSentiment() {
        return sentiment;
    }

    /**
     * <p>
     * The sentiment of the mention.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL, MIXED
     *
     * @param sentiment <p>
     *            The sentiment of the mention.
     *            </p>
     * @see SentimentType
     */
    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    /**
     * <p>
     * The sentiment of the mention.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL, MIXED
     *
     * @param sentiment <p>
     *            The sentiment of the mention.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SentimentType
     */
    public MentionSentiment withSentiment(String sentiment) {
        this.sentiment = sentiment;
        return this;
    }

    /**
     * <p>
     * The sentiment of the mention.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL, MIXED
     *
     * @param sentiment <p>
     *            The sentiment of the mention.
     *            </p>
     * @see SentimentType
     */
    public void setSentiment(SentimentType sentiment) {
        this.sentiment = sentiment.toString();
    }

    /**
     * <p>
     * The sentiment of the mention.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL, MIXED
     *
     * @param sentiment <p>
     *            The sentiment of the mention.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SentimentType
     */
    public MentionSentiment withSentiment(SentimentType sentiment) {
        this.sentiment = sentiment.toString();
        return this;
    }

    /**
     * <p>
     * Describes the level of confidence that Amazon Comprehend has in the
     * accuracy of its detection of sentiments.
     * </p>
     *
     * @return <p>
     *         Describes the level of confidence that Amazon Comprehend has in
     *         the accuracy of its detection of sentiments.
     *         </p>
     */
    public SentimentScore getSentimentScore() {
        return sentimentScore;
    }

    /**
     * <p>
     * Describes the level of confidence that Amazon Comprehend has in the
     * accuracy of its detection of sentiments.
     * </p>
     *
     * @param sentimentScore <p>
     *            Describes the level of confidence that Amazon Comprehend has
     *            in the accuracy of its detection of sentiments.
     *            </p>
     */
    public void setSentimentScore(SentimentScore sentimentScore) {
        this.sentimentScore = sentimentScore;
    }

    /**
     * <p>
     * Describes the level of confidence that Amazon Comprehend has in the
     * accuracy of its detection of sentiments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sentimentScore <p>
     *            Describes the level of confidence that Amazon Comprehend has
     *            in the accuracy of its detection of sentiments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MentionSentiment withSentimentScore(SentimentScore sentimentScore) {
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

        if (obj instanceof MentionSentiment == false)
            return false;
        MentionSentiment other = (MentionSentiment) obj;

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
