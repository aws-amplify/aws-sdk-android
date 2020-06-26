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
 * Defines the objective metric for a hyperparameter tuning job. Hyperparameter
 * tuning uses the value of this metric to evaluate the training jobs it
 * launches, and returns the training job that results in either the highest or
 * lowest value for this metric, depending on the value you specify for the
 * <code>Type</code> parameter.
 * </p>
 */
public class HyperParameterTuningJobObjective implements Serializable {
    /**
     * <p>
     * Whether to minimize or maximize the objective metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximize, Minimize
     */
    private String type;

    /**
     * <p>
     * The name of the metric to use for the objective metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String metricName;

    /**
     * <p>
     * Whether to minimize or maximize the objective metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximize, Minimize
     *
     * @return <p>
     *         Whether to minimize or maximize the objective metric.
     *         </p>
     * @see HyperParameterTuningJobObjectiveType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Whether to minimize or maximize the objective metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximize, Minimize
     *
     * @param type <p>
     *            Whether to minimize or maximize the objective metric.
     *            </p>
     * @see HyperParameterTuningJobObjectiveType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Whether to minimize or maximize the objective metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximize, Minimize
     *
     * @param type <p>
     *            Whether to minimize or maximize the objective metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HyperParameterTuningJobObjectiveType
     */
    public HyperParameterTuningJobObjective withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Whether to minimize or maximize the objective metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximize, Minimize
     *
     * @param type <p>
     *            Whether to minimize or maximize the objective metric.
     *            </p>
     * @see HyperParameterTuningJobObjectiveType
     */
    public void setType(HyperParameterTuningJobObjectiveType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Whether to minimize or maximize the objective metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximize, Minimize
     *
     * @param type <p>
     *            Whether to minimize or maximize the objective metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HyperParameterTuningJobObjectiveType
     */
    public HyperParameterTuningJobObjective withType(HyperParameterTuningJobObjectiveType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the metric to use for the objective metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         The name of the metric to use for the objective metric.
     *         </p>
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * The name of the metric to use for the objective metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param metricName <p>
     *            The name of the metric to use for the objective metric.
     *            </p>
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric to use for the objective metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param metricName <p>
     *            The name of the metric to use for the objective metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTuningJobObjective withMetricName(String metricName) {
        this.metricName = metricName;
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
            sb.append("MetricName: " + getMetricName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HyperParameterTuningJobObjective == false)
            return false;
        HyperParameterTuningJobObjective other = (HyperParameterTuningJobObjective) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        return true;
    }
}
