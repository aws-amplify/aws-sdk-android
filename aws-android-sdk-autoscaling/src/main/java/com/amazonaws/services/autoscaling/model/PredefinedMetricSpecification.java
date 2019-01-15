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
 * Configures a predefined metric for a target tracking policy.
 * </p>
 */
public class PredefinedMetricSpecification implements Serializable {
    /**
     * <p>
     * The metric type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASGAverageCPUUtilization, ASGAverageNetworkIn,
     * ASGAverageNetworkOut, ALBRequestCountPerTarget
     */
    private String predefinedMetricType;

    /**
     * <p>
     * Identifies the resource associated with the metric type. The following
     * predefined metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASGAverageCPUUtilization</code> - Average CPU utilization of the
     * Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkIn</code> - Average number of bytes received on
     * all network interfaces by the Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkOut</code> - Average number of bytes sent out on
     * all network interfaces by the Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALBRequestCountPerTarget</code> - Number of requests completed per
     * target in an Application Load Balancer target group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For predefined metric types <code>ASGAverageCPUUtilization</code>,
     * <code>ASGAverageNetworkIn</code>, and <code>ASGAverageNetworkOut</code>,
     * the parameter must not be specified as the resource associated with the
     * metric type is the Auto Scaling group. For predefined metric type
     * <code>ALBRequestCountPerTarget</code>, the parameter must be specified in
     * the format:
     * <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i>/targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code>
     * , where
     * <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code> is
     * the final portion of the load balancer ARN, and
     * <code>targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code>
     * is the final portion of the target group ARN. The target group must be
     * attached to the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String resourceLabel;

    /**
     * <p>
     * The metric type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASGAverageCPUUtilization, ASGAverageNetworkIn,
     * ASGAverageNetworkOut, ALBRequestCountPerTarget
     *
     * @return <p>
     *         The metric type.
     *         </p>
     * @see MetricType
     */
    public String getPredefinedMetricType() {
        return predefinedMetricType;
    }

    /**
     * <p>
     * The metric type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASGAverageCPUUtilization, ASGAverageNetworkIn,
     * ASGAverageNetworkOut, ALBRequestCountPerTarget
     *
     * @param predefinedMetricType <p>
     *            The metric type.
     *            </p>
     * @see MetricType
     */
    public void setPredefinedMetricType(String predefinedMetricType) {
        this.predefinedMetricType = predefinedMetricType;
    }

    /**
     * <p>
     * The metric type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASGAverageCPUUtilization, ASGAverageNetworkIn,
     * ASGAverageNetworkOut, ALBRequestCountPerTarget
     *
     * @param predefinedMetricType <p>
     *            The metric type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MetricType
     */
    public PredefinedMetricSpecification withPredefinedMetricType(String predefinedMetricType) {
        this.predefinedMetricType = predefinedMetricType;
        return this;
    }

    /**
     * <p>
     * The metric type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASGAverageCPUUtilization, ASGAverageNetworkIn,
     * ASGAverageNetworkOut, ALBRequestCountPerTarget
     *
     * @param predefinedMetricType <p>
     *            The metric type.
     *            </p>
     * @see MetricType
     */
    public void setPredefinedMetricType(MetricType predefinedMetricType) {
        this.predefinedMetricType = predefinedMetricType.toString();
    }

    /**
     * <p>
     * The metric type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASGAverageCPUUtilization, ASGAverageNetworkIn,
     * ASGAverageNetworkOut, ALBRequestCountPerTarget
     *
     * @param predefinedMetricType <p>
     *            The metric type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MetricType
     */
    public PredefinedMetricSpecification withPredefinedMetricType(MetricType predefinedMetricType) {
        this.predefinedMetricType = predefinedMetricType.toString();
        return this;
    }

    /**
     * <p>
     * Identifies the resource associated with the metric type. The following
     * predefined metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASGAverageCPUUtilization</code> - Average CPU utilization of the
     * Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkIn</code> - Average number of bytes received on
     * all network interfaces by the Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkOut</code> - Average number of bytes sent out on
     * all network interfaces by the Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALBRequestCountPerTarget</code> - Number of requests completed per
     * target in an Application Load Balancer target group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For predefined metric types <code>ASGAverageCPUUtilization</code>,
     * <code>ASGAverageNetworkIn</code>, and <code>ASGAverageNetworkOut</code>,
     * the parameter must not be specified as the resource associated with the
     * metric type is the Auto Scaling group. For predefined metric type
     * <code>ALBRequestCountPerTarget</code>, the parameter must be specified in
     * the format:
     * <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i>/targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code>
     * , where
     * <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code> is
     * the final portion of the load balancer ARN, and
     * <code>targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code>
     * is the final portion of the target group ARN. The target group must be
     * attached to the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Identifies the resource associated with the metric type. The
     *         following predefined metrics are available:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ASGAverageCPUUtilization</code> - Average CPU utilization
     *         of the Auto Scaling group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ASGAverageNetworkIn</code> - Average number of bytes
     *         received on all network interfaces by the Auto Scaling group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ASGAverageNetworkOut</code> - Average number of bytes sent
     *         out on all network interfaces by the Auto Scaling group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALBRequestCountPerTarget</code> - Number of requests
     *         completed per target in an Application Load Balancer target
     *         group.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For predefined metric types <code>ASGAverageCPUUtilization</code>, <code>ASGAverageNetworkIn</code>, and
     *         <code>ASGAverageNetworkOut</code>, the parameter must not be
     *         specified as the resource associated with the metric type is the
     *         Auto Scaling group. For predefined metric type
     *         <code>ALBRequestCountPerTarget</code>, the parameter must be
     *         specified in the format:
     *         <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i>/targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code>
     *         , where
     *         <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     *         is the final portion of the load balancer ARN, and
     *         <code>targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code>
     *         is the final portion of the target group ARN. The target group
     *         must be attached to the Auto Scaling group.
     *         </p>
     */
    public String getResourceLabel() {
        return resourceLabel;
    }

    /**
     * <p>
     * Identifies the resource associated with the metric type. The following
     * predefined metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASGAverageCPUUtilization</code> - Average CPU utilization of the
     * Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkIn</code> - Average number of bytes received on
     * all network interfaces by the Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkOut</code> - Average number of bytes sent out on
     * all network interfaces by the Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALBRequestCountPerTarget</code> - Number of requests completed per
     * target in an Application Load Balancer target group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For predefined metric types <code>ASGAverageCPUUtilization</code>,
     * <code>ASGAverageNetworkIn</code>, and <code>ASGAverageNetworkOut</code>,
     * the parameter must not be specified as the resource associated with the
     * metric type is the Auto Scaling group. For predefined metric type
     * <code>ALBRequestCountPerTarget</code>, the parameter must be specified in
     * the format:
     * <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i>/targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code>
     * , where
     * <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code> is
     * the final portion of the load balancer ARN, and
     * <code>targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code>
     * is the final portion of the target group ARN. The target group must be
     * attached to the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param resourceLabel <p>
     *            Identifies the resource associated with the metric type. The
     *            following predefined metrics are available:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ASGAverageCPUUtilization</code> - Average CPU
     *            utilization of the Auto Scaling group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ASGAverageNetworkIn</code> - Average number of bytes
     *            received on all network interfaces by the Auto Scaling group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ASGAverageNetworkOut</code> - Average number of bytes
     *            sent out on all network interfaces by the Auto Scaling group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALBRequestCountPerTarget</code> - Number of requests
     *            completed per target in an Application Load Balancer target
     *            group.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For predefined metric types
     *            <code>ASGAverageCPUUtilization</code>,
     *            <code>ASGAverageNetworkIn</code>, and
     *            <code>ASGAverageNetworkOut</code>, the parameter must not be
     *            specified as the resource associated with the metric type is
     *            the Auto Scaling group. For predefined metric type
     *            <code>ALBRequestCountPerTarget</code>, the parameter must be
     *            specified in the format:
     *            <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i>/targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code>
     *            , where
     *            <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     *            is the final portion of the load balancer ARN, and
     *            <code>targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code>
     *            is the final portion of the target group ARN. The target group
     *            must be attached to the Auto Scaling group.
     *            </p>
     */
    public void setResourceLabel(String resourceLabel) {
        this.resourceLabel = resourceLabel;
    }

    /**
     * <p>
     * Identifies the resource associated with the metric type. The following
     * predefined metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASGAverageCPUUtilization</code> - Average CPU utilization of the
     * Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkIn</code> - Average number of bytes received on
     * all network interfaces by the Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkOut</code> - Average number of bytes sent out on
     * all network interfaces by the Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALBRequestCountPerTarget</code> - Number of requests completed per
     * target in an Application Load Balancer target group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For predefined metric types <code>ASGAverageCPUUtilization</code>,
     * <code>ASGAverageNetworkIn</code>, and <code>ASGAverageNetworkOut</code>,
     * the parameter must not be specified as the resource associated with the
     * metric type is the Auto Scaling group. For predefined metric type
     * <code>ALBRequestCountPerTarget</code>, the parameter must be specified in
     * the format:
     * <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i>/targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code>
     * , where
     * <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code> is
     * the final portion of the load balancer ARN, and
     * <code>targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code>
     * is the final portion of the target group ARN. The target group must be
     * attached to the Auto Scaling group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param resourceLabel <p>
     *            Identifies the resource associated with the metric type. The
     *            following predefined metrics are available:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ASGAverageCPUUtilization</code> - Average CPU
     *            utilization of the Auto Scaling group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ASGAverageNetworkIn</code> - Average number of bytes
     *            received on all network interfaces by the Auto Scaling group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ASGAverageNetworkOut</code> - Average number of bytes
     *            sent out on all network interfaces by the Auto Scaling group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALBRequestCountPerTarget</code> - Number of requests
     *            completed per target in an Application Load Balancer target
     *            group.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For predefined metric types
     *            <code>ASGAverageCPUUtilization</code>,
     *            <code>ASGAverageNetworkIn</code>, and
     *            <code>ASGAverageNetworkOut</code>, the parameter must not be
     *            specified as the resource associated with the metric type is
     *            the Auto Scaling group. For predefined metric type
     *            <code>ALBRequestCountPerTarget</code>, the parameter must be
     *            specified in the format:
     *            <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i>/targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code>
     *            , where
     *            <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     *            is the final portion of the load balancer ARN, and
     *            <code>targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code>
     *            is the final portion of the target group ARN. The target group
     *            must be attached to the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PredefinedMetricSpecification withResourceLabel(String resourceLabel) {
        this.resourceLabel = resourceLabel;
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
        if (getPredefinedMetricType() != null)
            sb.append("PredefinedMetricType: " + getPredefinedMetricType() + ",");
        if (getResourceLabel() != null)
            sb.append("ResourceLabel: " + getResourceLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPredefinedMetricType() == null) ? 0 : getPredefinedMetricType().hashCode());
        hashCode = prime * hashCode
                + ((getResourceLabel() == null) ? 0 : getResourceLabel().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredefinedMetricSpecification == false)
            return false;
        PredefinedMetricSpecification other = (PredefinedMetricSpecification) obj;

        if (other.getPredefinedMetricType() == null ^ this.getPredefinedMetricType() == null)
            return false;
        if (other.getPredefinedMetricType() != null
                && other.getPredefinedMetricType().equals(this.getPredefinedMetricType()) == false)
            return false;
        if (other.getResourceLabel() == null ^ this.getResourceLabel() == null)
            return false;
        if (other.getResourceLabel() != null
                && other.getResourceLabel().equals(this.getResourceLabel()) == false)
            return false;
        return true;
    }
}
