/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * The candidate result from a job.
 * </p>
 */
public class FinalAutoMLJobObjectiveMetric implements Serializable {
    /**
     * <p>
     * The metric type used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximize, Minimize
     */
    private String type;

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Accuracy, MSE, F1, F1macro
     */
    private String metricName;

    /**
     * <p>
     * The value of the metric.
     * </p>
     */
    private Float value;

    /**
     * <p>
     * The metric type used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximize, Minimize
     *
     * @return <p>
     *         The metric type used.
     *         </p>
     * @see AutoMLJobObjectiveType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The metric type used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximize, Minimize
     *
     * @param type <p>
     *            The metric type used.
     *            </p>
     * @see AutoMLJobObjectiveType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The metric type used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximize, Minimize
     *
     * @param type <p>
     *            The metric type used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoMLJobObjectiveType
     */
    public FinalAutoMLJobObjectiveMetric withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The metric type used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximize, Minimize
     *
     * @param type <p>
     *            The metric type used.
     *            </p>
     * @see AutoMLJobObjectiveType
     */
    public void setType(AutoMLJobObjectiveType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The metric type used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximize, Minimize
     *
     * @param type <p>
     *            The metric type used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoMLJobObjectiveType
     */
    public FinalAutoMLJobObjectiveMetric withType(AutoMLJobObjectiveType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Accuracy, MSE, F1, F1macro
     *
     * @return <p>
     *         The name of the metric.
     *         </p>
     * @see AutoMLMetricEnum
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Accuracy, MSE, F1, F1macro
     *
     * @param metricName <p>
     *            The name of the metric.
     *            </p>
     * @see AutoMLMetricEnum
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Accuracy, MSE, F1, F1macro
     *
     * @param metricName <p>
     *            The name of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoMLMetricEnum
     */
    public FinalAutoMLJobObjectiveMetric withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Accuracy, MSE, F1, F1macro
     *
     * @param metricName <p>
     *            The name of the metric.
     *            </p>
     * @see AutoMLMetricEnum
     */
    public void setMetricName(AutoMLMetricEnum metricName) {
        this.metricName = metricName.toString();
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Accuracy, MSE, F1, F1macro
     *
     * @param metricName <p>
     *            The name of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoMLMetricEnum
     */
    public FinalAutoMLJobObjectiveMetric withMetricName(AutoMLMetricEnum metricName) {
        this.metricName = metricName.toString();
        return this;
    }

    /**
     * <p>
     * The value of the metric.
     * </p>
     *
     * @return <p>
     *         The value of the metric.
     *         </p>
     */
    public Float getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the metric.
     * </p>
     *
     * @param value <p>
     *            The value of the metric.
     *            </p>
     */
    public void setValue(Float value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FinalAutoMLJobObjectiveMetric withValue(Float value) {
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getMetricName() != null)
            sb.append("MetricName: " + getMetricName() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FinalAutoMLJobObjectiveMetric == false)
            return false;
        FinalAutoMLJobObjectiveMetric other = (FinalAutoMLJobObjectiveMetric) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
