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
package com.amazonaws.services.compute-optimizer.model;

import java.io.Serializable;


public class GetRecommendationSummariesResult implements Serializable {
    /**
     * <p>The token to use to advance to the next page of recommendation summaries.</p> <p>This value is null when there are no more pages of recommendation summaries to return.</p>
     */
    private String nextToken;

    /**
     * <p>An array of objects that summarize a recommendation.</p>
     */
    private java.util.List<RecommendationSummary> recommendationSummaries;

    /**
     * <p>The token to use to advance to the next page of recommendation summaries.</p> <p>This value is null when there are no more pages of recommendation summaries to return.</p>
     *
     * @return <p>The token to use to advance to the next page of recommendation summaries.</p> <p>This value is null when there are no more pages of recommendation summaries to return.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token to use to advance to the next page of recommendation summaries.</p> <p>This value is null when there are no more pages of recommendation summaries to return.</p>
     *
     * @param nextToken <p>The token to use to advance to the next page of recommendation summaries.</p> <p>This value is null when there are no more pages of recommendation summaries to return.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token to use to advance to the next page of recommendation summaries.</p> <p>This value is null when there are no more pages of recommendation summaries to return.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token to use to advance to the next page of recommendation summaries.</p> <p>This value is null when there are no more pages of recommendation summaries to return.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRecommendationSummariesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>An array of objects that summarize a recommendation.</p>
     *
     * @return <p>An array of objects that summarize a recommendation.</p>
     */
    public java.util.List<RecommendationSummary> getRecommendationSummaries() {
        return recommendationSummaries;
    }

    /**
     * <p>An array of objects that summarize a recommendation.</p>
     *
     * @param recommendationSummaries <p>An array of objects that summarize a recommendation.</p>
     */
    public void setRecommendationSummaries(java.util.Collection<RecommendationSummary> recommendationSummaries) {
        if (recommendationSummaries == null) {
            this.recommendationSummaries = null;
            return;
        }

        this.recommendationSummaries = new java.util.ArrayList<RecommendationSummary>(recommendationSummaries);
    }

    /**
     * <p>An array of objects that summarize a recommendation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recommendationSummaries <p>An array of objects that summarize a recommendation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRecommendationSummariesResult withRecommendationSummaries(RecommendationSummary... recommendationSummaries) {
        if (getRecommendationSummaries() == null) {
            this.recommendationSummaries = new java.util.ArrayList<RecommendationSummary>(recommendationSummaries.length);
        }
        for (RecommendationSummary value : recommendationSummaries) {
            this.recommendationSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>An array of objects that summarize a recommendation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recommendationSummaries <p>An array of objects that summarize a recommendation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRecommendationSummariesResult withRecommendationSummaries(java.util.Collection<RecommendationSummary> recommendationSummaries) {
        setRecommendationSummaries(recommendationSummaries);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNextToken() != null) sb.append("nextToken: " + getNextToken() + ",");
        if (getRecommendationSummaries() != null) sb.append("recommendationSummaries: " + getRecommendationSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRecommendationSummaries() == null) ? 0 : getRecommendationSummaries().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetRecommendationSummariesResult == false) return false;
        GetRecommendationSummariesResult other = (GetRecommendationSummariesResult)obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        if (other.getRecommendationSummaries() == null ^ this.getRecommendationSummaries() == null) return false;
        if (other.getRecommendationSummaries() != null && other.getRecommendationSummaries().equals(this.getRecommendationSummaries()) == false) return false;
        return true;
    }
}
