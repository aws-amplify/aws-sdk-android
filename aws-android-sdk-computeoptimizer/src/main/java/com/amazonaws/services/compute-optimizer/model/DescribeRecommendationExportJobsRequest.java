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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Describes recommendation export jobs created in the last seven days.</p> <p>Use the <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code> actions to request an export of your recommendations. Then use the <code>DescribeRecommendationExportJobs</code> action to view your export jobs.</p>
 */
public class DescribeRecommendationExportJobsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The identification numbers of the export jobs to return.</p> <p>An export job ID is returned when you create an export using the <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code> actions.</p> <p>All export jobs created in the last seven days are returned if this parameter is omitted.</p>
     */
    private java.util.List<String> jobIds;

    /**
     * <p>An array of objects that describe a filter to return a more specific list of export jobs.</p>
     */
    private java.util.List<JobFilter> filters;

    /**
     * <p>The token to advance to the next page of export jobs.</p>
     */
    private String nextToken;

    /**
     * <p>The maximum number of export jobs to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     */
    private Integer maxResults;

    /**
     * <p>The identification numbers of the export jobs to return.</p> <p>An export job ID is returned when you create an export using the <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code> actions.</p> <p>All export jobs created in the last seven days are returned if this parameter is omitted.</p>
     *
     * @return <p>The identification numbers of the export jobs to return.</p> <p>An export job ID is returned when you create an export using the <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code> actions.</p> <p>All export jobs created in the last seven days are returned if this parameter is omitted.</p>
     */
    public java.util.List<String> getJobIds() {
        return jobIds;
    }

    /**
     * <p>The identification numbers of the export jobs to return.</p> <p>An export job ID is returned when you create an export using the <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code> actions.</p> <p>All export jobs created in the last seven days are returned if this parameter is omitted.</p>
     *
     * @param jobIds <p>The identification numbers of the export jobs to return.</p> <p>An export job ID is returned when you create an export using the <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code> actions.</p> <p>All export jobs created in the last seven days are returned if this parameter is omitted.</p>
     */
    public void setJobIds(java.util.Collection<String> jobIds) {
        if (jobIds == null) {
            this.jobIds = null;
            return;
        }

        this.jobIds = new java.util.ArrayList<String>(jobIds);
    }

    /**
     * <p>The identification numbers of the export jobs to return.</p> <p>An export job ID is returned when you create an export using the <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code> actions.</p> <p>All export jobs created in the last seven days are returned if this parameter is omitted.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobIds <p>The identification numbers of the export jobs to return.</p> <p>An export job ID is returned when you create an export using the <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code> actions.</p> <p>All export jobs created in the last seven days are returned if this parameter is omitted.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeRecommendationExportJobsRequest withJobIds(String... jobIds) {
        if (getJobIds() == null) {
            this.jobIds = new java.util.ArrayList<String>(jobIds.length);
        }
        for (String value : jobIds) {
            this.jobIds.add(value);
        }
        return this;
    }

    /**
     * <p>The identification numbers of the export jobs to return.</p> <p>An export job ID is returned when you create an export using the <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code> actions.</p> <p>All export jobs created in the last seven days are returned if this parameter is omitted.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobIds <p>The identification numbers of the export jobs to return.</p> <p>An export job ID is returned when you create an export using the <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code> actions.</p> <p>All export jobs created in the last seven days are returned if this parameter is omitted.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeRecommendationExportJobsRequest withJobIds(java.util.Collection<String> jobIds) {
        setJobIds(jobIds);
        return this;
    }

    /**
     * <p>An array of objects that describe a filter to return a more specific list of export jobs.</p>
     *
     * @return <p>An array of objects that describe a filter to return a more specific list of export jobs.</p>
     */
    public java.util.List<JobFilter> getFilters() {
        return filters;
    }

    /**
     * <p>An array of objects that describe a filter to return a more specific list of export jobs.</p>
     *
     * @param filters <p>An array of objects that describe a filter to return a more specific list of export jobs.</p>
     */
    public void setFilters(java.util.Collection<JobFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<JobFilter>(filters);
    }

    /**
     * <p>An array of objects that describe a filter to return a more specific list of export jobs.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>An array of objects that describe a filter to return a more specific list of export jobs.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeRecommendationExportJobsRequest withFilters(JobFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<JobFilter>(filters.length);
        }
        for (JobFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>An array of objects that describe a filter to return a more specific list of export jobs.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>An array of objects that describe a filter to return a more specific list of export jobs.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeRecommendationExportJobsRequest withFilters(java.util.Collection<JobFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>The token to advance to the next page of export jobs.</p>
     *
     * @return <p>The token to advance to the next page of export jobs.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token to advance to the next page of export jobs.</p>
     *
     * @param nextToken <p>The token to advance to the next page of export jobs.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token to advance to the next page of export jobs.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token to advance to the next page of export jobs.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeRecommendationExportJobsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>The maximum number of export jobs to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     *
     * @return <p>The maximum number of export jobs to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>The maximum number of export jobs to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     *
     * @param maxResults <p>The maximum number of export jobs to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>The maximum number of export jobs to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults <p>The maximum number of export jobs to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeRecommendationExportJobsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getJobIds() != null) sb.append("jobIds: " + getJobIds() + ",");
        if (getFilters() != null) sb.append("filters: " + getFilters() + ",");
        if (getNextToken() != null) sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobIds() == null) ? 0 : getJobIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeRecommendationExportJobsRequest == false) return false;
        DescribeRecommendationExportJobsRequest other = (DescribeRecommendationExportJobsRequest)obj;

        if (other.getJobIds() == null ^ this.getJobIds() == null) return false;
        if (other.getJobIds() != null && other.getJobIds().equals(this.getJobIds()) == false) return false;
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        return true;
    }
}
