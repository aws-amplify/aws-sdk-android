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
 * <p>Returns Amazon EC2 instance recommendations.</p> <p>AWS Compute Optimizer currently generates recommendations for Amazon Elastic Compute Cloud (Amazon EC2) and Amazon EC2 Auto Scaling. It generates recommendations for M, C, R, T, and X instance families. For more information, see the <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/what-is.html">AWS Compute Optimizer User Guide</a>.</p>
 */
public class GetEC2InstanceRecommendationsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The Amazon Resource Name (ARN) of the instances for which to return recommendations.</p>
     */
    private java.util.List<String> instanceArns;

    /**
     * <p>The token to advance to the next page of instance recommendations.</p>
     */
    private String nextToken;

    /**
     * <p>The maximum number of instance recommendations to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     */
    private Integer maxResults;

    /**
     * <p>An array of objects that describe a filter that returns a more specific list of instance recommendations.</p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>The IDs of the AWS accounts for which to return instance recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return instance recommendations.</p> <p>Only one account ID can be specified per request.</p>
     */
    private java.util.List<String> accountIds;

    /**
     * <p>The Amazon Resource Name (ARN) of the instances for which to return recommendations.</p>
     *
     * @return <p>The Amazon Resource Name (ARN) of the instances for which to return recommendations.</p>
     */
    public java.util.List<String> getInstanceArns() {
        return instanceArns;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the instances for which to return recommendations.</p>
     *
     * @param instanceArns <p>The Amazon Resource Name (ARN) of the instances for which to return recommendations.</p>
     */
    public void setInstanceArns(java.util.Collection<String> instanceArns) {
        if (instanceArns == null) {
            this.instanceArns = null;
            return;
        }

        this.instanceArns = new java.util.ArrayList<String>(instanceArns);
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the instances for which to return recommendations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceArns <p>The Amazon Resource Name (ARN) of the instances for which to return recommendations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetEC2InstanceRecommendationsRequest withInstanceArns(String... instanceArns) {
        if (getInstanceArns() == null) {
            this.instanceArns = new java.util.ArrayList<String>(instanceArns.length);
        }
        for (String value : instanceArns) {
            this.instanceArns.add(value);
        }
        return this;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the instances for which to return recommendations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceArns <p>The Amazon Resource Name (ARN) of the instances for which to return recommendations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetEC2InstanceRecommendationsRequest withInstanceArns(java.util.Collection<String> instanceArns) {
        setInstanceArns(instanceArns);
        return this;
    }

    /**
     * <p>The token to advance to the next page of instance recommendations.</p>
     *
     * @return <p>The token to advance to the next page of instance recommendations.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token to advance to the next page of instance recommendations.</p>
     *
     * @param nextToken <p>The token to advance to the next page of instance recommendations.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token to advance to the next page of instance recommendations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token to advance to the next page of instance recommendations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetEC2InstanceRecommendationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>The maximum number of instance recommendations to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     *
     * @return <p>The maximum number of instance recommendations to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>The maximum number of instance recommendations to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     *
     * @param maxResults <p>The maximum number of instance recommendations to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>The maximum number of instance recommendations to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults <p>The maximum number of instance recommendations to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetEC2InstanceRecommendationsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>An array of objects that describe a filter that returns a more specific list of instance recommendations.</p>
     *
     * @return <p>An array of objects that describe a filter that returns a more specific list of instance recommendations.</p>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>An array of objects that describe a filter that returns a more specific list of instance recommendations.</p>
     *
     * @param filters <p>An array of objects that describe a filter that returns a more specific list of instance recommendations.</p>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>An array of objects that describe a filter that returns a more specific list of instance recommendations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>An array of objects that describe a filter that returns a more specific list of instance recommendations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetEC2InstanceRecommendationsRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>An array of objects that describe a filter that returns a more specific list of instance recommendations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>An array of objects that describe a filter that returns a more specific list of instance recommendations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetEC2InstanceRecommendationsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>The IDs of the AWS accounts for which to return instance recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return instance recommendations.</p> <p>Only one account ID can be specified per request.</p>
     *
     * @return <p>The IDs of the AWS accounts for which to return instance recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return instance recommendations.</p> <p>Only one account ID can be specified per request.</p>
     */
    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>The IDs of the AWS accounts for which to return instance recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return instance recommendations.</p> <p>Only one account ID can be specified per request.</p>
     *
     * @param accountIds <p>The IDs of the AWS accounts for which to return instance recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return instance recommendations.</p> <p>Only one account ID can be specified per request.</p>
     */
    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>The IDs of the AWS accounts for which to return instance recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return instance recommendations.</p> <p>Only one account ID can be specified per request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountIds <p>The IDs of the AWS accounts for which to return instance recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return instance recommendations.</p> <p>Only one account ID can be specified per request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetEC2InstanceRecommendationsRequest withAccountIds(String... accountIds) {
        if (getAccountIds() == null) {
            this.accountIds = new java.util.ArrayList<String>(accountIds.length);
        }
        for (String value : accountIds) {
            this.accountIds.add(value);
        }
        return this;
    }

    /**
     * <p>The IDs of the AWS accounts for which to return instance recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return instance recommendations.</p> <p>Only one account ID can be specified per request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountIds <p>The IDs of the AWS accounts for which to return instance recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return instance recommendations.</p> <p>Only one account ID can be specified per request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetEC2InstanceRecommendationsRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
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
        if (getInstanceArns() != null) sb.append("instanceArns: " + getInstanceArns() + ",");
        if (getNextToken() != null) sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("maxResults: " + getMaxResults() + ",");
        if (getFilters() != null) sb.append("filters: " + getFilters() + ",");
        if (getAccountIds() != null) sb.append("accountIds: " + getAccountIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceArns() == null) ? 0 : getInstanceArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetEC2InstanceRecommendationsRequest == false) return false;
        GetEC2InstanceRecommendationsRequest other = (GetEC2InstanceRecommendationsRequest)obj;

        if (other.getInstanceArns() == null ^ this.getInstanceArns() == null) return false;
        if (other.getInstanceArns() != null && other.getInstanceArns().equals(this.getInstanceArns()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null) return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false) return false;
        return true;
    }
}
