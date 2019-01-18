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

/**
 * <p>
 * The result of calling the operation. The operation returns one object for
 * each document that is successfully processed by the operation.
 * </p>
 */
public class BatchDetectSentimentItemResult implements Serializable {
    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     */
    private Integer index;

    /**
     * <p>
     * The sentiment detected in the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL, MIXED
     */
    private String sentiment;

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its
     * sentiment detection.
     * </p>
     */
    private SentimentScore sentimentScore;

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     *
     * @return <p>
     *         The zero-based index of the document in the input list.
     *         </p>
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     *
     * @param index <p>
     *            The zero-based index of the document in the input list.
     *            </p>
     */
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param index <p>
     *            The zero-based index of the document in the input list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectSentimentItemResult withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * <p>
     * The sentiment detected in the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL, MIXED
     *
     * @return <p>
     *         The sentiment detected in the document.
     *         </p>
     * @see SentimentType
     */
    public String getSentiment() {
        return sentiment;
    }

    /**
     * <p>
     * The sentiment detected in the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL, MIXED
     *
     * @param sentiment <p>
     *            The sentiment detected in the document.
     *            </p>
     * @see SentimentType
     */
    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    /**
     * <p>
     * The sentiment detected in the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL, MIXED
     *
     * @param sentiment <p>
     *            The sentiment detected in the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SentimentType
     */
    public BatchDetectSentimentItemResult withSentiment(String sentiment) {
        this.sentiment = sentiment;
        return this;
    }

    /**
     * <p>
     * The sentiment detected in the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL, MIXED
     *
     * @param sentiment <p>
     *            The sentiment detected in the document.
     *            </p>
     * @see SentimentType
     */
    public void setSentiment(SentimentType sentiment) {
        this.sentiment = sentiment.toString();
    }

    /**
     * <p>
     * The sentiment detected in the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>POSITIVE, NEGATIVE, NEUTRAL, MIXED
     *
     * @param sentiment <p>
     *            The sentiment detected in the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SentimentType
     */
    public BatchDetectSentimentItemResult withSentiment(SentimentType sentiment) {
        this.sentiment = sentiment.toString();
        return this;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its
     * sentiment detection.
     * </p>
     *
     * @return <p>
     *         The level of confidence that Amazon Comprehend has in the
     *         accuracy of its sentiment detection.
     *         </p>
     */
    public SentimentScore getSentimentScore() {
        return sentimentScore;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its
     * sentiment detection.
     * </p>
     *
     * @param sentimentScore <p>
     *            The level of confidence that Amazon Comprehend has in the
     *            accuracy of its sentiment detection.
     *            </p>
     */
    public void setSentimentScore(SentimentScore sentimentScore) {
        this.sentimentScore = sentimentScore;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its
     * sentiment detection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sentimentScore <p>
     *            The level of confidence that Amazon Comprehend has in the
     *            accuracy of its sentiment detection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectSentimentItemResult withSentimentScore(SentimentScore sentimentScore) {
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
        if (getIndex() != null)
            sb.append("Index: " + getIndex() + ",");
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

        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
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

        if (obj instanceof BatchDetectSentimentItemResult == false)
            return false;
        BatchDetectSentimentItemResult other = (BatchDetectSentimentItemResult) obj;

        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
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
