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
 * A Device Defender security profile behavior.
 * </p>
 */
public class Behavior implements Serializable {
    /**
     * <p>
     * The name you've given to the behavior.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String name;

    /**
     * <p>
     * What is measured by the behavior.
     * </p>
     */
    private String metric;

    /**
     * <p>
     * The dimension for a metric in your behavior. For example, using a
     * <code>TOPIC_FILTER</code> dimension, you can narrow down the scope of the
     * metric to only MQTT topics where the name matches the pattern specified
     * in the dimension. This can't be used with custom metrics.
     * </p>
     */
    private MetricDimension metricDimension;

    /**
     * <p>
     * The criteria that determine if a device is behaving normally in regard to
     * the <code>metric</code>.
     * </p>
     */
    private BehaviorCriteria criteria;

    /**
     * <p>
     * Suppresses alerts.
     * </p>
     */
    private Boolean suppressAlerts;

    /**
     * <p>
     * The name you've given to the behavior.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name you've given to the behavior.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name you've given to the behavior.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param name <p>
     *            The name you've given to the behavior.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name you've given to the behavior.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param name <p>
     *            The name you've given to the behavior.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Behavior withName(String name) {
        this.name = name;
        return this;
    }

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
    public Behavior withMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * <p>
     * The dimension for a metric in your behavior. For example, using a
     * <code>TOPIC_FILTER</code> dimension, you can narrow down the scope of the
     * metric to only MQTT topics where the name matches the pattern specified
     * in the dimension. This can't be used with custom metrics.
     * </p>
     *
     * @return <p>
     *         The dimension for a metric in your behavior. For example, using a
     *         <code>TOPIC_FILTER</code> dimension, you can narrow down the
     *         scope of the metric to only MQTT topics where the name matches
     *         the pattern specified in the dimension. This can't be used with
     *         custom metrics.
     *         </p>
     */
    public MetricDimension getMetricDimension() {
        return metricDimension;
    }

    /**
     * <p>
     * The dimension for a metric in your behavior. For example, using a
     * <code>TOPIC_FILTER</code> dimension, you can narrow down the scope of the
     * metric to only MQTT topics where the name matches the pattern specified
     * in the dimension. This can't be used with custom metrics.
     * </p>
     *
     * @param metricDimension <p>
     *            The dimension for a metric in your behavior. For example,
     *            using a <code>TOPIC_FILTER</code> dimension, you can narrow
     *            down the scope of the metric to only MQTT topics where the
     *            name matches the pattern specified in the dimension. This
     *            can't be used with custom metrics.
     *            </p>
     */
    public void setMetricDimension(MetricDimension metricDimension) {
        this.metricDimension = metricDimension;
    }

    /**
     * <p>
     * The dimension for a metric in your behavior. For example, using a
     * <code>TOPIC_FILTER</code> dimension, you can narrow down the scope of the
     * metric to only MQTT topics where the name matches the pattern specified
     * in the dimension. This can't be used with custom metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricDimension <p>
     *            The dimension for a metric in your behavior. For example,
     *            using a <code>TOPIC_FILTER</code> dimension, you can narrow
     *            down the scope of the metric to only MQTT topics where the
     *            name matches the pattern specified in the dimension. This
     *            can't be used with custom metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Behavior withMetricDimension(MetricDimension metricDimension) {
        this.metricDimension = metricDimension;
        return this;
    }

    /**
     * <p>
     * The criteria that determine if a device is behaving normally in regard to
     * the <code>metric</code>.
     * </p>
     *
     * @return <p>
     *         The criteria that determine if a device is behaving normally in
     *         regard to the <code>metric</code>.
     *         </p>
     */
    public BehaviorCriteria getCriteria() {
        return criteria;
    }

    /**
     * <p>
     * The criteria that determine if a device is behaving normally in regard to
     * the <code>metric</code>.
     * </p>
     *
     * @param criteria <p>
     *            The criteria that determine if a device is behaving normally
     *            in regard to the <code>metric</code>.
     *            </p>
     */
    public void setCriteria(BehaviorCriteria criteria) {
        this.criteria = criteria;
    }

    /**
     * <p>
     * The criteria that determine if a device is behaving normally in regard to
     * the <code>metric</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param criteria <p>
     *            The criteria that determine if a device is behaving normally
     *            in regard to the <code>metric</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Behavior withCriteria(BehaviorCriteria criteria) {
        this.criteria = criteria;
        return this;
    }

    /**
     * <p>
     * Suppresses alerts.
     * </p>
     *
     * @return <p>
     *         Suppresses alerts.
     *         </p>
     */
    public Boolean isSuppressAlerts() {
        return suppressAlerts;
    }

    /**
     * <p>
     * Suppresses alerts.
     * </p>
     *
     * @return <p>
     *         Suppresses alerts.
     *         </p>
     */
    public Boolean getSuppressAlerts() {
        return suppressAlerts;
    }

    /**
     * <p>
     * Suppresses alerts.
     * </p>
     *
     * @param suppressAlerts <p>
     *            Suppresses alerts.
     *            </p>
     */
    public void setSuppressAlerts(Boolean suppressAlerts) {
        this.suppressAlerts = suppressAlerts;
    }

    /**
     * <p>
     * Suppresses alerts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param suppressAlerts <p>
     *            Suppresses alerts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Behavior withSuppressAlerts(Boolean suppressAlerts) {
        this.suppressAlerts = suppressAlerts;
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
            sb.append("name: " + getName() + ",");
        if (getMetric() != null)
            sb.append("metric: " + getMetric() + ",");
        if (getMetricDimension() != null)
            sb.append("metricDimension: " + getMetricDimension() + ",");
        if (getCriteria() != null)
            sb.append("criteria: " + getCriteria() + ",");
        if (getSuppressAlerts() != null)
            sb.append("suppressAlerts: " + getSuppressAlerts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode
                + ((getMetricDimension() == null) ? 0 : getMetricDimension().hashCode());
        hashCode = prime * hashCode + ((getCriteria() == null) ? 0 : getCriteria().hashCode());
        hashCode = prime * hashCode
                + ((getSuppressAlerts() == null) ? 0 : getSuppressAlerts().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Behavior == false)
            return false;
        Behavior other = (Behavior) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getMetricDimension() == null ^ this.getMetricDimension() == null)
            return false;
        if (other.getMetricDimension() != null
                && other.getMetricDimension().equals(this.getMetricDimension()) == false)
            return false;
        if (other.getCriteria() == null ^ this.getCriteria() == null)
            return false;
        if (other.getCriteria() != null && other.getCriteria().equals(this.getCriteria()) == false)
            return false;
        if (other.getSuppressAlerts() == null ^ this.getSuppressAlerts() == null)
            return false;
        if (other.getSuppressAlerts() != null
                && other.getSuppressAlerts().equals(this.getSuppressAlerts()) == false)
            return false;
        return true;
    }
}
