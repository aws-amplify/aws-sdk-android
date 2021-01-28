/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class ListCustomMetricsResult implements Serializable {
    /**
     * <p>
     * The name of the custom metric.
     * </p>
     */
    private java.util.List<String> metricNames;

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the custom metric.
     * </p>
     *
     * @return <p>
     *         The name of the custom metric.
     *         </p>
     */
    public java.util.List<String> getMetricNames() {
        return metricNames;
    }

    /**
     * <p>
     * The name of the custom metric.
     * </p>
     *
     * @param metricNames <p>
     *            The name of the custom metric.
     *            </p>
     */
    public void setMetricNames(java.util.Collection<String> metricNames) {
        if (metricNames == null) {
            this.metricNames = null;
            return;
        }

        this.metricNames = new java.util.ArrayList<String>(metricNames);
    }

    /**
     * <p>
     * The name of the custom metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricNames <p>
     *            The name of the custom metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCustomMetricsResult withMetricNames(String... metricNames) {
        if (getMetricNames() == null) {
            this.metricNames = new java.util.ArrayList<String>(metricNames.length);
        }
        for (String value : metricNames) {
            this.metricNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The name of the custom metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricNames <p>
     *            The name of the custom metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCustomMetricsResult withMetricNames(java.util.Collection<String> metricNames) {
        setMetricNames(metricNames);
        return this;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     *
     * @return <p>
     *         A token that can be used to retrieve the next set of results, or
     *         <code>null</code> if there are no additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     *
     * @param nextToken <p>
     *            A token that can be used to retrieve the next set of results,
     *            or <code>null</code> if there are no additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token that can be used to retrieve the next set of results,
     *            or <code>null</code> if there are no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCustomMetricsResult withNextToken(String nextToken) {
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
        if (getMetricNames() != null)
            sb.append("metricNames: " + getMetricNames() + ",");
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
                + ((getMetricNames() == null) ? 0 : getMetricNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCustomMetricsResult == false)
            return false;
        ListCustomMetricsResult other = (ListCustomMetricsResult) obj;

        if (other.getMetricNames() == null ^ this.getMetricNames() == null)
            return false;
        if (other.getMetricNames() != null
                && other.getMetricNames().equals(this.getMetricNames()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
