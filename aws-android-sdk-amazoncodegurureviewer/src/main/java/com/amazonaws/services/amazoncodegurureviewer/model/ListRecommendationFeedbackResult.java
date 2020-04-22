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

public class ListRecommendationFeedbackResult implements Serializable {
    /**
     * <p>
     * Recommendation feedback summaries corresponding to the code reivew ARN.
     * </p>
     */
    private java.util.List<RecommendationFeedbackSummary> recommendationFeedbackSummaries;

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of
     * nextToken is a unique pagination token for each page. Make the call again
     * using the returned token to retrieve the next page. Keep all other
     * arguments unchanged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Recommendation feedback summaries corresponding to the code reivew ARN.
     * </p>
     *
     * @return <p>
     *         Recommendation feedback summaries corresponding to the code
     *         reivew ARN.
     *         </p>
     */
    public java.util.List<RecommendationFeedbackSummary> getRecommendationFeedbackSummaries() {
        return recommendationFeedbackSummaries;
    }

    /**
     * <p>
     * Recommendation feedback summaries corresponding to the code reivew ARN.
     * </p>
     *
     * @param recommendationFeedbackSummaries <p>
     *            Recommendation feedback summaries corresponding to the code
     *            reivew ARN.
     *            </p>
     */
    public void setRecommendationFeedbackSummaries(
            java.util.Collection<RecommendationFeedbackSummary> recommendationFeedbackSummaries) {
        if (recommendationFeedbackSummaries == null) {
            this.recommendationFeedbackSummaries = null;
            return;
        }

        this.recommendationFeedbackSummaries = new java.util.ArrayList<RecommendationFeedbackSummary>(
                recommendationFeedbackSummaries);
    }

    /**
     * <p>
     * Recommendation feedback summaries corresponding to the code reivew ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommendationFeedbackSummaries <p>
     *            Recommendation feedback summaries corresponding to the code
     *            reivew ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecommendationFeedbackResult withRecommendationFeedbackSummaries(
            RecommendationFeedbackSummary... recommendationFeedbackSummaries) {
        if (getRecommendationFeedbackSummaries() == null) {
            this.recommendationFeedbackSummaries = new java.util.ArrayList<RecommendationFeedbackSummary>(
                    recommendationFeedbackSummaries.length);
        }
        for (RecommendationFeedbackSummary value : recommendationFeedbackSummaries) {
            this.recommendationFeedbackSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Recommendation feedback summaries corresponding to the code reivew ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommendationFeedbackSummaries <p>
     *            Recommendation feedback summaries corresponding to the code
     *            reivew ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecommendationFeedbackResult withRecommendationFeedbackSummaries(
            java.util.Collection<RecommendationFeedbackSummary> recommendationFeedbackSummaries) {
        setRecommendationFeedbackSummaries(recommendationFeedbackSummaries);
        return this;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of
     * nextToken is a unique pagination token for each page. Make the call again
     * using the returned token to retrieve the next page. Keep all other
     * arguments unchanged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         If nextToken is returned, there are more results available. The
     *         value of nextToken is a unique pagination token for each page.
     *         Make the call again using the returned token to retrieve the next
     *         page. Keep all other arguments unchanged.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of
     * nextToken is a unique pagination token for each page. Make the call again
     * using the returned token to retrieve the next page. Keep all other
     * arguments unchanged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param nextToken <p>
     *            If nextToken is returned, there are more results available.
     *            The value of nextToken is a unique pagination token for each
     *            page. Make the call again using the returned token to retrieve
     *            the next page. Keep all other arguments unchanged.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of
     * nextToken is a unique pagination token for each page. Make the call again
     * using the returned token to retrieve the next page. Keep all other
     * arguments unchanged.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param nextToken <p>
     *            If nextToken is returned, there are more results available.
     *            The value of nextToken is a unique pagination token for each
     *            page. Make the call again using the returned token to retrieve
     *            the next page. Keep all other arguments unchanged.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecommendationFeedbackResult withNextToken(String nextToken) {
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
        if (getRecommendationFeedbackSummaries() != null)
            sb.append("RecommendationFeedbackSummaries: " + getRecommendationFeedbackSummaries()
                    + ",");
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
                + ((getRecommendationFeedbackSummaries() == null) ? 0
                        : getRecommendationFeedbackSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecommendationFeedbackResult == false)
            return false;
        ListRecommendationFeedbackResult other = (ListRecommendationFeedbackResult) obj;

        if (other.getRecommendationFeedbackSummaries() == null
                ^ this.getRecommendationFeedbackSummaries() == null)
            return false;
        if (other.getRecommendationFeedbackSummaries() != null
                && other.getRecommendationFeedbackSummaries().equals(
                        this.getRecommendationFeedbackSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
