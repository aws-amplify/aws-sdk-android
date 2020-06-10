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


/**
 * <p>A summary of a recommendation.</p>
 */
public class RecommendationSummary implements Serializable {
    /**
     * <p>An array of objects that describe a recommendation summary.</p>
     */
    private java.util.List<Summary> summaries;

    /**
     * <p>The resource type of the recommendation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ec2Instance, AutoScalingGroup
     */
    private String recommendationResourceType;

    /**
     * <p>The AWS account ID of the recommendation summary.</p>
     */
    private String accountId;

    /**
     * <p>An array of objects that describe a recommendation summary.</p>
     *
     * @return <p>An array of objects that describe a recommendation summary.</p>
     */
    public java.util.List<Summary> getSummaries() {
        return summaries;
    }

    /**
     * <p>An array of objects that describe a recommendation summary.</p>
     *
     * @param summaries <p>An array of objects that describe a recommendation summary.</p>
     */
    public void setSummaries(java.util.Collection<Summary> summaries) {
        if (summaries == null) {
            this.summaries = null;
            return;
        }

        this.summaries = new java.util.ArrayList<Summary>(summaries);
    }

    /**
     * <p>An array of objects that describe a recommendation summary.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param summaries <p>An array of objects that describe a recommendation summary.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendationSummary withSummaries(Summary... summaries) {
        if (getSummaries() == null) {
            this.summaries = new java.util.ArrayList<Summary>(summaries.length);
        }
        for (Summary value : summaries) {
            this.summaries.add(value);
        }
        return this;
    }

    /**
     * <p>An array of objects that describe a recommendation summary.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param summaries <p>An array of objects that describe a recommendation summary.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendationSummary withSummaries(java.util.Collection<Summary> summaries) {
        setSummaries(summaries);
        return this;
    }

    /**
     * <p>The resource type of the recommendation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ec2Instance, AutoScalingGroup
     *
     * @return <p>The resource type of the recommendation.</p>
     *
     * @see RecommendationSourceType
     */
    public String getRecommendationResourceType() {
        return recommendationResourceType;
    }

    /**
     * <p>The resource type of the recommendation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ec2Instance, AutoScalingGroup
     *
     * @param recommendationResourceType <p>The resource type of the recommendation.</p>
     *
     * @see RecommendationSourceType
     */
    public void setRecommendationResourceType(String recommendationResourceType) {
        this.recommendationResourceType = recommendationResourceType;
    }

    /**
     * <p>The resource type of the recommendation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ec2Instance, AutoScalingGroup
     *
     * @param recommendationResourceType <p>The resource type of the recommendation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see RecommendationSourceType
     */
    public RecommendationSummary withRecommendationResourceType(String recommendationResourceType) {
        this.recommendationResourceType = recommendationResourceType;
        return this;
    }

    /**
     * <p>The resource type of the recommendation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ec2Instance, AutoScalingGroup
     *
     * @param recommendationResourceType <p>The resource type of the recommendation.</p>
     *
     * @see RecommendationSourceType
     */
    public void setRecommendationResourceType(RecommendationSourceType recommendationResourceType) {
        this.recommendationResourceType = recommendationResourceType.toString();
    }

    /**
     * <p>The resource type of the recommendation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ec2Instance, AutoScalingGroup
     *
     * @param recommendationResourceType <p>The resource type of the recommendation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see RecommendationSourceType
     */
    public RecommendationSummary withRecommendationResourceType(RecommendationSourceType recommendationResourceType) {
        this.recommendationResourceType = recommendationResourceType.toString();
        return this;
    }

    /**
     * <p>The AWS account ID of the recommendation summary.</p>
     *
     * @return <p>The AWS account ID of the recommendation summary.</p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>The AWS account ID of the recommendation summary.</p>
     *
     * @param accountId <p>The AWS account ID of the recommendation summary.</p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>The AWS account ID of the recommendation summary.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountId <p>The AWS account ID of the recommendation summary.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendationSummary withAccountId(String accountId) {
        this.accountId = accountId;
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
        if (getSummaries() != null) sb.append("summaries: " + getSummaries() + ",");
        if (getRecommendationResourceType() != null) sb.append("recommendationResourceType: " + getRecommendationResourceType() + ",");
        if (getAccountId() != null) sb.append("accountId: " + getAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSummaries() == null) ? 0 : getSummaries().hashCode());
        hashCode = prime * hashCode + ((getRecommendationResourceType() == null) ? 0 : getRecommendationResourceType().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RecommendationSummary == false) return false;
        RecommendationSummary other = (RecommendationSummary)obj;

        if (other.getSummaries() == null ^ this.getSummaries() == null) return false;
        if (other.getSummaries() != null && other.getSummaries().equals(this.getSummaries()) == false) return false;
        if (other.getRecommendationResourceType() == null ^ this.getRecommendationResourceType() == null) return false;
        if (other.getRecommendationResourceType() != null && other.getRecommendationResourceType().equals(this.getRecommendationResourceType()) == false) return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false;
        return true;
    }
}
