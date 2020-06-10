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
 * <p>Returns Auto Scaling group recommendations.</p> <p>AWS Compute Optimizer currently generates recommendations for Auto Scaling groups that are configured to run instances of the M, C, R, T, and X instance families. The service does not generate recommendations for Auto Scaling groups that have a scaling policy attached to them, or that do not have the same values for desired, minimum, and maximum capacity. In order for Compute Optimizer to analyze your Auto Scaling groups, they must be of a fixed size. For more information, see the <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/what-is.html">AWS Compute Optimizer User Guide</a>.</p>
 */
public class GetAutoScalingGroupRecommendationsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The IDs of the AWS accounts for which to return Auto Scaling group recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return Auto Scaling group recommendations.</p> <p>Only one account ID can be specified per request.</p>
     */
    private java.util.List<String> accountIds;

    /**
     * <p>The Amazon Resource Name (ARN) of the Auto Scaling groups for which to return recommendations.</p>
     */
    private java.util.List<String> autoScalingGroupArns;

    /**
     * <p>The token to advance to the next page of Auto Scaling group recommendations.</p>
     */
    private String nextToken;

    /**
     * <p>The maximum number of Auto Scaling group recommendations to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     */
    private Integer maxResults;

    /**
     * <p>An array of objects that describe a filter that returns a more specific list of Auto Scaling group recommendations.</p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>The IDs of the AWS accounts for which to return Auto Scaling group recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return Auto Scaling group recommendations.</p> <p>Only one account ID can be specified per request.</p>
     *
     * @return <p>The IDs of the AWS accounts for which to return Auto Scaling group recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return Auto Scaling group recommendations.</p> <p>Only one account ID can be specified per request.</p>
     */
    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>The IDs of the AWS accounts for which to return Auto Scaling group recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return Auto Scaling group recommendations.</p> <p>Only one account ID can be specified per request.</p>
     *
     * @param accountIds <p>The IDs of the AWS accounts for which to return Auto Scaling group recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return Auto Scaling group recommendations.</p> <p>Only one account ID can be specified per request.</p>
     */
    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>The IDs of the AWS accounts for which to return Auto Scaling group recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return Auto Scaling group recommendations.</p> <p>Only one account ID can be specified per request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountIds <p>The IDs of the AWS accounts for which to return Auto Scaling group recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return Auto Scaling group recommendations.</p> <p>Only one account ID can be specified per request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetAutoScalingGroupRecommendationsRequest withAccountIds(String... accountIds) {
        if (getAccountIds() == null) {
            this.accountIds = new java.util.ArrayList<String>(accountIds.length);
        }
        for (String value : accountIds) {
            this.accountIds.add(value);
        }
        return this;
    }

    /**
     * <p>The IDs of the AWS accounts for which to return Auto Scaling group recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return Auto Scaling group recommendations.</p> <p>Only one account ID can be specified per request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountIds <p>The IDs of the AWS accounts for which to return Auto Scaling group recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return Auto Scaling group recommendations.</p> <p>Only one account ID can be specified per request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetAutoScalingGroupRecommendationsRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the Auto Scaling groups for which to return recommendations.</p>
     *
     * @return <p>The Amazon Resource Name (ARN) of the Auto Scaling groups for which to return recommendations.</p>
     */
    public java.util.List<String> getAutoScalingGroupArns() {
        return autoScalingGroupArns;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the Auto Scaling groups for which to return recommendations.</p>
     *
     * @param autoScalingGroupArns <p>The Amazon Resource Name (ARN) of the Auto Scaling groups for which to return recommendations.</p>
     */
    public void setAutoScalingGroupArns(java.util.Collection<String> autoScalingGroupArns) {
        if (autoScalingGroupArns == null) {
            this.autoScalingGroupArns = null;
            return;
        }

        this.autoScalingGroupArns = new java.util.ArrayList<String>(autoScalingGroupArns);
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the Auto Scaling groups for which to return recommendations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroupArns <p>The Amazon Resource Name (ARN) of the Auto Scaling groups for which to return recommendations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetAutoScalingGroupRecommendationsRequest withAutoScalingGroupArns(String... autoScalingGroupArns) {
        if (getAutoScalingGroupArns() == null) {
            this.autoScalingGroupArns = new java.util.ArrayList<String>(autoScalingGroupArns.length);
        }
        for (String value : autoScalingGroupArns) {
            this.autoScalingGroupArns.add(value);
        }
        return this;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the Auto Scaling groups for which to return recommendations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroupArns <p>The Amazon Resource Name (ARN) of the Auto Scaling groups for which to return recommendations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetAutoScalingGroupRecommendationsRequest withAutoScalingGroupArns(java.util.Collection<String> autoScalingGroupArns) {
        setAutoScalingGroupArns(autoScalingGroupArns);
        return this;
    }

    /**
     * <p>The token to advance to the next page of Auto Scaling group recommendations.</p>
     *
     * @return <p>The token to advance to the next page of Auto Scaling group recommendations.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token to advance to the next page of Auto Scaling group recommendations.</p>
     *
     * @param nextToken <p>The token to advance to the next page of Auto Scaling group recommendations.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token to advance to the next page of Auto Scaling group recommendations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token to advance to the next page of Auto Scaling group recommendations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetAutoScalingGroupRecommendationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>The maximum number of Auto Scaling group recommendations to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     *
     * @return <p>The maximum number of Auto Scaling group recommendations to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>The maximum number of Auto Scaling group recommendations to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     *
     * @param maxResults <p>The maximum number of Auto Scaling group recommendations to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>The maximum number of Auto Scaling group recommendations to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults <p>The maximum number of Auto Scaling group recommendations to return with a single request.</p> <p>To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetAutoScalingGroupRecommendationsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>An array of objects that describe a filter that returns a more specific list of Auto Scaling group recommendations.</p>
     *
     * @return <p>An array of objects that describe a filter that returns a more specific list of Auto Scaling group recommendations.</p>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>An array of objects that describe a filter that returns a more specific list of Auto Scaling group recommendations.</p>
     *
     * @param filters <p>An array of objects that describe a filter that returns a more specific list of Auto Scaling group recommendations.</p>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>An array of objects that describe a filter that returns a more specific list of Auto Scaling group recommendations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>An array of objects that describe a filter that returns a more specific list of Auto Scaling group recommendations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetAutoScalingGroupRecommendationsRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>An array of objects that describe a filter that returns a more specific list of Auto Scaling group recommendations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>An array of objects that describe a filter that returns a more specific list of Auto Scaling group recommendations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetAutoScalingGroupRecommendationsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
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
        if (getAutoScalingGroupArns() != null) sb.append("autoScalingGroupArns: " + getAutoScalingGroupArns() + ",");
        if (getNextToken() != null) sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("maxResults: " + getMaxResults() + ",");
        if (getFilters() != null) sb.append("filters: " + getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroupArns() == null) ? 0 : getAutoScalingGroupArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetAutoScalingGroupRecommendationsRequest == false) return false;
        GetAutoScalingGroupRecommendationsRequest other = (GetAutoScalingGroupRecommendationsRequest)obj;

        if (other.getAccountIds() == null ^ this.getAccountIds() == null) return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false) return false;
        if (other.getAutoScalingGroupArns() == null ^ this.getAutoScalingGroupArns() == null) return false;
        if (other.getAutoScalingGroupArns() != null && other.getAutoScalingGroupArns().equals(this.getAutoScalingGroupArns()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false;
        return true;
    }
}
