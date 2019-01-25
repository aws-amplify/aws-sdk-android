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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * <p>
 * Indicates how to transform ingested log events in to metric data in a
 * CloudWatch metric.
 * </p>
 */
public class MetricTransformation implements Serializable {
    /**
     * <p>
     * The name of the CloudWatch metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[^:*$]*<br/>
     */
    private String metricName;

    /**
     * <p>
     * The namespace of the CloudWatch metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[^:*$]*<br/>
     */
    private String metricNamespace;

    /**
     * <p>
     * The value to publish to the CloudWatch metric when a filter pattern
     * matches a log event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     */
    private String metricValue;

    /**
     * <p>
     * (Optional) The value to emit when a filter pattern does not match a log
     * event. This value can be null.
     * </p>
     */
    private Double defaultValue;

    /**
     * <p>
     * The name of the CloudWatch metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[^:*$]*<br/>
     *
     * @return <p>
     *         The name of the CloudWatch metric.
     *         </p>
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * The name of the CloudWatch metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[^:*$]*<br/>
     *
     * @param metricName <p>
     *            The name of the CloudWatch metric.
     *            </p>
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the CloudWatch metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[^:*$]*<br/>
     *
     * @param metricName <p>
     *            The name of the CloudWatch metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricTransformation withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * The namespace of the CloudWatch metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[^:*$]*<br/>
     *
     * @return <p>
     *         The namespace of the CloudWatch metric.
     *         </p>
     */
    public String getMetricNamespace() {
        return metricNamespace;
    }

    /**
     * <p>
     * The namespace of the CloudWatch metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[^:*$]*<br/>
     *
     * @param metricNamespace <p>
     *            The namespace of the CloudWatch metric.
     *            </p>
     */
    public void setMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
    }

    /**
     * <p>
     * The namespace of the CloudWatch metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[^:*$]*<br/>
     *
     * @param metricNamespace <p>
     *            The namespace of the CloudWatch metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricTransformation withMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
        return this;
    }

    /**
     * <p>
     * The value to publish to the CloudWatch metric when a filter pattern
     * matches a log event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @return <p>
     *         The value to publish to the CloudWatch metric when a filter
     *         pattern matches a log event.
     *         </p>
     */
    public String getMetricValue() {
        return metricValue;
    }

    /**
     * <p>
     * The value to publish to the CloudWatch metric when a filter pattern
     * matches a log event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param metricValue <p>
     *            The value to publish to the CloudWatch metric when a filter
     *            pattern matches a log event.
     *            </p>
     */
    public void setMetricValue(String metricValue) {
        this.metricValue = metricValue;
    }

    /**
     * <p>
     * The value to publish to the CloudWatch metric when a filter pattern
     * matches a log event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param metricValue <p>
     *            The value to publish to the CloudWatch metric when a filter
     *            pattern matches a log event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricTransformation withMetricValue(String metricValue) {
        this.metricValue = metricValue;
        return this;
    }

    /**
     * <p>
     * (Optional) The value to emit when a filter pattern does not match a log
     * event. This value can be null.
     * </p>
     *
     * @return <p>
     *         (Optional) The value to emit when a filter pattern does not match
     *         a log event. This value can be null.
     *         </p>
     */
    public Double getDefaultValue() {
        return defaultValue;
    }

    /**
     * <p>
     * (Optional) The value to emit when a filter pattern does not match a log
     * event. This value can be null.
     * </p>
     *
     * @param defaultValue <p>
     *            (Optional) The value to emit when a filter pattern does not
     *            match a log event. This value can be null.
     *            </p>
     */
    public void setDefaultValue(Double defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * (Optional) The value to emit when a filter pattern does not match a log
     * event. This value can be null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultValue <p>
     *            (Optional) The value to emit when a filter pattern does not
     *            match a log event. This value can be null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricTransformation withDefaultValue(Double defaultValue) {
        this.defaultValue = defaultValue;
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
            sb.append("metricName: " + getMetricName() + ",");
        if (getMetricNamespace() != null)
            sb.append("metricNamespace: " + getMetricNamespace() + ",");
        if (getMetricValue() != null)
            sb.append("metricValue: " + getMetricValue() + ",");
        if (getDefaultValue() != null)
            sb.append("defaultValue: " + getDefaultValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode
                + ((getMetricNamespace() == null) ? 0 : getMetricNamespace().hashCode());
        hashCode = prime * hashCode
                + ((getMetricValue() == null) ? 0 : getMetricValue().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricTransformation == false)
            return false;
        MetricTransformation other = (MetricTransformation) obj;

        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMetricNamespace() == null ^ this.getMetricNamespace() == null)
            return false;
        if (other.getMetricNamespace() != null
                && other.getMetricNamespace().equals(this.getMetricNamespace()) == false)
            return false;
        if (other.getMetricValue() == null ^ this.getMetricValue() == null)
            return false;
        if (other.getMetricValue() != null
                && other.getMetricValue().equals(this.getMetricValue()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null
                && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        return true;
    }
}
