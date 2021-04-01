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
 * Provides a score that indicates the confidence that Amazon Lex has that an
 * intent is the one that satisfies the user's intent.
 * </p>
 */
public class IntentConfidence implements Serializable {
    /**
     * <p>
     * A score that indicates how confident Amazon Lex is that an intent
     * satisfies the user's intent. Ranges between 0.00 and 1.00. Higher scores
     * indicate higher confidence.
     * </p>
     */
    private Double score;

    /**
     * <p>
     * A score that indicates how confident Amazon Lex is that an intent
     * satisfies the user's intent. Ranges between 0.00 and 1.00. Higher scores
     * indicate higher confidence.
     * </p>
     *
     * @return <p>
     *         A score that indicates how confident Amazon Lex is that an intent
     *         satisfies the user's intent. Ranges between 0.00 and 1.00. Higher
     *         scores indicate higher confidence.
     *         </p>
     */
    public Double getScore() {
        return score;
    }

    /**
     * <p>
     * A score that indicates how confident Amazon Lex is that an intent
     * satisfies the user's intent. Ranges between 0.00 and 1.00. Higher scores
     * indicate higher confidence.
     * </p>
     *
     * @param score <p>
     *            A score that indicates how confident Amazon Lex is that an
     *            intent satisfies the user's intent. Ranges between 0.00 and
     *            1.00. Higher scores indicate higher confidence.
     *            </p>
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * <p>
     * A score that indicates how confident Amazon Lex is that an intent
     * satisfies the user's intent. Ranges between 0.00 and 1.00. Higher scores
     * indicate higher confidence.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param score <p>
     *            A score that indicates how confident Amazon Lex is that an
     *            intent satisfies the user's intent. Ranges between 0.00 and
     *            1.00. Higher scores indicate higher confidence.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntentConfidence withScore(Double score) {
        this.score = score;
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
        if (getScore() != null)
            sb.append("score: " + getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IntentConfidence == false)
            return false;
        IntentConfidence other = (IntentConfidence) obj;

        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }
}
