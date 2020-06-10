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
 * <p>Returns the optimization findings for an account.</p> <p>For example, it returns the number of Amazon EC2 instances in an account that are under-provisioned, over-provisioned, or optimized. It also returns the number of Auto Scaling groups in an account that are not optimized, or optimized.</p>
 */
public class GetRecommendationSummariesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The IDs of the AWS accounts for which to return recommendation summaries.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return recommendation summaries.</p> <p>Only one account ID can be specified per request.</p>
     */
    private java.util.List<String> accountIds;

    /**
     * <p>The token to advance to the next page of recommendation summaries.</p>
     */
    private String nextToken;

    /**
     * <p>The maximum number of recommendation summaries to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     */
    private Integer maxResults;

    /**
     * <p>The IDs of the AWS accounts for which to return recommendation summaries.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return recommendation summaries.</p> <p>Only one account ID can be specified per request.</p>
     *
     * @return <p>The IDs of the AWS accounts for which to return recommendation summaries.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return recommendation summaries.</p> <p>Only one account ID can be specified per request.</p>
     */
    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>The IDs of the AWS accounts for which to return recommendation summaries.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return recommendation summaries.</p> <p>Only one account ID can be specified per request.</p>
     *
     * @param accountIds <p>The IDs of the AWS accounts for which to return recommendation summaries.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return recommendation summaries.</p> <p>Only one account ID can be specified per request.</p>
     */
    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>The IDs of the AWS accounts for which to return recommendation summaries.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return recommendation summaries.</p> <p>Only one account ID can be specified per request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountIds <p>The IDs of the AWS accounts for which to return recommendation summaries.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return recommendation summaries.</p> <p>Only one account ID can be specified per request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRecommendationSummariesRequest withAccountIds(String... accountIds) {
        if (getAccountIds() == null) {
            this.accountIds = new java.util.ArrayList<String>(accountIds.length);
        }
        for (String value : accountIds) {
            this.accountIds.add(value);
        }
        return this;
    }

    /**
     * <p>The IDs of the AWS accounts for which to return recommendation summaries.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return recommendation summaries.</p> <p>Only one account ID can be specified per request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountIds <p>The IDs of the AWS accounts for which to return recommendation summaries.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return recommendation summaries.</p> <p>Only one account ID can be specified per request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRecommendationSummariesRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * <p>The token to advance to the next page of recommendation summaries.</p>
     *
     * @return <p>The token to advance to the next page of recommendation summaries.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token to advance to the next page of recommendation summaries.</p>
     *
     * @param nextToken <p>The token to advance to the next page of recommendation summaries.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token to advance to the next page of recommendation summaries.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token to advance to the next page of recommendation summaries.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRecommendationSummariesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>The maximum number of recommendation summaries to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     *
     * @return <p>The maximum number of recommendation summaries to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>The maximum number of recommendation summaries to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     *
     * @param maxResults <p>The maximum number of recommendation summaries to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>The maximum number of recommendation summaries to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults <p>The maximum number of recommendation summaries to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRecommendationSummariesRequest withMaxResults(Integer maxResults) {
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
        if (getAccountIds() != null) sb.append("accountIds: " + getAccountIds() + ",");
        if (getNextToken() != null) sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetRecommendationSummariesRequest == false) return false;
        GetRecommendationSummariesRequest other = (GetRecommendationSummariesRequest)obj;

        if (other.getAccountIds() == null ^ this.getAccountIds() == null) return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        return true;
    }
}
