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

/**
 * <p>
 * A <code>HistoricalMetricData</code> object than contains a
 * <code>Metric</code> and a <code>Value</code>.
 * </p>
 */
public class HistoricalMetricData implements Serializable {
    /**
     * <p>
     * A <code>HistoricalMetric</code> object.
     * </p>
     */
    private HistoricalMetric metric;

    /**
     * <p>
     * The <code>Value</code> of the metric.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * A <code>HistoricalMetric</code> object.
     * </p>
     *
     * @return <p>
     *         A <code>HistoricalMetric</code> object.
     *         </p>
     */
    public HistoricalMetric getMetric() {
        return metric;
    }

    /**
     * <p>
     * A <code>HistoricalMetric</code> object.
     * </p>
     *
     * @param metric <p>
     *            A <code>HistoricalMetric</code> object.
     *            </p>
     */
    public void setMetric(HistoricalMetric metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * A <code>HistoricalMetric</code> object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metric <p>
     *            A <code>HistoricalMetric</code> object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HistoricalMetricData withMetric(HistoricalMetric metric) {
        this.metric = metric;
        return this;
    }

    /**
     * <p>
     * The <code>Value</code> of the metric.
     * </p>
     *
     * @return <p>
     *         The <code>Value</code> of the metric.
     *         </p>
     */
    public Double getValue() {
        return value;
    }

    /**
     * <p>
     * The <code>Value</code> of the metric.
     * </p>
     *
     * @param value <p>
     *            The <code>Value</code> of the metric.
     *            </p>
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The <code>Value</code> of the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The <code>Value</code> of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HistoricalMetricData withValue(Double value) {
        this.value = value;
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
            sb.append("Metric: " + getMetric() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HistoricalMetricData == false)
            return false;
        HistoricalMetricData other = (HistoricalMetricData) obj;

        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
