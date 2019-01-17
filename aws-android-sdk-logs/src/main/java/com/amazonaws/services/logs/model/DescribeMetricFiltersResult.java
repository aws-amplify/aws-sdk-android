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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

public class DescribeMetricFiltersResult implements Serializable {
    /**
     * <p>
     * The metric filters.
     * </p>
     */
    private java.util.List<MetricFilter> metricFilters;

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * <p>
     * The metric filters.
     * </p>
     *
     * @return <p>
     *         The metric filters.
     *         </p>
     */
    public java.util.List<MetricFilter> getMetricFilters() {
        return metricFilters;
    }

    /**
     * <p>
     * The metric filters.
     * </p>
     *
     * @param metricFilters <p>
     *            The metric filters.
     *            </p>
     */
    public void setMetricFilters(java.util.Collection<MetricFilter> metricFilters) {
        if (metricFilters == null) {
            this.metricFilters = null;
            return;
        }

        this.metricFilters = new java.util.ArrayList<MetricFilter>(metricFilters);
    }

    /**
     * <p>
     * The metric filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricFilters <p>
     *            The metric filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMetricFiltersResult withMetricFilters(MetricFilter... metricFilters) {
        if (getMetricFilters() == null) {
            this.metricFilters = new java.util.ArrayList<MetricFilter>(metricFilters.length);
        }
        for (MetricFilter value : metricFilters) {
            this.metricFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The metric filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricFilters <p>
     *            The metric filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMetricFiltersResult withMetricFilters(
            java.util.Collection<MetricFilter> metricFilters) {
        setMetricFilters(metricFilters);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The token for the next set of items to return. The token expires
     *         after 24 hours.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. The token
     *            expires after 24 hours.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. The token
     *            expires after 24 hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMetricFiltersResult withNextToken(String nextToken) {
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
        if (getMetricFilters() != null)
            sb.append("metricFilters: " + getMetricFilters() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMetricFilters() == null) ? 0 : getMetricFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMetricFiltersResult == false)
            return false;
        DescribeMetricFiltersResult other = (DescribeMetricFiltersResult) obj;

        if (other.getMetricFilters() == null ^ this.getMetricFilters() == null)
            return false;
        if (other.getMetricFilters() != null
                && other.getMetricFilters().equals(this.getMetricFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
