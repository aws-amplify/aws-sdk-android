/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class GetMetricDataResult implements Serializable {
    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * The token expires after 5 minutes from the time it is created. Subsequent
     * requests that use the token must use the same request parameters as the
     * request that generated the token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the historical metrics.
     * </p>
     * <p>
     * If no grouping is specified, a summary of metric data is returned.
     * </p>
     */
    private java.util.List<HistoricalMetricResult> metricResults;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * The token expires after 5 minutes from the time it is created. Subsequent
     * requests that use the token must use the same request parameters as the
     * request that generated the token.
     * </p>
     *
     * @return <p>
     *         If there are additional results, this is the token for the next
     *         set of results.
     *         </p>
     *         <p>
     *         The token expires after 5 minutes from the time it is created.
     *         Subsequent requests that use the token must use the same request
     *         parameters as the request that generated the token.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * The token expires after 5 minutes from the time it is created. Subsequent
     * requests that use the token must use the same request parameters as the
     * request that generated the token.
     * </p>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     *            <p>
     *            The token expires after 5 minutes from the time it is created.
     *            Subsequent requests that use the token must use the same
     *            request parameters as the request that generated the token.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * The token expires after 5 minutes from the time it is created. Subsequent
     * requests that use the token must use the same request parameters as the
     * request that generated the token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     *            <p>
     *            The token expires after 5 minutes from the time it is created.
     *            Subsequent requests that use the token must use the same
     *            request parameters as the request that generated the token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Information about the historical metrics.
     * </p>
     * <p>
     * If no grouping is specified, a summary of metric data is returned.
     * </p>
     *
     * @return <p>
     *         Information about the historical metrics.
     *         </p>
     *         <p>
     *         If no grouping is specified, a summary of metric data is
     *         returned.
     *         </p>
     */
    public java.util.List<HistoricalMetricResult> getMetricResults() {
        return metricResults;
    }

    /**
     * <p>
     * Information about the historical metrics.
     * </p>
     * <p>
     * If no grouping is specified, a summary of metric data is returned.
     * </p>
     *
     * @param metricResults <p>
     *            Information about the historical metrics.
     *            </p>
     *            <p>
     *            If no grouping is specified, a summary of metric data is
     *            returned.
     *            </p>
     */
    public void setMetricResults(java.util.Collection<HistoricalMetricResult> metricResults) {
        if (metricResults == null) {
            this.metricResults = null;
            return;
        }

        this.metricResults = new java.util.ArrayList<HistoricalMetricResult>(metricResults);
    }

    /**
     * <p>
     * Information about the historical metrics.
     * </p>
     * <p>
     * If no grouping is specified, a summary of metric data is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricResults <p>
     *            Information about the historical metrics.
     *            </p>
     *            <p>
     *            If no grouping is specified, a summary of metric data is
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataResult withMetricResults(HistoricalMetricResult... metricResults) {
        if (getMetricResults() == null) {
            this.metricResults = new java.util.ArrayList<HistoricalMetricResult>(
                    metricResults.length);
        }
        for (HistoricalMetricResult value : metricResults) {
            this.metricResults.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the historical metrics.
     * </p>
     * <p>
     * If no grouping is specified, a summary of metric data is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricResults <p>
     *            Information about the historical metrics.
     *            </p>
     *            <p>
     *            If no grouping is specified, a summary of metric data is
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataResult withMetricResults(
            java.util.Collection<HistoricalMetricResult> metricResults) {
        setMetricResults(metricResults);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMetricResults() != null)
            sb.append("MetricResults: " + getMetricResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getMetricResults() == null) ? 0 : getMetricResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMetricDataResult == false)
            return false;
        GetMetricDataResult other = (GetMetricDataResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMetricResults() == null ^ this.getMetricResults() == null)
            return false;
        if (other.getMetricResults() != null
                && other.getMetricResults().equals(this.getMetricResults()) == false)
            return false;
        return true;
    }
}
