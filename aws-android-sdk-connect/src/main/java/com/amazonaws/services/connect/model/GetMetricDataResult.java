/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * A string returned in the response. Use the value returned in the response
     * as the value of the NextToken in a subsequent request to retrieve the
     * next set of results.
     * </p>
     * <p>
     * The token expires after 5 minutes from the time it is created. Subsequent
     * requests that use the NextToken must use the same request parameters as
     * the request that generated the token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>HistoricalMetricResult</code> objects, organized by
     * <code>Dimensions</code>, which is the ID of the resource specified in the
     * <code>Filters</code> used for the request. The metrics are combined with
     * the metrics included in <code>Collections</code>, which is a list of
     * <code>HisotricalMetricData</code> objects.
     * </p>
     * <p>
     * If no <code>Grouping</code> is specified in the request,
     * <code>Collections</code> includes summary data for the
     * <code>HistoricalMetrics</code>.
     * </p>
     */
    private java.util.List<HistoricalMetricResult> metricResults;

    /**
     * <p>
     * A string returned in the response. Use the value returned in the response
     * as the value of the NextToken in a subsequent request to retrieve the
     * next set of results.
     * </p>
     * <p>
     * The token expires after 5 minutes from the time it is created. Subsequent
     * requests that use the NextToken must use the same request parameters as
     * the request that generated the token.
     * </p>
     *
     * @return <p>
     *         A string returned in the response. Use the value returned in the
     *         response as the value of the NextToken in a subsequent request to
     *         retrieve the next set of results.
     *         </p>
     *         <p>
     *         The token expires after 5 minutes from the time it is created.
     *         Subsequent requests that use the NextToken must use the same
     *         request parameters as the request that generated the token.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A string returned in the response. Use the value returned in the response
     * as the value of the NextToken in a subsequent request to retrieve the
     * next set of results.
     * </p>
     * <p>
     * The token expires after 5 minutes from the time it is created. Subsequent
     * requests that use the NextToken must use the same request parameters as
     * the request that generated the token.
     * </p>
     *
     * @param nextToken <p>
     *            A string returned in the response. Use the value returned in
     *            the response as the value of the NextToken in a subsequent
     *            request to retrieve the next set of results.
     *            </p>
     *            <p>
     *            The token expires after 5 minutes from the time it is created.
     *            Subsequent requests that use the NextToken must use the same
     *            request parameters as the request that generated the token.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string returned in the response. Use the value returned in the response
     * as the value of the NextToken in a subsequent request to retrieve the
     * next set of results.
     * </p>
     * <p>
     * The token expires after 5 minutes from the time it is created. Subsequent
     * requests that use the NextToken must use the same request parameters as
     * the request that generated the token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A string returned in the response. Use the value returned in
     *            the response as the value of the NextToken in a subsequent
     *            request to retrieve the next set of results.
     *            </p>
     *            <p>
     *            The token expires after 5 minutes from the time it is created.
     *            Subsequent requests that use the NextToken must use the same
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
     * A list of <code>HistoricalMetricResult</code> objects, organized by
     * <code>Dimensions</code>, which is the ID of the resource specified in the
     * <code>Filters</code> used for the request. The metrics are combined with
     * the metrics included in <code>Collections</code>, which is a list of
     * <code>HisotricalMetricData</code> objects.
     * </p>
     * <p>
     * If no <code>Grouping</code> is specified in the request,
     * <code>Collections</code> includes summary data for the
     * <code>HistoricalMetrics</code>.
     * </p>
     *
     * @return <p>
     *         A list of <code>HistoricalMetricResult</code> objects, organized
     *         by <code>Dimensions</code>, which is the ID of the resource
     *         specified in the <code>Filters</code> used for the request. The
     *         metrics are combined with the metrics included in
     *         <code>Collections</code>, which is a list of
     *         <code>HisotricalMetricData</code> objects.
     *         </p>
     *         <p>
     *         If no <code>Grouping</code> is specified in the request,
     *         <code>Collections</code> includes summary data for the
     *         <code>HistoricalMetrics</code>.
     *         </p>
     */
    public java.util.List<HistoricalMetricResult> getMetricResults() {
        return metricResults;
    }

    /**
     * <p>
     * A list of <code>HistoricalMetricResult</code> objects, organized by
     * <code>Dimensions</code>, which is the ID of the resource specified in the
     * <code>Filters</code> used for the request. The metrics are combined with
     * the metrics included in <code>Collections</code>, which is a list of
     * <code>HisotricalMetricData</code> objects.
     * </p>
     * <p>
     * If no <code>Grouping</code> is specified in the request,
     * <code>Collections</code> includes summary data for the
     * <code>HistoricalMetrics</code>.
     * </p>
     *
     * @param metricResults <p>
     *            A list of <code>HistoricalMetricResult</code> objects,
     *            organized by <code>Dimensions</code>, which is the ID of the
     *            resource specified in the <code>Filters</code> used for the
     *            request. The metrics are combined with the metrics included in
     *            <code>Collections</code>, which is a list of
     *            <code>HisotricalMetricData</code> objects.
     *            </p>
     *            <p>
     *            If no <code>Grouping</code> is specified in the request,
     *            <code>Collections</code> includes summary data for the
     *            <code>HistoricalMetrics</code>.
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
     * A list of <code>HistoricalMetricResult</code> objects, organized by
     * <code>Dimensions</code>, which is the ID of the resource specified in the
     * <code>Filters</code> used for the request. The metrics are combined with
     * the metrics included in <code>Collections</code>, which is a list of
     * <code>HisotricalMetricData</code> objects.
     * </p>
     * <p>
     * If no <code>Grouping</code> is specified in the request,
     * <code>Collections</code> includes summary data for the
     * <code>HistoricalMetrics</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricResults <p>
     *            A list of <code>HistoricalMetricResult</code> objects,
     *            organized by <code>Dimensions</code>, which is the ID of the
     *            resource specified in the <code>Filters</code> used for the
     *            request. The metrics are combined with the metrics included in
     *            <code>Collections</code>, which is a list of
     *            <code>HisotricalMetricData</code> objects.
     *            </p>
     *            <p>
     *            If no <code>Grouping</code> is specified in the request,
     *            <code>Collections</code> includes summary data for the
     *            <code>HistoricalMetrics</code>.
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
     * A list of <code>HistoricalMetricResult</code> objects, organized by
     * <code>Dimensions</code>, which is the ID of the resource specified in the
     * <code>Filters</code> used for the request. The metrics are combined with
     * the metrics included in <code>Collections</code>, which is a list of
     * <code>HisotricalMetricData</code> objects.
     * </p>
     * <p>
     * If no <code>Grouping</code> is specified in the request,
     * <code>Collections</code> includes summary data for the
     * <code>HistoricalMetrics</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricResults <p>
     *            A list of <code>HistoricalMetricResult</code> objects,
     *            organized by <code>Dimensions</code>, which is the ID of the
     *            resource specified in the <code>Filters</code> used for the
     *            request. The metrics are combined with the metrics included in
     *            <code>Collections</code>, which is a list of
     *            <code>HisotricalMetricData</code> objects.
     *            </p>
     *            <p>
     *            If no <code>Grouping</code> is specified in the request,
     *            <code>Collections</code> includes summary data for the
     *            <code>HistoricalMetrics</code>.
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
