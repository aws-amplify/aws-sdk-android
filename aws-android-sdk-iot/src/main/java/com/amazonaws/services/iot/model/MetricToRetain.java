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

/**
 * <p>
 * The metric you want to retain. Dimensions are optional.
 * </p>
 */
public class MetricToRetain implements Serializable {
    /**
     * <p>
     * What is measured by the behavior.
     * </p>
     */
    private String metric;

    /**
     * <p>
     * The dimension of a metric. This can't be used with custom metrics.
     * </p>
     */
    private MetricDimension metricDimension;

    /**
     * <p>
     * What is measured by the behavior.
     * </p>
     *
     * @return <p>
     *         What is measured by the behavior.
     *         </p>
     */
    public String getMetric() {
        return metric;
    }

    /**
     * <p>
     * What is measured by the behavior.
     * </p>
     *
     * @param metric <p>
     *            What is measured by the behavior.
     *            </p>
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * What is measured by the behavior.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metric <p>
     *            What is measured by the behavior.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricToRetain withMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * <p>
     * The dimension of a metric. This can't be used with custom metrics.
     * </p>
     *
     * @return <p>
     *         The dimension of a metric. This can't be used with custom
     *         metrics.
     *         </p>
     */
    public MetricDimension getMetricDimension() {
        return metricDimension;
    }

    /**
     * <p>
     * The dimension of a metric. This can't be used with custom metrics.
     * </p>
     *
     * @param metricDimension <p>
     *            The dimension of a metric. This can't be used with custom
     *            metrics.
     *            </p>
     */
    public void setMetricDimension(MetricDimension metricDimension) {
        this.metricDimension = metricDimension;
    }

    /**
     * <p>
     * The dimension of a metric. This can't be used with custom metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricDimension <p>
     *            The dimension of a metric. This can't be used with custom
     *            metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricToRetain withMetricDimension(MetricDimension metricDimension) {
        this.metricDimension = metricDimension;
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
        if (getMetric() != null)
            sb.append("metric: " + getMetric() + ",");
        if (getMetricDimension() != null)
            sb.append("metricDimension: " + getMetricDimension());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode
                + ((getMetricDimension() == null) ? 0 : getMetricDimension().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricToRetain == false)
            return false;
        MetricToRetain other = (MetricToRetain) obj;

        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getMetricDimension() == null ^ this.getMetricDimension() == null)
            return false;
        if (other.getMetricDimension() != null
                && other.getMetricDimension().equals(this.getMetricDimension()) == false)
            return false;
        return true;
    }
}
