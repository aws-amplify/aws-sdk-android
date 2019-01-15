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

/**
 * <p>
 * Configures a customized metric for a target tracking policy.
 * </p>
 */
public class CustomizedMetricSpecification implements Serializable {
    /**
     * <p>
     * The name of the metric.
     * </p>
     */
    private String metricName;

    /**
     * <p>
     * The namespace of the metric.
     * </p>
     */
    private String namespace;

    /**
     * <p>
     * The dimensions of the metric.
     * </p>
     */
    private java.util.List<MetricDimension> dimensions = new java.util.ArrayList<MetricDimension>();

    /**
     * <p>
     * The statistic of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Average, Minimum, Maximum, SampleCount, Sum
     */
    private String statistic;

    /**
     * <p>
     * The unit of the metric.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The name of the metric.
     * </p>
     *
     * @return <p>
     *         The name of the metric.
     *         </p>
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     *
     * @param metricName <p>
     *            The name of the metric.
     *            </p>
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricName <p>
     *            The name of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomizedMetricSpecification withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * The namespace of the metric.
     * </p>
     *
     * @return <p>
     *         The namespace of the metric.
     *         </p>
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <p>
     * The namespace of the metric.
     * </p>
     *
     * @param namespace <p>
     *            The namespace of the metric.
     *            </p>
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param namespace <p>
     *            The namespace of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomizedMetricSpecification withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * <p>
     * The dimensions of the metric.
     * </p>
     *
     * @return <p>
     *         The dimensions of the metric.
     *         </p>
     */
    public java.util.List<MetricDimension> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * The dimensions of the metric.
     * </p>
     *
     * @param dimensions <p>
     *            The dimensions of the metric.
     *            </p>
     */
    public void setDimensions(java.util.Collection<MetricDimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new java.util.ArrayList<MetricDimension>(dimensions);
    }

    /**
     * <p>
     * The dimensions of the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            The dimensions of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomizedMetricSpecification withDimensions(MetricDimension... dimensions) {
        if (getDimensions() == null) {
            this.dimensions = new java.util.ArrayList<MetricDimension>(dimensions.length);
        }
        for (MetricDimension value : dimensions) {
            this.dimensions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The dimensions of the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            The dimensions of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomizedMetricSpecification withDimensions(
            java.util.Collection<MetricDimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The statistic of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Average, Minimum, Maximum, SampleCount, Sum
     *
     * @return <p>
     *         The statistic of the metric.
     *         </p>
     * @see MetricStatistic
     */
    public String getStatistic() {
        return statistic;
    }

    /**
     * <p>
     * The statistic of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Average, Minimum, Maximum, SampleCount, Sum
     *
     * @param statistic <p>
     *            The statistic of the metric.
     *            </p>
     * @see MetricStatistic
     */
    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The statistic of the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Average, Minimum, Maximum, SampleCount, Sum
     *
     * @param statistic <p>
     *            The statistic of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MetricStatistic
     */
    public CustomizedMetricSpecification withStatistic(String statistic) {
        this.statistic = statistic;
        return this;
    }

    /**
     * <p>
     * The statistic of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Average, Minimum, Maximum, SampleCount, Sum
     *
     * @param statistic <p>
     *            The statistic of the metric.
     *            </p>
     * @see MetricStatistic
     */
    public void setStatistic(MetricStatistic statistic) {
        this.statistic = statistic.toString();
    }

    /**
     * <p>
     * The statistic of the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Average, Minimum, Maximum, SampleCount, Sum
     *
     * @param statistic <p>
     *            The statistic of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MetricStatistic
     */
    public CustomizedMetricSpecification withStatistic(MetricStatistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>
     * The unit of the metric.
     * </p>
     *
     * @return <p>
     *         The unit of the metric.
     *         </p>
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * The unit of the metric.
     * </p>
     *
     * @param unit <p>
     *            The unit of the metric.
     *            </p>
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unit <p>
     *            The unit of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomizedMetricSpecification withUnit(String unit) {
        this.unit = unit;
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
        if (getMetricName() != null)
            sb.append("MetricName: " + getMetricName() + ",");
        if (getNamespace() != null)
            sb.append("Namespace: " + getNamespace() + ",");
        if (getDimensions() != null)
            sb.append("Dimensions: " + getDimensions() + ",");
        if (getStatistic() != null)
            sb.append("Statistic: " + getStatistic() + ",");
        if (getUnit() != null)
            sb.append("Unit: " + getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomizedMetricSpecification == false)
            return false;
        CustomizedMetricSpecification other = (CustomizedMetricSpecification) obj;

        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null
                && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null
                && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null
                && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }
}
