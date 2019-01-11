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
 * Describes the level of confidence that Amazon Comprehend has in the accuracy
 * of its detection of sentiments.
 * </p>
 */
public class SentimentScore implements Serializable {
    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its
     * detection of the <code>POSITIVE</code> sentiment.
     * </p>
     */
    private Float positive;

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its
     * detection of the <code>NEGATIVE</code> sentiment.
     * </p>
     */
    private Float negative;

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its
     * detection of the <code>NEUTRAL</code> sentiment.
     * </p>
     */
    private Float neutral;

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its
     * detection of the <code>MIXED</code> sentiment.
     * </p>
     */
    private Float mixed;

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its
     * detection of the <code>POSITIVE</code> sentiment.
     * </p>
     *
     * @return <p>
     *         The level of confidence that Amazon Comprehend has in the
     *         accuracy of its detection of the <code>POSITIVE</code> sentiment.
     *         </p>
     */
    public Float getPositive() {
        return positive;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its
     * detection of the <code>POSITIVE</code> sentiment.
     * </p>
     *
     * @param positive <p>
     *            The level of confidence that Amazon Comprehend has in the
     *            accuracy of its detection of the <code>POSITIVE</code>
     *            sentiment.
     *            </p>
     */
    public void setPositive(Float positive) {
        this.positive = positive;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its
     * detection of the <code>POSITIVE</code> sentiment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param positive <p>
     *            The level of confidence that Amazon Comprehend has in the
     *            accuracy of its detection of the <code>POSITIVE</code>
     *            sentiment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SentimentScore withPositive(Float positive) {
        this.positive = positive;
        return this;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its
     * detection of the <code>NEGATIVE</code> sentiment.
     * </p>
     *
     * @return <p>
     *         The level of confidence that Amazon Comprehend has in the
     *         accuracy of its detection of the <code>NEGATIVE</code> sentiment.
     *         </p>
     */
    public Float getNegative() {
        return negative;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its
     * detection of the <code>NEGATIVE</code> sentiment.
     * </p>
     *
     * @param negative <p>
     *            The level of confidence that Amazon Comprehend has in the
     *            accuracy of its detection of the <code>NEGATIVE</code>
     *            sentiment.
     *            </p>
     */
    public void setNegative(Float negative) {
        this.negative = negative;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its
     * detection of the <code>NEGATIVE</code> sentiment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param negative <p>
     *            The level of confidence that Amazon Comprehend has in the
     *            accuracy of its detection of the <code>NEGATIVE</code>
     *            sentiment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SentimentScore withNegative(Float negative) {
        this.negative = negative;
        return this;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its
     * detection of the <code>NEUTRAL</code> sentiment.
     * </p>
     *
     * @return <p>
     *         The level of confidence that Amazon Comprehend has in the
     *         accuracy of its detection of the <code>NEUTRAL</code> sentiment.
     *         </p>
     */
    public Float getNeutral() {
        return neutral;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its
     * detection of the <code>NEUTRAL</code> sentiment.
     * </p>
     *
     * @param neutral <p>
     *            The level of confidence that Amazon Comprehend has in the
     *            accuracy of its detection of the <code>NEUTRAL</code>
     *            sentiment.
     *            </p>
     */
    public void setNeutral(Float neutral) {
        this.neutral = neutral;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its
     * detection of the <code>NEUTRAL</code> sentiment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param neutral <p>
     *            The level of confidence that Amazon Comprehend has in the
     *            accuracy of its detection of the <code>NEUTRAL</code>
     *            sentiment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SentimentScore withNeutral(Float neutral) {
        this.neutral = neutral;
        return this;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its
     * detection of the <code>MIXED</code> sentiment.
     * </p>
     *
     * @return <p>
     *         The level of confidence that Amazon Comprehend has in the
     *         accuracy of its detection of the <code>MIXED</code> sentiment.
     *         </p>
     */
    public Float getMixed() {
        return mixed;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its
     * detection of the <code>MIXED</code> sentiment.
     * </p>
     *
     * @param mixed <p>
     *            The level of confidence that Amazon Comprehend has in the
     *            accuracy of its detection of the <code>MIXED</code> sentiment.
     *            </p>
     */
    public void setMixed(Float mixed) {
        this.mixed = mixed;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of its
     * detection of the <code>MIXED</code> sentiment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mixed <p>
     *            The level of confidence that Amazon Comprehend has in the
     *            accuracy of its detection of the <code>MIXED</code> sentiment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SentimentScore withMixed(Float mixed) {
        this.mixed = mixed;
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
        if (getPositive() != null)
            sb.append("Positive: " + getPositive() + ",");
        if (getNegative() != null)
            sb.append("Negative: " + getNegative() + ",");
        if (getNeutral() != null)
            sb.append("Neutral: " + getNeutral() + ",");
        if (getMixed() != null)
            sb.append("Mixed: " + getMixed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPositive() == null) ? 0 : getPositive().hashCode());
        hashCode = prime * hashCode + ((getNegative() == null) ? 0 : getNegative().hashCode());
        hashCode = prime * hashCode + ((getNeutral() == null) ? 0 : getNeutral().hashCode());
        hashCode = prime * hashCode + ((getMixed() == null) ? 0 : getMixed().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SentimentScore == false)
            return false;
        SentimentScore other = (SentimentScore) obj;

        if (other.getPositive() == null ^ this.getPositive() == null)
            return false;
        if (other.getPositive() != null && other.getPositive().equals(this.getPositive()) == false)
            return false;
        if (other.getNegative() == null ^ this.getNegative() == null)
            return false;
        if (other.getNegative() != null && other.getNegative().equals(this.getNegative()) == false)
            return false;
        if (other.getNeutral() == null ^ this.getNeutral() == null)
            return false;
        if (other.getNeutral() != null && other.getNeutral().equals(this.getNeutral()) == false)
            return false;
        if (other.getMixed() == null ^ this.getMixed() == null)
            return false;
        if (other.getMixed() != null && other.getMixed().equals(this.getMixed()) == false)
            return false;
        return true;
    }
}
