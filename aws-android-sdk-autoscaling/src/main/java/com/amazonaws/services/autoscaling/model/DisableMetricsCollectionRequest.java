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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Disables group metrics for the specified Auto Scaling group.
 * </p>
 */
public class DisableMetricsCollectionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String autoScalingGroupName;

    /**
     * <p>
     * One or more of the following metrics. If you omit this parameter, all
     * metrics are disabled.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> metrics = new java.util.ArrayList<String>();

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the Auto Scaling group.
     *         </p>
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableMetricsCollectionRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * One or more of the following metrics. If you omit this parameter, all
     * metrics are disabled.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         One or more of the following metrics. If you omit this parameter,
     *         all metrics are disabled.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>GroupMinSize</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupMaxSize</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupDesiredCapacity</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupInServiceInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupPendingInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupStandbyInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupTerminatingInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupTotalInstances</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * One or more of the following metrics. If you omit this parameter, all
     * metrics are disabled.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param metrics <p>
     *            One or more of the following metrics. If you omit this
     *            parameter, all metrics are disabled.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>GroupMinSize</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupMaxSize</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupDesiredCapacity</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupInServiceInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupPendingInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupStandbyInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupTerminatingInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupTotalInstances</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setMetrics(java.util.Collection<String> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new java.util.ArrayList<String>(metrics);
    }

    /**
     * <p>
     * One or more of the following metrics. If you omit this parameter, all
     * metrics are disabled.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics <p>
     *            One or more of the following metrics. If you omit this
     *            parameter, all metrics are disabled.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>GroupMinSize</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupMaxSize</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupDesiredCapacity</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupInServiceInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupPendingInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupStandbyInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupTerminatingInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupTotalInstances</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableMetricsCollectionRequest withMetrics(String... metrics) {
        if (getMetrics() == null) {
            this.metrics = new java.util.ArrayList<String>(metrics.length);
        }
        for (String value : metrics) {
            this.metrics.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more of the following metrics. If you omit this parameter, all
     * metrics are disabled.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics <p>
     *            One or more of the following metrics. If you omit this
     *            parameter, all metrics are disabled.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>GroupMinSize</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupMaxSize</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupDesiredCapacity</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupInServiceInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupPendingInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupStandbyInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupTerminatingInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupTotalInstances</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableMetricsCollectionRequest withMetrics(java.util.Collection<String> metrics) {
        setMetrics(metrics);
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getMetrics() != null)
            sb.append("Metrics: " + getMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableMetricsCollectionRequest == false)
            return false;
        DisableMetricsCollectionRequest other = (DisableMetricsCollectionRequest) obj;

        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        return true;
    }
}
