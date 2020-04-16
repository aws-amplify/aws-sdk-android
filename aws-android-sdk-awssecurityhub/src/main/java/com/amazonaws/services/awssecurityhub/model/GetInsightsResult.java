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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

public class GetInsightsResult implements Serializable {
    /**
     * <p>
     * The insights returned by the operation.
     * </p>
     */
    private java.util.List<Insight> insights;

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The insights returned by the operation.
     * </p>
     *
     * @return <p>
     *         The insights returned by the operation.
     *         </p>
     */
    public java.util.List<Insight> getInsights() {
        return insights;
    }

    /**
     * <p>
     * The insights returned by the operation.
     * </p>
     *
     * @param insights <p>
     *            The insights returned by the operation.
     *            </p>
     */
    public void setInsights(java.util.Collection<Insight> insights) {
        if (insights == null) {
            this.insights = null;
            return;
        }

        this.insights = new java.util.ArrayList<Insight>(insights);
    }

    /**
     * <p>
     * The insights returned by the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param insights <p>
     *            The insights returned by the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInsightsResult withInsights(Insight... insights) {
        if (getInsights() == null) {
            this.insights = new java.util.ArrayList<Insight>(insights.length);
        }
        for (Insight value : insights) {
            this.insights.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The insights returned by the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param insights <p>
     *            The insights returned by the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInsightsResult withInsights(java.util.Collection<Insight> insights) {
        setInsights(insights);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     *
     * @return <p>
     *         The pagination token to use to request the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The pagination token to use to request the next page of
     *            results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The pagination token to use to request the next page of
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInsightsResult withNextToken(String nextToken) {
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
        if (getInsights() != null)
            sb.append("Insights: " + getInsights() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsights() == null) ? 0 : getInsights().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInsightsResult == false)
            return false;
        GetInsightsResult other = (GetInsightsResult) obj;

        if (other.getInsights() == null ^ this.getInsights() == null)
            return false;
        if (other.getInsights() != null && other.getInsights().equals(this.getInsights()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
