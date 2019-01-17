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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

public class DescribeMetricCollectionTypesResult implements Serializable {
    /**
     * <p>
     * One or more metrics.
     * </p>
     */
    private java.util.List<MetricCollectionType> metrics = new java.util.ArrayList<MetricCollectionType>();

    /**
     * <p>
     * The granularities for the metrics.
     * </p>
     */
    private java.util.List<MetricGranularityType> granularities = new java.util.ArrayList<MetricGranularityType>();

    /**
     * <p>
     * One or more metrics.
     * </p>
     *
     * @return <p>
     *         One or more metrics.
     *         </p>
     */
    public java.util.List<MetricCollectionType> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * One or more metrics.
     * </p>
     *
     * @param metrics <p>
     *            One or more metrics.
     *            </p>
     */
    public void setMetrics(java.util.Collection<MetricCollectionType> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new java.util.ArrayList<MetricCollectionType>(metrics);
    }

    /**
     * <p>
     * One or more metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics <p>
     *            One or more metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMetricCollectionTypesResult withMetrics(MetricCollectionType... metrics) {
        if (getMetrics() == null) {
            this.metrics = new java.util.ArrayList<MetricCollectionType>(metrics.length);
        }
        for (MetricCollectionType value : metrics) {
            this.metrics.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics <p>
     *            One or more metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMetricCollectionTypesResult withMetrics(
            java.util.Collection<MetricCollectionType> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * The granularities for the metrics.
     * </p>
     *
     * @return <p>
     *         The granularities for the metrics.
     *         </p>
     */
    public java.util.List<MetricGranularityType> getGranularities() {
        return granularities;
    }

    /**
     * <p>
     * The granularities for the metrics.
     * </p>
     *
     * @param granularities <p>
     *            The granularities for the metrics.
     *            </p>
     */
    public void setGranularities(java.util.Collection<MetricGranularityType> granularities) {
        if (granularities == null) {
            this.granularities = null;
            return;
        }

        this.granularities = new java.util.ArrayList<MetricGranularityType>(granularities);
    }

    /**
     * <p>
     * The granularities for the metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param granularities <p>
     *            The granularities for the metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMetricCollectionTypesResult withGranularities(
            MetricGranularityType... granularities) {
        if (getGranularities() == null) {
            this.granularities = new java.util.ArrayList<MetricGranularityType>(
                    granularities.length);
        }
        for (MetricGranularityType value : granularities) {
            this.granularities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The granularities for the metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param granularities <p>
     *            The granularities for the metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMetricCollectionTypesResult withGranularities(
            java.util.Collection<MetricGranularityType> granularities) {
        setGranularities(granularities);
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
        if (getMetrics() != null)
            sb.append("Metrics: " + getMetrics() + ",");
        if (getGranularities() != null)
            sb.append("Granularities: " + getGranularities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode
                + ((getGranularities() == null) ? 0 : getGranularities().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMetricCollectionTypesResult == false)
            return false;
        DescribeMetricCollectionTypesResult other = (DescribeMetricCollectionTypesResult) obj;

        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getGranularities() == null ^ this.getGranularities() == null)
            return false;
        if (other.getGranularities() != null
                && other.getGranularities().equals(this.getGranularities()) == false)
            return false;
        return true;
    }
}
