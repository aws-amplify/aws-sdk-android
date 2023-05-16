/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about the metric.
 * </p>
 */
public class MetricV2 implements Serializable {
    /**
     * <p>
     * The name of the metric.
     * </p>
     * <important>
     * <p>
     * This parameter is required. The following Required = No is incorrect.
     * </p>
     * </important>
     */
    private String name;

    /**
     * <p>
     * Contains information about the threshold for service level metrics.
     * </p>
     */
    private java.util.List<ThresholdV2> threshold;

    /**
     * <p>
     * Contains the filters to be used when returning data.
     * </p>
     */
    private java.util.List<MetricFilterV2> metricFilters;

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <important>
     * <p>
     * This parameter is required. The following Required = No is incorrect.
     * </p>
     * </important>
     *
     * @return <p>
     *         The name of the metric.
     *         </p>
     *         <important>
     *         <p>
     *         This parameter is required. The following Required = No is
     *         incorrect.
     *         </p>
     *         </important>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <important>
     * <p>
     * This parameter is required. The following Required = No is incorrect.
     * </p>
     * </important>
     *
     * @param name <p>
     *            The name of the metric.
     *            </p>
     *            <important>
     *            <p>
     *            This parameter is required. The following Required = No is
     *            incorrect.
     *            </p>
     *            </important>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <important>
     * <p>
     * This parameter is required. The following Required = No is incorrect.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the metric.
     *            </p>
     *            <important>
     *            <p>
     *            This parameter is required. The following Required = No is
     *            incorrect.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricV2 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Contains information about the threshold for service level metrics.
     * </p>
     *
     * @return <p>
     *         Contains information about the threshold for service level
     *         metrics.
     *         </p>
     */
    public java.util.List<ThresholdV2> getThreshold() {
        return threshold;
    }

    /**
     * <p>
     * Contains information about the threshold for service level metrics.
     * </p>
     *
     * @param threshold <p>
     *            Contains information about the threshold for service level
     *            metrics.
     *            </p>
     */
    public void setThreshold(java.util.Collection<ThresholdV2> threshold) {
        if (threshold == null) {
            this.threshold = null;
            return;
        }

        this.threshold = new java.util.ArrayList<ThresholdV2>(threshold);
    }

    /**
     * <p>
     * Contains information about the threshold for service level metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param threshold <p>
     *            Contains information about the threshold for service level
     *            metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricV2 withThreshold(ThresholdV2... threshold) {
        if (getThreshold() == null) {
            this.threshold = new java.util.ArrayList<ThresholdV2>(threshold.length);
        }
        for (ThresholdV2 value : threshold) {
            this.threshold.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains information about the threshold for service level metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param threshold <p>
     *            Contains information about the threshold for service level
     *            metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricV2 withThreshold(java.util.Collection<ThresholdV2> threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * Contains the filters to be used when returning data.
     * </p>
     *
     * @return <p>
     *         Contains the filters to be used when returning data.
     *         </p>
     */
    public java.util.List<MetricFilterV2> getMetricFilters() {
        return metricFilters;
    }

    /**
     * <p>
     * Contains the filters to be used when returning data.
     * </p>
     *
     * @param metricFilters <p>
     *            Contains the filters to be used when returning data.
     *            </p>
     */
    public void setMetricFilters(java.util.Collection<MetricFilterV2> metricFilters) {
        if (metricFilters == null) {
            this.metricFilters = null;
            return;
        }

        this.metricFilters = new java.util.ArrayList<MetricFilterV2>(metricFilters);
    }

    /**
     * <p>
     * Contains the filters to be used when returning data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricFilters <p>
     *            Contains the filters to be used when returning data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricV2 withMetricFilters(MetricFilterV2... metricFilters) {
        if (getMetricFilters() == null) {
            this.metricFilters = new java.util.ArrayList<MetricFilterV2>(metricFilters.length);
        }
        for (MetricFilterV2 value : metricFilters) {
            this.metricFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains the filters to be used when returning data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricFilters <p>
     *            Contains the filters to be used when returning data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricV2 withMetricFilters(java.util.Collection<MetricFilterV2> metricFilters) {
        setMetricFilters(metricFilters);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getThreshold() != null)
            sb.append("Threshold: " + getThreshold() + ",");
        if (getMetricFilters() != null)
            sb.append("MetricFilters: " + getMetricFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode
                + ((getMetricFilters() == null) ? 0 : getMetricFilters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricV2 == false)
            return false;
        MetricV2 other = (MetricV2) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null
                && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getMetricFilters() == null ^ this.getMetricFilters() == null)
            return false;
        if (other.getMetricFilters() != null
                && other.getMetricFilters().equals(this.getMetricFilters()) == false)
            return false;
        return true;
    }
}
