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
package com.amazonaws.services.application-autoscaling.model;

import java.io.Serializable;


/**
 * <p>Represents a predefined metric for a target tracking scaling policy to use with Application Auto Scaling.</p> <p>Only the AWS services that you're using send metrics to Amazon CloudWatch. To determine whether a desired metric already exists by looking up its namespace and dimension using the CloudWatch metrics dashboard in the console, follow the procedure in <a href="https://docs.aws.amazon.com/autoscaling/application/userguide/monitoring-cloudwatch.html">Building Dashboards with CloudWatch</a> in the <i>Application Auto Scaling User Guide</i>.</p>
 */
public class PredefinedMetricSpecification implements Serializable {
    /**
     * <p>The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot Fleet requests and ECS services.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DynamoDBReadCapacityUtilization, DynamoDBWriteCapacityUtilization, ALBRequestCountPerTarget, RDSReaderAverageCPUUtilization, RDSReaderAverageDatabaseConnections, EC2SpotFleetRequestAverageCPUUtilization, EC2SpotFleetRequestAverageNetworkIn, EC2SpotFleetRequestAverageNetworkOut, SageMakerVariantInvocationsPerInstance, ECSServiceAverageCPUUtilization, ECSServiceAverageMemoryUtilization, AppStreamAverageCapacityUtilization, ComprehendInferenceUtilization, LambdaProvisionedConcurrencyUtilization, CassandraReadCapacityUtilization, CassandraWriteCapacityUtilization
     */
    private String predefinedMetricType;

    /**
     * <p>Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is <code>ALBRequestCountPerTarget</code> and there is a target group attached to the Spot Fleet request or ECS service.</p> <p>The format is app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:</p> <ul> <li> <p>app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN</p> </li> <li> <p>targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.</p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     */
    private String resourceLabel;

    /**
     * <p>The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot Fleet requests and ECS services.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DynamoDBReadCapacityUtilization, DynamoDBWriteCapacityUtilization, ALBRequestCountPerTarget, RDSReaderAverageCPUUtilization, RDSReaderAverageDatabaseConnections, EC2SpotFleetRequestAverageCPUUtilization, EC2SpotFleetRequestAverageNetworkIn, EC2SpotFleetRequestAverageNetworkOut, SageMakerVariantInvocationsPerInstance, ECSServiceAverageCPUUtilization, ECSServiceAverageMemoryUtilization, AppStreamAverageCapacityUtilization, ComprehendInferenceUtilization, LambdaProvisionedConcurrencyUtilization, CassandraReadCapacityUtilization, CassandraWriteCapacityUtilization
     *
     * @return <p>The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot Fleet requests and ECS services.</p>
     *
     * @see MetricType
     */
    public String getPredefinedMetricType() {
        return predefinedMetricType;
    }

    /**
     * <p>The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot Fleet requests and ECS services.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DynamoDBReadCapacityUtilization, DynamoDBWriteCapacityUtilization, ALBRequestCountPerTarget, RDSReaderAverageCPUUtilization, RDSReaderAverageDatabaseConnections, EC2SpotFleetRequestAverageCPUUtilization, EC2SpotFleetRequestAverageNetworkIn, EC2SpotFleetRequestAverageNetworkOut, SageMakerVariantInvocationsPerInstance, ECSServiceAverageCPUUtilization, ECSServiceAverageMemoryUtilization, AppStreamAverageCapacityUtilization, ComprehendInferenceUtilization, LambdaProvisionedConcurrencyUtilization, CassandraReadCapacityUtilization, CassandraWriteCapacityUtilization
     *
     * @param predefinedMetricType <p>The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot Fleet requests and ECS services.</p>
     *
     * @see MetricType
     */
    public void setPredefinedMetricType(String predefinedMetricType) {
        this.predefinedMetricType = predefinedMetricType;
    }

    /**
     * <p>The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot Fleet requests and ECS services.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DynamoDBReadCapacityUtilization, DynamoDBWriteCapacityUtilization, ALBRequestCountPerTarget, RDSReaderAverageCPUUtilization, RDSReaderAverageDatabaseConnections, EC2SpotFleetRequestAverageCPUUtilization, EC2SpotFleetRequestAverageNetworkIn, EC2SpotFleetRequestAverageNetworkOut, SageMakerVariantInvocationsPerInstance, ECSServiceAverageCPUUtilization, ECSServiceAverageMemoryUtilization, AppStreamAverageCapacityUtilization, ComprehendInferenceUtilization, LambdaProvisionedConcurrencyUtilization, CassandraReadCapacityUtilization, CassandraWriteCapacityUtilization
     *
     * @param predefinedMetricType <p>The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot Fleet requests and ECS services.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MetricType
     */
    public PredefinedMetricSpecification withPredefinedMetricType(String predefinedMetricType) {
        this.predefinedMetricType = predefinedMetricType;
        return this;
    }

    /**
     * <p>The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot Fleet requests and ECS services.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DynamoDBReadCapacityUtilization, DynamoDBWriteCapacityUtilization, ALBRequestCountPerTarget, RDSReaderAverageCPUUtilization, RDSReaderAverageDatabaseConnections, EC2SpotFleetRequestAverageCPUUtilization, EC2SpotFleetRequestAverageNetworkIn, EC2SpotFleetRequestAverageNetworkOut, SageMakerVariantInvocationsPerInstance, ECSServiceAverageCPUUtilization, ECSServiceAverageMemoryUtilization, AppStreamAverageCapacityUtilization, ComprehendInferenceUtilization, LambdaProvisionedConcurrencyUtilization, CassandraReadCapacityUtilization, CassandraWriteCapacityUtilization
     *
     * @param predefinedMetricType <p>The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot Fleet requests and ECS services.</p>
     *
     * @see MetricType
     */
    public void setPredefinedMetricType(MetricType predefinedMetricType) {
        this.predefinedMetricType = predefinedMetricType.toString();
    }

    /**
     * <p>The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot Fleet requests and ECS services.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DynamoDBReadCapacityUtilization, DynamoDBWriteCapacityUtilization, ALBRequestCountPerTarget, RDSReaderAverageCPUUtilization, RDSReaderAverageDatabaseConnections, EC2SpotFleetRequestAverageCPUUtilization, EC2SpotFleetRequestAverageNetworkIn, EC2SpotFleetRequestAverageNetworkOut, SageMakerVariantInvocationsPerInstance, ECSServiceAverageCPUUtilization, ECSServiceAverageMemoryUtilization, AppStreamAverageCapacityUtilization, ComprehendInferenceUtilization, LambdaProvisionedConcurrencyUtilization, CassandraReadCapacityUtilization, CassandraWriteCapacityUtilization
     *
     * @param predefinedMetricType <p>The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot Fleet requests and ECS services.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MetricType
     */
    public PredefinedMetricSpecification withPredefinedMetricType(MetricType predefinedMetricType) {
        this.predefinedMetricType = predefinedMetricType.toString();
        return this;
    }

    /**
     * <p>Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is <code>ALBRequestCountPerTarget</code> and there is a target group attached to the Spot Fleet request or ECS service.</p> <p>The format is app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:</p> <ul> <li> <p>app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN</p> </li> <li> <p>targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.</p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     *
     * @return <p>Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is <code>ALBRequestCountPerTarget</code> and there is a target group attached to the Spot Fleet request or ECS service.</p> <p>The format is app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:</p> <ul> <li> <p>app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN</p> </li> <li> <p>targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.</p> </li> </ul>
     */
    public String getResourceLabel() {
        return resourceLabel;
    }

    /**
     * <p>Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is <code>ALBRequestCountPerTarget</code> and there is a target group attached to the Spot Fleet request or ECS service.</p> <p>The format is app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:</p> <ul> <li> <p>app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN</p> </li> <li> <p>targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.</p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     *
     * @param resourceLabel <p>Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is <code>ALBRequestCountPerTarget</code> and there is a target group attached to the Spot Fleet request or ECS service.</p> <p>The format is app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:</p> <ul> <li> <p>app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN</p> </li> <li> <p>targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.</p> </li> </ul>
     */
    public void setResourceLabel(String resourceLabel) {
        this.resourceLabel = resourceLabel;
    }

    /**
     * <p>Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is <code>ALBRequestCountPerTarget</code> and there is a target group attached to the Spot Fleet request or ECS service.</p> <p>The format is app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:</p> <ul> <li> <p>app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN</p> </li> <li> <p>targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.</p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     *
     * @param resourceLabel <p>Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is <code>ALBRequestCountPerTarget</code> and there is a target group attached to the Spot Fleet request or ECS service.</p> <p>The format is app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:</p> <ul> <li> <p>app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN</p> </li> <li> <p>targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.</p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
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
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPredefinedMetricType() != null) sb.append("PredefinedMetricType: " + getPredefinedMetricType() + ",");
        if (getResourceLabel() != null) sb.append("ResourceLabel: " + getResourceLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPredefinedMetricType() == null) ? 0 : getPredefinedMetricType().hashCode());
        hashCode = prime * hashCode + ((getResourceLabel() == null) ? 0 : getResourceLabel().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PredefinedMetricSpecification == false) return false;
        PredefinedMetricSpecification other = (PredefinedMetricSpecification)obj;

        if (other.getPredefinedMetricType() == null ^ this.getPredefinedMetricType() == null) return false;
        if (other.getPredefinedMetricType() != null && other.getPredefinedMetricType().equals(this.getPredefinedMetricType()) == false) return false;
        if (other.getResourceLabel() == null ^ this.getResourceLabel() == null) return false;
        if (other.getResourceLabel() != null && other.getResourceLabel().equals(this.getResourceLabel()) == false) return false;
        return true;
    }
}
