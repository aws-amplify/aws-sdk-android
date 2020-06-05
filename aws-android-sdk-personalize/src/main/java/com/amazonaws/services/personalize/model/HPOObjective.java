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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

/**
 * <p>
 * The metric to optimize during hyperparameter optimization (HPO).
 * </p>
 */
public class HPOObjective implements Serializable {
    /**
     * <p>
     * The type of the metric. Valid values are <code>Maximize</code> and
     * <code>Minimize</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String type;

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String metricName;

    /**
     * <p>
     * A regular expression for finding the metric in the training job logs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String metricRegex;

    /**
     * <p>
     * The type of the metric. Valid values are <code>Maximize</code> and
     * <code>Minimize</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The type of the metric. Valid values are <code>Maximize</code>
     *         and <code>Minimize</code>.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the metric. Valid values are <code>Maximize</code> and
     * <code>Minimize</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param type <p>
     *            The type of the metric. Valid values are <code>Maximize</code>
     *            and <code>Minimize</code>.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the metric. Valid values are <code>Maximize</code> and
     * <code>Minimize</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param type <p>
     *            The type of the metric. Valid values are <code>Maximize</code>
     *            and <code>Minimize</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HPOObjective withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param metricName <p>
     *            The name of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HPOObjective withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * A regular expression for finding the metric in the training job logs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         A regular expression for finding the metric in the training job
     *         logs.
     *         </p>
     */
    public String getMetricRegex() {
        return metricRegex;
    }

    /**
     * <p>
     * A regular expression for finding the metric in the training job logs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param metricRegex <p>
     *            A regular expression for finding the metric in the training
     *            job logs.
     *            </p>
     */
    public void setMetricRegex(String metricRegex) {
        this.metricRegex = metricRegex;
    }

    /**
     * <p>
     * A regular expression for finding the metric in the training job logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param metricRegex <p>
     *            A regular expression for finding the metric in the training
     *            job logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HPOObjective withMetricRegex(String metricRegex) {
        this.metricRegex = metricRegex;
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
            sb.append("type: " + getType() + ",");
        if (getMetricName() != null)
            sb.append("metricName: " + getMetricName() + ",");
        if (getMetricRegex() != null)
            sb.append("metricRegex: " + getMetricRegex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode
                + ((getMetricRegex() == null) ? 0 : getMetricRegex().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HPOObjective == false)
            return false;
        HPOObjective other = (HPOObjective) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMetricRegex() == null ^ this.getMetricRegex() == null)
            return false;
        if (other.getMetricRegex() != null
                && other.getMetricRegex().equals(this.getMetricRegex()) == false)
            return false;
        return true;
    }
}
