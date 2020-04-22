/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.amazoncodegurureviewer.model;

import java.io.Serializable;

public class DescribeRecommendationFeedbackResult implements Serializable {
    /**
     * <p>
     * The recommendation feedback given by the user.
     * </p>
     */
    private RecommendationFeedback recommendationFeedback;

    /**
     * <p>
     * The recommendation feedback given by the user.
     * </p>
     *
     * @return <p>
     *         The recommendation feedback given by the user.
     *         </p>
     */
    public RecommendationFeedback getRecommendationFeedback() {
        return recommendationFeedback;
    }

    /**
     * <p>
     * The recommendation feedback given by the user.
     * </p>
     *
     * @param recommendationFeedback <p>
     *            The recommendation feedback given by the user.
     *            </p>
     */
    public void setRecommendationFeedback(RecommendationFeedback recommendationFeedback) {
        this.recommendationFeedback = recommendationFeedback;
    }

    /**
     * <p>
     * The recommendation feedback given by the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommendationFeedback <p>
     *            The recommendation feedback given by the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRecommendationFeedbackResult withRecommendationFeedback(
            RecommendationFeedback recommendationFeedback) {
        this.recommendationFeedback = recommendationFeedback;
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
        if (getRecommendationFeedback() != null)
            sb.append("RecommendationFeedback: " + getRecommendationFeedback());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRecommendationFeedback() == null) ? 0 : getRecommendationFeedback()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRecommendationFeedbackResult == false)
            return false;
        DescribeRecommendationFeedbackResult other = (DescribeRecommendationFeedbackResult) obj;

        if (other.getRecommendationFeedback() == null ^ this.getRecommendationFeedback() == null)
            return false;
        if (other.getRecommendationFeedback() != null
                && other.getRecommendationFeedback().equals(this.getRecommendationFeedback()) == false)
            return false;
        return true;
    }
}
