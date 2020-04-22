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

public class ListRecommendationsResult implements Serializable {
    /**
     * <p>
     * List of recommendations for the requested code review.
     * </p>
     */
    private java.util.List<RecommendationSummary> recommendationSummaries;

    /**
     * <p>
     * Pagination token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String nextToken;

    /**
     * <p>
     * List of recommendations for the requested code review.
     * </p>
     *
     * @return <p>
     *         List of recommendations for the requested code review.
     *         </p>
     */
    public java.util.List<RecommendationSummary> getRecommendationSummaries() {
        return recommendationSummaries;
    }

    /**
     * <p>
     * List of recommendations for the requested code review.
     * </p>
     *
     * @param recommendationSummaries <p>
     *            List of recommendations for the requested code review.
     *            </p>
     */
    public void setRecommendationSummaries(
            java.util.Collection<RecommendationSummary> recommendationSummaries) {
        if (recommendationSummaries == null) {
            this.recommendationSummaries = null;
            return;
        }

        this.recommendationSummaries = new java.util.ArrayList<RecommendationSummary>(
                recommendationSummaries);
    }

    /**
     * <p>
     * List of recommendations for the requested code review.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommendationSummaries <p>
     *            List of recommendations for the requested code review.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecommendationsResult withRecommendationSummaries(
            RecommendationSummary... recommendationSummaries) {
        if (getRecommendationSummaries() == null) {
            this.recommendationSummaries = new java.util.ArrayList<RecommendationSummary>(
                    recommendationSummaries.length);
        }
        for (RecommendationSummary value : recommendationSummaries) {
            this.recommendationSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of recommendations for the requested code review.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommendationSummaries <p>
     *            List of recommendations for the requested code review.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecommendationsResult withRecommendationSummaries(
            java.util.Collection<RecommendationSummary> recommendationSummaries) {
        setRecommendationSummaries(recommendationSummaries);
        return this;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         Pagination token.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param nextToken <p>
     *            Pagination token.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param nextToken <p>
     *            Pagination token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecommendationsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getRecommendationSummaries() != null)
            sb.append("RecommendationSummaries: " + getRecommendationSummaries() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRecommendationSummaries() == null) ? 0 : getRecommendationSummaries()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecommendationsResult == false)
            return false;
        ListRecommendationsResult other = (ListRecommendationsResult) obj;

        if (other.getRecommendationSummaries() == null ^ this.getRecommendationSummaries() == null)
            return false;
        if (other.getRecommendationSummaries() != null
                && other.getRecommendationSummaries().equals(this.getRecommendationSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
