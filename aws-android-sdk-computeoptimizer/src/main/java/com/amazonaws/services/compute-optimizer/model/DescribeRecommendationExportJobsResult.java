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


public class DescribeRecommendationExportJobsResult implements Serializable {
    /**
     * <p>An array of objects that describe recommendation export jobs.</p>
     */
    private java.util.List<RecommendationExportJob> recommendationExportJobs;

    /**
     * <p>The token to use to advance to the next page of export jobs.</p> <p>This value is null when there are no more pages of export jobs to return.</p>
     */
    private String nextToken;

    /**
     * <p>An array of objects that describe recommendation export jobs.</p>
     *
     * @return <p>An array of objects that describe recommendation export jobs.</p>
     */
    public java.util.List<RecommendationExportJob> getRecommendationExportJobs() {
        return recommendationExportJobs;
    }

    /**
     * <p>An array of objects that describe recommendation export jobs.</p>
     *
     * @param recommendationExportJobs <p>An array of objects that describe recommendation export jobs.</p>
     */
    public void setRecommendationExportJobs(java.util.Collection<RecommendationExportJob> recommendationExportJobs) {
        if (recommendationExportJobs == null) {
            this.recommendationExportJobs = null;
            return;
        }

        this.recommendationExportJobs = new java.util.ArrayList<RecommendationExportJob>(recommendationExportJobs);
    }

    /**
     * <p>An array of objects that describe recommendation export jobs.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recommendationExportJobs <p>An array of objects that describe recommendation export jobs.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeRecommendationExportJobsResult withRecommendationExportJobs(RecommendationExportJob... recommendationExportJobs) {
        if (getRecommendationExportJobs() == null) {
            this.recommendationExportJobs = new java.util.ArrayList<RecommendationExportJob>(recommendationExportJobs.length);
        }
        for (RecommendationExportJob value : recommendationExportJobs) {
            this.recommendationExportJobs.add(value);
        }
        return this;
    }

    /**
     * <p>An array of objects that describe recommendation export jobs.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recommendationExportJobs <p>An array of objects that describe recommendation export jobs.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeRecommendationExportJobsResult withRecommendationExportJobs(java.util.Collection<RecommendationExportJob> recommendationExportJobs) {
        setRecommendationExportJobs(recommendationExportJobs);
        return this;
    }

    /**
     * <p>The token to use to advance to the next page of export jobs.</p> <p>This value is null when there are no more pages of export jobs to return.</p>
     *
     * @return <p>The token to use to advance to the next page of export jobs.</p> <p>This value is null when there are no more pages of export jobs to return.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token to use to advance to the next page of export jobs.</p> <p>This value is null when there are no more pages of export jobs to return.</p>
     *
     * @param nextToken <p>The token to use to advance to the next page of export jobs.</p> <p>This value is null when there are no more pages of export jobs to return.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token to use to advance to the next page of export jobs.</p> <p>This value is null when there are no more pages of export jobs to return.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token to use to advance to the next page of export jobs.</p> <p>This value is null when there are no more pages of export jobs to return.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeRecommendationExportJobsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getRecommendationExportJobs() != null) sb.append("recommendationExportJobs: " + getRecommendationExportJobs() + ",");
        if (getNextToken() != null) sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendationExportJobs() == null) ? 0 : getRecommendationExportJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeRecommendationExportJobsResult == false) return false;
        DescribeRecommendationExportJobsResult other = (DescribeRecommendationExportJobsResult)obj;

        if (other.getRecommendationExportJobs() == null ^ this.getRecommendationExportJobs() == null) return false;
        if (other.getRecommendationExportJobs() != null && other.getRecommendationExportJobs().equals(this.getRecommendationExportJobs()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
